/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f\u00a8\u0006\r"}, d2={"Lcom/lagradost/cloudstream3/SimklSyncServices;", "", "originalName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getOriginalName", "()Ljava/lang/String;", "Simkl", "Imdb", "Tmdb", "AniList", "Mal", "library"})
public final class SimklSyncServices
extends Enum<SimklSyncServices> {
    @NotNull
    private final String originalName;
    public static final /* enum */ SimklSyncServices Simkl = new SimklSyncServices("simkl");
    public static final /* enum */ SimklSyncServices Imdb = new SimklSyncServices("imdb");
    public static final /* enum */ SimklSyncServices Tmdb = new SimklSyncServices("tmdb");
    public static final /* enum */ SimklSyncServices AniList = new SimklSyncServices("anilist");
    public static final /* enum */ SimklSyncServices Mal = new SimklSyncServices("mal");
    private static final /* synthetic */ SimklSyncServices[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private SimklSyncServices(String originalName) {
        this.originalName = originalName;
    }

    @NotNull
    public final String getOriginalName() {
        return this.originalName;
    }

    public static SimklSyncServices[] values() {
        return (SimklSyncServices[])$VALUES.clone();
    }

    public static SimklSyncServices valueOf(String value) {
        return Enum.valueOf(SimklSyncServices.class, value);
    }

    @NotNull
    public static EnumEntries<SimklSyncServices> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = simklSyncServicesArray = new SimklSyncServices[]{SimklSyncServices.Simkl, SimklSyncServices.Imdb, SimklSyncServices.Tmdb, SimklSyncServices.AniList, SimklSyncServices.Mal};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

