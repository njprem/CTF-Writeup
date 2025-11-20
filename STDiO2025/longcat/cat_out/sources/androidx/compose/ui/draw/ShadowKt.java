package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScopeKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a2\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"shadow", "Landroidx/compose/ui/Modifier;", "elevation", "Landroidx/compose/ui/unit/Dp;", "shape", "Landroidx/compose/ui/graphics/Shape;", "clip", "", "shadow-ziNgDLE", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;Z)Landroidx/compose/ui/Modifier;", "ambientColor", "Landroidx/compose/ui/graphics/Color;", "spotColor", "shadow-s4CzXII", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;ZJJ)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShadowKt {
    /* renamed from: shadow-s4CzXII, reason: not valid java name */
    public static final Modifier m3455shadows4CzXII(Modifier modifier, float f2, Shape shape, boolean z, long j2, long j3) {
        return (Dp.m6232compareTo0680j_4(f2, Dp.m6233constructorimpl((float) 0)) > 0 || z) ? modifier.then(new ShadowGraphicsLayerElement(f2, shape, z, j2, j3, null)) : modifier;
    }

    /* renamed from: shadow-s4CzXII$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3456shadows4CzXII$default(Modifier modifier, float f2, Shape shape, boolean z, long j2, long j3, int i2, Object obj) {
        boolean z2;
        Shape rectangleShape = (i2 & 2) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        if ((i2 & 4) != 0) {
            z2 = false;
            if (Dp.m6232compareTo0680j_4(f2, Dp.m6233constructorimpl(0)) > 0) {
                z2 = true;
            }
        } else {
            z2 = z;
        }
        return m3455shadows4CzXII(modifier, f2, rectangleShape, z2, (i2 & 8) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j2, (i2 & 16) != 0 ? GraphicsLayerScopeKt.getDefaultShadowColor() : j3);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replace with shadow which accepts ambientColor and spotColor parameters", replaceWith = @ReplaceWith(expression = "Modifier.shadow(elevation, shape, clip, DefaultShadowColor, DefaultShadowColor)", imports = {"androidx.compose.ui.draw"}))
    /* renamed from: shadow-ziNgDLE, reason: not valid java name */
    public static final /* synthetic */ Modifier m3457shadowziNgDLE(Modifier modifier, float f2, Shape shape, boolean z) {
        return m3455shadows4CzXII(modifier, f2, shape, z, GraphicsLayerScopeKt.getDefaultShadowColor(), GraphicsLayerScopeKt.getDefaultShadowColor());
    }

    /* renamed from: shadow-ziNgDLE$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3458shadowziNgDLE$default(Modifier modifier, float f2, Shape shape, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i2 & 4) != 0) {
            z = false;
            if (Dp.m6232compareTo0680j_4(f2, Dp.m6233constructorimpl(0)) > 0) {
                z = true;
            }
        }
        return m3457shadowziNgDLE(modifier, f2, shape, z);
    }
}
