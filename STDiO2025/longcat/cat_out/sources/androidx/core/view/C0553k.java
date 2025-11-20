package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0553k {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f512a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f513b;

    /* renamed from: c, reason: collision with root package name */
    public final View f514c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f515d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f516e;

    public C0553k(View view) {
        this.f514c = view;
    }

    public final ViewParent a(int i2) {
        if (i2 == 0) {
            return this.f512a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f513b;
    }

    public final boolean b(int i2, int i3) {
        boolean zOnStartNestedScroll;
        if (!(a(i3) != null)) {
            if (this.f515d) {
                View view = this.f514c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof InterfaceC0554l;
                    if (z) {
                        zOnStartNestedScroll = ((InterfaceC0554l) parent).onStartNestedScroll(view2, view, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i2);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i3 == 0) {
                            this.f512a = parent;
                        } else if (i3 == 1) {
                            this.f513b = parent;
                        }
                        if (z) {
                            ((InterfaceC0554l) parent).onNestedScrollAccepted(view2, view, i2, i3);
                        } else if (i3 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i2);
                            } catch (AbstractMethodError e3) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void c(int i2) {
        ViewParent viewParentA = a(i2);
        if (viewParentA != null) {
            boolean z = viewParentA instanceof InterfaceC0554l;
            View view = this.f514c;
            if (z) {
                ((InterfaceC0554l) viewParentA).onStopNestedScroll(view, i2);
            } else if (i2 == 0) {
                try {
                    viewParentA.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentA + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                this.f512a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.f513b = null;
            }
        }
    }
}
