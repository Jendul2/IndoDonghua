/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  kotlin.Metadata
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.AppContextUtils;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UiText;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J2\u0010\u0018\u001a\u00020\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096@\u00a2\u0006\u0002\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010 \u001a\u00020!2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00a6@\u00a2\u0006\u0002\u0010\"J\u001a\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!H&J\u0018\u0010&\u001a\u00020\u00192\u0006\u0010$\u001a\u00020%2\b\u0010 \u001a\u0004\u0018\u00010!R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0012\u00a8\u0006'"}, d2={"Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "appName", "Lcom/lagradost/cloudstream3/utils/UiText;", "packageName", "", "intentClass", "action", "<init>", "(Lcom/lagradost/cloudstream3/utils/UiText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "getPackageName", "()Ljava/lang/String;", "name", "getName", "isPlayer", "", "()Z", "shouldShow", "context", "Landroid/content/Context;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "runAction", "", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putExtra", "intent", "Landroid/content/Intent;", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "onResultSafe", "app_prereleaseDebug"})
public abstract class OpenInAppAction
extends VideoClickAction {
    @NotNull
    private final UiText appName;
    @NotNull
    private final String packageName;
    @Nullable
    private final String intentClass;
    @NotNull
    private final String action;
    private final boolean isPlayer;

    public OpenInAppAction(@NotNull UiText appName, @NotNull String packageName, @Nullable String intentClass, @NotNull String action) {
        Intrinsics.checkNotNullParameter((Object)appName, (String)"appName");
        Intrinsics.checkNotNullParameter((Object)packageName, (String)"packageName");
        Intrinsics.checkNotNullParameter((Object)action, (String)"action");
        this.appName = appName;
        this.packageName = packageName;
        this.intentClass = intentClass;
        this.action = action;
        this.isPlayer = true;
    }

    public /* synthetic */ OpenInAppAction(UiText uiText, String string2, String string3, String string4, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            string3 = null;
        }
        if ((n & 8) != 0) {
            string4 = "android.intent.action.VIEW";
        }
        this(uiText, string2, string3, string4);
    }

    @NotNull
    public UiText getAppName() {
        return this.appName;
    }

    @NotNull
    public String getPackageName() {
        return this.packageName;
    }

    @Override
    @NotNull
    public UiText getName() {
        Object[] objectArray = new Object[]{this.getAppName()};
        return TextUtilKt.txt(R.string.episode_action_play_in_format, objectArray);
    }

    @Override
    public boolean isPlayer() {
        return this.isPlayer;
    }

    @Override
    public boolean shouldShow(@Nullable Context context, @Nullable ResultEpisode video) {
        Context context2 = context;
        return !(context2 != null ? !AppContextUtils.INSTANCE.isAppInstalled(context2, this.getPackageName()) : false);
    }

    @Override
    @Nullable
    public Object runAction(@Nullable Context context, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        return OpenInAppAction.runAction$suspendImpl(this, context, video, result2, index, $completion);
    }

    /*
     * Unable to fully structure code
     */
    static /* synthetic */ Object runAction$suspendImpl(OpenInAppAction var0, Context var1_1, ResultEpisode var2_2, LinkLoadingResult var3_3, Integer var4_4, Continuation<? super Unit> $completion) {
        if (!($completion instanceof runAction.1)) ** GOTO lbl-1000
        var8_6 = $completion;
        if ((var8_6.label & -2147483648) != 0) {
            var8_6.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(var0, $completion){
                Object L$0;
                Object L$1;
                Object L$2;
                /* synthetic */ Object result;
                final /* synthetic */ OpenInAppAction this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return OpenInAppAction.runAction$suspendImpl(this.this$0, null, null, null, null, (Continuation<? super Unit>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var9_8 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                if (context == null) {
                    return Unit.INSTANCE;
                }
                intent = new Intent($this.action);
                intent.setPackage($this.getPackageName());
                if ($this.intentClass != null) {
                    intent.setComponent(new ComponentName($this.getPackageName(), $this.intentClass));
                }
                $continuation.L$0 = $this;
                $continuation.L$1 = video;
                $continuation.L$2 = intent;
                $continuation.label = 1;
                v0 = $this.putExtra((Context)context, intent, video, (LinkLoadingResult)result, (Integer)index, (Continuation<? super Unit>)$continuation);
                if (v0 == var9_8) {
                    return var9_8;
                }
                ** GOTO lbl34
            }
            case 1: {
                intent = (Intent)$continuation.L$2;
                video = (ResultEpisode)$continuation.L$1;
                $this = (OpenInAppAction)$continuation.L$0;
                ResultKt.throwOnFailure((Object)$result);
                v0 = $result;
lbl34:
                // 2 sources

                AcraApplication.Companion.setKey("last_opened_id", Boxing.boxInt((int)video.getId()));
                $continuation.L$0 = null;
                $continuation.L$1 = null;
                $continuation.L$2 = null;
                $continuation.label = 2;
                v1 = VideoClickAction.launchResult$default($this, intent, null, (Continuation)$continuation, 2, null);
                if (v1 == var9_8) {
                    return var9_8;
                }
                ** GOTO lbl46
            }
            case 2: {
                ResultKt.throwOnFailure((Object)$result);
                v1 = $result;
lbl46:
                // 2 sources

                return Unit.INSTANCE;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    public abstract Object putExtra(@NotNull Context var1, @NotNull Intent var2, @NotNull ResultEpisode var3, @NotNull LinkLoadingResult var4, @Nullable Integer var5, @NotNull Continuation<? super Unit> var6);

    public abstract void onResult(@NotNull Activity var1, @Nullable Intent var2);

    public final void onResultSafe(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        try {
            this.onResult(activity, intent);
        }
        catch (Throwable t) {
            ArchComponentExtKt.logError(t);
        }
    }
}

