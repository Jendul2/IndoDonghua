/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.DubStatus;
import com.lagradost.cloudstream3.Score;
import com.lagradost.cloudstream3.SearchQuality;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b9\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u00b5\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0004\b\u0018\u0010\u0019B\u00a9\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u00a2\u0006\u0004\b\u0018\u0010\u001aJ\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010F\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u0011\u0010G\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010H\u00c6\u0003J\u0010\u0010J\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010'J\u000b\u0010K\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0017\u0010L\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u00c0\u0001\u0010N\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00c6\u0001\u00a2\u0006\u0002\u0010OJ\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u00d6\u0003J\t\u0010T\u001a\u00020\nH\u00d6\u0001J\t\u0010U\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001c\"\u0004\b$\u0010%R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001c\"\u0004\b0\u0010%R&\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010*\u001a\u0004\b5\u0010'\"\u0004\b6\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R(\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00102\"\u0004\b<\u00104R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@\u00a8\u0006V"}, d2={"Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "dubStatus", "Ljava/util/EnumSet;", "Lcom/lagradost/cloudstream3/DubStatus;", "otherName", "episodes", "", "id", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "score", "Lcom/lagradost/cloudstream3/Score;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/EnumSet;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Lcom/lagradost/cloudstream3/Score;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/EnumSet;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getUrl", "getApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDubStatus", "()Ljava/util/EnumSet;", "setDubStatus", "(Ljava/util/EnumSet;)V", "getOtherName", "setOtherName", "getEpisodes", "()Ljava/util/Map;", "setEpisodes", "(Ljava/util/Map;)V", "getId", "setId", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getPosterHeaders", "setPosterHeaders", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/EnumSet;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Lcom/lagradost/cloudstream3/Score;)Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "library"})
public final class AnimeSearchResponse
implements SearchResponse {
    @NotNull
    private final String name;
    @NotNull
    private final String url;
    @NotNull
    private final String apiName;
    @Nullable
    private TvType type;
    @Nullable
    private String posterUrl;
    @Nullable
    private Integer year;
    @Nullable
    private EnumSet<DubStatus> dubStatus;
    @Nullable
    private String otherName;
    @NotNull
    private Map<DubStatus, Integer> episodes;
    @Nullable
    private Integer id;
    @Nullable
    private SearchQuality quality;
    @Nullable
    private Map<String, String> posterHeaders;
    @Nullable
    private Score score;

    @Deprecated(message="Use newAnimeSearchResponse", level=DeprecationLevel.ERROR)
    public AnimeSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable EnumSet<DubStatus> dubStatus, @Nullable String otherName, @NotNull Map<DubStatus, Integer> episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.posterUrl = posterUrl;
        this.year = year;
        this.dubStatus = dubStatus;
        this.otherName = otherName;
        this.episodes = episodes;
        this.id = id2;
        this.quality = quality;
        this.posterHeaders = posterHeaders;
        this.score = score2;
    }

    public /* synthetic */ AnimeSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, EnumSet enumSet, String string6, Map map, Integer n2, SearchQuality searchQuality, Map map2, Score score2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 8) != 0) {
            tvType = null;
        }
        if ((n3 & 0x10) != 0) {
            string5 = null;
        }
        if ((n3 & 0x20) != 0) {
            n = null;
        }
        if ((n3 & 0x40) != 0) {
            enumSet = null;
        }
        if ((n3 & 0x80) != 0) {
            string6 = null;
        }
        if ((n3 & 0x100) != 0) {
            map = new LinkedHashMap();
        }
        if ((n3 & 0x200) != 0) {
            n2 = null;
        }
        if ((n3 & 0x400) != 0) {
            searchQuality = null;
        }
        if ((n3 & 0x800) != 0) {
            map2 = null;
        }
        if ((n3 & 0x1000) != 0) {
            score2 = null;
        }
        this(string2, string3, string4, tvType, string5, n, enumSet, string6, map, n2, searchQuality, map2, score2);
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override
    @NotNull
    public String getApiName() {
        return this.apiName;
    }

    @Override
    @Nullable
    public TvType getType() {
        return this.type;
    }

    @Override
    public void setType(@Nullable TvType tvType) {
        this.type = tvType;
    }

    @Override
    @Nullable
    public String getPosterUrl() {
        return this.posterUrl;
    }

    @Override
    public void setPosterUrl(@Nullable String string2) {
        this.posterUrl = string2;
    }

    @Nullable
    public final Integer getYear() {
        return this.year;
    }

    public final void setYear(@Nullable Integer n) {
        this.year = n;
    }

    @Nullable
    public final EnumSet<DubStatus> getDubStatus() {
        return this.dubStatus;
    }

    public final void setDubStatus(@Nullable EnumSet<DubStatus> enumSet) {
        this.dubStatus = enumSet;
    }

    @Nullable
    public final String getOtherName() {
        return this.otherName;
    }

    public final void setOtherName(@Nullable String string2) {
        this.otherName = string2;
    }

    @NotNull
    public final Map<DubStatus, Integer> getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(@NotNull Map<DubStatus, Integer> map) {
        Intrinsics.checkNotNullParameter(map, (String)"<set-?>");
        this.episodes = map;
    }

    @Override
    @Nullable
    public Integer getId() {
        return this.id;
    }

    @Override
    public void setId(@Nullable Integer n) {
        this.id = n;
    }

    @Override
    @Nullable
    public SearchQuality getQuality() {
        return this.quality;
    }

    @Override
    public void setQuality(@Nullable SearchQuality searchQuality) {
        this.quality = searchQuality;
    }

    @Override
    @Nullable
    public Map<String, String> getPosterHeaders() {
        return this.posterHeaders;
    }

    @Override
    public void setPosterHeaders(@Nullable Map<String, String> map) {
        this.posterHeaders = map;
    }

    @Override
    @Nullable
    public Score getScore() {
        return this.score;
    }

    @Override
    public void setScore(@Nullable Score score2) {
        this.score = score2;
    }

    @Deprecated(message="Use newAnimeSearchResponse", level=DeprecationLevel.ERROR)
    public AnimeSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable EnumSet<DubStatus> dubStatus, @Nullable String otherName, @NotNull Map<DubStatus, Integer> episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        this(name, url, apiName, type, posterUrl, year, dubStatus, otherName, episodes, id2, quality, posterHeaders, null);
    }

    public /* synthetic */ AnimeSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, EnumSet enumSet, String string6, Map map, Integer n2, SearchQuality searchQuality, Map map2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 8) != 0) {
            tvType = null;
        }
        if ((n3 & 0x10) != 0) {
            string5 = null;
        }
        if ((n3 & 0x20) != 0) {
            n = null;
        }
        if ((n3 & 0x40) != 0) {
            enumSet = null;
        }
        if ((n3 & 0x80) != 0) {
            string6 = null;
        }
        if ((n3 & 0x100) != 0) {
            map = new LinkedHashMap();
        }
        if ((n3 & 0x200) != 0) {
            n2 = null;
        }
        if ((n3 & 0x400) != 0) {
            searchQuality = null;
        }
        if ((n3 & 0x800) != 0) {
            map2 = null;
        }
        this(string2, string3, string4, tvType, string5, n, enumSet, string6, map, n2, searchQuality, map2);
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final String component3() {
        return this.apiName;
    }

    @Nullable
    public final TvType component4() {
        return this.type;
    }

    @Nullable
    public final String component5() {
        return this.posterUrl;
    }

    @Nullable
    public final Integer component6() {
        return this.year;
    }

    @Nullable
    public final EnumSet<DubStatus> component7() {
        return this.dubStatus;
    }

    @Nullable
    public final String component8() {
        return this.otherName;
    }

    @NotNull
    public final Map<DubStatus, Integer> component9() {
        return this.episodes;
    }

    @Nullable
    public final Integer component10() {
        return this.id;
    }

    @Nullable
    public final SearchQuality component11() {
        return this.quality;
    }

    @Nullable
    public final Map<String, String> component12() {
        return this.posterHeaders;
    }

    @Nullable
    public final Score component13() {
        return this.score;
    }

    @NotNull
    public final AnimeSearchResponse copy(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable EnumSet<DubStatus> dubStatus, @Nullable String otherName, @NotNull Map<DubStatus, Integer> episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        return new AnimeSearchResponse(name, url, apiName, type, posterUrl, year, dubStatus, otherName, episodes, id2, quality, posterHeaders, score2);
    }

    public static /* synthetic */ AnimeSearchResponse copy$default(AnimeSearchResponse animeSearchResponse, String string2, String string3, String string4, TvType tvType, String string5, Integer n, EnumSet enumSet, String string6, Map map, Integer n2, SearchQuality searchQuality, Map map2, Score score2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            string2 = animeSearchResponse.name;
        }
        if ((n3 & 2) != 0) {
            string3 = animeSearchResponse.url;
        }
        if ((n3 & 4) != 0) {
            string4 = animeSearchResponse.apiName;
        }
        if ((n3 & 8) != 0) {
            tvType = animeSearchResponse.type;
        }
        if ((n3 & 0x10) != 0) {
            string5 = animeSearchResponse.posterUrl;
        }
        if ((n3 & 0x20) != 0) {
            n = animeSearchResponse.year;
        }
        if ((n3 & 0x40) != 0) {
            enumSet = animeSearchResponse.dubStatus;
        }
        if ((n3 & 0x80) != 0) {
            string6 = animeSearchResponse.otherName;
        }
        if ((n3 & 0x100) != 0) {
            map = animeSearchResponse.episodes;
        }
        if ((n3 & 0x200) != 0) {
            n2 = animeSearchResponse.id;
        }
        if ((n3 & 0x400) != 0) {
            searchQuality = animeSearchResponse.quality;
        }
        if ((n3 & 0x800) != 0) {
            map2 = animeSearchResponse.posterHeaders;
        }
        if ((n3 & 0x1000) != 0) {
            score2 = animeSearchResponse.score;
        }
        return animeSearchResponse.copy(string2, string3, string4, tvType, string5, n, enumSet, string6, map, n2, searchQuality, map2, score2);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimeSearchResponse(name=").append(this.name).append(", url=").append(this.url).append(", apiName=").append(this.apiName).append(", type=").append((Object)this.type).append(", posterUrl=").append(this.posterUrl).append(", year=").append(this.year).append(", dubStatus=").append(this.dubStatus).append(", otherName=").append(this.otherName).append(", episodes=").append(this.episodes).append(", id=").append(this.id).append(", quality=").append((Object)this.quality).append(", posterHeaders=");
        stringBuilder.append(this.posterHeaders).append(", score=").append(this.score).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + (this.type == null ? 0 : this.type.hashCode());
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.year == null ? 0 : ((Object)this.year).hashCode());
        result2 = result2 * 31 + (this.dubStatus == null ? 0 : this.dubStatus.hashCode());
        result2 = result2 * 31 + (this.otherName == null ? 0 : this.otherName.hashCode());
        result2 = result2 * 31 + ((Object)this.episodes).hashCode();
        result2 = result2 * 31 + (this.id == null ? 0 : ((Object)this.id).hashCode());
        result2 = result2 * 31 + (this.quality == null ? 0 : this.quality.hashCode());
        result2 = result2 * 31 + (this.posterHeaders == null ? 0 : ((Object)this.posterHeaders).hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimeSearchResponse)) {
            return false;
        }
        AnimeSearchResponse animeSearchResponse = (AnimeSearchResponse)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)animeSearchResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)animeSearchResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)animeSearchResponse.apiName)) {
            return false;
        }
        if (this.type != animeSearchResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)animeSearchResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.year, (Object)animeSearchResponse.year)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.dubStatus, animeSearchResponse.dubStatus)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.otherName, (Object)animeSearchResponse.otherName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.episodes, animeSearchResponse.episodes)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.id, (Object)animeSearchResponse.id)) {
            return false;
        }
        if (this.quality != animeSearchResponse.quality) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, animeSearchResponse.posterHeaders)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.score, (Object)animeSearchResponse.score);
    }
}

