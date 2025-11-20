package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001aH\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00142\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\nH\u0002\u001aR\u0010\u0015\u001a\u00020\u0016*\u00020\u00162\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"MarqueeSpacing", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "createMarqueeAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "iterations", "", "targetValue", "initialDelayMillis", "delayMillis", "velocity", "density", "Landroidx/compose/ui/unit/Density;", "createMarqueeAnimationSpec-Z4HSEVQ", "(IFIIFLandroidx/compose/ui/unit/Density;)Landroidx/compose/animation/core/AnimationSpec;", "velocityBasedTween", "Landroidx/compose/animation/core/TweenSpec;", "basicMarquee", "Landroidx/compose/ui/Modifier;", "animationMode", "Landroidx/compose/foundation/MarqueeAnimationMode;", "repeatDelayMillis", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicMarqueeKt {
    /* renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m200MarqueeSpacing0680j_4(float f2) {
        return new a(f2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int MarqueeSpacing_0680j_4$lambda$1(float f2, Density density, int i2, int i3) {
        return density.mo328roundToPx0680j_4(f2);
    }

    /* renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m202basicMarquee1Mj1MLw(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2) {
        return modifier.then(new MarqueeModifierElement(i2, i3, i4, i5, marqueeSpacing, f2, null));
    }

    /* renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m203basicMarquee1Mj1MLw$default(Modifier modifier, int i2, int i3, int i4, int i5, MarqueeSpacing marqueeSpacing, float f2, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = MarqueeDefaults.INSTANCE.getIterations();
        }
        if ((i6 & 2) != 0) {
            i3 = MarqueeAnimationMode.INSTANCE.m275getImmediatelyZbEOnfQ();
        }
        if ((i6 & 4) != 0) {
            i4 = MarqueeDefaults.INSTANCE.getRepeatDelayMillis();
        }
        if ((i6 & 8) != 0) {
            i5 = MarqueeAnimationMode.m271equalsimpl0(i3, MarqueeAnimationMode.INSTANCE.m275getImmediatelyZbEOnfQ()) ? i4 : 0;
        }
        if ((i6 & 16) != 0) {
            marqueeSpacing = MarqueeDefaults.INSTANCE.getSpacing();
        }
        if ((i6 & 32) != 0) {
            f2 = MarqueeDefaults.INSTANCE.m277getVelocityD9Ej5fM();
        }
        return m202basicMarquee1Mj1MLw(modifier, i2, i3, i4, i5, marqueeSpacing, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec<Float> m204createMarqueeAnimationSpecZ4HSEVQ(int i2, float f2, int i3, int i4, float f3, Density density) {
        TweenSpec<Float> tweenSpecVelocityBasedTween = velocityBasedTween(Math.abs(density.mo334toPx0680j_4(f3)), f2, i4);
        long jM135constructorimpl$default = StartOffset.m135constructorimpl$default((-i4) + i3, 0, 2, null);
        return i2 == Integer.MAX_VALUE ? AnimationSpecKt.m101infiniteRepeatable9IiC70o$default(tweenSpecVelocityBasedTween, null, jM135constructorimpl$default, 2, null) : AnimationSpecKt.m103repeatable91I0pcU$default(i2, tweenSpecVelocityBasedTween, null, jM135constructorimpl$default, 4, null);
    }

    private static final TweenSpec<Float> velocityBasedTween(float f2, float f3, int i2) {
        return AnimationSpecKt.tween((int) Math.ceil(f3 / (f2 / 1000.0f)), i2, EasingKt.getLinearEasing());
    }
}
