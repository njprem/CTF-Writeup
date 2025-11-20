package b;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: b.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0594G extends AbstractC0621x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Lambda f627d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0594G(Function1 function1) {
        super(true);
        this.f627d = (Lambda) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // b.AbstractC0621x
    public final void b() {
        this.f627d.invoke(this);
    }
}
