/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.ranges.RangesKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.ActorData;
import com.lagradost.cloudstream3.DubStatus;
import com.lagradost.cloudstream3.Episode;
import com.lagradost.cloudstream3.EpisodeResponse;
import com.lagradost.cloudstream3.LoadResponse;
import com.lagradost.cloudstream3.NextAiring;
import com.lagradost.cloudstream3.Score;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SeasonData;
import com.lagradost.cloudstream3.ShowStatus;
import com.lagradost.cloudstream3.TrailerData;
import com.lagradost.cloudstream3.TvType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00bd\u0002\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 \u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u00a2\u0006\u0004\b*\u0010+B\u00a7\u0002\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 \u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$\u0012\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b*\u0010-J\u0016\u0010o\u001a\u0010\u0012\u0004\u0012\u00020p\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\"H\u0016J\u0018\u0010q\u001a\u00020\u000e2\u0006\u0010r\u001a\u00020\u000e2\u0006\u0010s\u001a\u00020\u000eH\u0016J\t\u0010t\u001a\u00020\u0004H\u00c6\u0003J\t\u0010u\u001a\u00020\u0004H\u00c6\u0003J\t\u0010v\u001a\u00020\u0004H\u00c6\u0003J\t\u0010w\u001a\u00020\bH\u00c6\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0010\u0010z\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u000b\u0010{\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u0011\u0010~\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nH\u00c6\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010AJ\u0010\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u00c6\u0003J\u0012\u0010\u0081\u0001\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\nH\u00c6\u0003J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nH\u00c6\u0003J\n\u0010\u0083\u0001\u001a\u00020\u001eH\u00c6\u0003J\u0016\u0010\u0084\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 H\u00c6\u0003J\u0018\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"H\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010$H\u00c6\u0003J\u0012\u0010\u0087\u0001\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\nH\u00c6\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0004H\u00c6\u0003J\u00ce\u0002\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\n2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\n2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010)\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0003\u0010\u008c\u0001J\u0016\u0010\u008d\u0001\u001a\u00020\u001e2\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u008f\u0001H\u00d6\u0003J\n\u0010\u0090\u0001\u001a\u00020\u000eH\u00d6\u0001J\n\u0010\u0091\u0001\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0005\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010/\"\u0004\b3\u00101R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010/\"\u0004\b5\u00101R\u001a\u0010\u0007\u001a\u00020\bX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010/\"\u0004\b?\u00101R\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010/\"\u0004\bF\u00101R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010;\"\u0004\bP\u0010=R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010D\u001a\u0004\bQ\u0010A\"\u0004\bR\u0010CR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010;\"\u0004\bT\u0010=R\"\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010;\"\u0004\bV\u0010=R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010;\"\u0004\bX\u0010=R\u001a\u0010\u001d\u001a\u00020\u001eX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R&\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040 X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R(\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\"X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010^\"\u0004\bb\u0010`R\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010;\"\u0004\bh\u0010=R\u001c\u0010'\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010/\"\u0004\bj\u00101R\u001c\u0010(\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010/\"\u0004\bl\u00101R\u001a\u0010)\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010/\"\u0004\bn\u00101\u00a8\u0006\u0092\u0001"}, d2={"Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "Lcom/lagradost/cloudstream3/EpisodeResponse;", "name", "", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "episodes", "", "Lcom/lagradost/cloudstream3/Episode;", "posterUrl", "year", "", "plot", "showStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "score", "Lcom/lagradost/cloudstream3/Score;", "tags", "duration", "trailers", "", "Lcom/lagradost/cloudstream3/TrailerData;", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "", "posterHeaders", "", "nextAiring", "Lcom/lagradost/cloudstream3/NextAiring;", "seasonNames", "Lcom/lagradost/cloudstream3/SeasonData;", "backgroundPosterUrl", "contentRating", "uniqueUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/ShowStatus;Lcom/lagradost/cloudstream3/Score;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rating", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getApiName", "setApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getEpisodes", "()Ljava/util/List;", "setEpisodes", "(Ljava/util/List;)V", "getPosterUrl", "setPosterUrl", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getPlot", "setPlot", "getShowStatus", "()Lcom/lagradost/cloudstream3/ShowStatus;", "setShowStatus", "(Lcom/lagradost/cloudstream3/ShowStatus;)V", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "getTags", "setTags", "getDuration", "setDuration", "getTrailers", "setTrailers", "getRecommendations", "setRecommendations", "getActors", "setActors", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getSyncData", "()Ljava/util/Map;", "setSyncData", "(Ljava/util/Map;)V", "getPosterHeaders", "setPosterHeaders", "getNextAiring", "()Lcom/lagradost/cloudstream3/NextAiring;", "setNextAiring", "(Lcom/lagradost/cloudstream3/NextAiring;)V", "getSeasonNames", "setSeasonNames", "getBackgroundPosterUrl", "setBackgroundPosterUrl", "getContentRating", "setContentRating", "getUniqueUrl", "setUniqueUrl", "getLatestEpisodes", "Lcom/lagradost/cloudstream3/DubStatus;", "getTotalEpisodeIndex", "episode", "season", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/ShowStatus;Lcom/lagradost/cloudstream3/Score;Ljava/util/List;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "equals", "other", "", "hashCode", "toString", "library"})
@SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/TvSeriesLoadResponse\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2892:1\n1#2:2893\n774#3:2894\n865#3,2:2895\n1187#3,2:2897\n1261#3,4:2899\n1782#3,4:2903\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/TvSeriesLoadResponse\n*L\n2715#1:2894\n2715#1:2895,2\n2722#1:2897,2\n2722#1:2899,4\n2724#1:2903,4\n*E\n"})
public final class TvSeriesLoadResponse
implements LoadResponse,
EpisodeResponse {
    @NotNull
    private String name;
    @NotNull
    private String url;
    @NotNull
    private String apiName;
    @NotNull
    private TvType type;
    @NotNull
    private List<Episode> episodes;
    @Nullable
    private String posterUrl;
    @Nullable
    private Integer year;
    @Nullable
    private String plot;
    @Nullable
    private ShowStatus showStatus;
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
    private NextAiring nextAiring;
    @Nullable
    private List<SeasonData> seasonNames;
    @Nullable
    private String backgroundPosterUrl;
    @Nullable
    private String contentRating;
    @NotNull
    private String uniqueUrl;

    @Deprecated(message="Use newTvSeriesLoadResponse method", level=DeprecationLevel.ERROR)
    public TvSeriesLoadResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull List<Episode> episodes, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable ShowStatus showStatus, @Nullable Score score2, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.episodes = episodes;
        this.posterUrl = posterUrl;
        this.year = year;
        this.plot = plot;
        this.showStatus = showStatus;
        this.score = score2;
        this.tags = tags;
        this.duration = duration;
        this.trailers = trailers;
        this.recommendations = recommendations;
        this.actors = actors;
        this.comingSoon = comingSoon;
        this.syncData = syncData;
        this.posterHeaders = posterHeaders;
        this.nextAiring = nextAiring;
        this.seasonNames = seasonNames;
        this.backgroundPosterUrl = backgroundPosterUrl;
        this.contentRating = contentRating;
        this.uniqueUrl = uniqueUrl;
    }

    public /* synthetic */ TvSeriesLoadResponse(String string2, String string3, String string4, TvType tvType, List list2, String string5, Integer n, String string6, ShowStatus showStatus, Score score2, List list3, Integer n2, List list4, List list5, List list6, boolean bl, Map map, Map map2, NextAiring nextAiring, List list7, String string7, String string8, String string9, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 0x20) != 0) {
            string5 = null;
        }
        if ((n3 & 0x40) != 0) {
            n = null;
        }
        if ((n3 & 0x80) != 0) {
            string6 = null;
        }
        if ((n3 & 0x100) != 0) {
            showStatus = null;
        }
        if ((n3 & 0x200) != 0) {
            score2 = null;
        }
        if ((n3 & 0x400) != 0) {
            list3 = null;
        }
        if ((n3 & 0x800) != 0) {
            n2 = null;
        }
        if ((n3 & 0x1000) != 0) {
            list4 = new ArrayList();
        }
        if ((n3 & 0x2000) != 0) {
            list5 = null;
        }
        if ((n3 & 0x4000) != 0) {
            list6 = null;
        }
        if ((n3 & 0x8000) != 0) {
            bl = false;
        }
        if ((n3 & 0x10000) != 0) {
            map = new LinkedHashMap();
        }
        if ((n3 & 0x20000) != 0) {
            map2 = null;
        }
        if ((n3 & 0x40000) != 0) {
            nextAiring = null;
        }
        if ((n3 & 0x80000) != 0) {
            list7 = null;
        }
        if ((n3 & 0x100000) != 0) {
            string7 = null;
        }
        if ((n3 & 0x200000) != 0) {
            string8 = null;
        }
        if ((n3 & 0x400000) != 0) {
            string9 = string3;
        }
        this(string2, string3, string4, tvType, (List<Episode>)list2, string5, n, string6, showStatus, score2, (List<String>)list3, n2, (List<TrailerData>)list4, (List<? extends SearchResponse>)list5, (List<ActorData>)list6, bl, (Map<String, String>)map, (Map<String, String>)map2, nextAiring, (List<SeasonData>)list7, string7, string8, string9);
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
    public final List<Episode> getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(@NotNull List<Episode> list2) {
        Intrinsics.checkNotNullParameter(list2, (String)"<set-?>");
        this.episodes = list2;
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
    public ShowStatus getShowStatus() {
        return this.showStatus;
    }

    @Override
    public void setShowStatus(@Nullable ShowStatus showStatus) {
        this.showStatus = showStatus;
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
    public NextAiring getNextAiring() {
        return this.nextAiring;
    }

    @Override
    public void setNextAiring(@Nullable NextAiring nextAiring) {
        this.nextAiring = nextAiring;
    }

    @Override
    @Nullable
    public List<SeasonData> getSeasonNames() {
        return this.seasonNames;
    }

    @Override
    public void setSeasonNames(@Nullable List<SeasonData> list2) {
        this.seasonNames = list2;
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

    /*
     * WARNING - void declaration
     */
    @Override
    @NotNull
    public Map<DubStatus, Integer> getLatestEpisodes() {
        Object object;
        void $this$filterTo$iv$iv;
        Object object2;
        Iterator iterator = ((Iterable)this.episodes).iterator();
        if (!iterator.hasNext()) {
            object2 = null;
        } else {
            Object it = (Episode)iterator.next();
            boolean bl = false;
            Integer n = ((Episode)it).getSeason();
            it = n != null ? n : Integer.MIN_VALUE;
            while (iterator.hasNext()) {
                Object it22 = (Episode)iterator.next();
                $i$a$-maxOfOrNull-TvSeriesLoadResponse$getLatestEpisodes$maxSeason$1 = false;
                Integer n2 = ((Episode)it22).getSeason();
                it22 = n2 != null ? n2 : Integer.MIN_VALUE;
                if (it.compareTo(it22) >= 0) continue;
                it = it22;
            }
            object2 = it;
        }
        Object object3 = object2;
        Integer it = (Integer)object3;
        boolean bl = false;
        Integer n = it;
        int it22 = Integer.MIN_VALUE;
        Integer maxSeason = (Integer)(!(n != null && n == it22) ? object3 : null);
        Iterable $this$filter$iv = this.episodes;
        boolean $i$f$filter22 = false;
        Object it22 = $this$filter$iv;
        Collection destination$iv$iv = new ArrayList();
        boolean $i$f$filterTo = false;
        for (Object element$iv$iv : $this$filterTo$iv$iv) {
            Episode it3 = (Episode)element$iv$iv;
            boolean bl2 = false;
            if (!Intrinsics.areEqual((Object)it3.getSeason(), (Object)maxSeason)) continue;
            destination$iv$iv.add(element$iv$iv);
        }
        Iterator $i$f$filter22 = ((Iterable)((List)destination$iv$iv)).iterator();
        if (!$i$f$filter22.hasNext()) {
            object = null;
        } else {
            it22 = (Episode)$i$f$filter22.next();
            boolean bl3 = false;
            Integer n3 = ((Episode)it22).getEpisode();
            it22 = n3 != null ? n3 : Integer.MIN_VALUE;
            while ($i$f$filter22.hasNext()) {
                Episode it4 = (Episode)$i$f$filter22.next();
                $i$a$-maxOfOrNull-TvSeriesLoadResponse$getLatestEpisodes$max$2 = false;
                Integer n4 = it4.getEpisode();
                Comparable comparable = Integer.valueOf(n4 != null ? n4 : Integer.MIN_VALUE);
                if (it22.compareTo(comparable) >= 0) continue;
                it22 = comparable;
            }
            object = it22;
        }
        iterator = object;
        Integer it5 = (Integer)((Object)iterator);
        boolean bl4 = false;
        Integer n5 = it5;
        int n6 = Integer.MIN_VALUE;
        Integer max = (Integer)((Object)(!(n5 != null && n5 == n6) ? iterator : null));
        return MapsKt.mapOf((Pair)TuplesKt.to((Object)((Object)DubStatus.None), (Object)max));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int getTotalEpisodeIndex(int episode, int season) {
        int n;
        Map map;
        List<SeasonData> list2 = this.getSeasonNames();
        if (list2 != null) {
            void $this$associateTo$iv$iv;
            Iterable $this$associate$iv = list2;
            boolean $i$f$associate = false;
            int capacity$iv = RangesKt.coerceAtLeast((int)MapsKt.mapCapacity((int)CollectionsKt.collectionSizeOrDefault((Iterable)$this$associate$iv, (int)10)), (int)16);
            Iterable iterable = $this$associate$iv;
            Map destination$iv$iv = new LinkedHashMap(capacity$iv);
            boolean $i$f$associateTo = false;
            for (Object element$iv$iv : $this$associateTo$iv$iv) {
                Map map2 = destination$iv$iv;
                SeasonData it = (SeasonData)element$iv$iv;
                boolean bl = false;
                Pair pair = TuplesKt.to((Object)it.getSeason(), (Object)it.getDisplaySeason());
                map2.put(pair.getFirst(), pair.getSecond());
            }
            map = destination$iv$iv;
        } else {
            map = MapsKt.emptyMap();
        }
        Map displayMap = map;
        Iterable $this$count$iv = this.episodes;
        boolean $i$f$count = false;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        } else {
            int count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                int episodeSeason;
                int n2;
                Episode episodeData = (Episode)element$iv;
                boolean bl = false;
                Integer n3 = (Integer)displayMap.get(episodeData.getSeason());
                if (n3 != null) {
                    n2 = n3;
                } else {
                    Integer n4 = episodeData.getSeason();
                    n2 = episodeSeason = n4 != null ? n4 : Integer.MIN_VALUE;
                }
                boolean bl2 = 1 <= episodeSeason ? episodeSeason < season : false;
                if (!bl2 || ++count$iv >= 0) continue;
                CollectionsKt.throwCountOverflow();
            }
            n = count$iv;
        }
        return n + episode;
    }

    @Deprecated(message="Use newTvSeriesLoadResponse method with contentRating included", level=DeprecationLevel.ERROR)
    public TvSeriesLoadResponse(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull List<Episode> episodes, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable ShowStatus showStatus, @Nullable Integer rating, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        this(name, url, apiName, type, episodes, posterUrl, year, plot, showStatus, Score.Companion.fromOld(rating), tags, duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, nextAiring, seasonNames, backgroundPosterUrl, null, null, 0x400000, null);
    }

    public /* synthetic */ TvSeriesLoadResponse(String string2, String string3, String string4, TvType tvType, List list2, String string5, Integer n, String string6, ShowStatus showStatus, Integer n2, List list3, Integer n3, List list4, List list5, List list6, boolean bl, Map map, Map map2, NextAiring nextAiring, List list7, String string7, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 0x20) != 0) {
            string5 = null;
        }
        if ((n4 & 0x40) != 0) {
            n = null;
        }
        if ((n4 & 0x80) != 0) {
            string6 = null;
        }
        if ((n4 & 0x100) != 0) {
            showStatus = null;
        }
        if ((n4 & 0x200) != 0) {
            n2 = null;
        }
        if ((n4 & 0x400) != 0) {
            list3 = null;
        }
        if ((n4 & 0x800) != 0) {
            n3 = null;
        }
        if ((n4 & 0x1000) != 0) {
            list4 = new ArrayList();
        }
        if ((n4 & 0x2000) != 0) {
            list5 = null;
        }
        if ((n4 & 0x4000) != 0) {
            list6 = null;
        }
        if ((n4 & 0x8000) != 0) {
            bl = false;
        }
        if ((n4 & 0x10000) != 0) {
            map = new LinkedHashMap();
        }
        if ((n4 & 0x20000) != 0) {
            map2 = null;
        }
        if ((n4 & 0x40000) != 0) {
            nextAiring = null;
        }
        if ((n4 & 0x80000) != 0) {
            list7 = null;
        }
        if ((n4 & 0x100000) != 0) {
            string7 = null;
        }
        this(string2, string3, string4, tvType, list2, string5, n, string6, showStatus, n2, list3, n3, list4, list5, list6, bl, map, map2, nextAiring, list7, string7);
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
    public final List<Episode> component5() {
        return this.episodes;
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
    public final ShowStatus component9() {
        return this.showStatus;
    }

    @Nullable
    public final Score component10() {
        return this.score;
    }

    @Nullable
    public final List<String> component11() {
        return this.tags;
    }

    @Nullable
    public final Integer component12() {
        return this.duration;
    }

    @NotNull
    public final List<TrailerData> component13() {
        return this.trailers;
    }

    @Nullable
    public final List<SearchResponse> component14() {
        return this.recommendations;
    }

    @Nullable
    public final List<ActorData> component15() {
        return this.actors;
    }

    public final boolean component16() {
        return this.comingSoon;
    }

    @NotNull
    public final Map<String, String> component17() {
        return this.syncData;
    }

    @Nullable
    public final Map<String, String> component18() {
        return this.posterHeaders;
    }

    @Nullable
    public final NextAiring component19() {
        return this.nextAiring;
    }

    @Nullable
    public final List<SeasonData> component20() {
        return this.seasonNames;
    }

    @Nullable
    public final String component21() {
        return this.backgroundPosterUrl;
    }

    @Nullable
    public final String component22() {
        return this.contentRating;
    }

    @NotNull
    public final String component23() {
        return this.uniqueUrl;
    }

    @NotNull
    public final TvSeriesLoadResponse copy(@NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @NotNull List<Episode> episodes, @Nullable String posterUrl, @Nullable Integer year, @Nullable String plot, @Nullable ShowStatus showStatus, @Nullable Score score2, @Nullable List<String> tags, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        return new TvSeriesLoadResponse(name, url, apiName, type, episodes, posterUrl, year, plot, showStatus, score2, tags, duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, nextAiring, seasonNames, backgroundPosterUrl, contentRating, uniqueUrl);
    }

    public static /* synthetic */ TvSeriesLoadResponse copy$default(TvSeriesLoadResponse tvSeriesLoadResponse, String string2, String string3, String string4, TvType tvType, List list2, String string5, Integer n, String string6, ShowStatus showStatus, Score score2, List list3, Integer n2, List list4, List list5, List list6, boolean bl, Map map, Map map2, NextAiring nextAiring, List list7, String string7, String string8, String string9, int n3, Object object) {
        if ((n3 & 1) != 0) {
            string2 = tvSeriesLoadResponse.name;
        }
        if ((n3 & 2) != 0) {
            string3 = tvSeriesLoadResponse.url;
        }
        if ((n3 & 4) != 0) {
            string4 = tvSeriesLoadResponse.apiName;
        }
        if ((n3 & 8) != 0) {
            tvType = tvSeriesLoadResponse.type;
        }
        if ((n3 & 0x10) != 0) {
            list2 = tvSeriesLoadResponse.episodes;
        }
        if ((n3 & 0x20) != 0) {
            string5 = tvSeriesLoadResponse.posterUrl;
        }
        if ((n3 & 0x40) != 0) {
            n = tvSeriesLoadResponse.year;
        }
        if ((n3 & 0x80) != 0) {
            string6 = tvSeriesLoadResponse.plot;
        }
        if ((n3 & 0x100) != 0) {
            showStatus = tvSeriesLoadResponse.showStatus;
        }
        if ((n3 & 0x200) != 0) {
            score2 = tvSeriesLoadResponse.score;
        }
        if ((n3 & 0x400) != 0) {
            list3 = tvSeriesLoadResponse.tags;
        }
        if ((n3 & 0x800) != 0) {
            n2 = tvSeriesLoadResponse.duration;
        }
        if ((n3 & 0x1000) != 0) {
            list4 = tvSeriesLoadResponse.trailers;
        }
        if ((n3 & 0x2000) != 0) {
            list5 = tvSeriesLoadResponse.recommendations;
        }
        if ((n3 & 0x4000) != 0) {
            list6 = tvSeriesLoadResponse.actors;
        }
        if ((n3 & 0x8000) != 0) {
            bl = tvSeriesLoadResponse.comingSoon;
        }
        if ((n3 & 0x10000) != 0) {
            map = tvSeriesLoadResponse.syncData;
        }
        if ((n3 & 0x20000) != 0) {
            map2 = tvSeriesLoadResponse.posterHeaders;
        }
        if ((n3 & 0x40000) != 0) {
            nextAiring = tvSeriesLoadResponse.nextAiring;
        }
        if ((n3 & 0x80000) != 0) {
            list7 = tvSeriesLoadResponse.seasonNames;
        }
        if ((n3 & 0x100000) != 0) {
            string7 = tvSeriesLoadResponse.backgroundPosterUrl;
        }
        if ((n3 & 0x200000) != 0) {
            string8 = tvSeriesLoadResponse.contentRating;
        }
        if ((n3 & 0x400000) != 0) {
            string9 = tvSeriesLoadResponse.uniqueUrl;
        }
        return tvSeriesLoadResponse.copy(string2, string3, string4, tvType, list2, string5, n, string6, showStatus, score2, list3, n2, list4, list5, list6, bl, map, map2, nextAiring, list7, string7, string8, string9);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("TvSeriesLoadResponse(name=").append(this.name).append(", url=").append(this.url).append(", apiName=").append(this.apiName).append(", type=").append((Object)this.type).append(", episodes=").append(this.episodes).append(", posterUrl=").append(this.posterUrl).append(", year=").append(this.year).append(", plot=").append(this.plot).append(", showStatus=").append((Object)this.showStatus).append(", score=").append(this.score).append(", tags=").append(this.tags).append(", duration=");
        stringBuilder.append(this.duration).append(", trailers=").append(this.trailers).append(", recommendations=").append(this.recommendations).append(", actors=").append(this.actors).append(", comingSoon=").append(this.comingSoon).append(", syncData=").append(this.syncData).append(", posterHeaders=").append(this.posterHeaders).append(", nextAiring=").append(this.nextAiring).append(", seasonNames=").append(this.seasonNames).append(", backgroundPosterUrl=").append(this.backgroundPosterUrl).append(", contentRating=").append(this.contentRating).append(", uniqueUrl=").append(this.uniqueUrl);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + this.type.hashCode();
        result2 = result2 * 31 + ((Object)this.episodes).hashCode();
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.year == null ? 0 : ((Object)this.year).hashCode());
        result2 = result2 * 31 + (this.plot == null ? 0 : this.plot.hashCode());
        result2 = result2 * 31 + (this.showStatus == null ? 0 : this.showStatus.hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
        result2 = result2 * 31 + (this.tags == null ? 0 : ((Object)this.tags).hashCode());
        result2 = result2 * 31 + (this.duration == null ? 0 : ((Object)this.duration).hashCode());
        result2 = result2 * 31 + ((Object)this.trailers).hashCode();
        result2 = result2 * 31 + (this.recommendations == null ? 0 : ((Object)this.recommendations).hashCode());
        result2 = result2 * 31 + (this.actors == null ? 0 : ((Object)this.actors).hashCode());
        result2 = result2 * 31 + Boolean.hashCode(this.comingSoon);
        result2 = result2 * 31 + ((Object)this.syncData).hashCode();
        result2 = result2 * 31 + (this.posterHeaders == null ? 0 : ((Object)this.posterHeaders).hashCode());
        result2 = result2 * 31 + (this.nextAiring == null ? 0 : this.nextAiring.hashCode());
        result2 = result2 * 31 + (this.seasonNames == null ? 0 : ((Object)this.seasonNames).hashCode());
        result2 = result2 * 31 + (this.backgroundPosterUrl == null ? 0 : this.backgroundPosterUrl.hashCode());
        result2 = result2 * 31 + (this.contentRating == null ? 0 : this.contentRating.hashCode());
        result2 = result2 * 31 + this.uniqueUrl.hashCode();
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TvSeriesLoadResponse)) {
            return false;
        }
        TvSeriesLoadResponse tvSeriesLoadResponse = (TvSeriesLoadResponse)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)tvSeriesLoadResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)tvSeriesLoadResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)tvSeriesLoadResponse.apiName)) {
            return false;
        }
        if (this.type != tvSeriesLoadResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual(this.episodes, tvSeriesLoadResponse.episodes)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)tvSeriesLoadResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.year, (Object)tvSeriesLoadResponse.year)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.plot, (Object)tvSeriesLoadResponse.plot)) {
            return false;
        }
        if (this.showStatus != tvSeriesLoadResponse.showStatus) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.score, (Object)tvSeriesLoadResponse.score)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tags, tvSeriesLoadResponse.tags)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.duration, (Object)tvSeriesLoadResponse.duration)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.trailers, tvSeriesLoadResponse.trailers)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.recommendations, tvSeriesLoadResponse.recommendations)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.actors, tvSeriesLoadResponse.actors)) {
            return false;
        }
        if (this.comingSoon != tvSeriesLoadResponse.comingSoon) {
            return false;
        }
        if (!Intrinsics.areEqual(this.syncData, tvSeriesLoadResponse.syncData)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, tvSeriesLoadResponse.posterHeaders)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.nextAiring, (Object)tvSeriesLoadResponse.nextAiring)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.seasonNames, tvSeriesLoadResponse.seasonNames)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.backgroundPosterUrl, (Object)tvSeriesLoadResponse.backgroundPosterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.contentRating, (Object)tvSeriesLoadResponse.contentRating)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.uniqueUrl, (Object)tvSeriesLoadResponse.uniqueUrl);
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

