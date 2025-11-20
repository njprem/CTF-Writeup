package androidx.compose.ui.geometry;

import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010\u0013\u001a*\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a%\u0010\u001a\u001a\u00020\u0002*\u00020\u00022\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u001cH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020 2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020\u00112\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010$\u001a\u001f\u0010\u001f\u001a\u00020\u0002*\u00020%2\u0006\u0010!\u001a\u00020\u0002H\u0087\nø\u0001\u0000¢\u0006\u0004\b\"\u0010&\u001a\u0016\u0010'\u001a\u00020(*\u00020\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001f\u0010\u0007\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u000b\"\u001f\u0010\f\u001a\u00020\b*\u00020\u00028Æ\u0002X\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"center", "Landroidx/compose/ui/geometry/Offset;", "Landroidx/compose/ui/geometry/Size;", "getCenter-uvyYCjk$annotations", "(J)V", "getCenter-uvyYCjk", "(J)J", "isSpecified", "", "isSpecified-uvyYCjk$annotations", "isSpecified-uvyYCjk", "(J)Z", "isUnspecified", "isUnspecified-uvyYCjk$annotations", "isUnspecified-uvyYCjk", "Size", "width", "", "height", "(FF)J", "lerp", "start", "stop", "fraction", "lerp-VgWVRYQ", "(JJF)J", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-TmRCtEA", "(JLkotlin/jvm/functions/Function0;)J", "times", "", "size", "times-d16Qtg0", "(DJ)J", "(FJ)J", "", "(IJ)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "toRect-uvyYCjk", "(J)Landroidx/compose/ui/geometry/Rect;", "ui-geometry_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SizeKt {
    public static final long Size(float f2, float f3) {
        return Size.m3611constructorimpl((Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m3630getCenteruvyYCjk(long j2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Size is unspecified");
        }
        return OffsetKt.Offset(Float.intBitsToFloat((int) (j2 >> 32)) / 2.0f, Float.intBitsToFloat((int) (j2 & 4294967295L)) / 2.0f);
    }

    /* renamed from: getCenter-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3631getCenteruvyYCjk$annotations(long j2) {
    }

    /* renamed from: isSpecified-uvyYCjk, reason: not valid java name */
    public static final boolean m3632isSpecifieduvyYCjk(long j2) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isSpecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3633isSpecifieduvyYCjk$annotations(long j2) {
    }

    /* renamed from: isUnspecified-uvyYCjk, reason: not valid java name */
    public static final boolean m3634isUnspecifieduvyYCjk(long j2) {
        return j2 == InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: isUnspecified-uvyYCjk$annotations, reason: not valid java name */
    public static /* synthetic */ void m3635isUnspecifieduvyYCjk$annotations(long j2) {
    }

    /* renamed from: lerp-VgWVRYQ, reason: not valid java name */
    public static final long m3636lerpVgWVRYQ(long j2, long j3, float f2) {
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || j3 == InlineClassHelperKt.UnspecifiedPackedFloats) {
            InlineClassHelperKt.throwIllegalStateException("Offset is unspecified");
        }
        float fLerp = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fLerp2 = MathHelpersKt.lerp(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return Size.m3611constructorimpl((Float.floatToRawIntBits(fLerp) << 32) | (Float.floatToRawIntBits(fLerp2) & 4294967295L));
    }

    /* renamed from: takeOrElse-TmRCtEA, reason: not valid java name */
    public static final long m3637takeOrElseTmRCtEA(long j2, Function0<Size> function0) {
        return j2 != InlineClassHelperKt.UnspecifiedPackedFloats ? j2 : function0.invoke().getPackedValue();
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3640timesd16Qtg0(int i2, long j2) {
        return Size.m3623times7Ah8Wj8(j2, i2);
    }

    /* renamed from: toRect-uvyYCjk, reason: not valid java name */
    public static final Rect m3641toRectuvyYCjk(long j2) {
        return RectKt.m3591Recttz77jQw(Offset.INSTANCE.m3567getZeroF1C5BW0(), j2);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3638timesd16Qtg0(double d2, long j2) {
        return Size.m3623times7Ah8Wj8(j2, (float) d2);
    }

    /* renamed from: times-d16Qtg0, reason: not valid java name */
    public static final long m3639timesd16Qtg0(float f2, long j2) {
        return Size.m3623times7Ah8Wj8(j2, f2);
    }
}
