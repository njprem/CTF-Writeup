package c;

import androidx.lifecycle.InterfaceC0587u;
import b.AbstractC0621x;
import b.C0593F;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0626c extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f668a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0593F f669b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0587u f670c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractC0621x f671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0626c(C0593F c0593f, InterfaceC0587u interfaceC0587u, AbstractC0621x abstractC0621x, int i2) {
        super(1);
        this.f668a = i2;
        this.f669b = c0593f;
        this.f670c = interfaceC0587u;
        this.f671d = abstractC0621x;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f668a) {
            case 0:
                C0593F c0593f = this.f669b;
                InterfaceC0587u interfaceC0587u = this.f670c;
                e eVar = (e) this.f671d;
                c0593f.a(interfaceC0587u, eVar);
                return new C0625b(eVar, 0);
            default:
                C0593F c0593f2 = this.f669b;
                InterfaceC0587u interfaceC0587u2 = this.f670c;
                l lVar = (l) this.f671d;
                c0593f2.a(interfaceC0587u2, lVar);
                return new C0625b(lVar, 1);
        }
    }
}
