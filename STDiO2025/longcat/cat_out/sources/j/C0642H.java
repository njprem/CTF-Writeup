package j;

import k.AbstractC0673a;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlinx.coroutines.scheduling.WorkQueueKt;

/* renamed from: j.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0642H extends AbstractC0667u {

    /* renamed from: f, reason: collision with root package name */
    public int f737f;

    public C0642H(int i2) {
        this.f868a = d0.f809a;
        this.f869b = AbstractC0670x.f878a;
        this.f870c = AbstractC0673a.f888c;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        f(d0.d(i2));
    }

    public final int d(long j2) {
        long j3;
        int i2;
        long j4;
        long[] jArr;
        long[] jArr2;
        long j5;
        int i3;
        int i4 = -862048943;
        int iHashCode = Long.hashCode(j2) * (-862048943);
        int i5 = iHashCode ^ (iHashCode << 16);
        int i6 = i5 >>> 7;
        int i7 = i5 & WorkQueueKt.MASK;
        int i8 = this.f871d;
        int i9 = i6 & i8;
        int i10 = 0;
        while (true) {
            long[] jArr3 = this.f868a;
            int i11 = i9 >> 3;
            int i12 = (i9 & 7) << 3;
            int i13 = 1;
            long j6 = ((jArr3[i11 + 1] << (64 - i12)) & ((-i12) >> 63)) | (jArr3[i11] >>> i12);
            long j7 = i7;
            int i14 = i10;
            long j8 = j6 ^ (j7 * 72340172838076673L);
            long j9 = (~j8) & (j8 - 72340172838076673L) & (-9187201950435737472L);
            while (j9 != 0) {
                int iNumberOfTrailingZeros = (i9 + (Long.numberOfTrailingZeros(j9) >> 3)) & i8;
                int i15 = i4;
                if (this.f869b[iNumberOfTrailingZeros] == j2) {
                    return iNumberOfTrailingZeros;
                }
                j9 &= j9 - 1;
                i4 = i15;
            }
            int i16 = i4;
            if ((((~j6) << 6) & j6 & (-9187201950435737472L)) != 0) {
                int iE = e(i6);
                long j10 = 255;
                if (this.f737f != 0 || ((this.f868a[iE >> 3] >> ((iE & 7) << 3)) & 255) == 254) {
                    j3 = 255;
                    i2 = 1;
                    j4 = 128;
                } else {
                    if (this.f871d > 8) {
                        j4 = 128;
                        if (Long.compare(androidx.compose.runtime.changelist.a.e(this.f872e, 32L) ^ Long.MIN_VALUE, androidx.compose.runtime.changelist.a.e(this.f871d, 25L) ^ Long.MIN_VALUE) <= 0) {
                            long[] jArr4 = this.f868a;
                            int i17 = this.f871d;
                            int i18 = 0;
                            int i19 = 0;
                            while (i18 < i17) {
                                int i20 = i18 >> 3;
                                int i21 = (i18 & 7) << 3;
                                if (((jArr4[i20] >> i21) & j10) == 254) {
                                    long[] jArr5 = this.f868a;
                                    j5 = j10;
                                    jArr5[i20] = (jArr5[i20] & (~(j5 << i21))) | (128 << i21);
                                    int i22 = this.f871d;
                                    int i23 = ((i18 - 7) & i22) + (i22 & 7);
                                    int i24 = i23 >> 3;
                                    int i25 = (i23 & 7) << 3;
                                    i3 = i13;
                                    jArr5[i24] = (jArr5[i24] & (~(j5 << i25))) | (128 << i25);
                                    i19++;
                                } else {
                                    j5 = j10;
                                    i3 = i13;
                                }
                                i18++;
                                i13 = i3;
                                j10 = j5;
                            }
                            j3 = j10;
                            i2 = i13;
                            this.f737f += i19;
                        }
                        iE = e(i6);
                    } else {
                        j4 = 128;
                    }
                    j3 = 255;
                    i2 = 1;
                    int iB = d0.b(this.f871d);
                    long[] jArr6 = this.f868a;
                    long[] jArr7 = this.f869b;
                    Object[] objArr = this.f870c;
                    int i26 = this.f871d;
                    f(iB);
                    long[] jArr8 = this.f869b;
                    Object[] objArr2 = this.f870c;
                    int i27 = 0;
                    while (i27 < i26) {
                        if (((jArr6[i27 >> 3] >> ((i27 & 7) << 3)) & 255) < j4) {
                            long j11 = jArr7[i27];
                            int iHashCode2 = Long.hashCode(j11) * i16;
                            int i28 = iHashCode2 ^ (iHashCode2 << 16);
                            int iE2 = e(i28 >>> 7);
                            jArr = jArr8;
                            jArr2 = jArr6;
                            long j12 = i28 & WorkQueueKt.MASK;
                            long[] jArr9 = this.f868a;
                            int i29 = iE2 >> 3;
                            int i30 = (iE2 & 7) << 3;
                            jArr9[i29] = (jArr9[i29] & (~(255 << i30))) | (j12 << i30);
                            int i31 = this.f871d;
                            int i32 = ((iE2 - 7) & i31) + (i31 & 7);
                            int i33 = i32 >> 3;
                            int i34 = (i32 & 7) << 3;
                            jArr9[i33] = (jArr9[i33] & (~(255 << i34))) | (j12 << i34);
                            jArr[iE2] = j11;
                            objArr2[iE2] = objArr[i27];
                        } else {
                            jArr = jArr8;
                            jArr2 = jArr6;
                        }
                        i27++;
                        jArr6 = jArr2;
                        jArr8 = jArr;
                    }
                    iE = e(i6);
                }
                this.f872e += i2;
                int i35 = this.f737f;
                long[] jArr10 = this.f868a;
                int i36 = iE >> 3;
                long j13 = jArr10[i36];
                int i37 = (iE & 7) << 3;
                if (((j13 >> i37) & j3) != j4) {
                    i2 = 0;
                }
                this.f737f = i35 - i2;
                jArr10[i36] = (j13 & (~(j3 << i37))) | (j7 << i37);
                int i38 = this.f871d;
                int i39 = ((iE - 7) & i38) + (i38 & 7);
                int i40 = i39 >> 3;
                int i41 = (i39 & 7) << 3;
                jArr10[i40] = (jArr10[i40] & (~(j3 << i41))) | (j7 << i41);
                return iE;
            }
            i10 = i14 + 8;
            i9 = (i9 + i10) & i8;
            i4 = i16;
        }
    }

    public final int e(int i2) {
        int i3 = this.f871d;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f868a;
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
        this.f871d = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f868a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f737f = d0.a(this.f871d) - this.f872e;
        this.f869b = new long[iMax];
        this.f870c = new Object[iMax];
    }

    public final void g(long j2, Object obj) {
        int iD = d(j2);
        this.f869b[iD] = j2;
        this.f870c[iD] = obj;
    }

    public /* synthetic */ C0642H() {
        this(6);
    }
}
