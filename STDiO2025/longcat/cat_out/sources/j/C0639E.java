package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* renamed from: j.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0639E extends AbstractC0662o {

    /* renamed from: f, reason: collision with root package name */
    public int f734f;

    public C0639E(int i2) {
        this.f851a = d0.f809a;
        this.f852b = r.f861a;
        this.f853c = AbstractC0673a.f888c;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        g(d0.d(i2));
    }

    public final void d() {
        this.f855e = 0;
        long[] jArr = this.f851a;
        if (jArr != d0.f809a) {
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
            long[] jArr2 = this.f851a;
            int i2 = this.f854d;
            int i3 = i2 >> 3;
            long j2 = 255 << ((i2 & 7) << 3);
            jArr2[i3] = (jArr2[i3] & (~j2)) | j2;
        }
        ArraysKt___ArraysJvmKt.fill(this.f853c, (Object) null, 0, this.f854d);
        this.f734f = d0.a(this.f854d) - this.f855e;
    }

    public final int e(int i2) {
        long j2;
        int i3;
        long j3;
        int[] iArr;
        long[] jArr;
        int i4;
        long j4;
        int i5 = -862048943;
        int iHashCode = Integer.hashCode(i2) * (-862048943);
        int i6 = iHashCode ^ (iHashCode << 16);
        int i7 = i6 >>> 7;
        int i8 = i6 & WorkQueueKt.MASK;
        int i9 = this.f854d;
        int i10 = i7 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr2 = this.f851a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            int i14 = 1;
            long j5 = ((jArr2[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr2[i12] >>> i13);
            long j6 = i8;
            int i15 = i11;
            long j7 = j5 ^ (j6 * 72340172838076673L);
            long j8 = (~j7) & (j7 - 72340172838076673L) & (-9187201950435737472L);
            while (j8 != 0) {
                int iNumberOfTrailingZeros = (i10 + (Long.numberOfTrailingZeros(j8) >> 3)) & i9;
                int i16 = i5;
                if (this.f852b[iNumberOfTrailingZeros] == i2) {
                    return iNumberOfTrailingZeros;
                }
                j8 &= j8 - 1;
                i5 = i16;
            }
            int i17 = i5;
            if ((((~j5) << 6) & j5 & (-9187201950435737472L)) != 0) {
                int iF = f(i7);
                long j9 = 255;
                if (this.f734f != 0 || ((this.f851a[iF >> 3] >> ((iF & 7) << 3)) & 255) == 254) {
                    j2 = 255;
                    i3 = 1;
                    j3 = 128;
                } else {
                    if (this.f854d > 8) {
                        j3 = 128;
                        if (Long.compare(androidx.compose.runtime.changelist.a.e(this.f855e, 32L) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(this.f854d, 25L) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr3 = this.f851a;
                            int i18 = this.f854d;
                            int i19 = 0;
                            int i20 = 0;
                            while (i19 < i18) {
                                int i21 = i19 >> 3;
                                int i22 = (i19 & 7) << 3;
                                if (((jArr3[i21] >> i22) & j9) == 254) {
                                    long[] jArr4 = this.f851a;
                                    j4 = j9;
                                    jArr4[i21] = ((~(j4 << i22)) & jArr4[i21]) | (128 << i22);
                                    int i23 = this.f854d;
                                    int i24 = ((i19 - 7) & i23) + (i23 & 7);
                                    int i25 = i24 >> 3;
                                    int i26 = (i24 & 7) << 3;
                                    jArr4[i25] = (jArr4[i25] & (~(j4 << i26))) | (128 << i26);
                                    i20++;
                                } else {
                                    j4 = j9;
                                }
                                i19++;
                                j9 = j4;
                            }
                            j2 = j9;
                            this.f734f += i20;
                        }
                        i3 = i14;
                        iF = f(i7);
                    } else {
                        j3 = 128;
                    }
                    j2 = 255;
                    int iB = d0.b(this.f854d);
                    long[] jArr5 = this.f851a;
                    int[] iArr2 = this.f852b;
                    Object[] objArr = this.f853c;
                    int i27 = this.f854d;
                    g(iB);
                    int[] iArr3 = this.f852b;
                    Object[] objArr2 = this.f853c;
                    int i28 = 0;
                    while (i28 < i27) {
                        if (((jArr5[i28 >> 3] >> ((i28 & 7) << 3)) & 255) < j3) {
                            int i29 = iArr2[i28];
                            int iHashCode2 = Integer.hashCode(i29) * i17;
                            int i30 = iHashCode2 ^ (iHashCode2 << 16);
                            int iF2 = f(i30 >>> 7);
                            i4 = i14;
                            long j10 = i30 & WorkQueueKt.MASK;
                            long[] jArr6 = this.f851a;
                            int i31 = iF2 >> 3;
                            int i32 = (iF2 & 7) << 3;
                            iArr = iArr3;
                            jArr = jArr5;
                            jArr6[i31] = (jArr6[i31] & (~(255 << i32))) | (j10 << i32);
                            int i33 = this.f854d;
                            int i34 = ((iF2 - 7) & i33) + (i33 & 7);
                            int i35 = i34 >> 3;
                            int i36 = (i34 & 7) << 3;
                            jArr6[i35] = (jArr6[i35] & (~(255 << i36))) | (j10 << i36);
                            iArr[iF2] = i29;
                            objArr2[iF2] = objArr[i28];
                        } else {
                            iArr = iArr3;
                            jArr = jArr5;
                            i4 = i14;
                        }
                        i28++;
                        i14 = i4;
                        jArr5 = jArr;
                        iArr3 = iArr;
                    }
                    i3 = i14;
                    iF = f(i7);
                }
                this.f855e += i3;
                int i37 = this.f734f;
                long[] jArr7 = this.f851a;
                int i38 = iF >> 3;
                long j11 = jArr7[i38];
                int i39 = (iF & 7) << 3;
                if (((j11 >> i39) & j2) != j3) {
                    i3 = 0;
                }
                this.f734f = i37 - i3;
                jArr7[i38] = (j11 & (~(j2 << i39))) | (j6 << i39);
                int i40 = this.f854d;
                int i41 = ((iF - 7) & i40) + (i40 & 7);
                int i42 = i41 >> 3;
                int i43 = (i41 & 7) << 3;
                jArr7[i42] = (jArr7[i42] & (~(j2 << i43))) | (j6 << i43);
                return iF;
            }
            i11 = i15 + 8;
            i10 = (i10 + i11) & i9;
            i5 = i17;
        }
    }

    public final int f(int i2) {
        int i3 = this.f854d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f851a;
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

    public final void g(int i2) {
        long[] jArr;
        int iMax = i2 > 0 ? Math.max(7, d0.c(i2)) : 0;
        this.f854d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f851a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f734f = d0.a(this.f854d) - this.f855e;
        this.f852b = new int[iMax];
        this.f853c = new Object[iMax];
    }

    public final void h(int i2, Object obj) {
        int iE = e(i2);
        this.f852b[iE] = i2;
        this.f853c[iE] = obj;
    }

    public /* synthetic */ C0639E() {
        this(6);
    }
}
