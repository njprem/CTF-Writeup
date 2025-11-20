package androidx.compose.animation.core;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001cJ \u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0003J\u0018\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001cH\u0002J8\u0010 \u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u001cH\u0002¢\u0006\u0002\u0010$R\u000e\u0010\t\u001a\u00020\nX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\r¨\u0006%"}, d2 = {"Landroidx/compose/animation/core/MonoSpline;", "", "time", "", "y", "", "periodicBias", "", "([F[[FF)V", "isExtrapolate", "", "slopeTemp", "tangents", "[[F", "timePoints", "values", "diff", "h", "x", "y1", "y2", "t1", "t2", "getPos", "", "v", "Landroidx/compose/animation/core/AnimationVector;", "index", "", "t", "j", "getSlope", "interpolate", "makeFloatArray", "a", "b", "(II)[[F", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MonoSpline {
    public static final int $stable = 8;
    private final boolean isExtrapolate = true;
    private final float[] slopeTemp;
    private final float[][] tangents;
    private final float[] timePoints;
    private final float[][] values;

    public MonoSpline(float[] fArr, float[][] fArr2, float f2) {
        int i2;
        int length = fArr.length;
        int i3 = 0;
        int length2 = fArr2[0].length;
        this.slopeTemp = new float[length2];
        int i4 = length - 1;
        float[][] fArrMakeFloatArray = makeFloatArray(i4, length2);
        float[][] fArrMakeFloatArray2 = makeFloatArray(length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                float f3 = fArr[i7] - fArr[i6];
                float[] fArr3 = fArrMakeFloatArray[i6];
                float f4 = (fArr2[i7][i5] - fArr2[i6][i5]) / f3;
                fArr3[i5] = f4;
                if (i6 == 0) {
                    fArrMakeFloatArray2[i6][i5] = f4;
                } else {
                    fArrMakeFloatArray2[i6][i5] = (fArrMakeFloatArray[i6 - 1][i5] + f4) * 0.5f;
                }
                i6 = i7;
            }
            fArrMakeFloatArray2[i4][i5] = fArrMakeFloatArray[length - 2][i5];
        }
        if (!Float.isNaN(f2)) {
            for (int i8 = 0; i8 < length2; i8++) {
                float[] fArr4 = fArrMakeFloatArray[length - 2];
                float f5 = (1 - f2) * fArr4[i8];
                float[] fArr5 = fArrMakeFloatArray[0];
                float f6 = (fArr5[i8] * f2) + f5;
                fArr5[i8] = f6;
                fArr4[i8] = f6;
                fArrMakeFloatArray2[i4][i8] = f6;
                fArrMakeFloatArray2[0][i8] = f6;
            }
        }
        int i9 = 0;
        while (i9 < i4) {
            int i10 = i3;
            while (i10 < length2) {
                float f7 = fArrMakeFloatArray[i9][i10];
                if (f7 == 0.0f) {
                    fArrMakeFloatArray2[i9][i10] = 0.0f;
                    fArrMakeFloatArray2[i9 + 1][i10] = 0.0f;
                    i2 = length2;
                } else {
                    float f8 = fArrMakeFloatArray2[i9][i10] / f7;
                    int i11 = i9 + 1;
                    float f9 = fArrMakeFloatArray2[i11][i10] / f7;
                    i2 = length2;
                    float fHypot = (float) Math.hypot(f8, f9);
                    if (fHypot > 9.0d) {
                        float f10 = 3.0f / fHypot;
                        float[] fArr6 = fArrMakeFloatArray2[i9];
                        float[] fArr7 = fArrMakeFloatArray[i9];
                        fArr6[i10] = f8 * f10 * fArr7[i10];
                        fArrMakeFloatArray2[i11][i10] = f10 * f9 * fArr7[i10];
                    }
                }
                i10++;
                length2 = i2;
            }
            i9++;
            i3 = 0;
        }
        this.timePoints = fArr;
        this.values = fArr2;
        this.tangents = fArrMakeFloatArray2;
    }

    private final float diff(float h2, float x2, float y1, float y2, float t1, float t2) {
        float f2 = x2 * x2;
        float f3 = 6;
        float f4 = f3 * x2;
        float f5 = (((f3 * f2) * y1) + ((y2 * f4) + (((-6) * f2) * y2))) - (f4 * y1);
        float f6 = 3 * h2;
        return (h2 * t1) + (((((f6 * t1) * f2) + (((f6 * t2) * f2) + f5)) - (((2 * h2) * t2) * x2)) - (((4 * h2) * t1) * x2));
    }

    public static /* synthetic */ void getPos$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        monoSpline.getPos(f2, animationVector, i2);
    }

    public static /* synthetic */ void getSlope$default(MonoSpline monoSpline, float f2, AnimationVector animationVector, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        monoSpline.getSlope(f2, animationVector, i2);
    }

    private final float interpolate(float h2, float x2, float y1, float y2, float t1, float t2) {
        float f2 = x2 * x2;
        float f3 = f2 * x2;
        float f4 = 3 * f2;
        float f5 = 2;
        float f6 = t2 * h2;
        float f7 = (f6 * f3) + ((((f5 * f3) * y1) + ((y2 * f4) + (((-2) * f3) * y2))) - (f4 * y1)) + y1;
        float f8 = h2 * t1;
        return (f8 * x2) + ((((f3 * f8) + f7) - (f6 * f2)) - (((f5 * h2) * t1) * f2));
    }

    private final float[][] makeFloatArray(int a2, int b2) {
        float[][] fArr = new float[a2][];
        for (int i2 = 0; i2 < a2; i2++) {
            fArr[i2] = new float[b2];
        }
        return fArr;
    }

    public final float getPos(float t, int j2) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i2 = 0;
        if (this.isExtrapolate) {
            float f2 = fArr[0];
            if (t <= f2) {
                return ((t - f2) * getSlope(f2, j2)) + this.values[0][j2];
            }
            int i3 = length - 1;
            float f3 = fArr[i3];
            if (t >= f3) {
                return ((t - f3) * getSlope(f3, j2)) + this.values[i3][j2];
            }
        } else {
            if (t <= fArr[0]) {
                return this.values[0][j2];
            }
            int i4 = length - 1;
            if (t >= fArr[i4]) {
                return this.values[i4][j2];
            }
        }
        int i5 = length - 1;
        while (i2 < i5) {
            float[] fArr2 = this.timePoints;
            float f4 = fArr2[i2];
            if (t == f4) {
                return this.values[i2][j2];
            }
            int i6 = i2 + 1;
            float f5 = fArr2[i6];
            if (t < f5) {
                float f6 = f5 - f4;
                float f7 = (t - f4) / f6;
                float[][] fArr3 = this.values;
                float f8 = fArr3[i2][j2];
                float f9 = fArr3[i6][j2];
                float[][] fArr4 = this.tangents;
                return interpolate(f6, f7, f8, f9, fArr4[i2][j2], fArr4[i6][j2]);
            }
            i2 = i6;
        }
        return 0.0f;
    }

    public final void getSlope(float time, float[] v2) {
        float f2;
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int length2 = this.values[0].length;
        float f3 = fArr[0];
        if (time <= f3) {
            f2 = f3;
        } else {
            f2 = fArr[length - 1];
            if (time < f2) {
                f2 = time;
            }
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2) {
            float[] fArr2 = this.timePoints;
            int i4 = i3 + 1;
            float f4 = fArr2[i4];
            if (f2 <= f4) {
                float f5 = fArr2[i3];
                float f6 = f4 - f5;
                float f7 = (f2 - f5) / f6;
                int i5 = 0;
                while (i5 < length2) {
                    float[][] fArr3 = this.values;
                    float f8 = fArr3[i3][i5];
                    float f9 = fArr3[i4][i5];
                    float[][] fArr4 = this.tangents;
                    float f10 = fArr4[i3][i5];
                    float f11 = fArr4[i4][i5];
                    float f12 = f6;
                    v2[i5] = diff(f12, f7, f8, f9, f10, f11) / f12;
                    i5++;
                    f6 = f12;
                }
                return;
            }
            i3 = i4;
        }
    }

    public final void getSlope(float time, AnimationVector v2, int index) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int length2 = this.values[0].length;
        if (time <= fArr[0]) {
            for (int i2 = 0; i2 < length2; i2++) {
                v2.set$animation_core_release(i2, this.tangents[0][i2]);
            }
            return;
        }
        int i3 = length - 1;
        if (time >= fArr[i3]) {
            for (int i4 = 0; i4 < length2; i4++) {
                v2.set$animation_core_release(i4, this.tangents[i3][i4]);
            }
            return;
        }
        int i5 = index;
        while (i5 < i3) {
            float[] fArr2 = this.timePoints;
            int i6 = i5 + 1;
            float f2 = fArr2[i6];
            if (time <= f2) {
                float f3 = fArr2[i5];
                float f4 = f2 - f3;
                float f5 = (time - f3) / f4;
                int i7 = 0;
                while (i7 < length2) {
                    float[][] fArr3 = this.values;
                    float f6 = fArr3[i5][i7];
                    float f7 = fArr3[i6][i7];
                    float[][] fArr4 = this.tangents;
                    float f8 = f4;
                    v2.set$animation_core_release(i7, diff(f8, f5, f6, f7, fArr4[i5][i7], fArr4[i6][i7]) / f8);
                    i7++;
                    f4 = f8;
                }
                return;
            }
            i5 = i6;
        }
    }

    public final void getPos(float time, AnimationVector v2, int index) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i2 = 0;
        int length2 = this.values[0].length;
        if (this.isExtrapolate) {
            float f2 = fArr[0];
            if (time <= f2) {
                getSlope(f2, this.slopeTemp);
                for (int i3 = 0; i3 < length2; i3++) {
                    v2.set$animation_core_release(i3, ((time - this.timePoints[0]) * this.slopeTemp[i3]) + this.values[0][i3]);
                }
                return;
            }
            int i4 = length - 1;
            float f3 = fArr[i4];
            if (time >= f3) {
                getSlope(f3, this.slopeTemp);
                while (i2 < length2) {
                    v2.set$animation_core_release(i2, ((time - this.timePoints[i4]) * this.slopeTemp[i2]) + this.values[i4][i2]);
                    i2++;
                }
                return;
            }
        } else {
            if (time <= fArr[0]) {
                for (int i5 = 0; i5 < length2; i5++) {
                    v2.set$animation_core_release(i5, this.values[0][i5]);
                }
                return;
            }
            int i6 = length - 1;
            if (time >= fArr[i6]) {
                while (i2 < length2) {
                    v2.set$animation_core_release(i2, this.values[i6][i2]);
                    i2++;
                }
                return;
            }
        }
        int i7 = length - 1;
        int i8 = index;
        while (i8 < i7) {
            if (time == this.timePoints[i8]) {
                for (int i9 = 0; i9 < length2; i9++) {
                    v2.set$animation_core_release(i9, this.values[i8][i9]);
                }
            }
            float[] fArr2 = this.timePoints;
            int i10 = i8 + 1;
            float f4 = fArr2[i10];
            if (time < f4) {
                float f5 = fArr2[i8];
                float f6 = f4 - f5;
                float f7 = (time - f5) / f6;
                int i11 = 0;
                while (i11 < length2) {
                    float[][] fArr3 = this.values;
                    float f8 = fArr3[i8][i11];
                    float f9 = fArr3[i10][i11];
                    float[][] fArr4 = this.tangents;
                    float f10 = f6;
                    v2.set$animation_core_release(i11, interpolate(f10, f7, f8, f9, fArr4[i8][i11], fArr4[i10][i11]));
                    i11++;
                    f6 = f10;
                }
                return;
            }
            i8 = i10;
        }
    }

    private final float getSlope(float time, int j2) {
        float[] fArr = this.timePoints;
        int length = fArr.length;
        int i2 = 0;
        float f2 = fArr[0];
        if (time < f2) {
            time = f2;
        } else {
            float f3 = fArr[length - 1];
            if (time >= f3) {
                time = f3;
            }
        }
        int i3 = length - 1;
        while (i2 < i3) {
            float[] fArr2 = this.timePoints;
            int i4 = i2 + 1;
            float f4 = fArr2[i4];
            if (time <= f4) {
                float f5 = fArr2[i2];
                float f6 = f4 - f5;
                float f7 = (time - f5) / f6;
                float[][] fArr3 = this.values;
                float f8 = fArr3[i2][j2];
                float f9 = fArr3[i4][j2];
                float[][] fArr4 = this.tangents;
                return diff(f6, f7, f8, f9, fArr4[i2][j2], fArr4[i4][j2]) / f6;
            }
            i2 = i4;
        }
        return 0.0f;
    }
}
