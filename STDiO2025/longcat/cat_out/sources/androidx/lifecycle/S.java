package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class S implements Q {

    /* renamed from: a, reason: collision with root package name */
    public static S f572a;

    @Override // androidx.lifecycle.Q
    public O a(Class modelClass) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object objNewInstance = modelClass.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(objNewInstance);
            return (O) objNewInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e4);
        }
    }
}
