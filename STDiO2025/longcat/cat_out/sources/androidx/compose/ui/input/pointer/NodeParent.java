package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.layout.LayoutCoordinates;
import j.C0646L;
import j.C0671y;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J5\u0010\r\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ5\u0010\u000f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0003J%\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00180\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Landroidx/compose/ui/input/pointer/NodeParent;", "", "<init>", "()V", "Lj/y;", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "changes", "Landroidx/compose/ui/layout/LayoutCoordinates;", "parentCoordinates", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "internalPointerEvent", "", "isInBounds", "buildCache", "(Lj/y;Landroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/ui/input/pointer/InternalPointerEvent;Z)Z", "dispatchMainEventPass", "dispatchFinalEventPass", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)Z", "", "dispatchCancel", "clear", "", "pointerIdValue", "Lj/L;", "Landroidx/compose/ui/input/pointer/Node;", "hitNodes", "removeInvalidPointerIdsAndChanges", "(JLj/L;)V", "removeDetachedPointerInputModifierNodes", "cleanUpHits", "(Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "Landroidx/compose/runtime/collection/MutableVector;", "children", "Landroidx/compose/runtime/collection/MutableVector;", "getChildren", "()Landroidx/compose/runtime/collection/MutableVector;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class NodeParent {
    public static final int $stable = MutableVector.$stable;
    private final MutableVector<Node> children = new MutableVector<>(new Node[16], 0);

    public boolean buildCache(C0671y changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i2 = 0;
        boolean z = false;
        do {
            z = content[i2].buildCache(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i2++;
        } while (i2 < size);
        return z;
    }

    public void cleanUpHits(InternalPointerEvent internalPointerEvent) {
        int size = this.children.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            }
            if (this.children.getContent()[size].getPointerIds().isEmpty()) {
                this.children.removeAt(size);
            }
        }
    }

    public final void clear() {
        this.children.clear();
    }

    public void dispatchCancel() {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].dispatchCancel();
                i2++;
            } while (i2 < size);
        }
    }

    public boolean dispatchFinalEventPass(InternalPointerEvent internalPointerEvent) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        boolean z = false;
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            boolean z2 = false;
            do {
                z2 = content[i2].dispatchFinalEventPass(internalPointerEvent) || z2;
                i2++;
            } while (i2 < size);
            z = z2;
        }
        cleanUpHits(internalPointerEvent);
        return z;
    }

    public boolean dispatchMainEventPass(C0671y changes, LayoutCoordinates parentCoordinates, InternalPointerEvent internalPointerEvent, boolean isInBounds) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size <= 0) {
            return false;
        }
        Node[] content = mutableVector.getContent();
        int i2 = 0;
        boolean z = false;
        do {
            z = content[i2].dispatchMainEventPass(changes, parentCoordinates, internalPointerEvent, isInBounds) || z;
            i2++;
        } while (i2 < size);
        return z;
    }

    public final MutableVector<Node> getChildren() {
        return this.children;
    }

    public final void removeDetachedPointerInputModifierNodes() {
        int i2 = 0;
        while (i2 < this.children.getSize()) {
            Node node = this.children.getContent()[i2];
            if (node.getModifierNode().getIsAttached()) {
                i2++;
                node.removeDetachedPointerInputModifierNodes();
            } else {
                node.dispatchCancel();
                this.children.removeAt(i2);
            }
        }
    }

    public void removeInvalidPointerIdsAndChanges(long pointerIdValue, C0646L hitNodes) {
        MutableVector<Node> mutableVector = this.children;
        int size = mutableVector.getSize();
        if (size > 0) {
            Node[] content = mutableVector.getContent();
            int i2 = 0;
            do {
                content[i2].removeInvalidPointerIdsAndChanges(pointerIdValue, hitNodes);
                i2++;
            } while (i2 < size);
        }
    }
}
