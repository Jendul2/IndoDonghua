/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
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
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bp\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B\u00f5\u0002\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0004\u00a2\u0006\u0004\b.\u0010/B\u00df\u0002\b\u0017\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c\u0012\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0011\u0012\b\b\u0002\u0010\"\u001a\u00020#\u0012\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f\u0012\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010&\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(\u0012\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0011\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\b.\u00101J\u0016\u0010y\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0006\u0012\u0004\u0018\u00010\r0&H\u0016J\u0018\u0010z\u001a\u00020\r2\u0006\u0010{\u001a\u00020\r2\u0006\u0010|\u001a\u00020\rH\u0016J\u000b\u0010}\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\t\u0010\u007f\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u0080\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0004H\u00c6\u0003J\n\u0010\u0082\u0001\u001a\u00020\nH\u00c6\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0011\u0010\u0084\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u001c\u0010\u0085\u0001\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fH\u00c6\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011H\u00c6\u0003J\u0012\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011H\u00c6\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u0011\u0010\u008b\u0001\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010EJ\u0010\u0010\u008c\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u00c6\u0003J\u0012\u0010\u008d\u0001\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011H\u00c6\u0003J\u0012\u0010\u008e\u0001\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0011H\u00c6\u0003J\n\u0010\u008f\u0001\u001a\u00020#H\u00c6\u0003J\u0016\u0010\u0090\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fH\u00c6\u0003J\u0018\u0010\u0091\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010&H\u00c6\u0003J\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010(H\u00c6\u0003J\u0012\u0010\u0093\u0001\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0011H\u00c6\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0004H\u00c6\u0003J\u0084\u0003\u0010\u0097\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00112\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u00112\b\b\u0002\u0010\"\u001a\u00020#2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000f2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\u0010\b\u0002\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u00112\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010-\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0098\u0001J\u0016\u0010\u0099\u0001\u001a\u00020#2\n\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u009b\u0001H\u00d6\u0003J\n\u0010\u009c\u0001\u001a\u00020\rH\u00d6\u0001J\n\u0010\u009d\u0001\u001a\u00020\u0004H\u00d6\u0001R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010\u0006\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00103\"\u0004\b9\u00105R\u001a\u0010\u0007\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b:\u00103\"\u0004\b;\u00105R\u001a\u0010\b\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u00103\"\u0004\b=\u00105R\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u00103\"\u0004\bC\u00105R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR,\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bQ\u00103\"\u0004\bR\u00105R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bW\u0010T\"\u0004\bX\u0010VR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0096\u000e\u00a2\u0006\u0010\n\u0002\u0010H\u001a\u0004\b]\u0010E\"\u0004\b^\u0010GR \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b_\u0010T\"\u0004\b`\u0010VR\"\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010T\"\u0004\bb\u0010VR\"\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bc\u0010T\"\u0004\bd\u0010VR\u001a\u0010\"\u001a\u00020#X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bi\u0010J\"\u0004\bj\u0010LR(\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010&X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bk\u0010J\"\u0004\bl\u0010LR\u001c\u0010'\u001a\u0004\u0018\u00010(X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010)\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010\u0011X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bq\u0010T\"\u0004\br\u0010VR\u001c\u0010+\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u00103\"\u0004\bt\u00105R\u001c\u0010,\u001a\u0004\u0018\u00010\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bu\u00103\"\u0004\bv\u00105R\u001a\u0010-\u001a\u00020\u0004X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bw\u00103\"\u0004\bx\u00105\u00a8\u0006\u009e\u0001"}, d2={"Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "Lcom/lagradost/cloudstream3/LoadResponse;", "Lcom/lagradost/cloudstream3/EpisodeResponse;", "engName", "", "japName", "name", "url", "apiName", "type", "Lcom/lagradost/cloudstream3/TvType;", "posterUrl", "year", "", "episodes", "", "Lcom/lagradost/cloudstream3/DubStatus;", "", "Lcom/lagradost/cloudstream3/Episode;", "showStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "plot", "tags", "synonyms", "score", "Lcom/lagradost/cloudstream3/Score;", "duration", "trailers", "", "Lcom/lagradost/cloudstream3/TrailerData;", "recommendations", "Lcom/lagradost/cloudstream3/SearchResponse;", "actors", "Lcom/lagradost/cloudstream3/ActorData;", "comingSoon", "", "syncData", "posterHeaders", "", "nextAiring", "Lcom/lagradost/cloudstream3/NextAiring;", "seasonNames", "Lcom/lagradost/cloudstream3/SeasonData;", "backgroundPosterUrl", "contentRating", "uniqueUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/lagradost/cloudstream3/Score;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "rating", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;)V", "getEngName", "()Ljava/lang/String;", "setEngName", "(Ljava/lang/String;)V", "getJapName", "setJapName", "getName", "setName", "getUrl", "setUrl", "getApiName", "setApiName", "getType", "()Lcom/lagradost/cloudstream3/TvType;", "setType", "(Lcom/lagradost/cloudstream3/TvType;)V", "getPosterUrl", "setPosterUrl", "getYear", "()Ljava/lang/Integer;", "setYear", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEpisodes", "()Ljava/util/Map;", "setEpisodes", "(Ljava/util/Map;)V", "getShowStatus", "()Lcom/lagradost/cloudstream3/ShowStatus;", "setShowStatus", "(Lcom/lagradost/cloudstream3/ShowStatus;)V", "getPlot", "setPlot", "getTags", "()Ljava/util/List;", "setTags", "(Ljava/util/List;)V", "getSynonyms", "setSynonyms", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "getDuration", "setDuration", "getTrailers", "setTrailers", "getRecommendations", "setRecommendations", "getActors", "setActors", "getComingSoon", "()Z", "setComingSoon", "(Z)V", "getSyncData", "setSyncData", "getPosterHeaders", "setPosterHeaders", "getNextAiring", "()Lcom/lagradost/cloudstream3/NextAiring;", "setNextAiring", "(Lcom/lagradost/cloudstream3/NextAiring;)V", "getSeasonNames", "setSeasonNames", "getBackgroundPosterUrl", "setBackgroundPosterUrl", "getContentRating", "setContentRating", "getUniqueUrl", "setUniqueUrl", "getLatestEpisodes", "getTotalEpisodeIndex", "episode", "season", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;Lcom/lagradost/cloudstream3/ShowStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/lagradost/cloudstream3/Score;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZLjava/util/Map;Ljava/util/Map;Lcom/lagradost/cloudstream3/NextAiring;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "equals", "other", "", "hashCode", "toString", "library"})
@SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/AnimeLoadResponse\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2892:1\n126#2:2893\n153#2,2:2894\n155#2:2900\n1#3:2896\n774#4:2897\n865#4,2:2898\n1187#4,2:2901\n1261#4,4:2903\n1782#4,4:2907\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/AnimeLoadResponse\n*L\n2221#1:2893\n2221#1:2894,2\n2221#1:2900\n2225#1:2897\n2225#1:2898,2\n2232#1:2901,2\n2232#1:2903,4\n2235#1:2907,4\n*E\n"})
public final class AnimeLoadResponse
implements LoadResponse,
EpisodeResponse {
    @Nullable
    private String engName;
    @Nullable
    private String japName;
    @NotNull
    private String name;
    @NotNull
    private String url;
    @NotNull
    private String apiName;
    @NotNull
    private TvType type;
    @Nullable
    private String posterUrl;
    @Nullable
    private Integer year;
    @NotNull
    private Map<DubStatus, List<Episode>> episodes;
    @Nullable
    private ShowStatus showStatus;
    @Nullable
    private String plot;
    @Nullable
    private List<String> tags;
    @Nullable
    private List<String> synonyms;
    @Nullable
    private Score score;
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

    @Deprecated(message="Use newAnimeLoadResponse method", level=DeprecationLevel.ERROR)
    public AnimeLoadResponse(@Nullable String engName, @Nullable String japName, @NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @Nullable String posterUrl, @Nullable Integer year, @NotNull Map<DubStatus, List<Episode>> episodes, @Nullable ShowStatus showStatus, @Nullable String plot, @Nullable List<String> tags, @Nullable List<String> synonyms, @Nullable Score score2, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        this.engName = engName;
        this.japName = japName;
        this.name = name;
        this.url = url;
        this.apiName = apiName;
        this.type = type;
        this.posterUrl = posterUrl;
        this.year = year;
        this.episodes = episodes;
        this.showStatus = showStatus;
        this.plot = plot;
        this.tags = tags;
        this.synonyms = synonyms;
        this.score = score2;
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

    public /* synthetic */ AnimeLoadResponse(String string2, String string3, String string4, String string5, String string6, TvType tvType, String string7, Integer n, Map map, ShowStatus showStatus, String string8, List list2, List list3, Score score2, Integer n2, List list4, List list5, List list6, boolean bl, Map map2, Map map3, NextAiring nextAiring, List list7, String string9, String string10, String string11, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 1) != 0) {
            string2 = null;
        }
        if ((n3 & 2) != 0) {
            string3 = null;
        }
        if ((n3 & 0x40) != 0) {
            string7 = null;
        }
        if ((n3 & 0x80) != 0) {
            n = null;
        }
        if ((n3 & 0x100) != 0) {
            map = new LinkedHashMap();
        }
        if ((n3 & 0x200) != 0) {
            showStatus = null;
        }
        if ((n3 & 0x400) != 0) {
            string8 = null;
        }
        if ((n3 & 0x800) != 0) {
            list2 = null;
        }
        if ((n3 & 0x1000) != 0) {
            list3 = null;
        }
        if ((n3 & 0x2000) != 0) {
            score2 = null;
        }
        if ((n3 & 0x4000) != 0) {
            n2 = null;
        }
        if ((n3 & 0x8000) != 0) {
            list4 = new ArrayList();
        }
        if ((n3 & 0x10000) != 0) {
            list5 = null;
        }
        if ((n3 & 0x20000) != 0) {
            list6 = null;
        }
        if ((n3 & 0x40000) != 0) {
            bl = false;
        }
        if ((n3 & 0x80000) != 0) {
            map2 = new LinkedHashMap();
        }
        if ((n3 & 0x100000) != 0) {
            map3 = null;
        }
        if ((n3 & 0x200000) != 0) {
            nextAiring = null;
        }
        if ((n3 & 0x400000) != 0) {
            list7 = null;
        }
        if ((n3 & 0x800000) != 0) {
            string9 = null;
        }
        if ((n3 & 0x1000000) != 0) {
            string10 = null;
        }
        if ((n3 & 0x2000000) != 0) {
            string11 = string5;
        }
        this(string2, string3, string4, string5, string6, tvType, string7, n, (Map<DubStatus, List<Episode>>)map, showStatus, string8, (List<String>)list2, (List<String>)list3, score2, n2, (List<TrailerData>)list4, (List<? extends SearchResponse>)list5, (List<ActorData>)list6, bl, (Map<String, String>)map2, (Map<String, String>)map3, nextAiring, (List<SeasonData>)list7, string9, string10, string11);
    }

    @Nullable
    public final String getEngName() {
        return this.engName;
    }

    public final void setEngName(@Nullable String string2) {
        this.engName = string2;
    }

    @Nullable
    public final String getJapName() {
        return this.japName;
    }

    public final void setJapName(@Nullable String string2) {
        this.japName = string2;
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

    @NotNull
    public final Map<DubStatus, List<Episode>> getEpisodes() {
        return this.episodes;
    }

    public final void setEpisodes(@NotNull Map<DubStatus, List<Episode>> map) {
        Intrinsics.checkNotNullParameter(map, (String)"<set-?>");
        this.episodes = map;
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
    public String getPlot() {
        return this.plot;
    }

    @Override
    public void setPlot(@Nullable String string2) {
        this.plot = string2;
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

    @Nullable
    public final List<String> getSynonyms() {
        return this.synonyms;
    }

    public final void setSynonyms(@Nullable List<String> list2) {
        this.synonyms = list2;
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
        void $this$mapTo$iv$iv;
        Map<DubStatus, List<Episode>> $this$map$iv = this.episodes;
        boolean $i$f$map = false;
        Map<DubStatus, List<Episode>> map = $this$map$iv;
        Collection destination$iv$iv = new ArrayList($this$map$iv.size());
        boolean $i$f$mapTo = false;
        Iterator iterator = $this$mapTo$iv$iv.entrySet().iterator();
        while (iterator.hasNext()) {
            Object object;
            void $this$filterTo$iv$iv;
            void $this$filter$iv;
            Object object2;
            Map.Entry item$iv$iv;
            Map.Entry entry = item$iv$iv = iterator.next();
            Collection collection = destination$iv$iv;
            boolean bl = false;
            DubStatus status = (DubStatus)((Object)entry.getKey());
            List episodes = (List)entry.getValue();
            Iterator iterator2 = ((Iterable)episodes).iterator();
            if (!iterator2.hasNext()) {
                object2 = null;
            } else {
                Object it = (Episode)iterator2.next();
                boolean bl2 = false;
                Integer n = ((Episode)it).getSeason();
                it = n != null ? n : Integer.MIN_VALUE;
                while (iterator2.hasNext()) {
                    Object it2 = (Episode)iterator2.next();
                    $i$a$-maxOfOrNull-AnimeLoadResponse$getLatestEpisodes$1$maxSeason$1 = false;
                    Integer n2 = ((Episode)it2).getSeason();
                    it2 = n2 != null ? n2 : Integer.MIN_VALUE;
                    if (it.compareTo(it2) >= 0) continue;
                    it = it2;
                }
                object2 = it;
            }
            Object object3 = object2;
            Integer it = (Integer)object3;
            boolean $i$a$-takeUnless-AnimeLoadResponse$getLatestEpisodes$1$maxSeason$32 = false;
            Integer n = it;
            int it2 = Integer.MIN_VALUE;
            Integer maxSeason = (Integer)(!(n != null && n == it2) ? object3 : null);
            object3 = episodes;
            DubStatus dubStatus = status;
            boolean $i$f$filter22 = false;
            void $i$a$-takeUnless-AnimeLoadResponse$getLatestEpisodes$1$maxSeason$32 = $this$filter$iv;
            Collection destination$iv$iv2 = new ArrayList();
            boolean $i$f$filterTo = false;
            for (Object element$iv$iv : $this$filterTo$iv$iv) {
                Episode it3 = (Episode)element$iv$iv;
                boolean bl3 = false;
                if (!Intrinsics.areEqual((Object)it3.getSeason(), (Object)maxSeason)) continue;
                destination$iv$iv2.add(element$iv$iv);
            }
            object3 = (List)destination$iv$iv2;
            Iterator $i$f$filter22 = object3.iterator();
            if (!$i$f$filter22.hasNext()) {
                object = null;
            } else {
                Object it4 = (Episode)$i$f$filter22.next();
                boolean bl4 = false;
                Integer n3 = ((Episode)it4).getEpisode();
                it4 = n3 != null ? n3 : Integer.MIN_VALUE;
                while ($i$f$filter22.hasNext()) {
                    Episode it5 = (Episode)$i$f$filter22.next();
                    $i$a$-maxOfOrNull-AnimeLoadResponse$getLatestEpisodes$1$2 = false;
                    Integer n4 = it5.getEpisode();
                    Comparable comparable = Integer.valueOf(n4 != null ? n4 : Integer.MIN_VALUE);
                    if (it4.compareTo(comparable) >= 0) continue;
                    it4 = comparable;
                }
                object = it4;
            }
            object3 = object;
            $i$f$filter22 = (Integer)object3;
            boolean bl5 = false;
            Integer n5 = it;
            int n6 = Integer.MIN_VALUE;
            collection.add(TuplesKt.to((Object)((Object)dubStatus), (Object)(!Boolean.valueOf(n5 != null && n5 == n6).booleanValue() ? object3 : null)));
        }
        return MapsKt.toMap((Iterable)((List)destination$iv$iv));
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
                it = TuplesKt.to((Object)it.getSeason(), (Object)it.getDisplaySeason());
                map2.put(it.getFirst(), it.getSecond());
            }
            map = destination$iv$iv;
        } else {
            map = MapsKt.emptyMap();
        }
        Map displayMap = map;
        Iterator iterator = ((Iterable)this.episodes.entrySet()).iterator();
        if (!iterator.hasNext()) {
            throw new NoSuchElementException();
        }
        Map.Entry entry = (Map.Entry)iterator.next();
        boolean bl = false;
        List episodes = (List)entry.getValue();
        Iterable $this$count$iv = episodes;
        boolean $i$f$count = false;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        } else {
            int count$iv = 0;
            for (Object element$iv : $this$count$iv) {
                int episodeSeason;
                int n2;
                Episode episodeData = (Episode)element$iv;
                boolean bl2 = false;
                Integer n3 = (Integer)displayMap.get(episodeData.getSeason());
                if (n3 != null) {
                    n2 = n3;
                } else {
                    Integer n4 = episodeData.getSeason();
                    n2 = episodeSeason = n4 != null ? n4 : Integer.MIN_VALUE;
                }
                boolean bl3 = 1 <= episodeSeason ? episodeSeason < season : false;
                if (!bl3 || ++count$iv >= 0) continue;
                CollectionsKt.throwCountOverflow();
            }
            n = count$iv;
        }
        int n5 = n;
        while (iterator.hasNext()) {
            int n6;
            int n7;
            Map.Entry entry2 = (Map.Entry)iterator.next();
            $i$a$-maxOf-AnimeLoadResponse$getTotalEpisodeIndex$1 = false;
            List episodes2 = (List)entry2.getValue();
            Iterable $this$count$iv2 = episodes2;
            boolean $i$f$count2 = false;
            if ($this$count$iv2 instanceof Collection && ((Collection)$this$count$iv2).isEmpty()) {
                n7 = 0;
            } else {
                int count$iv = 0;
                for (Object element$iv : $this$count$iv2) {
                    int episodeSeason;
                    int n8;
                    Episode episodeData = (Episode)element$iv;
                    boolean bl4 = false;
                    Integer n9 = (Integer)displayMap.get(episodeData.getSeason());
                    if (n9 != null) {
                        n8 = n9;
                    } else {
                        Integer n10 = episodeData.getSeason();
                        n8 = episodeSeason = n10 != null ? n10 : Integer.MIN_VALUE;
                    }
                    boolean bl5 = 1 <= episodeSeason ? episodeSeason < season : false;
                    if (!bl5 || ++count$iv >= 0) continue;
                    CollectionsKt.throwCountOverflow();
                }
                n7 = count$iv;
            }
            if (n5 >= (n6 = n7)) continue;
            n5 = n6;
        }
        return n5 + episode;
    }

    @Deprecated(message="Use newAnimeLoadResponse method with contentRating included", level=DeprecationLevel.ERROR)
    public AnimeLoadResponse(@Nullable String engName, @Nullable String japName, @NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @Nullable String posterUrl, @Nullable Integer year, @NotNull Map<DubStatus, List<Episode>> episodes, @Nullable ShowStatus showStatus, @Nullable String plot, @Nullable List<String> tags, @Nullable List<String> synonyms, @Nullable Integer rating, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        this(engName, japName, name, url, apiName, type, posterUrl, year, episodes, showStatus, plot, tags, synonyms, Score.Companion.fromOld(rating), duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, nextAiring, seasonNames, backgroundPosterUrl, null, null, 0x2000000, null);
    }

    public /* synthetic */ AnimeLoadResponse(String string2, String string3, String string4, String string5, String string6, TvType tvType, String string7, Integer n, Map map, ShowStatus showStatus, String string8, List list2, List list3, Integer n2, Integer n3, List list4, List list5, List list6, boolean bl, Map map2, Map map3, NextAiring nextAiring, List list7, String string9, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 1) != 0) {
            string2 = null;
        }
        if ((n4 & 2) != 0) {
            string3 = null;
        }
        if ((n4 & 0x40) != 0) {
            string7 = null;
        }
        if ((n4 & 0x80) != 0) {
            n = null;
        }
        if ((n4 & 0x100) != 0) {
            map = new LinkedHashMap();
        }
        if ((n4 & 0x200) != 0) {
            showStatus = null;
        }
        if ((n4 & 0x400) != 0) {
            string8 = null;
        }
        if ((n4 & 0x800) != 0) {
            list2 = null;
        }
        if ((n4 & 0x1000) != 0) {
            list3 = null;
        }
        if ((n4 & 0x2000) != 0) {
            n2 = null;
        }
        if ((n4 & 0x4000) != 0) {
            n3 = null;
        }
        if ((n4 & 0x8000) != 0) {
            list4 = new ArrayList();
        }
        if ((n4 & 0x10000) != 0) {
            list5 = null;
        }
        if ((n4 & 0x20000) != 0) {
            list6 = null;
        }
        if ((n4 & 0x40000) != 0) {
            bl = false;
        }
        if ((n4 & 0x80000) != 0) {
            map2 = new LinkedHashMap();
        }
        if ((n4 & 0x100000) != 0) {
            map3 = null;
        }
        if ((n4 & 0x200000) != 0) {
            nextAiring = null;
        }
        if ((n4 & 0x400000) != 0) {
            list7 = null;
        }
        if ((n4 & 0x800000) != 0) {
            string9 = null;
        }
        this(string2, string3, string4, string5, string6, tvType, string7, n, map, showStatus, string8, list2, list3, n2, n3, list4, list5, list6, bl, map2, map3, nextAiring, list7, string9);
    }

    @Nullable
    public final String component1() {
        return this.engName;
    }

    @Nullable
    public final String component2() {
        return this.japName;
    }

    @NotNull
    public final String component3() {
        return this.name;
    }

    @NotNull
    public final String component4() {
        return this.url;
    }

    @NotNull
    public final String component5() {
        return this.apiName;
    }

    @NotNull
    public final TvType component6() {
        return this.type;
    }

    @Nullable
    public final String component7() {
        return this.posterUrl;
    }

    @Nullable
    public final Integer component8() {
        return this.year;
    }

    @NotNull
    public final Map<DubStatus, List<Episode>> component9() {
        return this.episodes;
    }

    @Nullable
    public final ShowStatus component10() {
        return this.showStatus;
    }

    @Nullable
    public final String component11() {
        return this.plot;
    }

    @Nullable
    public final List<String> component12() {
        return this.tags;
    }

    @Nullable
    public final List<String> component13() {
        return this.synonyms;
    }

    @Nullable
    public final Score component14() {
        return this.score;
    }

    @Nullable
    public final Integer component15() {
        return this.duration;
    }

    @NotNull
    public final List<TrailerData> component16() {
        return this.trailers;
    }

    @Nullable
    public final List<SearchResponse> component17() {
        return this.recommendations;
    }

    @Nullable
    public final List<ActorData> component18() {
        return this.actors;
    }

    public final boolean component19() {
        return this.comingSoon;
    }

    @NotNull
    public final Map<String, String> component20() {
        return this.syncData;
    }

    @Nullable
    public final Map<String, String> component21() {
        return this.posterHeaders;
    }

    @Nullable
    public final NextAiring component22() {
        return this.nextAiring;
    }

    @Nullable
    public final List<SeasonData> component23() {
        return this.seasonNames;
    }

    @Nullable
    public final String component24() {
        return this.backgroundPosterUrl;
    }

    @Nullable
    public final String component25() {
        return this.contentRating;
    }

    @NotNull
    public final String component26() {
        return this.uniqueUrl;
    }

    @NotNull
    public final AnimeLoadResponse copy(@Nullable String engName, @Nullable String japName, @NotNull String name, @NotNull String url, @NotNull String apiName, @NotNull TvType type, @Nullable String posterUrl, @Nullable Integer year, @NotNull Map<DubStatus, List<Episode>> episodes, @Nullable ShowStatus showStatus, @Nullable String plot, @Nullable List<String> tags, @Nullable List<String> synonyms, @Nullable Score score2, @Nullable Integer duration, @NotNull List<TrailerData> trailers, @Nullable List<? extends SearchResponse> recommendations, @Nullable List<ActorData> actors, boolean comingSoon, @NotNull Map<String, String> syncData, @Nullable Map<String, String> posterHeaders, @Nullable NextAiring nextAiring, @Nullable List<SeasonData> seasonNames, @Nullable String backgroundPosterUrl, @Nullable String contentRating, @NotNull String uniqueUrl) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)apiName, (String)"apiName");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(episodes, (String)"episodes");
        Intrinsics.checkNotNullParameter(trailers, (String)"trailers");
        Intrinsics.checkNotNullParameter(syncData, (String)"syncData");
        Intrinsics.checkNotNullParameter((Object)uniqueUrl, (String)"uniqueUrl");
        return new AnimeLoadResponse(engName, japName, name, url, apiName, type, posterUrl, year, episodes, showStatus, plot, tags, synonyms, score2, duration, trailers, recommendations, actors, comingSoon, syncData, posterHeaders, nextAiring, seasonNames, backgroundPosterUrl, contentRating, uniqueUrl);
    }

    public static /* synthetic */ AnimeLoadResponse copy$default(AnimeLoadResponse animeLoadResponse, String string2, String string3, String string4, String string5, String string6, TvType tvType, String string7, Integer n, Map map, ShowStatus showStatus, String string8, List list2, List list3, Score score2, Integer n2, List list4, List list5, List list6, boolean bl, Map map2, Map map3, NextAiring nextAiring, List list7, String string9, String string10, String string11, int n3, Object object) {
        if ((n3 & 1) != 0) {
            string2 = animeLoadResponse.engName;
        }
        if ((n3 & 2) != 0) {
            string3 = animeLoadResponse.japName;
        }
        if ((n3 & 4) != 0) {
            string4 = animeLoadResponse.name;
        }
        if ((n3 & 8) != 0) {
            string5 = animeLoadResponse.url;
        }
        if ((n3 & 0x10) != 0) {
            string6 = animeLoadResponse.apiName;
        }
        if ((n3 & 0x20) != 0) {
            tvType = animeLoadResponse.type;
        }
        if ((n3 & 0x40) != 0) {
            string7 = animeLoadResponse.posterUrl;
        }
        if ((n3 & 0x80) != 0) {
            n = animeLoadResponse.year;
        }
        if ((n3 & 0x100) != 0) {
            map = animeLoadResponse.episodes;
        }
        if ((n3 & 0x200) != 0) {
            showStatus = animeLoadResponse.showStatus;
        }
        if ((n3 & 0x400) != 0) {
            string8 = animeLoadResponse.plot;
        }
        if ((n3 & 0x800) != 0) {
            list2 = animeLoadResponse.tags;
        }
        if ((n3 & 0x1000) != 0) {
            list3 = animeLoadResponse.synonyms;
        }
        if ((n3 & 0x2000) != 0) {
            score2 = animeLoadResponse.score;
        }
        if ((n3 & 0x4000) != 0) {
            n2 = animeLoadResponse.duration;
        }
        if ((n3 & 0x8000) != 0) {
            list4 = animeLoadResponse.trailers;
        }
        if ((n3 & 0x10000) != 0) {
            list5 = animeLoadResponse.recommendations;
        }
        if ((n3 & 0x20000) != 0) {
            list6 = animeLoadResponse.actors;
        }
        if ((n3 & 0x40000) != 0) {
            bl = animeLoadResponse.comingSoon;
        }
        if ((n3 & 0x80000) != 0) {
            map2 = animeLoadResponse.syncData;
        }
        if ((n3 & 0x100000) != 0) {
            map3 = animeLoadResponse.posterHeaders;
        }
        if ((n3 & 0x200000) != 0) {
            nextAiring = animeLoadResponse.nextAiring;
        }
        if ((n3 & 0x400000) != 0) {
            list7 = animeLoadResponse.seasonNames;
        }
        if ((n3 & 0x800000) != 0) {
            string9 = animeLoadResponse.backgroundPosterUrl;
        }
        if ((n3 & 0x1000000) != 0) {
            string10 = animeLoadResponse.contentRating;
        }
        if ((n3 & 0x2000000) != 0) {
            string11 = animeLoadResponse.uniqueUrl;
        }
        return animeLoadResponse.copy(string2, string3, string4, string5, string6, tvType, string7, n, map, showStatus, string8, list2, list3, score2, n2, list4, list5, list6, bl, map2, map3, nextAiring, list7, string9, string10, string11);
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("AnimeLoadResponse(engName=").append(this.engName).append(", japName=").append(this.japName).append(", name=").append(this.name).append(", url=").append(this.url).append(", apiName=").append(this.apiName).append(", type=").append((Object)this.type).append(", posterUrl=").append(this.posterUrl).append(", year=").append(this.year).append(", episodes=").append(this.episodes).append(", showStatus=").append((Object)this.showStatus).append(", plot=").append(this.plot).append(", tags=");
        stringBuilder.append(this.tags).append(", synonyms=").append(this.synonyms).append(", score=").append(this.score).append(", duration=").append(this.duration).append(", trailers=").append(this.trailers).append(", recommendations=").append(this.recommendations).append(", actors=").append(this.actors).append(", comingSoon=").append(this.comingSoon).append(", syncData=").append(this.syncData).append(", posterHeaders=").append(this.posterHeaders).append(", nextAiring=").append(this.nextAiring).append(", seasonNames=").append(this.seasonNames);
        stringBuilder.append(", backgroundPosterUrl=").append(this.backgroundPosterUrl).append(", contentRating=").append(this.contentRating).append(", uniqueUrl=").append(this.uniqueUrl).append(')');
        return stringBuilder.toString();
    }

    public int hashCode() {
        int result2 = this.engName == null ? 0 : this.engName.hashCode();
        result2 = result2 * 31 + (this.japName == null ? 0 : this.japName.hashCode());
        result2 = result2 * 31 + this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + this.apiName.hashCode();
        result2 = result2 * 31 + this.type.hashCode();
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.year == null ? 0 : ((Object)this.year).hashCode());
        result2 = result2 * 31 + ((Object)this.episodes).hashCode();
        result2 = result2 * 31 + (this.showStatus == null ? 0 : this.showStatus.hashCode());
        result2 = result2 * 31 + (this.plot == null ? 0 : this.plot.hashCode());
        result2 = result2 * 31 + (this.tags == null ? 0 : ((Object)this.tags).hashCode());
        result2 = result2 * 31 + (this.synonyms == null ? 0 : ((Object)this.synonyms).hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
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
        if (!(other instanceof AnimeLoadResponse)) {
            return false;
        }
        AnimeLoadResponse animeLoadResponse = (AnimeLoadResponse)other;
        if (!Intrinsics.areEqual((Object)this.engName, (Object)animeLoadResponse.engName)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.japName, (Object)animeLoadResponse.japName)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.name, (Object)animeLoadResponse.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)animeLoadResponse.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.apiName, (Object)animeLoadResponse.apiName)) {
            return false;
        }
        if (this.type != animeLoadResponse.type) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)animeLoadResponse.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.year, (Object)animeLoadResponse.year)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.episodes, animeLoadResponse.episodes)) {
            return false;
        }
        if (this.showStatus != animeLoadResponse.showStatus) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.plot, (Object)animeLoadResponse.plot)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.tags, animeLoadResponse.tags)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.synonyms, animeLoadResponse.synonyms)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.score, (Object)animeLoadResponse.score)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.duration, (Object)animeLoadResponse.duration)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.trailers, animeLoadResponse.trailers)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.recommendations, animeLoadResponse.recommendations)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.actors, animeLoadResponse.actors)) {
            return false;
        }
        if (this.comingSoon != animeLoadResponse.comingSoon) {
            return false;
        }
        if (!Intrinsics.areEqual(this.syncData, animeLoadResponse.syncData)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.posterHeaders, animeLoadResponse.posterHeaders)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.nextAiring, (Object)animeLoadResponse.nextAiring)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.seasonNames, animeLoadResponse.seasonNames)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.backgroundPosterUrl, (Object)animeLoadResponse.backgroundPosterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.contentRating, (Object)animeLoadResponse.contentRating)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.uniqueUrl, (Object)animeLoadResponse.uniqueUrl);
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

