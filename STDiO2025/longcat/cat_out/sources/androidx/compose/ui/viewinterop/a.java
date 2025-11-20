package androidx.compose.ui.viewinterop;

import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f420a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function0 f421b;

    public /* synthetic */ a(int i2, Function0 function0) {
        this.f420a = i2;
        this.f421b = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f420a) {
            case 0:
                this.f421b.invoke();
                break;
            default:
                this.f421b.invoke();
                break;
        }
    }
}
