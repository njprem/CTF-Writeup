package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001c\u0010\u001f\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010%\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016J&\u0010'\u001a\u00020(*\u00020)2\u0006\u0010\"\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020 H\u0016J\u001c\u0010/\u001a\u00020 *\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010&\u001a\u00020 H\u0016R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0007\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0006\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\"\u0010\u0005\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0016\u0010\u0010\"\u0004\b\u0017\u0010\u0012R\"\u0010\u0003\u001a\u00020\u0004X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R\u001e\u0010\u001a\u001a\u00020\u001b*\u00020\u001c8BX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/foundation/layout/SizeNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "minWidth", "Landroidx/compose/ui/unit/Dp;", "minHeight", "maxWidth", "maxHeight", "enforceIncoming", "", "(FFFFZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getEnforceIncoming", "()Z", "setEnforceIncoming", "(Z)V", "getMaxHeight-D9Ej5fM", "()F", "setMaxHeight-0680j_4", "(F)V", "F", "getMaxWidth-D9Ej5fM", "setMaxWidth-0680j_4", "getMinHeight-D9Ej5fM", "setMinHeight-0680j_4", "getMinWidth-D9Ej5fM", "setMinWidth-0680j_4", "targetConstraints", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/unit/Density;", "getTargetConstraints-OenEA2s", "(Landroidx/compose/ui/unit/Density;)J", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurable", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class SizeNode extends Modifier.Node implements LayoutModifierNode {
    private boolean enforceIncoming;
    private float maxHeight;
    private float maxWidth;
    private float minHeight;
    private float minWidth;

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(f2, f3, f4, f5, z);
    }

    /* renamed from: getTargetConstraints-OenEA2s, reason: not valid java name */
    private final long m695getTargetConstraintsOenEA2s(Density density) {
        int iCoerceAtLeast;
        int iCoerceAtLeast2;
        float f2 = this.maxWidth;
        Dp.Companion companion = Dp.INSTANCE;
        int i2 = 0;
        int iCoerceAtLeast3 = !Dp.m6238equalsimpl0(f2, companion.m6253getUnspecifiedD9Ej5fM()) ? RangesKt.coerceAtLeast(density.mo328roundToPx0680j_4(this.maxWidth), 0) : Integer.MAX_VALUE;
        int iCoerceAtLeast4 = !Dp.m6238equalsimpl0(this.maxHeight, companion.m6253getUnspecifiedD9Ej5fM()) ? RangesKt.coerceAtLeast(density.mo328roundToPx0680j_4(this.maxHeight), 0) : Integer.MAX_VALUE;
        if (Dp.m6238equalsimpl0(this.minWidth, companion.m6253getUnspecifiedD9Ej5fM()) || (iCoerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo328roundToPx0680j_4(this.minWidth), iCoerceAtLeast3), 0)) == Integer.MAX_VALUE) {
            iCoerceAtLeast = 0;
        }
        if (!Dp.m6238equalsimpl0(this.minHeight, companion.m6253getUnspecifiedD9Ej5fM()) && (iCoerceAtLeast2 = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(density.mo328roundToPx0680j_4(this.minHeight), iCoerceAtLeast4), 0)) != Integer.MAX_VALUE) {
            i2 = iCoerceAtLeast2;
        }
        return ConstraintsKt.Constraints(iCoerceAtLeast, iCoerceAtLeast3, i2, iCoerceAtLeast4);
    }

    public final boolean getEnforceIncoming() {
        return this.enforceIncoming;
    }

    /* renamed from: getMaxHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    /* renamed from: getMaxWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name and from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM695getTargetConstraintsOenEA2s = m695getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6183getHasFixedHeightimpl(jM695getTargetConstraintsOenEA2s) ? Constraints.m6185getMaxHeightimpl(jM695getTargetConstraintsOenEA2s) : ConstraintsKt.m6202constrainHeightK40F9xA(jM695getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM695getTargetConstraintsOenEA2s = m695getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6184getHasFixedWidthimpl(jM695getTargetConstraintsOenEA2s) ? Constraints.m6186getMaxWidthimpl(jM695getTargetConstraintsOenEA2s) : ConstraintsKt.m6203constrainWidthK40F9xA(jM695getTargetConstraintsOenEA2s, intrinsicMeasurable.maxIntrinsicWidth(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo54measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j2) {
        long jConstraints;
        long jM695getTargetConstraintsOenEA2s = m695getTargetConstraintsOenEA2s(measureScope);
        if (this.enforceIncoming) {
            jConstraints = ConstraintsKt.m6201constrainN9IONVI(j2, jM695getTargetConstraintsOenEA2s);
        } else {
            float f2 = this.minWidth;
            Dp.Companion companion = Dp.INSTANCE;
            jConstraints = ConstraintsKt.Constraints(!Dp.m6238equalsimpl0(f2, companion.m6253getUnspecifiedD9Ej5fM()) ? Constraints.m6188getMinWidthimpl(jM695getTargetConstraintsOenEA2s) : RangesKt.coerceAtMost(Constraints.m6188getMinWidthimpl(j2), Constraints.m6186getMaxWidthimpl(jM695getTargetConstraintsOenEA2s)), !Dp.m6238equalsimpl0(this.maxWidth, companion.m6253getUnspecifiedD9Ej5fM()) ? Constraints.m6186getMaxWidthimpl(jM695getTargetConstraintsOenEA2s) : RangesKt.coerceAtLeast(Constraints.m6186getMaxWidthimpl(j2), Constraints.m6188getMinWidthimpl(jM695getTargetConstraintsOenEA2s)), !Dp.m6238equalsimpl0(this.minHeight, companion.m6253getUnspecifiedD9Ej5fM()) ? Constraints.m6187getMinHeightimpl(jM695getTargetConstraintsOenEA2s) : RangesKt.coerceAtMost(Constraints.m6187getMinHeightimpl(j2), Constraints.m6185getMaxHeightimpl(jM695getTargetConstraintsOenEA2s)), !Dp.m6238equalsimpl0(this.maxHeight, companion.m6253getUnspecifiedD9Ej5fM()) ? Constraints.m6185getMaxHeightimpl(jM695getTargetConstraintsOenEA2s) : RangesKt.coerceAtLeast(Constraints.m6185getMaxHeightimpl(j2), Constraints.m6187getMinHeightimpl(jM695getTargetConstraintsOenEA2s)));
        }
        final Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(jConstraints);
        return MeasureScope.layout$default(measureScope, placeableMo5120measureBRTryo0.getWidth(), placeableMo5120measureBRTryo0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.SizeNode$measure$1
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
        long jM695getTargetConstraintsOenEA2s = m695getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6183getHasFixedHeightimpl(jM695getTargetConstraintsOenEA2s) ? Constraints.m6185getMaxHeightimpl(jM695getTargetConstraintsOenEA2s) : ConstraintsKt.m6202constrainHeightK40F9xA(jM695getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicHeight(i2));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        long jM695getTargetConstraintsOenEA2s = m695getTargetConstraintsOenEA2s(intrinsicMeasureScope);
        return Constraints.m6184getHasFixedWidthimpl(jM695getTargetConstraintsOenEA2s) ? Constraints.m6186getMaxWidthimpl(jM695getTargetConstraintsOenEA2s) : ConstraintsKt.m6203constrainWidthK40F9xA(jM695getTargetConstraintsOenEA2s, intrinsicMeasurable.minIntrinsicWidth(i2));
    }

    public final void setEnforceIncoming(boolean z) {
        this.enforceIncoming = z;
    }

    /* renamed from: setMaxHeight-0680j_4, reason: not valid java name */
    public final void m700setMaxHeight0680j_4(float f2) {
        this.maxHeight = f2;
    }

    /* renamed from: setMaxWidth-0680j_4, reason: not valid java name */
    public final void m701setMaxWidth0680j_4(float f2) {
        this.maxWidth = f2;
    }

    /* renamed from: setMinHeight-0680j_4, reason: not valid java name */
    public final void m702setMinHeight0680j_4(float f2) {
        this.minHeight = f2;
    }

    /* renamed from: setMinWidth-0680j_4, reason: not valid java name */
    public final void m703setMinWidth0680j_4(float f2) {
        this.minWidth = f2;
    }

    public /* synthetic */ SizeNode(float f2, float f3, float f4, float f5, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM() : f2, (i2 & 2) != 0 ? Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM() : f3, (i2 & 4) != 0 ? Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM() : f4, (i2 & 8) != 0 ? Dp.INSTANCE.m6253getUnspecifiedD9Ej5fM() : f5, z, null);
    }

    private SizeNode(float f2, float f3, float f4, float f5, boolean z) {
        this.minWidth = f2;
        this.minHeight = f3;
        this.maxWidth = f4;
        this.maxHeight = f5;
        this.enforceIncoming = z;
    }
}
