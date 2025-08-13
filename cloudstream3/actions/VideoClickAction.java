/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.activity.result.ActivityResultLauncher
 *  androidx.core.app.ActivityOptionsCompat
 *  kotlin.Metadata
 *  kotlin.NotImplementedError
 *  kotlin.Result
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.CoroutineContext
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Reflection
 *  kotlin.reflect.KClass
 *  kotlin.reflect.jvm.KClassesJvm
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Dispatchers
 *  kotlinx.coroutines.Job
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import androidx.core.app.ActivityOptionsCompat;
import com.lagradost.cloudstream3.CommonActivity;
import com.lagradost.cloudstream3.ErrorLoadingException;
import com.lagradost.cloudstream3.MainActivity;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.UiText;
import java.lang.invoke.LambdaMetafactory;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.KClassesJvm;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0018\u001a\u0004\u0018\u0001H\u0019\"\u0004\b\u0000\u0010\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u0002H\u00190\u001bH\u0086@\u00a2\u0006\u0002\u0010\u001cJ$\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"H\u0086@\u00a2\u0006\u0002\u0010#J$\u0010$\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&H\u0086@\u00a2\u0006\u0002\u0010'J\u0006\u0010(\u001a\u00020\u0013J\u001c\u0010)\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H&J\u001a\u0010.\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-J2\u0010/\u001a\u00020\u001e2\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103H\u00a6@\u00a2\u0006\u0002\u00104J/\u00105\u001a\u0002062\b\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\u0006\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u000103\u00a2\u0006\u0002\u00107R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00068"}, d2={"Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "", "<init>", "()V", "name", "Lcom/lagradost/cloudstream3/utils/UiText;", "getName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "oneSource", "", "getOneSource", "()Z", "isPlayer", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "sourcePlugin", "", "getSourcePlugin", "()Ljava/lang/String;", "setSourcePlugin", "(Ljava/lang/String;)V", "uiThread", "T", "callable", "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launchResult", "", "intent", "Landroid/content/Intent;", "options", "Landroidx/core/app/ActivityOptionsCompat;", "(Landroid/content/Intent;Landroidx/core/app/ActivityOptionsCompat;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "launch", "bundle", "Landroid/os/Bundle;", "(Landroid/content/Intent;Landroid/os/Bundle;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uniqueId", "shouldShow", "context", "Landroid/content/Context;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "shouldShowSafe", "runAction", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runActionSafe", "Lkotlinx/coroutines/Job;", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;)Lkotlinx/coroutines/Job;", "app_prereleaseDebug"})
public abstract class VideoClickAction {
    private final boolean oneSource;
    private final boolean isPlayer;
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes = CollectionsKt.toSet((Iterable)((Iterable)ExtractorLinkType.getEntries()));
    @Nullable
    private String sourcePlugin;

    @NotNull
    public abstract UiText getName();

    public boolean getOneSource() {
        return this.oneSource;
    }

    public boolean isPlayer() {
        return this.isPlayer;
    }

    @NotNull
    public Set<ExtractorLinkType> getSourceTypes() {
        return this.sourceTypes;
    }

    @Nullable
    public final String getSourcePlugin() {
        return this.sourcePlugin;
    }

