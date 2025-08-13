/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/PlaybackErrorMessage;", "", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_prereleaseDebug"})
public final class PlaybackErrorMessage {
    @NotNull
    private final String message;

    public PlaybackErrorMessage(@NotNull String message) {
        Intrinsics.checkNotNullParameter((Object)message, (String)"message");
        this.message = message;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String component1() {
        return this.message;
    }

    @NotNull
    public final PlaybackErrorMessage copy(@NotNull String message) {
        Intrinsics.checkNotNullParameter((Object)message, (String)"message");
        return new PlaybackErrorMessage(message);
    }

    public static /* synthetic */ PlaybackErrorMessage copy$default(PlaybackErrorMessage playbackErrorMessage, String string2, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = playbackErrorMessage.message;
        }
        return playbackErrorMessage.copy(string2);
    }

    @NotNull
    public String toString() {
        return "PlaybackErrorMessage(message=" + this.message + ')';
    }

    public int hashCode() {
        return this.message.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlaybackErrorMessage)) {
            return false;
        }
        PlaybackErrorMessage playbackErrorMessage = (PlaybackErrorMessage)other;
        return Intrinsics.areEqual((Object)this.message, (Object)playbackErrorMessage.message);
    }
}

