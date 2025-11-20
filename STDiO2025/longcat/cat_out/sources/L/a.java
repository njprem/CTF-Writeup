package L;

import androidx.core.view.C0551i;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements InterfaceC0585s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f243b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f242a = i2;
        this.f243b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n event) {
        switch (this.f242a) {
            case 0:
                Intrinsics.checkNotNullParameter(interfaceC0587u, "<unused var>");
                Intrinsics.checkNotNullParameter(event, "event");
                EnumC0581n enumC0581n = EnumC0581n.ON_START;
                b bVar = (b) this.f243b;
                if (event != enumC0581n) {
                    if (event == EnumC0581n.ON_STOP) {
                        bVar.f251h = false;
                        break;
                    }
                } else {
                    bVar.f251h = true;
                    break;
                }
                break;
            default:
                C0551i c0551i = (C0551i) this.f243b;
                c0551i.getClass();
                if (event == EnumC0581n.ON_DESTROY) {
                    c0551i.a();
                    break;
                }
                break;
        }
    }
}
