/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
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
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J8\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096@\u00a2\u0006\u0002\u0010\u0019J\u001a\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\nX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001d"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/LibreTorrentPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "<init>", "()V", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "oneSource", "", "getOneSource", "()Z", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nLibreTorrentPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LibreTorrentPackage.kt\ncom/lagradost/cloudstream3/actions/temp/LibreTorrentPackage\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,36:1\n29#2:37\n*S KotlinDebug\n*F\n+ 1 LibreTorrentPackage.kt\ncom/lagradost/cloudstream3/actions/temp/LibreTorrentPackage\n*L\n32#1:37\n*E\n"})
public final class LibreTorrentPackage
extends OpenInAppAction {
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes;
    private final boolean oneSource;

    public LibreTorrentPackage() {
        super(TextUtilKt.txt("LibreTorrent"), "org.proninyaroslav.libretorrent", "org.proninyaroslav.libretorrent.ui.addtorrent.AddTorrentActivity", null, 8, null);
        ExtractorLinkType[] extractorLinkTypeArray = new ExtractorLinkType[]{ExtractorLinkType.MAGNET, ExtractorLinkType.TORRENT};
        this.sourceTypes = SetsKt.setOf((Object[])extractorLinkTypeArray);
        this.oneSource = true;
    }

    @Override
    @NotNull
    public Set<ExtractorLinkType> getSourceTypes() {
        return this.sourceTypes;
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        List<ExtractorLink> list2 = result2.getLinks();
        Integer n = index;
        Intrinsics.checkNotNull((Object)n);
        String string2 = list2.get(n).getUrl();
        boolean bl = false;
        intent.setData(Uri.parse((String)string2));
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
    }
}

