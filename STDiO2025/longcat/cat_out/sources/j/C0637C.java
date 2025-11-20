package j;

import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0637C extends AbstractC0658k {

    /* renamed from: f, reason: collision with root package name */
    public int f733f;

    public C0637C() {
        this.f842a = d0.f809a;
        int[] iArr = r.f861a;
        this.f843b = iArr;
        this.f844c = iArr;
        f(d0.d(6));
    }

    public final void d() {
        this.f846e = 0;
        long[] jArr = this.f842a;
        if (jArr != d0.f809a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f842a;
            int i2 = this.f845d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        this.f733f = d0.a(this.f845d) - this.f846e;
    }

    public final int e(int i2) {
        int i3 = this.f845d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f842a;
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

    public final void f(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f845d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f842a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f733f = d0.a(this.f845d) - this.f846e;
        this.f843b = new int[iMax];
        this.f844c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0079, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007b, code lost:
    
        r2 = e(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0083, code lost:
    
        if (r28.f733f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0097, code lost:
    
        if (((r28.f842a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0099, code lost:
    
        r22 = 255;
        r20 = 1;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a3, code lost:
    
        if (r28.f845d <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a5, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c1, code lost:
    
        if (java.lang.Long.compare(androidx.compose.runtime.changelist.a.e(r28.f846e, 32) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(r28.f845d, 25) ^ Long.MIN_VALUE) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c3, code lost:
    
        r2 = r28.f842a;
        r3 = r28.f845d;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c9, code lost:
    
        if (r5 >= r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cb, code lost:
    
        r7 = r5 >> 3;
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d9, code lost:
    
        if (((r2[r7] >> r8) & r11) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00db, code lost:
    
        r13 = r28.f842a;
        r22 = r11;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r7 = r28.f845d;
        r8 = ((r5 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r20 = r14;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010a, code lost:
    
        r22 = r11;
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x010e, code lost:
    
        r5 = r5 + 1;
        r14 = r20;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0115, code lost:
    
        r22 = r11;
        r20 = r14;
        r28.f733f += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0120, code lost:
    
        r22 = 255;
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0125, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0128, code lost:
    
        r2 = j.d0.b(r28.f845d);
        r3 = r28.f842a;
        r5 = r28.f843b;
        r6 = r28.f844c;
        r7 = r28.f845d;
        f(r2);
        r2 = r28.f843b;
        r8 = r28.f844c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x013e, code lost:
    
        if (r11 >= r7) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x014d, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x014f, code lost:
    
        r12 = r5[r11];
        r13 = java.lang.Integer.hashCode(r12) * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = e(r13 >>> 7);
        r15 = r2;
        r1 = r13 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        r13 = r28.f842a;
        r18 = r14 >> 3;
        r19 = (r14 & 7) << 3;
        r13[r18] = (r13[r18] & (~(255 << r19))) | (r1 << r19);
        r1 = r28.f845d;
        r2 = ((r14 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r13[r1] = (r13[r1] & (~(255 << r2))) | (r1 << r2);
        r15[r14] = r12;
        r8[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01a1, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01a2, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a8, code lost:
    
        r2 = e(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01ac, code lost:
    
        r28.f846e++;
        r1 = r28.f733f;
        r3 = r28.f842a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c4, code lost:
    
        if (((r5 >> r7) & r22) != r16) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c7, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c9, code lost:
    
        r28.f733f = r1 - r20;
        r3[r4] = (r5 & (~(r22 << r7))) | (r9 << r7);
        r1 = r28.f845d;
        r4 = ((r2 - 7) & r1) + (r1 & 7);
        r1 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r1] = (r3[r1] & (~(r22 << r4))) | (r9 << r4);
        r13 = ~r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r29, int r30) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0637C.g(int, int):void");
    }
}
