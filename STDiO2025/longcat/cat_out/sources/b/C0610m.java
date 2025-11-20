package b;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.core.view.C0549g;
import androidx.lifecycle.L;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import stdio.cat.MainActivity;

/* renamed from: b.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0610m extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MainActivity f648b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0610m(MainActivity mainActivity, int i2) {
        super(0);
        this.f647a = i2;
        this.f648b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f647a) {
            case 0:
                MainActivity mainActivity = this.f648b;
                return new L(mainActivity.getApplication(), mainActivity, mainActivity.getIntent() != null ? mainActivity.getIntent().getExtras() : null);
            case 1:
                this.f648b.reportFullyDrawn();
                return Unit.INSTANCE;
            case 2:
                MainActivity mainActivity2 = this.f648b;
                return new C0620w(((AbstractActivityC0612o) mainActivity2).reportFullyDrawnExecutor, new C0610m(mainActivity2, 1));
            default:
                MainActivity mainActivity3 = this.f648b;
                C0593F c0593f = new C0593F(new RunnableC0601d(mainActivity3, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        mainActivity3.getLifecycle().a(new C0549g(1, c0593f, mainActivity3));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0611n(0, mainActivity3, c0593f));
                    }
                }
                return c0593f;
        }
    }
}
