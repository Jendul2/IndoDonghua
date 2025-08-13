/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.acra.config.CoreConfiguration
 *  org.acra.sender.ReportSender
 *  org.acra.sender.ReportSenderFactory
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import android.content.Context;
import com.lagradost.cloudstream3.CustomReportSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.acra.config.CoreConfiguration;
import org.acra.sender.ReportSender;
import org.acra.sender.ReportSenderFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\f"}, d2={"Lcom/lagradost/cloudstream3/CustomSenderFactory;", "Lorg/acra/sender/ReportSenderFactory;", "<init>", "()V", "create", "Lorg/acra/sender/ReportSender;", "context", "Landroid/content/Context;", "config", "Lorg/acra/config/CoreConfiguration;", "enabled", "", "app_prereleaseDebug"})
public final class CustomSenderFactory
implements ReportSenderFactory {
    @NotNull
    public ReportSender create(@NotNull Context context, @NotNull CoreConfiguration config) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)config, (String)"config");
        return new CustomReportSender();
    }

    public boolean enabled(@NotNull CoreConfiguration config) {
        Intrinsics.checkNotNullParameter((Object)config, (String)"config");
        return true;
    }
}

