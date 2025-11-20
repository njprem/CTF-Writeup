package B;

/* loaded from: classes.dex */
public final class u implements t {

    /* renamed from: a, reason: collision with root package name */
    public final int f118a;

    /* renamed from: b, reason: collision with root package name */
    public int f119b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f120c = -1;

    public u(int i2) {
        this.f118a = i2;
    }

    @Override // B.t
    public final boolean c(CharSequence charSequence, int i2, int i3, C c2) {
        int i4 = this.f118a;
        if (i2 > i4 || i4 >= i3) {
            return i3 <= i4;
        }
        this.f119b = i2;
        this.f120c = i3;
        return false;
    }

    @Override // B.t
    public final Object a() {
        return this;
    }
}
