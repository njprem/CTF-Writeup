package j;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: j.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0651d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f805a;

    /* renamed from: b, reason: collision with root package name */
    public int f806b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f807c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0653f f808d;

    public C0651d(C0653f c0653f) {
        this.f808d = c0653f;
        this.f805a = c0653f.f836c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f807c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f806b;
        C0653f c0653f = this.f808d;
        return Intrinsics.areEqual(key, c0653f.e(i2)) && Intrinsics.areEqual(entry.getValue(), c0653f.h(this.f806b));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f807c) {
            return this.f808d.e(this.f806b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f807c) {
            return this.f808d.h(this.f806b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f806b < this.f805a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f807c) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f806b;
        C0653f c0653f = this.f808d;
        Object objE = c0653f.e(i2);
        Object objH = c0653f.h(this.f806b);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f806b++;
        this.f807c = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f807c) {
            throw new IllegalStateException();
        }
        this.f808d.f(this.f806b);
        this.f806b--;
        this.f805a--;
        this.f807c = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f807c) {
            return this.f808d.g(this.f806b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
