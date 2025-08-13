/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.nsd.NsdManager
 *  android.net.nsd.NsdManager$DiscoveryListener
 *  android.net.nsd.NsdManager$RegistrationListener
 *  android.net.nsd.NsdManager$ResolveListener
 *  android.net.nsd.NsdManager$ServiceInfoCallback
 *  android.net.nsd.NsdServiceInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.ext.SdkExtensions
 *  android.util.Log
 *  kotlin.Metadata
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.Job
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import android.content.Context;
import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;
import android.util.Log;
import com.lagradost.cloudstream3.actions.temp.fcast.FcastManager;
import com.lagradost.cloudstream3.actions.temp.fcast.PublicDeviceInfo;
import com.lagradost.cloudstream3.utils.Coroutines;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0002\u0012\u0013B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager;", "", "<init>", "()V", "nsdManager", "Landroid/net/nsd/NsdManager;", "registrationListenerTcp", "Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager$Companion$DefaultRegistrationListener;", "getDeviceName", "", "init", "Lkotlinx/coroutines/Job;", "context", "Landroid/content/Context;", "registerReceiver", "", "stop", "", "DefaultDiscoveryListener", "Companion", "app_prereleaseDebug"})
public final class FcastManager {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @Nullable
    private NsdManager nsdManager;
    @NotNull
    private final Companion.DefaultRegistrationListener registrationListenerTcp = new Companion.DefaultRegistrationListener();
    @NotNull
    public static final String APP_PREFIX = "CloudStream";
    @NotNull
    private static final List<PublicDeviceInfo> _currentDevices = new ArrayList();
    @NotNull
    private static final List<PublicDeviceInfo> currentDevices = _currentDevices;
    public static final int TCP_PORT = 46899;

    private final String getDeviceName() {
        return Build.MANUFACTURER + '-' + Build.MODEL;
    }

