/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  okhttp3.OkHttpClient
 *  okhttp3.OkHttpClient$Builder
 *  okhttp3.Request$Builder
 *  okhttp3.RequestBody
 *  okhttp3.Response
 *  okhttp3.ResponseBody
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.schabi.newpipe.extractor.downloader.Downloader
 *  org.schabi.newpipe.extractor.downloader.Request
 *  org.schabi.newpipe.extractor.downloader.Response
 *  org.schabi.newpipe.extractor.exceptions.ReCaptchaException
 */
package com.lagradost.cloudstream3;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.schabi.newpipe.extractor.downloader.Downloader;
import org.schabi.newpipe.extractor.downloader.Request;
import org.schabi.newpipe.extractor.exceptions.ReCaptchaException;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2={"Lcom/lagradost/cloudstream3/DownloaderTestImpl;", "Lorg/schabi/newpipe/extractor/downloader/Downloader;", "builder", "Lokhttp3/OkHttpClient$Builder;", "<init>", "(Lokhttp3/OkHttpClient$Builder;)V", "client", "Lokhttp3/OkHttpClient;", "execute", "Lorg/schabi/newpipe/extractor/downloader/Response;", "request", "Lorg/schabi/newpipe/extractor/downloader/Request;", "Companion", "app_prereleaseDebug"})
public final class DownloaderTestImpl
extends Downloader {
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final OkHttpClient client;
    @NotNull
    private static final String USER_AGENT = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36";
    @Nullable
    private static DownloaderTestImpl instance;

    private DownloaderTestImpl(OkHttpClient.Builder builder) {
        this.client = builder.readTimeout(30L, TimeUnit.SECONDS).build();
    }

    @NotNull
    public org.schabi.newpipe.extractor.downloader.Response execute(@NotNull Request request) {
        Intrinsics.checkNotNullParameter((Object)request, (String)"request");
        String string2 = request.httpMethod();
        Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"httpMethod(...)");
        String httpMethod = string2;
        String string3 = request.url();
        Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"url(...)");
        String url = string3;
        Map map = request.headers();
        Intrinsics.checkNotNullExpressionValue((Object)map, (String)"headers(...)");
        Map headers = map;
        byte[] dataToSend = request.dataToSend();
        RequestBody requestBody = null;
        if (dataToSend != null) {
            requestBody = RequestBody.Companion.create(dataToSend, null, 0, dataToSend.length);
        }
        Request.Builder requestBuilder = new Request.Builder().method(httpMethod, requestBody).url(url).addHeader("User-Agent", USER_AGENT);
        for (Map.Entry entry : headers.entrySet()) {
            String headerName = (String)entry.getKey();
            List headerValueList = (List)entry.getValue();
            if (headerValueList.size() > 1) {
                requestBuilder.removeHeader(headerName);
                for (String headerValue : headerValueList) {
                    requestBuilder.addHeader(headerName, headerValue);
                }
                continue;
            }
            if (headerValueList.size() != 1) continue;
            requestBuilder.header(headerName, (String)headerValueList.get(0));
        }
        Response response2 = this.client.newCall(requestBuilder.build()).execute();
        if (response2.code() == 429) {
            response2.close();
            throw new ReCaptchaException("reCaptcha Challenge requested", url);
        }
        ResponseBody body = response2.body();
        String responseBodyToReturn = body.string();
        String latestUrl = response2.request().url().toString();
        return new org.schabi.newpipe.extractor.downloader.Response(response2.code(), response2.message(), response2.headers().toMultimap(), responseBodyToReturn, latestUrl);
    }

    public /* synthetic */ DownloaderTestImpl(OkHttpClient.Builder builder, DefaultConstructorMarker $constructor_marker) {
        this(builder);
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\nJ\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2={"Lcom/lagradost/cloudstream3/DownloaderTestImpl$Companion;", "", "<init>", "()V", "USER_AGENT", "", "instance", "Lcom/lagradost/cloudstream3/DownloaderTestImpl;", "init", "builder", "Lokhttp3/OkHttpClient$Builder;", "getInstance", "app_prereleaseDebug"})
    public static final class Companion {
        private Companion() {
        }

        @Nullable
        public final DownloaderTestImpl init(@Nullable OkHttpClient.Builder builder) {
            OkHttpClient.Builder builder2 = builder;
            if (builder2 == null) {
                builder2 = new OkHttpClient.Builder();
            }
            instance = new DownloaderTestImpl(builder2, null);
            return instance;
        }

        @Nullable
        public final DownloaderTestImpl getInstance() {
            if (instance == null) {
                this.init(null);
            }
            return instance;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

