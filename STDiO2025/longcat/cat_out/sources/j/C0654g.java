package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import k.AbstractC0673a;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

/* renamed from: j.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0654g implements Collection, Set, KMutableCollection, KMutableSet {

    /* renamed from: a, reason: collision with root package name */
    public int[] f828a = AbstractC0673a.f886a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f829b = AbstractC0673a.f888c;

    /* renamed from: c, reason: collision with root package name */
    public int f830c;

    public final Object a(int i2) {
        int i3 = this.f830c;
        Object[] objArr = this.f829b;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
            return obj;
        }
        int i4 = i3 - 1;
        int[] iArr = this.f828a;
        if (iArr.length <= 8 || i3 >= iArr.length / 3) {
            if (i2 < i4) {
                int i5 = i2 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i2, i5, i3);
                Object[] objArr2 = this.f829b;
                ArraysKt.copyInto(objArr2, objArr2, i2, i5, i3);
            }
            this.f829b[i4] = null;
        } else {
            AbstractC0672z.a(this, i3 > 8 ? i3 + (i3 >> 1) : 8);
            if (i2 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f828a, 0, 0, i2, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f829b, 0, 0, i2, 6, (Object) null);
            }
            if (i2 < i4) {
                int i6 = i2 + 1;
                ArraysKt___ArraysJvmKt.copyInto(iArr, this.f828a, i2, i6, i3);
                ArraysKt.copyInto(objArr, this.f829b, i2, i6, i3);
            }
        }
        if (i3 != this.f830c) {
            throw new ConcurrentModificationException();
        }
        this.f830c = i4;
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iC;
        int i3 = this.f830c;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = AbstractC0672z.c(this, null, 0);
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iC = AbstractC0672z.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i4 = ~iC;
        int[] iArr = this.f828a;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f829b;
            AbstractC0672z.a(this, i5);
            if (i3 != this.f830c) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f828a;
            if (iArr2.length != 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, iArr.length, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f829b, 0, 0, objArr.length, 6, (Object) null);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f828a;
            int i6 = i4 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr3, iArr3, i6, i4, i3);
            Object[] objArr2 = this.f829b;
            ArraysKt.copyInto(objArr2, objArr2, i6, i4, i3);
        }
        int i7 = this.f830c;
        if (i3 == i7) {
            int[] iArr4 = this.f828a;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f829b[i4] = obj;
                this.f830c = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size() + this.f830c;
        int i2 = this.f830c;
        int[] iArr = this.f828a;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f829b;
            AbstractC0672z.a(this, size);
            int i3 = this.f830c;
            if (i3 > 0) {
                ArraysKt___ArraysJvmKt.copyInto$default(iArr, this.f828a, 0, 0, i3, 6, (Object) null);
                ArraysKt___ArraysJvmKt.copyInto$default(objArr, this.f829b, 0, 0, this.f830c, 6, (Object) null);
            }
        }
        if (this.f830c != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.f830c != 0) {
            int[] iArr = AbstractC0673a.f886a;
            Intrinsics.checkNotNullParameter(iArr, "<set-?>");
            this.f828a = iArr;
            Object[] objArr = AbstractC0673a.f888c;
            Intrinsics.checkNotNullParameter(objArr, "<set-?>");
            this.f829b = objArr;
            this.f830c = 0;
        }
        if (this.f830c != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = AbstractC0672z.c(this, null, 0);
        } else {
            iC = AbstractC0672z.c(this, obj, obj.hashCode());
        }
        return iC >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || this.f830c != ((Set) obj).size()) {
            return false;
        }
        try {
            int i2 = this.f830c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (!((Set) obj).contains(this.f829b[i3])) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f828a;
        int i2 = this.f830c;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.f830c <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0649b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iC;
        if (obj == null) {
            Intrinsics.checkNotNullParameter(this, "<this>");
            iC = AbstractC0672z.c(this, null, 0);
        } else {
            iC = AbstractC0672z.c(this, obj, obj.hashCode());
        }
        if (iC < 0) {
            return false;
        }
        a(iC);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        for (int i2 = this.f830c - 1; -1 < i2; i2--) {
            if (!CollectionsKt.contains(elements, this.f829b[i2])) {
                a(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.f830c;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return ArraysKt.copyOfRange(this.f829b, 0, this.f830c);
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f830c * 14);
        sb.append('{');
        int i2 = this.f830c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f829b[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] result) {
        Intrinsics.checkNotNullParameter(result, "array");
        int i2 = this.f830c;
        if (result.length < i2) {
            result = (Object[]) Array.newInstance(result.getClass().getComponentType(), i2);
        } else if (result.length > i2) {
            result[i2] = null;
        }
        ArraysKt.copyInto(this.f829b, result, 0, 0, this.f830c);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }
}
