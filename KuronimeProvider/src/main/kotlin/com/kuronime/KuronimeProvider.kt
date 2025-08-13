package com.kuronime

import com.lagradost.cloudstream3.*
import org.jsoup.Jsoup

class KuronimeProvider : MainAPI() {
    override var mainUrl = "https://kuronime.fun"
    override var name = "Kuronime"
    override val supportedTypes = setOf(TvType.Anime)
    override var lang = "id"
    override val hasMainPage = true

    override suspend fun getMainPage(page: Int, request: MainPageRequest): HomePageResponse {
        val document = Jsoup.parse(app.get(mainUrl).text)
        val home = document.select("div.listupd div.bsu").map {
            val title = it.selectFirst("h2")?.text() ?: ""
            val poster = it.selectFirst("img")?.attr("src")
            val url = it.selectFirst("a")?.attr("href") ?: ""
            AnimeSearchResponse(
                title,
                url,
                this.name,
                TvType.Anime,
                poster,
                null,
                null,
            )
        }
        return HomePageResponse(listOf(HomePageList("New Episodes", home)))
    }

    override suspend fun search(query: String): List<SearchResponse> {
        return listOf()
    }

    override suspend fun load(url: String): LoadResponse {
        val document = Jsoup.parse(app.get(url).text)
        val title = document.selectFirst("h1.entry-title")?.text() ?: ""
        val poster = document.selectFirst("div.thumb img")?.attr("src")
        val description = document.selectFirst("div.entry-content p")?.text()
        val episodes = document.select("div.eplister ul li").map {
            val a = it.selectFirst("a")
            val epUrl = a?.attr("href") ?: ""
            val epTitle = a?.text() ?: ""
            Episode(epUrl, epTitle)
        }
        return newAnimeLoadResponse(title, url, TvType.Anime) {
            this.posterUrl = poster
            this.plot = description
            this.episodes = episodes.reversed()
        }
    }

    override suspend fun loadLinks(
        data: String,
        isCasting: Boolean,
        subtitleCallback: (SubtitleFile) -> Unit,
        callback: (ExtractorLink) -> Unit
    ): Boolean {
        val document = Jsoup.parse(app.get(data).text)
        val script = document.selectFirst("script:containsData(_0xa100d42aa)")?.data() ?: ""
        val id = script.substringAfter("var _0xa100d42aa = \"").substringBefore("\"")

        val apiResponse = app.post(
            "https://animeku.org/api/v9/sources",
            json = mapOf("id" to id)
        ).parsed<ApiResponse>()

        val decrypted = mydecriptor(apiResponse.data)
        val sources = a_gson.fromJson(decrypted, Sources::class.java)

        sources.embed.forEach { (mirror, qualities) ->
            qualities.forEach { (quality, url) ->
                callback.invoke(
                    ExtractorLink(
                        this.name,
                        "${this.name} $mirror $quality",
                        url,
                        "",
                        getQualityFromName(quality),
                    )
                )
            }
        }
        return true
    }

    private fun mydecriptor(encrypted: String): String {
        val key = "3&!Z0M,rawa;dZW==".toByteArray()
        val secretKey = javax.crypto.spec.SecretKeySpec(key, "AES")
        val cipher = javax.crypto.Cipher.getInstance("AES/CBC/PKCS5Padding")
        val encryptedData = android.util.Base64.decode(encrypted, android.util.Base64.DEFAULT)
        val iv = encryptedData.copyOfRange(0, 16)
        val cipherText = encryptedData.copyOfRange(16, encryptedData.size)
        cipher.init(javax.crypto.Cipher.DECRYPT_MODE, secretKey, javax.crypto.spec.IvParameterSpec(iv))
        return String(cipher.doFinal(cipherText))
    }

    data class ApiResponse(
        val status: Int,
        val data: String
    )

    data class Sources(
        val embed: Map<String, Map<String, String>>,
        val download: Map<String, Map<String, String>>
    )
}
