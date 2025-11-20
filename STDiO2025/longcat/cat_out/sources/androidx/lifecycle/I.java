package androidx.lifecycle;

import B.C0127d;
import a.AbstractC0131b;
import android.view.View;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import stdio.cat.R;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public static final C0127d f552a = new C0127d(11);

    /* renamed from: b, reason: collision with root package name */
    public static final C0127d f553b = new C0127d(12);

    /* renamed from: c, reason: collision with root package name */
    public static final C0127d f554c = new C0127d(13);

    /* renamed from: d, reason: collision with root package name */
    public static final C0127d f555d = new C0127d(15);

    public static final void a(O viewModel, K.e registry, AbstractC0583p lifecycle) throws NoSuchMethodException, SecurityException {
        AutoCloseable autoCloseable;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        viewModel.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        I.a aVar = viewModel.f568a;
        if (aVar != null) {
            Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
            synchronized (aVar.f185a) {
                autoCloseable = (AutoCloseable) aVar.f186b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
        G g2 = (G) autoCloseable;
        if (g2 == null || g2.f551c) {
            return;
        }
        g2.a(registry, lifecycle);
        EnumC0582o enumC0582o = ((w) lifecycle).f598c;
        if (enumC0582o == EnumC0582o.f587b || enumC0582o.a(EnumC0582o.f589d)) {
            registry.c();
        } else {
            lifecycle.a(new C0574g(registry, lifecycle));
        }
    }

    public static final InterfaceC0587u b(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_lifecycle_owner);
            InterfaceC0587u interfaceC0587u = tag instanceof InterfaceC0587u ? (InterfaceC0587u) tag : null;
            if (interfaceC0587u != null) {
                return interfaceC0587u;
            }
            Object objN = AbstractC0131b.n(view);
            view = objN instanceof View ? (View) objN : null;
        }
        return null;
    }

    public static final U c(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_view_model_store_owner);
            U u2 = tag instanceof U ? (U) tag : null;
            if (u2 != null) {
                return u2;
            }
            Object objN = AbstractC0131b.n(view);
            view = objN instanceof View ? (View) objN : null;
        }
        return null;
    }

    public static final K d(U owner) {
        O o2;
        Intrinsics.checkNotNullParameter(owner, "<this>");
        H factory = new H();
        Intrinsics.checkNotNullParameter(owner, "owner");
        H.b defaultExtras = owner instanceof InterfaceC0577j ? ((InterfaceC0577j) owner).getDefaultViewModelCreationExtras() : H.a.f183b;
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "extras");
        T store = owner.getViewModelStore();
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultCreationExtras");
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(defaultExtras, "defaultExtras");
        C0127d c0127d = new C0127d(5);
        KClass modelClass = Reflection.getOrCreateKotlinClass(K.class);
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
        synchronized (c0127d) {
            try {
                store.getClass();
                Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
                o2 = (O) store.f573a.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (modelClass.isInstance(o2)) {
                    Intrinsics.checkNotNull(o2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
                } else {
                    H.c extras = new H.c(defaultExtras);
                    extras.a(f555d, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    Intrinsics.checkNotNullParameter(factory, "factory");
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    Intrinsics.checkNotNullParameter(extras, "extras");
                    try {
                        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                        Intrinsics.checkNotNullParameter(extras, "extras");
                        K viewModel = new K();
                        store.getClass();
                        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesVM", "key");
                        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
                        O o3 = (O) store.f573a.put("androidx.lifecycle.internal.SavedStateHandlesVM", viewModel);
                        if (o3 != null) {
                            o3.a();
                        }
                        o2 = viewModel;
                    } catch (AbstractMethodError unused) {
                        try {
                            Class modelClass2 = JvmClassMappingKt.getJavaClass(modelClass);
                            Intrinsics.checkNotNullParameter(modelClass2, "modelClass");
                            Intrinsics.checkNotNullParameter(extras, "extras");
                            factory.a(modelClass2);
                            throw null;
                        } catch (AbstractMethodError unused2) {
                            factory.a(JvmClassMappingKt.getJavaClass(modelClass));
                            throw null;
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return (K) o2;
    }

    public static final void e(View view, InterfaceC0587u interfaceC0587u) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0587u);
    }

    public static final void f(View view, U u2) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_view_model_store_owner, u2);
    }
}
