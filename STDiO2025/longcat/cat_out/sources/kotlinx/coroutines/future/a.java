package kotlinx.coroutines.future;

import java.util.function.BiFunction;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BiFunction {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f908a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f909b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f908a = i2;
        this.f909b = obj;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.f908a) {
            case 0:
                return ((Function2) this.f909b).invoke(obj, (Throwable) obj2);
            default:
                return FutureKt.setupCancellation$lambda$2((Job) this.f909b, obj, (Throwable) obj2);
        }
    }
}