    @NotNull
    public final Job init(@NotNull Context context, boolean registerReceiver) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        return Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, FcastManager, Continuation<? super Unit>, Object>(this, context, registerReceiver, null){
            int label;
            final /* synthetic */ FcastManager this$0;
            final /* synthetic */ Context $context;
            final /* synthetic */ boolean $registerReceiver;
            {
                this.this$0 = $receiver;
                this.$context = $context;
                this.$registerReceiver = $registerReceiver;
                super(3, $completion);
            }

            /*
             * WARNING - void declaration
             */
            public final Object invokeSuspend(Object object) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)object);
                        Object object2 = this.$context.getSystemService("servicediscovery");
                        Intrinsics.checkNotNull((Object)object2, (String)"null cannot be cast to non-null type android.net.nsd.NsdManager");
                        FcastManager.access$setNsdManager$p(this.this$0, (NsdManager)object2);
                        String serviceType = "_fcast._tcp";
                        if (this.$registerReceiver) {
                            NsdServiceInfo nsdServiceInfo;
                            String serviceName = "CloudStream-" + FcastManager.access$getDeviceName(this.this$0);
                            NsdServiceInfo nsdServiceInfo2 = nsdServiceInfo = new NsdServiceInfo();
                            boolean bl = false;
                            nsdServiceInfo2.setServiceName(serviceName);
                            nsdServiceInfo2.setServiceType(serviceType);
                            nsdServiceInfo2.setPort(46899);
                            NsdServiceInfo serviceInfo = nsdServiceInfo;
                            NsdManager nsdManager = FcastManager.access$getNsdManager$p(this.this$0);
                            if (nsdManager != null) {
                                nsdManager.registerService(serviceInfo, 1, (NsdManager.RegistrationListener)FcastManager.access$getRegistrationListenerTcp$p(this.this$0));
                            }
                        }
                        NsdManager nsdManager = FcastManager.access$getNsdManager$p(this.this$0);
                        if (nsdManager != null) {
                            void var2_2;
                            nsdManager.discoverServices((String)var2_2, 1, (NsdManager.DiscoveryListener)this.this$0.new DefaultDiscoveryListener());
                        }
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, FcastManager p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
    }

    public final void stop() {
        block0: {
            NsdManager nsdManager = this.nsdManager;
            if (nsdManager == null) break block0;
            nsdManager.unregisterService((NsdManager.RegistrationListener)this.registrationListenerTcp);
        }
    }

    public static final /* synthetic */ void access$setNsdManager$p(FcastManager $this, NsdManager nsdManager) {
        $this.nsdManager = nsdManager;
    }

    public static final /* synthetic */ String access$getDeviceName(FcastManager $this) {
        return $this.getDeviceName();
    }

    public static final /* synthetic */ Companion.DefaultRegistrationListener access$getRegistrationListenerTcp$p(FcastManager $this) {
        return $this.registrationListenerTcp;
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager$Companion;", "", "<init>", "()V", "APP_PREFIX", "", "_currentDevices", "", "Lcom/lagradost/cloudstream3/actions/temp/fcast/PublicDeviceInfo;", "currentDevices", "", "getCurrentDevices", "()Ljava/util/List;", "TCP_PORT", "", "DefaultRegistrationListener", "app_prereleaseDebug"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final List<PublicDeviceInfo> getCurrentDevices() {
            return currentDevices;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager$Companion$DefaultRegistrationListener;", "Landroid/net/nsd/NsdManager$RegistrationListener;", "<init>", "()V", "tag", "", "getTag", "()Ljava/lang/String;", "onServiceRegistered", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "onRegistrationFailed", "errorCode", "", "onServiceUnregistered", "onUnregistrationFailed", "app_prereleaseDebug"})
        public static final class DefaultRegistrationListener
        implements NsdManager.RegistrationListener {
            @NotNull
            private final String tag;

            public DefaultRegistrationListener() {
                this.tag = "DiscoveryService";
            }

            @NotNull
            public final String getTag() {
                return this.tag;
            }

            public void onServiceRegistered(@NotNull NsdServiceInfo serviceInfo) {
                Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
                Log.d((String)this.tag, (String)("Service registered: " + serviceInfo.getServiceName()));
            }

            public void onRegistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
                Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
                Log.e((String)this.tag, (String)("Service registration failed: errorCode=" + errorCode));
            }

            public void onServiceUnregistered(@NotNull NsdServiceInfo serviceInfo) {
                Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
                Log.d((String)this.tag, (String)("Service unregistered: " + serviceInfo.getServiceName()));
            }

            public void onUnregistrationFailed(@NotNull NsdServiceInfo serviceInfo, int errorCode) {
                Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
                Log.e((String)this.tag, (String)("Service unregistration failed: errorCode=" + errorCode));
            }
        }
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\r\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000f\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0010\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager$DefaultDiscoveryListener;", "Landroid/net/nsd/NsdManager$DiscoveryListener;", "<init>", "(Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastManager;)V", "tag", "", "getTag", "()Ljava/lang/String;", "onStartDiscoveryFailed", "", "serviceType", "errorCode", "", "onStopDiscoveryFailed", "onDiscoveryStarted", "onDiscoveryStopped", "onServiceFound", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "onServiceLost", "app_prereleaseDebug"})
    public final class DefaultDiscoveryListener
    implements NsdManager.DiscoveryListener {
        @NotNull
        private final String tag;

        public DefaultDiscoveryListener() {
            this.tag = "DiscoveryListener";
        }

        @NotNull
        public final String getTag() {
            return this.tag;
        }

        public void onStartDiscoveryFailed(@Nullable String serviceType, int errorCode) {
            Log.d((String)this.tag, (String)("Discovery failed: " + serviceType + ", error code: " + errorCode));
        }

        public void onStopDiscoveryFailed(@Nullable String serviceType, int errorCode) {
            Log.d((String)this.tag, (String)("Stop discovery failed: " + serviceType + ", error code: " + errorCode));
        }

        public void onDiscoveryStarted(@Nullable String serviceType) {
            Log.d((String)this.tag, (String)("Discovery started: " + serviceType));
        }

        public void onDiscoveryStopped(@Nullable String serviceType) {
            Log.d((String)this.tag, (String)("Discovery stopped: " + serviceType));
        }

        public void onServiceFound(@Nullable NsdServiceInfo serviceInfo) {
            block2: {
                block1: {
                    if (serviceInfo == null) {
                        return;
                    }
                    if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion((int)33) < 7) break block1;
                    NsdManager nsdManager = FcastManager.this.nsdManager;
                    if (nsdManager == null) break block2;
                    nsdManager.registerServiceInfoCallback(serviceInfo, Runnable::run, new NsdManager.ServiceInfoCallback(this, serviceInfo){
                        final /* synthetic */ DefaultDiscoveryListener this$0;
                        final /* synthetic */ NsdServiceInfo $serviceInfo;
                        {
                            this.this$0 = $receiver;
                            this.$serviceInfo = $serviceInfo;
                        }

                        public void onServiceInfoCallbackRegistrationFailed(int errorCode) {
                            Log.e((String)this.this$0.getTag(), (String)("Service registration failed: " + errorCode));
                        }

                        /*
                         * WARNING - Removed try catching itself - possible behaviour change.
                         */
                        public void onServiceUpdated(NsdServiceInfo serviceInfo) {
                            Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
                            String string2 = this.this$0.getTag();
                            StringBuilder stringBuilder = new StringBuilder().append("Service updated: ").append(serviceInfo.getServiceName()).append(",Net: ");
                            List list2 = serviceInfo.getHostAddresses();
                            Intrinsics.checkNotNullExpressionValue((Object)list2, (String)"getHostAddresses(...)");
                            InetAddress inetAddress = (InetAddress)CollectionsKt.firstOrNull((List)list2);
                            Log.d((String)string2, (String)stringBuilder.append(inetAddress != null ? inetAddress.getHostAddress() : null).toString());
                            List list3 = FcastManager.access$get_currentDevices$cp();
                            synchronized (list3) {
                                boolean bl = false;
                                FcastManager.access$get_currentDevices$cp().removeIf(arg_0 -> onServiceFound.2.onServiceUpdated$lambda$2$lambda$1(arg_0 -> onServiceFound.2.onServiceUpdated$lambda$2$lambda$0(serviceInfo, arg_0), arg_0));
                                boolean bl2 = FcastManager.access$get_currentDevices$cp().add(new PublicDeviceInfo(serviceInfo));
                            }
                        }

                        /*
                         * WARNING - Removed try catching itself - possible behaviour change.
                         */
                        public void onServiceLost() {
                            Log.d((String)this.this$0.getTag(), (String)("Service lost: " + this.$serviceInfo.getServiceName() + ','));
                            List list2 = FcastManager.access$get_currentDevices$cp();
                            NsdServiceInfo nsdServiceInfo = this.$serviceInfo;
                            List list3 = list2;
                            synchronized (list3) {
                                boolean bl = false;
                                boolean bl2 = FcastManager.access$get_currentDevices$cp().removeIf(arg_0 -> onServiceFound.2.onServiceLost$lambda$5$lambda$4(arg_0 -> onServiceFound.2.onServiceLost$lambda$5$lambda$3(nsdServiceInfo, arg_0), arg_0));
                            }
                        }

                        public void onServiceInfoCallbackUnregistered() {
                        }

                        private static final boolean onServiceUpdated$lambda$2$lambda$0(NsdServiceInfo $serviceInfo, PublicDeviceInfo it) {
                            Intrinsics.checkNotNullParameter((Object)it, (String)"it");
                            return Intrinsics.areEqual((Object)it.getRawName(), (Object)$serviceInfo.getServiceName());
                        }

                        private static final boolean onServiceUpdated$lambda$2$lambda$1(Function1 $tmp0, Object p0) {
                            return (Boolean)$tmp0.invoke(p0);
                        }

                        private static final boolean onServiceLost$lambda$5$lambda$3(NsdServiceInfo $serviceInfo, PublicDeviceInfo it) {
                            Intrinsics.checkNotNullParameter((Object)it, (String)"it");
                            return Intrinsics.areEqual((Object)it.getRawName(), (Object)$serviceInfo.getServiceName());
                        }

                        private static final boolean onServiceLost$lambda$5$lambda$4(Function1 $tmp0, Object p0) {
                            return (Boolean)$tmp0.invoke(p0);
                        }
                    });
                    break block2;
                }
                NsdManager nsdManager = FcastManager.this.nsdManager;
                if (nsdManager == null) break block2;
                nsdManager.resolveService(serviceInfo, new NsdManager.ResolveListener(this){
                    final /* synthetic */ DefaultDiscoveryListener this$0;
                    {
                        this.this$0 = $receiver;
                    }

                    public void onResolveFailed(NsdServiceInfo serviceInfo, int errorCode) {
                    }

                    /*
                     * WARNING - Removed try catching itself - possible behaviour change.
                     */
                    public void onServiceResolved(NsdServiceInfo serviceInfo) {
                        if (serviceInfo == null) {
                            return;
                        }
                        List list2 = FcastManager.access$get_currentDevices$cp();
                        synchronized (list2) {
                            boolean bl = false;
                            boolean bl2 = FcastManager.access$get_currentDevices$cp().add(new PublicDeviceInfo(serviceInfo));
                        }
                        Log.d((String)this.this$0.getTag(), (String)("Service found: " + serviceInfo.getServiceName() + ", Net: " + serviceInfo.getHost().getHostAddress()));
                    }
                });
            }
        }

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         */
        public void onServiceLost(@Nullable NsdServiceInfo serviceInfo) {
            if (serviceInfo == null) {
                return;
            }
            List list2 = _currentDevices;
            synchronized (list2) {
                boolean bl = false;
                boolean bl2 = CollectionsKt.removeAll((List)_currentDevices, arg_0 -> DefaultDiscoveryListener.onServiceLost$lambda$1$lambda$0(serviceInfo, arg_0));
            }
            Log.d((String)this.tag, (String)("Service lost: " + serviceInfo.getServiceName()));
        }

        private static final boolean onServiceLost$lambda$1$lambda$0(NsdServiceInfo $serviceInfo, PublicDeviceInfo it) {
            Intrinsics.checkNotNullParameter((Object)it, (String)"it");
            return Intrinsics.areEqual((Object)it.getRawName(), (Object)$serviceInfo.getServiceName());
        }
    }
}

