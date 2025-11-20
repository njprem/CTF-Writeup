package o;

import a.AbstractC0131b;

/* loaded from: classes.dex */
public final class e extends AbstractC0131b {
    @Override // a.AbstractC0131b
    public final boolean e(g gVar, C0787c c0787c) {
        C0787c c0787c2 = C0787c.f915b;
        synchronized (gVar) {
            try {
                if (gVar.f930b != c0787c) {
                    return false;
                }
                gVar.f930b = c0787c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0131b
    public final boolean f(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f929a != obj) {
                    return false;
                }
                gVar.f929a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0131b
    public final boolean g(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f931c != fVar) {
                    return false;
                }
                gVar.f931c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0131b
    public final void v(f fVar, f fVar2) {
        fVar.f924b = fVar2;
    }

    @Override // a.AbstractC0131b
    public final void w(f fVar, Thread thread) {
        fVar.f923a = thread;
    }
}
