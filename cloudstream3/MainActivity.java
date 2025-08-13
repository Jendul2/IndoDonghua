/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.KeyEvent
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnLayoutChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.view.ViewParent
 *  android.view.Window
 *  android.widget.CheckBox
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.Toast
 *  androidx.activity.ComponentActivity
 *  androidx.activity.OnBackPressedCallback
 *  androidx.activity.result.ActivityResultLauncher
 *  androidx.annotation.IdRes
 *  androidx.annotation.MainThread
 *  androidx.appcompat.app.AlertDialog
 *  androidx.appcompat.app.AlertDialog$Builder
 *  androidx.appcompat.app.AppCompatActivity
 *  androidx.biometric.BiometricPrompt
 *  androidx.biometric.BiometricPrompt$PromptInfo
 *  androidx.cardview.widget.CardView
 *  androidx.constraintlayout.widget.ConstraintLayout$LayoutParams
 *  androidx.core.view.ViewGroupKt
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  androidx.lifecycle.LifecycleOwner
 *  androidx.lifecycle.LiveData
 *  androidx.lifecycle.Observer
 *  androidx.lifecycle.ViewModelProvider
 *  androidx.lifecycle.ViewModelStoreOwner
 *  androidx.navigation.NavController
 *  androidx.navigation.NavDestination
 *  androidx.navigation.NavGraph
 *  androidx.navigation.NavOptions$Builder
 *  androidx.navigation.fragment.NavHostFragment
 *  androidx.navigation.ui.BottomNavigationViewKt
 *  androidx.preference.PreferenceManager
 *  androidx.recyclerview.widget.LinearSnapHelper
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  androidx.viewpager2.widget.ViewPager2
 *  com.google.android.gms.cast.framework.CastContext
 *  com.google.android.gms.cast.framework.Session
 *  com.google.android.gms.cast.framework.SessionManager
 *  com.google.android.gms.cast.framework.SessionManagerListener
 *  com.google.android.material.bottomnavigation.BottomNavigationView
 *  com.google.android.material.bottomsheet.BottomSheetDialog
 *  com.google.android.material.navigation.NavigationBarView
 *  com.google.android.material.navigationrail.NavigationRailView
 *  com.google.common.collect.Comparators
 *  com.jaredrummler.android.colorpicker.ColorPickerDialogListener
 *  com.lagradost.nicehttp.NiceResponse
 *  com.lagradost.nicehttp.Requests
 *  com.lagradost.safefile.SafeFile
 *  kotlin.Function
 *  kotlin.Lazy
 *  kotlin.LazyKt
 *  kotlin.Metadata
 *  kotlin.NoWhenBranchMatchedException
 *  kotlin.Pair
 *  kotlin.ResultKt
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.coroutines.jvm.internal.ContinuationImpl
 *  kotlin.io.FilesKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.FunctionAdapter
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.Intrinsics$Kotlin
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.sequences.Sequence
 *  kotlin.text.StringsKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Job
 *  kotlinx.coroutines.sync.Mutex
 *  kotlinx.coroutines.sync.MutexKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewGroupKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.BottomNavigationViewKt;
