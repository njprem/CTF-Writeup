package v;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1016a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f1017b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f1018c;

    public g(String str, Context context, List list) {
        this.f1016a = str;
        this.f1017b = context;
        this.f1018c = list;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        try {
            return i.b(this.f1016a, this.f1017b, this.f1018c);
        } catch (Throwable unused) {
            return new h(-3);
        }
    }
}
