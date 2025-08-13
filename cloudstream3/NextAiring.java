/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0007\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000fJ.\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001c"}, d2={"Lcom/lagradost/cloudstream3/NextAiring;", "", "episode", "", "unixTime", "", "season", "<init>", "(IJLjava/lang/Integer;)V", "(IJ)V", "getEpisode", "()I", "getUnixTime", "()J", "getSeason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(IJLjava/lang/Integer;)Lcom/lagradost/cloudstream3/NextAiring;", "equals", "", "other", "hashCode", "toString", "", "library"})
public final class NextAiring {
    private final int episode;
    private final long unixTime;
    @Nullable
    private final Integer season;

    public NextAiring(int episode, long unixTime, @Nullable Integer season) {
        this.episode = episode;
        this.unixTime = unixTime;
        this.season = season;
    }

    public /* synthetic */ NextAiring(int n, long l, Integer n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 4) != 0) {
            n2 = null;
        }
        this(n, l, n2);
    }

    public final int getEpisode() {
        return this.episode;
    }

    public final long getUnixTime() {
        return this.unixTime;
    }

    @Nullable
    public final Integer getSeason() {
        return this.season;
    }

    public NextAiring(int episode, long unixTime) {
        this(episode, unixTime, null);
    }

    public final int component1() {
        return this.episode;
    }

    public final long component2() {
        return this.unixTime;
    }

    @Nullable
    public final Integer component3() {
        return this.season;
    }

    @NotNull
    public final NextAiring copy(int episode, long unixTime, @Nullable Integer season) {
        return new NextAiring(episode, unixTime, season);
    }

    public static /* synthetic */ NextAiring copy$default(NextAiring nextAiring, int n, long l, Integer n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = nextAiring.episode;
        }
        if ((n3 & 2) != 0) {
            l = nextAiring.unixTime;
        }
        if ((n3 & 4) != 0) {
            n2 = nextAiring.season;
        }
        return nextAiring.copy(n, l, n2);
    }

    @NotNull
    public String toString() {
        return "NextAiring(episode=" + this.episode + ", unixTime=" + this.unixTime + ", season=" + this.season + ')';
    }

    public int hashCode() {
        int result2 = Integer.hashCode(this.episode);
        result2 = result2 * 31 + Long.hashCode(this.unixTime);
        result2 = result2 * 31 + (this.season == null ? 0 : ((Object)this.season).hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NextAiring)) {
            return false;
        }
        NextAiring nextAiring = (NextAiring)other;
        if (this.episode != nextAiring.episode) {
            return false;
        }
        if (this.unixTime != nextAiring.unixTime) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.season, (Object)nextAiring.season);
    }
}

