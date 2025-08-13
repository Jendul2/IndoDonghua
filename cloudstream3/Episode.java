/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.DeprecationLevel
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.Score;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bq\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\u000f\u0010\u0010Be\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\b\u000f\u0010\u0012J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00106\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00108\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u0010\u0010<\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJx\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010>J\u0013\u0010?\u001a\u00020@2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0006H\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0014\"\u0004\b!\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0014\"\u0004\b'\u0010\u0016R\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b-\u0010\u001a\"\u0004\b.\u0010\u001cR.\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010/\u001a\u0004\u0018\u00010\u00068F@FX\u0087\u000e\u00a2\u0006\u0012\u0012\u0004\b0\u00101\u001a\u0004\b2\u0010\u001a\"\u0004\b3\u0010\u001c\u00a8\u0006D"}, d2={"Lcom/lagradost/cloudstream3/Episode;", "", "data", "", "name", "season", "", "episode", "posterUrl", "score", "Lcom/lagradost/cloudstream3/Score;", "description", "date", "", "runTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)V", "rating", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;)V", "getData", "()Ljava/lang/String;", "setData", "(Ljava/lang/String;)V", "getName", "setName", "getSeason", "()Ljava/lang/Integer;", "setSeason", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getEpisode", "setEpisode", "getPosterUrl", "setPosterUrl", "getScore", "()Lcom/lagradost/cloudstream3/Score;", "setScore", "(Lcom/lagradost/cloudstream3/Score;)V", "getDescription", "setDescription", "getDate", "()Ljava/lang/Long;", "setDate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getRunTime", "setRunTime", "value", "getRating$annotations", "()V", "getRating", "setRating", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/Score;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;)Lcom/lagradost/cloudstream3/Episode;", "equals", "", "other", "hashCode", "toString", "library"})
public final class Episode {
    @NotNull
    private String data;
    @Nullable
    private String name;
    @Nullable
    private Integer season;
    @Nullable
    private Integer episode;
    @Nullable
    private String posterUrl;
    @Nullable
    private Score score;
    @Nullable
    private String description;
    @Nullable
    private Long date;
    @Nullable
    private Integer runTime;

    @Deprecated(message="Use newEpisode method", level=DeprecationLevel.ERROR)
    public Episode(@NotNull String data2, @Nullable String name, @Nullable Integer season, @Nullable Integer episode, @Nullable String posterUrl, @Nullable Score score2, @Nullable String description, @Nullable Long date, @Nullable Integer runTime) {
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        this.data = data2;
        this.name = name;
        this.season = season;
        this.episode = episode;
        this.posterUrl = posterUrl;
        this.score = score2;
        this.description = description;
        this.date = date;
        this.runTime = runTime;
    }

