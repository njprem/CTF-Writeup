package j;

import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641G extends AbstractC0665s {

    /* renamed from: f, reason: collision with root package name */
    public int f736f;

    public C0641G(int i2) {
        this.f862a = d0.f809a;
        this.f863b = AbstractC0670x.f878a;
        this.f864c = r.f861a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        c(d0.d(i2));
    }

    public final int b(int i2) {
        int i3 = this.f865d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f862a;
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

    public final void c(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f865d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f862a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f736f = d0.a(this.f865d) - this.f866e;
        this.f863b = new long[iMax];
        this.f864c = new int[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0078, code lost:
    
        if (((((~r8) << 6) & r8) & (-9187201950435737472L)) == 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007a, code lost:
    
        r1 = b(r3);
        r7 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0082, code lost:
    
        if (r29.f736f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0094, code lost:
    
        if (((r29.f862a[r1 >> 3] >> ((r1 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0096, code lost:
    
        r22 = 255;
        r15 = 1;
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x009f, code lost:
    
        if (r29.f865d <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bd, code lost:
    
        if (java.lang.Long.compare(androidx.compose.runtime.changelist.a.e(r29.f866e, 32) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(r29.f865d, 25) ^ Long.MIN_VALUE) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bf, code lost:
    
        r1 = r29.f862a;
        r2 = r29.f865d;
        r4 = 0;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c5, code lost:
    
        if (r4 >= r2) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        r6 = r4 >> 3;
        r9 = (r4 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00d3, code lost:
    
        if (((r1[r6] >> r9) & r7) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        r14 = r29.f862a;
        r22 = r7;
        r14[r6] = (r14[r6] & (~(r22 << r9))) | (128 << r9);
        r6 = r29.f865d;
        r7 = ((r4 - 7) & r6) + (r6 & 7);
        r6 = r7 >> 3;
        r7 = (r7 & 7) << 3;
        r15 = r13;
        r14[r6] = (r14[r6] & (~(r22 << r7))) | (128 << r7);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0104, code lost:
    
        r22 = r7;
        r15 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        r4 = r4 + 1;
        r13 = r15;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010d, code lost:
    
        r22 = r7;
        r15 = r13;
        r29.f736f += r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0117, code lost:
    
        r22 = 255;
        r15 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x011b, code lost:
    
        r20 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x011e, code lost:
    
        r1 = j.d0.b(r29.f865d);
        r2 = r29.f862a;
        r4 = r29.f863b;
        r5 = r29.f864c;
        r6 = r29.f865d;
        c(r1);
        r1 = r29.f863b;
        r7 = r29.f864c;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0134, code lost:
    
        if (r8 >= r6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0143, code lost:
    
        if (((r2[r8 >> 3] >> ((r8 & 7) << 3)) & 255) >= r20) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0145, code lost:
    
        r12 = r4[r8];
        r9 = java.lang.Long.hashCode(r12) * r19;
        r9 = r9 ^ (r9 << 16);
        r14 = b(r9 >>> 7);
        r17 = r1;
        r16 = r2;
        r1 = r9 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        r9 = r29.f862a;
        r18 = r14 >> 3;
        r24 = (r14 & 7) << 3;
        r9[r18] = (r9[r18] & (~(255 << r24))) | (r1 << r24);
        r1 = r29.f865d;
        r2 = ((r14 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r9[r1] = (r9[r1] & (~(255 << r2))) | (r1 << r2);
        r17[r14] = r12;
        r7[r14] = r5[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x019a, code lost:
    
        r17 = r1;
        r16 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x019e, code lost:
    
        r8 = r8 + 1;
        r2 = r16;
        r1 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a5, code lost:
    
        r1 = b(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01a9, code lost:
    
        r29.f866e += r15;
        r2 = r29.f736f;
        r3 = r29.f862a;
        r4 = r1 >> 3;
        r5 = r3[r4];
        r7 = (r1 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01c0, code lost:
    
        if (((r5 >> r7) & r22) != r20) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c3, code lost:
    
        r15 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01c4, code lost:
    
        r29.f736f = r2 - r15;
        r3[r4] = (r5 & (~(r22 << r7))) | (r10 << r7);
        r2 = r29.f865d;
        r4 = ((r1 - 7) & r2) + (r2 & 7);
        r2 = r4 >> 3;
        r4 = (r4 & 7) << 3;
        r3[r2] = (r3[r2] & (~(r22 << r4))) | (r10 << r4);
        r1 = ~r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r30, int r32) {
        /*
            Method dump skipped, instructions count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0641G.d(long, int):void");
    }
}
