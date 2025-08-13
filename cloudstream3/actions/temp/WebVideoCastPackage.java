/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.Parcelable
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
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
import android.os.Bundle;
import android.os.Parcelable;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.ui.player.SubtitleData;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/WebVideoCastPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "<init>", "()V", "oneSource", "", "getOneSource", "()Z", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nWebVideoCastPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebVideoCastPackage.kt\ncom/lagradost/cloudstream3/actions/temp/WebVideoCastPackage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,62:1\n1557#2:63\n1628#2,2:64\n1630#2:67\n29#3:66\n37#4:68\n36#4,3:69\n1#5:72\n*S KotlinDebug\n*F\n+ 1 WebVideoCastPackage.kt\ncom/lagradost/cloudstream3/actions/temp/WebVideoCastPackage\n*L\n45#1:63\n45#1:64,2\n45#1:67\n45#1:66\n45#1:68\n45#1:69,3\n*E\n"})
public final class WebVideoCastPackage
extends OpenInAppAction {
    private final boolean oneSource;
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes;

    public WebVideoCastPackage() {
        super(TextUtilKt.txt("Web Video Cast"), "com.instantbits.cast.webvideo", null, null, 12, null);
        this.oneSource = true;
        ExtractorLinkType[] extractorLinkTypeArray = new ExtractorLinkType[]{ExtractorLinkType.VIDEO, ExtractorLinkType.DASH, ExtractorLinkType.M3U8};
        this.sourceTypes = SetsKt.setOf((Object[])extractorLinkTypeArray);
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    @NotNull
    public Set<ExtractorLinkType> getSourceTypes() {
        return this.sourceTypes;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        Bundle bundle;
        void $this$toTypedArray\6;
        Collection<Uri> collection;
        void $this$mapTo\3;
        Collection collection2;
        Intent intent2;
        Integer n = index;
        ExtractorLink link = result2.getLinks().get(n != null ? n : 0);
        Intent intent3 = intent2 = intent;
        boolean bl = false;
        intent3.setDataAndType(Uri.parse((String)link.getUrl()), "video/*");
        String string2 = video.getName();
        if (string2 == null) {
            string2 = video.getHeaderName();
        }
        String string3 = string2;
        Iterable iterable = result2.getSubs();
        String string4 = "subs";
        Intent intent4 = intent3;
        boolean bl2 = false;
        void var16_17 = collection2;
        Collection collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)collection2, (int)10));
        boolean bl3 = false;
        for (Object t : $this$mapTo\3) {
            void it\4;
            SubtitleData subtitleData = (SubtitleData)t;
            collection = collection3;
            boolean bl4 = false;
            String string5 = it\4.getUrl();
            boolean bl5 = false;
            collection.add(Uri.parse((String)string5));
        }
        collection = (List)collection3;
        collection2 = collection;
        boolean bl6 = false;
        void this_\6 = $this$toTypedArray\6;
        intent4.putExtra(string4, (Parcelable[])this_\6.toArray(new Uri[0]));
        intent3.putExtra("title", string3);
        String string5 = video.getPoster();
        if (string5 != null) {
            String string7 = string5;
            boolean bl7 = false;
            intent3.putExtra("poster", string7);
        }
        Bundle bundle2 = bundle = new Bundle();
        boolean bl8 = false;
        if (!StringsKt.isBlank((CharSequence)link.getReferer())) {
            bundle2.putString("Referer", link.getReferer());
        }
        bundle2.putString("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36");
        for (Map.Entry<String, String> entry : link.getHeaders().entrySet()) {
            String string8 = entry.getKey();
            String string9 = entry.getValue();
            bundle2.putString(string8, string9);
        }
        Bundle bundle3 = bundle;
        intent3.putExtra("android.media.intent.extra.HTTP_HEADERS", bundle3);
        intent3.putExtra("secure_uri", true);
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
    }
}

