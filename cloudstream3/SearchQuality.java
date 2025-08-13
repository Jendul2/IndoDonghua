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

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0013\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015\u00a8\u0006\u0016"}, d2={"Lcom/lagradost/cloudstream3/SearchQuality;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/Integer;)V", "Cam", "CamRip", "HdCam", "Telesync", "WorkPrint", "Telecine", "HQ", "HD", "HDR", "BlueRay", "DVD", "SD", "FourK", "UHD", "SDR", "WebRip", "library"})
public final class SearchQuality
extends Enum<SearchQuality> {
    public static final /* enum */ SearchQuality Cam = new SearchQuality(1);
    public static final /* enum */ SearchQuality CamRip = new SearchQuality(2);
    public static final /* enum */ SearchQuality HdCam = new SearchQuality(3);
    public static final /* enum */ SearchQuality Telesync = new SearchQuality(4);
    public static final /* enum */ SearchQuality WorkPrint = new SearchQuality(5);
    public static final /* enum */ SearchQuality Telecine = new SearchQuality(6);
    public static final /* enum */ SearchQuality HQ = new SearchQuality(7);
    public static final /* enum */ SearchQuality HD = new SearchQuality(8);
    public static final /* enum */ SearchQuality HDR = new SearchQuality(9);
    public static final /* enum */ SearchQuality BlueRay = new SearchQuality(10);
    public static final /* enum */ SearchQuality DVD = new SearchQuality(11);
    public static final /* enum */ SearchQuality SD = new SearchQuality(12);
    public static final /* enum */ SearchQuality FourK = new SearchQuality(13);
    public static final /* enum */ SearchQuality UHD = new SearchQuality(14);
    public static final /* enum */ SearchQuality SDR = new SearchQuality(15);
    public static final /* enum */ SearchQuality WebRip = new SearchQuality(16);
    private static final /* synthetic */ SearchQuality[] $VALUES;
    private static final /* synthetic */ EnumEntries $ENTRIES;

    private SearchQuality(Integer value) {
    }

    public static SearchQuality[] values() {
        return (SearchQuality[])$VALUES.clone();
    }

    public static SearchQuality valueOf(String value) {
        return Enum.valueOf(SearchQuality.class, value);
    }

    @NotNull
    public static EnumEntries<SearchQuality> getEntries() {
        return $ENTRIES;
    }

    static {
        $VALUES = searchQualityArray = new SearchQuality[]{SearchQuality.Cam, SearchQuality.CamRip, SearchQuality.HdCam, SearchQuality.Telesync, SearchQuality.WorkPrint, SearchQuality.Telecine, SearchQuality.HQ, SearchQuality.HD, SearchQuality.HDR, SearchQuality.BlueRay, SearchQuality.DVD, SearchQuality.SD, SearchQuality.FourK, SearchQuality.UHD, SearchQuality.SDR, SearchQuality.WebRip};
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }
}

