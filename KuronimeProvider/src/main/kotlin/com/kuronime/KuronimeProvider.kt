package com.kuronime

import com.lagradost.cloudstream3.*
import com.lagradost.cloudstream3.utils.ExtractorLink
import com.lagradost.cloudstream3.utils.loadExtractor
import org.json.JSONObject
import javax.crypto.Cipher
import javax.crypto.spec.IvParameterSpec
import javax.crypto.spec.SecretKeySpec
import android.util.Base64
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class KuronimeProvider : MainAPI() {
    override var mainUrl = "https://kuronime.fun"
    override var name = "Kuronime"
    override val supportedTypes = setOf(TvType.Anime)
    override var lang = "id"
    override val hasMainPage = true

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val document = app.get(mainUrl).document
        val home = document.select("div.listupd div.bsu").map {
            val title = it.selectFirst("h2")?.text() ?: ""
            val poster = it.selectFirst("img")?.attr("src")
            val url = it.selectFirst("a")?.attr("href") ?: ""
            newAnimeSearchResponse(
                title,
                url,
                TvType.Anime,
            ) {
                this.posterUrl = poster
            }
        }
        return newHomePageResponse(
            list = HomePageList("New Episodes", home),
            hasNext = false
        )
    }

    override suspend fun search(query: String): List<SearchResponse> {
        val url = "$mainUrl/?s=$query"
        val document = app.get(url).document
        return document.select("div.listupd article").map {
            val title = it.selectFirst("h2")?.text() ?: ""
            val poster = it.selectFirst("img")?.attr("src")
            val animeUrl = it.selectFirst("a")?.attr("href") ?: ""
            newAnimeSearchResponse(
                title,
                animeUrl,
                TvType.Anime,
            ) {
                this.posterUrl = poster
            }
        }
    }

    override suspend fun load(url: String): LoadResponse {
        val document = app.get(url).document
        val title = document.selectFirst("h1.entry-title")?.text() ?: ""
        val poster = document.selectFirst("div.thumb img")?.attr("src")
        val description = document.selectFirst("div.entry-content p")?.text()
        val episodes = document.select("div.eplister ul li").map {
            val a = it.selectFirst("a")
            val epUrl = a?.attr("href") ?: ""
            val epTitle = a?.text() ?: ""
            newEpisode(epUrl) {
                name = epTitle
            }
        }.reversed()

        return newAnimeLoadResponse(title, url, TvType.Anime) {
            this.posterUrl = poster
            this.plot = description
            addEpisodes(DubStatus.Subbed, episodes)
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val document = app.get(data).document
        val script = document.selectFirst("script:containsData(_0xa100d42aa)")?.data() ?: ""
        val id = script.substringAfter("var _0xa100d42aa = \"").substringBefore("\"")

        val apiResponse = app.post(
            "https://animeku.org/api/v9/sources",
            json = mapOf("id" to id)
        ).parsed<ApiResponse>()

        val decrypted = mydecriptor(apiResponse.data)
        val sources = JSONObject(decrypted)
        val embed = sources.getJSONObject("embed")

        coroutineScope {
            embed.keys().forEach { mirror ->
                val qualities = embed.getJSONObject(mirror)
                qualities.keys().forEach { quality ->
                    val url = qualities.getString(quality)
                    launch {
                        loadExtractor(url, subtitleCallback, callback)
                    }
                }
            }
        }

        return true
    }

    private fun mydecriptor(encrypted: String): String {
        val key = "3&!Z0M,rawa;dZW==".toByteArray(Charsets.UTF_8)
        val secretKey = SecretKeySpec(key, "AES")
        val decoded = Base64.decode(encrypted, Base64.DEFAULT)
        val iv = decoded.copyOfRange(0, 16)
        val cipherText = decoded.copyOfRange(16, decoded.size)
        val cipher = Cipher.getInstance("AES/CBC/PKCS5Padding")
        cipher.init(Cipher.DECRYPT_MODE, secretKey, IvParameterSpec(iv))
        return String(cipher.doFinal(cipherText), Charsets.UTF_8)
    }

    data class ApiResponse(
        val status: Int,
        val data: String
    )
}
