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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2={"Lcom/lagradost/cloudstream3/Actor;", "", "name", "", "image", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getImage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "library"})
public final class Actor {
    @NotNull
    private final String name;
    @Nullable
    private final String image;

    public Actor(@NotNull String name, @Nullable String image) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        this.name = name;
        this.image = image;
    }

    public /* synthetic */ Actor(String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getImage() {
        return this.image;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @Nullable
    public final String component2() {
        return this.image;
    }

    @NotNull
    public final Actor copy(@NotNull String name, @Nullable String image) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        return new Actor(name, image);
    }

    public static /* synthetic */ Actor copy$default(Actor actor, String string2, String string3, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = actor.name;
        }
        if ((n & 2) != 0) {
            string3 = actor.image;
        }
        return actor.copy(string2, string3);
    }

    @NotNull
    public String toString() {
        return "Actor(name=" + this.name + ", image=" + this.image + ')';
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + (this.image == null ? 0 : this.image.hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Actor)) {
            return false;
        }
        Actor actor = (Actor)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)actor.name)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.image, (Object)actor.image);
    }
}

