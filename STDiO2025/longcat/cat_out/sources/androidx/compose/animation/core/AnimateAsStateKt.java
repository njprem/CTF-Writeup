package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FloatCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aH\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0013\u001a\u00020\u00042\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aM\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010!\u001aW\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00022\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00152\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010\"\u001aC\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010$\u001aM\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u00122\u0006\u0010\u0013\u001a\u00020\u00062\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010%\u001aH\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001aR\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\u0006\u0010\u0013\u001a\u00020\b2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001aH\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010(\u001aR\u0010+\u001a\b\u0012\u0004\u0012\u00020\n0\u00122\u0006\u0010\u0013\u001a\u00020\n2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010*\u001aH\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010(\u001aR\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\u0006\u0010\u0013\u001a\u00020\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010*\u001aC\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00102\u001aM\u00101\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00122\u0006\u0010\u0013\u001a\u00020\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u00103\u001aH\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b5\u0010(\u001aR\u00104\u001a\b\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0013\u001a\u00020\u00102\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u0010*\u001as\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010=\u001a}\u00107\u001a\b\u0012\u0004\u0012\u0002H80\u0012\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:2\u0006\u0010\u0013\u001a\u0002H82\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u0002H90<2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H80\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u0001H82\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017H\u0007¢\u0006\u0002\u0010>\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?²\u0006(\u0010@\u001a\u0010\u0012\u0004\u0012\u0002H8\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002²\u0006 \u0010A\u001a\b\u0012\u0004\u0012\u0002H80\u0015\"\u0004\b\u0000\u00108\"\b\b\u0001\u00109*\u00020:X\u008a\u0084\u0002"}, d2 = {"defaultAnimation", "Landroidx/compose/animation/core/SpringSpec;", "", "dpDefaultSpring", "Landroidx/compose/ui/unit/Dp;", "intDefaultSpring", "", "intOffsetDefaultSpring", "Landroidx/compose/ui/unit/IntOffset;", "intSizeDefaultSpring", "Landroidx/compose/ui/unit/IntSize;", "offsetDefaultSpring", "Landroidx/compose/ui/geometry/Offset;", "rectDefaultSpring", "Landroidx/compose/ui/geometry/Rect;", "sizeDefaultSpring", "Landroidx/compose/ui/geometry/Size;", "animateDpAsState", "Landroidx/compose/runtime/State;", "targetValue", "animationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "finishedListener", "Lkotlin/Function1;", "", "animateDpAsState-Kz89ssw", "(FLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "label", "", "animateDpAsState-AjpBEmI", "(FLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateFloatAsState", "visibilityThreshold", "(FLandroidx/compose/animation/core/AnimationSpec;FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(FLandroidx/compose/animation/core/AnimationSpec;FLjava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntAsState", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(ILandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState", "animateIntOffsetAsState-8f6pmRE", "(JLandroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntOffsetAsState-HyPO7BM", "(JLandroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateIntSizeAsState", "animateIntSizeAsState-zTRF_AQ", "animateIntSizeAsState-4goxYXU", "animateOffsetAsState", "animateOffsetAsState-N6fFfp4", "animateOffsetAsState-7362WCg", "animateRectAsState", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Landroidx/compose/ui/geometry/Rect;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animateSizeAsState", "animateSizeAsState-LjSzlW0", "animateSizeAsState-YLp_XPw", "animateValueAsState", "T", "V", "Landroidx/compose/animation/core/AnimationVector;", "typeConverter", "Landroidx/compose/animation/core/TwoWayConverter;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Ljava/lang/Object;Landroidx/compose/animation/core/TwoWayConverter;Landroidx/compose/animation/core/AnimationSpec;Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation-core_release", "listener", "animSpec"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimateAsStateKt {
    private static final SpringSpec<Float> defaultAnimation = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
    private static final SpringSpec<Dp> dpDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Dp.m6231boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Dp.INSTANCE)), 3, null);
    private static final SpringSpec<Size> sizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Size.m3608boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Size.INSTANCE)), 3, null);
    private static final SpringSpec<Offset> offsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Offset.m3540boximpl(VisibilityThresholdsKt.getVisibilityThreshold(Offset.INSTANCE)), 3, null);
    private static final SpringSpec<Rect> rectDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, VisibilityThresholdsKt.getVisibilityThreshold(Rect.INSTANCE), 3, null);
    private static final SpringSpec<Integer> intDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, Integer.valueOf(VisibilityThresholdsKt.getVisibilityThreshold(IntCompanionObject.INSTANCE)), 3, null);
    private static final SpringSpec<IntOffset> intOffsetDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntOffset.m6352boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntOffset.INSTANCE)), 3, null);
    private static final SpringSpec<IntSize> intSizeDefaultSpring = AnimationSpecKt.spring$default(0.0f, 0.0f, IntSize.m6395boximpl(VisibilityThresholdsKt.getVisibilityThreshold(IntSize.INSTANCE)), 3, null);

    /* renamed from: animateDpAsState-AjpBEmI, reason: not valid java name */
    public static final State<Dp> m90animateDpAsStateAjpBEmI(float f2, AnimationSpec<Dp> animationSpec, String str, Function1<? super Dp, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec<Dp> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Dp, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1407150062, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:113)");
        }
        int i4 = i2 << 6;
        State<Dp> stateAnimateValueAsState = animateValueAsState(Dp.m6231boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateDpAsState-Kz89ssw, reason: not valid java name */
    public static final /* synthetic */ State m91animateDpAsStateKz89ssw(float f2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = dpDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(704104481, i2, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        State stateAnimateValueAsState = animateValueAsState(Dp.m6231boximpl(f2), VectorConvertersKt.getVectorConverter(Dp.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Float> animateFloatAsState(float f2, AnimationSpec<Float> animationSpec, float f3, String str, Function1<? super Float, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        if ((i3 & 4) != 0) {
            f3 = 0.01f;
        }
        if ((i3 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1<? super Float, Unit> function12 = (i3 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(668842840, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:68)");
        }
        if (animationSpec == defaultAnimation) {
            composer.startReplaceGroup(1125598679);
            boolean z = (((i2 & 896) ^ 384) > 256 && composer.changed(f3)) || (i2 & 384) == 256;
            Object objRememberedValue = composer.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, Float.valueOf(f3), 3, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            animationSpec = (SpringSpec) objRememberedValue;
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(1125708605);
            composer.endReplaceGroup();
        }
        AnimationSpec<Float> animationSpec2 = animationSpec;
        Float fValueOf = Float.valueOf(f2);
        TwoWayConverter<Float, AnimationVector1D> vectorConverter = VectorConvertersKt.getVectorConverter(FloatCompanionObject.INSTANCE);
        Float fValueOf2 = Float.valueOf(f3);
        int i4 = i2 << 3;
        State<Float> stateAnimateValueAsState = animateValueAsState(fValueOf, vectorConverter, animationSpec2, fValueOf2, str2, function12, composer, (i2 & 14) | (i4 & 7168) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Integer> animateIntAsState(int i2, AnimationSpec<Integer> animationSpec, String str, Function1<? super Integer, Unit> function1, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec<Integer> animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i4 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Integer, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(428074472, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:273)");
        }
        int i5 = i3 << 6;
        State<Integer> stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec2, null, str2, function12, composer, (i3 & 14) | ((i3 << 3) & 896) | (57344 & i5) | (i5 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntOffsetAsState-8f6pmRE, reason: not valid java name */
    public static final /* synthetic */ State m92animateIntOffsetAsState8f6pmRE(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1010307371, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:543)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntOffset.m6352boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntOffsetAsState-HyPO7BM, reason: not valid java name */
    public static final State<IntOffset> m93animateIntOffsetAsStateHyPO7BM(long j2, AnimationSpec<IntOffset> animationSpec, String str, Function1<? super IntOffset, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intOffsetDefaultSpring;
        }
        AnimationSpec<IntOffset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super IntOffset, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-696782904, i2, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:313)");
        }
        int i4 = i2 << 6;
        State<IntOffset> stateAnimateValueAsState = animateValueAsState(IntOffset.m6352boximpl(j2), VectorConvertersKt.getVectorConverter(IntOffset.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateIntSizeAsState-4goxYXU, reason: not valid java name */
    public static final State<IntSize> m94animateIntSizeAsState4goxYXU(long j2, AnimationSpec<IntSize> animationSpec, String str, Function1<? super IntSize, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec<IntSize> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super IntSize, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(582576328, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:351)");
        }
        int i4 = i2 << 6;
        State<IntSize> stateAnimateValueAsState = animateValueAsState(IntSize.m6395boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateIntSizeAsState-zTRF_AQ, reason: not valid java name */
    public static final /* synthetic */ State m95animateIntSizeAsStatezTRF_AQ(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = intSizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1749239765, i2, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:558)");
        }
        State stateAnimateValueAsState = animateValueAsState(IntSize.m6395boximpl(j2), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateOffsetAsState-7362WCg, reason: not valid java name */
    public static final State<Offset> m96animateOffsetAsState7362WCg(long j2, AnimationSpec<Offset> animationSpec, String str, Function1<? super Offset, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec<Offset> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Offset, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(357896800, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:194)");
        }
        int i4 = i2 << 6;
        State<Offset> stateAnimateValueAsState = animateValueAsState(Offset.m3540boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateOffsetAsState-N6fFfp4, reason: not valid java name */
    public static final /* synthetic */ State m97animateOffsetAsStateN6fFfp4(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = offsetDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-456513133, i2, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        State stateAnimateValueAsState = animateValueAsState(Offset.m3540boximpl(j2), VectorConvertersKt.getVectorConverter(Offset.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final State<Rect> animateRectAsState(Rect rect, AnimationSpec<Rect> animationSpec, String str, Function1<? super Rect, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec<Rect> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Rect, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(536062978, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:235)");
        }
        int i4 = i2 << 6;
        State<Rect> stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    /* renamed from: animateSizeAsState-LjSzlW0, reason: not valid java name */
    public static final /* synthetic */ State m98animateSizeAsStateLjSzlW0(long j2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(875212471, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        State stateAnimateValueAsState = animateValueAsState(Size.m3608boximpl(j2), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    /* renamed from: animateSizeAsState-YLp_XPw, reason: not valid java name */
    public static final State<Size> m99animateSizeAsStateYLp_XPw(long j2, AnimationSpec<Size> animationSpec, String str, Function1<? super Size, Unit> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = sizeDefaultSpring;
        }
        AnimationSpec<Size> animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Size, Unit> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1374633148, i2, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:154)");
        }
        int i4 = i2 << 6;
        State<Size> stateAnimateValueAsState = animateValueAsState(Size.m3608boximpl(j2), VectorConvertersKt.getVectorConverter(Size.INSTANCE), animationSpec2, null, str2, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | (57344 & i4) | (i4 & 458752), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    public static final <T, V extends AnimationVector> State<T> animateValueAsState(final T t, TwoWayConverter<T, V> twoWayConverter, AnimationSpec<T> animationSpec, T t2, String str, Function1<? super T, Unit> function1, Composer composer, int i2, int i3) {
        AnimationSpec<T> animationSpecSpring;
        Channel channel;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            animationSpecSpring = (SpringSpec) objRememberedValue;
        } else {
            animationSpecSpring = animationSpec;
        }
        T t3 = (i3 & 8) != 0 ? null : t2;
        String str2 = (i3 & 16) != 0 ? "ValueAnimation" : str;
        Function1<? super T, Unit> function12 = (i3 & 32) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1994373980, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:397)");
        }
        Object objRememberedValue2 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        MutableState mutableState = (MutableState) objRememberedValue2;
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Animatable(t, twoWayConverter, t3, str2);
            composer.updateRememberedValue(objRememberedValue3);
        }
        Animatable animatable = (Animatable) objRememberedValue3;
        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function12, composer, (i2 >> 15) & 14);
        if (t3 != null && (animationSpecSpring instanceof SpringSpec)) {
            SpringSpec springSpec = (SpringSpec) animationSpecSpring;
            if (!Intrinsics.areEqual(springSpec.getVisibilityThreshold(), t3)) {
                animationSpecSpring = AnimationSpecKt.spring(springSpec.getDampingRatio(), springSpec.getStiffness(), t3);
            }
        }
        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(animationSpecSpring, composer, 0);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = ChannelKt.Channel$default(-1, null, null, 6, null);
            composer.updateRememberedValue(objRememberedValue4);
        }
        final Channel channel2 = (Channel) objRememberedValue4;
        boolean zChangedInstance = ((((i2 & 14) ^ 6) > 4 && composer.changedInstance(t)) || (i2 & 6) == 4) | composer.changedInstance(channel2);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function0<Unit>() { // from class: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$2$1
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
                    channel2.mo7998trySendJP2dKIU(t);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        EffectsKt.SideEffect((Function0) objRememberedValue5, composer, 0);
        boolean zChangedInstance2 = composer.changedInstance(channel2) | composer.changedInstance(animatable) | composer.changed(stateRememberUpdatedState2) | composer.changed(stateRememberUpdatedState);
        Object objRememberedValue6 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue6 == companion.getEmpty()) {
            channel = channel2;
            Object animateAsStateKt$animateValueAsState$3$1 = new AnimateAsStateKt$animateValueAsState$3$1(channel, animatable, stateRememberUpdatedState2, stateRememberUpdatedState, null);
            composer.updateRememberedValue(animateAsStateKt$animateValueAsState$3$1);
            objRememberedValue6 = animateAsStateKt$animateValueAsState$3$1;
        } else {
            channel = channel2;
        }
        EffectsKt.LaunchedEffect(channel, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6, composer, 0);
        State<T> stateAsState = (State) mutableState.getValue();
        if (stateAsState == null) {
            stateAsState = animatable.asState();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<T, Unit> animateValueAsState$lambda$4(State<? extends Function1<? super T, Unit>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> AnimationSpec<T> animateValueAsState$lambda$6(State<? extends AnimationSpec<T>> state) {
        return state.getValue();
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateRectAsState(Rect rect, AnimationSpec animationSpec, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = rectDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-782613967, i2, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:513)");
        }
        State stateAnimateValueAsState = animateValueAsState(rect, VectorConvertersKt.getVectorConverter(Rect.INSTANCE), animationSpec2, null, null, function12, composer, (i2 & 14) | ((i2 << 3) & 896) | ((i2 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateIntAsState(int i2, AnimationSpec animationSpec, Function1 function1, Composer composer, int i3, int i4) {
        if ((i4 & 2) != 0) {
            animationSpec = intDefaultSpring;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i4 & 4) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-842612981, i3, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:528)");
        }
        State stateAnimateValueAsState = animateValueAsState(Integer.valueOf(i2), VectorConvertersKt.getVectorConverter(IntCompanionObject.INSTANCE), animationSpec2, null, null, function12, composer, (i3 & 14) | ((i3 << 3) & 896) | ((i3 << 9) & 458752), 24);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateFloatAsState(float f2, AnimationSpec animationSpec, float f3, Function1 function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            animationSpec = defaultAnimation;
        }
        AnimationSpec animationSpec2 = animationSpec;
        if ((i3 & 4) != 0) {
            f3 = 0.01f;
        }
        float f4 = f3;
        if ((i3 & 8) != 0) {
            function1 = null;
        }
        Function1 function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1091643291, i2, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        State<Float> stateAnimateFloatAsState = animateFloatAsState(f2, animationSpec2, f4, null, function12, composer, (i2 & 1022) | ((i2 << 3) & 57344), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateFloatAsState;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ State animateValueAsState(Object obj, TwoWayConverter twoWayConverter, AnimationSpec animationSpec, Object obj2, Function1 function1, Composer composer, int i2, int i3) {
        Composer composer2;
        if ((i3 & 4) != 0) {
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                composer2 = composer;
                composer2.updateRememberedValue(objRememberedValue);
            } else {
                composer2 = composer;
            }
            animationSpec = (SpringSpec) objRememberedValue;
        } else {
            composer2 = composer;
        }
        AnimationSpec animationSpec2 = animationSpec;
        Object obj3 = (i3 & 8) != 0 ? null : obj2;
        Function1 function12 = (i3 & 16) != 0 ? null : function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-846382129, i2, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:575)");
        }
        int i4 = i2 & 8;
        State stateAnimateValueAsState = animateValueAsState(obj, twoWayConverter, animationSpec2, obj3, "ValueAnimation", function12, composer2, (i4 << 9) | i4 | 24576 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (i2 & 7168) | ((i2 << 3) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValueAsState;
    }
}
