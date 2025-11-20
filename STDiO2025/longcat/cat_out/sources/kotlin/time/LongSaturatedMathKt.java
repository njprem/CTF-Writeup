package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.time.Duration;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0002\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u000e\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0002¢\u0006\u0002\u0010\u0014\u001a%\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0000¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0001H\u0080\b¨\u0006\u001d"}, d2 = {"checkInfiniteSumDefined", "", "value", "duration", "Lkotlin/time/Duration;", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "infinityOfSign", "(J)J", "saturatingAdd", "unit", "Lkotlin/time/DurationUnit;", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAddInHalves", "saturatingAddInHalves-NuflL3o", "saturatingDiff", "valueNs", "origin", "(JJLkotlin/time/DurationUnit;)J", "saturatingFiniteDiff", "value1", "value2", "saturatingOriginsDiff", "origin1", "origin2", "isSaturated", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LongSaturatedMathKt {
    /* renamed from: checkInfiniteSumDefined-PjuGub4, reason: not valid java name */
    private static final long m7950checkInfiniteSumDefinedPjuGub4(long j2, long j3, long j4) {
        if (!Duration.m7854isInfiniteimpl(j3) || (j2 ^ j4) >= 0) {
            return j2;
        }
        throw new IllegalArgumentException("Summing infinities of different signs");
    }

    private static final long infinityOfSign(long j2) {
        return j2 < 0 ? Duration.INSTANCE.m7924getNEG_INFINITEUwyO8pc$kotlin_stdlib() : Duration.INSTANCE.m7923getINFINITEUwyO8pc();
    }

    public static final boolean isSaturated(long j2) {
        return ((j2 - 1) | 1) == LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAdd-NuflL3o, reason: not valid java name */
    public static final long m7951saturatingAddNuflL3o(long j2, DurationUnit unit, long j3) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        long jM7868toLongimpl = Duration.m7868toLongimpl(j3, unit);
        if (((j2 - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m7950checkInfiniteSumDefinedPjuGub4(j2, j3, jM7868toLongimpl);
        }
        if (((jM7868toLongimpl - 1) | 1) == LongCompanionObject.MAX_VALUE) {
            return m7952saturatingAddInHalvesNuflL3o(j2, unit, j3);
        }
        long j4 = j2 + jM7868toLongimpl;
        if (((j2 ^ j4) & (jM7868toLongimpl ^ j4)) >= 0) {
            return j4;
        }
        if (j2 < 0) {
            return Long.MIN_VALUE;
        }
        return LongCompanionObject.MAX_VALUE;
    }

    /* renamed from: saturatingAddInHalves-NuflL3o, reason: not valid java name */
    private static final long m7952saturatingAddInHalvesNuflL3o(long j2, DurationUnit durationUnit, long j3) {
        long jM7825divUwyO8pc = Duration.m7825divUwyO8pc(j3, 2);
        long jM7868toLongimpl = Duration.m7868toLongimpl(jM7825divUwyO8pc, durationUnit);
        return (1 | (jM7868toLongimpl - 1)) == LongCompanionObject.MAX_VALUE ? jM7868toLongimpl : m7951saturatingAddNuflL3o(m7951saturatingAddNuflL3o(j2, durationUnit, jM7825divUwyO8pc), durationUnit, Duration.m7857minusLRDsOJo(j3, jM7825divUwyO8pc));
    }

    public static final long saturatingDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (1 | (j3 - 1)) == LongCompanionObject.MAX_VALUE ? Duration.m7875unaryMinusUwyO8pc(infinityOfSign(j3)) : saturatingFiniteDiff(j2, j3, unit);
    }

    private static final long saturatingFiniteDiff(long j2, long j3, DurationUnit durationUnit) {
        long j4 = j2 - j3;
        if (((j4 ^ j2) & (~(j4 ^ j3))) >= 0) {
            return DurationKt.toDuration(j4, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m7875unaryMinusUwyO8pc(infinityOfSign(j4));
        }
        long jConvertDurationUnit = DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, durationUnit2, durationUnit);
        long j5 = (j2 / jConvertDurationUnit) - (j3 / jConvertDurationUnit);
        long j6 = (j2 % jConvertDurationUnit) - (j3 % jConvertDurationUnit);
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m7858plusLRDsOJo(DurationKt.toDuration(j5, durationUnit2), DurationKt.toDuration(j6, durationUnit));
    }

    public static final long saturatingOriginsDiff(long j2, long j3, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return ((j3 - 1) | 1) == LongCompanionObject.MAX_VALUE ? j2 == j3 ? Duration.INSTANCE.m7925getZEROUwyO8pc() : Duration.m7875unaryMinusUwyO8pc(infinityOfSign(j3)) : (1 | (j2 - 1)) == LongCompanionObject.MAX_VALUE ? infinityOfSign(j2) : saturatingFiniteDiff(j2, j3, unit);
    }
}
