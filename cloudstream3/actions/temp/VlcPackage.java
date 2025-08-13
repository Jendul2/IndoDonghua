/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Build$VERSION
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.lagradost.api.Log;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.actions.OpenInAppAction;
import com.lagradost.cloudstream3.actions.OpenInAppActionKt;
import com.lagradost.cloudstream3.ui.player.SubtitleData;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.DataStore;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J8\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096@\u00a2\u0006\u0002\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/VlcPackage;", "Lcom/lagradost/cloudstream3/actions/OpenInAppAction;", "<init>", "()V", "oneSource", "", "getOneSource", "()Z", "putExtra", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Landroid/content/Intent;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onResult", "activity", "Landroid/app/Activity;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nVlcPackage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VlcPackage.kt\ncom/lagradost/cloudstream3/actions/temp/VlcPackage\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n+ 3 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n+ 4 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,77:1\n29#2:78\n194#3:79\n192#4:80\n183#4,3:81\n174#4:84\n186#4,2:85\n295#5,2:87\n*S KotlinDebug\n*F\n+ 1 VlcPackage.kt\ncom/lagradost/cloudstream3/actions/temp/VlcPackage\n*L\n52#1:78\n63#1:79\n63#1:80\n63#1:81,3\n63#1:84\n63#1:85,2\n64#1:87,2\n*E\n"})
public class VlcPackage
extends OpenInAppAction {
    private final boolean oneSource;

    public VlcPackage() {
        super(TextUtilKt.txt("VLC"), "org.videolan.vlc", Build.VERSION.SDK_INT < 33 ? "org.videolan.vlc.gui.video.VideoPlayerActivity" : null, Build.VERSION.SDK_INT < 33 ? "org.videolan.vlc.player.result" : "android.intent.action.VIEW");
        this.oneSource = true;
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    @Nullable
    public Object putExtra(@NotNull Context context, @NotNull Intent intent, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        return VlcPackage.putExtra$suspendImpl(this, context, intent, video, result2, index, $completion);
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Object putExtra$suspendImpl(VlcPackage $this, Context context, Intent intent, ResultEpisode video, LinkLoadingResult result2, Integer index, Continuation<? super Unit> $completion) {
        block11: {
            Object v5;
            block10: {
                String string2;
                Object object;
                block9: {
                    void this_\2;
                    if (index != null) {
                        String string3 = result2.getLinks().get(index).getUrl();
                        boolean bl = false;
                        Intent intent2 = intent.setDataAndType(Uri.parse((String)string3), "video/*");
                        Intrinsics.checkNotNull((Object)intent2);
                    } else {
                        OpenInAppActionKt.makeTempM3U8Intent(context, intent, result2);
                    }
                    DataStoreHelper.PosDur posDur = DataStoreHelper.INSTANCE.getViewPos(Boxing.boxInt((int)video.getId()));
                    long position = posDur != null ? posDur.getPosition() : 0L;
                    intent.putExtra("from_start", false);
                    intent.putExtra("position", position);
                    intent.putExtra("secure_uri", true);
                    intent.putExtra("title", video.getName());
                    AcraApplication.Companion companion = AcraApplication.Companion;
                    String string4 = "subs_auto_select";
                    boolean bl = false;
                    Context context2 = this_\2.getContext();
                    if (context2 != null) {
                        void this_\3;
                        DataStore dataStore = DataStore.INSTANCE;
                        Context context3 = context2;
                        boolean bl2 = false;
                        void var18_24 = this_\3;
                        Context context4 = context3;
                        Object object2 = null;
                        boolean bl3 = false;
                        try {
                            void this_\5;
                            void $this$getKey\4;
                            void this_\4;
                            String string5 = this_\4.getSharedPrefs((Context)$this$getKey\4).getString(string4, null);
                            if (string5 == null) {
                                object = object2;
                                break block9;
                            }
                            String string6 = string5;
                            void var23_29 = this_\4;
                            String string7 = string6;
                            boolean bl4 = false;
                            Object object3 = this_\5.getMapper().readValue(string7, String.class);
                            object = object3;
                            Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"readValue(...)");
                        }
                        catch (Exception exception) {
                            object = null;
                        }
                    } else {
                        object = null;
                    }
                }
                if ((string2 = (String)object) == null) {
                    string2 = "en";
                }
                String subsLang = string2;
                Iterable iterable = result2.getSubs();
                boolean bl = false;
                for (Object t : iterable) {
                    SubtitleData subtitleData = (SubtitleData)t;
                    boolean bl5 = false;
                    if (!Intrinsics.areEqual((Object)subsLang, (Object)subtitleData.getLanguageCode())) continue;
                    v5 = t;
                    break block10;
                }
                v5 = null;
            }
            SubtitleData subtitleData = v5;
            if (subtitleData == null) break block11;
            SubtitleData subtitleData2 = subtitleData;
            boolean bl = false;
            intent.putExtra("subtitles_location", subtitleData2.getUrl());
        }
        return Unit.INSTANCE;
    }

    @Override
    public void onResult(@NotNull Activity activity, @Nullable Intent intent) {
        Intrinsics.checkNotNullParameter((Object)activity, (String)"activity");
        Intent intent2 = intent;
        long position = intent2 != null ? intent2.getLongExtra("extra_position", -1L) : -1L;
        Intent intent3 = intent;
        long duration = intent3 != null ? intent3.getLongExtra("extra_duration", -1L) : -1L;
        Log.INSTANCE.d("VLC", "Position: " + position + ", Duration: " + duration);
        OpenInAppActionKt.updateDurationAndPosition(position, duration);
    }
}

