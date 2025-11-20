package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import stdio.cat.MainActivity;

/* loaded from: classes.dex */
public final class L implements Q {

    /* renamed from: a, reason: collision with root package name */
    public final Application f561a;

    /* renamed from: b, reason: collision with root package name */
    public final P f562b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f563c;

    /* renamed from: d, reason: collision with root package name */
    public final AbstractC0583p f564d;

    /* renamed from: e, reason: collision with root package name */
    public final K.e f565e;

    public L(Application application, MainActivity owner, Bundle bundle) {
        P p2;
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f565e = owner.getSavedStateRegistry();
        this.f564d = owner.getLifecycle();
        this.f563c = bundle;
        this.f561a = application;
        if (application != null) {
            Intrinsics.checkNotNullParameter(application, "application");
            if (P.f569c == null) {
                Intrinsics.checkNotNullParameter(application, "application");
                P.f569c = new P(application);
            }
            p2 = P.f569c;
            Intrinsics.checkNotNull(p2);
        } else {
            p2 = new P(null);
        }
        this.f562b = p2;
    }

    @Override // androidx.lifecycle.Q
    public final O a(Class modelClass) throws Exception {
        F f2;
        O oB;
        AutoCloseable autoCloseable;
        Application application;
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String key = modelClass.getCanonicalName();
        if (key == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        AbstractC0583p lifecycle = this.f564d;
        if (lifecycle == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = AbstractC0568a.class.isAssignableFrom(modelClass);
        Constructor constructorA = (!zIsAssignableFrom || this.f561a == null) ? M.a(modelClass, M.f567b) : M.a(modelClass, M.f566a);
        if (constructorA == null) {
            if (this.f561a != null) {
                return this.f562b.a(modelClass);
            }
            if (S.f572a == null) {
                S.f572a = new S();
            }
            S s2 = S.f572a;
            Intrinsics.checkNotNull(s2);
            return s2.a(modelClass);
        }
        K.e registry = this.f565e;
        Intrinsics.checkNotNull(registry);
        Bundle source = this.f563c;
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNull(key);
        Bundle bundleA = registry.a(key);
        if (bundleA != null) {
            source = bundleA;
        }
        if (source == null) {
            f2 = new F();
        } else {
            ClassLoader classLoader = F.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            source.setClassLoader(classLoader);
            Intrinsics.checkNotNullParameter(source, "source");
            Map mapCreateMapBuilder = MapsKt.createMapBuilder(source.size());
            for (String str : source.keySet()) {
                Intrinsics.checkNotNull(str);
                mapCreateMapBuilder.put(str, source.get(str));
            }
            f2 = new F(MapsKt.build(mapCreateMapBuilder));
        }
        G closeable = new G(key, f2);
        closeable.a(registry, lifecycle);
        EnumC0582o enumC0582o = ((w) lifecycle).f598c;
        if (enumC0582o == EnumC0582o.f587b || enumC0582o.a(EnumC0582o.f589d)) {
            registry.c();
        } else {
            lifecycle.a(new C0574g(registry, lifecycle));
        }
        if (!zIsAssignableFrom || (application = this.f561a) == null) {
            oB = M.b(modelClass, constructorA, f2);
        } else {
            Intrinsics.checkNotNull(application);
            oB = M.b(modelClass, constructorA, application, f2);
        }
        oB.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        I.a aVar = oB.f568a;
        if (aVar == null) {
            return oB;
        }
        Intrinsics.checkNotNullParameter("androidx.lifecycle.savedstate.vm.tag", "key");
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        if (aVar.f188d) {
            I.a.a(closeable);
            return oB;
        }
        synchronized (aVar.f185a) {
            autoCloseable = (AutoCloseable) aVar.f186b.put("androidx.lifecycle.savedstate.vm.tag", closeable);
        }
        I.a.a(autoCloseable);
        return oB;
    }
}
