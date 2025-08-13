/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0007H\u00c6\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001e\u001a\u00020\u0007H\u00d6\u0001J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2={"Lcom/lagradost/cloudstream3/ProvidersInfoJson;", "", "name", "", "url", "credentials", "status", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getUrl", "setUrl", "getCredentials", "setCredentials", "getStatus", "()I", "setStatus", "(I)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "library"})
public final class ProvidersInfoJson {
    @NotNull
    private String name;
    @NotNull
    private String url;
    @Nullable
    private String credentials;
    private int status;

    public ProvidersInfoJson(@JsonProperty(value="name") @NotNull String name, @JsonProperty(value="url") @NotNull String url, @JsonProperty(value="credentials") @Nullable String credentials, @JsonProperty(value="status") int status) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        this.name = name;
        this.url = url;
        this.credentials = credentials;
        this.status = status;
    }

    public /* synthetic */ ProvidersInfoJson(String string2, String string3, String string4, int n, int n2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n2 & 4) != 0) {
            string4 = null;
        }
        this(string2, string3, string4, n);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.name = string2;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.url = string2;
    }

    @Nullable
    public final String getCredentials() {
        return this.credentials;
    }

    public final void setCredentials(@Nullable String string2) {
        this.credentials = string2;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int n) {
        this.status = n;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @Nullable
    public final String component3() {
        return this.credentials;
    }

    public final int component4() {
        return this.status;
    }

    @NotNull
    public final ProvidersInfoJson copy(@JsonProperty(value="name") @NotNull String name, @JsonProperty(value="url") @NotNull String url, @JsonProperty(value="credentials") @Nullable String credentials, @JsonProperty(value="status") int status) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        return new ProvidersInfoJson(name, url, credentials, status);
    }

    public static /* synthetic */ ProvidersInfoJson copy$default(ProvidersInfoJson providersInfoJson, String string2, String string3, String string4, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string2 = providersInfoJson.name;
        }
        if ((n2 & 2) != 0) {
            string3 = providersInfoJson.url;
        }
        if ((n2 & 4) != 0) {
            string4 = providersInfoJson.credentials;
        }
        if ((n2 & 8) != 0) {
            n = providersInfoJson.status;
        }
        return providersInfoJson.copy(string2, string3, string4, n);
    }

    @NotNull
    public String toString() {
        return "ProvidersInfoJson(name=" + this.name + ", url=" + this.url + ", credentials=" + this.credentials + ", status=" + this.status + ')';
    }

    public int hashCode() {
        int result2 = this.name.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        result2 = result2 * 31 + (this.credentials == null ? 0 : this.credentials.hashCode());
        result2 = result2 * 31 + Integer.hashCode(this.status);
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProvidersInfoJson)) {
            return false;
        }
        ProvidersInfoJson providersInfoJson = (ProvidersInfoJson)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)providersInfoJson.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.url, (Object)providersInfoJson.url)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.credentials, (Object)providersInfoJson.credentials)) {
            return false;
        }
        return this.status == providersInfoJson.status;
    }
}

