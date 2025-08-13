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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n\u00a8\u0006\u000b"}, d2={"Lcom/lagradost/cloudstream3/DubStatus;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "None", "Dubbed", "Subbed", "library"})
public final class DubStatus
extends Enum<DubStatus> {
    private final int id;
    public static final /* enum */ DubStatus None = new DubStatus(-1);
    public static final /* enum */ DubStatus Dubbed = new DubStatus(1);
    public static final /* enum */ DubStatus Subbed = new DubStatus(0);
    private static final /* synthetic */ DubStatus[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private DubStatus(int id2) {
        this.id = id2;
    }

    public final int getId() {
        return this.id;
    }

    public static DubStatus[] values() {
        return (DubStatus[])$VALUES.clone();
    }

    public static DubStatus valueOf(String value) {
        return Enum.valueOf(DubStatus.class, value);
    }

    @NotNull
    public static EnumEntries<DubStatus> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = dubStatusArray = new DubStatus[]{DubStatus.None, DubStatus.Dubbed, DubStatus.Subbed};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

