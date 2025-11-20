package androidx.compose.foundation.lazy.layout;

import j.C0647M;
import j.Z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u000f\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0080\b¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0012\u001a\u00020\u000b2\b\u0010\t\u001a\u0004\u0018\u00010\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0080\b¢\u0006\u0004\b\u0011\u0010\u000eR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R$\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR$\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/layout/PrefetchMetrics;", "", "<init>", "()V", "", "new", "current", "calculateAverageTime", "(JJ)J", "contentType", "Lkotlin/Function0;", "", "doComposition", "recordCompositionTiming$foundation_release", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;)V", "recordCompositionTiming", "doMeasure", "recordMeasureTiming$foundation_release", "recordMeasureTiming", "Lj/M;", "averageCompositionTimeNanosByContentType", "Lj/M;", "getAverageCompositionTimeNanosByContentType", "()Lj/M;", "averageMeasureTimeNanosByContentType", "getAverageMeasureTimeNanosByContentType", "<set-?>", "averageCompositionTimeNanos", "J", "getAverageCompositionTimeNanos", "()J", "averageMeasureTimeNanos", "getAverageMeasureTimeNanos", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PrefetchMetrics {
    public static final int $stable = 8;
    private long averageCompositionTimeNanos;
    private final C0647M averageCompositionTimeNanosByContentType;
    private long averageMeasureTimeNanos;
    private final C0647M averageMeasureTimeNanosByContentType;

    public PrefetchMetrics() {
        int i2 = Z.f780a;
        this.averageCompositionTimeNanosByContentType = new C0647M(6);
        this.averageMeasureTimeNanosByContentType = new C0647M(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long calculateAverageTime(long j2, long current) {
        if (current == 0) {
            return j2;
        }
        long j3 = 4;
        return (j2 / j3) + ((current / j3) * 3);
    }

    public final long getAverageCompositionTimeNanos() {
        return this.averageCompositionTimeNanos;
    }

    public final C0647M getAverageCompositionTimeNanosByContentType() {
        return this.averageCompositionTimeNanosByContentType;
    }

    public final long getAverageMeasureTimeNanos() {
        return this.averageMeasureTimeNanos;
    }

    public final C0647M getAverageMeasureTimeNanosByContentType() {
        return this.averageMeasureTimeNanosByContentType;
    }

    public final void recordCompositionTiming$foundation_release(Object contentType, Function0<Unit> doComposition) {
        long jNanoTime = System.nanoTime();
        doComposition.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (contentType != null) {
            C0647M averageCompositionTimeNanosByContentType = getAverageCompositionTimeNanosByContentType();
            int iA = averageCompositionTimeNanosByContentType.a(contentType);
            getAverageCompositionTimeNanosByContentType().e(calculateAverageTime(jNanoTime2, iA >= 0 ? averageCompositionTimeNanosByContentType.f777c[iA] : 0L), contentType);
        }
        this.averageCompositionTimeNanos = calculateAverageTime(jNanoTime2, getAverageCompositionTimeNanos());
    }

    public final void recordMeasureTiming$foundation_release(Object contentType, Function0<Unit> doMeasure) {
        long jNanoTime = System.nanoTime();
        doMeasure.invoke();
        long jNanoTime2 = System.nanoTime() - jNanoTime;
        if (contentType != null) {
            C0647M averageMeasureTimeNanosByContentType = getAverageMeasureTimeNanosByContentType();
            int iA = averageMeasureTimeNanosByContentType.a(contentType);
            getAverageMeasureTimeNanosByContentType().e(calculateAverageTime(jNanoTime2, iA >= 0 ? averageMeasureTimeNanosByContentType.f777c[iA] : 0L), contentType);
        }
        this.averageMeasureTimeNanos = calculateAverageTime(jNanoTime2, getAverageMeasureTimeNanos());
    }
}
