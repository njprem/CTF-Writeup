package i;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f717a;

    /* renamed from: b, reason: collision with root package name */
    public c f718b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f719c;

    public b(c cVar, c cVar2, int i2) {
        this.f719c = i2;
        this.f717a = cVar2;
        this.f718b = cVar;
    }

    @Override // i.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f717a == cVar && cVar == this.f718b) {
            this.f718b = null;
            this.f717a = null;
        }
        c cVar3 = this.f717a;
        if (cVar3 == cVar) {
            switch (this.f719c) {
                case 0:
                    cVar2 = cVar3.f723d;
                    break;
                default:
                    cVar2 = cVar3.f722c;
                    break;
            }
            this.f717a = cVar2;
        }
        c cVar4 = this.f718b;
        if (cVar4 == cVar) {
            c cVar5 = this.f717a;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f718b = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f719c) {
            case 0:
                return cVar.f722c;
            default:
                return cVar.f723d;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f718b != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f718b;
        c cVar2 = this.f717a;
        this.f718b = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
