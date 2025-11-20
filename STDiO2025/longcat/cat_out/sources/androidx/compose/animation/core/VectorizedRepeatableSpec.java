package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B'\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB/\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ%\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J-\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000fH\u0002J-\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/compose/animation/core/VectorizedRepeatableSpec;", "V", "Landroidx/compose/animation/core/AnimationVector;", "Landroidx/compose/animation/core/VectorizedFiniteAnimationSpec;", "iterations", "", "animation", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "repeatMode", "Landroidx/compose/animation/core/RepeatMode;", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;)V", "initialStartOffset", "Landroidx/compose/animation/core/StartOffset;", "(ILandroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;Landroidx/compose/animation/core/RepeatMode;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "durationNanos", "", "getDurationNanos$animation_core_release", "()J", "initialOffsetNanos", "getDurationNanos", "initialValue", "targetValue", "initialVelocity", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)J", "getValueFromNanos", "playTimeNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "repetitionPlayTimeNanos", "repetitionStartVelocity", "start", "startVelocity", "end", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedRepeatableSpec<V extends AnimationVector> implements VectorizedFiniteAnimationSpec<V> {
    public static final int $stable = 8;
    private final VectorizedDurationBasedAnimationSpec<V> animation;
    private final long durationNanos;
    private final long initialOffsetNanos;
    private final int iterations;
    private final RepeatMode repeatMode;

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, j2);
    }

    private final long repetitionPlayTimeNanos(long playTimeNanos) {
        long j2 = this.initialOffsetNanos;
        if (playTimeNanos + j2 <= 0) {
            return 0L;
        }
        long j3 = playTimeNanos + j2;
        long jMin = Math.min(j3 / this.durationNanos, this.iterations - 1);
        return (this.repeatMode == RepeatMode.Restart || jMin % ((long) 2) == 0) ? j3 - (jMin * this.durationNanos) : ((jMin + 1) * this.durationNanos) - j3;
    }

    private final V repetitionStartVelocity(long playTimeNanos, V start, V startVelocity, V end) {
        long j2 = this.initialOffsetNanos;
        long j3 = playTimeNanos + j2;
        long j4 = this.durationNanos;
        return j3 > j4 ? (V) getVelocityFromNanos(j4 - j2, start, startVelocity, end) : startVelocity;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public long getDurationNanos(V initialValue, V targetValue, V initialVelocity) {
        return (this.iterations * this.durationNanos) - this.initialOffsetNanos;
    }

    /* renamed from: getDurationNanos$animation_core_release, reason: from getter */
    public final long getDurationNanos() {
        return this.durationNanos;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.getValueFromNanos(repetitionPlayTimeNanos(playTimeNanos), initialValue, targetValue, repetitionStartVelocity(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        return this.animation.getVelocityFromNanos(repetitionPlayTimeNanos(playTimeNanos), initialValue, targetValue, repetitionStartVelocity(playTimeNanos, initialValue, initialVelocity, targetValue));
    }

    private VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec<V> vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2) {
        this.iterations = i2;
        this.animation = vectorizedDurationBasedAnimationSpec;
        this.repeatMode = repeatMode;
        if (i2 < 1) {
            throw new IllegalArgumentException("Iterations count can't be less than 1");
        }
        this.durationNanos = (vectorizedDurationBasedAnimationSpec.getDurationMillis() + vectorizedDurationBasedAnimationSpec.getDelayMillis()) * AnimationKt.MillisToNanos;
        this.initialOffsetNanos = j2 * AnimationKt.MillisToNanos;
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, (i3 & 4) != 0 ? RepeatMode.Restart : repeatMode, (i3 & 8) != 0 ? StartOffset.m135constructorimpl$default(0, 0, 2, null) : j2, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, vectorizedDurationBasedAnimationSpec, (i3 & 4) != 0 ? RepeatMode.Restart : repeatMode);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This method has been deprecated in favor of the constructor that accepts start offset.")
    public /* synthetic */ VectorizedRepeatableSpec(int i2, VectorizedDurationBasedAnimationSpec vectorizedDurationBasedAnimationSpec, RepeatMode repeatMode) {
        this(i2, vectorizedDurationBasedAnimationSpec, repeatMode, StartOffset.m135constructorimpl$default(0, 0, 2, null), (DefaultConstructorMarker) null);
    }
}
