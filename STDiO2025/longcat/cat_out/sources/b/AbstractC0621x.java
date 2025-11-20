package b;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: b.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0621x {

    /* renamed from: a, reason: collision with root package name */
    public boolean f657a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f658b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public FunctionReferenceImpl f659c;

    public AbstractC0621x(boolean z) {
        this.f657a = z;
    }

    public abstract void b();

    public void c(C0599b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void d(C0599b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void a() {
    }
}
