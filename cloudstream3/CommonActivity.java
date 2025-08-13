/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PictureInPictureParams$Builder
 *  android.content.Context
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.Toast
 *  androidx.activity.ComponentActivity
 *  androidx.activity.result.ActivityResult
 *  androidx.activity.result.ActivityResultLauncher
 *  androidx.activity.result.contract.ActivityResultContract
 *  androidx.activity.result.contract.ActivityResultContracts$RequestPermission
 *  androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
 *  androidx.annotation.MainThread
 *  androidx.annotation.StringRes
 *  androidx.appcompat.widget.SearchView
 *  androidx.appcompat.widget.SearchView$SearchAutoComplete
 *  androidx.core.content.ContextCompat
 *  androidx.core.view.ViewGroupKt
 *  androidx.preference.PreferenceManager
 *  com.google.android.gms.cast.framework.CastSession
 *  com.google.android.material.chip.ChipGroup
 *  com.google.android.material.navigationrail.NavigationRailView
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.Pair
 *  kotlin.ResultKt
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.MapsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.sequences.Sequence
 *  kotlin.text.StringsKt
 *  kotlinx.coroutines.CoroutineScope
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.schabi.newpipe.extractor.NewPipe
 *  org.schabi.newpipe.extractor.downloader.Downloader
 */
package com.lagradost.cloudstream3;

