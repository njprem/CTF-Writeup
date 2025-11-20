package j;

import java.util.AbstractSet;
import java.util.Iterator;

/* renamed from: j.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0648a extends AbstractSet {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0653f f781a;

    public C0648a(C0653f c0653f) {
        this.f781a = c0653f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0651d(this.f781a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f781a.f836c;
    }
}
