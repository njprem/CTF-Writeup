package androidx.compose.foundation.text.modifiers;

import J.d;
import androidx.compose.foundation.text.TextPointerIcon_androidKt;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selectable;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrar;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerIconKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\b\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eR\u0016\u0010\u0006\u001a\u00020\u0007X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u000bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectionController;", "Landroidx/compose/runtime/RememberObserver;", "selectableId", "", "selectionRegistrar", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "backgroundSelectionColor", "Landroidx/compose/ui/graphics/Color;", "params", "Landroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;", "(JLandroidx/compose/foundation/text/selection/SelectionRegistrar;JLandroidx/compose/foundation/text/modifiers/StaticTextSelectionParams;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "selectable", "Landroidx/compose/foundation/text/selection/Selectable;", "draw", "", "drawScope", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "onAbandoned", "onForgotten", "onRemembered", "updateGlobalPosition", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "updateTextLayout", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionController implements RememberObserver {
    public static final int $stable = 8;
    private final long backgroundSelectionColor;
    private final Modifier modifier;
    private StaticTextSelectionParams params;
    private Selectable selectable;
    private final long selectableId;
    private final SelectionRegistrar selectionRegistrar;

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, staticTextSelectionParams);
    }

    public final void draw(DrawScope drawScope) {
        Selection selection = (Selection) this.selectionRegistrar.getSubselections().c(this.selectableId);
        if (selection == null) {
            return;
        }
        int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
        int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
        if (offset == offset2) {
            return;
        }
        Selectable selectable = this.selectable;
        int lastVisibleOffset = selectable != null ? selectable.getLastVisibleOffset() : 0;
        Path pathForRange = this.params.getPathForRange(RangesKt.coerceAtMost(offset, lastVisibleOffset), RangesKt.coerceAtMost(offset2, lastVisibleOffset));
        if (pathForRange == null) {
            return;
        }
        if (!this.params.getShouldClip()) {
            DrawScope.m4332drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
            return;
        }
        float fM3620getWidthimpl = Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc());
        float fM3617getHeightimpl = Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc());
        int iM3781getIntersectrtfAjoo = ClipOp.INSTANCE.m3781getIntersectrtfAjoo();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4266clipRectN_I0leg(0.0f, 0.0f, fM3620getWidthimpl, fM3617getHeightimpl, iM3781getIntersectrtfAjoo);
            DrawScope.m4332drawPathLG529CI$default(drawScope, pathForRange, this.backgroundSelectionColor, 0.0f, null, null, 0, 60, null);
        } finally {
            d.y(drawContext, jMo4263getSizeNHjbRc);
        }
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Selectable selectable = this.selectable;
        if (selectable != null) {
            this.selectionRegistrar.unsubscribe(selectable);
            this.selectable = null;
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.selectable = this.selectionRegistrar.subscribe(new MultiWidgetSelectionDelegate(this.selectableId, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return SelectionController.this.params.getLayoutCoordinates();
            }
        }, new Function0<TextLayoutResult>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController.onRemembered.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final TextLayoutResult invoke() {
                return SelectionController.this.params.getTextLayoutResult();
            }
        }));
    }

    public final void updateGlobalPosition(LayoutCoordinates coordinates) {
        this.params = StaticTextSelectionParams.copy$default(this.params, coordinates, null, 2, null);
        this.selectionRegistrar.notifyPositionChange(this.selectableId);
    }

    public final void updateTextLayout(TextLayoutResult textLayoutResult) {
        TextLayoutResult textLayoutResult2 = this.params.getTextLayoutResult();
        if (textLayoutResult2 != null && !Intrinsics.areEqual(textLayoutResult2.getLayoutInput().getText(), textLayoutResult.getLayoutInput().getText())) {
            this.selectionRegistrar.notifySelectableChange(this.selectableId);
        }
        this.params = StaticTextSelectionParams.copy$default(this.params, null, textLayoutResult, 1, null);
    }

    private SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams) {
        this.selectableId = j2;
        this.selectionRegistrar = selectionRegistrar;
        this.backgroundSelectionColor = j3;
        this.params = staticTextSelectionParams;
        this.modifier = PointerIconKt.pointerHoverIcon$default(SelectionControllerKt.makeSelectionModifier(selectionRegistrar, j2, new Function0<LayoutCoordinates>() { // from class: androidx.compose.foundation.text.modifiers.SelectionController$modifier$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final LayoutCoordinates invoke() {
                return this.this$0.params.getLayoutCoordinates();
            }
        }), TextPointerIcon_androidKt.getTextPointerIcon(), false, 2, null);
    }

    public /* synthetic */ SelectionController(long j2, SelectionRegistrar selectionRegistrar, long j3, StaticTextSelectionParams staticTextSelectionParams, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, selectionRegistrar, j3, (i2 & 8) != 0 ? StaticTextSelectionParams.INSTANCE.getEmpty() : staticTextSelectionParams, null);
    }
}