import android.app.Activity;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.MainThread;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewGroupKt;
import androidx.preference.PreferenceManager;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.navigationrail.NavigationRailView;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.DownloaderTestImpl;
import com.lagradost.cloudstream3.FocusDirection;
import com.lagradost.cloudstream3.MainActivity;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.actions.VideoClickActionHolder;
import com.lagradost.cloudstream3.databinding.ToastBinding;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.ui.player.PlayerEventType;
import com.lagradost.cloudstream3.ui.player.Torrent;
import com.lagradost.cloudstream3.ui.settings.Globals;
import com.lagradost.cloudstream3.utils.AppContextUtils;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.cloudstream3.utils.DataStore;
import com.lagradost.cloudstream3.utils.Event;
import com.lagradost.cloudstream3.utils.UIHelper;
import com.lagradost.cloudstream3.utils.UiText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.schabi.newpipe.extractor.NewPipe;
import org.schabi.newpipe.extractor.downloader.Downloader;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011*\u0004\u0018\u00010\u0006H\u0007J!\u0010?\u001a\u00020\u000e2\b\b\u0001\u0010@\u001a\u00020\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010BJ!\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010DJ!\u0010?\u001a\u00020\u000e2\b\u0010@\u001a\u0004\u0018\u00010E2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010FJ\"\u0010?\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u00062\u0006\u0010H\u001a\u00020E2\u0006\u0010A\u001a\u00020\u0017H\u0007J-\u0010?\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010@\u001a\u00020\u00172\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0017H\u0007\u00a2\u0006\u0002\u0010IJ-\u0010?\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u00062\b\u0010@\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0017H\u0007\u00a2\u0006\u0002\u0010KJ\u001a\u0010S\u001a\u00020\u000e2\b\u0010T\u001a\u0004\u0018\u00010U2\b\u0010V\u001a\u0004\u0018\u00010CJ\n\u0010W\u001a\u00020\u000e*\u00020UJ\u000e\u0010X\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u0006J\f\u0010Y\u001a\u00020\u000e*\u00020\u0006H\u0002J\u0010\u0010Z\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u0006J\u000e\u0010[\u001a\u00020\u000e2\u0006\u0010G\u001a\u00020\u0006J\u0010\u0010\\\u001a\u00020\u00172\u0006\u0010G\u001a\u00020\u0006H\u0002J\u0010\u0010]\u001a\u00020\u000e2\b\u0010G\u001a\u0004\u0018\u00010\u0006J\u001a\u0010^\u001a\u0004\u0018\u00010_2\u0006\u0010`\u001a\u00020_2\u0006\u0010a\u001a\u00020\u0017H\u0002J\f\u0010b\u001a\u00020!*\u00020_H\u0002J4\u0010c\u001a\u0004\u0018\u00010_2\b\u0010d\u001a\u0004\u0018\u00010\u00012\u0006\u0010e\u001a\u00020_2\u0006\u0010f\u001a\u00020g2\u0006\u0010h\u001a\u00020\u00172\b\b\u0002\u0010i\u001a\u00020\u0017J.\u0010j\u001a\u0004\u0018\u00010_2\b\u0010d\u001a\u0004\u0018\u00010\u00012\b\u0010e\u001a\u0004\u0018\u00010_2\u0006\u0010f\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\u0017J)\u0010k\u001a\u0004\u0018\u00010!2\b\u0010G\u001a\u0004\u0018\u00010\u00062\u0006\u0010l\u001a\u00020\u00172\b\u0010m\u001a\u0004\u0018\u00010:\u00a2\u0006\u0002\u0010nJ!\u0010o\u001a\u0004\u0018\u00010!2\b\u0010G\u001a\u0004\u0018\u00010\u00062\b\u0010m\u001a\u0004\u0018\u00010:\u00a2\u0006\u0002\u0010pR\u0016\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00068F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0016\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u001c\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u001e\u001a\u00020\u00178F\u00a2\u0006\u0006\u001a\u0004\b\u001f\u0010\u0019R\u001a\u0010 \u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001a\u0010)\u001a\u00020!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010#\"\u0004\b*\u0010%R#\u0010+\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170-0,\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170,\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010/R(\u00102\u001a\u0010\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000e\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R6\u00109\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010:\u0012\u0004\u0012\u00020!0-\u0012\u0004\u0012\u00020!\u0018\u000103X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u0010\u0010=\u001a\u0004\u0018\u00010>X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020CX\u0086T\u00a2\u0006\u0002\n\u0000R=\u0010L\u001a.\u0012\u0004\u0012\u00020C\u0012\f\u0012\n O*\u0004\u0018\u00010N0N0Mj\u0016\u0012\u0004\u0012\u00020C\u0012\f\u0012\n O*\u0004\u0018\u00010N0N`P\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010R\u00a8\u0006q"}, d2={"Lcom/lagradost/cloudstream3/CommonActivity;", "", "<init>", "()V", "_activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;", "value", "activity", "getActivity", "()Landroid/app/Activity;", "setActivity", "(Landroid/app/Activity;)V", "setActivityInstance", "", "newActivity", "getCastSession", "Lcom/google/android/gms/cast/framework/CastSession;", "displayMetrics", "Landroid/util/DisplayMetrics;", "getDisplayMetrics", "()Landroid/util/DisplayMetrics;", "screenWidth", "", "getScreenWidth", "()I", "screenHeight", "getScreenHeight", "screenWidthWithOrientation", "getScreenWidthWithOrientation", "screenHeightWithOrientation", "getScreenHeightWithOrientation", "canEnterPipMode", "", "getCanEnterPipMode", "()Z", "setCanEnterPipMode", "(Z)V", "canShowPipMode", "getCanShowPipMode", "setCanShowPipMode", "isInPIPMode", "setInPIPMode", "onColorSelectedEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "Lkotlin/Pair;", "getOnColorSelectedEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "onDialogDismissedEvent", "getOnDialogDismissedEvent", "playerEventListener", "Lkotlin/Function1;", "Lcom/lagradost/cloudstream3/ui/player/PlayerEventType;", "getPlayerEventListener", "()Lkotlin/jvm/functions/Function1;", "setPlayerEventListener", "(Lkotlin/jvm/functions/Function1;)V", "keyEventListener", "Landroid/view/KeyEvent;", "getKeyEventListener", "setKeyEventListener", "currentToast", "Landroid/widget/Toast;", "showToast", "message", "duration", "(ILjava/lang/Integer;)V", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/lagradost/cloudstream3/utils/UiText;", "(Lcom/lagradost/cloudstream3/utils/UiText;Ljava/lang/Integer;)V", "act", "text", "(Landroid/app/Activity;ILjava/lang/Integer;)V", "TAG", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Integer;)V", "appLanguageExceptions", "Ljava/util/HashMap;", "Ljava/util/Locale;", "kotlin.jvm.PlatformType", "Lkotlin/collections/HashMap;", "getAppLanguageExceptions", "()Ljava/util/HashMap;", "setLocale", "context", "Landroid/content/Context;", "languageCode", "updateLocale", "init", "enterPIPMode", "onUserLeaveHint", "updateTheme", "mapSystemTheme", "loadThemes", "localLook", "Landroid/view/View;", "from", "id", "hasContent", "continueGetNextFocus", "root", "view", "direction", "Lcom/lagradost/cloudstream3/FocusDirection;", "nextId", "depth", "getNextFocus", "onKeyDown", "keyCode", "event", "(Landroid/app/Activity;ILandroid/view/KeyEvent;)Ljava/lang/Boolean;", "dispatchKeyEvent", "(Landroid/app/Activity;Landroid/view/KeyEvent;)Ljava/lang/Boolean;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nCommonActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonActivity.kt\ncom/lagradost/cloudstream3/CommonActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n+ 5 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n*L\n1#1,658:1\n1#2:659\n183#3,2:660\n194#4:662\n192#5:663\n183#5,3:664\n174#5:667\n186#5,2:668\n*S KotlinDebug\n*F\n+ 1 CommonActivity.kt\ncom/lagradost/cloudstream3/CommonActivity\n*L\n446#1:660,2\n242#1:662\n242#1:663\n242#1:664,3\n242#1:667\n242#1:668,2\n*E\n"})
public final class CommonActivity {
    @NotNull
    public static final CommonActivity INSTANCE = new CommonActivity();
    @Nullable
    private static WeakReference<Activity> _activity;
    @NotNull
    private static final DisplayMetrics displayMetrics;
    private static boolean canEnterPipMode;
    private static boolean canShowPipMode;
    private static boolean isInPIPMode;
    @NotNull
    private static final Event<Pair<Integer, Integer>> onColorSelectedEvent;
    @NotNull
    private static final Event<Integer> onDialogDismissedEvent;
    @Nullable
    private static Function1<? super PlayerEventType, Unit> playerEventListener;
    @Nullable
    private static Function1<? super Pair<? extends KeyEvent, Boolean>, Boolean> keyEventListener;
    @Nullable
    private static Toast currentToast;
    @NotNull
    public static final String TAG = "COMPACT";
    @NotNull
    private static final HashMap<String, Locale> appLanguageExceptions;

    private CommonActivity() {
    }

    @Nullable
    public final Activity getActivity() {
        WeakReference<Activity> weakReference = _activity;
        return weakReference != null ? (Activity)weakReference.get() : null;
    }

