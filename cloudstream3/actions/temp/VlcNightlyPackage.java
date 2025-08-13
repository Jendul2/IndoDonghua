/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3.actions.temp;

import com.lagradost.cloudstream3.actions.temp.VlcPackage;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UiText;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/VlcNightlyPackage;", "Lcom/lagradost/cloudstream3/actions/temp/VlcPackage;", "<init>", "()V", "packageName", "", "getPackageName", "()Ljava/lang/String;", "appName", "Lcom/lagradost/cloudstream3/utils/UiText;", "getAppName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "app_prereleaseDebug"})
public final class VlcNightlyPackage
extends VlcPackage {
    @NotNull
    private final String packageName;
    @NotNull
    private final UiText appName = TextUtilKt.txt("VLC Nightly");

    public VlcNightlyPackage() {
        this.packageName = "org.videolan.vlc.debug";
    }

    @Override
    @NotNull
    public String getPackageName() {
        return this.packageName;
    }

    @Override
    @NotNull
    public UiText getAppName() {
        return this.appName;
    }
}

