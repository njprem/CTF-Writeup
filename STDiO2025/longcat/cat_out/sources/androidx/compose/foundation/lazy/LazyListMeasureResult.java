package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u009d\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006¢\u0006\u0002\u0010\u001eJ\t\u0010W\u001a\u00020HH\u0096\u0001J\u0016\u0010X\u001a\u00020\b2\u0006\u0010Y\u001a\u00020\u00062\u0006\u0010Z\u001a\u00020\bR\u0014\u0010\u001c\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001e\u0010!\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00060\"X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010 R\u0011\u0010(\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010*\"\u0004\b,\u0010-R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010 \"\u0004\b<\u0010=R\u0012\u0010>\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010 R\u0014\u0010\u001d\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010 R\u0014\u0010\u001a\u001a\u00020\u001bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bC\u0010*R\u0014\u0010\u0019\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010*R'\u0010E\u001a\u0015\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020H\u0018\u00010F¢\u0006\u0002\bI8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bL\u00102R\u0014\u0010\u0018\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010 R\u0014\u0010\u0017\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u0010 R\u001a\u0010O\u001a\u00020P8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010/R\u0014\u0010\u0016\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bR\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0015X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0012\u0010U\u001a\u00020\u0006X\u0096\u0005¢\u0006\u0006\u001a\u0004\bV\u0010 \u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006["}, d2 = {"Landroidx/compose/foundation/lazy/LazyListMeasureResult;", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "Landroidx/compose/ui/layout/MeasureResult;", "firstVisibleItem", "Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "firstVisibleItemScrollOffset", "", "canScrollForward", "", "consumedScroll", "", "measureResult", "scrollBackAmount", "remeasureNeeded", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "density", "Landroidx/compose/ui/unit/Density;", "childConstraints", "Landroidx/compose/ui/unit/Constraints;", "visibleItemsInfo", "", "viewportStartOffset", "viewportEndOffset", "totalItemsCount", "reverseLayout", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "afterContentPadding", "mainAxisItemSpacing", "(Landroidx/compose/foundation/lazy/LazyListMeasuredItem;IZFLandroidx/compose/ui/layout/MeasureResult;FZLkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/unit/Density;JLjava/util/List;IIIZLandroidx/compose/foundation/gestures/Orientation;IILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAfterContentPadding", "()I", "alignmentLines", "", "Landroidx/compose/ui/layout/AlignmentLine;", "getAlignmentLines", "()Ljava/util/Map;", "beforeContentPadding", "getBeforeContentPadding", "canScrollBackward", "getCanScrollBackward", "()Z", "getCanScrollForward", "setCanScrollForward", "(Z)V", "getChildConstraints-msEJaDk", "()J", "J", "getConsumedScroll", "()F", "setConsumedScroll", "(F)V", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "getFirstVisibleItem", "()Landroidx/compose/foundation/lazy/LazyListMeasuredItem;", "getFirstVisibleItemScrollOffset", "setFirstVisibleItemScrollOffset", "(I)V", "height", "getHeight", "getMainAxisItemSpacing", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "getRemeasureNeeded", "getReverseLayout", "rulers", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "getRulers", "()Lkotlin/jvm/functions/Function1;", "getScrollBackAmount", "getTotalItemsCount", "getViewportEndOffset", "viewportSize", "Landroidx/compose/ui/unit/IntSize;", "getViewportSize-YbymL2g", "getViewportStartOffset", "getVisibleItemsInfo", "()Ljava/util/List;", "width", "getWidth", "placeChildren", "tryToApplyScrollWithoutRemeasure", "delta", "updateAnimations", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListMeasureResult implements LazyListLayoutInfo, MeasureResult {
    public static final int $stable = 8;
    private final /* synthetic */ MeasureResult $$delegate_0;
    private final int afterContentPadding;
    private boolean canScrollForward;
    private final long childConstraints;
    private float consumedScroll;
    private final CoroutineScope coroutineScope;
    private final Density density;
    private final LazyListMeasuredItem firstVisibleItem;
    private int firstVisibleItemScrollOffset;
    private final int mainAxisItemSpacing;
    private final Orientation orientation;
    private final boolean remeasureNeeded;
    private final boolean reverseLayout;
    private final float scrollBackAmount;
    private final int totalItemsCount;
    private final int viewportEndOffset;
    private final int viewportStartOffset;
    private final List<LazyListMeasuredItem> visibleItemsInfo;

    public /* synthetic */ LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z, float f2, MeasureResult measureResult, float f3, boolean z2, CoroutineScope coroutineScope, Density density, long j2, List list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(lazyListMeasuredItem, i2, z, f2, measureResult, f3, z2, coroutineScope, density, j2, list, i3, i4, i5, z3, orientation, i6, i7);
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getAfterContentPadding() {
        return this.afterContentPadding;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Map<AlignmentLine, Integer> getAlignmentLines() {
        return this.$$delegate_0.getAlignmentLines();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getBeforeContentPadding() {
        return -getViewportStartOffset();
    }

    public final boolean getCanScrollBackward() {
        LazyListMeasuredItem lazyListMeasuredItem = this.firstVisibleItem;
        return ((lazyListMeasuredItem != null ? lazyListMeasuredItem.getIndex() : 0) == 0 && this.firstVisibleItemScrollOffset == 0) ? false : true;
    }

    public final boolean getCanScrollForward() {
        return this.canScrollForward;
    }

    /* renamed from: getChildConstraints-msEJaDk, reason: not valid java name and from getter */
    public final long getChildConstraints() {
        return this.childConstraints;
    }

    public final float getConsumedScroll() {
        return this.consumedScroll;
    }

    public final CoroutineScope getCoroutineScope() {
        return this.coroutineScope;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final LazyListMeasuredItem getFirstVisibleItem() {
        return this.firstVisibleItem;
    }

    public final int getFirstVisibleItemScrollOffset() {
        return this.firstVisibleItemScrollOffset;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getHeight */
    public int get$height() {
        return this.$$delegate_0.get$height();
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getMainAxisItemSpacing() {
        return this.mainAxisItemSpacing;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public Orientation getOrientation() {
        return this.orientation;
    }

    public final boolean getRemeasureNeeded() {
        return this.remeasureNeeded;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public boolean getReverseLayout() {
        return this.reverseLayout;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public Function1<RulerScope, Unit> getRulers() {
        return this.$$delegate_0.getRulers();
    }

    public final float getScrollBackAmount() {
        return this.scrollBackAmount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getTotalItemsCount() {
        return this.totalItemsCount;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportEndOffset() {
        return this.viewportEndOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    /* renamed from: getViewportSize-YbymL2g */
    public long mo747getViewportSizeYbymL2g() {
        return IntSizeKt.IntSize(get$width(), get$height());
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public int getViewportStartOffset() {
        return this.viewportStartOffset;
    }

    @Override // androidx.compose.foundation.lazy.LazyListLayoutInfo
    public List<LazyListMeasuredItem> getVisibleItemsInfo() {
        return this.visibleItemsInfo;
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    /* renamed from: getWidth */
    public int get$width() {
        return this.$$delegate_0.get$width();
    }

    @Override // androidx.compose.ui.layout.MeasureResult
    public void placeChildren() {
        this.$$delegate_0.placeChildren();
    }

    public final void setCanScrollForward(boolean z) {
        this.canScrollForward = z;
    }

    public final void setConsumedScroll(float f2) {
        this.consumedScroll = f2;
    }

    public final void setFirstVisibleItemScrollOffset(int i2) {
        this.firstVisibleItemScrollOffset = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0062, code lost:
    
        if (java.lang.Math.min((r0.getMainAxisSizeWithSpacings() + r0.getOffset()) - getViewportStartOffset(), (r2.getMainAxisSizeWithSpacings() + r2.getOffset()) - getViewportEndOffset()) > (-r5)) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        if (java.lang.Math.min(getViewportStartOffset() - r0.getOffset(), getViewportEndOffset() - r2.getOffset()) > r5) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        r4.firstVisibleItemScrollOffset -= r5;
        r0 = getVisibleItemsInfo();
        r2 = r0.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
    
        if (r1 >= r2) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        r0.get(r1).applyScrollDelta(r5, r6);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0098, code lost:
    
        r4.consumedScroll = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009e, code lost:
    
        if (r4.canScrollForward != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        if (r5 <= 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
    
        r4.canScrollForward = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a4, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean tryToApplyScrollWithoutRemeasure(int r5, boolean r6) {
        /*
            r4 = this;
            boolean r0 = r4.remeasureNeeded
            r1 = 0
            if (r0 != 0) goto La5
            java.util.List r0 = r4.getVisibleItemsInfo()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto La5
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = r4.firstVisibleItem
            if (r0 == 0) goto La5
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r2 = r4.firstVisibleItemScrollOffset
            int r2 = r2 - r5
            if (r2 < 0) goto La5
            if (r2 >= r0) goto La5
            java.util.List r0 = r4.getVisibleItemsInfo()
            java.lang.Object r0 = kotlin.collections.CollectionsKt.first(r0)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r0 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r0
            java.util.List r2 = r4.getVisibleItemsInfo()
            java.lang.Object r2 = kotlin.collections.CollectionsKt.last(r2)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r2 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r2
            boolean r3 = r0.getNonScrollableItem()
            if (r3 != 0) goto La5
            boolean r3 = r2.getNonScrollableItem()
            if (r3 == 0) goto L3f
            goto La5
        L3f:
            if (r5 >= 0) goto L65
            int r3 = r0.getOffset()
            int r0 = r0.getMainAxisSizeWithSpacings()
            int r0 = r0 + r3
            int r3 = r4.getViewportStartOffset()
            int r0 = r0 - r3
            int r3 = r2.getOffset()
            int r2 = r2.getMainAxisSizeWithSpacings()
            int r2 = r2 + r3
            int r3 = r4.getViewportEndOffset()
            int r2 = r2 - r3
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = -r5
            if (r0 <= r2) goto La5
            goto L7d
        L65:
            int r3 = r4.getViewportStartOffset()
            int r0 = r0.getOffset()
            int r3 = r3 - r0
            int r0 = r4.getViewportEndOffset()
            int r2 = r2.getOffset()
            int r0 = r0 - r2
            int r0 = java.lang.Math.min(r3, r0)
            if (r0 <= r5) goto La5
        L7d:
            int r0 = r4.firstVisibleItemScrollOffset
            int r0 = r0 - r5
            r4.firstVisibleItemScrollOffset = r0
            java.util.List r0 = r4.getVisibleItemsInfo()
            int r2 = r0.size()
        L8a:
            if (r1 >= r2) goto L98
            java.lang.Object r3 = r0.get(r1)
            androidx.compose.foundation.lazy.LazyListMeasuredItem r3 = (androidx.compose.foundation.lazy.LazyListMeasuredItem) r3
            r3.applyScrollDelta(r5, r6)
            int r1 = r1 + 1
            goto L8a
        L98:
            float r6 = (float) r5
            r4.consumedScroll = r6
            boolean r6 = r4.canScrollForward
            r0 = 1
            if (r6 != 0) goto La4
            if (r5 <= 0) goto La4
            r4.canScrollForward = r0
        La4:
            return r0
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyListMeasureResult.tryToApplyScrollWithoutRemeasure(int, boolean):boolean");
    }

    private LazyListMeasureResult(LazyListMeasuredItem lazyListMeasuredItem, int i2, boolean z, float f2, MeasureResult measureResult, float f3, boolean z2, CoroutineScope coroutineScope, Density density, long j2, List<LazyListMeasuredItem> list, int i3, int i4, int i5, boolean z3, Orientation orientation, int i6, int i7) {
        this.firstVisibleItem = lazyListMeasuredItem;
        this.firstVisibleItemScrollOffset = i2;
        this.canScrollForward = z;
        this.consumedScroll = f2;
        this.scrollBackAmount = f3;
        this.remeasureNeeded = z2;
        this.coroutineScope = coroutineScope;
        this.density = density;
        this.childConstraints = j2;
        this.visibleItemsInfo = list;
        this.viewportStartOffset = i3;
        this.viewportEndOffset = i4;
        this.totalItemsCount = i5;
        this.reverseLayout = z3;
        this.orientation = orientation;
        this.afterContentPadding = i6;
        this.mainAxisItemSpacing = i7;
        this.$$delegate_0 = measureResult;
    }
}
