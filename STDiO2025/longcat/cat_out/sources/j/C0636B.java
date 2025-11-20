package j;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0636B extends AbstractC0655h {
    public final void b(float f2) {
        int i2 = this.f833b + 1;
        float[] fArr = this.f832a;
        if (fArr.length < i2) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, Math.max(i2, (fArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(this, newSize)");
            this.f832a = fArrCopyOf;
        }
        float[] fArr2 = this.f832a;
        int i3 = this.f833b;
        fArr2[i3] = f2;
        this.f833b = i3 + 1;
    }
}
