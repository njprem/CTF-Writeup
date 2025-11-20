package androidx.compose.ui.util;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0019\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0006H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b\u001a\u0011\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0001H\u0086\b¨\u0006\u000e"}, d2 = {"packFloats", "", "val1", "", "val2", "packInts", "", "unpackAbsFloat1", "value", "unpackAbsFloat2", "unpackFloat1", "unpackFloat2", "unpackInt1", "unpackInt2", "ui-util_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class InlineClassHelperKt {
    public static final long packFloats(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final long packInts(int i2, int i3) {
        return (i3 & 4294967295L) | (i2 << 32);
    }

    public static final float unpackAbsFloat1(long j2) {
        return Float.intBitsToFloat((int) ((j2 >> 32) & 2147483647L));
    }

    public static final float unpackAbsFloat2(long j2) {
        return Float.intBitsToFloat((int) (j2 & 2147483647L));
    }

    public static final float unpackFloat1(long j2) {
        return Float.intBitsToFloat((int) (j2 >> 32));
    }

    public static final float unpackFloat2(long j2) {
        return Float.intBitsToFloat((int) (j2 & 4294967295L));
    }

    public static final int unpackInt1(long j2) {
        return (int) (j2 >> 32);
    }

    public static final int unpackInt2(long j2) {
        return (int) (j2 & 4294967295L);
    }
}
