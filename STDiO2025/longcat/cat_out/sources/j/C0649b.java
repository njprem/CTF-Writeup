package j;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.KMutableIterator;

/* renamed from: j.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0649b implements Iterator, KMutableIterator {

    /* renamed from: a, reason: collision with root package name */
    public int f792a;

    /* renamed from: b, reason: collision with root package name */
    public int f793b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f794c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f796e;

    public C0649b(int i2) {
        this.f792a = i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f793b < this.f792a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objE;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f793b;
        switch (this.f795d) {
            case 0:
                objE = ((C0653f) this.f796e).e(i2);
                break;
            case 1:
                objE = ((C0653f) this.f796e).h(i2);
                break;
            default:
                objE = ((C0654g) this.f796e).f829b[i2];
                break;
        }
        this.f793b++;
        this.f794c = true;
        return objE;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f794c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i2 = this.f793b - 1;
        this.f793b = i2;
        switch (this.f795d) {
            case 0:
                ((C0653f) this.f796e).f(i2);
                break;
            case 1:
                ((C0653f) this.f796e).f(i2);
                break;
            default:
                ((C0654g) this.f796e).a(i2);
                break;
        }
        this.f792a--;
        this.f794c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0649b(C0654g c0654g) {
        this(c0654g.f830c);
        this.f795d = 2;
        this.f796e = c0654g;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0649b(C0653f c0653f, int i2) {
        this(c0653f.f836c);
        this.f795d = i2;
        switch (i2) {
            case 1:
                this.f796e = c0653f;
                this(c0653f.f836c);
                break;
            default:
                this.f796e = c0653f;
                break;
        }
    }
}
