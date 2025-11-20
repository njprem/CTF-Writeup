package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a:\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aD\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u0082\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2*\b\n\u0010\u0010\u001a$\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u000e0\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0011¢\u0006\u0002\b\u0014¢\u0006\u0002\b\u00152\b\b\u0002\u0010\n\u001a\u00020\u000b2&\u0010\u0016\u001a\"\u0012\u0013\u0012\u0011H\u000e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00020\u0011¢\u0006\u0002\b\u0014H\u0087\b¢\u0006\u0002\u0010\u001a\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"animateColor", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "Landroidx/compose/animation/core/InfiniteTransition;", "initialValue", "targetValue", "animationSpec", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animateColor-RIQooxk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "label", "", "animateColor-DTcfvLk", "(Landroidx/compose/animation/core/InfiniteTransition;JJLandroidx/compose/animation/core/InfiniteRepeatableSpec;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "S", "Landroidx/compose/animation/core/Transition;", "transitionSpec", "Lkotlin/Function1;", "Landroidx/compose/animation/core/Transition$Segment;", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "targetValueByState", "Lkotlin/ParameterName;", "name", "state", "(Landroidx/compose/animation/core/Transition;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "animation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static final <S> State<Color> animateColor(Transition<S> transition, Function3<? super Transition.Segment<S>, ? super Composer, ? super Integer, ? extends FiniteAnimationSpec<Color>> function3, String str, Function3<? super S, ? super Composer, ? super Integer, Color> function32, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            function3 = new Function3<Transition.Segment<S>, Composer, Integer, SpringSpec<Color>>() { // from class: androidx.compose.animation.TransitionKt.animateColor.1
                public final SpringSpec<Color> invoke(Transition.Segment<S> segment, Composer composer2, int i4) {
                    composer2.startReplaceGroup(-1457805428);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1457805428, i4, -1, "androidx.compose.animation.animateColor.<anonymous> (Transition.kt:64)");
                    }
                    SpringSpec<Color> springSpecSpring$default = AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return springSpecSpring$default;
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ SpringSpec<Color> invoke(Object obj, Composer composer2, Integer num) {
                    return invoke((Transition.Segment) obj, composer2, num.intValue());
                }
            };
        }
        if ((i3 & 2) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        ColorSpace colorSpaceM3796getColorSpaceimpl = Color.m3796getColorSpaceimpl(function32.invoke(transition.getTargetState(), composer, Integer.valueOf((i2 >> 6) & 112)).m3802unboximpl());
        boolean zChanged = composer.changed(colorSpaceM3796getColorSpaceimpl);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(colorSpaceM3796getColorSpaceimpl);
            composer.updateRememberedValue(objRememberedValue);
        }
        int i4 = i2 & 14;
        int i5 = i2 << 3;
        int i6 = i4 | (i5 & 896) | (i5 & 7168) | (i5 & 57344);
        int i7 = (i6 >> 9) & 112;
        return androidx.compose.animation.core.TransitionKt.createTransitionAnimation(transition, function32.invoke(transition.getCurrentState(), composer, Integer.valueOf(i7)), function32.invoke(transition.getTargetState(), composer, Integer.valueOf(i7)), function3.invoke(transition.getSegment(), composer, Integer.valueOf((i6 >> 3) & 112)), (TwoWayConverter) objRememberedValue, str2, composer, (i6 & 14) | ((i6 << 6) & 458752));
    }

    /* renamed from: animateColor-DTcfvLk, reason: not valid java name */
    public static final State<Color> m88animateColorDTcfvLk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec<Color> infiniteRepeatableSpec, String str, Composer composer, int i2, int i3) {
        Composer composer2;
        String str2 = (i3 & 8) != 0 ? "ColorAnimation" : str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1901963533, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:101)");
        }
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = (TwoWayConverter) ColorVectorConverterKt.getVectorConverter(Color.INSTANCE).invoke(Color.m3796getColorSpaceimpl(j3));
            composer2 = composer;
            composer2.updateRememberedValue(objRememberedValue);
        } else {
            composer2 = composer;
        }
        int i4 = i2 << 3;
        State<Color> stateAnimateValue = InfiniteTransitionKt.animateValue(infiniteTransition, Color.m3782boximpl(j2), Color.m3782boximpl(j3), (TwoWayConverter) objRememberedValue, infiniteRepeatableSpec, str2, composer2, InfiniteTransition.$stable | (i2 & 14) | (i2 & 112) | (i2 & 896) | (InfiniteRepeatableSpec.$stable << 12) | (57344 & i4) | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateAnimateValue;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "animateColor APIs now have a new label parameter added.")
    /* renamed from: animateColor-RIQooxk, reason: not valid java name */
    public static final /* synthetic */ State m89animateColorRIQooxk(InfiniteTransition infiniteTransition, long j2, long j3, InfiniteRepeatableSpec infiniteRepeatableSpec, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1400583834, i2, -1, "androidx.compose.animation.animateColor (Transition.kt:117)");
        }
        State<Color> stateM88animateColorDTcfvLk = m88animateColorDTcfvLk(infiniteTransition, j2, j3, infiniteRepeatableSpec, "ColorAnimation", composer, InfiniteTransition.$stable | 24576 | (i2 & 14) | (i2 & 112) | (i2 & 896) | (InfiniteRepeatableSpec.$stable << 9) | (i2 & 7168), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateM88animateColorDTcfvLk;
    }
}
