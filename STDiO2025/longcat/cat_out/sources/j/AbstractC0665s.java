package j;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0665s {

    /* renamed from: a, reason: collision with root package name */
    public long[] f862a;

    /* renamed from: b, reason: collision with root package name */
    public long[] f863b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f864c;

    /* renamed from: d, reason: collision with root package name */
    public int f865d;

    /* renamed from: e, reason: collision with root package name */
    public int f866e;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0067, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0069, code lost:
    
        r13 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r3 = java.lang.Long.hashCode(r1)
            r4 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r3 = r3 * r4
            int r4 = r3 << 16
            r3 = r3 ^ r4
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r5 = r0.f865d
            int r3 = r3 >>> 7
            r3 = r3 & r5
            r6 = 0
        L17:
            long[] r7 = r0.f862a
            int r8 = r3 >> 3
            r9 = r3 & 7
            int r9 = r9 << 3
            r10 = r7[r8]
            long r10 = r10 >>> r9
            int r8 = r8 + 1
            r12 = r7[r8]
            int r7 = 64 - r9
            long r7 = r12 << r7
            long r12 = (long) r9
            long r12 = -r12
            r9 = 63
            long r12 = r12 >> r9
            long r7 = r7 & r12
            long r7 = r7 | r10
            long r9 = (long) r4
            r11 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r9 = r9 * r11
            long r9 = r9 ^ r7
            long r11 = r9 - r11
            long r9 = ~r9
            long r9 = r9 & r11
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
        L43:
            r13 = 0
            int r15 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r15 == 0) goto L60
            int r13 = java.lang.Long.numberOfTrailingZeros(r9)
            int r13 = r13 >> 3
            int r13 = r13 + r3
            r13 = r13 & r5
            long[] r14 = r0.f863b
            r15 = r14[r13]
            int r14 = (r15 > r1 ? 1 : (r15 == r1 ? 0 : -1))
            if (r14 != 0) goto L5a
            goto L6a
        L5a:
            r13 = 1
            long r13 = r9 - r13
            long r9 = r9 & r13
            goto L43
        L60:
            long r9 = ~r7
            r15 = 6
            long r9 = r9 << r15
            long r7 = r7 & r9
            long r7 = r7 & r11
            int r7 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r7 == 0) goto L85
            r13 = -1
        L6a:
            if (r13 < 0) goto L71
            int[] r1 = r0.f864c
            r1 = r1[r13]
            return r1
        L71:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Cannot find value for key "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
        L85:
            int r6 = r6 + 8
            int r3 = r3 + r6
            r3 = r3 & r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: j.AbstractC0665s.a(long):int");
    }

    public final boolean equals(Object obj) {
        boolean z;
        long[] jArr;
        boolean z2;
        long[] jArr2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0665s)) {
            return false;
        }
        AbstractC0665s abstractC0665s = (AbstractC0665s) obj;
        if (abstractC0665s.f866e != this.f866e) {
            return false;
        }
        long[] jArr3 = this.f863b;
        int[] iArr = this.f864c;
        long[] jArr4 = this.f862a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return true;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr4[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        z2 = z3;
                        jArr2 = jArr3;
                        if (iArr[i5] != abstractC0665s.a(jArr2[i5])) {
                            return false;
                        }
                    } else {
                        z2 = z3;
                        jArr2 = jArr3;
                    }
                    j2 >>= 8;
                    i4++;
                    z3 = z2;
                    jArr3 = jArr2;
                }
                z = z3;
                jArr = jArr3;
                if (i3 != 8) {
                    return z;
                }
            } else {
                z = z3;
                jArr = jArr3;
            }
            if (i2 == length) {
                return z;
            }
            i2++;
            z3 = z;
            jArr3 = jArr;
        }
    }

    public final int hashCode() {
        long[] jArr = this.f863b;
        int[] iArr = this.f864c;
        long[] jArr2 = this.f862a;
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
                        long j3 = jArr[i5];
                        iHashCode += Integer.hashCode(iArr[i5]) ^ Long.hashCode(j3);
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
        if (this.f866e == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        long[] jArr = this.f863b;
        int[] iArr = this.f864c;
        long[] jArr2 = this.f862a;
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
                            i3 = i4;
                            long j3 = jArr[i8];
                            int i9 = iArr[i8];
                            sb.append(j3);
                            sb.append("=");
                            sb.append(i9);
                            i5++;
                            if (i5 < this.f866e) {
                                sb.append(", ");
                            }
                        } else {
                            i3 = i4;
                        }
                        j2 >>= 8;
                        i7++;
                        i4 = i3;
                    }
                    int i10 = i4;
                    if (i6 != 8) {
                        break;
                    }
                    i2 = i10;
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
