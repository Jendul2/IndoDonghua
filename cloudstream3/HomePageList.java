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

import com.lagradost.cloudstream3.SearchResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J-\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011\u00a8\u0006\u001b"}, d2={"Lcom/lagradost/cloudstream3/HomePageList;", "", "name", "", "list", "", "Lcom/lagradost/cloudstream3/SearchResponse;", "isHorizontalImages", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getName", "()Ljava/lang/String;", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "library"})
public final class HomePageList {
    @NotNull
    private final String name;
    @NotNull
    private List<? extends SearchResponse> list;
    private final boolean isHorizontalImages;

    public HomePageList(@NotNull String name, @NotNull List<? extends SearchResponse> list2, boolean isHorizontalImages) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter(list2, (String)"list");
        this.name = name;
        this.list = list2;
        this.isHorizontalImages = isHorizontalImages;
    }

    public /* synthetic */ HomePageList(String string2, List list2, boolean bl, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 4) != 0) {
            bl = false;
        }
        this(string2, list2, bl);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final List<SearchResponse> getList() {
        return this.list;
    }

    public final void setList(@NotNull List<? extends SearchResponse> list2) {
        Intrinsics.checkNotNullParameter(list2, (String)"<set-?>");
        this.list = list2;
    }

    public final boolean isHorizontalImages() {
        return this.isHorizontalImages;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final List<SearchResponse> component2() {
        return this.list;
    }

    public final boolean component3() {
        return this.isHorizontalImages;
    }

    @NotNull
    public final HomePageList copy(@NotNull String name, @NotNull List<? extends SearchResponse> list2, boolean isHorizontalImages) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter(list2, (String)"list");
        return new HomePageList(name, list2, isHorizontalImages);
    }

    public static /* synthetic */ HomePageList copy$default(HomePageList homePageList, String string2, List list2, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = homePageList.name;
        }
        if ((n & 2) != 0) {
            list2 = homePageList.list;
        }
        if ((n & 4) != 0) {
            bl = homePageList.isHorizontalImages;
        }
        return homePageList.copy(string2, list2, bl);
    }

    @NotNull
    public String toString() {
        return "HomePageList(name=" + this.name + ", list=" + this.list + ", isHorizontalImages=" + this.isHorizontalImages + ')';
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + ((Object)this.list).hashCode();
        result2 = result2 * 31 + Boolean.hashCode(this.isHorizontalImages);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomePageList)) {
            return false;
        }
        HomePageList homePageList = (HomePageList)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)homePageList.name)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.list, homePageList.list)) {
            return false;
        }
        return this.isHorizontalImages == homePageList.isHorizontalImages;
    }
}

