package B;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f69a;

    /* renamed from: b, reason: collision with root package name */
    public C f70b;

    public A(int i2) {
        this.f69a = new SparseArray(i2);
    }

    public final void a(C c2, int i2, int i3) {
        int iA = c2.a(i2);
        SparseArray sparseArray = this.f69a;
        A a2 = sparseArray == null ? null : (A) sparseArray.get(iA);
        if (a2 == null) {
            a2 = new A(1);
            sparseArray.put(c2.a(i2), a2);
        }
        if (i3 > i2) {
            a2.a(c2, i2 + 1, i3);
        } else {
            a2.f70b = c2;
        }
    }
}
