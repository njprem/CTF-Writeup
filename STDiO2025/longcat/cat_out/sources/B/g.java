package B;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.os.Build;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class g extends AbstractC0131b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h f91e;

    public g(h hVar) {
        this.f91e = hVar;
    }

    @Override // a.AbstractC0131b
    public final void t(Throwable th) {
        this.f91e.f92a.e(th);
    }

    @Override // a.AbstractC0131b
    public final void u(B b2) {
        h hVar = this.f91e;
        hVar.f94c = b2;
        B b3 = hVar.f94c;
        l lVar = hVar.f92a;
        hVar.f93b = new w(b3, lVar.f106g, lVar.f108i, Build.VERSION.SDK_INT >= 34 ? r.a() : AbstractC0130a.l());
        l lVar2 = hVar.f92a;
        lVar2.getClass();
        ArrayList arrayList = new ArrayList();
        lVar2.f100a.writeLock().lock();
        try {
            lVar2.f102c = 1;
            arrayList.addAll(lVar2.f101b);
            lVar2.f101b.clear();
            lVar2.f100a.writeLock().unlock();
            lVar2.f103d.post(new j(arrayList, lVar2.f102c, null));
        } catch (Throwable th) {
            lVar2.f100a.writeLock().unlock();
            throw th;
        }
    }
}
