package j;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* loaded from: classes.dex */
public abstract class Y {

    /* renamed from: a, reason: collision with root package name */
    public long[] f775a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f776b;

    /* renamed from: c, reason: collision with root package name */
    public long[] f777c;

    /* renamed from: d, reason: collision with root package name */
    public int f778d;

    /* renamed from: e, reason: collision with root package name */
    public int f779e;

    public final int a(Object obj) {
        int i2 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = iHashCode ^ (iHashCode << 16);
        int i4 = i3 & WorkQueueKt.MASK;
        int i5 = this.f778d;
        int i6 = i3 >>> 7;
        while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.f775a;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j2 = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j3 = (i4 * 72340172838076673L) ^ j2;
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.f776b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j2 & ((~j2) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
    }

    public final long b(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return this.f777c[iA];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 1
            if (r1 != r0) goto L8
            return r2
        L8:
            boolean r3 = r1 instanceof j.Y
            r4 = 0
            if (r3 != 0) goto Le
            return r4
        Le:
            j.Y r1 = (j.Y) r1
            int r3 = r1.f779e
            int r5 = r0.f779e
            if (r3 == r5) goto L17
            return r4
        L17:
            java.lang.Object[] r3 = r0.f776b
            long[] r5 = r0.f777c
            long[] r6 = r0.f775a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L63
            r8 = r4
        L23:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L5e
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3d:
            if (r13 >= r11) goto L5c
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L58
            int r14 = r8 << 3
            int r14 = r14 + r13
            r15 = r3[r14]
            r16 = r5[r14]
            long r14 = r1.b(r15)
            int r14 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r14 == 0) goto L58
            return r4
        L58:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3d
        L5c:
            if (r11 != r12) goto L63
        L5e:
            if (r8 == r7) goto L63
            int r8 = r8 + 1
            goto L23
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j.Y.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        Object[] objArr = this.f776b;
        long[] jArr = this.f777c;
        long[] jArr2 = this.f775a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i2 = 0;
        int iHashCode = 0;
        while (true) {
            long j2 = jArr2[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = objArr[i5];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Long.hashCode(jArr[i5]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return iHashCode;
                }
            }
            if (i2 == length) {
                return iHashCode;
            }
            i2++;
        }
    }

    public final String toString() {
        int i2;
        int i3;
        if (this.f779e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        Object[] objArr = this.f776b;
        long[] jArr = this.f777c;
        long[] jArr2 = this.f775a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i4 = 0;
            int i5 = 0;
            while (true) {
                long j2 = jArr2[i4];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((255 & j2) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = objArr[i8];
                            i3 = i4;
                            long j3 = jArr[i8];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append("=");
                            sb.append(j3);
                            i5++;
                            if (i5 < this.f779e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j2 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i9 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i9;
                } else {
                    i2 = i4;
                }
                if (i2 == length) {
                    break;
                }
                i4 = i2 + 1;
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "s.append('}').toString()");
        return string;
    }
}