    public final void setSourcePlugin(@Nullable String string2) {
        this.sourcePlugin = string2;
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final <T> Object uiThread(@NotNull Callable<T> var1_1, @NotNull Continuation<? super T> $completion) {
        if (!($completion instanceof uiThread.1)) ** GOTO lbl-1000
        var7_3 = $completion;
        if ((var7_3.label & -2147483648) != 0) {
            var7_3.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(this, $completion){
                /* synthetic */ Object result;
                final /* synthetic */ VideoClickAction this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.uiThread(null, (Continuation)this);
                }
            };
        }
        $result = $continuation.result;
        var8_5 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                future = new FutureTask<Result<T>>((Callable<Result>)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, uiThread$lambda$0(java.util.concurrent.Callable ), ()Lkotlin/Result;)((Callable)callable));
                v0 = CommonActivity.INSTANCE.getActivity();
                if (v0 == null) {
                    throw new ErrorLoadingException("No UI Activity, this should never happened");
                }
                v0.runOnUiThread((Runnable)future);
                $continuation.label = 1;
                v1 = BuildersKt.withContext((CoroutineContext)((CoroutineContext)Dispatchers.getIO()), (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super Result<? extends T>>, Object>(future, null){
                    int label;
                    final /* synthetic */ FutureTask<Result<T>> $future;
                    {
                        this.$future = $future;
                        super(2, $completion);
                    }

                    public final Object invokeSuspend(Object object) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0: {
                                ResultKt.throwOnFailure((Object)object);
                                return this.$future.get();
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }

                    public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                        return (Continuation)new /* invalid duplicate definition of identical inner class */;
                    }

                    public final Object invoke(CoroutineScope p1, Continuation<? super Result<? extends T>> p2) {
                        return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                    }
                }), $continuation);
                if (v1 == var8_5) {
                    return var8_5;
                }
                ** GOTO lbl25
            }
            case 1: {
                ResultKt.throwOnFailure((Object)$result);
                v1 = $result;
lbl25:
                // 2 sources

                result = (Result)v1;
                Intrinsics.checkNotNull((Object)result);
                var5_8 = result.unbox-impl();
                ResultKt.throwOnFailure((Object)var5_8);
                return var5_8;
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Nullable
    public final Object launchResult(@Nullable Intent intent, @Nullable ActivityOptionsCompat options, @NotNull Continuation<? super Unit> $completion) {
        if (intent == null) {
            return Unit.INSTANCE;
        }
        return this.uiThread(() -> VideoClickAction.launchResult$lambda$1(intent, options), $completion);
    }

    public static /* synthetic */ Object launchResult$default(VideoClickAction videoClickAction, Intent intent, ActivityOptionsCompat activityOptionsCompat, Continuation continuation, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchResult");
        }
        if ((n & 2) != 0) {
            activityOptionsCompat = null;
        }
        return videoClickAction.launchResult(intent, activityOptionsCompat, (Continuation<? super Unit>)continuation);
    }

    @Nullable
    public final Object launch(@Nullable Intent intent, @Nullable Bundle bundle, @NotNull Continuation<? super Unit> $completion) {
        if (intent == null) {
            return Unit.INSTANCE;
        }
        return this.uiThread(() -> VideoClickAction.launch$lambda$2(intent, bundle), $completion);
    }

    public static /* synthetic */ Object launch$default(VideoClickAction videoClickAction, Intent intent, Bundle bundle, Continuation continuation, int n, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launch");
        }
        if ((n & 2) != 0) {
            bundle = null;
        }
        return videoClickAction.launch(intent, bundle, (Continuation<? super Unit>)continuation);
    }

    @NotNull
    public final String uniqueId() {
        return this.sourcePlugin + ':' + KClassesJvm.getJvmName((KClass)Reflection.getOrCreateKotlinClass(this.getClass()));
    }

    public abstract boolean shouldShow(@Nullable Context var1, @Nullable ResultEpisode var2);

    public final boolean shouldShowSafe(@Nullable Context context, @Nullable ResultEpisode video) {
        boolean bl;
        try {
            bl = this.shouldShow(context, video);
        }
        catch (Throwable t) {
            ArchComponentExtKt.logError(t);
            bl = false;
        }
        return bl;
    }

    @Nullable
    public abstract Object runAction(@Nullable Context var1, @NotNull ResultEpisode var2, @NotNull LinkLoadingResult var3, @Nullable Integer var4, @NotNull Continuation<? super Unit> var5);

    @NotNull
    public final Job runActionSafe(@Nullable Context context, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index) {
        Intrinsics.checkNotNullParameter((Object)video, (String)"video");
        Intrinsics.checkNotNullParameter((Object)result2, (String)"result");
        return Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, VideoClickAction, Continuation<? super Unit>, Object>(this, context, video, result2, index, null){
            int label;
            final /* synthetic */ VideoClickAction this$0;
            final /* synthetic */ Context $context;
            final /* synthetic */ ResultEpisode $video;
            final /* synthetic */ LinkLoadingResult $result;
            final /* synthetic */ Integer $index;
            {
                this.this$0 = $receiver;
                this.$context = $context;
                this.$video = $video;
                this.$result = $result;
                this.$index = $index;
                super(3, $completion);
            }

            /*
             * WARNING - void declaration
             * Enabled force condition propagation
             * Lifted jumps to return sites
             */
            public final Object invokeSuspend(Object object) {
                Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)object);
                        this.label = 1;
                        Object object3 = this.this$0.runAction(this.$context, this.$video, this.$result, this.$index, (Continuation<? super Unit>)((Continuation)this));
                        if (object3 != object2) return Unit.INSTANCE;
                        return object2;
                    }
                    case 1: {
                        Object object3;
                        try {
                            void $result;
                            ResultKt.throwOnFailure((Object)$result);
                            object3 = $result;
                            return Unit.INSTANCE;
                        }
                        catch (NotImplementedError notImplementedError) {
                            CommonActivity.INSTANCE.showToast("runAction has not been implemented for " + this.this$0.getName().asStringNull(this.$context) + ", please contact the extension developer of " + this.this$0.getSourcePlugin(), Boxing.boxInt((int)1));
                            return Unit.INSTANCE;
                        }
                        catch (ErrorLoadingException error) {
                            CommonActivity.INSTANCE.showToast(error.getMessage(), Boxing.boxInt((int)1));
                            return Unit.INSTANCE;
                        }
                        catch (ActivityNotFoundException error) {
                            CommonActivity.INSTANCE.showToast(R.string.app_not_found_error, Boxing.boxInt((int)1));
                            return Unit.INSTANCE;
                        }
                        catch (Throwable t) {
                            ArchComponentExtKt.logError(t);
                            CommonActivity.INSTANCE.showToast(t.toString(), Boxing.boxInt((int)1));
                        }
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, VideoClickAction p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
    }

    private static final Result uiThread$lambda$0(Callable $callable) {
        Object object;
        try {
            object = Result.constructor-impl($callable.call());
        }
        catch (Throwable t) {
            object = Result.constructor-impl((Object)ResultKt.createFailure((Throwable)t));
        }
        return Result.box-impl((Object)object);
    }

    private static final Unit launchResult$lambda$1(Intent $intent, ActivityOptionsCompat $options) {
        Unit unit;
        ActivityResultLauncher<Intent> activityResultLauncher = MainActivity.Companion.getActivityResultLauncher();
        if (activityResultLauncher != null) {
            activityResultLauncher.launch((Object)$intent, $options);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }

    private static final Unit launch$lambda$2(Intent $intent, Bundle $bundle) {
        Unit unit;
        Activity activity = CommonActivity.INSTANCE.getActivity();
        if (activity != null) {
            activity.startActivity($intent, $bundle);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }
}

