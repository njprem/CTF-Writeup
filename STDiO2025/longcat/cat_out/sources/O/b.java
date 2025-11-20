package O;

import android.os.Parcel;
import android.os.Parcelable;
import j.C0653f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final C0653f f258a;

    /* renamed from: b, reason: collision with root package name */
    public final C0653f f259b;

    /* renamed from: c, reason: collision with root package name */
    public final C0653f f260c;

    public b(C0653f c0653f, C0653f c0653f2, C0653f c0653f3) {
        this.f258a = c0653f;
        this.f259b = c0653f2;
        this.f260c = c0653f3;
    }

    public abstract c a();

    public final Class b(Class cls) throws ClassNotFoundException {
        String name = cls.getName();
        C0653f c0653f = this.f260c;
        Class cls2 = (Class) c0653f.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c0653f.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method c(String str) throws NoSuchMethodException, SecurityException {
        C0653f c0653f = this.f258a;
        Method method = (Method) c0653f.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, b.class.getClassLoader()).getDeclaredMethod("read", b.class);
        c0653f.put(str, declaredMethod);
        return declaredMethod;
    }

    public final Method d(Class cls) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        String name = cls.getName();
        C0653f c0653f = this.f259b;
        Method method = (Method) c0653f.get(name);
        if (method != null) {
            return method;
        }
        Class clsB = b(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsB.getDeclaredMethod("write", cls, b.class);
        c0653f.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((c) this).f262e.readParcelable(c.class.getClassLoader());
    }

    public final d g() {
        String string = ((c) this).f262e.readString();
        if (string == null) {
            return null;
        }
        try {
            return (d) c(string).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void h(int i2);

    public final void i(d dVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (dVar == null) {
            ((c) this).f262e.writeString(null);
            return;
        }
        try {
            ((c) this).f262e.writeString(b(dVar.getClass()).getName());
            c cVarA = a();
            try {
                d(dVar.getClass()).invoke(null, dVar, cVarA);
                int i2 = cVarA.f266i;
                if (i2 >= 0) {
                    int i3 = cVarA.f261d.get(i2);
                    Parcel parcel = cVarA.f262e;
                    int iDataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i3);
                    parcel.writeInt(iDataPosition - i3);
                    parcel.setDataPosition(iDataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(dVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e6);
        }
    }
}
