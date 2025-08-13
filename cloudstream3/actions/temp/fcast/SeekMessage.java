/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0011"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/SeekMessage;", "", "time", "", "<init>", "(D)V", "getTime", "()D", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prereleaseDebug"})
public final class SeekMessage {
    private final double time;

    public SeekMessage(double time) {
        this.time = time;
    }

    public final double getTime() {
        return this.time;
    }

    public final double component1() {
        return this.time;
    }

    @NotNull
    public final SeekMessage copy(double time) {
        return new SeekMessage(time);
    }

    public static /* synthetic */ SeekMessage copy$default(SeekMessage seekMessage, double d, int n, Object object) {
        if ((n & 1) != 0) {
            d = seekMessage.time;
        }
        return seekMessage.copy(d);
    }

    @NotNull
    public String toString() {
        return "SeekMessage(time=" + this.time + ')';
    }

    public int hashCode() {
        return Double.hashCode(this.time);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeekMessage)) {
            return false;
        }
        SeekMessage seekMessage = (SeekMessage)other;
        return Double.compare(this.time, seekMessage.time) == 0;
    }
}

