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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b.\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\b\u0012\u0010\u0013Bq\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0014J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u00109\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0017\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u008c\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\t\u0010C\u001a\u00020\nH\u00d6\u0001J\t\u0010D\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010$\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0016\"\u0004\b.\u0010\u001fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102\u00a8\u0006E"}, d2={"Lcom/lagradost/cloudstream3/LiveSearchResponse;", "Lcom/lagradost/cloudstream3/SearchResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "id", "", "quality", "Lcom/lagradost/cloudstream3/SearchQuality;", "posterHeaders", "", "lang", "score", "Lcom/lagradost/cloudstream3/Score;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getUrl", "getApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getPosterUrl", "setPosterUrl", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getQuality", "()Lcom/lagradost/cloudstream3/SearchQuality;", "setQuality", "(Lcom/lagradost/cloudstream3/SearchQuality;)V", "getPosterHeaders", "()Ljava/util/Map;", "setPosterHeaders", "(Ljava/util/Map;)V", "getLang", "setLang", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Lcom/lagradost/cloudstream3/SearchQuality;Ljava/util/Map;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;)Lcom/lagradost/cloudstream3/LiveSearchResponse;", "equals", "", "other", "", "hashCode", "toString", "library"})
public final class LiveSearchResponse
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
    private Integer id;
    @Nullable
    private SearchQuality quality;
    @Nullable
    private Map<String, String> posterHeaders;
    @Nullable
    private String lang;
    @Nullable
    private Score score;

    @Deprecated(message="Use newLiveSearchResponse", level=DeprecationLevel.ERROR)
    public LiveSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable String lang, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.posterUrl = posterUrl;
        this.id = id2;
        this.quality = quality;
        this.posterHeaders = posterHeaders;
        this.lang = lang;
        this.score = score2;
    }

    public /* synthetic */ LiveSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, SearchQuality searchQuality, Map map, String string6, Score score2, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 8) != 0) {
            tvType = null;
        }
        if ((n2 & 0x10) != 0) {
            string5 = null;
        }
        if ((n2 & 0x20) != 0) {
            n = null;
        }
        if ((n2 & 0x40) != 0) {
            searchQuality = null;
        }
        if ((n2 & 0x80) != 0) {
            map = null;
        }
        if ((n2 & 0x100) != 0) {
            string6 = null;
        }
        if ((n2 & 0x200) != 0) {
            score2 = null;
        }
        this(string2, string3, string4, tvType, string5, n, searchQuality, map, string6, score2);
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

    @Nullable
    public final String getLang() {
        return this.lang;
    }

    public final void setLang(@Nullable String string2) {
        this.lang = string2;
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

    @Deprecated(message="Use newLiveSearchResponse", level=DeprecationLevel.ERROR)
    public LiveSearchResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable String lang) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        this(name, url, apiName, type, posterUrl, id2, quality, posterHeaders, lang, null);
    }

    public /* synthetic */ LiveSearchResponse(String string2, String string3, String string4, TvType tvType, String string5, Integer n, SearchQuality searchQuality, Map map, String string6, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 0x20) != 0) {
            n = null;
        }
        if ((n2 & 0x40) != 0) {
            searchQuality = null;
        }
        if ((n2 & 0x80) != 0) {
            map = null;
        }
        if ((n2 & 0x100) != 0) {
            string6 = null;
        }
        this(string2, string3, string4, tvType, string5, n, searchQuality, map, string6);
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
        return this.id;
    }

    @Nullable
    public final SearchQuality component7() {
        return this.quality;
    }

    @Nullable
    public final Map<String, String> component8() {
        return this.posterHeaders;
    }

    @Nullable
    public final String component9() {
        return this.lang;
    }

    @Nullable
    public final Score component10() {
        return this.score;
    }

    @NotNull
    public final LiveSearchResponse copy(@NotNull String name, @NotNull String url, @NotNull String apiName, @Nullable TvType type, @Nullable String posterUrl, @Nullable Integer id2, @Nullable SearchQuality quality, @Nullable Map<String, String> posterHeaders, @Nullable String lang, @Nullable Score score2) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        return new LiveSearchResponse(name, url, apiName, type, posterUrl, id2, quality, posterHeaders, lang, score2);
    }

    public static /* synthetic */ LiveSearchResponse copy$default(LiveSearchResponse liveSearchResponse, String string2, String string3, String string4, TvType tvType, String string5, Integer n, SearchQuality searchQuality, Map map, String string6, Score score2, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = liveSearchResponse.name;
        }
        if ((n2 & 2) != 0) {
            string3 = liveSearchResponse.url;
        }
        if ((n2 & 4) != 0) {
            string4 = liveSearchResponse.apiName;
        }
        if ((n2 & 8) != 0) {
            tvType = liveSearchResponse.type;
        }
        if ((n2 & 0x10) != 0) {
            string5 = liveSearchResponse.posterUrl;
        }
        if ((n2 & 0x20) != 0) {
            n = liveSearchResponse.id;
        }
        if ((n2 & 0x40) != 0) {
            searchQuality = liveSearchResponse.quality;
        }
        if ((n2 & 0x80) != 0) {
            map = liveSearchResponse.posterHeaders;
        }
        if ((n2 & 0x100) != 0) {
            string6 = liveSearchResponse.lang;
        }
        if ((n2 & 0x200) != 0) {
            score2 = liveSearchResponse.score;
        }
        return liveSearchResponse.copy(string2, string3, string4, tvType, string5, n, searchQuality, map, string6, score2);
    }

    @NotNull
    public String toString() {
        return "LiveSearchResponse(name=" + this.name + ", url=" + this.url + ", apiName=" + this.apiName + ", type=" + (Object)((Object)this.type) + ", posterUrl=" + this.posterUrl + ", id=" + this.id + ", quality=" + (Object)((Object)this.quality) + ", posterHeaders=" + this.posterHeaders + ", lang=" + this.lang + ", score=" + this.score + ')';
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + (this.type == null ? 0 : this.type.hashCode());
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.id == null ? 0 : ((Object)this.id).hashCode());
        result2 = result2 * 31 + (this.quality == null ? 0 : this.quality.hashCode());
        result2 = result2 * 31 + (this.posterHeaders == null ? 0 : ((Object)this.posterHeaders).hashCode());
        result2 = result2 * 31 + (this.lang == null ? 0 : this.lang.hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiveSearchResponse)) {
            return false;
        }
        LiveSearchResponse liveSearchResponse = (LiveSearchResponse)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)liveSearchResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)liveSearchResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)liveSearchResponse.apiName)) {
            return false;
        }
        if (this.type != liveSearchResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)liveSearchResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.id, (Object)liveSearchResponse.id)) {
            return false;
        }
        if (this.quality != liveSearchResponse.quality) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, liveSearchResponse.posterHeaders)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.lang, (Object)liveSearchResponse.lang)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.score, (Object)liveSearchResponse.score);
    }
}

