package M;

import a.AbstractC0131b;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import stdio.cat.R;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: d, reason: collision with root package name */
    public static volatile a f252d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f253e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f256c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f255b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f254a = new HashMap();

    public a(Context context) {
        this.f256c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f252d == null) {
            synchronized (f253e) {
                try {
                    if (f252d == null) {
                        f252d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f252d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f256c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f255b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new c(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (AbstractC0131b.r()) {
            try {
                AbstractC0131b.d(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f254a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f256c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new c(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