    private final void setActivity(Activity value) {
        _activity = new WeakReference<Activity>(value);
    }

    @MainThread
    public final void setActivityInstance(@Nullable Activity newActivity) {
        this.setActivity(newActivity);
    }

    @MainThread
    @Nullable
    public final CastSession getCastSession(@Nullable Activity $this$getCastSession) {
        MainActivity mainActivity = (MainActivity)$this$getCastSession;
        return mainActivity != null && (mainActivity = mainActivity.getMSessionManager()) != null ? mainActivity.getCurrentCastSession() : null;
    }

    @NotNull
    public final DisplayMetrics getDisplayMetrics() {
        return displayMetrics;
    }

    public final int getScreenWidth() {
        return Math.max(CommonActivity.displayMetrics.widthPixels, CommonActivity.displayMetrics.heightPixels);
    }

    public final int getScreenHeight() {
        return Math.min(CommonActivity.displayMetrics.widthPixels, CommonActivity.displayMetrics.heightPixels);
    }

    public final int getScreenWidthWithOrientation() {
        return CommonActivity.displayMetrics.widthPixels;
    }

    public final int getScreenHeightWithOrientation() {
        return CommonActivity.displayMetrics.heightPixels;
    }

    public final boolean getCanEnterPipMode() {
        return canEnterPipMode;
    }

    public final void setCanEnterPipMode(boolean bl) {
        canEnterPipMode = bl;
    }

    public final boolean getCanShowPipMode() {
        return canShowPipMode;
    }

    public final void setCanShowPipMode(boolean bl) {
        canShowPipMode = bl;
    }

    public final boolean isInPIPMode() {
        return isInPIPMode;
    }

    public final void setInPIPMode(boolean bl) {
        isInPIPMode = bl;
    }

    @NotNull
    public final Event<Pair<Integer, Integer>> getOnColorSelectedEvent() {
        return onColorSelectedEvent;
    }

    @NotNull
    public final Event<Integer> getOnDialogDismissedEvent() {
        return onDialogDismissedEvent;
    }

    @Nullable
    public final Function1<PlayerEventType, Unit> getPlayerEventListener() {
        return playerEventListener;
    }

    public final void setPlayerEventListener(@Nullable Function1<? super PlayerEventType, Unit> function1) {
        playerEventListener = function1;
    }

    @Nullable
    public final Function1<Pair<? extends KeyEvent, Boolean>, Boolean> getKeyEventListener() {
        return keyEventListener;
    }

    public final void setKeyEventListener(@Nullable Function1<? super Pair<? extends KeyEvent, Boolean>, Boolean> function1) {
        keyEventListener = function1;
    }

    public final void showToast(@StringRes int message, @Nullable Integer duration) {
        Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        Activity act = activity;
        act.runOnUiThread(() -> CommonActivity.showToast$lambda$0(act, message, duration));
    }

    public static /* synthetic */ void showToast$default(CommonActivity commonActivity, int n, Integer n2, int n3, Object object) {
        if ((n3 & 2) != 0) {
            n2 = null;
        }
        commonActivity.showToast(n, n2);
    }

    public final void showToast(@Nullable String message, @Nullable Integer duration) {
        Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        Activity act = activity;
        act.runOnUiThread(() -> CommonActivity.showToast$lambda$1(act, message, duration));
    }

    public static /* synthetic */ void showToast$default(CommonActivity commonActivity, String string2, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        commonActivity.showToast(string2, n);
    }

    public final void showToast(@Nullable UiText message, @Nullable Integer duration) {
        Activity activity = this.getActivity();
        if (activity == null) {
            return;
        }
        Activity act = activity;
        if (message == null) {
            return;
        }
        act.runOnUiThread(() -> CommonActivity.showToast$lambda$2(act, message, duration));
    }

    public static /* synthetic */ void showToast$default(CommonActivity commonActivity, UiText uiText, Integer n, int n2, Object object) {
        if ((n2 & 2) != 0) {
            n = null;
        }
        commonActivity.showToast(uiText, n);
    }

    @MainThread
    public final void showToast(@Nullable Activity act, @NotNull UiText text, int duration) {
        block1: {
            Intrinsics.checkNotNullParameter((Object)text, (String)"text");
            if (act == null) {
                return;
            }
            String string2 = text.asStringNull((Context)act);
            if (string2 == null) break block1;
            String string3 = string2;
            boolean bl = false;
            INSTANCE.showToast(act, string3, (Integer)duration);
        }
    }

    @MainThread
    public final void showToast(@Nullable Activity act, @StringRes int message, @Nullable Integer duration) {
        if (act == null) {
            return;
        }
        this.showToast(act, act.getString(message), duration);
    }

    public static /* synthetic */ void showToast$default(CommonActivity commonActivity, Activity activity, int n, Integer n2, int n3, Object object) {
        if ((n3 & 4) != 0) {
            n2 = null;
        }
        commonActivity.showToast(activity, n, n2);
    }

