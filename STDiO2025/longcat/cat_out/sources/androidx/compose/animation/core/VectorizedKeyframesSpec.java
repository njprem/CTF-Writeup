package androidx.compose.animation.core;

import androidx.compose.animation.core.AnimationVector;
import j.AbstractC0660m;
import j.AbstractC0662o;
import j.C0638D;
import j.C0639E;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B;\b\u0016\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBE\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u000b\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J/\u0010(\u001a\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00028\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010+R \u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010,R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010/R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b0\u0010/R\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00101R\u001a\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00108\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010:\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00109R\u0016\u0010;\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010<\u001a\u00028\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00109R\u0016\u0010=\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u00107R\u0016\u0010>\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u00107R\u0016\u0010@\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006B"}, d2 = {"Landroidx/compose/animation/core/VectorizedKeyframesSpec;", "Landroidx/compose/animation/core/AnimationVector;", "V", "Landroidx/compose/animation/core/VectorizedDurationBasedAnimationSpec;", "", "", "Lkotlin/Pair;", "Landroidx/compose/animation/core/Easing;", "keyframes", "durationMillis", "delayMillis", "<init>", "(Ljava/util/Map;II)V", "Lj/m;", "timestamps", "Lj/o;", "Landroidx/compose/animation/core/VectorizedKeyframeSpecElementInfo;", "defaultEasing", "Landroidx/compose/animation/core/ArcMode;", "initialArcMode", "(Lj/m;Lj/o;IILandroidx/compose/animation/core/Easing;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "initialValue", "targetValue", "initialVelocity", "", "init", "(Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)V", "timeMillis", "", "getEasedTime", "(I)F", "index", "", "asFraction", "getEasedTimeFromIndex", "(IIZ)F", "findEntryForTimeMillis", "(I)I", "", "playTimeNanos", "getValueFromNanos", "(JLandroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;Landroidx/compose/animation/core/AnimationVector;)Landroidx/compose/animation/core/AnimationVector;", "getVelocityFromNanos", "Lj/m;", "Lj/o;", "I", "getDurationMillis", "()I", "getDelayMillis", "Landroidx/compose/animation/core/Easing;", "", "modes", "[I", "", "times", "[F", "valueVector", "Landroidx/compose/animation/core/AnimationVector;", "velocityVector", "lastInitialValue", "lastTargetValue", "posArray", "slopeArray", "Landroidx/compose/animation/core/ArcSpline;", "arcSpline", "Landroidx/compose/animation/core/ArcSpline;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VectorizedKeyframesSpec<V extends AnimationVector> implements VectorizedDurationBasedAnimationSpec<V> {
    public static final int $stable = 8;
    private ArcSpline arcSpline;
    private final Easing defaultEasing;
    private final int delayMillis;
    private final int durationMillis;
    private final int initialArcMode;
    private final AbstractC0662o keyframes;
    private V lastInitialValue;
    private V lastTargetValue;
    private int[] modes;
    private float[] posArray;
    private float[] slopeArray;
    private float[] times;
    private final AbstractC0660m timestamps;
    private V valueVector;
    private V velocityVector;

    public /* synthetic */ VectorizedKeyframesSpec(AbstractC0660m abstractC0660m, AbstractC0662o abstractC0662o, int i2, int i3, Easing easing, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC0660m, abstractC0662o, i2, i3, easing, i4);
    }

    private final int findEntryForTimeMillis(int timeMillis) {
        int iBinarySearch$default = IntListExtensionKt.binarySearch$default(this.timestamps, timeMillis, 0, 0, 6, null);
        return iBinarySearch$default < -1 ? -(iBinarySearch$default + 2) : iBinarySearch$default;
    }

    private final float getEasedTime(int timeMillis) {
        return getEasedTimeFromIndex(findEntryForTimeMillis(timeMillis), timeMillis, false);
    }

    private final float getEasedTimeFromIndex(int index, int timeMillis, boolean asFraction) {
        Easing easing;
        float f2;
        AbstractC0660m abstractC0660m = this.timestamps;
        if (index >= abstractC0660m.f849b - 1) {
            f2 = timeMillis;
        } else {
            int iA = abstractC0660m.a(index);
            int iA2 = this.timestamps.a(index + 1);
            if (timeMillis == iA) {
                f2 = iA;
            } else {
                int i2 = iA2 - iA;
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.c(iA);
                if (vectorizedKeyframeSpecElementInfo == null || (easing = vectorizedKeyframeSpecElementInfo.getEasing()) == null) {
                    easing = this.defaultEasing;
                }
                float f3 = i2;
                float fTransform = easing.transform((timeMillis - iA) / f3);
                if (asFraction) {
                    return fTransform;
                }
                f2 = (f3 * fTransform) + iA;
            }
        }
        return f2 / 1000;
    }

    private final void init(V initialValue, V targetValue, V initialVelocity) {
        float[] fArr;
        float[] fArr2;
        boolean z = this.arcSpline != null;
        if (this.valueVector == null) {
            this.valueVector = (V) AnimationVectorsKt.newInstance(initialValue);
            this.velocityVector = (V) AnimationVectorsKt.newInstance(initialVelocity);
            int i2 = this.timestamps.f849b;
            float[] fArr3 = new float[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr3[i3] = this.timestamps.a(i3) / 1000;
            }
            this.times = fArr3;
            int i4 = this.timestamps.f849b;
            int[] iArr = new int[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) this.keyframes.c(this.timestamps.a(i5));
                int iM167getArcMode9TMq4 = vectorizedKeyframeSpecElementInfo != null ? vectorizedKeyframeSpecElementInfo.m167getArcMode9TMq4() : this.initialArcMode;
                if (!ArcMode.m108equalsimpl0(iM167getArcMode9TMq4, ArcMode.INSTANCE.m114getArcLinear9TMq4())) {
                    z = true;
                }
                iArr[i5] = iM167getArcMode9TMq4;
            }
            this.modes = iArr;
        }
        if (z) {
            float[] fArr4 = null;
            if (this.arcSpline != null) {
                V v2 = this.lastInitialValue;
                if (v2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("lastInitialValue");
                    v2 = null;
                }
                if (Intrinsics.areEqual(v2, initialValue)) {
                    V v3 = this.lastTargetValue;
                    if (v3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("lastTargetValue");
                        v3 = null;
                    }
                    if (Intrinsics.areEqual(v3, targetValue)) {
                        return;
                    }
                }
            }
            this.lastInitialValue = initialValue;
            this.lastTargetValue = targetValue;
            int size = initialValue.getSize() + (initialValue.getSize() % 2);
            this.posArray = new float[size];
            this.slopeArray = new float[size];
            int i6 = this.timestamps.f849b;
            float[][] fArr5 = new float[i6][];
            for (int i7 = 0; i7 < i6; i7++) {
                int iA = this.timestamps.a(i7);
                if (iA != 0) {
                    if (iA != getDurationMillis()) {
                        fArr = new float[size];
                        Object objC = this.keyframes.c(iA);
                        Intrinsics.checkNotNull(objC);
                        AnimationVector vectorValue = ((VectorizedKeyframeSpecElementInfo) objC).getVectorValue();
                        for (int i8 = 0; i8 < size; i8++) {
                            fArr[i8] = vectorValue.get$animation_core_release(i8);
                        }
                    } else if (this.keyframes.a(iA)) {
                        fArr = new float[size];
                        Object objC2 = this.keyframes.c(iA);
                        Intrinsics.checkNotNull(objC2);
                        AnimationVector vectorValue2 = ((VectorizedKeyframeSpecElementInfo) objC2).getVectorValue();
                        for (int i9 = 0; i9 < size; i9++) {
                            fArr[i9] = vectorValue2.get$animation_core_release(i9);
                        }
                    } else {
                        fArr2 = new float[size];
                        for (int i10 = 0; i10 < size; i10++) {
                            fArr2[i10] = targetValue.get$animation_core_release(i10);
                        }
                    }
                    fArr2 = fArr;
                } else if (this.keyframes.a(iA)) {
                    fArr = new float[size];
                    Object objC3 = this.keyframes.c(iA);
                    Intrinsics.checkNotNull(objC3);
                    AnimationVector vectorValue3 = ((VectorizedKeyframeSpecElementInfo) objC3).getVectorValue();
                    for (int i11 = 0; i11 < size; i11++) {
                        fArr[i11] = vectorValue3.get$animation_core_release(i11);
                    }
                    fArr2 = fArr;
                } else {
                    fArr2 = new float[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        fArr2[i12] = initialValue.get$animation_core_release(i12);
                    }
                }
                fArr5[i7] = fArr2;
            }
            int[] iArr2 = this.modes;
            if (iArr2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("modes");
                iArr2 = null;
            }
            float[] fArr6 = this.times;
            if (fArr6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("times");
            } else {
                fArr4 = fArr6;
            }
            this.arcSpline = new ArcSpline(iArr2, fArr4, fArr5);
        }
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
        if (this.keyframes.a(iClampPlayTime)) {
            Object objC = this.keyframes.c(iClampPlayTime);
            Intrinsics.checkNotNull(objC);
            return (V) ((VectorizedKeyframeSpecElementInfo) objC).getVectorValue();
        }
        if (iClampPlayTime >= getDurationMillis()) {
            return targetValue;
        }
        if (iClampPlayTime <= 0) {
            return initialValue;
        }
        init(initialValue, targetValue, initialVelocity);
        int i2 = 0;
        if (this.arcSpline == null) {
            int iFindEntryForTimeMillis = findEntryForTimeMillis(iClampPlayTime);
            float easedTimeFromIndex = getEasedTimeFromIndex(iFindEntryForTimeMillis, iClampPlayTime, true);
            int iA = this.timestamps.a(iFindEntryForTimeMillis);
            if (this.keyframes.a(iA)) {
                Object objC2 = this.keyframes.c(iA);
                Intrinsics.checkNotNull(objC2);
                initialValue = (V) ((VectorizedKeyframeSpecElementInfo) objC2).getVectorValue();
            }
            int iA2 = this.timestamps.a(iFindEntryForTimeMillis + 1);
            if (this.keyframes.a(iA2)) {
                Object objC3 = this.keyframes.c(iA2);
                Intrinsics.checkNotNull(objC3);
                targetValue = (V) ((VectorizedKeyframeSpecElementInfo) objC3).getVectorValue();
            }
            V v2 = this.valueVector;
            if (v2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v2 = null;
            }
            int size = v2.getSize();
            while (i2 < size) {
                V v3 = this.valueVector;
                if (v3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                    v3 = null;
                }
                v3.set$animation_core_release(i2, VectorConvertersKt.lerp(initialValue.get$animation_core_release(i2), targetValue.get$animation_core_release(i2), easedTimeFromIndex));
                i2++;
            }
            V v4 = this.valueVector;
            if (v4 != null) {
                return v4;
            }
            Intrinsics.throwUninitializedPropertyAccessException("valueVector");
            return null;
        }
        float easedTime = getEasedTime(iClampPlayTime);
        ArcSpline arcSpline = this.arcSpline;
        if (arcSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
            arcSpline = null;
        }
        float[] fArr = this.posArray;
        if (fArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("posArray");
            fArr = null;
        }
        arcSpline.getPos(easedTime, fArr);
        float[] fArr2 = this.posArray;
        if (fArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("posArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i2 < length) {
            V v5 = this.valueVector;
            if (v5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("valueVector");
                v5 = null;
            }
            float[] fArr3 = this.posArray;
            if (fArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("posArray");
                fArr3 = null;
            }
            v5.set$animation_core_release(i2, fArr3[i2]);
            i2++;
        }
        V v6 = this.valueVector;
        if (v6 != null) {
            return v6;
        }
        Intrinsics.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // androidx.compose.animation.core.VectorizedAnimationSpec
    public V getVelocityFromNanos(long playTimeNanos, V initialValue, V targetValue, V initialVelocity) {
        long jClampPlayTime = VectorizedAnimationSpecKt.clampPlayTime(this, playTimeNanos / AnimationKt.MillisToNanos);
        if (jClampPlayTime < 0) {
            return initialVelocity;
        }
        init(initialValue, targetValue, initialVelocity);
        int i2 = 0;
        if (this.arcSpline == null) {
            AnimationVector valueFromMillis = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime - 1, initialValue, targetValue, initialVelocity);
            AnimationVector valueFromMillis2 = VectorizedAnimationSpecKt.getValueFromMillis(this, jClampPlayTime, initialValue, targetValue, initialVelocity);
            int size = valueFromMillis.getSize();
            while (i2 < size) {
                V v2 = this.velocityVector;
                if (v2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                    v2 = null;
                }
                v2.set$animation_core_release(i2, (valueFromMillis.get$animation_core_release(i2) - valueFromMillis2.get$animation_core_release(i2)) * 1000.0f);
                i2++;
            }
            V v3 = this.velocityVector;
            if (v3 != null) {
                return v3;
            }
            Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
            return null;
        }
        float easedTime = getEasedTime((int) jClampPlayTime);
        ArcSpline arcSpline = this.arcSpline;
        if (arcSpline == null) {
            Intrinsics.throwUninitializedPropertyAccessException("arcSpline");
            arcSpline = null;
        }
        float[] fArr = this.slopeArray;
        if (fArr == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
            fArr = null;
        }
        arcSpline.getSlope(easedTime, fArr);
        float[] fArr2 = this.slopeArray;
        if (fArr2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
            fArr2 = null;
        }
        int length = fArr2.length;
        while (i2 < length) {
            V v4 = this.velocityVector;
            if (v4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
                v4 = null;
            }
            float[] fArr3 = this.slopeArray;
            if (fArr3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("slopeArray");
                fArr3 = null;
            }
            v4.set$animation_core_release(i2, fArr3[i2]);
            i2++;
        }
        V v5 = this.velocityVector;
        if (v5 != null) {
            return v5;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }

    private VectorizedKeyframesSpec(AbstractC0660m abstractC0660m, AbstractC0662o abstractC0662o, int i2, int i3, Easing easing, int i4) {
        this.timestamps = abstractC0660m;
        this.keyframes = abstractC0662o;
        this.durationMillis = i2;
        this.delayMillis = i3;
        this.defaultEasing = easing;
        this.initialArcMode = i4;
    }

    public /* synthetic */ VectorizedKeyframesSpec(Map map, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public VectorizedKeyframesSpec(Map<Integer, ? extends Pair<? extends V, ? extends Easing>> map, int i2, int i3) {
        C0638D c0638d = new C0638D(map.size() + 2);
        Iterator<Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            c0638d.c(it.next().getKey().intValue());
        }
        if (!map.containsKey(0)) {
            c0638d.b();
        }
        if (!map.containsKey(Integer.valueOf(i2))) {
            c0638d.c(i2);
        }
        ArraysKt___ArraysJvmKt.sort(c0638d.f848a, 0, c0638d.f849b);
        C0639E c0639e = new C0639E();
        for (Map.Entry<Integer, ? extends Pair<? extends V, ? extends Easing>> entry : map.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            Pair<? extends V, ? extends Easing> value = entry.getValue();
            c0639e.h(iIntValue, new VectorizedKeyframeSpecElementInfo(value.getFirst(), value.getSecond(), ArcMode.INSTANCE.m114getArcLinear9TMq4(), null));
        }
        this(c0638d, c0639e, i2, i3, EasingKt.getLinearEasing(), ArcMode.INSTANCE.m114getArcLinear9TMq4(), null);
    }
}
