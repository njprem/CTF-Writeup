package androidx.compose.ui.draw;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.RenderEffectKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.TileMode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\f"}, d2 = {"blur", "Landroidx/compose/ui/Modifier;", "radius", "Landroidx/compose/ui/unit/Dp;", "edgeTreatment", "Landroidx/compose/ui/draw/BlurredEdgeTreatment;", "blur-F8QBwvs", "(Landroidx/compose/ui/Modifier;FLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "radiusX", "radiusY", "blur-1fqS-gw", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;)Landroidx/compose/ui/Modifier;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlurKt {
    /* renamed from: blur-1fqS-gw, reason: not valid java name */
    public static final Modifier m3426blur1fqSgw(Modifier modifier, final float f2, final float f3, final Shape shape) {
        int iM4165getDecal3opZhB0;
        final boolean z;
        if (shape != null) {
            iM4165getDecal3opZhB0 = TileMode.INSTANCE.m4164getClamp3opZhB0();
            z = true;
        } else {
            iM4165getDecal3opZhB0 = TileMode.INSTANCE.m4165getDecal3opZhB0();
            z = false;
        }
        final int i2 = iM4165getDecal3opZhB0;
        float f4 = 0;
        return ((Dp.m6232compareTo0680j_4(f2, Dp.m6233constructorimpl(f4)) <= 0 || Dp.m6232compareTo0680j_4(f3, Dp.m6233constructorimpl(f4)) <= 0) && !z) ? modifier : GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.draw.BlurKt$blur$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float fMo334toPx0680j_4 = graphicsLayerScope.mo334toPx0680j_4(f2);
                float fMo334toPx0680j_42 = graphicsLayerScope.mo334toPx0680j_4(f3);
                graphicsLayerScope.setRenderEffect((fMo334toPx0680j_4 <= 0.0f || fMo334toPx0680j_42 <= 0.0f) ? null : RenderEffectKt.m4099BlurEffect3YTHUZs(fMo334toPx0680j_4, fMo334toPx0680j_42, i2));
                Shape rectangleShape = shape;
                if (rectangleShape == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                graphicsLayerScope.setShape(rectangleShape);
                graphicsLayerScope.setClip(z);
            }
        });
    }

    /* renamed from: blur-1fqS-gw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3427blur1fqSgw$default(Modifier modifier, float f2, float f3, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3430boximpl(BlurredEdgeTreatment.INSTANCE.m3437getRectangleGoahg());
        }
        return m3426blur1fqSgw(modifier, f2, f3, blurredEdgeTreatment.m3436unboximpl());
    }

    /* renamed from: blur-F8QBwvs, reason: not valid java name */
    public static final Modifier m3428blurF8QBwvs(Modifier modifier, float f2, Shape shape) {
        return m3426blur1fqSgw(modifier, f2, f2, shape);
    }

    /* renamed from: blur-F8QBwvs$default, reason: not valid java name */
    public static /* synthetic */ Modifier m3429blurF8QBwvs$default(Modifier modifier, float f2, BlurredEdgeTreatment blurredEdgeTreatment, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            blurredEdgeTreatment = BlurredEdgeTreatment.m3430boximpl(BlurredEdgeTreatment.INSTANCE.m3437getRectangleGoahg());
        }
        return m3428blurF8QBwvs(modifier, f2, blurredEdgeTreatment.m3436unboximpl());
    }
}
