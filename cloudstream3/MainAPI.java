/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.NotImplementedError
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  okhttp3.Interceptor
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.HomePageResponse;
import com.lagradost.cloudstream3.LoadResponse;
import com.lagradost.cloudstream3.MainPageData;
import com.lagradost.cloudstream3.MainPageRequest;
import com.lagradost.cloudstream3.ProviderType;
import com.lagradost.cloudstream3.ProvidersInfoJson;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SettingsJson;
import com.lagradost.cloudstream3.SubtitleFile;
import com.lagradost.cloudstream3.TvType;
import com.lagradost.cloudstream3.VPNStatus;
import com.lagradost.cloudstream3.syncproviders.SyncIdName;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b)\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 {2\u00020\u0001:\u0001{B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ \u0010[\u001a\u0004\u0018\u00010]2\u0006\u0010^\u001a\u00020_2\u0006\u0010`\u001a\u00020aH\u0096@\u00a2\u0006\u0002\u0010bJ\u001e\u0010c\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010Y2\u0006\u0010e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010fJ\u001e\u0010g\u001a\n\u0012\u0004\u0012\u00020d\u0018\u00010Y2\u0006\u0010e\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010fJ\u0018\u0010h\u001a\u0004\u0018\u00010i2\u0006\u0010j\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010fJ\u0018\u0010k\u001a\u00020\u00052\b\u0010l\u001a\u0004\u0018\u00010\nH\u0096@\u00a2\u0006\u0002\u0010fJF\u0010m\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010n\u001a\u00020\u00162\u0012\u0010o\u001a\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\u00050p2\u0012\u0010r\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u00050pH\u0096@\u00a2\u0006\u0002\u0010tJ\u0012\u0010u\u001a\u0004\u0018\u00010v2\u0006\u0010w\u001a\u00020sH\u0016J \u0010x\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020J2\u0006\u0010y\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010zR\u001a\u0010\t\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0016X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\u001fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u001fX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010'\u001a\u00020\u001fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010!\"\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\nX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\f\"\u0004\b,\u0010\u000eR\u0014\u0010-\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0018R\u0014\u0010/\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u0018R\u0014\u00101\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0018R\u0014\u00103\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u0018R\u001c\u00105\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\f\"\u0004\b7\u0010\u000eR\u0014\u00108\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u0018R\u0014\u0010:\u001a\u00020\u0016X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0018R\u0018\u0010<\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\b=\u0010>R\u0018\u0010@\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bA\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bC\u0010>R\u0018\u0010D\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bE\u0010>R\u0018\u0010F\u001a\u0004\u0018\u00010\u001fX\u0096\u0004\u00a2\u0006\n\n\u0002\u0010?\u001a\u0004\bG\u0010>R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020N0IX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010LR\u0014\u0010P\u001a\u00020QX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020UX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020Z0YX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b[\u0010\\\u00a8\u0006|"}, d2={"Lcom/lagradost/cloudstream3/MainAPI;", "", "<init>", "()V", "init", "", "overrideWithNewData", "data", "Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "mainUrl", "getMainUrl", "setMainUrl", "storedCredentials", "getStoredCredentials", "setStoredCredentials", "canBeOverridden", "", "getCanBeOverridden", "()Z", "setCanBeOverridden", "(Z)V", "sequentialMainPage", "getSequentialMainPage", "setSequentialMainPage", "sequentialMainPageDelay", "", "getSequentialMainPageDelay", "()J", "setSequentialMainPageDelay", "(J)V", "sequentialMainPageScrollDelay", "getSequentialMainPageScrollDelay", "setSequentialMainPageScrollDelay", "lastHomepageRequest", "getLastHomepageRequest", "setLastHomepageRequest", "lang", "getLang", "setLang", "instantLinkLoading", "getInstantLinkLoading", "hasChromecastSupport", "getHasChromecastSupport", "hasDownloadSupport", "getHasDownloadSupport", "usesWebView", "getUsesWebView", "sourcePlugin", "getSourcePlugin", "setSourcePlugin", "hasMainPage", "getHasMainPage", "hasQuickSearch", "getHasQuickSearch", "loadLinksTimeoutMs", "getLoadLinksTimeoutMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getMainPageTimeoutMs", "getGetMainPageTimeoutMs", "searchTimeoutMs", "getSearchTimeoutMs", "quickSearchTimeoutMs", "getQuickSearchTimeoutMs", "loadTimeoutMs", "getLoadTimeoutMs", "supportedSyncNames", "", "Lcom/lagradost/cloudstream3/syncproviders/SyncIdName;", "getSupportedSyncNames", "()Ljava/util/Set;", "supportedTypes", "Lcom/lagradost/cloudstream3/TvType;", "getSupportedTypes", "vpnStatus", "Lcom/lagradost/cloudstream3/VPNStatus;", "getVpnStatus", "()Lcom/lagradost/cloudstream3/VPNStatus;", "providerType", "Lcom/lagradost/cloudstream3/ProviderType;", "getProviderType", "()Lcom/lagradost/cloudstream3/ProviderType;", "mainPage", "", "Lcom/lagradost/cloudstream3/MainPageData;", "getMainPage", "()Ljava/util/List;", "Lcom/lagradost/cloudstream3/HomePageResponse;", "page", "", "request", "Lcom/lagradost/cloudstream3/MainPageRequest;", "(ILcom/lagradost/cloudstream3/MainPageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "search", "Lcom/lagradost/cloudstream3/SearchResponse;", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "quickSearch", "load", "Lcom/lagradost/cloudstream3/LoadResponse;", "url", "extractorVerifierJob", "extractorData", "loadLinks", "isCasting", "subtitleCallback", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/SubtitleFile;", "callback", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getVideoInterceptor", "Lokhttp3/Interceptor;", "extractorLink", "getLoadUrl", "id", "(Lcom/lagradost/cloudstream3/syncproviders/SyncIdName;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "library"})
public abstract class MainAPI {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private String name = "NONE";
    @NotNull
    private String mainUrl = "NONE";
    @Nullable
    private String storedCredentials;
    private boolean canBeOverridden = true;
    private boolean sequentialMainPage;
    private long sequentialMainPageDelay;
    private long sequentialMainPageScrollDelay;
    private long lastHomepageRequest;
    @NotNull
    private String lang = "en";
    private final boolean instantLinkLoading;
    private final boolean hasChromecastSupport;
    private final boolean hasDownloadSupport;
    private final boolean usesWebView;
    @Nullable
    private String sourcePlugin;
    private final boolean hasMainPage;
    private final boolean hasQuickSearch;
    @Nullable
    private final Long loadLinksTimeoutMs;
    @Nullable
    private final Long getMainPageTimeoutMs;
    @Nullable
    private final Long searchTimeoutMs;
    @Nullable
    private final Long quickSearchTimeoutMs;
    @Nullable
    private final Long loadTimeoutMs;
    @NotNull
    private final Set<SyncIdName> supportedSyncNames = SetsKt.emptySet();
    @NotNull
    private final Set<TvType> supportedTypes;
    @NotNull
    private final VPNStatus vpnStatus;
    @NotNull
    private final ProviderType providerType;
    @NotNull
    private final List<MainPageData> mainPage;
    @Nullable
    private static HashMap<String, ProvidersInfoJson> overrideData;
    @NotNull
    private static SettingsJson settingsForProvider;

    public MainAPI() {
        this.hasChromecastSupport = true;
        this.hasDownloadSupport = true;
        TvType[] tvTypeArray = new TvType[]{TvType.Movie, TvType.TvSeries, TvType.Cartoon, TvType.Anime, TvType.OVA};
        this.supportedTypes = SetsKt.setOf((Object[])tvTypeArray);
        this.vpnStatus = VPNStatus.None;
        this.providerType = ProviderType.DirectProvider;
        this.mainPage = CollectionsKt.listOf((Object)new MainPageData("", "", false));
    }

    public final void init() {
        block0: {
            HashMap<String, ProvidersInfoJson> hashMap = overrideData;
            if (hashMap == null || (hashMap = hashMap.get(this.getClass().getSimpleName())) == null) break block0;
            HashMap<String, ProvidersInfoJson> data2 = hashMap;
            boolean bl = false;
            this.overrideWithNewData((ProvidersInfoJson)((Object)data2));
        }
    }

    public final void overrideWithNewData(@NotNull ProvidersInfoJson data2) {
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        if (!this.getCanBeOverridden()) {
            return;
        }
        this.setName(data2.getName());
        if (!StringsKt.isBlank((CharSequence)data2.getUrl()) && !Intrinsics.areEqual((Object)data2.getUrl(), (Object)"NONE")) {
            this.setMainUrl(data2.getUrl());
        }
        this.setStoredCredentials(data2.getCredentials());
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.name = string2;
    }

    @NotNull
    public String getMainUrl() {
        return this.mainUrl;
    }

    public void setMainUrl(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.mainUrl = string2;
    }

    @Nullable
    public String getStoredCredentials() {
        return this.storedCredentials;
    }

    public void setStoredCredentials(@Nullable String string2) {
        this.storedCredentials = string2;
    }

    public boolean getCanBeOverridden() {
        return this.canBeOverridden;
    }

    public void setCanBeOverridden(boolean bl) {
        this.canBeOverridden = bl;
    }

    public boolean getSequentialMainPage() {
        return this.sequentialMainPage;
    }

    public void setSequentialMainPage(boolean bl) {
        this.sequentialMainPage = bl;
    }

    public long getSequentialMainPageDelay() {
        return this.sequentialMainPageDelay;
    }

    public void setSequentialMainPageDelay(long l) {
        this.sequentialMainPageDelay = l;
    }

    public long getSequentialMainPageScrollDelay() {
        return this.sequentialMainPageScrollDelay;
    }

    public void setSequentialMainPageScrollDelay(long l) {
        this.sequentialMainPageScrollDelay = l;
    }

    public final long getLastHomepageRequest() {
        return this.lastHomepageRequest;
    }

    public final void setLastHomepageRequest(long l) {
        this.lastHomepageRequest = l;
    }

    @NotNull
    public String getLang() {
        return this.lang;
    }

    public void setLang(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.lang = string2;
    }

    public boolean getInstantLinkLoading() {
        return this.instantLinkLoading;
    }

    public boolean getHasChromecastSupport() {
        return this.hasChromecastSupport;
    }

    public boolean getHasDownloadSupport() {
        return this.hasDownloadSupport;
    }

    public boolean getUsesWebView() {
        return this.usesWebView;
    }

    @Nullable
    public final String getSourcePlugin() {
        return this.sourcePlugin;
    }

    public final void setSourcePlugin(@Nullable String string2) {
        this.sourcePlugin = string2;
    }

    public boolean getHasMainPage() {
        return this.hasMainPage;
    }

    public boolean getHasQuickSearch() {
        return this.hasQuickSearch;
    }

    @Nullable
    public Long getLoadLinksTimeoutMs() {
        return this.loadLinksTimeoutMs;
    }

    @Nullable
    public Long getGetMainPageTimeoutMs() {
        return this.getMainPageTimeoutMs;
    }

    @Nullable
    public Long getSearchTimeoutMs() {
        return this.searchTimeoutMs;
    }

    @Nullable
    public Long getQuickSearchTimeoutMs() {
        return this.quickSearchTimeoutMs;
    }

    @Nullable
    public Long getLoadTimeoutMs() {
        return this.loadTimeoutMs;
    }

    @NotNull
    public Set<SyncIdName> getSupportedSyncNames() {
        return this.supportedSyncNames;
    }

    @NotNull
    public Set<TvType> getSupportedTypes() {
        return this.supportedTypes;
    }

    @NotNull
    public VPNStatus getVpnStatus() {
        return this.vpnStatus;
    }

    @NotNull
    public ProviderType getProviderType() {
        return this.providerType;
    }

    @NotNull
    public List<MainPageData> getMainPage() {
        return this.mainPage;
    }

    @Nullable
    public Object getMainPage(int page, @NotNull MainPageRequest request, @NotNull Continuation<? super HomePageResponse> $completion) {
        return MainAPI.getMainPage$suspendImpl(this, page, request, $completion);
    }

    static /* synthetic */ Object getMainPage$suspendImpl(MainAPI $this, int page, MainPageRequest request, Continuation<? super HomePageResponse> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Object search(@NotNull String query, @NotNull Continuation<? super List<? extends SearchResponse>> $completion) {
        return MainAPI.search$suspendImpl(this, query, $completion);
    }

    static /* synthetic */ Object search$suspendImpl(MainAPI $this, String query, Continuation<? super List<? extends SearchResponse>> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Object quickSearch(@NotNull String query, @NotNull Continuation<? super List<? extends SearchResponse>> $completion) {
        return MainAPI.quickSearch$suspendImpl(this, query, $completion);
    }

    static /* synthetic */ Object quickSearch$suspendImpl(MainAPI $this, String query, Continuation<? super List<? extends SearchResponse>> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Object load(@NotNull String url, @NotNull Continuation<? super LoadResponse> $completion) {
        return MainAPI.load$suspendImpl(this, url, $completion);
    }

    static /* synthetic */ Object load$suspendImpl(MainAPI $this, String url, Continuation<? super LoadResponse> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Object extractorVerifierJob(@Nullable String extractorData, @NotNull Continuation<? super Unit> $completion) {
        return MainAPI.extractorVerifierJob$suspendImpl(this, extractorData, $completion);
    }

    static /* synthetic */ Object extractorVerifierJob$suspendImpl(MainAPI $this, String extractorData, Continuation<? super Unit> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Object loadLinks(@NotNull String data2, boolean isCasting, @NotNull Function1<? super SubtitleFile, Unit> subtitleCallback, @NotNull Function1<? super ExtractorLink, Unit> callback2, @NotNull Continuation<? super Boolean> $completion) {
        return MainAPI.loadLinks$suspendImpl(this, data2, isCasting, subtitleCallback, callback2, $completion);
    }

    static /* synthetic */ Object loadLinks$suspendImpl(MainAPI $this, String data2, boolean isCasting, Function1<? super SubtitleFile, Unit> subtitleCallback, Function1<? super ExtractorLink, Unit> callback2, Continuation<? super Boolean> $completion) {
        throw new NotImplementedError(null, 1, null);
    }

    @Nullable
    public Interceptor getVideoInterceptor(@NotNull ExtractorLink extractorLink) {
        Intrinsics.checkNotNullParameter((Object)extractorLink, (String)"extractorLink");
        return null;
    }

    @Nullable
    public Object getLoadUrl(@NotNull SyncIdName name, @NotNull String id2, @NotNull Continuation<? super String> $completion) {
        return MainAPI.getLoadUrl$suspendImpl(this, name, id2, $completion);
    }

    static /* synthetic */ Object getLoadUrl$suspendImpl(MainAPI $this, SyncIdName name, String id2, Continuation<? super String> $completion) {
        return null;
    }

    static {
        settingsForProvider = new SettingsJson(false, 1, null);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Lcom/lagradost/cloudstream3/MainAPI$Companion;", "", "<init>", "()V", "overrideData", "Ljava/util/HashMap;", "", "Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "getOverrideData", "()Ljava/util/HashMap;", "setOverrideData", "(Ljava/util/HashMap;)V", "settingsForProvider", "Lcom/lagradost/cloudstream3/SettingsJson;", "getSettingsForProvider", "()Lcom/lagradost/cloudstream3/SettingsJson;", "setSettingsForProvider", "(Lcom/lagradost/cloudstream3/SettingsJson;)V", "library"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final HashMap<String, ProvidersInfoJson> getOverrideData() {
            return overrideData;
        }

        public final void setOverrideData(@Nullable HashMap<String, ProvidersInfoJson> hashMap) {
            overrideData = hashMap;
        }

        @NotNull
        public final SettingsJson getSettingsForProvider() {
            return settingsForProvider;
        }

        public final void setSettingsForProvider(@NotNull SettingsJson settingsJson) {
            Intrinsics.checkNotNullParameter((Object)settingsJson, (String)"<set-?>");
            settingsForProvider = settingsJson;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

