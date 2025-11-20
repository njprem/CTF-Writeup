package j;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class W extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f771a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W(Object obj, int i2) {
        super(1);
        this.f771a = i2;
        this.f772b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f771a) {
            case 0:
                if (obj != ((X) this.f772b)) {
                    break;
                }
                break;
            default:
                if (obj != ((f0) this.f772b)) {
                    break;
                }
                break;
        }
        return String.valueOf(obj);
    }
}
