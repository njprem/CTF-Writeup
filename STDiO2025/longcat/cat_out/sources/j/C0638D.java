package j;

import java.util.Arrays;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0638D extends AbstractC0660m {
    public C0638D(int i2) {
        this.f848a = i2 == 0 ? r.f861a : new int[i2];
    }

    public final void b() {
        int i2 = this.f849b;
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Index 0 must be in 0.." + this.f849b);
        }
        d(i2 + 1);
        int[] iArr = this.f848a;
        int i3 = this.f849b;
        if (i3 != 0) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, 1, 0, i3);
        }
        iArr[0] = 0;
        this.f849b++;
    }

    public final void c(int i2) {
        d(this.f849b + 1);
        int[] iArr = this.f848a;
        int i3 = this.f849b;
        iArr[i3] = i2;
        this.f849b = i3 + 1;
    }

    public final void d(int i2) {
        int[] iArr = this.f848a;
        if (iArr.length < i2) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f848a = iArrCopyOf;
        }
    }

    public final int e(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f849b)) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(i2, "Index ", " must be in 0..");
            sbP.append(this.f849b - 1);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int[] iArr = this.f848a;
        int i4 = iArr[i2];
        if (i2 != i3 - 1) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i2, i2 + 1, i3);
        }
        this.f849b--;
        return i4;
    }

    public final void f(int i2, int i3) {
        if (i2 < 0 || i2 >= this.f849b) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(i2, "set index ", " must be between 0 .. ");
            sbP.append(this.f849b - 1);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        int[] iArr = this.f848a;
        int i4 = iArr[i2];
        iArr[i2] = i3;
    }

    public /* synthetic */ C0638D() {
        this(16);
    }
}
