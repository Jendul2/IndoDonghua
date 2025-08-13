/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  androidx.annotation.WorkerThread
 *  com.lagradost.safefile.SafeFileKt
 *  kotlin.Metadata
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 *  kotlinx.coroutines.CoroutineScope
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3.actions.temp.fcast;

import android.util.Log;
import androidx.annotation.WorkerThread;
import com.lagradost.cloudstream3.actions.temp.fcast.Opcode;
import com.lagradost.cloudstream3.utils.AppUtils;
import com.lagradost.cloudstream3.utils.Coroutines;
import com.lagradost.safefile.SafeFileKt;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.net.Socket;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\f\u001a\u00020\u000bH\u0007J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0002J\u0006\u0010\u0010\u001a\u00020\u000eJ!\u0010\u0011\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u0002H\u0012\u00a2\u0006\u0002\u0010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2={"Lcom/lagradost/cloudstream3/actions/temp/fcast/FcastSession;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "hostAddress", "", "<init>", "(Ljava/lang/String;)V", "tag", "getTag", "()Ljava/lang/String;", "socket", "Ljava/net/Socket;", "open", "close", "", "acquireSocket", "ping", "sendMessage", "T", "opcode", "Lcom/lagradost/cloudstream3/actions/temp/fcast/Opcode;", "message", "(Lcom/lagradost/cloudstream3/actions/temp/fcast/Opcode;Ljava/lang/Object;)V", "app_prereleaseDebug"})
public final class FcastSession
implements AutoCloseable {
    @NotNull
    private final String hostAddress;
    @NotNull
    private final String tag;
    @Nullable
    private Socket socket;

    public FcastSession(@NotNull String hostAddress) {
        Intrinsics.checkNotNullParameter((Object)hostAddress, (String)"hostAddress");
        this.hostAddress = hostAddress;
        this.tag = "FcastSession";
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    @WorkerThread
    @NotNull
    public final Socket open() {
        Socket socket;
        this.socket = socket = new Socket(this.hostAddress, 46899);
        return socket;
    }

    @Override
    public void close() {
        Socket socket = this.socket;
        if (socket != null) {
            SafeFileKt.closeQuietly((Closeable)socket);
        }
        this.socket = null;
    }

    private final Socket acquireSocket() {
        Socket socket = this.socket;
        if (socket == null) {
            socket = this.open();
        }
        return socket;
    }

    public final void ping() {
        this.sendMessage(Opcode.Ping, null);
    }

    public final <T> void sendMessage(@NotNull Opcode opcode, T message) {
        Intrinsics.checkNotNullParameter((Object)((Object)opcode), (String)"opcode");
        Coroutines.INSTANCE.ioSafe(this, (Function3)new Function3<CoroutineScope, FcastSession, Continuation<? super Unit>, Object>(this, message, opcode, null){
            int label;
            final /* synthetic */ FcastSession this$0;
            final /* synthetic */ T $message;
            final /* synthetic */ Opcode $opcode;
            {
                this.this$0 = $receiver;
                this.$message = $message;
                this.$opcode = $opcode;
                super(3, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        socket = FcastSession.access$acquireSocket(this.this$0);
                        outputStream = new DataOutputStream(socket.getOutputStream());
                        v0 = this.$message;
                        json = v0 != null ? AppUtils.INSTANCE.toJson(v0) : null;
                        v1 = json;
                        if (v1 == null) ** GOTO lbl17
                        var7_5 = v1;
                        v2 = var7_5.getBytes(Charsets.UTF_8);
                        Intrinsics.checkNotNullExpressionValue((Object)v2, (String)"getBytes(...)");
                        v1 = v2;
                        if (v2 != null) ** GOTO lbl18
lbl17:
                        // 2 sources

                        v1 = new byte[0];
lbl18:
                        // 2 sources

                        content = v1;
                        size = ((Object)content).length + 1;
                        var8_8 = 0;
                        var9_9 = new byte[4];
                        while (var8_8 < 4) {
                            var10_10 = var8_8++;
                            var9_9[var10_10] = (byte)(size >> 8 * var10_10 & 255);
                        }
                        sizeArray = var9_9;
                        Log.d((String)this.this$0.getTag(), (String)("Sending message with size: " + size + ", opcode: " + (Object)this.$opcode));
                        outputStream.write(sizeArray);
                        var8_8 = 0;
                        var9_9 = new byte[1];
                        var11_11 = outputStream;
                        while (var8_8 < 1) {
                            var10_10 = var8_8++;
                            var9_9[var10_10] = this.$opcode.getValue();
                        }
                        var11_11.write(var9_9);
                        outputStream.write((byte[])content);
                        return Unit.INSTANCE;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Object invoke(CoroutineScope p1, FcastSession p2, Continuation<? super Unit> p3) {
                return new /* invalid duplicate definition of identical inner class */.invokeSuspend((Object)Unit.INSTANCE);
            }
        });
    }

    public static final /* synthetic */ Socket access$acquireSocket(FcastSession $this) {
        return $this.acquireSocket();
    }
}

