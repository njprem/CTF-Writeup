package androidx.core.view;

import android.view.WindowInsetsAnimation;
import s.C0793c;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    public final C0793c f443a;

    /* renamed from: b, reason: collision with root package name */
    public final C0793c f444b;

    public D(C0793c c0793c, C0793c c0793c2) {
        this.f443a = c0793c;
        this.f444b = c0793c2;
    }

    public final String toString() {
        return "Bounds{lower=" + this.f443a + " upper=" + this.f444b + "}";
    }

    public D(WindowInsetsAnimation.Bounds bounds) {
        this.f443a = C0793c.c(bounds.getLowerBound());
        this.f444b = C0793c.c(bounds.getUpperBound());
    }
}
