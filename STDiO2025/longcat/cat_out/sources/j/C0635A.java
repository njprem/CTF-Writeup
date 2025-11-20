package j;

import B.C0127d;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0635A {

    /* renamed from: a, reason: collision with root package name */
    public final int f727a;

    /* renamed from: b, reason: collision with root package name */
    public final B.p f728b;

    /* renamed from: c, reason: collision with root package name */
    public final C0127d f729c;

    /* renamed from: d, reason: collision with root package name */
    public int f730d;

    /* renamed from: e, reason: collision with root package name */
    public int f731e;

    /* renamed from: f, reason: collision with root package name */
    public int f732f;

    public C0635A(int i2) {
        this.f727a = i2;
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        B.p pVar = new B.p();
        pVar.f115a = new LinkedHashMap(0, 0.75f, true);
        this.f728b = pVar;
        this.f729c = new C0127d(17);
    }

    public final Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f729c) {
            B.p pVar = this.f728b;
            pVar.getClass();
            Intrinsics.checkNotNullParameter(key, "key");
            Object obj = ((LinkedHashMap) pVar.f115a).get(key);
            if (obj != null) {
                this.f731e++;
                return obj;
            }
            this.f732f++;
            Intrinsics.checkNotNullParameter(key, "key");
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d7, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r6, java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0635A.b(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public final String toString() {
        String str;
        synchronized (this.f729c) {
            try {
                int i2 = this.f731e;
                int i3 = this.f732f + i2;
                str = "LruCache[maxSize=" + this.f727a + ",hits=" + this.f731e + ",misses=" + this.f732f + ",hitRate=" + (i3 != 0 ? (i2 * 100) / i3 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
