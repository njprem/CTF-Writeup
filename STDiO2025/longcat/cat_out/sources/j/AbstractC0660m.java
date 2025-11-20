package j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* renamed from: j.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0660m {

    /* renamed from: a, reason: collision with root package name */
    public int[] f848a;

    /* renamed from: b, reason: collision with root package name */
    public int f849b;

    public final int a(int i2) {
        if (i2 >= 0 && i2 < this.f849b) {
            return this.f848a[i2];
        }
        StringBuilder sbP = androidx.compose.runtime.changelist.a.p(i2, "Index ", " must be in 0..");
        sbP.append(this.f849b - 1);
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0660m) {
            AbstractC0660m abstractC0660m = (AbstractC0660m) obj;
            int i2 = abstractC0660m.f849b;
            int i3 = this.f849b;
            if (i2 == i3) {
                int[] iArr = this.f848a;
                int[] iArr2 = abstractC0660m.f848a;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (iArr[first] == iArr2[first]) {
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
        int[] iArr = this.f848a;
        int i2 = this.f849b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iHashCode += Integer.hashCode(iArr[i3]) * 31;
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
        int[] iArr = this.f848a;
        int i2 = this.f849b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            int i4 = iArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i4);
            i3++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
