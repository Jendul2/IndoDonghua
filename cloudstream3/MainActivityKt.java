/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.fasterxml.jackson.databind.DeserializationFeature
 *  com.fasterxml.jackson.databind.ObjectMapper
 *  com.fasterxml.jackson.module.kotlin.ExtensionsKt
 *  com.lagradost.nicehttp.Requests
 *  com.lagradost.nicehttp.ResponseParser
 *  kotlin.Metadata
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.MapsKt
 *  kotlin.jvm.JvmClassMappingKt
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.reflect.KClass
 *  org.jetbrains.annotations.NotNull
 */
package com.lagradost.cloudstream3;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import com.lagradost.nicehttp.Requests;
import com.lagradost.nicehttp.ResponseParser;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0000\u001a\u00020\u0001X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2={"app", "Lcom/lagradost/nicehttp/Requests;", "getApp", "()Lcom/lagradost/nicehttp/Requests;", "setApp", "(Lcom/lagradost/nicehttp/Requests;)V", "library"})
public final class MainActivityKt {
    @NotNull
    private static Requests app;

    @NotNull
    public static final Requests getApp() {
        return app;
    }

    public static final void setApp(@NotNull Requests requests) {
        Intrinsics.checkNotNullParameter((Object)requests, (String)"<set-?>");
        app = requests;
    }

    static {
        Requests requests;
        Requests $this$app_u24lambda_u240 = requests = new Requests(null, null, null, null, null, 0, null, 0L, new ResponseParser(){
            private final ObjectMapper mapper;
            {
                ObjectMapper objectMapper = ExtensionsKt.jacksonObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
                Intrinsics.checkNotNullExpressionValue((Object)objectMapper, (String)"configure(...)");
                this.mapper = objectMapper;
            }

            public final ObjectMapper getMapper() {
                return this.mapper;
            }

            public <T> T parse(String text, KClass<T> kClass) {
                Intrinsics.checkNotNullParameter((Object)text, (String)"text");
                Intrinsics.checkNotNullParameter(kClass, (String)"kClass");
                Object object = this.mapper.readValue(text, JvmClassMappingKt.getJavaClass(kClass));
                Intrinsics.checkNotNullExpressionValue((Object)object, (String)"readValue(...)");
                return (T)object;
            }

            public <T> T parseSafe(String text, KClass<T> kClass) {
                Object object;
                Intrinsics.checkNotNullParameter((Object)text, (String)"text");
                Intrinsics.checkNotNullParameter(kClass, (String)"kClass");
                try {
                    object = this.mapper.readValue(text, JvmClassMappingKt.getJavaClass(kClass));
                }
                catch (Exception e) {
                    object = null;
                }
                return (T)object;
            }

            public String writeValueAsString(Object obj2) {
                Intrinsics.checkNotNullParameter((Object)obj2, (String)"obj");
                String string2 = this.mapper.writeValueAsString(obj2);
                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"writeValueAsString(...)");
                return string2;
            }
        }, 255, null);
        boolean bl = false;
        $this$app_u24lambda_u240.setDefaultHeaders(MapsKt.mapOf((Pair)TuplesKt.to((Object)"user-agent", (Object)"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/116.0.0.0 Safari/537.36")));
        app = requests;
    }
}

