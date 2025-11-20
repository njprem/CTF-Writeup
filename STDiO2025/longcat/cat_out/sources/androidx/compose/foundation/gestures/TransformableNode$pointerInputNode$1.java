package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.TransformEvent;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.Channel;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1", f = "Transformable.kt", i = {}, l = {155}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
public final class TransformableNode$pointerInputNode$1 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TransformableNode this$0;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1", f = "Transformable.kt", i = {}, l = {174}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ PointerInputScope $$this$SuspendingPointerInputModifierNode;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TransformableNode this$0;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1", f = "Transformable.kt", i = {0, 0, 1}, l = {158, 161}, m = "invokeSuspend", n = {"$this$launch", "event", "$this$launch"}, s = {"L$0", "L$1", "L$0"})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00281 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            private /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ TransformableNode this$0;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1", f = "Transformable.kt", i = {0}, l = {166}, m = "invokeSuspend", n = {"$this$transform"}, s = {"L$0"})
            /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00291 extends SuspendLambda implements Function2<TransformScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ Ref.ObjectRef<TransformEvent> $event;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;
                final /* synthetic */ TransformableNode this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00291(Ref.ObjectRef<TransformEvent> objectRef, TransformableNode transformableNode, Continuation<? super C00291> continuation) {
                    super(2, continuation);
                    this.$event = objectRef;
                    this.this$0 = transformableNode;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00291 c00291 = new C00291(this.$event, this.this$0, continuation);
                    c00291.L$0 = obj;
                    return c00291;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransformScope transformScope, Continuation<? super Unit> continuation) {
                    return ((C00291) create(transformScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005a -> B:20:0x005d). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                    /*
                        r6 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r6.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r6.L$1
                        kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                        java.lang.Object r3 = r6.L$0
                        androidx.compose.foundation.gestures.TransformScope r3 = (androidx.compose.foundation.gestures.TransformScope) r3
                        kotlin.ResultKt.throwOnFailure(r7)
                        goto L5d
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        kotlin.ResultKt.throwOnFailure(r7)
                        java.lang.Object r7 = r6.L$0
                        androidx.compose.foundation.gestures.TransformScope r7 = (androidx.compose.foundation.gestures.TransformScope) r7
                        r3 = r7
                    L27:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r7 = r6.$event
                        T r7 = r7.element
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStopped
                        if (r1 != 0) goto L60
                        boolean r1 = r7 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformDelta
                        if (r1 == 0) goto L36
                        androidx.compose.foundation.gestures.TransformEvent$TransformDelta r7 = (androidx.compose.foundation.gestures.TransformEvent.TransformDelta) r7
                        goto L37
                    L36:
                        r7 = 0
                    L37:
                        if (r7 == 0) goto L48
                        float r1 = r7.getZoomChange()
                        long r4 = r7.getPanChange()
                        float r7 = r7.getRotationChange()
                        r3.mo365transformByd4ec7I(r1, r4, r7)
                    L48:
                        kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.foundation.gestures.TransformEvent> r1 = r6.$event
                        androidx.compose.foundation.gestures.TransformableNode r7 = r6.this$0
                        kotlinx.coroutines.channels.Channel r7 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r7)
                        r6.L$0 = r3
                        r6.L$1 = r1
                        r6.label = r2
                        java.lang.Object r7 = r7.receive(r6)
                        if (r7 != r0) goto L5d
                        return r0
                    L5d:
                        r1.element = r7
                        goto L27
                    L60:
                        kotlin.Unit r7 = kotlin.Unit.INSTANCE
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00281.C00291.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00281(TransformableNode transformableNode, Continuation<? super C00281> continuation) {
                super(2, continuation);
                this.this$0 = transformableNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00281 c00281 = new C00281(this.this$0, continuation);
                c00281.L$0 = obj;
                return c00281;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
            
                if (r10.transform(r1, r6, r9) == r0) goto L23;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
            /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0061 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0080 -> B:13:0x0036). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r9.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2f
                    if (r1 == r3) goto L1f
                    if (r1 != r2) goto L17
                    java.lang.Object r1 = r9.L$0
                    kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
                    kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.util.concurrent.CancellationException -> L15
                L15:
                    r10 = r1
                    goto L36
                L17:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L1f:
                    java.lang.Object r1 = r9.L$2
                    kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref.ObjectRef) r1
                    java.lang.Object r4 = r9.L$1
                    kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref.ObjectRef) r4
                    java.lang.Object r5 = r9.L$0
                    kotlinx.coroutines.CoroutineScope r5 = (kotlinx.coroutines.CoroutineScope) r5
                    kotlin.ResultKt.throwOnFailure(r10)
                    goto L59
                L2f:
                    kotlin.ResultKt.throwOnFailure(r10)
                    java.lang.Object r10 = r9.L$0
                    kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
                L36:
                    boolean r1 = kotlinx.coroutines.CoroutineScopeKt.isActive(r10)
                    if (r1 == 0) goto L82
                    kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
                    r1.<init>()
                    androidx.compose.foundation.gestures.TransformableNode r4 = r9.this$0
                    kotlinx.coroutines.channels.Channel r4 = androidx.compose.foundation.gestures.TransformableNode.access$getChannel$p(r4)
                    r9.L$0 = r10
                    r9.L$1 = r1
                    r9.L$2 = r1
                    r9.label = r3
                    java.lang.Object r4 = r4.receive(r9)
                    if (r4 != r0) goto L56
                    goto L7f
                L56:
                    r5 = r10
                    r10 = r4
                    r4 = r1
                L59:
                    r1.element = r10
                    T r10 = r4.element
                    boolean r10 = r10 instanceof androidx.compose.foundation.gestures.TransformEvent.TransformStarted
                    if (r10 == 0) goto L80
                    androidx.compose.foundation.gestures.TransformableNode r10 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                    androidx.compose.foundation.gestures.TransformableState r10 = androidx.compose.foundation.gestures.TransformableNode.access$getState$p(r10)     // Catch: java.util.concurrent.CancellationException -> L80
                    androidx.compose.foundation.MutatePriority r1 = androidx.compose.foundation.MutatePriority.UserInput     // Catch: java.util.concurrent.CancellationException -> L80
                    androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1 r6 = new androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$1$1     // Catch: java.util.concurrent.CancellationException -> L80
                    androidx.compose.foundation.gestures.TransformableNode r7 = r9.this$0     // Catch: java.util.concurrent.CancellationException -> L80
                    r8 = 0
                    r6.<init>(r4, r7, r8)     // Catch: java.util.concurrent.CancellationException -> L80
                    r9.L$0 = r5     // Catch: java.util.concurrent.CancellationException -> L80
                    r9.L$1 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                    r9.L$2 = r8     // Catch: java.util.concurrent.CancellationException -> L80
                    r9.label = r2     // Catch: java.util.concurrent.CancellationException -> L80
                    java.lang.Object r10 = r10.transform(r1, r6, r9)     // Catch: java.util.concurrent.CancellationException -> L80
                    if (r10 != r0) goto L80
                L7f:
                    return r0
                L80:
                    r10 = r5
                    goto L36
                L82:
                    kotlin.Unit r10 = kotlin.Unit.INSTANCE
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1.AnonymousClass1.C00281.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C00281) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2", f = "Transformable.kt", i = {}, l = {176}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.gestures.TransformableNode$pointerInputNode$1$1$2, reason: invalid class name */
        public static final class AnonymousClass2 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ TransformableNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(TransformableNode transformableNode, CoroutineScope coroutineScope, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = transformableNode;
                this.$$this$coroutineScope = coroutineScope;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, this.$$this$coroutineScope, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                try {
                    try {
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            boolean z = this.this$0.lockRotationOnZoomPan;
                            Channel channel = this.this$0.channel;
                            Function1 function1 = this.this$0.updatedCanPan;
                            this.label = 1;
                            if (TransformableKt.detectZoom(awaitPointerEventScope, z, channel, function1, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                        }
                    } catch (CancellationException e2) {
                        if (!CoroutineScopeKt.isActive(this.$$this$coroutineScope)) {
                            throw e2;
                        }
                    }
                    return Unit.INSTANCE;
                } finally {
                    this.this$0.channel.mo7998trySendJP2dKIU(TransformEvent.TransformStopped.INSTANCE);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(PointerInputScope pointerInputScope, TransformableNode transformableNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$$this$SuspendingPointerInputModifierNode = pointerInputScope;
            this.this$0 = transformableNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$SuspendingPointerInputModifierNode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new C00281(this.this$0, null), 1, null);
                PointerInputScope pointerInputScope = this.$$this$SuspendingPointerInputModifierNode;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, coroutineScope, null);
                this.label = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, anonymousClass2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransformableNode$pointerInputNode$1(TransformableNode transformableNode, Continuation<? super TransformableNode$pointerInputNode$1> continuation) {
        super(2, continuation);
        this.this$0 = transformableNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TransformableNode$pointerInputNode$1 transformableNode$pointerInputNode$1 = new TransformableNode$pointerInputNode$1(this.this$0, continuation);
        transformableNode$pointerInputNode$1.L$0 = obj;
        return transformableNode$pointerInputNode$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
        return ((TransformableNode$pointerInputNode$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            if (!this.this$0.enabled) {
                return Unit.INSTANCE;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pointerInputScope, this.this$0, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
