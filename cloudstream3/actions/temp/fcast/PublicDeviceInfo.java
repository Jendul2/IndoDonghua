/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.nsd.NsdServiceInfo
 *  android.os.Build$VERSION
 *  android.os.ext.SdkExtensions
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import android.os.ext.SdkExtensions;
import java.net.InetAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\f\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t\u00a8\u0006\u000e"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/PublicDeviceInfo;", "", "serviceInfo", "Landroid/net/nsd/NsdServiceInfo;", "<init>", "(Landroid/net/nsd/NsdServiceInfo;)V", "rawName", "", "getRawName", "()Ljava/lang/String;", "host", "getHost", "name", "getName", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nFcastManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FcastManager.kt\ncom/lagradost/cloudstream3/actions/temp/fcast/PublicDeviceInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,179:1\n1#2:180\n*E\n"})
public final class PublicDeviceInfo {
    @NotNull
    private final String rawName;
    @Nullable
    private final String host;
    @NotNull
    private final String name;

    /*
     * WARNING - void declaration
     */
    public PublicDeviceInfo(@NotNull NsdServiceInfo serviceInfo) {
        String string2;
        String string3;
        Intrinsics.checkNotNullParameter((Object)serviceInfo, (String)"serviceInfo");
        String string4 = serviceInfo.getServiceName();
        Intrinsics.checkNotNullExpressionValue((Object)string4, (String)"getServiceName(...)");
        this.rawName = string4;
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion((int)33) >= 7) {
            List list2 = serviceInfo.getHostAddresses();
            Intrinsics.checkNotNullExpressionValue((Object)list2, (String)"getHostAddresses(...)");
            InetAddress inetAddress = (InetAddress)CollectionsKt.firstOrNull((List)list2);
            string3 = inetAddress != null ? inetAddress.getHostAddress() : null;
        } else {
            string3 = serviceInfo.getHost().getHostAddress();
        }
        this.host = string3;
        PublicDeviceInfo publicDeviceInfo = this;
        StringBuilder stringBuilder = new StringBuilder().append(StringsKt.replace$default((String)this.rawName, (String)"-", (String)" ", (boolean)false, (int)4, null));
        String string5 = this.host;
        if (string5 != null) {
            void it\1;
            String string6 = string5;
            StringBuilder stringBuilder2 = stringBuilder;
            PublicDeviceInfo publicDeviceInfo2 = publicDeviceInfo;
            boolean bl = false;
            String string7 = ' ' + (String)it\1;
            publicDeviceInfo = publicDeviceInfo2;
            stringBuilder = stringBuilder2;
            string2 = string7;
        } else {
            string2 = null;
        }
        publicDeviceInfo.name = stringBuilder.append(string2).toString();
    }

    @NotNull
    public final String getRawName() {
        return this.rawName;
    }

    @Nullable
    public final String getHost() {
        return this.host;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}

