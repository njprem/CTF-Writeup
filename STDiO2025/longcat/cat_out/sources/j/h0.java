package j;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import k.AbstractC0673a;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public int[] f834a = AbstractC0673a.f886a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f835b = AbstractC0673a.f888c;

    /* renamed from: c, reason: collision with root package name */
    public int f836c;

    public h0(int i2) {
    }

    public final int a(Object obj) {
        int i2 = this.f836c * 2;
        Object[] objArr = this.f835b;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (Intrinsics.areEqual(obj, objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int b(Object obj, int i2) {
        int i3 = this.f836c;
        if (i3 == 0) {
            return -1;
        }
        int iA = AbstractC0673a.a(this.f834a, i3, i2);
        if (iA < 0 || Intrinsics.areEqual(obj, this.f835b[iA << 1])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f834a[i4] == i2) {
            if (Intrinsics.areEqual(obj, this.f835b[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f834a[i5] == i2; i5--) {
            if (Intrinsics.areEqual(obj, this.f835b[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj, obj.hashCode());
    }

    public final void clear() {
        if (this.f836c > 0) {
            this.f834a = AbstractC0673a.f886a;
            this.f835b = AbstractC0673a.f888c;
            this.f836c = 0;
        }
        if (this.f836c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i2 = this.f836c;
        if (i2 == 0) {
            return -1;
        }
        int iA = AbstractC0673a.a(this.f834a, i2, 0);
        if (iA < 0 || this.f835b[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f834a[i3] == 0) {
            if (this.f835b[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f834a[i4] == 0; i4--) {
            if (this.f835b[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object e(int i2) {
        if (i2 < 0 || i2 >= this.f836c) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f835b[i2 << 1];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof h0) {
                int i2 = this.f836c;
                if (i2 != ((h0) obj).f836c) {
                    return false;
                }
                h0 h0Var = (h0) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objE = e(i3);
                    Object objH = h(i3);
                    Object obj2 = h0Var.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !h0Var.containsKey(objE)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(objH, obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.f836c != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.f836c;
            for (int i5 = 0; i5 < i4; i5++) {
                Object objE2 = e(i5);
                Object objH2 = h(i5);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!Intrinsics.areEqual(objH2, obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f836c)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        Object[] objArr = this.f835b;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i5 = i3 - 1;
        int[] iArr = this.f834a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i5) {
                int i6 = i2 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i2, i6, i3);
                Object[] objArr2 = this.f835b;
                ArraysKt.copyInto(objArr2, objArr2, i4, i6 << 1, i3 << 1);
            }
            Object[] objArr3 = this.f835b;
            int i7 = i5 << 1;
            objArr3[i7] = null;
            objArr3[i7 + 1] = null;
        } else {
            int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
            int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f834a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f835b, i8 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f835b = objArrCopyOf;
            if (i3 != this.f836c) {
                throw new ConcurrentModificationException();
            }
            if (i2 > 0) {
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f834a, 0, 0, i2);
                ArraysKt.copyInto(objArr, this.f835b, 0, 0, i4);
            }
            if (i2 < i5) {
                int i9 = i2 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f834a, i2, i9, i3);
                ArraysKt.copyInto(objArr, this.f835b, i4, i9 << 1, i3 << 1);
            }
        }
        if (i3 != this.f836c) {
            throw new ConcurrentModificationException();
        }
        this.f836c = i5;
        return obj;
    }

    public final Object g(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.f836c) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f835b;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f835b[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f835b[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        if (i2 < 0 || i2 >= this.f836c) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        return this.f835b[(i2 << 1) + 1];
    }

    public final int hashCode() {
        int[] iArr = this.f834a;
        Object[] objArr = this.f835b;
        int i2 = this.f836c;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.f836c <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.f836c;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(obj, iHashCode) : d();
        if (iB >= 0) {
            int i3 = (iB << 1) + 1;
            Object[] objArr = this.f835b;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iB;
        int[] iArr = this.f834a;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f834a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f835b, i5 << 1);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f835b = objArrCopyOf;
            if (i2 != this.f836c) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f834a;
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr2, iArr2, i6, i4, i2);
            Object[] objArr2 = this.f835b;
            ArraysKt.copyInto(objArr2, objArr2, i6 << 1, i4 << 1, this.f836c << 1);
        }
        int i7 = this.f836c;
        if (i2 == i7) {
            int[] iArr3 = this.f834a;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.f835b;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.f836c = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.f836c;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f836c * 28);
        sb.append('{');
        int i2 = this.f836c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objE = e(i3);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i3);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !Intrinsics.areEqual(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !Intrinsics.areEqual(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
