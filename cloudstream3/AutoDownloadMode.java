/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b\u00a8\u0006\r"}, d2={"Lcom/lagradost/cloudstream3/AutoDownloadMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Disable", "FilterByLang", "All", "NsfwOnly", "Companion", "library"})
public final class AutoDownloadMode
extends Enum<AutoDownloadMode> {
    @NotNull
    public static final Companion Companion;
    private final int value;
    public static final /* enum */ AutoDownloadMode Disable;
    public static final /* enum */ AutoDownloadMode FilterByLang;
    public static final /* enum */ AutoDownloadMode All;
    public static final /* enum */ AutoDownloadMode NsfwOnly;
    private static final /* synthetic */ AutoDownloadMode[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private AutoDownloadMode(int value) {
        this.value = value;
    }

    public final int getValue() {
        return this.value;
    }

    public static AutoDownloadMode[] values() {
        return (AutoDownloadMode[])$VALUES.clone();
    }

    public static AutoDownloadMode valueOf(String value) {
        return Enum.valueOf(AutoDownloadMode.class, value);
    }

    @NotNull
    public static EnumEntries<AutoDownloadMode> getEntries() {
        return $ENTRIES;
    }

    static {
        Disable = new AutoDownloadMode(0);
        FilterByLang = new AutoDownloadMode(1);
        All = new AutoDownloadMode(2);
        NsfwOnly = new AutoDownloadMode(3);
        $VALUES = autoDownloadModeArray = new AutoDownloadMode[]{AutoDownloadMode.Disable, AutoDownloadMode.FilterByLang, AutoDownloadMode.All, AutoDownloadMode.NsfwOnly};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
        Companion = new Companion(null);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0004\u00a8\u0006\b"}, d2={"Lcom/lagradost/cloudstream3/AutoDownloadMode$Companion;", "", "<init>", "()V", "getEnum", "Lcom/lagradost/cloudstream3/AutoDownloadMode;", "value", "", "library"})
    @SourceDebugExtension(value={"SMAP\nMainAPI.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/AutoDownloadMode$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2892:1\n295#2,2:2893\n*S KotlinDebug\n*F\n+ 1 MainAPI.kt\ncom/lagradost/cloudstream3/AutoDownloadMode$Companion\n*L\n1007#1:2893,2\n*E\n"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final AutoDownloadMode getEnum(int value) {
            Object v0;
            block1: {
                Iterable $this$firstOrNull$iv = (Iterable)AutoDownloadMode.getEntries();
                boolean $i$f$firstOrNull = false;
                for (Object element$iv : $this$firstOrNull$iv) {
                    AutoDownloadMode it = (AutoDownloadMode)((Object)element$iv);
                    boolean bl = false;
                    if (!(it.getValue() == value)) continue;
                    v0 = element$iv;
                    break block1;
                }
                v0 = null;
            }
            return v0;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

