package androidx.compose.foundation.lazy.layout;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 L2\u00020\u0001:\u0001LB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\u0006\u0010C\u001a\u00020\bJ\u0006\u0010D\u001a\u00020\bJ \u0010E\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u00152\u0006\u0010G\u001a\u00020\u001cø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u0006\u0010J\u001a\u00020\bJ\u0006\u0010K\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\"\u0010\u0014\u001a\u00020\u0015X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R+\u0010#\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\"\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R+\u0010&\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\"\u001a\u0004\b&\u0010\u001e\"\u0004\b'\u0010 R+\u0010)\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\"\u001a\u0004\b)\u0010\u001e\"\u0004\b*\u0010 R\u001e\u0010,\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\"\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\u001b\u001a\u0004\u0018\u00010-@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\"\u00101\u001a\u00020\u0015X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R1\u00104\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00158F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b7\u0010\"\u001a\u0004\b5\u0010\u0017\"\u0004\b6\u0010\u0019R\u001a\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020:09X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\"\u0010>\u001a\u00020\u0015X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001a\u001a\u0004\b?\u0010\u0017\"\u0004\b@\u0010\u0019R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020B09X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "onLayerPropertyChanged", "Lkotlin/Function0;", "", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;Lkotlin/jvm/functions/Function0;)V", "fadeInSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "getFadeInSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "setFadeInSpec", "(Landroidx/compose/animation/core/FiniteAnimationSpec;)V", "fadeOutSpec", "getFadeOutSpec", "setFadeOutSpec", "finalOffset", "Landroidx/compose/ui/unit/IntOffset;", "getFinalOffset-nOcc-ac", "()J", "setFinalOffset--gyyYBs", "(J)V", "J", "<set-?>", "", "isAppearanceAnimationInProgress", "()Z", "setAppearanceAnimationInProgress", "(Z)V", "isAppearanceAnimationInProgress$delegate", "Landroidx/compose/runtime/MutableState;", "isDisappearanceAnimationFinished", "setDisappearanceAnimationFinished", "isDisappearanceAnimationFinished$delegate", "isDisappearanceAnimationInProgress", "setDisappearanceAnimationInProgress", "isDisappearanceAnimationInProgress$delegate", "isPlacementAnimationInProgress", "setPlacementAnimationInProgress", "isPlacementAnimationInProgress$delegate", "isRunningMovingAwayAnimation", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "getLayer", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "lookaheadOffset", "getLookaheadOffset-nOcc-ac", "setLookaheadOffset--gyyYBs", "placementDelta", "getPlacementDelta-nOcc-ac", "setPlacementDelta--gyyYBs", "placementDelta$delegate", "placementDeltaAnimation", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector2D;", "placementSpec", "getPlacementSpec", "setPlacementSpec", "rawOffset", "getRawOffset-nOcc-ac", "setRawOffset--gyyYBs", "visibilityAnimation", "Landroidx/compose/animation/core/AnimationVector1D;", "animateAppearance", "animateDisappearance", "animatePlacementDelta", "delta", "isMovingAway", "animatePlacementDelta-ar5cAso", "(JZ)V", "cancelPlacementAnimation", "release", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimation {
    private final CoroutineScope coroutineScope;
    private FiniteAnimationSpec<Float> fadeInSpec;
    private FiniteAnimationSpec<Float> fadeOutSpec;
    private long finalOffset;
    private final GraphicsContext graphicsContext;

    /* renamed from: isAppearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    private final MutableState isAppearanceAnimationInProgress;

    /* renamed from: isDisappearanceAnimationFinished$delegate, reason: from kotlin metadata */
    private final MutableState isDisappearanceAnimationFinished;

    /* renamed from: isDisappearanceAnimationInProgress$delegate, reason: from kotlin metadata */
    private final MutableState isDisappearanceAnimationInProgress;

    /* renamed from: isPlacementAnimationInProgress$delegate, reason: from kotlin metadata */
    private final MutableState isPlacementAnimationInProgress;
    private boolean isRunningMovingAwayAnimation;
    private GraphicsLayer layer;
    private long lookaheadOffset;
    private final Function0<Unit> onLayerPropertyChanged;

    /* renamed from: placementDelta$delegate, reason: from kotlin metadata */
    private final MutableState placementDelta;
    private final Animatable<IntOffset, AnimationVector2D> placementDeltaAnimation;
    private FiniteAnimationSpec<IntOffset> placementSpec;
    private long rawOffset;
    private final Animatable<Float, AnimationVector1D> visibilityAnimation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final long NotInitialized = IntOffsetKt.IntOffset(Integer.MAX_VALUE, Integer.MAX_VALUE);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation$Companion;", "", "()V", "NotInitialized", "Landroidx/compose/ui/unit/IntOffset;", "getNotInitialized-nOcc-ac", "()J", "J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getNotInitialized-nOcc-ac, reason: not valid java name */
        public final long m806getNotInitializednOccac() {
            return LazyLayoutItemAnimation.NotInitialized;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$1, reason: invalid class name and case insensitive filesystem */
    public static final class C02741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C02741(Continuation<? super C02741> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C02741(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                Float fBoxFloat = Boxing.boxFloat(1.0f);
                this.label = 1;
                if (animatable.snapTo(fBoxFloat, this) == coroutine_suspended) {
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
            return ((C02741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {195, 197}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ boolean $shouldResetValue;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;
        final /* synthetic */ LazyLayoutItemAnimation this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, LazyLayoutItemAnimation lazyLayoutItemAnimation, FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$shouldResetValue = z;
            this.this$0 = lazyLayoutItemAnimation;
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$shouldResetValue, this.this$0, this.$spec, this.$layer, continuation);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|2|33|(1:(1:(4:6|7|25|26)(2:10|11))(1:12))(6:14|36|15|(3:17|(1:19)|24)|31|32)|20|21|34|22|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
        
            if (androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, null, r8, r9, 4, null) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        
            r0 = th;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L24
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L14
                r9 = r12
                goto L64
            L14:
                r0 = move-exception
                r13 = r0
                r9 = r12
                goto L72
            L18:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L20:
                kotlin.ResultKt.throwOnFailure(r13)     // Catch: java.lang.Throwable -> L14
                goto L40
            L24:
                kotlin.ResultKt.throwOnFailure(r13)
                boolean r13 = r12.$shouldResetValue     // Catch: java.lang.Throwable -> L6f
                if (r13 == 0) goto L40
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L14
                androidx.compose.animation.core.Animatable r13 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L14
                r1 = 0
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r1)     // Catch: java.lang.Throwable -> L14
                r12.label = r4     // Catch: java.lang.Throwable -> L14
                java.lang.Object r13 = r13.snapTo(r1, r12)     // Catch: java.lang.Throwable -> L14
                if (r13 != r0) goto L40
                r9 = r12
                goto L63
            L40:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r12.this$0     // Catch: java.lang.Throwable -> L6f
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$getVisibilityAnimation$p(r13)     // Catch: java.lang.Throwable -> L6f
                r13 = 1065353216(0x3f800000, float:1.0)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.Boxing.boxFloat(r13)     // Catch: java.lang.Throwable -> L6f
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r6 = r12.$spec     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1 r8 = new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$1     // Catch: java.lang.Throwable -> L6f
                androidx.compose.ui.graphics.layer.GraphicsLayer r13 = r12.$layer     // Catch: java.lang.Throwable -> L6f
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r1 = r12.this$0     // Catch: java.lang.Throwable -> L6f
                r8.<init>()     // Catch: java.lang.Throwable -> L6f
                r12.label = r3     // Catch: java.lang.Throwable -> L6f
                r7 = 0
                r10 = 4
                r11 = 0
                r9 = r12
                java.lang.Object r13 = androidx.compose.animation.core.Animatable.animateTo$default(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L6c
                if (r13 != r0) goto L64
            L63:
                return r0
            L64:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r13 = r9.this$0
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r13, r2)
                kotlin.Unit r13 = kotlin.Unit.INSTANCE
                return r13
            L6c:
                r0 = move-exception
            L6d:
                r13 = r0
                goto L72
            L6f:
                r0 = move-exception
                r9 = r12
                goto L6d
            L72:
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation r0 = r9.this$0
                androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.access$setAppearanceAnimationInProgress(r0, r2)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1, reason: invalid class name and case insensitive filesystem */
    public static final class C02751 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ GraphicsLayer $layer;
        final /* synthetic */ FiniteAnimationSpec<Float> $spec;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02751(FiniteAnimationSpec<Float> finiteAnimationSpec, GraphicsLayer graphicsLayer, Continuation<? super C02751> continuation) {
            super(2, continuation);
            this.$spec = finiteAnimationSpec;
            this.$layer = graphicsLayer;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C02751(this.$spec, this.$layer, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C02751 c02751;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                    Float fBoxFloat = Boxing.boxFloat(0.0f);
                    FiniteAnimationSpec<Float> finiteAnimationSpec = this.$spec;
                    final GraphicsLayer graphicsLayer = this.$layer;
                    final LazyLayoutItemAnimation lazyLayoutItemAnimation = LazyLayoutItemAnimation.this;
                    Function1<Animatable<Float, AnimationVector1D>, Unit> function1 = new Function1<Animatable<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.animateDisappearance.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Animatable<Float, AnimationVector1D> animatable2) {
                            invoke2(animatable2);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Animatable<Float, AnimationVector1D> animatable2) {
                            graphicsLayer.setAlpha(animatable2.getValue().floatValue());
                            lazyLayoutItemAnimation.onLayerPropertyChanged.invoke();
                        }
                    };
                    this.label = 1;
                    c02751 = this;
                    try {
                        if (Animatable.animateTo$default(animatable, fBoxFloat, finiteAnimationSpec, null, function1, c02751, 4, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c02751 = this;
                    th = th;
                    LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c02751 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c02751 = this;
                    LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
                    throw th;
                }
            }
            LazyLayoutItemAnimation.this.setDisappearanceAnimationFinished(true);
            LazyLayoutItemAnimation.this.setDisappearanceAnimationInProgress(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C02751) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$cancelPlacementAnimation$1, reason: invalid class name and case insensitive filesystem */
    public static final class C02761 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C02761(Continuation<? super C02761> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C02761(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.placementDeltaAnimation;
                IntOffset intOffsetM6352boximpl = IntOffset.m6352boximpl(IntOffset.INSTANCE.m6371getZeronOccac());
                this.label = 1;
                if (animatable.snapTo(intOffsetM6352boximpl, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            LazyLayoutItemAnimation.this.m797setPlacementDeltagyyYBs(IntOffset.INSTANCE.m6371getZeronOccac());
            LazyLayoutItemAnimation.this.setPlacementAnimationInProgress(false);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C02761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$1, reason: invalid class name and case insensitive filesystem */
    public static final class C02771 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C02771(Continuation<? super C02771> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C02771(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.placementDeltaAnimation;
                this.label = 1;
                if (animatable.stop(this) == coroutine_suspended) {
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
            return ((C02771) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$2, reason: invalid class name and case insensitive filesystem */
    public static final class C02782 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C02782(Continuation<? super C02782> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new C02782(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                this.label = 1;
                if (animatable.stop(this) == coroutine_suspended) {
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
            return ((C02782) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3", f = "LazyLayoutItemAnimation.kt", i = {}, l = {243}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$release$3, reason: invalid class name */
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LazyLayoutItemAnimation.this.new AnonymousClass3(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                Animatable animatable = LazyLayoutItemAnimation.this.visibilityAnimation;
                this.label = 1;
                if (animatable.stop(this) == coroutine_suspended) {
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
            return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0<Unit> function0) {
        this.coroutineScope = coroutineScope;
        this.graphicsContext = graphicsContext;
        this.onLayerPropertyChanged = function0;
        Boolean bool = Boolean.FALSE;
        this.isPlacementAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isAppearanceAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationInProgress = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.isDisappearanceAnimationFinished = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        long j2 = NotInitialized;
        this.rawOffset = j2;
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.finalOffset = companion.m6371getZeronOccac();
        this.layer = graphicsContext != null ? graphicsContext.createGraphicsLayer() : null;
        String str = null;
        this.placementDeltaAnimation = new Animatable<>(IntOffset.m6352boximpl(companion.m6371getZeronOccac()), VectorConvertersKt.getVectorConverter(companion), null, str, 12, null);
        this.visibilityAnimation = new Animatable<>(Float.valueOf(1.0f), VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE), str, null, 12, null);
        this.placementDelta = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntOffset.m6352boximpl(companion.m6371getZeronOccac()), null, 2, null);
        this.lookaheadOffset = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAppearanceAnimationInProgress(boolean z) {
        this.isAppearanceAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationFinished(boolean z) {
        this.isDisappearanceAnimationFinished.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDisappearanceAnimationInProgress(boolean z) {
        this.isDisappearanceAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setPlacementAnimationInProgress(boolean z) {
        this.isPlacementAnimationInProgress.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPlacementDelta--gyyYBs, reason: not valid java name */
    public final void m797setPlacementDeltagyyYBs(long j2) {
        this.placementDelta.setValue(IntOffset.m6352boximpl(j2));
    }

    public final void animateAppearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeInSpec;
        if (isAppearanceAnimationInProgress() || finiteAnimationSpec == null || graphicsLayer == null) {
            if (isDisappearanceAnimationInProgress()) {
                if (graphicsLayer != null) {
                    graphicsLayer.setAlpha(1.0f);
                }
                BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C02741(null), 3, null);
                return;
            }
            return;
        }
        setAppearanceAnimationInProgress(true);
        boolean zIsDisappearanceAnimationInProgress = isDisappearanceAnimationInProgress();
        boolean z = !zIsDisappearanceAnimationInProgress;
        if (!zIsDisappearanceAnimationInProgress) {
            graphicsLayer.setAlpha(0.0f);
        }
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass2(z, this, finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    public final void animateDisappearance() {
        GraphicsLayer graphicsLayer = this.layer;
        FiniteAnimationSpec<Float> finiteAnimationSpec = this.fadeOutSpec;
        if (graphicsLayer == null || isDisappearanceAnimationInProgress() || finiteAnimationSpec == null) {
            return;
        }
        setDisappearanceAnimationInProgress(true);
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C02751(finiteAnimationSpec, graphicsLayer, null), 3, null);
    }

    /* renamed from: animatePlacementDelta-ar5cAso, reason: not valid java name */
    public final void m798animatePlacementDeltaar5cAso(long delta, boolean isMovingAway) {
        FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.placementSpec;
        if (finiteAnimationSpec == null) {
            return;
        }
        long jM6364minusqkQi6aY = IntOffset.m6364minusqkQi6aY(m801getPlacementDeltanOccac(), delta);
        m797setPlacementDeltagyyYBs(jM6364minusqkQi6aY);
        setPlacementAnimationInProgress(true);
        this.isRunningMovingAwayAnimation = isMovingAway;
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new LazyLayoutItemAnimation$animatePlacementDelta$1(this, finiteAnimationSpec, jM6364minusqkQi6aY, null), 3, null);
    }

    public final void cancelPlacementAnimation() {
        if (isPlacementAnimationInProgress()) {
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C02761(null), 3, null);
        }
    }

    public final FiniteAnimationSpec<Float> getFadeInSpec() {
        return this.fadeInSpec;
    }

    public final FiniteAnimationSpec<Float> getFadeOutSpec() {
        return this.fadeOutSpec;
    }

    /* renamed from: getFinalOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getFinalOffset() {
        return this.finalOffset;
    }

    public final GraphicsLayer getLayer() {
        return this.layer;
    }

    /* renamed from: getLookaheadOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getLookaheadOffset() {
        return this.lookaheadOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPlacementDelta-nOcc-ac, reason: not valid java name */
    public final long m801getPlacementDeltanOccac() {
        return ((IntOffset) this.placementDelta.getValue()).getPackedValue();
    }

    public final FiniteAnimationSpec<IntOffset> getPlacementSpec() {
        return this.placementSpec;
    }

    /* renamed from: getRawOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getRawOffset() {
        return this.rawOffset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAppearanceAnimationInProgress() {
        return ((Boolean) this.isAppearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationFinished() {
        return ((Boolean) this.isDisappearanceAnimationFinished.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isDisappearanceAnimationInProgress() {
        return ((Boolean) this.isDisappearanceAnimationInProgress.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isPlacementAnimationInProgress() {
        return ((Boolean) this.isPlacementAnimationInProgress.getValue()).booleanValue();
    }

    /* renamed from: isRunningMovingAwayAnimation, reason: from getter */
    public final boolean getIsRunningMovingAwayAnimation() {
        return this.isRunningMovingAwayAnimation;
    }

    public final void release() {
        GraphicsContext graphicsContext;
        if (isPlacementAnimationInProgress()) {
            setPlacementAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C02771(null), 3, null);
        }
        if (isAppearanceAnimationInProgress()) {
            setAppearanceAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C02782(null), 3, null);
        }
        if (isDisappearanceAnimationInProgress()) {
            setDisappearanceAnimationInProgress(false);
            BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new AnonymousClass3(null), 3, null);
        }
        this.isRunningMovingAwayAnimation = false;
        m797setPlacementDeltagyyYBs(IntOffset.INSTANCE.m6371getZeronOccac());
        this.rawOffset = NotInitialized;
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null && (graphicsContext = this.graphicsContext) != null) {
            graphicsContext.releaseGraphicsLayer(graphicsLayer);
        }
        this.layer = null;
        this.fadeInSpec = null;
        this.fadeOutSpec = null;
        this.placementSpec = null;
    }

    public final void setFadeInSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeInSpec = finiteAnimationSpec;
    }

    public final void setFadeOutSpec(FiniteAnimationSpec<Float> finiteAnimationSpec) {
        this.fadeOutSpec = finiteAnimationSpec;
    }

    /* renamed from: setFinalOffset--gyyYBs, reason: not valid java name */
    public final void m803setFinalOffsetgyyYBs(long j2) {
        this.finalOffset = j2;
    }

    /* renamed from: setLookaheadOffset--gyyYBs, reason: not valid java name */
    public final void m804setLookaheadOffsetgyyYBs(long j2) {
        this.lookaheadOffset = j2;
    }

    public final void setPlacementSpec(FiniteAnimationSpec<IntOffset> finiteAnimationSpec) {
        this.placementSpec = finiteAnimationSpec;
    }

    /* renamed from: setRawOffset--gyyYBs, reason: not valid java name */
    public final void m805setRawOffsetgyyYBs(long j2) {
        this.rawOffset = j2;
    }

    public /* synthetic */ LazyLayoutItemAnimation(CoroutineScope coroutineScope, GraphicsContext graphicsContext, Function0 function0, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(coroutineScope, (i2 & 2) != 0 ? null : graphicsContext, (i2 & 4) != 0 ? new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation.1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        } : function0);
    }
}
