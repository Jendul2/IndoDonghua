/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions;

import android.app.Activity;
import android.content.Context;
import com.lagradost.api.Log;
import com.lagradost.cloudstream3.actions.AlwaysAskAction;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.actions.temp.BiglyBTPackage;
import com.lagradost.cloudstream3.actions.temp.CopyClipboardAction;
import com.lagradost.cloudstream3.actions.temp.JustPlayerPackage;
import com.lagradost.cloudstream3.actions.temp.LibreTorrentPackage;
import com.lagradost.cloudstream3.actions.temp.MpvKtPackage;
import com.lagradost.cloudstream3.actions.temp.MpvKtPreviewPackage;
import com.lagradost.cloudstream3.actions.temp.MpvPackage;
import com.lagradost.cloudstream3.actions.temp.MpvYTDLPackage;
import com.lagradost.cloudstream3.actions.temp.NextPlayerPackage;
import com.lagradost.cloudstream3.actions.temp.PlayInBrowserAction;
import com.lagradost.cloudstream3.actions.temp.ViewM3U8Action;
import com.lagradost.cloudstream3.actions.temp.VlcNightlyPackage;
import com.lagradost.cloudstream3.actions.temp.VlcPackage;
import com.lagradost.cloudstream3.actions.temp.WebVideoCastPackage;
import com.lagradost.cloudstream3.actions.temp.fcast.FcastAction;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.cloudstream3.utils.UiText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r0\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0016\u001a\u00020\u0017J\u0017\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2={"Lcom/lagradost/cloudstream3/actions/VideoClickActionHolder;", "", "<init>", "()V", "allVideoClickActions", "", "Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "getAllVideoClickActions", "()Ljava/util/List;", "ACTION_ID_OFFSET", "", "makeOptionMap", "", "Lkotlin/Pair;", "Lcom/lagradost/cloudstream3/utils/UiText;", "activity", "Landroid/app/Activity;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "getActionById", "id", "getByUniqueId", "uniqueId", "", "uniqueIdToId", "(Ljava/lang/String;)Ljava/lang/Integer;", "getPlayers", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nVideoClickAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoClickAction.kt\ncom/lagradost/cloudstream3/actions/VideoClickActionHolder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,198:1\n1567#2:199\n1598#2,4:200\n774#2:204\n865#2,2:205\n1557#2:207\n1628#2,3:208\n295#2,2:211\n1567#2:213\n1598#2,4:214\n295#2,2:218\n774#2:220\n865#2,2:221\n1557#2:223\n1628#2,3:224\n*S KotlinDebug\n*F\n+ 1 VideoClickAction.kt\ncom/lagradost/cloudstream3/actions/VideoClickActionHolder\n*L\n77#1:199\n77#1:200,4\n78#1:204\n78#1:205,2\n79#1:207\n79#1:208,3\n84#1:211,2\n89#1:213\n89#1:214,4\n90#1:218,2\n94#1:220\n94#1:221,2\n70#1:223\n70#1:224,3\n*E\n"})
public final class VideoClickActionHolder {
    @NotNull
    public static final VideoClickActionHolder INSTANCE;
    @NotNull
    private static final List<VideoClickAction> allVideoClickActions;
    private static final int ACTION_ID_OFFSET = 1000;

    private VideoClickActionHolder() {
    }

    @NotNull
    public final List<VideoClickAction> getAllVideoClickActions() {
        return allVideoClickActions;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<Pair<UiText, Integer>> makeOptionMap(@Nullable Activity activity, @NotNull ResultEpisode video) {
        void $this$mapTo\8;
        Pair pair;
        Iterable iterable;
        Collection collection;
        Iterable iterable2;
        Intrinsics.checkNotNullParameter((Object)video, (String)"video");
        Iterable iterable3 = allVideoClickActions;
        boolean bl = false;
        Iterable iterable4 = iterable3;
        Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable3, (int)10));
        boolean bl2 = false;
        int n = 0;
        for (Object t : iterable2) {
            void id\3;
            void it\3;
            int n2;
            if ((n2 = n++) < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VideoClickAction videoClickAction = (VideoClickAction)t;
            int n3 = n2;
            collection = collection2;
            boolean bl3 = false;
            collection.add(TuplesKt.to((Object)it\3, (Object)((int)(id\3 + 1000))));
        }
        Iterable iterable5 = (List)collection2;
        boolean bl4 = false;
        iterable2 = iterable5;
        Collection collection3 = new ArrayList();
        boolean bl5 = false;
        for (Object t : iterable) {
            pair = (Pair)t;
            boolean bl6 = false;
            if (!((VideoClickAction)pair.getFirst()).shouldShowSafe((Context)activity, video)) continue;
            collection3.add(t);
        }
        Iterable iterable6 = (List)collection3;
        boolean bl7 = false;
        iterable = iterable6;
        Collection collection4 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable6, (int)10));
        boolean bl8 = false;
        for (Object t : $this$mapTo\8) {
            void it\9;
            pair = (Pair)t;
            collection = collection4;
            boolean bl9 = false;
            collection.add(TuplesKt.to((Object)((VideoClickAction)it\9.getFirst()).getName(), (Object)it\9.getSecond()));
        }
        return (List)collection4;
    }

    @Nullable
    public final VideoClickAction getActionById(int id2) {
        return (VideoClickAction)CollectionsKt.getOrNull(allVideoClickActions, (int)(id2 - 1000));
    }

    @Nullable
    public final VideoClickAction getByUniqueId(@NotNull String uniqueId) {
        Object v0;
        block1: {
            Intrinsics.checkNotNullParameter((Object)uniqueId, (String)"uniqueId");
            Iterable iterable = allVideoClickActions;
            boolean bl = false;
            for (Object t : iterable) {
                VideoClickAction videoClickAction = (VideoClickAction)t;
                boolean bl2 = false;
                if (!Intrinsics.areEqual((Object)videoClickAction.uniqueId(), (Object)uniqueId)) continue;
                v0 = t;
                break block1;
            }
            v0 = null;
        }
        return v0;
    }

    /*
     * WARNING - void declaration
     */
    @Nullable
    public final Integer uniqueIdToId(@Nullable String uniqueId) {
        Object v0;
        block4: {
            void $this$mapIndexedTo\2;
            if (uniqueId == null) {
                return null;
            }
            Iterable iterable = allVideoClickActions;
            boolean bl = false;
            Iterable iterable2 = iterable;
            Collection collection = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)iterable, (int)10));
            boolean bl2 = false;
            int n = 0;
            for (Object t : $this$mapIndexedTo\2) {
                void id\3;
                void it\3;
                int n2;
                if ((n2 = n++) < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                VideoClickAction videoClickAction = (VideoClickAction)t;
                int n3 = n2;
                Collection collection2 = collection;
                boolean bl3 = false;
                collection2.add(TuplesKt.to((Object)it\3, (Object)((int)(id\3 + 1000))));
            }
            Iterable iterable3 = (List)collection;
            boolean bl4 = false;
            for (Object e : iterable3) {
                Pair pair = (Pair)e;
                boolean bl5 = false;
                if (!Intrinsics.areEqual((Object)((VideoClickAction)pair.getFirst()).uniqueId(), (Object)uniqueId)) continue;
                v0 = e;
                break block4;
            }
            v0 = null;
        }
        Pair pair = v0;
        return pair != null ? (Integer)pair.getSecond() : null;
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    public final List<VideoClickAction> getPlayers(@Nullable Activity activity) {
        void $this$filterTo\2;
        Iterable iterable = allVideoClickActions;
        boolean bl = false;
        Iterable iterable2 = iterable;
        Collection collection = new ArrayList();
        boolean bl2 = false;
        for (Object t : $this$filterTo\2) {
            VideoClickAction videoClickAction = (VideoClickAction)t;
            boolean bl3 = false;
            if (!(videoClickAction.isPlayer() && videoClickAction.shouldShowSafe((Context)activity, null))) continue;
            collection.add(t);
        }
        return (List)collection;
    }

    public static /* synthetic */ List getPlayers$default(VideoClickActionHolder videoClickActionHolder, Activity activity, int n, Object object) {
        if ((n & 1) != 0) {
            activity = null;
        }
        return videoClickActionHolder.getPlayers(activity);
    }

    /*
     * WARNING - void declaration
     */
    static {
        void var3_6;
        Collection<String> collection;
        void $this$mapTo\2;
        void $this$map\1;
        INSTANCE = new VideoClickActionHolder();
        Object object = new VideoClickAction[]{new PlayInBrowserAction(), new CopyClipboardAction(), new ViewM3U8Action(), new VlcPackage(), new MpvPackage(null, null, 3, null), new NextPlayerPackage(), new JustPlayerPackage(), new FcastAction(), new LibreTorrentPackage(), new BiglyBTPackage(), new VlcNightlyPackage(), new WebVideoCastPackage(), new MpvYTDLPackage(), new MpvKtPackage(null, null, 3, null), new MpvKtPreviewPackage(), new AlwaysAskAction()};
        allVideoClickActions = Coroutines.INSTANCE.threadSafeListOf(object);
        object = allVideoClickActions;
        StringBuilder stringBuilder = new StringBuilder().append("allVideoClickActions: ");
        String string2 = "VideoClickActionHolder";
        Log log = Log.INSTANCE;
        boolean bl = false;
        void var2_5 = $this$map\1;
        Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map\1, (int)10));
        boolean bl2 = false;
        for (Object t : $this$mapTo\2) {
            void it\3;
            VideoClickAction videoClickAction = (VideoClickAction)t;
            collection = collection2;
            boolean bl3 = false;
            collection.add(it\3.uniqueId());
        }
        collection = (List)var3_6;
        log.d(string2, stringBuilder.append(collection).toString());
    }
}

