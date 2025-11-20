package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0005\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"CornerRadius", "Landroidx/compose/ui/geometry/CornerRadius;", "x", "", "y", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-3Ry4LBc", "(JJF)J", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CornerRadiusKt {
    public static final long CornerRadius(float f2, float f3) {
        return CornerRadius.m3520constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    public static /* synthetic */ long CornerRadius$default(float f2, float f3, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f3 = f2;
        }
        return CornerRadius(f2, f3);
    }

    /* renamed from: lerp-3Ry4LBc, reason: not valid java name */
    public static final long m3537lerp3Ry4LBc(long j2, long j3, float f2) {
        return CornerRadius(MathHelpersKt.lerp(CornerRadius.m3526getXimpl(j2), CornerRadius.m3526getXimpl(j3), f2), MathHelpersKt.lerp(CornerRadius.m3527getYimpl(j2), CornerRadius.m3527getYimpl(j3), f2));
    }
}
