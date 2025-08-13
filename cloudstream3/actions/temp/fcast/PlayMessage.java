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
package com.lagradost.cloudstream3.actions.temp.fcast;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0012J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0003J`\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020#H\u00d6\u0001J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u00a8\u0006%"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/PlayMessage;", "", "container", "", "url", "content", "time", "", "speed", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;)V", "getContainer", "()Ljava/lang/String;", "getUrl", "getContent", "getTime", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getSpeed", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;)Lcom/lagradost/cloudstream3/actions/temp/fcast/PlayMessage;", "equals", "", "other", "hashCode", "", "toString", "app_prereleaseDebug"})
public final class PlayMessage {
    @NotNull
    private final String container;
    @Nullable
    private final String url;
    @Nullable
    private final String content;
    @Nullable
    private final Double time;
    @Nullable
    private final Double speed;
    @Nullable
    private final Map<String, String> headers;

    public PlayMessage(@NotNull String container, @Nullable String url, @Nullable String content, @Nullable Double time, @Nullable Double speed, @Nullable Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)container, (String)"container");
        this.container = container;
        this.url = url;
        this.content = content;
        this.time = time;
        this.speed = speed;
        this.headers = headers;
    }

    public /* synthetic */ PlayMessage(String string2, String string3, String string4, Double d, Double d2, Map map, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 2) != 0) {
            string3 = null;
        }
        if ((n & 4) != 0) {
            string4 = null;
        }
        if ((n & 8) != 0) {
            d = null;
        }
        if ((n & 0x10) != 0) {
            d2 = null;
        }
        if ((n & 0x20) != 0) {
            map = null;
        }
        this(string2, string3, string4, d, d2, map);
    }

    @NotNull
    public final String getContainer() {
        return this.container;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    public final String getContent() {
        return this.content;
    }

    @Nullable
    public final Double getTime() {
        return this.time;
    }

    @Nullable
    public final Double getSpeed() {
        return this.speed;
    }

    @Nullable
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String component1() {
        return this.container;
    }

    @Nullable
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.content;
    }

    @Nullable
    public final Double component4() {
        return this.time;
    }

    @Nullable
    public final Double component5() {
        return this.speed;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.headers;
    }

    @NotNull
    public final PlayMessage copy(@NotNull String container, @Nullable String url, @Nullable String content, @Nullable Double time, @Nullable Double speed, @Nullable Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)container, (String)"container");
        return new PlayMessage(container, url, content, time, speed, headers);
    }

    public static /* synthetic */ PlayMessage copy$default(PlayMessage playMessage, String string2, String string3, String string4, Double d, Double d2, Map map, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = playMessage.container;
        }
        if ((n & 2) != 0) {
            string3 = playMessage.url;
        }
        if ((n & 4) != 0) {
            string4 = playMessage.content;
        }
        if ((n & 8) != 0) {
            d = playMessage.time;
        }
        if ((n & 0x10) != 0) {
            d2 = playMessage.speed;
        }
        if ((n & 0x20) != 0) {
            map = playMessage.headers;
        }
        return playMessage.copy(string2, string3, string4, d, d2, map);
    }

    @NotNull
    public String toString() {
        return "PlayMessage(container=" + this.container + ", url=" + this.url + ", content=" + this.content + ", time=" + this.time + ", speed=" + this.speed + ", headers=" + this.headers + ')';
    }

    public int hashCode() {
        int result2 = this.container.hashCode();
        result2 = result2 * 31 + (this.url == null ? 0 : this.url.hashCode());
        result2 = result2 * 31 + (this.content == null ? 0 : this.content.hashCode());
        result2 = result2 * 31 + (this.time == null ? 0 : ((Object)this.time).hashCode());
        result2 = result2 * 31 + (this.speed == null ? 0 : ((Object)this.speed).hashCode());
        result2 = result2 * 31 + (this.headers == null ? 0 : ((Object)this.headers).hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayMessage)) {
            return false;
        }
        PlayMessage playMessage = (PlayMessage)other;
        if (!Intrinsics.areEqual((Object)this.container, (Object)playMessage.container)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)playMessage.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.content, (Object)playMessage.content)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.time, (Object)playMessage.time)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.speed, (Object)playMessage.speed)) {
            return false;
        }
        return Intrinsics.areEqual(this.headers, playMessage.headers);
    }
}

