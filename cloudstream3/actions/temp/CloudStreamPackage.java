/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.ResultKt
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.temp.CloudStreamPackage;
import com.lagradost.cloudstream3.ui.player.ExtractorUri;
import com.lagradost.cloudstream3.ui.player.SubtitleData;
import com.lagradost.cloudstream3.ui.player.SubtitleOrigin;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.AppUtils;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.DrmExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorApiKt;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkPlayList;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.Qualities;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00182\u00020\u0001:\u0003\u0018\u0019\u001aB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u001b"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "<init>", "()V", "oneSource", "", "getOneSource", "()Z", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "Companion", "MinimalVideoLink", "MinimalSubtitleLink", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nCloudStreamPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudStreamPackage.kt\ncom/lagradost/cloudstream3/actions/temp/CloudStreamPackage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,158:1\n1557#2:159\n1628#2,3:160\n774#2:167\n865#2,2:168\n1557#2:170\n1628#2,3:171\n37#3:163\n36#3,3:164\n37#3:174\n36#3,3:175\n*S KotlinDebug\n*F\n+ 1 CloudStreamPackage.kt\ncom/lagradost/cloudstream3/actions/temp/CloudStreamPackage\n*L\n145#1:159\n145#1:160,3\n149#1:167\n149#1:168,2\n150#1:170\n150#1:171,3\n145#1:163\n145#1:164,3\n150#1:174\n150#1:175,3\n*E\n"})
public final class CloudStreamPackage
extends OpenInAppAction {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final boolean oneSource;
    @NotNull
    public static final String SUBTITLE_EXTRA = "subs";
    @NotNull
    public static final String LINKS_EXTRA = "links";
    @NotNull
    public static final String TITLE_EXTRA = "title";
    @NotNull
    public static final String ID_EXTRA = "id";
    @NotNull
    public static final String POSITION_EXTRA = "pos";
    @NotNull
    public static final String DURATION_EXTRA = "dur";

    public CloudStreamPackage() {
        super(TextUtilKt.txt("CloudStream"), "com.lagradost.cloudstream3.prerelease.debug", "com.lagradost.cloudstream3.ui.player.DownloadedPlayerActivity", null, 8, null);
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        void $this$toTypedArray\12;
        void $this$mapTo\10;
        Collection<String> collection;
        ExtractorLink extractorLink;
        void $this$filterTo\7;
        Iterable iterable;
        Iterable iterable2;
        Collection<String> collection2;
        void $this$mapTo\3;
        Collection collection3;
        Long l;
        Intent intent2;
        Intent intent3 = intent2 = intent;
        boolean bl = false;
        DataStoreHelper.PosDur posDur = DataStoreHelper.INSTANCE.getViewPos(Boxing.boxInt((int)video.getId()));
        Long l2 = l = posDur != null ? Boxing.boxLong((long)posDur.getPosition()) : null;
        if (l != null) {
            intent3.putExtra(POSITION_EXTRA, l.longValue());
        }
        intent3.putExtra(ID_EXTRA, video.getId());
        intent3.putExtra(TITLE_EXTRA, video.getName());
        Iterable iterable3 = result2.getSubs();
        String string2 = SUBTITLE_EXTRA;
        Intent intent4 = intent3;
        boolean bl2 = false;
        void var15_15 = collection3;
        Collection collection4 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)collection3, (int)10));
        boolean bl3 = false;
        for (Object t : $this$mapTo\3) {
            void it\4;
            SubtitleData subtitleData = (SubtitleData)t;
            collection2 = collection4;
            boolean bl4 = false;
            collection2.add(AppUtils.INSTANCE.toJson(MinimalSubtitleLink.Companion.fromSubtitle((SubtitleData)it\4)));
        }
        collection2 = (List)collection4;
        collection3 = collection2;
        boolean bl5 = false;
        void this_\5 = iterable2;
        intent4.putExtra(string2, this_\5.toArray(new String[0]));
        iterable2 = result2.getLinks();
        string2 = LINKS_EXTRA;
        intent4 = intent3;
        boolean bl6 = false;
        this_\5 = iterable;
        Collection collection5 = new ArrayList();
        boolean bl7 = false;
        for (Object t : $this$filterTo\7) {
            extractorLink = (ExtractorLink)t;
            boolean bl8 = false;
            if (!(!(extractorLink instanceof ExtractorLinkPlayList) && !(extractorLink instanceof DrmExtractorLink))) continue;
            collection5.add(t);
        }
        collection2 = (List)collection5;
        iterable = collection2;
        boolean bl9 = false;
        $this$filterTo\7 = collection;
        Collection collection6 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)collection, (int)10));
        boolean bl10 = false;
        for (Object t : $this$mapTo\10) {
            void it\11;
            extractorLink = (ExtractorLink)t;
            collection2 = collection6;
            boolean bl11 = false;
            collection2.add(AppUtils.INSTANCE.toJson(MinimalVideoLink.Companion.fromExtractor((ExtractorLink)it\11)));
        }
        collection = collection2 = (List)collection6;
        boolean bl12 = false;
        void this_\12 = $this$toTypedArray\12;
        intent4.putExtra(string2, this_\12.toArray(new String[0]));
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$Companion;", "", "<init>", "()V", "SUBTITLE_EXTRA", "", "LINKS_EXTRA", "TITLE_EXTRA", "ID_EXTRA", "POSITION_EXTRA", "DURATION_EXTRA", "app_prereleaseDebug"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0014\b\u0003\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006 "}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalSubtitleLink;", "", "url", "", "mimeType", "name", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getUrl", "()Ljava/lang/String;", "getMimeType", "getName", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "toSubtitleData", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "app_prereleaseDebug"})
    public static final class MinimalSubtitleLink {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @NotNull
        private final String url;
        @NotNull
        private final String mimeType;
        @Nullable
        private final String name;
        @NotNull
        private Map<String, String> headers;

        public MinimalSubtitleLink(@JsonProperty(value="url") @NotNull String url, @JsonProperty(value="mimeType") @NotNull String mimeType, @JsonProperty(value="name") @Nullable String name, @JsonProperty(value="headers") @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter((Object)url, (String)"url");
            Intrinsics.checkNotNullParameter((Object)mimeType, (String)"mimeType");
            Intrinsics.checkNotNullParameter(headers, (String)"headers");
            this.url = url;
            this.mimeType = mimeType;
            this.name = name;
            this.headers = headers;
        }

        public /* synthetic */ MinimalSubtitleLink(String string2, String string3, String string4, Map map, int n, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 2) != 0) {
                string3 = "text/vtt";
            }
            if ((n & 8) != 0) {
                map = MapsKt.emptyMap();
            }
            this(string2, string3, string4, map);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final void setHeaders(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, (String)"<set-?>");
            this.headers = map;
        }

        @NotNull
        public final SubtitleData toSubtitleData() {
            String string2 = this.url;
            String string3 = this.mimeType;
            String string4 = this.name;
            if (string4 == null) {
                string4 = "Unknown";
            }
            String string5 = string4;
            Map<String, String> map = this.headers;
            SubtitleOrigin subtitleOrigin = SubtitleOrigin.URL;
            return new SubtitleData(string5, "", string2, subtitleOrigin, string3, map, null);
        }

        @NotNull
        public final String component1() {
            return this.url;
        }

        @NotNull
        public final String component2() {
            return this.mimeType;
        }

        @Nullable
        public final String component3() {
            return this.name;
        }

        @NotNull
        public final Map<String, String> component4() {
            return this.headers;
        }

        @NotNull
        public final MinimalSubtitleLink copy(@JsonProperty(value="url") @NotNull String url, @JsonProperty(value="mimeType") @NotNull String mimeType, @JsonProperty(value="name") @Nullable String name, @JsonProperty(value="headers") @NotNull Map<String, String> headers) {
            Intrinsics.checkNotNullParameter((Object)url, (String)"url");
            Intrinsics.checkNotNullParameter((Object)mimeType, (String)"mimeType");
            Intrinsics.checkNotNullParameter(headers, (String)"headers");
            return new MinimalSubtitleLink(url, mimeType, name, headers);
        }

        public static /* synthetic */ MinimalSubtitleLink copy$default(MinimalSubtitleLink minimalSubtitleLink, String string2, String string3, String string4, Map map, int n, Object object) {
            if ((n & 1) != 0) {
                string2 = minimalSubtitleLink.url;
            }
            if ((n & 2) != 0) {
                string3 = minimalSubtitleLink.mimeType;
            }
            if ((n & 4) != 0) {
                string4 = minimalSubtitleLink.name;
            }
            if ((n & 8) != 0) {
                map = minimalSubtitleLink.headers;
            }
            return minimalSubtitleLink.copy(string2, string3, string4, map);
        }

        @NotNull
        public String toString() {
            return "MinimalSubtitleLink(url=" + this.url + ", mimeType=" + this.mimeType + ", name=" + this.name + ", headers=" + this.headers + ')';
        }

        public int hashCode() {
            int result2 = this.url.hashCode();
            result2 = result2 * 31 + this.mimeType.hashCode();
            result2 = result2 * 31 + (this.name == null ? 0 : this.name.hashCode());
            result2 = result2 * 31 + ((Object)this.headers).hashCode();
            return result2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MinimalSubtitleLink)) {
                return false;
            }
            MinimalSubtitleLink minimalSubtitleLink = (MinimalSubtitleLink)other;
            if (!Intrinsics.areEqual((Object)this.url, (Object)minimalSubtitleLink.url)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.mimeType, (Object)minimalSubtitleLink.mimeType)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.name, (Object)minimalSubtitleLink.name)) {
                return false;
            }
            return Intrinsics.areEqual(this.headers, minimalSubtitleLink.headers);
        }

        @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalSubtitleLink$Companion;", "", "<init>", "()V", "fromSubtitle", "Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalSubtitleLink;", "sub", "Lcom/lagradost/cloudstream3/ui/player/SubtitleData;", "app_prereleaseDebug"})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final MinimalSubtitleLink fromSubtitle(@NotNull SubtitleData sub) {
                Intrinsics.checkNotNullParameter((Object)sub, (String)"sub");
                return new MinimalSubtitleLink(sub.getUrl(), sub.getMimeType(), sub.getOriginalName(), sub.getHeaders());
            }

            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 -2\u00020\u0001:\u0001-BW\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001cH\u0086@\u00a2\u0006\u0002\u0010\u001fJ\u000b\u0010 \u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0015\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tH\u00c6\u0003J\u0010\u0010%\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0019J^\u0010&\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bH\u00c6\u0001\u00a2\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u000bH\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006."}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink;", "", "uri", "Landroid/net/Uri;", "url", "", "mimeType", "name", "headers", "", "quality", "", "<init>", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)V", "getUri", "()Landroid/net/Uri;", "getUrl", "()Ljava/lang/String;", "getMimeType", "getName", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "getQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "toExtractorLink", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "Lcom/lagradost/cloudstream3/ui/player/ExtractorUri;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink;", "equals", "", "other", "hashCode", "toString", "Companion", "app_prereleaseDebug"})
    @SourceDebugExtension(value={"SMAP\nCloudStreamPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CloudStreamPackage.kt\ncom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,158:1\n295#2,2:159\n*S KotlinDebug\n*F\n+ 1 CloudStreamPackage.kt\ncom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink\n*L\n81#1:159,2\n*E\n"})
    public static final class MinimalVideoLink {
        @NotNull
        public static final Companion Companion = new Companion(null);
        @Nullable
        private final Uri uri;
        @Nullable
        private final String url;
        @NotNull
        private final String mimeType;
        @Nullable
        private final String name;
        @NotNull
        private Map<String, String> headers;
        @Nullable
        private final Integer quality;

        public MinimalVideoLink(@JsonProperty(value="uri") @Nullable Uri uri, @JsonProperty(value="url") @Nullable String url, @JsonProperty(value="mimeType") @NotNull String mimeType, @JsonProperty(value="name") @Nullable String name, @JsonProperty(value="headers") @NotNull Map<String, String> headers, @JsonProperty(value="quality") @Nullable Integer quality) {
            Intrinsics.checkNotNullParameter((Object)mimeType, (String)"mimeType");
            Intrinsics.checkNotNullParameter(headers, (String)"headers");
            this.uri = uri;
            this.url = url;
            this.mimeType = mimeType;
            this.name = name;
            this.headers = headers;
            this.quality = quality;
        }

        public /* synthetic */ MinimalVideoLink(Uri uri, String string2, String string3, String string4, Map map, Integer n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n2 & 4) != 0) {
                string3 = "video/mp4";
            }
            if ((n2 & 0x10) != 0) {
                map = MapsKt.emptyMap();
            }
            this(uri, string2, string3, string4, map, n);
        }

        @Nullable
        public final Uri getUri() {
            return this.uri;
        }

        @Nullable
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final String getMimeType() {
            return this.mimeType;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Map<String, String> getHeaders() {
            return this.headers;
        }

        public final void setHeaders(@NotNull Map<String, String> map) {
            Intrinsics.checkNotNullParameter(map, (String)"<set-?>");
            this.headers = map;
        }

        @Nullable
        public final Integer getQuality() {
            return this.quality;
        }

        /*
         * Unable to fully structure code
         */
        @Nullable
        public final Object toExtractorLink(@NotNull Continuation<? super Pair<? extends ExtractorLink, ExtractorUri>> $completion) {
            block13: {
                if (!($completion instanceof toExtractorLink.1)) ** GOTO lbl-1000
                var16_2 = $completion;
                if ((var16_2.label & -2147483648) != 0) {
                    var16_2.label -= -2147483648;
                } else lbl-1000:
                // 2 sources

                {
                    $continuation = new ContinuationImpl(this, $completion){
                        Object L$0;
                        /* synthetic */ Object result;
                        final /* synthetic */ MinimalVideoLink this$0;
                        int label;
                        {
                            this.this$0 = this$0;
                            super($completion);
                        }

                        @Nullable
                        public final Object invokeSuspend(@NotNull Object $result) {
                            this.result = $result;
                            this.label |= Integer.MIN_VALUE;
                            return this.this$0.toExtractorLink((Continuation<? super Pair<? extends ExtractorLink, ExtractorUri>>)((Continuation)this));
                        }
                    };
                }
                $result = $continuation.result;
                var17_4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch ($continuation.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = this.url;
                        if (v0 == null) break;
                        url\1 = v0;
                        $i$a$-let-CloudStreamPackage$MinimalVideoLink$toExtractorLink$2\1\76\0 = false;
                        v1 = this.name;
                        if (v1 == null) {
                            v1 = "Unknown";
                        }
                        var4_7 = (Iterable)ExtractorLinkType.getEntries();
                        var5_8 = url\1;
                        var6_9 = v1;
                        var7_10 = "NONE";
                        $i$f$firstOrNull\2\81 = false;
                        for (T element\2 : $this$firstOrNull\2) {
                            ty\3 = (ExtractorLinkType)element\2;
                            $i$a$-firstOrNull-CloudStreamPackage$MinimalVideoLink$toExtractorLink$2$1\3\159\1 = false;
                            if (!Intrinsics.areEqual((Object)ty\3.getMimeType(), (Object)this.mimeType)) continue;
                            v2 = element\2;
                            ** GOTO lbl31
                        }
                        v2 = var13_16 = null;
lbl31:
                        // 2 sources

                        if ((v3 = (ExtractorLinkType)var13_16) == null) {
                            v3 = ExtractorLinkType.VIDEO;
                        }
                        $continuation.L$0 = this;
                        $continuation.label = 1;
                        v4 = ExtractorApiKt.newExtractorLink(var7_10, var6_9, var5_8, v3, (Function2<? super ExtractorLink, ? super Continuation<? super Unit>, ? extends Object>)((Function2)new Function2<ExtractorLink, Continuation<? super Unit>, Object>(this, null){
                            int label;
                            private /* synthetic */ Object L$0;
                            final /* synthetic */ MinimalVideoLink this$0;
                            {
                                this.this$0 = $receiver;
                                super(2, $completion);
                            }

                            /*
                             * WARNING - void declaration
                             */
                            public final Object invokeSuspend(Object object) {
                                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0: {
                                        void var2_2;
                                        ResultKt.throwOnFailure((Object)object);
                                        ExtractorLink $this$newExtractorLink = (ExtractorLink)this.L$0;
                                        $this$newExtractorLink.setHeaders(this.this$0.getHeaders());
                                        Integer n = this.this$0.getQuality();
                                        var2_2.setQuality(n != null ? n.intValue() : Qualities.Unknown.getValue());
                                        return Unit.INSTANCE;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                Function2<ExtractorLink, Continuation<? super Unit>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                                function2.L$0 = value;
                                return (Continuation)function2;
                            }

                            public final Object invoke(ExtractorLink p1, Continuation<? super Unit> p2) {
                                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                            }
                        }), (Continuation<? super ExtractorLink>)$continuation);
                        if (v4 == var17_4) {
                            return var17_4;
                        }
                        ** GOTO lbl44
                    }
                    case 1: {
                        $i$a$-let-CloudStreamPackage$MinimalVideoLink$toExtractorLink$2\1\76\0 = false;
                        this = (MinimalVideoLink)$continuation.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v4 = $result;
lbl44:
                        // 2 sources

                        v5 = (ExtractorLink)v4;
                        break block13;
                    }
                }
                v5 = null;
            }
            v6 = this.uri;
            if (v6 != null) {
                url\1 = v6;
                var14_17 = v5;
                $i$a$-let-CloudStreamPackage$MinimalVideoLink$toExtractorLink$3\4\90\0 = false;
                v7 = this.name;
                if (v7 == null) {
                    v7 = "Unknown";
                }
                v8 = new ExtractorUri((Uri)var2_5, v7, null, null, null, null, null, null, null, null, null, 2044, null);
                v5 = var14_17;
            } else {
                v8 = null;
            }
            return TuplesKt.to((Object)v5, v8);
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Nullable
        public final Uri component1() {
            return this.uri;
        }

        @Nullable
        public final String component2() {
            return this.url;
        }

        @NotNull
        public final String component3() {
            return this.mimeType;
        }

        @Nullable
        public final String component4() {
            return this.name;
        }

        @NotNull
        public final Map<String, String> component5() {
            return this.headers;
        }

        @Nullable
        public final Integer component6() {
            return this.quality;
        }

        @NotNull
        public final MinimalVideoLink copy(@JsonProperty(value="uri") @Nullable Uri uri, @JsonProperty(value="url") @Nullable String url, @JsonProperty(value="mimeType") @NotNull String mimeType, @JsonProperty(value="name") @Nullable String name, @JsonProperty(value="headers") @NotNull Map<String, String> headers, @JsonProperty(value="quality") @Nullable Integer quality) {
            Intrinsics.checkNotNullParameter((Object)mimeType, (String)"mimeType");
            Intrinsics.checkNotNullParameter(headers, (String)"headers");
            return new MinimalVideoLink(uri, url, mimeType, name, headers, quality);
        }

        public static /* synthetic */ MinimalVideoLink copy$default(MinimalVideoLink minimalVideoLink, Uri uri, String string2, String string3, String string4, Map map, Integer n, int n2, Object object) {
            if ((n2 & 1) != 0) {
                uri = minimalVideoLink.uri;
            }
            if ((n2 & 2) != 0) {
                string2 = minimalVideoLink.url;
            }
            if ((n2 & 4) != 0) {
                string3 = minimalVideoLink.mimeType;
            }
            if ((n2 & 8) != 0) {
                string4 = minimalVideoLink.name;
            }
            if ((n2 & 0x10) != 0) {
                map = minimalVideoLink.headers;
            }
            if ((n2 & 0x20) != 0) {
                n = minimalVideoLink.quality;
            }
            return minimalVideoLink.copy(uri, string2, string3, string4, map, n);
        }

        @NotNull
        public String toString() {
            return "MinimalVideoLink(uri=" + this.uri + ", url=" + this.url + ", mimeType=" + this.mimeType + ", name=" + this.name + ", headers=" + this.headers + ", quality=" + this.quality + ')';
        }

        public int hashCode() {
            int result2 = this.uri == null ? 0 : this.uri.hashCode();
            result2 = result2 * 31 + (this.url == null ? 0 : this.url.hashCode());
            result2 = result2 * 31 + this.mimeType.hashCode();
            result2 = result2 * 31 + (this.name == null ? 0 : this.name.hashCode());
            result2 = result2 * 31 + ((Object)this.headers).hashCode();
            result2 = result2 * 31 + (this.quality == null ? 0 : ((Object)this.quality).hashCode());
            return result2;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MinimalVideoLink)) {
                return false;
            }
            MinimalVideoLink minimalVideoLink = (MinimalVideoLink)other;
            if (!Intrinsics.areEqual((Object)this.uri, (Object)minimalVideoLink.uri)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.url, (Object)minimalVideoLink.url)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.mimeType, (Object)minimalVideoLink.mimeType)) {
                return false;
            }
            if (!Intrinsics.areEqual((Object)this.name, (Object)minimalVideoLink.name)) {
                return false;
            }
            if (!Intrinsics.areEqual(this.headers, minimalVideoLink.headers)) {
                return false;
            }
            return Intrinsics.areEqual((Object)this.quality, (Object)minimalVideoLink.quality);
        }

        @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\b"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink$Companion;", "", "<init>", "()V", "fromExtractor", "Lcom/lagradost/cloudstream3/actions/temp/CloudStreamPackage$MinimalVideoLink;", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "app_prereleaseDebug"})
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final MinimalVideoLink fromExtractor(@NotNull ExtractorLink link) {
                Intrinsics.checkNotNullParameter((Object)link, (String)"link");
                String string2 = link.getUrl();
                String string3 = link.getName();
                String string4 = link.getType().getMimeType();
                Map map = StringsKt.isBlank((CharSequence)link.getReferer()) ? MapsKt.emptyMap() : MapsKt.plus((Map)MapsKt.mapOf((Pair)TuplesKt.to((Object)"referer", (Object)link.getReferer())), link.getHeaders());
                int n = link.getQuality();
                return new MinimalVideoLink(null, string2, string4, string3, map, n);
            }

            public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }
}

