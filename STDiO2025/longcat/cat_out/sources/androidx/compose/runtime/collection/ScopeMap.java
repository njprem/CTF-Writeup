package androidx.compose.runtime.collection;

import j.N;
import j.S;
import j.d0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00028\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0011H\u0086\b¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000e0\u0011H\u0086\b¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u0005J\u001d\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ5\u0010\u001d\u001a\u00020\b2#\b\u0004\u0010\u001c\u001a\u001d\u0012\u0013\u0012\u00118\u0001¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u000e0\u0011H\u0086\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\"0!¢\u0006\u0004\b#\u0010$R#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0011\u0010-\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/runtime/collection/ScopeMap;", "", "Key", "Scope", "<init>", "()V", "key", "scope", "", "add", "(Ljava/lang/Object;Ljava/lang/Object;)V", "value", "set", "element", "", "contains", "(Ljava/lang/Object;)Z", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "block", "forEachScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "anyScopeOf", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "clear", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeScopeIf", "(Lkotlin/jvm/functions/Function1;)V", "removeScope", "(Ljava/lang/Object;)V", "", "", "asMap", "()Ljava/util/Map;", "Lj/N;", "map", "Lj/N;", "getMap", "()Lj/N;", "", "getSize", "()I", "size", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ScopeMap<Key, Scope> {
    public static final int $stable = 8;
    private final N map;

    public ScopeMap() {
        long[] jArr = d0.f809a;
        this.map = new N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r4v1, types: [j.S] */
    public final void add(Key key, Scope scope) {
        N n2 = this.map;
        int iF = n2.f(key);
        boolean z = iF < 0;
        Scope scope2 = z ? null : n2.f802c[iF];
        if (scope2 != null) {
            if (scope2 instanceof S) {
                Intrinsics.checkNotNull(scope2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0>");
                ((S) scope2).d(scope);
            } else if (scope2 != scope) {
                ?? s2 = new S();
                Intrinsics.checkNotNull(scope2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.add$lambda$0");
                s2.d(scope2);
                s2.d(scope);
                scope = s2;
            }
            scope = scope2;
        }
        if (!z) {
            n2.f802c[iF] = scope;
            return;
        }
        int i2 = ~iF;
        n2.f801b[i2] = key;
        n2.f802c[i2] = scope;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean anyScopeOf(Key r17, kotlin.jvm.functions.Function1<? super Scope, java.lang.Boolean> r18) {
        /*
            r16 = this;
            r0 = r18
            j.N r1 = r16.getMap()
            r2 = r17
            java.lang.Object r1 = r1.b(r2)
            r2 = 0
            if (r1 == 0) goto L6f
            boolean r3 = r1 instanceof j.S
            r4 = 1
            if (r3 == 0) goto L62
            j.S r1 = (j.S) r1
            java.lang.Object[] r3 = r1.f825b
            long[] r1 = r1.f824a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L6f
            r6 = r2
        L20:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r2
        L3a:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            java.lang.Object r12 = r0.invoke(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L57
            return r4
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L3a
        L5b:
            if (r9 != r10) goto L6f
        L5d:
            if (r6 == r5) goto L6f
            int r6 = r6 + 1
            goto L20
        L62:
            java.lang.Object r0 = r0.invoke(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L6f
            return r4
        L6f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.anyScopeOf(java.lang.Object, kotlin.jvm.functions.Function1):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<Key, java.util.Set<Scope>> asMap() {
        /*
            r17 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = r17
            j.N r2 = r1.map
            java.lang.Object[] r3 = r2.f801b
            java.lang.Object[] r4 = r2.f802c
            long[] r2 = r2.f800a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L76
            r7 = 0
        L15:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L71
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L2f:
            if (r12 >= r10) goto L6f
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L6b
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            java.lang.String r15 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r15)
            boolean r15 = r13 instanceof j.S
            if (r15 == 0) goto L5b
            java.lang.String r15 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r15)
            j.S r13 = (j.S) r13
            r13.getClass()
            j.b0 r15 = new j.b0
            r6 = 1
            r15.<init>(r13, r6)
            goto L68
        L5b:
            java.lang.String r6 = "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.asMap$lambda$4"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r13}
            java.util.Set r15 = kotlin.collections.SetsKt.mutableSetOf(r6)
        L68:
            r0.put(r14, r15)
        L6b:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L2f
        L6f:
            if (r10 != r11) goto L76
        L71:
            if (r7 == r5) goto L76
            int r7 = r7 + 1
            goto L15
        L76:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.ScopeMap.asMap():java.util.Map");
    }

    public final void clear() {
        this.map.d();
    }

    public final boolean contains(Key element) {
        return this.map.a(element);
    }

    public final void forEachScopeOf(Key key, Function1<? super Scope, Unit> block) {
        Object objB = getMap().b(key);
        if (objB == null) {
            return;
        }
        if (!(objB instanceof S)) {
            block.invoke(objB);
            return;
        }
        S s2 = (S) objB;
        Object[] objArr = s2.f825b;
        long[] jArr = s2.f824a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        block.invoke(objArr[(i2 << 3) + i4]);
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final N getMap() {
        return this.map;
    }

    public final int getSize() {
        return this.map.f804e;
    }

    public final boolean remove(Key key, Scope scope) {
        Object objB = this.map.b(key);
        if (objB == null) {
            return false;
        }
        if (!(objB instanceof S)) {
            if (!Intrinsics.areEqual(objB, scope)) {
                return false;
            }
            this.map.h(key);
            return true;
        }
        S s2 = (S) objB;
        boolean zL = s2.l(scope);
        if (zL && s2.b()) {
            this.map.h(key);
        }
        return zL;
    }

    public final void removeScope(Scope scope) {
        boolean zB;
        N n2 = this.map;
        long[] jArr = n2.f800a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj = n2.f801b[i5];
                        Object obj2 = n2.f802c[i5];
                        if (obj2 instanceof S) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScope$lambda$3>");
                            S s2 = (S) obj2;
                            s2.l(scope);
                            zB = s2.b();
                        } else {
                            zB = obj2 == scope;
                        }
                        if (zB) {
                            n2.i(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public final void removeScopeIf(Function1<? super Scope, Boolean> predicate) {
        long[] jArr;
        long[] jArr2;
        long j2;
        char c2;
        long j3;
        int i2;
        boolean zBooleanValue;
        S s2;
        long[] jArr3;
        int i3;
        S s3;
        N map = getMap();
        long[] jArr4 = map.f800a;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c3 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = (i4 << 3) + i7;
                        c2 = c3;
                        Object obj = map.f801b[i8];
                        Object obj2 = map.f802c[i8];
                        j3 = j5;
                        if (obj2 instanceof S) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2>");
                            S s4 = (S) obj2;
                            Object[] objArr = s4.f825b;
                            long[] jArr5 = s4.f824a;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i9 = i5;
                                S s5 = s4;
                                int i10 = 0;
                                while (true) {
                                    long j6 = jArr5[i10];
                                    j2 = j4;
                                    if ((((~j6) << c2) & j6 & j3) != j3) {
                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                jArr3 = jArr4;
                                                int i13 = (i10 << 3) + i12;
                                                i3 = i12;
                                                if (predicate.invoke(objArr[i13]).booleanValue()) {
                                                    s3 = s5;
                                                    s3.m(i13);
                                                }
                                                j6 >>= i9;
                                                s5 = s3;
                                                i12 = i3 + 1;
                                                jArr4 = jArr3;
                                            } else {
                                                jArr3 = jArr4;
                                                i3 = i12;
                                            }
                                            s3 = s5;
                                            j6 >>= i9;
                                            s5 = s3;
                                            i12 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        s2 = s5;
                                        if (i11 != i9) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                        s2 = s5;
                                    }
                                    if (i10 == length2) {
                                        break;
                                    }
                                    i10++;
                                    s5 = s2;
                                    j4 = j2;
                                    jArr4 = jArr2;
                                    i9 = 8;
                                }
                            } else {
                                jArr2 = jArr4;
                                j2 = j4;
                                s2 = s4;
                            }
                            zBooleanValue = s2.b();
                        } else {
                            jArr2 = jArr4;
                            j2 = j4;
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$2");
                            zBooleanValue = predicate.invoke(obj2).booleanValue();
                        }
                        if (zBooleanValue) {
                            map.i(i8);
                        }
                        i2 = 8;
                    } else {
                        jArr2 = jArr4;
                        j2 = j4;
                        c2 = c3;
                        j3 = j5;
                        i2 = i5;
                    }
                    j4 = j2 >> i2;
                    i7++;
                    i5 = i2;
                    c3 = c2;
                    j5 = j3;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            jArr4 = jArr;
        }
    }

    public final void set(Key key, Scope value) {
        this.map.k(key, value);
    }
}
