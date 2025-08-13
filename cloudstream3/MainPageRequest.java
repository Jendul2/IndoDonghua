/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0017"}, d2={"Lcom/lagradost/cloudstream3/MainPageRequest;", "", "name", "", "data", "horizontalImages", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getData", "getHorizontalImages", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "library"})
public final class MainPageRequest {
    @NotNull
    private final String name;
    @NotNull
    private final String data;
    private final boolean horizontalImages;

    public MainPageRequest(@NotNull String name, @NotNull String data2, boolean horizontalImages) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        this.name = name;
        this.data = data2;
        this.horizontalImages = horizontalImages;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final boolean getHorizontalImages() {
        return this.horizontalImages;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.data;
    }

    public final boolean component3() {
        return this.horizontalImages;
    }

    @NotNull
    public final MainPageRequest copy(@NotNull String name, @NotNull String data2, boolean horizontalImages) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        return new MainPageRequest(name, data2, horizontalImages);
    }

    public static /* synthetic */ MainPageRequest copy$default(MainPageRequest mainPageRequest, String string2, String string3, boolean bl, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = mainPageRequest.name;
        }
        if ((n & 2) != 0) {
            string3 = mainPageRequest.data;
        }
        if ((n & 4) != 0) {
            bl = mainPageRequest.horizontalImages;
        }
        return mainPageRequest.copy(string2, string3, bl);
    }

    @NotNull
    public String toString() {
        return "MainPageRequest(name=" + this.name + ", data=" + this.data + ", horizontalImages=" + this.horizontalImages + ')';
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.data.hashCode();
        result2 = result2 * 31 + Boolean.hashCode(this.horizontalImages);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MainPageRequest)) {
            return false;
        }
        MainPageRequest mainPageRequest = (MainPageRequest)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)mainPageRequest.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.data, (Object)mainPageRequest.data)) {
            return false;
        }
        return this.horizontalImages == mainPageRequest.horizontalImages;
    }
}

