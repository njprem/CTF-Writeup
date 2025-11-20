package h;

import a.AbstractC0130a;
import java.util.concurrent.Executors;

/* renamed from: h.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0632a extends AbstractC0130a {

    /* renamed from: b, reason: collision with root package name */
    public static volatile C0632a f709b;

    /* renamed from: a, reason: collision with root package name */
    public final Object f710a;

    public C0632a(int i2) {
        switch (i2) {
            case 1:
                this.f710a = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0633b());
                break;
            default:
                this.f710a = new C0632a(1);
                break;
        }
    }
}