    @MainThread
    public final void showToast(@Nullable Activity act, @Nullable String message, @Nullable Integer duration) {
        if (act == null || message == null) {
            Log.w((String)TAG, (String)("invalid showToast act = " + act + " message = " + message));
            return;
        }
        Log.i((String)TAG, (String)("showToast = " + message));
        try {
            Toast toast = currentToast;
            if (toast != null) {
                toast.cancel();
            }
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
        try {
            ToastBinding toastBinding = ToastBinding.inflate(act.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue((Object)toastBinding, (String)"inflate(...)");
            ToastBinding binding = toastBinding;
            binding.text.setText((CharSequence)((Object)StringsKt.trim((CharSequence)message)).toString());
            Toast toast = new Toast((Context)act);
            Integer n = duration;
            toast.setDuration(n != null ? n : 0);
            toast.setGravity(81, 0, UIHelper.INSTANCE.getToPx(5));
            toast.setView((View)binding.getRoot());
            currentToast = toast;
            toast.show();
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
    }

    public static /* synthetic */ void showToast$default(CommonActivity commonActivity, Activity activity, String string2, Integer n, int n2, Object object) {
        if ((n2 & 4) != 0) {
            n = null;
        }
        commonActivity.showToast(activity, string2, n);
    }

    @NotNull
    public final HashMap<String, Locale> getAppLanguageExceptions() {
        return appLanguageExceptions;
    }

    public final void setLocale(@Nullable Context context, @Nullable String languageCode) {
        if (context == null || languageCode == null) {
            return;
        }
        Locale locale = appLanguageExceptions.get(languageCode);
        if (locale == null) {
            locale = new Locale(languageCode);
        }
        Locale locale2 = locale;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue((Object)resources, (String)"getResources(...)");
        Resources resources2 = resources;
        Configuration config = resources2.getConfiguration();
        Locale.setDefault(locale2);
        config.setLocale(locale2);
        if (Build.VERSION.SDK_INT >= 24) {
            context.createConfigurationContext(config);
        }
        resources2.updateConfiguration(config, resources2.getDisplayMetrics());
    }

    public final void updateLocale(@NotNull Context $this$updateLocale) {
        Intrinsics.checkNotNullParameter((Object)$this$updateLocale, (String)"<this>");
        SharedPreferences settingsManager = PreferenceManager.getDefaultSharedPreferences((Context)$this$updateLocale);
        String localeCode = settingsManager.getString($this$updateLocale.getString(R.string.locale_key), null);
        this.setLocale($this$updateLocale, localeCode);
    }

    public final void init(@NotNull Activity act) {
        Intrinsics.checkNotNullParameter((Object)act, (String)"act");
        this.setActivityInstance(act);
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, CommonActivity, Continuation<? super Unit>, Object>(null){
            int label;

            public final Object invokeSuspend(Object object) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)object);
                        Torrent.INSTANCE.deleteAllFiles();
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, CommonActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
        Activity activity = this.getActivity();
        ComponentActivity componentActivity = activity instanceof ComponentActivity ? (ComponentActivity)activity : null;
        if (componentActivity == null) {
            return;
        }
        ComponentActivity componentActivity2 = componentActivity;
        canShowPipMode = Build.VERSION.SDK_INT >= 24 && componentActivity2.getPackageManager().hasSystemFeature("android.software.picture_in_picture") && UIHelper.INSTANCE.hasPIPPermission((Context)componentActivity2);
        this.updateLocale((Context)componentActivity2);
        Globals.INSTANCE.updateTv((Context)componentActivity2);
        NewPipe.init((Downloader)DownloaderTestImpl.Companion.getInstance());
        MainActivity.Companion.setActivityResultLauncher((ActivityResultLauncher<Intent>)componentActivity2.registerForActivityResult((ActivityResultContract)new ActivityResultContracts.StartActivityForResult(), arg_0 -> CommonActivity.init$lambda$4(act, arg_0)));
        if (Build.VERSION.SDK_INT >= 33 && ContextCompat.checkSelfPermission((Context)((Context)componentActivity2), (String)"android.permission.POST_NOTIFICATIONS") != 0) {
            ActivityResultLauncher activityResultLauncher = componentActivity2.registerForActivityResult((ActivityResultContract)new ActivityResultContracts.RequestPermission(), CommonActivity::init$lambda$5);
            Intrinsics.checkNotNullExpressionValue((Object)activityResultLauncher, (String)"registerForActivityResult(...)");
            ActivityResultLauncher requestPermissionLauncher = activityResultLauncher;
            requestPermissionLauncher.launch((Object)"android.permission.POST_NOTIFICATIONS");
        }
    }

    private final void enterPIPMode(Activity $this$enterPIPMode) {
        if (!UIHelper.INSTANCE.shouldShowPIPMode((Context)$this$enterPIPMode, canEnterPipMode) || !canShowPipMode) {
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                try {
                    Boolean bl = $this$enterPIPMode.enterPictureInPictureMode(new PictureInPictureParams.Builder().build());
                }
                catch (Exception e) {
                    $this$enterPIPMode.enterPictureInPictureMode();
                    Unit unit = Unit.INSTANCE;
                }
            } else if (Build.VERSION.SDK_INT >= 24) {
                $this$enterPIPMode.enterPictureInPictureMode();
            }
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
    }

    public final void onUserLeaveHint(@Nullable Activity act) {
        block1: {
            if (!canEnterPipMode || !canShowPipMode) break block1;
            Activity activity = act;
            if (activity != null) {
                this.enterPIPMode(activity);
            }
        }
    }

    public final void updateTheme(@NotNull Activity act) {
        Intrinsics.checkNotNullParameter((Object)act, (String)"act");
        SharedPreferences settingsManager = PreferenceManager.getDefaultSharedPreferences((Context)((Context)act));
        if (Intrinsics.areEqual((Object)settingsManager.getString(act.getString(R.string.app_theme_key), "AmoledLight"), (Object)"System") && Build.VERSION.SDK_INT >= 29) {
            this.loadThemes(act);
        }
    }

    private final int mapSystemTheme(Activity act) {
        if (Build.VERSION.SDK_INT >= 29) {
            int currentNightMode = act.getResources().getConfiguration().uiMode & 0x30;
            return currentNightMode == 16 ? R.style.LightMode : R.style.AppTheme;
        }
        return R.style.AppTheme;
    }

    /*
     * Unable to fully structure code
     */
    public final void loadThemes(@Nullable Activity act) {
        block88: {
            block83: {
                block87: {
                    block84: {
                        block86: {
                            block85: {
                                if (act == null) {
                                    return;
                                }
                                settingsManager = PreferenceManager.getDefaultSharedPreferences((Context)((Context)act));
                                var4_3 = settingsManager.getString(act.getString(R.string.app_theme_key), "AmoledLight");
                                if (var4_3 == null) break block83;
                                switch (var4_3.hashCode()) {
                                    case 2078007406: {
                                        if (!var4_3.equals("AmoledLight")) {
                                            ** break;
                                        }
                                        break block84;
                                    }
                                    case 73417974: {
                                        if (!var4_3.equals("Light")) {
                                            ** break;
                                        }
                                        break block85;
                                    }
                                    case 1964972424: {
                                        if (!var4_3.equals("Amoled")) {
                                            ** break;
                                        }
                                        break block86;
                                    }
                                    case 74526875: {
                                        if (!var4_3.equals("Monet")) {
                                            ** break;
                                        }
                                        break block87;
                                    }
                                    case 64266207: {
                                        if (var4_3.equals("Black")) break;
                                        ** break;
                                    }
                                    case -1803461041: {
                                        if (!var4_3.equals("System")) ** break;
                                        v0 = this.mapSystemTheme(act);
                                        break block88;
                                    }
                                }
                                v0 = R.style.AppTheme;
                                break block88;
                            }
                            v0 = R.style.LightMode;
                            break block88;
                        }
                        v0 = R.style.AmoledMode;
                        break block88;
                    }
                    v0 = R.style.AmoledModeLight;
                    break block88;
                }
                v0 = Build.VERSION.SDK_INT >= 31 ? R.style.MonetMode : R.style.AppTheme;
                break block88;
            }
            v0 = R.style.AppTheme;
        }
        currentTheme = v0;
        var5_6 = settingsManager.getString(act.getString(R.string.primary_color_key), "Normal");
        if (var5_6 == null) ** GOTO lbl-1000
        tmp = -1;
        switch (var5_6.hashCode()) {
            case -1997434736: {
                if (var5_6.equals("Maroon")) {
                    tmp = 1;
                }
                break;
            }
            case 64459030: {
                if (var5_6.equals("Brown")) {
                    tmp = 2;
                }
                break;
            }
            case -1984634121: {
                if (var5_6.equals("Monet2")) {
                    tmp = 3;
                }
                break;
            }
            case 74526875: {
                if (var5_6.equals("Monet")) {
                    tmp = 4;
                }
                break;
            }
            case -1955878649: {
                if (var5_6.equals("Normal")) {
                    tmp = 5;
                }
                break;
            }
            case -2114143920: {
                if (var5_6.equals("NavyBlue")) {
                    tmp = 6;
                }
                break;
            }
            case -1924984242: {
                if (var5_6.equals("Orange")) {
                    tmp = 7;
                }
                break;
            }
            case 1982479237: {
                if (var5_6.equals("Banana")) {
                    tmp = 8;
                }
                break;
            }
            case 82033: {
                if (var5_6.equals("Red")) {
                    tmp = 9;
                }
                break;
            }
            case 1375944721: {
                if (var5_6.equals("CarnationPink")) {
                    tmp = 10;
                }
                break;
            }
            case 83549193: {
                if (var5_6.equals("White")) {
                    tmp = 11;
                }
                break;
            }
            case 76884678: {
                if (var5_6.equals("Party")) {
                    tmp = 12;
                }
                break;
            }
            case 2487702: {
                if (var5_6.equals("Pink")) {
                    tmp = 13;
                }
                break;
            }
            case -1321965081: {
                if (var5_6.equals("Lavender")) {
                    tmp = 14;
                }
                break;
            }
            case -1893076004: {
                if (var5_6.equals("Purple")) {
                    tmp = 15;
                }
                break;
            }
            case 1627490871: {
                if (var5_6.equals("GreenApple")) {
                    tmp = 16;
                }
                break;
            }
            case 129648909: {
                if (var5_6.equals("DarkGreen")) {
                    tmp = 17;
                }
                break;
            }
            case -243530526: {
                if (var5_6.equals("DandelionYellow")) {
                    tmp = 18;
                }
                break;
            }
            case 2227967: {
                if (var5_6.equals("Grey")) {
                    tmp = 19;
                }
                break;
            }
            case -482481309: {
                if (var5_6.equals("CoolBlue")) {
                    tmp = 20;
                }
                break;
            }
            case 69066467: {
                if (var5_6.equals("Green")) {
                    tmp = 21;
                }
                break;
            }
        }
        switch (tmp) {
            case 5: {
                v1 = R.style.OverlayPrimaryColorNormal;
                break;
            }
            case 18: {
                v1 = R.style.OverlayPrimaryColorDandelionYellow;
                break;
            }
            case 10: {
                v1 = R.style.OverlayPrimaryColorCarnationPink;
                break;
            }
            case 7: {
                v1 = R.style.OverlayPrimaryColorOrange;
                break;
            }
            case 17: {
                v1 = R.style.OverlayPrimaryColorDarkGreen;
                break;
            }
            case 1: {
                v1 = R.style.OverlayPrimaryColorMaroon;
                break;
            }
            case 6: {
                v1 = R.style.OverlayPrimaryColorNavyBlue;
                break;
            }
            case 19: {
                v1 = R.style.OverlayPrimaryColorGrey;
                break;
            }
            case 11: {
                v1 = R.style.OverlayPrimaryColorWhite;
                break;
            }
            case 20: {
                v1 = R.style.OverlayPrimaryColorCoolBlue;
                break;
            }
            case 2: {
                v1 = R.style.OverlayPrimaryColorBrown;
                break;
            }
            case 15: {
                v1 = R.style.OverlayPrimaryColorPurple;
                break;
            }
            case 21: {
                v1 = R.style.OverlayPrimaryColorGreen;
                break;
            }
            case 16: {
                v1 = R.style.OverlayPrimaryColorGreenApple;
                break;
            }
            case 9: {
                v1 = R.style.OverlayPrimaryColorRed;
                break;
            }
            case 8: {
                v1 = R.style.OverlayPrimaryColorBanana;
                break;
            }
            case 12: {
                v1 = R.style.OverlayPrimaryColorParty;
                break;
            }
            case 13: {
                v1 = R.style.OverlayPrimaryColorPink;
                break;
            }
            case 14: {
                v1 = R.style.OverlayPrimaryColorLavender;
                break;
            }
            case 4: {
                if (Build.VERSION.SDK_INT >= 31) {
                    v1 = R.style.OverlayPrimaryColorMonet;
                    break;
                }
                v1 = R.style.OverlayPrimaryColorNormal;
                break;
            }
            case 3: {
                if (Build.VERSION.SDK_INT >= 31) {
                    v1 = R.style.OverlayPrimaryColorMonetTwo;
                    break;
                }
                v1 = R.style.OverlayPrimaryColorNormal;
                break;
            }
            default: lbl-1000:
            // 2 sources

            {
                v1 = R.style.OverlayPrimaryColorNormal;
            }
        }
        currentOverlayTheme = v1;
        act.getTheme().applyStyle(currentTheme, true);
        act.getTheme().applyStyle(currentOverlayTheme, true);
        Globals.INSTANCE.updateTv((Context)act);
        if (Globals.INSTANCE.isLayout(2)) {
            act.getTheme().applyStyle(R.style.AppThemeTvOverlay, true);
        }
        act.getTheme().applyStyle(R.style.LoadedStyle, true);
    }

    private final View localLook(View from, int id2) {
        if (id2 == -1) {
            return null;
        }
        View currentLook = from;
        for (int i = 0; i < 16; ++i) {
            View view = currentLook.findViewById(id2);
            if (view != null) {
                View view2 = view;
                boolean bl = false;
                return view2;
            }
            ViewParent viewParent = currentLook.getParent();
            if ((viewParent instanceof View ? (View)viewParent : null) == null) break;
            currentLook = currentLook;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean hasContent(View $this$hasContent) {
        if (!$this$hasContent.isShown()) return false;
        if (!($this$hasContent instanceof ViewGroup)) return true;
        if (((ViewGroup)$this$hasContent).getChildCount() <= 0) return false;
        return true;
    }

    @Nullable
    public final View continueGetNextFocus(@Nullable Object root, @NotNull View view, @NotNull FocusDirection direction, int nextId, int depth) {
        View view2;
        View view3;
        boolean hasChildrenThatWantsFocus;
        boolean bl;
        Intrinsics.checkNotNullParameter((Object)view, (String)"view");
        Intrinsics.checkNotNullParameter((Object)((Object)direction), (String)"direction");
        if (nextId == -1) {
            return null;
        }
        Object object = root;
        Object object2 = object instanceof Activity ? ((Activity)root).findViewById(nextId) : (object instanceof View ? ((View)root).getRootView().findViewById(nextId) : null);
        if (object2 == null) {
            return null;
        }
        View next = object2;
        View view4 = this.localLook(view, nextId);
        if (view4 == null) {
            view4 = next;
        }
        next = view4;
        boolean shown = this.hasContent(next);
        View view5 = next;
        ViewGroup viewGroup = view5 instanceof ViewGroup ? (ViewGroup)view5 : null;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            boolean bl2 = false;
            bl = viewGroup2.getDescendantFocusability() == 262144 && viewGroup2.getChildCount() > 0;
        } else {
            bl = hasChildrenThatWantsFocus = false;
        }
        if (!next.isFocusable() && shown && !hasChildrenThatWantsFocus) {
            return null;
        }
        if (!shown) {
            if (Intrinsics.areEqual((Object)next, (Object)view)) {
                return null;
            }
            return this.getNextFocus(root, next, direction, depth + 1);
        }
        view5 = next;
        if (view5 instanceof ChipGroup) {
            Object v4;
            block15: {
                Sequence sequence = ViewGroupKt.getChildren((ViewGroup)((ViewGroup)next));
                boolean bl3 = false;
                for (Object e : sequence) {
                    View view6 = (View)e;
                    boolean bl4 = false;
                    if (!(view6.isFocusable() && view6.isShown())) continue;
                    v4 = e;
                    break block15;
                }
                v4 = null;
            }
            view3 = v4;
        } else if (view5 instanceof NavigationRailView) {
            view3 = next.findViewById(((NavigationRailView)next).getSelectedItemId());
            if (view3 == null) {
                view3 = next.findViewById(R.id.navigation_home);
            }
        } else {
            view3 = view2 = null;
        }
        if (view2 != null) {
            View view7 = view2;
            boolean bl5 = false;
            return view7;
        }
        return next;
    }

    public static /* synthetic */ View continueGetNextFocus$default(CommonActivity commonActivity, Object object, View view, FocusDirection focusDirection, int n, int n2, int n3, Object object2) {
        if ((n3 & 0x10) != 0) {
            n2 = 0;
        }
        return commonActivity.continueGetNextFocus(object, view, focusDirection, n, n2);
    }

    @Nullable
    public final View getNextFocus(@Nullable Object root, @Nullable View view, @NotNull FocusDirection direction, int depth) {
        int n;
        Intrinsics.checkNotNullParameter((Object)((Object)direction), (String)"direction");
        if (view == null || depth >= 10 || root == null) {
            return null;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[direction.ordinal()]) {
            case 1: {
                if (AppContextUtils.INSTANCE.isRtl(view)) {
                    n = view.getNextFocusRightId();
                    break;
                }
                n = view.getNextFocusLeftId();
                break;
            }
            case 2: {
                n = view.getNextFocusUpId();
                break;
            }
            case 3: {
                if (AppContextUtils.INSTANCE.isRtl(view)) {
                    n = view.getNextFocusLeftId();
                    break;
                }
                n = view.getNextFocusRightId();
                break;
            }
            case 4: {
                n = view.getNextFocusDownId();
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        int nextId = n;
        if (nextId == -1 && (nextId = view.getNextFocusForwardId()) == -1) {
            return null;
        }
        return this.continueGetNextFocus(root, view, direction, nextId, depth);
    }

    public static /* synthetic */ View getNextFocus$default(CommonActivity commonActivity, Object object, View view, FocusDirection focusDirection, int n, int n2, Object object2) {
        if ((n2 & 8) != 0) {
            n = 0;
        }
        return commonActivity.getNextFocus(object, view, focusDirection, n);
    }

    @Nullable
    public final Boolean onKeyDown(@Nullable Activity act, int keyCode, @Nullable KeyEvent event) {
        PlayerEventType playerEventType;
        switch (keyCode) {
            case 32: 
            case 90: 
            case 125: 
            case 272: {
                playerEventType = PlayerEventType.SeekForward;
                break;
            }
            case 29: 
            case 89: 
            case 273: {
                playerEventType = PlayerEventType.SeekBack;
                break;
            }
            case 42: 
            case 87: 
            case 103: 
            case 146: 
            case 166: {
                playerEventType = PlayerEventType.NextEpisode;
                break;
            }
            case 30: 
            case 88: 
            case 102: 
            case 145: 
            case 167: {
                playerEventType = PlayerEventType.PrevEpisode;
                break;
            }
            case 127: {
                playerEventType = PlayerEventType.Pause;
                break;
            }
            case 108: 
            case 126: {
                playerEventType = PlayerEventType.Play;
                break;
            }
            case 14: 
            case 40: 
            case 151: {
                playerEventType = PlayerEventType.Lock;
                break;
            }
            case 36: 
            case 82: {
                playerEventType = PlayerEventType.ToggleHide;
                break;
            }
            case 41: 
            case 164: {
                playerEventType = PlayerEventType.ToggleMute;
                break;
            }
            case 16: 
            case 47: 
            case 153: {
                playerEventType = PlayerEventType.ShowMirrors;
                break;
            }
            case 15: 
            case 43: 
            case 152: {
                playerEventType = PlayerEventType.SearchSubtitlesOnline;
                break;
            }
            case 10: 
            case 33: 
            case 147: {
                playerEventType = PlayerEventType.ShowSpeed;
                break;
            }
            case 7: 
            case 46: 
            case 144: {
                playerEventType = PlayerEventType.Resize;
                break;
            }
            case 11: 
            case 31: 
            case 148: {
                playerEventType = PlayerEventType.SkipOp;
                break;
            }
            case 12: 
            case 50: 
            case 149: {
                playerEventType = PlayerEventType.SkipCurrentChapter;
                break;
            }
            case 44: 
            case 62: 
            case 66: 
            case 85: 
            case 160: {
                playerEventType = PlayerEventType.PlayPauseToggle;
                break;
            }
            default: {
                return null;
            }
        }
        PlayerEventType playerEvent = playerEventType;
        Function1<? super PlayerEventType, Unit> listener = playerEventListener;
        if (listener != null) {
            listener.invoke((Object)playerEvent);
            return true;
        }
        return null;
    }

    @Nullable
    public final Boolean dispatchKeyEvent(@Nullable Activity act, @Nullable KeyEvent event) {
        if (act == null) {
            return null;
        }
        View currentFocus = act.getCurrentFocus();
        KeyEvent keyEvent = event;
        if (keyEvent != null) {
            int n = keyEvent.getKeyCode();
            boolean bl = false;
            if (currentFocus != null && event.getAction() == 0) {
                View view;
                switch (n) {
                    case 21: {
                        View view2 = CommonActivity.getNextFocus$default(INSTANCE, act, currentFocus, FocusDirection.Start, 0, 8, null);
                        break;
                    }
                    case 22: {
                        View view2 = CommonActivity.getNextFocus$default(INSTANCE, act, currentFocus, FocusDirection.End, 0, 8, null);
                        break;
                    }
                    case 19: {
                        View view2 = CommonActivity.getNextFocus$default(INSTANCE, act, currentFocus, FocusDirection.Up, 0, 8, null);
                        break;
                    }
                    case 20: {
                        View view2 = CommonActivity.getNextFocus$default(INSTANCE, act, currentFocus, FocusDirection.Down, 0, 8, null);
                        break;
                    }
                    default: {
                        View view2 = view = null;
                    }
                }
                if (view != null) {
                    view.requestFocus();
                    Function1<? super Pair<? extends KeyEvent, Boolean>, Boolean> function1 = keyEventListener;
                    if (function1 != null) {
                        Boolean cfr_ignored_0 = (Boolean)function1.invoke((Object)new Pair((Object)event, (Object)true));
                    }
                    return true;
                }
                if (n == 23 && (act.getCurrentFocus() instanceof SearchView || act.getCurrentFocus() instanceof SearchView.SearchAutoComplete)) {
                    View view3 = act.getCurrentFocus();
                    UIHelper.INSTANCE.showInputMethod((View)(view3 != null ? view3.findFocus() : null));
                }
            }
        }
        Function1<? super Pair<? extends KeyEvent, Boolean>, Boolean> function1 = keyEventListener;
        boolean bl = function1 != null ? ((Boolean)function1.invoke((Object)new Pair((Object)event, (Object)false))).booleanValue() : false;
        if (bl) {
            return true;
        }
        return null;
    }

    private static final void showToast$lambda$0(Activity $act, int $message, Integer $duration) {
        INSTANCE.showToast($act, $act.getString($message), $duration);
    }

    private static final void showToast$lambda$1(Activity $act, String $message, Integer $duration) {
        INSTANCE.showToast($act, $message, $duration);
    }

    private static final void showToast$lambda$2(Activity $act, UiText $message, Integer $duration) {
        INSTANCE.showToast($act, $message.asString((Context)$act), $duration);
    }

    /*
     * WARNING - void declaration
     */
    private static final void init$lambda$4(Activity $act, ActivityResult result2) {
        if (result2.getResultCode() == -1) {
            Object object;
            block8: {
                void this_\1;
                AcraApplication.Companion companion = AcraApplication.Companion;
                String string2 = "last_click_action";
                boolean bl = false;
                Context context = this_\1.getContext();
                if (context != null) {
                    void this_\2;
                    DataStore dataStore = DataStore.INSTANCE;
                    Context context2 = context;
                    boolean bl2 = false;
                    void var11_9 = this_\2;
                    Context context3 = context2;
                    Object object2 = null;
                    boolean bl3 = false;
                    try {
                        void this_\4;
                        void $this$getKey\3;
                        void this_\3;
                        String string3 = this_\3.getSharedPrefs((Context)$this$getKey\3).getString(string2, null);
                        if (string3 == null) {
                            object = object2;
                            break block8;
                        }
                        String string4 = string3;
                        void var16_14 = this_\3;
                        String string5 = string4;
                        boolean bl4 = false;
                        Object object3 = this_\4.getMapper().readValue(string5, String.class);
                        object = object3;
                        Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"readValue(...)");
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                } else {
                    object = null;
                }
            }
            String string6 = (String)object;
            if (string6 == null) {
                return;
            }
            String actionUid = string6;
            Log.d((String)TAG, (String)("Loading action " + actionUid + " result handler"));
            VideoClickAction videoClickAction = VideoClickActionHolder.INSTANCE.getByUniqueId(actionUid);
            OpenInAppAction openInAppAction = videoClickAction instanceof OpenInAppAction ? (OpenInAppAction)videoClickAction : null;
            if (openInAppAction == null) {
                return;
            }
            OpenInAppAction action = openInAppAction;
            action.onResultSafe($act, result2.getData());
            AcraApplication.Companion.removeKey("last_click_action");
            AcraApplication.Companion.removeKey("last_opened_id");
        }
    }

    private static final void init$lambda$5(boolean isGranted) {
        Log.d((String)TAG, (String)("Notification permission: " + isGranted));
    }

    static {
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        Intrinsics.checkNotNullExpressionValue((Object)displayMetrics, (String)"getDisplayMetrics(...)");
        CommonActivity.displayMetrics = displayMetrics;
        onColorSelectedEvent = new Event();
        onDialogDismissedEvent = new Event();
        Pair[] pairArray = new Pair[]{TuplesKt.to((Object)"zh-rTW", (Object)Locale.TRADITIONAL_CHINESE)};
        appLanguageExceptions = MapsKt.hashMapOf((Pair[])pairArray);
    }

    @Metadata(mv={2, 1, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[FocusDirection.values().length];
            try {
                nArray[FocusDirection.Start.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[FocusDirection.Up.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[FocusDirection.End.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[FocusDirection.Down.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

