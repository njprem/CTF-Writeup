package j;

import java.util.ConcurrentModificationException;
import k.AbstractC0673a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0672z {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f883a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final Object[] f884b = new Object[0];

    /* renamed from: c, reason: collision with root package name */
    public static final Object f885c = new Object();

    public static final void a(C0654g c0654g, int i2) {
        Intrinsics.checkNotNullParameter(c0654g, "<this>");
        int[] iArr = new int[i2];
        c0654g.getClass();
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        c0654g.f828a = iArr;
        Object[] objArr = new Object[i2];
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        c0654g.f829b = objArr;
    }

    public static long b(float f2, float f3) {
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final int c(C0654g c0654g, Object obj, int i2) {
        Intrinsics.checkNotNullParameter(c0654g, "<this>");
        int i3 = c0654g.f830c;
        if (i3 == 0) {
            return -1;
        }
        Intrinsics.checkNotNullParameter(c0654g, "<this>");
        try {
            int iA = AbstractC0673a.a(c0654g.f828a, c0654g.f830c, i2);
            if (iA < 0 || Intrinsics.areEqual(obj, c0654g.f829b[iA])) {
                return iA;
            }
            int i4 = iA + 1;
            while (i4 < i3 && c0654g.f828a[i4] == i2) {
                if (Intrinsics.areEqual(obj, c0654g.f829b[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = iA - 1; i5 >= 0 && c0654g.f828a[i5] == i2; i5--) {
                if (Intrinsics.areEqual(obj, c0654g.f829b[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
