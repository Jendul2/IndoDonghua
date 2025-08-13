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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2={"Lcom/lagradost/cloudstream3/TvType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "Movie", "AnimeMovie", "TvSeries", "Cartoon", "Anime", "OVA", "Torrent", "Documentary", "AsianDrama", "Live", "NSFW", "Others", "Music", "AudioBook", "CustomMedia", "Audio", "Podcast", "library"})
public final class TvType
extends Enum<TvType> {
    public static final /* enum */ TvType Movie = new TvType(1);
    public static final /* enum */ TvType AnimeMovie = new TvType(2);
    public static final /* enum */ TvType TvSeries = new TvType(3);
    public static final /* enum */ TvType Cartoon = new TvType(4);
    public static final /* enum */ TvType Anime = new TvType(5);
    public static final /* enum */ TvType OVA = new TvType(6);
    public static final /* enum */ TvType Torrent = new TvType(7);
    public static final /* enum */ TvType Documentary = new TvType(8);
    public static final /* enum */ TvType AsianDrama = new TvType(9);
    public static final /* enum */ TvType Live = new TvType(10);
    public static final /* enum */ TvType NSFW = new TvType(11);
    public static final /* enum */ TvType Others = new TvType(12);
    public static final /* enum */ TvType Music = new TvType(13);
    public static final /* enum */ TvType AudioBook = new TvType(14);
    public static final /* enum */ TvType CustomMedia = new TvType(15);
    public static final /* enum */ TvType Audio = new TvType(16);
    public static final /* enum */ TvType Podcast = new TvType(17);
    private static final /* synthetic */ TvType[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private TvType(Integer value) {
    }

    public static TvType[] values() {
        return (TvType[])$VALUES.clone();
    }

    public static TvType valueOf(String value) {
        return Enum.valueOf(TvType.class, value);
    }

    @NotNull
    public static EnumEntries<TvType> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = tvTypeArray = new TvType[]{TvType.Movie, TvType.AnimeMovie, TvType.TvSeries, TvType.Cartoon, TvType.Anime, TvType.OVA, TvType.Torrent, TvType.Documentary, TvType.AsianDrama, TvType.Live, TvType.NSFW, TvType.Others, TvType.Music, TvType.AudioBook, TvType.CustomMedia, TvType.Audio, TvType.Podcast};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

