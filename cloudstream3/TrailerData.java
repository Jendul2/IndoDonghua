/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0006H\u00c6\u0003J\u0015\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0003J?\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bH\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001c"}, d2={"Lcom/lagradost/cloudstream3/TrailerData;", "", "extractorUrl", "", "referer", "raw", "", "headers", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLjava/util/Map;)V", "getExtractorUrl", "()Ljava/lang/String;", "getReferer", "getRaw", "()Z", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "library"})
public final class TrailerData {
    @NotNull
    private final String extractorUrl;
    @Nullable
    private final String referer;
    private final boolean raw;
    @NotNull
    private final Map<String, String> headers;

    public TrailerData(@NotNull String extractorUrl, @Nullable String referer, boolean raw, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)extractorUrl, (String)"extractorUrl");
        Intrinsics.checkNotNullParameter(headers, (String)"headers");
        this.extractorUrl = extractorUrl;
        this.referer = referer;
        this.raw = raw;
        this.headers = headers;
    }

    public /* synthetic */ TrailerData(String string2, String string3, boolean bl, Map map, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 8) != 0) {
            map = MapsKt.emptyMap();
        }
        this(string2, string3, bl, map);
    }

    @NotNull
    public final String getExtractorUrl() {
        return this.extractorUrl;
    }

    @Nullable
    public final String getReferer() {
        return this.referer;
    }

    public final boolean getRaw() {
        return this.raw;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String component1() {
        return this.extractorUrl;
    }

    @Nullable
    public final String component2() {
        return this.referer;
    }

    public final boolean component3() {
        return this.raw;
    }

    @NotNull
    public final Map<String, String> component4() {
        return this.headers;
    }

    @NotNull
    public final TrailerData copy(@NotNull String extractorUrl, @Nullable String referer, boolean raw, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter((Object)extractorUrl, (String)"extractorUrl");
        Intrinsics.checkNotNullParameter(headers, (String)"headers");
        return new TrailerData(extractorUrl, referer, raw, headers);
    }

    public static /* synthetic */ TrailerData copy$default(TrailerData trailerData, String string2, String string3, boolean bl, Map map, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = trailerData.extractorUrl;
        }
        if ((n & 2) != 0) {
            string3 = trailerData.referer;
        }
        if ((n & 4) != 0) {
            bl = trailerData.raw;
        }
        if ((n & 8) != 0) {
            map = trailerData.headers;
        }
        return trailerData.copy(string2, string3, bl, map);
    }

    @NotNull
    public String toString() {
        return "TrailerData(extractorUrl=" + this.extractorUrl + ", referer=" + this.referer + ", raw=" + this.raw + ", headers=" + this.headers + ')';
    }

    public int hashCode() {
        int result2 = this.extractorUrl.hashCode();
        result2 = result2 * 31 + (this.referer == null ? 0 : this.referer.hashCode());
        result2 = result2 * 31 + Boolean.hashCode(this.raw);
        result2 = result2 * 31 + ((Object)this.headers).hashCode();
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrailerData)) {
            return false;
        }
        TrailerData trailerData = (TrailerData)other;
        if (!Intrinsics.areEqual((Object)this.extractorUrl, (Object)trailerData.extractorUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.referer, (Object)trailerData.referer)) {
            return false;
        }
        if (this.raw != trailerData.raw) {
            return false;
        }
        return Intrinsics.areEqual(this.headers, trailerData.headers);
    }
}

