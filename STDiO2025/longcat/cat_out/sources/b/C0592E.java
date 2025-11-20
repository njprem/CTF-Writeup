package b;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: b.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0592E extends FunctionReferenceImpl implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f619a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0592E(int i2, Object obj, Class cls, String str, String str2, int i3, int i4) {
        super(i2, obj, cls, str, str2, i3);
        this.f619a = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f619a) {
            case 0:
                ((C0593F) this.receiver).e();
                break;
            default:
                ((C0593F) this.receiver).e();
                break;
        }
        return Unit.INSTANCE;
    }
}
