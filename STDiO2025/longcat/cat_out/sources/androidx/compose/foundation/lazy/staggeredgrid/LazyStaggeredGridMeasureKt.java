package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.ui.graphics.GraphicsContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u009e\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0082\b\u001a5\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u0002H\n0\u000e¢\u0006\u0002\b\u000fH\u0083\b¢\u0006\u0002\u0010\u0010\u001aR\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00050\u000e2!\u0010\u0016\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00010\u000e2\u0006\u0010\u001a\u001a\u00020\u0001H\u0083\b\u001a;\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012*\u00020\u00142\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\b*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u001e0\u001dH\u0002¢\u0006\u0002\u0010$\u001a\u001c\u0010%\u001a\u00020\u0005*\u00020\u00142\u0006\u0010&\u001a\u00020 2\u0006\u0010'\u001a\u00020\u0003H\u0002\u001a7\u0010(\u001a\u00020\u0005\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00122\b\b\u0002\u0010)\u001a\u00020\u00012\u0012\u0010*\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\b\u001a\u001c\u0010+\u001a\u00020\u0003*\u00020\u00142\u0006\u0010,\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0003H\u0002\u001a+\u0010.\u001a\u00020\u0005*\u00020/2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u000eH\u0082\bø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a\f\u00102\u001a\u00020\u0003*\u00020 H\u0002\u001a2\u00103\u001a\u00020\u0003\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u001d2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u0002H\n\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b¢\u0006\u0002\u00104\u001a\u0016\u00105\u001a\u00020\u0003*\u00020 2\b\b\u0002\u00106\u001a\u00020\u0003H\u0000\u001a\u001e\u00107\u001a\u00020\u0003*\u00020 2\u0006\u00108\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a,\u0010;\u001a\u00020<*\u00020\u00142\u0006\u0010=\u001a\u00020\u00032\u0006\u0010>\u001a\u00020 2\u0006\u0010?\u001a\u00020 2\u0006\u0010@\u001a\u00020\u0001H\u0003\u001a\u008c\u0001\u0010A\u001a\u00020<*\u00020\f2\u0006\u0010B\u001a\u00020C2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u00012\u0006\u0010L\u001a\u00020\u00012\u0006\u0010M\u001a\u00020N2\u0006\u0010O\u001a\u00020\u00032\u0006\u0010P\u001a\u00020\u00032\u0006\u0010Q\u001a\u00020\u00032\u0006\u0010R\u001a\u00020\u00032\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020VH\u0001ø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a\u0014\u0010Y\u001a\u00020\u0005*\u00020 2\u0006\u0010Z\u001a\u00020\u0003H\u0002\u001a!\u0010[\u001a\u00020 *\u00020 2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000eH\u0082\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\\"}, d2 = {"DebugLoggingEnabled", "", "Unset", "", "debugLog", "", "message", "Lkotlin/Function0;", "", "withDebugLogging", "T", "scope", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "calculateExtraItems", "", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasuredItem;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;", "position", "filter", "Lkotlin/ParameterName;", "name", "itemIndex", "beforeVisibleBounds", "calculateVisibleItems", "measuredItems", "", "Lkotlin/collections/ArrayDeque;", "itemScrollOffsets", "", "mainAxisLayoutSize", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureContext;[Lkotlin/collections/ArrayDeque;[II)Ljava/util/List;", "debugRender", "([Lkotlin/collections/ArrayDeque;)Ljava/lang/String;", "ensureIndicesInRange", "indices", "itemCount", "fastForEach", "reverse", "action", "findPreviousItemIndex", "item", "lane", "forEach", "Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "forEach-nIS5qE8", "(JLkotlin/jvm/functions/Function1;)V", "indexOfMaxValue", "indexOfMinBy", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)I", "indexOfMinValue", "minBound", "maxInRange", "indexRange", "maxInRange-jy6DScQ", "([IJ)I", "measure", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "initialScrollDelta", "initialItemIndices", "initialItemOffsets", "canRestartMeasure", "measureStaggeredGrid", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "pinnedItems", "itemProvider", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;", "resolvedSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "isVertical", "reverseLayout", "contentOffset", "Landroidx/compose/ui/unit/IntOffset;", "mainAxisAvailableSize", "mainAxisSpacing", "beforeContentPadding", "afterContentPadding", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "measureStaggeredGrid-XtK8cYQ", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Ljava/util/List;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemProvider;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridSlots;JZZJIIIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasureResult;", "offsetBy", "delta", "transform", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridMeasureKt {
    private static final boolean DebugLoggingEnabled = false;
    private static final int Unset = Integer.MIN_VALUE;

    private static final List<LazyStaggeredGridMeasuredItem> calculateExtraItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, Function1<? super LazyStaggeredGridMeasuredItem, Unit> function1, Function1<? super Integer, Boolean> function12, boolean z) {
        List<Integer> pinnedItems = lazyStaggeredGridMeasureContext.getPinnedItems();
        ArrayList arrayList = null;
        if (z) {
            int size = pinnedItems.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = size - 1;
                    int iIntValue = pinnedItems.get(size).intValue();
                    if (function12.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                        long jM848getSpanRangelOCCd4c = lazyStaggeredGridMeasureContext.m848getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue, 0);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m857getAndMeasurejy6DScQ(iIntValue, jM848getSpanRangelOCCd4c);
                        function1.invoke(lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ);
                        arrayList.add(lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ);
                    }
                    if (i2 < 0) {
                        break;
                    }
                    size = i2;
                }
            }
        } else {
            int size2 = pinnedItems.size();
            for (int i3 = 0; i3 < size2; i3++) {
                int iIntValue2 = pinnedItems.get(i3).intValue();
                if (function12.invoke(Integer.valueOf(iIntValue2)).booleanValue()) {
                    long jM848getSpanRangelOCCd4c2 = lazyStaggeredGridMeasureContext.m848getSpanRangelOCCd4c(lazyStaggeredGridMeasureContext.getItemProvider(), iIntValue2, 0);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ2 = lazyStaggeredGridMeasureContext.getMeasuredItemProvider().m857getAndMeasurejy6DScQ(iIntValue2, jM848getSpanRangelOCCd4c2);
                    function1.invoke(lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ2);
                    arrayList.add(lazyStaggeredGridMeasuredItemM857getAndMeasurejy6DScQ2);
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<LazyStaggeredGridMeasuredItem> calculateVisibleItems(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr, int[] iArr, int i2) {
        int size = 0;
        for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque : arrayDequeArr) {
            size += arrayDeque.size();
        }
        ArrayList arrayList = new ArrayList(size);
        while (true) {
            for (ArrayDeque<LazyStaggeredGridMeasuredItem> arrayDeque2 : arrayDequeArr) {
                if (!arrayDeque2.isEmpty()) {
                    int length = arrayDequeArr.length;
                    int i3 = -1;
                    int i4 = Integer.MAX_VALUE;
                    for (int i5 = 0; i5 < length; i5++) {
                        LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemFirstOrNull = arrayDequeArr[i5].firstOrNull();
                        int index = lazyStaggeredGridMeasuredItemFirstOrNull != null ? lazyStaggeredGridMeasuredItemFirstOrNull.getIndex() : Integer.MAX_VALUE;
                        if (i4 > index) {
                            i3 = i5;
                            i4 = index;
                        }
                    }
                    LazyStaggeredGridMeasuredItem lazyStaggeredGridMeasuredItemRemoveFirst = arrayDequeArr[i3].removeFirst();
                    if (lazyStaggeredGridMeasuredItemRemoveFirst.getLane() == i3) {
                        long jM863constructorimpl = SpanRange.m863constructorimpl(lazyStaggeredGridMeasuredItemRemoveFirst.getLane(), lazyStaggeredGridMeasuredItemRemoveFirst.getSpan());
                        int iM852maxInRangejy6DScQ = m852maxInRangejy6DScQ(iArr, jM863constructorimpl);
                        lazyStaggeredGridMeasuredItemRemoveFirst.position(iM852maxInRangejy6DScQ, lazyStaggeredGridMeasureContext.getResolvedSlots().getPositions()[i3], i2);
                        arrayList.add(lazyStaggeredGridMeasuredItemRemoveFirst);
                        int i6 = (int) (jM863constructorimpl & 4294967295L);
                        for (int i7 = (int) (jM863constructorimpl >> 32); i7 < i6; i7++) {
                            iArr[i7] = lazyStaggeredGridMeasuredItemRemoveFirst.getMainAxisSizeWithSpacings() + iM852maxInRangejy6DScQ;
                        }
                    }
                }
            }
            return arrayList;
        }
    }

    private static final void debugLog(Function0<String> function0) {
    }

    private static final String debugRender(ArrayDeque<LazyStaggeredGridMeasuredItem>[] arrayDequeArr) {
        return "";
    }

    private static final void ensureIndicesInRange(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr, int i2) {
        int length = iArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i3 = length - 1;
            while (true) {
                if (iArr[length] < i2 && lazyStaggeredGridMeasureContext.getLaneInfo().assignedToLane(iArr[length], length)) {
                    break;
                } else {
                    iArr[length] = findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[length], length);
                }
            }
            if (iArr[length] >= 0 && !lazyStaggeredGridMeasureContext.isFullSpan(lazyStaggeredGridMeasureContext.getItemProvider(), iArr[length])) {
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[length], length);
            }
            if (i3 < 0) {
                return;
            } else {
                length = i3;
            }
        }
    }

    private static final <T> void fastForEach(List<? extends T> list, boolean z, Function1<? super T, Unit> function1) {
        if (!z) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                function1.invoke(list.get(i2));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i3 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i3 < 0) {
                return;
            } else {
                size2 = i3;
            }
        }
    }

    public static /* synthetic */ void fastForEach$default(List list, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = false;
        }
        if (!z) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                function1.invoke(list.get(i3));
            }
            return;
        }
        int size2 = list.size() - 1;
        if (size2 < 0) {
            return;
        }
        while (true) {
            int i4 = size2 - 1;
            function1.invoke(list.get(size2));
            if (i4 < 0) {
                return;
            } else {
                size2 = i4;
            }
        }
    }

    private static final int findPreviousItemIndex(LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int i2, int i3) {
        return lazyStaggeredGridMeasureContext.getLaneInfo().findPreviousItemIndex(i2, i3);
    }

    /* renamed from: forEach-nIS5qE8, reason: not valid java name */
    private static final void m851forEachnIS5qE8(long j2, Function1<? super Integer, Unit> function1) {
        int i2 = (int) (j2 & 4294967295L);
        for (int i3 = (int) (j2 >> 32); i3 < i2; i3++) {
            function1.invoke(Integer.valueOf(i3));
        }
    }

    private static final int indexOfMaxValue(int[] iArr) {
        int length = iArr.length;
        int i2 = -1;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i3 < i5) {
                i2 = i4;
                i3 = i5;
            }
        }
        return i2;
    }

    private static final <T> int indexOfMinBy(T[] tArr, Function1<? super T, Integer> function1) {
        int length = tArr.length;
        int i2 = -1;
        int i3 = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < length; i4++) {
            int iIntValue = function1.invoke(tArr[i4]).intValue();
            if (i3 > iIntValue) {
                i2 = i4;
                i3 = iIntValue;
            }
        }
        return i2;
    }

    public static final int indexOfMinValue(int[] iArr, int i2) {
        int length = iArr.length;
        int i3 = -1;
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i2 + 1;
            int i7 = iArr[i5];
            if (i6 <= i7 && i7 < i4) {
                i3 = i5;
                i4 = i7;
            }
        }
        return i3;
    }

    public static /* synthetic */ int indexOfMinValue$default(int[] iArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return indexOfMinValue(iArr, i2);
    }

    /* renamed from: maxInRange-jy6DScQ, reason: not valid java name */
    private static final int m852maxInRangejy6DScQ(int[] iArr, long j2) {
        int i2 = (int) (j2 & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i3 = (int) (j2 >> 32); i3 < i2; i3++) {
            iMax = Math.max(iMax, iArr[i3]);
        }
        return iMax;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f0, code lost:
    
        r5 = indexOfMinValue$default(r8, 0, 1, null);
        r6 = indexOfMaxValue(r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02fb, code lost:
    
        if (r5 == r6) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0301, code lost:
    
        if (r8[r5] != r8[r6]) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0303, code lost:
    
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0305, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0306, code lost:
    
        r6 = r28[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0309, code lost:
    
        if (r6 != (-1)) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x030b, code lost:
    
        r6 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030c, code lost:
    
        r6 = findPreviousItemIndex(r0, r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0310, code lost:
    
        if (r6 >= 0) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0312, code lost:
    
        r10 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0314, code lost:
    
        if (r1 != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x031a, code lost:
    
        if (measure$lambda$38$misalignedStart(r10, r0, r8, r5) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x031d, code lost:
    
        r15 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0320, code lost:
    
        if (r50 == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0322, code lost:
    
        r0.getLaneInfo().reset();
        r1 = r10.length;
        r2 = new int[r1];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x032d, code lost:
    
        if (r3 >= r1) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x032f, code lost:
    
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0336, code lost:
    
        r1 = r8.length;
        r3 = new int[r1];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x033a, code lost:
    
        if (r4 >= r1) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x033c, code lost:
    
        r3[r4] = r8[r5];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x034a, code lost:
    
        return measure(r0, r26, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0356, code lost:
    
        r15 = r26;
        r10 = r28;
        r25 = r1;
        r48 = r2;
        r1 = r0.m848getSpanRangelOCCd4c(r0.getItemProvider(), r6, r5);
        r5 = r0.getLaneInfo();
        r26 = r11;
        r28 = r12;
        r11 = (int) (r1 & 4294967295L);
        r12 = r3;
        r30 = r4;
        r3 = (int) (r1 >> 32);
        r4 = r11 - r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x037a, code lost:
    
        if (r4 == 1) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x037c, code lost:
    
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x037e, code lost:
    
        r14 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037f, code lost:
    
        r5.setLane(r6, r14);
        r5 = r0.getMeasuredItemProvider().m857getAndMeasurejy6DScQ(r6, r1);
        r1 = m852maxInRangejy6DScQ(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x038f, code lost:
    
        if (r4 == 1) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0391, code lost:
    
        r2 = r0.getLaneInfo().getGaps(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x039a, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x039b, code lost:
    
        if (r3 >= r11) goto L447;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x039f, code lost:
    
        if (r8[r3] == r1) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03a1, code lost:
    
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x03a3, code lost:
    
        r27[r3].addFirst(r5);
        r10[r3] = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03aa, code lost:
    
        if (r2 != null) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03ac, code lost:
    
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03ae, code lost:
    
        r4 = r2[r3];
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x03b0, code lost:
    
        r8[r3] = (r5.getMainAxisSizeWithSpacings() + r1) + r4;
        r3 = r3 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:298:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0738  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext r46, int r47, int[] r48, int[] r49, boolean r50) {
        /*
            Method dump skipped, instructions count: 2302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureKt.measure(androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureContext, int, int[], int[], boolean):androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridMeasureResult");
    }

    private static final boolean measure$lambda$38$hasSpaceBeforeFirst(int[] iArr, int[] iArr2, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = iArr[i2];
            if (iArr2[i2] < Math.max(-lazyStaggeredGridMeasureContext.getMainAxisSpacing(), 0) && i3 > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean measure$lambda$38$misalignedStart(int[] iArr, LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext, int[] iArr2, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i3], i3) == -1 && iArr2[i3] != iArr2[i2]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (findPreviousItemIndex(lazyStaggeredGridMeasureContext, iArr[i4], i4) != -1 && iArr2[i4] >= iArr2[i2]) {
                return true;
            }
        }
        int lane = lazyStaggeredGridMeasureContext.getLaneInfo().getLane(0);
        return (lane == 0 || lane == -1 || lane == -2) ? false : true;
    }

    /* renamed from: measureStaggeredGrid-XtK8cYQ, reason: not valid java name */
    public static final LazyStaggeredGridMeasureResult m853measureStaggeredGridXtK8cYQ(LazyLayoutMeasureScope lazyLayoutMeasureScope, LazyStaggeredGridState lazyStaggeredGridState, List<Integer> list, LazyStaggeredGridItemProvider lazyStaggeredGridItemProvider, LazyStaggeredGridSlots lazyStaggeredGridSlots, long j2, boolean z, boolean z2, long j3, int i2, int i3, int i4, int i5, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        int iM852maxInRangejy6DScQ;
        LazyStaggeredGridMeasureContext lazyStaggeredGridMeasureContext = new LazyStaggeredGridMeasureContext(lazyStaggeredGridState, list, lazyStaggeredGridItemProvider, lazyStaggeredGridSlots, j2, z, lazyLayoutMeasureScope, i2, j3, i4, i5, z2, i3, coroutineScope, graphicsContext, null);
        int[] iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyStaggeredGridState.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyStaggeredGridItemProvider, lazyStaggeredGridState.getScrollPosition().getIndices());
        int[] scrollOffsets = lazyStaggeredGridState.getScrollPosition().getScrollOffsets();
        if (iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            lazyStaggeredGridMeasureContext.getLaneInfo().reset();
            int laneCount = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr = new int[laneCount];
            int i6 = 0;
            while (i6 < laneCount) {
                if (i6 >= iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release.length || (iM852maxInRangejy6DScQ = iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release[i6]) == -1) {
                    iM852maxInRangejy6DScQ = i6 == 0 ? 0 : m852maxInRangejy6DScQ(iArr, SpanRange.m863constructorimpl(0, i6)) + 1;
                }
                iArr[i6] = iM852maxInRangejy6DScQ;
                lazyStaggeredGridMeasureContext.getLaneInfo().setLane(iArr[i6], i6);
                i6++;
            }
            iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = iArr;
        }
        if (scrollOffsets.length != lazyStaggeredGridMeasureContext.getLaneCount()) {
            int laneCount2 = lazyStaggeredGridMeasureContext.getLaneCount();
            int[] iArr2 = new int[laneCount2];
            int i7 = 0;
            while (i7 < laneCount2) {
                iArr2[i7] = i7 < scrollOffsets.length ? scrollOffsets[i7] : i7 == 0 ? 0 : iArr2[i7 - 1];
                i7++;
            }
            scrollOffsets = iArr2;
        }
        return measure(lazyStaggeredGridMeasureContext, Math.round(lazyStaggeredGridState.getScrollToBeConsumed()), iArrUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, scrollOffsets, true);
    }

    private static final void offsetBy(int[] iArr, int i2) {
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = iArr[i3] + i2;
        }
    }

    private static final int[] transform(int[] iArr, Function1<? super Integer, Integer> function1) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = function1.invoke(Integer.valueOf(iArr[i2])).intValue();
        }
        return iArr;
    }

    private static final <T> T withDebugLogging(LazyLayoutMeasureScope lazyLayoutMeasureScope, Function1<? super LazyLayoutMeasureScope, ? extends T> function1) {
        return function1.invoke(lazyLayoutMeasureScope);
    }
}
