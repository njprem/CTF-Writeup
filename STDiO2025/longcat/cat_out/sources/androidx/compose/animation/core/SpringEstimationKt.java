package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a8\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007\u001a0\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\fH\u0007\u001a(\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a8\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a0\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a(\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002\u001a9\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001a2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u001aH\u0082\b\u001a\r\u0010\u001c\u001a\u00020\u001d*\u00020\u0004H\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"MAX_LONG_MILLIS", "", "estimateAnimationDurationMillis", "stiffness", "", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "springConstant", "dampingCoefficient", "mass", "", "estimateCriticallyDamped", "firstRoot", "Landroidx/compose/animation/core/ComplexDouble;", "p0", "v0", "estimateDurationInternal", "secondRoot", "initialPosition", "estimateOverDamped", "estimateUnderDamped", "iterateNewtonsMethod", "x", "fn", "Lkotlin/Function1;", "fnPrime", "isNotFinite", "", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SpringEstimationKt {
    private static final long MAX_LONG_MILLIS = 9223372036854L;

    public static final long estimateAnimationDurationMillis(float f2, float f3, float f4, float f5, float f6) {
        return f3 == 0.0f ? MAX_LONG_MILLIS : estimateAnimationDurationMillis(f2, f3, f4, f5, f6);
    }

    private static final double estimateCriticallyDamped(ComplexDouble complexDouble, double d2, double d3, double d4) {
        double d5 = d4;
        double real = complexDouble.getReal();
        double d6 = real * d2;
        double d7 = d3 - d6;
        double dLog = Math.log(Math.abs(d5 / d2)) / real;
        double dLog2 = Math.log(Math.abs(d5 / d7));
        double dLog3 = dLog2;
        for (int i2 = 0; i2 < 6; i2++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / real));
        }
        double d8 = dLog3 / real;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d8;
        } else if ((Double.isInfinite(d8) || Double.isNaN(d8)) ? false : true) {
            dLog = Math.max(dLog, d8);
        }
        double d9 = (-(d6 + d7)) / (real * d7);
        double d10 = real * d9;
        double dExp = (Math.exp(d10) * d7 * d9) + (Math.exp(d10) * d2);
        if (Double.isNaN(d9) || d9 <= 0.0d) {
            d5 = -d5;
        } else if (d9 <= 0.0d || (-dExp) >= d5) {
            dLog = (-(2.0d / real)) - (d2 / d7);
        } else {
            if (d7 < 0.0d && d2 > 0.0d) {
                dLog = 0.0d;
            }
            d5 = -d5;
        }
        double dAbs = Double.MAX_VALUE;
        int i3 = 0;
        while (dAbs > 0.001d && i3 < 100) {
            i3++;
            double d11 = real * dLog;
            double dExp2 = dLog - (((Math.exp(d11) * ((d7 * dLog) + d2)) + d5) / (Math.exp(d11) * (((1 + d11) * d7) + d6)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
        }
        return dLog;
    }

    private static final long estimateDurationInternal(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d2, double d3, double d4, double d5) {
        if (d4 == 0.0d && d3 == 0.0d) {
            return 0L;
        }
        if (d4 < 0.0d) {
            d3 = -d3;
        }
        double d6 = d3;
        double dAbs = Math.abs(d4);
        return (long) ((d2 > 1.0d ? estimateOverDamped(complexDouble, complexDouble2, dAbs, d6, d5) : d2 < 1.0d ? estimateUnderDamped(complexDouble, dAbs, d6, d5) : estimateCriticallyDamped(complexDouble, dAbs, d6, d5)) * 1000.0d);
    }

    private static final double estimateOverDamped(ComplexDouble complexDouble, ComplexDouble complexDouble2, double d2, double d3, double d4) {
        double d5 = d4;
        double real = complexDouble.getReal();
        double real2 = complexDouble2.getReal();
        double d6 = real - real2;
        double d7 = ((real * d2) - d3) / d6;
        double d8 = d2 - d7;
        double dLog = Math.log(Math.abs(d5 / d8)) / real;
        double dLog2 = Math.log(Math.abs(d5 / d7)) / real2;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true) {
                dLog = Math.max(dLog, dLog2);
            }
            dLog2 = dLog;
        }
        double d9 = d8 * real;
        double dLog3 = Math.log(d9 / ((-d7) * real2)) / (real2 - real);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d5 = -d5;
        } else if (dLog3 <= 0.0d || (-estimateOverDamped$xInflection(d8, real, dLog3, d7, real2)) >= d5) {
            dLog2 = Math.log((-((d7 * real2) * real2)) / (d9 * real)) / d6;
        } else {
            if (d7 > 0.0d && d8 < 0.0d) {
                dLog2 = 0.0d;
            }
            d5 = -d5;
        }
        double d10 = d7 * real2;
        if (Math.abs((Math.exp(real2 * dLog2) * d10) + (Math.exp(real * dLog2) * d9)) < 1.0E-4d) {
            return dLog2;
        }
        double d11 = Double.MAX_VALUE;
        double d12 = d5;
        int i2 = 0;
        while (d11 > 0.001d && i2 < 100) {
            i2++;
            double d13 = real * dLog2;
            double d14 = real2 * dLog2;
            double dExp = dLog2 - ((((Math.exp(d14) * d7) + (Math.exp(d13) * d8)) + d12) / ((Math.exp(d14) * d10) + (Math.exp(d13) * d9)));
            double dAbs = Math.abs(dLog2 - dExp);
            dLog2 = dExp;
            d11 = dAbs;
        }
        return dLog2;
    }

    private static final double estimateOverDamped$xInflection(double d2, double d3, double d4, double d5, double d6) {
        return (Math.exp(d6 * d4) * d5) + (Math.exp(d3 * d4) * d2);
    }

    private static final double estimateUnderDamped(ComplexDouble complexDouble, double d2, double d3, double d4) {
        double real = complexDouble.getReal();
        double imaginary = (d3 - (real * d2)) / complexDouble.getImaginary();
        return Math.log(d4 / Math.sqrt((imaginary * imaginary) + (d2 * d2))) / real;
    }

    private static final boolean isNotFinite(double d2) {
        return !((Double.isInfinite(d2) || Double.isNaN(d2)) ? false : true);
    }

    private static final double iterateNewtonsMethod(double d2, Function1<? super Double, Double> function1, Function1<? super Double, Double> function12) {
        return d2 - (function1.invoke(Double.valueOf(d2)).doubleValue() / function12.invoke(Double.valueOf(d2)).doubleValue());
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6) {
        double dSqrt = Math.sqrt(d2) * 2.0d * d3;
        double d7 = (dSqrt * dSqrt) - (d2 * 4.0d);
        double d8 = -dSqrt;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d7);
        complexDoubleComplexSqrt._real += d8;
        complexDoubleComplexSqrt._real *= 0.5d;
        complexDoubleComplexSqrt._imaginary *= 0.5d;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d7);
        double d9 = -1;
        complexDoubleComplexSqrt2._real *= d9;
        complexDoubleComplexSqrt2._imaginary *= d9;
        complexDoubleComplexSqrt2._real += d8;
        complexDoubleComplexSqrt2._real *= 0.5d;
        complexDoubleComplexSqrt2._imaginary *= 0.5d;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, d3, d4, d5, d6);
    }

    public static final long estimateAnimationDurationMillis(double d2, double d3, double d4, double d5, double d6, double d7) {
        double dSqrt = d3 / (Math.sqrt(d2 * d4) * 2.0d);
        double d8 = (d3 * d3) - ((4.0d * d4) * d2);
        double d9 = 1.0d / (2.0d * d4);
        double d10 = -d3;
        ComplexDouble complexDoubleComplexSqrt = ComplexDoubleKt.complexSqrt(d8);
        complexDoubleComplexSqrt._real += d10;
        complexDoubleComplexSqrt._real *= d9;
        complexDoubleComplexSqrt._imaginary *= d9;
        ComplexDouble complexDoubleComplexSqrt2 = ComplexDoubleKt.complexSqrt(d8);
        double d11 = -1;
        complexDoubleComplexSqrt2._real *= d11;
        complexDoubleComplexSqrt2._imaginary *= d11;
        complexDoubleComplexSqrt2._real += d10;
        complexDoubleComplexSqrt2._real *= d9;
        complexDoubleComplexSqrt2._imaginary *= d9;
        return estimateDurationInternal(complexDoubleComplexSqrt, complexDoubleComplexSqrt2, dSqrt, d5, d6, d7);
    }
}
