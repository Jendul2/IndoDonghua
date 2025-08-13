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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2={"Lcom/lagradost/cloudstream3/FocusDirection;", "", "<init>", "(Ljava/lang/String;I)V", "Start", "End", "Up", "Down", "app_prereleaseDebug"})
public final class FocusDirection
extends Enum<FocusDirection> {
    public static final /* enum */ FocusDirection Start = new FocusDirection();
    public static final /* enum */ FocusDirection End = new FocusDirection();
    public static final /* enum */ FocusDirection Up = new FocusDirection();
    public static final /* enum */ FocusDirection Down = new FocusDirection();
    private static final /* synthetic */ FocusDirection[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    public static FocusDirection[] values() {
        return (FocusDirection[])$VALUES.clone();
    }

    public static FocusDirection valueOf(String value) {
        return Enum.valueOf(FocusDirection.class, value);
    }

    @NotNull
    public static EnumEntries<FocusDirection> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = focusDirectionArray = new FocusDirection[]{FocusDirection.Start, FocusDirection.End, FocusDirection.Up, FocusDirection.Down};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

