package androidx.compose.foundation.contextmenu;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a*\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001\u001a \u0010\b\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\t\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001a(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¨\u0006\r"}, d2 = {"alignEndEdges", "", "popupLength", "windowLength", "closeAffinity", "", "alignPopupAxis", "position", "alignPopupEndEdgeToPosition", "alignPopupStartEdgeToPosition", "alignStartEdges", "popupFitsBetweenPositionAndEndEdge", "popupFitsBetweenPositionAndStartEdge", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextMenuPopupPositionProvider_androidKt {
    private static final int alignEndEdges(int i2, int i3, boolean z) {
        return alignStartEdges(i2, i3, !z);
    }

    public static final int alignPopupAxis(int i2, int i3, int i4, boolean z) {
        return i3 >= i4 ? alignStartEdges(i3, i4, z) : popupFitsBetweenPositionAndEndEdge(i2, i3, i4, z) ? alignPopupStartEdgeToPosition(i2, i3, z) : popupFitsBetweenPositionAndStartEdge(i2, i3, i4, z) ? alignPopupEndEdgeToPosition(i2, i3, z) : alignEndEdges(i3, i4, z);
    }

    public static /* synthetic */ int alignPopupAxis$default(int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            z = true;
        }
        return alignPopupAxis(i2, i3, i4, z);
    }

    private static final int alignPopupEndEdgeToPosition(int i2, int i3, boolean z) {
        return alignPopupStartEdgeToPosition(i2, i3, !z);
    }

    private static final int alignPopupStartEdgeToPosition(int i2, int i3, boolean z) {
        return z ? i2 : i2 - i3;
    }

    private static final int alignStartEdges(int i2, int i3, boolean z) {
        if (z) {
            return 0;
        }
        return i3 - i2;
    }

    private static final boolean popupFitsBetweenPositionAndEndEdge(int i2, int i3, int i4, boolean z) {
        return popupFitsBetweenPositionAndStartEdge(i2, i3, i4, !z);
    }

    private static final boolean popupFitsBetweenPositionAndStartEdge(int i2, int i3, int i4, boolean z) {
        return z ? i3 <= i2 : i4 - i3 > i2;
    }
}
