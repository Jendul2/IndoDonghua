/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0003\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0011"}, d2={"Lcom/lagradost/cloudstream3/SettingsJson;", "", "enableAdult", "", "<init>", "(Z)V", "getEnableAdult", "()Z", "setEnableAdult", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "library"})
public final class SettingsJson {
    private boolean enableAdult;

    public SettingsJson(@JsonProperty(value="enableAdult") boolean enableAdult) {
        this.enableAdult = enableAdult;
    }

    public /* synthetic */ SettingsJson(boolean bl, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            bl = false;
        }
        this(bl);
    }

    public final boolean getEnableAdult() {
        return this.enableAdult;
    }

    public final void setEnableAdult(boolean bl) {
        this.enableAdult = bl;
    }

    public final boolean component1() {
        return this.enableAdult;
    }

    @NotNull
    public final SettingsJson copy(@JsonProperty(value="enableAdult") boolean enableAdult) {
        return new SettingsJson(enableAdult);
    }

    public static /* synthetic */ SettingsJson copy$default(SettingsJson settingsJson, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            bl = settingsJson.enableAdult;
        }
        return settingsJson.copy(bl);
    }

    @NotNull
    public String toString() {
        return "SettingsJson(enableAdult=" + this.enableAdult + ')';
    }

    public int hashCode() {
        return Boolean.hashCode(this.enableAdult);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SettingsJson)) {
            return false;
        }
        SettingsJson settingsJson = (SettingsJson)other;
        return this.enableAdult == settingsJson.enableAdult;
    }

    public SettingsJson() {
        this(false, 1, null);
    }
}