    public /* synthetic */ Episode(String string2, String string3, Integer n, Integer n2, String string4, Score score2, String string5, Long l, Integer n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 2) != 0) {
            string3 = null;
        }
        if ((n4 & 4) != 0) {
            n = null;
        }
        if ((n4 & 8) != 0) {
            n2 = null;
        }
        if ((n4 & 0x10) != 0) {
            string4 = null;
        }
        if ((n4 & 0x20) != 0) {
            score2 = null;
        }
        if ((n4 & 0x40) != 0) {
            string5 = null;
        }
        if ((n4 & 0x80) != 0) {
            l = null;
        }
        if ((n4 & 0x100) != 0) {
            n3 = null;
        }
        this(string2, string3, n, n2, string4, score2, string5, l, n3);
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    public final void setData(@NotNull String string2) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"<set-?>");
        this.data = string2;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String string2) {
        this.name = string2;
    }

    @Nullable
    public final Integer getSeason() {
        return this.season;
    }

    public final void setSeason(@Nullable Integer n) {
        this.season = n;
    }

    @Nullable
    public final Integer getEpisode() {
        return this.episode;
    }

    public final void setEpisode(@Nullable Integer n) {
        this.episode = n;
    }

    @Nullable
    public final String getPosterUrl() {
        return this.posterUrl;
    }

    public final void setPosterUrl(@Nullable String string2) {
        this.posterUrl = string2;
    }

    @Nullable
    public final Score getScore() {
        return this.score;
    }

    public final void setScore(@Nullable Score score2) {
        this.score = score2;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@Nullable String string2) {
        this.description = string2;
    }

    @Nullable
    public final Long getDate() {
        return this.date;
    }

    public final void setDate(@Nullable Long l) {
        this.date = l;
    }

    @Nullable
    public final Integer getRunTime() {
        return this.runTime;
    }

    public final void setRunTime(@Nullable Integer n) {
        this.runTime = n;
    }

    @Nullable
    public final Integer getRating() {
        Score score2 = this.score;
        return score2 != null ? Integer.valueOf(score2.toInt(100)) : null;
    }

    public final void setRating(@Nullable Integer value) {
        this.score = Score.Companion.from(value, 100);
    }

    @Deprecated(message="`rating` is the old scoring system, use score instead", replaceWith=@ReplaceWith(expression="score", imports={}))
    public static /* synthetic */ void getRating$annotations() {
    }

    @Deprecated(message="Use newEpisode method", level=DeprecationLevel.ERROR)
    public Episode(@NotNull String data2, @Nullable String name, @Nullable Integer season, @Nullable Integer episode, @Nullable String posterUrl, @Nullable Integer rating, @Nullable String description, @Nullable Long date) {
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        this(data2, name, season, episode, posterUrl, Score.Companion.fromOld(rating), description, date, null);
    }

    public /* synthetic */ Episode(String string2, String string3, Integer n, Integer n2, String string4, Integer n3, String string5, Long l, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n4 & 2) != 0) {
            string3 = null;
        }
        if ((n4 & 4) != 0) {
            n = null;
        }
        if ((n4 & 8) != 0) {
            n2 = null;
        }
        if ((n4 & 0x10) != 0) {
            string4 = null;
        }
        if ((n4 & 0x20) != 0) {
            n3 = null;
        }
        if ((n4 & 0x40) != 0) {
            string5 = null;
        }
        if ((n4 & 0x80) != 0) {
            l = null;
        }
        this(string2, string3, n, n2, string4, n3, string5, l);
    }

    @NotNull
    public final String component1() {
        return this.data;
    }

    @Nullable
    public final String component2() {
        return this.name;
    }

    @Nullable
    public final Integer component3() {
        return this.season;
    }

    @Nullable
    public final Integer component4() {
        return this.episode;
    }

    @Nullable
    public final String component5() {
        return this.posterUrl;
    }

    @Nullable
    public final Score component6() {
        return this.score;
    }

    @Nullable
    public final String component7() {
        return this.description;
    }

    @Nullable
    public final Long component8() {
        return this.date;
    }

    @Nullable
    public final Integer component9() {
        return this.runTime;
    }

    @NotNull
    public final Episode copy(@NotNull String data2, @Nullable String name, @Nullable Integer season, @Nullable Integer episode, @Nullable String posterUrl, @Nullable Score score2, @Nullable String description, @Nullable Long date, @Nullable Integer runTime) {
        Intrinsics.checkNotNullParameter((Object)data2, (String)"data");
        return new Episode(data2, name, season, episode, posterUrl, score2, description, date, runTime);
    }

    public static /* synthetic */ Episode copy$default(Episode episode, String string2, String string3, Integer n, Integer n2, String string4, Score score2, String string5, Long l, Integer n3, int n4, Object object) {
        if ((n4 & 1) != 0) {
            string2 = episode.data;
        }
        if ((n4 & 2) != 0) {
            string3 = episode.name;
        }
        if ((n4 & 4) != 0) {
            n = episode.season;
        }
        if ((n4 & 8) != 0) {
            n2 = episode.episode;
        }
        if ((n4 & 0x10) != 0) {
            string4 = episode.posterUrl;
        }
        if ((n4 & 0x20) != 0) {
            score2 = episode.score;
        }
        if ((n4 & 0x40) != 0) {
            string5 = episode.description;
        }
        if ((n4 & 0x80) != 0) {
            l = episode.date;
        }
        if ((n4 & 0x100) != 0) {
            n3 = episode.runTime;
        }
        return episode.copy(string2, string3, n, n2, string4, score2, string5, l, n3);
    }

    @NotNull
    public String toString() {
        return "Episode(data=" + this.data + ", name=" + this.name + ", season=" + this.season + ", episode=" + this.episode + ", posterUrl=" + this.posterUrl + ", score=" + this.score + ", description=" + this.description + ", date=" + this.date + ", runTime=" + this.runTime + ')';
    }

    public int hashCode() {
        int result2 = this.data.hashCode();
        result2 = result2 * 31 + (this.name == null ? 0 : this.name.hashCode());
        result2 = result2 * 31 + (this.season == null ? 0 : ((Object)this.season).hashCode());
        result2 = result2 * 31 + (this.episode == null ? 0 : ((Object)this.episode).hashCode());
        result2 = result2 * 31 + (this.posterUrl == null ? 0 : this.posterUrl.hashCode());
        result2 = result2 * 31 + (this.score == null ? 0 : this.score.hashCode());
        result2 = result2 * 31 + (this.description == null ? 0 : this.description.hashCode());
        result2 = result2 * 31 + (this.date == null ? 0 : ((Object)this.date).hashCode());
        result2 = result2 * 31 + (this.runTime == null ? 0 : ((Object)this.runTime).hashCode());
        return result2;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Episode)) {
            return false;
        }
        Episode episode = (Episode)other;
        if (!Intrinsics.areEqual((Object)this.data, (Object)episode.data)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.name, (Object)episode.name)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.season, (Object)episode.season)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.episode, (Object)episode.episode)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.posterUrl, (Object)episode.posterUrl)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.score, (Object)episode.score)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.description, (Object)episode.description)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object)this.date, (Object)episode.date)) {
            return false;
        }
        return Intrinsics.areEqual((Object)this.runTime, (Object)episode.runTime);
    }
}

