package androidx.lifecycle;

import java.util.Iterator;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class O {

    /* renamed from: a, reason: collision with root package name */
    public final I.a f568a = new I.a();

    public final void a() {
        I.a aVar = this.f568a;
        if (aVar == null || aVar.f188d) {
            return;
        }
        aVar.f188d = true;
        synchronized (aVar.f185a) {
            try {
                Iterator it = aVar.f186b.values().iterator();
                while (it.hasNext()) {
                    I.a.a((AutoCloseable) it.next());
                }
                Iterator it2 = aVar.f187c.iterator();
                while (it2.hasNext()) {
                    I.a.a((AutoCloseable) it2.next());
                }
                aVar.f187c.clear();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
