/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.acra.data.CrashReportData
 *  org.acra.sender.ReportSender
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.acra.data.CrashReportData;
import org.acra.sender.ReportSender;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2={"Lcom/lagradost/cloudstream3/CustomReportSender;", "Lorg/acra/sender/ReportSender;", "<init>", "()V", "send", "", "context", "Landroid/content/Context;", "errorContent", "Lorg/acra/data/CrashReportData;", "app_prereleaseDebug"})
public final class CustomReportSender
implements ReportSender {
    public void send(@NotNull Context context, @NotNull CrashReportData errorContent) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)errorContent, (String)"errorContent");
    }
}

