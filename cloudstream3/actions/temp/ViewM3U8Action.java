/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp;

import android.content.Context;
import android.content.Intent;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.OpenInAppActionKt;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UiText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u000b\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J2\u0010\u0010\u001a\u00020\u00112\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096@\u00a2\u0006\u0002\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\n\u00a8\u0006\u0017"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/ViewM3U8Action;", "Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "<init>", "()V", "name", "Lcom/lagradost/cloudstream3/utils/UiText;", "getName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "isPlayer", "", "()Z", "shouldShow", "context", "Landroid/content/Context;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "runAction", "", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_prereleaseDebug"})
public final class ViewM3U8Action
extends VideoClickAction {
    @NotNull
    private final UiText name;
    private final boolean isPlayer;

    public ViewM3U8Action() {
        Object[] objectArray = new Object[]{"m3u8 player"};
        this.name = TextUtilKt.txt(R.string.episode_action_play_in_format, objectArray);
        this.isPlayer = true;
    }

    @Override
    @NotNull
    public UiText getName() {
        return this.name;
    }

    @Override
    public boolean isPlayer() {
        return this.isPlayer;
    }

    @Override
    public boolean shouldShow(@Nullable Context context, @Nullable ResultEpisode video) {
        return true;
    }

    @Override
    @Nullable
    public Object runAction(@Nullable Context context, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        if (context == null) {
            return Unit.INSTANCE;
        }
        Intent i = new Intent("android.intent.action.VIEW");
        OpenInAppActionKt.makeTempM3U8Intent(context, i, result2);
        Object object = VideoClickAction.launch$default(this, i, null, $completion, 2, null);
        if (object == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return object;
        }
        return Unit.INSTANCE;
    }
}

