package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0080@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\u0007\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0005\u001a\u001a\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0082@¢\u0006\u0002\u0010\u0005¨\u0006\t"}, d2 = {"detectDownAndDragGesturesWithObserver", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "observer", "Landroidx/compose/foundation/text/TextDragObserver;", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Landroidx/compose/foundation/text/TextDragObserver;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectDragGesturesAfterLongPressWithObserver", "detectDragGesturesWithObserver", "detectPreDragGesturesWithObserver", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LongPressTextDragObserverKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectPreDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutine_suspended) {
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

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C00442 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ TextDragObserver $observer;
            final /* synthetic */ PointerInputScope $this_detectDownAndDragGesturesWithObserver;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00442(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super C00442> continuation) {
                super(2, continuation);
                this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
                this.$observer = textDragObserver;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C00442(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    PointerInputScope pointerInputScope = this.$this_detectDownAndDragGesturesWithObserver;
                    TextDragObserver textDragObserver = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.detectDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == coroutine_suspended) {
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
                return ((C00442) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$this_detectDownAndDragGesturesWithObserver = pointerInputScope;
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
            return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C00442(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1, null);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", i = {0, 1, 1}, l = {99, 103}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
    /* renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02992 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ TextDragObserver $observer;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02992(TextDragObserver textDragObserver, Continuation<? super C02992> continuation) {
            super(2, continuation);
            this.$observer = textDragObserver;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C02992 c02992 = new C02992(this.$observer, continuation);
            c02992.L$0 = obj;
            return c02992;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
            return ((C02992) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005d, code lost:
        
            if (r14 != r0) goto L18;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005d -> B:18:0x0060). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r13.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2c
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r1 = r13.L$1
                androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                java.lang.Object r4 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                kotlin.ResultKt.throwOnFailure(r14)
                r7 = r13
                goto L60
            L1b:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L23:
                java.lang.Object r1 = r13.L$0
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                kotlin.ResultKt.throwOnFailure(r14)
                r7 = r13
                goto L45
            L2c:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.L$0
                r4 = r14
                androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                r13.L$0 = r4
                r13.label = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r7 = r13
                java.lang.Object r14 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r4, r5, r6, r7, r8, r9)
                if (r14 != r0) goto L44
                goto L5f
            L44:
                r1 = r4
            L45:
                androidx.compose.ui.input.pointer.PointerInputChange r14 = (androidx.compose.ui.input.pointer.PointerInputChange) r14
                androidx.compose.foundation.text.TextDragObserver r4 = r7.$observer
                long r5 = r14.getPosition()
                r4.mo1018onDownk4lQ0M(r5)
                r4 = r1
                r1 = r14
            L52:
                r7.L$0 = r4
                r7.L$1 = r1
                r7.label = r2
                r14 = 0
                java.lang.Object r14 = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(r4, r14, r13, r3, r14)
                if (r14 != r0) goto L60
            L5f:
                return r0
            L60:
                androidx.compose.ui.input.pointer.PointerEvent r14 = (androidx.compose.ui.input.pointer.PointerEvent) r14
                java.util.List r14 = r14.getChanges()
                int r5 = r14.size()
                r6 = 0
            L6b:
                if (r6 >= r5) goto L8b
                java.lang.Object r8 = r14.get(r6)
                androidx.compose.ui.input.pointer.PointerInputChange r8 = (androidx.compose.ui.input.pointer.PointerInputChange) r8
                long r9 = r8.getId()
                long r11 = r1.getId()
                boolean r9 = androidx.compose.ui.input.pointer.PointerId.m4973equalsimpl0(r9, r11)
                if (r9 == 0) goto L88
                boolean r8 = r8.getPressed()
                if (r8 == 0) goto L88
                goto L52
            L88:
                int r6 = r6 + 1
                goto L6b
            L8b:
                androidx.compose.foundation.text.TextDragObserver r14 = r7.$observer
                r14.onUp()
                kotlin.Unit r14 = kotlin.Unit.INSTANCE
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.LongPressTextDragObserverKt.C02992.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object detectDownAndDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(pointerInputScope, textDragObserver, null), continuation);
        return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static final Object detectDragGesturesAfterLongPressWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objDetectDragGesturesAfterLongPress = DragGestureDetectorKt.detectDragGesturesAfterLongPress(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m984invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m984invokek4lQ0M(long j2) {
                textDragObserver.mo1020onStartk4lQ0M(j2);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textDragObserver.onStop();
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textDragObserver.onCancel();
            }
        }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesAfterLongPressWithObserver.5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m985invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m985invokeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
                textDragObserver.mo1019onDragk4lQ0M(j2);
            }
        }, continuation);
        return objDetectDragGesturesAfterLongPress == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGesturesAfterLongPress : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectDragGesturesWithObserver(PointerInputScope pointerInputScope, final TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objDetectDragGestures = DragGestureDetectorKt.detectDragGestures(pointerInputScope, new Function1<Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Offset offset) {
                m986invokek4lQ0M(offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
            public final void m986invokek4lQ0M(long j2) {
                textDragObserver.mo1020onStartk4lQ0M(j2);
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textDragObserver.onStop();
            }
        }, new Function0<Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                textDragObserver.onCancel();
            }
        }, new Function2<PointerInputChange, Offset, Unit>() { // from class: androidx.compose.foundation.text.LongPressTextDragObserverKt.detectDragGesturesWithObserver.5
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(PointerInputChange pointerInputChange, Offset offset) {
                m987invokeUv8p0NA(pointerInputChange, offset.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
            public final void m987invokeUv8p0NA(PointerInputChange pointerInputChange, long j2) {
                textDragObserver.mo1019onDragk4lQ0M(j2);
            }
        }, continuation);
        return objDetectDragGestures == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDetectDragGestures : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object detectPreDragGesturesWithObserver(PointerInputScope pointerInputScope, TextDragObserver textDragObserver, Continuation<? super Unit> continuation) {
        Object objAwaitEachGesture = ForEachGestureKt.awaitEachGesture(pointerInputScope, new C02992(textDragObserver, null), continuation);
        return objAwaitEachGesture == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAwaitEachGesture : Unit.INSTANCE;
    }
}
