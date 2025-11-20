package j;

import kotlin.collections.ArraysKt___ArraysJvmKt;

/* renamed from: j.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0657j {

    /* renamed from: a, reason: collision with root package name */
    public static final float[] f841a;

    static {
        long[] jArr = d0.f809a;
        int iD = d0.d(0);
        int iMax = iD > 0 ? Math.max(7, d0.c(iD)) : 0;
        if (iMax != 0) {
            jArr = new long[((iMax + 15) & (-8)) >> 3];
            ArraysKt___ArraysJvmKt.fill$default(jArr, -9187201950435737472L, 0, 0, 6, (Object) null);
        }
        int i2 = iMax >> 3;
        long j2 = 255 << ((iMax & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j2)) | j2;
        float[] fArr = new float[iMax];
        f841a = new float[0];
    }
}
