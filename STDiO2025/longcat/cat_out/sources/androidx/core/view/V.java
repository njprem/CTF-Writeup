package androidx.core.view;

import a.AbstractC0131b;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;
import s.C0793c;

/* loaded from: classes.dex */
public abstract class V extends b0 {

    /* renamed from: i, reason: collision with root package name */
    public static boolean f479i = false;

    /* renamed from: j, reason: collision with root package name */
    public static Method f480j;

    /* renamed from: k, reason: collision with root package name */
    public static Class f481k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f482l;
    public static Field m;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f483c;

    /* renamed from: d, reason: collision with root package name */
    public C0793c[] f484d;

    /* renamed from: e, reason: collision with root package name */
    public C0793c f485e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f486f;

    /* renamed from: g, reason: collision with root package name */
    public C0793c f487g;

    /* renamed from: h, reason: collision with root package name */
    public int f488h;

    public V(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var);
        this.f485e = null;
        this.f483c = windowInsets;
    }

    public static boolean A(int i2, int i3) {
        return (i2 & 6) == (i3 & 6);
    }

    private C0793c t(int i2, boolean z) {
        C0793c c0793cA = C0793c.f974e;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                c0793cA = C0793c.a(c0793cA, u(i3, z));
            }
        }
        return c0793cA;
    }

    private C0793c v() {
        e0 e0Var = this.f486f;
        return e0Var != null ? e0Var.f500a.i() : C0793c.f974e;
    }

    private C0793c w(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f479i) {
            y();
        }
        Method method = f480j;
        if (method != null && f481k != null && f482l != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f482l.get(m.get(objInvoke));
                if (rect != null) {
                    return C0793c.b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void y() throws ClassNotFoundException, SecurityException {
        try {
            f480j = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f481k = cls;
            f482l = cls.getDeclaredField("mVisibleInsets");
            m = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f482l.setAccessible(true);
            m.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        f479i = true;
    }

    @Override // androidx.core.view.b0
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        C0793c c0793cW = w(view);
        if (c0793cW == null) {
            c0793cW = C0793c.f974e;
        }
        z(c0793cW);
    }

    @Override // androidx.core.view.b0
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        V v2 = (V) obj;
        return Objects.equals(this.f487g, v2.f487g) && A(this.f488h, v2.f488h);
    }

    @Override // androidx.core.view.b0
    public C0793c f(int i2) {
        return t(i2, false);
    }

    @Override // androidx.core.view.b0
    public C0793c g(int i2) {
        return t(i2, true);
    }

    @Override // androidx.core.view.b0
    public final C0793c k() {
        if (this.f485e == null) {
            WindowInsets windowInsets = this.f483c;
            this.f485e = C0793c.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f485e;
    }

    @Override // androidx.core.view.b0
    public boolean n() {
        return this.f483c.isRound();
    }

    @Override // androidx.core.view.b0
    public boolean o(int i2) {
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i2 & i3) != 0 && !x(i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.core.view.b0
    public void p(C0793c[] c0793cArr) {
        this.f484d = c0793cArr;
    }

    @Override // androidx.core.view.b0
    public void q(e0 e0Var) {
        this.f486f = e0Var;
    }

    @Override // androidx.core.view.b0
    public void s(int i2) {
        this.f488h = i2;
    }

    public C0793c u(int i2, boolean z) {
        C0793c c0793cI;
        int i3;
        C0793c c0793c = C0793c.f974e;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 8) {
                    C0793c[] c0793cArr = this.f484d;
                    c0793cI = c0793cArr != null ? c0793cArr[AbstractC0131b.q(8)] : null;
                    if (c0793cI != null) {
                        return c0793cI;
                    }
                    C0793c c0793cK = k();
                    C0793c c0793cV = v();
                    int i4 = c0793cK.f978d;
                    if (i4 > c0793cV.f978d) {
                        return C0793c.b(0, 0, 0, i4);
                    }
                    C0793c c0793c2 = this.f487g;
                    if (c0793c2 != null && !c0793c2.equals(c0793c) && (i3 = this.f487g.f978d) > c0793cV.f978d) {
                        return C0793c.b(0, 0, 0, i3);
                    }
                } else {
                    if (i2 == 16) {
                        return j();
                    }
                    if (i2 == 32) {
                        return h();
                    }
                    if (i2 == 64) {
                        return l();
                    }
                    if (i2 == 128) {
                        e0 e0Var = this.f486f;
                        C0547e c0547eE = e0Var != null ? e0Var.f500a.e() : e();
                        if (c0547eE != null) {
                            int i5 = Build.VERSION.SDK_INT;
                            return C0793c.b(i5 >= 28 ? AbstractC0545c.e(c0547eE.f498a) : 0, i5 >= 28 ? AbstractC0545c.g(c0547eE.f498a) : 0, i5 >= 28 ? AbstractC0545c.f(c0547eE.f498a) : 0, i5 >= 28 ? AbstractC0545c.d(c0547eE.f498a) : 0);
                        }
                    }
                }
            } else {
                if (z) {
                    C0793c c0793cV2 = v();
                    C0793c c0793cI2 = i();
                    return C0793c.b(Math.max(c0793cV2.f975a, c0793cI2.f975a), 0, Math.max(c0793cV2.f977c, c0793cI2.f977c), Math.max(c0793cV2.f978d, c0793cI2.f978d));
                }
                if ((this.f488h & 2) == 0) {
                    C0793c c0793cK2 = k();
                    e0 e0Var2 = this.f486f;
                    c0793cI = e0Var2 != null ? e0Var2.f500a.i() : null;
                    int iMin = c0793cK2.f978d;
                    if (c0793cI != null) {
                        iMin = Math.min(iMin, c0793cI.f978d);
                    }
                    return C0793c.b(c0793cK2.f975a, 0, c0793cK2.f977c, iMin);
                }
            }
        } else {
            if (z) {
                return C0793c.b(0, Math.max(v().f976b, k().f976b), 0, 0);
            }
            if ((this.f488h & 4) == 0) {
                return C0793c.b(0, k().f976b, 0, 0);
            }
        }
        return c0793c;
    }

    public boolean x(int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 8 && i2 != 128) {
                return true;
            }
        }
        return !u(i2, false).equals(C0793c.f974e);
    }

    public void z(C0793c c0793c) {
        this.f487g = c0793c;
    }
}
