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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000eJ0\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001a"}, d2={"Lcom/lagradost/cloudstream3/SeasonData;", "", "season", "", "name", "", "displaySeason", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "getSeason", "()I", "getName", "()Ljava/lang/String;", "getDisplaySeason", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(ILjava/lang/String;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/SeasonData;", "equals", "", "other", "hashCode", "toString", "library"})
public final class SeasonData {
    private final int season;
    @Nullable
    private final String name;
    @Nullable
    private final Integer displaySeason;

    public SeasonData(int season, @Nullable String name, @Nullable Integer displaySeason) {
        this.season = season;
        this.name = name;
        this.displaySeason = displaySeason;
    }

    public /* synthetic */ SeasonData(int n, String string2, Integer n2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 & 2) != 0) {
            string2 = null;
        }
        if ((n3 & 4) != 0) {
            n2 = null;
        }
        this(n, string2, n2);
    }

    public final int getSeason() {
        return this.season;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getDisplaySeason() {
        return this.displaySeason;
    }

    public final int component1() {
        return this.season;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Integer component3() {
        return this.displaySeason;
    }

    @NotNull
    public final SeasonData copy(int season, @Nullable String name, @Nullable Integer displaySeason) {
        return new SeasonData(season, name, displaySeason);
    }

    public static /* synthetic */ SeasonData copy$default(SeasonData seasonData, int n, String string2, Integer n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = seasonData.season;
        }
        if ((n3 & 2) != 0) {
            string2 = seasonData.name;
        }
        if ((n3 & 4) != 0) {
            n2 = seasonData.displaySeason;
        }
        return seasonData.copy(n, string2, n2);
    }

    @NotNull
    public String toString() {
        return "SeasonData(season=" + this.season + ", name=" + this.name + ", displaySeason=" + this.displaySeason + ')';
    }

    public int hashCode() {
        int result2 = Integer.hashCode(this.season);
        result2 = result2 * 31 + (this.name == null ? 0 : this.name.hashCode());
        result2 = result2 * 31 + (this.displaySeason == null ? 0 : ((Object)this.displaySeason).hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SeasonData)) {
            return false;
        }
        SeasonData seasonData = (SeasonData)other;
        if (this.season != seasonData.season) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.name, (Object)seasonData.name)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.displaySeason, (Object)seasonData.displaySeason);
    }
}

