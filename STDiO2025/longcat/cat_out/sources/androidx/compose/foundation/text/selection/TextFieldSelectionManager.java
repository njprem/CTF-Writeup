package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursorKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\r\u0010p\u001a\u00020FH\u0000¢\u0006\u0002\bqJ\u0018\u0010r\u001a\u00020F2\u0006\u0010s\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\bt\u0010uJ\u0017\u0010v\u001a\u00020F2\b\b\u0002\u0010w\u001a\u00020!H\u0000¢\u0006\u0002\bxJ\"\u0010y\u001a\u00020C2\u0006\u0010z\u001a\u00020_2\u0006\u0010{\u001a\u00020|H\u0002ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u000e\u0010\u007f\u001a\u00020[H\u0000¢\u0006\u0003\b\u0080\u0001J\u000f\u0010\u0081\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0082\u0001J\u001e\u0010\u0083\u0001\u001a\u00020F2\n\b\u0002\u0010s\u001a\u0004\u0018\u00010\fH\u0000ø\u0001\u0000¢\u0006\u0003\b\u0084\u0001J\u001a\u0010\u0085\u0001\u001a\u00020F2\t\b\u0002\u0010\u0086\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0087\u0001J\u000f\u0010\u0088\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0089\u0001J\n\u0010\u008a\u0001\u001a\u00030\u008b\u0001H\u0002J\"\u0010\u008c\u0001\u001a\u00020\f2\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J!\u0010\u0091\u0001\u001a\u00020\f2\u0007\u0010\u0092\u0001\u001a\u00020!H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0018\u0010\u0095\u0001\u001a\u00020[2\u0007\u0010\u0092\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u0096\u0001J\u000f\u0010\u0097\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020!H\u0000¢\u0006\u0003\b\u009a\u0001J\u000f\u0010\u009b\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u009c\u0001J\u000f\u0010\u009d\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b\u009e\u0001J\u001d\u0010\u009f\u0001\u001a\u00020F2\u0007\u0010 \u0001\u001a\u00020|H\u0000ø\u0001\u0000¢\u0006\u0005\b¡\u0001\u0010uJ\u0013\u0010¢\u0001\u001a\u00020F2\b\u0010£\u0001\u001a\u00030¤\u0001H\u0002J\u001d\u0010¥\u0001\u001a\u00020F2\u0007\u0010 \u0001\u001a\u00020|H\u0000ø\u0001\u0000¢\u0006\u0005\b¦\u0001\u0010uJ\u000f\u0010§\u0001\u001a\u00020FH\u0000¢\u0006\u0003\b¨\u0001J\u0012\u0010©\u0001\u001a\u00020F2\u0007\u0010ª\u0001\u001a\u00020!H\u0002JK\u0010«\u0001\u001a\u00020|2\u0006\u0010d\u001a\u00020C2\u0007\u0010¬\u0001\u001a\u00020\f2\u0007\u0010\u00ad\u0001\u001a\u00020!2\u0007\u0010\u0092\u0001\u001a\u00020!2\b\u0010®\u0001\u001a\u00030¯\u00012\u0007\u0010°\u0001\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0006\b±\u0001\u0010²\u0001R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR5\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\f8F@BX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0016R\u0016\u0010\u0017\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0018R/\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000b\u001a\u0004\u0018\u00010\u001a8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b \u0010\u0013\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR+\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0013\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R+\u0010(\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020=X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020F0EX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u000e\u0010K\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010L\u001a\u0004\u0018\u00010MX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010N\u001a\u0004\u0018\u00010OX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001c\u0010T\u001a\u0004\u0018\u00010UX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u0004\u0018\u00010_8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\bb\u0010cR+\u0010d\u001a\u00020C2\u0006\u0010\u000b\u001a\u00020C8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bi\u0010\u0013\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u001a\u0010j\u001a\u00020kX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006³\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "undoManager", "Landroidx/compose/foundation/text/UndoManager;", "(Landroidx/compose/foundation/text/UndoManager;)V", "clipboardManager", "Landroidx/compose/ui/platform/ClipboardManager;", "getClipboardManager$foundation_release", "()Landroidx/compose/ui/platform/ClipboardManager;", "setClipboardManager$foundation_release", "(Landroidx/compose/ui/platform/ClipboardManager;)V", "<set-?>", "Landroidx/compose/ui/geometry/Offset;", "currentDragPosition", "getCurrentDragPosition-_m7T9-E", "()Landroidx/compose/ui/geometry/Offset;", "setCurrentDragPosition-_kEHs6E", "(Landroidx/compose/ui/geometry/Offset;)V", "currentDragPosition$delegate", "Landroidx/compose/runtime/MutableState;", "dragBeginOffsetInText", "", "Ljava/lang/Integer;", "dragBeginPosition", "J", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "draggingHandle", "getDraggingHandle", "()Landroidx/compose/foundation/text/Handle;", "setDraggingHandle", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle$delegate", "", "editable", "getEditable", "()Z", "setEditable", "(Z)V", "editable$delegate", "enabled", "getEnabled", "setEnabled", "enabled$delegate", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "getFocusRequester", "()Landroidx/compose/ui/focus/FocusRequester;", "setFocusRequester", "(Landroidx/compose/ui/focus/FocusRequester;)V", "hapticFeedBack", "Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "getHapticFeedBack", "()Landroidx/compose/ui/hapticfeedback/HapticFeedback;", "setHapticFeedBack", "(Landroidx/compose/ui/hapticfeedback/HapticFeedback;)V", "mouseSelectionObserver", "Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "getMouseSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/selection/MouseSelectionObserver;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOffsetMapping$foundation_release", "()Landroidx/compose/ui/text/input/OffsetMapping;", "setOffsetMapping$foundation_release", "(Landroidx/compose/ui/text/input/OffsetMapping;)V", "oldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "", "getOnValueChange$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnValueChange$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "previousRawDragOffset", "previousSelectionLayout", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "state", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getState$foundation_release", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "setState$foundation_release", "(Landroidx/compose/foundation/text/LegacyTextFieldState;)V", "textToolbar", "Landroidx/compose/ui/platform/TextToolbar;", "getTextToolbar", "()Landroidx/compose/ui/platform/TextToolbar;", "setTextToolbar", "(Landroidx/compose/ui/platform/TextToolbar;)V", "touchSelectionObserver", "Landroidx/compose/foundation/text/TextDragObserver;", "getTouchSelectionObserver$foundation_release", "()Landroidx/compose/foundation/text/TextDragObserver;", "transformedText", "Landroidx/compose/ui/text/AnnotatedString;", "getTransformedText$foundation_release", "()Landroidx/compose/ui/text/AnnotatedString;", "getUndoManager", "()Landroidx/compose/foundation/text/UndoManager;", "value", "getValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "value$delegate", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "getVisualTransformation$foundation_release", "()Landroidx/compose/ui/text/input/VisualTransformation;", "setVisualTransformation$foundation_release", "(Landroidx/compose/ui/text/input/VisualTransformation;)V", "clearPreviewHighlight", "clearPreviewHighlight$foundation_release", "contextMenuOpenAdjustment", "position", "contextMenuOpenAdjustment-k-4lQ0M", "(J)V", "copy", "cancelSelection", "copy$foundation_release", "createTextFieldValue", "annotatedString", "selection", "Landroidx/compose/ui/text/TextRange;", "createTextFieldValue-FDrldGo", "(Landroidx/compose/ui/text/AnnotatedString;J)Landroidx/compose/ui/text/input/TextFieldValue;", "cursorDragObserver", "cursorDragObserver$foundation_release", "cut", "cut$foundation_release", "deselect", "deselect-_kEHs6E$foundation_release", "enterSelectionMode", "showFloatingToolbar", "enterSelectionMode$foundation_release", "exitSelectionMode", "exitSelectionMode$foundation_release", "getContentRect", "Landroidx/compose/ui/geometry/Rect;", "getCursorPosition", "density", "Landroidx/compose/ui/unit/Density;", "getCursorPosition-tuRUvjQ$foundation_release", "(Landroidx/compose/ui/unit/Density;)J", "getHandlePosition", "isStartHandle", "getHandlePosition-tuRUvjQ$foundation_release", "(Z)J", "handleDragObserver", "handleDragObserver$foundation_release", "hideSelectionToolbar", "hideSelectionToolbar$foundation_release", "isTextChanged", "isTextChanged$foundation_release", "paste", "paste$foundation_release", "selectAll", "selectAll$foundation_release", "setDeletionPreviewHighlight", "range", "setDeletionPreviewHighlight-5zc-tL8$foundation_release", "setHandleState", "handleState", "Landroidx/compose/foundation/text/HandleState;", "setSelectionPreviewHighlight", "setSelectionPreviewHighlight-5zc-tL8$foundation_release", "showSelectionToolbar", "showSelectionToolbar$foundation_release", "updateFloatingToolbar", "show", "updateSelection", "currentPosition", "isStartOfSelection", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "isTouchBasedSelection", "updateSelection-8UEBfa8", "(Landroidx/compose/ui/text/input/TextFieldValue;JZZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;
    private ClipboardManager clipboardManager;

    /* renamed from: currentDragPosition$delegate, reason: from kotlin metadata */
    private final MutableState currentDragPosition;
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    /* renamed from: draggingHandle$delegate, reason: from kotlin metadata */
    private final MutableState draggingHandle;

    /* renamed from: editable$delegate, reason: from kotlin metadata */
    private final MutableState editable;

    /* renamed from: enabled$delegate, reason: from kotlin metadata */
    private final MutableState enabled;
    private FocusRequester focusRequester;
    private HapticFeedback hapticFeedBack;
    private final MouseSelectionObserver mouseSelectionObserver;
    private OffsetMapping offsetMapping;
    private TextFieldValue oldValue;
    private Function1<? super TextFieldValue, Unit> onValueChange;
    private int previousRawDragOffset;
    private SelectionLayout previousSelectionLayout;
    private LegacyTextFieldState state;
    private TextToolbar textToolbar;
    private final TextDragObserver touchSelectionObserver;
    private final UndoManager undoManager;

    /* renamed from: value$delegate, reason: from kotlin metadata */
    private final MutableState value;
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ void copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.copy$foundation_release(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1349createTextFieldValueFDrldGo(AnnotatedString annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (TextRange) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1350deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1354deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z);
    }

    private final Rect getContentRect() {
        float fM3552getYimpl;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getIsLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5721getStartimpl(getValue$foundation_release().getSelection()));
                int iOriginalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m5716getEndimpl(getValue$foundation_release().getSelection()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long jM3567getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m3567getZeroF1C5BW0() : layoutCoordinates4.mo5131localToRootMKHz9U(m1357getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long jM3567getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.INSTANCE.m3567getZeroF1C5BW0() : layoutCoordinates3.mo5131localToRootMKHz9U(m1357getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float fM3552getYimpl2 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    fM3552getYimpl = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    fM3552getYimpl = Offset.m3552getYimpl(layoutCoordinates2.mo5131localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(iOriginalToTransformed)) == null) ? 0.0f : cursorRect2.getTop())));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    fM3552getYimpl2 = Offset.m3552getYimpl(layoutCoordinates.mo5131localToRootMKHz9U(OffsetKt.Offset(0.0f, (layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(iOriginalToTransformed2)) == null) ? 0.0f : cursorRect.getTop())));
                }
                return new Rect(Math.min(Offset.m3551getXimpl(jM3567getZeroF1C5BW0), Offset.m3551getXimpl(jM3567getZeroF1C5BW02)), Math.min(fM3552getYimpl, fM3552getYimpl2), Math.max(Offset.m3551getXimpl(jM3567getZeroF1C5BW0), Offset.m3551getXimpl(jM3567getZeroF1C5BW02)), (legacyTextFieldState.getTextDelegate().getDensity().getDensity() * Dp.m6233constructorimpl(25)) + Math.max(Offset.m3552getYimpl(jM3567getZeroF1C5BW0), Offset.m3552getYimpl(jM3567getZeroF1C5BW02)));
            }
        }
        return Rect.INSTANCE.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1351setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean show) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(show);
        }
        if (show) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1352updateSelection8UEBfa8(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, SelectionAdjustment adjustment, boolean isTouchBasedSelection) {
        TextLayoutResultProxy layoutResult;
        int i2;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.INSTANCE.m5726getZerod9O1mEE();
        }
        long jTextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m5721getStartimpl(value.getSelection())), this.offsetMapping.originalToTransformed(TextRange.m5716getEndimpl(value.getSelection())));
        boolean z = false;
        int iM1051getOffsetForPosition3MmeM6k = layoutResult.m1051getOffsetForPosition3MmeM6k(currentPosition, false);
        int iM5721getStartimpl = (isStartHandle || isStartOfSelection) ? iM1051getOffsetForPosition3MmeM6k : TextRange.m5721getStartimpl(jTextRange);
        int iM5716getEndimpl = (!isStartHandle || isStartOfSelection) ? iM1051getOffsetForPosition3MmeM6k : TextRange.m5716getEndimpl(jTextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (isStartOfSelection || selectionLayout == null || (i2 = this.previousRawDragOffset) == -1) {
            i2 = -1;
        }
        SelectionLayout selectionLayoutM1301getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1301getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), iM5721getStartimpl, iM5716getEndimpl, i2, jTextRange, isStartOfSelection, isStartHandle);
        if (!selectionLayoutM1301getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = selectionLayoutM1301getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = iM1051getOffsetForPosition3MmeM6k;
        Selection selectionAdjust = adjustment.adjust(selectionLayoutM1301getTextFieldSelectionLayoutRcvTLA);
        long jTextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(selectionAdjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(selectionAdjust.getEnd().getOffset()));
        if (TextRange.m5714equalsimpl0(jTextRange2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z2 = TextRange.m5720getReversedimpl(jTextRange2) != TextRange.m5720getReversedimpl(value.getSelection()) && TextRange.m5714equalsimpl0(TextRangeKt.TextRange(TextRange.m5716getEndimpl(jTextRange2), TextRange.m5721getStartimpl(jTextRange2)), value.getSelection());
        boolean z3 = TextRange.m5715getCollapsedimpl(jTextRange2) && TextRange.m5715getCollapsedimpl(value.getSelection());
        if (isTouchBasedSelection && value.getText().length() > 0 && !z2 && !z3 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo4512performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m4521getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1349createTextFieldValueFDrldGo(value.getAnnotatedString(), jTextRange2));
        if (!isTouchBasedSelection) {
            updateFloatingToolbar(!TextRange.m5715getCollapsedimpl(jTextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(isTouchBasedSelection);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m5715getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m5715getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return jTextRange2;
        }
        if (TextRange.m5715getCollapsedimpl(jTextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z);
        return jTextRange2;
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m978setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m5726getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m981setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m5726getZerod9O1mEE());
    }

    /* renamed from: contextMenuOpenAdjustment-k-4lQ0M, reason: not valid java name */
    public final void m1353contextMenuOpenAdjustmentk4lQ0M(long position) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return;
        }
        if (TextRange.m5712containsimpl(getValue$foundation_release().getSelection(), TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(layoutResult, position, false, 2, null))) {
            return;
        }
        this.previousRawDragOffset = -1;
        m1352updateSelection8UEBfa8(getValue$foundation_release(), position, true, false, SelectionAdjustment.INSTANCE.getWord(), false);
    }

    public final void copy$foundation_release(boolean cancelSelection) {
        if (TextRange.m5715getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        if (cancelSelection) {
            int iM5718getMaximpl = TextRange.m5718getMaximpl(getValue$foundation_release().getSelection());
            this.onValueChange.invoke(m1349createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iM5718getMaximpl, iM5718getMaximpl)));
            setHandleState(HandleState.None);
        }
    }

    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1018onDownk4lQ0M(long point) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1019onDragk4lQ0M(long delta) {
                TextLayoutResultProxy layoutResult;
                HapticFeedback hapticFeedBack;
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3556plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1351setCurrentDragPosition_kEHs6E(Offset.m3540boximpl(Offset.m3556plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
                OffsetMapping offsetMapping = textFieldSelectionManager2.getOffsetMapping();
                Offset offsetM1355getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1355getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1355getCurrentDragPosition_m7T9E);
                int iTransformedToOriginal = offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(layoutResult, offsetM1355getCurrentDragPosition_m7T9E.getPackedValue(), false, 2, null));
                long jTextRange = TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal);
                if (TextRange.m5714equalsimpl0(jTextRange, textFieldSelectionManager2.getValue$foundation_release().getSelection())) {
                    return;
                }
                LegacyTextFieldState state2 = textFieldSelectionManager2.getState();
                if ((state2 == null || state2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo4512performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m4521getTextHandleMove5zf0vsI());
                }
                textFieldSelectionManager2.getOnValueChange$foundation_release().invoke(textFieldSelectionManager2.m1349createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), jTextRange));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1020onStartk4lQ0M(long startPoint) {
                TextLayoutResultProxy layoutResult;
                long jM1298getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1298getAdjustedCoordinatesk4lQ0M(this.this$0.m1357getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1298getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m1351setCurrentDragPosition_kEHs6E(Offset.m3540boximpl(jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m3567getZeroF1C5BW0();
                this.this$0.setDraggingHandle(Handle.Cursor);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1351setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1351setCurrentDragPosition_kEHs6E(null);
            }
        };
    }

    public final void cut$foundation_release() {
        if (TextRange.m5715getCollapsedimpl(getValue$foundation_release().getSelection())) {
            return;
        }
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager != null) {
            clipboardManager.setText(TextFieldValueKt.getSelectedText(getValue$foundation_release()));
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int iM5719getMinimpl = TextRange.m5719getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m1349createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(iM5719getMinimpl, iM5719getMinimpl)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1354deselect_kEHs6E$foundation_release(Offset position) {
        if (!TextRange.m5715getCollapsedimpl(getValue$foundation_release().getSelection())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m5962copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((position == null || layoutResult == null) ? TextRange.m5718getMaximpl(getValue$foundation_release().getSelection()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(layoutResult, position.getPackedValue(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setHandleState((position == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean showFloatingToolbar) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            focusRequester.requestFocus();
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(showFloatingToolbar);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    /* renamed from: getClipboardManager$foundation_release, reason: from getter */
    public final ClipboardManager getClipboardManager() {
        return this.clipboardManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1355getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1356getCursorPositiontuRUvjQ$foundation_release(Density density) {
        int iOriginalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m5721getStartimpl(getValue$foundation_release().getSelection()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        Intrinsics.checkNotNull(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(RangesKt.coerceIn(iOriginalToTransformed, 0, value.getLayoutInput().getText().length()));
        return OffsetKt.Offset((density.mo334toPx0680j_4(TextFieldCursorKt.getDefaultCursorThickness()) / 2) + cursorRect.getLeft(), cursorRect.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1357getHandlePositiontuRUvjQ$foundation_release(boolean isStartHandle) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        if (!Intrinsics.areEqual(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        long selection = getValue$foundation_release().getSelection();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(isStartHandle ? TextRange.m5721getStartimpl(selection) : TextRange.m5716getEndimpl(selection)), isStartHandle, TextRange.m5720getReversedimpl(getValue$foundation_release().getSelection()));
    }

    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* renamed from: getMouseSelectionObserver$foundation_release, reason: from getter */
    public final MouseSelectionObserver getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* renamed from: getOffsetMapping$foundation_release, reason: from getter */
    public final OffsetMapping getOffsetMapping() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    /* renamed from: getState$foundation_release, reason: from getter */
    public final LegacyTextFieldState getState() {
        return this.state;
    }

    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    /* renamed from: getTouchSelectionObserver$foundation_release, reason: from getter */
    public final TextDragObserver getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value.getValue();
    }

    /* renamed from: getVisualTransformation$foundation_release, reason: from getter */
    public final VisualTransformation getVisualTransformation() {
        return this.visualTransformation;
    }

    public final TextDragObserver handleDragObserver$foundation_release(final boolean isStartHandle) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1018onDownk4lQ0M(long point) {
                TextLayoutResultProxy layoutResult;
                this.this$0.setDraggingHandle(isStartHandle ? Handle.SelectionStart : Handle.SelectionEnd);
                long jM1298getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1298getAdjustedCoordinatesk4lQ0M(this.this$0.m1357getHandlePositiontuRUvjQ$foundation_release(isStartHandle));
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || (layoutResult = state.getLayoutResult()) == null) {
                    return;
                }
                long jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release(jM1298getAdjustedCoordinatesk4lQ0M);
                this.this$0.dragBeginPosition = jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                this.this$0.m1351setCurrentDragPosition_kEHs6E(Offset.m3540boximpl(jM1054translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                this.this$0.dragTotalDistance = Offset.INSTANCE.m3567getZeroF1C5BW0();
                this.this$0.previousRawDragOffset = -1;
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setInTouchMode(true);
                }
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1019onDragk4lQ0M(long delta) {
                TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                textFieldSelectionManager.dragTotalDistance = Offset.m3556plusMKHz9U(textFieldSelectionManager.dragTotalDistance, delta);
                TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                textFieldSelectionManager2.m1351setCurrentDragPosition_kEHs6E(Offset.m3540boximpl(Offset.m3556plusMKHz9U(textFieldSelectionManager2.dragBeginPosition, this.this$0.dragTotalDistance)));
                TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset offsetM1355getCurrentDragPosition_m7T9E = this.this$0.m1355getCurrentDragPosition_m7T9E();
                Intrinsics.checkNotNull(offsetM1355getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1352updateSelection8UEBfa8(value$foundation_release, offsetM1355getCurrentDragPosition_m7T9E.getPackedValue(), false, isStartHandle, SelectionAdjustment.INSTANCE.getCharacterWithWordAccelerate(), true);
                this.this$0.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1020onStartk4lQ0M(long startPoint) {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1351setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1351setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !Intrinsics.areEqual(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    public final void paste$foundation_release() {
        AnnotatedString text;
        ClipboardManager clipboardManager = this.clipboardManager;
        if (clipboardManager == null || (text = clipboardManager.getText()) == null) {
            return;
        }
        AnnotatedString annotatedStringPlus = TextFieldValueKt.getTextBeforeSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()).plus(text).plus(TextFieldValueKt.getTextAfterSelection(getValue$foundation_release(), getValue$foundation_release().getText().length()));
        int length = text.length() + TextRange.m5719getMinimpl(getValue$foundation_release().getSelection());
        this.onValueChange.invoke(m1349createTextFieldValueFDrldGo(annotatedStringPlus, TextRangeKt.TextRange(length, length)));
        setHandleState(HandleState.None);
        UndoManager undoManager = this.undoManager;
        if (undoManager != null) {
            undoManager.forceNextSnapshot();
        }
    }

    public final void selectAll$foundation_release() {
        TextFieldValue textFieldValueM1349createTextFieldValueFDrldGo = m1349createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(textFieldValueM1349createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m5962copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, textFieldValueM1349createTextFieldValueFDrldGo.getSelection(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    public final void setClipboardManager$foundation_release(ClipboardManager clipboardManager) {
        this.clipboardManager = clipboardManager;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1358setDeletionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m978setDeletionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m981setSelectionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m5726getZerod9O1mEE());
        }
        if (TextRange.m5715getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    public final void setEnabled(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
    }

    public final void setFocusRequester(FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1359setSelectionPreviewHighlight5zctL8$foundation_release(long range) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m981setSelectionPreviewHighlightRange5zctL8(range);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m978setDeletionPreviewHighlightRange5zctL8(TextRange.INSTANCE.m5726getZerod9O1mEE());
        }
        if (TextRange.m5715getCollapsedimpl(range)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(TextFieldValue textFieldValue) {
        this.value.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    public final void showSelectionToolbar$foundation_release() {
        ClipboardManager clipboardManager;
        if (getEnabled()) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            if (legacyTextFieldState == null || legacyTextFieldState.isInTouchMode()) {
                boolean z = this.visualTransformation instanceof PasswordVisualTransformation;
                Function0<Unit> function0 = (TextRange.m5715getCollapsedimpl(getValue$foundation_release().getSelection()) || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$copy$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        TextFieldSelectionManager.copy$foundation_release$default(this.this$0, false, 1, null);
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function02 = (TextRange.m5715getCollapsedimpl(getValue$foundation_release().getSelection()) || !getEditable() || z) ? null : new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$cut$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.cut$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                };
                Function0<Unit> function03 = (getEditable() && (clipboardManager = this.clipboardManager) != null && clipboardManager.hasText()) ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$paste$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.paste$foundation_release();
                        this.this$0.hideSelectionToolbar$foundation_release();
                    }
                } : null;
                Function0<Unit> function04 = TextRange.m5717getLengthimpl(getValue$foundation_release().getSelection()) != getValue$foundation_release().getText().length() ? new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$showSelectionToolbar$selectAll$1
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        this.this$0.selectAll$foundation_release();
                    }
                } : null;
                TextToolbar textToolbar = this.textToolbar;
                if (textToolbar != null) {
                    textToolbar.showMenu(getContentRect(), function0, function03, function02, function04);
                }
            }
        }
    }

    public TextFieldSelectionManager(UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new Function1<TextFieldValue, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return Unit.INSTANCE;
            }
        };
        this.value = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = VisualTransformation.INSTANCE.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.INSTANCE;
        this.dragBeginPosition = companion.m3567getZeroF1C5BW0();
        this.dragTotalDistance = companion.m3567getZeroF1C5BW0();
        this.draggingHandle = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (DefaultConstructorMarker) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private final void onEnd() {
                this.this$0.setDraggingHandle(null);
                this.this$0.m1351setCurrentDragPosition_kEHs6E(null);
                this.this$0.updateFloatingToolbar(true);
                this.this$0.dragBeginOffsetInText = null;
                boolean zM5715getCollapsedimpl = TextRange.m5715getCollapsedimpl(this.this$0.getValue$foundation_release().getSelection());
                this.this$0.setHandleState(zM5715getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state = this.this$0.getState();
                if (state != null) {
                    state.setShowSelectionHandleStart(!zM5715getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
                }
                LegacyTextFieldState state2 = this.this$0.getState();
                if (state2 != null) {
                    state2.setShowSelectionHandleEnd(!zM5715getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, false));
                }
                LegacyTextFieldState state3 = this.this$0.getState();
                if (state3 == null) {
                    return;
                }
                state3.setShowCursorHandle(zM5715getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this.this$0, true));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1018onDownk4lQ0M(long point) {
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x00b4  */
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void mo1019onDragk4lQ0M(long r10) {
                /*
                    r9 = this;
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    boolean r0 = r0.getEnabled()
                    if (r0 == 0) goto L104
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    androidx.compose.ui.text.input.TextFieldValue r0 = r0.getValue$foundation_release()
                    java.lang.String r0 = r0.getText()
                    int r0 = r0.length()
                    if (r0 != 0) goto L19
                    return
                L19:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r0 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r0)
                    long r10 = androidx.compose.ui.geometry.Offset.m3556plusMKHz9U(r1, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$setDragTotalDistance$p(r0, r10)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.LegacyTextFieldState r10 = r10.getState()
                    r11 = 0
                    if (r10 == 0) goto Lff
                    androidx.compose.foundation.text.TextLayoutResultProxy r0 = r10.getLayoutResult()
                    if (r0 == 0) goto Lff
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    long r3 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragTotalDistance$p(r10)
                    long r1 = androidx.compose.ui.geometry.Offset.m3556plusMKHz9U(r1, r3)
                    androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m3540boximpl(r1)
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1347access$setCurrentDragPosition_kEHs6E(r10, r1)
                    java.lang.Integer r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r10)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.geometry.Offset r1 = r10.m1355getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                    long r1 = r1.getPackedValue()
                    boolean r1 = r0.m1052isPositionOnTextk4lQ0M(r1)
                    if (r1 != 0) goto Lb4
                    androidx.compose.ui.text.input.OffsetMapping r6 = r10.getOffsetMapping()
                    long r1 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r10)
                    r4 = 2
                    r5 = 0
                    r3 = 0
                    int r1 = androidx.compose.foundation.text.TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r6 = r6.transformedToOriginal(r1)
                    androidx.compose.ui.text.input.OffsetMapping r7 = r10.getOffsetMapping()
                    androidx.compose.ui.geometry.Offset r1 = r10.m1355getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
                    long r1 = r1.getPackedValue()
                    int r0 = androidx.compose.foundation.text.TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(r0, r1, r3, r4, r5)
                    int r0 = r7.transformedToOriginal(r0)
                    if (r6 != r0) goto L95
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getNone()
                L93:
                    r7 = r0
                    goto L9c
                L95:
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r0 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r0 = r0.getWord()
                    goto L93
                L9c:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r10.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r0 = r10.m1355getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
                    long r3 = r0.getPackedValue()
                    r6 = 0
                    r8 = 1
                    r5 = 0
                    r1 = r10
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1348access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                    goto Lfc
                Lb4:
                    r1 = r10
                    java.lang.Integer r10 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r10 == 0) goto Lc0
                    int r10 = r10.intValue()
                    goto Lc8
                Lc0:
                    long r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginPosition$p(r1)
                    int r10 = r0.m1051getOffsetForPosition3MmeM6k(r2, r11)
                Lc8:
                    androidx.compose.ui.geometry.Offset r2 = r1.m1355getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r2)
                    long r2 = r2.getPackedValue()
                    int r0 = r0.m1051getOffsetForPosition3MmeM6k(r2, r11)
                    java.lang.Integer r2 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getDragBeginOffsetInText$p(r1)
                    if (r2 != 0) goto Le0
                    if (r10 != r0) goto Le0
                    goto L104
                Le0:
                    androidx.compose.ui.text.input.TextFieldValue r2 = r1.getValue$foundation_release()
                    androidx.compose.ui.geometry.Offset r10 = r1.m1355getCurrentDragPosition_m7T9E()
                    kotlin.jvm.internal.Intrinsics.checkNotNull(r10)
                    long r3 = r10.getPackedValue()
                    androidx.compose.foundation.text.selection.SelectionAdjustment$Companion r10 = androidx.compose.foundation.text.selection.SelectionAdjustment.INSTANCE
                    androidx.compose.foundation.text.selection.SelectionAdjustment r7 = r10.getWord()
                    r8 = 1
                    r5 = 0
                    r6 = 0
                    long r0 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.m1348access$updateSelection8UEBfa8(r1, r2, r3, r5, r6, r7, r8)
                Lfc:
                    androidx.compose.ui.text.TextRange.m5709boximpl(r0)
                Lff:
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager r10 = r9.this$0
                    androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$updateFloatingToolbar(r10, r11)
                L104:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1.mo1019onDragk4lQ0M(long):void");
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1020onStartk4lQ0M(long startPoint) {
                long j2;
                TextLayoutResultProxy layoutResult;
                TextLayoutResultProxy layoutResult2;
                if (this.this$0.getEnabled() && this.this$0.getDraggingHandle() == null) {
                    this.this$0.setDraggingHandle(Handle.SelectionEnd);
                    this.this$0.previousRawDragOffset = -1;
                    this.this$0.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state = this.this$0.getState();
                    if (state == null || (layoutResult2 = state.getLayoutResult()) == null || !layoutResult2.m1052isPositionOnTextk4lQ0M(startPoint)) {
                        j2 = startPoint;
                        LegacyTextFieldState state2 = this.this$0.getState();
                        if (state2 != null && (layoutResult = state2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
                            int iTransformedToOriginal = textFieldSelectionManager.getOffsetMapping().transformedToOriginal(TextLayoutResultProxy.m1050getOffsetForPosition3MmeM6k$default(layoutResult, j2, false, 2, null));
                            TextFieldValue textFieldValueM1349createTextFieldValueFDrldGo = textFieldSelectionManager.m1349createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(iTransformedToOriginal, iTransformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo4512performHapticFeedbackCdsT49E(HapticFeedbackType.INSTANCE.m4521getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(textFieldValueM1349createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (this.this$0.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        this.this$0.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = this.this$0;
                        j2 = startPoint;
                        this.this$0.dragBeginOffsetInText = Integer.valueOf(TextRange.m5721getStartimpl(textFieldSelectionManager2.m1352updateSelection8UEBfa8(TextFieldValue.m5962copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.INSTANCE.m5726getZerod9O1mEE(), (TextRange) null, 5, (Object) null), startPoint, true, false, SelectionAdjustment.INSTANCE.getWord(), true)));
                    }
                    this.this$0.setHandleState(HandleState.None);
                    this.this$0.dragBeginPosition = j2;
                    TextFieldSelectionManager textFieldSelectionManager3 = this.this$0;
                    textFieldSelectionManager3.m1351setCurrentDragPosition_kEHs6E(Offset.m3540boximpl(textFieldSelectionManager3.dragBeginPosition));
                    this.this$0.dragTotalDistance = Offset.INSTANCE.m3567getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1228onDrag3MmeM6k(long dragPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), dragPosition, false, adjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1229onExtendk4lQ0M(long downPosition) {
                LegacyTextFieldState state = this.this$0.getState();
                if (state == null || state.getLayoutResult() == null || !this.this$0.getEnabled()) {
                    return false;
                }
                this.this$0.previousRawDragOffset = -1;
                updateMouseSelection(this.this$0.getValue$foundation_release(), downPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1230onExtendDragk4lQ0M(long dragPosition) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(this.this$0.getValue$foundation_release(), dragPosition, false, SelectionAdjustment.INSTANCE.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo1231onStart3MmeM6k(long downPosition, SelectionAdjustment adjustment) {
                LegacyTextFieldState state;
                if (!this.this$0.getEnabled() || this.this$0.getValue$foundation_release().getText().length() == 0 || (state = this.this$0.getState()) == null || state.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = this.this$0.getFocusRequester();
                if (focusRequester != null) {
                    focusRequester.requestFocus();
                }
                this.this$0.dragBeginPosition = downPosition;
                this.this$0.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(this.this$0, false, 1, null);
                updateMouseSelection(this.this$0.getValue$foundation_release(), this.this$0.dragBeginPosition, true, adjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue value, long currentPosition, boolean isStartOfSelection, SelectionAdjustment adjustment) {
                this.this$0.setHandleState(TextRange.m5715getCollapsedimpl(this.this$0.m1352updateSelection8UEBfa8(value, currentPosition, isStartOfSelection, false, adjustment, false)) ? HandleState.Cursor : HandleState.Selection);
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : undoManager);
    }
}
