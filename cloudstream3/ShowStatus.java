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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2={"Lcom/lagradost/cloudstream3/ShowStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Completed", "Ongoing", "library"})
public final class ShowStatus
extends Enum<ShowStatus> {
    public static final /* enum */ ShowStatus Completed = new ShowStatus();
    public static final /* enum */ ShowStatus Ongoing = new ShowStatus();
    private static final /* synthetic */ ShowStatus[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    public static ShowStatus[] values() {
        return (ShowStatus[])$VALUES.clone();
    }

    public static ShowStatus valueOf(String value) {
        return Enum.valueOf(ShowStatus.class, value);
    }

    @NotNull
    public static EnumEntries<ShowStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = showStatusArray = new ShowStatus[]{ShowStatus.Completed, ShowStatus.Ongoing};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

