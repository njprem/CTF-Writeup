package j;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* loaded from: classes.dex */
public abstract class X {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f773a;

    /* renamed from: b, reason: collision with root package name */
    public int f774b;

    public final boolean equals(Object obj) {
        if (obj instanceof X) {
            X x2 = (X) obj;
            int i2 = x2.f774b;
            int i3 = this.f774b;
            if (i2 == i3) {
                Object[] objArr = this.f773a;
                Object[] objArr2 = x2.f773a;
                IntRange intRangeUntil = RangesKt.until(0, i3);
                int first = intRangeUntil.getFirst();
                int last = intRangeUntil.getLast();
                if (first > last) {
                    return true;
                }
                while (Intrinsics.areEqual(objArr[first], objArr2[first])) {
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
        Object[] objArr = this.f773a;
        int i2 = this.f774b;
        int iHashCode = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        W w2 = new W(this, 0);
        Intrinsics.checkNotNullParameter(", ", "separator");
        Intrinsics.checkNotNullParameter("[", "prefix");
        Intrinsics.checkNotNullParameter("]", "postfix");
        Intrinsics.checkNotNullParameter("...", "truncated");
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.f773a;
        int i2 = this.f774b;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i3];
            if (i3 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i3 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) w2.invoke(obj));
            i3++;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
