package v;

import j.C0635A;
import j.h0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final C0635A f1021a = new C0635A(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f1022b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1023c;

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f1024d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new m());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f1022b = threadPoolExecutor;
        f1023c = new Object();
        f1024d = new h0(0);
    }

    public static String a(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((e) list.get(i2)).f1013e);
            sb.append("-0");
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b8, code lost:
    
        throw r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v.h b(java.lang.String r8, android.content.Context r9, java.util.List r10) {
        /*
            r0 = 1
            j.A r1 = v.i.f1021a
            java.lang.String r2 = "getFontSync"
            a.AbstractC0131b.d(r2)
            java.lang.Object r2 = r1.a(r8)     // Catch: java.lang.Throwable -> Lb4
            android.graphics.Typeface r2 = (android.graphics.Typeface) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L19
            v.h r8 = new v.h     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L19:
            v.j r10 = v.d.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Laa java.lang.Throwable -> Lb4
            int r2 = r10.f1025a     // Catch: java.lang.Throwable -> Lb4
            r3 = 0
            java.util.List r10 = r10.f1026b
            r4 = -3
            if (r2 == 0) goto L2b
            if (r2 == r0) goto L29
        L27:
            r2 = r4
            goto L4b
        L29:
            r2 = -2
            goto L4b
        L2b:
            java.lang.Object r2 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb4
            v.k[] r2 = (v.k[]) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L4a
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb4
            if (r5 != 0) goto L37
            goto L4a
        L37:
            int r5 = r2.length     // Catch: java.lang.Throwable -> Lb4
            r6 = r3
        L39:
            if (r6 >= r5) goto L48
            r7 = r2[r6]     // Catch: java.lang.Throwable -> Lb4
            int r7 = r7.f1031e     // Catch: java.lang.Throwable -> Lb4
            if (r7 == 0) goto L46
            if (r7 >= 0) goto L44
            goto L27
        L44:
            r2 = r7
            goto L4b
        L46:
            int r6 = r6 + r0
            goto L39
        L48:
            r2 = r3
            goto L4b
        L4a:
            r2 = r0
        L4b:
            if (r2 == 0) goto L56
            v.h r8 = new v.h     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r2)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L56:
            int r2 = r10.size()     // Catch: java.lang.Throwable -> Lb4
            if (r2 <= r0) goto L78
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lb4
            r2 = 29
            if (r0 < r2) goto L78
            a.a r0 = s.AbstractC0795e.f980a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "TypefaceCompat.createFromFontInfoWithFallback"
            a.AbstractC0131b.d(r0)     // Catch: java.lang.Throwable -> Lb4
            a.a r0 = s.AbstractC0795e.f980a     // Catch: java.lang.Throwable -> L73
            android.graphics.Typeface r9 = r0.g(r9, r10)     // Catch: java.lang.Throwable -> L73
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            goto L8e
        L73:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            throw r8     // Catch: java.lang.Throwable -> Lb4
        L78:
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> Lb4
            v.k[] r10 = (v.k[]) r10     // Catch: java.lang.Throwable -> Lb4
            a.a r0 = s.AbstractC0795e.f980a     // Catch: java.lang.Throwable -> Lb4
            java.lang.String r0 = "TypefaceCompat.createFromFontInfo"
            a.AbstractC0131b.d(r0)     // Catch: java.lang.Throwable -> Lb4
            a.a r0 = s.AbstractC0795e.f980a     // Catch: java.lang.Throwable -> La5
            android.graphics.Typeface r9 = r0.f(r9, r10)     // Catch: java.lang.Throwable -> La5
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
        L8e:
            if (r9 == 0) goto L9c
            r1.b(r8, r9)     // Catch: java.lang.Throwable -> Lb4
            v.h r8 = new v.h     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        L9c:
            v.h r8 = new v.h     // Catch: java.lang.Throwable -> Lb4
            r8.<init>(r4)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        La5:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lb4
            throw r8     // Catch: java.lang.Throwable -> Lb4
        Laa:
            v.h r8 = new v.h     // Catch: java.lang.Throwable -> Lb4
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lb4
            android.os.Trace.endSection()
            return r8
        Lb4:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v.i.b(java.lang.String, android.content.Context, java.util.List):v.h");
    }
}
