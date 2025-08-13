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

import com.lagradost.cloudstream3.ActorData;
import com.lagradost.cloudstream3.LoadResponse;
import com.lagradost.cloudstream3.Score;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.TrailerData;
import com.lagradost.cloudstream3.TvType;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0002\bV\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008d\u0002\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u00a2\u0006\u0004\b\"\u0010#B\u00f7\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a\u0012\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c\u0012\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\"\u0010%J\t\u0010]\u001a\u00020\u0003H\u00c6\u0003J\t\u0010^\u001a\u00020\u0003H\u00c6\u0003J\t\u0010_\u001a\u00020\u0003H\u00c6\u0003J\t\u0010`\u001a\u00020\u0007H\u00c6\u0003J\t\u0010a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010g\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u00107J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\u0011\u0010i\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010H\u00c6\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010H\u00c6\u0003J\t\u0010k\u001a\u00020\u001aH\u00c6\u0003J\u0015\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cH\u00c6\u0003J\u0017\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eH\u00c6\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010p\u001a\u00020\u0003H\u00c6\u0003J\u009c\u0002\u0010q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00102\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\u0014\b\u0002\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001c2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010!\u001a\u00020\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010rJ\u0013\u0010s\u001a\u00020\u001a2\b\u0010t\u001a\u0004\u0018\u00010uH\u00d6\u0003J\t\u0010v\u001a\u00020\u000bH\u00d6\u0001J\t\u0010w\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010'\"\u0004\b3\u0010)R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010'\"\u0004\b5\u0010)R\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010'\"\u0004\b<\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000bX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010:\u001a\u0004\bE\u00107\"\u0004\bF\u00109R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010B\"\u0004\bH\u0010DR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010B\"\u0004\bJ\u0010DR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010B\"\u0004\bL\u0010DR\u001a\u0010\u0019\u001a\u00020\u001aX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR&\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR(\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010R\"\u0004\bV\u0010TR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010'\"\u0004\bX\u0010)R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010'\"\u0004\bZ\u0010)R\u001a\u0010!\u001a\u00020\u0003X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010'\"\u0004\b\\\u0010)\u00a8\u0006x"}, d2={"Lcom/lagradost/cloudstream3/MovieLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "dataUrl", "posterUrl", "year", "", "plot", "score", "Lcom/lagradost/cloudstream3/Score;", "tags", "", "duration", "trailers", "", "Lcom/lagradost/cloudstream3/TrailerData;", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "", "posterHeaders", "", "backgroundPosterUrl", "contentRating", "uniqueUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rating", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getApiName", "setApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getDataUrl", "setDataUrl", "getPosterUrl", "setPosterUrl", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPlot", "setPlot", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getDuration", "setDuration", "getTrailers", "setTrailers", "getRecommendations", "setRecommendations", "getActors", "setActors", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getSyncData", "()Ljava/util/Map;", "setSyncData", "(Ljava/util/Map;)V", "getPosterHeaders", "setPosterHeaders", "getBackgroundPosterUrl", "setBackgroundPosterUrl", "getContentRating", "setContentRating", "getUniqueUrl", "setUniqueUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/MovieLoadResponse;", "equals", "other", "", "hashCode", "toString", "library"})
public final class MovieLoadResponse
implements LoadResponse {
    @NotNull
    private String name;
    @NotNull
    private String url;
    @NotNull
    private String apiName;
    @NotNull
    private TvType type;
    @NotNull
    private String dataUrl;
    @Nullable
    private String posterUrl;
    @Nullable
    private Integer year;
    @Nullable
    private String plot;
    @Nullable
    private Score score;
    @Nullable
    private List<String> tags;
    @Nullable
    private Integer duration;
    @NotNull
    private List<TrailerData> trailers;
    @Nullable
    private List<? extends SearchResponse> recommendations;
    @Nullable
    private List<ActorData> actors;
    private boolean comingSoon;
    @NotNull
    private Map<String, String> syncData;
    @Nullable
    private Map<String, String> posterHeaders;
    @Nullable
    private String backgroundPosterUrl;
    @Nullable
    private String contentRating;
    @NotNull
    private String uniqueUrl;

    @Deprecated(message="Use newMovieLoadResponse method", level=DeprecationLevel.ERROR)
    public MovieLoadResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull String dataUrl, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable Score score2, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter((Object)dataUrl, (String)"dataUrl");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.dataUrl = dataUrl;
        this.posterUrl = posterUrl;
        this.year = year;
        this.plot = plot;
        this.score = score2;
        this.tags = tags;
        this.duration = duration;
        this.trailers = trailers;
        this.recommendations = recommendations;
        this.actors = actors;
        this.comingSoon = comingSoon;
        this.syncData = syncData;
        this.posterHeaders = posterHeaders;
        this.backgroundPosterUrl = backgroundPosterUrl;
        this.contentRating = contentRating;
        this.uniqueUrl = uniqueUrl;
    }

    public /* synthetic */ MovieLoadResponse(String string2, String string3, String string4, TvType tvType, String string5, String string6, Integer n, String string7, Score score2, List list2, Integer n2, List list3, List list4, List list5, boolean bl, Map map, Map map2, String string8, String string9, String string10, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x20) != 0) {
            string6 = null;
        }
        if ((n3 & 0x40) != 0) {
            n = null;
        }
        if ((n3 & 0x80) != 0) {
            string7 = null;
        }
        if ((n3 & 0x100) != 0) {
            score2 = null;
        }
        if ((n3 & 0x200) != 0) {
            list2 = null;
        }
        if ((n3 & 0x400) != 0) {
            n2 = null;
        }
        if ((n3 & 0x800) != 0) {
            list3 = new ArrayList();
        }
        if ((n3 & 0x1000) != 0) {
            list4 = null;
        }
        if ((n3 & 0x2000) != 0) {
            list5 = null;
        }
        if ((n3 & 0x4000) != 0) {
            bl = false;
        }
        if ((n3 & 0x8000) != 0) {
            map = new LinkedHashMap();
        }
        if ((n3 & 0x10000) != 0) {
            map2 = null;
        }
        if ((n3 & 0x20000) != 0) {
            string8 = null;
        }
        if ((n3 & 0x40000) != 0) {
            string9 = null;
        }
        if ((n3 & 0x80000) != 0) {
            string10 = string3;
        }
        this(string2, string3, string4, tvType, string5, string6, n, string7, score2, (List<String>)list2, n2, (List<TrailerData>)list3, (List<? extends SearchResponse>)list4, (List<ActorData>)list5, bl, (Map<String, String>)map, (Map<String, String>)map2, string8, string9, string10);
    }

    @Override
    @NotNull
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.name = string2;
    }

    @Override
    @NotNull
    public String getUrl() {
        return this.url;
    }

    @Override
    public void setUrl(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.url = string2;
    }

    @Override
    @NotNull
    public String getApiName() {
        return this.apiName;
    }

    @Override
    public void setApiName(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.apiName = string2;
    }

    @Override
    @NotNull
    public TvType getType() {
        return this.type;
    }

    @Override
    public void setType(@NotNull TvType tvType) {
        Intrinsics.checkNotNullParameter((Object)((Object)tvType), (String)"<set-?>");
        this.type = tvType;
    }

    @NotNull
    public final String getDataUrl() {
        return this.dataUrl;
    }

    public final void setDataUrl(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.dataUrl = string2;
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
    public Integer getYear() {
        return this.year;
    }

    @Override
    public void setYear(@Nullable Integer n) {
        this.year = n;
    }

    @Override
    @Nullable
    public String getPlot() {
        return this.plot;
    }

    @Override
    public void setPlot(@Nullable String string2) {
        this.plot = string2;
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

    @Override
    @Nullable
    public List<String> getTags() {
        return this.tags;
    }

    @Override
    public void setTags(@Nullable List<String> list2) {
        this.tags = list2;
    }

    @Override
    @Nullable
    public Integer getDuration() {
        return this.duration;
    }

    @Override
    public void setDuration(@Nullable Integer n) {
        this.duration = n;
    }

    @Override
    @NotNull
    public List<TrailerData> getTrailers() {
        return this.trailers;
    }

    @Override
    public void setTrailers(@NotNull List<TrailerData> list2) {
        Intrinsics.checkNotNullParameter(list2, (String)"<set-?>");
        this.trailers = list2;
    }

    @Override
    @Nullable
    public List<SearchResponse> getRecommendations() {
        return this.recommendations;
    }

    @Override
    public void setRecommendations(@Nullable List<? extends SearchResponse> list2) {
        this.recommendations = list2;
    }

    @Override
    @Nullable
    public List<ActorData> getActors() {
        return this.actors;
    }

    @Override
    public void setActors(@Nullable List<ActorData> list2) {
        this.actors = list2;
    }

    @Override
    public boolean getComingSoon() {
        return this.comingSoon;
    }

    @Override
    public void setComingSoon(boolean bl) {
        this.comingSoon = bl;
    }

    @Override
    @NotNull
    public Map<String, String> getSyncData() {
        return this.syncData;
    }

    @Override
    public void setSyncData(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, (String)"<set-?>");
        this.syncData = map;
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
    public String getBackgroundPosterUrl() {
        return this.backgroundPosterUrl;
    }

    @Override
    public void setBackgroundPosterUrl(@Nullable String string2) {
        this.backgroundPosterUrl = string2;
    }

    @Override
    @Nullable
    public String getContentRating() {
        return this.contentRating;
    }

    @Override
    public void setContentRating(@Nullable String string2) {
        this.contentRating = string2;
    }

    @Override
    @NotNull
    public String getUniqueUrl() {
        return this.uniqueUrl;
    }

    @Override
    public void setUniqueUrl(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.uniqueUrl = string2;
    }

    @Deprecated(message="Use newMovieLoadResponse method with contentRating included", level=DeprecationLevel.ERROR)
    public MovieLoadResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull String dataUrl, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable Integer rating, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable String backgroundPosterUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter((Object)dataUrl, (String)"dataUrl");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        this(name, url, apiName, type, dataUrl, posterUrl, year, plot, Score.Companion.fromOld(rating), tags, duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, backgroundPosterUrl, null, null, 524288, null);
    }

    public /* synthetic */ MovieLoadResponse(String string2, String string3, String string4, TvType tvType, String string5, String string6, Integer n, String string7, Integer n2, List list2, Integer n3, List list3, List list4, List list5, boolean bl, Map map, Map map2, String string8, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x20) != 0) {
            string6 = null;
        }
        if ((n4 & 0x40) != 0) {
            n = null;
        }
        if ((n4 & 0x80) != 0) {
            string7 = null;
        }
        if ((n4 & 0x100) != 0) {
            n2 = null;
        }
        if ((n4 & 0x200) != 0) {
            list2 = null;
        }
        if ((n4 & 0x400) != 0) {
            n3 = null;
        }
        if ((n4 & 0x800) != 0) {
            list3 = new ArrayList();
        }
        if ((n4 & 0x1000) != 0) {
            list4 = null;
        }
        if ((n4 & 0x2000) != 0) {
            list5 = null;
        }
        if ((n4 & 0x4000) != 0) {
            bl = false;
        }
        if ((n4 & 0x8000) != 0) {
            map = new LinkedHashMap();
        }
        if ((n4 & 0x10000) != 0) {
            map2 = null;
        }
        if ((n4 & 0x20000) != 0) {
            string8 = null;
        }
        this(string2, string3, string4, tvType, string5, string6, n, string7, n2, list2, n3, list3, list4, list5, bl, map, map2, string8);
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

    @NotNull
    public final TvType component4() {
        return this.type;
    }

    @NotNull
    public final String component5() {
        return this.dataUrl;
    }

    @Nullable
    public final String component6() {
        return this.posterUrl;
    }

    @Nullable
    public final Integer component7() {
        return this.year;
    }

    @Nullable
    public final String component8() {
        return this.plot;
    }

    @Nullable
    public final Score component9() {
        return this.score;
    }

    @Nullable
    public final List<String> component10() {
        return this.tags;
    }

    @Nullable
    public final Integer component11() {
        return this.duration;
    }

    @NotNull
    public final List<TrailerData> component12() {
        return this.trailers;
    }

    @Nullable
    public final List<SearchResponse> component13() {
        return this.recommendations;
    }

    @Nullable
    public final List<ActorData> component14() {
        return this.actors;
    }

    public final boolean component15() {
        return this.comingSoon;
    }

    @NotNull
    public final Map<String, String> component16() {
        return this.syncData;
    }

    @Nullable
    public final Map<String, String> component17() {
        return this.posterHeaders;
    }

    @Nullable
    public final String component18() {
        return this.backgroundPosterUrl;
    }

    @Nullable
    public final String component19() {
        return this.contentRating;
    }

    @NotNull
    public final String component20() {
        return this.uniqueUrl;
    }

    @NotNull
    public final MovieLoadResponse copy(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull String dataUrl, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable Score score2, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter((Object)dataUrl, (String)"dataUrl");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        return new MovieLoadResponse(name, url, apiName, type, dataUrl, posterUrl, year, plot, score2, tags, duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, backgroundPosterUrl, contentRating, uniqueUrl);
    }

    public static /* synthetic */ MovieLoadResponse copy$default(MovieLoadResponse movieLoadResponse, String string2, String string3, String string4, TvType tvType, String string5, String string6, Integer n, String string7, Score score2, List list2, Integer n2, List list3, List list4, List list5, boolean bl, Map map, Map map2, String string8, String string9, String string10, int n3, Object object) {
        if ((n3 & 1) != 0) {
            string2 = movieLoadResponse.name;
        }
        if ((n3 & 2) != 0) {
            string3 = movieLoadResponse.url;
        }
        if ((n3 & 4) != 0) {
            string4 = movieLoadResponse.apiName;
        }
        if ((n3 & 8) != 0) {
            tvType = movieLoadResponse.type;
        }
        if ((n3 & 0x10) != 0) {
            string5 = movieLoadResponse.dataUrl;
        }
        if ((n3 & 0x20) != 0) {
            string6 = movieLoadResponse.posterUrl;
        }
        if ((n3 & 0x40) != 0) {
            n = movieLoadResponse.year;
        }
        if ((n3 & 0x80) != 0) {
            string7 = movieLoadResponse.plot;
        }
        if ((n3 & 0x100) != 0) {
            score2 = movieLoadResponse.score;
        }
        if ((n3 & 0x200) != 0) {
            list2 = movieLoadResponse.tags;
        }
        if ((n3 & 0x400) != 0) {
            n2 = movieLoadResponse.duration;
        }
        if ((n3 & 0x800) != 0) {
            list3 = movieLoadResponse.trailers;
        }
        if ((n3 & 0x1000) != 0) {
            list4 = movieLoadResponse.recommendations;
        }
        if ((n3 & 0x2000) != 0) {
            list5 = movieLoadResponse.actors;
        }
        if ((n3 & 0x4000) != 0) {
            bl = movieLoadResponse.comingSoon;
        }
        if ((n3 & 0x8000) != 0) {
            map = movieLoadResponse.syncData;
        }
        if ((n3 & 0x10000) != 0) {
            map2 = movieLoadResponse.posterHeaders;
        }
        if ((n3 & 0x20000) != 0) {
            string8 = movieLoadResponse.backgroundPosterUrl;
        }
        if ((n3 & 0x40000) != 0) {
            string9 = movieLoadResponse.contentRating;
        }
        if ((n3 & 0x80000) != 0) {
            string10 = movieLoadResponse.uniqueUrl;
        }
        return movieLoadResponse.copy(string2, string3, string4, tvType, string5, string6, n, string7, score2, list2, n2, list3, list4, list5, bl, map, map2, string8, string9, string10);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("MovieLoadResponse(name=").append(this.name).append(", url=").append(this.url).append(", apiName=").append(this.apiName).append(", type=").append((Object)this.type).append(", dataUrl=").append(this.dataUrl).append(", posterUrl=").append(this.posterUrl).append(", year=").append(this.year).append(", plot=").append(this.plot).append(", score=").append(this.score).append(", tags=").append(this.tags).append(", duration=").append(this.duration).append(", trailers=");
        stringBuilder.append(this.trailers).append(", recommendations=").append(this.recommendations).append(", actors=").append(this.actors).append(", comingSoon=").append(this.comingSoon).append(", syncData=").append(this.syncData).append(", posterHeaders=").append(this.posterHeaders).append(", backgroundPosterUrl=").append(this.backgroundPosterUrl).append(", contentRating=").append(this.contentRating).append(", uniqueUrl=").append(this.uniqueUrl).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + this.type.hashCode();
        result2 = result2 * 31 + this.dataUrl.hashCode();
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.year == null ? 0 : ((Object)this.year).hashCode());
        result2 = result2 * 31 + (this.plot == null ? 0 : this.plot.hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
        result2 = result2 * 31 + (this.tags == null ? 0 : ((Object)this.tags).hashCode());
        result2 = result2 * 31 + (this.duration == null ? 0 : ((Object)this.duration).hashCode());
        result2 = result2 * 31 + ((Object)this.trailers).hashCode();
        result2 = result2 * 31 + (this.recommendations == null ? 0 : ((Object)this.recommendations).hashCode());
        result2 = result2 * 31 + (this.actors == null ? 0 : ((Object)this.actors).hashCode());
        result2 = result2 * 31 + Boolean.hashCode(this.comingSoon);
        result2 = result2 * 31 + ((Object)this.syncData).hashCode();
        result2 = result2 * 31 + (this.posterHeaders == null ? 0 : ((Object)this.posterHeaders).hashCode());
        result2 = result2 * 31 + (this.backgroundPosterUrl == null ? 0 : this.backgroundPosterUrl.hashCode());
        result2 = result2 * 31 + (this.contentRating == null ? 0 : this.contentRating.hashCode());
        result2 = result2 * 31 + this.uniqueUrl.hashCode();
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MovieLoadResponse)) {
            return false;
        }
        MovieLoadResponse movieLoadResponse = (MovieLoadResponse)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)movieLoadResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)movieLoadResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)movieLoadResponse.apiName)) {
            return false;
        }
        if (this.type != movieLoadResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.dataUrl, (Object)movieLoadResponse.dataUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)movieLoadResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.year, (Object)movieLoadResponse.year)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.plot, (Object)movieLoadResponse.plot)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.score, (Object)movieLoadResponse.score)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tags, movieLoadResponse.tags)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.duration, (Object)movieLoadResponse.duration)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.trailers, movieLoadResponse.trailers)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.recommendations, movieLoadResponse.recommendations)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.actors, movieLoadResponse.actors)) {
            return false;
        }
        if (this.comingSoon != movieLoadResponse.comingSoon) {
            return false;
        }
        if (!Intrinsics.areEqual(this.syncData, movieLoadResponse.syncData)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, movieLoadResponse.posterHeaders)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.backgroundPosterUrl, (Object)movieLoadResponse.backgroundPosterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.contentRating, (Object)movieLoadResponse.contentRating)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.uniqueUrl, (Object)movieLoadResponse.uniqueUrl);
    }

    @Override
    @Nullable
    public Integer getRating() {
        return LoadResponse.DefaultImpls.getRating(this);
    }

    @Override
    public void setRating(@Nullable Integer value) {
        LoadResponse.DefaultImpls.setRating(this, value);
    }
}

