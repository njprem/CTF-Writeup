package kotlin.comparisons;

import java.util.Comparator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f890b;

    public /* synthetic */ a(Object obj, int i2) {
        this.f889a = i2;
        this.f890b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f889a) {
            case 0:
                return ComparisonsKt__ComparisonsKt.nullsLast$lambda$4$ComparisonsKt__ComparisonsKt((Comparator) this.f890b, obj, obj2);
            case 1:
                return ComparisonsKt__ComparisonsKt.nullsFirst$lambda$3$ComparisonsKt__ComparisonsKt((Comparator) this.f890b, obj, obj2);
            default:
                return ComparisonsKt__ComparisonsKt.compareBy$lambda$0$ComparisonsKt__ComparisonsKt((Function1[]) this.f890b, obj, obj2);
        }
    }
}
