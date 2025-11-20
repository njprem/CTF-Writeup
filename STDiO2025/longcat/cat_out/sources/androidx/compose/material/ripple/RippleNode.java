package androidx.compose.material.ripple;

import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutAwareModifierNode;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import j.C0646L;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B5\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\u00020\u0014*\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\u0014*\u00020'H&¢\u0006\u0004\b(\u0010)J*\u00100\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020*2\u0006\u0010\u001e\u001a\u00020+2\u0006\u0010-\u001a\u00020,H&ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020*H&¢\u0006\u0004\b1\u00102R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00103R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u00106R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\n\u00107R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00108R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000f\u00109\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u00078\u0006X\u0086D¢\u0006\f\n\u0004\b<\u00104\u001a\u0004\b=\u00106R\u0018\u0010?\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010-\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u00107R*\u0010B\u001a\u00020+2\u0006\u0010A\u001a\u00020+8\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010F\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u00104R\u001a\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00120G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0017\u0010L\u001a\u00020J8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bK\u0010E\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/material/ripple/RippleNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "", "bounded", "Landroidx/compose/ui/unit/Dp;", "radius", "Landroidx/compose/ui/graphics/ColorProducer;", "color", "Lkotlin/Function0;", "Landroidx/compose/material/ripple/RippleAlpha;", "rippleAlpha", "<init>", "(Landroidx/compose/foundation/interaction/InteractionSource;ZFLandroidx/compose/ui/graphics/ColorProducer;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/compose/foundation/interaction/PressInteraction;", "pressInteraction", "", "handlePressInteraction", "(Landroidx/compose/foundation/interaction/PressInteraction;)V", "Landroidx/compose/foundation/interaction/Interaction;", "interaction", "Lkotlinx/coroutines/CoroutineScope;", "scope", "updateStateLayer", "(Landroidx/compose/foundation/interaction/Interaction;Lkotlinx/coroutines/CoroutineScope;)V", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "onAttach", "()V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "draw", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawRipples", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "Landroidx/compose/ui/geometry/Size;", "", "targetRadius", "addRipple-12SF9DM", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;JF)V", "addRipple", "removeRipple", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;)V", "Landroidx/compose/foundation/interaction/InteractionSource;", "Z", "getBounded", "()Z", "F", "Landroidx/compose/ui/graphics/ColorProducer;", "Lkotlin/jvm/functions/Function0;", "getRippleAlpha", "()Lkotlin/jvm/functions/Function0;", "shouldAutoInvalidate", "getShouldAutoInvalidate", "Landroidx/compose/material/ripple/StateLayer;", "stateLayer", "Landroidx/compose/material/ripple/StateLayer;", "<set-?>", "rippleSize", "J", "getRippleSize-NH-jbRc", "()J", "hasValidSize", "Lj/L;", "pendingInteractions", "Lj/L;", "Landroidx/compose/ui/graphics/Color;", "getRippleColor-0d7_KjU", "rippleColor", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class RippleNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, DrawModifierNode, LayoutAwareModifierNode {
    public static final int $stable = 8;
    private final boolean bounded;
    private final ColorProducer color;
    private boolean hasValidSize;
    private final InteractionSource interactionSource;
    private final C0646L pendingInteractions;
    private final float radius;
    private final Function0<RippleAlpha> rippleAlpha;
    private long rippleSize;
    private final boolean shouldAutoInvalidate;
    private StateLayer stateLayer;
    private float targetRadius;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.material.ripple.RippleNode$onAttach$1", f = "Ripple.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material.ripple.RippleNode$onAttach$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = RippleNode.this.new AnonymousClass1(continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                final CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Flow<Interaction> interactions = RippleNode.this.interactionSource.getInteractions();
                final RippleNode rippleNode = RippleNode.this;
                FlowCollector<? super Interaction> flowCollector = new FlowCollector() { // from class: androidx.compose.material.ripple.RippleNode.onAttach.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Interaction) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(Interaction interaction, Continuation<? super Unit> continuation) {
                        if (!(interaction instanceof PressInteraction)) {
                            rippleNode.updateStateLayer(interaction, coroutineScope);
                        } else if (rippleNode.hasValidSize) {
                            rippleNode.handlePressInteraction((PressInteraction) interaction);
                        } else {
                            rippleNode.pendingInteractions.a(interaction);
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (interactions.collect(flowCollector, this) == coroutine_suspended) {
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

    public /* synthetic */ RippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Function0 function0, DefaultConstructorMarker defaultConstructorMarker) {
        this(interactionSource, z, f2, colorProducer, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handlePressInteraction(PressInteraction pressInteraction) {
        if (pressInteraction instanceof PressInteraction.Press) {
            mo1368addRipple12SF9DM((PressInteraction.Press) pressInteraction, this.rippleSize, this.targetRadius);
        } else if (pressInteraction instanceof PressInteraction.Release) {
            removeRipple(((PressInteraction.Release) pressInteraction).getPress());
        } else if (pressInteraction instanceof PressInteraction.Cancel) {
            removeRipple(((PressInteraction.Cancel) pressInteraction).getPress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateStateLayer(Interaction interaction, CoroutineScope scope) {
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer == null) {
            stateLayer = new StateLayer(this.bounded, this.rippleAlpha);
            DrawModifierNodeKt.invalidateDraw(this);
            this.stateLayer = stateLayer;
        }
        stateLayer.handleInteraction$material_ripple_release(interaction, scope);
    }

    /* renamed from: addRipple-12SF9DM */
    public abstract void mo1368addRipple12SF9DM(PressInteraction.Press interaction, long size, float targetRadius);

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        StateLayer stateLayer = this.stateLayer;
        if (stateLayer != null) {
            stateLayer.m1385drawStateLayermxwnekA(contentDrawScope, this.targetRadius, m1380getRippleColor0d7_KjU());
        }
        drawRipples(contentDrawScope);
    }

    public abstract void drawRipples(DrawScope drawScope);

    public final boolean getBounded() {
        return this.bounded;
    }

    public final Function0<RippleAlpha> getRippleAlpha() {
        return this.rippleAlpha;
    }

    /* renamed from: getRippleColor-0d7_KjU, reason: not valid java name */
    public final long m1380getRippleColor0d7_KjU() {
        return this.color.mo1693invoke0d7_KjU();
    }

    /* renamed from: getRippleSize-NH-jbRc, reason: not valid java name and from getter */
    public final long getRippleSize() {
        return this.rippleSize;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return this.shouldAutoInvalidate;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new AnonymousClass1(null), 3, null);
    }

    @Override // androidx.compose.ui.node.LayoutAwareModifierNode
    /* renamed from: onRemeasured-ozmzZPI */
    public void mo324onRemeasuredozmzZPI(long size) {
        this.hasValidSize = true;
        Density densityRequireDensity = DelegatableNodeKt.requireDensity(this);
        this.rippleSize = IntSizeKt.m6415toSizeozmzZPI(size);
        this.targetRadius = Float.isNaN(this.radius) ? RippleAnimationKt.m1373getRippleEndRadiuscSwnlzA(densityRequireDensity, this.bounded, this.rippleSize) : densityRequireDensity.mo334toPx0680j_4(this.radius);
        C0646L c0646l = this.pendingInteractions;
        Object[] objArr = c0646l.f773a;
        int i2 = c0646l.f774b;
        for (int i3 = 0; i3 < i2; i3++) {
            handlePressInteraction((PressInteraction) objArr[i3]);
        }
        C0646L c0646l2 = this.pendingInteractions;
        ArraysKt___ArraysJvmKt.fill(c0646l2.f773a, (Object) null, 0, c0646l2.f774b);
        c0646l2.f774b = 0;
    }

    public abstract void removeRipple(PressInteraction.Press interaction);

    private RippleNode(InteractionSource interactionSource, boolean z, float f2, ColorProducer colorProducer, Function0<RippleAlpha> function0) {
        this.interactionSource = interactionSource;
        this.bounded = z;
        this.radius = f2;
        this.color = colorProducer;
        this.rippleAlpha = function0;
        this.rippleSize = Size.INSTANCE.m3629getZeroNHjbRc();
        this.pendingInteractions = new C0646L();
    }
}
