/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.collections.SetsKt
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.TvType;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\f"}, d2={"Lcom/lagradost/cloudstream3/TrackerType;", "", "<init>", "(Ljava/lang/String;I)V", "MOVIE", "TV", "TV_SHORT", "ONA", "OVA", "SPECIAL", "MUSIC", "Companion", "library"})
public final class TrackerType
extends Enum<TrackerType> {
    @NotNull
    public static final Companion Companion;
    public static final /* enum */ TrackerType MOVIE;
    public static final /* enum */ TrackerType TV;
    public static final /* enum */ TrackerType TV_SHORT;
    public static final /* enum */ TrackerType ONA;
    public static final /* enum */ TrackerType OVA;
    public static final /* enum */ TrackerType SPECIAL;
    public static final /* enum */ TrackerType MUSIC;
    private static final /* synthetic */ TrackerType[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    public static TrackerType[] values() {
        return (TrackerType[])$VALUES.clone();
    }

    public static TrackerType valueOf(String value) {
        return Enum.valueOf(TrackerType.class, value);
    }

    @NotNull
    public static EnumEntries<TrackerType> getEntries() {
        return $ENTRIES;
    }

    static {
        MOVIE = new TrackerType();
        TV = new TrackerType();
        TV_SHORT = new TrackerType();
        ONA = new TrackerType();
        OVA = new TrackerType();
        SPECIAL = new TrackerType();
        MUSIC = new TrackerType();
        $VALUES = trackerTypeArray = new TrackerType[]{TrackerType.MOVIE, TrackerType.TV, TrackerType.TV_SHORT, TrackerType.ONA, TrackerType.OVA, TrackerType.SPECIAL, TrackerType.MUSIC};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        Companion = new Companion(null);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2={"Lcom/lagradost/cloudstream3/TrackerType$Companion;", "", "<init>", "()V", "getTypes", "", "Lcom/lagradost/cloudstream3/TrackerType;", "type", "Lcom/lagradost/cloudstream3/TvType;", "library"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final Set<TrackerType> getTypes(@NotNull TvType type) {
            Set set;
            Intrinsics.checkNotNullParameter((Object)((Object)type), (String)"type");
            switch (WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
                case 1: {
                    set = SetsKt.setOf((Object)((Object)MOVIE));
                    break;
                }
                case 2: {
                    set = SetsKt.setOf((Object)((Object)MOVIE));
                    break;
                }
                case 3: {
                    TrackerType[] trackerTypeArray = new TrackerType[]{TV, TV_SHORT};
                    set = SetsKt.setOf((Object[])trackerTypeArray);
                    break;
                }
                case 4: {
                    TrackerType[] trackerTypeArray = new TrackerType[]{TV, TV_SHORT, ONA, OVA};
                    set = SetsKt.setOf((Object[])trackerTypeArray);
                    break;
                }
                case 5: {
                    TrackerType[] trackerTypeArray = new TrackerType[]{OVA, SPECIAL, ONA};
                    set = SetsKt.setOf((Object[])trackerTypeArray);
                    break;
                }
                case 6: {
                    set = SetsKt.setOf((Object)((Object)MUSIC));
                    break;
                }
                default: {
                    set = SetsKt.emptySet();
                }
            }
            return set;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @Metadata(mv={2, 1, 0}, k=3, xi=48)
        public final class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] nArray = new int[TvType.values().length];
                try {
                    nArray[TvType.Movie.ordinal()] = 1;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[TvType.AnimeMovie.ordinal()] = 2;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[TvType.TvSeries.ordinal()] = 3;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[TvType.Anime.ordinal()] = 4;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[TvType.OVA.ordinal()] = 5;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                try {
                    nArray[TvType.Others.ordinal()] = 6;
                }
                catch (NoSuchFieldError noSuchFieldError) {
                    // empty catch block
                }
                $EnumSwitchMapping$0 = nArray;
            }
        }
    }
}

