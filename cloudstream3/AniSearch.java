/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.annotation.JsonProperty
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0013"}, d2={"Lcom/lagradost/cloudstream3/AniSearch;", "", "data", "Lcom/lagradost/cloudstream3/AniSearch$Data;", "<init>", "(Lcom/lagradost/cloudstream3/AniSearch$Data;)V", "getData", "()Lcom/lagradost/cloudstream3/AniSearch$Data;", "setData", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Data", "library"})
public final class AniSearch {
    @Nullable
    private Data data;

    public AniSearch(@JsonProperty(value="data") @Nullable Data data2) {
        this.data = data2;
    }

    public /* synthetic */ AniSearch(Data data2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            data2 = new Data(null, 1, null);
        }
        this(data2);
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    public final void setData(@Nullable Data data2) {
        this.data = data2;
    }

    @Nullable
    public final Data component1() {
        return this.data;
    }

    @NotNull
    public final AniSearch copy(@JsonProperty(value="data") @Nullable Data data2) {
        return new AniSearch(data2);
    }

    public static /* synthetic */ AniSearch copy$default(AniSearch aniSearch, Data data2, int n, Object object) {
        if ((n & 1) != 0) {
            data2 = aniSearch.data;
        }
        return aniSearch.copy(data2);
    }

    @NotNull
    public String toString() {
        return "AniSearch(data=" + this.data + ')';
    }

