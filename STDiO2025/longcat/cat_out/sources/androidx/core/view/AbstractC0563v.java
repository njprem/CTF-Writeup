package androidx.core.view;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: androidx.core.view.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0563v {
    public static e0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        e0 e0VarB = e0.b(null, rootWindowInsets);
        b0 b0Var = e0VarB.f500a;
        b0Var.q(e0VarB);
        b0Var.d(view.getRootView());
        return e0VarB;
    }
}
