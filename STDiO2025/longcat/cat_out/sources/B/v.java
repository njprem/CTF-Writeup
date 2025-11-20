package B;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public int f121a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final A f122b;

    /* renamed from: c, reason: collision with root package name */
    public A f123c;

    /* renamed from: d, reason: collision with root package name */
    public A f124d;

    /* renamed from: e, reason: collision with root package name */
    public int f125e;

    /* renamed from: f, reason: collision with root package name */
    public int f126f;

    public v(A a2) {
        this.f122b = a2;
        this.f123c = a2;
    }

    public final void a() {
        this.f121a = 1;
        this.f123c = this.f122b;
        this.f126f = 0;
    }

    public final boolean b() {
        C.a aVarB = this.f123c.f70b.b();
        int iA = aVarB.a(6);
        return !(iA == 0 || aVarB.f145b.get(iA + aVarB.f144a) == 0) || this.f125e == 65039;
    }
}
