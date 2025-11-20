package androidx.lifecycle;

import java.lang.reflect.Method;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0570c {

    /* renamed from: a, reason: collision with root package name */
    public final int f576a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f577b;

    public C0570c(int i2, Method method) throws SecurityException {
        this.f576a = i2;
        this.f577b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0570c)) {
            return false;
        }
        C0570c c0570c = (C0570c) obj;
        return this.f576a == c0570c.f576a && this.f577b.getName().equals(c0570c.f577b.getName());
    }

    public final int hashCode() {
        return this.f577b.getName().hashCode() + (this.f576a * 31);
    }
}
