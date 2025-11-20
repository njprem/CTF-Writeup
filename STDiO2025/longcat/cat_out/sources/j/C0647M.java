package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.M, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0647M extends Y {

    /* renamed from: f, reason: collision with root package name */
    public int f741f;

    public C0647M(int i2) {
        this.f775a = d0.f809a;
        this.f776b = AbstractC0673a.f888c;
        this.f777c = AbstractC0670x.f878a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        d(d0.d(i2));
    }

    public final int c(int i2) {
        int i3 = this.f778d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f775a;
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
        this.f778d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f775a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f741f = d0.a(this.f778d) - this.f779e;
        this.f776b = new Object[iMax];
        this.f777c = new long[iMax];
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        r21 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x007d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007f, code lost:
    
        r2 = c(r4);
        r11 = 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0087, code lost:
    
        if (r28.f741f != 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        if (((r28.f775a[r2 >> 3] >> ((r2 & 7) << 3)) & 255) != 254) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
    
        r22 = 255;
        r20 = 1;
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r28.f778d <= 8) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00c5, code lost:
    
        if (java.lang.Long.compare(androidx.compose.runtime.changelist.a.e(r28.f779e, 32) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(r28.f778d, 25) ^ Long.MIN_VALUE) > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c7, code lost:
    
        r2 = r28.f775a;
        r3 = r28.f778d;
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cd, code lost:
    
        if (r5 >= r3) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        r7 = r5 >> 3;
        r8 = (r5 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        if (((r2[r7] >> r8) & r11) != 254) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00df, code lost:
    
        r13 = r28.f775a;
        r22 = r11;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r7 = r28.f778d;
        r8 = ((r5 - 7) & r7) + (r7 & 7);
        r7 = r8 >> 3;
        r8 = (r8 & 7) << 3;
        r20 = r14;
        r13[r7] = (r13[r7] & (~(r22 << r8))) | (128 << r8);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x010e, code lost:
    
        r22 = r11;
        r20 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0112, code lost:
    
        r5 = r5 + 1;
        r14 = r20;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0119, code lost:
    
        r22 = r11;
        r20 = r14;
        r28.f741f += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
    
        r22 = 255;
        r20 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0129, code lost:
    
        r16 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x012c, code lost:
    
        r2 = j.d0.b(r28.f778d);
        r3 = r28.f775a;
        r5 = r28.f776b;
        r6 = r28.f777c;
        r7 = r28.f778d;
        d(r2);
        r2 = r28.f776b;
        r8 = r28.f777c;
        r11 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0142, code lost:
    
        if (r11 >= r7) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0151, code lost:
    
        if (((r3[r11 >> 3] >> ((r11 & 7) << 3)) & 255) >= r16) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0153, code lost:
    
        r12 = r5[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0155, code lost:
    
        if (r12 == null) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0157, code lost:
    
        r13 = r12.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x015c, code lost:
    
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x015d, code lost:
    
        r13 = r13 * r21;
        r13 = r13 ^ (r13 << 16);
        r14 = c(r13 >>> 7);
        r15 = r2;
        r1 = r13 & kotlinx.coroutines.scheduling.WorkQueueKt.MASK;
        r13 = r28.f775a;
        r18 = r14 >> 3;
        r19 = (r14 & 7) << 3;
        r13[r18] = (r13[r18] & (~(255 << r19))) | (r1 << r19);
        r1 = r28.f778d;
        r2 = ((r14 - 7) & r1) + (r1 & 7);
        r1 = r2 >> 3;
        r2 = (r2 & 7) << 3;
        r13[r1] = (r13[r1] & (~(255 << r2))) | (r1 << r2);
        r15[r14] = r12;
        r8[r14] = r6[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a9, code lost:
    
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01aa, code lost:
    
        r11 = r11 + 1;
        r2 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b0, code lost:
    
        r2 = c(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b4, code lost:
    
        r28.f779e++;
        r1 = r28.f741f;
        r3 = r28.f775a;
        r4 = r2 >> 3;
        r5 = r3[r4];
        r7 = (r2 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01cc, code lost:
    
        if (((r5 >> r7) & r22) != r16) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cf, code lost:
    
        r20 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01d1, code lost:
    
        r28.f741f = r1 - r20;
        r3[r4] = (r5 & (~(r22 << r7))) | (r9 << r7);
        r1 = r28.f778d;
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
    public final void e(long r29, java.lang.Object r31) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j.C0647M.e(long, java.lang.Object):void");
    }
}
