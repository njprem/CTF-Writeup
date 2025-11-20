package s;

import a.AbstractC0131b;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import v.k;

/* loaded from: classes.dex */
public class h extends C0796f {

    /* renamed from: f, reason: collision with root package name */
    public final Class f991f;

    /* renamed from: g, reason: collision with root package name */
    public final Constructor f992g;

    /* renamed from: h, reason: collision with root package name */
    public final Method f993h;

    /* renamed from: i, reason: collision with root package name */
    public final Method f994i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f995j;

    /* renamed from: k, reason: collision with root package name */
    public final Method f996k;

    /* renamed from: l, reason: collision with root package name */
    public final Method f997l;

    public h() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method methodY;
        Constructor<?> constructor;
        Method methodX;
        Method method;
        Method method2;
        Method method3;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            methodX = x(cls2);
            Class cls3 = Integer.TYPE;
            method = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method2 = cls2.getMethod("freeze", null);
            method3 = cls2.getMethod("abortCreation", null);
            methodY = y(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            methodY = null;
            constructor = null;
            methodX = null;
            method = null;
            method2 = null;
            method3 = null;
        }
        this.f991f = cls;
        this.f992g = constructor;
        this.f993h = methodX;
        this.f994i = method;
        this.f995j = method2;
        this.f996k = method3;
        this.f997l = methodY;
    }

    public static Method x(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    @Override // s.C0796f, a.AbstractC0130a
    public final Typeface e(Context context, r.f fVar, Resources resources) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f993h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.e(context, fVar, resources);
        }
        Object objW = w();
        if (objW != null) {
            r.g[] gVarArr = fVar.f950a;
            int length = gVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                r.g gVar = gVarArr[i2];
                String str = gVar.f951a;
                FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(gVar.f954d);
                Context context2 = context;
                if (!t(context2, objW, str, gVar.f955e, gVar.f952b, gVar.f953c ? 1 : 0, fontVariationAxisArrFromFontVariationSettings)) {
                    s(objW);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (v(objW)) {
                return u(objW);
            }
        }
        return null;
    }

    @Override // s.C0796f, a.AbstractC0130a
    public final Typeface f(Context context, k[] kVarArr) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Typeface typefaceU;
        boolean zBooleanValue;
        if (kVarArr.length >= 1) {
            Method method = this.f993h;
            if (method == null) {
                Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
            }
            if (method != null) {
                HashMap map = new HashMap();
                for (k kVar : kVarArr) {
                    if (kVar.f1031e == 0) {
                        Uri uri = kVar.f1027a;
                        if (!map.containsKey(uri)) {
                            map.put(uri, AbstractC0131b.s(context, uri));
                        }
                    }
                }
                Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
                Object objW = w();
                if (objW != null) {
                    int length = kVarArr.length;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 < length) {
                        k kVar2 = kVarArr[i2];
                        ByteBuffer byteBuffer = (ByteBuffer) mapUnmodifiableMap.get(kVar2.f1027a);
                        if (byteBuffer != null) {
                            try {
                                zBooleanValue = ((Boolean) this.f994i.invoke(objW, byteBuffer, Integer.valueOf(kVar2.f1028b), null, Integer.valueOf(kVar2.f1029c), Integer.valueOf(kVar2.f1030d ? 1 : 0))).booleanValue();
                            } catch (IllegalAccessException | InvocationTargetException unused) {
                                zBooleanValue = false;
                            }
                            if (!zBooleanValue) {
                                s(objW);
                                return null;
                            }
                            z = true;
                        }
                        i2++;
                        z = z;
                    }
                    if (!z) {
                        s(objW);
                        return null;
                    }
                    if (v(objW) && (typefaceU = u(objW)) != null) {
                        return Typeface.create(typefaceU, 0);
                    }
                }
            } else {
                k kVarJ = j(kVarArr);
                try {
                    ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(kVarJ.f1027a, "r", null);
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        try {
                            Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(kVarJ.f1029c).setItalic(kVarJ.f1030d).build();
                            parcelFileDescriptorOpenFileDescriptor.close();
                            return typefaceBuild;
                        } finally {
                        }
                    }
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return null;
                    }
                } catch (IOException unused2) {
                }
            }
        }
        return null;
    }

    @Override // a.AbstractC0130a
    public final Typeface i(Context context, Resources resources, int i2, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = this.f993h;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        if (method == null) {
            return super.i(context, resources, i2, str);
        }
        Object objW = w();
        if (objW != null) {
            if (!t(context, objW, str, 0, -1, -1, null)) {
                s(objW);
                return null;
            }
            if (v(objW)) {
                return u(objW);
            }
        }
        return null;
    }

    public final void s(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.f996k.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean t(Context context, Object obj, String str, int i2, int i3, int i4, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f993h.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface u(Object obj) throws ArrayIndexOutOfBoundsException, IllegalArgumentException, NegativeArraySizeException {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f991f, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f997l.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean v(Object obj) {
        try {
            return ((Boolean) this.f995j.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final Object w() {
        try {
            return this.f992g.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public Method y(Class cls) throws NoSuchMethodException, SecurityException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
