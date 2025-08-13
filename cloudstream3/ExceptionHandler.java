/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.Unit
 *  kotlin.io.CloseableKt
 *  kotlin.jvm.functions.Function0
 *  kotlin.jvm.internal.Intrinsics
 *  org.acra.ACRA
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.plugins.PluginManager;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.acra.ACRA;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0012"}, d2={"Lcom/lagradost/cloudstream3/ExceptionHandler;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "errorFile", "Ljava/io/File;", "onError", "Lkotlin/Function0;", "", "<init>", "(Ljava/io/File;Lkotlin/jvm/functions/Function0;)V", "getErrorFile", "()Ljava/io/File;", "getOnError", "()Lkotlin/jvm/functions/Function0;", "uncaughtException", "thread", "Ljava/lang/Thread;", "error", "", "app_prereleaseDebug"})
public final class ExceptionHandler
implements Thread.UncaughtExceptionHandler {
    @NotNull
    private final File errorFile;
    @NotNull
    private final Function0<Unit> onError;

    public ExceptionHandler(@NotNull File errorFile, @NotNull Function0<Unit> onError) {
        Intrinsics.checkNotNullParameter((Object)errorFile, (String)"errorFile");
        Intrinsics.checkNotNullParameter(onError, (String)"onError");
        this.errorFile = errorFile;
        this.onError = onError;
    }

    @NotNull
    public final File getErrorFile() {
        return this.errorFile;
    }

    @NotNull
    public final Function0<Unit> getOnError() {
        return this.onError;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable error) {
        Intrinsics.checkNotNullParameter((Object)thread, (String)"thread");
        Intrinsics.checkNotNullParameter((Object)error, (String)"error");
        ACRA.getErrorReporter().handleException(error);
        try {
            Closeable closeable = new PrintStream(this.errorFile);
            Throwable throwable = null;
            try {
                PrintStream printStream = (PrintStream)closeable;
                boolean bl = false;
                StringBuilder stringBuilder = new StringBuilder().append("Currently loading extension: ");
                String string2 = PluginManager.INSTANCE.getCurrentlyLoading();
                if (string2 == null) {
                    string2 = "none";
                }
                printStream.println(stringBuilder.append(string2).toString());
                printStream.println("Fatal exception on thread " + thread.getName() + " (" + thread.getId() + ')');
                error.printStackTrace(printStream);
                Unit unit = Unit.INSTANCE;
            }
            catch (Throwable throwable2) {
                throwable = throwable2;
                throw throwable2;
            }
            finally {
                CloseableKt.closeFinally((Closeable)closeable, (Throwable)throwable);
            }
        }
        catch (FileNotFoundException fileNotFoundException) {
            // empty catch block
        }
        try {
            this.onError.invoke();
        }
        catch (Exception exception) {
            // empty catch block
        }
        System.exit(1);
        throw new RuntimeException("System.exit returned normally, while it was supposed to halt JVM.");
    }
}

