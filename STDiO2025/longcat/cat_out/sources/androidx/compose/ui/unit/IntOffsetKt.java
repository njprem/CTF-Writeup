package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\r\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0011\u001a\u001f\u0010\u0013\u001a\u00020\u000e*\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u000eH\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0011\u001a\u0016\u0010\u0016\u001a\u00020\u0001*\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u000e*\u00020\u0001H\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, d2 = {"IntOffset", "Landroidx/compose/ui/unit/IntOffset;", "x", "", "y", "(II)J", "lerp", "start", "stop", "fraction", "", "lerp-81ZRxRo", "(JJF)J", "minus", "Landroidx/compose/ui/geometry/Offset;", "offset", "minus-Nv-tHpc", "(JJ)J", "minus-oCl6YwE", "plus", "plus-Nv-tHpc", "plus-oCl6YwE", "round", "round-k-4lQ0M", "(J)J", "toOffset", "toOffset--gyyYBs", "ui-unit_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntOffsetKt {
    public static final long IntOffset(int i2, int i3) {
        return IntOffset.m6355constructorimpl((i3 & 4294967295L) | (i2 << 32));
    }

    /* renamed from: lerp-81ZRxRo, reason: not valid java name */
    public static final long m6372lerp81ZRxRo(long j2, long j3, float f2) {
        return IntOffset.m6355constructorimpl((MathHelpersKt.lerp(IntOffset.m6361getXimpl(j2), IntOffset.m6361getXimpl(j3), f2) << 32) | (MathHelpersKt.lerp(IntOffset.m6362getYimpl(j2), IntOffset.m6362getYimpl(j3), f2) & 4294967295L));
    }

    /* renamed from: minus-Nv-tHpc, reason: not valid java name */
    public static final long m6373minusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m3551getXimpl(j2) - IntOffset.m6361getXimpl(j3), Offset.m3552getYimpl(j2) - IntOffset.m6362getYimpl(j3));
    }

    /* renamed from: minus-oCl6YwE, reason: not valid java name */
    public static final long m6374minusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(IntOffset.m6361getXimpl(j2) - Offset.m3551getXimpl(j3), IntOffset.m6362getYimpl(j2) - Offset.m3552getYimpl(j3));
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m6375plusNvtHpc(long j2, long j3) {
        return OffsetKt.Offset(Offset.m3551getXimpl(j2) + IntOffset.m6361getXimpl(j3), Offset.m3552getYimpl(j2) + IntOffset.m6362getYimpl(j3));
    }

    /* renamed from: plus-oCl6YwE, reason: not valid java name */
    public static final long m6376plusoCl6YwE(long j2, long j3) {
        return OffsetKt.Offset(Offset.m3551getXimpl(j3) + IntOffset.m6361getXimpl(j2), Offset.m3552getYimpl(j3) + IntOffset.m6362getYimpl(j2));
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m6377roundk4lQ0M(long j2) {
        return IntOffset.m6355constructorimpl((Math.round(Offset.m3552getYimpl(j2)) & 4294967295L) | (Math.round(Offset.m3551getXimpl(j2)) << 32));
    }

    /* renamed from: toOffset--gyyYBs, reason: not valid java name */
    public static final long m6378toOffsetgyyYBs(long j2) {
        return OffsetKt.Offset(IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
    }
}
