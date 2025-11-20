package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f605a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f606b = new HashMap();

    public static void a(Constructor constructor, InterfaceC0586t interfaceC0586t) {
        try {
            Object objNewInstance = constructor.newInstance(interfaceC0586t);
            Intrinsics.checkNotNull(objNewInstance);
            if (objNewInstance == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final String b(String className) {
        Intrinsics.checkNotNullParameter(className, "className");
        return StringsKt__StringsJVMKt.replace$default(className, ".", "_", false, 4, (Object) null) + "_LifecycleAdapter";
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.x.c(java.lang.Class):int");
    }
}
