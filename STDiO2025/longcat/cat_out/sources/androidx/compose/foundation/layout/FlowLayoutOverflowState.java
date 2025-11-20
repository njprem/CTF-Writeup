package androidx.compose.foundation.layout;

import J.d;
import androidx.compose.foundation.layout.FlowLayoutBuildingBlocks;
import androidx.compose.foundation.layout.FlowLayoutOverflow;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import j.C0659l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ/\u0010\u0010\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J6\u0010\u001e\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u0016\u001a\u0004\u0018\u00010!2\b\u0010\u0017\u001a\u0004\u0018\u00010!2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\"J\\\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001928\u0010(\u001a4\u0012\u0013\u0012\u00110\t¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b('\u0012\u0006\u0012\u0004\u0018\u00010!0#H\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010-\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u00100\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00102\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b1\u0010/J.\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010/J\u001a\u0010:\u001a\u00020\t2\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010<\u001a\u0004\b=\u0010,R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010>\u001a\u0004\b?\u0010/R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010>\u001a\u0004\b@\u0010/R\"\u0010A\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010>\u001a\u0004\bB\u0010/\"\u0004\bC\u0010DR\"\u0010E\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010>\u001a\u0004\bF\u0010/\"\u0004\bG\u0010DR\u0018\u0010\u0016\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010HR\u0018\u0010J\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0018\u0010\u0017\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010KR\u001e\u0010M\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bM\u0010NR\u001e\u0010O\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\n\u0004\bO\u0010NRJ\u0010(\u001a6\u0012\u0013\u0012\u00110\t¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(P\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010QR\u0014\u0010P\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bR\u0010/\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006S"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)V", "", "hasNext", "lineIndex", "totalCrossAxisSize", "Lj/l;", "ellipsisSize-F35zm-w$foundation_layout_release", "(ZII)Lj/l;", "ellipsisSize", "Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo$foundation_layout_release", "(ZII)Landroidx/compose/foundation/layout/FlowLayoutBuildingBlocks$WrapEllipsisInfo;", "ellipsisInfo", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "seeMoreMeasurable", "collapseMeasurable", "isHorizontal", "Landroidx/compose/ui/unit/Constraints;", "constraints", "", "setOverflowMeasurables--hBUhpc$foundation_layout_release", "(Landroidx/compose/ui/layout/IntrinsicMeasurable;Landroidx/compose/ui/layout/IntrinsicMeasurable;ZJ)V", "setOverflowMeasurables", "Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;", "measurePolicy", "Landroidx/compose/ui/layout/Measurable;", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;Landroidx/compose/ui/layout/Measurable;Landroidx/compose/ui/layout/Measurable;J)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "isExpandable", "numberOfItemsShown", "getOverflowMeasurable", "setOverflowMeasurables-VKLhPVY$foundation_layout_release", "(Landroidx/compose/foundation/layout/FlowLineMeasurePolicy;JLkotlin/jvm/functions/Function2;)V", "component1$foundation_layout_release", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "component1", "component2$foundation_layout_release", "()I", "component2", "component3$foundation_layout_release", "component3", "copy", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;II)Landroidx/compose/foundation/layout/FlowLayoutOverflowState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout_release", "I", "getMinLinesToShowCollapse$foundation_layout_release", "getMinCrossAxisSizeToShowCollapse$foundation_layout_release", "itemShown", "getItemShown$foundation_layout_release", "setItemShown$foundation_layout_release", "(I)V", "itemCount", "getItemCount$foundation_layout_release", "setItemCount$foundation_layout_release", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/compose/ui/layout/Placeable;", "seeMorePlaceable", "Landroidx/compose/ui/layout/Placeable;", "collapsePlaceable", "seeMoreSize", "Lj/l;", "collapseSize", "noOfItemsShown", "Lkotlin/jvm/functions/Function2;", "getNoOfItemsShown$foundation_layout_release", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FlowLayoutOverflowState {
    public static final int $stable = 8;
    private Measurable collapseMeasurable;
    private Placeable collapsePlaceable;
    private C0659l collapseSize;
    private Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable;
    private int itemCount;
    private int itemShown = -1;
    private final int minCrossAxisSizeToShowCollapse;
    private final int minLinesToShowCollapse;
    private Measurable seeMoreMeasurable;
    private Placeable seeMorePlaceable;
    private C0659l seeMoreSize;
    private final FlowLayoutOverflow.OverflowType type;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlowLayoutOverflow.OverflowType.values().length];
            try {
                iArr[FlowLayoutOverflow.OverflowType.Visible.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.Clip.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandIndicator.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FlowLayoutOverflow.OverflowType.ExpandOrCollapseIndicator.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FlowLayoutOverflowState(FlowLayoutOverflow.OverflowType overflowType, int i2, int i3) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i2;
        this.minCrossAxisSizeToShowCollapse = i3;
    }

    public static /* synthetic */ FlowLayoutOverflowState copy$default(FlowLayoutOverflowState flowLayoutOverflowState, FlowLayoutOverflow.OverflowType overflowType, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            overflowType = flowLayoutOverflowState.type;
        }
        if ((i4 & 2) != 0) {
            i2 = flowLayoutOverflowState.minLinesToShowCollapse;
        }
        if ((i4 & 4) != 0) {
            i3 = flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
        }
        return flowLayoutOverflowState.copy(overflowType, i2, i3);
    }

    /* renamed from: component1$foundation_layout_release, reason: from getter */
    public final FlowLayoutOverflow.OverflowType getType() {
        return this.type;
    }

    /* renamed from: component2$foundation_layout_release, reason: from getter */
    public final int getMinLinesToShowCollapse() {
        return this.minLinesToShowCollapse;
    }

    /* renamed from: component3$foundation_layout_release, reason: from getter */
    public final int getMinCrossAxisSizeToShowCollapse() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final FlowLayoutOverflowState copy(FlowLayoutOverflow.OverflowType type, int minLinesToShowCollapse, int minCrossAxisSizeToShowCollapse) {
        return new FlowLayoutOverflowState(type, minLinesToShowCollapse, minCrossAxisSizeToShowCollapse);
    }

    public final FlowLayoutBuildingBlocks.WrapEllipsisInfo ellipsisInfo$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        Measurable measurableInvoke;
        C0659l c0659l;
        Placeable placeable;
        Measurable measurable;
        Placeable placeable2;
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            if (hasNext) {
                Function2<? super Boolean, ? super Integer, ? extends Measurable> function2 = this.getOverflowMeasurable;
                if (function2 == null || (measurableInvoke = function2.invoke(Boolean.TRUE, Integer.valueOf(getNoOfItemsShown$foundation_layout_release()))) == null) {
                    measurableInvoke = this.seeMoreMeasurable;
                }
                c0659l = this.seeMoreSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.seeMorePlaceable;
                    measurable = measurableInvoke;
                    placeable2 = placeable;
                }
                measurable = measurableInvoke;
                placeable2 = null;
            } else {
                if (lineIndex < this.minLinesToShowCollapse - 1 || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    measurableInvoke = null;
                } else {
                    Function2<? super Boolean, ? super Integer, ? extends Measurable> function22 = this.getOverflowMeasurable;
                    if (function22 == null || (measurableInvoke = function22.invoke(Boolean.FALSE, Integer.valueOf(getNoOfItemsShown$foundation_layout_release()))) == null) {
                        measurableInvoke = this.collapseMeasurable;
                    }
                }
                c0659l = this.collapseSize;
                if (this.getOverflowMeasurable == null) {
                    placeable = this.collapsePlaceable;
                    measurable = measurableInvoke;
                    placeable2 = placeable;
                }
                measurable = measurableInvoke;
                placeable2 = null;
            }
            if (measurable != null) {
                Intrinsics.checkNotNull(c0659l);
                return new FlowLayoutBuildingBlocks.WrapEllipsisInfo(measurable, placeable2, c0659l.f847a, false, 8, null);
            }
        }
        return null;
    }

    /* renamed from: ellipsisSize-F35zm-w$foundation_layout_release, reason: not valid java name */
    public final C0659l m570ellipsisSizeF35zmw$foundation_layout_release(boolean hasNext, int lineIndex, int totalCrossAxisSize) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                if (hasNext) {
                    return this.seeMoreSize;
                }
                if (lineIndex + 1 < this.minLinesToShowCollapse || totalCrossAxisSize < this.minCrossAxisSizeToShowCollapse) {
                    return null;
                }
                return this.collapseSize;
            }
            if (hasNext) {
                return this.seeMoreSize;
            }
        }
        return null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowLayoutOverflowState)) {
            return false;
        }
        FlowLayoutOverflowState flowLayoutOverflowState = (FlowLayoutOverflowState) other;
        return this.type == flowLayoutOverflowState.type && this.minLinesToShowCollapse == flowLayoutOverflowState.minLinesToShowCollapse && this.minCrossAxisSizeToShowCollapse == flowLayoutOverflowState.minCrossAxisSizeToShowCollapse;
    }

    /* renamed from: getItemCount$foundation_layout_release, reason: from getter */
    public final int getItemCount() {
        return this.itemCount;
    }

    /* renamed from: getItemShown$foundation_layout_release, reason: from getter */
    public final int getItemShown() {
        return this.itemShown;
    }

    public final int getMinCrossAxisSizeToShowCollapse$foundation_layout_release() {
        return this.minCrossAxisSizeToShowCollapse;
    }

    public final int getMinLinesToShowCollapse$foundation_layout_release() {
        return this.minLinesToShowCollapse;
    }

    public final int getNoOfItemsShown$foundation_layout_release() {
        int i2 = this.itemShown;
        if (i2 != -1) {
            return i2;
        }
        throw new IllegalStateException("Accessing noOfItemsShown before it is set. Are you calling this in the Composition phase, rather than in the draw phase? Consider our samples on how to use it during the draw phase or consider using ContextualFlowRow/ContextualFlowColumn which initializes this method in the composition phase.");
    }

    public final FlowLayoutOverflow.OverflowType getType$foundation_layout_release() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.minCrossAxisSizeToShowCollapse) + d.c(this.minLinesToShowCollapse, this.type.hashCode() * 31, 31);
    }

    public final void setItemCount$foundation_layout_release(int i2) {
        this.itemCount = i2;
    }

    public final void setItemShown$foundation_layout_release(int i2) {
        this.itemShown = i2;
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m572setOverflowMeasurableshBUhpc$foundation_layout_release(IntrinsicMeasurable seeMoreMeasurable, IntrinsicMeasurable collapseMeasurable, boolean isHorizontal, long constraints) {
        long jM611constructorimpl = OrientationIndependentConstraints.m611constructorimpl(constraints, isHorizontal ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical);
        if (seeMoreMeasurable != null) {
            int iMainAxisMin = FlowLayoutKt.mainAxisMin(seeMoreMeasurable, isHorizontal, Constraints.m6185getMaxHeightimpl(jM611constructorimpl));
            this.seeMoreSize = new C0659l(C0659l.a(iMainAxisMin, FlowLayoutKt.crossAxisMin(seeMoreMeasurable, isHorizontal, iMainAxisMin)));
            this.seeMoreMeasurable = seeMoreMeasurable instanceof Measurable ? (Measurable) seeMoreMeasurable : null;
            this.seeMorePlaceable = null;
        }
        if (collapseMeasurable != null) {
            int iMainAxisMin2 = FlowLayoutKt.mainAxisMin(collapseMeasurable, isHorizontal, Constraints.m6185getMaxHeightimpl(jM611constructorimpl));
            this.collapseSize = new C0659l(C0659l.a(iMainAxisMin2, FlowLayoutKt.crossAxisMin(collapseMeasurable, isHorizontal, iMainAxisMin2)));
            this.collapseMeasurable = collapseMeasurable instanceof Measurable ? (Measurable) collapseMeasurable : null;
            this.collapsePlaceable = null;
        }
    }

    /* renamed from: setOverflowMeasurables-VKLhPVY$foundation_layout_release, reason: not valid java name */
    public final void m573setOverflowMeasurablesVKLhPVY$foundation_layout_release(FlowLineMeasurePolicy measurePolicy, long constraints, Function2<? super Boolean, ? super Integer, ? extends Measurable> getOverflowMeasurable) {
        this.itemShown = 0;
        this.getOverflowMeasurable = getOverflowMeasurable;
        m571setOverflowMeasurableshBUhpc$foundation_layout_release(measurePolicy, getOverflowMeasurable.invoke(Boolean.TRUE, 0), getOverflowMeasurable.invoke(Boolean.FALSE, 0), constraints);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FlowLayoutOverflowState(type=");
        sb.append(this.type);
        sb.append(", minLinesToShowCollapse=");
        sb.append(this.minLinesToShowCollapse);
        sb.append(", minCrossAxisSizeToShowCollapse=");
        return androidx.compose.runtime.changelist.a.o(sb, this.minCrossAxisSizeToShowCollapse, ')');
    }

    /* renamed from: setOverflowMeasurables--hBUhpc$foundation_layout_release, reason: not valid java name */
    public final void m571setOverflowMeasurableshBUhpc$foundation_layout_release(final FlowLineMeasurePolicy measurePolicy, Measurable seeMoreMeasurable, Measurable collapseMeasurable, long constraints) {
        LayoutOrientation layoutOrientation = measurePolicy.isHorizontal() ? LayoutOrientation.Horizontal : LayoutOrientation.Vertical;
        long jM624toBoxConstraintsOenEA2s = OrientationIndependentConstraints.m624toBoxConstraintsOenEA2s(OrientationIndependentConstraints.m613copyyUG9Ft0$default(OrientationIndependentConstraints.m611constructorimpl(constraints, layoutOrientation), 0, 0, 0, 0, 10, null), layoutOrientation);
        if (seeMoreMeasurable != null) {
            FlowLayoutKt.m568measureAndCacherqJ1uqs(seeMoreMeasurable, measurePolicy, jM624toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$3$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = measurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.seeMoreSize = new C0659l(C0659l.a(iMainAxisSize, iCrossAxisSize));
                    this.this$0.seeMorePlaceable = placeable;
                }
            });
            this.seeMoreMeasurable = seeMoreMeasurable;
        }
        if (collapseMeasurable != null) {
            FlowLayoutKt.m568measureAndCacherqJ1uqs(collapseMeasurable, measurePolicy, jM624toBoxConstraintsOenEA2s, new Function1<Placeable, Unit>() { // from class: androidx.compose.foundation.layout.FlowLayoutOverflowState$setOverflowMeasurables$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable placeable) {
                    invoke2(placeable);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable placeable) {
                    int iMainAxisSize;
                    int iCrossAxisSize;
                    if (placeable != null) {
                        FlowLineMeasurePolicy flowLineMeasurePolicy = measurePolicy;
                        iMainAxisSize = flowLineMeasurePolicy.mainAxisSize(placeable);
                        iCrossAxisSize = flowLineMeasurePolicy.crossAxisSize(placeable);
                    } else {
                        iMainAxisSize = 0;
                        iCrossAxisSize = 0;
                    }
                    this.this$0.collapseSize = new C0659l(C0659l.a(iMainAxisSize, iCrossAxisSize));
                    this.this$0.collapsePlaceable = placeable;
                }
            });
            this.collapseMeasurable = collapseMeasurable;
        }
    }
}
