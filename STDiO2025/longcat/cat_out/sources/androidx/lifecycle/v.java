package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public EnumC0582o f594a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0585s f595b;

    public final void a(InterfaceC0587u interfaceC0587u, EnumC0581n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        EnumC0582o enumC0582oA = event.a();
        EnumC0582o state1 = this.f594a;
        Intrinsics.checkNotNullParameter(state1, "state1");
        if (enumC0582oA.compareTo(state1) < 0) {
            state1 = enumC0582oA;
        }
        this.f594a = state1;
        Intrinsics.checkNotNull(interfaceC0587u);
        this.f595b.onStateChanged(interfaceC0587u, event);
        this.f594a = enumC0582oA;
    }
}