    public int hashCode() {
        return this.data == null ? 0 : this.data.hashCode();
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AniSearch)) {
            return false;
        }
        AniSearch aniSearch = (AniSearch)other;
        return Intrinsics.areEqual((Object)this.data, (Object)aniSearch.data);
    }

    public AniSearch() {
        this(null, 1, null);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0013\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u0013"}, d2={"Lcom/lagradost/cloudstream3/AniSearch$Data;", "", "page", "Lcom/lagradost/cloudstream3/AniSearch$Data$Page;", "<init>", "(Lcom/lagradost/cloudstream3/AniSearch$Data$Page;)V", "getPage", "()Lcom/lagradost/cloudstream3/AniSearch$Data$Page;", "setPage", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Page", "library"})
    public static final class Data {
        @Nullable
        private Page page;

        public Data(@JsonProperty(value="Page") @Nullable Page page) {
            this.page = page;
        }

        public /* synthetic */ Data(Page page, int n, DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 1) != 0) {
                page = new Page(null, 1, null);
            }
            this(page);
        }

        @Nullable
        public final Page getPage() {
            return this.page;
        }

        public final void setPage(@Nullable Page page) {
            this.page = page;
        }

        @Nullable
        public final Page component1() {
            return this.page;
        }

        @NotNull
        public final Data copy(@JsonProperty(value="Page") @Nullable Page page) {
            return new Data(page);
        }

        public static /* synthetic */ Data copy$default(Data data2, Page page, int n, Object object) {
            if ((n & 1) != 0) {
                page = data2.page;
            }
            return data2.copy(page);
        }

        @NotNull
        public String toString() {
            return "Data(page=" + this.page + ')';
        }

        public int hashCode() {
            return this.page == null ? 0 : this.page.hashCode();
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data2 = (Data)other;
            return Intrinsics.areEqual((Object)this.page, (Object)data2.page);
        }

        public Data() {
            this(null, 1, null);
        }

        @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006\u00a8\u0006\u0014"}, d2={"Lcom/lagradost/cloudstream3/AniSearch$Data$Page;", "", "media", "Ljava/util/ArrayList;", "Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media;", "<init>", "(Ljava/util/ArrayList;)V", "getMedia", "()Ljava/util/ArrayList;", "setMedia", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Media", "library"})
        public static final class Page {
            @NotNull
            private ArrayList<Media> media;

            public Page(@JsonProperty(value="media") @NotNull ArrayList<Media> media) {
                Intrinsics.checkNotNullParameter(media, (String)"media");
                this.media = media;
            }

            public /* synthetic */ Page(ArrayList arrayList, int n, DefaultConstructorMarker defaultConstructorMarker) {
                if ((n & 1) != 0) {
                    arrayList = new ArrayList();
                }
                this(arrayList);
            }

            @NotNull
            public final ArrayList<Media> getMedia() {
                return this.media;
            }

            public final void setMedia(@NotNull ArrayList<Media> arrayList) {
                Intrinsics.checkNotNullParameter(arrayList, (String)"<set-?>");
                this.media = arrayList;
            }

            @NotNull
            public final ArrayList<Media> component1() {
                return this.media;
            }

            @NotNull
            public final Page copy(@JsonProperty(value="media") @NotNull ArrayList<Media> media) {
                Intrinsics.checkNotNullParameter(media, (String)"media");
                return new Page(media);
            }

            public static /* synthetic */ Page copy$default(Page page, ArrayList arrayList, int n, Object object) {
                if ((n & 1) != 0) {
                    arrayList = page.media;
                }
                return page.copy(arrayList);
            }

            @NotNull
            public String toString() {
                return "Page(media=" + this.media + ')';
            }

            public int hashCode() {
                return this.media.hashCode();
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Page)) {
                    return false;
                }
                Page page = (Page)other;
                return Intrinsics.areEqual(this.media, page.media);
            }

            public Page() {
                this(null, 1, null);
            }

            @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u000245B[\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010)\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010*\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003Jb\u0010-\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\tH\u00c6\u0001\u00a2\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00102\u001a\u00020\u0005H\u00d6\u0001J\t\u00103\u001a\u00020\tH\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f\u00a8\u00066"}, d2={"Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media;", "", "title", "Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;", "id", "", "idMal", "seasonYear", "format", "", "coverImage", "Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;", "bannerImage", "<init>", "(Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;Ljava/lang/String;)V", "getTitle", "()Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;", "setTitle", "(Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getIdMal", "setIdMal", "getSeasonYear", "setSeasonYear", "getFormat", "()Ljava/lang/String;", "setFormat", "(Ljava/lang/String;)V", "getCoverImage", "()Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;", "setCoverImage", "(Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;)V", "getBannerImage", "setBannerImage", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;Ljava/lang/String;)Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media;", "equals", "", "other", "hashCode", "toString", "CoverImage", "Title", "library"})
            public static final class Media {
                @Nullable
                private Title title;
                @Nullable
                private Integer id;
                @Nullable
                private Integer idMal;
                @Nullable
                private Integer seasonYear;
                @Nullable
                private String format;
                @Nullable
                private CoverImage coverImage;
                @Nullable
                private String bannerImage;

                public Media(@JsonProperty(value="title") @Nullable Title title, @JsonProperty(value="id") @Nullable Integer id2, @JsonProperty(value="idMal") @Nullable Integer idMal, @JsonProperty(value="seasonYear") @Nullable Integer seasonYear, @JsonProperty(value="format") @Nullable String format, @JsonProperty(value="coverImage") @Nullable CoverImage coverImage, @JsonProperty(value="bannerImage") @Nullable String bannerImage) {
                    this.title = title;
                    this.id = id2;
                    this.idMal = idMal;
                    this.seasonYear = seasonYear;
                    this.format = format;
                    this.coverImage = coverImage;
                    this.bannerImage = bannerImage;
                }

                public /* synthetic */ Media(Title title, Integer n, Integer n2, Integer n3, String string2, CoverImage coverImage, String string3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
                    if ((n4 & 1) != 0) {
                        title = null;
                    }
                    if ((n4 & 2) != 0) {
                        n = null;
                    }
                    if ((n4 & 4) != 0) {
                        n2 = null;
                    }
                    if ((n4 & 8) != 0) {
                        n3 = null;
                    }
                    if ((n4 & 0x10) != 0) {
                        string2 = null;
                    }
                    if ((n4 & 0x20) != 0) {
                        coverImage = null;
                    }
                    if ((n4 & 0x40) != 0) {
                        string3 = null;
                    }
                    this(title, n, n2, n3, string2, coverImage, string3);
                }

                @Nullable
                public final Title getTitle() {
                    return this.title;
                }

                public final void setTitle(@Nullable Title title) {
                    this.title = title;
                }

                @Nullable
                public final Integer getId() {
                    return this.id;
                }

                public final void setId(@Nullable Integer n) {
                    this.id = n;
                }

                @Nullable
                public final Integer getIdMal() {
                    return this.idMal;
                }

                public final void setIdMal(@Nullable Integer n) {
                    this.idMal = n;
                }

                @Nullable
                public final Integer getSeasonYear() {
                    return this.seasonYear;
                }

                public final void setSeasonYear(@Nullable Integer n) {
                    this.seasonYear = n;
                }

                @Nullable
                public final String getFormat() {
                    return this.format;
                }

                public final void setFormat(@Nullable String string2) {
                    this.format = string2;
                }

                @Nullable
                public final CoverImage getCoverImage() {
                    return this.coverImage;
                }

                public final void setCoverImage(@Nullable CoverImage coverImage) {
                    this.coverImage = coverImage;
                }

                @Nullable
                public final String getBannerImage() {
                    return this.bannerImage;
                }

                public final void setBannerImage(@Nullable String string2) {
                    this.bannerImage = string2;
                }

                @Nullable
                public final Title component1() {
                    return this.title;
                }

                @Nullable
                public final Integer component2() {
                    return this.id;
                }

                @Nullable
                public final Integer component3() {
                    return this.idMal;
                }

                @Nullable
                public final Integer component4() {
                    return this.seasonYear;
                }

                @Nullable
                public final String component5() {
                    return this.format;
                }

                @Nullable
                public final CoverImage component6() {
                    return this.coverImage;
                }

                @Nullable
                public final String component7() {
                    return this.bannerImage;
                }

                @NotNull
                public final Media copy(@JsonProperty(value="title") @Nullable Title title, @JsonProperty(value="id") @Nullable Integer id2, @JsonProperty(value="idMal") @Nullable Integer idMal, @JsonProperty(value="seasonYear") @Nullable Integer seasonYear, @JsonProperty(value="format") @Nullable String format, @JsonProperty(value="coverImage") @Nullable CoverImage coverImage, @JsonProperty(value="bannerImage") @Nullable String bannerImage) {
                    return new Media(title, id2, idMal, seasonYear, format, coverImage, bannerImage);
                }

                public static /* synthetic */ Media copy$default(Media media, Title title, Integer n, Integer n2, Integer n3, String string2, CoverImage coverImage, String string3, int n4, Object object) {
                    if ((n4 & 1) != 0) {
                        title = media.title;
                    }
                    if ((n4 & 2) != 0) {
                        n = media.id;
                    }
                    if ((n4 & 4) != 0) {
                        n2 = media.idMal;
                    }
                    if ((n4 & 8) != 0) {
                        n3 = media.seasonYear;
                    }
                    if ((n4 & 0x10) != 0) {
                        string2 = media.format;
                    }
                    if ((n4 & 0x20) != 0) {
                        coverImage = media.coverImage;
                    }
                    if ((n4 & 0x40) != 0) {
                        string3 = media.bannerImage;
                    }
                    return media.copy(title, n, n2, n3, string2, coverImage, string3);
                }

                @NotNull
                public String toString() {
                    return "Media(title=" + this.title + ", id=" + this.id + ", idMal=" + this.idMal + ", seasonYear=" + this.seasonYear + ", format=" + this.format + ", coverImage=" + this.coverImage + ", bannerImage=" + this.bannerImage + ')';
                }

                public int hashCode() {
                    int result2 = this.title == null ? 0 : this.title.hashCode();
                    result2 = result2 * 31 + (this.id == null ? 0 : ((Object)this.id).hashCode());
                    result2 = result2 * 31 + (this.idMal == null ? 0 : ((Object)this.idMal).hashCode());
                    result2 = result2 * 31 + (this.seasonYear == null ? 0 : ((Object)this.seasonYear).hashCode());
                    result2 = result2 * 31 + (this.format == null ? 0 : this.format.hashCode());
                    result2 = result2 * 31 + (this.coverImage == null ? 0 : this.coverImage.hashCode());
                    result2 = result2 * 31 + (this.bannerImage == null ? 0 : this.bannerImage.hashCode());
                    return result2;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Media)) {
                        return false;
                    }
                    Media media = (Media)other;
                    if (!Intrinsics.areEqual((Object)this.title, (Object)media.title)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual((Object)this.id, (Object)media.id)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual((Object)this.idMal, (Object)media.idMal)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual((Object)this.seasonYear, (Object)media.seasonYear)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual((Object)this.format, (Object)media.format)) {
                        return false;
                    }
                    if (!Intrinsics.areEqual((Object)this.coverImage, (Object)media.coverImage)) {
                        return false;
                    }
                    return Intrinsics.areEqual((Object)this.bannerImage, (Object)media.bannerImage);
                }

                public Media() {
                    this(null, null, null, null, null, null, null, 127, null);
                }

                @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u0016"}, d2={"Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$CoverImage;", "", "extraLarge", "", "large", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getExtraLarge", "()Ljava/lang/String;", "setExtraLarge", "(Ljava/lang/String;)V", "getLarge", "setLarge", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "library"})
                public static final class CoverImage {
                    @Nullable
                    private String extraLarge;
                    @Nullable
                    private String large;

                    public CoverImage(@JsonProperty(value="extraLarge") @Nullable String extraLarge, @JsonProperty(value="large") @Nullable String large) {
                        this.extraLarge = extraLarge;
                        this.large = large;
                    }

                    public /* synthetic */ CoverImage(String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
                        if ((n & 1) != 0) {
                            string2 = null;
                        }
                        if ((n & 2) != 0) {
                            string3 = null;
                        }
                        this(string2, string3);
                    }

                    @Nullable
                    public final String getExtraLarge() {
                        return this.extraLarge;
                    }

                    public final void setExtraLarge(@Nullable String string2) {
                        this.extraLarge = string2;
                    }

                    @Nullable
                    public final String getLarge() {
                        return this.large;
                    }

                    public final void setLarge(@Nullable String string2) {
                        this.large = string2;
                    }

                    @Nullable
                    public final String component1() {
                        return this.extraLarge;
                    }

                    @Nullable
                    public final String component2() {
                        return this.large;
                    }

                    @NotNull
                    public final CoverImage copy(@JsonProperty(value="extraLarge") @Nullable String extraLarge, @JsonProperty(value="large") @Nullable String large) {
                        return new CoverImage(extraLarge, large);
                    }

                    public static /* synthetic */ CoverImage copy$default(CoverImage coverImage, String string2, String string3, int n, Object object) {
                        if ((n & 1) != 0) {
                            string2 = coverImage.extraLarge;
                        }
                        if ((n & 2) != 0) {
                            string3 = coverImage.large;
                        }
                        return coverImage.copy(string2, string3);
                    }

                    @NotNull
                    public String toString() {
                        return "CoverImage(extraLarge=" + this.extraLarge + ", large=" + this.large + ')';
                    }

                    public int hashCode() {
                        int result2 = this.extraLarge == null ? 0 : this.extraLarge.hashCode();
                        result2 = result2 * 31 + (this.large == null ? 0 : this.large.hashCode());
                        return result2;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof CoverImage)) {
                            return false;
                        }
                        CoverImage coverImage = (CoverImage)other;
                        if (!Intrinsics.areEqual((Object)this.extraLarge, (Object)coverImage.extraLarge)) {
                            return false;
                        }
                        return Intrinsics.areEqual((Object)this.large, (Object)coverImage.large);
                    }

                    public CoverImage() {
                        this(null, null, 3, null);
                    }
                }

                @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\n\u00a8\u0006\u0018"}, d2={"Lcom/lagradost/cloudstream3/AniSearch$Data$Page$Media$Title;", "", "romaji", "", "english", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRomaji", "()Ljava/lang/String;", "setRomaji", "(Ljava/lang/String;)V", "getEnglish", "setEnglish", "isMatchingTitles", "", "title", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "library"})
                public static final class Title {
                    @Nullable
                    private String romaji;
                    @Nullable
                    private String english;

                    public Title(@JsonProperty(value="romaji") @Nullable String romaji, @JsonProperty(value="english") @Nullable String english) {
                        this.romaji = romaji;
                        this.english = english;
                    }

                    public /* synthetic */ Title(String string2, String string3, int n, DefaultConstructorMarker defaultConstructorMarker) {
                        if ((n & 1) != 0) {
                            string2 = null;
                        }
                        if ((n & 2) != 0) {
                            string3 = null;
                        }
                        this(string2, string3);
                    }

                    @Nullable
                    public final String getRomaji() {
                        return this.romaji;
                    }

                    public final void setRomaji(@Nullable String string2) {
                        this.romaji = string2;
                    }

                    @Nullable
                    public final String getEnglish() {
                        return this.english;
                    }

                    public final void setEnglish(@Nullable String string2) {
                        this.english = string2;
                    }

                    public final boolean isMatchingTitles(@Nullable String title) {
                        if (title == null) {
                            return false;
                        }
                        return StringsKt.equals((String)this.english, (String)title, (boolean)true) || StringsKt.equals((String)this.romaji, (String)title, (boolean)true);
                    }

                    @Nullable
                    public final String component1() {
                        return this.romaji;
                    }

                    @Nullable
                    public final String component2() {
                        return this.english;
                    }

                    @NotNull
                    public final Title copy(@JsonProperty(value="romaji") @Nullable String romaji, @JsonProperty(value="english") @Nullable String english) {
                        return new Title(romaji, english);
                    }

                    public static /* synthetic */ Title copy$default(Title title, String string2, String string3, int n, Object object) {
                        if ((n & 1) != 0) {
                            string2 = title.romaji;
                        }
                        if ((n & 2) != 0) {
                            string3 = title.english;
                        }
                        return title.copy(string2, string3);
                    }

                    @NotNull
                    public String toString() {
                        return "Title(romaji=" + this.romaji + ", english=" + this.english + ')';
                    }

                    public int hashCode() {
                        int result2 = this.romaji == null ? 0 : this.romaji.hashCode();
                        result2 = result2 * 31 + (this.english == null ? 0 : this.english.hashCode());
                        return result2;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Title)) {
                            return false;
                        }
                        Title title = (Title)other;
                        if (!Intrinsics.areEqual((Object)this.romaji, (Object)title.romaji)) {
                            return false;
                        }
                        return Intrinsics.areEqual((Object)this.english, (Object)title.english);
                    }

                    public Title() {
                        this(null, null, 3, null);
                    }
                }
            }
        }
    }
}

