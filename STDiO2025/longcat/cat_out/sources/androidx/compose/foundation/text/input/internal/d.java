package androidx.compose.foundation.text.input.internal;

import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f330a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IntConsumer f331b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f332c;

    public /* synthetic */ d(IntConsumer intConsumer, int i2, int i3) {
        this.f330a = i3;
        this.f331b = intConsumer;
        this.f332c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f330a) {
            case 0:
                this.f331b.accept(this.f332c);
                break;
            default:
                this.f331b.accept(this.f332c);
                break;
        }
    }
}
