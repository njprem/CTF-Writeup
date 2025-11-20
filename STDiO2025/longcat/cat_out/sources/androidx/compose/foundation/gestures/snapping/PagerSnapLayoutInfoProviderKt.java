package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.PageInfo;
import androidx.compose.foundation.pager.PagerLayoutInfo;
import androidx.compose.foundation.pager.PagerLayoutInfoKt;
import androidx.compose.foundation.pager.PagerSnapDistance;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.ui.geometry.Offset;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007H\u0000\u001a8\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0000\u001a\u0017\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082\b\u001a\f\u0010\u0014\u001a\u00020\b*\u00020\u0003H\u0002\u001a\f\u0010\u0015\u001a\u00020\u0016*\u00020\u0003H\u0002\u001a\f\u0010\u0017\u001a\u00020\u0016*\u00020\u0003H\u0002¨\u0006\u0018"}, d2 = {"SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "calculateFinalSnappingBound", "Lkotlin/Function3;", "", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "snapPositionalThreshold", "flingVelocity", "lowerBoundOffset", "upperBoundOffset", "debugLog", "", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isLtrDragging", "", "isScrollingForward", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PagerSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final Function3<? super Float, ? super Float, ? super Float, Float> function3) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final Pair<Float, Float> searchForSnappingBounds(SnapPosition snapPosition) {
                float f2;
                List<PageInfo> visiblePagesInfo = getLayoutInfo().getVisiblePagesInfo();
                PagerState pagerState2 = pagerState;
                int size = visiblePagesInfo.size();
                float f3 = Float.NEGATIVE_INFINITY;
                float f4 = Float.POSITIVE_INFINITY;
                int i2 = 0;
                while (true) {
                    f2 = 0.0f;
                    if (i2 >= size) {
                        break;
                    }
                    PageInfo pageInfo = visiblePagesInfo.get(i2);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), pageInfo.getOffset(), pageInfo.getIndex(), snapPosition, pagerState2.getPageCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f4) {
                        f4 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i2++;
                }
                if (f3 == Float.NEGATIVE_INFINITY) {
                    f3 = f4;
                }
                if (f4 == Float.POSITIVE_INFINITY) {
                    f4 = f3;
                }
                boolean z = PagerSnapLayoutInfoProviderKt.dragGestureDelta(pagerState) == 0.0f;
                if (!pagerState.getCanScrollForward()) {
                    if (z || !PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState)) {
                        f4 = 0.0f;
                    } else {
                        f3 = 0.0f;
                        f4 = 0.0f;
                    }
                }
                if (pagerState.getCanScrollBackward()) {
                    f2 = f3;
                } else if (!z && !PagerSnapLayoutInfoProviderKt.isScrollingForward(pagerState)) {
                    f4 = 0.0f;
                }
                return TuplesKt.to(Float.valueOf(f2), Float.valueOf(f4));
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                int pageSpacing$foundation_release = pagerState.getPageSpacing$foundation_release() + pagerState.getPageSize$foundation_release();
                if (pageSpacing$foundation_release == 0) {
                    return 0.0f;
                }
                int firstVisiblePage = velocity < 0.0f ? pagerState.getFirstVisiblePage() + 1 : pagerState.getFirstVisiblePage();
                int iCoerceAtLeast = RangesKt.coerceAtLeast(Math.abs((RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage, RangesKt.coerceIn(((int) (decayOffset / pageSpacing$foundation_release)) + firstVisiblePage, 0, pagerState.getPageCount()), velocity, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount()) - firstVisiblePage) * pageSpacing$foundation_release) - pageSpacing$foundation_release, 0);
                return iCoerceAtLeast == 0 ? iCoerceAtLeast : iCoerceAtLeast * Math.signum(velocity);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                Pair<Float, Float> pairSearchForSnappingBounds = searchForSnappingBounds(pagerState.getLayoutInfo().getSnapPosition());
                float fFloatValue = pairSearchForSnappingBounds.component1().floatValue();
                float fFloatValue2 = pairSearchForSnappingBounds.component2().floatValue();
                float fFloatValue3 = function3.invoke(Float.valueOf(velocity), Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2)).floatValue();
                if (fFloatValue3 == fFloatValue || fFloatValue3 == fFloatValue2 || fFloatValue3 == 0.0f) {
                    if (isValidDistance(fFloatValue3)) {
                        return fFloatValue3;
                    }
                    return 0.0f;
                }
                throw new IllegalStateException(("Final Snapping Offset Should Be one of " + fFloatValue + ", " + fFloatValue2 + " or 0.0").toString());
            }

            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            public final boolean isValidDistance(float f2) {
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState r5, androidx.compose.ui.unit.LayoutDirection r6, float r7, float r8, float r9, float r10) {
        /*
            androidx.compose.foundation.pager.PagerLayoutInfo r0 = r5.getLayoutInfo()
            androidx.compose.foundation.gestures.Orientation r0 = r0.getOrientation()
            androidx.compose.foundation.gestures.Orientation r1 = androidx.compose.foundation.gestures.Orientation.Vertical
            if (r0 != r1) goto L11
            boolean r6 = isScrollingForward(r5)
            goto L23
        L11:
            androidx.compose.ui.unit.LayoutDirection r0 = androidx.compose.ui.unit.LayoutDirection.Ltr
            if (r6 != r0) goto L1a
            boolean r6 = isScrollingForward(r5)
            goto L23
        L1a:
            boolean r6 = isScrollingForward(r5)
            if (r6 != 0) goto L22
            r6 = 1
            goto L23
        L22:
            r6 = 0
        L23:
            androidx.compose.foundation.pager.PagerLayoutInfo r0 = r5.getLayoutInfo()
            int r0 = r0.getPageSize()
            r1 = 0
            if (r0 != 0) goto L30
            r2 = r1
            goto L36
        L30:
            float r2 = dragGestureDelta(r5)
            float r0 = (float) r0
            float r2 = r2 / r0
        L36:
            int r0 = (int) r2
            float r0 = (float) r0
            float r0 = r2 - r0
            androidx.compose.ui.unit.Density r3 = r5.getDensity()
            int r8 = androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(r3, r8)
            androidx.compose.foundation.gestures.snapping.FinalSnappingItem$Companion r3 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.INSTANCE
            int r4 = r3.m485getClosestItembbeMdSM()
            boolean r4 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m481equalsimpl0(r8, r4)
            if (r4 == 0) goto L79
            float r8 = java.lang.Math.abs(r0)
            int r7 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r7 <= 0) goto L59
            if (r6 == 0) goto L8e
            goto L83
        L59:
            float r7 = java.lang.Math.abs(r2)
            float r5 = r5.getPositionThresholdFraction$foundation_release()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 < 0) goto L6c
            if (r6 == 0) goto L83
            goto L8e
        L6c:
            float r5 = java.lang.Math.abs(r9)
            float r6 = java.lang.Math.abs(r10)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 >= 0) goto L83
            goto L8e
        L79:
            int r5 = r3.m486getNextItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m481equalsimpl0(r8, r5)
            if (r5 == 0) goto L84
        L83:
            return r10
        L84:
            int r5 = r3.m487getPreviousItembbeMdSM()
            boolean r5 = androidx.compose.foundation.gestures.snapping.FinalSnappingItem.m481equalsimpl0(r8, r5)
            if (r5 == 0) goto L8f
        L8e:
            return r9
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.PagerSnapLayoutInfoProviderKt.calculateFinalSnappingBound(androidx.compose.foundation.pager.PagerState, androidx.compose.ui.unit.LayoutDirection, float, float, float, float):float");
    }

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        return pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal ? Offset.m3551getXimpl(pagerState.m890getUpDownDifferenceF1C5BW0$foundation_release()) : Offset.m3552getYimpl(pagerState.m890getUpDownDifferenceF1C5BW0$foundation_release());
    }

    private static final boolean isLtrDragging(PagerState pagerState) {
        return dragGestureDelta(pagerState) > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        boolean reverseLayout = pagerState.getLayoutInfo().getReverseLayout();
        if (isLtrDragging(pagerState) && reverseLayout) {
            return true;
        }
        return (isLtrDragging(pagerState) || reverseLayout) ? false : true;
    }
}
