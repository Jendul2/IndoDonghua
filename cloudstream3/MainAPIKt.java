/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.databind.DeserializationFeature
 *  com.fasterxml.jackson.databind.Module
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.fasterxml.jackson.databind.json.JsonMapper
 *  com.fasterxml.jackson.databind.json.JsonMapper$Builder
 *  com.fasterxml.jackson.module.kotlin.ExtensionsKt
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.Pair
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.collections.ArraysKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.comparisons.ComparisonsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.io.encoding.Base64
 *  kotlin.jvm.JvmName
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.sequences.Sequence
 *  kotlin.sequences.SequencesKt
 *  kotlin.text.CharsKt
 *  kotlin.text.Charsets
 *  kotlin.text.MatchResult
 *  kotlin.text.Regex
 *  kotlin.text.StringsKt
 *  kotlinx.coroutines.CoroutineScope
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.mozilla.javascript.Context
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import com.lagradost.cloudstream3.AnimeLoadResponse;
import com.lagradost.cloudstream3.AnimeSearchResponse;
import com.lagradost.cloudstream3.DubStatus;
import com.lagradost.cloudstream3.Episode;
import com.lagradost.cloudstream3.EpisodeResponse;
import com.lagradost.cloudstream3.ErrorLoadingException;
import com.lagradost.cloudstream3.HomePageList;
import com.lagradost.cloudstream3.HomePageResponse;
import com.lagradost.cloudstream3.LiveSearchResponse;
import com.lagradost.cloudstream3.LiveStreamLoadResponse;
import com.lagradost.cloudstream3.LoadResponse;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MainPageRequest;
import com.lagradost.cloudstream3.MovieLoadResponse;
import com.lagradost.cloudstream3.MovieSearchResponse;
import com.lagradost.cloudstream3.SearchQuality;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SeasonData;
import com.lagradost.cloudstream3.TorrentLoadResponse;
import com.lagradost.cloudstream3.TorrentSearchResponse;
import com.lagradost.cloudstream3.TvSeriesLoadResponse;
import com.lagradost.cloudstream3.TvSeriesSearchResponse;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.utils.AppUtils;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.encoding.Base64;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.CharsKt;
import kotlin.text.Charsets;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.mozilla.javascript.Context;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000\u00a6\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a \u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u001a%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\u0012\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0016\"\u00020\u000e\u00a2\u0006\u0002\u0010\u0017\u001a=\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142*\u0010\u0015\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00180\u0016\"\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0018\u00a2\u0006\u0002\u0010\u0019\u001a-\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0010\u001a\u00020\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u001f\u001a-\u0010\u001a\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020!2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\"\u001a\u001f\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020#2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010$\u001a%\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020#0\u00142\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010%\u001a\u000e\u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u0001\u001a\u000e\u0010(\u001a\u00020)2\u0006\u0010'\u001a\u00020\u0001\u001a\u000e\u0010*\u001a\u00020\u00012\u0006\u0010+\u001a\u00020)\u001a\u0016\u0010,\u001a\u0004\u0018\u00010\u0001*\u00020-2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010.\u001a\u00020\u0001*\u00020-2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u001a\u0010/\u001a\b\u0012\u0004\u0012\u0002000\u00142\f\u00101\u001a\b\u0012\u0004\u0012\u00020002\u001a\u000e\u00103\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001\u001a\u0012\u00105\u001a\u0004\u0018\u00010\u00012\b\u00104\u001a\u0004\u0018\u00010\u0001\u001a\u000e\u00106\u001a\u00020\u00012\u0006\u00104\u001a\u00020\u0001\u001a\u000e\u00107\u001a\u000208H\u0086@\u00a2\u0006\u0002\u00109\u001a\u0010\u0010:\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u000f\u001a\u00020\u0001\u001a\u0012\u0010;\u001a\u0004\u0018\u00010\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u001a\n\u0010<\u001a\u00020\u0012*\u00020=\u001a\n\u0010>\u001a\u00020\u0012*\u00020=\u001a\n\u0010?\u001a\u00020\u0012*\u00020=\u001a\n\u0010@\u001a\u00020\u0012*\u00020=\u001a\u0012\u0010A\u001a\u0004\u0018\u00010B2\b\u0010'\u001a\u0004\u0018\u00010\u0001\u001a\u0012\u0010C\u001a\u00020\u0001*\u00020-2\u0006\u0010\u000f\u001a\u00020\u0001\u001aI\u0010D\u001a\u00020E*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020\u00122\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u001aI\u0010L\u001a\u00020M*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020\u00122\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u001aI\u0010N\u001a\u00020O*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020\u00122\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u001aI\u0010P\u001a\u00020Q*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020\u00122\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020Q\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u001aI\u0010R\u001a\u00020S*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\b\b\u0002\u0010F\u001a\u00020=2\b\b\u0002\u0010G\u001a\u00020\u00122\u0019\b\u0002\u0010H\u001a\u0013\u0012\u0004\u0012\u00020S\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u001a\u0012\u0010T\u001a\u00020J*\u00020\u001d2\u0006\u0010U\u001a\u00020\u0001\u001a,\u0010V\u001a\u00020J*\u00020\u001d2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010X\u001a,\u0010V\u001a\u00020J*\u00020Y2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00012\u0016\b\u0002\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010X\u001a#\u0010Z\u001a\u00020J*\u00020S2\u0006\u0010[\u001a\u00020\\2\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010^\u001a#\u0010Z\u001a\u00020J*\u00020S2\u0006\u0010_\u001a\u00020\u00122\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010`\u001a\u0019\u0010a\u001a\u00020J*\u00020S2\b\u0010]\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010b\u001a\u0019\u0010c\u001a\u00020J*\u00020S2\b\u0010]\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010b\u001a7\u0010Z\u001a\u00020J*\u00020S2\u0006\u0010d\u001a\u00020\u00122\u0006\u0010e\u001a\u00020\u00122\n\b\u0002\u0010f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010g\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010h\u001a#\u0010Z\u001a\u00020J*\u00020S2\u0006\u0010[\u001a\u00020\u00012\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010i\u001a\u0017\u0010j\u001a\u0004\u0018\u00010\t2\b\u0010k\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010l\u001a\f\u0010m\u001a\u00020\u0012*\u0004\u0018\u00010Y\u001a\f\u0010n\u001a\u00020\u0012*\u0004\u0018\u00010Y\u001a\f\u0010m\u001a\u00020\u0012*\u0004\u0018\u00010=\u001a\n\u0010o\u001a\u00020\u0001*\u00020=\u001a\u001f\u0010p\u001a\u00020J*\u00020q2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00010\u0014H\u0007\u00a2\u0006\u0002\bs\u001a\u001f\u0010p\u001a\u00020J*\u00020q2\f\u0010r\u001a\b\u0012\u0004\u0012\u00020t0\u0014H\u0007\u00a2\u0006\u0002\bu\u001ae\u0010v\u001a\u00020w*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\n\b\u0002\u0010x\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010y\u001a\u0004\u0018\u00010\u00012)\b\u0002\u0010H\u001a#\b\u0001\u0012\u0004\u0012\u00020w\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0002\u0010}\u001a#\u0010~\u001a\u00020J*\u00020\u007f2\u0006\u0010[\u001a\u00020\\2\u000f\u0010]\u001a\u000b\u0012\u0005\u0012\u00030\u0080\u0001\u0018\u00010\u0014\u001ab\u0010\u0081\u0001\u001a\u00020\u007f*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010F\u001a\u00020=2\t\b\u0002\u0010\u0082\u0001\u001a\u00020\u00122)\b\u0002\u0010H\u001a#\b\u0001\u0012\u0004\u0012\u00020\u007f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0003\u0010\u0083\u0001\u001aZ\u0010\u0084\u0001\u001a\u00030\u0085\u0001*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0007\u0010\u0086\u0001\u001a\u00020\u00012*\b\u0002\u0010H\u001a$\b\u0001\u0012\u0005\u0012\u00030\u0085\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0003\u0010\u0087\u0001\u001ak\u0010\u0088\u0001\u001a\u00030\u0089\u0001\"\u0005\b\u0000\u0010\u008a\u0001*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010F\u001a\u00020=2\t\u0010 \u001a\u0005\u0018\u0001H\u008a\u00012*\b\u0002\u0010H\u001a$\b\u0001\u0012\u0005\u0012\u00030\u0089\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0003\u0010\u008b\u0001\u001ab\u0010\u0088\u0001\u001a\u00030\u0089\u0001*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010F\u001a\u00020=2\u0007\u0010\u0086\u0001\u001a\u00020\u00012*\b\u0002\u0010H\u001a$\b\u0001\u0012\u0005\u0012\u00030\u0089\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0003\u0010\u008c\u0001\u001a\"\u0010\u008d\u0001\u001a\u00020J*\u00030\u0080\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u00012\t\b\u0002\u0010\u008f\u0001\u001a\u00020\u0001\u001a\u0018\u0010\u008d\u0001\u001a\u00020J*\u00030\u0080\u00012\n\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0090\u0001\u001a:\u0010\u0091\u0001\u001a\u00030\u0080\u0001*\u00020-2\u0006\u0010\u000f\u001a\u00020\u00012\u001a\b\u0002\u0010H\u001a\u0014\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK2\b\b\u0002\u0010G\u001a\u00020\u0012\u001a>\u0010\u0091\u0001\u001a\u00030\u0080\u0001\"\u0005\b\u0000\u0010\u008a\u0001*\u00020-2\u0007\u0010 \u001a\u0003H\u008a\u00012\u001a\b\u0002\u0010H\u001a\u0014\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0004\u0012\u00020J0I\u00a2\u0006\u0002\bK\u00a2\u0006\u0003\u0010\u0092\u0001\u001ah\u0010\u0093\u0001\u001a\u00030\u0094\u0001*\u00020-2\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00012\u0006\u0010F\u001a\u00020=2\r\u0010]\u001a\t\u0012\u0005\u0012\u00030\u0080\u00010\u00142*\b\u0002\u0010H\u001a$\b\u0001\u0012\u0005\u0012\u00030\u0094\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0{\u0012\u0006\u0012\u0004\u0018\u00010|0z\u00a2\u0006\u0002\bKH\u0086@\u00a2\u0006\u0003\u0010\u0095\u0001\u001a\u0018\u0010\u0096\u0001\u001a\b\u0012\u0004\u0012\u00020\u00010\u00142\t\u0010\u0097\u0001\u001a\u0004\u0018\u00010\u0001\u001a\u0014\u0010\u0098\u0001\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\u0001\u00a2\u0006\u0002\u0010l\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\tX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0099\u0001"}, d2={"AllLanguagesName", "", "USER_AGENT", "mapper", "Lcom/fasterxml/jackson/databind/json/JsonMapper;", "getMapper", "()Lcom/fasterxml/jackson/databind/json/JsonMapper;", "PROVIDER_STATUS_KEY", "PROVIDER_STATUS_BETA_ONLY", "", "PROVIDER_STATUS_SLOW", "PROVIDER_STATUS_OK", "PROVIDER_STATUS_DOWN", "mainPage", "Lcom/lagradost/cloudstream3/MainPageData;", "url", "name", "horizontalImages", "", "mainPageOf", "", "elements", "", "([Lcom/lagradost/cloudstream3/MainPageData;)Ljava/util/List;", "Lkotlin/Pair;", "([Lkotlin/Pair;)Ljava/util/List;", "newHomePageResponse", "Lcom/lagradost/cloudstream3/HomePageResponse;", "list", "Lcom/lagradost/cloudstream3/SearchResponse;", "hasNext", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/HomePageResponse;", "data", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(Lcom/lagradost/cloudstream3/MainPageRequest;Ljava/util/List;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/HomePageResponse;", "Lcom/lagradost/cloudstream3/HomePageList;", "(Lcom/lagradost/cloudstream3/HomePageList;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/HomePageResponse;", "(Ljava/util/List;Ljava/lang/Boolean;)Lcom/lagradost/cloudstream3/HomePageResponse;", "base64Decode", "string", "base64DecodeArray", "", "base64Encode", "array", "fixUrlNull", "Lcom/lagradost/cloudstream3/MainAPI;", "fixUrl", "sortUrls", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "urls", "", "capitalizeString", "str", "capitalizeStringNullable", "fixTitle", "getRhinoContext", "Lorg/mozilla/javascript/Context;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imdbUrlToId", "imdbUrlToIdNullable", "isMovieType", "Lcom/lagradost/cloudstream3/TvType;", "isAudioType", "isLiveStream", "isAnimeOp", "getQualityFromString", "Lcom/lagradost/cloudstream3/SearchQuality;", "updateUrl", "newTorrentSearchResponse", "Lcom/lagradost/cloudstream3/TorrentSearchResponse;", "type", "fix", "initializer", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "newMovieSearchResponse", "Lcom/lagradost/cloudstream3/MovieSearchResponse;", "newLiveSearchResponse", "Lcom/lagradost/cloudstream3/LiveSearchResponse;", "newTvSeriesSearchResponse", "Lcom/lagradost/cloudstream3/TvSeriesSearchResponse;", "newAnimeSearchResponse", "Lcom/lagradost/cloudstream3/AnimeSearchResponse;", "addQuality", "quality", "addPoster", "headers", "", "Lcom/lagradost/cloudstream3/LoadResponse;", "addDubStatus", "status", "Lcom/lagradost/cloudstream3/DubStatus;", "episodes", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Lcom/lagradost/cloudstream3/DubStatus;Ljava/lang/Integer;)V", "isDub", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;ZLjava/lang/Integer;)V", "addDub", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Ljava/lang/Integer;)V", "addSub", "dubExist", "subExist", "dubEpisodes", "subEpisodes", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;ZZLjava/lang/Integer;Ljava/lang/Integer;)V", "(Lcom/lagradost/cloudstream3/AnimeSearchResponse;Ljava/lang/String;Ljava/lang/Integer;)V", "getDurationFromString", "input", "(Ljava/lang/String;)Ljava/lang/Integer;", "isEpisodeBased", "isAnimeBased", "getFolderPrefix", "addSeasonNames", "Lcom/lagradost/cloudstream3/EpisodeResponse;", "names", "addSeasonNamesString", "Lcom/lagradost/cloudstream3/SeasonData;", "addSeasonNamesSeasonData", "newTorrentLoadResponse", "Lcom/lagradost/cloudstream3/TorrentLoadResponse;", "magnet", "torrent", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addEpisodes", "Lcom/lagradost/cloudstream3/AnimeLoadResponse;", "Lcom/lagradost/cloudstream3/Episode;", "newAnimeLoadResponse", "comingSoonIfNone", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newLiveStreamLoadResponse", "Lcom/lagradost/cloudstream3/LiveStreamLoadResponse;", "dataUrl", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newMovieLoadResponse", "Lcom/lagradost/cloudstream3/MovieLoadResponse;", "T", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addDate", "date", "format", "Ljava/util/Date;", "newEpisode", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lcom/lagradost/cloudstream3/Episode;", "newTvSeriesLoadResponse", "Lcom/lagradost/cloudstream3/TvSeriesLoadResponse;", "(Lcom/lagradost/cloudstream3/MainAPI;Ljava/lang/String;Ljava/lang/String;Lcom/lagradost/cloudstream3/TvType;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUrls", "text", "toRatingInt", "library"})
@SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/MainAPIKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,2892:1\n11158#2:2893\n11493#2,3:2894\n1755#3,3:2897\n1053#3:2900\n1567#3:2916\n1598#3,4:2917\n1#4:2901\n1317#5:2902\n1318#5:2915\n434#6:2903\n507#6,5:2904\n434#6:2909\n507#6,5:2910\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/MainAPIKt\n*L\n388#1:2893\n388#1:2894,3\n422#1:2897,3\n675#1:2900\n2066#1:2916\n2066#1:2917,4\n1905#1:2902\n1905#1:2915\n1908#1:2903\n1908#1:2904,5\n1909#1:2909\n1909#1:2910,5\n*E\n"})
public final class MainAPIKt {
    @NotNull
    public static final String AllLanguagesName = "universal";
    @NotNull
    public static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
    @NotNull
    private static final JsonMapper mapper;
    @NotNull
    public static final String PROVIDER_STATUS_KEY = "PROVIDER_STATUS_KEY";
    public static final int PROVIDER_STATUS_BETA_ONLY = 3;
    public static final int PROVIDER_STATUS_SLOW = 2;
    public static final int PROVIDER_STATUS_OK = 1;
    public static final int PROVIDER_STATUS_DOWN = 0;

    @NotNull
    public static final JsonMapper getMapper() {
        return mapper;
    }

    @NotNull
    public static final MainPageData mainPage(@NotNull String url, @NotNull String name, boolean horizontalImages) {
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        return new MainPageData(name, url, horizontalImages);
    }

    public static /* synthetic */ MainPageData mainPage$default(String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = false;
        }
        return MainAPIKt.mainPage(string2, string3, bl);
    }

    @NotNull
    public static final List<MainPageData> mainPageOf(MainPageData ... elements) {
        Intrinsics.checkNotNullParameter((Object)elements, (String)"elements");
        return ArraysKt.toList((Object[])elements);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final List<MainPageData> mainPageOf(Pair<String, String> ... elements) {
        void $this$mapTo$iv$iv;
        Intrinsics.checkNotNullParameter(elements, (String)"elements");
        Pair<String, String>[] $this$map$iv = elements;
        boolean $i$f$map = false;
        Pair<String, String>[] pairArray = $this$map$iv;
        Collection destination$iv$iv = new ArrayList($this$map$iv.length);
        boolean $i$f$mapTo = false;
        int n = ((void)$this$mapTo$iv$iv).length;
        for (int i = 0; i < n; ++i) {
            void item$iv$iv;
            void var9_9 = item$iv$iv = $this$mapTo$iv$iv[i];
            Collection collection = destination$iv$iv;
            boolean bl = false;
            String url = (String)var9_9.component1();
            String name = (String)var9_9.component2();
            collection.add(new MainPageData(name, url, false, 4, null));
        }
        return (List)destination$iv$iv;
    }

    @NotNull
    public static final HomePageResponse newHomePageResponse(@NotNull String name, @NotNull List<? extends SearchResponse> list2, @Nullable Boolean hasNext) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter(list2, (String)"list");
        Boolean bl = hasNext;
        return new HomePageResponse(CollectionsKt.listOf((Object)new HomePageList(name, list2, false, 4, null)), bl != null ? bl : !((Collection)list2).isEmpty());
    }

    public static /* synthetic */ HomePageResponse newHomePageResponse$default(String string2, List list2, Boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = null;
        }
        return MainAPIKt.newHomePageResponse(string2, (List<? extends SearchResponse>)list2, bl);
    }

    @NotNull
    public static final HomePageResponse newHomePageResponse(@NotNull MainPageRequest data2, @NotNull List<? extends SearchResponse> list2, @Nullable Boolean hasNext) {
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        Intrinsics.checkNotNullParameter(list2, (String)"list");
        Boolean bl = hasNext;
        return new HomePageResponse(CollectionsKt.listOf((Object)new HomePageList(data2.getName(), list2, data2.getHorizontalImages())), bl != null ? bl : !((Collection)list2).isEmpty());
    }

    public static /* synthetic */ HomePageResponse newHomePageResponse$default(MainPageRequest mainPageRequest, List list2, Boolean bl, int n, Object object) {
        if ((n & 4) != 0) {
            bl = null;
        }
        return MainAPIKt.newHomePageResponse(mainPageRequest, (List<? extends SearchResponse>)list2, bl);
    }

    @NotNull
    public static final HomePageResponse newHomePageResponse(@NotNull HomePageList list2, @Nullable Boolean hasNext) {
        Intrinsics.checkNotNullParameter((Object)list2, (String)"list");
        Boolean bl = hasNext;
        return new HomePageResponse(CollectionsKt.listOf((Object)list2), bl != null ? bl : !((Collection)list2.getList()).isEmpty());
    }

    public static /* synthetic */ HomePageResponse newHomePageResponse$default(HomePageList homePageList, Boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = null;
        }
        return MainAPIKt.newHomePageResponse(homePageList, bl);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public static final HomePageResponse newHomePageResponse(@NotNull List<HomePageList> list2, @Nullable Boolean hasNext) {
        boolean bl;
        Intrinsics.checkNotNullParameter(list2, (String)"list");
        List<HomePageList> list3 = list2;
        Boolean bl2 = hasNext;
        if (bl2 != null) {
            bl = bl2;
        } else {
            boolean bl3;
            List<HomePageList> list4;
            block5: {
                void $this$any$iv;
                Iterable iterable = list2;
                list4 = list3;
                boolean $i$f$any = false;
                if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                    bl3 = false;
                } else {
                    for (Object element$iv : $this$any$iv) {
                        HomePageList it = (HomePageList)element$iv;
                        boolean bl4 = false;
                        boolean bl5 = !((Collection)it.getList()).isEmpty();
                        if (!bl5) continue;
                        bl3 = true;
                        break block5;
                    }
                    bl3 = false;
                }
            }
            boolean bl6 = bl3;
            list3 = list4;
            bl = bl6;
        }
        boolean bl7 = bl;
        List<HomePageList> list5 = list3;
        return new HomePageResponse(list5, bl7);
    }

    public static /* synthetic */ HomePageResponse newHomePageResponse$default(List list2, Boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = null;
        }
        return MainAPIKt.newHomePageResponse(list2, bl);
    }

    @NotNull
    public static final String base64Decode(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"string");
        return new String(MainAPIKt.base64DecodeArray(string2), Charsets.ISO_8859_1);
    }

    @NotNull
    public static final byte[] base64DecodeArray(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"string");
        return Base64.decode$default((Base64)((Base64)Base64.Default), (CharSequence)string2, (int)0, (int)0, (int)6, null);
    }

    @NotNull
    public static final String base64Encode(@NotNull byte[] array2) {
        Intrinsics.checkNotNullParameter((Object)array2, (String)"array");
        return Base64.encode$default((Base64)((Base64)Base64.Default), (byte[])array2, (int)0, (int)0, (int)6, null);
    }

    @Nullable
    public static final String fixUrlNull(@NotNull MainAPI $this$fixUrlNull, @Nullable String url) {
        Intrinsics.checkNotNullParameter((Object)$this$fixUrlNull, (String)"<this>");
        CharSequence charSequence = url;
        if (charSequence == null || charSequence.length() == 0) {
            return null;
        }
        return MainAPIKt.fixUrl($this$fixUrlNull, url);
    }

    @NotNull
    public static final String fixUrl(@NotNull MainAPI $this$fixUrl, @NotNull String url) {
        Intrinsics.checkNotNullParameter((Object)$this$fixUrl, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        if (StringsKt.startsWith$default((String)url, (String)"http", (boolean)false, (int)2, null) || StringsKt.startsWith$default((String)url, (String)"{\"", (boolean)false, (int)2, null) || StringsKt.startsWith$default((String)url, (String)"[", (boolean)false, (int)2, null)) {
            return url;
        }
        if (((CharSequence)url).length() == 0) {
            return "";
        }
        boolean startsWithNoHttp = StringsKt.startsWith$default((String)url, (String)"//", (boolean)false, (int)2, null);
        if (startsWithNoHttp) {
            return "https:" + url;
        }
        if (StringsKt.startsWith$default((CharSequence)url, (char)'/', (boolean)false, (int)2, null)) {
            return $this$fixUrl.getMainUrl() + url;
        }
        return $this$fixUrl.getMainUrl() + '/' + url;
    }

    @NotNull
    public static final List<ExtractorLink> sortUrls(@NotNull Set<? extends ExtractorLink> urls) {
        Intrinsics.checkNotNullParameter(urls, (String)"urls");
        Iterable $this$sortedBy$iv = urls;
        boolean $i$f$sortedBy = false;
        return CollectionsKt.sortedWith((Iterable)$this$sortedBy$iv, (Comparator)new Comparator(){

            public final int compare(T a, T b) {
                ExtractorLink t = (ExtractorLink)a;
                boolean bl = false;
                Comparable comparable = Integer.valueOf(-t.getQuality());
                t = (ExtractorLink)b;
                Comparable comparable2 = comparable;
                bl = false;
                return ComparisonsKt.compareValues((Comparable)comparable2, (Comparable)Integer.valueOf(-t.getQuality()));
            }
        });
    }

    @NotNull
    public static final String capitalizeString(@NotNull String str) {
        Intrinsics.checkNotNullParameter((Object)str, (String)"str");
        String string2 = MainAPIKt.capitalizeStringNullable(str);
        if (string2 == null) {
            string2 = str;
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public static final String capitalizeStringNullable(@Nullable String str) {
        String string2;
        if (str == null) {
            return null;
        }
        try {
            String string3;
            string2 = str;
            if (((CharSequence)string2).length() > 0) {
                String string4;
                void it22;
                char c = string2.charAt(0);
                StringBuilder stringBuilder = new StringBuilder();
                boolean bl = false;
                if (Character.isLowerCase((char)it22)) {
                    Locale locale = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue((Object)locale, (String)"getDefault(...)");
                    string4 = CharsKt.titlecase((char)it22, (Locale)locale);
                } else {
                    string4 = String.valueOf((char)it22);
                }
                StringBuilder stringBuilder2 = stringBuilder.append((Object)string4);
                String it22 = string2;
                int n = 1;
                String string5 = it22.substring(n);
                Intrinsics.checkNotNullExpressionValue((Object)string5, (String)"substring(...)");
                string3 = stringBuilder2.append(string5).toString();
            } else {
                string3 = string2;
            }
            string2 = string3;
        }
        catch (Exception e) {
            string2 = str;
        }
        return string2;
    }

    @NotNull
    public static final String fixTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter((Object)str, (String)"str");
        String[] stringArray = new String[]{" "};
        return CollectionsKt.joinToString$default((Iterable)StringsKt.split$default((CharSequence)str, (String[])stringArray, (boolean)false, (int)0, (int)6, null), (CharSequence)" ", null, null, (int)0, null, MainAPIKt::fixTitle$lambda$5, (int)30, null);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object getRhinoContext(@NotNull Continuation<? super Context> $completion) {
        if (!($completion instanceof getRhinoContext.1)) ** GOTO lbl-1000
        var2_1 = $completion;
        if ((var2_1.label & -2147483648) != 0) {
            var2_1.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.getRhinoContext((Continuation<? super Context>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var3_3 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                $continuation.label = 1;
                v0 = Coroutines.INSTANCE.mainWork(Coroutines.INSTANCE, (Function3)new Function3<CoroutineScope, Coroutines, Continuation<? super Context>, Object>(null){
                    int label;

                    public final Object invokeSuspend(Object object) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0: {
                                ResultKt.throwOnFailure((Object)object);
                                Context rhino = Context.enter();
                                rhino.initSafeStandardObjects();
                                rhino.setInterpretedMode(true);
                                return rhino;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Object invoke(CoroutineScope p1, Coroutines p2, Continuation<? super Context> p3) {
                        return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                    }
                }, $continuation);
                if (v0 == var3_3) {
                    return var3_3;
                }
                ** GOTO lbl20
            }
            case 1: {
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl20:
                // 2 sources

                Intrinsics.checkNotNullExpressionValue((Object)v0, (String)"mainWork(...)");
                return v0;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    public static final String imdbUrlToId(@NotNull String url) {
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Object object = Regex.find$default((Regex)new Regex("/title/(tt[0-9]*)"), (CharSequence)url, (int)0, (int)2, null);
        if (object == null || (object = object.getGroupValues()) == null || (object = (String)object.get(1)) == null) {
            Object object2 = Regex.find$default((Regex)new Regex("tt[0-9]{5,}"), (CharSequence)url, (int)0, (int)2, null);
            object = object2 != null && (object2 = object2.getGroupValues()) != null ? (String)object2.get(0) : null;
        }
        return object;
    }

    @Nullable
    public static final String imdbUrlToIdNullable(@Nullable String url) {
        if (url == null) {
            return null;
        }
        return MainAPIKt.imdbUrlToId(url);
    }

    public static final boolean isMovieType(@NotNull TvType $this$isMovieType) {
        boolean bl;
        Intrinsics.checkNotNullParameter((Object)((Object)$this$isMovieType), (String)"<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[$this$isMovieType.ordinal()]) {
            case 1: 
            case 2: 
            case 3: 
            case 4: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }

    public static final boolean isAudioType(@NotNull TvType $this$isAudioType) {
        boolean bl;
        Intrinsics.checkNotNullParameter((Object)((Object)$this$isAudioType), (String)"<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[$this$isAudioType.ordinal()]) {
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }

    public static final boolean isLiveStream(@NotNull TvType $this$isLiveStream) {
        Intrinsics.checkNotNullParameter((Object)((Object)$this$isLiveStream), (String)"<this>");
        return $this$isLiveStream == TvType.Live;
    }

    public static final boolean isAnimeOp(@NotNull TvType $this$isAnimeOp) {
        Intrinsics.checkNotNullParameter((Object)((Object)$this$isAnimeOp), (String)"<this>");
        return $this$isAnimeOp == TvType.Anime || $this$isAnimeOp == TvType.OVA;
    }

    @Nullable
    public static final SearchQuality getQualityFromString(@Nullable String string2) {
        SearchQuality searchQuality;
        String check;
        String string3 = string2;
        if (string3 == null) {
            return null;
        }
        String string4 = ((Object)StringsKt.trim((CharSequence)string3)).toString().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"toLowerCase(...)");
        switch (check = StringsKt.replace$default((String)string4, (String)" ", (String)"", (boolean)false, (int)4, null)) {
            case "cam": {
                searchQuality = SearchQuality.Cam;
                break;
            }
            case "camrip": {
                searchQuality = SearchQuality.CamRip;
                break;
            }
            case "hdcam": {
                searchQuality = SearchQuality.HdCam;
                break;
            }
            case "hdtc": {
                searchQuality = SearchQuality.HdCam;
                break;
            }
            case "hdts": {
                searchQuality = SearchQuality.HdCam;
                break;
            }
            case "highquality": {
                searchQuality = SearchQuality.HQ;
                break;
            }
            case "hq": {
                searchQuality = SearchQuality.HQ;
                break;
            }
            case "highdefinition": {
                searchQuality = SearchQuality.HD;
                break;
            }
            case "hdrip": {
                searchQuality = SearchQuality.HD;
                break;
            }
            case "hd": {
                searchQuality = SearchQuality.HD;
                break;
            }
            case "hdtv": {
                searchQuality = SearchQuality.HD;
                break;
            }
            case "rip": {
                searchQuality = SearchQuality.CamRip;
                break;
            }
            case "telecine": {
                searchQuality = SearchQuality.Telecine;
                break;
            }
            case "tc": {
                searchQuality = SearchQuality.Telecine;
                break;
            }
            case "telesync": {
                searchQuality = SearchQuality.Telesync;
                break;
            }
            case "ts": {
                searchQuality = SearchQuality.Telesync;
                break;
            }
            case "dvd": {
                searchQuality = SearchQuality.DVD;
                break;
            }
            case "dvdrip": {
                searchQuality = SearchQuality.DVD;
                break;
            }
            case "dvdscr": {
                searchQuality = SearchQuality.DVD;
                break;
            }
            case "blueray": {
                searchQuality = SearchQuality.BlueRay;
                break;
            }
            case "bluray": {
                searchQuality = SearchQuality.BlueRay;
                break;
            }
            case "blu": {
                searchQuality = SearchQuality.BlueRay;
                break;
            }
            case "fhd": {
                searchQuality = SearchQuality.HD;
                break;
            }
            case "br": {
                searchQuality = SearchQuality.BlueRay;
                break;
            }
            case "standard": {
                searchQuality = SearchQuality.SD;
                break;
            }
            case "sd": {
                searchQuality = SearchQuality.SD;
                break;
            }
            case "4k": {
                searchQuality = SearchQuality.FourK;
                break;
            }
            case "uhd": {
                searchQuality = SearchQuality.UHD;
                break;
            }
            case "blue": {
                searchQuality = SearchQuality.BlueRay;
                break;
            }
            case "wp": {
                searchQuality = SearchQuality.WorkPrint;
                break;
            }
            case "workprint": {
                searchQuality = SearchQuality.WorkPrint;
                break;
            }
            case "webrip": {
                searchQuality = SearchQuality.WebRip;
                break;
            }
            case "webdl": {
                searchQuality = SearchQuality.WebRip;
                break;
            }
            case "web": {
                searchQuality = SearchQuality.WebRip;
                break;
            }
            case "hdr": {
                searchQuality = SearchQuality.HDR;
                break;
            }
            case "sdr": {
                searchQuality = SearchQuality.SDR;
                break;
            }
            default: {
                searchQuality = null;
            }
        }
        return searchQuality;
    }

    @NotNull
    public static final String updateUrl(@NotNull MainAPI $this$updateUrl, @NotNull String url) {
        Intrinsics.checkNotNullParameter((Object)$this$updateUrl, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        try {
            URI original = new URI(url);
            URI updated = new URI($this$updateUrl.getMainUrl());
            String string2 = new URI(updated.getScheme(), original.getUserInfo(), updated.getHost(), updated.getPort(), original.getPath(), original.getQuery(), original.getFragment()).toString();
            Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"toString(...)");
            return string2;
        }
        catch (Throwable t) {
            ArchComponentExtKt.logError(t);
            return url;
        }
    }

    @NotNull
    public static final TorrentSearchResponse newTorrentSearchResponse(@NotNull MainAPI $this$newTorrentSearchResponse, @NotNull String name, @NotNull String url, @NotNull TvType type, boolean fix, @NotNull Function1<? super TorrentSearchResponse, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newTorrentSearchResponse, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        TorrentSearchResponse builder = new TorrentSearchResponse(name, fix ? MainAPIKt.fixUrl($this$newTorrentSearchResponse, url) : url, $this$newTorrentSearchResponse.getName(), type, null, null, null, null, 224, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ TorrentSearchResponse newTorrentSearchResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            tvType = TvType.Torrent;
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function1 = MainAPIKt::newTorrentSearchResponse$lambda$6;
        }
        return MainAPIKt.newTorrentSearchResponse(mainAPI, string2, string3, tvType, bl, (Function1<? super TorrentSearchResponse, Unit>)function1);
    }

    @NotNull
    public static final MovieSearchResponse newMovieSearchResponse(@NotNull MainAPI $this$newMovieSearchResponse, @NotNull String name, @NotNull String url, @NotNull TvType type, boolean fix, @NotNull Function1<? super MovieSearchResponse, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newMovieSearchResponse, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        MovieSearchResponse builder = new MovieSearchResponse(name, fix ? MainAPIKt.fixUrl($this$newMovieSearchResponse, url) : url, $this$newMovieSearchResponse.getName(), type, null, null, null, null, null, null, 1008, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ MovieSearchResponse newMovieSearchResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            tvType = TvType.Movie;
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function1 = MainAPIKt::newMovieSearchResponse$lambda$7;
        }
        return MainAPIKt.newMovieSearchResponse(mainAPI, string2, string3, tvType, bl, (Function1<? super MovieSearchResponse, Unit>)function1);
    }

    @NotNull
    public static final LiveSearchResponse newLiveSearchResponse(@NotNull MainAPI $this$newLiveSearchResponse, @NotNull String name, @NotNull String url, @NotNull TvType type, boolean fix, @NotNull Function1<? super LiveSearchResponse, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newLiveSearchResponse, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        LiveSearchResponse builder = new LiveSearchResponse(name, fix ? MainAPIKt.fixUrl($this$newLiveSearchResponse, url) : url, $this$newLiveSearchResponse.getName(), type, null, null, null, null, null, null, 1008, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ LiveSearchResponse newLiveSearchResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            tvType = TvType.Live;
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function1 = MainAPIKt::newLiveSearchResponse$lambda$8;
        }
        return MainAPIKt.newLiveSearchResponse(mainAPI, string2, string3, tvType, bl, (Function1<? super LiveSearchResponse, Unit>)function1);
    }

    @NotNull
    public static final TvSeriesSearchResponse newTvSeriesSearchResponse(@NotNull MainAPI $this$newTvSeriesSearchResponse, @NotNull String name, @NotNull String url, @NotNull TvType type, boolean fix, @NotNull Function1<? super TvSeriesSearchResponse, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newTvSeriesSearchResponse, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        TvSeriesSearchResponse builder = new TvSeriesSearchResponse(name, fix ? MainAPIKt.fixUrl($this$newTvSeriesSearchResponse, url) : url, $this$newTvSeriesSearchResponse.getName(), type, null, null, null, null, null, null, null, 2032, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ TvSeriesSearchResponse newTvSeriesSearchResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            tvType = TvType.TvSeries;
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function1 = MainAPIKt::newTvSeriesSearchResponse$lambda$9;
        }
        return MainAPIKt.newTvSeriesSearchResponse(mainAPI, string2, string3, tvType, bl, (Function1<? super TvSeriesSearchResponse, Unit>)function1);
    }

    @NotNull
    public static final AnimeSearchResponse newAnimeSearchResponse(@NotNull MainAPI $this$newAnimeSearchResponse, @NotNull String name, @NotNull String url, @NotNull TvType type, boolean fix, @NotNull Function1<? super AnimeSearchResponse, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newAnimeSearchResponse, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        AnimeSearchResponse builder = new AnimeSearchResponse(name, fix ? MainAPIKt.fixUrl($this$newAnimeSearchResponse, url) : url, $this$newAnimeSearchResponse.getName(), type, null, null, null, null, null, null, null, null, 4080, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ AnimeSearchResponse newAnimeSearchResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function1 function1, int n, Object object) {
        if ((n & 4) != 0) {
            tvType = TvType.Anime;
        }
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function1 = MainAPIKt::newAnimeSearchResponse$lambda$10;
        }
        return MainAPIKt.newAnimeSearchResponse(mainAPI, string2, string3, tvType, bl, (Function1<? super AnimeSearchResponse, Unit>)function1);
    }

    public static final void addQuality(@NotNull SearchResponse $this$addQuality, @NotNull String quality) {
        Intrinsics.checkNotNullParameter((Object)$this$addQuality, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)quality, (String)"quality");
        $this$addQuality.setQuality(MainAPIKt.getQualityFromString(quality));
    }

    public static final void addPoster(@NotNull SearchResponse $this$addPoster, @Nullable String url, @Nullable Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)$this$addPoster, (String)"<this>");
        $this$addPoster.setPosterUrl(url);
        $this$addPoster.setPosterHeaders(headers);
    }

    public static /* synthetic */ void addPoster$default(SearchResponse searchResponse, String string2, Map map, int n, Object object) {
        if ((n & 2) != 0) {
            map = null;
        }
        MainAPIKt.addPoster(searchResponse, string2, (Map<String, String>)map);
    }

    public static final void addPoster(@NotNull LoadResponse $this$addPoster, @Nullable String url, @Nullable Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)$this$addPoster, (String)"<this>");
        $this$addPoster.setPosterUrl(url);
        $this$addPoster.setPosterHeaders(headers);
    }

    public static /* synthetic */ void addPoster$default(LoadResponse loadResponse2, String string2, Map map, int n, Object object) {
        if ((n & 2) != 0) {
            map = null;
        }
        MainAPIKt.addPoster(loadResponse2, string2, (Map<String, String>)map);
    }

    /*
     * WARNING - void declaration
     */
    public static final void addDubStatus(@NotNull AnimeSearchResponse $this$addDubStatus, @NotNull DubStatus status, @Nullable Integer episodes) {
        EnumSet<Enum> enumSet;
        Intrinsics.checkNotNullParameter((Object)$this$addDubStatus, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)((Object)status), (String)"status");
        AnimeSearchResponse animeSearchResponse = $this$addDubStatus;
        EnumSet<DubStatus> enumSet2 = $this$addDubStatus.getDubStatus();
        if (enumSet2 != null) {
            void it;
            EnumSet<DubStatus> enumSet3;
            EnumSet<DubStatus> enumSet4 = enumSet3 = enumSet2;
            AnimeSearchResponse animeSearchResponse2 = animeSearchResponse;
            boolean bl = false;
            it.add(status);
            animeSearchResponse = animeSearchResponse2;
            enumSet = enumSet3;
        } else {
            enumSet = EnumSet.of((Enum)status);
        }
        animeSearchResponse.setDubStatus(enumSet);
        TvType tvType = $this$addDubStatus.getType();
        if (!(tvType != null ? MainAPIKt.isMovieType(tvType) : false) && episodes != null && episodes > 0) {
            $this$addDubStatus.getEpisodes().put(status, episodes);
        }
    }

    public static /* synthetic */ void addDubStatus$default(AnimeSearchResponse animeSearchResponse, DubStatus dubStatus, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        MainAPIKt.addDubStatus(animeSearchResponse, dubStatus, n);
    }

    public static final void addDubStatus(@NotNull AnimeSearchResponse $this$addDubStatus, boolean isDub, @Nullable Integer episodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addDubStatus, (String)"<this>");
        MainAPIKt.addDubStatus($this$addDubStatus, isDub ? DubStatus.Dubbed : DubStatus.Subbed, episodes);
    }

    public static /* synthetic */ void addDubStatus$default(AnimeSearchResponse animeSearchResponse, boolean bl, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        MainAPIKt.addDubStatus(animeSearchResponse, bl, n);
    }

    public static final void addDub(@NotNull AnimeSearchResponse $this$addDub, @Nullable Integer episodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addDub, (String)"<this>");
        if (episodes == null || episodes <= 0) {
            return;
        }
        MainAPIKt.addDubStatus($this$addDub, DubStatus.Dubbed, episodes);
    }

    public static final void addSub(@NotNull AnimeSearchResponse $this$addSub, @Nullable Integer episodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addSub, (String)"<this>");
        if (episodes == null || episodes <= 0) {
            return;
        }
        MainAPIKt.addDubStatus($this$addSub, DubStatus.Subbed, episodes);
    }

    public static final void addDubStatus(@NotNull AnimeSearchResponse $this$addDubStatus, boolean dubExist, boolean subExist, @Nullable Integer dubEpisodes, @Nullable Integer subEpisodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addDubStatus, (String)"<this>");
        if (dubExist) {
            MainAPIKt.addDubStatus($this$addDubStatus, DubStatus.Dubbed, dubEpisodes);
        }
        if (subExist) {
            MainAPIKt.addDubStatus($this$addDubStatus, DubStatus.Subbed, subEpisodes);
        }
    }

    public static /* synthetic */ void addDubStatus$default(AnimeSearchResponse animeSearchResponse, boolean bl, boolean bl2, Integer n, Integer n2, int n3, Object object) {
        if ((n3 & 4) != 0) {
            n = null;
        }
        if ((n3 & 8) != 0) {
            n2 = null;
        }
        MainAPIKt.addDubStatus(animeSearchResponse, bl, bl2, n, n2);
    }

    public static final void addDubStatus(@NotNull AnimeSearchResponse $this$addDubStatus, @NotNull String status, @Nullable Integer episodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addDubStatus, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)status, (String)"status");
        if (StringsKt.contains((CharSequence)status, (CharSequence)"(dub)", (boolean)true)) {
            MainAPIKt.addDubStatus($this$addDubStatus, DubStatus.Dubbed, episodes);
        } else if (StringsKt.contains((CharSequence)status, (CharSequence)"(sub)", (boolean)true)) {
            MainAPIKt.addDubStatus($this$addDubStatus, DubStatus.Subbed, episodes);
        }
    }

    public static /* synthetic */ void addDubStatus$default(AnimeSearchResponse animeSearchResponse, String string2, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        MainAPIKt.addDubStatus(animeSearchResponse, string2, n);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Integer getDurationFromString(@Nullable String input) {
        v0 = input;
        if (v0 == null || (v0 = StringsKt.trim((CharSequence)v0).toString()) == null || (v0 = StringsKt.replace$default((String)v0, (String)" ", (String)"", (boolean)false, (int)4, null)) == null) {
            return null;
        }
        cleanInput = v0;
        values = Regex.findAll$default((Regex)new Regex("(\\d+\\shr)|(\\d+\\shour)|(\\d+\\smin)|(\\d+\\ssec)"), (CharSequence)input, (int)0, (int)2, null);
        $i$a$-let-MainAPIKt$getDurationFromString$1 = false;
        seconds = 0;
        $this$forEach$iv = values;
        $i$f$forEach = false;
        for (E element$iv : $this$forEach$iv) {
            block19: {
                block18: {
                    it = (MatchResult)element$iv;
                    $i$a$-forEach-MainAPIKt$getDurationFromString$1$1 = false;
                    timeText = it.getValue();
                    if (!(StringsKt.isBlank((CharSequence)timeText) == false)) continue;
                    $this$filter$iv = timeText;
                    $i$f$filter = false;
                    var14_21 = $this$filter$iv;
                    destination$iv$iv = new StringBuilder();
                    $i$f$filterTo = false;
                    var18_27 = $this$filterTo$iv$iv.length();
                    for (index$iv$iv = 0; index$iv$iv < var18_27; ++index$iv$iv) {
                        s = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
                        $i$a$-filter-MainAPIKt$getDurationFromString$1$1$time$1 = false;
                        if (!Character.isDigit(s)) continue;
                        destination$iv$iv.append(element$iv$iv);
                    }
                    time = Integer.parseInt(StringsKt.trim((CharSequence)((StringBuilder)destination$iv$iv).toString()).toString());
                    $this$filter$iv = timeText;
                    $i$f$filter = false;
                    destination$iv$iv = $this$filter$iv;
                    destination$iv$iv = new StringBuilder();
                    $i$f$filterTo = false;
                    var19_28 = $this$filterTo$iv$iv.length();
                    for (index$iv$iv = 0; index$iv$iv < var19_28; ++index$iv$iv) {
                        s = element$iv$iv = $this$filterTo$iv$iv.charAt(index$iv$iv);
                        $i$a$-filter-MainAPIKt$getDurationFromString$1$1$scale$1 = false;
                        if (!(Character.isDigit(s) == false)) continue;
                        destination$iv$iv.append(element$iv$iv);
                    }
                    scale = StringsKt.trim((CharSequence)((StringBuilder)destination$iv$iv).toString()).toString();
                    var14_21 = scale;
                    switch (var14_21.hashCode()) {
                        case 113745: {
                            if (!var14_21.equals("sec")) {
                                ** break;
                            }
                            break block18;
                        }
                        case 108114: {
                            if (var14_21.equals("min")) break;
                            ** break;
                        }
                        case 3208676: {
                            if (!var14_21.equals("hour")) {
                                ** break;
                            }
                            ** GOTO lbl59
                        }
                        case 3338: {
                            if (!var14_21.equals("hr")) ** break;
lbl59:
                            // 2 sources

                            v1 = time * 60 * 60;
                            break block19;
                        }
                    }
                    v1 = time * 60;
                    break block19;
                }
                v1 = time;
                break block19;
lbl66:
                // 5 sources

                v1 = 0;
            }
            timeval = v1;
            seconds += timeval;
        }
        if (seconds > 0) {
            return seconds / 60;
        }
        v2 = Regex.find$default((Regex)new Regex("([0-9]*)h.*?([0-9]*)m"), (CharSequence)cleanInput, (int)0, (int)2, null);
        if (v2 != null && (v2 = v2.getGroupValues()) != null) {
            values = v2;
            $i$a$-let-MainAPIKt$getDurationFromString$2 = false;
            if (values.size() == 3) {
                hours = StringsKt.toIntOrNull((String)((String)values.get(1)));
                minutes = StringsKt.toIntOrNull((String)((String)values.get(2)));
                if (minutes != null && hours != null) {
                    return hours * 60 + minutes;
                }
            }
        }
        if ((v3 = Regex.find$default((Regex)new Regex("([0-9]*)m"), (CharSequence)cleanInput, (int)0, (int)2, null)) != null && (v3 = v3.getGroupValues()) != null) {
            values = v3;
            $i$a$-let-MainAPIKt$getDurationFromString$3 = false;
            if (values.size() == 2 && (returnValue = StringsKt.toIntOrNull((String)((String)values.get(1)))) != null) {
                return returnValue;
            }
        }
        return null;
    }

    public static final boolean isEpisodeBased(@Nullable LoadResponse $this$isEpisodeBased) {
        if ($this$isEpisodeBased == null) {
            return false;
        }
        return $this$isEpisodeBased instanceof EpisodeResponse && MainAPIKt.isEpisodeBased($this$isEpisodeBased.getType());
    }

    public static final boolean isAnimeBased(@Nullable LoadResponse $this$isAnimeBased) {
        if ($this$isAnimeBased == null) {
            return false;
        }
        return $this$isAnimeBased.getType() == TvType.Anime || $this$isAnimeBased.getType() == TvType.OVA;
    }

    public static final boolean isEpisodeBased(@Nullable TvType $this$isEpisodeBased) {
        boolean bl;
        TvType tvType = $this$isEpisodeBased;
        switch (tvType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[tvType.ordinal()]) {
            case 9: 
            case 10: 
            case 11: 
            case 12: {
                bl = true;
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }

    @NotNull
    public static final String getFolderPrefix(@NotNull TvType $this$getFolderPrefix) {
        String string2;
        Intrinsics.checkNotNullParameter((Object)((Object)$this$getFolderPrefix), (String)"<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[$this$getFolderPrefix.ordinal()]) {
            case 9: {
                string2 = "Anime";
                break;
            }
            case 1: {
                string2 = "Movies";
                break;
            }
            case 10: {
                string2 = "AsianDramas";
                break;
            }
            case 5: {
                string2 = "Audio";
                break;
            }
            case 6: {
                string2 = "AudioBooks";
                break;
            }
            case 11: {
                string2 = "Cartoons";
                break;
            }
            case 13: {
                string2 = "Media";
                break;
            }
            case 14: {
                string2 = "Documentaries";
                break;
            }
            case 2: {
                string2 = "LiveStreams";
                break;
            }
            case 3: {
                string2 = "Movies";
                break;
            }
            case 7: {
                string2 = "Music";
                break;
            }
            case 15: {
                string2 = "NSFW";
                break;
            }
            case 16: {
                string2 = "OVAs";
                break;
            }
            case 17: {
                string2 = "Others";
                break;
            }
            case 8: {
                string2 = "Podcasts";
                break;
            }
            case 4: {
                string2 = "Torrents";
                break;
            }
            case 12: {
                string2 = "TVSeries";
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return string2;
    }

    /*
     * WARNING - void declaration
     */
    @JvmName(name="addSeasonNamesString")
    public static final void addSeasonNamesString(@NotNull EpisodeResponse $this$addSeasonNames, @NotNull List<String> names) {
        List list2;
        Intrinsics.checkNotNullParameter((Object)$this$addSeasonNames, (String)"<this>");
        Intrinsics.checkNotNullParameter(names, (String)"names");
        EpisodeResponse episodeResponse = $this$addSeasonNames;
        if (names.isEmpty()) {
            list2 = null;
        } else {
            void $this$mapIndexedTo$iv$iv;
            void $this$mapIndexed$iv;
            Iterable iterable = names;
            EpisodeResponse episodeResponse2 = episodeResponse;
            boolean $i$f$mapIndexed = false;
            void var4_5 = $this$mapIndexed$iv;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$mapIndexed$iv, (int)10));
            boolean $i$f$mapIndexedTo = false;
            int index$iv$iv = 0;
            for (Object item$iv$iv : $this$mapIndexedTo$iv$iv) {
                void s2;
                void index;
                int n;
                if ((n = index$iv$iv++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                String string2 = (String)item$iv$iv;
                int n2 = n;
                Collection collection = destination$iv$iv;
                boolean bl = false;
                collection.add(new SeasonData((int)(index + true), (String)s2, null, 4, null));
            }
            list2 = (List)destination$iv$iv;
            episodeResponse = episodeResponse2;
        }
        episodeResponse.setSeasonNames(list2);
    }

    @JvmName(name="addSeasonNamesSeasonData")
    public static final void addSeasonNamesSeasonData(@NotNull EpisodeResponse $this$addSeasonNames, @NotNull List<SeasonData> names) {
        Collection collection;
        Intrinsics.checkNotNullParameter((Object)$this$addSeasonNames, (String)"<this>");
        Intrinsics.checkNotNullParameter(names, (String)"names");
        EpisodeResponse episodeResponse = $this$addSeasonNames;
        Collection collection2 = names;
        if (collection2.isEmpty()) {
            EpisodeResponse episodeResponse2 = episodeResponse;
            boolean bl = false;
            collection = null;
            episodeResponse = episodeResponse2;
        } else {
            collection = collection2;
        }
        episodeResponse.setSeasonNames((List)collection);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object newTorrentLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @Nullable String var3_3, @Nullable String var4_4, @NotNull Function2<? super TorrentLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var5_5, @NotNull Continuation<? super TorrentLoadResponse> $completion) {
        if (!($completion instanceof newTorrentLoadResponse.1)) ** GOTO lbl-1000
        var10_7 = $completion;
        if ((var10_7.label & -2147483648) != 0) {
            var10_7.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newTorrentLoadResponse(null, null, null, null, null, null, (Continuation<? super TorrentLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var11_9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                var8_10 = (CharSequence)magnet;
                builder = new TorrentLoadResponse(var1_1, var2_2, $this$newTorrentLoadResponse.getName(), (String)magnet, (String)torrent, null, null, null, null, null, null, null, null, null, null, (var8_10 == null || StringsKt.isBlank((CharSequence)var8_10) != false) != false && ((var8_10 = (CharSequence)torrent) == null || StringsKt.isBlank((CharSequence)var8_10) != false) != false, null, null, null, 491456, null);
                $continuation.L$0 = builder;
                $continuation.label = 1;
                v0 = initializer.invoke((Object)builder, (Object)$continuation);
                if (v0 == var11_9) {
                    return var11_9;
                }
                ** GOTO lbl24
            }
            case 1: {
                builder = (TorrentLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl24:
                // 2 sources

                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newTorrentLoadResponse$default(MainAPI mainAPI, String string2, String string3, String string4, String string5, Function2 function2, Continuation continuation, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = null;
        }
        if ((n & 8) != 0) {
            string5 = null;
        }
        if ((n & 0x10) != 0) {
            function2 = (Function2)new Function2<TorrentLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(TorrentLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newTorrentLoadResponse(mainAPI, string2, string3, string4, string5, (Function2<? super TorrentLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super TorrentLoadResponse>)continuation);
    }

    public static final void addEpisodes(@NotNull AnimeLoadResponse $this$addEpisodes, @NotNull DubStatus status, @Nullable List<Episode> episodes) {
        Intrinsics.checkNotNullParameter((Object)$this$addEpisodes, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)((Object)status), (String)"status");
        Object object = episodes;
        if (object == null || object.isEmpty()) {
            return;
        }
        object = $this$addEpisodes.getEpisodes();
        List list2 = $this$addEpisodes.getEpisodes().get((Object)status);
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = CollectionsKt.plus((Collection)list2, (Iterable)episodes);
        object.put(status, list3);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object newAnimeLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @NotNull TvType var3_3, boolean var4_4, @NotNull Function2<? super AnimeLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var5_5, @NotNull Continuation<? super AnimeLoadResponse> $completion) {
        if (!($completion instanceof newAnimeLoadResponse.1)) ** GOTO lbl-1000
        var12_7 = $completion;
        if ((var12_7.label & -2147483648) != 0) {
            var12_7.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                boolean Z$0;
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newAnimeLoadResponse(null, null, null, null, false, null, (Continuation<? super AnimeLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var13_9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                builder = new AnimeLoadResponse(null, null, (String)name, (String)url, $this$newAnimeLoadResponse.getName(), (TvType)type, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 0xFFFFC3, null);
                $continuation.L$0 = builder;
                $continuation.Z$0 = comingSoonIfNone;
                $continuation.label = 1;
                v0 = initializer.invoke((Object)builder, (Object)$continuation);
                if (v0 == var13_9) {
                    return var13_9;
                }
                ** GOTO lbl25
            }
            case 1: {
                comingSoonIfNone = $continuation.Z$0;
                builder = (AnimeLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl25:
                // 2 sources

                if (comingSoonIfNone) {
                    builder.setComingSoon(true);
                    for (DubStatus key : builder.getEpisodes().keySet()) {
                        var10_13 = builder.getEpisodes().get((Object)key);
                        if (var10_13 == null || var10_13.isEmpty() != false) continue;
                        builder.setComingSoon(false);
                        break;
                    }
                }
                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newAnimeLoadResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, boolean bl, Function2 function2, Continuation continuation, int n, Object object) {
        if ((n & 8) != 0) {
            bl = true;
        }
        if ((n & 0x10) != 0) {
            function2 = (Function2)new Function2<AnimeLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(AnimeLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newAnimeLoadResponse(mainAPI, string2, string3, tvType, bl, (Function2<? super AnimeLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super AnimeLoadResponse>)continuation);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object newLiveStreamLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @NotNull String var3_3, @NotNull Function2<? super LiveStreamLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var4_4, @NotNull Continuation<? super LiveStreamLoadResponse> $completion) {
        if (!($completion instanceof newLiveStreamLoadResponse.1)) ** GOTO lbl-1000
        var8_6 = $completion;
        if ((var8_6.label & -2147483648) != 0) {
            var8_6.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newLiveStreamLoadResponse(null, null, null, null, null, (Continuation<? super LiveStreamLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var9_8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                builder = new LiveStreamLoadResponse(var1_1, var2_2, $this$newLiveStreamLoadResponse.getName(), (String)dataUrl, null, null, null, null, null, null, null, null, null, null, StringsKt.isBlank((CharSequence)((CharSequence)dataUrl)), null, null, null, 245744, null);
                $continuation.L$0 = builder;
                $continuation.label = 1;
                v0 = initializer.invoke((Object)builder, (Object)$continuation);
                if (v0 == var9_8) {
                    return var9_8;
                }
                ** GOTO lbl23
            }
            case 1: {
                builder = (LiveStreamLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl23:
                // 2 sources

                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newLiveStreamLoadResponse$default(MainAPI mainAPI, String string2, String string3, String string4, Function2 function2, Continuation continuation, int n, Object object) {
        if ((n & 8) != 0) {
            function2 = (Function2)new Function2<LiveStreamLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(LiveStreamLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newLiveStreamLoadResponse(mainAPI, string2, string3, string4, (Function2<? super LiveStreamLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super LiveStreamLoadResponse>)continuation);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final <T> Object newMovieLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @NotNull TvType var3_3, @Nullable T var4_4, @NotNull Function2<? super MovieLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var5_5, @NotNull Continuation<? super MovieLoadResponse> $completion) {
        if (!($completion instanceof newMovieLoadResponse.1)) ** GOTO lbl-1000
        var10_7 = $completion;
        if ((var10_7.label & -2147483648) != 0) {
            var10_7.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newMovieLoadResponse(null, null, null, null, null, null, (Continuation<? super MovieLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var11_9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                if (!(data instanceof String)) break;
                $continuation.label = 1;
                v0 = MainAPIKt.newMovieLoadResponse($this$newMovieLoadResponse, (String)name, (String)url, (TvType)type, (String)data, (Function2<? super MovieLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)initializer, $continuation);
                if (v0 == var11_9) {
                    return var11_9;
                }
                ** GOTO lbl21
            }
            case 1: {
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl21:
                // 2 sources

                return v0;
            }
        }
        v1 = data;
        if (v1 == null || (v1 = AppUtils.INSTANCE.toJson(v1)) == null) {
            v1 = "";
        }
        dataUrl = v1;
        builder = new MovieLoadResponse(var1_1, var2_2, $this$newMovieLoadResponse.getName(), var3_3, dataUrl, null, null, null, null, null, null, null, null, null, StringsKt.isBlank((CharSequence)dataUrl), null, null, null, 245728, null);
        $continuation.L$0 = builder;
        $continuation.label = 2;
        v2 = initializer.invoke((Object)builder, $continuation);
        if (v2 == var11_9) {
            return var11_9;
        }
        ** GOTO lbl37
        {
            case 2: {
                builder = (MovieLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v2 = $result;
lbl37:
                // 2 sources

                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newMovieLoadResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, Object object, Function2 function2, Continuation continuation, int n, Object object2) {
        if ((n & 0x10) != 0) {
            function2 = (Function2)new Function2<MovieLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(MovieLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newMovieLoadResponse(mainAPI, string2, string3, tvType, object, (Function2<? super MovieLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super MovieLoadResponse>)continuation);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object newMovieLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @NotNull TvType var3_3, @NotNull String var4_4, @NotNull Function2<? super MovieLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var5_5, @NotNull Continuation<? super MovieLoadResponse> $completion) {
        if (!($completion instanceof newMovieLoadResponse.3)) ** GOTO lbl-1000
        var9_7 = $completion;
        if ((var9_7.label & -2147483648) != 0) {
            var9_7.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newMovieLoadResponse(null, null, null, null, null, null, (Continuation<? super MovieLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var10_9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                builder = new MovieLoadResponse(var1_1, var2_2, $this$newMovieLoadResponse.getName(), var3_3, (String)dataUrl, null, null, null, null, null, null, null, null, null, StringsKt.isBlank((CharSequence)((CharSequence)dataUrl)), null, null, null, 245728, null);
                $continuation.L$0 = builder;
                $continuation.label = 1;
                v0 = initializer.invoke((Object)builder, (Object)$continuation);
                if (v0 == var10_9) {
                    return var10_9;
                }
                ** GOTO lbl23
            }
            case 1: {
                builder = (MovieLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl23:
                // 2 sources

                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newMovieLoadResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, String string4, Function2 function2, Continuation continuation, int n, Object object) {
        if ((n & 0x10) != 0) {
            function2 = (Function2)new Function2<MovieLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(MovieLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newMovieLoadResponse(mainAPI, string2, string3, tvType, string4, (Function2<? super MovieLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super MovieLoadResponse>)continuation);
    }

    public static final void addDate(@NotNull Episode $this$addDate, @Nullable String date, @NotNull String format) {
        Intrinsics.checkNotNullParameter((Object)$this$addDate, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)format, (String)"format");
        try {
            String string2 = date;
            if (string2 == null) {
                return;
            }
            Date date2 = new SimpleDateFormat(format).parse(string2);
            $this$addDate.setDate(date2 != null ? Long.valueOf(date2.getTime()) : null);
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
    }

    public static /* synthetic */ void addDate$default(Episode episode, String string2, String string3, int n, Object object) {
        if ((n & 2) != 0) {
            string3 = "yyyy-MM-dd";
        }
        MainAPIKt.addDate(episode, string2, string3);
    }

    public static final void addDate(@NotNull Episode $this$addDate, @Nullable Date date) {
        Intrinsics.checkNotNullParameter((Object)$this$addDate, (String)"<this>");
        Date date2 = date;
        $this$addDate.setDate(date2 != null ? Long.valueOf(date2.getTime()) : null);
    }

    @NotNull
    public static final Episode newEpisode(@NotNull MainAPI $this$newEpisode, @NotNull String url, @NotNull Function1<? super Episode, Unit> initializer, boolean fix) {
        Intrinsics.checkNotNullParameter((Object)$this$newEpisode, (String)"<this>");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        Episode builder = new Episode(fix ? MainAPIKt.fixUrl($this$newEpisode, url) : url, null, null, null, null, null, null, null, 254, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ Episode newEpisode$default(MainAPI mainAPI, String string2, Function1 function1, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            function1 = MainAPIKt::newEpisode$lambda$20;
        }
        if ((n & 4) != 0) {
            bl = true;
        }
        return MainAPIKt.newEpisode(mainAPI, string2, (Function1<? super Episode, Unit>)function1, bl);
    }

    @NotNull
    public static final <T> Episode newEpisode(@NotNull MainAPI $this$newEpisode, T data2, @NotNull Function1<? super Episode, Unit> initializer) {
        Intrinsics.checkNotNullParameter((Object)$this$newEpisode, (String)"<this>");
        Intrinsics.checkNotNullParameter(initializer, (String)"initializer");
        if (data2 instanceof String) {
            return MainAPIKt.newEpisode$default($this$newEpisode, (String)data2, initializer, false, 4, null);
        }
        Object object = data2;
        if (object == null || (object = AppUtils.INSTANCE.toJson(object)) == null) {
            throw new ErrorLoadingException("invalid newEpisode");
        }
        Episode builder = new Episode((String)object, null, null, null, null, null, null, null, 254, null);
        initializer.invoke((Object)builder);
        return builder;
    }

    public static /* synthetic */ Episode newEpisode$default(MainAPI mainAPI, Object object, Function1 function1, int n, Object object2) {
        if ((n & 2) != 0) {
            function1 = MainAPIKt::newEpisode$lambda$21;
        }
        return MainAPIKt.newEpisode(mainAPI, object, (Function1<? super Episode, Unit>)function1);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public static final Object newTvSeriesLoadResponse(@NotNull MainAPI var0, @NotNull String var1_1, @NotNull String var2_2, @NotNull TvType var3_3, @NotNull List<Episode> var4_4, @NotNull Function2<? super TvSeriesLoadResponse, ? super Continuation<? super Unit>, ? extends Object> var5_5, @NotNull Continuation<? super TvSeriesLoadResponse> $completion) {
        if (!($completion instanceof newTvSeriesLoadResponse.1)) ** GOTO lbl-1000
        var9_7 = $completion;
        if ((var9_7.label & -2147483648) != 0) {
            var9_7.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl($completion){
                Object L$0;
                /* synthetic */ Object result;
                int label;

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return MainAPIKt.newTvSeriesLoadResponse(null, null, null, null, null, null, (Continuation<? super TvSeriesLoadResponse>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var10_9 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                builder = new TvSeriesLoadResponse(var1_1, var2_2, $this$newTvSeriesLoadResponse.getName(), var3_3, (List)episodes, null, null, null, null, null, null, null, null, null, null, episodes.isEmpty(), null, null, null, null, null, 2064352, null);
                $continuation.L$0 = builder;
                $continuation.label = 1;
                v0 = initializer.invoke((Object)builder, (Object)$continuation);
                if (v0 == var10_9) {
                    return var10_9;
                }
                ** GOTO lbl23
            }
            case 1: {
                builder = (TvSeriesLoadResponse)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl23:
                // 2 sources

                return builder;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object newTvSeriesLoadResponse$default(MainAPI mainAPI, String string2, String string3, TvType tvType, List list2, Function2 function2, Continuation continuation, int n, Object object) {
        if ((n & 0x10) != 0) {
            function2 = (Function2)new Function2<TvSeriesLoadResponse, Continuation<? super Unit>, Object>(null){
                int label;

                public final Object invokeSuspend(Object object) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)object);
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(TvSeriesLoadResponse p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }
            };
        }
        return MainAPIKt.newTvSeriesLoadResponse(mainAPI, string2, string3, tvType, list2, (Function2<? super TvSeriesLoadResponse, ? super Continuation<? super Unit>, ? extends Object>)function2, (Continuation<? super TvSeriesLoadResponse>)continuation);
    }

    @NotNull
    public static final List<String> fetchUrls(@Nullable String text) {
        CharSequence charSequence = text;
        if (charSequence == null || charSequence.length() == 0) {
            return CollectionsKt.emptyList();
        }
        Regex linkRegex = new Regex("(https?://(www\\.)?[-a-zA-Z0-9@:%._+~#=]{1,256}\\.[a-zA-Z0-9()]{1,6}\\b([-a-zA-Z0-9()@:%_+.~#?&/=]*))");
        return SequencesKt.toList((Sequence)SequencesKt.map((Sequence)Regex.findAll$default((Regex)linkRegex, (CharSequence)text, (int)0, (int)2, null), MainAPIKt::fetchUrls$lambda$22));
    }

    @Nullable
    public static final Integer toRatingInt(@Nullable String $this$toRatingInt) {
        Object object = $this$toRatingInt;
        return object != null && (object = StringsKt.replace$default((String)object, (String)" ", (String)"", (boolean)false, (int)4, null)) != null && (object = ((Object)StringsKt.trim((CharSequence)((CharSequence)object))).toString()) != null && (object = StringsKt.toDoubleOrNull((String)object)) != null ? Integer.valueOf((int)(Math.abs((Double)object) * (double)1000.0f)) : null;
    }

    /*
     * WARNING - void declaration
     */
    private static final CharSequence fixTitle$lambda$5(String it) {
        String string2;
        Intrinsics.checkNotNullParameter((Object)it, (String)"it");
        String string3 = it.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"toLowerCase(...)");
        String string4 = string3;
        if (((CharSequence)string4).length() > 0) {
            String string5;
            void char_;
            char c = string4.charAt(0);
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = false;
            if (Character.isLowerCase((char)char_)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue((Object)locale, (String)"getDefault(...)");
                string5 = CharsKt.titlecase((char)char_, (Locale)locale);
            } else {
                string5 = it;
            }
            StringBuilder stringBuilder2 = stringBuilder.append((Object)string5);
            String string6 = string4;
            int n = 1;
            String string7 = string6.substring(n);
            Intrinsics.checkNotNullExpressionValue((Object)string7, (String)"substring(...)");
            string2 = stringBuilder2.append(string7).toString();
        } else {
            string2 = string4;
        }
        return string2;
    }

    private static final Unit newTorrentSearchResponse$lambda$6(TorrentSearchResponse torrentSearchResponse) {
        Intrinsics.checkNotNullParameter((Object)torrentSearchResponse, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newMovieSearchResponse$lambda$7(MovieSearchResponse movieSearchResponse) {
        Intrinsics.checkNotNullParameter((Object)movieSearchResponse, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newLiveSearchResponse$lambda$8(LiveSearchResponse liveSearchResponse) {
        Intrinsics.checkNotNullParameter((Object)liveSearchResponse, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newTvSeriesSearchResponse$lambda$9(TvSeriesSearchResponse tvSeriesSearchResponse) {
        Intrinsics.checkNotNullParameter((Object)tvSeriesSearchResponse, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newAnimeSearchResponse$lambda$10(AnimeSearchResponse animeSearchResponse) {
        Intrinsics.checkNotNullParameter((Object)animeSearchResponse, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newEpisode$lambda$20(Episode episode) {
        Intrinsics.checkNotNullParameter((Object)episode, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final Unit newEpisode$lambda$21(Episode episode) {
        Intrinsics.checkNotNullParameter((Object)episode, (String)"<this>");
        return Unit.INSTANCE;
    }

    private static final String fetchUrls$lambda$22(MatchResult it) {
        Intrinsics.checkNotNullParameter((Object)it, (String)"it");
        return StringsKt.removeSurrounding((String)((Object)StringsKt.trim((CharSequence)it.getValue())).toString(), (CharSequence)"\"");
    }

    static {
        ObjectMapper objectMapper = ((JsonMapper.Builder)((JsonMapper.Builder)JsonMapper.builder().addModule((Module)ExtensionsKt.kotlinModule$default(null, (int)1, null))).configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)).build();
        Intrinsics.checkNotNull((Object)objectMapper);
        mapper = (JsonMapper)objectMapper;
    }

    @Metadata(mv={2, 1, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[TvType.values().length];
            try {
                nArray[TvType.AnimeMovie.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Live.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Movie.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Torrent.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Audio.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.AudioBook.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Music.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Podcast.ordinal()] = 8;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Anime.ordinal()] = 9;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.AsianDrama.ordinal()] = 10;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Cartoon.ordinal()] = 11;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.TvSeries.ordinal()] = 12;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.CustomMedia.ordinal()] = 13;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Documentary.ordinal()] = 14;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.NSFW.ordinal()] = 15;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.OVA.ordinal()] = 16;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[TvType.Others.ordinal()] = 17;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

