/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.core.type.TypeReference
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.ReplaceWith
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.lagradost.cloudstream3.Actor;
import com.lagradost.cloudstream3.ActorData;
import com.lagradost.cloudstream3.ActorRole;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.Score;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SimklSyncServices;
import com.lagradost.cloudstream3.TrailerData;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.utils.AppUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0013\bf\u0018\u0000 [2\u00020\u0001:\u0001[R\u0018\u0010\u0002\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0015\u0010\u0005\"\u0004\b\u0016\u0010\u0007R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u0005\"\u0004\b\u001f\u0010\u0007R\u001a\u0010 \u001a\u0004\u0018\u00010!X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010&\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010'X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u0004\u0018\u00010\u0018X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R \u00104\u001a\n\u0012\u0004\u0012\u000205\u0018\u00010'X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b6\u0010)\"\u0004\b7\u0010+R \u00108\u001a\n\u0012\u0004\u0012\u000209\u0018\u00010'X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b:\u0010)\"\u0004\b;\u0010+R\u0018\u0010<\u001a\u00020=X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030CX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR&\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010IX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u001a\u0010L\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010\u0005\"\u0004\bN\u0010\u0007R\u001a\u0010O\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bP\u0010\u0005\"\u0004\bQ\u0010\u0007R\u0018\u0010R\u001a\u00020\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\bS\u0010\u0005\"\u0004\bT\u0010\u0007R.\u0010V\u001a\u0004\u0018\u00010\u00182\b\u0010U\u001a\u0004\u0018\u00010\u00188V@VX\u0097\u000e\u00a2\u0006\u0012\u0012\u0004\bW\u0010X\u001a\u0004\bY\u0010\u001a\"\u0004\bZ\u0010\u001c\u00a8\u0006\\"}, d2={"Lcom/lagradost/cloudstream3/LoadResponse;", "", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "url", "getUrl", "setUrl", "apiName", "getApiName", "setApiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "posterUrl", "getPosterUrl", "setPosterUrl", "year", "", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "plot", "getPlot", "setPlot", "score", "Lcom/lagradost/cloudstream3/Score;", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "tags", "", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "duration", "getDuration", "setDuration", "trailers", "", "Lcom/lagradost/cloudstream3/TrailerData;", "getTrailers", "setTrailers", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "getRecommendations", "setRecommendations", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "getActors", "setActors", "comingSoon", "", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "syncData", "", "getSyncData", "()Ljava/util/Map;", "setSyncData", "(Ljava/util/Map;)V", "posterHeaders", "", "getPosterHeaders", "setPosterHeaders", "backgroundPosterUrl", "getBackgroundPosterUrl", "setBackgroundPosterUrl", "contentRating", "getContentRating", "setContentRating", "uniqueUrl", "getUniqueUrl", "setUniqueUrl", "value", "rating", "getRating$annotations", "()V", "getRating", "setRating", "Companion", "library"})
public interface LoadResponse {
    @NotNull
    public static final Companion Companion = com.lagradost.cloudstream3.LoadResponse$Companion.$$INSTANCE;

    @NotNull
    public String getName();

    public void setName(@NotNull String var1);

    @NotNull
    public String getUrl();

    public void setUrl(@NotNull String var1);

    @NotNull
    public String getApiName();

    public void setApiName(@NotNull String var1);

    @NotNull
    public TvType getType();

    public void setType(@NotNull TvType var1);

    @Nullable
    public String getPosterUrl();

    public void setPosterUrl(@Nullable String var1);

    @Nullable
    public Integer getYear();

    public void setYear(@Nullable Integer var1);

    @Nullable
    public String getPlot();

    public void setPlot(@Nullable String var1);

    @Nullable
    public Score getScore();

    public void setScore(@Nullable Score var1);

    @Nullable
    public List<String> getTags();

    public void setTags(@Nullable List<String> var1);

    @Nullable
    public Integer getDuration();

    public void setDuration(@Nullable Integer var1);

    @NotNull
    public List<TrailerData> getTrailers();

    public void setTrailers(@NotNull List<TrailerData> var1);

    @Nullable
    public List<SearchResponse> getRecommendations();

    public void setRecommendations(@Nullable List<? extends SearchResponse> var1);

    @Nullable
    public List<ActorData> getActors();

    public void setActors(@Nullable List<ActorData> var1);

    public boolean getComingSoon();

    public void setComingSoon(boolean var1);

    @NotNull
    public Map<String, String> getSyncData();

    public void setSyncData(@NotNull Map<String, String> var1);

    @Nullable
    public Map<String, String> getPosterHeaders();

    public void setPosterHeaders(@Nullable Map<String, String> var1);

    @Nullable
    public String getBackgroundPosterUrl();

    public void setBackgroundPosterUrl(@Nullable String var1);

    @Nullable
    public String getContentRating();

    public void setContentRating(@Nullable String var1);

    @NotNull
    public String getUniqueUrl();

    public void setUniqueUrl(@NotNull String var1);

    @Nullable
    public Integer getRating();

    public void setRating(@Nullable Integer var1);

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0015\u001a\u0004\u0018\u00010\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00050\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005J\n\u0010\u001c\u001a\u00020\u0011*\u00020\u001dJ!\u0010\u001e\u001a\u00020\u001f*\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!H\u0007\u00a2\u0006\u0002\b\"J*\u0010\u001e\u001a\u00020\u001f*\u00020\u001d2\u001c\u0010 \u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010\u00050#\u0018\u00010!H\u0007J/\u0010\u001e\u001a\u00020\u001f*\u00020\u001d2\u001c\u0010 \u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020$\u0012\u0006\u0012\u0004\u0018\u00010%0#\u0018\u00010!H\u0007\u00a2\u0006\u0002\b&J\u001e\u0010'\u001a\u00020\u001f*\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0002J!\u0010\u001e\u001a\u00020\u001f*\u00020\u001d2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010!H\u0007\u00a2\u0006\u0002\b(J\f\u0010)\u001a\u0004\u0018\u00010\u0005*\u00020\u001dJ\f\u0010*\u001a\u0004\u0018\u00010\u0005*\u00020\u001dJ\f\u0010+\u001a\u0004\u0018\u00010\u0005*\u00020\u001dJ\f\u0010,\u001a\u0004\u0018\u00010\u0005*\u00020\u001dJ\u0019\u0010-\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010.\u00a2\u0006\u0002\u0010/J\u0019\u00100\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010.\u00a2\u0006\u0002\u0010/J\u0019\u0010'\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010.\u00a2\u0006\u0002\u0010/J\u0014\u00101\u001a\u00020\u001f*\u00020\u001d2\b\u00102\u001a\u0004\u0018\u00010\u0005J2\u00103\u001a\u00020\u001f*\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00106\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u00107JH\u00103\u001a\u00020\u001f*\u00020\u001d2\b\u00104\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00106\u001a\u00020\u00112\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u001bH\u0086@\u00a2\u0006\u0002\u00109J8\u00103\u001a\u00020\u001f*\u00020\u001d2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00106\u001a\u00020\u0011H\u0086@\u00a2\u0006\u0002\u0010;J\u0014\u0010<\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0016\u0010=\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0007J\u0016\u0010>\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u0007J\u0014\u0010?\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0014\u0010@\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u0014\u0010A\u001a\u00020\u001f*\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005J\u001e\u0010B\u001a\u00020\u001f*\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010D\u001a\u00020.J\u0014\u0010B\u001a\u00020\u001f*\u00020\u001d2\b\u0010C\u001a\u0004\u0018\u00010EJ\u0014\u0010F\u001a\u00020\u001f*\u00020\u001d2\b\u0010G\u001a\u0004\u0018\u00010\u0005J\u001b\u0010F\u001a\u00020\u001f*\u00020\u001d2\b\u0010H\u001a\u0004\u0018\u00010.H\u0007\u00a2\u0006\u0002\u0010/J\u0014\u0010I\u001a\u00020\u001f*\u00020\u001d2\b\u0010J\u001a\u0004\u0018\u00010\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006K"}, d2={"Lcom/lagradost/cloudstream3/LoadResponse$Companion;", "", "<init>", "()V", "malIdPrefix", "", "getMalIdPrefix", "()Ljava/lang/String;", "setMalIdPrefix", "(Ljava/lang/String;)V", "aniListIdPrefix", "getAniListIdPrefix", "setAniListIdPrefix", "simklIdPrefix", "getSimklIdPrefix", "setSimklIdPrefix", "isTrailersEnabled", "", "()Z", "setTrailersEnabled", "(Z)V", "addIdToString", "idString", "database", "Lcom/lagradost/cloudstream3/SimklSyncServices;", "id", "readIdFromString", "", "isMovie", "Lcom/lagradost/cloudstream3/LoadResponse;", "addActors", "", "actors", "", "addActorNames", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/Actor;", "Lcom/lagradost/cloudstream3/ActorRole;", "addActorsRole", "addSimklId", "addActorsOnly", "getMalId", "getAniListId", "getImdbId", "getTMDbId", "addMalId", "", "(Lcom/lagradost/cloudstream3/LoadResponse;Ljava/lang/Integer;)V", "addAniListId", "addImdbUrl", "url", "addTrailer", "trailerUrl", "referer", "addRaw", "(Lcom/lagradost/cloudstream3/LoadResponse;Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "headers", "(Lcom/lagradost/cloudstream3/LoadResponse;Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trailerUrls", "(Lcom/lagradost/cloudstream3/LoadResponse;Ljava/util/List;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addImdbId", "addTrackId", "addkitsuId", "addTraktId", "addKitsuId", "addTMDbId", "addScore", "score", "maxValue", "Lcom/lagradost/cloudstream3/Score;", "addRating", "text", "value", "addDuration", "input", "library"})
    @SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/LoadResponse$Companion\n+ 2 AppUtils.kt\ncom/lagradost/cloudstream3/utils/AppUtils\n+ 3 Extensions.kt\ncom/fasterxml/jackson/module/kotlin/ExtensionsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2892:1\n23#2,2:2893\n15#2:2895\n25#2,2:2898\n50#3:2896\n43#3:2897\n1557#4:2900\n1628#4,3:2901\n1557#4:2904\n1628#4,3:2905\n1557#4:2908\n1628#4,3:2909\n1557#4:2912\n1628#4,3:2913\n1557#4:2916\n1628#4,3:2917\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/LoadResponse$Companion\n*L\n1682#1:2893,2\n1682#1:2895\n1682#1:2898,2\n1682#1:2896\n1682#1:2897\n1691#1:2900\n1691#1:2901,3\n1696#1:2904\n1696#1:2905,3\n1701#1:2908\n1701#1:2909,3\n1720#1:2912\n1720#1:2913,3\n1820#1:2916\n1820#1:2917,3\n*E\n"})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE;
        @NotNull
        private static String malIdPrefix;
        @NotNull
        private static String aniListIdPrefix;
        @NotNull
        private static String simklIdPrefix;
        private static boolean isTrailersEnabled;

        private Companion() {
        }

        @NotNull
        public final String getMalIdPrefix() {
            return malIdPrefix;
        }

        public final void setMalIdPrefix(@NotNull String string2) {
            Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
            malIdPrefix = string2;
        }

        @NotNull
        public final String getAniListIdPrefix() {
            return aniListIdPrefix;
        }

        public final void setAniListIdPrefix(@NotNull String string2) {
            Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
            aniListIdPrefix = string2;
        }

        @NotNull
        public final String getSimklIdPrefix() {
            return simklIdPrefix;
        }

        public final void setSimklIdPrefix(@NotNull String string2) {
            Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
            simklIdPrefix = string2;
        }

        public final boolean isTrailersEnabled() {
            return isTrailersEnabled;
        }

        public final void setTrailersEnabled(boolean bl) {
            isTrailersEnabled = bl;
        }

        @Nullable
        public final String addIdToString(@Nullable String idString, @NotNull SimklSyncServices database, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)((Object)database), (String)"database");
            if (id2 == null) {
                return idString;
            }
            return AppUtils.INSTANCE.toJson(MapsKt.plus(this.readIdFromString(idString), (Map)MapsKt.mapOf((Pair)TuplesKt.to((Object)((Object)database), (Object)id2))));
        }

        @NotNull
        public final Map<SimklSyncServices, String> readIdFromString(@Nullable String idString) {
            AppUtils appUtils;
            block4: {
                Object object;
                AppUtils this_$iv = AppUtils.INSTANCE;
                boolean $i$f$tryParseJson = false;
                try {
                    object = this_$iv;
                    String string2 = idString;
                    if (string2 == null) {
                        appUtils = null;
                        break block4;
                    }
                    String value$iv$iv = string2;
                    boolean $i$f$parseJson = false;
                    ObjectMapper $this$readValue$iv$iv$iv = (ObjectMapper)MainAPIKt.getMapper();
                    boolean $i$f$readValue = false;
                    boolean $i$f$jacksonTypeRef = false;
                    object = $this$readValue$iv$iv$iv.readValue(value$iv$iv, (TypeReference)new TypeReference<Map<SimklSyncServices, ? extends String>>(){});
                }
                catch (Exception exception) {
                    object = null;
                }
                appUtils = object;
            }
            Map map = (Map)((Object)appUtils);
            if (map == null) {
                return MapsKt.emptyMap();
            }
            return map;
        }

        public final boolean isMovie(@NotNull LoadResponse $this$isMovie) {
            Intrinsics.checkNotNullParameter((Object)$this$isMovie, (String)"<this>");
            return MainAPIKt.isMovieType($this$isMovie.getType()) || $this$isMovie instanceof MovieLoadResponse;
        }

        /*
         * WARNING - void declaration
         */
        @JvmName(name="addActorNames")
        public final void addActorNames(@NotNull LoadResponse $this$addActors, @Nullable List<String> actors) {
            List list2;
            Intrinsics.checkNotNullParameter((Object)$this$addActors, (String)"<this>");
            LoadResponse loadResponse2 = $this$addActors;
            List<String> list3 = actors;
            if (list3 != null) {
                void $this$mapTo$iv$iv;
                void $this$map$iv;
                Iterable iterable = list3;
                LoadResponse loadResponse3 = loadResponse2;
                boolean $i$f$map = false;
                void var5_6 = $this$map$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                boolean $i$f$mapTo = false;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    void it;
                    String string2 = (String)item$iv$iv;
                    Collection collection = destination$iv$iv;
                    boolean bl = false;
                    collection.add(new ActorData(new Actor((String)it, null, 2, null), null, null, null, 14, null));
                }
                list2 = (List)destination$iv$iv;
                loadResponse2 = loadResponse3;
            } else {
                list2 = null;
            }
            loadResponse2.setActors(list2);
        }

        /*
         * WARNING - void declaration
         */
        @JvmName(name="addActors")
        public final void addActors(@NotNull LoadResponse $this$addActors, @Nullable List<Pair<Actor, String>> actors) {
            List list2;
            Intrinsics.checkNotNullParameter((Object)$this$addActors, (String)"<this>");
            LoadResponse loadResponse2 = $this$addActors;
            List<Pair<Actor, String>> list3 = actors;
            if (list3 != null) {
                void $this$mapTo$iv$iv;
                void $this$map$iv;
                Iterable iterable = list3;
                LoadResponse loadResponse3 = loadResponse2;
                boolean $i$f$map = false;
                void var5_6 = $this$map$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                boolean $i$f$mapTo = false;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    Pair pair = (Pair)item$iv$iv;
                    Collection collection = destination$iv$iv;
                    boolean bl = false;
                    Actor actor = (Actor)pair.component1();
                    String role = (String)pair.component2();
                    collection.add(new ActorData(actor, null, role, null, 10, null));
                }
                list2 = (List)destination$iv$iv;
                loadResponse2 = loadResponse3;
            } else {
                list2 = null;
            }
            loadResponse2.setActors(list2);
        }

        /*
         * WARNING - void declaration
         */
        @JvmName(name="addActorsRole")
        public final void addActorsRole(@NotNull LoadResponse $this$addActors, @Nullable List<? extends Pair<Actor, ? extends ActorRole>> actors) {
            List list2;
            Intrinsics.checkNotNullParameter((Object)$this$addActors, (String)"<this>");
            LoadResponse loadResponse2 = $this$addActors;
            List<? extends Pair<Actor, ? extends ActorRole>> list3 = actors;
            if (list3 != null) {
                void $this$mapTo$iv$iv;
                void $this$map$iv;
                Iterable iterable = list3;
                LoadResponse loadResponse3 = loadResponse2;
                boolean $i$f$map = false;
                void var5_6 = $this$map$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                boolean $i$f$mapTo = false;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    Pair pair = (Pair)item$iv$iv;
                    Collection collection = destination$iv$iv;
                    boolean bl = false;
                    Actor actor = (Actor)pair.component1();
                    ActorRole role = (ActorRole)((Object)pair.component2());
                    collection.add(new ActorData(actor, role, null, null, 12, null));
                }
                list2 = (List)destination$iv$iv;
                loadResponse2 = loadResponse3;
            } else {
                list2 = null;
            }
            loadResponse2.setActors(list2);
        }

        private final void addSimklId(LoadResponse $this$addSimklId, SimklSyncServices database, String id2) {
            ArchComponentExtKt.safe(() -> Companion.addSimklId$lambda$3($this$addSimklId, database, id2));
        }

        /*
         * WARNING - void declaration
         */
        @JvmName(name="addActorsOnly")
        public final void addActorsOnly(@NotNull LoadResponse $this$addActors, @Nullable List<Actor> actors) {
            List list2;
            Intrinsics.checkNotNullParameter((Object)$this$addActors, (String)"<this>");
            LoadResponse loadResponse2 = $this$addActors;
            List<Actor> list3 = actors;
            if (list3 != null) {
                void $this$mapTo$iv$iv;
                void $this$map$iv;
                Iterable iterable = list3;
                LoadResponse loadResponse3 = loadResponse2;
                boolean $i$f$map = false;
                void var5_6 = $this$map$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                boolean $i$f$mapTo = false;
                for (Object item$iv$iv : $this$mapTo$iv$iv) {
                    void actor;
                    Actor actor2 = (Actor)item$iv$iv;
                    Collection collection = destination$iv$iv;
                    boolean bl = false;
                    collection.add(new ActorData((Actor)actor, null, null, null, 14, null));
                }
                list2 = (List)destination$iv$iv;
                loadResponse2 = loadResponse3;
            } else {
                list2 = null;
            }
            loadResponse2.setActors(list2);
        }

        @Nullable
        public final String getMalId(@NotNull LoadResponse $this$getMalId) {
            Intrinsics.checkNotNullParameter((Object)$this$getMalId, (String)"<this>");
            return $this$getMalId.getSyncData().get(malIdPrefix);
        }

        @Nullable
        public final String getAniListId(@NotNull LoadResponse $this$getAniListId) {
            Intrinsics.checkNotNullParameter((Object)$this$getAniListId, (String)"<this>");
            return $this$getAniListId.getSyncData().get(aniListIdPrefix);
        }

        @Nullable
        public final String getImdbId(@NotNull LoadResponse $this$getImdbId) {
            Intrinsics.checkNotNullParameter((Object)$this$getImdbId, (String)"<this>");
            return (String)ArchComponentExtKt.safe(() -> Companion.getImdbId$lambda$5($this$getImdbId));
        }

        @Nullable
        public final String getTMDbId(@NotNull LoadResponse $this$getTMDbId) {
            Intrinsics.checkNotNullParameter((Object)$this$getTMDbId, (String)"<this>");
            return (String)ArchComponentExtKt.safe(() -> Companion.getTMDbId$lambda$6($this$getTMDbId));
        }

        public final void addMalId(@NotNull LoadResponse $this$addMalId, @Nullable Integer id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addMalId, (String)"<this>");
            Integer n = id2;
            if (n == null) {
                return;
            }
            $this$addMalId.getSyncData().put(malIdPrefix, String.valueOf(n));
            this.addSimklId($this$addMalId, SimklSyncServices.Mal, id2.toString());
        }

        public final void addAniListId(@NotNull LoadResponse $this$addAniListId, @Nullable Integer id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addAniListId, (String)"<this>");
            Integer n = id2;
            if (n == null) {
                return;
            }
            $this$addAniListId.getSyncData().put(aniListIdPrefix, String.valueOf(n));
            this.addSimklId($this$addAniListId, SimklSyncServices.AniList, id2.toString());
        }

        public final void addSimklId(@NotNull LoadResponse $this$addSimklId, @Nullable Integer id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addSimklId, (String)"<this>");
            this.addSimklId($this$addSimklId, SimklSyncServices.Simkl, String.valueOf(id2));
        }

        public final void addImdbUrl(@NotNull LoadResponse $this$addImdbUrl, @Nullable String url) {
            Intrinsics.checkNotNullParameter((Object)$this$addImdbUrl, (String)"<this>");
            this.addImdbId($this$addImdbUrl, MainAPIKt.imdbUrlToIdNullable(url));
        }

        @Nullable
        public final Object addTrailer(@NotNull LoadResponse $this$addTrailer, @Nullable String trailerUrl, @Nullable String referer, boolean addRaw, @NotNull Continuation<? super Unit> $completion) {
            CharSequence charSequence;
            if (!isTrailersEnabled || (charSequence = (CharSequence)trailerUrl) == null || StringsKt.isBlank((CharSequence)charSequence)) {
                return Unit.INSTANCE;
            }
            $this$addTrailer.getTrailers().add(new TrailerData(trailerUrl, referer, addRaw, null, 8, null));
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object addTrailer$default(Companion companion, LoadResponse loadResponse2, String string2, String string3, boolean bl, Continuation continuation, int n, Object object) {
            if ((n & 2) != 0) {
                string3 = null;
            }
            if ((n & 4) != 0) {
                bl = false;
            }
            return companion.addTrailer(loadResponse2, string2, string3, bl, (Continuation<? super Unit>)continuation);
        }

        @Nullable
        public final Object addTrailer(@NotNull LoadResponse $this$addTrailer, @Nullable String trailerUrl, @Nullable String referer, boolean addRaw, @NotNull Map<String, String> headers, @NotNull Continuation<? super Unit> $completion) {
            CharSequence charSequence;
            if (!isTrailersEnabled || (charSequence = (CharSequence)trailerUrl) == null || StringsKt.isBlank((CharSequence)charSequence)) {
                return Unit.INSTANCE;
            }
            $this$addTrailer.getTrailers().add(new TrailerData(trailerUrl, referer, addRaw, headers));
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object addTrailer$default(Companion companion, LoadResponse loadResponse2, String string2, String string3, boolean bl, Map map, Continuation continuation, int n, Object object) {
            if ((n & 2) != 0) {
                string3 = null;
            }
            if ((n & 4) != 0) {
                bl = false;
            }
            if ((n & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            return companion.addTrailer(loadResponse2, string2, string3, bl, map, (Continuation<? super Unit>)continuation);
        }

        /*
         * WARNING - void declaration
         */
        @Nullable
        public final Object addTrailer(@NotNull LoadResponse $this$addTrailer, @Nullable List<String> trailerUrls, @Nullable String referer, boolean addRaw, @NotNull Continuation<? super Unit> $completion) {
            void $this$mapTo$iv$iv;
            void $this$map$iv;
            if (!isTrailersEnabled || trailerUrls == null) {
                return Unit.INSTANCE;
            }
            Iterable iterable = trailerUrls;
            List<TrailerData> list2 = $this$addTrailer.getTrailers();
            boolean $i$f$map = false;
            void var8_9 = $this$map$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
            boolean $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                void it;
                String string2 = (String)item$iv$iv;
                Collection collection = destination$iv$iv;
                boolean bl = false;
                collection.add(new TrailerData((String)it, referer, addRaw, null, 8, null));
            }
            list2.addAll((List)destination$iv$iv);
            return Unit.INSTANCE;
        }

        public static /* synthetic */ Object addTrailer$default(Companion companion, LoadResponse loadResponse2, List list2, String string2, boolean bl, Continuation continuation, int n, Object object) {
            if ((n & 2) != 0) {
                string2 = null;
            }
            if ((n & 4) != 0) {
                bl = false;
            }
            return companion.addTrailer(loadResponse2, list2, string2, bl, (Continuation<? super Unit>)continuation);
        }

        public final void addImdbId(@NotNull LoadResponse $this$addImdbId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addImdbId, (String)"<this>");
            this.addSimklId($this$addImdbId, SimklSyncServices.Imdb, id2);
        }

        @Deprecated(message="Outdated API due to misspelling", replaceWith=@ReplaceWith(expression="addTraktId(id)", imports={}))
        public final void addTrackId(@NotNull LoadResponse $this$addTrackId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addTrackId, (String)"<this>");
            this.addTraktId($this$addTrackId, id2);
        }

        @Deprecated(message="Outdated API due to missing capitalization", replaceWith=@ReplaceWith(expression="addKitsuId(id)", imports={}))
        public final void addkitsuId(@NotNull LoadResponse $this$addkitsuId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addkitsuId, (String)"<this>");
            this.addKitsuId($this$addkitsuId, id2);
        }

        public final void addTraktId(@NotNull LoadResponse $this$addTraktId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addTraktId, (String)"<this>");
        }

        public final void addKitsuId(@NotNull LoadResponse $this$addKitsuId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addKitsuId, (String)"<this>");
        }

        public final void addTMDbId(@NotNull LoadResponse $this$addTMDbId, @Nullable String id2) {
            Intrinsics.checkNotNullParameter((Object)$this$addTMDbId, (String)"<this>");
            this.addSimklId($this$addTMDbId, SimklSyncServices.Tmdb, id2);
        }

        public final void addScore(@NotNull LoadResponse $this$addScore, @Nullable String score2, int maxValue) {
            Intrinsics.checkNotNullParameter((Object)$this$addScore, (String)"<this>");
            $this$addScore.setScore(Score.Companion.from(score2, maxValue));
        }

        public static /* synthetic */ void addScore$default(Companion companion, LoadResponse loadResponse2, String string2, int n, int n2, Object object) {
            if ((n2 & 2) != 0) {
                n = 10;
            }
            companion.addScore(loadResponse2, string2, n);
        }

        public final void addScore(@NotNull LoadResponse $this$addScore, @Nullable Score score2) {
            Intrinsics.checkNotNullParameter((Object)$this$addScore, (String)"<this>");
            $this$addScore.setScore(score2);
        }

        public final void addRating(@NotNull LoadResponse $this$addRating, @Nullable String text) {
            Intrinsics.checkNotNullParameter((Object)$this$addRating, (String)"<this>");
            $this$addRating.setScore(Score.Companion.from10(text));
        }

        @Deprecated(message="Use addScore", replaceWith=@ReplaceWith(expression="addScore", imports={}))
        public final void addRating(@NotNull LoadResponse $this$addRating, @Nullable Integer value) {
            Intrinsics.checkNotNullParameter((Object)$this$addRating, (String)"<this>");
            $this$addRating.setScore(Score.Companion.fromOld(value));
        }

        public final void addDuration(@NotNull LoadResponse $this$addDuration, @Nullable String input) {
            Intrinsics.checkNotNullParameter((Object)$this$addDuration, (String)"<this>");
            Integer n = MainAPIKt.getDurationFromString(input);
            if (n == null) {
                n = $this$addDuration.getDuration();
            }
            $this$addDuration.setDuration(n);
        }

        private static final Unit addSimklId$lambda$3(LoadResponse $this_addSimklId, SimklSyncServices $database, String $id) {
            Map<String, String> map = $this_addSimklId.getSyncData();
            String string2 = simklIdPrefix;
            String string3 = $$INSTANCE.addIdToString($this_addSimklId.getSyncData().get(simklIdPrefix), $database, String.valueOf($id));
            if (string3 == null) {
                return Unit.INSTANCE;
            }
            String string4 = string3;
            map.put(string2, string4);
            return Unit.INSTANCE;
        }

        private static final String getImdbId$lambda$5(LoadResponse $this_getImdbId) {
            return $$INSTANCE.readIdFromString($this_getImdbId.getSyncData().get(simklIdPrefix)).get((Object)SimklSyncServices.Imdb);
        }

        private static final String getTMDbId$lambda$6(LoadResponse $this_getTMDbId) {
            return $$INSTANCE.readIdFromString($this_getTMDbId.getSyncData().get(simklIdPrefix)).get((Object)SimklSyncServices.Tmdb);
        }

        static {
            $$INSTANCE = new Companion();
            malIdPrefix = "";
            aniListIdPrefix = "";
            simklIdPrefix = "";
            isTrailersEnabled = true;
        }
    }

    @Metadata(mv={2, 1, 0}, k=3, xi=48)
    public static final class DefaultImpls {
        @Nullable
        public static Integer getRating(@NotNull LoadResponse $this) {
            Score score2 = $this.getScore();
            return score2 != null ? Integer.valueOf(score2.toOld()) : null;
        }

        public static void setRating(@NotNull LoadResponse $this, @Nullable Integer value) {
            $this.setScore(Score.Companion.fromOld(value));
        }

        @Deprecated(message="`rating` is the old scoring system, use score instead", replaceWith=@ReplaceWith(expression="score", imports={}))
        public static /* synthetic */ void getRating$annotations() {
        }
    }
}

