package j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: j.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0655h {

    /* renamed from: a, reason: collision with root package name */
    public float[] f832a;

    /* renamed from: b, reason: collision with root package name */
    public int f833b;

    public final float a(int i2) {
        if (i2 >= 0 && i2 < this.f833b) {
            return this.f832a[i2];
        }
        StringBuilder sbP = androidx.compose.runtime.changelist.a.p(i2, "Index ", " must be in 0..");
        sbP.append(this.f833b - 1);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0655h) {
            AbstractC0655h abstractC0655h = (AbstractC0655h) obj;
            int i2 = abstractC0655h.f833b;
            int i3 = this.f833b;
            if (i2 == i3) {
                float[] fArr = this.f832a;
                float[] fArr2 = abstractC0655h.f832a;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (fArr[first] == fArr2[first]) {
                    if (first == last) {
                        return true;
                    }
                    first++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.f832a;
        int i2 = this.f833b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += Float.hashCode(fArr[i3]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.f832a;
        int i2 = this.f833b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            float f2 = fArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f2);
            i3++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
