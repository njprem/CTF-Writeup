package androidx.compose.foundation;

import J.d;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusEventModifierNode;
import androidx.compose.ui.focus.FocusState;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.math.MathKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020;H\u0016J\u0010\u0010=\u001a\u00020;2\u0006\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020;H\u0002J\u000e\u0010A\u001a\u00020;H\u0082@¢\u0006\u0002\u0010BJ@\u0010C\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\f\u0010F\u001a\u00020;*\u00020GH\u0016J\u001c\u0010H\u001a\u00020\u0006*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0006H\u0016J\u001c\u0010M\u001a\u00020\u0006*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0006H\u0016J&\u0010O\u001a\u00020P*\u00020Q2\u0006\u0010J\u001a\u00020R2\u0006\u0010S\u001a\u00020TH\u0016ø\u0001\u0000¢\u0006\u0004\bU\u0010VJ\u001c\u0010W\u001a\u00020\u0006*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020\u0006H\u0016J\u001c\u0010X\u001a\u00020\u0006*\u00020I2\u0006\u0010J\u001a\u00020K2\u0006\u0010N\u001a\u00020\u0006H\u0016R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R1\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u0016R+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00068B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001f\u0010\u0014\"\u0004\b \u0010\u0016R\u000e\u0010\t\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\u00020#8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R+\u0010'\u001a\u00020&2\u0006\u0010\u0012\u001a\u00020&8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010\u0018\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\n\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010-\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020/0.X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010\u0018\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001b\u00105\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b6\u0010\u0014R\u0016\u0010\r\u001a\u00020\u000eX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u00109\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/foundation/MarqueeModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "iterations", "", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "delayMillis", "initialDelayMillis", "spacing", "Landroidx/compose/foundation/MarqueeSpacing;", "velocity", "Landroidx/compose/ui/unit/Dp;", "(IIIILandroidx/compose/foundation/MarqueeSpacing;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animationJob", "Lkotlinx/coroutines/Job;", "<set-?>", "getAnimationMode-ZbEOnfQ", "()I", "setAnimationMode-97h66l8", "(I)V", "animationMode$delegate", "Landroidx/compose/runtime/MutableState;", "containerWidth", "getContainerWidth", "setContainerWidth", "containerWidth$delegate", "Landroidx/compose/runtime/MutableIntState;", "contentWidth", "getContentWidth", "setContentWidth", "contentWidth$delegate", "direction", "", "getDirection", "()F", "", "hasFocus", "getHasFocus", "()Z", "setHasFocus", "(Z)V", "hasFocus$delegate", "offset", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "getSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "setSpacing", "(Landroidx/compose/foundation/MarqueeSpacing;)V", "spacing$delegate", "spacingPx", "getSpacingPx", "spacingPx$delegate", "Landroidx/compose/runtime/State;", "F", "onAttach", "", "onDetach", "onFocusEvent", "focusState", "Landroidx/compose/ui/focus/FocusState;", "restartAnimation", "runAnimation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "update-lWfNwf4", "(IIIILandroidx/compose/foundation/MarqueeSpacing;F)V", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "maxIntrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class MarqueeModifierNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, FocusEventModifierNode {
    private Job animationJob;

    /* renamed from: animationMode$delegate, reason: from kotlin metadata */
    private final MutableState animationMode;

    /* renamed from: containerWidth$delegate, reason: from kotlin metadata */
    private final MutableIntState containerWidth;

    /* renamed from: contentWidth$delegate, reason: from kotlin metadata */
    private final MutableIntState contentWidth;
    private int delayMillis;

    /* renamed from: hasFocus$delegate, reason: from kotlin metadata */
    private final MutableState hasFocus;
    private int initialDelayMillis;
    private int iterations;
    private final Animatable<Float, AnimationVector1D> offset;

    /* renamed from: spacing$delegate, reason: from kotlin metadata */
    private final MutableState spacing;

    /* renamed from: spacingPx$delegate, reason: from kotlin metadata */
    private final State spacingPx;
    private float velocity;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1", f = "BasicMarquee.kt", i = {}, l = {348, 349}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$restartAnimation$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Job $oldJob;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Job job, MarqueeModifierNode marqueeModifierNode, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$oldJob = job;
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$oldJob, this.this$0, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            if (r5.runAnimation(r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r5)
                goto L39
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2e
            L1e:
                kotlin.ResultKt.throwOnFailure(r5)
                kotlinx.coroutines.Job r5 = r4.$oldJob
                if (r5 == 0) goto L2e
                r4.label = r3
                java.lang.Object r5 = r5.join(r4)
                if (r5 != r0) goto L2e
                goto L38
            L2e:
                androidx.compose.foundation.MarqueeModifierNode r5 = r4.this$0
                r4.label = r2
                java.lang.Object r5 = androidx.compose.foundation.MarqueeModifierNode.access$runAnimation(r5, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {370}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u008a@"}, d2 = {"<anonymous>", "", "contentWithSpacingWidth", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {383, 385, 389, 389}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
        /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name and collision with other inner class name */
        public static final class C00112 extends SuspendLambda implements Function2<Float, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            Object L$1;
            int label;
            final /* synthetic */ MarqueeModifierNode this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00112(MarqueeModifierNode marqueeModifierNode, Continuation<? super C00112> continuation) {
                super(2, continuation);
                this.this$0 = marqueeModifierNode;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C00112 c00112 = new C00112(this.this$0, continuation);
                c00112.L$0 = obj;
                return c00112;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Float f2, Continuation<? super Unit> continuation) {
                return ((C00112) create(f2, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x00bb, code lost:
            
                if (r0.snapTo(r1, r20) != r8) goto L31;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
                /*
                    r20 = this;
                    r5 = r20
                    java.lang.Object r8 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r0 = r5.label
                    r9 = 4
                    r10 = 3
                    r1 = 2
                    r2 = 1
                    r11 = 0
                    r12 = 0
                    if (r0 == 0) goto L47
                    if (r0 == r2) goto L36
                    if (r0 == r1) goto L2e
                    if (r0 == r10) goto L29
                    if (r0 == r9) goto L20
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                    r0.<init>(r1)
                    throw r0
                L20:
                    java.lang.Object r0 = r5.L$0
                    java.lang.Throwable r0 = (java.lang.Throwable) r0
                    kotlin.ResultKt.throwOnFailure(r21)
                    goto Ld8
                L29:
                    kotlin.ResultKt.throwOnFailure(r21)
                    goto Lbe
                L2e:
                    kotlin.ResultKt.throwOnFailure(r21)     // Catch: java.lang.Throwable -> L33
                    goto Lab
                L33:
                    r0 = move-exception
                    goto Lc1
                L36:
                    java.lang.Object r0 = r5.L$1
                    androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                    java.lang.Object r2 = r5.L$0
                    java.lang.Float r2 = (java.lang.Float) r2
                    kotlin.ResultKt.throwOnFailure(r21)
                    r19 = r2
                    r2 = r0
                    r0 = r19
                    goto L91
                L47:
                    kotlin.ResultKt.throwOnFailure(r21)
                    java.lang.Object r0 = r5.L$0
                    java.lang.Float r0 = (java.lang.Float) r0
                    if (r0 != 0) goto L53
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                L53:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r13 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                    float r14 = r0.floatValue()
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r15 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    int r16 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    float r17 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0
                    androidx.compose.ui.unit.Density r18 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r3)
                    androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m201access$createMarqueeAnimationSpecZ4HSEVQ(r13, r14, r15, r16, r17, r18)
                    androidx.compose.foundation.MarqueeModifierNode r4 = r5.this$0
                    androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                    java.lang.Float r6 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                    r5.L$0 = r0
                    r5.L$1 = r3
                    r5.label = r2
                    java.lang.Object r2 = r4.snapTo(r6, r5)
                    if (r2 != r8) goto L90
                    goto Ld7
                L90:
                    r2 = r3
                L91:
                    androidx.compose.foundation.MarqueeModifierNode r3 = r5.this$0     // Catch: java.lang.Throwable -> L33
                    androidx.compose.animation.core.Animatable r3 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r3)     // Catch: java.lang.Throwable -> L33
                    r5.L$0 = r11     // Catch: java.lang.Throwable -> L33
                    r5.L$1 = r11     // Catch: java.lang.Throwable -> L33
                    r5.label = r1     // Catch: java.lang.Throwable -> L33
                    r1 = r0
                    r0 = r3
                    r3 = 0
                    r4 = 0
                    r6 = 12
                    r7 = 0
                    java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r0, r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L33
                    if (r0 != r8) goto Lab
                    goto Ld7
                Lab:
                    androidx.compose.foundation.MarqueeModifierNode r0 = r5.this$0
                    androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                    java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                    r5.label = r10
                    java.lang.Object r0 = r0.snapTo(r1, r5)
                    if (r0 != r8) goto Lbe
                    goto Ld7
                Lbe:
                    kotlin.Unit r0 = kotlin.Unit.INSTANCE
                    return r0
                Lc1:
                    androidx.compose.foundation.MarqueeModifierNode r1 = r5.this$0
                    androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                    java.lang.Float r2 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r12)
                    r5.L$0 = r0
                    r5.L$1 = r11
                    r5.label = r9
                    java.lang.Object r1 = r1.snapTo(r2, r5)
                    if (r1 != r8) goto Ld8
                Ld7:
                    return r8
                Ld8:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode.AnonymousClass2.C00112.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MarqueeModifierNode.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final MarqueeModifierNode marqueeModifierNode = MarqueeModifierNode.this;
                Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0<Float>() { // from class: androidx.compose.foundation.MarqueeModifierNode.runAnimation.2.1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        if (marqueeModifierNode.getContentWidth() <= marqueeModifierNode.getContainerWidth()) {
                            return null;
                        }
                        if (!MarqueeAnimationMode.m271equalsimpl0(marqueeModifierNode.m282getAnimationModeZbEOnfQ(), MarqueeAnimationMode.INSTANCE.m276getWhileFocusedZbEOnfQ()) || marqueeModifierNode.getHasFocus()) {
                            return Float.valueOf(marqueeModifierNode.getContentWidth() + marqueeModifierNode.getSpacingPx());
                        }
                        return null;
                    }
                });
                C00112 c00112 = new C00112(MarqueeModifierNode.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowSnapshotFlow, c00112, this) == coroutine_suspended) {
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

    public /* synthetic */ MarqueeModifierNode(int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, i4, i5, marqueeSpacing, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContainerWidth() {
        return this.containerWidth.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getContentWidth() {
        return this.contentWidth.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float getDirection() {
        float fSignum = Math.signum(this.velocity);
        int i2 = WhenMappings.$EnumSwitchMapping$0[DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = -1;
        }
        return fSignum * i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getHasFocus() {
        return ((Boolean) this.hasFocus.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getSpacingPx() {
        return ((Number) this.spacingPx.getValue()).intValue();
    }

    private final void restartAnimation() {
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (getIsAttached()) {
            this.animationJob = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(job, this, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object runAnimation(Continuation<? super Unit> continuation) throws Throwable {
        if (this.iterations <= 0) {
            return Unit.INSTANCE;
        }
        Object objWithContext = BuildersKt.withContext(FixedMotionDurationScale.INSTANCE, new AnonymousClass2(null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    private final void setContainerWidth(int i2) {
        this.containerWidth.setIntValue(i2);
    }

    private final void setContentWidth(int i2) {
        this.contentWidth.setIntValue(i2);
    }

    private final void setHasFocus(boolean z) {
        this.hasFocus.setValue(Boolean.valueOf(z));
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        float fFloatValue = this.offset.getValue().floatValue() * getDirection();
        boolean z = getDirection() != 1.0f ? this.offset.getValue().floatValue() < ((float) getContainerWidth()) : this.offset.getValue().floatValue() < ((float) getContentWidth());
        boolean z2 = getDirection() != 1.0f ? this.offset.getValue().floatValue() > ((float) getSpacingPx()) : this.offset.getValue().floatValue() > ((float) ((getContentWidth() + getSpacingPx()) - getContainerWidth()));
        float contentWidth = getDirection() == 1.0f ? getContentWidth() + getSpacingPx() : (-getContentWidth()) - getSpacingPx();
        float containerWidth = fFloatValue + getContainerWidth();
        float fM3617getHeightimpl = Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc());
        int iM3781getIntersectrtfAjoo = ClipOp.INSTANCE.m3781getIntersectrtfAjoo();
        DrawContext drawContext = contentDrawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4266clipRectN_I0leg(fFloatValue, 0.0f, containerWidth, fM3617getHeightimpl, iM3781getIntersectrtfAjoo);
            if (z) {
                contentDrawScope.drawContent();
            }
            if (z2) {
                contentDrawScope.getDrawContext().getTransform().translate(contentWidth, 0.0f);
                try {
                    contentDrawScope.drawContent();
                    contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                } catch (Throwable th) {
                    contentDrawScope.getDrawContext().getTransform().translate(-contentWidth, -0.0f);
                    throw th;
                }
            }
            d.y(drawContext, jMo4263getSizeNHjbRc);
        } catch (Throwable th2) {
            d.y(drawContext, jMo4263getSizeNHjbRc);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnimationMode-ZbEOnfQ, reason: not valid java name */
    public final int m282getAnimationModeZbEOnfQ() {
        return ((MarqueeAnimationMode) this.animationMode.getValue()).getValue();
    }

    public final MarqueeSpacing getSpacing() {
        return (MarqueeSpacing) this.spacing.getValue();
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.maxIntrinsicWidth(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo54measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(j2, 0, Integer.MAX_VALUE, 0, 0, 13, null));
        setContainerWidth(ConstraintsKt.m6203constrainWidthK40F9xA(j2, placeableMo5120measureBRTryo0.getWidth()));
        setContentWidth(placeableMo5120measureBRTryo0.getWidth());
        return MeasureScope.layout$default(measureScope, getContainerWidth(), placeableMo5120measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.MarqueeModifierNode$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeWithLayer$default(placementScope, placeableMo5120measureBRTryo0, MathKt.roundToInt((-((Number) this.offset.getValue()).floatValue()) * this.getDirection()), 0, 0.0f, (Function1) null, 12, (Object) null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.minIntrinsicHeight(Integer.MAX_VALUE);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return 0;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        restartAnimation();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        Job job = this.animationJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.animationJob = null;
    }

    @Override // androidx.compose.ui.focus.FocusEventModifierNode
    public void onFocusEvent(FocusState focusState) {
        setHasFocus(focusState.getHasFocus());
    }

    /* renamed from: setAnimationMode-97h66l8, reason: not valid java name */
    public final void m283setAnimationMode97h66l8(int i2) {
        this.animationMode.setValue(MarqueeAnimationMode.m268boximpl(i2));
    }

    public final void setSpacing(MarqueeSpacing marqueeSpacing) {
        this.spacing.setValue(marqueeSpacing);
    }

    /* renamed from: update-lWfNwf4, reason: not valid java name */
    public final void m284updatelWfNwf4(int iterations, int animationMode, int delayMillis, int initialDelayMillis, MarqueeSpacing spacing, float velocity) {
        setSpacing(spacing);
        m283setAnimationMode97h66l8(animationMode);
        if (this.iterations == iterations && this.delayMillis == delayMillis && this.initialDelayMillis == initialDelayMillis && Dp.m6238equalsimpl0(this.velocity, velocity)) {
            return;
        }
        this.iterations = iterations;
        this.delayMillis = delayMillis;
        this.initialDelayMillis = initialDelayMillis;
        this.velocity = velocity;
        restartAnimation();
    }

    private MarqueeModifierNode(int i2, int i3, int i4, int i5, final MarqueeSpacing marqueeSpacing, float f2) {
        this.iterations = i2;
        this.delayMillis = i4;
        this.initialDelayMillis = i5;
        this.velocity = f2;
        this.contentWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.containerWidth = SnapshotIntStateKt.mutableIntStateOf(0);
        this.hasFocus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.spacing = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(marqueeSpacing, null, 2, null);
        this.animationMode = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MarqueeAnimationMode.m268boximpl(i3), null, 2, null);
        this.offset = AnimatableKt.Animatable$default(0.0f, 0.0f, 2, null);
        this.spacingPx = SnapshotStateKt.derivedStateOf(new Function0<Integer>() { // from class: androidx.compose.foundation.MarqueeModifierNode$spacingPx$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Integer invoke() {
                MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
                MarqueeModifierNode marqueeModifierNode = this;
                return Integer.valueOf(marqueeSpacing2.calculateSpacing(DelegatableNodeKt.requireDensity(marqueeModifierNode), marqueeModifierNode.getContentWidth(), marqueeModifierNode.getContainerWidth()));
            }
        });
    }
}
