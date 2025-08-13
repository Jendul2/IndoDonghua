/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.collections.MapsKt
 *  kotlin.collections.SetsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.jdk7.AutoCloseableKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import android.app.Activity;
import android.content.Context;
import com.lagradost.cloudstream3.AcraApplication;
import com.lagradost.cloudstream3.R;
import com.lagradost.cloudstream3.actions.VideoClickAction;
import com.lagradost.cloudstream3.actions.temp.fcast.FcastManager;
import com.lagradost.cloudstream3.actions.temp.fcast.FcastSession;
import com.lagradost.cloudstream3.actions.temp.fcast.Opcode;
import com.lagradost.cloudstream3.actions.temp.fcast.PlayMessage;
import com.lagradost.cloudstream3.actions.temp.fcast.PublicDeviceInfo;
import com.lagradost.cloudstream3.ui.result.LinkLoadingResult;
import com.lagradost.cloudstream3.ui.result.ResultEpisode;
import com.lagradost.cloudstream3.utils.DataStoreHelper;
import com.lagradost.cloudstream3.utils.ExtractorLink;
import com.lagradost.cloudstream3.utils.ExtractorLinkType;
import com.lagradost.cloudstream3.utils.SingleSelectionHelper;
import com.lagradost.cloudstream3.utils.TextUtilKt;
import com.lagradost.cloudstream3.utils.UiText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0011\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J2\u0010\u0016\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096@\u00a2\u0006\u0002\u0010\u001cJ)\u0010\u001d\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0002\u00a2\u0006\u0002\u0010$R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006%"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastAction;", "Lcom/lagradost/cloudstream3/actions/VideoClickAction;", "<init>", "()V", "name", "Lcom/lagradost/cloudstream3/utils/UiText;", "getName", "()Lcom/lagradost/cloudstream3/utils/UiText;", "oneSource", "", "getOneSource", "()Z", "sourceTypes", "", "Lcom/lagradost/cloudstream3/utils/ExtractorLinkType;", "getSourceTypes", "()Ljava/util/Set;", "shouldShow", "context", "Landroid/content/Context;", "video", "Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;", "runAction", "", "result", "Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;", "index", "", "(Landroid/content/Context;Lcom/lagradost/cloudstream3/ui/result/ResultEpisode;Lcom/lagradost/cloudstream3/ui/result/LinkLoadingResult;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "castTo", "device", "Lcom/lagradost/cloudstream3/actions/temp/fcast/PublicDeviceInfo;", "link", "Lcom/lagradost/cloudstream3/utils/ExtractorLink;", "position", "", "(Lcom/lagradost/cloudstream3/actions/temp/fcast/PublicDeviceInfo;Lcom/lagradost/cloudstream3/utils/ExtractorLink;Ljava/lang/Long;)V", "app_prereleaseDebug"})
@SourceDebugExtension(value={"SMAP\nFcastAction.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FcastAction.kt\ncom/lagradost/cloudstream3/actions/temp/fcast/FcastAction\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,70:1\n1#2:71\n1557#3:72\n1628#3,3:73\n*S KotlinDebug\n*F\n+ 1 FcastAction.kt\ncom/lagradost/cloudstream3/actions/temp/fcast/FcastAction\n*L\n39#1:72\n39#1:73,3\n*E\n"})
public final class FcastAction
extends VideoClickAction {
    @NotNull
    private final UiText name = TextUtilKt.txt("Fcast to device");
    private final boolean oneSource;
    @NotNull
    private final Set<ExtractorLinkType> sourceTypes;

    public FcastAction() {
        this.oneSource = true;
        ExtractorLinkType[] extractorLinkTypeArray = new ExtractorLinkType[]{ExtractorLinkType.VIDEO, ExtractorLinkType.DASH, ExtractorLinkType.M3U8};
        this.sourceTypes = SetsKt.setOf((Object[])extractorLinkTypeArray);
    }

    @Override
    @NotNull
    public UiText getName() {
        return this.name;
    }

    @Override
    public boolean getOneSource() {
        return this.oneSource;
    }

    @Override
    @NotNull
    public Set<ExtractorLinkType> getSourceTypes() {
        return this.sourceTypes;
    }

    @Override
    public boolean shouldShow(@Nullable Context context, @Nullable ResultEpisode video) {
        return !((Collection)FcastManager.Companion.getCurrentDevices()).isEmpty();
    }

    @Override
    @Nullable
    public Object runAction(@Nullable Context context, @NotNull ResultEpisode video, @NotNull LinkLoadingResult result2, @Nullable Integer index, @NotNull Continuation<? super Unit> $completion) {
        Integer n = index;
        ExtractorLink extractorLink = (ExtractorLink)CollectionsKt.getOrNull(result2.getLinks(), (int)(n != null ? n : 0));
        if (extractorLink == null) {
            return Unit.INSTANCE;
        }
        ExtractorLink link = extractorLink;
        List devices = CollectionsKt.toList((Iterable)FcastManager.Companion.getCurrentDevices());
        return this.uiThread(() -> FcastAction.runAction$lambda$3(context, devices, video, this, link), $completion);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void castTo(PublicDeviceInfo device, ExtractorLink link, Long position) {
        Object object = device;
        if (object == null || (object = ((PublicDeviceInfo)object).getHost()) == null) {
            return;
        }
        Object host = object;
        AutoCloseable autoCloseable = new FcastSession((String)host);
        Throwable throwable = null;
        try {
            Double d;
            FcastSession fcastSession = (FcastSession)autoCloseable;
            boolean bl = false;
            FcastSession fcastSession2 = fcastSession;
            Opcode opcode = Opcode.Play;
            String string2 = link.getType().getMimeType();
            String string3 = link.getUrl();
            String string4 = null;
            Long l = position;
            if (l != null) {
                void it\2;
                long l2 = ((Number)l).longValue();
                String string5 = string4;
                String string6 = string3;
                String string7 = string2;
                Opcode opcode2 = opcode;
                FcastSession fcastSession3 = fcastSession2;
                boolean bl2 = false;
                Double d2 = (double)it\2 / 1000.0;
                fcastSession2 = fcastSession3;
                opcode = opcode2;
                string2 = string7;
                string3 = string6;
                string4 = string5;
                d = d2;
            } else {
                d = null;
            }
            Pair[] pairArray = new Pair[]{TuplesKt.to((Object)"referer", (Object)link.getReferer()), TuplesKt.to((Object)"user-agent", (Object)"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")};
            DefaultConstructorMarker defaultConstructorMarker = null;
            int n = 20;
            Map map = MapsKt.plus((Map)MapsKt.mapOf((Pair[])pairArray), link.getHeaders());
            Double d3 = null;
            Double d4 = d;
            String string8 = string4;
            String string9 = string3;
            String string10 = string2;
            fcastSession2.sendMessage(opcode, new PlayMessage(string10, string9, string8, d4, d3, map, n, defaultConstructorMarker));
            Unit unit = Unit.INSTANCE;
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            AutoCloseableKt.closeFinally((AutoCloseable)autoCloseable, (Throwable)throwable);
        }
    }

    private static final Unit runAction$lambda$3$lambda$1() {
        return Unit.INSTANCE;
    }

    private static final Unit runAction$lambda$3$lambda$2(ResultEpisode $video, FcastAction this$0, List $devices, ExtractorLink $link, int it) {
        DataStoreHelper.PosDur posDur = DataStoreHelper.INSTANCE.getViewPos($video.getId());
        Long position = posDur != null ? Long.valueOf(posDur.getPosition()) : null;
        this$0.castTo((PublicDeviceInfo)CollectionsKt.getOrNull((List)$devices, (int)it), $link, position);
        return Unit.INSTANCE;
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit runAction$lambda$3(Context $context, List $devices, ResultEpisode $video, FcastAction this$0, ExtractorLink $link) {
        Unit unit;
        Context context = $context;
        if (context != null && (context = AcraApplication.Companion.getActivity(context)) != null) {
            Collection<String> collection;
            void $this$mapTo\2;
            void $this$map\1;
            Iterable iterable = $devices;
            Context context2 = context;
            SingleSelectionHelper singleSelectionHelper = SingleSelectionHelper.INSTANCE;
            boolean bl = false;
            void var7_9 = $this$map\1;
            Collection collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map\1, (int)10));
            boolean bl2 = false;
            for (Object t : $this$mapTo\2) {
                void it\3;
                PublicDeviceInfo publicDeviceInfo = (PublicDeviceInfo)t;
                collection = collection2;
                boolean bl3 = false;
                collection.add(it\3.getName());
            }
            collection = (List)collection2;
            singleSelectionHelper.showBottomDialog((Activity)context2, (List<String>)collection, -1, TextUtilKt.txt(R.string.player_settings_select_cast_device, new Object[0]).asString($context), false, (Function0<Unit>)((Function0)FcastAction::runAction$lambda$3$lambda$1), (Function1<? super Integer, Unit>)((Function1)arg_0 -> FcastAction.runAction$lambda$3$lambda$2($video, this$0, $devices, $link, arg_0)));
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        return unit;
    }
}

