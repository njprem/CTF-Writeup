package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0002*\u00020\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\t\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\n\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b\u001a\u000f\u0010\u000b\u001a\u00020\u0007*\u00020\u0002¢\u0006\u0002\u0010\b¨\u0006\f"}, d2 = {"boundsInParent", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "boundsInRoot", "boundsInWindow", "findRootCoordinates", "positionInParent", "Landroidx/compose/ui/geometry/Offset;", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "positionInRoot", "positionInWindow", "positionOnScreen", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectLocalBoundingBoxOf$default;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return (parentLayoutCoordinates == null || (rectLocalBoundingBoxOf$default = LayoutCoordinates.localBoundingBoxOf$default(parentLayoutCoordinates, layoutCoordinates, false, 2, null)) == null) ? new Rect(0.0f, 0.0f, IntSize.m6403getWidthimpl(layoutCoordinates.mo5128getSizeYbymL2g()), IntSize.m6402getHeightimpl(layoutCoordinates.mo5128getSizeYbymL2g())) : rectLocalBoundingBoxOf$default;
    }

    public static final Rect boundsInRoot(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.localBoundingBoxOf$default(findRootCoordinates(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect boundsInWindow(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = findRootCoordinates(layoutCoordinates);
        float fM6403getWidthimpl = IntSize.m6403getWidthimpl(layoutCoordinatesFindRootCoordinates.mo5128getSizeYbymL2g());
        float fM6402getHeightimpl = IntSize.m6402getHeightimpl(layoutCoordinatesFindRootCoordinates.mo5128getSizeYbymL2g());
        Rect rectBoundsInRoot = boundsInRoot(layoutCoordinates);
        float left = rectBoundsInRoot.getLeft();
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fM6403getWidthimpl) {
            left = fM6403getWidthimpl;
        }
        float top = rectBoundsInRoot.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fM6402getHeightimpl) {
            top = fM6402getHeightimpl;
        }
        float right = rectBoundsInRoot.getRight();
        if (right < 0.0f) {
            right = 0.0f;
        }
        if (right <= fM6403getWidthimpl) {
            fM6403getWidthimpl = right;
        }
        float bottom = rectBoundsInRoot.getBottom();
        float f2 = bottom >= 0.0f ? bottom : 0.0f;
        if (f2 <= fM6402getHeightimpl) {
            fM6402getHeightimpl = f2;
        }
        if (left == fM6403getWidthimpl || top == fM6402getHeightimpl) {
            return Rect.INSTANCE.getZero();
        }
        long jMo5133localToWindowMKHz9U = layoutCoordinatesFindRootCoordinates.mo5133localToWindowMKHz9U(OffsetKt.Offset(left, top));
        long jMo5133localToWindowMKHz9U2 = layoutCoordinatesFindRootCoordinates.mo5133localToWindowMKHz9U(OffsetKt.Offset(fM6403getWidthimpl, top));
        long jMo5133localToWindowMKHz9U3 = layoutCoordinatesFindRootCoordinates.mo5133localToWindowMKHz9U(OffsetKt.Offset(fM6403getWidthimpl, fM6402getHeightimpl));
        long jMo5133localToWindowMKHz9U4 = layoutCoordinatesFindRootCoordinates.mo5133localToWindowMKHz9U(OffsetKt.Offset(left, fM6402getHeightimpl));
        float fM3551getXimpl = Offset.m3551getXimpl(jMo5133localToWindowMKHz9U);
        float fM3551getXimpl2 = Offset.m3551getXimpl(jMo5133localToWindowMKHz9U2);
        float fM3551getXimpl3 = Offset.m3551getXimpl(jMo5133localToWindowMKHz9U4);
        float fM3551getXimpl4 = Offset.m3551getXimpl(jMo5133localToWindowMKHz9U3);
        float fMin = Math.min(fM3551getXimpl, Math.min(fM3551getXimpl2, Math.min(fM3551getXimpl3, fM3551getXimpl4)));
        float fMax = Math.max(fM3551getXimpl, Math.max(fM3551getXimpl2, Math.max(fM3551getXimpl3, fM3551getXimpl4)));
        float fM3552getYimpl = Offset.m3552getYimpl(jMo5133localToWindowMKHz9U);
        float fM3552getYimpl2 = Offset.m3552getYimpl(jMo5133localToWindowMKHz9U2);
        float fM3552getYimpl3 = Offset.m3552getYimpl(jMo5133localToWindowMKHz9U4);
        float fM3552getYimpl4 = Offset.m3552getYimpl(jMo5133localToWindowMKHz9U3);
        return new Rect(fMin, Math.min(fM3552getYimpl, Math.min(fM3552getYimpl2, Math.min(fM3552getYimpl3, fM3552getYimpl4))), fMax, Math.max(fM3552getYimpl, Math.max(fM3552getYimpl2, Math.max(fM3552getYimpl3, fM3552getYimpl4))));
    }

    public static final LayoutCoordinates findRootCoordinates(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = parentLayoutCoordinates;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        }
        NodeCoordinator nodeCoordinator = layoutCoordinates2 instanceof NodeCoordinator ? (NodeCoordinator) layoutCoordinates2 : null;
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator == null) {
                return nodeCoordinator3;
            }
            wrappedBy = nodeCoordinator.getWrappedBy();
        }
    }

    public static final long positionInParent(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates parentLayoutCoordinates = layoutCoordinates.getParentLayoutCoordinates();
        return parentLayoutCoordinates != null ? parentLayoutCoordinates.mo5129localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3567getZeroF1C5BW0()) : Offset.INSTANCE.m3567getZeroF1C5BW0();
    }

    public static final long positionInRoot(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5131localToRootMKHz9U(Offset.INSTANCE.m3567getZeroF1C5BW0());
    }

    public static final long positionInWindow(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5133localToWindowMKHz9U(Offset.INSTANCE.m3567getZeroF1C5BW0());
    }

    public static final long positionOnScreen(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.mo5132localToScreenMKHz9U(Offset.INSTANCE.m3567getZeroF1C5BW0());
    }
}
