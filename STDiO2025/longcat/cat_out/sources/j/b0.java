package j;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

/* loaded from: classes.dex */
public class b0 implements Set, KMappedMarker {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f797a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f798b;

    public /* synthetic */ b0(Object obj, int i2) {
        this.f797a = i2;
        this.f798b = obj;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean add(Object obj) {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f797a) {
            case 0:
                return ((N) this.f798b).a(obj);
            default:
                return ((f0) this.f798b).a(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.f797a) {
            case 0:
                Intrinsics.checkNotNullParameter(elements, "elements");
                Collection collection = elements;
                if (!collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (!((N) this.f798b).a(it.next())) {
                            break;
                        }
                    }
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(elements, "elements");
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!((f0) this.f798b).a(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f797a) {
            case 0:
                return ((N) this.f798b).c();
            default:
                return ((f0) this.f798b).b();
        }
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        switch (this.f797a) {
            case 0:
                return SequencesKt.iterator(new a0((N) this.f798b, null));
            default:
                return SequencesKt.iterator(new e0((f0) this.f798b, null));
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.f797a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        switch (this.f797a) {
            case 0:
                return ((N) this.f798b).f804e;
            default:
                return ((f0) this.f798b).f827d;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        switch (this.f797a) {
        }
        return CollectionToArray.toArray(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.f797a) {
            case 0:
                Intrinsics.checkNotNullParameter(array, "array");
                break;
            default:
                Intrinsics.checkNotNullParameter(array, "array");
                break;
        }
        return CollectionToArray.toArray(this, array);
    }
}
