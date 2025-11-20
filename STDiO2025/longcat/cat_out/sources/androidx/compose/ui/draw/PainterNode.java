package androidx.compose.ui.draw;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactorKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B?\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010J\u001a\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101J\u001a\u00102\u001a\u0002032\u0006\u00104\u001a\u000203H\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00101J\b\u00106\u001a\u000207H\u0016J\f\u00108\u001a\u000209*\u00020:H\u0016J\u0016\u0010;\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\u00020\u0007*\u00020.H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010=J\u001c\u0010@\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010F\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016J&\u0010H\u001a\u00020I*\u00020J2\u0006\u0010C\u001a\u00020K2\u0006\u00104\u001a\u000203H\u0016ø\u0001\u0000¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020AH\u0016J\u001c\u0010O\u001a\u00020A*\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010G\u001a\u00020AH\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010'\"\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006P"}, d2 = {"Landroidx/compose/ui/draw/PainterNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "painter", "Landroidx/compose/ui/graphics/painter/Painter;", "sizeToIntrinsics", "", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "(Landroidx/compose/ui/graphics/painter/Painter;ZLandroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;)V", "getAlignment", "()Landroidx/compose/ui/Alignment;", "setAlignment", "(Landroidx/compose/ui/Alignment;)V", "getAlpha", "()F", "setAlpha", "(F)V", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "getContentScale", "()Landroidx/compose/ui/layout/ContentScale;", "setContentScale", "(Landroidx/compose/ui/layout/ContentScale;)V", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "setPainter", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "shouldAutoInvalidate", "getShouldAutoInvalidate", "()Z", "getSizeToIntrinsics", "setSizeToIntrinsics", "(Z)V", "useIntrinsicSize", "getUseIntrinsicSize", "calculateScaledSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "calculateScaledSize-E7KxVPU", "(J)J", "modifyConstraints", "Landroidx/compose/ui/unit/Constraints;", "constraints", "modifyConstraints-ZezNO4M", "toString", "", "draw", "", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "hasSpecifiedAndFiniteHeight", "hasSpecifiedAndFiniteHeight-uvyYCjk", "(J)Z", "hasSpecifiedAndFiniteWidth", "hasSpecifiedAndFiniteWidth-uvyYCjk", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PainterNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode {
    private Alignment alignment;
    private float alpha;
    private ColorFilter colorFilter;
    private ContentScale contentScale;
    private Painter painter;
    private boolean sizeToIntrinsics;

    public /* synthetic */ PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(painter, z, (i2 & 4) != 0 ? Alignment.INSTANCE.getCenter() : alignment, (i2 & 8) != 0 ? ContentScale.INSTANCE.getInside() : contentScale, (i2 & 16) != 0 ? 1.0f : f2, (i2 & 32) != 0 ? null : colorFilter);
    }

    /* renamed from: calculateScaledSize-E7KxVPU, reason: not valid java name */
    private final long m3443calculateScaledSizeE7KxVPU(long dstSize) {
        if (!getUseIntrinsicSize()) {
            return dstSize;
        }
        long jSize = SizeKt.Size(!m3445hasSpecifiedAndFiniteWidthuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m3620getWidthimpl(dstSize) : Size.m3620getWidthimpl(this.painter.getIntrinsicSize()), !m3444hasSpecifiedAndFiniteHeightuvyYCjk(this.painter.getIntrinsicSize()) ? Size.m3617getHeightimpl(dstSize) : Size.m3617getHeightimpl(this.painter.getIntrinsicSize()));
        return (Size.m3620getWidthimpl(dstSize) == 0.0f || Size.m3617getHeightimpl(dstSize) == 0.0f) ? Size.INSTANCE.m3629getZeroNHjbRc() : ScaleFactorKt.m5224timesUQTWf7w(jSize, this.contentScale.mo5111computeScaleFactorH7hwNQA(jSize, dstSize));
    }

    private final boolean getUseIntrinsicSize() {
        return this.sizeToIntrinsics && this.painter.getIntrinsicSize() != InlineClassHelperKt.UnspecifiedPackedFloats;
    }

    /* renamed from: hasSpecifiedAndFiniteHeight-uvyYCjk, reason: not valid java name */
    private final boolean m3444hasSpecifiedAndFiniteHeightuvyYCjk(long j2) {
        if (Size.m3616equalsimpl0(j2, Size.INSTANCE.m3628getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM3617getHeightimpl = Size.m3617getHeightimpl(j2);
        return (Float.isInfinite(fM3617getHeightimpl) || Float.isNaN(fM3617getHeightimpl)) ? false : true;
    }

    /* renamed from: hasSpecifiedAndFiniteWidth-uvyYCjk, reason: not valid java name */
    private final boolean m3445hasSpecifiedAndFiniteWidthuvyYCjk(long j2) {
        if (Size.m3616equalsimpl0(j2, Size.INSTANCE.m3628getUnspecifiedNHjbRc())) {
            return false;
        }
        float fM3620getWidthimpl = Size.m3620getWidthimpl(j2);
        return (Float.isInfinite(fM3620getWidthimpl) || Float.isNaN(fM3620getWidthimpl)) ? false : true;
    }

    /* renamed from: modifyConstraints-ZezNO4M, reason: not valid java name */
    private final long m3446modifyConstraintsZezNO4M(long constraints) {
        boolean z = false;
        boolean z2 = Constraints.m6182getHasBoundedWidthimpl(constraints) && Constraints.m6181getHasBoundedHeightimpl(constraints);
        if (Constraints.m6184getHasFixedWidthimpl(constraints) && Constraints.m6183getHasFixedHeightimpl(constraints)) {
            z = true;
        }
        if ((!getUseIntrinsicSize() && z2) || z) {
            return Constraints.m6177copyZbe2FdA$default(constraints, Constraints.m6186getMaxWidthimpl(constraints), 0, Constraints.m6185getMaxHeightimpl(constraints), 0, 10, null);
        }
        long jMo4461getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        long jM3443calculateScaledSizeE7KxVPU = m3443calculateScaledSizeE7KxVPU(SizeKt.Size(ConstraintsKt.m6203constrainWidthK40F9xA(constraints, m3445hasSpecifiedAndFiniteWidthuvyYCjk(jMo4461getIntrinsicSizeNHjbRc) ? Math.round(Size.m3620getWidthimpl(jMo4461getIntrinsicSizeNHjbRc)) : Constraints.m6188getMinWidthimpl(constraints)), ConstraintsKt.m6202constrainHeightK40F9xA(constraints, m3444hasSpecifiedAndFiniteHeightuvyYCjk(jMo4461getIntrinsicSizeNHjbRc) ? Math.round(Size.m3617getHeightimpl(jMo4461getIntrinsicSizeNHjbRc)) : Constraints.m6187getMinHeightimpl(constraints))));
        return Constraints.m6177copyZbe2FdA$default(constraints, ConstraintsKt.m6203constrainWidthK40F9xA(constraints, Math.round(Size.m3620getWidthimpl(jM3443calculateScaledSizeE7KxVPU))), 0, ConstraintsKt.m6202constrainHeightK40F9xA(constraints, Math.round(Size.m3617getHeightimpl(jM3443calculateScaledSizeE7KxVPU))), 0, 10, null);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) throws Throwable {
        ContentDrawScope contentDrawScope2;
        long jMo4461getIntrinsicSizeNHjbRc = this.painter.getIntrinsicSize();
        long jSize = SizeKt.Size(m3445hasSpecifiedAndFiniteWidthuvyYCjk(jMo4461getIntrinsicSizeNHjbRc) ? Size.m3620getWidthimpl(jMo4461getIntrinsicSizeNHjbRc) : Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()), m3444hasSpecifiedAndFiniteHeightuvyYCjk(jMo4461getIntrinsicSizeNHjbRc) ? Size.m3617getHeightimpl(jMo4461getIntrinsicSizeNHjbRc) : Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc()));
        long jM3629getZeroNHjbRc = (Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) == 0.0f || Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc()) == 0.0f) ? Size.INSTANCE.m3629getZeroNHjbRc() : ScaleFactorKt.m5224timesUQTWf7w(jSize, this.contentScale.mo5111computeScaleFactorH7hwNQA(jSize, contentDrawScope.mo4342getSizeNHjbRc()));
        long jMo3397alignKFBX0sM = this.alignment.mo3397alignKFBX0sM(IntSizeKt.IntSize(Math.round(Size.m3620getWidthimpl(jM3629getZeroNHjbRc)), Math.round(Size.m3617getHeightimpl(jM3629getZeroNHjbRc))), IntSizeKt.IntSize(Math.round(Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc())), Math.round(Size.m3617getHeightimpl(contentDrawScope.mo4342getSizeNHjbRc()))), contentDrawScope.getLayoutDirection());
        float fM6361getXimpl = IntOffset.m6361getXimpl(jMo3397alignKFBX0sM);
        float fM6362getYimpl = IntOffset.m6362getYimpl(jMo3397alignKFBX0sM);
        contentDrawScope.getDrawContext().getTransform().translate(fM6361getXimpl, fM6362getYimpl);
        try {
            contentDrawScope2 = contentDrawScope;
            try {
                this.painter.m4467drawx_KDEd0(contentDrawScope2, jM3629getZeroNHjbRc, this.alpha, this.colorFilter);
                contentDrawScope2.getDrawContext().getTransform().translate(-fM6361getXimpl, -fM6362getYimpl);
                contentDrawScope2.drawContent();
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                contentDrawScope2.getDrawContext().getTransform().translate(-fM6361getXimpl, -fM6362getYimpl);
                throw th2;
            }
        } catch (Throwable th3) {
            th = th3;
            contentDrawScope2 = contentDrawScope;
        }
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    public final float getAlpha() {
        return this.alpha;
    }

    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    public final ContentScale getContentScale() {
        return this.contentScale;
    }

    public final Painter getPainter() {
        return this.painter;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    public final boolean getSizeToIntrinsics() {
        return this.sizeToIntrinsics;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicHeight(i2);
        }
        long jM3446modifyConstraintsZezNO4M = m3446modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m6187getMinHeightimpl(jM3446modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.maxIntrinsicWidth(i2);
        }
        long jM3446modifyConstraintsZezNO4M = m3446modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m6188getMinWidthimpl(jM3446modifyConstraintsZezNO4M), intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo54measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(m3446modifyConstraintsZezNO4M(j2));
        return MeasureScope.layout$default(measureScope, placeableMo5120measureBRTryo0.getWidth(), placeableMo5120measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.draw.PainterNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo5120measureBRTryo0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicHeight(i2);
        }
        long jM3446modifyConstraintsZezNO4M = m3446modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, i2, 0, 0, 13, null));
        return Math.max(Constraints.m6187getMinHeightimpl(jM3446modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!getUseIntrinsicSize()) {
            return intrinsicMeasurable.minIntrinsicWidth(i2);
        }
        long jM3446modifyConstraintsZezNO4M = m3446modifyConstraintsZezNO4M(ConstraintsKt.Constraints$default(0, 0, 0, i2, 7, null));
        return Math.max(Constraints.m6188getMinWidthimpl(jM3446modifyConstraintsZezNO4M), intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    public final void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public final void setAlpha(float f2) {
        this.alpha = f2;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.colorFilter = colorFilter;
    }

    public final void setContentScale(ContentScale contentScale) {
        this.contentScale = contentScale;
    }

    public final void setPainter(Painter painter) {
        this.painter = painter;
    }

    public final void setSizeToIntrinsics(boolean z) {
        this.sizeToIntrinsics = z;
    }

    public String toString() {
        return "PainterModifier(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }

    public PainterNode(Painter painter, boolean z, Alignment alignment, ContentScale contentScale, float f2, ColorFilter colorFilter) {
        this.painter = painter;
        this.sizeToIntrinsics = z;
        this.alignment = alignment;
        this.contentScale = contentScale;
        this.alpha = f2;
        this.colorFilter = colorFilter;
    }
}
