package B;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    public final C.b f71a;

    /* renamed from: b, reason: collision with root package name */
    public final char[] f72b;

    /* renamed from: c, reason: collision with root package name */
    public final A f73c = new A(1024);

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f74d;

    public B(Typeface typeface, C.b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        this.f74d = typeface;
        this.f71a = bVar;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i6 = iA + bVar.f144a;
            i2 = bVar.f145b.getInt(bVar.f145b.getInt(i6) + i6);
        } else {
            i2 = 0;
        }
        this.f72b = new char[i2 * 2];
        int iA2 = bVar.a(6);
        if (iA2 != 0) {
            int i7 = iA2 + bVar.f144a;
            i3 = bVar.f145b.getInt(bVar.f145b.getInt(i7) + i7);
        } else {
            i3 = 0;
        }
        for (int i8 = 0; i8 < i3; i8++) {
            C c2 = new C(this, i8);
            C.a aVarB = c2.b();
            int iA3 = aVarB.a(4);
            Character.toChars(iA3 != 0 ? aVarB.f145b.getInt(iA3 + aVarB.f144a) : 0, this.f72b, i8 * 2);
            C.a aVarB2 = c2.b();
            int iA4 = aVarB2.a(16);
            if (iA4 != 0) {
                int i9 = iA4 + aVarB2.f144a;
                i4 = aVarB2.f145b.getInt(aVarB2.f145b.getInt(i9) + i9);
            } else {
                i4 = 0;
            }
            if (!(i4 > 0)) {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
            C.a aVarB3 = c2.b();
            int iA5 = aVarB3.a(16);
            if (iA5 != 0) {
                int i10 = iA5 + aVarB3.f144a;
                i5 = aVarB3.f145b.getInt(aVarB3.f145b.getInt(i10) + i10);
            } else {
                i5 = 0;
            }
            this.f73c.a(c2, 0, i5 - 1);
        }
    }
}
