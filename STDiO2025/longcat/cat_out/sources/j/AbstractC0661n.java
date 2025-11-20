package j;

import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0661n {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f850a = 0;

    static {
        int[] iArr = r.f861a;
    }

    public static final C0638D a(int... elements) {
        int i2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        C0638D c0638d = new C0638D(elements.length);
        Intrinsics.checkNotNullParameter(elements, "elements");
        int i3 = c0638d.f849b;
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (i3 < 0 || i3 > (i2 = c0638d.f849b)) {
            StringBuilder sbP = androidx.compose.runtime.changelist.a.p(i3, "Index ", " must be in 0..");
            sbP.append(c0638d.f849b);
            throw new IndexOutOfBoundsException(sbP.toString());
        }
        if (elements.length == 0) {
            return c0638d;
        }
        c0638d.d(i2 + elements.length);
        int[] iArr = c0638d.f848a;
        int i4 = c0638d.f849b;
        if (i3 != i4) {
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, elements.length + i3, i3, i4);
        }
        ArraysKt___ArraysJvmKt.copyInto$default(elements, iArr, i3, 0, 0, 12, (Object) null);
        c0638d.f849b += elements.length;
        return c0638d;
    }
}
