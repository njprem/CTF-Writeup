package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.ModifierNodeElement;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import j.N;
import j.S;
import j.d0;
import j.g0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003TUVB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\tJ3\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0012\b\u0002\u0010\u000e\u001a\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\n\u001a\u00028\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0016\u001a\u00020\u000b*\u00020\u00152\u0006\u0010\n\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0089\u0001\u0010+\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u001f2\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010&\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u0007¢\u0006\u0004\b-\u0010\u0005J\u001f\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010.\u001a\u00020\u000b¢\u0006\u0004\b0\u00101R*\u00103\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\u000e\u0012\f0\rR\b\u0012\u0004\u0012\u00028\u00000\u0000028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00105R\u0016\u00106\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0003088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020/0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010<R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0017\u0010E\u001a\u00020D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0018\u0010K\u001a\u00020\u0011*\u00028\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0018\u0010O\u001a\u00020\u000b*\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bN\u0010MR\u0017\u0010S\u001a\u00020P8Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010R\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006W"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;", "T", "", "<init>", "()V", "key", "", "removeInfoForKey", "(Ljava/lang/Object;)V", "item", "", "mainAxisOffset", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "itemInfo", "initializeAnimation", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;ILandroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;)V", "", "isMovingAway", "startPlacementAnimationsIfNeeded", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Z)V", "", "updateAndReturnOffsetFor", "([ILandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "consumedScroll", "layoutWidth", "layoutHeight", "", "positionedItems", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "keyIndexMap", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;", "itemProvider", "isVertical", "isLookingAhead", "laneCount", "hasLookaheadOccurred", "layoutMinOffset", "layoutMaxOffset", "Lkotlinx/coroutines/CoroutineScope;", "coroutineScope", "Landroidx/compose/ui/graphics/GraphicsContext;", "graphicsContext", "onMeasured", "(IIILjava/util/List;Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemProvider;ZZIZIILkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;)V", "reset", "placeableIndex", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "getAnimation", "(Ljava/lang/Object;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "Lj/N;", "keyToItemInfoMap", "Lj/N;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutKeyIndexMap;", "firstVisibleIndex", "I", "Lj/S;", "movingAwayKeys", "Lj/S;", "movingInFromStartBound", "Ljava/util/List;", "movingInFromEndBound", "movingAwayToStartBound", "movingAwayToEndBound", "disappearingItems", "Landroidx/compose/ui/node/DrawModifierNode;", "displayingNode", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "getHasAnimations", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)Z", "hasAnimations", "getMainAxisOffset", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;)I", "getCrossAxisOffset", "crossAxisOffset", "Landroidx/compose/ui/unit/IntSize;", "getMinSizeToFitDisappearingItems-YbymL2g", "()J", "minSizeToFitDisappearingItems", "DisplayingDisappearingItemsElement", "DisplayingDisappearingItemsNode", "ItemInfo", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutItemAnimator<T extends LazyLayoutMeasuredItem> {
    public static final int $stable = 8;
    private final List<LazyLayoutItemAnimation> disappearingItems;
    private DrawModifierNode displayingNode;
    private int firstVisibleIndex;
    private LazyLayoutKeyIndexMap keyIndexMap;
    private final N keyToItemInfoMap;
    private final Modifier modifier;
    private final S movingAwayKeys;
    private final List<T> movingAwayToEndBound;
    private final List<T> movingAwayToStartBound;
    private final List<T> movingInFromEndBound;
    private final List<T> movingInFromStartBound;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u0016J\f\u0010\u0014\u001a\u00020\u0012*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsElement;", "Landroidx/compose/ui/node/ModifierNodeElement;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "create", "equals", "", "other", "", "hashCode", "", "toString", "", "update", "", "node", "inspectableProperties", "Landroidx/compose/ui/platform/InspectorInfo;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsElement extends ModifierNodeElement<DisplayingDisappearingItemsNode> {
        private final LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsElement(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsElement copy$default(DisplayingDisappearingItemsElement displayingDisappearingItemsElement, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsElement.animator;
            }
            return displayingDisappearingItemsElement.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsElement copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsElement(animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsElement) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsElement) other).animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void inspectableProperties(InspectorInfo inspectorInfo) {
            inspectorInfo.setName("DisplayingDisappearingItemsElement");
        }

        public String toString() {
            return "DisplayingDisappearingItemsElement(animator=" + this.animator + ')';
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        /* renamed from: create */
        public DisplayingDisappearingItemsNode getNode() {
            return new DisplayingDisappearingItemsNode(this.animator);
        }

        @Override // androidx.compose.ui.node.ModifierNodeElement
        public void update(DisplayingDisappearingItemsNode node) {
            node.setAnimator(this.animator);
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0002\u0010\u0005J\r\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0004HÂ\u0003J\u0017\u0010\u0007\u001a\u00020\u00002\f\b\u0002\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004HÆ\u0001J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\u0012\u0010\u0011\u001a\u00020\u000f2\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\f\u0010\u0014\u001a\u00020\u000f*\u00020\u0015H\u0016R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$DisplayingDisappearingItemsNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "animator", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "component1", "copy", "equals", "", "other", "", "hashCode", "", "onAttach", "", "onDetach", "setAnimator", "toString", "", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class DisplayingDisappearingItemsNode extends Modifier.Node implements DrawModifierNode {
        private LazyLayoutItemAnimator<?> animator;

        public DisplayingDisappearingItemsNode(LazyLayoutItemAnimator<?> lazyLayoutItemAnimator) {
            this.animator = lazyLayoutItemAnimator;
        }

        private final LazyLayoutItemAnimator<?> component1() {
            return this.animator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ DisplayingDisappearingItemsNode copy$default(DisplayingDisappearingItemsNode displayingDisappearingItemsNode, LazyLayoutItemAnimator lazyLayoutItemAnimator, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                lazyLayoutItemAnimator = displayingDisappearingItemsNode.animator;
            }
            return displayingDisappearingItemsNode.copy(lazyLayoutItemAnimator);
        }

        public final DisplayingDisappearingItemsNode copy(LazyLayoutItemAnimator<?> animator) {
            return new DisplayingDisappearingItemsNode(animator);
        }

        @Override // androidx.compose.ui.node.DrawModifierNode
        public void draw(ContentDrawScope contentDrawScope) {
            List list = ((LazyLayoutItemAnimator) this.animator).disappearingItems;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = (LazyLayoutItemAnimation) list.get(i2);
                GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
                if (layer != null) {
                    float fM6361getXimpl = IntOffset.m6361getXimpl(lazyLayoutItemAnimation.getFinalOffset());
                    float fM6361getXimpl2 = fM6361getXimpl - IntOffset.m6361getXimpl(layer.getTopLeft());
                    float fM6362getYimpl = IntOffset.m6362getYimpl(lazyLayoutItemAnimation.getFinalOffset()) - IntOffset.m6362getYimpl(layer.getTopLeft());
                    contentDrawScope.getDrawContext().getTransform().translate(fM6361getXimpl2, fM6362getYimpl);
                    try {
                        GraphicsLayerKt.drawLayer(contentDrawScope, layer);
                    } finally {
                        contentDrawScope.getDrawContext().getTransform().translate(-fM6361getXimpl2, -fM6362getYimpl);
                    }
                }
            }
            contentDrawScope.drawContent();
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DisplayingDisappearingItemsNode) && Intrinsics.areEqual(this.animator, ((DisplayingDisappearingItemsNode) other).animator);
        }

        public int hashCode() {
            return this.animator.hashCode();
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onAttach() {
            ((LazyLayoutItemAnimator) this.animator).displayingNode = this;
        }

        @Override // androidx.compose.ui.Modifier.Node
        public void onDetach() {
            this.animator.reset();
        }

        public final void setAnimator(LazyLayoutItemAnimator<?> animator) {
            if (Intrinsics.areEqual(this.animator, animator) || !getNode().getIsAttached()) {
                return;
            }
            this.animator.reset();
            ((LazyLayoutItemAnimator) animator).displayingNode = this;
            this.animator = animator;
        }

        public String toString() {
            return "DisplayingDisappearingItemsNode(animator=" + this.animator + ')';
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J=\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00028\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00112\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010*R0\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004@BX\u0086\u000e¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0013\"\u0004\b\u001b\u0010\u0015R\u001e\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0013R\u001e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013R\u001a\u0010 \u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0013\"\u0004\b\"\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator$ItemInfo;", "", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimator;)V", "<set-?>", "", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "animations", "getAnimations", "()[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "[Landroidx/compose/foundation/lazy/layout/LazyLayoutItemAnimation;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "getConstraints-DWUhwKw", "()Landroidx/compose/ui/unit/Constraints;", "setConstraints-_Sx5XlM", "(Landroidx/compose/ui/unit/Constraints;)V", "crossAxisOffset", "", "getCrossAxisOffset", "()I", "setCrossAxisOffset", "(I)V", "isRunningPlacement", "", "()Z", "lane", "getLane", "setLane", "layoutMaxOffset", "getLayoutMaxOffset", "layoutMinOffset", "getLayoutMinOffset", "span", "getSpan", "setSpan", "updateAnimation", "", "positionedItem", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "graphicsContext", "Landroidx/compose/ui/graphics/GraphicsContext;", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItem;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/graphics/GraphicsContext;III)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ItemInfo {
        private Constraints constraints;
        private int crossAxisOffset;
        private int lane;
        private int layoutMaxOffset;
        private int layoutMinOffset;
        private LazyLayoutItemAnimation[] animations = LazyLayoutItemAnimatorKt.EmptyArray;
        private int span = 1;

        public ItemInfo() {
        }

        private final boolean isRunningPlacement() {
            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : this.animations) {
                if (lazyLayoutItemAnimation != null && lazyLayoutItemAnimation.getIsRunningMovingAwayAnimation()) {
                    return true;
                }
            }
            return false;
        }

        public static /* synthetic */ void updateAnimation$default(ItemInfo itemInfo, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int i2, int i3, int i4, int i5, Object obj) {
            if ((i5 & 32) != 0) {
                i4 = LazyLayoutItemAnimator.this.getCrossAxisOffset(lazyLayoutMeasuredItem);
            }
            itemInfo.updateAnimation(lazyLayoutMeasuredItem, coroutineScope, graphicsContext, i2, i3, i4);
        }

        public final LazyLayoutItemAnimation[] getAnimations() {
            return this.animations;
        }

        /* renamed from: getConstraints-DWUhwKw, reason: not valid java name and from getter */
        public final Constraints getConstraints() {
            return this.constraints;
        }

        public final int getCrossAxisOffset() {
            return this.crossAxisOffset;
        }

        public final int getLane() {
            return this.lane;
        }

        public final int getLayoutMaxOffset() {
            return this.layoutMaxOffset;
        }

        public final int getLayoutMinOffset() {
            return this.layoutMinOffset;
        }

        public final int getSpan() {
            return this.span;
        }

        /* renamed from: setConstraints-_Sx5XlM, reason: not valid java name */
        public final void m809setConstraints_Sx5XlM(Constraints constraints) {
            this.constraints = constraints;
        }

        public final void setCrossAxisOffset(int i2) {
            this.crossAxisOffset = i2;
        }

        public final void setLane(int i2) {
            this.lane = i2;
        }

        public final void setSpan(int i2) {
            this.span = i2;
        }

        public final void updateAnimation(T positionedItem, CoroutineScope coroutineScope, GraphicsContext graphicsContext, int layoutMinOffset, int layoutMaxOffset, int crossAxisOffset) {
            if (!isRunningPlacement()) {
                this.layoutMinOffset = layoutMinOffset;
                this.layoutMaxOffset = layoutMaxOffset;
            }
            int length = this.animations.length;
            for (int placeablesCount = positionedItem.getPlaceablesCount(); placeablesCount < length; placeablesCount++) {
                LazyLayoutItemAnimation lazyLayoutItemAnimation = this.animations[placeablesCount];
                if (lazyLayoutItemAnimation != null) {
                    lazyLayoutItemAnimation.release();
                }
            }
            if (this.animations.length != positionedItem.getPlaceablesCount()) {
                Object[] objArrCopyOf = Arrays.copyOf(this.animations, positionedItem.getPlaceablesCount());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                this.animations = (LazyLayoutItemAnimation[]) objArrCopyOf;
            }
            this.constraints = Constraints.m6174boximpl(positionedItem.getConstraints());
            this.crossAxisOffset = crossAxisOffset;
            this.lane = positionedItem.getLane();
            this.span = positionedItem.getSpan();
            int placeablesCount2 = positionedItem.getPlaceablesCount();
            final LazyLayoutItemAnimator<T> lazyLayoutItemAnimator = LazyLayoutItemAnimator.this;
            for (int i2 = 0; i2 < placeablesCount2; i2++) {
                LazyLayoutAnimationSpecsNode specs = LazyLayoutItemAnimatorKt.getSpecs(positionedItem.getParentData(i2));
                if (specs == null) {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation2 = this.animations[i2];
                    if (lazyLayoutItemAnimation2 != null) {
                        lazyLayoutItemAnimation2.release();
                    }
                    this.animations[i2] = null;
                } else {
                    LazyLayoutItemAnimation lazyLayoutItemAnimation3 = this.animations[i2];
                    if (lazyLayoutItemAnimation3 == null) {
                        lazyLayoutItemAnimation3 = new LazyLayoutItemAnimation(coroutineScope, graphicsContext, new Function0<Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo$updateAnimation$1$animation$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                DrawModifierNode drawModifierNode = ((LazyLayoutItemAnimator) lazyLayoutItemAnimator).displayingNode;
                                if (drawModifierNode != null) {
                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                }
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }
                        });
                        this.animations[i2] = lazyLayoutItemAnimation3;
                    }
                    lazyLayoutItemAnimation3.setFadeInSpec(specs.getFadeInSpec());
                    lazyLayoutItemAnimation3.setPlacementSpec(specs.getPlacementSpec());
                    lazyLayoutItemAnimation3.setFadeOutSpec(specs.getFadeOutSpec());
                }
            }
        }
    }

    public LazyLayoutItemAnimator() {
        long[] jArr = d0.f809a;
        this.keyToItemInfoMap = new N();
        int i2 = g0.f831a;
        this.movingAwayKeys = new S();
        this.movingInFromStartBound = new ArrayList();
        this.movingInFromEndBound = new ArrayList();
        this.movingAwayToStartBound = new ArrayList();
        this.movingAwayToEndBound = new ArrayList();
        this.disappearingItems = new ArrayList();
        this.modifier = new DisplayingDisappearingItemsElement(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getCrossAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo754getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo754getOffsetBjo55l4(0);
        return !lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m6362getYimpl(jMo754getOffsetBjo55l4) : IntOffset.m6361getXimpl(jMo754getOffsetBjo55l4);
    }

    private final boolean getHasAnimations(T t) {
        int placeablesCount = t.getPlaceablesCount();
        for (int i2 = 0; i2 < placeablesCount; i2++) {
            if (LazyLayoutItemAnimatorKt.getSpecs(t.getParentData(i2)) != null) {
                return true;
            }
        }
        return false;
    }

    private final int getMainAxisOffset(LazyLayoutMeasuredItem lazyLayoutMeasuredItem) {
        long jMo754getOffsetBjo55l4 = lazyLayoutMeasuredItem.mo754getOffsetBjo55l4(0);
        return lazyLayoutMeasuredItem.getIsVertical() ? IntOffset.m6362getYimpl(jMo754getOffsetBjo55l4) : IntOffset.m6361getXimpl(jMo754getOffsetBjo55l4);
    }

    private final void initializeAnimation(T item, int mainAxisOffset, LazyLayoutItemAnimator<T>.ItemInfo itemInfo) {
        int i2 = 0;
        long jMo754getOffsetBjo55l4 = item.mo754getOffsetBjo55l4(0);
        long jM6357copyiSbpLlY$default = item.getIsVertical() ? IntOffset.m6357copyiSbpLlY$default(jMo754getOffsetBjo55l4, 0, mainAxisOffset, 1, null) : IntOffset.m6357copyiSbpLlY$default(jMo754getOffsetBjo55l4, mainAxisOffset, 0, 2, null);
        LazyLayoutItemAnimation[] animations = itemInfo.getAnimations();
        int length = animations.length;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.m805setRawOffsetgyyYBs(IntOffset.m6365plusqkQi6aY(jM6357copyiSbpLlY$default, IntOffset.m6364minusqkQi6aY(item.mo754getOffsetBjo55l4(i3), jMo754getOffsetBjo55l4)));
            }
            i2++;
            i3 = i4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initializeAnimation$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, int i2, ItemInfo itemInfo, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            Object objB = lazyLayoutItemAnimator.keyToItemInfoMap.b(lazyLayoutMeasuredItem.getKey());
            Intrinsics.checkNotNull(objB);
            itemInfo = (ItemInfo) objB;
        }
        lazyLayoutItemAnimator.initializeAnimation(lazyLayoutMeasuredItem, i2, itemInfo);
    }

    private final void removeInfoForKey(Object key) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.h(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return;
        }
        for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
            if (lazyLayoutItemAnimation != null) {
                lazyLayoutItemAnimation.release();
            }
        }
    }

    private final void startPlacementAnimationsIfNeeded(T item, boolean isMovingAway) {
        Object objB = this.keyToItemInfoMap.b(item.getKey());
        Intrinsics.checkNotNull(objB);
        LazyLayoutItemAnimation[] animations = ((ItemInfo) objB).getAnimations();
        int length = animations.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = animations[i2];
            int i4 = i3 + 1;
            if (lazyLayoutItemAnimation != null) {
                long jMo754getOffsetBjo55l4 = item.mo754getOffsetBjo55l4(i3);
                long rawOffset = lazyLayoutItemAnimation.getRawOffset();
                if (!IntOffset.m6360equalsimpl0(rawOffset, LazyLayoutItemAnimation.INSTANCE.m806getNotInitializednOccac()) && !IntOffset.m6360equalsimpl0(rawOffset, jMo754getOffsetBjo55l4)) {
                    lazyLayoutItemAnimation.m798animatePlacementDeltaar5cAso(IntOffset.m6364minusqkQi6aY(jMo754getOffsetBjo55l4, rawOffset), isMovingAway);
                }
                lazyLayoutItemAnimation.m805setRawOffsetgyyYBs(jMo754getOffsetBjo55l4);
            }
            i2++;
            i3 = i4;
        }
    }

    public static /* synthetic */ void startPlacementAnimationsIfNeeded$default(LazyLayoutItemAnimator lazyLayoutItemAnimator, LazyLayoutMeasuredItem lazyLayoutMeasuredItem, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        lazyLayoutItemAnimator.startPlacementAnimationsIfNeeded(lazyLayoutMeasuredItem, z);
    }

    private final int updateAndReturnOffsetFor(int[] iArr, T t) {
        int lane = t.getLane();
        int span = t.getSpan() + lane;
        int iMax = 0;
        while (lane < span) {
            int mainAxisSizeWithSpacings = t.getMainAxisSizeWithSpacings() + iArr[lane];
            iArr[lane] = mainAxisSizeWithSpacings;
            iMax = Math.max(iMax, mainAxisSizeWithSpacings);
            lane++;
        }
        return iMax;
    }

    public final LazyLayoutItemAnimation getAnimation(Object key, int placeableIndex) {
        LazyLayoutItemAnimation[] animations;
        ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.b(key);
        if (itemInfo == null || (animations = itemInfo.getAnimations()) == null) {
            return null;
        }
        return animations[placeableIndex];
    }

    /* renamed from: getMinSizeToFitDisappearingItems-YbymL2g, reason: not valid java name */
    public final long m807getMinSizeToFitDisappearingItemsYbymL2g() {
        long jM6408getZeroYbymL2g = IntSize.INSTANCE.m6408getZeroYbymL2g();
        List<LazyLayoutItemAnimation> list = this.disappearingItems;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            LazyLayoutItemAnimation lazyLayoutItemAnimation = list.get(i2);
            GraphicsLayer layer = lazyLayoutItemAnimation.getLayer();
            if (layer != null) {
                jM6408getZeroYbymL2g = IntSizeKt.IntSize(Math.max(IntSize.m6403getWidthimpl(jM6408getZeroYbymL2g), IntSize.m6403getWidthimpl(layer.getSize()) + IntOffset.m6361getXimpl(lazyLayoutItemAnimation.getRawOffset())), Math.max(IntSize.m6402getHeightimpl(jM6408getZeroYbymL2g), IntSize.m6402getHeightimpl(layer.getSize()) + IntOffset.m6362getYimpl(lazyLayoutItemAnimation.getRawOffset())));
            }
        }
        return jM6408getZeroYbymL2g;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onMeasured(int consumedScroll, int layoutWidth, int layoutHeight, List<T> positionedItems, final LazyLayoutKeyIndexMap keyIndexMap, LazyLayoutMeasuredItemProvider<T> itemProvider, boolean isVertical, boolean isLookingAhead, int laneCount, boolean hasLookaheadOccurred, int layoutMinOffset, int layoutMaxOffset, CoroutineScope coroutineScope, GraphicsContext graphicsContext) {
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        long[] jArr;
        Object[] objArr;
        long[] jArr2;
        Object[] objArr2;
        long j2;
        LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr;
        int i6;
        int i7;
        int i8;
        int i9;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap2;
        int index;
        int i10;
        long[] jArr3;
        long[] jArr4;
        int i11;
        int i12 = laneCount;
        LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap3 = this.keyIndexMap;
        this.keyIndexMap = keyIndexMap;
        int size = positionedItems.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                if (this.keyToItemInfoMap.c()) {
                    reset();
                    return;
                }
            } else if (getHasAnimations(positionedItems.get(i13))) {
                break;
            } else {
                i13++;
            }
        }
        int i14 = this.firstVisibleIndex;
        LazyLayoutMeasuredItem lazyLayoutMeasuredItem = (LazyLayoutMeasuredItem) CollectionsKt.firstOrNull((List) positionedItems);
        this.firstVisibleIndex = lazyLayoutMeasuredItem != null ? lazyLayoutMeasuredItem.getIndex() : 0;
        long jIntOffset = isVertical ? IntOffsetKt.IntOffset(0, consumedScroll) : IntOffsetKt.IntOffset(consumedScroll, 0);
        boolean z2 = isLookingAhead || !hasLookaheadOccurred;
        N n2 = this.keyToItemInfoMap;
        Object[] objArr3 = n2.f801b;
        long[] jArr5 = n2.f800a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i15 = 0;
            z = z2;
            while (true) {
                long j3 = jArr5[i15];
                lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j3 & 255) < 128) {
                            jArr4 = jArr5;
                            i11 = i17;
                            this.movingAwayKeys.d(objArr3[(i15 << 3) + i17]);
                        } else {
                            jArr4 = jArr5;
                            i11 = i17;
                        }
                        j3 >>= 8;
                        i17 = i11 + 1;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                lazyLayoutKeyIndexMap3 = lazyLayoutKeyIndexMap;
                jArr5 = jArr3;
            }
        } else {
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap3;
            z = z2;
        }
        int size2 = positionedItems.size();
        int i18 = 0;
        while (i18 < size2) {
            T t = positionedItems.get(i18);
            this.movingAwayKeys.l(t.getKey());
            if (getHasAnimations(t)) {
                ItemInfo itemInfo = (ItemInfo) this.keyToItemInfoMap.b(t.getKey());
                if (lazyLayoutKeyIndexMap != null) {
                    lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    index = lazyLayoutKeyIndexMap2.getIndex(t.getKey());
                } else {
                    lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                    index = -1;
                }
                boolean z3 = index == -1 && lazyLayoutKeyIndexMap2 != null;
                if (itemInfo == null) {
                    LazyLayoutItemAnimator<T>.ItemInfo itemInfo2 = new ItemInfo();
                    ItemInfo.updateAnimation$default(itemInfo2, t, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                    i7 = size2;
                    this.keyToItemInfoMap.k(t.getKey(), itemInfo2);
                    if (t.getIndex() == index || index == -1) {
                        long jMo754getOffsetBjo55l4 = t.mo754getOffsetBjo55l4(0);
                        initializeAnimation(t, t.getIsVertical() ? IntOffset.m6362getYimpl(jMo754getOffsetBjo55l4) : IntOffset.m6361getXimpl(jMo754getOffsetBjo55l4), itemInfo2);
                        if (z3) {
                            LazyLayoutItemAnimation[] animations = itemInfo2.getAnimations();
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation : animations) {
                                if (lazyLayoutItemAnimation != null) {
                                    lazyLayoutItemAnimation.animateAppearance();
                                    Unit unit = Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (index < i14) {
                        this.movingInFromStartBound.add(t);
                    } else {
                        this.movingInFromEndBound.add(t);
                    }
                } else {
                    i7 = size2;
                    if (z) {
                        ItemInfo.updateAnimation$default(itemInfo, t, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, 0, 32, null);
                        LazyLayoutItemAnimation[] animations2 = itemInfo.getAnimations();
                        int length2 = animations2.length;
                        int i19 = 0;
                        while (i19 < length2) {
                            LazyLayoutItemAnimation lazyLayoutItemAnimation2 = animations2[i19];
                            LazyLayoutItemAnimation[] lazyLayoutItemAnimationArr2 = animations2;
                            int i20 = i14;
                            if (lazyLayoutItemAnimation2 != null) {
                                i10 = i18;
                                if (!IntOffset.m6360equalsimpl0(lazyLayoutItemAnimation2.getRawOffset(), LazyLayoutItemAnimation.INSTANCE.m806getNotInitializednOccac())) {
                                    lazyLayoutItemAnimation2.m805setRawOffsetgyyYBs(IntOffset.m6365plusqkQi6aY(lazyLayoutItemAnimation2.getRawOffset(), jIntOffset));
                                }
                            } else {
                                i10 = i18;
                            }
                            i19++;
                            animations2 = lazyLayoutItemAnimationArr2;
                            i14 = i20;
                            i18 = i10;
                        }
                        i8 = i14;
                        i9 = i18;
                        if (z3) {
                            for (LazyLayoutItemAnimation lazyLayoutItemAnimation3 : itemInfo.getAnimations()) {
                                if (lazyLayoutItemAnimation3 != null) {
                                    if (lazyLayoutItemAnimation3.isDisappearanceAnimationInProgress()) {
                                        this.disappearingItems.remove(lazyLayoutItemAnimation3);
                                        DrawModifierNode drawModifierNode = this.displayingNode;
                                        if (drawModifierNode != null) {
                                            DrawModifierNodeKt.invalidateDraw(drawModifierNode);
                                            Unit unit2 = Unit.INSTANCE;
                                        }
                                    }
                                    lazyLayoutItemAnimation3.animateAppearance();
                                }
                            }
                        }
                        startPlacementAnimationsIfNeeded$default(this, t, false, 2, null);
                    }
                }
                i8 = i14;
                i9 = i18;
            } else {
                i7 = size2;
                i8 = i14;
                i9 = i18;
                lazyLayoutKeyIndexMap2 = lazyLayoutKeyIndexMap;
                removeInfoForKey(t.getKey());
            }
            i18 = i9 + 1;
            lazyLayoutKeyIndexMap = lazyLayoutKeyIndexMap2;
            i14 = i8;
            size2 = i7;
        }
        final LazyLayoutKeyIndexMap lazyLayoutKeyIndexMap4 = lazyLayoutKeyIndexMap;
        int i21 = 0;
        int i22 = 2;
        int[] iArr = new int[i12];
        int i23 = 0;
        while (i23 < i12) {
            iArr[i23] = i21;
            i23++;
            i21 = 0;
        }
        if (!z || lazyLayoutKeyIndexMap4 == null) {
            i2 = 2;
        } else {
            if (this.movingInFromStartBound.isEmpty()) {
                i2 = 2;
                i6 = 1;
            } else {
                List<T> list = this.movingInFromStartBound;
                if (list.size() > 1) {
                    CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$1
                        @Override // java.util.Comparator
                        public final int compare(T t2, T t3) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap4.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap4.getIndex(((LazyLayoutMeasuredItem) t2).getKey())));
                        }
                    });
                }
                List<T> list2 = this.movingInFromStartBound;
                int size3 = list2.size();
                int i24 = 0;
                while (i24 < size3) {
                    T t2 = list2.get(i24);
                    int i25 = i22;
                    initializeAnimation$default(this, t2, layoutMinOffset - updateAndReturnOffsetFor(iArr, t2), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t2, false, i25, null);
                    i24++;
                    i22 = i25;
                }
                i2 = i22;
                i6 = 1;
                ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
            if (!this.movingInFromEndBound.isEmpty()) {
                List<T> list3 = this.movingInFromEndBound;
                if (list3.size() > i6) {
                    CollectionsKt.sortWith(list3, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t3, T t4) {
                            return ComparisonsKt.compareValues(Integer.valueOf(lazyLayoutKeyIndexMap4.getIndex(((LazyLayoutMeasuredItem) t3).getKey())), Integer.valueOf(lazyLayoutKeyIndexMap4.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                        }
                    });
                }
                List<T> list4 = this.movingInFromEndBound;
                int size4 = list4.size();
                for (int i26 = 0; i26 < size4; i26++) {
                    T t3 = list4.get(i26);
                    initializeAnimation$default(this, t3, (layoutMaxOffset + updateAndReturnOffsetFor(iArr, t3)) - t3.getMainAxisSizeWithSpacings(), null, 4, null);
                    startPlacementAnimationsIfNeeded$default(this, t3, false, i2, null);
                }
                ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
            }
        }
        S s2 = this.movingAwayKeys;
        Object[] objArr4 = s2.f825b;
        long[] jArr6 = s2.f824a;
        int length3 = jArr6.length - i2;
        if (length3 >= 0) {
            int i27 = 0;
            while (true) {
                long j4 = jArr6[i27];
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i28 = 8 - ((~(i27 - length3)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j4 & 255) < 128) {
                            Object obj = objArr4[(i27 << 3) + i29];
                            jArr2 = jArr6;
                            Object objB = this.keyToItemInfoMap.b(obj);
                            Intrinsics.checkNotNull(objB);
                            ItemInfo itemInfo3 = (ItemInfo) objB;
                            objArr2 = objArr4;
                            int index2 = keyIndexMap.getIndex(obj);
                            j2 = j4;
                            itemInfo3.setSpan(Math.min(i12, itemInfo3.getSpan()));
                            itemInfo3.setLane(Math.min(i12 - itemInfo3.getSpan(), itemInfo3.getLane()));
                            if (index2 == -1) {
                                LazyLayoutItemAnimation[] animations3 = itemInfo3.getAnimations();
                                int length4 = animations3.length;
                                int i30 = 0;
                                boolean z4 = false;
                                int i31 = 0;
                                ItemInfo itemInfo4 = itemInfo3;
                                while (i30 < length4) {
                                    ItemInfo itemInfo5 = itemInfo4;
                                    LazyLayoutItemAnimation lazyLayoutItemAnimation4 = animations3[i30];
                                    int i32 = i31 + 1;
                                    if (lazyLayoutItemAnimation4 != null) {
                                        if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                            lazyLayoutItemAnimationArr = animations3;
                                        } else if (lazyLayoutItemAnimation4.isDisappearanceAnimationFinished()) {
                                            lazyLayoutItemAnimation4.release();
                                            itemInfo5.getAnimations()[i31] = null;
                                            lazyLayoutItemAnimationArr = animations3;
                                            this.disappearingItems.remove(lazyLayoutItemAnimation4);
                                            DrawModifierNode drawModifierNode2 = this.displayingNode;
                                            if (drawModifierNode2 != null) {
                                                DrawModifierNodeKt.invalidateDraw(drawModifierNode2);
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                        } else {
                                            lazyLayoutItemAnimationArr = animations3;
                                            if (lazyLayoutItemAnimation4.getLayer() != null) {
                                                lazyLayoutItemAnimation4.animateDisappearance();
                                            }
                                            if (lazyLayoutItemAnimation4.isDisappearanceAnimationInProgress()) {
                                                this.disappearingItems.add(lazyLayoutItemAnimation4);
                                                DrawModifierNode drawModifierNode3 = this.displayingNode;
                                                if (drawModifierNode3 != null) {
                                                    DrawModifierNodeKt.invalidateDraw(drawModifierNode3);
                                                    Unit unit4 = Unit.INSTANCE;
                                                }
                                            } else {
                                                lazyLayoutItemAnimation4.release();
                                                itemInfo5.getAnimations()[i31] = null;
                                                i30++;
                                                i31 = i32;
                                                animations3 = lazyLayoutItemAnimationArr;
                                                itemInfo4 = itemInfo5;
                                            }
                                        }
                                        z4 = true;
                                        i30++;
                                        i31 = i32;
                                        animations3 = lazyLayoutItemAnimationArr;
                                        itemInfo4 = itemInfo5;
                                    } else {
                                        lazyLayoutItemAnimationArr = animations3;
                                    }
                                    i30++;
                                    i31 = i32;
                                    animations3 = lazyLayoutItemAnimationArr;
                                    itemInfo4 = itemInfo5;
                                }
                                if (!z4) {
                                    removeInfoForKey(obj);
                                }
                            } else {
                                Constraints constraints = itemInfo3.getConstraints();
                                Intrinsics.checkNotNull(constraints);
                                LazyLayoutMeasuredItem lazyLayoutMeasuredItemMo756getAndMeasurehBUhpc = itemProvider.mo756getAndMeasurehBUhpc(index2, itemInfo3.getLane(), itemInfo3.getSpan(), constraints.getValue());
                                lazyLayoutMeasuredItemMo756getAndMeasurehBUhpc.setNonScrollableItem(true);
                                LazyLayoutItemAnimation[] animations4 = itemInfo3.getAnimations();
                                int length5 = animations4.length;
                                int i33 = 0;
                                while (true) {
                                    if (i33 < length5) {
                                        LazyLayoutItemAnimation lazyLayoutItemAnimation5 = animations4[i33];
                                        int i34 = i33;
                                        if (lazyLayoutItemAnimation5 != null && lazyLayoutItemAnimation5.isPlacementAnimationInProgress()) {
                                            break;
                                        }
                                        i33 = i34 + 1;
                                    } else if (lazyLayoutKeyIndexMap4 == null || index2 != lazyLayoutKeyIndexMap4.getIndex(obj)) {
                                        break;
                                    } else {
                                        removeInfoForKey(obj);
                                    }
                                }
                                itemInfo3.updateAnimation(lazyLayoutMeasuredItemMo756getAndMeasurehBUhpc, coroutineScope, graphicsContext, layoutMinOffset, layoutMaxOffset, itemInfo3.getCrossAxisOffset());
                                if (index2 < this.firstVisibleIndex) {
                                    this.movingAwayToStartBound.add(lazyLayoutMeasuredItemMo756getAndMeasurehBUhpc);
                                } else {
                                    this.movingAwayToEndBound.add(lazyLayoutMeasuredItemMo756getAndMeasurehBUhpc);
                                }
                            }
                        } else {
                            jArr2 = jArr6;
                            objArr2 = objArr4;
                            j2 = j4;
                        }
                        j4 = j2 >> 8;
                        i29++;
                        i12 = laneCount;
                        jArr6 = jArr2;
                        objArr4 = objArr2;
                    }
                    jArr = jArr6;
                    objArr = objArr4;
                    i3 = 1;
                    if (i28 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    objArr = objArr4;
                    i3 = 1;
                }
                if (i27 == length3) {
                    break;
                }
                i27 += i3;
                i12 = laneCount;
                jArr6 = jArr;
                objArr4 = objArr;
            }
        } else {
            i3 = 1;
        }
        if (this.movingAwayToStartBound.isEmpty()) {
            i4 = i3;
            i5 = layoutWidth;
        } else {
            List<T> list5 = this.movingAwayToStartBound;
            if (list5.size() > i3) {
                CollectionsKt.sortWith(list5, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortByDescending$2
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t4).getKey())));
                    }
                });
            }
            List<T> list6 = this.movingAwayToStartBound;
            int size5 = list6.size();
            for (int i35 = 0; i35 < size5; i35++) {
                T t4 = list6.get(i35);
                Object objB2 = this.keyToItemInfoMap.b(t4.getKey());
                Intrinsics.checkNotNull(objB2);
                ItemInfo itemInfo6 = (ItemInfo) objB2;
                t4.position((isLookingAhead ? getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.first((List) positionedItems)) : itemInfo6.getLayoutMinOffset()) - updateAndReturnOffsetFor(iArr, t4), itemInfo6.getCrossAxisOffset(), layoutWidth, layoutHeight);
                if (z) {
                    startPlacementAnimationsIfNeeded(t4, true);
                }
            }
            i5 = layoutWidth;
            i4 = 1;
            ArraysKt___ArraysJvmKt.fill$default(iArr, 0, 0, 0, 6, (Object) null);
        }
        if (!this.movingAwayToEndBound.isEmpty()) {
            List<T> list7 = this.movingAwayToEndBound;
            if (list7.size() > i4) {
                CollectionsKt.sortWith(list7, new Comparator() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$onMeasured$$inlined$sortBy$2
                    @Override // java.util.Comparator
                    public final int compare(T t5, T t6) {
                        return ComparisonsKt.compareValues(Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t5).getKey())), Integer.valueOf(keyIndexMap.getIndex(((LazyLayoutMeasuredItem) t6).getKey())));
                    }
                });
            }
            List<T> list8 = this.movingAwayToEndBound;
            int size6 = list8.size();
            for (int i36 = 0; i36 < size6; i36++) {
                T t5 = list8.get(i36);
                Object objB3 = this.keyToItemInfoMap.b(t5.getKey());
                Intrinsics.checkNotNull(objB3);
                ItemInfo itemInfo7 = (ItemInfo) objB3;
                t5.position((isLookingAhead ? getMainAxisOffset((LazyLayoutMeasuredItem) CollectionsKt.last((List) positionedItems)) : itemInfo7.getLayoutMaxOffset() - t5.getMainAxisSizeWithSpacings()) + updateAndReturnOffsetFor(iArr, t5), itemInfo7.getCrossAxisOffset(), i5, layoutHeight);
                if (z) {
                    startPlacementAnimationsIfNeeded(t5, true);
                }
            }
        }
        List<T> list9 = this.movingAwayToStartBound;
        CollectionsKt.reverse(list9);
        Unit unit5 = Unit.INSTANCE;
        positionedItems.addAll(0, list9);
        positionedItems.addAll(this.movingAwayToEndBound);
        this.movingInFromStartBound.clear();
        this.movingInFromEndBound.clear();
        this.movingAwayToStartBound.clear();
        this.movingAwayToEndBound.clear();
        this.movingAwayKeys.f();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void reset() {
        /*
            r14 = this;
            j.N r0 = r14.keyToItemInfoMap
            int r1 = r0.f804e
            if (r1 == 0) goto L5f
            java.lang.Object[] r1 = r0.f802c
            long[] r0 = r0.f800a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto L5a
            r3 = 0
            r4 = r3
        L11:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L55
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2b:
            if (r9 >= r7) goto L53
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L4f
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r1[r10]
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator$ItemInfo r10 = (androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.ItemInfo) r10
            androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation[] r10 = r10.getAnimations()
            int r11 = r10.length
            r12 = r3
        L43:
            if (r12 >= r11) goto L4f
            r13 = r10[r12]
            if (r13 == 0) goto L4c
            r13.release()
        L4c:
            int r12 = r12 + 1
            goto L43
        L4f:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2b
        L53:
            if (r7 != r8) goto L5a
        L55:
            if (r4 == r2) goto L5a
            int r4 = r4 + 1
            goto L11
        L5a:
            j.N r0 = r14.keyToItemInfoMap
            r0.d()
        L5f:
            androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap$Empty r0 = androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap.INSTANCE
            r14.keyIndexMap = r0
            r0 = -1
            r14.firstVisibleIndex = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator.reset():void");
    }
}
