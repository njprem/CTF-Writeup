package androidx.compose.ui.input.pointer.util;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.HistoricalChange;
import androidx.compose.ui.input.pointer.PointerEventKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u001a(\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u00142\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001H\u0082\b¢\u0006\u0002\u0010\u0019\u001a(\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0011\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u0003H\u0082\b\u001a2\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00012\b\b\u0002\u0010%\u001a\u00020\u0015H\u0000\u001a\u0012\u0010&\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*\u001a\u0014\u0010+\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010,\u001a\u00020'*\u00020(2\u0006\u0010)\u001a\u00020*H\u0002\u001a\u0014\u0010-\u001a\u00020\u0003*\u00020\u00152\u0006\u0010.\u001a\u00020\u0015H\u0002\u001a,\u0010/\u001a\u00020\u0003*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u0001H\u0082\n¢\u0006\u0002\u00103\u001a\r\u00104\u001a\u00020\u0003*\u00020\u0015H\u0082\b\u001a4\u00105\u001a\u00020'*\f\u0012\u0004\u0012\u00020\u00150\u0014j\u0002`02\u0006\u00101\u001a\u00020\u00012\u0006\u00102\u001a\u00020\u00012\u0006\u00106\u001a\u00020\u0003H\u0082\n¢\u0006\u0002\u00107\u001a1\u00105\u001a\u00020'*\n\u0012\u0006\u0012\u0004\u0018\u0001080\u00142\u0006\u00109\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020:2\u0006\u0010;\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010<\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\",\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\",\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00078G@GX\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\n\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000e*\u0018\b\u0002\u0010\u0013\"\b\u0012\u0004\u0012\u00020\u00150\u00142\b\u0012\u0004\u0012\u00020\u00150\u0014*\f\b\u0002\u0010=\"\u00020\u00152\u00020\u0015¨\u0006>"}, d2 = {"AssumePointerMoveStoppedMilliseconds", "", "DefaultWeight", "", "HistorySize", "HorizonMilliseconds", "<set-?>", "", "VelocityTrackerAddPointsFix", "getVelocityTrackerAddPointsFix$annotations", "()V", "getVelocityTrackerAddPointsFix", "()Z", "setVelocityTrackerAddPointsFix", "(Z)V", "VelocityTrackerStrategyUseImpulse", "getVelocityTrackerStrategyUseImpulse$annotations", "getVelocityTrackerStrategyUseImpulse", "setVelocityTrackerStrategyUseImpulse", "Matrix", "", "", "Landroidx/compose/ui/input/pointer/util/Vector;", "rows", "cols", "(II)[[F", "calculateImpulseVelocity", "dataPoints", "time", "sampleCount", "isDataDifferential", "kineticEnergyToVelocity", "kineticEnergy", "polyFitLeastSquares", "x", "y", "degree", "coefficients", "addPointerInputChange", "", "Landroidx/compose/ui/input/pointer/util/VelocityTracker;", "event", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "addPointerInputChangeLegacy", "addPointerInputChangeWithFix", "dot", "a", "get", "Landroidx/compose/ui/input/pointer/util/Matrix;", "row", "col", "([[FII)F", "norm", "set", "value", "([[FIIF)V", "Landroidx/compose/ui/input/pointer/util/DataPointAtTime;", "index", "", "dataPoint", "([Landroidx/compose/ui/input/pointer/util/DataPointAtTime;IJF)V", "Vector", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VelocityTrackerKt {
    private static final int AssumePointerMoveStoppedMilliseconds = 40;
    private static final float DefaultWeight = 1.0f;
    private static final int HistorySize = 20;
    private static final int HorizonMilliseconds = 100;
    private static boolean VelocityTrackerAddPointsFix = true;
    private static boolean VelocityTrackerStrategyUseImpulse;

    private static final float[][] Matrix(int i2, int i3) {
        float[][] fArr = new float[i2][];
        for (int i4 = 0; i4 < i2; i4++) {
            fArr[i4] = new float[i3];
        }
        return fArr;
    }

    public static final void addPointerInputChange(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (VelocityTrackerAddPointsFix) {
            addPointerInputChangeWithFix(velocityTracker, pointerInputChange);
        } else {
            addPointerInputChangeLegacy(velocityTracker, pointerInputChange);
        }
    }

    private static final void addPointerInputChangeLegacy(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.m5093setCurrentPointerPositionAccumulatork4lQ0M$ui_release(pointerInputChange.getPosition());
            velocityTracker.resetTracking();
        }
        long previousPosition = pointerInputChange.getPreviousPosition();
        List<HistoricalChange> historical = pointerInputChange.getHistorical();
        int size = historical.size();
        int i2 = 0;
        while (i2 < size) {
            HistoricalChange historicalChange = historical.get(i2);
            long jM3555minusMKHz9U = Offset.m3555minusMKHz9U(historicalChange.getPosition(), previousPosition);
            long position = historicalChange.getPosition();
            velocityTracker.m5093setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3556plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), jM3555minusMKHz9U));
            velocityTracker.m5089addPositionUv8p0NA(historicalChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
            i2++;
            previousPosition = position;
        }
        velocityTracker.m5093setCurrentPointerPositionAccumulatork4lQ0M$ui_release(Offset.m3556plusMKHz9U(velocityTracker.getCurrentPointerPositionAccumulator(), Offset.m3555minusMKHz9U(pointerInputChange.getPosition(), previousPosition)));
        velocityTracker.m5089addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), velocityTracker.getCurrentPointerPositionAccumulator());
    }

    private static final void addPointerInputChangeWithFix(VelocityTracker velocityTracker, PointerInputChange pointerInputChange) {
        if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
            velocityTracker.resetTracking();
        }
        if (!PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
            List<HistoricalChange> historical = pointerInputChange.getHistorical();
            int size = historical.size();
            for (int i2 = 0; i2 < size; i2++) {
                HistoricalChange historicalChange = historical.get(i2);
                velocityTracker.m5089addPositionUv8p0NA(historicalChange.getUptimeMillis(), historicalChange.getOriginalEventPosition());
            }
            velocityTracker.m5089addPositionUv8p0NA(pointerInputChange.getUptimeMillis(), pointerInputChange.getOriginalEventPosition());
        }
        if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange) && pointerInputChange.getUptimeMillis() - velocityTracker.getLastMoveEventTimeStamp() > 40) {
            velocityTracker.resetTracking();
        }
        velocityTracker.setLastMoveEventTimeStamp$ui_release(pointerInputChange.getUptimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateImpulseVelocity(float[] fArr, float[] fArr2, int i2, boolean z) {
        int i3 = i2 - 1;
        float f2 = fArr2[i3];
        float f3 = 0.0f;
        int i4 = i3;
        while (i4 > 0) {
            int i5 = i4 - 1;
            float f4 = fArr2[i5];
            if (f2 != f4) {
                float f5 = (z ? -fArr[i5] : fArr[i4] - fArr[i5]) / (f2 - f4);
                float fAbs = (Math.abs(f5) * (f5 - (Math.signum(f3) * ((float) Math.sqrt(Math.abs(f3) * 2))))) + f3;
                if (i4 == i3) {
                    fAbs *= 0.5f;
                }
                f3 = fAbs;
            }
            i4--;
            f2 = f4;
        }
        return Math.signum(f3) * ((float) Math.sqrt(Math.abs(f3) * 2));
    }

    private static final float dot(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < length; i2++) {
            f2 += fArr[i2] * fArr2[i2];
        }
        return f2;
    }

    private static final float get(float[][] fArr, int i2, int i3) {
        return fArr[i2][i3];
    }

    public static final boolean getVelocityTrackerAddPointsFix() {
        return VelocityTrackerAddPointsFix;
    }

    public static /* synthetic */ void getVelocityTrackerAddPointsFix$annotations() {
    }

    public static final boolean getVelocityTrackerStrategyUseImpulse() {
        return VelocityTrackerStrategyUseImpulse;
    }

    public static /* synthetic */ void getVelocityTrackerStrategyUseImpulse$annotations() {
    }

    private static final float kineticEnergyToVelocity(float f2) {
        return Math.signum(f2) * ((float) Math.sqrt(Math.abs(f2) * 2));
    }

    private static final float norm(float[] fArr) {
        return (float) Math.sqrt(dot(fArr, fArr));
    }

    public static final float[] polyFitLeastSquares(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3) {
        int i4 = i3;
        if (i4 < 1) {
            InlineClassHelperKt.throwIllegalArgumentException("The degree must be at positive integer");
        }
        if (i2 == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("At least one point must be provided");
        }
        if (i4 >= i2) {
            i4 = i2 - 1;
        }
        int i5 = i4 + 1;
        float[][] fArr4 = new float[i5][];
        for (int i6 = 0; i6 < i5; i6++) {
            fArr4[i6] = new float[i2];
        }
        for (int i7 = 0; i7 < i2; i7++) {
            fArr4[0][i7] = 1.0f;
            for (int i8 = 1; i8 < i5; i8++) {
                fArr4[i8][i7] = fArr4[i8 - 1][i7] * fArr[i7];
            }
        }
        float[][] fArr5 = new float[i5][];
        for (int i9 = 0; i9 < i5; i9++) {
            fArr5[i9] = new float[i2];
        }
        float[][] fArr6 = new float[i5][];
        for (int i10 = 0; i10 < i5; i10++) {
            fArr6[i10] = new float[i5];
        }
        int i11 = 0;
        while (i11 < i5) {
            float[] fArr7 = fArr5[i11];
            ArraysKt___ArraysJvmKt.copyInto(fArr4[i11], fArr7, 0, 0, i2);
            for (int i12 = 0; i12 < i11; i12++) {
                float[] fArr8 = fArr5[i12];
                float fDot = dot(fArr7, fArr8);
                for (int i13 = 0; i13 < i2; i13++) {
                    fArr7[i13] = fArr7[i13] - (fArr8[i13] * fDot);
                }
            }
            float fSqrt = (float) Math.sqrt(dot(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i14 = 0; i14 < i2; i14++) {
                fArr7[i14] = fArr7[i14] * f2;
            }
            float[] fArr9 = fArr6[i11];
            int i15 = 0;
            while (i15 < i5) {
                fArr9[i15] = i15 < i11 ? 0.0f : dot(fArr7, fArr4[i15]);
                i15++;
            }
            i11++;
        }
        for (int i16 = i4; -1 < i16; i16--) {
            float fDot2 = dot(fArr5[i16], fArr2);
            float[] fArr10 = fArr6[i16];
            int i17 = i16 + 1;
            if (i17 <= i4) {
                int i18 = i4;
                while (true) {
                    fDot2 -= fArr10[i18] * fArr3[i18];
                    if (i18 != i17) {
                        i18--;
                    }
                }
            }
            fArr3[i16] = fDot2 / fArr10[i16];
        }
        return fArr3;
    }

    public static /* synthetic */ float[] polyFitLeastSquares$default(float[] fArr, float[] fArr2, int i2, int i3, float[] fArr3, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            fArr3 = new float[RangesKt.coerceAtLeast(i3 + 1, 0)];
        }
        return polyFitLeastSquares(fArr, fArr2, i2, i3, fArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void set(DataPointAtTime[] dataPointAtTimeArr, int i2, long j2, float f2) {
        DataPointAtTime dataPointAtTime = dataPointAtTimeArr[i2];
        if (dataPointAtTime == null) {
            dataPointAtTimeArr[i2] = new DataPointAtTime(j2, f2);
        } else {
            dataPointAtTime.setTime(j2);
            dataPointAtTime.setDataPoint(f2);
        }
    }

    public static final void setVelocityTrackerAddPointsFix(boolean z) {
        VelocityTrackerAddPointsFix = z;
    }

    public static final void setVelocityTrackerStrategyUseImpulse(boolean z) {
        VelocityTrackerStrategyUseImpulse = z;
    }

    private static final void set(float[][] fArr, int i2, int i3, float f2) {
        fArr[i2][i3] = f2;
    }
}
