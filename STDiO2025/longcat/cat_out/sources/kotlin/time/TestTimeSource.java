package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.LongCompanionObject;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\f\u0010\nJ\b\u0010\r\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "()V", "reading", "", "overflow", "", "duration", "Lkotlin/time/Duration;", "overflow-LRDsOJo", "(J)V", "plusAssign", "plusAssign-LRDsOJo", "read", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TestTimeSource extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        markNow();
    }

    /* renamed from: overflow-LRDsOJo, reason: not valid java name */
    private final void m7957overflowLRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt__DurationUnitKt.shortName(getUnit()) + " is advanced by " + ((Object) Duration.m7871toStringimpl(duration)) + '.');
    }

    /* renamed from: plusAssign-LRDsOJo, reason: not valid java name */
    public final void m7958plusAssignLRDsOJo(long duration) {
        long jM7868toLongimpl = Duration.m7868toLongimpl(duration, getUnit());
        if (((jM7868toLongimpl - 1) | 1) != LongCompanionObject.MAX_VALUE) {
            long j2 = this.reading;
            long j3 = j2 + jM7868toLongimpl;
            if ((jM7868toLongimpl ^ j2) >= 0 && (j2 ^ j3) < 0) {
                m7957overflowLRDsOJo(duration);
            }
            this.reading = j3;
            return;
        }
        long jM7825divUwyO8pc = Duration.m7825divUwyO8pc(duration, 2);
        if ((1 | (Duration.m7868toLongimpl(jM7825divUwyO8pc, getUnit()) - 1)) == LongCompanionObject.MAX_VALUE) {
            m7957overflowLRDsOJo(duration);
            return;
        }
        long j4 = this.reading;
        try {
            m7958plusAssignLRDsOJo(jM7825divUwyO8pc);
            m7958plusAssignLRDsOJo(Duration.m7857minusLRDsOJo(duration, jM7825divUwyO8pc));
        } catch (IllegalStateException e2) {
            this.reading = j4;
            throw e2;
        }
    }

    @Override // kotlin.time.AbstractLongTimeSource
    /* renamed from: read, reason: from getter */
    public long getReading() {
        return this.reading;
    }
}
