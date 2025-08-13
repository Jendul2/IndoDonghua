/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UiText;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0012\u001a\u00020\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J2\u0010\u0017\u001a\u00020\u00182\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096@\u00a2\u0006\u0002\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001e"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/PlayInBrowserAction;", "Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "<init>", "()V", "name", "Lcom/lagradost/cloudstream3/utils/UiText;", "getName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "oneSource", "", "getOneSource", "()Z", "isPlayer", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "shouldShow", "context", "Landroid/content/Context;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "runAction", "", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prereleaseDebug"})
public final class PlayInBrowserAction
extends VideoClickAction {
    @NotNull
    private final UiText name;
    private final boolean oneSource;
    private final boolean isPlayer;
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes;

    public PlayInBrowserAction() {
        Object[] objectArray = new Object[]{"Browser"};
        this.name = TextUtilKt.txt(R.string.episode_action_play_in_format, objectArray);
        this.oneSource = true;
        this.isPlayer = true;
        objectArray = new ExtractorLinkType[]{ExtractorLinkType.VIDEO, ExtractorLinkType.DASH, ExtractorLinkType.M3U8};
        this.sourceTypes = SetsKt.setOf((Object[])objectArray);
    }

    @Override
    @NotNull
    public UiText getName() {
        return this.name;
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    public boolean isPlayer() {
        return this.isPlayer;
    }

    @Override
    @NotNull
    public Set<ExtractorLinkType> getSourceTypes() {
        return this.sourceTypes;
    }

    @Override
    public boolean shouldShow(@Nullable Context context, @Nullable ResultEpisode video) {
        return true;
    }

    @Override
    @Nullable
    public Object runAction(@Nullable Context context, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        Integer n = index;
        ExtractorLink extractorLink = (ExtractorLink)CollectionsKt.getOrNull(result2.getLinks(), (int)(n != null ? n : 0));
        if (extractorLink == null) {
            return Unit.INSTANCE;
        }
        ExtractorLink link = extractorLink;
        Intent i = new Intent("android.intent.action.VIEW");
        i.setData(Uri.parse((String)link.getUrl()));
        Object object = VideoClickAction.launch$default(this, i, null, $completion, 2, null);
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return object;
        }
        return Unit.INSTANCE;
    }
}

