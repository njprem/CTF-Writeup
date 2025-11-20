package androidx.compose.ui.layout;

import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.node.MotionReferencePlacementDelegate;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e\u0018\u00010$¢\u0006\u0002\b&H$ø\u0001\u0000¢\u0006\u0004\b'\u0010(J*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0006\u0010)\u001a\u00020*H\u0014ø\u0001\u0000¢\u0006\u0004\b'\u0010+R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "()J", "J", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "onMeasuredSizeChanged", "", "placeAt", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "PlacementScope", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m6371getZeronOccac();

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt.coerceIn(IntSize.m6403getWidthimpl(this.measuredSize), Constraints.m6188getMinWidthimpl(this.measurementConstraints), Constraints.m6186getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt.coerceIn(IntSize.m6402getHeightimpl(this.measuredSize), Constraints.m6187getMinHeightimpl(this.measurementConstraints), Constraints.m6185getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m6403getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m6402getHeightimpl(this.measuredSize)) / 2);
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: not valid java name and from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m6402getHeightimpl(this.measuredSize);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: not valid java name and from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    @Override // androidx.compose.ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m6403getWidthimpl(this.measuredSize);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    public final int getWidth() {
        return this.width;
    }

    /* renamed from: placeAt-f8xVGno, reason: not valid java name */
    public void mo5181placeAtf8xVGno(long position, float zIndex, GraphicsLayer layer) {
        mo5121placeAtf8xVGno(position, zIndex, (Function1<? super GraphicsLayerScope, Unit>) null);
    }

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo5121placeAtf8xVGno(long position, float zIndex, Function1<? super GraphicsLayerScope, Unit> layerBlock);

    /* renamed from: setMeasuredSize-ozmzZPI, reason: not valid java name */
    public final void m5182setMeasuredSizeozmzZPI(long j2) {
        if (IntSize.m6401equalsimpl0(this.measuredSize, j2)) {
            return;
        }
        this.measuredSize = j2;
        onMeasuredSizeChanged();
    }

    /* renamed from: setMeasurementConstraints-BRTryo0, reason: not valid java name */
    public final void m5183setMeasurementConstraintsBRTryo0(long j2) {
        if (Constraints.m6179equalsimpl0(this.measurementConstraints, j2)) {
            return;
        }
        this.measurementConstraints = j2;
        onMeasuredSizeChanged();
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0011\u001a\u00020\u00122\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0017H\u0016J\f\u0010\u001a\u001a\u00020\u0012*\u00020\u001bH\u0002J&\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b \u0010!J$\u0010\u001c\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017JD\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010(J/\u0010$\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b'\u0010+JD\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u001b\b\b\u0010%\u001a\u0015\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0014¢\u0006\u0002\b\u0015H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010(J/\u0010,\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\u0006\u0010)\u001a\u00020*H\u0080\bø\u0001\u0000¢\u0006\u0004\b-\u0010+J&\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b/\u0010!J$\u0010.\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J.\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b1\u00102JA\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b1\u0010(J,\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00100\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015J.\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017ø\u0001\u0000¢\u0006\u0004\b4\u00102JA\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015ø\u0001\u0000¢\u0006\u0004\b4\u0010(J,\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010\u001f\u001a\u00020\u0017J?\u00103\u001a\u00020\u0012*\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u000e2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u0019\b\u0002\u0010%\u001a\u0013\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0002\b\u0015R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX¤\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "motionFrameOfReferencePlacement", "", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "withMotionFrameOfReferencePlacement", "", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "current", "", "Landroidx/compose/ui/layout/Ruler;", "defaultValue", "handleMotionFrameOfReferencePlacement", "Landroidx/compose/ui/layout/Placeable;", "place", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "layer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "(Landroidx/compose/ui/layout/Placeable;JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "(Landroidx/compose/ui/layout/Placeable;JLandroidx/compose/ui/graphics/layer/GraphicsLayer;F)V", "placeWithLayer", "placeWithLayer-aW-9-wM", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @PlacementScopeMarker
    public static abstract class PlacementScope {
        public static final int $stable = 8;
        private boolean motionFrameOfReferencePlacement;

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public final void handleMotionFrameOfReferencePlacement(Placeable placeable) {
            if (placeable instanceof MotionReferencePlacementDelegate) {
                ((MotionReferencePlacementDelegate) placeable).setPlacedUnderMotionFrameOfReference(this.motionFrameOfReferencePlacement);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.place(placeable, i2, i3, f2);
        }

        /* renamed from: place-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5184place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5190place70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelative(placeable, i2, i3, f2);
        }

        /* renamed from: placeRelative-70tqf50$default, reason: not valid java name */
        public static /* synthetic */ void m5185placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5195placeRelative70tqf50(placeable, j2, f2);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i4 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, f3, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5186placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5196placeRelativeWithLayeraW9wM(placeable, j2, f3, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, float f2, Function1 function1, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 4) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i4 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i2, i3, f3, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5188placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, float f2, Function1 function1, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 2) != 0) {
                f2 = 0.0f;
            }
            float f3 = f2;
            if ((i2 & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m5198placeWithLayeraW9wM(placeable, j2, f3, (Function1<? super GraphicsLayerScope, Unit>) function1);
        }

        public float current(Ruler ruler, float f2) {
            return f2;
        }

        public LayoutCoordinates getCoordinates() {
            return null;
        }

        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        public final void place(Placeable placeable, int i2, int i3, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: place-70tqf50, reason: not valid java name */
        public final void m5190place70tqf50(Placeable placeable, long j2, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5192placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5194placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            }
        }

        public final void placeRelative(Placeable placeable, int i2, int i3, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(jIntOffset), IntOffset.m6362getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        /* renamed from: placeRelative-70tqf50, reason: not valid java name */
        public final void m5195placeRelative70tqf50(Placeable placeable, long j2, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, (Function1<? super GraphicsLayerScope, Unit>) null);
            }
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(jIntOffset), IntOffset.m6362getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, function1);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5196placeRelativeWithLayeraW9wM(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
            }
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5198placeWithLayeraW9wM(Placeable placeable, long j2, float f2, Function1<? super GraphicsLayerScope, Unit> function1) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5121placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, function1);
        }

        public final void withMotionFrameOfReferencePlacement(Function1<? super PlacementScope, Unit> block) {
            this.motionFrameOfReferencePlacement = true;
            block.invoke(this);
            this.motionFrameOfReferencePlacement = false;
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeRelativeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5187placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5197placeRelativeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i4 & 8) != 0) {
                f2 = 0.0f;
            }
            placementScope.placeWithLayer(placeable, i2, i3, graphicsLayer, f2);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default, reason: not valid java name */
        public static /* synthetic */ void m5189placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2, int i2, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i2 & 4) != 0) {
                f2 = 0.0f;
            }
            placementScope.m5199placeWithLayeraW9wM(placeable, j2, graphicsLayer, f2);
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5191placeApparentToRealOffsetaW9wM$ui_release(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* renamed from: placeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5199placeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        public final void placeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            handleMotionFrameOfReferencePlacement(placeable);
            placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release, reason: not valid java name */
        public final void m5193placeAutoMirroredaW9wM$ui_release(Placeable placeable, long j2, float f2, GraphicsLayer graphicsLayer) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM, reason: not valid java name */
        public final void m5197placeRelativeWithLayeraW9wM(Placeable placeable, long j2, GraphicsLayer graphicsLayer, float f2) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(j2, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(j2), IntOffset.m6362getYimpl(j2));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }

        public final void placeRelativeWithLayer(Placeable placeable, int i2, int i3, GraphicsLayer graphicsLayer, float f2) {
            long jIntOffset = IntOffsetKt.IntOffset(i2, i3);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset, placeable.apparentToRealOffset), f2, graphicsLayer);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m6361getXimpl(jIntOffset), IntOffset.m6362getYimpl(jIntOffset));
                handleMotionFrameOfReferencePlacement(placeable);
                placeable.mo5181placeAtf8xVGno(IntOffset.m6365plusqkQi6aY(jIntOffset2, placeable.apparentToRealOffset), f2, graphicsLayer);
            }
        }
    }
}
