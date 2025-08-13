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

import com.lagradost.cloudstream3.Actor;
import com.lagradost.cloudstream3.ActorRole;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f\u00a8\u0006\u001d"}, d2={"Lcom/lagradost/cloudstream3/ActorData;", "", "actor", "Lcom/lagradost/cloudstream3/Actor;", "role", "Lcom/lagradost/cloudstream3/ActorRole;", "roleString", "", "voiceActor", "<init>", "(Lcom/lagradost/cloudstream3/Actor;Lcom/lagradost/cloudstream3/ActorRole;Ljava/lang/String;Lcom/lagradost/cloudstream3/Actor;)V", "getActor", "()Lcom/lagradost/cloudstream3/Actor;", "getRole", "()Lcom/lagradost/cloudstream3/ActorRole;", "getRoleString", "()Ljava/lang/String;", "getVoiceActor", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "library"})
public final class ActorData {
    @NotNull
    private final Actor actor;
    @Nullable
    private final ActorRole role;
    @Nullable
    private final String roleString;
    @Nullable
    private final Actor voiceActor;

    public ActorData(@NotNull Actor actor, @Nullable ActorRole role, @Nullable String roleString, @Nullable Actor voiceActor) {
        Intrinsics.checkNotNullParameter((Object)actor, (String)"actor");
        this.actor = actor;
        this.role = role;
        this.roleString = roleString;
        this.voiceActor = voiceActor;
    }

    public /* synthetic */ ActorData(Actor actor, ActorRole actorRole, String string2, Actor actor2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            actorRole = null;
        }
        if ((n & 4) != 0) {
            string2 = null;
        }
        if ((n & 8) != 0) {
            actor2 = null;
        }
        this(actor, actorRole, string2, actor2);
    }

    @NotNull
    public final Actor getActor() {
        return this.actor;
    }

    @Nullable
    public final ActorRole getRole() {
        return this.role;
    }

    @Nullable
    public final String getRoleString() {
        return this.roleString;
    }

    @Nullable
    public final Actor getVoiceActor() {
        return this.voiceActor;
    }

    @NotNull
    public final Actor component1() {
        return this.actor;
    }

    @Nullable
    public final ActorRole component2() {
        return this.role;
    }

    @Nullable
    public final String component3() {
        return this.roleString;
    }

    @Nullable
    public final Actor component4() {
        return this.voiceActor;
    }

    @NotNull
    public final ActorData copy(@NotNull Actor actor, @Nullable ActorRole role, @Nullable String roleString, @Nullable Actor voiceActor) {
        Intrinsics.checkNotNullParameter((Object)actor, (String)"actor");
        return new ActorData(actor, role, roleString, voiceActor);
    }

    public static /* synthetic */ ActorData copy$default(ActorData actorData, Actor actor, ActorRole actorRole, String string2, Actor actor2, int n, Object object) {
        if ((n & 1) != 0) {
            actor = actorData.actor;
        }
        if ((n & 2) != 0) {
            actorRole = actorData.role;
        }
        if ((n & 4) != 0) {
            string2 = actorData.roleString;
        }
        if ((n & 8) != 0) {
            actor2 = actorData.voiceActor;
        }
        return actorData.copy(actor, actorRole, string2, actor2);
    }

    @NotNull
    public String toString() {
        return "ActorData(actor=" + this.actor + ", role=" + (Object)((Object)this.role) + ", roleString=" + this.roleString + ", voiceActor=" + this.voiceActor + ')';
    }

    public int hashCode() {
        int result2 = this.actor.hashCode();
        result2 = result2 * 31 + (this.role == null ? 0 : this.role.hashCode());
        result2 = result2 * 31 + (this.roleString == null ? 0 : this.roleString.hashCode());
        result2 = result2 * 31 + (this.voiceActor == null ? 0 : this.voiceActor.hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActorData)) {
            return false;
        }
        ActorData actorData = (ActorData)other;
        if (!Intrinsics.areEqual((Object)this.actor, (Object)actorData.actor)) {
            return false;
        }
        if (this.role != actorData.role) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.roleString, (Object)actorData.roleString)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.voiceActor, (Object)actorData.voiceActor);
    }
}

