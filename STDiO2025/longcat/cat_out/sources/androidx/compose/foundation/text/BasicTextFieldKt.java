package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.TextFieldDecorator;
import androidx.compose.foundation.text.input.internal.selection.TextFieldHandleState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.AndroidSelectionHandles_androidKt;
import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000Ê\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÛ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)H\u0007¢\u0006\u0002\u0010*\u001añ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u001728\b\u0002\u0010\u0018\u001a2\u0012\u0004\u0012\u00020\u001a\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001b¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0019¢\u0006\u0002\b 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010-\u001a\u00020\fH\u0001¢\u0006\u0002\u0010.\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010=\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u0002002\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010?\u001aâ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010A\u001aî\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010/\u001a\u00020@2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020\u0006022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u00020\f2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010>\u001a\u0002072\b\b\u0002\u00108\u001a\u0002092\u0014\b\u0002\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0006022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$23\b\u0002\u0010:\u001a-\u0012\u001e\u0012\u001c\u0012\u0004\u0012\u00020\u00060\u001b¢\u0006\u0002\b;¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(<\u0012\u0004\u0012\u00020\u000602¢\u0006\u0002\b;H\u0007¢\u0006\u0002\u0010B\u001a\u0015\u0010C\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\u001a\u0015\u0010G\u001a\u00020\u00062\u0006\u0010D\u001a\u00020EH\u0001¢\u0006\u0002\u0010F\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0004¨\u0006H²\u0006\n\u0010I\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010K\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010L\u001a\u00020JX\u008a\u0084\u0002²\u0006\n\u0010M\u001a\u000200X\u008a\u008e\u0002²\u0006\n\u0010N\u001a\u00020@X\u008a\u008e\u0002"}, d2 = {"DefaultTextFieldDecorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "MinTouchTargetSizeForHandles", "Landroidx/compose/ui/unit/DpSize;", "J", "BasicTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "readOnly", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "lineLimits", "Landroidx/compose/foundation/text/input/TextFieldLineLimits;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "decorator", "scrollState", "Landroidx/compose/foundation/ScrollState;", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;III)V", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "isPassword", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Landroidx/compose/foundation/text/input/TextFieldLineLimits;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;Landroidx/compose/foundation/text/input/TextFieldDecorator;Landroidx/compose/foundation/ScrollState;ZLandroidx/compose/runtime/Composer;III)V", "value", "Landroidx/compose/ui/text/input/TextFieldValue;", "onValueChange", "Lkotlin/Function1;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "singleLine", "maxLines", "", "visualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "decorationBox", "Landroidx/compose/runtime/Composable;", "innerTextField", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "minLines", "(Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/KeyboardActions;ZIILandroidx/compose/ui/text/input/VisualTransformation;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "TextFieldCursorHandle", "selectionState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;", "(Landroidx/compose/foundation/text/input/internal/selection/TextFieldSelectionState;Landroidx/compose/runtime/Composer;I)V", "TextFieldSelectionHandles", "foundation_release", "cursorHandleState", "Landroidx/compose/foundation/text/input/internal/selection/TextFieldHandleState;", "startHandleState", "endHandleState", "textFieldValueState", "lastTextValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    private static final TextFieldDecorator DefaultTextFieldDecorator = BasicTextFieldKt$DefaultTextFieldDecorator$1.INSTANCE;
    private static final long MinTouchTargetSizeForHandles;

    static {
        float f2 = 40;
        MinTouchTargetSizeForHandles = DpKt.m6255DpSizeYgX7TsA(Dp.m6233constructorimpl(f2), Dp.m6233constructorimpl(f2));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:235:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r37, androidx.compose.ui.Modifier r38, boolean r39, boolean r40, androidx.compose.foundation.text.input.InputTransformation r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.input.KeyboardActionHandler r44, androidx.compose.foundation.text.input.TextFieldLineLimits r45, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, androidx.compose.foundation.text.input.OutputTransformation r49, androidx.compose.foundation.text.input.TextFieldDecorator r50, androidx.compose.foundation.ScrollState r51, androidx.compose.runtime.Composer r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$21(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$25(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final void TextFieldCursorHandle(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1991581797);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1991581797, i3, -1, "androidx.compose.foundation.text.TextFieldCursorHandle (BasicTextField.kt:414)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$cursorHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getCursorHandleState$foundation_release(false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            if (TextFieldCursorHandle$lambda$9((State) objRememberedValue).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-317108348);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldCursorHandle$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0, reason: not valid java name */
                        public final long mo931provideF1C5BW0() {
                            return textFieldSelectionState.getCursorHandleState$foundation_release(true).m1200getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new BasicTextFieldKt$TextFieldCursorHandle$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidCursorHandle_androidKt.m928CursorHandleUSBMPiE(offsetProvider, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3), MinTouchTargetSizeForHandles, composerStartRestartGroup, 384, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-316683586);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldCursorHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BasicTextFieldKt.TextFieldCursorHandle(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldCursorHandle$lambda$9(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    public static final void TextFieldSelectionHandles(final TextFieldSelectionState textFieldSelectionState, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2025287684);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(textFieldSelectionState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2025287684, i3, -1, "androidx.compose.foundation.text.TextFieldSelectionHandles (BasicTextField.kt:440)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$startHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(true, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            State state = (State) objRememberedValue;
            if (TextFieldSelectionHandles$lambda$13(state).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353986043);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$1$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo931provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(true, true).m1200getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
                ResolvedTextDirection direction = TextFieldSelectionHandles$lambda$13(state).getDirection();
                boolean handlesCrossed = TextFieldSelectionHandles$lambda$13(state).getHandlesCrossed();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new BasicTextFieldKt$TextFieldSelectionHandles$2$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                AndroidSelectionHandles_androidKt.m1279SelectionHandlepzduO1o(offsetProvider, true, direction, handlesCrossed, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion2, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1353409443);
                composerStartRestartGroup.endReplaceGroup();
            }
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotStateKt.derivedStateOf(new Function0<TextFieldHandleState>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$endHandleState$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final TextFieldHandleState invoke() {
                        return textFieldSelectionState.getSelectionHandleState$foundation_release(false, false);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            State state2 = (State) objRememberedValue4;
            if (TextFieldSelectionHandles$lambda$17(state2).getVisible()) {
                composerStartRestartGroup.startReplaceGroup(-1353116090);
                boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance3 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new OffsetProvider() { // from class: androidx.compose.foundation.text.BasicTextFieldKt$TextFieldSelectionHandles$3$1
                        @Override // androidx.compose.foundation.text.selection.OffsetProvider
                        /* renamed from: provide-F1C5BW0 */
                        public final long mo931provideF1C5BW0() {
                            return textFieldSelectionState.getSelectionHandleState$foundation_release(false, true).m1200getPositionF1C5BW0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                OffsetProvider offsetProvider2 = (OffsetProvider) objRememberedValue5;
                ResolvedTextDirection direction2 = TextFieldSelectionHandles$lambda$17(state2).getDirection();
                boolean handlesCrossed2 = TextFieldSelectionHandles$lambda$17(state2).getHandlesCrossed();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                boolean zChangedInstance4 = composerStartRestartGroup.changedInstance(textFieldSelectionState);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance4 || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new BasicTextFieldKt$TextFieldSelectionHandles$4$1(textFieldSelectionState, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                AndroidSelectionHandles_androidKt.m1279SelectionHandlepzduO1o(offsetProvider2, false, direction2, handlesCrossed2, MinTouchTargetSizeForHandles, SuspendingPointerInputFilterKt.pointerInput(companion3, textFieldSelectionState, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue6), composerStartRestartGroup, 24624, 0);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                composerStartRestartGroup.startReplaceGroup(-1352540451);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicTextFieldKt.TextFieldSelectionHandles.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BasicTextFieldKt.TextFieldSelectionHandles(textFieldSelectionState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$13(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    private static final TextFieldHandleState TextFieldSelectionHandles$lambda$17(State<TextFieldHandleState> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x067a  */
    /* JADX WARN: Removed duplicated region for block: B:365:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.foundation.text.input.TextFieldState r54, androidx.compose.ui.Modifier r55, boolean r56, boolean r57, androidx.compose.foundation.text.input.InputTransformation r58, androidx.compose.ui.text.TextStyle r59, androidx.compose.foundation.text.KeyboardOptions r60, androidx.compose.foundation.text.input.KeyboardActionHandler r61, androidx.compose.foundation.text.input.TextFieldLineLimits r62, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r63, androidx.compose.foundation.interaction.MutableInteractionSource r64, androidx.compose.ui.graphics.Brush r65, androidx.compose.foundation.text.input.internal.CodepointTransformation r66, androidx.compose.foundation.text.input.OutputTransformation r67, androidx.compose.foundation.text.input.TextFieldDecorator r68, androidx.compose.foundation.ScrollState r69, boolean r70, androidx.compose.runtime.Composer r71, final int r72, final int r73, final int r74) {
        /*
            Method dump skipped, instructions count: 1680
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, androidx.compose.foundation.text.input.TextFieldLineLimits, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.internal.CodepointTransformation, androidx.compose.foundation.text.input.OutputTransformation, androidx.compose.foundation.text.input.TextFieldDecorator, androidx.compose.foundation.ScrollState, boolean, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final java.lang.String r37, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r52, androidx.compose.runtime.Composer r53, final int r54, final int r55, final int r56) {
        /*
            Method dump skipped, instructions count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r38, final kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.TextFieldValue, kotlin.Unit> r39, androidx.compose.ui.Modifier r40, boolean r41, boolean r42, androidx.compose.ui.text.TextStyle r43, androidx.compose.foundation.text.KeyboardOptions r44, androidx.compose.foundation.text.KeyboardActions r45, boolean r46, int r47, int r48, androidx.compose.ui.text.input.VisualTransformation r49, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r50, androidx.compose.foundation.interaction.MutableInteractionSource r51, androidx.compose.ui.graphics.Brush r52, kotlin.jvm.functions.Function3<? super kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r53, androidx.compose.runtime.Composer r54, final int r55, final int r56, final int r57) {
        /*
            Method dump skipped, instructions count: 1025
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final java.lang.String r35, final kotlin.jvm.functions.Function1 r36, androidx.compose.ui.Modifier r37, boolean r38, boolean r39, androidx.compose.ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.KeyboardActions r42, boolean r43, int r44, androidx.compose.ui.text.input.VisualTransformation r45, kotlin.jvm.functions.Function1 r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, kotlin.jvm.functions.Function3 r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:224:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0122  */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ void BasicTextField(final androidx.compose.ui.text.input.TextFieldValue r35, final kotlin.jvm.functions.Function1 r36, androidx.compose.ui.Modifier r37, boolean r38, boolean r39, androidx.compose.ui.text.TextStyle r40, androidx.compose.foundation.text.KeyboardOptions r41, androidx.compose.foundation.text.KeyboardActions r42, boolean r43, int r44, androidx.compose.ui.text.input.VisualTransformation r45, kotlin.jvm.functions.Function1 r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Brush r48, kotlin.jvm.functions.Function3 r49, androidx.compose.runtime.Composer r50, final int r51, final int r52, final int r53) {
        /*
            Method dump skipped, instructions count: 822
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
