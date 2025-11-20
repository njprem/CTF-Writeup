package androidx.core.view;

import b.RunnableC0601d;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0551i {

    /* renamed from: a, reason: collision with root package name */
    public final RunnableC0601d f509a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f510b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f511c = new HashMap();

    public C0551i(RunnableC0601d runnableC0601d) {
        this.f509a = runnableC0601d;
    }

    public final void a() {
        this.f510b.remove((Object) null);
        C0550h c0550h = (C0550h) this.f511c.remove(null);
        if (c0550h != null) {
            c0550h.f505a.b(c0550h.f506b);
            c0550h.f506b = null;
        }
        this.f509a.run();
    }
}
