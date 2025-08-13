/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  androidx.core.content.FileProvider
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.io.FilesKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3.actions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultFragment;
import com.lagradost.cloudstream3.utils.DataStore;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import java.io.File;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b\u00a8\u0006\f"}, d2={"updateDurationAndPosition", "", "position", "", "duration", "makeTempM3U8Intent", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nOpenInAppAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OpenInAppAction.kt\ncom/lagradost/cloudstream3/actions/OpenInAppActionKt\n+ 2 AcraApplication.kt\ncom/lagradost/cloudstream3/AcraApplication$Companion\n+ 3 DataStore.kt\ncom/lagradost/cloudstream3/utils/DataStore\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n194#2:135\n192#3:136\n183#3,3:137\n174#3:140\n186#3,2:141\n29#4:143\n1863#5,2:144\n*S KotlinDebug\n*F\n+ 1 OpenInAppAction.kt\ncom/lagradost/cloudstream3/actions/OpenInAppActionKt\n*L\n24#1:135\n24#1:136\n24#1:137,3\n24#1:140\n24#1:141,2\n38#1:143\n52#1:144,2\n*E\n"})
public final class OpenInAppActionKt {
    /*
     * WARNING - void declaration
     */
    public static final void updateDurationAndPosition(long position, long duration) {
        Object object;
        DataStoreHelper dataStoreHelper;
        block6: {
            void this_\1;
            if (position <= 0L || duration <= 0L) {
                return;
            }
            AcraApplication.Companion companion = AcraApplication.Companion;
            String string2 = "last_opened_id";
            dataStoreHelper = DataStoreHelper.INSTANCE;
            boolean bl = false;
            Context context = this_\1.getContext();
            if (context != null) {
                void this_\2;
                DataStore dataStore = DataStore.INSTANCE;
                Context context2 = context;
                boolean bl2 = false;
                void var11_10 = this_\2;
                Context context3 = context2;
                Object object2 = null;
                boolean bl3 = false;
                try {
                    void this_\4;
                    void path\1;
                    void $this$getKey\3;
                    void this_\3;
                    String string3 = this_\3.getSharedPrefs((Context)$this$getKey\3).getString((String)path\1, null);
                    if (string3 == null) {
                        object = object2;
                        break block6;
                    }
                    String string4 = string3;
                    void var16_15 = this_\3;
                    String string5 = string4;
                    boolean bl4 = false;
                    Object object3 = this_\4.getMapper().readValue(string5, Integer.class);
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
        dataStoreHelper.setViewPos((Integer)object, position, duration);
        ResultFragment.updateUI$default(ResultFragment.INSTANCE, null, 1, null);
    }

    public static final void makeTempM3U8Intent(@NotNull Context context, @NotNull Intent intent, @NotNull LinkLoadingResult result2) {
        Intent intent22;
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)intent, (String)"intent");
        Intrinsics.checkNotNullParameter((Object)result2, (String)"result");
        if (result2.getLinks().size() == 1) {
            String intent22 = ((ExtractorLink)CollectionsKt.first(result2.getLinks())).getUrl();
            boolean bl = false;
            intent.setDataAndType(Uri.parse((String)intent22), "video/*");
            return;
        }
        Intent intent3 = intent22 = intent;
        boolean bl = false;
        intent3.addFlags(64);
        intent3.addFlags(128);
        intent3.addFlags(1);
        intent3.addFlags(2);
        File outputFile = File.createTempFile("mirrorlist", ".m3u8", context.getCacheDir());
        String text = null;
        text = "#EXTM3U\n#EXT-X-VERSION:3";
        Iterable iterable = result2.getLinks();
        boolean bl2 = false;
        for (Object t : iterable) {
            ExtractorLink extractorLink = (ExtractorLink)t;
            boolean bl3 = false;
            text = text + "\n#EXTINF:0," + extractorLink.getName() + '\n' + extractorLink.getUrl();
        }
        text = text + "\n#EXT-X-ENDLIST";
        Intrinsics.checkNotNull((Object)outputFile);
        FilesKt.writeText$default((File)outputFile, (String)text, null, (int)2, null);
        intent.setDataAndType(FileProvider.getUriForFile((Context)context, (String)(context.getApplicationContext().getPackageName() + ".provider"), (File)outputFile), "application/x-mpegURL");
    }
}

