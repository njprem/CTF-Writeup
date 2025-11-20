package s;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import v.k;

/* renamed from: s.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0796f extends AbstractC0130a {

    /* renamed from: a, reason: collision with root package name */
    public static Class f982a = null;

    /* renamed from: b, reason: collision with root package name */
    public static Constructor f983b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Method f984c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f985d = null;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f986e = false;

    public static boolean q(Object obj, String str, int i2, boolean z) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        r();
        try {
            return ((Boolean) f984c.invoke(obj, str, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void r() throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f986e) {
            return;
        }
        f986e = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f983b = constructor;
        f982a = cls;
        f984c = method2;
        f985d = method;
    }

    @Override // a.AbstractC0130a
    public Typeface e(Context context, r.f fVar, Resources resources) throws IllegalAccessException, NoSuchMethodException, InstantiationException, ClassNotFoundException, SecurityException, ArrayIndexOutOfBoundsException, IllegalArgumentException, InvocationTargetException, NegativeArraySizeException {
        r();
        try {
            Object objNewInstance = f983b.newInstance(null);
            for (r.g gVar : fVar.f950a) {
                File fileP = AbstractC0131b.p(context);
                if (fileP == null) {
                    return null;
                }
                try {
                    if (!AbstractC0131b.j(fileP, resources, gVar.f956f)) {
                        return null;
                    }
                    if (!q(objNewInstance, fileP.getPath(), gVar.f952b, gVar.f953c)) {
                        return null;
                    }
                    fileP.delete();
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    fileP.delete();
                }
            }
            r();
            try {
                Object objNewInstance2 = Array.newInstance((Class<?>) f982a, 1);
                Array.set(objNewInstance2, 0, objNewInstance);
                return (Typeface) f985d.invoke(null, objNewInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // a.AbstractC0130a
    public Typeface f(Context context, k[] kVarArr) throws IOException {
        String str;
        if (kVarArr.length >= 1) {
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(j(kVarArr).f1027a, "r", null);
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                    try {
                        try {
                            str = Os.readlink("/proc/self/fd/" + parcelFileDescriptorOpenFileDescriptor.getFd());
                        } finally {
                        }
                    } catch (ErrnoException unused) {
                    }
                    File file = OsConstants.S_ISREG(Os.stat(str).st_mode) ? new File(str) : null;
                    if (file != null && file.canRead()) {
                        Typeface typefaceCreateFromFile = Typeface.createFromFile(file);
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceCreateFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        Typeface typefaceH = h(context, fileInputStream);
                        fileInputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        return typefaceH;
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
        return null;
    }
}
