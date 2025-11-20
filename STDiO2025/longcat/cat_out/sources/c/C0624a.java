package c;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0624a extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f664a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f665b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0624a(e eVar, boolean z) {
        super(0);
        this.f664a = eVar;
        this.f665b = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e eVar = this.f664a;
        eVar.f657a = this.f665b;
        ?? r0 = eVar.f659c;
        if (r0 != 0) {
            r0.invoke();
        }
        return Unit.INSTANCE;
    }
}
