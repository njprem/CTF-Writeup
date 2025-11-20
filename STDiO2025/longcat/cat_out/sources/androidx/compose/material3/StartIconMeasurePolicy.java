package androidx.compose.material3;

import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\"\u0010\u0011\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0012H\u0016J\"\u0010\u0018\u001a\u00020\u0012*\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0019\u001a\u00020\u0012H\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00152\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Landroidx/compose/material3/StartIconMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "animationProgress", "Lkotlin/Function0;", "", "indicatorHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "indicatorVerticalPadding", "startIconToLabelHorizontalPadding", "(Lkotlin/jvm/functions/Function0;FFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAnimationProgress", "()Lkotlin/jvm/functions/Function0;", "getIndicatorHorizontalPadding-D9Ej5fM", "()F", "F", "getIndicatorVerticalPadding-D9Ej5fM", "getStartIconToLabelHorizontalPadding-D9Ej5fM", "maxIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "maxIntrinsicWidth", "height", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class StartIconMeasurePolicy implements MeasurePolicy {
    private final Function0<Float> animationProgress;
    private final float indicatorHorizontalPadding;
    private final float indicatorVerticalPadding;
    private final float startIconToLabelHorizontalPadding;

    public /* synthetic */ StartIconMeasurePolicy(Function0 function0, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, f2, f3, f4);
    }

    public final Function0<Float> getAnimationProgress() {
        return this.animationProgress;
    }

    /* renamed from: getIndicatorHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorHorizontalPadding() {
        return this.indicatorHorizontalPadding;
    }

    /* renamed from: getIndicatorVerticalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getIndicatorVerticalPadding() {
        return this.indicatorVerticalPadding;
    }

    /* renamed from: getStartIconToLabelHorizontalPadding-D9Ej5fM, reason: not valid java name and from getter */
    public final float getStartIconToLabelHorizontalPadding() {
        return this.startIconToLabelHorizontalPadding;
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicHeight = intrinsicMeasurable.maxIntrinsicHeight(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return Math.max(iMaxIntrinsicHeight, intrinsicMeasurable2.maxIntrinsicHeight(i2)) + intrinsicMeasureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(this.indicatorVerticalPadding * 2));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), "icon")) {
                int iMaxIntrinsicWidth = intrinsicMeasurable.maxIntrinsicWidth(i2);
                int size2 = list.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    IntrinsicMeasurable intrinsicMeasurable2 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), "label")) {
                        return iMaxIntrinsicWidth + intrinsicMeasurable2.maxIntrinsicWidth(i2) + intrinsicMeasureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(Dp.m6233constructorimpl(this.indicatorHorizontalPadding * 2) + this.startIconToLabelHorizontalPadding));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        MeasureScope measureScope2 = measureScope;
        float fFloatValue = this.animationProgress.invoke().floatValue();
        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        float f2 = 2;
        long jM6205offsetNN6EwU = ConstraintsKt.m6205offsetNN6EwU(jM6177copyZbe2FdA$default, -measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(this.indicatorHorizontalPadding * f2)), -measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(this.indicatorVerticalPadding * f2)));
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Measurable measurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), "icon")) {
                Placeable placeableMo5120measureBRTryo0 = measurable.mo5120measureBRTryo0(jM6205offsetNN6EwU);
                int size2 = list.size();
                int i3 = 0;
                while (i3 < size2) {
                    Measurable measurable2 = list.get(i3);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), "label")) {
                        Placeable placeableMo5120measureBRTryo02 = measurable2.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(jM6205offsetNN6EwU, -(measureScope2.mo328roundToPx0680j_4(this.startIconToLabelHorizontalPadding) + placeableMo5120measureBRTryo0.getWidth()), 0, 2, null));
                        int iMo328roundToPx0680j_4 = measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(Dp.m6233constructorimpl(this.indicatorHorizontalPadding * f2) + this.startIconToLabelHorizontalPadding)) + placeableMo5120measureBRTryo02.getWidth() + placeableMo5120measureBRTryo0.getWidth();
                        int iMo328roundToPx0680j_42 = measureScope2.mo328roundToPx0680j_4(Dp.m6233constructorimpl(this.indicatorVerticalPadding * f2)) + Math.max(placeableMo5120measureBRTryo0.getHeight(), placeableMo5120measureBRTryo02.getHeight());
                        int iRoundToInt = MathKt.roundToInt(iMo328roundToPx0680j_4 * fFloatValue);
                        int size3 = list.size();
                        int i4 = 0;
                        while (i4 < size3) {
                            Measurable measurable3 = list.get(i4);
                            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), "indicatorRipple")) {
                                Placeable placeableMo5120measureBRTryo03 = measurable3.mo5120measureBRTryo0(ConstraintsKt.m6201constrainN9IONVI(jM6177copyZbe2FdA$default, Constraints.INSTANCE.m6196fixedJhjzzOo(iMo328roundToPx0680j_4, iMo328roundToPx0680j_42)));
                                int size4 = list.size();
                                int i5 = 0;
                                while (i5 < size4) {
                                    Measurable measurable4 = list.get(i5);
                                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), "indicator")) {
                                        return NavigationItemKt.m1951placeLabelAndStartIconnru01g4(measureScope2, placeableMo5120measureBRTryo02, placeableMo5120measureBRTryo0, placeableMo5120measureBRTryo03, measurable4.mo5120measureBRTryo0(ConstraintsKt.m6201constrainN9IONVI(jM6177copyZbe2FdA$default, Constraints.INSTANCE.m6196fixedJhjzzOo(iRoundToInt, iMo328roundToPx0680j_42))), j2, this.startIconToLabelHorizontalPadding);
                                    }
                                    i5++;
                                    placeableMo5120measureBRTryo02 = placeableMo5120measureBRTryo02;
                                    placeableMo5120measureBRTryo0 = placeableMo5120measureBRTryo0;
                                    measureScope2 = measureScope;
                                }
                                throw new NoSuchElementException("Collection contains no element matching the predicate.");
                            }
                            i4++;
                            placeableMo5120measureBRTryo0 = placeableMo5120measureBRTryo0;
                            measureScope2 = measureScope;
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    i3++;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i2++;
            measureScope2 = measureScope;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private StartIconMeasurePolicy(Function0<Float> function0, float f2, float f3, float f4) {
        this.animationProgress = function0;
        this.indicatorHorizontalPadding = f2;
        this.indicatorVerticalPadding = f3;
        this.startIconToLabelHorizontalPadding = f4;
    }
}
