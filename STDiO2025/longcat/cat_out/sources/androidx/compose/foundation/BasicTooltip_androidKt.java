package androidx.compose.foundation;

import J.d;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.StringResources_androidKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0007¢\u0006\u0002\u0010\u000f\u001a@\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0013\u001a:\u0010\u0014\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\u0002\b\u0006H\u0003¢\u0006\u0002\u0010\u0015\u001a,\u0010\u0016\u001a\u00020\n*\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a\u001c\u0010\u001a\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u001b"}, d2 = {"BasicTooltipBox", "", "positionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "tooltip", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "state", "Landroidx/compose/foundation/BasicTooltipState;", "modifier", "Landroidx/compose/ui/Modifier;", "focusable", "", "enableUserInput", "content", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;ZZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "TooltipPopup", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Landroidx/compose/foundation/BasicTooltipState;Lkotlinx/coroutines/CoroutineScope;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "WrappedAnchor", "(ZLandroidx/compose/foundation/BasicTooltipState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "anchorSemantics", "label", "", "enabled", "handleGestures", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTooltip_androidKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1", f = "BasicTooltip.android.kt", i = {}, l = {152}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1, reason: invalid class name and case insensitive filesystem */
    public static final class C01831 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BasicTooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1", f = "BasicTooltip.android.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00041 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ BasicTooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1", f = "BasicTooltip.android.kt", i = {0, 0, 0, 1, 1}, l = {158, 164, 172}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00051 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ BasicTooltipState $state;
                long J$0;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {165}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00061 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {
                    final /* synthetic */ PointerEventPass $pass;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00061(PointerEventPass pointerEventPass, Continuation<? super C00061> continuation) {
                        super(2, continuation);
                        this.$pass = pointerEventPass;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C00061 c00061 = new C00061(this.$pass, continuation);
                        c00061.L$0 = obj;
                        return c00061;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                        return ((C00061) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 != 0) {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                        PointerEventPass pointerEventPass = this.$pass;
                        this.label = 1;
                        Object objWaitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, this);
                        return objWaitForUpOrCancellation == coroutine_suspended ? coroutine_suspended : objWaitForUpOrCancellation;
                    }
                }

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2", f = "BasicTooltip.android.kt", i = {}, l = {169}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2, reason: invalid class name */
                public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ BasicTooltipState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass2(BasicTooltipState basicTooltipState, Continuation<? super AnonymousClass2> continuation) {
                        super(2, continuation);
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass2(this.$state, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            BasicTooltipState basicTooltipState = this.$state;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            this.label = 1;
                            if (basicTooltipState.show(mutatePriority, this) == coroutine_suspended) {
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
                        return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00051(CoroutineScope coroutineScope, BasicTooltipState basicTooltipState, Continuation<? super C00051> continuation) {
                    super(2, continuation);
                    this.$$this$coroutineScope = coroutineScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00051 c00051 = new C00051(this.$$this$coroutineScope, this.$state, continuation);
                    c00051.L$0 = obj;
                    return c00051;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C00051) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0092, code lost:
                
                    if (r4.withTimeout(r10, r1, r16) == r6) goto L29;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:28:0x00b0, code lost:
                
                    if (r0 == r6) goto L29;
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r17) {
                    /*
                        r16 = this;
                        r3 = r16
                        java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r0 = r3.label
                        r7 = 3
                        r8 = 2
                        r1 = 1
                        r9 = 0
                        if (r0 == 0) goto L42
                        if (r0 == r1) goto L30
                        if (r0 == r8) goto L23
                        if (r0 != r7) goto L1b
                        kotlin.ResultKt.throwOnFailure(r17)
                        r0 = r17
                        goto Lb3
                    L1b:
                        java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                        java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                        r0.<init>(r1)
                        throw r0
                    L23:
                        java.lang.Object r0 = r3.L$1
                        androidx.compose.ui.input.pointer.PointerEventPass r0 = (androidx.compose.ui.input.pointer.PointerEventPass) r0
                        java.lang.Object r1 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r1 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r1
                        kotlin.ResultKt.throwOnFailure(r17)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L96
                        goto Lcc
                    L30:
                        long r0 = r3.J$0
                        java.lang.Object r2 = r3.L$1
                        androidx.compose.ui.input.pointer.PointerEventPass r2 = (androidx.compose.ui.input.pointer.PointerEventPass) r2
                        java.lang.Object r4 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r4 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r4
                        kotlin.ResultKt.throwOnFailure(r17)
                        r10 = r0
                        r1 = r17
                    L40:
                        r0 = r2
                        goto L67
                    L42:
                        kotlin.ResultKt.throwOnFailure(r17)
                        java.lang.Object r0 = r3.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r0 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r0
                        androidx.compose.ui.platform.ViewConfiguration r2 = r0.getViewConfiguration()
                        long r10 = r2.getLongPressTimeoutMillis()
                        androidx.compose.ui.input.pointer.PointerEventPass r2 = androidx.compose.ui.input.pointer.PointerEventPass.Initial
                        r3.L$0 = r0
                        r3.L$1 = r2
                        r3.J$0 = r10
                        r3.label = r1
                        r1 = 0
                        r4 = 1
                        r5 = 0
                        java.lang.Object r1 = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(r0, r1, r2, r3, r4, r5)
                        if (r1 != r6) goto L65
                        goto Lb2
                    L65:
                        r4 = r0
                        goto L40
                    L67:
                        androidx.compose.ui.input.pointer.PointerInputChange r1 = (androidx.compose.ui.input.pointer.PointerInputChange) r1
                        int r1 = r1.getType()
                        androidx.compose.ui.input.pointer.PointerType$Companion r2 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
                        int r5 = r2.m5070getTouchT8wyACA()
                        boolean r5 = androidx.compose.ui.input.pointer.PointerType.m5063equalsimpl0(r1, r5)
                        if (r5 != 0) goto L83
                        int r2 = r2.m5069getStylusT8wyACA()
                        boolean r1 = androidx.compose.ui.input.pointer.PointerType.m5063equalsimpl0(r1, r2)
                        if (r1 == 0) goto Lcc
                    L83:
                        androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1 r1 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$1     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        r1.<init>(r0, r9)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        r3.L$0 = r4     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        r3.L$1 = r0     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        r3.label = r8     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        java.lang.Object r0 = r4.withTimeout(r10, r1, r3)     // Catch: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException -> L95
                        if (r0 != r6) goto Lcc
                        goto Lb2
                    L95:
                        r1 = r4
                    L96:
                        kotlinx.coroutines.CoroutineScope r10 = r3.$$this$coroutineScope
                        androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2 r13 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$1$1$1$2
                        androidx.compose.foundation.BasicTooltipState r2 = r3.$state
                        r13.<init>(r2, r9)
                        r14 = 3
                        r15 = 0
                        r11 = 0
                        r12 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r10, r11, r12, r13, r14, r15)
                        r3.L$0 = r9
                        r3.L$1 = r9
                        r3.label = r7
                        java.lang.Object r0 = r1.awaitPointerEvent(r0, r3)
                        if (r0 != r6) goto Lb3
                    Lb2:
                        return r6
                    Lb3:
                        androidx.compose.ui.input.pointer.PointerEvent r0 = (androidx.compose.ui.input.pointer.PointerEvent) r0
                        java.util.List r0 = r0.getChanges()
                        int r1 = r0.size()
                        r2 = 0
                    Lbe:
                        if (r2 >= r1) goto Lcc
                        java.lang.Object r4 = r0.get(r2)
                        androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                        r4.consume()
                        int r2 = r2 + 1
                        goto Lbe
                    Lcc:
                        kotlin.Unit r0 = kotlin.Unit.INSTANCE
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.C01831.C00041.C00051.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00041(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, Continuation<? super C00041> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = basicTooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00041 c00041 = new C00041(this.$$this$pointerInput, this.$state, continuation);
                c00041.L$0 = obj;
                return c00041;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00051 c00051 = new C00051(coroutineScope, this.$state, null);
                    this.label = 1;
                    if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c00051, this) == coroutine_suspended) {
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
                return ((C00041) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01831(BasicTooltipState basicTooltipState, Continuation<? super C01831> continuation) {
            super(2, continuation);
            this.$state = basicTooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C01831 c01831 = new C01831(this.$state, continuation);
            c01831.L$0 = obj;
            return c01831;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C01831) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                C00041 c00041 = new C00041((PointerInputScope) this.L$0, this.$state, null);
                this.label = 1;
                if (CoroutineScopeKt.coroutineScope(c00041, this) == coroutine_suspended) {
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

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2", f = "BasicTooltip.android.kt", i = {}, l = {180}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2, reason: invalid class name and case insensitive filesystem */
    public static final class C01842 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ BasicTooltipState $state;
        private /* synthetic */ Object L$0;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1", f = "BasicTooltip.android.kt", i = {}, l = {181}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1, reason: invalid class name */
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ PointerInputScope $$this$pointerInput;
            final /* synthetic */ BasicTooltipState $state;
            private /* synthetic */ Object L$0;
            int label;

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1", f = "BasicTooltip.android.kt", i = {0, 0}, l = {185}, m = "invokeSuspend", n = {"$this$awaitPointerEventScope", "pass"}, s = {"L$0", "L$1"})
            /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1, reason: invalid class name and collision with other inner class name */
            public static final class C00071 extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ CoroutineScope $$this$coroutineScope;
                final /* synthetic */ BasicTooltipState $state;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {190}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1, reason: invalid class name and collision with other inner class name */
                public static final class C00081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ BasicTooltipState $state;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C00081(BasicTooltipState basicTooltipState, Continuation<? super C00081> continuation) {
                        super(2, continuation);
                        this.$state = basicTooltipState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new C00081(this.$state, continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i2 = this.label;
                        if (i2 == 0) {
                            ResultKt.throwOnFailure(obj);
                            BasicTooltipState basicTooltipState = this.$state;
                            MutatePriority mutatePriority = MutatePriority.UserInput;
                            this.label = 1;
                            if (basicTooltipState.show(mutatePriority, this) == coroutine_suspended) {
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
                        return ((C00081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00071(CoroutineScope coroutineScope, BasicTooltipState basicTooltipState, Continuation<? super C00071> continuation) {
                    super(2, continuation);
                    this.$$this$coroutineScope = coroutineScope;
                    this.$state = basicTooltipState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C00071 c00071 = new C00071(this.$$this$coroutineScope, this.$state, continuation);
                    c00071.L$0 = obj;
                    return c00071;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((C00071) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                    jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                    	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                    	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                    	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                    */
                /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                    /*
                        r12 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r12.label
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r12.L$1
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = (androidx.compose.ui.input.pointer.PointerEventPass) r1
                        java.lang.Object r3 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r3 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r3
                        kotlin.ResultKt.throwOnFailure(r13)
                        goto L36
                    L17:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1f:
                        kotlin.ResultKt.throwOnFailure(r13)
                        java.lang.Object r13 = r12.L$0
                        androidx.compose.ui.input.pointer.AwaitPointerEventScope r13 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) r13
                        androidx.compose.ui.input.pointer.PointerEventPass r1 = androidx.compose.ui.input.pointer.PointerEventPass.Main
                        r3 = r13
                    L29:
                        r12.L$0 = r3
                        r12.L$1 = r1
                        r12.label = r2
                        java.lang.Object r13 = r3.awaitPointerEvent(r1, r12)
                        if (r13 != r0) goto L36
                        return r0
                    L36:
                        androidx.compose.ui.input.pointer.PointerEvent r13 = (androidx.compose.ui.input.pointer.PointerEvent) r13
                        java.util.List r4 = r13.getChanges()
                        r5 = 0
                        java.lang.Object r4 = r4.get(r5)
                        androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
                        int r4 = r4.getType()
                        androidx.compose.ui.input.pointer.PointerType$Companion r5 = androidx.compose.ui.input.pointer.PointerType.INSTANCE
                        int r5 = r5.m5068getMouseT8wyACA()
                        boolean r4 = androidx.compose.ui.input.pointer.PointerType.m5063equalsimpl0(r4, r5)
                        if (r4 == 0) goto L29
                        int r13 = r13.getType()
                        androidx.compose.ui.input.pointer.PointerEventType$Companion r4 = androidx.compose.ui.input.pointer.PointerEventType.INSTANCE
                        int r5 = r4.m4944getEnter7fucELk()
                        boolean r5 = androidx.compose.ui.input.pointer.PointerEventType.m4940equalsimpl0(r13, r5)
                        if (r5 == 0) goto L75
                        kotlinx.coroutines.CoroutineScope r6 = r12.$$this$coroutineScope
                        androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1 r9 = new androidx.compose.foundation.BasicTooltip_androidKt$handleGestures$2$1$1$1
                        androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                        r4 = 0
                        r9.<init>(r13, r4)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        kotlinx.coroutines.BuildersKt.launch$default(r6, r7, r8, r9, r10, r11)
                        goto L29
                    L75:
                        int r4 = r4.m4945getExit7fucELk()
                        boolean r13 = androidx.compose.ui.input.pointer.PointerEventType.m4940equalsimpl0(r13, r4)
                        if (r13 == 0) goto L29
                        androidx.compose.foundation.BasicTooltipState r13 = r12.$state
                        r13.dismiss()
                        goto L29
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.C01842.AnonymousClass1.C00071.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(PointerInputScope pointerInputScope, BasicTooltipState basicTooltipState, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$$this$pointerInput = pointerInputScope;
                this.$state = basicTooltipState;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$state, continuation);
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
                    PointerInputScope pointerInputScope = this.$$this$pointerInput;
                    C00071 c00071 = new C00071(coroutineScope, this.$state, null);
                    this.label = 1;
                    if (pointerInputScope.awaitPointerEventScope(c00071, this) == coroutine_suspended) {
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
        public C01842(BasicTooltipState basicTooltipState, Continuation<? super C01842> continuation) {
            super(2, continuation);
            this.$state = basicTooltipState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C01842 c01842 = new C01842(this.$state, continuation);
            c01842.L$0 = obj;
            return c01842;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((C01842) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1((PointerInputScope) this.L$0, this.$state, null);
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

    /* JADX WARN: Removed duplicated region for block: B:102:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTooltipBox(final androidx.compose.ui.window.PopupPositionProvider r18, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r19, androidx.compose.foundation.BasicTooltipState r20, androidx.compose.ui.Modifier r21, boolean r22, boolean r23, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.runtime.Composer r25, final int r26, final int r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BasicTooltip_androidKt.BasicTooltipBox(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function2, androidx.compose.foundation.BasicTooltipState, androidx.compose.ui.Modifier, boolean, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TooltipPopup(final PopupPositionProvider popupPositionProvider, final BasicTooltipState basicTooltipState, final CoroutineScope coroutineScope, final boolean z, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) throws Resources.NotFoundException {
        PopupPositionProvider popupPositionProvider2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-73658727);
        if ((i2 & 6) == 0) {
            popupPositionProvider2 = popupPositionProvider;
            i3 = (composerStartRestartGroup.changed(popupPositionProvider2) ? 4 : 2) | i2;
        } else {
            popupPositionProvider2 = popupPositionProvider;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(coroutineScope) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? Fields.CameraDistance : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? Fields.Clip : 8192;
        }
        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-73658727, i3, -1, "androidx.compose.foundation.TooltipPopup (BasicTooltip.android.kt:124)");
            }
            final String strStringResource = StringResources_androidKt.stringResource(R.string.tooltip_description, composerStartRestartGroup, 0);
            boolean zChangedInstance = ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(coroutineScope);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$1$1$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public AnonymousClass1(BasicTooltipState basicTooltipState, Continuation<? super AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new AnonymousClass1(this.$state, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            if (this.label != 0) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(obj);
                            this.$state.dismiss();
                            return Unit.INSTANCE;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                        if (basicTooltipState.isVisible()) {
                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(basicTooltipState, null), 3, null);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            AndroidPopup_androidKt.Popup(popupPositionProvider2, (Function0) objRememberedValue, new PopupProperties(z, false, false, false, 14, (DefaultConstructorMarker) null), ComposableLambdaKt.rememberComposableLambda(-1147839433, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt.TooltipPopup.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1147839433, i4, -1, "androidx.compose.foundation.TooltipPopup.<anonymous> (BasicTooltip.android.kt:135)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    boolean zChanged = composer2.changed(strStringResource);
                    final String str = strStringResource;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt$TooltipPopup$2$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                invoke2(semanticsPropertyReceiver);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                SemanticsPropertiesKt.m5549setLiveRegionhR3wRGc(semanticsPropertyReceiver, LiveRegionMode.INSTANCE.m5522getAssertive0phEisY());
                                SemanticsPropertiesKt.setPaneTitle(semanticsPropertyReceiver, str);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue2, 1, null);
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierSemantics$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                    Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (d.A(composer2, 0, function22)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 3072, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt.TooltipPopup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) throws Resources.NotFoundException {
                    BasicTooltip_androidKt.TooltipPopup(popupPositionProvider, basicTooltipState, coroutineScope, z, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void WrappedAnchor(final boolean z, final BasicTooltipState basicTooltipState, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(1712976033);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((2 & i3) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(basicTooltipState) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? Fields.CameraDistance : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1712976033, i4, -1, "androidx.compose.foundation.WrappedAnchor (BasicTooltip.android.kt:107)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            Modifier modifierAnchorSemantics = anchorSemantics(handleGestures(modifier, z, basicTooltipState), StringResources_androidKt.stringResource(R.string.tooltip_label, composerStartRestartGroup, 0), z, basicTooltipState, ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope());
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierAnchorSemantics);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (d.A(composerStartRestartGroup, (i4 >> 9) & 14, function2)) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt.WrappedAnchor.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    BasicTooltip_androidKt.WrappedAnchor(z, basicTooltipState, modifier2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    private static final Modifier anchorSemantics(Modifier modifier, final String str, boolean z, final BasicTooltipState basicTooltipState, final CoroutineScope coroutineScope) {
        return z ? SemanticsModifierKt.semantics(modifier, true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt.anchorSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                String str2 = str;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final BasicTooltipState basicTooltipState2 = basicTooltipState;
                SemanticsPropertiesKt.onLongClick(semanticsPropertyReceiver, str2, new Function0<Boolean>() { // from class: androidx.compose.foundation.BasicTooltip_androidKt.anchorSemantics.1.1

                    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
                    @DebugMetadata(c = "androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1$1", f = "BasicTooltip.android.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
                    /* renamed from: androidx.compose.foundation.BasicTooltip_androidKt$anchorSemantics$1$1$1, reason: invalid class name and collision with other inner class name */
                    public static final class C00031 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                        final /* synthetic */ BasicTooltipState $state;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public C00031(BasicTooltipState basicTooltipState, Continuation<? super C00031> continuation) {
                            super(2, continuation);
                            this.$state = basicTooltipState;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                            return new C00031(this.$state, continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            int i2 = this.label;
                            if (i2 == 0) {
                                ResultKt.throwOnFailure(obj);
                                BasicTooltipState basicTooltipState = this.$state;
                                this.label = 1;
                                if (BasicTooltipState.show$default(basicTooltipState, null, this, 1, null) == coroutine_suspended) {
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
                            return ((C00031) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Boolean invoke() {
                        BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C00031(basicTooltipState2, null), 3, null);
                        return Boolean.TRUE;
                    }
                });
            }
        }) : modifier;
    }

    private static final Modifier handleGestures(Modifier modifier, boolean z, BasicTooltipState basicTooltipState) {
        return z ? SuspendingPointerInputFilterKt.pointerInput(SuspendingPointerInputFilterKt.pointerInput(modifier, basicTooltipState, new C01831(basicTooltipState, null)), basicTooltipState, new C01842(basicTooltipState, null)) : modifier;
    }
}
