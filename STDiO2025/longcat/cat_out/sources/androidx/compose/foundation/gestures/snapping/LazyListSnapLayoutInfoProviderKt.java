package androidx.compose.foundation.gestures.snapping;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n\u001a\u001f\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a\u0019\u0010\u000e\u001a\u00020\u000f*\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\u0010\u0013\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0014"}, d2 = {"singleAxisViewportSize", "", "Landroidx/compose/foundation/lazy/LazyListLayoutInfo;", "getSingleAxisViewportSize", "(Landroidx/compose/foundation/lazy/LazyListLayoutInfo;)I", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "snapPosition", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "rememberSnapFlingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "calculateFinalSnappingItem", "Landroidx/compose/foundation/gestures/snapping/FinalSnappingItem;", "Landroidx/compose/ui/unit/Density;", "velocity", "", "(Landroidx/compose/ui/unit/Density;F)I", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyListSnapLayoutInfoProviderKt {
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final LazyListState lazyListState, final SnapPosition snapPosition) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt.SnapLayoutInfoProvider.1
            private final int getAverageItemSize() {
                LazyListLayoutInfo layoutInfo = getLayoutInfo();
                int size = 0;
                if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
                    return 0;
                }
                int size2 = layoutInfo.getVisibleItemsInfo().size();
                Iterator<T> it = layoutInfo.getVisibleItemsInfo().iterator();
                while (it.hasNext()) {
                    size += ((LazyListItemInfo) it.next()).getSize();
                }
                return size / size2;
            }

            private final LazyListLayoutInfo getLayoutInfo() {
                return lazyListState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float velocity, float decayOffset) {
                return Math.signum(decayOffset) * RangesKt.coerceAtLeast(Math.abs(decayOffset) - getAverageItemSize(), 0.0f);
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnapOffset(float velocity) {
                List<LazyListItemInfo> visibleItemsInfo = getLayoutInfo().getVisibleItemsInfo();
                SnapPosition snapPosition2 = snapPosition;
                int size = visibleItemsInfo.size();
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i2 = 0; i2 < size; i2++) {
                    LazyListItemInfo lazyListItemInfo = visibleItemsInfo.get(i2);
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionKt.calculateDistanceToDesiredSnapPosition(LazyListSnapLayoutInfoProviderKt.getSingleAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), lazyListItemInfo.getSize(), lazyListItemInfo.getOffset(), lazyListItemInfo.getIndex(), snapPosition2, getLayoutInfo().getTotalItemsCount());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                }
                return SnapFlingBehaviorKt.m488calculateFinalOffsetFhqu1e0(LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(lazyListState.getDensity$foundation_release(), velocity), f2, f3);
            }
        };
    }

    public static /* synthetic */ SnapLayoutInfoProvider SnapLayoutInfoProvider$default(LazyListState lazyListState, SnapPosition snapPosition, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        return SnapLayoutInfoProvider(lazyListState, snapPosition);
    }

    public static final int calculateFinalSnappingItem(Density density, float f2) {
        return Math.abs(f2) < density.mo334toPx0680j_4(SnapFlingBehaviorKt.getMinFlingVelocityDp()) ? FinalSnappingItem.INSTANCE.m485getClosestItembbeMdSM() : f2 > 0.0f ? FinalSnappingItem.INSTANCE.m486getNextItembbeMdSM() : FinalSnappingItem.INSTANCE.m487getPreviousItembbeMdSM();
    }

    public static final int getSingleAxisViewportSize(LazyListLayoutInfo lazyListLayoutInfo) {
        return lazyListLayoutInfo.getOrientation() == Orientation.Vertical ? IntSize.m6402getHeightimpl(lazyListLayoutInfo.mo747getViewportSizeYbymL2g()) : IntSize.m6403getWidthimpl(lazyListLayoutInfo.mo747getViewportSizeYbymL2g());
    }

    public static final FlingBehavior rememberSnapFlingBehavior(LazyListState lazyListState, SnapPosition snapPosition, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            snapPosition = SnapPosition.Center.INSTANCE;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-338621290, i2, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (LazyListSnapLayoutInfoProvider.kt:115)");
        }
        boolean z = (((i2 & 14) ^ 6) > 4 && composer.changed(lazyListState)) || (i2 & 6) == 4;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapLayoutInfoProvider(lazyListState, snapPosition);
            composer.updateRememberedValue(objRememberedValue);
        }
        TargetedFlingBehavior targetedFlingBehaviorRememberSnapFlingBehavior = SnapFlingBehaviorKt.rememberSnapFlingBehavior((SnapLayoutInfoProvider) objRememberedValue, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return targetedFlingBehaviorRememberSnapFlingBehavior;
    }
}
