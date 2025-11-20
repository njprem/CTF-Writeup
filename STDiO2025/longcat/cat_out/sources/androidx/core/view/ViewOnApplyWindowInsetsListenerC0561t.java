package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.view.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0561t implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public e0 f525a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f526b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0556n f527c;

    public ViewOnApplyWindowInsetsListenerC0561t(View view, InterfaceC0556n interfaceC0556n) {
        this.f526b = view;
        this.f527c = interfaceC0556n;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        e0 e0VarB = e0.b(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        InterfaceC0556n interfaceC0556n = this.f527c;
        if (i2 < 30) {
            AbstractC0562u.a(windowInsets, this.f526b);
            if (e0VarB.equals(this.f525a)) {
                return interfaceC0556n.onApplyWindowInsets(view, e0VarB).a();
            }
        }
        this.f525a = e0VarB;
        e0 e0VarOnApplyWindowInsets = interfaceC0556n.onApplyWindowInsets(view, e0VarB);
        if (i2 >= 30) {
            return e0VarOnApplyWindowInsets.a();
        }
        int i3 = AbstractC0567z.f532a;
        AbstractC0560s.a(view);
        return e0VarOnApplyWindowInsets.a();
    }
}
