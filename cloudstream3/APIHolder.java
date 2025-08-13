/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.lagradost.nicehttp.NiceResponse
 *  com.lagradost.nicehttp.Requests
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.ResultKt
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Reflection
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.CharsKt
 *  kotlin.text.StringsKt
 *  okhttp3.MediaType
 *  okhttp3.RequestBody
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.APIHolder;
import com.lagradost.cloudstream3.AniSearch;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainAPIKt;
import com.lagradost.cloudstream3.MainActivityKt;
import com.lagradost.cloudstream3.Tracker;
import com.lagradost.cloudstream3.TrackerType;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.utils.AppUtils;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.nicehttp.NiceResponse;
import com.lagradost.nicehttp.Requests;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000f\u001a\u00020\u0010J\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0012J\u000e\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fJ\u000e\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\fJ\u0012\u0010\"\u001a\u00020\u00102\b\b\u0002\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010\f2\b\u0010&\u001a\u0004\u0018\u00010\u0012J\u0012\u0010'\u001a\u0004\u0018\u00010\f2\b\u0010(\u001a\u0004\u0018\u00010\u0012J,\u0010)\u001a\u0004\u0018\u00010\u00122\u0006\u0010(\u001a\u00020\u00122\u0006\u0010*\u001a\u00020\u00122\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0012H\u0086@\u00a2\u0006\u0002\u0010,J8\u00100\u001a\u0004\u0018\u0001012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u001aH\u0086@\u00a2\u0006\u0002\u00107J@\u00100\u001a\u0004\u0018\u0001012\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120\u00142\u000e\u00103\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u001a2\u0006\u00108\u001a\u00020$H\u0086@\u00a2\u0006\u0002\u00109J\u001a\u0010:\u001a\u0004\u0018\u00010/2\b\u0010;\u001a\u0004\u0018\u00010\u0012H\u0082@\u00a2\u0006\u0002\u0010<R\u0011\u0010\u0004\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\f0\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0017R(\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020/0.X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2={"Lcom/lagradost/cloudstream3/APIHolder;", "", "<init>", "()V", "unixTime", "", "getUnixTime", "()J", "unixTimeMS", "getUnixTimeMS", "allProviders", "", "Lcom/lagradost/cloudstream3/MainAPI;", "getAllProviders", "()Ljava/util/List;", "initAll", "", "capitalize", "", "apis", "", "getApis", "setApis", "(Ljava/util/List;)V", "apiMap", "", "", "getApiMap", "()Ljava/util/Map;", "setApiMap", "(Ljava/util/Map;)V", "addPluginMapping", "plugin", "removePluginMapping", "initMap", "forcedUpdate", "", "getApiFromNameNull", "apiName", "getApiFromUrlNull", "url", "getCaptchaToken", "key", "referer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "trackerCache", "Ljava/util/HashMap;", "Lcom/lagradost/cloudstream3/AniSearch;", "getTracker", "Lcom/lagradost/cloudstream3/Tracker;", "titles", "types", "", "Lcom/lagradost/cloudstream3/TrackerType;", "year", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lessAccurate", "(Ljava/util/List;Ljava/util/Set;Ljava/lang/Integer;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchAnilist", "title", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
@SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/APIHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 NiceResponse.kt\ncom/lagradost/nicehttp/NiceResponse\n*L\n1#1,2892:1\n1#2:2893\n774#3:2894\n865#3,2:2895\n1567#3:2897\n1598#3,4:2898\n295#3,2:2902\n1863#3,2:2904\n1755#3,3:2906\n1755#3,3:2909\n96#4,5:2912\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/APIHolder\n*L\n89#1:2894\n89#1:2895,2\n97#1:2897\n97#1:2898,4\n108#1:2902,2\n116#1:2904,2\n214#1:2906,3\n219#1:2909,3\n277#1:2912,5\n*E\n"})
public final class APIHolder {
    @NotNull
    public static final APIHolder INSTANCE = new APIHolder();
    @NotNull
    private static final List<MainAPI> allProviders = Coroutines.INSTANCE.threadSafeListOf(new MainAPI[0]);
    @NotNull
    private static List<? extends MainAPI> apis = Coroutines.INSTANCE.threadSafeListOf(new MainAPI[0]);
    @Nullable
    private static Map<String, Integer> apiMap;
    @NotNull
    private static HashMap<String, AniSearch> trackerCache;

    private APIHolder() {
    }

    public final long getUnixTime() {
        return System.currentTimeMillis() / 1000L;
    }

    public final long getUnixTimeMS() {
        return System.currentTimeMillis();
    }

    @NotNull
    public final List<MainAPI> getAllProviders() {
        return allProviders;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void initAll() {
        List<MainAPI> list2 = allProviders;
        synchronized (list2) {
            boolean bl = false;
            for (MainAPI api : allProviders) {
                api.init();
            }
            Unit unit = Unit.INSTANCE;
        }
        apiMap = null;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final String capitalize(@NotNull String $this$capitalize) {
        String string2;
        Intrinsics.checkNotNullParameter((Object)$this$capitalize, (String)"<this>");
        String string3 = $this$capitalize;
        if (((CharSequence)string3).length() > 0) {
            String string4;
            void it;
            char c = string3.charAt(0);
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = false;
            if (Character.isLowerCase((char)it)) {
                Locale locale = Locale.getDefault();
                Intrinsics.checkNotNullExpressionValue((Object)locale, (String)"getDefault(...)");
                string4 = CharsKt.titlecase((char)it, (Locale)locale);
            } else {
                string4 = String.valueOf((char)it);
            }
            StringBuilder stringBuilder2 = stringBuilder.append((Object)string4);
            String string5 = string3;
            int n = 1;
            String string6 = string5.substring(n);
            Intrinsics.checkNotNullExpressionValue((Object)string6, (String)"substring(...)");
            string2 = stringBuilder2.append(string6).toString();
        } else {
            string2 = string3;
        }
        return string2;
    }

    @NotNull
    public final List<MainAPI> getApis() {
        return apis;
    }

    public final void setApis(@NotNull List<? extends MainAPI> list2) {
        Intrinsics.checkNotNullParameter(list2, (String)"<set-?>");
        apis = list2;
    }

    @Nullable
    public final Map<String, Integer> getApiMap() {
        return apiMap;
    }

    public final void setApiMap(@Nullable Map<String, Integer> map) {
        apiMap = map;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void addPluginMapping(@NotNull MainAPI plugin) {
        Intrinsics.checkNotNullParameter((Object)plugin, (String)"plugin");
        List<? extends MainAPI> list2 = apis;
        synchronized (list2) {
            boolean bl = false;
            apis = CollectionsKt.plus((Collection)apis, (Object)plugin);
            Unit unit = Unit.INSTANCE;
        }
        this.initMap(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final void removePluginMapping(@NotNull MainAPI plugin) {
        Intrinsics.checkNotNullParameter((Object)plugin, (String)"plugin");
        List<? extends MainAPI> list2 = apis;
        synchronized (list2) {
            void $this$filterTo$iv$iv;
            boolean bl = false;
            Iterable $this$filter$iv = apis;
            boolean $i$f$filter = false;
            Iterable iterable = $this$filter$iv;
            Collection destination$iv$iv = new ArrayList();
            boolean $i$f$filterTo = false;
            for (Object element$iv$iv : $this$filterTo$iv$iv) {
                MainAPI it = (MainAPI)element$iv$iv;
                boolean bl2 = false;
                if (!(!Intrinsics.areEqual((Object)it, (Object)plugin))) continue;
                destination$iv$iv.add(element$iv$iv);
            }
            apis = (List)destination$iv$iv;
            Unit unit = Unit.INSTANCE;
        }
        this.initMap(true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void initMap(boolean forcedUpdate) {
        List<? extends MainAPI> list2 = apis;
        synchronized (list2) {
            boolean bl = false;
            if (apiMap == null || forcedUpdate) {
                void $this$mapIndexedTo$iv$iv;
                Iterable $this$mapIndexed$iv = apis;
                boolean $i$f$mapIndexed = false;
                Iterable iterable = $this$mapIndexed$iv;
                Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$mapIndexed$iv, (int)10));
                boolean $i$f$mapIndexedTo = false;
                int index$iv$iv = 0;
                for (Object item$iv$iv : $this$mapIndexedTo$iv$iv) {
                    void index;
                    void api;
                    int n;
                    if ((n = index$iv$iv++) < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    MainAPI mainAPI = (MainAPI)item$iv$iv;
                    int n2 = n;
                    Collection collection = destination$iv$iv;
                    boolean bl2 = false;
                    collection.add(TuplesKt.to((Object)api.getName(), (Object)((int)index)));
                }
                apiMap = MapsKt.toMap((Iterable)((List)destination$iv$iv));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    static /* synthetic */ void initMap$default(APIHolder aPIHolder, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        aPIHolder.initMap(bl);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Nullable
    public final MainAPI getApiFromNameNull(@Nullable String apiName) {
        if (apiName == null) {
            return null;
        }
        List<MainAPI> list2 = allProviders;
        synchronized (list2) {
            boolean bl = false;
            APIHolder.initMap$default(INSTANCE, false, 1, null);
            List<? extends MainAPI> list3 = apis;
            synchronized (list3) {
                Map<String, Integer> map;
                block12: {
                    Object v2;
                    block10: {
                        block11: {
                            boolean bl2 = false;
                            map = apiMap;
                            if (map == null || (map = map.get(apiName)) == null) break block11;
                            int it = ((Number)((Object)map)).intValue();
                            boolean bl3 = false;
                            MainAPI mainAPI = (MainAPI)CollectionsKt.getOrNull(apis, (int)it);
                            map = mainAPI;
                            if (mainAPI != null) break block12;
                        }
                        Iterable $this$firstOrNull$iv = allProviders;
                        boolean $i$f$firstOrNull = false;
                        for (Object element$iv : $this$firstOrNull$iv) {
                            MainAPI it = (MainAPI)element$iv;
                            boolean bl4 = false;
                            if (!Intrinsics.areEqual((Object)it.getName(), (Object)apiName)) continue;
                            v2 = element$iv;
                            break block10;
                        }
                        v2 = null;
                    }
                    map = v2;
                }
                Map<String, Integer> map3 = map;
                return map3;
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Nullable
    public final MainAPI getApiFromUrlNull(@Nullable String url) {
        if (url == null) {
            return null;
        }
        List<MainAPI> list2 = allProviders;
        synchronized (list2) {
            MainAPI api;
            boolean bl = false;
            Iterable $this$forEach$iv = allProviders;
            boolean $i$f$forEach = false;
            Iterator iterator = $this$forEach$iv.iterator();
            do {
                if (!iterator.hasNext()) {
                    Unit unit = Unit.INSTANCE;
                    return null;
                }
                Object element$iv = iterator.next();
                api = (MainAPI)element$iv;
                boolean bl2 = false;
            } while (!StringsKt.startsWith$default((String)url, (String)api.getMainUrl(), (boolean)false, (int)2, null));
            return api;
        }
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object getCaptchaToken(@NotNull String var1_1, @NotNull String var2_2, @Nullable String var3_3, @NotNull Continuation<? super String> $completion) {
        if (!($completion instanceof getCaptchaToken.1)) ** GOTO lbl-1000
        var11_5 = $completion;
        if ((var11_5.label & -2147483648) != 0) {
            var11_5.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(this, $completion){
                Object L$0;
                Object L$1;
                Object L$2;
                /* synthetic */ Object result;
                final /* synthetic */ APIHolder this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.getCaptchaToken(null, null, null, (Continuation<? super String>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var12_7 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                uri = URI.create((String)url);
                domain = StringsKt.replace$default((String)StringsKt.replace$default((String)MainAPIKt.base64Encode(StringsKt.encodeToByteArray((String)(uri.getScheme() + "://" + uri.getHost() + ":443"))), (String)"\n", (String)"", (boolean)false, (int)4, null), (String)"=", (String)".", (boolean)false, (int)4, null);
                $continuation.L$0 = key;
                $continuation.L$1 = domain;
                $continuation.label = 1;
                v0 = Requests.get$default((Requests)MainActivityKt.getApp(), (String)("https://www.google.com/recaptcha/api.js?render=" + key), null, (String)var3_3, null, null, (boolean)false, (int)0, null, (long)0L, null, (boolean)false, null, (Continuation)$continuation, (int)4026, null);
                ** if (v0 != var12_7) goto lbl22
lbl21:
                // 1 sources

                return var12_7;
lbl22:
                // 1 sources

                ** GOTO lbl30
            }
            case 1: {
                domain = (String)$continuation.L$1;
                key = (String)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl30:
                // 2 sources

                vToken = StringsKt.substringBefore$default((String)StringsKt.substringAfter$default((String)((NiceResponse)v0).getText(), (String)"releases/", null, (int)2, null), (String)"/", null, (int)2, null);
                $continuation.L$0 = key;
                $continuation.L$1 = domain;
                $continuation.L$2 = vToken;
                $continuation.label = 2;
                v1 = Requests.get$default((Requests)MainActivityKt.getApp(), (String)("https://www.google.com/recaptcha/api2/anchor?ar=1&hl=en&size=invisible&cb=cs3&k=" + key + "&co=" + domain + "&v=" + vToken), null, null, null, null, (boolean)false, (int)0, null, (long)0L, null, (boolean)false, null, (Continuation)$continuation, (int)4094, null);
                ** if (v1 != var12_7) goto lbl38
lbl37:
                // 1 sources

                return var12_7;
lbl38:
                // 1 sources

                ** GOTO lbl47
            }
            case 2: {
                vToken = (String)$continuation.L$2;
                domain = (String)$continuation.L$1;
                key = (String)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v1 = $result;
lbl47:
                // 2 sources

                v2 = recapToken = (var9_12 = ((NiceResponse)v1).getDocument().selectFirst("#recaptcha-token")) != null ? var9_12.attr("value") : null;
                if (recapToken == null) ** GOTO lbl66
                var9_12 = new Pair[]{TuplesKt.to((Object)"v", (Object)vToken), TuplesKt.to((Object)"k", (Object)key), TuplesKt.to((Object)"c", (Object)recapToken), TuplesKt.to((Object)"co", (Object)domain), TuplesKt.to((Object)"sa", (Object)""), TuplesKt.to((Object)"reason", (Object)"q")};
                $continuation.L$0 = null;
                $continuation.L$1 = null;
                $continuation.L$2 = null;
                $continuation.label = 3;
                v3 = Requests.post$default((Requests)MainActivityKt.getApp(), (String)("https://www.google.com/recaptcha/api2/reload?k=" + key), null, null, null, null, (Map)MapsKt.mapOf((Pair[])var9_12), null, null, null, (boolean)false, (int)0, null, (long)0L, null, (boolean)false, null, (Continuation)$continuation, (int)64478, null);
                ** if (v3 != var12_7) goto lbl57
lbl56:
                // 1 sources

                return var12_7;
lbl57:
                // 1 sources

                ** GOTO lbl63
            }
            case 3: {
                try {
                    ResultKt.throwOnFailure((Object)$result);
                    v3 = $result;
lbl63:
                    // 2 sources

                    return StringsKt.substringBefore$default((String)StringsKt.substringAfter$default((String)((NiceResponse)v3).getText(), (String)"rresp\",\"", null, (int)2, null), (String)"\"", null, (int)2, null);
                }
                catch (Exception e) {
                    ArchComponentExtKt.logError(e);
                }
lbl66:
                // 2 sources

                return null;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static /* synthetic */ Object getCaptchaToken$default(APIHolder aPIHolder, String string2, String string3, String string4, Continuation continuation, int n, Object object) {
        if ((n & 4) != 0) {
            string4 = null;
        }
        return aPIHolder.getCaptchaToken(string2, string3, string4, (Continuation<? super String>)continuation);
    }

    @Nullable
    public final Object getTracker(@NotNull List<String> titles, @Nullable Set<? extends TrackerType> types, @Nullable Integer year, @NotNull Continuation<? super Tracker> $completion) {
        return this.getTracker(titles, types, year, false, $completion);
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object getTracker(@NotNull List<String> var1_1, @Nullable Set<? extends TrackerType> var2_2, @Nullable Integer var3_3, boolean var4_4, @NotNull Continuation<? super Tracker> $completion) {
        if (!($completion instanceof getTracker.2)) ** GOTO lbl-1000
        var31_6 = $completion;
        if ((var31_6.label & -2147483648) != 0) {
            var31_6.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(this, $completion){
                Object L$0;
                Object L$1;
                Object L$2;
                Object L$3;
                boolean Z$0;
                /* synthetic */ Object result;
                final /* synthetic */ APIHolder this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.getTracker(null, null, null, false, (Continuation<? super Tracker>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var32_8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                if (!(((Collection)titles).isEmpty() == false)) {
                    $i$a$-require-APIHolder$getTracker$3 = false;
                    $i$a$-require-APIHolder$getTracker$3 = "titles must no be empty when calling getTracker";
                    throw new IllegalArgumentException($i$a$-require-APIHolder$getTracker$3.toString());
                }
                mainTitle = (String)titles.get(0);
                v0 = APIHolder.trackerCache.get(mainTitle);
                if (v0 != null) ** GOTO lbl53
                $continuation.L$0 = titles;
                $continuation.L$1 = types;
                $continuation.L$2 = year;
                $continuation.L$3 = mainTitle;
                $continuation.Z$0 = lessAccurate;
                $continuation.label = 1;
                v1 = this.searchAnilist(mainTitle, (Continuation<? super AniSearch>)$continuation);
                ** if (v1 != var32_8) goto lbl30
lbl29:
                // 1 sources

                return var32_8;
lbl30:
                // 1 sources

                ** GOTO lbl41
            }
            case 1: {
                lessAccurate = $continuation.Z$0;
                mainTitle = (String)$continuation.L$3;
                year = (Integer)$continuation.L$2;
                types = (Set)$continuation.L$1;
                titles = (List)$continuation.L$0;
                try {
                    ResultKt.throwOnFailure((Object)$result);
                    v1 = $result;
lbl41:
                    // 2 sources

                    v2 = (AniSearch)v1;
                    if (v2 != null) {
                        it = var9_14 = v2;
                        $i$a$-also-APIHolder$getTracker$search$1 = false;
                        ((Map)APIHolder.trackerCache).put(mainTitle, it);
                        v3 = var9_14;
                    } else {
                        v3 = v0 = null;
                    }
                    if (v3 == null) {
                        return null;
                    }
lbl53:
                    // 3 sources

                    if ((v4 = (search = v0).getData()) == null || (v4 = v4.getPage()) == null || (v4 = v4.getMedia()) == null) ** GOTO lbl101
                    var12_17 = (Iterable)v4;
                    for (T var14_19 : var12_17) {
                        media = (AniSearch.Data.Page.Media)var14_19;
                        $i$a$-find-APIHolder$getTracker$res$1 = false;
                        v5 = matchingYears = year == null || Intrinsics.areEqual((Object)media.getSeasonYear(), (Object)year) != false;
                        if (media.getTitle() == null) ** GOTO lbl76
                        $i$a$-let-APIHolder$getTracker$res$1$matchingTitles$1 = false;
                        $this$any$iv = titles;
                        $i$f$any = false;
                        if (!($this$any$iv instanceof Collection) || !((Collection)$this$any$iv).isEmpty()) ** GOTO lbl66
                        v6 = false;
                        ** GOTO lbl77
lbl66:
                        // 2 sources

                        for (T element$iv : $this$any$iv) {
                            userTitle = (String)element$iv;
                            $i$a$-any-APIHolder$getTracker$res$1$matchingTitles$1$1 = false;
                            if (!title.isMatchingTitles(userTitle)) continue;
                            v6 = true;
                            ** GOTO lbl77
                        }
                        v6 = false;
                        ** GOTO lbl77
lbl76:
                        // 1 sources

                        v6 = false;
lbl77:
                        // 4 sources

                        matchingTitles = v6;
                        v7 = types;
                        if (v7 == null) ** GOTO lbl94
                        $this$any$iv = v7;
                        $i$f$any = false;
                        if (!($this$any$iv instanceof Collection) || !((Collection)$this$any$iv).isEmpty()) ** GOTO lbl85
                        v8 = false;
                        ** GOTO lbl92
lbl85:
                        // 2 sources

                        for (T element$iv : $this$any$iv) {
                            it = (TrackerType)element$iv;
                            $i$a$-any-APIHolder$getTracker$res$1$matchingTypes$1 = false;
                            if (!StringsKt.equals((String)it.name(), (String)media.getFormat(), (boolean)true)) continue;
                            v8 = true;
                            ** GOTO lbl92
                        }
                        v8 = false;
lbl92:
                        // 3 sources

                        v9 = v8;
                        ** GOTO lbl95
lbl94:
                        // 1 sources

                        v9 = matchingTypes = false;
lbl95:
                        // 2 sources

                        v10 = lessAccurate ? matchingTitles || matchingTypes && matchingYears : matchingTitles != false && matchingTypes != false && matchingYears != false;
                        if (!v10) continue;
                        v11 = var14_19;
                        ** GOTO lbl100
                    }
                    v11 = null;
lbl100:
                    // 2 sources

                    if ((v4 = (AniSearch.Data.Page.Media)v11) != null) ** GOTO lbl102
lbl101:
                    // 2 sources

                    return null;
lbl102:
                    // 1 sources

                    res = v4;
                    v12 = res.getIdMal();
                    v13 = String.valueOf(res.getId());
                    v14 = res.getCoverImage();
                    if (v14 == null || (v14 = v14.getExtraLarge()) == null) {
                        v15 = res.getCoverImage();
                        v14 = v15 != null ? v15.getLarge() : null;
                    }
                    var6_13 = new Tracker(v12, v13, (String)v14, res.getBannerImage());
                }
                catch (Throwable t) {
                    ArchComponentExtKt.logError(t);
                    var6_13 = null;
                }
                return var6_13;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    /*
     * Unable to fully structure code
     */
    private final Object searchAnilist(String var1_1, Continuation<? super AniSearch> $completion) {
        if (!($completion instanceof searchAnilist.1)) ** GOTO lbl-1000
        var9_3 = $completion;
        if ((var9_3.label & -2147483648) != 0) {
            var9_3.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(this, $completion){
                /* synthetic */ Object result;
                final /* synthetic */ APIHolder this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return APIHolder.access$searchAnilist(this.this$0, null, (Continuation)this);
                }
            };
        }
        $result = $continuation.result;
        var10_5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                query = StringsKt.trim((CharSequence)"query (\n  $page: Int = 1\n  $search: String\n  $sort: [MediaSort] = [POPULARITY_DESC, SCORE_DESC]\n  $type: MediaType\n) {\n  Page(page: $page, perPage: 20) {\n    media(\n      search: $search\n      sort: $sort\n      type: $type\n    ) {\n      id\n      idMal\n      title { romaji english }\n      coverImage { extraLarge large }\n      bannerImage\n      seasonYear\n      format\n    }\n  }\n}").toString();
                var5_7 = new Pair[2];
                var5_7[0] = TuplesKt.to((Object)"query", (Object)query);
                var6_8 = new Pair[]{TuplesKt.to((Object)"search", (Object)title), TuplesKt.to((Object)"sort", (Object)"SEARCH_MATCH"), TuplesKt.to((Object)"type", (Object)"ANIME")};
                var5_7[1] = TuplesKt.to((Object)"variables", (Object)MapsKt.mapOf((Pair[])var6_8));
                data = RequestBody.Companion.create(AppUtils.INSTANCE.toJson(MapsKt.mapOf((Pair[])var5_7)), MediaType.Companion.parse("application/json;charset=utf-8"));
                $continuation.label = 1;
                v0 = Requests.post$default((Requests)MainActivityKt.getApp(), (String)"https://graphql.anilist.co", null, null, null, null, null, null, null, (RequestBody)data, (boolean)false, (int)0, null, (long)0L, null, (boolean)false, null, (Continuation)$continuation, (int)65278, null);
                if (v0 == var10_5) {
                    return var10_5;
                }
                ** GOTO lbl26
            }
            case 1: {
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl26:
                // 2 sources

                this_$iv = (NiceResponse)v0;
                $i$f$parsedSafe = false;
                try {
                    v1 = this_$iv.getParser();
                    Intrinsics.checkNotNull((Object)v1);
                    v2 = v1.parseSafe(this_$iv.getText(), Reflection.getOrCreateKotlinClass(AniSearch.class));
                }
                catch (Exception e$iv) {
                    e$iv.printStackTrace();
                    v2 = null;
                }
                return v2;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public static final /* synthetic */ Object access$searchAnilist(APIHolder $this, String title, Continuation $completion) {
        return $this.searchAnilist(title, (Continuation<? super AniSearch>)$completion);
    }

    static {
        trackerCache = new HashMap();
    }
}

