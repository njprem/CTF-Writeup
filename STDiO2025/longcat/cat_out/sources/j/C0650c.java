package j;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: j.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0650c implements Set {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653f f799a;

    public C0650c(C0653f c0653f) {
        this.f799a = c0653f;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f799a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f799a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return this.f799a.i(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        C0653f c0653f = this.f799a;
        try {
            if (c0653f.f836c == set.size()) {
                return c0653f.i(set);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        C0653f c0653f = this.f799a;
        int iHashCode = 0;
        for (int i2 = c0653f.f836c - 1; i2 >= 0; i2--) {
            Object objE = c0653f.e(i2);
            iHashCode += objE == null ? 0 : objE.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f799a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0649b(this.f799a, 0);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        C0653f c0653f = this.f799a;
        int iC = c0653f.c(obj);
        if (iC < 0) {
            return false;
        }
        c0653f.f(iC);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        return this.f799a.j(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        C0653f c0653f = this.f799a;
        int i2 = c0653f.f836c;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (!collection.contains(c0653f.e(i3))) {
                c0653f.f(i3);
            }
        }
        return i2 != c0653f.f836c;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f799a.f836c;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0653f c0653f = this.f799a;
        int i2 = c0653f.f836c;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0653f.e(i3);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        C0653f c0653f = this.f799a;
        int i2 = c0653f.f836c;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = c0653f.e(i3);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
