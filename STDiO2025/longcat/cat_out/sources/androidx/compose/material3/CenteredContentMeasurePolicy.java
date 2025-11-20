package androidx.compose.material3;

import J.d;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J,\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Landroidx/compose/material3/CenteredContentMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "()V", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class CenteredContentMeasurePolicy implements MeasurePolicy {
    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        final ArrayList arrayList;
        int iCoerceAtMost;
        int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
        int iM6187getMinHeightimpl = Constraints.m6187getMinHeightimpl(j2);
        int size = list.size();
        if (size < 1) {
            return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, iM6187getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Placeable.PlacementScope placementScope) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                    invoke2(placementScope);
                    return Unit.INSTANCE;
                }
            }, 4, null);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        if (Constraints.m6182getHasBoundedWidthimpl(j2)) {
            int i2 = iM6186getMaxWidthimpl / size;
            int iCalculateCenteredContentHorizontalPadding = ExpressiveNavigationBarKt.calculateCenteredContentHorizontalPadding(size, iM6186getMaxWidthimpl);
            intRef.element = iCalculateCenteredContentHorizontalPadding;
            int i3 = (iM6186getMaxWidthimpl - (iCalculateCenteredContentHorizontalPadding * 2)) / size;
            int size2 = list.size();
            for (int i4 = 0; i4 < size2; i4++) {
                int iMaxIntrinsicHeight = list.get(i4).maxIntrinsicHeight(i3);
                if (iM6187getMinHeightimpl < iMaxIntrinsicHeight) {
                    iM6187getMinHeightimpl = RangesKt.coerceAtMost(iMaxIntrinsicHeight, Constraints.m6185getMaxHeightimpl(j2));
                }
            }
            ArrayList arrayList2 = new ArrayList(list.size());
            int size3 = list.size();
            int iG = 0;
            while (iG < size3) {
                Measurable measurable = list.get(iG);
                int iMaxIntrinsicWidth = measurable.maxIntrinsicWidth(Constraints.m6187getMinHeightimpl(j2));
                if (i3 < iMaxIntrinsicWidth) {
                    iCoerceAtMost = RangesKt.coerceAtMost(iMaxIntrinsicWidth, i2);
                    intRef.element -= (iCoerceAtMost - i3) / 2;
                } else {
                    iCoerceAtMost = i3;
                }
                iG = d.g(measurable, ConstraintsKt.m6201constrainN9IONVI(j2, Constraints.INSTANCE.m6196fixedJhjzzOo(iCoerceAtMost, iM6187getMinHeightimpl)), arrayList2, iG, 1);
            }
            arrayList = arrayList2;
        } else {
            arrayList = new ArrayList(list.size());
            int size4 = list.size();
            for (int i5 = 0; i5 < size4; i5++) {
                arrayList.add(list.get(i5).mo5120measureBRTryo0(ConstraintsKt.m6201constrainN9IONVI(j2, Constraints.INSTANCE.m6197fixedHeightOenEA2s(iM6187getMinHeightimpl))));
            }
        }
        return MeasureScope.layout$default(measureScope, iM6186getMaxWidthimpl, iM6187getMinHeightimpl, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.CenteredContentMeasurePolicy$measure$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                int i6 = intRef.element;
                List<Placeable> list2 = arrayList;
                int size5 = list2.size();
                int i7 = 0;
                int width = i6;
                while (i7 < size5) {
                    Placeable placeable = list2.get(i7);
                    Placeable.PlacementScope placementScope2 = placementScope;
                    Placeable.PlacementScope.placeRelative$default(placementScope2, placeable, width, 0, 0.0f, 4, null);
                    width += placeable.getWidth();
                    i7++;
                    placementScope = placementScope2;
                }
            }
        }, 4, null);
    }
}
