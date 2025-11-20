package j;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableSet;

/* loaded from: classes.dex */
public final class Q extends b0 implements KMutableSet {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f758c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(S s2) {
        super(s2, 1);
        this.f758c = s2;
    }

    @Override // j.b0, java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f758c.d(obj);
    }

    @Override // j.b0, java.util.Set, java.util.Collection
    public final boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        S s2 = this.f758c;
        Collection elements2 = elements;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        int i2 = s2.f827d;
        Intrinsics.checkNotNullParameter(elements2, "elements");
        Iterator it = elements2.iterator();
        while (it.hasNext()) {
            s2.k(it.next());
        }
        return i2 != s2.f827d;
    }

    @Override // j.b0, java.util.Set, java.util.Collection
    public final void clear() {
        this.f758c.f();
    }

    @Override // j.b0, java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new P(this.f758c);
    }

    @Override // j.b0, java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f758c.l(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0091, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0093, code lost:
    
        r14 = -1;
     */
    @Override // j.b0, java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            java.lang.String r0 = "elements"
            r1 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r0 = r20
            j.S r2 = r0.f758c
            int r3 = r2.f827d
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r4 = r1.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto La2
            java.lang.Object r4 = r1.next()
            if (r4 == 0) goto L27
            r2.getClass()
            int r7 = r4.hashCode()
            goto L28
        L27:
            r7 = r6
        L28:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.f826c
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L36:
            long[] r10 = r2.f824a
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L64:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L87
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.f825b
            r12 = r12[r14]
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual(r12, r4)
            if (r12 == 0) goto L7f
            goto L94
        L7f:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L64
        L87:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L9b
            r14 = -1
        L94:
            if (r14 < 0) goto L11
            r2.m(r14)
            goto L11
        L9b:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L36
        La2:
            r21 = r5
            int r1 = r2.f827d
            if (r3 == r1) goto La9
            return r21
        La9:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j.Q.removeAll(java.util.Collection):boolean");
    }

    @Override // j.b0, java.util.Set, java.util.Collection
    public final boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        S s2 = this.f758c;
        long[] jArr = s2.f824a;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        if (!elements.contains(s2.f825b[i5])) {
                            s2.m(i5);
                            z = true;
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return z;
                }
            }
            if (i2 == length) {
                return z;
            }
            i2++;
        }
    }
}
