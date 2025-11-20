package b;

import a.AbstractC0130a;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.InterfaceC0587u;
import kotlin.jvm.internal.Intrinsics;
import stdio.cat.R;

/* renamed from: b.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractDialogC0613p extends Dialog implements InterfaceC0587u, InterfaceC0595H, K.h {
    private androidx.lifecycle.w _lifecycleRegistry;
    private final C0593F onBackPressedDispatcher;
    private final K.g savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC0613p(ContextThemeWrapper context) {
        super(context, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(this, "owner");
        this.savedStateRegistryController = new K.g(new L.b(this, new K.f(this, 0)));
        this.onBackPressedDispatcher = new C0593F(new B.x(this, 7));
    }

    public static void a(AbstractDialogC0613p abstractDialogC0613p) {
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.lifecycle.InterfaceC0587u
    public AbstractC0583p getLifecycle() {
        androidx.lifecycle.w wVar = this._lifecycleRegistry;
        if (wVar != null) {
            return wVar;
        }
        androidx.lifecycle.w wVar2 = new androidx.lifecycle.w(this);
        this._lifecycleRegistry = wVar2;
        return wVar2;
    }

    @Override // b.InterfaceC0595H
    public final C0593F getOnBackPressedDispatcher() {
        return this.onBackPressedDispatcher;
    }

    @Override // K.h
    public K.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f241b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        Intrinsics.checkNotNull(window);
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window!!.decorView");
        androidx.lifecycle.I.e(decorView, this);
        Window window2 = getWindow();
        Intrinsics.checkNotNull(window2);
        View decorView2 = window2.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window!!.decorView");
        Intrinsics.checkNotNullParameter(decorView2, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        Intrinsics.checkNotNull(window3);
        View decorView3 = window3.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window!!.decorView");
        AbstractC0130a.m(decorView3, this);
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        this.onBackPressedDispatcher.c();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0593F c0593f = this.onBackPressedDispatcher;
            OnBackInvokedDispatcher invoker = getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(invoker, "onBackInvokedDispatcher");
            c0593f.getClass();
            Intrinsics.checkNotNullParameter(invoker, "invoker");
            c0593f.f624e = invoker;
            c0593f.d(c0593f.f626g);
        }
        this.savedStateRegistryController.a(bundle);
        androidx.lifecycle.w wVar = this._lifecycleRegistry;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this._lifecycleRegistry = wVar;
        }
        wVar.e(EnumC0581n.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        Intrinsics.checkNotNullExpressionValue(bundleOnSaveInstanceState, "super.onSaveInstanceState()");
        this.savedStateRegistryController.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        androidx.lifecycle.w wVar = this._lifecycleRegistry;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this._lifecycleRegistry = wVar;
        }
        wVar.e(EnumC0581n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        androidx.lifecycle.w wVar = this._lifecycleRegistry;
        if (wVar == null) {
            wVar = new androidx.lifecycle.w(this);
            this._lifecycleRegistry = wVar;
        }
        wVar.e(EnumC0581n.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(view, "view");
        initializeViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }
}
