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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\bH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u001fH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f\u00a8\u0006 "}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/PlaybackUpdateMessage;", "", "generationTime", "", "time", "", "duration", "state", "", "speed", "<init>", "(JDDID)V", "getGenerationTime", "()J", "getTime", "()D", "getDuration", "getState", "()I", "getSpeed", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_prereleaseDebug"})
public final class PlaybackUpdateMessage {
    private final long generationTime;
    private final double time;
    private final double duration;
    private final int state;
    private final double speed;

    public PlaybackUpdateMessage(long generationTime, double time, double duration, int state, double speed) {
        this.generationTime = generationTime;
        this.time = time;
        this.duration = duration;
        this.state = state;
        this.speed = speed;
    }

    public final long getGenerationTime() {
        return this.generationTime;
    }

    public final double getTime() {
        return this.time;
    }

    public final double getDuration() {
        return this.duration;
    }

    public final int getState() {
        return this.state;
    }

    public final double getSpeed() {
        return this.speed;
    }

    public final long component1() {
        return this.generationTime;
    }

    public final double component2() {
        return this.time;
    }

    public final double component3() {
        return this.duration;
    }

    public final int component4() {
        return this.state;
    }

    public final double component5() {
        return this.speed;
    }

    @NotNull
    public final PlaybackUpdateMessage copy(long generationTime, double time, double duration, int state, double speed) {
        return new PlaybackUpdateMessage(generationTime, time, duration, state, speed);
    }

    public static /* synthetic */ PlaybackUpdateMessage copy$default(PlaybackUpdateMessage playbackUpdateMessage, long l, double d, double d2, int n, double d3, int n2, Object object) {
        if ((n2 & 1) != 0) {
            l = playbackUpdateMessage.generationTime;
        }
        if ((n2 & 2) != 0) {
            d = playbackUpdateMessage.time;
        }
        if ((n2 & 4) != 0) {
            d2 = playbackUpdateMessage.duration;
        }
        if ((n2 & 8) != 0) {
            n = playbackUpdateMessage.state;
        }
        if ((n2 & 0x10) != 0) {
            d3 = playbackUpdateMessage.speed;
        }
        return playbackUpdateMessage.copy(l, d, d2, n, d3);
    }

    @NotNull
    public String toString() {
        return "PlaybackUpdateMessage(generationTime=" + this.generationTime + ", time=" + this.time + ", duration=" + this.duration + ", state=" + this.state + ", speed=" + this.speed + ')';
    }

    public int hashCode() {
        int result2 = Long.hashCode(this.generationTime);
        result2 = result2 * 31 + Double.hashCode(this.time);
        result2 = result2 * 31 + Double.hashCode(this.duration);
        result2 = result2 * 31 + Integer.hashCode(this.state);
        result2 = result2 * 31 + Double.hashCode(this.speed);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackUpdateMessage)) {
            return false;
        }
        PlaybackUpdateMessage playbackUpdateMessage = (PlaybackUpdateMessage)other;
        if (this.generationTime != playbackUpdateMessage.generationTime) {
            return false;
        }
        if (Double.compare(this.time, playbackUpdateMessage.time) != 0) {
            return false;
        }
        if (Double.compare(this.duration, playbackUpdateMessage.duration) != 0) {
            return false;
        }
        if (this.state != playbackUpdateMessage.state) {
            return false;
        }
        return Double.compare(this.speed, playbackUpdateMessage.speed) == 0;
    }
}

