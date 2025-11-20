package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import j.AbstractC0660m;
import j.AbstractC0662o;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b!\u0010\"J/\u0010#\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0004\b#\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R&\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010&\u001a\u0004\b)\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010*R\u0016\u0010+\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010-\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010,R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020.048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010,R\u0018\u00108\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u0010,¨\u00069"}, d2 = {"Landroidx/compose/animation/core/VectorizedMonoSplineKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "Lj/m;", "timestamps", "Lj/o;", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "", "durationMillis", "delayMillis", "", "periodicBias", "<init>", "(Lj/m;Lj/o;IIF)V", "initialValue", "targetValue", "initialVelocity", "", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "index", "getEasing", "(I)Landroidx/compose/animation/core/Easing;", "timeMillis", "getEasedTimeFromIndex", "(II)F", "findEntryForTimeMillis", "(I)I", "", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "Lj/m;", "Lj/o;", "I", "getDurationMillis", "()I", "getDelayMillis", "F", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "", "times", "[F", "Landroidx/compose/animation/core/MonoSpline;", "monoSpline", "Landroidx/compose/animation/core/MonoSpline;", "", "values", "[[F", "lastInitialValue", "lastTargetValue", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedMonoSplineKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private final int delayMillis;
    private final int durationMillis;
    private final AbstractC0662o keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private MonoSpline monoSpline;
    private final float periodicBias;
    private float[] times;
    private final AbstractC0660m timestamps;
    private V valueVector;
    private float[][] values;
    private V velocityVector;

    public VectorizedMonoSplineKeyframesSpec(AbstractC0660m abstractC0660m, AbstractC0662o abstractC0662o, int i2, int i3, float f2) {
        this.timestamps = abstractC0660m;
        this.keyframes = abstractC0662o;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.periodicBias = f2;
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis) {
        float fTransform;
        AbstractC0660m abstractC0660m = this.timestamps;
        if (index >= abstractC0660m.f849b - 1) {
            fTransform = timeMillis;
        } else {
            int iA = abstractC0660m.a(index);
            int iA2 = this.timestamps.a(index + 1);
            if (timeMillis == iA) {
                fTransform = iA;
            } else {
                float f2 = iA2 - iA;
                fTransform = (getEasing(index).transform((timeMillis - iA) / f2) * f2) + iA;
            }
        }
        return fTransform / 1000;
    }

    private final Easing getEasing(int index) {
        Easing easing;
        Pair pair = (Pair) this.keyframes.c(this.timestamps.a(index));
        return (pair == null || (easing = (Easing) pair.getSecond()) == null) ? EasingKt.getLinearEasing() : easing;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        float[] fArr2;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
            int i2 = this.timestamps.f849b;
            float[] fArr3 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr3[i3] = this.timestamps.a(i3) / 1000;
            }
            this.times = fArr3;
        }
        if (this.monoSpline != null && Intrinsics.areEqual(this.lastInitialValue, initialValue) && Intrinsics.areEqual(this.lastTargetValue, targetValue)) {
            return;
        }
        boolean zAreEqual = Intrinsics.areEqual(this.lastInitialValue, initialValue);
        boolean zAreEqual2 = Intrinsics.areEqual(this.lastTargetValue, targetValue);
        this.lastInitialValue = initialValue;
        this.lastTargetValue = targetValue;
        int size = initialValue.getSize();
        float[][] fArr4 = null;
        if (this.values == null) {
            int i4 = this.timestamps.f849b;
            float[][] fArr5 = new float[i4][];
            for (int i5 = 0; i5 < i4; i5++) {
                int iA = this.timestamps.a(i5);
                if (iA != 0) {
                    if (iA != getDurationMillis()) {
                        fArr = new float[size];
                        Object objC = this.keyframes.c(iA);
                        Intrinsics.checkNotNull(objC);
                        AnimationVector animationVector = (AnimationVector) ((Pair) objC).getFirst();
                        for (int i6 = 0; i6 < size; i6++) {
                            fArr[i6] = animationVector.get$animation_core_release(i6);
                        }
                    } else if (this.keyframes.a(iA)) {
                        fArr = new float[size];
                        Object objC2 = this.keyframes.c(iA);
                        Intrinsics.checkNotNull(objC2);
                        AnimationVector animationVector2 = (AnimationVector) ((Pair) objC2).getFirst();
                        for (int i7 = 0; i7 < size; i7++) {
                            fArr[i7] = animationVector2.get$animation_core_release(i7);
                        }
                    } else {
                        fArr2 = new float[size];
                        for (int i8 = 0; i8 < size; i8++) {
                            fArr2[i8] = targetValue.get$animation_core_release(i8);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.keyframes.a(iA)) {
                    fArr = new float[size];
                    Object objC3 = this.keyframes.c(iA);
                    Intrinsics.checkNotNull(objC3);
                    AnimationVector animationVector3 = (AnimationVector) ((Pair) objC3).getFirst();
                    for (int i9 = 0; i9 < size; i9++) {
                        fArr[i9] = animationVector3.get$animation_core_release(i9);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size];
                    for (int i10 = 0; i10 < size; i10++) {
                        fArr2[i10] = initialValue.get$animation_core_release(i10);
                    }
                }
                fArr5[i5] = fArr2;
            }
            this.values = fArr5;
        } else {
            if (!zAreEqual && !this.keyframes.a(0)) {
                float[][] fArr6 = this.values;
                if (fArr6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                    fArr6 = null;
                }
                int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, 0, 0, 0, 6, null);
                float[] fArr7 = new float[size];
                for (int i11 = 0; i11 < size; i11++) {
                    fArr7[i11] = initialValue.get$animation_core_release(i11);
                }
                fArr6[iBinarySearch$default] = fArr7;
            }
            if (!zAreEqual2 && !this.keyframes.a(getDurationMillis())) {
                float[][] fArr8 = this.values;
                if (fArr8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("values");
                    fArr8 = null;
                }
                int iBinarySearch$default2 = IntListExtensionKt.binarySearch$default(this.timestamps, getDurationMillis(), 0, 0, 6, null);
                float[] fArr9 = new float[size];
                for (int i12 = 0; i12 < size; i12++) {
                    fArr9[i12] = targetValue.get$animation_core_release(i12);
                }
                fArr8[iBinarySearch$default2] = fArr9;
            }
        }
        float[] fArr10 = this.times;
        if (fArr10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("times");
            fArr10 = null;
        }
        float[][] fArr11 = this.values;
        if (fArr11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("values");
        } else {
            fArr4 = fArr11;
        }
        this.monoSpline = new MonoSpline(fArr10, fArr4, this.periodicBias);
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDelayMillis() {
        return this.delayMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedDurationBasedAnimationSpec
    public int getDurationMillis() {
        return this.durationMillis;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getValueFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (this.keyframes.b(iClampPlayTime)) {
            Object objC = this.keyframes.c(iClampPlayTime);
            Intrinsics.checkNotNull(objC);
            return (V) ((Pair) objC).getFirst();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v2 = this.valueVector;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            v2 = null;
        }
        monoSpline.getPos(easedTimeFromIndex, v2, iFindEntryForTimeMillis);
        V v3 = this.valueVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        int iClampPlayTime = (int) VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (iClampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
        MonoSpline monoSpline = this.monoSpline;
        if (monoSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("monoSpline");
            monoSpline = null;
        }
        float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime);
        V v2 = this.velocityVector;
        if (v2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            v2 = null;
        }
        monoSpline.getSlope(easedTimeFromIndex, v2, iFindEntryForTimeMillis);
        V v3 = this.velocityVector;
        if (v3 != null) {
            return v3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
