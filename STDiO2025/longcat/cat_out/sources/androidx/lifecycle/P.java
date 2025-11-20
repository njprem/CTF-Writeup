package androidx.lifecycle;

import B.C0127d;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class P extends S {

    /* renamed from: c, reason: collision with root package name */
    public static P f569c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0127d f570d = new C0127d(14);

    /* renamed from: b, reason: collision with root package name */
    public final Application f571b;

    public P(Application application) {
        this.f571b = application;
    }

    @Override // androidx.lifecycle.S, androidx.lifecycle.Q
    public final O a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f571b;
        if (application == null) {
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }
        if (!AbstractC0568a.class.isAssignableFrom(modelClass)) {
            return super.a(modelClass);
        }
        try {
            O o2 = (O) modelClass.getConstructor(Application.class).newInstance(application);
            Intrinsics.checkNotNull(o2);
            return o2;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e5);
        }
    }
}
