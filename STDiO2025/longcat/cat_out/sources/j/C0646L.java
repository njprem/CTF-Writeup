package j;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0646L extends X {
    public C0646L(int i2) {
        this.f773a = i2 == 0 ? AbstractC0672z.f884b : new Object[i2];
    }

    public final void a(Object obj) {
        int i2 = this.f774b + 1;
        Object[] objArr = this.f773a;
        if (objArr.length < i2) {
            Object[] objArrCopyOf = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f773a = objArrCopyOf;
        }
        Object[] objArr2 = this.f773a;
        int i3 = this.f774b;
        objArr2[i3] = obj;
        this.f774b = i3 + 1;
    }

    public /* synthetic */ C0646L() {
        this(16);
    }
}
