package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.DegreesKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0000\u001a\u00020\u0003H\u0086\b\u001a!\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a)\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a)\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000e"}, d2 = {"inset", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "", "horizontal", "vertical", "rotateRad", "radians", "pivot", "Landroidx/compose/ui/geometry/Offset;", "rotateRad-0AR0LA0", "(Landroidx/compose/ui/graphics/drawscope/DrawTransform;FJ)V", "scale", "scale-0AR0LA0", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DrawTransformKt {
    public static final void inset(DrawTransform drawTransform, float f2, float f3) {
        drawTransform.inset(f2, f3, f2, f3);
    }

    public static /* synthetic */ void inset$default(DrawTransform drawTransform, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        drawTransform.inset(f2, f3, f2, f3);
    }

    /* renamed from: rotateRad-0AR0LA0, reason: not valid java name */
    public static final void m4407rotateRad0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo4269rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* renamed from: rotateRad-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4408rotateRad0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawTransform.mo4267getCenterF1C5BW0();
        }
        drawTransform.mo4269rotateUv8p0NA(DegreesKt.degrees(f2), j2);
    }

    /* renamed from: scale-0AR0LA0, reason: not valid java name */
    public static final void m4409scale0AR0LA0(DrawTransform drawTransform, float f2, long j2) {
        drawTransform.mo4270scale0AR0LA0(f2, f2, j2);
    }

    /* renamed from: scale-0AR0LA0$default, reason: not valid java name */
    public static /* synthetic */ void m4410scale0AR0LA0$default(DrawTransform drawTransform, float f2, long j2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j2 = drawTransform.mo4267getCenterF1C5BW0();
        }
        drawTransform.mo4270scale0AR0LA0(f2, f2, j2);
    }

    public static final void inset(DrawTransform drawTransform, float f2) {
        drawTransform.inset(f2, f2, f2, f2);
    }
}
