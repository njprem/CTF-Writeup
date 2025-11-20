package androidx.compose.foundation;

import J.d;
import androidx.compose.ui.draw.CacheDrawModifierNode;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.draw.DrawResult;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001e\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002JF\u0010'\u001a\u00020\u001f*\u00020 2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010!\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0002ø\u0001\u0000¢\u0006\u0004\b-\u0010.R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R,\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/foundation/BorderModifierNode;", "Landroidx/compose/ui/node/DelegatingNode;", "widthParameter", "Landroidx/compose/ui/unit/Dp;", "brushParameter", "Landroidx/compose/ui/graphics/Brush;", "shapeParameter", "Landroidx/compose/ui/graphics/Shape;", "(FLandroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Shape;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "borderCache", "Landroidx/compose/foundation/BorderCache;", "value", "brush", "getBrush", "()Landroidx/compose/ui/graphics/Brush;", "setBrush", "(Landroidx/compose/ui/graphics/Brush;)V", "drawWithCacheModifierNode", "Landroidx/compose/ui/draw/CacheDrawModifierNode;", "shape", "getShape", "()Landroidx/compose/ui/graphics/Shape;", "setShape", "(Landroidx/compose/ui/graphics/Shape;)V", "width", "getWidth-D9Ej5fM", "()F", "setWidth-0680j_4", "(F)V", "F", "drawGenericBorder", "Landroidx/compose/ui/draw/DrawResult;", "Landroidx/compose/ui/draw/CacheDrawScope;", "outline", "Landroidx/compose/ui/graphics/Outline$Generic;", "fillArea", "", "strokeWidth", "", "drawRoundRectBorder", "Landroidx/compose/ui/graphics/Outline$Rounded;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "borderSize", "Landroidx/compose/ui/geometry/Size;", "drawRoundRectBorder-JqoCqck", "(Landroidx/compose/ui/draw/CacheDrawScope;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Outline$Rounded;JJZF)Landroidx/compose/ui/draw/DrawResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BorderModifierNode extends DelegatingNode {
    public static final int $stable = 8;
    private BorderCache borderCache;
    private Brush brush;
    private final CacheDrawModifierNode drawWithCacheModifierNode;
    private Shape shape;
    private float width;

    public /* synthetic */ BorderModifierNode(float f2, Brush brush, Shape shape, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, brush, shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    /* JADX WARN: Type inference failed for: r24v3, types: [T, androidx.compose.ui.graphics.ImageBitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.draw.DrawResult drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope r39, final androidx.compose.ui.graphics.Brush r40, final androidx.compose.ui.graphics.Outline.Generic r41, boolean r42, float r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.BorderModifierNode.drawGenericBorder(androidx.compose.ui.draw.CacheDrawScope, androidx.compose.ui.graphics.Brush, androidx.compose.ui.graphics.Outline$Generic, boolean, float):androidx.compose.ui.draw.DrawResult");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawRoundRectBorder-JqoCqck, reason: not valid java name */
    public final DrawResult m214drawRoundRectBorderJqoCqck(CacheDrawScope cacheDrawScope, final Brush brush, Outline.Rounded rounded, final long j2, final long j3, final boolean z, final float f2) {
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            final long jM3601getTopLeftCornerRadiuskKHJgLs = rounded.getRoundRect().m3601getTopLeftCornerRadiuskKHJgLs();
            final float f3 = f2 / 2;
            final Stroke stroke = new Stroke(f2, 0.0f, 0, 0, null, 30, null);
            return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                    invoke2(contentDrawScope);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(ContentDrawScope contentDrawScope) {
                    contentDrawScope.drawContent();
                    if (z) {
                        DrawScope.m4337drawRoundRectZuiqVtQ$default(contentDrawScope, brush, 0L, 0L, jM3601getTopLeftCornerRadiuskKHJgLs, 0.0f, null, null, 0, 246, null);
                        return;
                    }
                    float fM3526getXimpl = CornerRadius.m3526getXimpl(jM3601getTopLeftCornerRadiuskKHJgLs);
                    float f4 = f3;
                    if (fM3526getXimpl >= f4) {
                        DrawScope.m4337drawRoundRectZuiqVtQ$default(contentDrawScope, brush, j2, j3, BorderKt.m212shrinkKibmq7A(jM3601getTopLeftCornerRadiuskKHJgLs, f4), 0.0f, stroke, null, 0, 208, null);
                        return;
                    }
                    float f5 = f2;
                    float fM3620getWidthimpl = Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - f2;
                    float fM3617getHeightimpl = Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc()) - f2;
                    int iM3780getDifferencertfAjoo = ClipOp.INSTANCE.m3780getDifferencertfAjoo();
                    Brush brush2 = brush;
                    long j4 = jM3601getTopLeftCornerRadiuskKHJgLs;
                    DrawContext drawContext = contentDrawScope.getDrawContext();
                    long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
                    drawContext.getCanvas().save();
                    try {
                        drawContext.getTransform().mo4266clipRectN_I0leg(f5, f5, fM3620getWidthimpl, fM3617getHeightimpl, iM3780getDifferencertfAjoo);
                        DrawScope.m4337drawRoundRectZuiqVtQ$default(contentDrawScope, brush2, 0L, 0L, j4, 0.0f, null, null, 0, 246, null);
                    } finally {
                        d.y(drawContext, jMo4263getSizeNHjbRc);
                    }
                }
            });
        }
        if (this.borderCache == null) {
            this.borderCache = new BorderCache(null, null, null, null, 15, null);
        }
        BorderCache borderCache = this.borderCache;
        Intrinsics.checkNotNull(borderCache);
        final Path pathCreateRoundRectPath = BorderKt.createRoundRectPath(borderCache.obtainPath(), rounded.getRoundRect(), f2, z);
        return cacheDrawScope.onDrawWithContent(new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.foundation.BorderModifierNode$drawRoundRectBorder$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                contentDrawScope.drawContent();
                DrawScope.m4331drawPathGBMwjPU$default(contentDrawScope, pathCreateRoundRectPath, brush, 0.0f, null, null, 0, 60, null);
            }
        });
    }

    public final Brush getBrush() {
        return this.brush;
    }

    public final Shape getShape() {
        return this.shape;
    }

    /* renamed from: getWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void setBrush(Brush brush) {
        if (Intrinsics.areEqual(this.brush, brush)) {
            return;
        }
        this.brush = brush;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    public final void setShape(Shape shape) {
        if (Intrinsics.areEqual(this.shape, shape)) {
            return;
        }
        this.shape = shape;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    /* renamed from: setWidth-0680j_4, reason: not valid java name */
    public final void m216setWidth0680j_4(float f2) {
        if (Dp.m6238equalsimpl0(this.width, f2)) {
            return;
        }
        this.width = f2;
        this.drawWithCacheModifierNode.invalidateDrawCache();
    }

    private BorderModifierNode(float f2, Brush brush, Shape shape) {
        this.width = f2;
        this.brush = brush;
        this.shape = shape;
        this.drawWithCacheModifierNode = (CacheDrawModifierNode) delegate(DrawModifierKt.CacheDrawModifierNode(new Function1<CacheDrawScope, DrawResult>() { // from class: androidx.compose.foundation.BorderModifierNode$drawWithCacheModifierNode$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DrawResult invoke(CacheDrawScope cacheDrawScope) {
                if (cacheDrawScope.mo334toPx0680j_4(this.this$0.getWidth()) < 0.0f || Size.m3619getMinDimensionimpl(cacheDrawScope.m3441getSizeNHjbRc()) <= 0.0f) {
                    return BorderKt.drawContentWithoutBorder(cacheDrawScope);
                }
                float f3 = 2;
                float fMin = Math.min(Dp.m6238equalsimpl0(this.this$0.getWidth(), Dp.INSTANCE.m6251getHairlineD9Ej5fM()) ? 1.0f : (float) Math.ceil(cacheDrawScope.mo334toPx0680j_4(this.this$0.getWidth())), (float) Math.ceil(Size.m3619getMinDimensionimpl(cacheDrawScope.m3441getSizeNHjbRc()) / f3));
                float f4 = fMin / f3;
                long jOffset = OffsetKt.Offset(f4, f4);
                long jSize = SizeKt.Size(Size.m3620getWidthimpl(cacheDrawScope.m3441getSizeNHjbRc()) - fMin, Size.m3617getHeightimpl(cacheDrawScope.m3441getSizeNHjbRc()) - fMin);
                boolean z = f3 * fMin > Size.m3619getMinDimensionimpl(cacheDrawScope.m3441getSizeNHjbRc());
                Outline outlineMo245createOutlinePq9zytI = this.this$0.getShape().mo245createOutlinePq9zytI(cacheDrawScope.m3441getSizeNHjbRc(), cacheDrawScope.getLayoutDirection(), cacheDrawScope);
                if (outlineMo245createOutlinePq9zytI instanceof Outline.Generic) {
                    BorderModifierNode borderModifierNode = this.this$0;
                    return borderModifierNode.drawGenericBorder(cacheDrawScope, borderModifierNode.getBrush(), (Outline.Generic) outlineMo245createOutlinePq9zytI, z, fMin);
                }
                if (outlineMo245createOutlinePq9zytI instanceof Outline.Rounded) {
                    BorderModifierNode borderModifierNode2 = this.this$0;
                    return borderModifierNode2.m214drawRoundRectBorderJqoCqck(cacheDrawScope, borderModifierNode2.getBrush(), (Outline.Rounded) outlineMo245createOutlinePq9zytI, jOffset, jSize, z, fMin);
                }
                if (outlineMo245createOutlinePq9zytI instanceof Outline.Rectangle) {
                    return BorderKt.m211drawRectBorderNsqcLGU(cacheDrawScope, this.this$0.getBrush(), jOffset, jSize, z, fMin);
                }
                throw new NoWhenBranchMatchedException();
            }
        }));
    }
}
