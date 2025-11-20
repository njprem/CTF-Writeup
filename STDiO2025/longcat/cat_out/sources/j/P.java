package j;

import java.util.Iterator;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequencesKt;

/* loaded from: classes.dex */
public final class P implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f755a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f756b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S f757c;

    public P(S s2) {
        this.f757c = s2;
        this.f756b = SequencesKt.iterator(new O(s2, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f756b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f756b.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i2 = this.f755a;
        if (i2 != -1) {
            this.f757c.m(i2);
            this.f755a = -1;
        }
    }
}
