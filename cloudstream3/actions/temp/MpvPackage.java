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
import com.lagradost.api.Log;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.OpenInAppActionKt;
import com.lagradost.cloudstream3.ui.player.SubtitleData;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/MpvPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "appName", "", "packageName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "oneSource", "", "getOneSource", "()Z", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nMpvPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MpvPackage.kt\ncom/lagradost/cloudstream3/actions/temp/MpvPackage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,66:1\n1557#2:67\n1628#2,2:68\n1630#2:71\n29#3:70\n37#4:72\n36#4,3:73\n*S KotlinDebug\n*F\n+ 1 MpvPackage.kt\ncom/lagradost/cloudstream3/actions/temp/MpvPackage\n*L\n43#1:67\n43#1:68,2\n43#1:71\n43#1:70\n43#1:72\n43#1:73,3\n*E\n"})
public class MpvPackage
extends OpenInAppAction {
    private final boolean oneSource;

    public MpvPackage(@NotNull String appName, @NotNull String packageName) {
        Intrinsics.checkNotNullParameter((Object)appName, (String)"appName");
        Intrinsics.checkNotNullParameter((Object)packageName, (String)"packageName");
        super(TextUtilKt.txt(appName), packageName, "is.xyz.mpv.MPVActivity", null, 8, null);
        this.oneSource = true;
    }

    public /* synthetic */ MpvPackage(String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            string2 = "MPV";
        }
        if ((n & 2) != 0) {
            string3 = "is.xyz.mpv";
        }
        this(string2, string3);
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        return MpvPackage.putExtra$suspendImpl(this, context, intent, video, result2, index, $completion);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Object putExtra$suspendImpl(MpvPackage $this, Context context, Intent intent, ResultEpisode video, LinkLoadingResult result2, Integer index, Continuation<? super Unit> $completion) {
        Long l;
        Intent intent2;
        Collection<Uri> collection;
        void $this$mapTo\3;
        Collection collection2;
        Intent intent3;
        Intent intent4 = intent3 = intent;
        boolean bl = false;
        Iterable iterable = result2.getSubs();
        String string2 = "subs";
        Intent intent5 = intent4;
        boolean bl2 = false;
        void var14_14 = collection2;
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
        void this_\6 = intent2;
        intent5.putExtra(string2, (Parcelable[])this_\6.toArray(new Uri[0]));
        intent4.putExtra("title", video.getName());
        if (index != null) {
            Object object = (ExtractorLink)CollectionsKt.getOrNull(result2.getLinks(), (int)index);
            if (object == null || (object = ((ExtractorLink)object).getUrl()) == null) {
                return Unit.INSTANCE;
            }
            intent2 = intent4.setDataAndType(Uri.parse((String)object), "video/*");
            Intrinsics.checkNotNull((Object)intent2);
        } else {
            OpenInAppActionKt.makeTempM3U8Intent(context, intent4, result2);
        }
        DataStoreHelper.PosDur posDur = DataStoreHelper.INSTANCE.getViewPos(Boxing.boxInt((int)video.getId()));
        Long l2 = l = posDur != null ? Boxing.boxLong((long)posDur.getPosition()) : null;
        if (l != null) {
            intent4.putExtra("position", (int)l.longValue());
        }
        intent4.putExtra("secure_uri", true);
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        Intent intent2 = intent;
        int position = intent2 != null ? intent2.getIntExtra("position", -1) : -1;
        Intent intent3 = intent;
        int duration = intent3 != null ? intent3.getIntExtra("duration", -1) : -1;
        Log.INSTANCE.d("MPV", "Position: " + position + ", Duration: " + duration);
        OpenInAppActionKt.updateDurationAndPosition(position, duration);
    }

    public MpvPackage() {
        this(null, null, 3, null);
    }
}

