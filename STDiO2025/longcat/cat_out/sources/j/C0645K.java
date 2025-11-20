package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.K, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0645K extends U {

    /* renamed from: f, reason: collision with root package name */
    public int f740f;

    public C0645K(int i2) {
        this.f765a = d0.f809a;
        this.f766b = AbstractC0673a.f888c;
        this.f767c = r.f861a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        e(d0.d(i2));
    }

    public final int c(int i2) {
        int i3 = this.f768d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f765a;
            int i6 = i4 >> 3;
            int i7 = (i4 & 7) << 3;
            long j2 = ((jArr[i6 + 1] << (64 - i7)) & ((-i7) >> 63)) | (jArr[i6] >>> i7);
            long j3 = j2 & ((~j2) << 7) & (-9187201950435737472L);
            if (j3 != 0) {
                return (i4 + (Long.numberOfTrailingZeros(j3) >> 3)) & i3;
            }
            i5 += 8;
            i4 = (i4 + i5) & i3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int d(java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0645K.d(java.lang.Object):int");
    }

    public final void e(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f768d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f765a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f740f = d0.a(this.f768d) - this.f769e;
        this.f766b = new Object[iMax];
        this.f767c = new int[iMax];
    }

    public final void f(int i2) {
        this.f769e--;
        long[] jArr = this.f765a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f768d;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.f766b[i2] = null;
    }

    public final void g(int i2, Object obj) {
        int iD = d(obj);
        if (iD < 0) {
            iD = ~iD;
        }
        this.f766b[iD] = obj;
        this.f767c[iD] = i2;
    }

    public /* synthetic */ C0645K() {
        this(6);
    }
}
