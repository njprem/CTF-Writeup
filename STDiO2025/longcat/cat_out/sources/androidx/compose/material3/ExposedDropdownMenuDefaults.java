package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.ArrowDropDownKt;
import androidx.compose.material3.MenuAnchorType;
import androidx.compose.material3.internal.AccessibilityServiceStateProvider_androidKt;
import androidx.compose.material3.tokens.FilledAutocompleteTokens;
import androidx.compose.material3.tokens.OutlinedAutocompleteTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000bJ\u001f\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000eJ\u0082\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u0084\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0098\u0003\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0082\u0002\u0010I\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010,J\u0084\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010=J\u0098\u0003\u0010I\u001a\u00020\u00102\b\b\u0002\u0010-\u001a\u00020\u00122\b\b\u0002\u0010.\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010/\u001a\u00020\u00122\b\b\u0002\u0010>\u001a\u00020\u00122\b\b\u0002\u0010?\u001a\u00020\u00122\b\b\u0002\u0010@\u001a\u00020\u00122\b\b\u0002\u00100\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010J\u001a\u00020\u00122\b\b\u0002\u0010K\u001a\u00020\u00122\b\b\u0002\u0010L\u001a\u00020\u00122\b\b\u0002\u0010M\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u00122\b\b\u0002\u0010 \u001a\u00020\u00122\b\b\u0002\u0010!\u001a\u00020\u00122\b\b\u0002\u0010\"\u001a\u00020\u00122\b\b\u0002\u0010#\u001a\u00020\u00122\b\b\u0002\u0010$\u001a\u00020\u00122\b\b\u0002\u0010%\u001a\u00020\u00122\b\b\u0002\u0010&\u001a\u00020\u00122\b\b\u0002\u0010'\u001a\u00020\u00122\b\b\u0002\u0010(\u001a\u00020\u00122\b\b\u0002\u00101\u001a\u00020\u00122\b\b\u0002\u00102\u001a\u00020\u00122\b\b\u0002\u0010*\u001a\u00020\u00122\b\b\u0002\u00103\u001a\u00020\u00122\b\b\u0002\u00104\u001a\u00020\u00122\b\b\u0002\u00105\u001a\u00020\u00122\b\b\u0002\u00106\u001a\u00020\u00122\b\b\u0002\u00107\u001a\u00020\u00122\b\b\u0002\u00108\u001a\u00020\u00122\b\b\u0002\u00109\u001a\u00020\u00122\b\b\u0002\u0010:\u001a\u00020\u00122\b\b\u0002\u0010;\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\bP\u0010BR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Q²\u0006\n\u0010R\u001a\u00020\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/material3/ExposedDropdownMenuDefaults;", "", "()V", "ItemContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getItemContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "TrailingIcon", "", "expanded", "", "(ZLandroidx/compose/runtime/Composer;I)V", "modifier", "Landroidx/compose/ui/Modifier;", "(ZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "outlinedTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "textColor", "Landroidx/compose/ui/graphics/Color;", "disabledTextColor", "containerColor", "cursorColor", "errorCursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedBorderColor", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "placeholderColor", "disabledPlaceholderColor", "outlinedTextFieldColors-St-qZLY", "(JJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIII)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "errorTextColor", "errorContainerColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "errorPlaceholderColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "outlinedTextFieldColors-tN0la-I", "(JJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "outlinedTextFieldColors-FD9MK7s", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;IIIIII)Landroidx/compose/material3/TextFieldColors;", "popupProperties", "Landroidx/compose/ui/window/PopupProperties;", "anchorType", "Landroidx/compose/material3/MenuAnchorType;", "popupProperties-pR6Bxps$material3_release", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/window/PopupProperties;", "textFieldColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "textFieldColors-St-qZLY", "textFieldColors-tN0la-I", "textFieldColors-FD9MK7s", "material3_release", "a11yServicesEnabled"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();
    private static final PaddingValues ItemContentPadding = PaddingKt.m636PaddingValuesYgX7TsA(ExposedDropdownMenu_androidKt.ExposedDropdownMenuItemHorizontalPadding, Dp.m6233constructorimpl(0));

    private ExposedDropdownMenuDefaults() {
    }

    private static final boolean popupProperties_pR6Bxps$lambda$0(State<Boolean> state) {
        return state.getValue().booleanValue();
    }

    public final void TrailingIcon(final boolean z, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1987096744);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i4 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1987096744, i4, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:519)");
            }
            IconKt.m1783Iconww6aTOc(ArrowDropDownKt.getArrowDropDown(Icons.Filled.INSTANCE), (String) null, RotateKt.rotate(modifier, z ? 180.0f : 0.0f), 0L, composerStartRestartGroup, 48, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z, modifier2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public final PaddingValues getItemContentPadding() {
        return ItemContentPadding;
    }

    /* renamed from: outlinedTextFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1717outlinedTextFieldColorsFD9MK7s(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jM3791copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        int i8;
        long value;
        long jM3791copywmQWz5c$default2;
        int i9;
        long value2;
        long jM3791copywmQWz5c$default3;
        long j40;
        int i10;
        long value3;
        long jM3791copywmQWz5c$default4;
        long j41;
        int i11;
        long value4;
        long jM3791copywmQWz5c$default5;
        int i12;
        long value5;
        long jM3791copywmQWz5c$default6;
        int i13;
        long value6;
        long jM3791copywmQWz5c$default7;
        int i14;
        long value7;
        long jM3791copywmQWz5c$default8;
        long value8 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j2;
        long value9 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j3;
        if ((i6 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long value10 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j5;
        long jM3827getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j6;
        long jM3827getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j7;
        long jM3827getTransparent0d7_KjU3 = (i6 & 64) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j8;
        long jM3827getTransparent0d7_KjU4 = (i6 & 128) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j9;
        long value11 = (i6 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j10;
        long value12 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j11;
        TextSelectionColors textSelectionColors3 = (i6 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i6 & Fields.CameraDistance) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i8 = 6;
            value = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i8 = 6;
            value = j12;
        }
        long value13 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, i8) : j13;
        if ((i6 & 8192) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, i8), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j14;
        }
        long j42 = jM3791copywmQWz5c$default2;
        if ((i6 & Fields.Clip) != 0) {
            i9 = 6;
            value2 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6);
        } else {
            i9 = 6;
            value2 = j15;
        }
        long value14 = (32768 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i9) : j16;
        long value15 = (65536 & i6) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i9) : j17;
        if ((131072 & i6) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i9), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j18;
        }
        if ((i6 & 262144) != 0) {
            j40 = jM3791copywmQWz5c$default3;
            i10 = 6;
            value3 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j40 = jM3791copywmQWz5c$default3;
            i10 = 6;
            value3 = j19;
        }
        long value16 = (i6 & 524288) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i10) : j20;
        long value17 = (i6 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i10) : j21;
        if ((i6 & 2097152) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i10), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j22;
        }
        if ((i6 & 4194304) != 0) {
            j41 = jM3791copywmQWz5c$default4;
            i11 = 6;
            value4 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j41 = jM3791copywmQWz5c$default4;
            i11 = 6;
            value4 = j23;
        }
        long value18 = (i6 & 8388608) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i11) : j24;
        long value19 = (i6 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i11) : j25;
        if ((i6 & 33554432) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, i11), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j26;
        }
        if ((i6 & 67108864) != 0) {
            i12 = 6;
            value5 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6);
        } else {
            i12 = 6;
            value5 = j27;
        }
        long value20 = (i6 & 134217728) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j28;
        long value21 = (i6 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j29;
        if ((i6 & 536870912) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i12), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default6 = j30;
        }
        if ((i6 & 1073741824) != 0) {
            i13 = 6;
            value6 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i13 = 6;
            value6 = j31;
        }
        long value22 = (i7 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j32;
        long value23 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j33;
        if ((i7 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i13), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default7 = j34;
        }
        if ((i7 & 8) != 0) {
            i14 = 6;
            value7 = ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i14 = 6;
            value7 = j35;
        }
        long value24 = (i7 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i14) : j36;
        long value25 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i14) : j37;
        if ((i7 & 64) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default8 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, i14), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default8 = j38;
        }
        long value26 = (i7 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1567195085, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:805)");
        }
        int i15 = i5 << 12;
        int i16 = i5 >> 18;
        int i17 = (i16 & 14) | 3072 | (i16 & 112) | (i16 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        long j43 = j40;
        TextFieldColors textFieldColorsM1976colors0hiis_0 = OutlinedTextFieldDefaults.INSTANCE.m1976colors0hiis_0(value8, value9, jM3791copywmQWz5c$default, value10, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU2, jM3827getTransparent0d7_KjU3, jM3827getTransparent0d7_KjU4, value11, value12, textSelectionColors4, value, value13, j42, value2, value14, value15, j43, value3, value16, value17, j41, value4, value18, value19, jM3791copywmQWz5c$default5, value5, value20, value21, jM3791copywmQWz5c$default6, value6, 0L, 0L, 0L, 0L, value22, value23, jM3791copywmQWz5c$default7, value7, value24, value25, jM3791copywmQWz5c$default8, value26, composer, i2 & 2147483646, i3 & 2147483646, i4 & 2147483646, (i5 & 14) | (458752 & i15) | (3670016 & i15) | (29360128 & i15) | (234881024 & i15) | (i15 & 1879048192), i17, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM1976colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1718outlinedTextFieldColorsStqZLY(long j2, long j3, long j4, long j5, long j6, TextSelectionColors textSelectionColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Composer composer, int i2, int i3, int i4, int i5) {
        long jM3791copywmQWz5c$default;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long jM3791copywmQWz5c$default5;
        long jM3791copywmQWz5c$default6;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 2) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j3;
        }
        long jM3827getTransparent0d7_KjU = (i5 & 4) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j4;
        long value2 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j5;
        long value3 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j6;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j7;
        long value5 = (i5 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j8;
        if ((i5 & Fields.RotationX) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j9;
        }
        long value6 = (i5 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j10;
        long value7 = (i5 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j11;
        long value8 = (i5 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j12;
        if ((i5 & 4096) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j13;
        }
        long value9 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j14;
        long value10 = (i5 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j15;
        long value11 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j16;
        if ((65536 & i5) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j17;
        }
        long value12 = (131072 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j18;
        long value13 = (262144 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j19;
        long value14 = (524288 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j20;
        if ((1048576 & i5) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j21;
        }
        long value15 = (2097152 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j22;
        long value16 = (4194304 & i5) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j23;
        if ((i5 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default6 = j24;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-836383316, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1265)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
        long value17 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value18 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        long jM3791copywmQWz5c$default8 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldSupportingTextColor(), composer, 6);
        int i6 = i2 << 3;
        int i7 = (i2 & 14) | (i6 & 112) | (i6 & 896);
        int i8 = i2 << 9;
        int i9 = i7 | (i8 & 7168) | ((i2 << 6) & 57344) | (i8 & 458752) | ((i2 << 12) & 3670016);
        int i10 = i2 << 15;
        int i11 = i9 | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i3 << 15;
        int i13 = i4 << 15;
        int i14 = i4 << 18;
        int i15 = ((i3 >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = ((i4 >> 6) & 14) | (i13 & 1879048192);
        long j25 = value;
        TextFieldColors textFieldColorsM1717outlinedTextFieldColorsFD9MK7s = m1717outlinedTextFieldColorsFD9MK7s(j25, value, jM3791copywmQWz5c$default, j25, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU, value2, value3, textSelectionColors2, value4, value5, jM3791copywmQWz5c$default2, value6, value7, value8, jM3791copywmQWz5c$default3, value9, value10, value11, jM3791copywmQWz5c$default4, value12, value13, value14, jM3791copywmQWz5c$default5, value15, value16, value16, jM3791copywmQWz5c$default6, value16, value17, value18, jM3791copywmQWz5c$default7, value19, value20, value21, jM3791copywmQWz5c$default8, value22, composer, i11, ((i2 >> 15) & 65534) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), i15, i16, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM1717outlinedTextFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: outlinedTextFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1719outlinedTextFieldColorstN0laI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jM3791copywmQWz5c$default;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long jM3791copywmQWz5c$default5;
        long jM3791copywmQWz5c$default6;
        long jM3791copywmQWz5c$default7;
        long jM3791copywmQWz5c$default8;
        long value = (i6 & 1) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j2;
        long value2 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j3;
        if ((i6 & 4) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long value3 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j5;
        long jM3827getTransparent0d7_KjU = (i6 & 16) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j6;
        long jM3827getTransparent0d7_KjU2 = (i6 & 32) != 0 ? Color.INSTANCE.m3827getTransparent0d7_KjU() : j7;
        long value4 = (i6 & 64) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j8;
        long value5 = (i6 & 128) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i6 & Fields.RotationX) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value6 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusOutlineColor(), composer, 6) : j10;
        long value7 = (i6 & 1024) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldOutlineColor(), composer, 6) : j11;
        if ((i6 & Fields.CameraDistance) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens2 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens2.getTextFieldDisabledOutlineColor(), composer, 6), outlinedAutocompleteTokens2.getTextFieldDisabledOutlineOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j12;
        }
        long value8 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorOutlineColor(), composer, 6) : j13;
        long value9 = (i6 & 8192) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j14;
        long value10 = (i6 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j15;
        if ((32768 & i6) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens3 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), outlinedAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j16;
        }
        long value11 = (i6 & 65536) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j17;
        long value12 = (i6 & Fields.RenderEffect) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j18;
        long value13 = (i6 & 262144) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j19;
        if ((i6 & 524288) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens4 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), outlinedAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j20;
        }
        long value14 = (i6 & 1048576) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j21;
        long value15 = (i6 & 2097152) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j22;
        long value16 = (i6 & 4194304) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j23;
        if ((i6 & 8388608) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens5 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens5.getFieldDisabledLabelTextColor(), composer, 6), outlinedAutocompleteTokens5.getFieldDisabledLabelTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j24;
        }
        long value17 = (i6 & 16777216) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j25;
        long value18 = (i6 & 33554432) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        long value19 = (i6 & 67108864) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j27;
        if ((i6 & 134217728) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens6 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default6 = j28;
        }
        long value20 = (i6 & 268435456) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value21 = (i6 & 536870912) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        long value22 = (i6 & 1073741824) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i7 & 1) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens7 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default7 = j32;
        }
        long value23 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value24 = (i7 & 4) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value25 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i7 & 16) != 0) {
            OutlinedAutocompleteTokens outlinedAutocompleteTokens8 = OutlinedAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default8 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens8.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens8.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default8 = j36;
        }
        long value26 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(OutlinedAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-388128543, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.android.kt:1072)");
        }
        int i8 = i2 << 6;
        int i9 = (65534 & i2) | ((i2 << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192);
        int i10 = i3 << 6;
        int i11 = ((i2 >> 24) & 126) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i4 << 6;
        int i13 = i5 << 6;
        TextFieldColors textFieldColorsM1717outlinedTextFieldColorsFD9MK7s = m1717outlinedTextFieldColorsFD9MK7s(value, value2, jM3791copywmQWz5c$default, value3, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU, jM3827getTransparent0d7_KjU2, value4, value5, textSelectionColors2, value6, value7, jM3791copywmQWz5c$default2, value8, value9, value10, jM3791copywmQWz5c$default3, value11, value12, value13, jM3791copywmQWz5c$default4, value14, value15, value16, jM3791copywmQWz5c$default5, value17, value18, value19, jM3791copywmQWz5c$default6, value20, value21, value22, jM3791copywmQWz5c$default7, value23, value24, value25, jM3791copywmQWz5c$default8, value26, composer, i9, i11, ((i3 >> 24) & 126) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 896) | ((i4 >> 24) & 126) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM1717outlinedTextFieldColorsFD9MK7s;
    }

    /* renamed from: popupProperties-pR6Bxps$material3_release, reason: not valid java name */
    public final PopupProperties m1720popupPropertiespR6Bxps$material3_release(String str, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1724259382, i2, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.popupProperties (ExposedDropdownMenu.android.kt:860)");
        }
        State<Boolean> stateRememberAccessibilityServiceState = AccessibilityServiceStateProvider_androidKt.rememberAccessibilityServiceState(false, false, composer, 0, 3);
        int i3 = !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState) ? 393248 : 393216;
        MenuAnchorType.Companion companion = MenuAnchorType.INSTANCE;
        if (MenuAnchorType.m1853equalsimpl0(str, companion.m1857getPrimaryEditableMg6Rgbw()) || (MenuAnchorType.m1853equalsimpl0(str, companion.m1859getSecondaryEditableMg6Rgbw()) && !popupProperties_pR6Bxps$lambda$0(stateRememberAccessibilityServiceState))) {
            i3 |= 8;
        }
        PopupProperties popupProperties = new PopupProperties(i3, false, false, false, false, false, 62, (DefaultConstructorMarker) null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return popupProperties;
    }

    /* renamed from: textFieldColors-FD9MK7s, reason: not valid java name */
    public final TextFieldColors m1721textFieldColorsFD9MK7s(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, TextSelectionColors textSelectionColors, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jM3791copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        int i8;
        long value;
        long jM3791copywmQWz5c$default2;
        int i9;
        long value2;
        long jM3791copywmQWz5c$default3;
        long j40;
        int i10;
        long value3;
        long jM3791copywmQWz5c$default4;
        long j41;
        int i11;
        long value4;
        long jM3791copywmQWz5c$default5;
        int i12;
        long value5;
        long jM3791copywmQWz5c$default6;
        int i13;
        long value6;
        long jM3791copywmQWz5c$default7;
        long value7 = (i6 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j2;
        long value8 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j3;
        if ((i6 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long value9 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j5;
        long value10 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j6;
        long value11 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j7;
        long value12 = (i6 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j8;
        long value13 = (i6 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j9;
        long value14 = (i6 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j10;
        long value15 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j11;
        TextSelectionColors textSelectionColors3 = (i6 & 1024) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        if ((i6 & Fields.CameraDistance) != 0) {
            textSelectionColors2 = textSelectionColors3;
            i8 = 6;
            value = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6);
        } else {
            textSelectionColors2 = textSelectionColors3;
            i8 = 6;
            value = j12;
        }
        long value16 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, i8) : j13;
        if ((i6 & 8192) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, i8), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j14;
        }
        long j42 = jM3791copywmQWz5c$default2;
        if ((i6 & Fields.Clip) != 0) {
            i9 = 6;
            value2 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6);
        } else {
            i9 = 6;
            value2 = j15;
        }
        long value17 = (32768 & i6) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, i9) : j16;
        long value18 = (65536 & i6) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, i9) : j17;
        if ((131072 & i6) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, i9), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j18;
        }
        if ((i6 & 262144) != 0) {
            j40 = jM3791copywmQWz5c$default3;
            i10 = 6;
            value3 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6);
        } else {
            j40 = jM3791copywmQWz5c$default3;
            i10 = 6;
            value3 = j19;
        }
        long value19 = (i6 & 524288) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, i10) : j20;
        long value20 = (i6 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, i10) : j21;
        if ((i6 & 2097152) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, i10), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j22;
        }
        if ((i6 & 4194304) != 0) {
            j41 = jM3791copywmQWz5c$default4;
            i11 = 6;
            value4 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6);
        } else {
            j41 = jM3791copywmQWz5c$default4;
            i11 = 6;
            value4 = j23;
        }
        long value21 = (i6 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, i11) : j24;
        long value22 = (i6 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, i11) : j25;
        long value23 = (i6 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, i11) : j26;
        long value24 = (i6 & 67108864) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, i11) : j27;
        long value25 = (i6 & 134217728) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j28;
        long value26 = (i6 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i11) : j29;
        if ((i6 & 536870912) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, i11), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j30;
        }
        if ((i6 & 1073741824) != 0) {
            i12 = 6;
            value5 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i12 = 6;
            value5 = j31;
        }
        long value27 = (i7 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j32;
        long value28 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i12) : j33;
        if ((i7 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, i12), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default6 = j34;
        }
        if ((i7 & 8) != 0) {
            i13 = 6;
            value6 = ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6);
        } else {
            i13 = 6;
            value6 = j35;
        }
        long value29 = (i7 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j36;
        long value30 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, i13) : j37;
        if ((i7 & 64) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, i13), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default7 = j38;
        }
        long value31 = (i7 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j39;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(768358577, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:642)");
        }
        int i14 = i5 << 12;
        int i15 = i5 >> 18;
        int i16 = (i15 & 14) | 3072 | (i15 & 112) | (i15 & 896);
        TextSelectionColors textSelectionColors4 = textSelectionColors2;
        long j43 = j40;
        TextFieldColors textFieldColorsM2307colors0hiis_0 = TextFieldDefaults.INSTANCE.m2307colors0hiis_0(value7, value8, jM3791copywmQWz5c$default, value9, value10, value11, value12, value13, value14, value15, textSelectionColors4, value, value16, j42, value2, value17, value18, j43, value3, value19, value20, j41, value4, value21, value22, value23, value24, value25, value26, jM3791copywmQWz5c$default5, value5, 0L, 0L, 0L, 0L, value27, value28, jM3791copywmQWz5c$default6, value6, value29, value30, jM3791copywmQWz5c$default7, value31, composer, i2 & 2147483646, i3 & 2147483646, i4 & 2147483646, (i5 & 14) | (458752 & i14) | (3670016 & i14) | (29360128 & i14) | (234881024 & i14) | (i14 & 1879048192), i16, 0, 15);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2307colors0hiis_0;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-St-qZLY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1722textFieldColorsStqZLY(long j2, long j3, long j4, long j5, long j6, TextSelectionColors textSelectionColors, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, Composer composer, int i2, int i3, int i4, int i5) {
        long jM3791copywmQWz5c$default;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long jM3791copywmQWz5c$default5;
        long value = (i5 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j2;
        if ((i5 & 2) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j3;
        }
        long value2 = (i5 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j4;
        long value3 = (i5 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j5;
        long value4 = (i5 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j6;
        TextSelectionColors textSelectionColors2 = (i5 & 32) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value5 = (i5 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j7;
        long value6 = (i5 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j8;
        if ((i5 & Fields.RotationX) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j9;
        }
        long value7 = (i5 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j10;
        long value8 = (i5 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j11;
        long value9 = (i5 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j12;
        if ((i5 & 4096) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j13;
        }
        long value10 = (i5 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j14;
        long value11 = (i5 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j15;
        long value12 = (32768 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j16;
        if ((65536 & i5) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j17;
        }
        long value13 = (131072 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j18;
        long value14 = (262144 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j19;
        long value15 = (524288 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j20;
        long value16 = (1048576 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j21;
        long value17 = (2097152 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j22;
        long value18 = (4194304 & i5) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j23;
        if ((i5 & 8388608) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j24;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1343678550, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:1165)");
        }
        OutlinedAutocompleteTokens outlinedAutocompleteTokens = OutlinedAutocompleteTokens.INSTANCE;
        long value19 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value20 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value21 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value22 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long value23 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        long jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldDisabledSupportingTextColor(), composer, 6), outlinedAutocompleteTokens.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        long value24 = ColorSchemeKt.getValue(outlinedAutocompleteTokens.getFieldSupportingTextColor(), composer, 6);
        int i6 = i2 << 3;
        int i7 = (i2 & 14) | (i6 & 112) | (i6 & 896);
        int i8 = i2 << 9;
        int i9 = i7 | (i8 & 7168) | ((i2 << 6) & 57344) | (i8 & 458752) | ((i2 << 12) & 3670016);
        int i10 = i2 << 15;
        int i11 = i9 | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i3 << 15;
        int i13 = i4 << 15;
        int i14 = i4 << 18;
        int i15 = ((i3 >> 15) & 65534) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i14 & 234881024) | (i14 & 1879048192);
        int i16 = ((i4 >> 6) & 14) | (i13 & 1879048192);
        long j25 = value;
        TextFieldColors textFieldColorsM1721textFieldColorsFD9MK7s = m1721textFieldColorsFD9MK7s(j25, value, jM3791copywmQWz5c$default, j25, value2, value2, value2, value2, value3, value4, textSelectionColors2, value5, value6, jM3791copywmQWz5c$default2, value7, value8, value9, jM3791copywmQWz5c$default3, value10, value11, value12, jM3791copywmQWz5c$default4, value13, value14, value15, value16, value17, value18, value18, jM3791copywmQWz5c$default5, value18, value19, value20, jM3791copywmQWz5c$default6, value21, value22, value23, jM3791copywmQWz5c$default7, value24, composer, i11, ((i2 >> 15) & 65534) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), i15, i16, 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM1721textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: textFieldColors-tN0la-I, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m1723textFieldColorstN0laI(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, TextSelectionColors textSelectionColors, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, Composer composer, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jM3791copywmQWz5c$default;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long jM3791copywmQWz5c$default5;
        long jM3791copywmQWz5c$default6;
        long jM3791copywmQWz5c$default7;
        long value = (i6 & 1) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusInputTextColor(), composer, 6) : j2;
        long value2 = (i6 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldInputTextColor(), composer, 6) : j3;
        if ((i6 & 4) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens.getFieldDisabledInputTextColor(), composer, 6), filledAutocompleteTokens.getFieldDisabledInputTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long value3 = (i6 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorInputTextColor(), composer, 6) : j5;
        long value4 = (i6 & 16) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j6;
        long value5 = (i6 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldContainerColor(), composer, 6) : j7;
        long value6 = (i6 & 64) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldCaretColor(), composer, 6) : j8;
        long value7 = (i6 & 128) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorFocusCaretColor(), composer, 6) : j9;
        TextSelectionColors textSelectionColors2 = (i6 & Fields.RotationX) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value8 = (i6 & 512) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusActiveIndicatorColor(), composer, 6) : j10;
        long value9 = (i6 & 1024) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldActiveIndicatorColor(), composer, 6) : j11;
        if ((i6 & Fields.CameraDistance) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens2 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorColor(), composer, 6), filledAutocompleteTokens2.getTextFieldDisabledActiveIndicatorOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j12;
        }
        long value10 = (i6 & 4096) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorActiveIndicatorColor(), composer, 6) : j13;
        long value11 = (i6 & 8192) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusLeadingIconColor(), composer, 6) : j14;
        long value12 = (i6 & Fields.Clip) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldLeadingIconColor(), composer, 6) : j15;
        if ((32768 & i6) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens3 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens3.getTextFieldDisabledLeadingIconColor(), composer, 6), filledAutocompleteTokens3.getTextFieldDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j16;
        }
        long value13 = (i6 & 65536) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorLeadingIconColor(), composer, 6) : j17;
        long value14 = (i6 & Fields.RenderEffect) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldFocusTrailingIconColor(), composer, 6) : j18;
        long value15 = (i6 & 262144) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldTrailingIconColor(), composer, 6) : j19;
        if ((i6 & 524288) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens4 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens4.getTextFieldDisabledTrailingIconColor(), composer, 6), filledAutocompleteTokens4.getTextFieldDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j20;
        }
        long value16 = (i6 & 1048576) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getTextFieldErrorTrailingIconColor(), composer, 6) : j21;
        long value17 = (i6 & 2097152) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldFocusLabelTextColor(), composer, 6) : j22;
        long value18 = (i6 & 4194304) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldLabelTextColor(), composer, 6) : j23;
        long value19 = (i6 & 8388608) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldDisabledLabelTextColor(), composer, 6) : j24;
        long value20 = (i6 & 16777216) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldErrorLabelTextColor(), composer, 6) : j25;
        long value21 = (i6 & 33554432) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j26;
        long value22 = (i6 & 67108864) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j27;
        if ((i6 & 134217728) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens5 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default5 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens5.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens5.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default5 = j28;
        }
        long value23 = (i6 & 268435456) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j29;
        long value24 = (i6 & 536870912) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j30;
        long value25 = (i6 & 1073741824) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j31;
        if ((i7 & 1) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens6 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default6 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens6.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens6.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default6 = j32;
        }
        long value26 = (i7 & 2) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j33;
        long value27 = (i7 & 4) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j34;
        long value28 = (i7 & 8) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j35;
        if ((i7 & 16) != 0) {
            FilledAutocompleteTokens filledAutocompleteTokens7 = FilledAutocompleteTokens.INSTANCE;
            jM3791copywmQWz5c$default7 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledAutocompleteTokens7.getFieldDisabledSupportingTextColor(), composer, 6), filledAutocompleteTokens7.getFieldDisabledSupportingTextOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default7 = j36;
        }
        long value29 = (i7 & 32) != 0 ? ColorSchemeKt.getValue(FilledAutocompleteTokens.INSTANCE.getFieldSupportingTextColor(), composer, 6) : j37;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(611690079, i2, i3, "androidx.compose.material3.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.android.kt:958)");
        }
        int i8 = i2 << 6;
        int i9 = (65534 & i2) | ((i2 << 3) & 458752) | (i8 & 3670016) | (i8 & 29360128) | (i8 & 234881024) | (i8 & 1879048192);
        int i10 = i3 << 6;
        int i11 = ((i2 >> 24) & 126) | (i10 & 896) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752) | (i10 & 3670016) | (i10 & 29360128) | (i10 & 234881024) | (i10 & 1879048192);
        int i12 = i4 << 6;
        int i13 = i5 << 6;
        TextFieldColors textFieldColorsM1721textFieldColorsFD9MK7s = m1721textFieldColorsFD9MK7s(value, value2, jM3791copywmQWz5c$default, value3, value4, value4, value4, value5, value6, value7, textSelectionColors2, value8, value9, jM3791copywmQWz5c$default2, value10, value11, value12, jM3791copywmQWz5c$default3, value13, value14, value15, jM3791copywmQWz5c$default4, value16, value17, value18, value19, value20, value21, value22, jM3791copywmQWz5c$default5, value23, value24, value25, jM3791copywmQWz5c$default6, value26, value27, value28, jM3791copywmQWz5c$default7, value29, composer, i9, i11, ((i3 >> 24) & 126) | (i12 & 896) | (i12 & 7168) | (i12 & 57344) | (i12 & 458752) | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i13 & 896) | ((i4 >> 24) & 126) | (i13 & 7168) | (i13 & 57344) | (i13 & 458752) | (i13 & 3670016) | (i13 & 29360128) | (i13 & 234881024) | (i13 & 1879048192), 0, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM1721textFieldColorsFD9MK7s;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    public final /* synthetic */ void TrailingIcon(boolean z, Composer composer, final int i2) {
        int i3;
        final boolean z2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-473088613);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(this) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-473088613, i3, -1, "androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.android.kt:886)");
            }
            z2 = z;
            TrailingIcon(z2, Modifier.INSTANCE, composerStartRestartGroup, (i3 & 14) | 48 | ((i3 << 3) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ExposedDropdownMenuDefaults.TrailingIcon.2
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
                    ExposedDropdownMenuDefaults.this.TrailingIcon(z2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }
}
