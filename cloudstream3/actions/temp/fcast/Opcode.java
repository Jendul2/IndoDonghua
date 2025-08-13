/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.enums.EnumEntries
 *  kotlin.enums.EnumEntriesKt
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/Opcode;", "", "value", "", "<init>", "(Ljava/lang/String;IB)V", "getValue", "()B", "None", "Play", "Pause", "Resume", "Stop", "Seek", "PlaybackUpdate", "VolumeUpdate", "SetVolume", "PlaybackError", "SetSpeed", "Version", "Ping", "Pong", "app_prereleaseDebug"})
public final class Opcode
extends Enum<Opcode> {
    private final byte value;
    public static final /* enum */ Opcode None = new Opcode(0);
    public static final /* enum */ Opcode Play = new Opcode(1);
    public static final /* enum */ Opcode Pause = new Opcode(2);
    public static final /* enum */ Opcode Resume = new Opcode(3);
    public static final /* enum */ Opcode Stop = new Opcode(4);
    public static final /* enum */ Opcode Seek = new Opcode(5);
    public static final /* enum */ Opcode PlaybackUpdate = new Opcode(6);
    public static final /* enum */ Opcode VolumeUpdate = new Opcode(7);
    public static final /* enum */ Opcode SetVolume = new Opcode(8);
    public static final /* enum */ Opcode PlaybackError = new Opcode(9);
    public static final /* enum */ Opcode SetSpeed = new Opcode(10);
    public static final /* enum */ Opcode Version = new Opcode(11);
    public static final /* enum */ Opcode Ping = new Opcode(12);
    public static final /* enum */ Opcode Pong = new Opcode(13);
    private static final /* synthetic */ Opcode[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private Opcode(byte value) {
        this.value = value;
    }

    public final byte getValue() {
        return this.value;
    }

    public static Opcode[] values() {
        return (Opcode[])$VALUES.clone();
    }

    public static Opcode valueOf(String value) {
        return Enum.valueOf(Opcode.class, value);
    }

    @NotNull
    public static EnumEntries<Opcode> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = opcodeArray = new Opcode[]{Opcode.None, Opcode.Play, Opcode.Pause, Opcode.Resume, Opcode.Stop, Opcode.Seek, Opcode.PlaybackUpdate, Opcode.VolumeUpdate, Opcode.SetVolume, Opcode.PlaybackError, Opcode.SetSpeed, Opcode.Version, Opcode.Ping, Opcode.Pong};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

