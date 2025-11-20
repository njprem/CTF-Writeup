package androidx.core.view;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import s.C0793c;

/* loaded from: classes.dex */
public final class O extends U {

    /* renamed from: d, reason: collision with root package name */
    public static Field f471d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f472e = false;

    /* renamed from: f, reason: collision with root package name */
    public static Constructor f473f = null;

    /* renamed from: g, reason: collision with root package name */
    public static boolean f474g = false;

    /* renamed from: c, reason: collision with root package name */
    public WindowInsets f475c;

    public O() {
        this.f475c = h();
    }

    private static WindowInsets h() {
        if (!f472e) {
            try {
                f471d = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f472e = true;
        }
        Field field = f471d;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f474g) {
            try {
                f473f = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f474g = true;
        }
        Constructor constructor = f473f;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // androidx.core.view.U
    public e0 b() {
        a();
        e0 e0VarB = e0.b(null, this.f475c);
        C0793c[] c0793cArr = this.f478b;
        b0 b0Var = e0VarB.f500a;
        b0Var.p(c0793cArr);
        b0Var.r(null);
        return e0VarB;
    }

    @Override // androidx.core.view.U
    public void f(C0793c c0793c) {
        WindowInsets windowInsets = this.f475c;
        if (windowInsets != null) {
            this.f475c = windowInsets.replaceSystemWindowInsets(c0793c.f975a, c0793c.f976b, c0793c.f977c, c0793c.f978d);
        }
    }

    public O(e0 e0Var) {
        super(e0Var);
        this.f475c = e0Var.a();
    }
}
