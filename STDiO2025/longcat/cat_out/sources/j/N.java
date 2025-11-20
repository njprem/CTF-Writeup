package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes.dex */
public final class N extends c0 {

    /* renamed from: f, reason: collision with root package name */
    public int f742f;

    public N(int i2) {
        this.f800a = d0.f809a;
        Object[] objArr = AbstractC0673a.f888c;
        this.f801b = objArr;
        this.f802c = objArr;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        g(d0.d(i2));
    }

    public final void d() {
        this.f804e = 0;
        long[] jArr = this.f800a;
        if (jArr != d0.f809a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f800a;
            int i2 = this.f803d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt___ArraysJvmKt.fill(this.f802c, (Object) null, 0, this.f803d);
        ArraysKt___ArraysJvmKt.fill(this.f801b, (Object) null, 0, this.f803d);
        this.f742f = d0.a(this.f803d) - this.f804e;
    }

    public final int e(int i2) {
        int i3 = this.f803d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f800a;
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.N.f(java.lang.Object):int");
    }

    public final void g(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f803d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f800a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f742f = d0.a(this.f803d) - this.f804e;
        this.f801b = new Object[iMax];
        this.f802c = new Object[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0069, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.Object r14) {
        /*
            r13 = this;
            r0 = 0
            if (r14 == 0) goto L8
            int r1 = r14.hashCode()
            goto L9
        L8:
            r1 = r0
        L9:
            r2 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r1 = r1 * r2
            int r2 = r1 << 16
            r1 = r1 ^ r2
            r2 = r1 & 127(0x7f, float:1.78E-43)
            int r3 = r13.f803d
            int r1 = r1 >>> 7
        L16:
            r1 = r1 & r3
            long[] r4 = r13.f800a
            int r5 = r1 >> 3
            r6 = r1 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r2
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L43:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L62
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r1
            r10 = r10 & r3
            java.lang.Object[] r11 = r13.f801b
            r11 = r11[r10]
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r11, r14)
            if (r11 == 0) goto L5c
            goto L6c
        L5c:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L43
        L62:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L75
            r10 = -1
        L6c:
            if (r10 < 0) goto L73
            java.lang.Object r14 = r13.i(r10)
            return r14
        L73:
            r14 = 0
            return r14
        L75:
            int r0 = r0 + 8
            int r1 = r1 + r0
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: j.N.h(java.lang.Object):java.lang.Object");
    }

    public final Object i(int i2) {
        this.f804e--;
        long[] jArr = this.f800a;
        int i3 = i2 >> 3;
        int i4 = (i2 & 7) << 3;
        jArr[i3] = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        int i5 = this.f803d;
        int i6 = ((i2 - 7) & i5) + (i5 & 7);
        int i7 = i6 >> 3;
        int i8 = (i6 & 7) << 3;
        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (254 << i8);
        this.f801b[i2] = null;
        Object[] objArr = this.f802c;
        Object obj = objArr[i2];
        objArr[i2] = null;
        return obj;
    }

    public final void j(int i2) {
        int i3;
        long[] jArr = this.f800a;
        Object[] objArr = this.f801b;
        Object[] objArr2 = this.f802c;
        int i4 = this.f803d;
        g(i2);
        Object[] objArr3 = this.f801b;
        Object[] objArr4 = this.f802c;
        int i5 = 0;
        while (i5 < i4) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i6 = iHashCode ^ (iHashCode << 16);
                int iE = e(i6 >>> 7);
                long j2 = i6 & WorkQueueKt.MASK;
                long[] jArr2 = this.f800a;
                int i7 = iE >> 3;
                int i8 = (iE & 7) << 3;
                i3 = i5;
                jArr2[i7] = (jArr2[i7] & (~(255 << i8))) | (j2 << i8);
                int i9 = this.f803d;
                int i10 = ((iE - 7) & i9) + (i9 & 7);
                int i11 = i10 >> 3;
                int i12 = (i10 & 7) << 3;
                jArr2[i11] = (jArr2[i11] & (~(255 << i12))) | (j2 << i12);
                objArr3[iE] = obj;
                objArr4[iE] = objArr2[i3];
            } else {
                i3 = i5;
            }
            i5 = i3 + 1;
        }
    }

    public final void k(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            iF = ~iF;
        }
        this.f801b[iF] = obj;
        this.f802c[iF] = obj2;
    }

    public /* synthetic */ N() {
        this(6);
    }
}
