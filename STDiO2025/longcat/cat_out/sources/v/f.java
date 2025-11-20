package v;

import B.s;
import j.h0;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements w.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1015b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f1014a = i2;
        this.f1015b = obj;
    }

    @Override // w.a
    public final void a(Object obj) {
        switch (this.f1014a) {
            case 0:
                h hVar = (h) obj;
                if (hVar == null) {
                    hVar = new h(-3);
                }
                ((s) this.f1015b).b(hVar);
                return;
            default:
                h hVar2 = (h) obj;
                synchronized (i.f1023c) {
                    try {
                        h0 h0Var = i.f1024d;
                        ArrayList arrayList = (ArrayList) h0Var.get((String) this.f1015b);
                        if (arrayList == null) {
                            return;
                        }
                        h0Var.remove((String) this.f1015b);
                        for (int i2 = 0; i2 < arrayList.size(); i2++) {
                            ((w.a) arrayList.get(i2)).a(hVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