import androidx.preference.PreferenceManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.cast.framework.CastContext;
import com.google.android.gms.cast.framework.Session;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.framework.SessionManagerListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigationrail.NavigationRailView;
import com.google.common.collect.Comparators;
import com.jaredrummler.android.colorpicker.ColorPickerDialogListener;
import com.lagradost.cloudstream3.APIHolder;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.AutoDownloadMode;
import com.lagradost.cloudstream3.BuildConfig;
import com.lagradost.cloudstream3.CommonActivity;
import com.lagradost.cloudstream3.DubStatus;
import com.lagradost.cloudstream3.MainAPI;
import com.lagradost.cloudstream3.MainActivity;
import com.lagradost.cloudstream3.MainActivityKt;
import com.lagradost.cloudstream3.ParCollectionsKt;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.SearchResponse;
import com.lagradost.cloudstream3.SettingsJson;
import com.lagradost.cloudstream3.actions.temp.fcast.FcastManager;
import com.lagradost.cloudstream3.databinding.ActivityMainBinding;
import com.lagradost.cloudstream3.databinding.ActivityMainTvBinding;
import com.lagradost.cloudstream3.databinding.BottomResultviewPreviewBinding;
import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import com.lagradost.cloudstream3.mvvm.LifecycleKt;
import com.lagradost.cloudstream3.mvvm.Resource;
import com.lagradost.cloudstream3.network.RequestsHelperKt;
import com.lagradost.cloudstream3.plugins.PluginManager;
import com.lagradost.cloudstream3.receivers.VideoDownloadRestartReceiver;
import com.lagradost.cloudstream3.services.SubscriptionWorkManager;
import com.lagradost.cloudstream3.syncproviders.AccountManager;
import com.lagradost.cloudstream3.syncproviders.InAppAuthAPIManager;
import com.lagradost.cloudstream3.syncproviders.OAuth2API;
import com.lagradost.cloudstream3.syncproviders.SyncAPI;
import com.lagradost.cloudstream3.syncproviders.SyncRepo;
import com.lagradost.cloudstream3.ui.APIRepository;
import com.lagradost.cloudstream3.ui.SyncWatchType;
import com.lagradost.cloudstream3.ui.WatchType;
import com.lagradost.cloudstream3.ui.account.AccountHelper;
import com.lagradost.cloudstream3.ui.home.HomeViewModel;
import com.lagradost.cloudstream3.ui.library.LibraryViewModel;
import com.lagradost.cloudstream3.ui.player.BasicLink;
import com.lagradost.cloudstream3.ui.player.GeneratorPlayer;
import com.lagradost.cloudstream3.ui.player.LinkGenerator;
import com.lagradost.cloudstream3.ui.result.LinearListLayout;
import com.lagradost.cloudstream3.ui.result.ResultData;
import com.lagradost.cloudstream3.ui.result.ResultViewModel2;
import com.lagradost.cloudstream3.ui.result.SyncViewModel;
import com.lagradost.cloudstream3.ui.search.SearchResultBuilder;
import com.lagradost.cloudstream3.ui.settings.Globals;
import com.lagradost.cloudstream3.ui.settings.SettingsGeneral;
import com.lagradost.cloudstream3.ui.setup.SetupFragmentExtensions;
import com.lagradost.cloudstream3.utils.ApkInstaller;
import com.lagradost.cloudstream3.utils.AppContextUtils;
import com.lagradost.cloudstream3.utils.BackPressedCallbackHelper;
import com.lagradost.cloudstream3.utils.BackupUtils;
import com.lagradost.cloudstream3.utils.BiometricAuthenticator;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.cloudstream3.utils.DataStore;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.Event;
import com.lagradost.cloudstream3.utils.ImageLoader;
import com.lagradost.cloudstream3.utils.InAppUpdater;
import com.lagradost.cloudstream3.utils.SingleSelectionHelper;
import com.lagradost.cloudstream3.utils.SnackbarHelper;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UIHelper;
import com.lagradost.nicehttp.NiceResponse;
import com.lagradost.nicehttp.Requests;
import com.lagradost.safefile.SafeFile;
import java.io.File;
import java.lang.invoke.LambdaMetafactory;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u00da\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003uvwB\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010)\u001a\u00020\rH\u0014J\b\u0010*\u001a\u00020\rH\u0014J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010.\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\u00132\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\b\u00100\u001a\u00020\rH\u0014J\u0010\u00101\u001a\u00020\r2\u0006\u00102\u001a\u000203H\u0003J\b\u00104\u001a\u00020\rH\u0014J\u0012\u00105\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107H\u0014J\u0012\u00108\u001a\u00020\r2\b\u00106\u001a\u0004\u0018\u000107H\u0002J\u0016\u00109\u001a\u00020\u0010*\u00020\u001b2\b\b\u0001\u0010:\u001a\u00020\u0013H\u0002J\u0018\u0010=\u001a\u00020\u00102\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020AH\u0002J\u0012\u0010D\u001a\u00020\r2\b\b\u0002\u0010E\u001a\u00020\u0010H\u0002J\"\u0010X\u001a\u0004\u0018\u00010Y2\u0006\u0010Z\u001a\u00020[2\u0006\u0010\\\u001a\u00020]2\u0006\u0010^\u001a\u00020_H\u0016J\b\u0010`\u001a\u00020\rH\u0002J\b\u0010e\u001a\u00020dH\u0002J\u0012\u0010l\u001a\u00020\r2\b\u0010m\u001a\u0004\u0018\u00010YH\u0002J\u0012\u0010n\u001a\u00020\r2\b\u0010o\u001a\u0004\u0018\u00010pH\u0014J\b\u0010q\u001a\u00020\rH\u0016J\b\u0010r\u001a\u00020\rH\u0016J\u000e\u0010s\u001a\u00020\u0010H\u0086@\u00a2\u0006\u0002\u0010tR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u000e\u0010;\u001a\u00020<X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020CX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010F\u001a\u00020GX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010T\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u0010\u0010a\u001a\u0004\u0018\u00010bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010c\u001a\u0004\u0018\u00010dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010f\u001a\u0004\u0018\u00010gX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k\u00a8\u0006x"}, d2={"Lcom/lagradost/cloudstream3/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/jaredrummler/android/colorpicker/ColorPickerDialogListener;", "Lcom/lagradost/cloudstream3/utils/BiometricAuthenticator$BiometricCallback;", "<init>", "()V", "lastPopup", "Lcom/lagradost/cloudstream3/SearchResponse;", "getLastPopup", "()Lcom/lagradost/cloudstream3/SearchResponse;", "setLastPopup", "(Lcom/lagradost/cloudstream3/SearchResponse;)V", "loadPopup", "", "result", "load", "", "onColorSelected", "dialogId", "", "color", "onDialogDismissed", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "updateNavBar", "destination", "Landroidx/navigation/NavDestination;", "mSessionManager", "Lcom/google/android/gms/cast/framework/SessionManager;", "getMSessionManager", "()Lcom/google/android/gms/cast/framework/SessionManager;", "setMSessionManager", "(Lcom/google/android/gms/cast/framework/SessionManager;)V", "mSessionManagerListener", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/Session;", "getMSessionManagerListener", "()Lcom/google/android/gms/cast/framework/SessionManagerListener;", "mSessionManagerListener$delegate", "Lkotlin/Lazy;", "onResume", "onPause", "dispatchKeyEvent", "event", "Landroid/view/KeyEvent;", "onKeyDown", "keyCode", "onUserLeaveHint", "showConfirmExitDialog", "settingsManager", "Landroid/content/SharedPreferences;", "onDestroy", "onNewIntent", "intent", "Landroid/content/Intent;", "handleAppIntent", "matchDestination", "destId", "lastNavTime", "", "onNavDestinationSelected", "item", "Landroid/view/MenuItem;", "navController", "Landroidx/navigation/NavController;", "pluginsLock", "Lkotlinx/coroutines/sync/Mutex;", "onAllPluginsLoaded", "success", "viewModel", "Lcom/lagradost/cloudstream3/ui/result/ResultViewModel2;", "getViewModel", "()Lcom/lagradost/cloudstream3/ui/result/ResultViewModel2;", "setViewModel", "(Lcom/lagradost/cloudstream3/ui/result/ResultViewModel2;)V", "syncViewModel", "Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;", "getSyncViewModel", "()Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;", "setSyncViewModel", "(Lcom/lagradost/cloudstream3/ui/result/SyncViewModel;)V", "libraryViewModel", "Lcom/lagradost/cloudstream3/ui/library/LibraryViewModel;", "isLocalList", "()Z", "setLocalList", "(Z)V", "onCreateView", "Landroid/view/View;", "name", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "hidePreviewPopupDialog", "bottomPreviewPopup", "Landroid/app/Dialog;", "bottomPreviewBinding", "Lcom/lagradost/cloudstream3/databinding/BottomResultviewPreviewBinding;", "showPreviewPopupDialog", "binding", "Lcom/lagradost/cloudstream3/databinding/ActivityMainBinding;", "getBinding", "()Lcom/lagradost/cloudstream3/databinding/ActivityMainBinding;", "setBinding", "(Lcom/lagradost/cloudstream3/databinding/ActivityMainBinding;)V", "centerView", "view", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onAuthenticationSuccess", "onAuthenticationError", "checkGithubConnectivity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "SessionManagerListenerImpl", "TvFocus", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n*L\n1#1,1939:1\n1#2:1940\n257#3,2:1941\n257#3,2:1943\n257#3,2:1945\n257#3,2:1951\n278#3,2:1953\n299#3,2:1962\n278#3,2:1977\n257#3,2:1986\n257#3,2:1996\n257#3,2:1998\n257#3,2:2000\n257#3,2:2002\n257#3,2:2004\n257#3,2:2006\n299#3,2:2008\n1863#4,2:1947\n1557#4:1988\n1628#4,3:1989\n1557#4:1992\n1628#4,3:1993\n1251#5,2:1949\n192#6:1955\n183#6,3:1956\n174#6:1959\n186#6,2:1960\n192#6:1964\n183#6,3:1965\n174#6:1968\n186#6,2:1969\n183#6,3:1971\n174#6:1974\n186#6,2:1975\n192#6:1979\n183#6,3:1980\n174#6:1983\n186#6,2:1984\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity\n*L\n441#1:1941,2\n517#1:1943,2\n518#1:1945,2\n1176#1:1951,2\n1235#1:1953,2\n1691#1:1962,2\n1922#1:1977,2\n1367#1:1986,2\n1478#1:1996,2\n1407#1:1998,2\n1408#1:2000,2\n1416#1:2002,2\n1417#1:2004,2\n1685#1:2006,2\n1687#1:2008,2\n659#1:1947,2\n1450#1:1988\n1450#1:1989,3\n1466#1:1992\n1466#1:1993,3\n689#1:1949,2\n1240#1:1955\n1240#1:1956,3\n1240#1:1959\n1240#1:1960,2\n1869#1:1964\n1869#1:1965,3\n1869#1:1968\n1869#1:1969,2\n1875#1:1971,3\n1875#1:1974\n1875#1:1975,2\n1148#1:1979\n1148#1:1980,3\n1148#1:1983\n1148#1:1984,2\n*E\n"})
public final class MainActivity
extends AppCompatActivity
implements ColorPickerDialogListener,
BiometricAuthenticator.BiometricCallback {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private SearchResponse lastPopup;
    @Nullable
    private SessionManager mSessionManager;
    @NotNull
    private final Lazy mSessionManagerListener$delegate = LazyKt.lazy(() -> MainActivity.mSessionManagerListener_delegate$lambda$3(this));
    private long lastNavTime;
    @NotNull
    private final Mutex pluginsLock = MutexKt.Mutex$default((boolean)false, (int)1, null);
    public ResultViewModel2 viewModel;
    public SyncViewModel syncViewModel;
    @Nullable
    private LibraryViewModel libraryViewModel;
    private boolean isLocalList;
    @Nullable
    private Dialog bottomPreviewPopup;
    @Nullable
    private BottomResultviewPreviewBinding bottomPreviewBinding;
    @Nullable
    private ActivityMainBinding binding;
    @Nullable
    private static ActivityResultLauncher<Intent> activityResultLauncher;
    @NotNull
    public static final String TAG = "MAINACT";
    public static final boolean ANIMATED_OUTLINE = false;
    @Nullable
    private static String lastError;
    @NotNull
    private static final String FILE_DELETE_KEY = "FILES_TO_DELETE_KEY";
    @NotNull
    public static final String API_NAME_EXTRA_KEY = "API_NAME_EXTRA_KEY";
    @Nullable
    private static String nextSearchQuery;
    @NotNull
    private static final Event<Boolean> afterPluginsLoadedEvent;
    @NotNull
    private static final Event<Boolean> mainPluginsLoadedEvent;
    @NotNull
    private static final Event<Boolean> afterRepositoryLoadedEvent;
    @NotNull
    private static final Event<Boolean> bookmarksUpdatedEvent;
    @NotNull
    private static final Event<Boolean> reloadHomeEvent;
    @NotNull
    private static final Event<Boolean> reloadLibraryEvent;
    @NotNull
    private static final Event<Boolean> reloadAccountEvent;

    @Nullable
    public final SearchResponse getLastPopup() {
        return this.lastPopup;
    }

    public final void setLastPopup(@Nullable SearchResponse searchResponse) {
        this.lastPopup = searchResponse;
    }

    public final void loadPopup(@NotNull SearchResponse result2, boolean load2) {
        Intrinsics.checkNotNullParameter((Object)result2, (String)"result");
        this.lastPopup = result2;
        String syncName = this.getSyncViewModel().syncName(result2.getApiName());
        if (result2 instanceof SyncAPI.LibraryItem && syncName != null) {
            this.isLocalList = false;
            this.getSyncViewModel().setSync(syncName, ((SyncAPI.LibraryItem)result2).getSyncId());
            this.getSyncViewModel().updateMetaAndUser();
        } else {
            this.isLocalList = true;
            this.getSyncViewModel().clear();
        }
        Job job = load2 ? ResultViewModel2.load$default(this.getViewModel(), (Activity)this, result2.getUrl(), result2.getApiName(), false, AppContextUtils.INSTANCE.getApiDubstatusSettings((Context)this).contains((Object)DubStatus.Dubbed) ? DubStatus.Dubbed : DubStatus.Subbed, null, false, 64, null) : this.getViewModel().loadSmall(result2);
    }

    public static /* synthetic */ void loadPopup$default(MainActivity mainActivity, SearchResponse searchResponse, boolean bl, int n, Object object) {
        if ((n & 2) != 0) {
            bl = true;
        }
        mainActivity.loadPopup(searchResponse, bl);
    }

    public void onColorSelected(int dialogId, int color2) {
        CommonActivity.INSTANCE.getOnColorSelectedEvent().invoke((Pair<Integer, Integer>)new Pair((Object)dialogId, (Object)color2));
    }

    public void onDialogDismissed(int dialogId) {
        CommonActivity.INSTANCE.getOnDialogDismissedEvent().invoke(dialogId);
    }

    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        block0: {
            Intrinsics.checkNotNullParameter((Object)newConfig, (String)"newConfig");
            super.onConfigurationChanged(newConfig);
            CommonActivity.INSTANCE.updateLocale((Context)this);
            CommonActivity.INSTANCE.updateTheme((Activity)this);
            Fragment fragment = this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
            Intrinsics.checkNotNull((Object)fragment, (String)"null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            NavHostFragment navHostFragment = (NavHostFragment)fragment;
            NavDestination navDestination = navHostFragment.getNavController().getCurrentDestination();
            if (navDestination == null) break block0;
            NavDestination navDestination2 = navDestination;
            boolean bl = false;
            this.updateNavBar(navDestination2);
        }
    }

    /*
     * WARNING - void declaration
     */
    private final void updateNavBar(NavDestination destination) {
        block8: {
            Object[] objectArray;
            int n;
            ActivityMainBinding activityMainBinding;
            block9: {
                void $this$isVisible\5;
                View view;
                ActivityMainBinding activityMainBinding2;
                boolean bl;
                ConstraintLayout.LayoutParams layoutParams;
                Object[] objectArray2;
                UIHelper.INSTANCE.hideKeyboard((Activity)this);
                ActivityMainBinding activityMainBinding3 = this.binding;
                if (activityMainBinding3 != null && (activityMainBinding3 = activityMainBinding3.castMiniControllerHolder) != null) {
                    void value\1;
                    View view2 = (View)activityMainBinding3;
                    Object[] objectArray3 = new Integer[]{R.id.navigation_results_phone, R.id.navigation_results_tv, R.id.navigation_player};
                    boolean bl2 = !CollectionsKt.listOf((Object[])objectArray3).contains(destination.getId());
                    boolean bl3 = false;
                    objectArray2.setVisibility(value\1 != false ? 0 : 8);
                }
                Object[] objectArray4 = new Integer[]{R.id.navigation_home, R.id.navigation_search, R.id.navigation_library, R.id.navigation_downloads, R.id.navigation_settings, R.id.navigation_download_child, R.id.navigation_subtitles, R.id.navigation_chrome_subtitles, R.id.navigation_settings_player, R.id.navigation_settings_updates, R.id.navigation_settings_ui, R.id.navigation_settings_account, R.id.navigation_settings_providers, R.id.navigation_settings_general, R.id.navigation_settings_extensions, R.id.navigation_settings_plugins, R.id.navigation_test_providers};
                boolean isNavVisible = CollectionsKt.listOf((Object[])objectArray4).contains(destination.getId());
                objectArray2 = new Integer[]{R.id.navigation_home, R.id.navigation_search, R.id.navigation_results_phone, R.id.navigation_results_tv, R.id.navigation_player, R.id.navigation_quick_search};
                boolean dontPush = CollectionsKt.listOf((Object[])objectArray2).contains(destination.getId());
                ActivityMainBinding activityMainBinding4 = this.binding;
                if (activityMainBinding4 != null && (activityMainBinding4 = activityMainBinding4.navHostFragment) != null) {
                    int n2;
                    ActivityMainBinding activityMainBinding5;
                    ActivityMainBinding activityMainBinding6 = activityMainBinding5 = activityMainBinding4;
                    boolean bl4 = false;
                    ViewGroup.LayoutParams layoutParams2 = activityMainBinding6.getLayoutParams();
                    Intrinsics.checkNotNull((Object)layoutParams2, (String)"null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    layoutParams = (ConstraintLayout.LayoutParams)layoutParams2;
                    int n3 = n2 = !dontPush && Globals.INSTANCE.isLayout(6) ? activityMainBinding6.getResources().getDimensionPixelSize(R.dimen.navbar_width) : 0;
                    if (!AppContextUtils.INSTANCE.isLtr((View)activityMainBinding6)) {
                        layoutParams.setMargins(layoutParams.leftMargin, layoutParams.topMargin, n2, layoutParams.bottomMargin);
                    } else {
                        layoutParams.setMargins(n2, layoutParams.topMargin, layoutParams.rightMargin, layoutParams.bottomMargin);
                    }
                    activityMainBinding6.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
                }
                switch (this.getResources().getConfiguration().orientation) {
                    case 2: {
                        bl = true;
                        break;
                    }
                    case 1: {
                        bl = Globals.INSTANCE.isLayout(6);
                        break;
                    }
                    default: {
                        bl = false;
                    }
                }
                boolean landscape = bl;
                ActivityMainBinding activityMainBinding7 = this.binding;
                if (activityMainBinding7 == null) break block8;
                activityMainBinding = activityMainBinding2 = activityMainBinding7;
                boolean bl5 = false;
                NavigationRailView navigationRailView = activityMainBinding.navRailView;
                Intrinsics.checkNotNullExpressionValue((Object)navigationRailView, (String)"navRailView");
                layoutParams = (View)navigationRailView;
                boolean bl6 = isNavVisible && landscape;
                boolean bl7 = false;
                view.setVisibility(bl6 ? 0 : 8);
                BottomNavigationView bottomNavigationView = activityMainBinding.navView;
                Intrinsics.checkNotNullExpressionValue((Object)bottomNavigationView, (String)"navView");
                view = (View)bottomNavigationView;
                boolean bl8 = isNavVisible && !landscape;
                boolean bl9 = false;
                $this$isVisible\5.setVisibility(bl8 ? 0 : 8);
                n = destination.getId();
                objectArray = new Integer[]{R.id.navigation_downloads, R.id.navigation_download_child};
                if (!CollectionsKt.listOf((Object[])objectArray).contains(n)) break block9;
                activityMainBinding.navRailView.getMenu().findItem(R.id.navigation_downloads).setChecked(true);
                activityMainBinding.navView.getMenu().findItem(R.id.navigation_downloads).setChecked(true);
                break block8;
            }
            objectArray = new Integer[]{R.id.navigation_settings, R.id.navigation_subtitles, R.id.navigation_chrome_subtitles, R.id.navigation_settings_player, R.id.navigation_settings_updates, R.id.navigation_settings_ui, R.id.navigation_settings_account, R.id.navigation_settings_providers, R.id.navigation_settings_general, R.id.navigation_settings_extensions, R.id.navigation_settings_plugins, R.id.navigation_test_providers};
            if (!CollectionsKt.listOf((Object[])objectArray).contains(n)) break block8;
            activityMainBinding.navRailView.getMenu().findItem(R.id.navigation_settings).setChecked(true);
            activityMainBinding.navView.getMenu().findItem(R.id.navigation_settings).setChecked(true);
        }
    }

    @Nullable
    public final SessionManager getMSessionManager() {
        return this.mSessionManager;
    }

    public final void setMSessionManager(@Nullable SessionManager sessionManager) {
        this.mSessionManager = sessionManager;
    }

    private final SessionManagerListener<Session> getMSessionManagerListener() {
        Lazy lazy = this.mSessionManagerListener$delegate;
        return (SessionManagerListener)lazy.getValue();
    }

    protected void onResume() {
        super.onResume();
        afterPluginsLoadedEvent.plusAssign((Function1<Boolean, Unit>)((Function1)new Function1<Boolean, Unit>((Object)this){

            public final void invoke(boolean p0) {
                MainActivity.access$onAllPluginsLoaded((MainActivity)this.receiver, p0);
            }
        }));
        CommonActivity.INSTANCE.setActivityInstance((Activity)this);
        try {
            if (AppContextUtils.INSTANCE.isCastApiAvailable((Context)this)) {
                SessionManager sessionManager = this.mSessionManager;
                if (sessionManager != null) {
                    sessionManager.addSessionManagerListener(this.getMSessionManagerListener());
                }
            }
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
    }

    protected void onPause() {
        super.onPause();
        ApkInstaller.DelayedInstaller delayedInstaller = ApkInstaller.Companion.getDelayedInstaller();
        boolean bl = delayedInstaller != null ? delayedInstaller.startInstallation() : false;
        if (bl) {
            Toast.makeText((Context)((Context)this), (int)R.string.update_started, (int)1).show();
        }
        try {
            if (AppContextUtils.INSTANCE.isCastApiAvailable((Context)this)) {
                SessionManager sessionManager = this.mSessionManager;
                if (sessionManager != null) {
                    sessionManager.removeSessionManagerListener(this.getMSessionManagerListener());
                }
            }
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
    }

    public boolean dispatchKeyEvent(@NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter((Object)event, (String)"event");
        Boolean bl = CommonActivity.INSTANCE.dispatchKeyEvent((Activity)this, event);
        return bl != null ? bl.booleanValue() : super.dispatchKeyEvent(event);
    }

    public boolean onKeyDown(int keyCode, @Nullable KeyEvent event) {
        Boolean bl = CommonActivity.INSTANCE.onKeyDown((Activity)this, keyCode, event);
        return bl != null ? bl.booleanValue() : super.onKeyDown(keyCode, event);
    }

    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        CommonActivity.INSTANCE.onUserLeaveHint((Activity)this);
    }

    @SuppressLint(value={"ApplySharedPref"})
    private final void showConfirmExitDialog(SharedPreferences settingsManager) {
        int confirmBeforeExit = settingsManager.getInt(this.getString(R.string.confirm_exit_key), -1);
        if (confirmBeforeExit == 1 || confirmBeforeExit == -1 && Globals.INSTANCE.isLayout(1)) {
            if (Globals.INSTANCE.isLayout(2)) {
                System.exit(0);
                throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
            }
            this.finish();
            return;
        }
        View dialogView = this.getLayoutInflater().inflate(R.layout.confirm_exit_dialog, null);
        View view = dialogView.findViewById(R.id.checkboxDontShowAgain);
        Intrinsics.checkNotNullExpressionValue((Object)view, (String)"findViewById(...)");
        CheckBox dontShowAgainCheck = (CheckBox)view;
        AlertDialog.Builder builder = new AlertDialog.Builder((Context)this);
        builder.setView(dialogView).setTitle(R.string.confirm_exit_dialog).setNegativeButton(R.string.no, MainActivity::showConfirmExitDialog$lambda$4).setPositiveButton(R.string.yes, (arg_0, arg_1) -> MainActivity.showConfirmExitDialog$lambda$5(dontShowAgainCheck, settingsManager, this, arg_0, arg_1));
        AlertDialog alertDialog = builder.show();
        Intrinsics.checkNotNullExpressionValue((Object)alertDialog, (String)"show(...)");
        AppContextUtils.setDefaultFocus$default(AppContextUtils.INSTANCE, alertDialog, 0, 1, null);
    }

    protected void onDestroy() {
        Iterable iterable = MainActivity.Companion.getFilesToDelete();
        boolean bl = false;
        for (Object t : iterable) {
            String string2 = (String)t;
            boolean bl2 = false;
            boolean bl3 = FilesKt.deleteRecursively((File)new File(string2));
            int n = bl3 ? Log.d((String)TAG, (String)("Deleted temporary file: " + string2)) : Log.d((String)TAG, (String)("Failed to delete temporary file: " + string2));
        }
        MainActivity.Companion.setFilesToDelete(SetsKt.emptySet());
        Intent broadcastIntent = new Intent();
        broadcastIntent.setAction("restart_service");
        broadcastIntent.setClass((Context)this, VideoDownloadRestartReceiver.class);
        this.sendBroadcast(broadcastIntent);
        afterPluginsLoadedEvent.minusAssign((Function1<Boolean, Unit>)((Function1)new Function1<Boolean, Unit>((Object)this){

            public final void invoke(boolean p0) {
                MainActivity.access$onAllPluginsLoaded((MainActivity)this.receiver, p0);
            }
        }));
        super.onDestroy();
    }

    protected void onNewIntent(@Nullable Intent intent) {
        this.handleAppIntent(intent);
        super.onNewIntent(intent);
    }

    private final void handleAppIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String str = intent.getDataString();
        AppContextUtils.INSTANCE.loadCache((Activity)this);
        Companion.handleAppIntentUrl((FragmentActivity)this, str, false, intent.getExtras());
    }

    private final boolean matchDestination(NavDestination $this$matchDestination, @IdRes int destId) {
        boolean bl;
        block1: {
            Sequence sequence = NavDestination.Companion.getHierarchy($this$matchDestination);
            boolean bl2 = false;
            for (Object e : sequence) {
                NavDestination navDestination = (NavDestination)e;
                boolean bl3 = false;
                if (!(navDestination.getId() == destId)) continue;
                bl = true;
                break block1;
            }
            bl = false;
        }
        return bl;
    }

    private final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        boolean bl;
        long currentTime = System.currentTimeMillis();
        if (currentTime - this.lastNavTime < 400L) {
            return false;
        }
        this.lastNavTime = currentTime;
        int destinationId = item.getItemId();
        NavDestination navDestination = navController.getCurrentDestination();
        boolean bl2 = navDestination != null ? navDestination.getId() == destinationId : false;
        if (bl2) {
            return false;
        }
        NavOptions.Builder builder = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true).setEnterAnim(R.anim.enter_anim).setExitAnim(R.anim.exit_anim).setPopEnterAnim(R.anim.pop_enter).setPopExitAnim(R.anim.pop_exit);
        if ((item.getOrder() & 0x30000) == 0) {
            builder.setPopUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(destinationId, null, builder.build());
            NavDestination navDestination2 = navController.getCurrentDestination();
            bl = navDestination2 != null ? this.matchDestination(navDestination2, destinationId) : false;
        }
        catch (IllegalArgumentException e) {
            Log.e((String)"NavigationError", (String)("Failed to navigate: " + e.getMessage()));
            bl = false;
        }
        return bl;
    }

    private final void onAllPluginsLoaded(boolean success) {
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(this, null){
            Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(3, $completion);
            }

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var31_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        var2_3 = MainActivity.access$getPluginsLock$p(this.this$0);
                        var4_4 = this.this$0;
                        owner\1 = null;
                        $i$f$withLock\1\728 = false;
                        this.L$0 = $this$withLock_u24default\1;
                        this.L$1 = var4_4;
                        this.label = 1;
                        v0 = $this$withLock_u24default\1.lock(owner\1, (Continuation)this);
                        if (v0 == var31_2) {
                            return var31_2;
                        }
                        ** GOTO lbl23
                    }
                    case 1: {
                        $i$f$withLock\1\728 = false;
                        var4_4 = (MainActivity)this.L$1;
                        owner\1 = null;
                        $this$withLock_u24default\1 = (Mutex)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl23:
                        // 2 sources

                        try {
                            $i$a$-withLock$default-MainActivity$onAllPluginsLoaded$1$1\2\1947\0 = false;
                            var7_9 = APIHolder.INSTANCE.getAllProviders();
                            synchronized (var7_9) {
                                $i$a$-synchronized-MainActivity$onAllPluginsLoaded$1$1$1\3\729\2 = false;
                                try {
                                    var9_12 = DataStore.INSTANCE;
                                    var10_15 = (Context)var4_4;
                                    path\4 = "user_custom_sites";
                                    $i$f$getKey\4\732 = false;
                                    var13_22 = this_\4;
                                    var14_25 = $this$getKey\4;
                                    defVal\5 = null;
                                    $i$f$getKey\5\1948 = false;
                                    try {
                                        v1 = this_\5.getSharedPrefs((Context)$this$getKey\5).getString(path\4, null);
                                        if (v1 == null) {
                                            v2 = defVal\5;
                                        } else {
                                            json\5 = v1;
                                            var18_34 = this_\5;
                                            $this$toKotlinObject\6 = json\5;
                                            $i$f$toKotlinObject\6\1951 = false;
                                            v3 = this_\6.getMapper().readValue($this$toKotlinObject\6, SettingsGeneral.CustomSite[].class);
                                            v2 = v3;
                                            Intrinsics.checkNotNullExpressionValue((Object)v3, (String)"readValue(...)");
                                        }
                                    }
                                    catch (Exception this_\6) {
                                        v2 = null;
                                    }
                                    v4 = (SettingsGeneral.CustomSite[])v2;
                                    if (v4 == null) ** GOTO lbl97
                                    list\7 = v4;
                                    $i$a$-let-MainActivity$onAllPluginsLoaded$1$1$1$1\7\732\3 = false;
                                    $this$forEach\8 = list\7;
                                    $i$f$forEach\8\733 = false;
                                    defVal\5 = $this$forEach\8.length;
                                    for ($this$getKey\5 = 0; $this$getKey\5 < defVal\5; ++$this$getKey\5) {
                                        custom\9 = element\8 = $this$forEach\8[$this$getKey\5];
                                        $i$a$-forEach-MainActivity$onAllPluginsLoaded$1$1$1$1$1\9\1955\7 = false;
                                        $this$firstOrNull\10 = APIHolder.INSTANCE.getAllProviders();
                                        $i$f$firstOrNull\10\734 = false;
                                        for (T element\10 : $this$firstOrNull\10) {
                                            it\11 = (MainAPI)element\10;
                                            $i$a$-firstOrNull-MainActivity$onAllPluginsLoaded$1$1$1$1$1$1\11\1956\9 = false;
                                            if (!Intrinsics.areEqual((Object)it\11.getClass().getSimpleName(), (Object)custom\9.getParentJavaClass())) continue;
                                            v5 = element\10;
                                            ** GOTO lbl77
                                        }
                                        v5 = null;
lbl77:
                                        // 2 sources

                                        var25_46 = v5;
                                        if (var25_46 == null) continue;
                                        it\12 = var25_46;
                                        $i$a$-let-MainActivity$onAllPluginsLoaded$1$1$1$1$1$2\12\735\9 = false;
                                        var22_42 = it\12.getClass().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                        it\11 = (MainAPI)var22_42;
                                        var24_45 = APIHolder.INSTANCE.getAllProviders();
                                        $i$a$-apply-MainActivity$onAllPluginsLoaded$1$1$1$1$1$2$1\13\738\12 = false;
                                        $this$invokeSuspend_u24lambda_u247_u24lambda_u246_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241\13.setName(custom\9.getName());
                                        $this$invokeSuspend_u24lambda_u247_u24lambda_u246_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241\13.setLang(custom\9.getLang());
                                        var27_48 = new char[]{'/'};
                                        $this$invokeSuspend_u24lambda_u247_u24lambda_u246_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241\13.setMainUrl(StringsKt.trimEnd((String)custom\9.getUrl(), (char[])var27_48));
                                        $this$invokeSuspend_u24lambda_u247_u24lambda_u246_u24lambda_u244_u24lambda_u243_u24lambda_u242_u24lambda_u241\13.setCanBeOverridden(false);
                                        v6 = var22_42;
                                        Intrinsics.checkNotNullExpressionValue(v6, (String)"apply(...)");
                                        var24_45.add((MainAPI)v6);
                                    }
lbl97:
                                    // 2 sources

                                    var28_49 = APIHolder.INSTANCE.getAllProviders();
                                    var29_51 = APIHolder.INSTANCE;
                                    $i$f$distinctBy\14\749 = false;
                                    set\14 = new HashSet<String>();
                                    list\14 = new ArrayList<T>();
                                    for (T e\14 : $this$distinctBy\14) {
                                        it\15 = (MainAPI)e\14;
                                        $i$a$-distinctBy-MainActivity$onAllPluginsLoaded$1$1$1$2\15\1962\3 = false;
                                        key\14 = it\15.getLang() + it\15.getName() + it\15.getMainUrl() + it\15.getClass().getName();
                                        if (!set\14.add(key\14)) continue;
                                        list\14.add(e\14);
                                    }
                                    var29_51.setApis((List<? extends MainAPI>)list\14);
                                    APIHolder.INSTANCE.setApiMap(null);
                                }
                                catch (Exception e\3) {
                                    ArchComponentExtKt.logError(e\3);
                                }
                                var8_11 = Unit.INSTANCE;
                            }
                            var30_52 = Unit.INSTANCE;
                        }
                        finally {
                            $this$withLock_u24default\1.unlock(owner\1);
                        }
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
    }

    static /* synthetic */ void onAllPluginsLoaded$default(MainActivity mainActivity, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = false;
        }
        mainActivity.onAllPluginsLoaded(bl);
    }

    @NotNull
    public final ResultViewModel2 getViewModel() {
        ResultViewModel2 resultViewModel2 = this.viewModel;
        if (resultViewModel2 != null) {
            return resultViewModel2;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"viewModel");
        return null;
    }

    public final void setViewModel(@NotNull ResultViewModel2 resultViewModel2) {
        Intrinsics.checkNotNullParameter((Object)((Object)resultViewModel2), (String)"<set-?>");
        this.viewModel = resultViewModel2;
    }

    @NotNull
    public final SyncViewModel getSyncViewModel() {
        SyncViewModel syncViewModel = this.syncViewModel;
        if (syncViewModel != null) {
            return syncViewModel;
        }
        Intrinsics.throwUninitializedPropertyAccessException((String)"syncViewModel");
        return null;
    }

    public final void setSyncViewModel(@NotNull SyncViewModel syncViewModel) {
        Intrinsics.checkNotNullParameter((Object)((Object)syncViewModel), (String)"<set-?>");
        this.syncViewModel = syncViewModel;
    }

    public final boolean isLocalList() {
        return this.isLocalList;
    }

    public final void setLocalList(boolean bl) {
        this.isLocalList = bl;
    }

    @Nullable
    public View onCreateView(@NotNull String name, @NotNull Context context, @NotNull AttributeSet attrs) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)attrs, (String)"attrs");
        this.setViewModel((ResultViewModel2)new ViewModelProvider((ViewModelStoreOwner)this).get(ResultViewModel2.class));
        this.setSyncViewModel((SyncViewModel)new ViewModelProvider((ViewModelStoreOwner)this).get(SyncViewModel.class));
        return super.onCreateView(name, context, attrs);
    }

    private final void hidePreviewPopupDialog() {
        UIHelper.INSTANCE.dismissSafe(this.bottomPreviewPopup, (Activity)this);
        this.bottomPreviewPopup = null;
        this.bottomPreviewBinding = null;
    }

    private final BottomResultviewPreviewBinding showPreviewPopupDialog() {
        BottomResultviewPreviewBinding bottomResultviewPreviewBinding = this.bottomPreviewBinding;
        if (bottomResultviewPreviewBinding == null) {
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding2;
            MainActivity mainActivity = this;
            boolean bl = false;
            Dialog dialog = null;
            int n = 0;
            if (Globals.INSTANCE.isLayout(1)) {
                dialog = (Dialog)new BottomSheetDialog((Context)mainActivity);
                n = R.layout.bottom_resultview_preview;
            } else {
                dialog = new Dialog((Context)mainActivity, R.style.DialogHalfFullscreen);
                n = R.layout.bottom_resultview_preview_tv;
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setGravity(8388629);
                }
            }
            View view = mainActivity.getLayoutInflater().inflate(n, null, false);
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding3 = BottomResultviewPreviewBinding.bind(view);
            Intrinsics.checkNotNullExpressionValue((Object)bottomResultviewPreviewBinding3, (String)"bind(...)");
            mainActivity.bottomPreviewBinding = bottomResultviewPreviewBinding2 = bottomResultviewPreviewBinding3;
            dialog.setContentView(view);
            dialog.setOnDismissListener(arg_0 -> MainActivity.showPreviewPopupDialog$lambda$9$lambda$8(mainActivity, arg_0));
            dialog.setCanceledOnTouchOutside(true);
            dialog.show();
            mainActivity.bottomPreviewPopup = dialog;
            bottomResultviewPreviewBinding = bottomResultviewPreviewBinding2;
        }
        BottomResultviewPreviewBinding ret = bottomResultviewPreviewBinding;
        return ret;
    }

    @Nullable
    public final ActivityMainBinding getBinding() {
        return this.binding;
    }

    public final void setBinding(@Nullable ActivityMainBinding activityMainBinding) {
        this.binding = activityMainBinding;
    }

    private final void centerView(View view) {
        if (view == null) {
            return;
        }
        try {
            Log.v((String)TAG, (String)("centerView: " + view));
            Rect r = new Rect(0, 0, 0, 0);
            view.getDrawingRect(r);
            int x = r.centerX();
            int y = r.centerY();
            int dx = r.width() / 2;
            int dy = CommonActivity.INSTANCE.getScreenHeight() / 2;
            Rect r2 = new Rect(x - dx, y - dy, x + dx, y + dy);
            view.requestRectangleOnScreen(r2, false);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        String string2;
        Object object;
        void $this$getKey\13;
        void $this$getKey\12;
        Context context;
        MainAPI mainAPI2;
        Object view3;
        void $this$isGone\10;
        ActivityMainBinding activityMainBinding;
        Object object2;
        Object object3;
        Object object4;
        Object[] objectArray;
        AlertDialog.Builder builder;
        void this_\4;
        boolean noAccounts;
        Object newLocalBinding;
        MainActivity mainActivity;
        RequestsHelperKt.initClient(MainActivityKt.getApp(), (Context)this);
        SharedPreferences settingsManager = PreferenceManager.getDefaultSharedPreferences((Context)((Context)this));
        File file = this.getFilesDir();
        Intrinsics.checkNotNullExpressionValue((Object)file, (String)"getFilesDir(...)");
        File errorFile = FilesKt.resolve((File)file, (String)"last_error");
        if (errorFile.exists() && errorFile.isFile()) {
            Charset charset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue((Object)charset, (String)"defaultCharset(...)");
            lastError = FilesKt.readText((File)errorFile, (Charset)charset);
            errorFile.delete();
        } else {
            lastError = null;
        }
        SettingsJson settingsForProvider = new SettingsJson(false, 1, null);
        settingsForProvider.setEnableAdult(settingsManager.getBoolean(this.getString(R.string.enable_nsfw_on_providers_key), false));
        MainAPI.Companion.setSettingsForProvider(settingsForProvider);
        CommonActivity.INSTANCE.loadThemes((Activity)this);
        CommonActivity.INSTANCE.updateLocale((Context)this);
        super.onCreate(savedInstanceState);
        try {
            if (AppContextUtils.INSTANCE.isCastApiAvailable((Context)this)) {
                CastContext.getSharedInstance((Context)((Context)this), MainActivity::onCreate$lambda$10).addOnSuccessListener(arg_0 -> MainActivity.onCreate$lambda$12(arg_0 -> MainActivity.onCreate$lambda$11(this, arg_0), arg_0));
            }
        }
        catch (Throwable t) {
            ArchComponentExtKt.logError(t);
        }
        this.getWindow().setSoftInputMode(3);
        Globals.INSTANCE.updateTv((Context)this);
        ArchComponentExtKt.safe(() -> MainActivity.onCreate$lambda$15(this));
        MainActivity mainActivity2 = this;
        try {
            Object object5;
            mainActivity = mainActivity2;
            if (Globals.INSTANCE.isLayout(6)) {
                void $this$isVisible\1;
                ActivityMainTvBinding activityMainTvBinding = ActivityMainTvBinding.inflate(this.getLayoutInflater(), null, false);
                Intrinsics.checkNotNullExpressionValue((Object)activityMainTvBinding, (String)"inflate(...)");
                newLocalBinding = activityMainTvBinding;
                this.setContentView((View)((ActivityMainTvBinding)newLocalBinding).getRoot());
                if (Globals.INSTANCE.isLayout(2)) {
                    // empty if block
                }
                ImageView imageView = ((ActivityMainTvBinding)newLocalBinding).focusOutline;
                Intrinsics.checkNotNullExpressionValue((Object)imageView, (String)"focusOutline");
                View view2 = (View)imageView;
                boolean bl3 = false;
                boolean bl2 = false;
                $this$isVisible\1.setVisibility(8);
                if (Globals.INSTANCE.isLayout(2)) {
                    Object[] bl3 = new Integer[]{R.id.home_preview_play_btt, R.id.home_preview_info_btt, R.id.home_preview_hidden_next_focus, R.id.home_preview_hidden_prev_focus, R.id.result_play_movie_button, R.id.result_play_series_button, R.id.result_resume_series_button, R.id.result_play_trailer_button, R.id.result_bookmark_Button, R.id.result_favorite_Button, R.id.result_subscribe_Button, R.id.result_search_Button, R.id.result_episodes_show_button};
                    List exceptionButtons = CollectionsKt.listOf((Object[])bl3);
                    ((ActivityMainTvBinding)newLocalBinding).getRoot().getViewTreeObserver().addOnGlobalFocusChangeListener((arg_0, arg_1) -> MainActivity.onCreate$lambda$18(exceptionButtons, this, arg_0, arg_1));
                }
                object5 = ActivityMainBinding.bind((View)((ActivityMainTvBinding)newLocalBinding).getRoot());
            } else {
                ActivityMainBinding activityMainBinding2 = ActivityMainBinding.inflate(this.getLayoutInflater(), null, false);
                Intrinsics.checkNotNullExpressionValue((Object)activityMainBinding2, (String)"inflate(...)");
                newLocalBinding = activityMainBinding2;
                this.setContentView((View)((ActivityMainBinding)newLocalBinding).getRoot());
                object5 = newLocalBinding;
            }
            newLocalBinding = object5;
        }
        catch (Throwable exceptionButtons) {
            void t;
            mainActivity = mainActivity2;
            Object[] bl3 = new Object[1];
            String string3 = t.getMessage();
            if (string3 == null) {
                string3 = "";
            }
            bl3[0] = string3;
            CommonActivity.INSTANCE.showToast(TextUtilKt.txt(R.string.unable_to_inflate, bl3), (Integer)1);
            newLocalBinding = null;
        }
        mainActivity.binding = newLocalBinding;
        int padding = UIHelper.INSTANCE.getToPx(settingsManager.getInt(this.getString(R.string.overscan_key), 0));
        ActivityMainBinding activityMainBinding3 = this.binding;
        if (activityMainBinding3 != null && (activityMainBinding3 = activityMainBinding3.homeRoot) != null) {
            activityMainBinding3.setPadding(padding, padding, padding, padding);
        }
        UIHelper.INSTANCE.changeStatusBarState((Activity)this, Globals.INSTANCE.isLayout(4));
        boolean bl = noAccounts = settingsManager.getBoolean(this.getString(R.string.skip_startup_account_select_key), false) || DataStoreHelper.INSTANCE.getAccounts().length <= 1;
        if (Globals.INSTANCE.isLayout(1) && BiometricAuthenticator.INSTANCE.isAuthEnabled((Context)this) && noAccounts && BiometricAuthenticator.INSTANCE.deviceHasPasswordPinLock((Context)this)) {
            ActivityMainBinding activityMainBinding4;
            BiometricPrompt.PromptInfo promptInfo;
            BiometricAuthenticator.INSTANCE.startBiometricAuthentication((FragmentActivity)this, R.string.biometric_authentication_title, false);
            BiometricPrompt.PromptInfo promptInfo2 = BiometricAuthenticator.INSTANCE.getPromptInfo();
            if (promptInfo2 != null) {
                promptInfo = promptInfo2;
                boolean bl4 = false;
                BiometricPrompt biometricPrompt = BiometricAuthenticator.INSTANCE.getBiometricPrompt();
                if (biometricPrompt != null) {
                    biometricPrompt.authenticate(promptInfo);
                }
            }
            if ((activityMainBinding4 = this.binding) != null && (activityMainBinding4 = activityMainBinding4.navHostFragment) != null) {
                void $this$isInvisible\3;
                promptInfo = (View)activityMainBinding4;
                boolean bl5 = true;
                boolean bl6 = false;
                $this$isInvisible\3.setVisibility(4);
            }
        }
        DataStore bl3 = DataStore.INSTANCE;
        Context bl2 = (Context)this;
        String string4 = this.getString(R.string.jsdelivr_proxy_key);
        Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"getString(...)");
        String string5 = string4;
        boolean bl7 = false;
        void bl6 = this_\4;
        void var12_25 = builder;
        Object object6 = null;
        boolean bl8 = false;
        try {
            String string6 = objectArray.getSharedPrefs((Context)object4).getString(string5, null);
            if (string6 == null) {
                object3 = object6;
            } else {
                void this_\6;
                String string7 = string6;
                void var16_35 = objectArray;
                String string8 = string7;
                boolean bl9 = false;
                Object object7 = this_\6.getMapper().readValue(string8, Boolean.class);
                object3 = object7;
                Intrinsics.checkNotNullExpressionValue((Object)object7, (String)"readValue(...)");
            }
        }
        catch (Exception exception) {
            object3 = null;
        }
        if (object3 == null && AppContextUtils.INSTANCE.isNetworkAvailable((Context)this)) {
            Coroutines.INSTANCE.main(this, (Function2)new Function2<MainActivity, Continuation<? super Unit>, Object>(this, null){
                int label;
                final /* synthetic */ MainActivity this$0;
                {
                    this.this$0 = $receiver;
                    super(2, $completion);
                }

                /*
                 * Unable to fully structure code
                 */
                public final Object invokeSuspend(Object var1_1) {
                    var2_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (this.label) {
                        case 0: {
                            ResultKt.throwOnFailure((Object)var1_1);
                            this.label = 1;
                            v0 = this.this$0.checkGithubConnectivity((Continuation<? super Boolean>)((Continuation)this));
                            if (v0 == var2_2) {
                                return var2_2;
                            }
                            ** GOTO lbl13
                        }
                        case 1: {
                            ResultKt.throwOnFailure((Object)$result);
                            v0 = $result;
lbl13:
                            // 2 sources

                            if (((Boolean)v0).booleanValue()) {
                                v1 = (Context)this.this$0;
                                v2 = this.this$0.getString(R.string.jsdelivr_proxy_key);
                                Intrinsics.checkNotNullExpressionValue((Object)v2, (String)"getString(...)");
                                DataStore.INSTANCE.setKey(v1, v2, Boxing.boxBoolean((boolean)false));
                            } else {
                                v3 = (Context)this.this$0;
                                v4 = this.this$0.getString(R.string.jsdelivr_proxy_key);
                                Intrinsics.checkNotNullExpressionValue((Object)v4, (String)"getString(...)");
                                DataStore.INSTANCE.setKey(v3, v4, Boxing.boxBoolean((boolean)true));
                                SnackbarHelper.INSTANCE.showSnackbar((Activity)this.this$0, R.string.jsdelivr_enabled, 0, Boxing.boxInt((int)R.string.revert), (Function0<Unit>)(Function0)LambdaMetafactory.metafactory(null, null, null, ()Ljava/lang/Object;, invokeSuspend$lambda$0(com.lagradost.cloudstream3.MainActivity ), ()Lkotlin/Unit;)((MainActivity)this.this$0));
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                }

                public final Object invoke(MainActivity p1, Continuation<? super Unit> p2) {
                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                }

                private static final Unit invokeSuspend$lambda$0(MainActivity this$0) {
                    Context context = (Context)this$0;
                    String string2 = this$0.getString(R.string.jsdelivr_proxy_key);
                    Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"getString(...)");
                    DataStore.INSTANCE.setKey(context, string2, false);
                    return Unit.INSTANCE;
                }
            });
        }
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(this, null){
            int label;
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(3, $completion);
            }

            public final Object invokeSuspend(Object object) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)object);
                        SafeFile.Companion.check((Context)this.this$0);
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
        if (PluginManager.INSTANCE.checkSafeModeFile()) {
            object2 = ArchComponentExtKt.safe(MainActivity::onCreate$lambda$20);
        } else if (lastError == null) {
            object2 = Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(this, settingsManager, null){
                Object L$1;
                int label;
                private /* synthetic */ Object L$0;
                final /* synthetic */ MainActivity this$0;
                final /* synthetic */ SharedPreferences $settingsManager;
                {
                    this.this$0 = $receiver;
                    this.$settingsManager = $settingsManager;
                    super(3, $completion);
                }

                /*
                 * Unable to fully structure code
                 */
                public final Object invokeSuspend(Object var1_1) {
                    block5: {
                        var8_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        switch (this.label) {
                            case 0: {
                                ResultKt.throwOnFailure((Object)var1_1);
                                $this$ioSafe = (CoroutineScope)this.L$0;
                                v0 = DataStoreHelper.INSTANCE.getCurrentHomePage();
                                if (v0 == null) break;
                                var3_4 = v0;
                                var4_5 = this.this$0;
                                homeApi\1 = var3_4;
                                $i$a$-let-MainActivity$onCreate$11$1\1\1264\0 = false;
                                var7_10 = MainActivity.Companion.getMainPluginsLoadedEvent();
                                this.L$0 = $this$ioSafe;
                                this.L$1 = var7_10;
                                this.label = 1;
                                v1 = PluginManager.INSTANCE.loadSinglePlugin((Context)var4_5, homeApi\1, (Continuation<? super Boolean>)this);
                                if (v1 == var8_2) {
                                    return var8_2;
                                }
                                ** GOTO lbl26
                            }
                            case 1: {
                                $i$a$-let-MainActivity$onCreate$11$1\1\1264\0 = false;
                                var7_10 = (Event<Boolean>)this.L$1;
                                $this$ioSafe = (CoroutineScope)this.L$0;
                                ResultKt.throwOnFailure((Object)$result);
                                v1 = $result;
lbl26:
                                // 2 sources

                                var7_10.invoke((Boolean)v1);
                                break block5;
                            }
                        }
                        $i$a$-run-MainActivity$onCreate$11$2\2\1266\0 = false;
                        MainActivity.Companion.getMainPluginsLoadedEvent().invoke(Boxing.boxBoolean((boolean)false));
                    }
                    Coroutines.INSTANCE.ioSafe($this$ioSafe, (Function3)new Function3<CoroutineScope, CoroutineScope, Continuation<? super Unit>, Object>(this.$settingsManager, this.this$0, null){
                        int label;
                        final /* synthetic */ SharedPreferences $settingsManager;
                        final /* synthetic */ MainActivity this$0;
                        {
                            this.$settingsManager = $settingsManager;
                            this.this$0 = $receiver;
                            super(3, $completion);
                        }

                        /*
                         * Unable to fully structure code
                         */
                        public final Object invokeSuspend(Object var1_1) {
                            var3_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            switch (this.label) {
                                case 0: {
                                    ResultKt.throwOnFailure((Object)var1_1);
                                    if (!this.$settingsManager.getBoolean(this.this$0.getString(R.string.auto_update_plugins_key), true)) break;
                                    this.label = 1;
                                    v0 = PluginManager.INSTANCE.___DO_NOT_CALL_FROM_A_PLUGIN_updateAllOnlinePluginsAndLoadThem((Activity)this.this$0, (Continuation<? super Unit>)((Continuation)this));
                                    if (v0 == var3_2) {
                                        return var3_2;
                                    }
                                    ** GOTO lbl23
                                }
                                case 1: {
                                    ResultKt.throwOnFailure((Object)$result);
                                    v0 = $result;
                                    ** GOTO lbl23
                                }
                            }
                            this.label = 2;
                            v1 = PluginManager.INSTANCE.___DO_NOT_CALL_FROM_A_PLUGIN_loadAllOnlinePlugins((Context)this.this$0, (Continuation<? super Unit>)((Continuation)this));
                            if (v1 == var3_2) {
                                return var3_2;
                            }
                            ** GOTO lbl23
                            {
                                case 2: {
                                    ResultKt.throwOnFailure((Object)$result);
                                    v1 = $result;
lbl23:
                                    // 4 sources

                                    if ((v2 = AutoDownloadMode.Companion.getEnum(this.$settingsManager.getInt(this.this$0.getString(R.string.auto_download_plugins_key), 0))) == null) {
                                        v2 = AutoDownloadMode.Disable;
                                    }
                                    if ((autoDownloadPlugin = v2) != AutoDownloadMode.Disable) {
                                        this.label = 3;
                                        v3 = PluginManager.INSTANCE.___DO_NOT_CALL_FROM_A_PLUGIN_downloadNotExistingPluginsAndLoad((Activity)this.this$0, autoDownloadPlugin, (Continuation<? super Unit>)((Continuation)this));
                                        if (v3 == var3_2) {
                                            return var3_2;
                                        }
                                    }
                                    ** GOTO lbl34
                                }
                                case 3: {
                                    ResultKt.throwOnFailure((Object)$result);
                                    v3 = $result;
lbl34:
                                    // 2 sources

                                    return Unit.INSTANCE;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        public final Object invoke(CoroutineScope p1, CoroutineScope p2, Continuation<? super Unit> p3) {
                            return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                        }
                    });
                    Coroutines.INSTANCE.ioSafe($this$ioSafe, (Function3)new Function3<CoroutineScope, CoroutineScope, Continuation<? super Unit>, Object>(this.this$0, null){
                        int label;
                        final /* synthetic */ MainActivity this$0;
                        {
                            this.this$0 = $receiver;
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
                                    Object object3 = PluginManager.INSTANCE.___DO_NOT_CALL_FROM_A_PLUGIN_loadAllLocalPlugins((Context)this.this$0, false, (Continuation<? super Unit>)((Continuation)this));
                                    if (object3 != object2) return Unit.INSTANCE;
                                    return object2;
                                }
                                case 1: {
                                    void $result;
                                    ResultKt.throwOnFailure((Object)$result);
                                    Object object3 = $result;
                                    return Unit.INSTANCE;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        public final Object invoke(CoroutineScope p1, CoroutineScope p2, Continuation<? super Unit> p3) {
                            return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                        }
                    });
                    return Unit.INSTANCE;
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }

                public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                    Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object> function3 = new /* invalid duplicate definition of identical inner class */;
                    function3.L$0 = p1;
                    return function3.invokeSuspend((Object)Unit.INSTANCE);
                }
            });
        } else {
            AlertDialog.Builder builder2 = new AlertDialog.Builder((Context)this);
            builder2.setTitle(R.string.safe_mode_title);
            builder2.setMessage(R.string.safe_mode_description);
            AlertDialog.Builder builder3 = builder = builder2;
            boolean bl10 = false;
            builder3.setPositiveButton(R.string.safe_mode_crash_info, (arg_0, arg_1) -> MainActivity.onCreate$lambda$23$lambda$21(builder3, arg_0, arg_1));
            builder3.setNegativeButton((CharSequence)"Ok", MainActivity::onCreate$lambda$23$lambda$22);
            AlertDialog alertDialog = builder2.show();
            Intrinsics.checkNotNullExpressionValue((Object)alertDialog, (String)"show(...)");
            AppContextUtils.setDefaultFocus$default(AppContextUtils.INSTANCE, alertDialog, 0, 1, null);
            object2 = Unit.INSTANCE;
        }
        LifecycleKt.observe((LifecycleOwner)this, this.getViewModel().getWatchStatus(), (Function1)new Function1<WatchType, Unit>(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(1, Intrinsics.Kotlin.class, "setWatchStatus", "onCreate$setWatchStatus(Lcom/lagradost/cloudstream3/MainActivity;Lcom/lagradost/cloudstream3/ui/WatchType;)V", 0);
            }

            public final void invoke(WatchType p0) {
                MainActivity.access$onCreate$setWatchStatus(this.this$0, p0);
            }
        });
        LifecycleKt.observe((LifecycleOwner)this, this.getSyncViewModel().getUserData(), (Function1)new Function1<Resource<? extends SyncAPI.AbstractSyncStatus>, Unit>(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(1, Intrinsics.Kotlin.class, "setUserData", "onCreate$setUserData(Lcom/lagradost/cloudstream3/MainActivity;Lcom/lagradost/cloudstream3/mvvm/Resource;)V", 0);
            }

            public final void invoke(Resource<? extends SyncAPI.AbstractSyncStatus> p0) {
                MainActivity.access$onCreate$setUserData(this.this$0, p0);
            }
        });
        LifecycleKt.observeNullable((LifecycleOwner)this, this.getViewModel().getSubscribeStatus(), (Function1)new Function1<Boolean, Unit>(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(1, Intrinsics.Kotlin.class, "setSubscribeStatus", "onCreate$setSubscribeStatus(Lcom/lagradost/cloudstream3/MainActivity;Ljava/lang/Boolean;)V", 0);
            }

            public final void invoke(Boolean p0) {
                MainActivity.access$onCreate$setSubscribeStatus(this.this$0, p0);
            }
        });
        LifecycleKt.observeNullable((LifecycleOwner)this, this.getViewModel().getPage(), arg_0 -> MainActivity.onCreate$lambda$45(this, arg_0));
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(this, null){
            int label;
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(3, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var4_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        for (AccountManager api : AccountManager.Companion.getAccountManagers()) {
                            api.init();
                        }
                        this.label = 1;
                        v0 = ParCollectionsKt.amap(AccountManager.Companion.getInAppAuths(), (Function2)new Function2<InAppAuthAPIManager, Continuation<? super Unit>, Object>(null){
                            int label;
                            /* synthetic */ Object L$0;

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
                                        InAppAuthAPIManager api = (InAppAuthAPIManager)this.L$0;
                                        this.label = 1;
                                        Object object3 = api.initialize((Continuation<? super Unit>)((Continuation)this));
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
                                        catch (Exception e) {
                                            ArchComponentExtKt.logError(e);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                Function2<InAppAuthAPIManager, Continuation<? super Unit>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                                function2.L$0 = value;
                                return (Continuation)function2;
                            }

                            public final Object invoke(InAppAuthAPIManager p1, Continuation<? super Unit> p2) {
                                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                            }
                        }, (Continuation)this);
                        if (v0 == var4_2) {
                            return var4_2;
                        }
                        ** GOTO lbl16
                    }
                    case 1: {
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl16:
                        // 2 sources

                        this.this$0.runOnUiThread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, invokeSuspend$lambda$2(com.lagradost.cloudstream3.MainActivity ), ()V)((MainActivity)this.this$0));
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }

            private static final Unit invokeSuspend$lambda$2$lambda$1(MainActivity this$0, String it) {
                block2: {
                    ActivityMainBinding activityMainBinding;
                    Object object;
                    LibraryViewModel libraryViewModel = MainActivity.access$getLibraryViewModel$p(this$0);
                    SyncRepo syncAPI = libraryViewModel != null ? libraryViewModel.getCurrentSyncApi() : null;
                    SyncRepo syncRepo = syncAPI;
                    SyncRepo syncRepo2 = syncAPI;
                    Log.i((String)"SYNC_API", (String)((syncRepo != null ? syncRepo.getName() : null) + ", " + (syncRepo2 != null ? syncRepo2.getIdPrefix() : null)));
                    SyncRepo syncRepo3 = syncAPI;
                    int icon = Intrinsics.areEqual((Object)(syncRepo3 != null ? syncRepo3.getIdPrefix() : null), (Object)AccountManager.Companion.getLocalListApi().getIdPrefix()) ? R.drawable.library_icon_selector : ((object = syncAPI) != null && (object = ((SyncRepo)object).getIcon()) != null ? (Integer)object : R.drawable.library_icon_selector);
                    ActivityMainBinding activityMainBinding2 = this$0.getBinding();
                    if (activityMainBinding2 == null) break block2;
                    ActivityMainBinding activityMainBinding3 = activityMainBinding = activityMainBinding2;
                    boolean bl = false;
                    MenuItem menuItem = activityMainBinding3.navRailView.getMenu().findItem(R.id.navigation_library);
                    if (menuItem != null) {
                        menuItem.setIcon(icon);
                    }
                    MenuItem menuItem2 = activityMainBinding3.navView.getMenu().findItem(R.id.navigation_library);
                    if (menuItem2 != null) {
                        menuItem2.setIcon(icon);
                    }
                }
                return Unit.INSTANCE;
            }

            private static final void invokeSuspend$lambda$2(MainActivity this$0) {
                block0: {
                    MainActivity.access$setLibraryViewModel$p(this$0, (LibraryViewModel)new ViewModelProvider((ViewModelStoreOwner)this$0).get(LibraryViewModel.class));
                    LiveData<String> liveData = MainActivity.access$getLibraryViewModel$p(this$0);
                    if (liveData == null || (liveData = liveData.getCurrentApiName()) == null) break block0;
                    Function1 function1 = arg_0 -> onCreate.17.invokeSuspend$lambda$2$lambda$1(this$0, arg_0);
                    liveData.observe((LifecycleOwner)this$0, new Observer(function1){
                        private final /* synthetic */ Function1 function;
                        {
                            Intrinsics.checkNotNullParameter((Object)function, (String)"function");
                            this.function = function;
                        }

                        public final /* synthetic */ void onChanged(Object value) {
                            this.function.invoke(value);
                        }

                        @NotNull
                        public final Function<?> getFunctionDelegate() {
                            return (Function)this.function;
                        }

                        public final boolean equals(@Nullable Object other) {
                            return other instanceof Observer ? (other instanceof FunctionAdapter ? Intrinsics.areEqual((Object)((FunctionAdapter)this).getFunctionDelegate(), (Object)((FunctionAdapter)other).getFunctionDelegate()) : false) : false;
                        }

                        public final int hashCode() {
                            return ((FunctionAdapter)this).getFunctionDelegate().hashCode();
                        }
                    });
                }
            }
        });
        SearchResultBuilder.INSTANCE.updateCache((Context)this);
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(null){
            int label;

            /*
             * WARNING - Removed try catching itself - possible behaviour change.
             */
            public final Object invokeSuspend(Object object) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        List list2;
                        ResultKt.throwOnFailure((Object)object);
                        APIHolder.INSTANCE.initAll();
                        List<MainAPI> list3 = APIHolder.INSTANCE.getAllProviders();
                        APIHolder aPIHolder = APIHolder.INSTANCE;
                        List<MainAPI> list4 = list3;
                        synchronized (list4) {
                            boolean bl = false;
                            Iterable iterable = APIHolder.INSTANCE.getAllProviders();
                            boolean bl2 = false;
                            HashSet<MainAPI> hashSet = new HashSet<MainAPI>();
                            ArrayList<T> arrayList = new ArrayList<T>();
                            for (T t : iterable) {
                                MainAPI mainAPI = (MainAPI)t;
                                boolean bl3 = false;
                                MainAPI mainAPI2 = mainAPI;
                                if (!hashSet.add(mainAPI2)) continue;
                                arrayList.add(t);
                            }
                            list2 = arrayList;
                        }
                        aPIHolder.setApis(list2);
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
        BackupUtils.INSTANCE.setUpBackup((FragmentActivity)this);
        CommonActivity.INSTANCE.init((Activity)this);
        Fragment fragment = this.getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        Intrinsics.checkNotNull((Object)fragment, (String)"null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment)fragment;
        NavController navController = navHostFragment.getNavController();
        navController.addOnDestinationChangedListener((arg_0, arg_1, arg_2) -> MainActivity.onCreate$lambda$48(this, settingsManager, arg_0, arg_1, arg_2));
        ColorStateList colorStateList = ColorStateList.valueOf((int)UIHelper.INSTANCE.getResourceColor((Context)this, R.attr.colorPrimary, 0.1f));
        Intrinsics.checkNotNullExpressionValue((Object)colorStateList, (String)"valueOf(...)");
        ColorStateList rippleColor = colorStateList;
        ActivityMainBinding activityMainBinding5 = this.binding;
        if (activityMainBinding5 != null && (activityMainBinding5 = activityMainBinding5.navView) != null) {
            object4 = activityMainBinding5;
            ActivityMainBinding activityMainBinding6 = object4;
            boolean bl11 = false;
            activityMainBinding6.setItemRippleColor(rippleColor);
            activityMainBinding6.setItemActiveIndicatorColor(rippleColor);
            BottomNavigationViewKt.setupWithNavController((NavigationBarView)((NavigationBarView)activityMainBinding6), (NavController)navController);
            activityMainBinding6.setOnItemSelectedListener(arg_0 -> MainActivity.onCreate$lambda$50$lambda$49(this, navController, arg_0));
        }
        if ((activityMainBinding = this.binding) != null && (activityMainBinding = activityMainBinding.navRailView) != null) {
            ImageView imageView;
            object4 = activityMainBinding;
            ActivityMainBinding activityMainBinding7 = object4;
            boolean bl12 = false;
            activityMainBinding7.setItemRippleColor(rippleColor);
            activityMainBinding7.setItemActiveIndicatorColor(rippleColor);
            BottomNavigationViewKt.setupWithNavController((NavigationBarView)((NavigationBarView)activityMainBinding7), (NavController)navController);
            if (Globals.INSTANCE.isLayout(6)) {
                Drawable drawable2 = activityMainBinding7.getBackground();
                if (drawable2 != null) {
                    drawable2.setAlpha(200);
                }
            } else {
                Drawable drawable3 = activityMainBinding7.getBackground();
                if (drawable3 != null) {
                    drawable3.setAlpha(255);
                }
            }
            activityMainBinding7.setOnItemSelectedListener(arg_0 -> MainActivity.onCreate$lambda$55$lambda$51(this, navController, arg_0));
            LinearLayout linearLayout = (LinearLayout)activityMainBinding7.findViewById(R.id.nav_footer_root);
            if (Globals.INSTANCE.isLayout(6)) {
                CardView cardView;
                imageView = (ImageView)activityMainBinding7.findViewById(R.id.nav_footer_profile_pic);
                CardView cardView2 = cardView = (CardView)activityMainBinding7.findViewById(R.id.nav_footer_profile_card);
                if (cardView2 != null) {
                    cardView2.setOnClickListener(arg_0 -> MainActivity.onCreate$lambda$55$lambda$53(this, arg_0));
                }
                HomeViewModel homeViewModel = (HomeViewModel)new ViewModelProvider((ViewModelStoreOwner)this).get(HomeViewModel.class);
                LifecycleKt.observe((LifecycleOwner)this, (LiveData)homeViewModel.getCurrentAccount(), arg_0 -> MainActivity.onCreate$lambda$55$lambda$54(imageView, linearLayout, arg_0));
            } else {
                Intrinsics.checkNotNull((Object)linearLayout);
                imageView = (View)linearLayout;
                boolean bl13 = true;
                boolean bl14 = false;
                $this$isGone\10.setVisibility(8);
            }
        }
        objectArray = new NavigationBarView[2];
        ActivityMainBinding activityMainBinding8 = this.binding;
        objectArray[0] = activityMainBinding8 != null ? activityMainBinding8.navView : null;
        ActivityMainBinding activityMainBinding9 = this.binding;
        objectArray[1] = activityMainBinding9 != null ? activityMainBinding9.navRailView : null;
        for (Object view3 : CollectionsKt.listOf((Object[])objectArray)) {
            NavigationBarView navigationBarView;
            NavigationBarView navigationBarView2;
            NavigationBarView navigationBarView3;
            NavigationBarView navigationBarView4 = view3;
            if (navigationBarView4 != null && (navigationBarView4 = navigationBarView4.findViewById(R.id.navigation_home)) != null) {
                navigationBarView4.setOnLongClickListener(arg_0 -> MainActivity.onCreate$lambda$56(this, arg_0));
            }
            if ((navigationBarView3 = view3) != null && (navigationBarView3 = navigationBarView3.findViewById(R.id.navigation_library)) != null) {
                navigationBarView3.setOnLongClickListener(arg_0 -> MainActivity.onCreate$lambda$57(this, arg_0));
            }
            if ((navigationBarView2 = view3) != null && (navigationBarView2 = navigationBarView2.findViewById(R.id.navigation_search)) != null) {
                navigationBarView2.setOnLongClickListener(arg_0 -> MainActivity.onCreate$lambda$58(this, arg_0));
            }
            if ((navigationBarView = view3) == null || (navigationBarView = navigationBarView.findViewById(R.id.navigation_downloads)) == null) continue;
            navigationBarView.setOnLongClickListener(arg_0 -> MainActivity.onCreate$lambda$59(this, arg_0));
        }
        AppContextUtils.INSTANCE.loadCache((Activity)this);
        AppContextUtils.INSTANCE.updateHasTrailers((Context)this);
        if (!UIHelper.INSTANCE.checkWrite((Context)this)) {
            UIHelper.INSTANCE.requestRW((Activity)this);
            if (UIHelper.INSTANCE.checkWrite((Context)this)) {
                return;
            }
        }
        if (BuildConfig.DEBUG) {
            String providersAndroidManifestString = null;
            providersAndroidManifestString = "Current androidmanifest should be:\n";
            object4 = APIHolder.INSTANCE.getAllProviders();
            synchronized (object4) {
                boolean $i$a$-synchronized-MainActivity$onCreate$26\11\1833\12 = false;
                for (MainAPI mainAPI2 : APIHolder.INSTANCE.getAllProviders()) {
                    providersAndroidManifestString = providersAndroidManifestString + "<data android:scheme=\"https\" android:host=\"" + StringsKt.removePrefix((String)mainAPI2.getMainUrl(), (CharSequence)"https://") + "\" android:pathPrefix=\"/\"/>\n";
                }
                Unit $i$a$-synchronized-MainActivity$onCreate$26\11\1833\12 = Unit.INSTANCE;
            }
            System.out.println((Object)providersAndroidManifestString);
        }
        this.handleAppIntent(this.getIntent());
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(this, null){
            int label;
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
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
                        Object object3 = InAppUpdater.Companion.runAutoUpdate$default(InAppUpdater.Companion, (Activity)this.this$0, false, (Continuation)this, 1, null);
                        if (object3 != object2) return Unit.INSTANCE;
                        return object2;
                    }
                    case 1: {
                        void $result;
                        ResultKt.throwOnFailure((Object)$result);
                        Object object3 = $result;
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
        new FcastManager().init((Context)this, false);
        APIRepository.Companion.setDubStatusActive(AppContextUtils.INSTANCE.getApiDubstatusSettings((Context)this));
        try {
            AppContextUtils.INSTANCE.loadCache((Activity)this);
            FilesKt.deleteRecursively((File)new File(this.getFilesDir(), "exoplayer"));
            Companion.deleteFileOnExit(new File(this.getCacheDir(), "exoplayer"));
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
        System.out.println((Object)"Loaded everything");
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, MainActivity, Continuation<? super Unit>, Object>(null){
            int label;

            public final Object invokeSuspend(Object object) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)object);
                        DataStoreHelper.INSTANCE.migrateResumeWatching();
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, MainActivity p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
        view3 = DataStore.INSTANCE;
        object4 = (Context)this;
        String string9 = "home_api_used";
        boolean bl15 = false;
        mainAPI2 = context;
        $this$isGone\10 = $this$getKey\12;
        Object object8 = null;
        boolean bl16 = false;
        try {
            void this_\13;
            String string10 = this_\13.getSharedPrefs((Context)$this$getKey\13).getString(string9, null);
            if (string10 == null) {
                object = object8;
            } else {
                void this_\14;
                String string11 = string10;
                void var20_45 = this_\13;
                String string12 = string11;
                boolean bl17 = false;
                Object object9 = this_\14.getMapper().readValue(string12, String.class);
                object = object9;
                Intrinsics.checkNotNullExpressionValue((Object)object9, (String)"readValue(...)");
            }
        }
        catch (Exception exception) {
            object = null;
        }
        String string13 = (String)object;
        if (string13 != null) {
            string2 = string13;
            boolean bl18 = false;
            DataStoreHelper.INSTANCE.setCurrentHomePage(string2);
            AcraApplication.Companion.removeKey("home_api_used");
        }
        try {
            Object object10;
            DataStore e = DataStore.INSTANCE;
            context = (Context)this;
            string2 = "HAS_DONE_SETUP";
            Boolean bl19 = false;
            boolean bl20 = false;
            try {
                void path\16;
                void $this$getKey\16;
                void this_\16;
                String string14 = this_\16.getSharedPrefs((Context)$this$getKey\16).getString((String)path\16, null);
                if (string14 == null) {
                    object10 = bl19;
                } else {
                    void this_\17;
                    String string15 = string14;
                    $this$getKey\13 = this_\16;
                    String string16 = string15;
                    boolean bl21 = false;
                    Object object11 = this_\17.getMapper().readValue(string16, Boolean.class);
                    object10 = object11;
                    Intrinsics.checkNotNullExpressionValue((Object)object11, (String)"readValue(...)");
                }
            }
            catch (Exception exception) {
                object10 = null;
            }
            if (!Intrinsics.areEqual(object10, (Object)true)) {
                navController.navigate(R.id.navigation_setup_language);
            } else if (PluginManager.INSTANCE.getPluginsOnline().length == 0 && PluginManager.INSTANCE.getPluginsLocal().length == 0) {
                navController.navigate(R.id.navigation_setup_extensions, SetupFragmentExtensions.Companion.newInstance(false));
            }
        }
        catch (Exception e) {
            ArchComponentExtKt.logError(e);
        }
        this.getOnBackPressedDispatcher().addCallback((LifecycleOwner)this, new OnBackPressedCallback(this){
            final /* synthetic */ MainActivity this$0;
            {
                this.this$0 = $receiver;
                super(true);
            }

            public void handleOnBackPressed() {
                Window window = this.this$0.getWindow();
                if (window != null) {
                    window.setNavigationBarColor(UIHelper.INSTANCE.colorFromAttribute((Context)this.this$0, R.attr.primaryGrayBackground));
                }
                CommonActivity.INSTANCE.updateLocale((Context)this.this$0);
                this.setEnabled(false);
                this.this$0.getOnBackPressedDispatcher().onBackPressed();
                this.setEnabled(true);
            }
        });
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void onAuthenticationSuccess() {
        block0: {
            void $this$isInvisible\1;
            ActivityMainBinding activityMainBinding = this.binding;
            if (activityMainBinding == null || (activityMainBinding = activityMainBinding.navHostFragment) == null) break block0;
            View view = (View)activityMainBinding;
            boolean bl = false;
            boolean bl2 = false;
            $this$isInvisible\1.setVisibility(0);
        }
    }

    @Override
    public void onAuthenticationError() {
        this.finish();
    }

    /*
     * Unable to fully structure code
     */
    @Nullable
    public final Object checkGithubConnectivity(@NotNull Continuation<? super Boolean> $completion) {
        if (!($completion instanceof checkGithubConnectivity.1)) ** GOTO lbl-1000
        var5_2 = $completion;
        if ((var5_2.label & -2147483648) != 0) {
            var5_2.label -= -2147483648;
        } else lbl-1000:
        // 2 sources

        {
            $continuation = new ContinuationImpl(this, $completion){
                /* synthetic */ Object result;
                final /* synthetic */ MainActivity this$0;
                int label;
                {
                    this.this$0 = this$0;
                    super($completion);
                }

                @Nullable
                public final Object invokeSuspend(@NotNull Object $result) {
                    this.result = $result;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.checkGithubConnectivity((Continuation<? super Boolean>)((Continuation)this));
                }
            };
        }
        $result = $continuation.result;
        var6_4 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch ($continuation.label) {
            case 0: {
                ResultKt.throwOnFailure((Object)$result);
                $continuation.label = 1;
                v0 = Requests.get$default((Requests)MainActivityKt.getApp(), (String)"https://raw.githubusercontent.com/recloudstream/.github/master/connectivitycheck", null, null, null, null, (boolean)false, (int)0, null, (long)5L, null, (boolean)false, null, (Continuation)$continuation, (int)3838, null);
                ** if (v0 != var6_4) goto lbl18
lbl17:
                // 1 sources

                return var6_4;
lbl18:
                // 1 sources

                ** GOTO lbl24
            }
            case 1: {
                try {
                    ResultKt.throwOnFailure((Object)$result);
                    v0 = $result;
lbl24:
                    // 2 sources

                    var2_5 = Intrinsics.areEqual((Object)StringsKt.trim((CharSequence)((NiceResponse)v0).getText()).toString(), (Object)"ok");
                }
                catch (Throwable var3_6) {
                    var2_5 = false;
                }
                return Boxing.boxBoolean((boolean)(var2_5 != false));
            }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    private static final SessionManagerListenerImpl mSessionManagerListener_delegate$lambda$3(MainActivity this$0) {
        return this$0.new SessionManagerListenerImpl();
    }

    private static final void showConfirmExitDialog$lambda$4(DialogInterface dialogInterface, int n) {
    }

    private static final void showConfirmExitDialog$lambda$5(CheckBox $dontShowAgainCheck, SharedPreferences $settingsManager, MainActivity this$0, DialogInterface dialogInterface, int n) {
        if ($dontShowAgainCheck.isChecked()) {
            $settingsManager.edit().putInt(this$0.getString(R.string.confirm_exit_key), 1).commit();
        }
        if (Globals.INSTANCE.isLayout(2)) {
            System.exit(0);
            throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
        }
        this$0.finish();
    }

    private static final void showPreviewPopupDialog$lambda$9$lambda$8(MainActivity $this_run, DialogInterface it) {
        $this_run.bottomPreviewPopup = null;
        $this_run.bottomPreviewBinding = null;
        $this_run.getViewModel().clear();
    }

    private static final void onCreate$lambda$10(Runnable it) {
        it.run();
    }

    private static final Unit onCreate$lambda$11(MainActivity this$0, CastContext it) {
        this$0.mSessionManager = it.getSessionManager();
        return Unit.INSTANCE;
    }

    private static final void onCreate$lambda$12(Function1 $tmp0, Object p0) {
        $tmp0.invoke(p0);
    }

    private static final Job onCreate$lambda$15$lambda$13(MainActivity this$0) {
        return BackupUtils.INSTANCE.backup((Context)this$0);
    }

    private static final Unit onCreate$lambda$15$lambda$14(MainActivity this$0) {
        PluginManager.INSTANCE.deleteAllOatFiles((Context)this$0);
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit onCreate$lambda$15(MainActivity this$0) {
        String lastAppAutoBackup;
        String string2;
        Object object;
        void $this$getKey\1;
        void this_\1;
        String appVer = "4.5.4-PRE";
        DataStore dataStore = DataStore.INSTANCE;
        Context context = (Context)this$0;
        String string3 = "VERSION_NAME";
        boolean bl = false;
        void var7_6 = this_\1;
        void var8_7 = $this$getKey\1;
        Object object2 = null;
        boolean bl2 = false;
        try {
            void $this$getKey\2;
            void this_\2;
            String string4 = this_\2.getSharedPrefs((Context)$this$getKey\2).getString(string3, null);
            if (string4 == null) {
                object = object2;
            } else {
                void this_\3;
                String string5 = string4;
                void var12_11 = this_\2;
                String string6 = string5;
                boolean bl3 = false;
                Object object3 = this_\3.getMapper().readValue(string6, String.class);
                object = object3;
                Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"readValue(...)");
            }
        }
        catch (Exception exception) {
            object = null;
        }
        if ((string2 = (String)object) == null) {
            string2 = "";
        }
        if (!Intrinsics.areEqual((Object)appVer, (Object)(lastAppAutoBackup = string2))) {
            DataStore.INSTANCE.setKey((Context)this$0, "VERSION_NAME", "4.5.4-PRE");
            ArchComponentExtKt.safe(() -> MainActivity.onCreate$lambda$15$lambda$13(this$0));
            ArchComponentExtKt.safe(() -> MainActivity.onCreate$lambda$15$lambda$14(this$0));
        }
        return Unit.INSTANCE;
    }

    private static final void onCreate$lambda$16() {
        TvFocus.INSTANCE.updateFocusView((View)TvFocus.INSTANCE.getLastFocus().get(), true);
    }

    private static final void onCreate$lambda$17(View view, View newFocus) {
        TvFocus.updateFocusView$default(TvFocus.INSTANCE, newFocus, false, 2, null);
    }

    private static final void onCreate$lambda$18(List $exceptionButtons, MainActivity this$0, View view, View newFocus) {
        View view2 = newFocus;
        if (CollectionsKt.contains((Iterable)$exceptionButtons, (Object)(view2 != null ? Integer.valueOf(view2.getId()) : null))) {
            return;
        }
        this$0.centerView(newFocus);
    }

    private static final Unit onCreate$lambda$20() {
        CommonActivity.INSTANCE.showToast(R.string.safe_mode_file, (Integer)1);
        return Unit.INSTANCE;
    }

    private static final void onCreate$lambda$23$lambda$21(AlertDialog.Builder $this_apply, DialogInterface dialogInterface, int n) {
        AlertDialog.Builder tbBuilder = new AlertDialog.Builder($this_apply.getContext());
        tbBuilder.setTitle(R.string.safe_mode_title);
        tbBuilder.setMessage((CharSequence)lastError);
        tbBuilder.show();
    }

    private static final void onCreate$lambda$23$lambda$22(DialogInterface dialogInterface, int n) {
    }

    private static final void onCreate$setUserData(MainActivity this$0, Resource<? extends SyncAPI.AbstractSyncStatus> status) {
        block5: {
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding;
            if (this$0.isLocalList) {
                return;
            }
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding2 = this$0.bottomPreviewBinding;
            if (bottomResultviewPreviewBinding2 == null) break block5;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding3 = bottomResultviewPreviewBinding = bottomResultviewPreviewBinding2;
            boolean bl = false;
            Resource<? extends SyncAPI.AbstractSyncStatus> resource = status;
            if (resource instanceof Resource.Success) {
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setEnabled(true);
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setText(((SyncAPI.AbstractSyncStatus)((Resource.Success)status).getValue()).getStatus().getStringRes());
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setIconResource(((SyncAPI.AbstractSyncStatus)((Resource.Success)status).getValue()).getStatus().getIconRes());
            } else if (resource instanceof Resource.Failure) {
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setEnabled(false);
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setIconResource(R.drawable.ic_baseline_bookmark_border_24);
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setText((CharSequence)((Resource.Failure)status).getErrorString());
            } else {
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setEnabled(false);
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setIconResource(R.drawable.ic_baseline_bookmark_border_24);
                bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setText(R.string.loading);
            }
        }
    }

    private static final void onCreate$setWatchStatus(MainActivity this$0, WatchType state) {
        block1: {
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding;
            if (!this$0.isLocalList || state == null) {
                return;
            }
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding2 = this$0.bottomPreviewBinding;
            if (bottomResultviewPreviewBinding2 == null || (bottomResultviewPreviewBinding2 = bottomResultviewPreviewBinding2.resultviewPreviewBookmark) == null) break block1;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding3 = bottomResultviewPreviewBinding = bottomResultviewPreviewBinding2;
            boolean bl = false;
            bottomResultviewPreviewBinding3.setIconResource(state.getIconRes());
            bottomResultviewPreviewBinding3.setText(state.getStringRes());
        }
    }

    private static final Unit onCreate$setSubscribeStatus$lambda$28$lambda$27$lambda$26(ImageView $this_apply, MainActivity this$0, Boolean newStatus) {
        int n;
        if (newStatus == null) {
            return Unit.INSTANCE;
        }
        if (newStatus.booleanValue()) {
            SubscriptionWorkManager.Companion.enqueuePeriodicWork($this_apply.getContext());
            n = R.string.subscription_new;
        } else {
            n = R.string.subscription_deleted;
        }
        int message = n;
        Object object = this$0.getViewModel().getPage().getValue();
        Object object2 = object instanceof Resource.Success ? (Resource.Success)object : null;
        if ((object2 == null || (object2 = (ResultData)((Resource.Success)object2).getValue()) == null || (object2 = ((ResultData)object2).getTitle()) == null) && (object2 = TextUtilKt.txt(R.string.no_data, new Object[0]).asStringNull($this_apply.getContext())) == null) {
            object2 = "";
        }
        Object name = object2;
        Object[] objectArray = new Object[]{name};
        CommonActivity.INSTANCE.showToast(TextUtilKt.txt(message, objectArray), (Integer)0);
        return Unit.INSTANCE;
    }

    private static final void onCreate$setSubscribeStatus$lambda$28$lambda$27(MainActivity this$0, ImageView $this_apply, View it) {
        this$0.getViewModel().toggleSubscriptionStatus($this_apply.getContext(), (Function1<? super Boolean, Unit>)((Function1)arg_0 -> MainActivity.onCreate$setSubscribeStatus$lambda$28$lambda$27$lambda$26($this_apply, this$0, arg_0)));
    }

    /*
     * WARNING - void declaration
     */
    private static final void onCreate$setSubscribeStatus(MainActivity this$0, Boolean state) {
        block1: {
            void $this$isVisible\2;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding2 = this$0.bottomPreviewBinding;
            if (bottomResultviewPreviewBinding2 == null || (bottomResultviewPreviewBinding2 = bottomResultviewPreviewBinding2.resultviewPreviewSubscribe) == null) break block1;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding3 = bottomResultviewPreviewBinding = bottomResultviewPreviewBinding2;
            boolean bl = false;
            if (state != null) {
                int n = state != false ? R.drawable.ic_baseline_notifications_active_24 : R.drawable.baseline_notifications_none_24;
                bottomResultviewPreviewBinding3.setImageResource(n);
            }
            View n = (View)bottomResultviewPreviewBinding3;
            boolean bl2 = state != null;
            boolean bl3 = false;
            $this$isVisible\2.setVisibility(bl2 ? 0 : 8);
            bottomResultviewPreviewBinding3.setOnClickListener(arg_0 -> MainActivity.onCreate$setSubscribeStatus$lambda$28$lambda$27(this$0, (ImageView)bottomResultviewPreviewBinding3, arg_0));
        }
    }

    private static final Unit onCreate$lambda$45$lambda$44$lambda$36$lambda$31() {
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$45$lambda$44$lambda$36$lambda$32(MainActivity this$0, int it) {
        ResultViewModel2.updateWatchStatus$default(this$0.getViewModel(), (WatchType)((Object)WatchType.getEntries().get(it)), (Context)this$0, null, null, 12, null);
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$45$lambda$44$lambda$36$lambda$34() {
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$45$lambda$44$lambda$36$lambda$35(MainActivity this$0, int it) {
        this$0.getSyncViewModel().setStatus(((SyncWatchType)((Object)SyncWatchType.getEntries().get(it))).getInternalId());
        this$0.getSyncViewModel().publishUserData();
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final void onCreate$lambda$45$lambda$44$lambda$36(MainActivity this$0, View it) {
        if (this$0.isLocalList) {
            Collection<String> collection;
            void $this$mapTo\2;
            void iterable;
            WatchType watchType = (WatchType)((Object)this$0.getViewModel().getWatchStatus().getValue());
            if (watchType == null) {
                watchType = WatchType.NONE;
            }
            WatchType value = watchType;
            Iterable iterable = (Iterable)WatchType.getEntries();
            Activity activity = (Activity)this$0;
            SingleSelectionHelper singleSelectionHelper = SingleSelectionHelper.INSTANCE;
            boolean bl = false;
            void var5_13 = iterable;
            Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
            boolean bl2 = false;
            for (Object t : $this$mapTo\2) {
                void syncWatchType;
                WatchType watchType2 = (WatchType)((Object)t);
                collection = collection2;
                boolean bl3 = false;
                collection.add(this$0.getString(syncWatchType.getStringRes()));
            }
            collection = (List)collection2;
            List list2 = CollectionsKt.toList((Iterable)collection);
            int n = value.ordinal();
            String string2 = this$0.getString(R.string.action_add_to_bookmarks);
            Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"getString(...)");
            singleSelectionHelper.showBottomDialog(activity, list2, n, string2, false, (Function0<Unit>)((Function0)MainActivity::onCreate$lambda$45$lambda$44$lambda$36$lambda$31), (Function1<? super Integer, Unit>)((Function1)arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$36$lambda$32(this$0, arg_0)));
        } else {
            Collection<String> collection;
            void $this$mapTo\5;
            void $this$map\4;
            Object bl = this$0.getSyncViewModel().getUserData().getValue();
            Object object = bl instanceof Resource.Success ? (Resource.Success)bl : null;
            if (object == null || (object = (SyncAPI.AbstractSyncStatus)object.getValue()) == null || (object = ((SyncAPI.AbstractSyncStatus)object).getStatus()) == null) {
                object = SyncWatchType.NONE;
            }
            Resource.Success value = object;
            Iterable iterable = (Iterable)SyncWatchType.getEntries();
            Activity activity = (Activity)this$0;
            SingleSelectionHelper singleSelectionHelper = SingleSelectionHelper.INSTANCE;
            boolean bl4 = false;
            void $this$mapTo\2 = $this$map\4;
            Collection collection3 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map\4, (int)10));
            boolean bl5 = false;
            for (Object t : $this$mapTo\5) {
                void it\6;
                SyncWatchType syncWatchType = (SyncWatchType)((Object)t);
                collection = collection3;
                boolean bl6 = false;
                collection.add(this$0.getString(it\6.getStringRes()));
            }
            collection = (List)collection3;
            List list3 = CollectionsKt.toList((Iterable)collection);
            int n = ((Enum)((Object)value)).ordinal();
            String string3 = this$0.getString(R.string.action_add_to_bookmarks);
            Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"getString(...)");
            singleSelectionHelper.showBottomDialog(activity, list3, n, string3, false, (Function0<Unit>)((Function0)MainActivity::onCreate$lambda$45$lambda$44$lambda$36$lambda$34), (Function1<? super Integer, Unit>)((Function1)arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$36$lambda$35(this$0, arg_0)));
        }
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit onCreate$lambda$45$lambda$44$lambda$37(BottomResultviewPreviewBinding $this_apply, Boolean isFavorite) {
        void $this$isVisible\1;
        ImageView imageView = $this_apply.resultviewPreviewFavorite;
        Intrinsics.checkNotNullExpressionValue((Object)imageView, (String)"resultviewPreviewFavorite");
        View view = (View)imageView;
        boolean bl = isFavorite != null;
        boolean bl2 = false;
        $this$isVisible\1.setVisibility(bl ? 0 : 8);
        if (isFavorite == null) {
            return Unit.INSTANCE;
        }
        int drawable2 = isFavorite != false ? R.drawable.ic_baseline_favorite_24 : R.drawable.ic_baseline_favorite_border_24;
        $this_apply.resultviewPreviewFavorite.setImageResource(drawable2);
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$45$lambda$44$lambda$39$lambda$38(MainActivity this$0, Boolean newStatus) {
        if (newStatus == null) {
            return Unit.INSTANCE;
        }
        int message = newStatus != false ? R.string.favorite_added : R.string.favorite_removed;
        Object object = this$0.getViewModel().getPage().getValue();
        Object object2 = object instanceof Resource.Success ? (Resource.Success)object : null;
        if ((object2 == null || (object2 = (ResultData)((Resource.Success)object2).getValue()) == null || (object2 = ((ResultData)object2).getTitle()) == null) && (object2 = TextUtilKt.txt(R.string.no_data, new Object[0]).asStringNull((Context)this$0)) == null) {
            object2 = "";
        }
        Object name = object2;
        Object[] objectArray = new Object[]{name};
        CommonActivity.INSTANCE.showToast(TextUtilKt.txt(message, objectArray), (Integer)0);
        return Unit.INSTANCE;
    }

    private static final void onCreate$lambda$45$lambda$44$lambda$39(MainActivity this$0, View it) {
        this$0.getViewModel().toggleFavoriteStatus((Context)this$0, (Function1<? super Boolean, Unit>)((Function1)arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$39$lambda$38(this$0, arg_0)));
    }

    private static final void onCreate$lambda$45$lambda$44$lambda$41(ResultData $d, View view) {
        block0: {
            Context context = view.getContext();
            if (context == null) break block0;
            Context context2 = context;
            boolean bl = false;
            AlertDialog.Builder builder = new AlertDialog.Builder(context2, R.style.AlertDialogCustom);
            builder.setMessage((CharSequence)AppContextUtils.INSTANCE.html($d.getPlotText().asString(context2))).setTitle((CharSequence)$d.getPlotHeaderText().asString(context2)).show();
        }
    }

    private static final void onCreate$lambda$45$lambda$44$lambda$43(MainActivity this$0, View it) {
        block0: {
            this$0.getViewModel().clear();
            this$0.hidePreviewPopupDialog();
            SearchResponse searchResponse = this$0.lastPopup;
            if (searchResponse == null) break block0;
            SearchResponse searchResponse2 = searchResponse;
            boolean bl = false;
            AppContextUtils.loadSearchResult$default(AppContextUtils.INSTANCE, (Activity)this$0, searchResponse2, 0, null, 6, null);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit onCreate$lambda$45(MainActivity this$0, Resource resource) {
        if (resource == null) {
            this$0.hidePreviewPopupDialog();
            return Unit.INSTANCE;
        }
        Resource resource2 = resource;
        if (resource2 instanceof Resource.Failure) {
            CommonActivity.showToast$default(CommonActivity.INSTANCE, R.string.error, null, 2, null);
            this$0.getViewModel().clear();
            this$0.hidePreviewPopupDialog();
        } else if (resource2 instanceof Resource.Loading) {
            void $this$isVisible\3;
            View view;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding2 = bottomResultviewPreviewBinding = this$0.showPreviewPopupDialog();
            boolean bl = false;
            FrameLayout frameLayout = bottomResultviewPreviewBinding2.resultviewPreviewLoading;
            Intrinsics.checkNotNullExpressionValue((Object)frameLayout, (String)"resultviewPreviewLoading");
            View view2 = (View)frameLayout;
            boolean bl2 = true;
            boolean bl3 = false;
            view.setVisibility(0);
            LinearLayout linearLayout = bottomResultviewPreviewBinding2.resultviewPreviewResult;
            Intrinsics.checkNotNullExpressionValue((Object)linearLayout, (String)"resultviewPreviewResult");
            view = (View)linearLayout;
            boolean bl4 = false;
            boolean bl5 = false;
            $this$isVisible\3.setVisibility(8);
            bottomResultviewPreviewBinding2.resultviewPreviewLoadingShimmer.startShimmer();
        } else if (resource2 instanceof Resource.Success) {
            void $this$isVisible\6;
            View view;
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding;
            ResultData d = (ResultData)((Resource.Success)resource).getValue();
            BottomResultviewPreviewBinding bottomResultviewPreviewBinding3 = bottomResultviewPreviewBinding = this$0.showPreviewPopupDialog();
            boolean bl = false;
            FrameLayout frameLayout = bottomResultviewPreviewBinding3.resultviewPreviewLoading;
            Intrinsics.checkNotNullExpressionValue((Object)frameLayout, (String)"resultviewPreviewLoading");
            View bl4 = (View)frameLayout;
            boolean bl6 = false;
            boolean bl7 = false;
            view.setVisibility(8);
            LinearLayout linearLayout = bottomResultviewPreviewBinding3.resultviewPreviewResult;
            Intrinsics.checkNotNullExpressionValue((Object)linearLayout, (String)"resultviewPreviewResult");
            view = (View)linearLayout;
            boolean bl8 = true;
            boolean bl9 = false;
            $this$isVisible\6.setVisibility(0);
            bottomResultviewPreviewBinding3.resultviewPreviewLoadingShimmer.stopShimmer();
            bottomResultviewPreviewBinding3.resultviewPreviewTitle.setText((CharSequence)d.getTitle());
            TextUtilKt.setText(bottomResultviewPreviewBinding3.resultviewPreviewMetaType, d.getTypeText());
            TextUtilKt.setText(bottomResultviewPreviewBinding3.resultviewPreviewMetaYear, d.getYearText());
            TextUtilKt.setText(bottomResultviewPreviewBinding3.resultviewPreviewMetaDuration, d.getDurationText());
            TextUtilKt.setText(bottomResultviewPreviewBinding3.resultviewPreviewMetaRating, d.getRatingText());
            TextUtilKt.setTextHtml(bottomResultviewPreviewBinding3.resultviewPreviewDescription, d.getPlotText());
            if (Globals.INSTANCE.isLayout(1)) {
                ImageView imageView = bottomResultviewPreviewBinding3.resultviewPreviewPoster;
                Intrinsics.checkNotNullExpressionValue((Object)imageView, (String)"resultviewPreviewPoster");
                String string2 = d.getPosterImage();
                if (string2 == null) {
                    string2 = d.getPosterBackgroundImage();
                }
                ImageLoader.loadImage$default(ImageLoader.INSTANCE, imageView, string2, d.getPosterHeaders(), null, 4, null);
            } else {
                ImageView imageView = bottomResultviewPreviewBinding3.resultviewPreviewPoster;
                Intrinsics.checkNotNullExpressionValue((Object)imageView, (String)"resultviewPreviewPoster");
                String string3 = d.getPosterBackgroundImage();
                if (string3 == null) {
                    string3 = d.getPosterImage();
                }
                ImageLoader.loadImage$default(ImageLoader.INSTANCE, imageView, string3, d.getPosterHeaders(), null, 4, null);
            }
            MainActivity.onCreate$setUserData(this$0, (Resource)this$0.getSyncViewModel().getUserData().getValue());
            MainActivity.onCreate$setWatchStatus(this$0, (WatchType)((Object)this$0.getViewModel().getWatchStatus().getValue()));
            MainActivity.onCreate$setSubscribeStatus(this$0, (Boolean)this$0.getViewModel().getSubscribeStatus().getValue());
            bottomResultviewPreviewBinding3.resultviewPreviewBookmark.setOnClickListener(arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$36(this$0, arg_0));
            LifecycleKt.observeNullable((LifecycleOwner)this$0, this$0.getViewModel().getFavoriteStatus(), arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$37(bottomResultviewPreviewBinding3, arg_0));
            bottomResultviewPreviewBinding3.resultviewPreviewFavorite.setOnClickListener(arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$39(this$0, arg_0));
            if (Globals.INSTANCE.isLayout(1)) {
                bottomResultviewPreviewBinding3.resultviewPreviewDescription.setOnClickListener(arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$41(d, arg_0));
            }
            bottomResultviewPreviewBinding3.resultviewPreviewMoreInfo.setOnClickListener(arg_0 -> MainActivity.onCreate$lambda$45$lambda$44$lambda$43(this$0, arg_0));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    private static final Unit onCreate$lambda$48$lambda$47(MainActivity this$0, SharedPreferences $settingsManager) {
        Intrinsics.checkNotNull((Object)$settingsManager);
        this$0.showConfirmExitDialog($settingsManager);
        Window window = this$0.getWindow();
        if (window != null) {
            window.setNavigationBarColor(UIHelper.INSTANCE.colorFromAttribute((Context)this$0, R.attr.primaryGrayBackground));
        }
        CommonActivity.INSTANCE.updateLocale((Context)this$0);
        return Unit.INSTANCE;
    }

    private static final void onCreate$lambda$48(MainActivity this$0, SharedPreferences $settingsManager, NavController navController, NavDestination navDestination, Bundle bundle) {
        CharSequence charSequence;
        Intrinsics.checkNotNullParameter((Object)navController, (String)"<unused var>");
        Intrinsics.checkNotNullParameter((Object)navDestination, (String)"navDestination");
        this$0.updateNavBar(navDestination);
        if (this$0.matchDestination(navDestination, R.id.navigation_search) && !((charSequence = (CharSequence)nextSearchQuery) == null || StringsKt.isBlank((CharSequence)charSequence))) {
            Bundle bundle2 = bundle;
            if (bundle2 != null) {
                CharSequence charSequence2 = charSequence = bundle2;
                boolean bl = false;
                charSequence2.putString("search_query", nextSearchQuery);
            }
        }
        if (this$0.matchDestination(navDestination, R.id.navigation_home)) {
            BackPressedCallbackHelper.INSTANCE.attachBackPressedCallback((ComponentActivity)this$0, "MainActivity", (Function0<Unit>)((Function0)() -> MainActivity.onCreate$lambda$48$lambda$47(this$0, $settingsManager)));
        } else {
            BackPressedCallbackHelper.INSTANCE.detachBackPressedCallback((ComponentActivity)this$0, "MainActivity");
        }
    }

    private static final boolean onCreate$lambda$50$lambda$49(MainActivity this$0, NavController $navController, MenuItem item) {
        Intrinsics.checkNotNullParameter((Object)item, (String)"item");
        return this$0.onNavDestinationSelected(item, $navController);
    }

    private static final boolean onCreate$lambda$55$lambda$51(MainActivity this$0, NavController $navController, MenuItem item) {
        Intrinsics.checkNotNullParameter((Object)item, (String)"item");
        return this$0.onNavDestinationSelected(item, $navController);
    }

    private static final void onCreate$lambda$55$noFocus(View view) {
        block1: {
            view.setTag((Object)view.getContext().getString(R.string.tv_no_focus_tag));
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup)view : null;
            if (viewGroup == null) break block1;
            ViewGroup viewGroup2 = viewGroup;
            boolean bl = false;
            for (View view2 : ViewGroupKt.getChildren((ViewGroup)viewGroup2)) {
                MainActivity.onCreate$lambda$55$noFocus(view2);
            }
        }
    }

    private static final void onCreate$lambda$55$lambda$53(MainActivity this$0, View it) {
        AccountHelper.INSTANCE.showAccountSelectLinear((Activity)this$0);
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit onCreate$lambda$55$lambda$54(ImageView $navProfilePic, LinearLayout $navProfileRoot, DataStoreHelper.Account currentAccount) {
        if (currentAccount != null) {
            void view;
            ImageView imageView = $navProfilePic;
            if (imageView != null) {
                ImageLoader.loadImage$default(ImageLoader.INSTANCE, imageView, currentAccount.getImage(), null, 2, null);
            }
            Intrinsics.checkNotNull((Object)$navProfileRoot);
            View view = (View)$navProfileRoot;
            boolean bl = true;
            boolean bl2 = false;
            view.setVisibility(0);
        } else {
            void $this$isGone\2;
            Intrinsics.checkNotNull((Object)$navProfileRoot);
            View view = (View)$navProfileRoot;
            boolean bl = true;
            boolean bl3 = false;
            $this$isGone\2.setVisibility(8);
        }
        return Unit.INSTANCE;
    }

    private static final boolean onCreate$lambda$56(MainActivity this$0, View it) {
        RecyclerView recycler;
        block0: {
            ActivityMainBinding activityMainBinding = this$0.binding;
            RecyclerView recyclerView = recycler = activityMainBinding != null && (activityMainBinding = activityMainBinding.getRoot()) != null ? (RecyclerView)activityMainBinding.findViewById(R.id.home_master_recycler) : null;
            if (recyclerView == null) break block0;
            recyclerView.smoothScrollToPosition(0);
        }
        return recycler != null;
    }

    private static final boolean onCreate$lambda$57(MainActivity this$0, View it) {
        ActivityMainBinding activityMainBinding = this$0.binding;
        if (activityMainBinding == null || (activityMainBinding = activityMainBinding.getRoot()) == null || (activityMainBinding = (ViewPager2)activityMainBinding.findViewById(R.id.viewpager)) == null) {
            return false;
        }
        ActivityMainBinding viewPager = activityMainBinding;
        try {
            View view = ViewGroupKt.get((ViewGroup)((ViewGroup)viewPager), (int)0);
            RecyclerView recyclerView = view instanceof RecyclerView ? (RecyclerView)view : null;
            if (recyclerView == null || (recyclerView = ViewGroupKt.getChildren((ViewGroup)((ViewGroup)recyclerView))) == null) {
                return false;
            }
            RecyclerView children = recyclerView;
            for (View child : children) {
                RecyclerView recyclerView2 = (RecyclerView)child.findViewById(R.id.page_recyclerview);
                if (recyclerView2 == null) continue;
                recyclerView2.smoothScrollToPosition(0);
            }
        }
        catch (IndexOutOfBoundsException children) {
        }
        catch (Throwable t) {
            ArchComponentExtKt.logError(t);
        }
        return true;
    }

    private static final boolean onCreate$lambda$58(MainActivity this$0, View it) {
        Integer[] integerArray = new Integer[]{R.id.search_master_recycler, R.id.search_autofit_results, R.id.search_history_recycler};
        Integer[] integerArray2 = integerArray;
        int n = integerArray2.length;
        for (int i = 0; i < n; ++i) {
            int recyclerId = integerArray2[i];
            ActivityMainBinding activityMainBinding = this$0.binding;
            if (activityMainBinding == null || (activityMainBinding = activityMainBinding.getRoot()) == null || (activityMainBinding = (RecyclerView)activityMainBinding.findViewById(recyclerId)) == null) {
                return false;
            }
            ActivityMainBinding recycler = activityMainBinding;
            recycler.smoothScrollToPosition(0);
        }
        return true;
    }

    private static final boolean onCreate$lambda$59(MainActivity this$0, View it) {
        ActivityMainBinding recycler;
        block1: {
            ActivityMainBinding activityMainBinding = this$0.binding;
            if (activityMainBinding == null || (activityMainBinding = activityMainBinding.getRoot()) == null || (activityMainBinding = (RecyclerView)activityMainBinding.findViewById(R.id.download_list)) == null) {
                ActivityMainBinding activityMainBinding2 = this$0.binding;
                activityMainBinding = activityMainBinding2 != null && (activityMainBinding2 = activityMainBinding2.getRoot()) != null ? (RecyclerView)activityMainBinding2.findViewById(R.id.download_child_list) : null;
            }
            ActivityMainBinding activityMainBinding3 = recycler = activityMainBinding;
            if (activityMainBinding3 == null) break block1;
            activityMainBinding3.smoothScrollToPosition(0);
        }
        return recycler != null;
    }

    public static final /* synthetic */ void access$onAllPluginsLoaded(MainActivity $this, boolean success) {
        $this.onAllPluginsLoaded(success);
    }

    public static final /* synthetic */ Mutex access$getPluginsLock$p(MainActivity $this) {
        return $this.pluginsLock;
    }

    public static final /* synthetic */ void access$onCreate$setWatchStatus(MainActivity this$0, WatchType state) {
        MainActivity.onCreate$setWatchStatus(this$0, state);
    }

    public static final /* synthetic */ void access$onCreate$setUserData(MainActivity this$0, Resource status) {
        MainActivity.onCreate$setUserData(this$0, status);
    }

    public static final /* synthetic */ void access$onCreate$setSubscribeStatus(MainActivity this$0, Boolean state) {
        MainActivity.onCreate$setSubscribeStatus(this$0, state);
    }

    public static final /* synthetic */ LibraryViewModel access$getLibraryViewModel$p(MainActivity $this) {
        return $this.libraryViewModel;
    }

    public static final /* synthetic */ void access$setLibraryViewModel$p(MainActivity $this, LibraryViewModel libraryViewModel) {
        $this.libraryViewModel = libraryViewModel;
    }

    static {
        afterPluginsLoadedEvent = new Event();
        mainPluginsLoadedEvent = new Event();
        afterRepositoryLoadedEvent = new Event();
        bookmarksUpdatedEvent = new Event();
        reloadHomeEvent = new Event();
        reloadLibraryEvent = new Event();
        reloadAccountEvent = new Event();
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 J.\u00104\u001a\u00020\u000e2\b\u00105\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u00010\f2\u0006\u00108\u001a\u00020\u000e2\n\b\u0002\u00109\u001a\u0004\u0018\u00010:R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\fX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0086T\u00a2\u0006\u0002\n\u0000R0\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\f0\u00172\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u00178B@BX\u0082\u000e\u00a2\u0006\f\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010!\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u0017\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0017\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0017\u00102\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010'\u00a8\u0006;"}, d2={"Lcom/lagradost/cloudstream3/MainActivity$Companion;", "", "<init>", "()V", "activityResultLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "getActivityResultLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setActivityResultLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "TAG", "", "ANIMATED_OUTLINE", "", "lastError", "getLastError", "()Ljava/lang/String;", "setLastError", "(Ljava/lang/String;)V", "FILE_DELETE_KEY", "API_NAME_EXTRA_KEY", "value", "", "filesToDelete", "getFilesToDelete", "()Ljava/util/Set;", "setFilesToDelete", "(Ljava/util/Set;)V", "deleteFileOnExit", "", "file", "Ljava/io/File;", "nextSearchQuery", "getNextSearchQuery", "setNextSearchQuery", "afterPluginsLoadedEvent", "Lcom/lagradost/cloudstream3/utils/Event;", "getAfterPluginsLoadedEvent", "()Lcom/lagradost/cloudstream3/utils/Event;", "mainPluginsLoadedEvent", "getMainPluginsLoadedEvent", "afterRepositoryLoadedEvent", "getAfterRepositoryLoadedEvent", "bookmarksUpdatedEvent", "getBookmarksUpdatedEvent", "reloadHomeEvent", "getReloadHomeEvent", "reloadLibraryEvent", "getReloadLibraryEvent", "reloadAccountEvent", "getReloadAccountEvent", "handleAppIntentUrl", "activity", "Landroidx/fragment/app/FragmentActivity;", "str", "isWebview", "extraArgs", "Landroid/os/Bundle;", "app_prereleaseDebug"})
    @SourceDebugExtension(value={"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity$Companion\n+ 2 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n+ 3 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1939:1\n194#2:1940\n192#3:1941\n183#3,3:1942\n174#3:1945\n186#3,2:1946\n1#4:1948\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity$Companion\n*L\n208#1:1940\n208#1:1941\n208#1:1942,3\n208#1:1945\n208#1:1946,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final ActivityResultLauncher<Intent> getActivityResultLauncher() {
            return activityResultLauncher;
        }

        public final void setActivityResultLauncher(@Nullable ActivityResultLauncher<Intent> activityResultLauncher) {
            MainActivity.activityResultLauncher = activityResultLauncher;
        }

        @Nullable
        public final String getLastError() {
            return lastError;
        }

        public final void setLastError(@Nullable String string2) {
            lastError = string2;
        }

        /*
         * WARNING - void declaration
         */
        private final Set<String> getFilesToDelete() {
            Set set;
            Object object;
            block6: {
                void this_\1;
                AcraApplication.Companion companion = AcraApplication.Companion;
                String string2 = MainActivity.FILE_DELETE_KEY;
                boolean bl = false;
                Context context = this_\1.getContext();
                if (context != null) {
                    void this_\2;
                    DataStore dataStore = DataStore.INSTANCE;
                    Context context2 = context;
                    boolean bl2 = false;
                    void var8_8 = this_\2;
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
                            break block6;
                        }
                        String string4 = string3;
                        void var13_13 = this_\3;
                        String string5 = string4;
                        boolean bl4 = false;
                        Object object3 = this_\4.getMapper().readValue(string5, Set.class);
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
            if ((set = (Set)object) == null) {
                set = SetsKt.emptySet();
            }
            return set;
        }

        private final void setFilesToDelete(Set<String> value) {
            AcraApplication.Companion.setKey(MainActivity.FILE_DELETE_KEY, value);
        }

        public final void deleteFileOnExit(@NotNull File file) {
            Intrinsics.checkNotNullParameter((Object)file, (String)"file");
            this.setFilesToDelete(SetsKt.plus(this.getFilesToDelete(), (Object)file.getPath()));
        }

        @Nullable
        public final String getNextSearchQuery() {
            return nextSearchQuery;
        }

        public final void setNextSearchQuery(@Nullable String string2) {
            nextSearchQuery = string2;
        }

        @NotNull
        public final Event<Boolean> getAfterPluginsLoadedEvent() {
            return afterPluginsLoadedEvent;
        }

        @NotNull
        public final Event<Boolean> getMainPluginsLoadedEvent() {
            return mainPluginsLoadedEvent;
        }

        @NotNull
        public final Event<Boolean> getAfterRepositoryLoadedEvent() {
            return afterRepositoryLoadedEvent;
        }

        @NotNull
        public final Event<Boolean> getBookmarksUpdatedEvent() {
            return bookmarksUpdatedEvent;
        }

        @NotNull
        public final Event<Boolean> getReloadHomeEvent() {
            return reloadHomeEvent;
        }

        @NotNull
        public final Event<Boolean> getReloadLibraryEvent() {
            return reloadLibraryEvent;
        }

        @NotNull
        public final Event<Boolean> getReloadAccountEvent() {
            return reloadAccountEvent;
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * WARNING - void declaration
         */
        public final boolean handleAppIntentUrl(@Nullable FragmentActivity activity, @Nullable String str, boolean isWebview, @Nullable Bundle extraArgs) {
            FragmentActivity fragmentActivity = activity;
            boolean bl = false;
            if (str != null && fragmentActivity != null) {
                if (StringsKt.startsWith$default((String)str, (String)"https://cs.repo", (boolean)false, (int)2, null)) {
                    String string2 = "https://" + StringsKt.substringAfter$default((String)str, (String)"?", null, (int)2, null);
                    System.out.println((Object)("Repository url: " + string2));
                    AppContextUtils.INSTANCE.loadRepository((Activity)fragmentActivity, string2);
                    return true;
                }
                if (StringsKt.contains$default((CharSequence)str, (CharSequence)"cloudstreamapp", (boolean)false, (int)2, null)) {
                    for (OAuth2API oAuth2API : AccountManager.Companion.getOAuth2Apis()) {
                        if (!StringsKt.contains$default((CharSequence)str, (CharSequence)('/' + oAuth2API.getRedirectUrl()), (boolean)false, (int)2, null)) continue;
                        Coroutines.INSTANCE.ioSafe(fragmentActivity, (Function3)new Function3<CoroutineScope, FragmentActivity, Continuation<? super Unit>, Object>(str, oAuth2API, fragmentActivity, null){
                            int label;
                            final /* synthetic */ String $str;
                            final /* synthetic */ OAuth2API $api;
                            final /* synthetic */ FragmentActivity $this_with;
                            {
                                this.$str = $str;
                                this.$api = $api;
                                this.$this_with = $receiver;
                                super(3, $completion);
                            }

                            /*
                             * Unable to fully structure code
                             */
                            public final Object invokeSuspend(Object var1_1) {
                                var3_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                switch (this.label) {
                                    case 0: {
                                        ResultKt.throwOnFailure((Object)var1_1);
                                        Log.i((String)"MAINACT", (String)("handleAppIntent " + this.$str));
                                        this.label = 1;
                                        v0 = this.$api.handleRedirect(this.$str, (Continuation<? super Boolean>)((Continuation)this));
                                        if (v0 == var3_2) {
                                            return var3_2;
                                        }
                                        ** GOTO lbl15
                                    }
                                    case 1: {
                                        ResultKt.throwOnFailure((Object)$result);
                                        v0 = $result;
lbl15:
                                        // 2 sources

                                        v1 = (isSuccessful = ((Boolean)v0).booleanValue()) != false ? Log.i((String)"MAINACT", (String)("authenticated " + this.$api.getName())) : Log.i((String)"MAINACT", (String)("failed to authenticate " + this.$api.getName()));
                                        this.$this_with.runOnUiThread((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, invokeSuspend$lambda$0(androidx.fragment.app.FragmentActivity boolean com.lagradost.cloudstream3.syncproviders.OAuth2API ), ()V)((FragmentActivity)this.$this_with, (boolean)(isSuccessful != false), (OAuth2API)this.$api));
                                        return Unit.INSTANCE;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            public final Object invoke(CoroutineScope p1, FragmentActivity p2, Continuation<? super Unit> p3) {
                                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                            }

                            private static final void invokeSuspend$lambda$0(FragmentActivity $this_with, boolean $isSuccessful, OAuth2API $api) {
                                try {
                                    String string2 = $this_with.getString($isSuccessful ? R.string.authenticated_user : R.string.authenticated_user_fail);
                                    Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"getString(...)");
                                    String string3 = string2;
                                    Object[] objectArray = new Object[]{$api.getName()};
                                    String string4 = String.format(string3, Arrays.copyOf(objectArray, objectArray.length));
                                    Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"format(...)");
                                    CommonActivity.showToast$default(CommonActivity.INSTANCE, string4, null, 2, null);
                                }
                                catch (Exception e) {
                                    ArchComponentExtKt.logError(e);
                                }
                            }
                        });
                        return true;
                    }
                    if (Intrinsics.areEqual((Object)str, (Object)"cloudstreamapp:")) {
                        Coroutines.INSTANCE.ioSafe(fragmentActivity, (Function3)new Function3<CoroutineScope, FragmentActivity, Continuation<? super Unit>, Object>(activity, null){
                            int label;
                            final /* synthetic */ FragmentActivity $activity;
                            {
                                this.$activity = $activity;
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
                                        Object object3 = PluginManager.INSTANCE.___DO_NOT_CALL_FROM_A_PLUGIN_hotReloadAllLocalPlugins(this.$activity, (Continuation<? super Unit>)((Continuation)this));
                                        if (object3 != object2) return Unit.INSTANCE;
                                        return object2;
                                    }
                                    case 1: {
                                        void $result;
                                        ResultKt.throwOnFailure((Object)$result);
                                        Object object3 = $result;
                                        return Unit.INSTANCE;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }

                            public final Object invoke(CoroutineScope p1, FragmentActivity p2, Continuation<? super Unit> p3) {
                                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                            }
                        });
                    }
                } else {
                    URI uRI = com.lagradost.cloudstream3.MainActivity$Companion.handleAppIntentUrl$lambda$3$safeURI(str);
                    if (Intrinsics.areEqual((Object)(uRI != null ? uRI.getScheme() : null), (Object)"cloudstreamrepo")) {
                        String string3 = StringsKt.replaceFirst$default((String)str, (String)"cloudstreamrepo", (String)"https", (boolean)false, (int)4, null);
                        AppContextUtils.INSTANCE.loadRepository((Activity)fragmentActivity, string3);
                        return true;
                    }
                    URI uRI2 = com.lagradost.cloudstream3.MainActivity$Companion.handleAppIntentUrl$lambda$3$safeURI(str);
                    if (Intrinsics.areEqual((Object)(uRI2 != null ? uRI2.getScheme() : null), (Object)"cloudstreamsearch")) {
                        FragmentActivity fragmentActivity2;
                        String oAuth2API;
                        Companion companion;
                        String string4 = StringsKt.substringAfter$default((String)str, (String)"cloudstreamsearch://", null, (int)2, null);
                        Companion companion2 = Companion;
                        try {
                            companion = companion2;
                            oAuth2API = URLDecoder.decode(string4, "UTF-8");
                        }
                        catch (Throwable throwable) {
                            void t\1;
                            companion = companion2;
                            ArchComponentExtKt.logError((Throwable)t\1);
                            oAuth2API = string4;
                        }
                        companion.setNextSearchQuery(oAuth2API);
                        FragmentActivity fragmentActivity3 = activity;
                        if (fragmentActivity3 != null && (fragmentActivity3 = (BottomNavigationView)fragmentActivity3.findViewById(R.id.nav_view)) != null) {
                            fragmentActivity3.setSelectedItemId(R.id.navigation_search);
                        }
                        if ((fragmentActivity2 = activity) != null && (fragmentActivity2 = (NavigationRailView)fragmentActivity2.findViewById(R.id.nav_rail_view)) != null) {
                            fragmentActivity2.setSelectedItemId(R.id.navigation_search);
                        }
                    } else {
                        URI uRI3 = com.lagradost.cloudstream3.MainActivity$Companion.handleAppIntentUrl$lambda$3$safeURI(str);
                        if (Intrinsics.areEqual((Object)(uRI3 != null ? uRI3.getScheme() : null), (Object)"cloudstreamplayer")) {
                            Uri uri = Uri.parse((String)str);
                            String string5 = uri.getQueryParameter("name");
                            String string6 = URLDecoder.decode(uri.getAuthority(), "UTF-8");
                            Activity activity2 = (Activity)fragmentActivity;
                            Intrinsics.checkNotNull((Object)string6);
                            UIHelper.navigate$default(UIHelper.INSTANCE, activity2, R.id.global_to_navigation_player, GeneratorPlayer.Companion.newInstance$default(GeneratorPlayer.Companion, new LinkGenerator(CollectionsKt.listOf((Object)new BasicLink(string6, string5)), true, null, 4, null), null, 2, null), null, 4, null);
                        } else {
                            URI uRI4 = com.lagradost.cloudstream3.MainActivity$Companion.handleAppIntentUrl$lambda$3$safeURI(str);
                            if (Intrinsics.areEqual((Object)(uRI4 != null ? uRI4.getScheme() : null), (Object)"cloudstreamcontinuewatching")) {
                                Integer n = StringsKt.toIntOrNull((String)StringsKt.substringAfter$default((String)str, (String)"cloudstreamcontinuewatching://", null, (int)2, null));
                                if (n == null) {
                                    return false;
                                }
                                int n2 = n;
                                Coroutines.INSTANCE.ioSafe(fragmentActivity, (Function3)new Function3<CoroutineScope, FragmentActivity, Continuation<? super Unit>, Object>(activity, n2, null){
                                    int label;
                                    final /* synthetic */ FragmentActivity $activity;
                                    final /* synthetic */ int $id;
                                    {
                                        this.$activity = $activity;
                                        this.$id = $id;
                                        super(3, $completion);
                                    }

                                    /*
                                     * Unable to fully structure code
                                     */
                                    public final Object invokeSuspend(Object var1_1) {
                                        var11_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                        switch (this.label) {
                                            case 0: {
                                                ResultKt.throwOnFailure((Object)var1_1);
                                                this.label = 1;
                                                v0 = HomeViewModel.Companion.getResumeWatching((Continuation<? super List<DataStoreHelper.ResumeWatchingResult>>)((Continuation)this));
                                                if (v0 == var11_2) {
                                                    return var11_2;
                                                }
                                                ** GOTO lbl13
                                            }
                                            case 1: {
                                                ResultKt.throwOnFailure((Object)$result);
                                                v0 = $result;
lbl13:
                                                // 2 sources

                                                if ((v1 = (List)v0) == null) ** GOTO lbl27
                                                var3_3 = (Iterable)v1;
                                                var4_4 = this.$id;
                                                $i$f$firstOrNull\1\355 = false;
                                                for (T element\1 : $this$firstOrNull\1) {
                                                    it\2 = (DataStoreHelper.ResumeWatchingResult)element\1;
                                                    $i$a$-firstOrNull-MainActivity$Companion$handleAppIntentUrl$1$3$resumeWatchingCard$1\2\1940\0 = false;
                                                    v2 = it\2.getId();
                                                    var10_10 = var4_4;
                                                    if (!(v2 != null && v2 == var10_10)) continue;
                                                    v3 = element\1;
                                                    ** GOTO lbl26
                                                }
                                                v3 = null;
lbl26:
                                                // 2 sources

                                                if ((v1 = (DataStoreHelper.ResumeWatchingResult)v3) != null) ** GOTO lbl28
lbl27:
                                                // 2 sources

                                                return Unit.INSTANCE;
lbl28:
                                                // 1 sources

                                                resumeWatchingCard = v1;
                                                AppContextUtils.loadSearchResult$default(AppContextUtils.INSTANCE, (Activity)this.$activity, (SearchResponse)resumeWatchingCard, 1, null, 4, null);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }

                                    public final Object invoke(CoroutineScope p1, FragmentActivity p2, Continuation<? super Unit> p3) {
                                        return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
                                    }
                                });
                            } else if (!isWebview) {
                                Object object;
                                Object object2;
                                Object object3;
                                String string7;
                                if (StringsKt.startsWith$default((String)str, (String)"downloadpage", (boolean)false, (int)2, null)) {
                                    UIHelper.navigate$default(UIHelper.INSTANCE, (Activity)fragmentActivity, R.id.navigation_downloads, null, null, 6, null);
                                    return true;
                                }
                                if (extraArgs != null && (string7 = extraArgs.getString(MainActivity.API_NAME_EXTRA_KEY)) != null) {
                                    Object object4 = object3 = string7;
                                    boolean bl2 = false;
                                    object2 = !StringsKt.isBlank((CharSequence)((CharSequence)object4)) ? object3 : null;
                                } else {
                                    object2 = object = null;
                                }
                                if (object != null) {
                                    AppContextUtils.loadResult$default(AppContextUtils.INSTANCE, fragmentActivity, str, object, "", 0, 0, 24, null);
                                    return true;
                                }
                                object3 = APIHolder.INSTANCE.getApis();
                                synchronized (object3) {
                                    boolean bl3 = false;
                                    for (MainAPI mainAPI : APIHolder.INSTANCE.getApis()) {
                                        if (!StringsKt.startsWith$default((String)str, (String)mainAPI.getMainUrl(), (boolean)false, (int)2, null)) continue;
                                        AppContextUtils.loadResult$default(AppContextUtils.INSTANCE, fragmentActivity, str, mainAPI.getName(), "", 0, 0, 24, null);
                                        boolean bl4 = true;
                                        return bl4;
                                    }
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }

        public static /* synthetic */ boolean handleAppIntentUrl$default(Companion companion, FragmentActivity fragmentActivity, String string2, boolean bl, Bundle bundle, int n, Object object) {
            if ((n & 8) != 0) {
                bundle = null;
            }
            return companion.handleAppIntentUrl(fragmentActivity, string2, bl, bundle);
        }

        private static final URI handleAppIntentUrl$lambda$3$safeURI$lambda$0(String $uri) {
            return new URI($uri);
        }

        private static final URI handleAppIntentUrl$lambda$3$safeURI(String uri) {
            return (URI)ArchComponentExtKt.safe(() -> Companion.handleAppIntentUrl$lambda$3$safeURI$lambda$0(uri));
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\rH\u0016J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00a8\u0006\u0018"}, d2={"Lcom/lagradost/cloudstream3/MainActivity$SessionManagerListenerImpl;", "Lcom/google/android/gms/cast/framework/SessionManagerListener;", "Lcom/google/android/gms/cast/framework/Session;", "<init>", "(Lcom/lagradost/cloudstream3/MainActivity;)V", "onSessionStarting", "", "session", "onSessionStarted", "sessionId", "", "onSessionStartFailed", "i", "", "onSessionEnding", "onSessionResumed", "wasSuspended", "", "onSessionResumeFailed", "onSessionSuspended", "onSessionEnded", "error", "onSessionResuming", "s", "app_prereleaseDebug"})
    private final class SessionManagerListenerImpl
    implements SessionManagerListener<Session> {
        public void onSessionStarting(@NotNull Session session) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionStarted(@NotNull Session session, @NotNull String sessionId) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
            Intrinsics.checkNotNullParameter((Object)sessionId, (String)"sessionId");
            MainActivity.this.invalidateOptionsMenu();
        }

        public void onSessionStartFailed(@NotNull Session session, int i) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionEnding(@NotNull Session session) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionResumed(@NotNull Session session, boolean wasSuspended) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
            MainActivity.this.invalidateOptionsMenu();
        }

        public void onSessionResumeFailed(@NotNull Session session, int i) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionSuspended(@NotNull Session session, int i) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionEnded(@NotNull Session session, int error) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
        }

        public void onSessionResuming(@NotNull Session session, @NotNull String s2) {
            Intrinsics.checkNotNullParameter((Object)session, (String)"session");
            Intrinsics.checkNotNullParameter((Object)s2, (String)"s");
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001,B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0002J\u001c\u0010)\u001a\u00020\u001c2\b\u0010*\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010+\u001a\u00020!H\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082T\u00a2\u0006\u0002\n\u0000R\u001d\u0010#\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b%\u0010&\u00a8\u0006-"}, d2={"Lcom/lagradost/cloudstream3/MainActivity$TvFocus;", "", "<init>", "()V", "last", "Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget;", "getLast", "()Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget;", "setLast", "(Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget;)V", "current", "getCurrent", "setCurrent", "focusOutline", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "getFocusOutline", "()Ljava/lang/ref/WeakReference;", "setFocusOutline", "(Ljava/lang/ref/WeakReference;)V", "lastFocus", "getLastFocus", "setLastFocus", "layoutListener", "Landroid/view/View$OnLayoutChangeListener;", "attachListener", "Landroid/view/View$OnAttachStateChangeListener;", "setTargetPosition", "", "target", "animator", "Landroid/animation/ValueAnimator;", "NO_MOVE_LIST", "", "LEFTMOST_MOVE_LIST", "reflectedScroll", "Ljava/lang/reflect/Method;", "getReflectedScroll", "()Ljava/lang/reflect/Method;", "reflectedScroll$delegate", "Lkotlin/Lazy;", "updateFocusView", "newFocus", "same", "FocusTarget", "app_prereleaseDebug"})
    @SourceDebugExtension(value={"SMAP\nMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity$TvFocus\n+ 2 View.kt\nandroidx/core/view/ViewKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1939:1\n297#2:1940\n257#2,2:1941\n376#2,2:1943\n257#2,2:1945\n1310#3,2:1947\n1#4:1949\n*S KotlinDebug\n*F\n+ 1 MainActivity.kt\ncom/lagradost/cloudstream3/MainActivity$TvFocus\n*L\n925#1:1940\n929#1:1941,2\n946#1:1943,2\n997#1:1945,2\n903#1:1947,2\n*E\n"})
    public static final class TvFocus {
        @NotNull
        public static final TvFocus INSTANCE = new TvFocus();
        @NotNull
        private static FocusTarget last = new FocusTarget(0, 0, 0.0f, 0.0f);
        @NotNull
        private static FocusTarget current = new FocusTarget(0, 0, 0.0f, 0.0f);
        @NotNull
        private static WeakReference<View> focusOutline = new WeakReference<Object>(null);
        @NotNull
        private static WeakReference<View> lastFocus = new WeakReference<Object>(null);
        @NotNull
        private static final View.OnLayoutChangeListener layoutListener = TvFocus::layoutListener$lambda$2;
        @NotNull
        private static final View.OnAttachStateChangeListener attachListener = new View.OnAttachStateChangeListener(){

            public void onViewAttachedToWindow(View v) {
                Intrinsics.checkNotNullParameter((Object)v, (String)"v");
                TvFocus.updateFocusView$default(TvFocus.INSTANCE, v, false, 2, null);
            }

            /*
             * WARNING - void declaration
             */
            public void onViewDetachedFromWindow(View v) {
                block0: {
                    void $this$isVisible\1;
                    Intrinsics.checkNotNullParameter((Object)v, (String)"v");
                    View view = (View)TvFocus.INSTANCE.getFocusOutline().get();
                    if (view == null) break block0;
                    View view2 = view;
                    boolean bl = false;
                    boolean bl2 = false;
                    $this$isVisible\1.setVisibility(8);
                }
            }
        };
        @Nullable
        private static ValueAnimator animator;
        private static final boolean NO_MOVE_LIST = false;
        private static final boolean LEFTMOST_MOVE_LIST = true;
        @NotNull
        private static final Lazy reflectedScroll$delegate;

        private TvFocus() {
        }

        @NotNull
        public final FocusTarget getLast() {
            return last;
        }

        public final void setLast(@NotNull FocusTarget focusTarget) {
            Intrinsics.checkNotNullParameter((Object)focusTarget, (String)"<set-?>");
            last = focusTarget;
        }

        @NotNull
        public final FocusTarget getCurrent() {
            return current;
        }

        public final void setCurrent(@NotNull FocusTarget focusTarget) {
            Intrinsics.checkNotNullParameter((Object)focusTarget, (String)"<set-?>");
            current = focusTarget;
        }

        @NotNull
        public final WeakReference<View> getFocusOutline() {
            return focusOutline;
        }

        public final void setFocusOutline(@NotNull WeakReference<View> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, (String)"<set-?>");
            focusOutline = weakReference;
        }

        @NotNull
        public final WeakReference<View> getLastFocus() {
            return lastFocus;
        }

        public final void setLastFocus(@NotNull WeakReference<View> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, (String)"<set-?>");
            lastFocus = weakReference;
        }

        private final void setTargetPosition(FocusTarget target) {
            block2: {
                ViewGroup.LayoutParams layoutParams;
                View view;
                View view2 = (View)focusOutline.get();
                if (view2 == null) break block2;
                View view3 = view = view2;
                boolean bl = false;
                View view4 = view3;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 != null) {
                    ViewGroup.LayoutParams layoutParams3;
                    ViewGroup.LayoutParams layoutParams4 = layoutParams3 = layoutParams2;
                    View view5 = view4;
                    boolean bl2 = false;
                    $this$setTargetPosition_u24lambda_u244_u24lambda_u243\2.width = target.getWidth();
                    $this$setTargetPosition_u24lambda_u244_u24lambda_u243\2.height = target.getHeight();
                    view4 = view5;
                    layoutParams = layoutParams3;
                } else {
                    layoutParams = null;
                }
                view4.setLayoutParams(layoutParams);
                view3.setTranslationX(target.getX());
                view3.setTranslationY(target.getY());
                view3.bringToFront();
            }
        }

        private final Method getReflectedScroll() {
            Lazy lazy = reflectedScroll$delegate;
            return (Method)lazy.getValue();
        }

        /*
         * WARNING - void declaration
         */
        @MainThread
        public final void updateFocusView(@Nullable View newFocus, boolean same) {
            boolean exactlyTheSame;
            View view = (View)focusOutline.get();
            if (view == null) {
                return;
            }
            View focusOutline = view;
            View lastView = (View)lastFocus.get();
            boolean bl = exactlyTheSame = Intrinsics.areEqual((Object)lastView, (Object)newFocus) && newFocus != null;
            if (!exactlyTheSame) {
                View view2 = lastView;
                if (view2 != null) {
                    view2.removeOnLayoutChangeListener(layoutListener);
                }
                View view3 = lastView;
                if (view3 != null) {
                    view3.removeOnAttachStateChangeListener(attachListener);
                }
                View view4 = lastView;
                ViewParent viewParent = view4 != null ? view4.getParent() : null;
                RecyclerView recyclerView = viewParent instanceof RecyclerView ? (RecyclerView)viewParent : null;
                if (recyclerView != null) {
                    ViewParent viewParent2 = viewParent = recyclerView;
                    boolean bl2 = false;
                    viewParent2.removeOnLayoutChangeListener(layoutListener);
                }
            }
            View view5 = focusOutline;
            boolean bl3 = false;
            boolean wasGone = view5.getVisibility() == 8;
            boolean visible = newFocus != null && newFocus.getMeasuredHeight() > 0 && newFocus.getMeasuredWidth() > 0 && newFocus.isShown() && !Intrinsics.areEqual((Object)newFocus.getTag(), (Object)"tv_no_focus_tag");
            View view6 = focusOutline;
            boolean bl4 = false;
            view6.setVisibility(visible ? 0 : 8);
            if (newFocus != null) {
                int n3;
                RecyclerView.LayoutManager layoutManager;
                lastFocus = new WeakReference<View>(newFocus);
                ViewParent parent = newFocus.getParent();
                boolean targetDx = false;
                if (parent instanceof RecyclerView && (layoutManager = ((RecyclerView)parent).getLayoutManager()) instanceof LinearListLayout && ((LinearListLayout)layoutManager).getOrientation() == 0) {
                    Integer dx;
                    int[] nArray = new LinearSnapHelper().calculateDistanceToFinalSnap(layoutManager, newFocus);
                    Integer n2 = dx = nArray != null ? Integer.valueOf(nArray[0]) : null;
                    if (dx != null) {
                        ViewGroup.LayoutParams layoutParams;
                        View view7 = newFocus;
                        boolean bl5 = false;
                        int diff = (((LinearListLayout)layoutManager).getWidth() - ((LinearListLayout)layoutManager).getPaddingStart() - newFocus.getMeasuredWidth()) / 2 - ((layoutParams = view7.getLayoutParams()) instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams)layoutParams).getMarginStart() : 0);
                        int rdx = dx + (AppContextUtils.INSTANCE.isRtl((View)parent) ? -diff : diff);
                        ((RecyclerView)parent).smoothScrollBy(rdx, 0);
                    }
                }
                int[] out2 = new int[2];
                newFocus.getLocationInWindow(out2);
                int screenX = out2[0];
                int screenY = out2[1];
                Pair pair = TuplesKt.to((Object)Float.valueOf(screenX), (Object)Float.valueOf(screenY));
                float x = ((Number)pair.component1()).floatValue();
                float y = ((Number)pair.component2()).floatValue();
                Pair pair2 = TuplesKt.to((Object)Float.valueOf(focusOutline.getTranslationX()), (Object)Float.valueOf(focusOutline.getTranslationY()));
                float currentX = ((Number)pair2.component1()).floatValue();
                float currentY = ((Number)pair2.component2()).floatValue();
                if (!AppContextUtils.INSTANCE.isLtr(newFocus)) {
                    x = x - (float)focusOutline.getRootView().getWidth() + (float)newFocus.getMeasuredWidth();
                }
                x -= (float)targetDx;
                if (screenX == 0 && screenY == 0) {
                    void $this$isVisible\5;
                    View view8 = focusOutline;
                    n3 = 0;
                    boolean bl6 = false;
                    $this$isVisible\5.setVisibility(8);
                }
                if (!exactlyTheSame) {
                    ViewParent n3 = newFocus.getParent();
                    RecyclerView recyclerView = n3 instanceof RecyclerView ? (RecyclerView)n3 : null;
                    if (recyclerView != null) {
                        ViewParent $this$updateFocusView_u24lambda_u249\72 = n3 = recyclerView;
                        boolean bl7 = false;
                        $this$updateFocusView_u24lambda_u249\72.addOnLayoutChangeListener(layoutListener);
                    }
                    newFocus.addOnLayoutChangeListener(layoutListener);
                    newFocus.addOnAttachStateChangeListener(attachListener);
                }
                n3 = focusOutline.getMeasuredWidth();
                int $this$updateFocusView_u24lambda_u249\72 = focusOutline.getMeasuredHeight();
                FocusTarget start = new FocusTarget(n3, $this$updateFocusView_u24lambda_u249\72, currentX, currentY);
                float $this$updateFocusView_u24lambda_u249\72 = x;
                float bl7 = y;
                int n4 = newFocus.getMeasuredWidth();
                int n5 = newFocus.getMeasuredHeight();
                FocusTarget end = new FocusTarget(n4, n5, $this$updateFocusView_u24lambda_u249\72, bl7);
                Integer deltaMinX = (Integer)Comparators.min((Comparable)Integer.valueOf(end.getWidth() / 2), (Comparable)Integer.valueOf(UIHelper.INSTANCE.getToPx(60)));
                Integer deltaMinY = (Integer)Comparators.min((Comparable)Integer.valueOf(end.getHeight() / 2), (Comparable)Integer.valueOf(UIHelper.INSTANCE.getToPx(60)));
                if (start.getWidth() == end.getWidth() && start.getHeight() == end.getHeight() && Math.abs(start.getX() - end.getX()) < (float)deltaMinX.intValue() && Math.abs(start.getY() - end.getY()) < (float)deltaMinY.intValue()) {
                    ValueAnimator valueAnimator = animator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    last = start;
                    current = end;
                    this.setTargetPosition(end);
                    return;
                }
                ValueAnimator valueAnimator = animator;
                boolean bl8 = valueAnimator != null ? valueAnimator.isRunning() : false;
                if (bl8) {
                    current = end;
                    return;
                }
                ValueAnimator valueAnimator2 = animator;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                last = start;
                current = end;
                if (wasGone) {
                    this.setTargetPosition(current);
                    return;
                }
                Object object = new float[]{0.0f, 1.0f};
                Object object2 = object = (Object)ValueAnimator.ofFloat((float[])object);
                boolean bl9 = false;
                object2.setStartDelay(0L);
                object2.setDuration(200L);
                object2.addUpdateListener(TvFocus::updateFocusView$lambda$11$lambda$10);
                object2.start();
                animator = (ValueAnimator)object;
                if (!same) {
                    newFocus.postDelayed(TvFocus::updateFocusView$lambda$12, 200L);
                }
            }
        }

        public static /* synthetic */ void updateFocusView$default(TvFocus tvFocus, View view, boolean bl, int n, Object object) {
            if ((n & 2) != 0) {
                bl = false;
            }
            tvFocus.updateFocusView(view, bl);
        }

        private static final void layoutListener$lambda$2$lambda$1$lambda$0() {
            INSTANCE.updateFocusView((View)lastFocus.get(), false);
        }

        private static final void layoutListener$lambda$2(View view, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
            block0: {
                View view2;
                View view3 = (View)lastFocus.get();
                if (view3 == null) break block0;
                View view4 = view2 = view3;
                boolean bl = false;
                INSTANCE.updateFocusView(view4, true);
                view4.postDelayed(TvFocus::layoutListener$lambda$2$lambda$1$lambda$0, 300L);
            }
        }

        private static final Method reflectedScroll_delegate$lambda$7() {
            Method method;
            try {
                Object object;
                Object object2;
                Object object3;
                block5: {
                    Method[] methodArray = RecyclerView.class.getDeclaredMethods();
                    Intrinsics.checkNotNullExpressionValue((Object)methodArray, (String)"getDeclaredMethods(...)");
                    object3 = methodArray;
                    boolean bl = false;
                    int n = ((Object[])object3).length;
                    for (int i = 0; i < n; ++i) {
                        Object object4 = object3[i];
                        Method method2 = (Method)object4;
                        boolean bl2 = false;
                        if (!Intrinsics.areEqual((Object)method2.getName(), (Object)"scrollStep")) continue;
                        object2 = object4;
                        break block5;
                    }
                    object2 = null;
                }
                method = (Method)object2;
                if (method != null) {
                    Object object5 = object3 = method;
                    boolean bl = false;
                    ((Method)object5).setAccessible(true);
                    object = object3;
                } else {
                    object = null;
                }
                method = object;
            }
            catch (Throwable t) {
                method = null;
            }
            return method;
        }

        private static final void updateFocusView$lambda$11$lambda$10(ValueAnimator animation) {
            Intrinsics.checkNotNullParameter((Object)animation, (String)"animation");
            Object object = animation.getAnimatedValue();
            Intrinsics.checkNotNull((Object)object, (String)"null cannot be cast to non-null type kotlin.Float");
            float animatedValue = ((Float)object).floatValue();
            FocusTarget target = FocusTarget.Companion.lerp(last, current, Math.min(animatedValue, 1.0f));
            INSTANCE.setTargetPosition(target);
        }

        private static final void updateFocusView$lambda$12() {
            INSTANCE.updateFocusView((View)lastFocus.get(), true);
        }

        static {
            reflectedScroll$delegate = LazyKt.lazy(TvFocus::reflectedScroll_delegate$lambda$7);
        }

        @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e\u00a8\u0006\u001c"}, d2={"Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget;", "", "width", "", "height", "x", "", "y", "<init>", "(IIFF)V", "getWidth", "()I", "getHeight", "getX", "()F", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "Companion", "app_prereleaseDebug"})
        public static final class FocusTarget {
            @NotNull
            public static final Companion Companion = new Companion(null);
            private final int width;
            private final int height;
            private final float x;
            private final float y;

            public FocusTarget(int width, int height, float x, float y) {
                this.width = width;
                this.height = height;
                this.x = x;
                this.y = y;
            }

            public final int getWidth() {
                return this.width;
            }

            public final int getHeight() {
                return this.height;
            }

            public final float getX() {
                return this.x;
            }

            public final float getY() {
                return this.y;
            }

            public final int component1() {
                return this.width;
            }

            public final int component2() {
                return this.height;
            }

            public final float component3() {
                return this.x;
            }

            public final float component4() {
                return this.y;
            }

            @NotNull
            public final FocusTarget copy(int width, int height, float x, float y) {
                return new FocusTarget(width, height, x, y);
            }

            public static /* synthetic */ FocusTarget copy$default(FocusTarget focusTarget, int n, int n2, float f, float f2, int n3, Object object) {
                if ((n3 & 1) != 0) {
                    n = focusTarget.width;
                }
                if ((n3 & 2) != 0) {
                    n2 = focusTarget.height;
                }
                if ((n3 & 4) != 0) {
                    f = focusTarget.x;
                }
                if ((n3 & 8) != 0) {
                    f2 = focusTarget.y;
                }
                return focusTarget.copy(n, n2, f, f2);
            }

            @NotNull
            public String toString() {
                return "FocusTarget(width=" + this.width + ", height=" + this.height + ", x=" + this.x + ", y=" + this.y + ')';
            }

            public int hashCode() {
                int result2 = Integer.hashCode(this.width);
                result2 = result2 * 31 + Integer.hashCode(this.height);
                result2 = result2 * 31 + Float.hashCode(this.x);
                result2 = result2 * 31 + Float.hashCode(this.y);
                return result2;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FocusTarget)) {
                    return false;
                }
                FocusTarget focusTarget = (FocusTarget)other;
                if (this.width != focusTarget.width) {
                    return false;
                }
                if (this.height != focusTarget.height) {
                    return false;
                }
                if (Float.compare(this.x, focusTarget.x) != 0) {
                    return false;
                }
                return Float.compare(this.y, focusTarget.y) == 0;
            }

            @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\b\u00a8\u0006\t"}, d2={"Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget$Companion;", "", "<init>", "()V", "lerp", "Lcom/lagradost/cloudstream3/MainActivity$TvFocus$FocusTarget;", "a", "b", "", "app_prereleaseDebug"})
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final FocusTarget lerp(@NotNull FocusTarget a, @NotNull FocusTarget b, float lerp) {
                    Intrinsics.checkNotNullParameter((Object)a, (String)"a");
                    Intrinsics.checkNotNullParameter((Object)b, (String)"b");
                    float ilerp = 1.0f - lerp;
                    return new FocusTarget((int)((float)a.getWidth() * ilerp + (float)b.getWidth() * lerp), (int)((float)a.getHeight() * ilerp + (float)b.getHeight() * lerp), a.getX() * ilerp + b.getX() * lerp, a.getY() * ilerp + b.getY() * lerp);
                }

                public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
                    this();
                }
            }
        }
    }
}

