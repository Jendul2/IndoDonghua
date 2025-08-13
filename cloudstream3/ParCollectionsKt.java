/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Deprecated
 *  kotlin.Metadata
 *  kotlin.ReplaceWith
 *  kotlin.ResultKt
 *  kotlin.Unit
 *  kotlin.collections.CollectionsKt
 *  kotlin.coroutines.Continuation
 *  kotlin.coroutines.intrinsics.IntrinsicsKt
 *  kotlin.coroutines.jvm.internal.Boxing
 *  kotlin.jvm.functions.Function1
 *  kotlin.jvm.functions.Function2
 *  kotlin.jvm.functions.Function3
 *  kotlin.jvm.internal.Intrinsics
 *  kotlinx.coroutines.BuildersKt
 *  kotlinx.coroutines.CoroutineScope
 *  kotlinx.coroutines.CoroutineScopeKt
 *  kotlinx.coroutines.Deferred
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.lagradost.cloudstream3;

import com.lagradost.cloudstream3.mvvm.ArchComponentExtKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=2, xi=48, d1={"\u0000@\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ah\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0002*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00052.\u0010\u0006\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0086@\u00a2\u0006\u0002\u0010\u000b\u001ag\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004\"\u0004\b\u0002\u0010\u0002*\u0010\u0012\u0006\b\u0001\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00052.\u0010\u0006\u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\b\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0007\u00a2\u0006\u0002\u0010\r\u001aN\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000f0\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0086@\u00a2\u0006\u0002\u0010\u0010\u001aM\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000f0\u00012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007H\u0007\u00a2\u0006\u0002\u0010\u0011\u001ab\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000f0\u000127\u0010\u0006\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013H\u0007\u00a2\u0006\u0002\u0010\u0018\u001ac\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0001\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000f0\u000127\u0010\u0006\u001a3\b\u0001\u0012\u0013\u0012\u00110\u0014\u00a2\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u0002H\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0013H\u0086@\u00a2\u0006\u0002\u0010\u001a\u001a[\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u00022>\u0010\u001c\u001a \u0012\u001c\b\u0001\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e0\u001d\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0007\u00a2\u0006\u0002\u0010\u001f\u001a\\\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0001\"\u0004\b\u0000\u0010\u00022>\u0010\u001c\u001a \u0012\u001c\b\u0001\u0012\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e0\u001d\"\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001eH\u0086@\u00a2\u0006\u0002\u0010!\u00a8\u0006\""}, d2={"amap", "", "R", "K", "V", "", "f", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "apmap", "(Ljava/util/Map;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "B", "A", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "apmapIndexed", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "index", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;)Ljava/util/List;", "amapIndexed", "(Ljava/util/List;Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "argamap", "transforms", "", "Lkotlin/Function1;", "([Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "runAllAsync", "([Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "library"})
public final class ParCollectionsKt {
    @Nullable
    public static final <K, V, R> Object amap(@NotNull Map<? extends K, ? extends V> $this$amap, @NotNull Function2<? super Map.Entry<? extends K, ? extends V>, ? super Continuation<? super R>, ? extends Object> f, @NotNull Continuation<? super List<? extends R>> $completion) throws CancellationException {
        return CoroutineScopeKt.coroutineScope((Function2)new Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object>($this$amap, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ Map<? extends K, V> $this_amap;
            final /* synthetic */ Function2<Map.Entry<? extends K, ? extends V>, Continuation<? super R>, Object> $f;
            {
                this.$this_amap = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$coroutineScope = (CoroutineScope)this.L$0;
                        CoroutineScopeKt.ensureActive((CoroutineScope)$this$coroutineScope);
                        var3_4 = this.$this_amap;
                        var4_5 = this.$f;
                        $i$f$map = false;
                        var6_9 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>($this$map$iv.size());
                        $i$f$mapTo = false;
                        var9_14 = $this$mapTo$iv$iv.entrySet().iterator();
                        while (var9_14.hasNext()) {
                            var11_16 /* !! */  = item$iv$iv /* !! */  = var9_14.next();
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$amap$2$1 = false;
                            var13_19.add(BuildersKt.async$default((CoroutineScope)$this$coroutineScope, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super R>, Object>(var4_5, it, null){
                                int label;
                                final /* synthetic */ Function2<Map.Entry<? extends K, ? extends V>, Continuation<? super R>, Object> $f;
                                final /* synthetic */ Map.Entry<K, V> $it;
                                {
                                    this.$f = $f;
                                    this.$it = $it;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke(this.$it, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super R> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$map = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl27:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            item$iv$iv /* !! */  = (Deferred)item$iv$iv;
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$amap$2$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var13_19;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl51
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$amap$2$2 = false;
                        var13_19 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl51:
                        // 2 sources

                        var13_19.add(v0);
                        ** GOTO lbl27
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends R>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, $completion);
    }

    @Deprecated(message="This blocks with runBlocking, and should not be used inside a suspended context", replaceWith=@ReplaceWith(expression="amap(f)", imports={"com.lagradost.cloudstream3.amap"}))
    @NotNull
    public static final <K, V, R> List<R> apmap(@NotNull Map<? extends K, ? extends V> $this$apmap, @NotNull Function2<? super Map.Entry<? extends K, ? extends V>, ? super Continuation<? super R>, ? extends Object> f) throws CancellationException {
        Intrinsics.checkNotNullParameter($this$apmap, (String)"<this>");
        Intrinsics.checkNotNullParameter(f, (String)"f");
        return (List)BuildersKt.runBlocking$default(null, (Function2)new Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object>($this$apmap, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ Map<? extends K, V> $this_apmap;
            final /* synthetic */ Function2<Map.Entry<? extends K, ? extends V>, Continuation<? super R>, Object> $f;
            {
                this.$this_apmap = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$runBlocking = (CoroutineScope)this.L$0;
                        var3_4 = this.$this_apmap;
                        var4_5 = this.$f;
                        $i$f$map = false;
                        var6_9 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>($this$map$iv.size());
                        $i$f$mapTo = false;
                        var9_14 = $this$mapTo$iv$iv.entrySet().iterator();
                        while (var9_14.hasNext()) {
                            var11_16 = item$iv$iv = var9_14.next();
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$apmap$1$1 = false;
                            var13_19.add(BuildersKt.async$default((CoroutineScope)$this$runBlocking, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super R>, Object>(var4_5, it, null){
                                int label;
                                final /* synthetic */ Function2<Map.Entry<? extends K, ? extends V>, Continuation<? super R>, Object> $f;
                                final /* synthetic */ Map.Entry<K, V> $it;
                                {
                                    this.$f = $f;
                                    this.$it = $it;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke(this.$it, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super R> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$map = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl26:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            item$iv$iv = (Deferred)item$iv$iv;
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$apmap$1$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var13_19;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl50
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$apmap$1$2 = false;
                        var13_19 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl50:
                        // 2 sources

                        var13_19.add(v0);
                        ** GOTO lbl26
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends R>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, (int)1, null);
    }

    @Nullable
    public static final <A, B> Object amap(@NotNull List<? extends A> $this$amap, @NotNull Function2<? super A, ? super Continuation<? super B>, ? extends Object> f, @NotNull Continuation<? super List<? extends B>> $completion) throws CancellationException {
        return CoroutineScopeKt.coroutineScope((Function2)new Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object>($this$amap, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ List<A> $this_amap;
            final /* synthetic */ Function2<A, Continuation<? super B>, Object> $f;
            {
                this.$this_amap = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$coroutineScope = (CoroutineScope)this.L$0;
                        CoroutineScopeKt.ensureActive((CoroutineScope)$this$coroutineScope);
                        var3_4 = this.$this_amap;
                        var4_5 = this.$f;
                        $i$f$map = false;
                        var6_9 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var9_14 = $this$mapTo$iv$iv.iterator();
                        while (var9_14.hasNext()) {
                            var11_16 /* !! */  = item$iv$iv /* !! */  = var9_14.next();
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$amap$4$1 = false;
                            var13_19.add(BuildersKt.async$default((CoroutineScope)$this$coroutineScope, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super B>, Object>(var4_5, it, null){
                                int label;
                                final /* synthetic */ Function2<A, Continuation<? super B>, Object> $f;
                                final /* synthetic */ A $it;
                                {
                                    this.$f = $f;
                                    this.$it = $it;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke(this.$it, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super B> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$map = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl27:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            item$iv$iv /* !! */  = (Deferred)item$iv$iv;
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$amap$4$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var13_19;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl51
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$amap$4$2 = false;
                        var13_19 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl51:
                        // 2 sources

                        var13_19.add(v0);
                        ** GOTO lbl27
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends B>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, $completion);
    }

    @Deprecated(message="This blocks with runBlocking, and should not be used inside a suspended context", replaceWith=@ReplaceWith(expression="amap(f)", imports={"com.lagradost.cloudstream3.amap"}))
    @NotNull
    public static final <A, B> List<B> apmap(@NotNull List<? extends A> $this$apmap, @NotNull Function2<? super A, ? super Continuation<? super B>, ? extends Object> f) throws CancellationException {
        Intrinsics.checkNotNullParameter($this$apmap, (String)"<this>");
        Intrinsics.checkNotNullParameter(f, (String)"f");
        return (List)BuildersKt.runBlocking$default(null, (Function2)new Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object>($this$apmap, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ List<A> $this_apmap;
            final /* synthetic */ Function2<A, Continuation<? super B>, Object> $f;
            {
                this.$this_apmap = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             * Could not resolve type clashes
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$runBlocking = (CoroutineScope)this.L$0;
                        var3_4 = this.$this_apmap;
                        var4_5 = this.$f;
                        $i$f$map = false;
                        var6_9 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var9_14 = $this$mapTo$iv$iv.iterator();
                        while (var9_14.hasNext()) {
                            var11_16 /* !! */  = item$iv$iv /* !! */  = var9_14.next();
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$apmap$2$1 = false;
                            var13_19.add(BuildersKt.async$default((CoroutineScope)$this$runBlocking, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super B>, Object>(var4_5, it, null){
                                int label;
                                final /* synthetic */ Function2<A, Continuation<? super B>, Object> $f;
                                final /* synthetic */ A $it;
                                {
                                    this.$f = $f;
                                    this.$it = $it;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke(this.$it, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super B> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$map = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl26:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            item$iv$iv /* !! */  = (Deferred)item$iv$iv;
                            var13_19 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$apmap$2$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var13_19;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl50
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$apmap$2$2 = false;
                        var13_19 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl50:
                        // 2 sources

                        var13_19.add(v0);
                        ** GOTO lbl26
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends B>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, (int)1, null);
    }

    @Deprecated(message="This blocks with runBlocking, and should not be used inside a suspended context", replaceWith=@ReplaceWith(expression="amapIndexed(f)", imports={"com.lagradost.cloudstream3.amapIndexed"}))
    @NotNull
    public static final <A, B> List<B> apmapIndexed(@NotNull List<? extends A> $this$apmapIndexed, @NotNull Function3<? super Integer, ? super A, ? super Continuation<? super B>, ? extends Object> f) throws CancellationException {
        Intrinsics.checkNotNullParameter($this$apmapIndexed, (String)"<this>");
        Intrinsics.checkNotNullParameter(f, (String)"f");
        return (List)BuildersKt.runBlocking$default(null, (Function2)new Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object>($this$apmapIndexed, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ List<A> $this_apmapIndexed;
            final /* synthetic */ Function3<Integer, A, Continuation<? super B>, Object> $f;
            {
                this.$this_apmapIndexed = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var17_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$runBlocking = (CoroutineScope)this.L$0;
                        var3_4 = this.$this_apmapIndexed;
                        var4_5 = this.$f;
                        $i$f$mapIndexed = false;
                        var6_9 = $this$mapIndexed$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$mapIndexed$iv, (int)10));
                        $i$f$mapIndexedTo = false;
                        index$iv$iv = 0;
                        for (T item$iv$iv : $this$mapIndexedTo$iv$iv) {
                            if ((var12_19 = index$iv$iv++) < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            var13_20 = item$iv$iv;
                            var14_21 = var12_19;
                            var16_23 = destination$iv$iv;
                            $i$a$-mapIndexed-ParCollectionsKt$apmapIndexed$1$1 = false;
                            var16_23.add(BuildersKt.async$default((CoroutineScope)$this$runBlocking, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super B>, Object>(var4_5, (int)index, a, null){
                                int label;
                                final /* synthetic */ Function3<Integer, A, Continuation<? super B>, Object> $f;
                                final /* synthetic */ int $index;
                                final /* synthetic */ A $a;
                                {
                                    this.$f = $f;
                                    this.$index = $index;
                                    this.$a = $a;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke((Object)Boxing.boxInt((int)this.$index), this.$a, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super B> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$mapIndexed = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl29:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            var10_16 = (Deferred)item$iv$iv;
                            var16_23 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$apmapIndexed$1$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var16_23;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var17_2) {
                                return var17_2;
                            }
                            ** GOTO lbl53
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$apmapIndexed$1$2 = false;
                        var16_23 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl53:
                        // 2 sources

                        var16_23.add(v0);
                        ** GOTO lbl29
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends B>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, (int)1, null);
    }

    @Nullable
    public static final <A, B> Object amapIndexed(@NotNull List<? extends A> $this$amapIndexed, @NotNull Function3<? super Integer, ? super A, ? super Continuation<? super B>, ? extends Object> f, @NotNull Continuation<? super List<? extends B>> $completion) throws CancellationException {
        return CoroutineScopeKt.coroutineScope((Function2)new Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object>($this$amapIndexed, f, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ List<A> $this_amapIndexed;
            final /* synthetic */ Function3<Integer, A, Continuation<? super B>, Object> $f;
            {
                this.$this_amapIndexed = $receiver;
                this.$f = $f;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var17_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$coroutineScope = (CoroutineScope)this.L$0;
                        CoroutineScopeKt.ensureActive((CoroutineScope)$this$coroutineScope);
                        var3_4 = this.$this_amapIndexed;
                        var4_5 = this.$f;
                        $i$f$mapIndexed = false;
                        var6_9 = $this$mapIndexed$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$mapIndexed$iv, (int)10));
                        $i$f$mapIndexedTo = false;
                        index$iv$iv = 0;
                        for (E item$iv$iv : $this$mapIndexedTo$iv$iv) {
                            if ((var12_19 = index$iv$iv++) < 0) {
                                CollectionsKt.throwIndexOverflow();
                            }
                            var13_20 = item$iv$iv;
                            var14_21 = var12_19;
                            var16_23 = destination$iv$iv;
                            $i$a$-mapIndexed-ParCollectionsKt$amapIndexed$2$1 = false;
                            var16_23.add(BuildersKt.async$default((CoroutineScope)$this$coroutineScope, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super B>, Object>(var4_5, (int)index, a, null){
                                int label;
                                final /* synthetic */ Function3<Integer, A, Continuation<? super B>, Object> $f;
                                final /* synthetic */ int $index;
                                final /* synthetic */ A $a;
                                {
                                    this.$f = $f;
                                    this.$index = $index;
                                    this.$a = $a;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$f.invoke((Object)Boxing.boxInt((int)this.$index), this.$a, (Object)((Object)this));
                                            if (object3 != object2) return object3;
                                            return object2;
                                        }
                                        case 1: {
                                            void $result;
                                            ResultKt.throwOnFailure((Object)$result);
                                            Object object3 = $result;
                                            return object3;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super B> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $i$f$mapIndexed = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_13 = $this$mapTo$iv$iv.iterator();
lbl30:
                        // 2 sources

                        while (var8_13.hasNext()) {
                            item$iv$iv = var8_13.next();
                            var10_16 = (Deferred)item$iv$iv;
                            var16_23 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$amapIndexed$2$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_13;
                            this.L$2 = var16_23;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var17_2) {
                                return var17_2;
                            }
                            ** GOTO lbl54
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$amapIndexed$2$2 = false;
                        var16_23 = (Collection)this.L$2;
                        var8_13 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl54:
                        // 2 sources

                        var16_23.add(v0);
                        ** GOTO lbl30
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends B>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends B>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, $completion);
    }

    @Deprecated(message="This blocks with runBlocking, and should not be used inside a suspended context", replaceWith=@ReplaceWith(expression="runAllAsync(transforms)", imports={"com.lagradost.cloudstream3.runAllAsync"}))
    @NotNull
    public static final <R> List<R> argamap(Function1<? super Continuation<? super R>, ? extends Object> ... transforms) throws CancellationException {
        Intrinsics.checkNotNullParameter(transforms, (String)"transforms");
        return (List)BuildersKt.runBlocking$default(null, (Function2)new Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object>(transforms, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ Function1<Continuation<? super R>, Object>[] $transforms;
            {
                this.$transforms = $transforms;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$runBlocking = (CoroutineScope)this.L$0;
                        $this$map$iv = this.$transforms;
                        $i$f$map = false;
                        var5_6 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(((Function1<Continuation<? super R>, Object>[])$this$map$iv).length);
                        $i$f$mapTo = false;
                        for (Deferred item$iv$iv : $this$mapTo$iv$iv) {
                            var11_14 = item$iv$iv;
                            var13_17 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$argamap$1$1 = false;
                            var13_17.add(BuildersKt.async$default((CoroutineScope)$this$runBlocking, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super R>, Object>(it, null){
                                int label;
                                final /* synthetic */ Function1<Continuation<? super R>, Object> $it;
                                {
                                    this.$it = $it;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$it.invoke((Object)((Object)this));
                                            Object object4 = object3;
                                            if (object3 != object2) return object4;
                                            return object2;
                                        }
                                        case 1: {
                                            Object object4;
                                            try {
                                                void $result;
                                                ResultKt.throwOnFailure((Object)$result);
                                                object4 = $result;
                                                return object4;
                                            }
                                            catch (Exception e) {
                                                ArchComponentExtKt.logError(e);
                                                return null;
                                            }
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super R> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $this$mapTo$iv$iv = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_10 = $this$mapTo$iv$iv.iterator();
lbl25:
                        // 2 sources

                        while (var8_10.hasNext()) {
                            item$iv$iv = var8_10.next();
                            item$iv$iv = (Deferred)item$iv$iv;
                            var13_17 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$argamap$1$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_10;
                            this.L$2 = var13_17;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl49
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$argamap$1$2 = false;
                        var13_17 = (Collection)this.L$2;
                        var8_10 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl49:
                        // 2 sources

                        var13_17.add(v0);
                        ** GOTO lbl25
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends R>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, (int)1, null);
    }

    @Nullable
    public static final <R> Object runAllAsync(@NotNull Function1<? super Continuation<? super R>, ? extends Object>[] transforms, @NotNull Continuation<? super List<? extends R>> $completion) throws CancellationException {
        return CoroutineScopeKt.coroutineScope((Function2)new Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object>(transforms, null){
            Object L$1;
            Object L$2;
            int label;
            private /* synthetic */ Object L$0;
            final /* synthetic */ Function1<Continuation<? super R>, Object>[] $transforms;
            {
                this.$transforms = $transforms;
                super(2, $completion);
            }

            /*
             * Unable to fully structure code
             */
            public final Object invokeSuspend(Object var1_1) {
                var14_2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (this.label) {
                    case 0: {
                        ResultKt.throwOnFailure((Object)var1_1);
                        $this$coroutineScope = (CoroutineScope)this.L$0;
                        CoroutineScopeKt.ensureActive((CoroutineScope)$this$coroutineScope);
                        $this$map$iv = this.$transforms;
                        $i$f$map = false;
                        var5_6 = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(((Function1<Continuation<? super R>, Object>[])$this$map$iv).length);
                        $i$f$mapTo = false;
                        var9_11 = ((void)$this$mapTo$iv$iv).length;
                        for (var8_9 = 0; var8_9 < var9_11; ++var8_9) {
                            var11_14 = item$iv$iv = $this$mapTo$iv$iv[var8_9];
                            var13_17 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$runAllAsync$2$1 = false;
                            var13_17.add(BuildersKt.async$default((CoroutineScope)$this$coroutineScope, null, null, (Function2)((Function2)new Function2<CoroutineScope, Continuation<? super R>, Object>(fn, null){
                                int label;
                                final /* synthetic */ Function1<Continuation<? super R>, Object> $fn;
                                {
                                    this.$fn = $fn;
                                    super(2, $completion);
                                }

                                /*
                                 * WARNING - void declaration
                                 * Enabled force condition propagation
                                 * Lifted jumps to return sites
                                 */
                                public final Object invokeSuspend(Object object) {
                                    Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    switch (this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure((Object)object);
                                            this.label = 1;
                                            Object object3 = this.$fn.invoke((Object)((Object)this));
                                            Object object4 = object3;
                                            if (object3 != object2) return object4;
                                            return object2;
                                        }
                                        case 1: {
                                            Object object4;
                                            try {
                                                void $result;
                                                ResultKt.throwOnFailure((Object)$result);
                                                object4 = $result;
                                                return object4;
                                            }
                                            catch (Exception e) {
                                                ArchComponentExtKt.logError(e);
                                                return null;
                                            }
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }

                                public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                                    return (Continuation)new /* invalid duplicate definition of identical inner class */;
                                }

                                public final Object invoke(CoroutineScope p1, Continuation<? super R> p2) {
                                    return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
                                }
                            }), (int)3, null));
                        }
                        $this$map$iv = (List)destination$iv$iv;
                        $i$f$map = false;
                        $this$mapTo$iv$iv = $this$map$iv;
                        destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, (int)10));
                        $i$f$mapTo = false;
                        var8_10 = $this$mapTo$iv$iv.iterator();
lbl27:
                        // 2 sources

                        while (var8_10.hasNext()) {
                            item$iv$iv = var8_10.next();
                            item$iv$iv = (Deferred)item$iv$iv;
                            var13_17 = destination$iv$iv;
                            $i$a$-map-ParCollectionsKt$runAllAsync$2$2 = false;
                            this.L$0 = destination$iv$iv;
                            this.L$1 = var8_10;
                            this.L$2 = var13_17;
                            this.label = 1;
                            v0 = it.await((Continuation)this);
                            if (v0 == var14_2) {
                                return var14_2;
                            }
                            ** GOTO lbl51
                        }
                        break;
                    }
                    case 1: {
                        $i$f$map = false;
                        $i$f$mapTo = false;
                        $i$a$-map-ParCollectionsKt$runAllAsync$2$2 = false;
                        var13_17 = (Collection)this.L$2;
                        var8_10 = (Iterator<T>)this.L$1;
                        destination$iv$iv = (Collection)this.L$0;
                        ResultKt.throwOnFailure((Object)$result);
                        v0 = $result;
lbl51:
                        // 2 sources

                        var13_17.add(v0);
                        ** GOTO lbl27
                    }
                }
                return (List)destination$iv$iv;
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            public final Continuation<Unit> create(Object value, Continuation<?> $completion) {
                Function2<CoroutineScope, Continuation<? super List<? extends R>>, Object> function2 = new /* invalid duplicate definition of identical inner class */;
                function2.L$0 = value;
                return (Continuation)function2;
            }

            public final Object invoke(CoroutineScope p1, Continuation<? super List<? extends R>> p2) {
                return (this.create(p1, p2)).invokeSuspend(Unit.INSTANCE);
            }
        }, $completion);
    }
}

