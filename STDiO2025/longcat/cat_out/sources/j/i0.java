package j;

import java.util.Arrays;
import k.AbstractC0673a;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class i0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f838a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f839b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f840c;

    public i0() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f838a = new int[i5];
        this.f839b = new Object[i5];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final i0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        i0 i0Var = (i0) objClone;
        i0Var.f838a = (int[]) this.f838a.clone();
        i0Var.f839b = (Object[]) this.f839b.clone();
        return i0Var;
    }

    public final Object b(int i2) {
        Object obj;
        Intrinsics.checkNotNullParameter(this, "<this>");
        int iA = AbstractC0673a.a(this.f838a, this.f840c, i2);
        if (iA < 0 || (obj = this.f839b[iA]) == AbstractC0672z.f885c) {
            return null;
        }
        return obj;
    }

    public final void c(int i2, Object obj) {
        int iA = AbstractC0673a.a(this.f838a, this.f840c, i2);
        if (iA >= 0) {
            this.f839b[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i4 = this.f840c;
        if (i3 < i4) {
            Object[] objArr = this.f839b;
            if (objArr[i3] == AbstractC0672z.f885c) {
                this.f838a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f838a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f838a, i8);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f838a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f839b, i8);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f839b = objArrCopyOf;
        }
        int i9 = this.f840c;
        if (i9 - i3 != 0) {
            int[] iArr = this.f838a;
            int i10 = i3 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i10, i3, i9);
            Object[] objArr2 = this.f839b;
            ArraysKt.copyInto(objArr2, objArr2, i10, i3, this.f840c);
        }
        this.f838a[i3] = i2;
        this.f839b[i3] = obj;
        this.f840c++;
    }

    public final String toString() {
        int i2 = this.f840c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f840c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f838a[i4]);
            sb.append('=');
            Object obj = this.f839b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "buffer.toString()");
        return string;
    }
}
