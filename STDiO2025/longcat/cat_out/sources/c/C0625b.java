package c;

import androidx.compose.runtime.DisposableEffectResult;
import b.AbstractC0621x;
import b.InterfaceC0600c;
import java.util.Iterator;

/* renamed from: c.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0625b implements DisposableEffectResult {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f666a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0621x f667b;

    public /* synthetic */ C0625b(AbstractC0621x abstractC0621x, int i2) {
        this.f666a = i2;
        this.f667b = abstractC0621x;
    }

    @Override // androidx.compose.runtime.DisposableEffectResult
    public final void dispose() {
        switch (this.f666a) {
            case 0:
                Iterator it = ((e) this.f667b).f658b.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0600c) it.next()).cancel();
                }
                break;
            default:
                Iterator it2 = ((l) this.f667b).f658b.iterator();
                while (it2.hasNext()) {
                    ((InterfaceC0600c) it2.next()).cancel();
                }
                break;
        }
    }
}
