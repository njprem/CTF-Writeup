package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0644J extends T {

    /* renamed from: f, reason: collision with root package name */
    public int f739f;

    public C0644J() {
        this.f760a = d0.f809a;
        this.f761b = AbstractC0673a.f888c;
        this.f762c = AbstractC0657j.f841a;
        d(d0.d(6));
    }

    public final void b() {
        this.f764e = 0;
        long[] jArr = this.f760a;
        if (jArr != d0.f809a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f760a;
            int i2 = this.f763d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt___ArraysJvmKt.fill(this.f761b, (Object) null, 0, this.f763d);
        this.f739f = d0.a(this.f763d) - this.f764e;
    }

    public final int c(int i2) {
        int i3 = this.f763d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f760a;
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

    public final void d(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f763d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f760a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f739f = d0.a(this.f763d) - this.f764e;
        this.f761b = new Object[iMax];
        this.f762c = new float[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0077, code lost:
    
        r20 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0082, code lost:
    
        if (((((~r9) << 6) & r9) & (-9187201950435737472L)) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0084, code lost:
    
        r2 = c(r5);
        r8 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008c, code lost:
    
        if (r29.f739f != 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009e, code lost:
    
        if (((r29.f760a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a0, code lost:
    
        r23 = 255;
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r29.f763d <= 8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (java.lang.Long.compare(androidx.compose.runtime.changelist.a.e(r29.f764e, 32) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(r29.f763d, 25) ^ Long.MIN_VALUE) > 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        r2 = r29.f760a;
        r3 = r29.f763d;
        r4 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ce, code lost:
    
        if (r4 >= r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d0, code lost:
    
        r7 = r4 >> 3;
        r10 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dc, code lost:
    
        if (((r2[r7] >> r10) & r8) != 254) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00de, code lost:
    
        r13 = r29.f760a;
        r23 = r8;
        r13[r7] = (r13[r7] & (~(r23 << r10))) | (128 << r10);
        r7 = r29.f763d;
        r8 = ((r4 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r14 = r2;
        r13[r7] = ((~(r23 << r8)) & r13[r7]) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x010c, code lost:
    
        r14 = r2;
        r23 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x010f, code lost:
    
        r4 = r4 + 1;
        r2 = r14;
        r8 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0117, code lost:
    
        r23 = r8;
        r29.f739f += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0120, code lost:
    
        r23 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0123, code lost:
    
        r21 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0126, code lost:
    
        r1 = j.d0.b(r29.f763d);
        r2 = r29.f760a;
        r3 = r29.f761b;
        r4 = r29.f762c;
        r6 = r29.f763d;
        d(r1);
        r1 = r29.f761b;
        r7 = r29.f762c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x013c, code lost:
    
        if (r8 >= r6) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x014b, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= r21) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        r9 = r3[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x014f, code lost:
    
        if (r9 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0151, code lost:
    
        r10 = r9.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0156, code lost:
    
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0157, code lost:
    
        r10 = r10 * r20;
        r10 = r10 ^ (r10 << 16);
        r13 = c(r10 >>> 7);
        r17 = r1;
        r14 = r2;
        r1 = r10 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        r10 = r29.f760a;
        r18 = r13 >> 3;
        r19 = (r13 & 7) << 3;
        r10[r18] = (r10[r18] & (~(255 << r19))) | (r1 << r19);
        r1 = r29.f763d;
        r2 = ((r13 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r10[r1] = (r10[r1] & (~(255 << r2))) | (r1 << r2);
        r17[r13] = r9;
        r7[r13] = r4[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01a5, code lost:
    
        r17 = r1;
        r14 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01a8, code lost:
    
        r8 = r8 + 1;
        r2 = r14;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01ae, code lost:
    
        r2 = c(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b2, code lost:
    
        r29.f764e++;
        r1 = r29.f739f;
        r3 = r29.f760a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01ca, code lost:
    
        if (((r5 >> r7) & r23) != r21) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01cc, code lost:
    
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cf, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d0, code lost:
    
        r29.f739f = r1 - r15;
        r3[r4] = (r5 & (~(r23 << r7))) | (r11 << r7);
        r1 = r29.f763d;
        r4 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r1] = (r3[r1] & (~(r23 << r4))) | (r11 << r4);
        r1 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(java.lang.Object r30, float r31) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0644J.e(java.lang.Object, float):void");
    }
}
