package j;

import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0643I extends AbstractC0669w {

    /* renamed from: e, reason: collision with root package name */
    public int f738e;

    public C0643I(int i2) {
        this.f874a = d0.f809a;
        this.f875b = AbstractC0670x.f878a;
        if (i2 < 0) {
            throw new IllegalArgumentException("Capacity must be a positive value.");
        }
        c(d0.d(i2));
    }

    public final int b(int i2) {
        int i3 = this.f876c;
        int i4 = i2 & i3;
        int i5 = 0;
        while (true) {
            long[] jArr = this.f874a;
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
        this.f876c = iMax;
        if (iMax == 0) {
            jArr = d0.f809a;
        } else {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        this.f874a = jArr;
        int i3 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i3] = (jArr[i3] & (~j2)) | j2;
        this.f738e = d0.a(this.f876c) - this.f877d;
        this.f875b = new long[iMax];
    }
}
