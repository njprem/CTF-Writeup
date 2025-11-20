package kotlin.comparisons;

import java.util.Comparator;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f891a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f892b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Comparator f893c;

    public /* synthetic */ b(Comparator comparator, Comparator comparator2, int i2) {
        this.f891a = i2;
        this.f892b = comparator;
        this.f893c = comparator2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f891a) {
            case 0:
                return ComparisonsKt__ComparisonsKt.thenDescending$lambda$2$ComparisonsKt__ComparisonsKt(this.f892b, this.f893c, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.then$lambda$1$ComparisonsKt__ComparisonsKt(this.f892b, this.f893c, obj, obj2);
        }
    }
}
