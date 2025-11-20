package b;

import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0591D implements InterfaceC0600c {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0621x f617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0593F f618b;

    public C0591D(C0593F c0593f, AbstractC0621x onBackPressedCallback) {
        Intrinsics.checkNotNullParameter(onBackPressedCallback, "onBackPressedCallback");
        this.f618b = c0593f;
        this.f617a = onBackPressedCallback;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // b.InterfaceC0600c
    public final void cancel() {
        C0593F c0593f = this.f618b;
        ArrayDeque arrayDeque = c0593f.f621b;
        AbstractC0621x abstractC0621x = this.f617a;
        arrayDeque.remove(abstractC0621x);
        if (Intrinsics.areEqual(c0593f.f622c, abstractC0621x)) {
            abstractC0621x.a();
            c0593f.f622c = null;
        }
        abstractC0621x.getClass();
        Intrinsics.checkNotNullParameter(this, "cancellable");
        abstractC0621x.f658b.remove(this);
        ?? r0 = abstractC0621x.f659c;
        if (r0 != 0) {
            r0.invoke();
        }
        abstractC0621x.f659c = null;
    }
}
