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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/VolumeUpdateMessage;", "", "generationTime", "", "volume", "", "<init>", "(JD)V", "getGenerationTime", "()J", "getVolume", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_prereleaseDebug"})
public final class VolumeUpdateMessage {
    private final long generationTime;
    private final double volume;

    public VolumeUpdateMessage(long generationTime, double volume) {
        this.generationTime = generationTime;
        this.volume = volume;
    }

    public final long getGenerationTime() {
        return this.generationTime;
    }

    public final double getVolume() {
        return this.volume;
    }

    public final long component1() {
        return this.generationTime;
    }

    public final double component2() {
        return this.volume;
    }

    @NotNull
    public final VolumeUpdateMessage copy(long generationTime, double volume) {
        return new VolumeUpdateMessage(generationTime, volume);
    }

    public static /* synthetic */ VolumeUpdateMessage copy$default(VolumeUpdateMessage volumeUpdateMessage, long l, double d, int n, Object object) {
        if ((n & 1) != 0) {
            l = volumeUpdateMessage.generationTime;
        }
        if ((n & 2) != 0) {
            d = volumeUpdateMessage.volume;
        }
        return volumeUpdateMessage.copy(l, d);
    }

    @NotNull
    public String toString() {
        return "VolumeUpdateMessage(generationTime=" + this.generationTime + ", volume=" + this.volume + ')';
    }

    public int hashCode() {
        int result2 = Long.hashCode(this.generationTime);
        result2 = result2 * 31 + Double.hashCode(this.volume);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VolumeUpdateMessage)) {
            return false;
        }
        VolumeUpdateMessage volumeUpdateMessage = (VolumeUpdateMessage)other;
        if (this.generationTime != volumeUpdateMessage.generationTime) {
            return false;
        }
        return Double.compare(this.volume, volumeUpdateMessage.volume) == 0;
    }
}

