package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.internal.TextFieldImplKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
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
import androidx.compose.ui.util.MathHelpersKt;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ<\u0010\r\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J<\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002J\"\u0010\u0018\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010\u0019\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016J,\u0010\u001a\u001a\u00020\u001b*\u00020\u001c2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\"\u0010\"\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016J\"\u0010#\u001a\u00020\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0017\u001a\u00020\u000eH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/material3/OutlinedTextFieldMeasurePolicy;", "Landroidx/compose/ui/layout/MeasurePolicy;", "onLabelMeasured", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Size;", "", "singleLine", "", "animationProgress", "", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lkotlin/jvm/functions/Function1;ZFLandroidx/compose/foundation/layout/PaddingValues;)V", "intrinsicHeight", "", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "width", "intrinsicMeasurer", "Lkotlin/Function2;", "intrinsicWidth", "height", "maxIntrinsicHeight", "maxIntrinsicWidth", "measure", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;", "minIntrinsicHeight", "minIntrinsicWidth", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class OutlinedTextFieldMeasurePolicy implements MeasurePolicy {
    private final float animationProgress;
    private final Function1<Size, Unit> onLabelMeasured;
    private final PaddingValues paddingValues;
    private final boolean singleLine;

    /* JADX WARN: Multi-variable type inference failed */
    public OutlinedTextFieldMeasurePolicy(Function1<? super Size, Unit> function1, boolean z, float f2, PaddingValues paddingValues) {
        this.onLabelMeasured = function1;
        this.singleLine = z;
        this.animationProgress = f2;
        this.paddingValues = paddingValues;
    }

    private final int intrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        int iSubstractConstraintSafely;
        int iIntValue;
        IntrinsicMeasurable intrinsicMeasurable2;
        int iIntValue2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        int iIntValue3;
        IntrinsicMeasurable intrinsicMeasurable5;
        int i3;
        IntrinsicMeasurable intrinsicMeasurable6;
        IntrinsicMeasurable intrinsicMeasurable7;
        int size = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                intrinsicMeasurable = null;
                break;
            }
            intrinsicMeasurable = list.get(i4);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i4++;
        }
        IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable;
        if (intrinsicMeasurable8 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(i2, intrinsicMeasurable8.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue = function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue();
        } else {
            iSubstractConstraintSafely = i2;
            iIntValue = 0;
        }
        int size2 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size2) {
                intrinsicMeasurable2 = null;
                break;
            }
            intrinsicMeasurable2 = list.get(i5);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i5++;
        }
        IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable2;
        if (intrinsicMeasurable9 != null) {
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable9.maxIntrinsicWidth(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(intrinsicMeasurable9, Integer.valueOf(i2)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size3) {
                intrinsicMeasurable3 = null;
                break;
            }
            intrinsicMeasurable3 = list.get(i6);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.LabelId)) {
                break;
            }
            i6++;
        }
        IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable3;
        int iIntValue4 = intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(MathHelpersKt.lerp(iSubstractConstraintSafely, i2, this.animationProgress))).intValue() : 0;
        int size4 = list.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size4) {
                intrinsicMeasurable4 = null;
                break;
            }
            intrinsicMeasurable4 = list.get(i7);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.PrefixId)) {
                break;
            }
            i7++;
        }
        IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable4;
        if (intrinsicMeasurable11 != null) {
            iIntValue3 = function2.invoke(intrinsicMeasurable11, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable11.maxIntrinsicWidth(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size5) {
                intrinsicMeasurable5 = null;
                break;
            }
            intrinsicMeasurable5 = list.get(i8);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.SuffixId)) {
                break;
            }
            i8++;
        }
        IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable5;
        if (intrinsicMeasurable12 != null) {
            int iIntValue5 = function2.invoke(intrinsicMeasurable12, Integer.valueOf(iSubstractConstraintSafely)).intValue();
            iSubstractConstraintSafely = OutlinedTextFieldKt.substractConstraintSafely(iSubstractConstraintSafely, intrinsicMeasurable12.maxIntrinsicWidth(Integer.MAX_VALUE));
            i3 = iIntValue5;
        } else {
            i3 = 0;
        }
        int size6 = list.size();
        for (int i9 = 0; i9 < size6; i9++) {
            IntrinsicMeasurable intrinsicMeasurable13 = list.get(i9);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.TextFieldId)) {
                int iIntValue6 = function2.invoke(intrinsicMeasurable13, Integer.valueOf(iSubstractConstraintSafely)).intValue();
                int size7 = list.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size7) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i10);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i10++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable6;
                int iIntValue7 = intrinsicMeasurable14 != null ? function2.invoke(intrinsicMeasurable14, Integer.valueOf(iSubstractConstraintSafely)).intValue() : 0;
                int size8 = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size8) {
                        intrinsicMeasurable7 = null;
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable15 = list.get(i11);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable15), TextFieldImplKt.SupportingId)) {
                        intrinsicMeasurable7 = intrinsicMeasurable15;
                        break;
                    }
                    i11++;
                }
                IntrinsicMeasurable intrinsicMeasurable16 = intrinsicMeasurable7;
                return OutlinedTextFieldKt.m1984calculateHeightmKXJcVc(iIntValue, iIntValue2, iIntValue3, i3, iIntValue6, iIntValue4, iIntValue7, intrinsicMeasurable16 != null ? function2.invoke(intrinsicMeasurable16, Integer.valueOf(i2)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final int intrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2, Function2<? super IntrinsicMeasurable, ? super Integer, Integer> function2) {
        IntrinsicMeasurable intrinsicMeasurable;
        IntrinsicMeasurable intrinsicMeasurable2;
        IntrinsicMeasurable intrinsicMeasurable3;
        IntrinsicMeasurable intrinsicMeasurable4;
        IntrinsicMeasurable intrinsicMeasurable5;
        IntrinsicMeasurable intrinsicMeasurable6;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            IntrinsicMeasurable intrinsicMeasurable7 = list.get(i3);
            if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable7), TextFieldImplKt.TextFieldId)) {
                int iIntValue = function2.invoke(intrinsicMeasurable7, Integer.valueOf(i2)).intValue();
                int size2 = list.size();
                int i4 = 0;
                while (true) {
                    intrinsicMeasurable = null;
                    if (i4 >= size2) {
                        intrinsicMeasurable2 = null;
                        break;
                    }
                    intrinsicMeasurable2 = list.get(i4);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable2), TextFieldImplKt.LabelId)) {
                        break;
                    }
                    i4++;
                }
                IntrinsicMeasurable intrinsicMeasurable8 = intrinsicMeasurable2;
                int iIntValue2 = intrinsicMeasurable8 != null ? function2.invoke(intrinsicMeasurable8, Integer.valueOf(i2)).intValue() : 0;
                int size3 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size3) {
                        intrinsicMeasurable3 = null;
                        break;
                    }
                    intrinsicMeasurable3 = list.get(i5);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable3), TextFieldImplKt.TrailingId)) {
                        break;
                    }
                    i5++;
                }
                IntrinsicMeasurable intrinsicMeasurable9 = intrinsicMeasurable3;
                int iIntValue3 = intrinsicMeasurable9 != null ? function2.invoke(intrinsicMeasurable9, Integer.valueOf(i2)).intValue() : 0;
                int size4 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size4) {
                        intrinsicMeasurable4 = null;
                        break;
                    }
                    intrinsicMeasurable4 = list.get(i6);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable4), TextFieldImplKt.LeadingId)) {
                        break;
                    }
                    i6++;
                }
                IntrinsicMeasurable intrinsicMeasurable10 = intrinsicMeasurable4;
                int iIntValue4 = intrinsicMeasurable10 != null ? function2.invoke(intrinsicMeasurable10, Integer.valueOf(i2)).intValue() : 0;
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size5) {
                        intrinsicMeasurable5 = null;
                        break;
                    }
                    intrinsicMeasurable5 = list.get(i7);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable5), TextFieldImplKt.PrefixId)) {
                        break;
                    }
                    i7++;
                }
                IntrinsicMeasurable intrinsicMeasurable11 = intrinsicMeasurable5;
                int iIntValue5 = intrinsicMeasurable11 != null ? function2.invoke(intrinsicMeasurable11, Integer.valueOf(i2)).intValue() : 0;
                int size6 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size6) {
                        intrinsicMeasurable6 = null;
                        break;
                    }
                    intrinsicMeasurable6 = list.get(i8);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable6), TextFieldImplKt.SuffixId)) {
                        break;
                    }
                    i8++;
                }
                IntrinsicMeasurable intrinsicMeasurable12 = intrinsicMeasurable6;
                int iIntValue6 = intrinsicMeasurable12 != null ? function2.invoke(intrinsicMeasurable12, Integer.valueOf(i2)).intValue() : 0;
                int size7 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        break;
                    }
                    IntrinsicMeasurable intrinsicMeasurable13 = list.get(i9);
                    if (Intrinsics.areEqual(TextFieldImplKt.getLayoutId(intrinsicMeasurable13), TextFieldImplKt.PlaceholderId)) {
                        intrinsicMeasurable = intrinsicMeasurable13;
                        break;
                    }
                    i9++;
                }
                IntrinsicMeasurable intrinsicMeasurable14 = intrinsicMeasurable;
                return OutlinedTextFieldKt.m1985calculateWidthDHJA7U0(iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, intrinsicMeasurable14 != null ? function2.invoke(intrinsicMeasurable14, Integer.valueOf(i2)).intValue() : 0, this.animationProgress, TextFieldImplKt.getZeroConstraints(), intrinsicMeasureScope.getDensity(), this.paddingValues);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicHeight.1
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
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.maxIntrinsicWidth.1
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
        Measurable measurable3;
        Measurable measurable4;
        Placeable placeable;
        Measurable measurable5;
        Measurable measurable6;
        Measurable measurable7;
        final OutlinedTextFieldMeasurePolicy outlinedTextFieldMeasurePolicy = this;
        final MeasureScope measureScope2 = measureScope;
        int iMo328roundToPx0680j_4 = measureScope2.mo328roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getBottom());
        long jM6177copyZbe2FdA$default = Constraints.m6177copyZbe2FdA$default(j2, 0, 0, 0, 0, 10, null);
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                measurable = null;
                break;
            }
            measurable = list.get(i2);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable), TextFieldImplKt.LeadingId)) {
                break;
            }
            i2++;
        }
        Measurable measurable8 = measurable;
        Placeable placeableMo5120measureBRTryo0 = measurable8 != null ? measurable8.mo5120measureBRTryo0(jM6177copyZbe2FdA$default) : null;
        int iWidthOrZero = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo0);
        int iMax = Math.max(0, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo0));
        int size2 = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size2) {
                measurable2 = null;
                break;
            }
            measurable2 = list.get(i3);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable2), TextFieldImplKt.TrailingId)) {
                break;
            }
            i3++;
        }
        Measurable measurable9 = measurable2;
        Placeable placeableMo5120measureBRTryo02 = measurable9 != null ? measurable9.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(jM6177copyZbe2FdA$default, -iWidthOrZero, 0, 2, null)) : null;
        int iWidthOrZero2 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo02) + iWidthOrZero;
        int iMax2 = Math.max(iMax, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo02));
        int size3 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size3) {
                measurable3 = null;
                break;
            }
            measurable3 = list.get(i4);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable3), TextFieldImplKt.PrefixId)) {
                break;
            }
            i4++;
        }
        Measurable measurable10 = measurable3;
        Placeable placeableMo5120measureBRTryo03 = measurable10 != null ? measurable10.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(jM6177copyZbe2FdA$default, -iWidthOrZero2, 0, 2, null)) : null;
        int iWidthOrZero3 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo03) + iWidthOrZero2;
        int iMax3 = Math.max(iMax2, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo03));
        int size4 = list.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size4) {
                measurable4 = null;
                break;
            }
            measurable4 = list.get(i5);
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable4), TextFieldImplKt.SuffixId)) {
                break;
            }
            i5++;
        }
        Measurable measurable11 = measurable4;
        Placeable placeableMo5120measureBRTryo04 = measurable11 != null ? measurable11.mo5120measureBRTryo0(ConstraintsKt.m6206offsetNN6EwU$default(jM6177copyZbe2FdA$default, -iWidthOrZero3, 0, 2, null)) : null;
        int iWidthOrZero4 = TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo04) + iWidthOrZero3;
        int iMax4 = Math.max(iMax3, TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo04));
        int iMo328roundToPx0680j_42 = measureScope2.mo328roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo594calculateRightPaddingu2uoSUM(measureScope2.getLayoutDirection())) + measureScope2.mo328roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.mo593calculateLeftPaddingu2uoSUM(measureScope2.getLayoutDirection()));
        int i6 = -iWidthOrZero4;
        int iLerp = MathHelpersKt.lerp(i6 - iMo328roundToPx0680j_42, -iMo328roundToPx0680j_42, outlinedTextFieldMeasurePolicy.animationProgress);
        int i7 = -iMo328roundToPx0680j_4;
        long jM6205offsetNN6EwU = ConstraintsKt.m6205offsetNN6EwU(jM6177copyZbe2FdA$default, iLerp, i7);
        int size5 = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size5) {
                placeable = placeableMo5120measureBRTryo0;
                measurable5 = null;
                break;
            }
            measurable5 = list.get(i8);
            int i9 = i8;
            placeable = placeableMo5120measureBRTryo0;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable5), TextFieldImplKt.LabelId)) {
                break;
            }
            i8 = i9 + 1;
            placeableMo5120measureBRTryo0 = placeable;
        }
        Measurable measurable12 = measurable5;
        final Placeable placeableMo5120measureBRTryo05 = measurable12 != null ? measurable12.mo5120measureBRTryo0(jM6205offsetNN6EwU) : null;
        outlinedTextFieldMeasurePolicy.onLabelMeasured.invoke(Size.m3608boximpl(placeableMo5120measureBRTryo05 != null ? SizeKt.Size(placeableMo5120measureBRTryo05.getWidth(), placeableMo5120measureBRTryo05.getHeight()) : Size.INSTANCE.m3629getZeroNHjbRc()));
        int size6 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size6) {
                measurable6 = null;
                break;
            }
            measurable6 = list.get(i10);
            int i11 = size6;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable6), TextFieldImplKt.SupportingId)) {
                break;
            }
            i10++;
            size6 = i11;
        }
        Measurable measurable13 = measurable6;
        int iMinIntrinsicHeight = measurable13 != null ? measurable13.minIntrinsicHeight(Constraints.m6188getMinWidthimpl(j2)) : 0;
        int iMax5 = Math.max(TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo05) / 2, measureScope2.mo328roundToPx0680j_4(outlinedTextFieldMeasurePolicy.paddingValues.getTop()));
        long jM6177copyZbe2FdA$default2 = Constraints.m6177copyZbe2FdA$default(ConstraintsKt.m6205offsetNN6EwU(j2, i6, (i7 - iMax5) - iMinIntrinsicHeight), 0, 0, 0, 0, 11, null);
        int size7 = list.size();
        final Placeable placeable2 = placeableMo5120measureBRTryo04;
        int i12 = 0;
        while (i12 < size7) {
            final Placeable placeable3 = placeableMo5120measureBRTryo03;
            Measurable measurable14 = list.get(i12);
            int i13 = size7;
            final Placeable placeable4 = placeableMo5120measureBRTryo02;
            if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable14), TextFieldImplKt.TextFieldId)) {
                final Placeable placeableMo5120measureBRTryo06 = measurable14.mo5120measureBRTryo0(jM6177copyZbe2FdA$default2);
                long jM6177copyZbe2FdA$default3 = Constraints.m6177copyZbe2FdA$default(jM6177copyZbe2FdA$default2, 0, 0, 0, 0, 14, null);
                int size8 = list.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size8) {
                        measurable7 = null;
                        break;
                    }
                    measurable7 = list.get(i14);
                    int i15 = size8;
                    int i16 = i14;
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable7), TextFieldImplKt.PlaceholderId)) {
                        break;
                    }
                    i14 = i16 + 1;
                    size8 = i15;
                }
                Measurable measurable15 = measurable7;
                final Placeable placeableMo5120measureBRTryo07 = measurable15 != null ? measurable15.mo5120measureBRTryo0(jM6177copyZbe2FdA$default3) : null;
                int iMax6 = Math.max(iMax4, Math.max(TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo06), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo07)) + iMax5 + iMo328roundToPx0680j_4);
                final int iM1985calculateWidthDHJA7U0 = OutlinedTextFieldKt.m1985calculateWidthDHJA7U0(TextFieldImplKt.widthOrZero(placeable), TextFieldImplKt.widthOrZero(placeable4), TextFieldImplKt.widthOrZero(placeable3), TextFieldImplKt.widthOrZero(placeable2), placeableMo5120measureBRTryo06.getWidth(), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo05), TextFieldImplKt.widthOrZero(placeableMo5120measureBRTryo07), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                final Placeable placeableMo5120measureBRTryo08 = measurable13 != null ? measurable13.mo5120measureBRTryo0(Constraints.m6177copyZbe2FdA$default(ConstraintsKt.m6206offsetNN6EwU$default(jM6177copyZbe2FdA$default, 0, -iMax6, 1, null), 0, iM1985calculateWidthDHJA7U0, 0, 0, 9, null)) : null;
                int iHeightOrZero = TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo08);
                final int iM1984calculateHeightmKXJcVc = OutlinedTextFieldKt.m1984calculateHeightmKXJcVc(TextFieldImplKt.heightOrZero(placeable), TextFieldImplKt.heightOrZero(placeable4), TextFieldImplKt.heightOrZero(placeable3), TextFieldImplKt.heightOrZero(placeable2), placeableMo5120measureBRTryo06.getHeight(), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo05), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo07), TextFieldImplKt.heightOrZero(placeableMo5120measureBRTryo08), outlinedTextFieldMeasurePolicy.animationProgress, j2, measureScope2.getDensity(), outlinedTextFieldMeasurePolicy.paddingValues);
                int i17 = iM1984calculateHeightmKXJcVc - iHeightOrZero;
                int size9 = list.size();
                int i18 = 0;
                while (i18 < size9) {
                    Measurable measurable16 = list.get(i18);
                    if (Intrinsics.areEqual(LayoutIdKt.getLayoutId(measurable16), TextFieldImplKt.ContainerId)) {
                        final Placeable placeableMo5120measureBRTryo09 = measurable16.mo5120measureBRTryo0(ConstraintsKt.Constraints(iM1985calculateWidthDHJA7U0 != Integer.MAX_VALUE ? iM1985calculateWidthDHJA7U0 : 0, iM1985calculateWidthDHJA7U0, i17 != Integer.MAX_VALUE ? i17 : 0, i17));
                        final Placeable placeable5 = placeable;
                        return MeasureScope.layout$default(measureScope, iM1985calculateWidthDHJA7U0, iM1984calculateHeightmKXJcVc, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy$measure$1
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
                                OutlinedTextFieldKt.place(placementScope, iM1984calculateHeightmKXJcVc, iM1985calculateWidthDHJA7U0, placeable5, placeable4, placeable3, placeable2, placeableMo5120measureBRTryo06, placeableMo5120measureBRTryo05, placeableMo5120measureBRTryo07, placeableMo5120measureBRTryo09, placeableMo5120measureBRTryo08, outlinedTextFieldMeasurePolicy.animationProgress, outlinedTextFieldMeasurePolicy.singleLine, measureScope2.getDensity(), measureScope2.getLayoutDirection(), outlinedTextFieldMeasurePolicy.paddingValues);
                            }
                        }, 4, null);
                    }
                    i18++;
                    outlinedTextFieldMeasurePolicy = this;
                    measureScope2 = measureScope;
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            i12++;
            outlinedTextFieldMeasurePolicy = this;
            measureScope2 = measureScope;
            size7 = i13;
            placeableMo5120measureBRTryo03 = placeable3;
            placeableMo5120measureBRTryo02 = placeable4;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // androidx.compose.ui.layout.MeasurePolicy
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i2) {
        return intrinsicHeight(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicHeight.1
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
        return intrinsicWidth(intrinsicMeasureScope, list, i2, new Function2<IntrinsicMeasurable, Integer, Integer>() { // from class: androidx.compose.material3.OutlinedTextFieldMeasurePolicy.minIntrinsicWidth.1
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
