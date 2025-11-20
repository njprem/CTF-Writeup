package androidx.compose.ui.util;

import kotlin.Metadata;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a)\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a)\u0010\b\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0001\u001a\u001e\u0010\t\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0001\u001a\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0086\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0086\b\u001a\u0015\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b\u001a\u001d\u0010\u0014\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0010H\u0086\b\u001a\u001d\u0010\u0014\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u0001H\u0086\b¨\u0006\u0015"}, d2 = {"fastCbrt", "", "x", "fastMaxOf", "a", "b", "c", "d", "fastMinOf", "lerp", "start", "stop", "fraction", "", "", "fastCoerceAtLeast", "", "minimumValue", "fastCoerceAtMost", "maximumValue", "fastCoerceIn", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MathHelpersKt {
    public static final float fastCbrt(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f2) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final double fastCoerceAtLeast(double d2, double d3) {
        return d2 < d3 ? d3 : d2;
    }

    public static final double fastCoerceAtMost(double d2, double d3) {
        return d2 > d3 ? d3 : d2;
    }

    public static final double fastCoerceIn(double d2, double d3, double d4) {
        if (d2 < d3) {
            d2 = d3;
        }
        return d2 > d4 ? d4 : d2;
    }

    public static final float fastMaxOf(float f2, float f3, float f4, float f5) {
        return Math.max(f2, Math.max(f3, Math.max(f4, f5)));
    }

    public static final float fastMinOf(float f2, float f3, float f4, float f5) {
        return Math.min(f2, Math.min(f3, Math.min(f4, f5)));
    }

    public static final float lerp(float f2, float f3, float f4) {
        return (f4 * f3) + ((1 - f4) * f2);
    }

    public static final float fastCoerceAtLeast(float f2, float f3) {
        return f2 < f3 ? f3 : f2;
    }

    public static final float fastCoerceAtMost(float f2, float f3) {
        return f2 > f3 ? f3 : f2;
    }

    public static final float fastCoerceIn(float f2, float f3, float f4) {
        if (f2 < f3) {
            f2 = f3;
        }
        return f2 > f4 ? f4 : f2;
    }

    public static final long lerp(long j2, long j3, float f2) {
        return MathKt.roundToLong((j3 - j2) * f2) + j2;
    }

    public static final int lerp(int i2, int i3, float f2) {
        return i2 + ((int) Math.round((i3 - i2) * f2));
    }
}
