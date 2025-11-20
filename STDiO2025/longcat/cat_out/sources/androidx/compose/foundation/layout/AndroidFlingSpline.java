package androidx.compose.foundation.layout;

import J.d;
import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bJ\u001b\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline;", "", "()V", "NbSamples", "", "SplinePositions", "", "SplineTimes", "deceleration", "", "velocity", "", "friction", "flingPosition", "Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "time", "flingPosition-LfoxSSI", "(F)J", "FlingResult", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class AndroidFlingSpline {
    private static final int NbSamples = 100;
    public static final AndroidFlingSpline INSTANCE = new AndroidFlingSpline();
    private static final float[] SplinePositions = new float[101];
    private static final float[] SplineTimes = new float[101];

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/layout/AndroidFlingSpline$FlingResult;", "", "packedValue", "", "constructor-impl", "(J)J", "distanceCoefficient", "", "getDistanceCoefficient-impl", "(J)F", "velocityCoefficient", "getVelocityCoefficient-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @JvmInline
    public static final class FlingResult {
        private final long packedValue;

        private /* synthetic */ FlingResult(long j2) {
            this.packedValue = j2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ FlingResult m513boximpl(long j2) {
            return new FlingResult(j2);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m514constructorimpl(long j2) {
            return j2;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m515equalsimpl(long j2, Object obj) {
            return (obj instanceof FlingResult) && j2 == ((FlingResult) obj).getPackedValue();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m516equalsimpl0(long j2, long j3) {
            return j2 == j3;
        }

        /* renamed from: getDistanceCoefficient-impl, reason: not valid java name */
        public static final float m517getDistanceCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) (j2 >> 32));
        }

        /* renamed from: getVelocityCoefficient-impl, reason: not valid java name */
        public static final float m518getVelocityCoefficientimpl(long j2) {
            return Float.intBitsToFloat((int) (j2 & 4294967295L));
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m519hashCodeimpl(long j2) {
            return Long.hashCode(j2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m520toStringimpl(long j2) {
            return "FlingResult(packedValue=" + j2 + ')';
        }

        public boolean equals(Object obj) {
            return m515equalsimpl(this.packedValue, obj);
        }

        public int hashCode() {
            return m519hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m520toStringimpl(this.packedValue);
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }
    }

    static {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12 = 0.0f;
        int i2 = 0;
        float f13 = 0.0f;
        while (true) {
            float f14 = 1.0f;
            if (i2 >= 100) {
                SplineTimes[100] = 1.0f;
                SplinePositions[100] = 1.0f;
                return;
            }
            float f15 = i2 / 100;
            float f16 = 1.0f;
            while (true) {
                f2 = ((f16 - f12) / 2.0f) + f12;
                f3 = f14 - f2;
                f4 = f2 * 3.0f * f3;
                f5 = f2 * f2 * f2;
                float fA = d.a(f2, 0.35000002f, f3 * 0.175f, f4) + f5;
                f6 = f14;
                f7 = f15;
                if (Math.abs(fA - f15) < 1.0E-5d) {
                    break;
                }
                if (fA > f7) {
                    f16 = f2;
                } else {
                    f12 = f2;
                }
                f14 = f6;
                f15 = f7;
            }
            SplinePositions[i2] = (((f3 * 0.5f) + f2) * f4) + f5;
            float f17 = f6;
            while (true) {
                f8 = ((f17 - f13) / 2.0f) + f13;
                f9 = f6 - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float fA2 = d.a(f9, 0.5f, f8, f10) + f11;
                if (Math.abs(fA2 - f7) >= 1.0E-5d) {
                    if (fA2 > f7) {
                        f17 = f8;
                    } else {
                        f13 = f8;
                    }
                }
            }
            SplineTimes[i2] = (((f8 * 0.35000002f) + (f9 * 0.175f)) * f10) + f11;
            i2++;
        }
    }

    private AndroidFlingSpline() {
    }

    public final double deceleration(float velocity, float friction) {
        return Math.log((Math.abs(velocity) * 0.35f) / friction);
    }

    /* renamed from: flingPosition-LfoxSSI, reason: not valid java name */
    public final long m512flingPositionLfoxSSI(float time) {
        float f2;
        float f3;
        float f4 = 100;
        int i2 = (int) (f4 * time);
        if (i2 < 100) {
            float f5 = i2 / f4;
            int i3 = i2 + 1;
            float f6 = i3 / f4;
            float[] fArr = SplinePositions;
            float f7 = fArr[i2];
            f3 = (fArr[i3] - f7) / (f6 - f5);
            f2 = ((time - f5) * f3) + f7;
        } else {
            f2 = 1.0f;
            f3 = 0.0f;
        }
        return FlingResult.m514constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }
}
