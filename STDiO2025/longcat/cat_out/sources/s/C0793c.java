package s;

import android.graphics.Insets;

/* renamed from: s.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0793c {

    /* renamed from: e, reason: collision with root package name */
    public static final C0793c f974e = new C0793c(0, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f975a;

    /* renamed from: b, reason: collision with root package name */
    public final int f976b;

    /* renamed from: c, reason: collision with root package name */
    public final int f977c;

    /* renamed from: d, reason: collision with root package name */
    public final int f978d;

    public C0793c(int i2, int i3, int i4, int i5) {
        this.f975a = i2;
        this.f976b = i3;
        this.f977c = i4;
        this.f978d = i5;
    }

    public static C0793c a(C0793c c0793c, C0793c c0793c2) {
        return b(Math.max(c0793c.f975a, c0793c2.f975a), Math.max(c0793c.f976b, c0793c2.f976b), Math.max(c0793c.f977c, c0793c2.f977c), Math.max(c0793c.f978d, c0793c2.f978d));
    }

    public static C0793c b(int i2, int i3, int i4, int i5) {
        return (i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) ? f974e : new C0793c(i2, i3, i4, i5);
    }

    public static C0793c c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return AbstractC0792b.a(this.f975a, this.f976b, this.f977c, this.f978d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0793c.class != obj.getClass()) {
            return false;
        }
        C0793c c0793c = (C0793c) obj;
        return this.f978d == c0793c.f978d && this.f975a == c0793c.f975a && this.f977c == c0793c.f977c && this.f976b == c0793c.f976b;
    }

    public final int hashCode() {
        return (((((this.f975a * 31) + this.f976b) * 31) + this.f977c) * 31) + this.f978d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.f975a);
        sb.append(", top=");
        sb.append(this.f976b);
        sb.append(", right=");
        sb.append(this.f977c);
        sb.append(", bottom=");
        return androidx.compose.runtime.changelist.a.o(sb, this.f978d, '}');
    }
}
