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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0013"}, d2={"Lcom/lagradost/cloudstream3/SubtitleFile;", "", "lang", "", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLang", "()Ljava/lang/String;", "getUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "library"})
public final class SubtitleFile {
    @NotNull
    private final String lang;
    @NotNull
    private final String url;

    public SubtitleFile(@NotNull String lang, @NotNull String url) {
        Intrinsics.checkNotNullParameter((Object)lang, (String)"lang");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        this.lang = lang;
        this.url = url;
    }

    @NotNull
    public final String getLang() {
        return this.lang;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final String component1() {
        return this.lang;
    }

    @NotNull
    public final String component2() {
        return this.url;
    }

    @NotNull
    public final SubtitleFile copy(@NotNull String lang, @NotNull String url) {
        Intrinsics.checkNotNullParameter((Object)lang, (String)"lang");
        Intrinsics.checkNotNullParameter((Object)url, (String)"url");
        return new SubtitleFile(lang, url);
    }

    public static /* synthetic */ SubtitleFile copy$default(SubtitleFile subtitleFile, String string2, String string3, int n, Object object) {
        if ((n & 1) != 0) {
            string2 = subtitleFile.lang;
        }
        if ((n & 2) != 0) {
            string3 = subtitleFile.url;
        }
        return subtitleFile.copy(string2, string3);
    }

    @NotNull
    public String toString() {
        return "SubtitleFile(lang=" + this.lang + ", url=" + this.url + ')';
    }

    public int hashCode() {
        int result2 = this.lang.hashCode();
        result2 = result2 * 31 + this.url.hashCode();
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubtitleFile)) {
            return false;
        }
        SubtitleFile subtitleFile = (SubtitleFile)other;
        if (!Intrinsics.areEqual((Object)this.lang, (Object)subtitleFile.lang)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.url, (Object)subtitleFile.url);
    }
}

