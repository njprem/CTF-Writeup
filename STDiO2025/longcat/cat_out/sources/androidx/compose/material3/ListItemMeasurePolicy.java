package androidx.compose.material3;

import androidx.compose.material3.ListItemType;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.MultiContentMeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002JV\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002JV\u0010\u000f\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u00042,\u0010\n\u001a(\u0012\u0004\u0012\u00020\b\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\b\u000eH\u0002J(\u0010\u0011\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u0012\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J2\u0010\u0013\u001a\u00020\u0014*\u00020\u00152\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00070\u00072\u0006\u0010\u0017\u001a\u00020\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ(\u0010\u001b\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\t\u001a\u00020\u0004H\u0016J(\u0010\u001c\u001a\u00020\u0004*\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00072\u0006\u0010\u0010\u001a\u00020\u0004H\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"Landroidx/compose/material3/ListItemMeasurePolicy;", "Landroidx/compose/ui/layout/MultiContentMeasurePolicy;", "()V", "calculateIntrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "Lkotlin/ExtensionFunctionType;", "calculateIntrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ListItemMeasurePolicy implements MultiContentMeasurePolicy {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicHeight$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$maxIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C04181 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04181 INSTANCE = new C04181();

        public C04181() {
            super(2, IntrinsicMeasurable.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicHeight$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C04191 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04191 INSTANCE = new C04191();

        public C04191() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.ListItemMeasurePolicy$minIntrinsicWidth$1, reason: invalid class name and case insensitive filesystem */
    public /* synthetic */ class C04201 extends FunctionReferenceImpl implements Function2<IntrinsicMeasurable, Integer, Integer> {
        public static final C04201 INSTANCE = new C04201();

        public C04201() {
            super(2, IntrinsicMeasurable.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
        }

        public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i2) {
            return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i2));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
            return invoke(intrinsicMeasurable, num.intValue());
        }
    }

    private final int calculateIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        int iIntValue;
        int iIntValue2;
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(i2, intrinsicMeasureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())));
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        if (intrinsicMeasurable != null) {
            iIntValue = function2.invoke(intrinsicMeasurable, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        if (intrinsicMeasurable2 != null) {
            iIntValue2 = function2.invoke(intrinsicMeasurable2, Integer.valueOf(iSubtractConstraintSafely)).intValue();
            iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(iSubtractConstraintSafely, intrinsicMeasurable2.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(iSubtractConstraintSafely)).intValue() : 0;
        int iM1849invokeZLSjz4$material3_release = ListItemType.INSTANCE.m1849invokeZLSjz4$material3_release(iIntValue3 > 0, iIntValue4 > 0, ListItemKt.isSupportingMultilineHeuristic(intrinsicMeasureScope, iIntValue4));
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        return ListItemKt.m1834calculateHeightN4Jib3Y(intrinsicMeasureScope, iIntValue, iIntValue2, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue() : 0, iIntValue3, iIntValue4, iM1849invokeZLSjz4$material3_release, intrinsicMeasureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(ListItemKt.m1836verticalPaddingyh95HIg(iM1849invokeZLSjz4$material3_release) * 2)), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    private final int calculateIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        List<? extends IntrinsicMeasurable> list2 = list.get(0);
        List<? extends IntrinsicMeasurable> list3 = list.get(1);
        List<? extends IntrinsicMeasurable> list4 = list.get(2);
        List<? extends IntrinsicMeasurable> list5 = list.get(3);
        List<? extends IntrinsicMeasurable> list6 = list.get(4);
        IntrinsicMeasurable intrinsicMeasurable = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list5);
        int iIntValue = intrinsicMeasurable != null ? function2.invoke(intrinsicMeasurable, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable2 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list6);
        int iIntValue2 = intrinsicMeasurable2 != null ? function2.invoke(intrinsicMeasurable2, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable3 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list2);
        int iIntValue3 = intrinsicMeasurable3 != null ? function2.invoke(intrinsicMeasurable3, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable4 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list3);
        int iIntValue4 = intrinsicMeasurable4 != null ? function2.invoke(intrinsicMeasurable4, Integer.valueOf(i2)).intValue() : 0;
        IntrinsicMeasurable intrinsicMeasurable5 = (IntrinsicMeasurable) CollectionsKt.firstOrNull((List) list4);
        return ListItemKt.m1835calculateWidthyeHjK3Y(intrinsicMeasureScope, iIntValue, iIntValue2, iIntValue3, iIntValue4, intrinsicMeasurable5 != null ? function2.invoke(intrinsicMeasurable5, Integer.valueOf(i2)).intValue() : 0, intrinsicMeasureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(ListItemKt.getListItemEndPadding() + ListItemKt.getListItemStartPadding())), ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, AnonymousClass1.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C04181.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo590measure3p2s80s(MeasureScope measureScope, List<? extends List<? extends Measurable>> list, long j2) {
        long j3;
        Placeable placeableMo5120measureBRTryo0;
        float f2;
        List<? extends Measurable> list2;
        long j4;
        Placeable placeableMo5120measureBRTryo02;
        float f3;
        Placeable placeableMo5120measureBRTryo03;
        List<? extends Measurable> list3 = list.get(0);
        List<? extends Measurable> list4 = list.get(1);
        List<? extends Measurable> list5 = list.get(2);
        List<? extends Measurable> list6 = list.get(3);
        List<? extends Measurable> list7 = list.get(4);
        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        float listItemStartPadding = ListItemKt.getListItemStartPadding();
        float listItemEndPadding = ListItemKt.getListItemEndPadding();
        int iMo328roundToPx0680j_4 = measureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(listItemStartPadding + listItemEndPadding));
        Measurable measurable = (Measurable) CollectionsKt.firstOrNull((List) list6);
        int iMinIntrinsicWidth = measurable != null ? measurable.minIntrinsicWidth(Constraints.m6185getMaxHeightimpl(j2)) : 0;
        Measurable measurable2 = (Measurable) CollectionsKt.firstOrNull((List) list7);
        int iSubtractConstraintSafely = ListItemKt.subtractConstraintSafely(Constraints.m6186getMaxWidthimpl(jM6177copyZbe2FdA$default), iMinIntrinsicWidth + (measurable2 != null ? measurable2.minIntrinsicWidth(Constraints.m6185getMaxHeightimpl(j2)) : 0) + iMo328roundToPx0680j_4);
        Measurable measurable3 = (Measurable) CollectionsKt.firstOrNull((List) list5);
        boolean zIsSupportingMultilineHeuristic = ListItemKt.isSupportingMultilineHeuristic(measureScope, measurable3 != null ? measurable3.minIntrinsicHeight(iSubtractConstraintSafely) : 0);
        ListItemType.Companion companion = ListItemType.INSTANCE;
        float f4 = 2;
        long jM6205offsetNN6EwU = ConstraintsKt.m6205offsetNN6EwU(jM6177copyZbe2FdA$default, -iMo328roundToPx0680j_4, -measureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(ListItemKt.m1836verticalPaddingyh95HIg(companion.m1849invokeZLSjz4$material3_release(CollectionsKt.firstOrNull((List) list4) != null, CollectionsKt.firstOrNull((List) list5) != null, zIsSupportingMultilineHeuristic)) * f4)));
        Measurable measurable4 = (Measurable) CollectionsKt.firstOrNull((List) list6);
        Placeable placeableMo5120measureBRTryo04 = measurable4 != null ? measurable4.mo5120measureBRTryo0(jM6205offsetNN6EwU) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo04);
        Measurable measurable5 = (Measurable) CollectionsKt.firstOrNull((List) list7);
        if (measurable5 != null) {
            j3 = jM6205offsetNN6EwU;
            placeableMo5120measureBRTryo0 = measurable5.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(j3, -iWidthOrZero, 0, 2, null));
        } else {
            j3 = jM6205offsetNN6EwU;
            placeableMo5120measureBRTryo0 = null;
        }
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo0) + iWidthOrZero;
        Measurable measurable6 = (Measurable) CollectionsKt.firstOrNull((List) list3);
        if (measurable6 != null) {
            list2 = list5;
            f2 = f4;
            j4 = j3;
            placeableMo5120measureBRTryo02 = measurable6.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(j3, -iWidthOrZero2, 0, 2, null));
        } else {
            f2 = f4;
            list2 = list5;
            j4 = j3;
            placeableMo5120measureBRTryo02 = null;
        }
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo02);
        Measurable measurable7 = (Measurable) CollectionsKt.firstOrNull((List) list2);
        if (measurable7 != null) {
            f3 = f2;
            placeableMo5120measureBRTryo03 = measurable7.mo5120measureBRTryo0(ConstraintsKt.m6205offsetNN6EwU(j4, -iWidthOrZero2, -iHeightOrZero));
        } else {
            f3 = f2;
            placeableMo5120measureBRTryo03 = null;
        }
        int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo03) + iHeightOrZero;
        boolean z = (placeableMo5120measureBRTryo03 == null || placeableMo5120measureBRTryo03.get(AlignmentLineKt.getFirstBaseline()) == placeableMo5120measureBRTryo03.get(AlignmentLineKt.getLastBaseline())) ? false : true;
        Measurable measurable8 = (Measurable) CollectionsKt.firstOrNull((List) list4);
        Placeable placeableMo5120measureBRTryo05 = measurable8 != null ? measurable8.mo5120measureBRTryo0(ConstraintsKt.m6205offsetNN6EwU(j4, -iWidthOrZero2, -iHeightOrZero2)) : null;
        int iM1849invokeZLSjz4$material3_release = companion.m1849invokeZLSjz4$material3_release(placeableMo5120measureBRTryo05 != null, placeableMo5120measureBRTryo03 != null, z);
        float fM1836verticalPaddingyh95HIg = ListItemKt.m1836verticalPaddingyh95HIg(iM1849invokeZLSjz4$material3_release);
        return ListItemKt.place(measureScope, ListItemKt.m1835calculateWidthyeHjK3Y(measureScope, TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo04), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo0), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo02), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo03), iMo328roundToPx0680j_4, j2), ListItemKt.m1834calculateHeightN4Jib3Y(measureScope, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo04), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo0), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo02), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo03), iM1849invokeZLSjz4$material3_release, measureScope.mo328roundToPx0680j_4(Dp.m6233constructorimpl(fM1836verticalPaddingyh95HIg * f3)), j2), placeableMo5120measureBRTryo04, placeableMo5120measureBRTryo0, placeableMo5120measureBRTryo02, placeableMo5120measureBRTryo05, placeableMo5120measureBRTryo03, ListItemType.m1841equalsimpl0(iM1849invokeZLSjz4$material3_release, companion.m1847getThreeLineAlXitO8()), measureScope.mo328roundToPx0680j_4(listItemStartPadding), measureScope.mo328roundToPx0680j_4(listItemEndPadding), measureScope.mo328roundToPx0680j_4(fM1836verticalPaddingyh95HIg));
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicHeight(intrinsicMeasureScope, list, i2, C04191.INSTANCE);
    }

    @Override // androidx.compose.ui.layout.MultiContentMeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends List<? extends IntrinsicMeasurable>> list, int i2) {
        return calculateIntrinsicWidth(intrinsicMeasureScope, list, i2, C04201.INSTANCE);
    }
}
