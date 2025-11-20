package j;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0653f extends h0 implements Map {

    /* renamed from: d, reason: collision with root package name */
    public C0648a f821d;

    /* renamed from: e, reason: collision with root package name */
    public C0650c f822e;

    /* renamed from: f, reason: collision with root package name */
    public C0652e f823f;

    @Override // java.util.Map
    public final Set entrySet() {
        C0648a c0648a = this.f821d;
        if (c0648a != null) {
            return c0648a;
        }
        C0648a c0648a2 = new C0648a(this);
        this.f821d = c0648a2;
        return c0648a2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i2 = this.f836c;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.f836c;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C0650c c0650c = this.f822e;
        if (c0650c != null) {
            return c0650c;
        }
        C0650c c0650c2 = new C0650c(this);
        this.f822e = c0650c2;
        return c0650c2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f836c;
        int i2 = this.f836c;
        int[] iArr = this.f834a;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.f834a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f835b, size * 2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            this.f835b = objArrCopyOf;
        }
        if (this.f836c != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        C0652e c0652e = this.f823f;
        if (c0652e != null) {
            return c0652e;
        }
        C0652e c0652e2 = new C0652e(this);
        this.f823f = c0652e2;
        return c0652e2;
    }
}
