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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001c"}, d2={"Lcom/lagradost/cloudstream3/Tracker;", "", "malId", "", "aniId", "", "image", "cover", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMalId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAniId", "()Ljava/lang/String;", "getImage", "getCover", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/lagradost/cloudstream3/Tracker;", "equals", "", "other", "hashCode", "toString", "library"})
public final class Tracker {
    @Nullable
    private final Integer malId;
    @Nullable
    private final String aniId;
    @Nullable
    private final String image;
    @Nullable
    private final String cover;

    public Tracker(@Nullable Integer malId, @Nullable String aniId, @Nullable String image, @Nullable String cover) {
        this.malId = malId;
        this.aniId = aniId;
        this.image = image;
        this.cover = cover;
    }

    public /* synthetic */ Tracker(Integer n, String string2, String string3, String string4, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 1) != 0) {
            n = null;
        }
        if ((n2 & 2) != 0) {
            string2 = null;
        }
        if ((n2 & 4) != 0) {
            string3 = null;
        }
        if ((n2 & 8) != 0) {
            string4 = null;
        }
        this(n, string2, string3, string4);
    }

    @Nullable
    public final Integer getMalId() {
        return this.malId;
    }

    @Nullable
    public final String getAniId() {
        return this.aniId;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @Nullable
    public final String getCover() {
        return this.cover;
    }

    @Nullable
    public final Integer component1() {
        return this.malId;
    }

    @Nullable
    public final String component2() {
        return this.aniId;
    }

    @Nullable
    public final String component3() {
        return this.image;
    }

    @Nullable
    public final String component4() {
        return this.cover;
    }

    @NotNull
    public final Tracker copy(@Nullable Integer malId, @Nullable String aniId, @Nullable String image, @Nullable String cover) {
        return new Tracker(malId, aniId, image, cover);
    }

    public static /* synthetic */ Tracker copy$default(Tracker tracker, Integer n, String string2, String string3, String string4, int n2, Object object) {
        if ((n2 & 1) != 0) {
            n = tracker.malId;
        }
        if ((n2 & 2) != 0) {
            string2 = tracker.aniId;
        }
        if ((n2 & 4) != 0) {
            string3 = tracker.image;
        }
        if ((n2 & 8) != 0) {
            string4 = tracker.cover;
        }
        return tracker.copy(n, string2, string3, string4);
    }

    @NotNull
    public String toString() {
        return "Tracker(malId=" + this.malId + ", aniId=" + this.aniId + ", image=" + this.image + ", cover=" + this.cover + ')';
    }

    public int hashCode() {
        int result2 = this.malId == null ? 0 : ((Object)this.malId).hashCode();
        result2 = result2 * 31 + (this.aniId == null ? 0 : this.aniId.hashCode());
        result2 = result2 * 31 + (this.image == null ? 0 : this.image.hashCode());
        result2 = result2 * 31 + (this.cover == null ? 0 : this.cover.hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Tracker)) {
            return false;
        }
        Tracker tracker = (Tracker)other;
        if (!Intrinsics.areEqual((Object)this.malId, (Object)tracker.malId)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.aniId, (Object)tracker.aniId)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.image, (Object)tracker.image)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.cover, (Object)tracker.cover);
    }

    public Tracker() {
        this(null, null, null, null, 15, null);
    }
}

