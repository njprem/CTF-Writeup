package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0571d {

    /* renamed from: c, reason: collision with root package name */
    public static final C0571d f578c = new C0571d();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f579a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f580b = new HashMap();

    public static void b(HashMap map, C0570c c0570c, EnumC0581n enumC0581n, Class cls) {
        EnumC0581n enumC0581n2 = (EnumC0581n) map.get(c0570c);
        if (enumC0581n2 == null || enumC0581n == enumC0581n2) {
            if (enumC0581n2 == null) {
                map.put(c0570c, enumC0581n);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0570c.f577b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0581n2 + ", new value " + enumC0581n);
    }

    public final C0569b a(Class cls, Method[] methodArr) throws SecurityException {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f579a;
        if (superclass != null) {
            C0569b c0569bA = (C0569b) map2.get(superclass);
            if (c0569bA == null) {
                c0569bA = a(superclass, null);
            }
            map.putAll(c0569bA.f575b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0569b c0569bA2 = (C0569b) map2.get(cls2);
            if (c0569bA2 == null) {
                c0569bA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0569bA2.f575b.entrySet()) {
                b(map, (C0570c) entry.getKey(), (EnumC0581n) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!InterfaceC0587u.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0581n enumC0581nValue = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0581n.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0581nValue != EnumC0581n.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0570c(i2, method), enumC0581nValue, cls);
                z = true;
            }
        }
        C0569b c0569b = new C0569b(map);
        map2.put(cls, c0569b);
        this.f580b.put(cls, Boolean.valueOf(z));
        return c0569b;
    }
}
