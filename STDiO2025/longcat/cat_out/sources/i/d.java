package i;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f724a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f725b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0634a f726c;

    public d(C0634a c0634a) {
        this.f726c = c0634a;
    }

    @Override // i.e
    public final void a(c cVar) {
        c cVar2 = this.f724a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f723d;
            this.f724a = cVar3;
            this.f725b = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f725b) {
            return this.f726c.f712a != null;
        }
        c cVar = this.f724a;
        return (cVar == null || cVar.f722c == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f725b) {
            this.f725b = false;
            this.f724a = this.f726c.f712a;
        } else {
            c cVar = this.f724a;
            this.f724a = cVar != null ? cVar.f722c : null;
        }
        return this.f724a;
    }
}
