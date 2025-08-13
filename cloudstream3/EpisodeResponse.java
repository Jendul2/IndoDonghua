/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.DubStatus;
import com.lagradost.cloudstream3.NextAiring;
import com.lagradost.cloudstream3.SeasonData;
import com.lagradost.cloudstream3.ShowStatus;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0016H&J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u0018H&R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u0004\u0018\u00010\tX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u00a6\u000e\u00a2\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u001c"}, d2={"Lcom/lagradost/cloudstream3/EpisodeResponse;", "", "showStatus", "Lcom/lagradost/cloudstream3/ShowStatus;", "getShowStatus", "()Lcom/lagradost/cloudstream3/ShowStatus;", "setShowStatus", "(Lcom/lagradost/cloudstream3/ShowStatus;)V", "nextAiring", "Lcom/lagradost/cloudstream3/NextAiring;", "getNextAiring", "()Lcom/lagradost/cloudstream3/NextAiring;", "setNextAiring", "(Lcom/lagradost/cloudstream3/NextAiring;)V", "seasonNames", "", "Lcom/lagradost/cloudstream3/SeasonData;", "getSeasonNames", "()Ljava/util/List;", "setSeasonNames", "(Ljava/util/List;)V", "getLatestEpisodes", "", "Lcom/lagradost/cloudstream3/DubStatus;", "", "getTotalEpisodeIndex", "episode", "season", "library"})
public interface EpisodeResponse {
    @Nullable
    public ShowStatus getShowStatus();

    public void setShowStatus(@Nullable ShowStatus var1);

    @Nullable
    public NextAiring getNextAiring();

    public void setNextAiring(@Nullable NextAiring var1);

    @Nullable
    public List<SeasonData> getSeasonNames();

    public void setSeasonNames(@Nullable List<SeasonData> var1);

    @NotNull
    public Map<DubStatus, Integer> getLatestEpisodes();

    public int getTotalEpisodeIndex(int var1, int var2);
}

