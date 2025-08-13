/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Parcelable
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.OpenInAppActionKt;
import com.lagradost.cloudstream3.ui.player.SubtitleData;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@\u00a2\u0006\u0002\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006 "}, d2={"Lcom/lagradost/cloudstream3/actions/temp/MpvKtPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "appName", "", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "oneSource", "", "getOneSource", "()Z", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nMpvKtPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MpvKtPackage.kt\ncom/lagradost/cloudstream3/actions/temp/MpvKtPackage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,69:1\n1557#2:70\n1628#2,2:71\n1630#2:74\n29#3:73\n37#4:75\n36#4,3:76\n*S KotlinDebug\n*F\n+ 1 MpvKtPackage.kt\ncom/lagradost/cloudstream3/actions/temp/MpvKtPackage\n*L\n47#1:70\n47#1:71,2\n47#1:74\n47#1:73\n47#1:75\n47#1:76,3\n*E\n"})
public class MpvKtPackage
extends OpenInAppAction {
    private final boolean oneSource;
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes;

    public MpvKtPackage(@NotNull String appName, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter((Object)appName, (String)"appName");
        Intrinsics.checkNotNullParameter((Object)packageName, (String)"packageName");
        super(TextUtilKt.txt(appName), packageName, "live.mehiz.mpvkt.ui.player.PlayerActivity", null, 8, null);
        this.oneSource = true;
        ExtractorLinkType[] extractorLinkTypeArray = new ExtractorLinkType[]{ExtractorLinkType.VIDEO, ExtractorLinkType.DASH, ExtractorLinkType.M3U8};
        this.sourceTypes = SetsKt.setOf((Object[])extractorLinkTypeArray);
    }

    public /* synthetic */ MpvKtPackage(String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            string2 = "mpvKt";
        }
        if ((n & 2) != 0) {
            string3 = "live.mehiz.mpvkt";
        }
        this(string2, string3);
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

    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        return MpvKtPackage.putExtra$suspendImpl(this, context, intent, video, result2, index, $completion);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Object putExtra$suspendImpl(MpvKtPackage $this, Context context, Intent intent, ResultEpisode video, LinkLoadingResult result2, Integer index, Continuation<? super Unit> $completion) {
        Long l;
        void $this$toTypedArray\6;
        Collection<Uri> collection;
        void $this$mapTo\3;
        Collection collection2;
        Intent intent2;
        Integer n = index;
        ExtractorLink extractorLink = (ExtractorLink)CollectionsKt.getOrNull(result2.getLinks(), (int)(n != null ? n : 0));
        if (extractorLink == null) {
            return Unit.INSTANCE;
        }
        ExtractorLink link = extractorLink;
        Intent intent3 = intent2 = intent;
        boolean bl = false;
        Iterable iterable = result2.getSubs();
        String string2 = "subs";
        Intent intent4 = intent3;
        boolean bl2 = false;
        void var15_15 = collection2;
        Collection collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)collection2, (int)10));
        boolean bl3 = false;
        for (Object t : $this$mapTo\3) {
            void it\4;
            SubtitleData subtitleData = (SubtitleData)t;
            collection = collection3;
            boolean bl4 = false;
            String string3 = it\4.getUrl();
            boolean bl5 = false;
            collection.add(Uri.parse((String)string3));
        }
        collection = (List)collection3;
        collection2 = collection;
        boolean bl6 = false;
        void this_\6 = $this$toTypedArray\6;
        intent4.putExtra(string2, (Parcelable[])this_\6.toArray(new Uri[0]));
        intent3.setDataAndType(Uri.parse((String)link.getUrl()), "video/*");
        DataStoreHelper.PosDur posDur = DataStoreHelper.INSTANCE.getViewPos(Boxing.boxInt((int)video.getId()));
        Long l2 = l = posDur != null ? Boxing.boxLong((long)posDur.getPosition()) : null;
        if (l != null) {
            intent3.putExtra("position", (int)l.longValue());
        }
        intent3.putExtra("secure_uri", true);
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        Intent intent2 = intent;
        long position = intent2 != null ? (long)intent2.getIntExtra("position", -1) : -1L;
        Intent intent3 = intent;
        long duration = intent3 != null ? (long)intent3.getIntExtra("duration", -1) : -1L;
        OpenInAppActionKt.updateDurationAndPosition(position, duration);
    }

    public MpvKtPackage() {
        this(null, null, 3, null);
    }
}

