package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: b.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0623z extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f662a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0593F f663b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0623z(C0593F c0593f, int i2) {
        super(0);
        this.f662a = i2;
        this.f663b = c0593f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f662a) {
            case 0:
                this.f663b.c();
                break;
            case 1:
                this.f663b.b();
                break;
            default:
                this.f663b.c();
                break;
        }
        return Unit.INSTANCE;
    }
}
