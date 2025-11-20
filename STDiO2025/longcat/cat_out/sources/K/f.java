package K;

import androidx.lifecycle.I;
import b.AbstractActivityC0612o;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f238a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f239b;

    public /* synthetic */ f(h hVar, int i2) {
        this.f238a = i2;
        this.f239b = hVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [K.h, androidx.lifecycle.u, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f238a) {
            case 0:
                ?? r0 = this.f239b;
                r0.getLifecycle().a(new b((h) r0));
                return Unit.INSTANCE;
            default:
                return I.d((AbstractActivityC0612o) this.f239b);
        }
    }
}
