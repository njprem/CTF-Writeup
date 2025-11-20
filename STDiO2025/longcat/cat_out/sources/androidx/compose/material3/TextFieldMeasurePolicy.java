package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
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
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ8\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J<\u0010\u0011\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0010H\u0002J\"\u0010\u0014\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u0015\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016J,\u0010\u0016\u001a\u00020\u0017*\u00020\u00182\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00190\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\"\u0010\u001e\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0013\u001a\u00020\nH\u0016J\"\u0010\u001f\u001a\u00020\n*\u00020\u00122\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000e\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/material3/TextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicWidth", "", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "height", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicHeight", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "width", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class TextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    public TextFieldMeasurePolicy(boolean z, float f2, PaddingValues paddingValues) {
        this.singleLine = z;
        this.animationProgress = f2;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int i3;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i4;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        int size = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            i3 = i2;
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(i3, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i3)).intValue();
        } else {
            i3 = i2;
            iSubstractConstraintSafely = i3;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(intrinsicMeasurable9, Integer.valueOf(i3)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.LabelId)) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue4 = intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(iSubstractConstraintSafely)).intValue() : 0;
        int size4 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            iIntValue3 = function2.invoke(intrinsicMeasurable11, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i9++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            int iIntValue5 = function2.invoke(intrinsicMeasurable12, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = TextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list.size();
        for (int i10 = 0; i10 < size6; i10++) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i10);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = function2.invoke(intrinsicMeasurable13, Integer.valueOf(iSubstractConstraintSafely)).intValue();
                int size7 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i11);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i11++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue7 = intrinsicMeasurable14 != null ? function2.invoke(intrinsicMeasurable14, Integer.valueOf(iSubstractConstraintSafely)).intValue() : 0;
                int size8 = list.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    intrinsicMeasurable7 = list.get(i12);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.SupportingId)) {
                        break;
                    }
                    i12++;
                }
                IntrinsicMeasurable intrinsicMeasurable15 = intrinsicMeasurable7;
                return TextFieldKt.m2323calculateHeightmKXJcVc(iIntValue6, iIntValue4, iIntValue, iIntValue2, iIntValue3, i4, iIntValue7, intrinsicMeasurable15 != null ? function2.invoke(intrinsicMeasurable15, Integer.valueOf(i3)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(List<? extends IntrinsicMeasurable> measurables, int height, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> intrinsicMeasurer) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = measurables.size();
        for (int i2 = 0; i2 < size; i2++) {
            IntrinsicMeasurable intrinsicMeasurable7 = measurables.get(i2);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = intrinsicMeasurer.invoke(intrinsicMeasurable7, Integer.valueOf(height)).intValue();
                int size2 = measurables.size();
                int i3 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i3 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = measurables.get(i3);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i3++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable8, Integer.valueOf(height)).intValue() : 0;
                int size3 = measurables.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = measurables.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable9, Integer.valueOf(height)).intValue() : 0;
                int size4 = measurables.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = measurables.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable10, Integer.valueOf(height)).intValue() : 0;
                int size5 = measurables.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = measurables.get(i6);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable11, Integer.valueOf(height)).intValue() : 0;
                int size6 = measurables.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = measurables.get(i7);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable12, Integer.valueOf(height)).intValue() : 0;
                int size7 = measurables.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = measurables.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return TextFieldKt.m2324calculateWidthyeHjK3Y(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? intrinsicMeasurer.invoke(intrinsicMeasurable14, Integer.valueOf(height)).intValue() : 0, TextFieldImplKt.getZeroConstraints());
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicHeight(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.maxIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.maxIntrinsicWidth(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
        Measurable measurable;
        Measurable measurable2;
        long j3;
        Placeable placeableMo5120measureBRTryo0;
        Measurable measurable3;
        Measurable measurable4;
        final Placeable placeable;
        int i2;
        Placeable placeable2;
        long j4;
        Placeable placeableMo5120measureBRTryo02;
        Placeable placeable3;
        Measurable measurable5;
        Placeable placeable4;
        Measurable measurable6;
        Placeable placeable5;
        Measurable measurable7;
        final TextFieldMeasurePolicy textFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        List<? extends Measurable> list2 = list;
        final int iMo328roundToPx0680j_4 = measureScope2.mo328roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getTop());
        int iMo328roundToPx0680j_42 = measureScope2.mo328roundToPx0680j_4(textFieldMeasurePolicy.paddingValues.getBottom());
        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                measurable = null;
                break;
            }
            measurable = list2.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i3++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo5120measureBRTryo03 = measurable8 != null ? measurable8.mo5120measureBRTryo0(jM6177copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo03);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo03));
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list2.get(i4);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i4++;
        }
        Measurable measurable9 = measurable2;
        if (measurable9 != null) {
            j3 = jM6177copyZbe2FdA$default;
            placeableMo5120measureBRTryo0 = measurable9.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(j3, -iWidthOrZero, 0, 2, null));
        } else {
            j3 = jM6177copyZbe2FdA$default;
            placeableMo5120measureBRTryo0 = null;
        }
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo0) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo0));
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list2.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i5++;
        }
        Measurable measurable10 = measurable3;
        final Placeable placeableMo5120measureBRTryo04 = measurable10 != null ? measurable10.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(j3, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo04) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo04));
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list2.get(i6);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i6++;
        }
        Measurable measurable11 = measurable4;
        if (measurable11 != null) {
            placeable = placeableMo5120measureBRTryo0;
            long jM6206offsetNN6EwU$default = ConstraintsKt.m6206offsetNN6EwU$default(j3, -iWidthOrZero3, 0, 2, null);
            i2 = iWidthOrZero3;
            placeable2 = placeableMo5120measureBRTryo03;
            j4 = j3;
            placeableMo5120measureBRTryo02 = measurable11.mo5120measureBRTryo0(jM6206offsetNN6EwU$default);
        } else {
            placeable = placeableMo5120measureBRTryo0;
            i2 = iWidthOrZero3;
            placeable2 = placeableMo5120measureBRTryo03;
            j4 = j3;
            placeableMo5120measureBRTryo02 = null;
        }
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo02) + i2;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo02));
        int i7 = -iWidthOrZero4;
        long jM6205offsetNN6EwU = ConstraintsKt.m6205offsetNN6EwU(j4, i7, -iMo328roundToPx0680j_42);
        int size5 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size5) {
                placeable3 = placeableMo5120measureBRTryo02;
                measurable5 = null;
                break;
            }
            measurable5 = list2.get(i8);
            int i9 = i8;
            placeable3 = placeableMo5120measureBRTryo02;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i8 = i9 + 1;
            placeableMo5120measureBRTryo02 = placeable3;
        }
        Measurable measurable12 = measurable5;
        Placeable placeableMo5120measureBRTryo05 = measurable12 != null ? measurable12.mo5120measureBRTryo0(jM6205offsetNN6EwU) : null;
        int size6 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size6) {
                placeable4 = placeableMo5120measureBRTryo05;
                measurable6 = null;
                break;
            }
            measurable6 = list2.get(i10);
            placeable4 = placeableMo5120measureBRTryo05;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i10++;
            placeableMo5120measureBRTryo05 = placeable4;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m6188getMinWidthimpl(j2)) : 0;
        int iHeightOrZero = TextFieldImplKt.heightOrZero(placeable4) + iMo328roundToPx0680j_4;
        long j5 = j4;
        long jM6205offsetNN6EwU2 = ConstraintsKt.m6205offsetNN6EwU(Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 11, null), i7, ((-iHeightOrZero) - iMo328roundToPx0680j_42) - iMinIntrinsicHeight);
        int size7 = list2.size();
        int i11 = 0;
        while (i11 < size7) {
            Measurable measurable14 = list2.get(i11);
            int i12 = size7;
            int i13 = iHeightOrZero;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                Placeable placeableMo5120measureBRTryo06 = measurable14.mo5120measureBRTryo0(jM6205offsetNN6EwU2);
                long jM6177copyZbe2FdA$default2 = Constraints.m6177copyZbe2FdA$default(jM6205offsetNN6EwU2, 0, 0, 0, 0, 14, null);
                int size8 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        placeable5 = placeableMo5120measureBRTryo06;
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list2.get(i14);
                    placeable5 = placeableMo5120measureBRTryo06;
                    int i15 = size8;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i14++;
                    size8 = i15;
                    placeableMo5120measureBRTryo06 = placeable5;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo5120measureBRTryo07 = measurable15 != null ? measurable15.mo5120measureBRTryo0(jM6177copyZbe2FdA$default2) : null;
                int iMax5 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeable5), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo07)) + i13 + iMo328roundToPx0680j_42);
                int iM2324calculateWidthyeHjK3Y = TextFieldKt.m2324calculateWidthyeHjK3Y(TextFieldImplKt.widthOrZero(placeable2), TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo04), TextFieldImplKt.widthOrZero(placeable3), placeable5.getWidth(), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo07), j2);
                int i16 = iM2324calculateWidthyeHjK3Y;
                final Placeable placeableMo5120measureBRTryo08 = measurable13 != null ? measurable13.mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(ConstraintsKt.m6206offsetNN6EwU$default(j5, 0, -iMax5, 1, null), 0, iM2324calculateWidthyeHjK3Y, 0, 0, 9, null)) : null;
                int iHeightOrZero2 = TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo08);
                int iM2323calculateHeightmKXJcVc = TextFieldKt.m2323calculateHeightmKXJcVc(placeable5.getHeight(), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable2), TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo04), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo08), textFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                int i17 = iM2323calculateHeightmKXJcVc - iHeightOrZero2;
                int size9 = list2.size();
                int i18 = 0;
                while (i18 < size9) {
                    Measurable measurable16 = list2.get(i18);
                    final int i19 = iM2323calculateHeightmKXJcVc;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo5120measureBRTryo09 = measurable16.mo5120measureBRTryo0(ConstraintsKt.Constraints(i16 != Integer.MAX_VALUE ? i16 : 0, i16, i17 != Integer.MAX_VALUE ? i17 : 0, i17));
                        final int i20 = i16;
                        final Placeable placeable6 = placeable2;
                        final Placeable placeable7 = placeable3;
                        final Placeable placeable8 = placeable4;
                        final Placeable placeable9 = placeable5;
                        return MeasureScope.layout$default(measureScope, i20, i19, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy$measure$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                                Placeable placeable10 = placeable8;
                                if (placeable10 == null) {
                                    TextFieldKt.placeWithoutLabel(placementScope, i20, i19, placeable9, placeableMo5120measureBRTryo07, placeable6, placeable, placeableMo5120measureBRTryo04, placeable7, placeableMo5120measureBRTryo09, placeableMo5120measureBRTryo08, textFieldMeasurePolicy.singleLine, measureScope2.getDensity(), textFieldMeasurePolicy.paddingValues);
                                    return;
                                }
                                int i21 = i20;
                                int i22 = i19;
                                Placeable placeable11 = placeable9;
                                Placeable placeable12 = placeableMo5120measureBRTryo07;
                                Placeable placeable13 = placeable6;
                                Placeable placeable14 = placeable;
                                Placeable placeable15 = placeableMo5120measureBRTryo04;
                                Placeable placeable16 = placeable7;
                                Placeable placeable17 = placeableMo5120measureBRTryo09;
                                Placeable placeable18 = placeableMo5120measureBRTryo08;
                                boolean z = textFieldMeasurePolicy.singleLine;
                                int i23 = iMo328roundToPx0680j_4;
                                TextFieldKt.placeWithLabel(placementScope, i21, i22, placeable11, placeable10, placeable12, placeable13, placeable14, placeable15, placeable16, placeable17, placeable18, z, i23, placeable8.getHeight() + i23, textFieldMeasurePolicy.animationProgress, measureScope2.getDensity());
                            }
                        }, 4, null);
                    }
                    i18++;
                    i16 = i16;
                    iM2323calculateHeightmKXJcVc = i19;
                    textFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                    list2 = list;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i11++;
            textFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            size7 = i12;
            iHeightOrZero = i13;
            list2 = list;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicHeight.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i3));
            }
        });
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicWidth(list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.TextFieldMeasurePolicy.minIntrinsicWidth.1
            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Integer invoke(IntrinsicMeasurable intrinsicMeasurable, Integer num) {
                return invoke(intrinsicMeasurable, num.intValue());
            }

            public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i3) {
                return Integer.valueOf(intrinsicMeasurable.minIntrinsicWidth(i3));
            }
        });
    }
}
