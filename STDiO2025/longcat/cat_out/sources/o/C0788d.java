package o;

import a.AbstractC0131b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: o.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0788d extends AbstractC0131b {

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f917e;

    /* renamed from: f, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f918f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f919g;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f920h;

    /* renamed from: i, reason: collision with root package name */
    public final AtomicReferenceFieldUpdater f921i;

    public C0788d(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        this.f917e = atomicReferenceFieldUpdater;
        this.f918f = atomicReferenceFieldUpdater2;
        this.f919g = atomicReferenceFieldUpdater3;
        this.f920h = atomicReferenceFieldUpdater4;
        this.f921i = atomicReferenceFieldUpdater5;
    }

    @Override // a.AbstractC0131b
    public final boolean e(g gVar, C0787c c0787c) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0787c c0787c2 = C0787c.f915b;
        do {
            atomicReferenceFieldUpdater = this.f920h;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, c0787c, c0787c2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == c0787c);
        return false;
    }

    @Override // a.AbstractC0131b
    public final boolean f(g gVar, Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f921i;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == obj);
        return false;
    }

    @Override // a.AbstractC0131b
    public final boolean g(g gVar, f fVar, f fVar2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f919g;
            if (atomicReferenceFieldUpdater.compareAndSet(gVar, fVar, fVar2)) {
                return true;
            }
        } while (atomicReferenceFieldUpdater.get(gVar) == fVar);
        return false;
    }

    @Override // a.AbstractC0131b
    public final void v(f fVar, f fVar2) {
        this.f918f.lazySet(fVar, fVar2);
    }

    @Override // a.AbstractC0131b
    public final void w(f fVar, Thread thread) {
        this.f917e.lazySet(fVar, thread);
    }
}
