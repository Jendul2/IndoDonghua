/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.HomePageList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0016"}, d2={"Lcom/lagradost/cloudstream3/HomePageResponse;", "", "items", "", "Lcom/lagradost/cloudstream3/HomePageList;", "hasNext", "", "<init>", "(Ljava/util/List;Z)V", "getItems", "()Ljava/util/List;", "getHasNext", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "library"})
public final class HomePageResponse {
    @NotNull
    private final List<HomePageList> items;
    private final boolean hasNext;

    @Deprecated(message="Use newHomePageResponse method", level=DeprecationLevel.WARNING)
    public HomePageResponse(@NotNull List<HomePageList> items, boolean hasNext) {
        Intrinsics.checkNotNullParameter(items, (String)"items");
        this.items = items;
        this.hasNext = hasNext;
    }

    public /* synthetic */ HomePageResponse(List list2, boolean bl, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            bl = false;
        }
        this(list2, bl);
    }

    @NotNull
    public final List<HomePageList> getItems() {
        return this.items;
    }

    public final boolean getHasNext() {
        return this.hasNext;
    }

    @NotNull
    public final List<HomePageList> component1() {
        return this.items;
    }

    public final boolean component2() {
        return this.hasNext;
    }

    @NotNull
    public final HomePageResponse copy(@NotNull List<HomePageList> items, boolean hasNext) {
        Intrinsics.checkNotNullParameter(items, (String)"items");
        return new HomePageResponse(items, hasNext);
    }

    public static /* synthetic */ HomePageResponse copy$default(HomePageResponse homePageResponse, List list2, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            list2 = homePageResponse.items;
        }
        if ((n & 2) != 0) {
            bl = homePageResponse.hasNext;
        }
        return homePageResponse.copy(list2, bl);
    }

    @NotNull
    public String toString() {
        return "HomePageResponse(items=" + this.items + ", hasNext=" + this.hasNext + ')';
    }

    public int hashCode() {
        int result2 = ((Object)this.items).hashCode();
        result2 = result2 * 31 + Boolean.hashCode(this.hasNext);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageResponse)) {
            return false;
        }
        HomePageResponse homePageResponse = (HomePageResponse)other;
        if (!Intrinsics.areEqual(this.items, homePageResponse.items)) {
            return false;
        }
        return this.hasNext == homePageResponse.hasNext;
    }
}

