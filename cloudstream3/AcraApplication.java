/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.Intent
 *  android.content.pm.PackageManager
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.FragmentActivity
 *  coil3.ImageLoader
 *  coil3.SingletonImageLoader$Factory
 *  com.fasterxml.jackson.databind.json.JsonMapper
 *  com.lagradost.api.ContextHelper_androidKt
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.acra.ReportField
 *  org.acra.config.CoreConfigurationBuilder
 *  org.acra.data.StringFormat
 *  org.acra.ktx.ExtensionsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import coil3.SingletonImageLoader;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.lagradost.api.ContextHelper_androidKt;
import com.lagradost.cloudstream3.BuildConfig;
import com.lagradost.cloudstream3.ExceptionHandler;
import com.lagradost.cloudstream3.ui.settings.Globals;
import com.lagradost.cloudstream3.utils.AppContextUtils;
import com.lagradost.cloudstream3.utils.DataStore;
import com.lagradost.cloudstream3.utils.ImageLoader;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.acra.ReportField;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.data.StringFormat;
import org.acra.ktx.ExtensionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0014J\u0014\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\tj\u0002`\rH\u0016\u00a8\u0006\u000f"}, d2={"Lcom/lagradost/cloudstream3/AcraApplication;", "Landroid/app/Application;", "Lcoil3/SingletonImageLoader$Factory;", "<init>", "()V", "onCreate", "", "attachBaseContext", "base", "Landroid/content/Context;", "newImageLoader", "Lcoil3/ImageLoader;", "context", "Lcoil3/PlatformContext;", "Companion", "app_prereleaseDebug"})
public final class AcraApplication
extends Application
implements SingletonImageLoader.Factory {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private static ExceptionHandler exceptionHandler;
    @Nullable
    private static WeakReference<Context> _context;

    public void onCreate() {
        ExceptionHandler exceptionHandler;
        super.onCreate();
        File file = this.getFilesDir();
        Intrinsics.checkNotNullExpressionValue((Object)file, (String)"getFilesDir(...)");
        ExceptionHandler exceptionHandler2 = exceptionHandler = new ExceptionHandler(FilesKt.resolve((File)file, (String)"last_error"), (Function0<Unit>)((Function0)() -> AcraApplication.onCreate$lambda$0(this)));
        boolean bl = false;
        AcraApplication.exceptionHandler = exceptionHandler2;
        Thread.setDefaultUncaughtExceptionHandler(exceptionHandler2);
    }

    protected void attachBaseContext(@Nullable Context base2) {
        super.attachBaseContext(base2);
        AcraApplication.Companion.setContext(base2);
        ExtensionsKt.initAcra((Application)this, AcraApplication::attachBaseContext$lambda$2);
    }

    @NotNull
    public coil3.ImageLoader newImageLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Context context2 = this.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue((Object)context2, (String)"getApplicationContext(...)");
        return ImageLoader.INSTANCE.buildImageLoader$app_prereleaseDebug(context2);
    }

    private static final Unit onCreate$lambda$0(AcraApplication this$0) {
        Intent intent;
        Context context = Companion.getContext();
        Intrinsics.checkNotNull((Object)context);
        PackageManager packageManager = context.getPackageManager();
        Context context2 = Companion.getContext();
        Intrinsics.checkNotNull((Object)context2);
        Intent intent2 = intent = packageManager.getLaunchIntentForPackage(context2.getPackageName());
        Intrinsics.checkNotNull((Object)intent2);
        this$0.startActivity(Intent.makeRestartActivityTask((ComponentName)intent2.getComponent()));
        return Unit.INSTANCE;
    }

    private static final Unit attachBaseContext$lambda$2(CoreConfigurationBuilder $this$initAcra) {
        Intrinsics.checkNotNullParameter((Object)$this$initAcra, (String)"$this$initAcra");
        $this$initAcra.setBuildConfigClass(BuildConfig.class);
        $this$initAcra.setReportFormat(StringFormat.JSON);
        Object[] objectArray = new ReportField[]{ReportField.BUILD_CONFIG, ReportField.USER_CRASH_DATE, ReportField.ANDROID_VERSION, ReportField.PHONE_MODEL, ReportField.STACK_TRACE};
        $this$initAcra.setReportContent(CollectionsKt.listOf((Object[])objectArray));
        return Unit.INSTANCE;
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\n\u001a\u0004\u0018\u00010\u000b*\u00020\fH\u0086\u0010J-\u0010\u0015\u001a\u0004\u0018\u0001H\u0016\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00160\u001a\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u00020\u001d\"\b\b\u0000\u0010\u0016*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u0002H\u0016\u00a2\u0006\u0002\u0010\u001eJ\u0015\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010!\u001a\u00020\u0018\u00a2\u0006\u0002\u0010\"J!\u0010#\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u0002H\u0016\u00a2\u0006\u0002\u0010\u001eJ)\u0010#\u001a\u00020\u001d\"\u0004\b\u0000\u0010\u00162\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u0002H\u0016\u00a2\u0006\u0002\u0010$J.\u0010%\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0086\b\u00a2\u0006\u0002\u0010'J$\u0010%\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\b\u00a2\u0006\u0002\u0010(J,\u0010%\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0086\b\u00a2\u0006\u0002\u0010)J6\u0010%\u001a\u0004\u0018\u0001H\u0016\"\n\b\u0000\u0010\u0016\u0018\u0001*\u00020\u00012\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010&\u001a\u0004\u0018\u0001H\u0016H\u0086\b\u00a2\u0006\u0002\u0010*J\u0016\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010,2\u0006\u0010!\u001a\u00020\u0018J\u0016\u0010-\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010-\u001a\u00020\u001d2\u0006\u0010\u0017\u001a\u00020\u0018J$\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00182\b\b\u0002\u00100\u001a\u0002012\n\b\u0002\u00102\u001a\u0004\u0018\u000103J\u0018\u0010.\u001a\u00020\u001d2\u0006\u0010/\u001a\u00020\u00182\b\u00104\u001a\u0004\u0018\u000105R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R(\u0010\u0010\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f8F@BX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u00066"}, d2={"Lcom/lagradost/cloudstream3/AcraApplication$Companion;", "", "<init>", "()V", "exceptionHandler", "Lcom/lagradost/cloudstream3/ExceptionHandler;", "getExceptionHandler", "()Lcom/lagradost/cloudstream3/ExceptionHandler;", "setExceptionHandler", "(Lcom/lagradost/cloudstream3/ExceptionHandler;)V", "getActivity", "Landroid/app/Activity;", "Landroid/content/Context;", "_context", "Ljava/lang/ref/WeakReference;", "value", "context", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "getKeyClass", "T", "path", "", "valueType", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "setKeyClass", "", "(Ljava/lang/String;Ljava/lang/Object;)V", "removeKeys", "", "folder", "(Ljava/lang/String;)Ljava/lang/Integer;", "setKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "getKey", "defVal", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "getKeys", "", "removeKey", "openBrowser", "url", "fallbackWebview", "", "fragment", "Landroidx/fragment/app/Fragment;", "activity", "Landroidx/fragment/app/FragmentActivity;", "app_prereleaseDebug"})
    @SourceDebugExtension(value={"SMAP\nAcraApplication.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n+ 2 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n*L\n1#1,233:1\n183#2,3:234\n174#2:237\n186#2,2:238\n192#2:240\n183#2,3:241\n174#2:244\n186#2,2:245\n196#2:247\n183#2,3:248\n174#2:251\n186#2,2:252\n200#2:254\n183#2,3:255\n174#2:258\n186#2,2:259\n*S KotlinDebug\n*F\n+ 1 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n*L\n190#1:234,3\n190#1:237\n190#1:238,2\n194#1:240\n194#1:241,3\n194#1:244\n194#1:245,2\n198#1:247\n198#1:248,3\n198#1:251\n198#1:252,2\n202#1:254\n202#1:255,3\n202#1:258\n202#1:259,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final ExceptionHandler getExceptionHandler() {
            return exceptionHandler;
        }

        public final void setExceptionHandler(@Nullable ExceptionHandler exceptionHandler) {
            AcraApplication.exceptionHandler = exceptionHandler;
        }

        @Nullable
        public final Activity getActivity(@NotNull Context $this$getActivity) {
            Activity activity;
            block2: {
                Intrinsics.checkNotNullParameter((Object)$this$getActivity, (String)"<this>");
                Companion companion = this;
                while (true) {
                    Context context;
                    Context context2;
                    if ((context2 = $this$getActivity) instanceof Activity) {
                        activity = (Activity)$this$getActivity;
                        break block2;
                    }
                    if (!(context2 instanceof ContextWrapper)) break;
                    Companion companion2 = companion;
                    Intrinsics.checkNotNullExpressionValue((Object)((ContextWrapper)$this$getActivity).getBaseContext(), (String)"getBaseContext(...)");
                    companion = companion2;
                    $this$getActivity = context;
                }
                activity = null;
            }
            return activity;
        }

        @Nullable
        public final Context getContext() {
            WeakReference weakReference = _context;
            return weakReference != null ? (Context)weakReference.get() : null;
        }

        private final void setContext(Context value) {
            _context = new WeakReference<Context>(value);
            ContextHelper_androidKt.setContext(new WeakReference<Context>(value));
        }

        @Nullable
        public final <T> T getKeyClass(@NotNull String path, @NotNull Class<T> valueType) {
            Intrinsics.checkNotNullParameter((Object)path, (String)"path");
            Intrinsics.checkNotNullParameter(valueType, (String)"valueType");
            Context context = this.getContext();
            return (T)(context != null ? DataStore.INSTANCE.getKey(context, path, valueType) : null);
        }

        public final <T> void setKeyClass(@NotNull String path, @NotNull T value) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                Intrinsics.checkNotNullParameter(value, (String)"value");
                Context context = this.getContext();
                if (context == null) break block0;
                DataStore.INSTANCE.setKey(context, path, value);
            }
        }

        @Nullable
        public final Integer removeKeys(@NotNull String folder) {
            Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
            Context context = this.getContext();
            return context != null ? Integer.valueOf(DataStore.INSTANCE.removeKeys(context, folder)) : null;
        }

        public final <T> void setKey(@NotNull String path, T value) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                Context context = this.getContext();
                if (context == null) break block0;
                DataStore.INSTANCE.setKey(context, path, value);
            }
        }

        public final <T> void setKey(@NotNull String folder, @NotNull String path, T value) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                Context context = this.getContext();
                if (context == null) break block0;
                DataStore.INSTANCE.setKey(context, folder, path, value);
            }
        }

        /*
         * WARNING - void declaration
         */
        public final /* synthetic */ <T> T getKey(String path, T defVal) {
            Object object;
            block5: {
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                boolean $i$f$getKey = false;
                Context context = this.getContext();
                if (context != null) {
                    DataStore dataStore = DataStore.INSTANCE;
                    Context context2 = context;
                    boolean bl = false;
                    try {
                        void this_\2;
                        void this_\1;
                        String string2 = this_\1.getSharedPrefs(context2).getString(path, null);
                        if (string2 == null) {
                            object = defVal;
                            break block5;
                        }
                        String string3 = string2;
                        void var9_9 = this_\1;
                        String string4 = string3;
                        boolean bl2 = false;
                        JsonMapper jsonMapper = this_\2.getMapper();
                        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
                        Object object2 = jsonMapper.readValue(string4, Object.class);
                        object = object2;
                        Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"readValue(...)");
                    }
                    catch (Exception exception) {
                        object = null;
                    }
                } else {
                    object = null;
                }
            }
            return (T)object;
        }

        /*
         * WARNING - void declaration
         */
        public final /* synthetic */ <T> T getKey(String path) {
            Object object;
            block5: {
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                boolean $i$f$getKey = false;
                Context context = this.getContext();
                if (context != null) {
                    void this_\1;
                    DataStore dataStore = DataStore.INSTANCE;
                    Context context2 = context;
                    boolean bl = false;
                    void var7_7 = this_\1;
                    Context context3 = context2;
                    Object object2 = null;
                    boolean bl2 = false;
                    try {
                        void this_\3;
                        void $this$getKey\2;
                        void this_\2;
                        String string2 = this_\2.getSharedPrefs((Context)$this$getKey\2).getString(path, null);
                        if (string2 == null) {
                            object = object2;
                            break block5;
                        }
                        String string3 = string2;
                        void var12_12 = this_\2;
                        String string4 = string3;
                        boolean bl3 = false;
                        JsonMapper jsonMapper = this_\3.getMapper();
                        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
                        Object object3 = jsonMapper.readValue(string4, Object.class);
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
            return (T)object;
        }

        /*
         * WARNING - void declaration
         */
        public final /* synthetic */ <T> T getKey(String folder, String path) {
            Object object;
            block5: {
                Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                boolean $i$f$getKey = false;
                Context context = this.getContext();
                if (context != null) {
                    void this_\1;
                    DataStore dataStore = DataStore.INSTANCE;
                    Context context2 = context;
                    boolean bl = false;
                    void var8_8 = this_\1;
                    Context context3 = context2;
                    String string2 = this_\1.getFolderName(folder, path);
                    Object object2 = null;
                    boolean bl2 = false;
                    try {
                        void this_\3;
                        void path\2;
                        void $this$getKey\2;
                        void this_\2;
                        String string3 = this_\2.getSharedPrefs((Context)$this$getKey\2).getString((String)path\2, null);
                        if (string3 == null) {
                            object = object2;
                            break block5;
                        }
                        String string4 = string3;
                        void var14_14 = this_\2;
                        String string5 = string4;
                        boolean bl3 = false;
                        JsonMapper jsonMapper = this_\3.getMapper();
                        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
                        Object object3 = jsonMapper.readValue(string5, Object.class);
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
            return (T)object;
        }

        /*
         * WARNING - void declaration
         */
        public final /* synthetic */ <T> T getKey(String folder, String path, T defVal) {
            Object object;
            Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
            Intrinsics.checkNotNullParameter((Object)path, (String)"path");
            boolean $i$f$getKey = false;
            Context context = this.getContext();
            if (context != null) {
                Object object2;
                void this_\1;
                DataStore dataStore = DataStore.INSTANCE;
                Context context2 = context;
                boolean bl = false;
                void var9_9 = this_\1;
                Context context3 = context2;
                String string2 = this_\1.getFolderName(folder, path);
                boolean bl2 = false;
                try {
                    void $this$getKey\2;
                    void this_\2;
                    String string3 = this_\2.getSharedPrefs((Context)$this$getKey\2).getString(string2, null);
                    if (string3 == null) {
                        object2 = defVal;
                    } else {
                        void this_\3;
                        String string4 = string3;
                        void var14_14 = this_\2;
                        String string5 = string4;
                        boolean bl3 = false;
                        JsonMapper jsonMapper = this_\3.getMapper();
                        Intrinsics.reifiedOperationMarker((int)4, (String)"T");
                        Object object3 = jsonMapper.readValue(string5, Object.class);
                        object2 = object3;
                        Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"readValue(...)");
                    }
                }
                catch (Exception exception) {
                    object2 = object = null;
                }
                if (object2 == null) {
                    object = defVal;
                }
            } else {
                object = null;
            }
            return (T)object;
        }

        @Nullable
        public final List<String> getKeys(@NotNull String folder) {
            Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
            Context context = this.getContext();
            return context != null ? DataStore.INSTANCE.getKeys(context, folder) : null;
        }

        public final void removeKey(@NotNull String folder, @NotNull String path) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)folder, (String)"folder");
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                Context context = this.getContext();
                if (context == null) break block0;
                DataStore.INSTANCE.removeKey(context, folder, path);
            }
        }

        public final void removeKey(@NotNull String path) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)path, (String)"path");
                Context context = this.getContext();
                if (context == null) break block0;
                DataStore.INSTANCE.removeKey(context, path);
            }
        }

        public final void openBrowser(@NotNull String url, boolean fallbackWebview, @Nullable Fragment fragment) {
            block0: {
                Intrinsics.checkNotNullParameter((Object)url, (String)"url");
                Context context = this.getContext();
                if (context == null) break block0;
                AppContextUtils.INSTANCE.openBrowser(context, url, fallbackWebview, fragment);
            }
        }

        public static /* synthetic */ void openBrowser$default(Companion companion, String string2, boolean bl, Fragment fragment, int n, Object object) {
            if ((n & 2) != 0) {
                bl = false;
            }
            if ((n & 4) != 0) {
                fragment = null;
            }
            companion.openBrowser(string2, bl, fragment);
        }

        public final void openBrowser(@NotNull String url, @Nullable FragmentActivity activity) {
            Object object;
            Intrinsics.checkNotNullParameter((Object)url, (String)"url");
            this.openBrowser(url, Globals.INSTANCE.isLayout(6), (object = activity) != null && (object = object.getSupportFragmentManager()) != null && (object = object.getFragments()) != null ? (Fragment)CollectionsKt.lastOrNull((List)object) : null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

