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

import com.lagradost.cloudstream3.Score;
import com.lagradost.cloudstream3.SearchQuality;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TvType;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\b\u0013\u0010\u0014B}\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u00a2\u0006\u0004\b\u0013\u0010\u0015J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010<\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u0010\u0010=\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\"J\u000b\u0010>\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0017\u0010?\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0098\u0001\u0010A\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010FH\u00d6\u0003J\t\u0010G\u001a\u00020\nH\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010 R\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u001e\u0010\f\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010%\u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105\u00a8\u0006I"}, d2={"Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "episodes", "id", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "score", "Lcom/lagradost/cloudstream3/Score;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Lcom/lagradost/cloudstream3/Score;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;)V", "getName", "()Ljava/lang/String;", "getUrl", "getApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEpisodes", "setEpisodes", "getId", "setId", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Lcom/lagradost/cloudstream3/Score;)Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "library"})
public final class TvSeriesSearchResponse
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
    private Integer episodes;
    @Nullable
    private Integer id;
    @Nullable
    private SearchQuality quality;
    @Nullable
    private Map<String, String> posterHeaders;
    @Nullable
    private Score score;

    @Deprecated(message="Use newTvSeriesSearchResponse", level=DeprecationLevel.ERROR)
    public TvSeriesSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable Integer episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.posterUrl = posterUrl;
        this.year = year;
        this.episodes = episodes;
        this.id = id2;
        this.quality = quality;
        this.posterHeaders = posterHeaders;
        this.score = score2;
    }

    public /* synthetic */ TvSeriesSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, Integer n2, Integer n3, SearchQuality searchQuality, Map map, Score score2, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 8) != 0) {
            tvType = null;
        }
        if ((n4 & 0x10) != 0) {
            string5 = null;
        }
        if ((n4 & 0x20) != 0) {
            n = null;
        }
        if ((n4 & 0x40) != 0) {
            n2 = null;
        }
        if ((n4 & 0x80) != 0) {
            n3 = null;
        }
        if ((n4 & 0x100) != 0) {
            searchQuality = null;
        }
        if ((n4 & 0x200) != 0) {
            map = null;
        }
        if ((n4 & 0x400) != 0) {
            score2 = null;
        }
        this(string2, string3, string4, tvType, string5, n, n2, n3, searchQuality, map, score2);
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
    public final Integer getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(@Nullable Integer n) {
        this.episodes = n;
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

    @Deprecated(message="Use newTvSeriesSearchResponse", level=DeprecationLevel.ERROR)
    public TvSeriesSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable Integer episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        this(name, url, apiName, type, posterUrl, year, episodes, id2, quality, posterHeaders, null);
    }

    public /* synthetic */ TvSeriesSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, Integer n2, Integer n3, SearchQuality searchQuality, Map map, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x20) != 0) {
            n = null;
        }
        if ((n4 & 0x40) != 0) {
            n2 = null;
        }
        if ((n4 & 0x80) != 0) {
            n3 = null;
        }
        if ((n4 & 0x100) != 0) {
            searchQuality = null;
        }
        if ((n4 & 0x200) != 0) {
            map = null;
        }
        this(string2, string3, string4, tvType, string5, n, n2, n3, searchQuality, map);
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
    public final Integer component7() {
        return this.episodes;
    }

    @Nullable
    public final Integer component8() {
        return this.id;
    }

    @Nullable
    public final SearchQuality component9() {
        return this.quality;
    }

    @Nullable
    public final Map<String, String> component10() {
        return this.posterHeaders;
    }

    @Nullable
    public final Score component11() {
        return this.score;
    }

    @NotNull
    public final TvSeriesSearchResponse copy(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer year, @Nullable Integer episodes, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        return new TvSeriesSearchResponse(name, url, apiName, type, posterUrl, year, episodes, id2, quality, posterHeaders, score2);
    }

    public static /* synthetic */ TvSeriesSearchResponse copy$default(TvSeriesSearchResponse tvSeriesSearchResponse, String string2, String string3, String string4, TvType tvType, String string5, Integer n, Integer n2, Integer n3, SearchQuality searchQuality, Map map, Score score2, int n4, Object object) {
        if ((n4 & 1) != 0) {
            string2 = tvSeriesSearchResponse.name;
        }
        if ((n4 & 2) != 0) {
            string3 = tvSeriesSearchResponse.url;
        }
        if ((n4 & 4) != 0) {
            string4 = tvSeriesSearchResponse.apiName;
        }
        if ((n4 & 8) != 0) {
            tvType = tvSeriesSearchResponse.type;
        }
        if ((n4 & 0x10) != 0) {
            string5 = tvSeriesSearchResponse.posterUrl;
        }
        if ((n4 & 0x20) != 0) {
            n = tvSeriesSearchResponse.year;
        }
        if ((n4 & 0x40) != 0) {
            n2 = tvSeriesSearchResponse.episodes;
        }
        if ((n4 & 0x80) != 0) {
            n3 = tvSeriesSearchResponse.id;
        }
        if ((n4 & 0x100) != 0) {
            searchQuality = tvSeriesSearchResponse.quality;
        }
        if ((n4 & 0x200) != 0) {
            map = tvSeriesSearchResponse.posterHeaders;
        }
        if ((n4 & 0x400) != 0) {
            score2 = tvSeriesSearchResponse.score;
        }
        return tvSeriesSearchResponse.copy(string2, string3, string4, tvType, string5, n, n2, n3, searchQuality, map, score2);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TvSeriesSearchResponse(name=").append(this.name).append(", url=").append(this.url).append(", apiName=").append(this.apiName).append(", type=").append((Object)this.type).append(", posterUrl=").append(this.posterUrl).append(", year=").append(this.year).append(", episodes=").append(this.episodes).append(", id=").append(this.id).append(", quality=").append((Object)this.quality).append(", posterHeaders=").append(this.posterHeaders).append(", score=").append(this.score).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + (this.type == null ? 0 : this.type.hashCode());
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.year == null ? 0 : ((Object)this.year).hashCode());
        result2 = result2 * 31 + (this.episodes == null ? 0 : ((Object)this.episodes).hashCode());
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
        if (!(other instanceof TvSeriesSearchResponse)) {
            return false;
        }
        TvSeriesSearchResponse tvSeriesSearchResponse = (TvSeriesSearchResponse)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)tvSeriesSearchResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)tvSeriesSearchResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)tvSeriesSearchResponse.apiName)) {
            return false;
        }
        if (this.type != tvSeriesSearchResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)tvSeriesSearchResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.year, (Object)tvSeriesSearchResponse.year)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.episodes, (Object)tvSeriesSearchResponse.episodes)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.id, (Object)tvSeriesSearchResponse.id)) {
            return false;
        }
        if (this.quality != tvSeriesSearchResponse.quality) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, tvSeriesSearchResponse.posterHeaders)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.score, (Object)tvSeriesSearchResponse.score);
    }
}

