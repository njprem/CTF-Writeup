package androidx.compose.animation.core;

import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.animation.core.KeyframesWithSplineSpec;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u008c\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a*\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0001\u001a,\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001a@\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\"\u0004\b\u0000\u0010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0011\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007\u001a3\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u00022\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007\u001a=\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0018\"\u0004\b\u0000\u0010\u00022\b\b\u0001\u0010\u001a\u001a\u00020\u001b2\u001d\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0019\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0007\u001a4\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001d\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007\u001aH\u0010\u001c\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001d\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u001e\u001a\u00020\u001f2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a\u001e\u0010\"\u001a\b\u0012\u0004\u0012\u0002H\u00020#\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010$\u001a\u00020\u001fH\u0007\u001a9\u0010%\u001a\b\u0012\u0004\u0012\u0002H\u00020&\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010'\u001a\u00020\u001b2\b\b\u0002\u0010(\u001a\u00020\u001b2\n\b\u0002\u0010)\u001a\u0004\u0018\u0001H\u0002H\u0007¢\u0006\u0002\u0010*\u001a2\u0010+\u001a\b\u0012\u0004\u0012\u0002H\u00020,\"\u0004\b\u0000\u0010\u00022\b\b\u0002\u0010-\u001a\u00020\u001f2\b\b\u0002\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010.\u001a\u00020/H\u0007\u001a9\u00100\u001a\u0004\u0018\u0001H1\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u00101*\u000202*\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H1032\b\u00104\u001a\u0004\u0018\u0001H\u0002H\u0002¢\u0006\u0002\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"delayed", "Landroidx/compose/animation/core/AnimationSpec;", "T", "animationSpec", "startDelayNanos", "", "infiniteRepeatable", "Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "animation", "Landroidx/compose/animation/core/DurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "infiniteRepeatable-9IiC70o", "(Landroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/InfiniteRepeatableSpec;", "keyframes", "Landroidx/compose/animation/core/KeyframesSpec;", "init", "Lkotlin/Function1;", "Landroidx/compose/animation/core/KeyframesSpec$KeyframesSpecConfig;", "", "Lkotlin/ExtensionFunctionType;", "keyframesWithSpline", "Landroidx/compose/animation/core/KeyframesWithSplineSpec;", "Landroidx/compose/animation/core/KeyframesWithSplineSpec$KeyframesWithSplineSpecConfig;", "periodicBias", "", "repeatable", "Landroidx/compose/animation/core/RepeatableSpec;", "iterations", "", "repeatable-91I0pcU", "(ILandroidx/compose/animation/core/DurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;J)Landroidx/compose/animation/core/RepeatableSpec;", "snap", "Landroidx/compose/animation/core/SnapSpec;", "delayMillis", "spring", "Landroidx/compose/animation/core/SpringSpec;", "dampingRatio", "stiffness", "visibilityThreshold", "(FFLjava/lang/Object;)Landroidx/compose/animation/core/SpringSpec;", "tween", "Landroidx/compose/animation/core/TweenSpec;", "durationMillis", "easing", "Landroidx/compose/animation/core/Easing;", "convert", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/TwoWayConverter;", "data", "(Landroidx/compose/animation/core/TwoWayConverter;Ljava/lang/Object;)Landroidx/compose/animation/core/AnimationVector;", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimationSpecKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T, V extends AnimationVector> V convert(TwoWayConverter<T, V> twoWayConverter, T t) {
        if (t == null) {
            return null;
        }
        return twoWayConverter.getConvertToVector().invoke(t);
    }

    public static final <T> AnimationSpec<T> delayed(AnimationSpec<T> animationSpec, long j2) {
        return new StartDelayAnimationSpec(animationSpec, j2);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the infinite repeatable function that accepts start offset.")
    public static final /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new InfiniteRepeatableSpec(durationBasedAnimationSpec, repeatMode, StartOffset.m135constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ InfiniteRepeatableSpec infiniteRepeatable$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return infiniteRepeatable(durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: infiniteRepeatable-9IiC70o, reason: not valid java name */
    public static final <T> InfiniteRepeatableSpec<T> m100infiniteRepeatable9IiC70o(DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new InfiniteRepeatableSpec<>(durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    /* renamed from: infiniteRepeatable-9IiC70o$default, reason: not valid java name */
    public static /* synthetic */ InfiniteRepeatableSpec m101infiniteRepeatable9IiC70o$default(DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i2 & 4) != 0) {
            j2 = StartOffset.m135constructorimpl$default(0, 0, 2, null);
        }
        return m100infiniteRepeatable9IiC70o(durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final <T> KeyframesSpec<T> keyframes(Function1<? super KeyframesSpec.KeyframesSpecConfig<T>, Unit> function1) {
        KeyframesSpec.KeyframesSpecConfig keyframesSpecConfig = new KeyframesSpec.KeyframesSpecConfig();
        function1.invoke(keyframesSpecConfig);
        return new KeyframesSpec<>(keyframesSpecConfig);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> function1) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the repeatable function that accepts start offset.")
    public static final /* synthetic */ RepeatableSpec repeatable(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode) {
        return new RepeatableSpec(i2, durationBasedAnimationSpec, repeatMode, StartOffset.m135constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ RepeatableSpec repeatable$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        return repeatable(i2, durationBasedAnimationSpec, repeatMode);
    }

    /* renamed from: repeatable-91I0pcU, reason: not valid java name */
    public static final <T> RepeatableSpec<T> m102repeatable91I0pcU(int i2, DurationBasedAnimationSpec<T> durationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        return new RepeatableSpec<>(i2, durationBasedAnimationSpec, repeatMode, j2, (DefaultConstructorMarker) null);
    }

    /* renamed from: repeatable-91I0pcU$default, reason: not valid java name */
    public static /* synthetic */ RepeatableSpec m103repeatable91I0pcU$default(int i2, DurationBasedAnimationSpec durationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            repeatMode = RepeatMode.Restart;
        }
        if ((i3 & 8) != 0) {
            j2 = StartOffset.m135constructorimpl$default(0, 0, 2, null);
        }
        return m102repeatable91I0pcU(i2, durationBasedAnimationSpec, repeatMode, j2);
    }

    public static final <T> SnapSpec<T> snap(int i2) {
        return new SnapSpec<>(i2);
    }

    public static /* synthetic */ SnapSpec snap$default(int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return snap(i2);
    }

    public static final <T> SpringSpec<T> spring(float f2, float f3, T t) {
        return new SpringSpec<>(f2, f3, t);
    }

    public static /* synthetic */ SpringSpec spring$default(float f2, float f3, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 1500.0f;
        }
        if ((i2 & 4) != 0) {
            obj = null;
        }
        return spring(f2, f3, obj);
    }

    public static final <T> TweenSpec<T> tween(int i2, int i3, Easing easing) {
        return new TweenSpec<>(i2, i3, easing);
    }

    public static /* synthetic */ TweenSpec tween$default(int i2, int i3, Easing easing, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = AnimationConstants.DefaultDurationMillis;
        }
        if ((i4 & 2) != 0) {
            i3 = 0;
        }
        if ((i4 & 4) != 0) {
            easing = EasingKt.getFastOutSlowInEasing();
        }
        return tween(i2, i3, easing);
    }

    public static final <T> KeyframesWithSplineSpec<T> keyframesWithSpline(float f2, Function1<? super KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig<T>, Unit> function1) {
        KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig keyframesWithSplineSpecConfig = new KeyframesWithSplineSpec.KeyframesWithSplineSpecConfig();
        function1.invoke(keyframesWithSplineSpecConfig);
        return new KeyframesWithSplineSpec<>(keyframesWithSplineSpecConfig, f2);
    }
}
