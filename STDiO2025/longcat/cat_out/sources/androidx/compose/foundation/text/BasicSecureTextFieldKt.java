package androidx.compose.foundation.text;

import J.d;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.InputTransformationKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÊ\u0001\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u001328\b\u0002\u0010\u0014\u001a2\u0012\u0004\u0012\u00020\u0016\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0017¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0015¢\u0006\u0002\b\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020\u0001H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a \u0010(\u001a\u00020\u00052\u0011\u0010)\u001a\r\u0012\u0004\u0012\u00020\u00050\u0017¢\u0006\u0002\b*H\u0003¢\u0006\u0002\u0010+\u001a\u001a\u0010,\u001a\u0004\u0018\u00010\r*\u0004\u0018\u00010\r2\b\u0010-\u001a\u0004\u0018\u00010\rH\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"DefaultObfuscationCharacter", "", "LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS", "", "BasicSecureTextField", "", "state", "Landroidx/compose/foundation/text/input/TextFieldState;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "inputTransformation", "Landroidx/compose/foundation/text/input/InputTransformation;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "keyboardOptions", "Landroidx/compose/foundation/text/KeyboardOptions;", "onKeyboardAction", "Landroidx/compose/foundation/text/input/KeyboardActionHandler;", "onTextLayout", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/Density;", "Lkotlin/Function0;", "Landroidx/compose/ui/text/TextLayoutResult;", "Lkotlin/ParameterName;", "name", "getResult", "Lkotlin/ExtensionFunctionType;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "cursorBrush", "Landroidx/compose/ui/graphics/Brush;", "decorator", "Landroidx/compose/foundation/text/input/TextFieldDecorator;", "textObfuscationMode", "Landroidx/compose/foundation/text/input/TextObfuscationMode;", "textObfuscationCharacter", "BasicSecureTextField-Jb9bMDk", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/foundation/text/KeyboardOptions;Landroidx/compose/foundation/text/input/KeyboardActionHandler;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/foundation/text/input/TextFieldDecorator;ICLandroidx/compose/runtime/Composer;III)V", "DisableCutCopy", "content", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "then", "next", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BasicSecureTextFieldKt {
    private static final char DefaultObfuscationCharacter = 8226;
    private static final long LAST_TYPED_CHARACTER_REVEAL_DURATION_MILLIS = 1500;

    /* JADX WARN: Removed duplicated region for block: B:101:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:232:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* renamed from: BasicSecureTextField-Jb9bMDk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m929BasicSecureTextFieldJb9bMDk(final androidx.compose.foundation.text.input.TextFieldState r32, androidx.compose.ui.Modifier r33, boolean r34, androidx.compose.foundation.text.input.InputTransformation r35, androidx.compose.ui.text.TextStyle r36, androidx.compose.foundation.text.KeyboardOptions r37, androidx.compose.foundation.text.input.KeyboardActionHandler r38, kotlin.jvm.functions.Function2<? super androidx.compose.ui.unit.Density, ? super kotlin.jvm.functions.Function0<androidx.compose.ui.text.TextLayoutResult>, kotlin.Unit> r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.ui.graphics.Brush r41, androidx.compose.foundation.text.input.TextFieldDecorator r42, int r43, char r44, androidx.compose.runtime.Composer r45, final int r46, final int r47, final int r48) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicSecureTextFieldKt.m929BasicSecureTextFieldJb9bMDk(androidx.compose.foundation.text.input.TextFieldState, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.text.input.InputTransformation, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.input.KeyboardActionHandler, kotlin.jvm.functions.Function2, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, androidx.compose.foundation.text.input.TextFieldDecorator, int, char, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BasicSecureTextField_Jb9bMDk$lambda$4$lambda$3(State state, int i2, int i3) {
        return ((Character) state.getValue()).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DisableCutCopy(final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1085555050);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1085555050, i3, -1, "androidx.compose.foundation.text.DisableCutCopy (BasicSecureTextField.kt:310)");
            }
            final TextToolbar textToolbar = (TextToolbar) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalTextToolbar());
            boolean zChanged = composerStartRestartGroup.changed(textToolbar);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new TextToolbar() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1
                    private final /* synthetic */ TextToolbar $$delegate_0;

                    {
                        this.$$delegate_0 = this.$currentToolbar;
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public TextToolbarStatus getStatus() {
                        return this.$$delegate_0.getStatus();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void hide() {
                        this.$$delegate_0.hide();
                    }

                    @Override // androidx.compose.ui.platform.TextToolbar
                    public void showMenu(Rect rect, Function0<Unit> onCopyRequested, Function0<Unit> onPasteRequested, Function0<Unit> onCutRequested, Function0<Unit> onSelectAllRequested) {
                        this.$currentToolbar.showMenu(rect, null, onPasteRequested, null, onSelectAllRequested);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            CompositionLocalKt.CompositionLocalProvider(CompositionLocalsKt.getLocalTextToolbar().provides((BasicSecureTextFieldKt$DisableCutCopy$copyDisabledToolbar$1$1) objRememberedValue), ComposableLambdaKt.rememberComposableLambda(-1448819882, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1448819882, i4, -1, "androidx.compose.foundation.text.DisableCutCopy.<anonymous> (BasicSecureTextField.kt:332)");
                    }
                    Modifier modifierOnPreviewKeyEvent = KeyInputModifierKt.onPreviewKeyEvent(Modifier.INSTANCE, new Function1<KeyEvent, Boolean>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                            return m930invokeZmokQxo(keyEvent.m4838unboximpl());
                        }

                        /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                        public final Boolean m930invokeZmokQxo(android.view.KeyEvent keyEvent) {
                            KeyCommand keyCommandMo957mapZmokQxo = KeyMapping_androidKt.getPlatformDefaultKeyMapping().mo957mapZmokQxo(keyEvent);
                            return Boolean.valueOf(keyCommandMo957mapZmokQxo == KeyCommand.COPY || keyCommandMo957mapZmokQxo == KeyCommand.CUT);
                        }
                    });
                    Function2<Composer, Integer, Unit> function22 = function2;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierOnPreviewKeyEvent);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                    Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                    if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                    }
                    Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (d.A(composer2, 0, function22)) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.BasicSecureTextFieldKt.DisableCutCopy.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    BasicSecureTextFieldKt.DisableCutCopy(function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InputTransformation then(InputTransformation inputTransformation, InputTransformation inputTransformation2) {
        return inputTransformation == null ? inputTransformation2 : inputTransformation2 == null ? inputTransformation : InputTransformationKt.then(inputTransformation, inputTransformation2);
    }
}
