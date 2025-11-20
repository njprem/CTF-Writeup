package androidx.compose.material3.carousel;

import androidx.compose.ui.util.MathHelpersKt;
import j.AbstractC0655h;
import j.AbstractC0656i;
import j.C0636B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a%\u0010\t\u001a\u00020\u00032\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006\u001a5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a5\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000e\u001a?\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a7\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001a-\u0010!\u001a\u00020 2\u0006\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"\u001a'\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\u00142\u0006\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0003H\u0002¢\u0006\u0004\b'\u0010(\u001a/\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120)*\b\u0012\u0004\u0012\u00020\u00120)2\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010+\u001a7\u00101\u001a\u00020\u00032\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00032\u0006\u00100\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102¨\u00063"}, d2 = {"", "Landroidx/compose/material3/carousel/KeylineList;", "startKeylineSteps", "", "beforeContentPadding", "getStartShiftDistance", "(Ljava/util/List;F)F", "endKeylineSteps", "afterContentPadding", "getEndShiftDistance", "defaultKeylines", "carouselMainAxisSize", "itemSpacing", "getStartKeylineSteps", "(Landroidx/compose/material3/carousel/KeylineList;FFF)Ljava/util/List;", "getEndKeylineSteps", "from", "contentPadding", "Landroidx/compose/material3/carousel/Keyline;", "pivot", "", "pivotIndex", "createShiftedKeylineListForContentPadding", "(Landroidx/compose/material3/carousel/KeylineList;FFFLandroidx/compose/material3/carousel/Keyline;I)Landroidx/compose/material3/carousel/KeylineList;", "srcIndex", "dstIndex", "moveKeylineAndCreateShiftedKeylineList", "(Landroidx/compose/material3/carousel/KeylineList;IIFF)Landroidx/compose/material3/carousel/KeylineList;", "totalShiftDistance", "steps", "", "isShiftingLeft", "Lj/h;", "getStepInterpolationPoints", "(FLjava/util/List;Z)Lj/h;", "stepsCount", "shiftPoint", "interpolation", "Landroidx/compose/material3/carousel/ShiftPointRange;", "getShiftPointRange", "(ILj/h;F)Landroidx/compose/material3/carousel/ShiftPointRange;", "", "move", "(Ljava/util/List;II)Ljava/util/List;", "outputMin", "outputMax", "inputMin", "inputMax", "value", "lerp", "(FFFFF)F", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StrategyKt {
    private static final KeylineList createShiftedKeylineListForContentPadding(final KeylineList keylineList, float f2, float f3, float f4, Keyline keyline, int i2) {
        ArrayList arrayList = new ArrayList(keylineList.size());
        int size = keylineList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Keyline keyline2 = keylineList.get(i3);
            if (!keyline2.isAnchor()) {
                arrayList.add(keyline2);
            }
        }
        final float size2 = f4 / arrayList.size();
        KeylineList keylineListKeylineListOf = KeylineListKt.keylineListOf(f2, f3, i2, (keyline.getOffset() - (size2 / 2.0f)) + f4, new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt$createShiftedKeylineListForContentPadding$newKeylines$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                KeylineList keylineList2 = keylineList;
                float f5 = size2;
                int size3 = keylineList2.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    Keyline keyline3 = keylineList2.get(i4);
                    keylineListScope.add(keyline3.getSize() - Math.abs(f5), keyline3.isAnchor());
                }
            }
        });
        ArrayList arrayList2 = new ArrayList(keylineListKeylineListOf.size());
        int size3 = keylineListKeylineListOf.size();
        for (int i4 = 0; i4 < size3; i4++) {
            arrayList2.add(Keyline.copy$default(keylineListKeylineListOf.get(i4), 0.0f, 0.0f, keylineList.get(i4).getUnadjustedOffset(), false, false, false, 0.0f, 123, null));
        }
        return new KeylineList(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getEndKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isLastFocalItemAtEndOfContainer(f2)) {
            if (f4 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, -f4, keylineList.getLastFocal(), keylineList.getLastFocalIndex()));
            return arrayList;
        }
        int lastFocalIndex = keylineList.getLastFocalIndex();
        int lastNonAnchorIndex = keylineList.getLastNonAnchorIndex();
        int i2 = lastNonAnchorIndex - lastFocalIndex;
        if (i2 <= 0 && keylineList.getLastFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
            return arrayList;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i4 = lastNonAnchorIndex - i3;
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getLastNonAnchorIndex(), i4 < CollectionsKt.getLastIndex(keylineList) ? keylineList2.lastIndexBeforeFocalRangeWithSize(keylineList.get(i4 + 1).getSize()) + 1 : 0, f2, f3));
        }
        if (f4 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last((List) arrayList), f2, f3, -f4, ((KeylineList) CollectionsKt.last((List) arrayList)).getLastFocal(), ((KeylineList) CollectionsKt.last((List) arrayList)).getLastFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getEndShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.last((List) CollectionsKt.first((List) list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) CollectionsKt.last((List) list))).getUnadjustedOffset(), f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ShiftPointRange getShiftPointRange(int i2, AbstractC0655h abstractC0655h, float f2) {
        float fA = abstractC0655h.a(0);
        Iterator<Integer> it = RangesKt.until(1, i2).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            float fA2 = abstractC0655h.a(iNextInt);
            if (f2 <= fA2) {
                return new ShiftPointRange(iNextInt - 1, iNextInt, lerp(0.0f, 1.0f, fA, fA2, f2));
            }
            fA = fA2;
        }
        return new ShiftPointRange(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<KeylineList> getStartKeylineSteps(KeylineList keylineList, float f2, float f3, float f4) {
        if (keylineList.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(keylineList);
        if (keylineList.isFirstFocalItemAtStartOfContainer()) {
            if (f4 == 0.0f) {
                return arrayList;
            }
            arrayList.add(createShiftedKeylineListForContentPadding(keylineList, f2, f3, f4, keylineList.getFirstFocal(), keylineList.getFirstFocalIndex()));
            return arrayList;
        }
        int firstNonAnchorIndex = keylineList.getFirstNonAnchorIndex();
        int firstFocalIndex = keylineList.getFirstFocalIndex() - firstNonAnchorIndex;
        if (firstFocalIndex <= 0 && keylineList.getFirstFocal().getCutoff() > 0.0f) {
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList, 0, 0, f2, f3));
            return arrayList;
        }
        for (int i2 = 0; i2 < firstFocalIndex; i2++) {
            KeylineList keylineList2 = (KeylineList) CollectionsKt.last((List) arrayList);
            int i3 = firstNonAnchorIndex + i2;
            int lastIndex = CollectionsKt.getLastIndex(keylineList);
            if (i3 > 0) {
                lastIndex = keylineList2.firstIndexAfterFocalRangeWithSize(keylineList.get(i3 - 1).getSize()) - 1;
            }
            arrayList.add(moveKeylineAndCreateShiftedKeylineList(keylineList2, keylineList.getFirstNonAnchorIndex(), lastIndex, f2, f3));
        }
        if (f4 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), createShiftedKeylineListForContentPadding((KeylineList) CollectionsKt.last((List) arrayList), f2, f3, f4, ((KeylineList) CollectionsKt.last((List) arrayList)).getFirstFocal(), ((KeylineList) CollectionsKt.last((List) arrayList)).getFirstFocalIndex()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float getStartShiftDistance(List<KeylineList> list, float f2) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((Keyline) CollectionsKt.first((List) CollectionsKt.last((List) list))).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) CollectionsKt.first((List) list))).getUnadjustedOffset(), f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractC0655h getStepInterpolationPoints(float f2, List<KeylineList> list, boolean z) {
        int i2 = AbstractC0656i.f837a;
        C0636B c0636b = new C0636B();
        c0636b.f832a = new float[1];
        c0636b.b(0.0f);
        if (f2 != 0.0f && !list.isEmpty()) {
            IntRange intRangeUntil = RangesKt.until(1, list.size());
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i3 = iNextInt - 1;
                KeylineList keylineList = list.get(i3);
                KeylineList keylineList2 = list.get(iNextInt);
                c0636b.b(iNextInt == CollectionsKt.getLastIndex(list) ? 1.0f : c0636b.a(i3) + ((z ? ((Keyline) CollectionsKt.first((List) keylineList2)).getUnadjustedOffset() - ((Keyline) CollectionsKt.first((List) keylineList)).getUnadjustedOffset() : ((Keyline) CollectionsKt.last((List) keylineList)).getUnadjustedOffset() - ((Keyline) CollectionsKt.last((List) keylineList2)).getUnadjustedOffset()) / f2));
                arrayList.add(Boolean.TRUE);
            }
        }
        return c0636b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float lerp(float f2, float f3, float f4, float f5, float f6) {
        return f6 <= f4 ? f2 : f6 >= f5 ? f3 : MathHelpersKt.lerp(f2, f3, (f6 - f4) / (f5 - f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Keyline> move(List<Keyline> list, int i2, int i3) {
        Keyline keyline = list.get(i2);
        list.remove(i2);
        list.add(i3, keyline);
        return list;
    }

    private static final KeylineList moveKeylineAndCreateShiftedKeylineList(final KeylineList keylineList, final int i2, final int i3, float f2, float f3) {
        int i4 = i2 > i3 ? 1 : -1;
        return KeylineListKt.keylineListOf(f2, f3, keylineList.getPivotIndex() + i4, keylineList.getPivot().getOffset() + (((keylineList.get(i2).getSize() - keylineList.get(i2).getCutoff()) + f3) * i4), new Function1<KeylineListScope, Unit>() { // from class: androidx.compose.material3.carousel.StrategyKt.moveKeylineAndCreateShiftedKeylineList.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(KeylineListScope keylineListScope) {
                invoke2(keylineListScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(KeylineListScope keylineListScope) {
                List listMove = StrategyKt.move(CollectionsKt.toMutableList((Collection) keylineList), i2, i3);
                int size = listMove.size();
                for (int i5 = 0; i5 < size; i5++) {
                    Keyline keyline = (Keyline) listMove.get(i5);
                    keylineListScope.add(keyline.getSize(), keyline.isAnchor());
                }
            }
        });
    }
}
