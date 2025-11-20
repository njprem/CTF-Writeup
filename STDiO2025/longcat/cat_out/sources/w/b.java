package w;

import android.util.LongSparseArray;
import kotlin.collections.LongIterator;

/* loaded from: classes.dex */
public final class b extends LongIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LongSparseArray f1038b;

    public b(LongSparseArray longSparseArray) {
        this.f1038b = longSparseArray;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1037a < this.f1038b.size();
    }

    @Override // kotlin.collections.LongIterator
    public final long nextLong() {
        int i2 = this.f1037a;
        this.f1037a = i2 + 1;
        return this.f1038b.keyAt(i2);
    }
}
