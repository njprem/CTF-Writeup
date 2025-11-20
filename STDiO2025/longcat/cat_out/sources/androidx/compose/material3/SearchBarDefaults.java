package androidx.compose.material3;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColorsKt;
import androidx.compose.material3.tokens.ElevationTokens;
import androidx.compose.material3.tokens.FilledTextFieldTokens;
import androidx.compose.material3.tokens.SearchBarTokens;
import androidx.compose.material3.tokens.SearchViewTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.Shape;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JÈ\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001c0 2\u0006\u0010\"\u001a\u00020#2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u001c0 2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010'\u001a\u00020#2\u0015\b\u0002\u0010(\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010+\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\u0015\b\u0002\u0010,\u001a\u000f\u0012\u0004\u0012\u00020\u001c\u0018\u00010)¢\u0006\u0002\b*2\b\b\u0002\u0010-\u001a\u00020.2\n\b\u0002\u0010/\u001a\u0004\u0018\u000100H\u0007¢\u0006\u0002\u00101J&\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\b6\u00107J0\u0010-\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00108\u001a\u00020.H\u0007ø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u008a\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010;\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010F\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u009e\u0001\u00108\u001a\u00020.2\b\b\u0002\u0010J\u001a\u0002042\b\b\u0002\u0010K\u001a\u0002042\b\b\u0002\u0010<\u001a\u0002042\b\b\u0002\u0010=\u001a\u0002042\b\b\u0002\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u0002042\b\b\u0002\u0010A\u001a\u0002042\b\b\u0002\u0010B\u001a\u0002042\b\b\u0002\u0010C\u001a\u0002042\b\b\u0002\u0010D\u001a\u0002042\b\b\u0002\u0010E\u001a\u0002042\b\b\u0002\u0010L\u001a\u0002042\b\b\u0002\u0010M\u001a\u0002042\b\b\u0002\u0010G\u001a\u000204H\u0007ø\u0001\u0000¢\u0006\u0004\bN\u0010OR$\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\f\u0010\u0007R\u0019\u0010\r\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u000e\u0010\u0007R\u0011\u0010\u000f\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u0017\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006P"}, d2 = {"Landroidx/compose/material3/SearchBarDefaults;", "", "()V", "Elevation", "Landroidx/compose/ui/unit/Dp;", "getElevation-D9Ej5fM$annotations", "getElevation-D9Ej5fM", "()F", "F", "InputFieldHeight", "getInputFieldHeight-D9Ej5fM", "ShadowElevation", "getShadowElevation-D9Ej5fM", "TonalElevation", "getTonalElevation-D9Ej5fM", "dockedShape", "Landroidx/compose/ui/graphics/Shape;", "getDockedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "fullScreenShape", "getFullScreenShape", "inputFieldShape", "getInputFieldShape", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "InputField", "", "query", "", "onQueryChange", "Lkotlin/Function1;", "onSearch", "expanded", "", "onExpandedChange", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "placeholder", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "leadingIcon", "trailingIcon", "colors", "Landroidx/compose/material3/TextFieldColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/TextFieldColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/material3/SearchBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "dividerColor", "colors-dgg9oW8", "(JJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "inputFieldColors", "colors-Klgx-Pg", "(JJLandroidx/compose/material3/TextFieldColors;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SearchBarColors;", "textColor", "disabledTextColor", "cursorColor", "selectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "placeholderColor", "disabledPlaceholderColor", "inputFieldColors--u-KgnY", "(JJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "focusedTextColor", "unfocusedTextColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "inputFieldColors-ITpI4ow", "(JJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/TextFieldColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchBarDefaults {
    public static final int $stable = 0;
    private static final float Elevation;
    public static final SearchBarDefaults INSTANCE = new SearchBarDefaults();
    private static final float InputFieldHeight;
    private static final float ShadowElevation;
    private static final float TonalElevation;

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        float fM2805getLevel0D9Ej5fM = elevationTokens.m2805getLevel0D9Ej5fM();
        TonalElevation = fM2805getLevel0D9Ej5fM;
        ShadowElevation = elevationTokens.m2805getLevel0D9Ej5fM();
        Elevation = fM2805getLevel0D9Ej5fM;
        InputFieldHeight = SearchBarTokens.INSTANCE.m3106getContainerHeightD9Ej5fM();
    }

    private SearchBarDefaults() {
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Renamed to TonalElevation. Not to be confused with ShadowElevation.", replaceWith = @ReplaceWith(expression = "TonalElevation", imports = {}))
    /* renamed from: getElevation-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m2047getElevationD9Ej5fM$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void InputField(final java.lang.String r85, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r86, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> r87, final boolean r88, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r89, androidx.compose.ui.Modifier r90, boolean r91, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r92, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r93, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r94, androidx.compose.material3.TextFieldColors r95, androidx.compose.foundation.interaction.MutableInteractionSource r96, androidx.compose.runtime.Composer r97, final int r98, final int r99, final int r100) {
        /*
            Method dump skipped, instructions count: 1264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SearchBarDefaults.InputField(java.lang.String, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.TextFieldColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int, int):void");
    }

    @Deprecated(message = "Search bars now take the input field as a parameter. `inputFieldColors` should be passed explicitly to the input field. This parameter will be removed in a future version of the library.", replaceWith = @ReplaceWith(expression = "colors(containerColor, dividerColor)", imports = {}))
    /* renamed from: colors-Klgx-Pg, reason: not valid java name */
    public final SearchBarColors m2048colorsKlgxPg(long j2, long j3, TextFieldColors textFieldColors, Composer composer, int i2, int i3) {
        int i4;
        TextFieldColors textFieldColorsM2055inputFieldColorsITpI4ow;
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j3;
        if ((i3 & 4) != 0) {
            i4 = i2;
            textFieldColorsM2055inputFieldColorsITpI4ow = m2055inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i2 << 3) & 57344, 16383);
        } else {
            i4 = i2;
            textFieldColorsM2055inputFieldColorsITpI4ow = textFieldColors;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1216168196, i4, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:590)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, textFieldColorsM2055inputFieldColorsITpI4ow, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    /* renamed from: colors-dgg9oW8, reason: not valid java name */
    public final SearchBarColors m2049colorsdgg9oW8(long j2, long j3, Composer composer, int i2, int i3) {
        long value = (i3 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getContainerColor(), composer, 6) : j2;
        long value2 = (i3 & 2) != 0 ? ColorSchemeKt.getValue(SearchViewTokens.INSTANCE.getDividerColor(), composer, 6) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1507037523, i2, -1, "androidx.compose.material3.SearchBarDefaults.colors (SearchBar.android.kt:378)");
        }
        SearchBarColors searchBarColors = new SearchBarColors(value, value2, m2055inputFieldColorsITpI4ow(0L, 0L, 0L, 0L, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, 0, (i2 << 6) & 57344, 16383), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return searchBarColors;
    }

    public final Shape getDockedShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1006952150, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-dockedShape> (SearchBar.android.kt:357)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m2050getElevationD9Ej5fM() {
        return Elevation;
    }

    public final Shape getFullScreenShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665502056, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-fullScreenShape> (SearchBar.android.kt:353)");
        }
        Shape value = ShapesKt.getValue(SearchViewTokens.INSTANCE.getFullScreenContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getInputFieldHeight-D9Ej5fM, reason: not valid java name */
    public final float m2051getInputFieldHeightD9Ej5fM() {
        return InputFieldHeight;
    }

    public final Shape getInputFieldShape(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-971556142, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-inputFieldShape> (SearchBar.android.kt:349)");
        }
        Shape value = ShapesKt.getValue(SearchBarTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return value;
    }

    /* renamed from: getShadowElevation-D9Ej5fM, reason: not valid java name */
    public final float m2052getShadowElevationD9Ej5fM() {
        return ShadowElevation;
    }

    /* renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m2053getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    public final WindowInsets getWindowInsets(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2112270157, i2, -1, "androidx.compose.material3.SearchBarDefaults.<get-windowInsets> (SearchBar.android.kt:361)");
        }
        WindowInsets statusBars = WindowInsets_androidKt.getStatusBars(WindowInsets.INSTANCE, composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return statusBars;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility")
    /* renamed from: inputFieldColors--u-KgnY, reason: not valid java name */
    public final /* synthetic */ TextFieldColors m2054inputFieldColorsuKgnY(long j2, long j3, long j4, TextSelectionColors textSelectionColors, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, Composer composer, int i2, int i3, int i4) {
        long jM3791copywmQWz5c$default;
        TextSelectionColors textSelectionColors2;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        if ((i4 & 2) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j3;
        }
        long value2 = (i4 & 4) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j4;
        TextSelectionColors textSelectionColors3 = (i4 & 8) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value3 = (i4 & 16) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j5;
        long value4 = (i4 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        if ((i4 & 64) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            textSelectionColors2 = textSelectionColors3;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            textSelectionColors2 = textSelectionColors3;
            jM3791copywmQWz5c$default2 = j7;
        }
        long value5 = (i4 & 128) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j8;
        long value6 = (i4 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        if ((i4 & 512) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j10;
        }
        long value7 = (i4 & 1024) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j11;
        if ((i4 & Fields.CameraDistance) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j12;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(355927049, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:624)");
        }
        int i5 = i2 << 3;
        int i6 = i3 << 6;
        int i7 = ((i2 >> 27) & 14) | ((i3 << 3) & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344);
        long j13 = value7;
        TextFieldColors textFieldColorsM2055inputFieldColorsITpI4ow = m2055inputFieldColorsITpI4ow(value, value, jM3791copywmQWz5c$default, value2, textSelectionColors2, value3, value4, jM3791copywmQWz5c$default2, value5, value6, jM3791copywmQWz5c$default3, j13, j13, jM3791copywmQWz5c$default4, composer, (i2 & 14) | (i5 & 112) | (i5 & 896) | (i5 & 7168) | (i5 & 57344) | (i5 & 458752) | (i5 & 3670016) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192), i7, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2055inputFieldColorsITpI4ow;
    }

    /* renamed from: inputFieldColors-ITpI4ow, reason: not valid java name */
    public final TextFieldColors m2055inputFieldColorsITpI4ow(long j2, long j3, long j4, long j5, TextSelectionColors textSelectionColors, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, Composer composer, int i2, int i3, int i4) {
        long jM3791copywmQWz5c$default;
        long jM3791copywmQWz5c$default2;
        long jM3791copywmQWz5c$default3;
        long jM3791copywmQWz5c$default4;
        long value = (i4 & 1) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j2;
        long value2 = (i4 & 2) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getInputTextColor(), composer, 6) : j3;
        if ((i4 & 4) != 0) {
            FilledTextFieldTokens filledTextFieldTokens = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens.getDisabledInputColor(), composer, 6), filledTextFieldTokens.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default = j4;
        }
        long value3 = (i4 & 8) != 0 ? ColorSchemeKt.getValue(FilledTextFieldTokens.INSTANCE.getCaretColor(), composer, 6) : j5;
        TextSelectionColors textSelectionColors2 = (i4 & 16) != 0 ? (TextSelectionColors) composer.consume(TextSelectionColorsKt.getLocalTextSelectionColors()) : textSelectionColors;
        long value4 = (i4 & 32) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j6;
        long value5 = (i4 & 64) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j7;
        if ((i4 & 128) != 0) {
            FilledTextFieldTokens filledTextFieldTokens2 = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default2 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens2.getDisabledLeadingIconColor(), composer, 6), filledTextFieldTokens2.getDisabledLeadingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default2 = j8;
        }
        long value6 = (i4 & Fields.RotationX) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j9;
        long value7 = (i4 & 512) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j10;
        if ((i4 & 1024) != 0) {
            FilledTextFieldTokens filledTextFieldTokens3 = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default3 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens3.getDisabledTrailingIconColor(), composer, 6), filledTextFieldTokens3.getDisabledTrailingIconOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default3 = j11;
        }
        long value8 = (i4 & Fields.CameraDistance) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j12;
        long value9 = (i4 & 4096) != 0 ? ColorSchemeKt.getValue(SearchBarTokens.INSTANCE.getSupportingTextColor(), composer, 6) : j13;
        if ((i4 & 8192) != 0) {
            FilledTextFieldTokens filledTextFieldTokens4 = FilledTextFieldTokens.INSTANCE;
            jM3791copywmQWz5c$default4 = Color.m3791copywmQWz5c$default(ColorSchemeKt.getValue(filledTextFieldTokens4.getDisabledInputColor(), composer, 6), filledTextFieldTokens4.getDisabledInputOpacity(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            jM3791copywmQWz5c$default4 = j14;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-602148837, i2, i3, "androidx.compose.material3.SearchBarDefaults.inputFieldColors (SearchBar.android.kt:437)");
        }
        int i5 = i3 << 18;
        int i6 = ((i2 >> 27) & 14) | ((i3 << 3) & 112) | (i5 & 29360128) | (i5 & 234881024) | (i5 & 1879048192);
        TextFieldColors textFieldColorsM2307colors0hiis_0 = TextFieldDefaults.INSTANCE.m2307colors0hiis_0(value, value2, jM3791copywmQWz5c$default, 0L, 0L, 0L, 0L, 0L, value3, 0L, textSelectionColors2, 0L, 0L, 0L, 0L, value4, value5, jM3791copywmQWz5c$default2, 0L, value6, value7, jM3791copywmQWz5c$default3, 0L, 0L, 0L, 0L, 0L, value8, value9, jM3791copywmQWz5c$default4, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composer, (i2 & 1022) | ((i2 << 15) & 234881024), ((i2 >> 12) & 14) | (458752 & i2) | (3670016 & i2) | (i2 & 29360128) | ((i2 << 3) & 1879048192), i6, 0, 3072, 1204058872, 4095);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textFieldColorsM2307colors0hiis_0;
    }
}
