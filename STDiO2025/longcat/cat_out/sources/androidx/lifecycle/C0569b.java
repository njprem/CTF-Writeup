package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0569b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f574a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f575b;

    public C0569b(HashMap map) {
        this.f575b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0581n enumC0581n = (EnumC0581n) entry.getValue();
            List arrayList = (List) this.f574a.get(enumC0581n);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f574a.put(enumC0581n, arrayList);
            }
            arrayList.add((C0570c) entry.getKey());
        }
    }

    public static void a(List list, InterfaceC0587u interfaceC0587u, EnumC0581n enumC0581n, InterfaceC0586t interfaceC0586t) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0570c c0570c = (C0570c) list.get(size);
                c0570c.getClass();
                try {
                    int i2 = c0570c.f576a;
                    Method method = c0570c.f577b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0586t, null);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0586t, interfaceC0587u);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0586t, interfaceC0587u, enumC0581n);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
