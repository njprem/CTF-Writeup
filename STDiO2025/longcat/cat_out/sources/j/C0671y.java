package j;

import java.util.Arrays;
import k.AbstractC0673a;
import kotlin.collections.ArraysKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671y implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f879a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f880b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f881c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ int f882d;

    public C0671y(int i2) {
        if (i2 == 0) {
            this.f880b = AbstractC0673a.f887b;
            this.f881c = AbstractC0673a.f888c;
            return;
        }
        int i3 = i2 * 8;
        int i4 = 4;
        while (true) {
            if (i4 >= 32) {
                break;
            }
            int i5 = (1 << i4) - 12;
            if (i3 <= i5) {
                i3 = i5;
                break;
            }
            i4++;
        }
        int i6 = i3 / 8;
        this.f880b = new long[i6];
        this.f881c = new Object[i6];
    }

    public final long a(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f882d)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f879a) {
            long[] jArr = this.f880b;
            Object[] objArr = this.f881c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0672z.f883a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f879a = false;
            this.f882d = i4;
        }
        return this.f880b[i2];
    }

    public final void b(long j2, Object obj) {
        int iB = AbstractC0673a.b(this.f880b, this.f882d, j2);
        if (iB >= 0) {
            this.f881c[iB] = obj;
            return;
        }
        int i2 = ~iB;
        int i3 = this.f882d;
        Object obj2 = AbstractC0672z.f883a;
        if (i2 < i3) {
            Object[] objArr = this.f881c;
            if (objArr[i2] == obj2) {
                this.f880b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f879a) {
            long[] jArr = this.f880b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f881c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f879a = false;
                this.f882d = i4;
                i2 = ~AbstractC0673a.b(this.f880b, i4, j2);
            }
        }
        int i6 = this.f882d;
        if (i6 >= this.f880b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f880b, i10);
            Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "copyOf(this, newSize)");
            this.f880b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f881c, i10);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f881c = objArrCopyOf;
        }
        int i11 = this.f882d;
        if (i11 - i2 != 0) {
            long[] jArr2 = this.f880b;
            int i12 = i2 + 1;
            ArraysKt___ArraysJvmKt.copyInto(jArr2, jArr2, i12, i2, i11);
            Object[] objArr3 = this.f881c;
            ArraysKt.copyInto(objArr3, objArr3, i12, i2, this.f882d);
        }
        this.f880b[i2] = j2;
        this.f881c[i2] = obj;
        this.f882d++;
    }

    public final int c() {
        if (this.f879a) {
            int i2 = this.f882d;
            long[] jArr = this.f880b;
            Object[] objArr = this.f881c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != AbstractC0672z.f883a) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.f879a = false;
            this.f882d = i3;
        }
        return this.f882d;
    }

    public final Object clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        C0671y c0671y = (C0671y) objClone;
        c0671y.f880b = (long[]) this.f880b.clone();
        c0671y.f881c = (Object[]) this.f881c.clone();
        return c0671y;
    }

    public final Object d(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.f882d)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("Expected index to be within 0..size()-1, but was ", i2).toString());
        }
        if (this.f879a) {
            long[] jArr = this.f880b;
            Object[] objArr = this.f881c;
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                Object obj = objArr[i5];
                if (obj != AbstractC0672z.f883a) {
                    if (i5 != i4) {
                        jArr[i4] = jArr[i5];
                        objArr[i4] = obj;
                        objArr[i5] = null;
                    }
                    i4++;
                }
            }
            this.f879a = false;
            this.f882d = i4;
        }
        return this.f881c[i2];
    }

    public final String toString() {
        if (c() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f882d * 28);
        sb.append('{');
        int i2 = this.f882d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(a(i3));
            sb.append('=');
            Object objD = d(i3);
            if (objD != sb) {
                sb.append(objD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }
}
