package androidx.compose.foundation.contextmenu;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.compose.ui.window.PopupProperties;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a=\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0012¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010\u0014\u001ai\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u000e2*\b\u0002\u0010\u001a\u001a$\u0012\u0013\u0012\u00110\u001b¢\u0006\f\b\u001c\u0012\b\b\u001d\u0012\u0004\b\b(\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0010¢\u0006\u0002\b\u00122\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0 H\u0001¢\u0006\u0002\u0010!\u001aN\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00012\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010(\u001aF\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000b0 2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010&\u001a\u0013\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u000b0\u0010¢\u0006\u0002\b\u0013H\u0001¢\u0006\u0002\u0010)\u001a!\u0010*\u001a\u00020\u00012\b\b\u0003\u0010+\u001a\u00020,2\b\b\u0003\u0010-\u001a\u00020,H\u0001¢\u0006\u0002\u0010.\u001a \u0010/\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\u001a \u00104\u001a\u00020\u001b*\u0004\u0018\u0001002\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b5\u00103\u001a2\u00106\u001a\u00020\u001b*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,2\u0006\u00101\u001a\u00020\u001bH\u0002ø\u0001\u0000¢\u0006\u0004\b:\u0010;\u001a\"\u0010<\u001a\u0004\u0018\u000100*\u0002072\b\b\u0001\u00108\u001a\u00020,2\b\b\u0001\u00109\u001a\u00020,H\u0002\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"DefaultContextMenuColors", "Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "getDefaultContextMenuColors$annotations", "()V", "getDefaultContextMenuColors", "()Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "DefaultPopupProperties", "Landroidx/compose/ui/window/PopupProperties;", "DisabledAlpha", "", "ContextMenuColumn", "", "colors", "modifier", "Landroidx/compose/ui/Modifier;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ContextMenuItem", "label", "", "enabled", "", "leadingIcon", "Landroidx/compose/ui/graphics/Color;", "Lkotlin/ParameterName;", "name", "iconColor", "onClick", "Lkotlin/Function0;", "(Ljava/lang/String;ZLandroidx/compose/foundation/contextmenu/ContextMenuColors;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ContextMenuPopup", "popupPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "onDismiss", "contextMenuBuilderBlock", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/contextmenu/ContextMenuColors;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/window/PopupPositionProvider;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "computeContextMenuColors", "backgroundStyleId", "", "foregroundStyleId", "(IILandroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/contextmenu/ContextMenuColors;", "disabledColor", "Landroid/content/res/ColorStateList;", "defaultColor", "disabledColor-4WTKRHQ", "(Landroid/content/res/ColorStateList;J)J", "enabledColor", "enabledColor-4WTKRHQ", "resolveColor", "Landroid/content/Context;", "resId", "attrId", "resolveColor-g2O1Hgs", "(Landroid/content/Context;IIJ)J", "resolveColorStateList", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContextMenuUi_androidKt {
    private static final ContextMenuColors DefaultContextMenuColors;
    private static final PopupProperties DefaultPopupProperties = new PopupProperties(true, false, false, false, 14, (DefaultConstructorMarker) null);
    private static final float DisabledAlpha = 0.38f;

    static {
        Color.Companion companion = Color.INSTANCE;
        DefaultContextMenuColors = new ContextMenuColors(companion.m3829getWhite0d7_KjU(), companion.m3818getBlack0d7_KjU(), companion.m3818getBlack0d7_KjU(), Color.m3791copywmQWz5c$default(companion.m3818getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m3791copywmQWz5c$default(companion.m3818getBlack0d7_KjU(), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors r23, androidx.compose.ui.Modifier r24, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r25, androidx.compose.runtime.Composer r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuColumn(androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0180  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuItem(final java.lang.String r24, final boolean r25, final androidx.compose.foundation.contextmenu.ContextMenuColors r26, androidx.compose.ui.Modifier r27, kotlin.jvm.functions.Function3<? super androidx.compose.ui.graphics.Color, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, final kotlin.jvm.functions.Function0<kotlin.Unit> r29, androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuItem(java.lang.String, boolean, androidx.compose.foundation.contextmenu.ContextMenuColors, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function0, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void ContextMenuPopup(PopupPositionProvider popupPositionProvider, Function0<Unit> function0, Modifier modifier, Function1<? super ContextMenuScope, Unit> function1, Composer composer, final int i2, final int i3) {
        int i4;
        final PopupPositionProvider popupPositionProvider2;
        final Function0<Unit> function02;
        final Function1<? super ContextMenuScope, Unit> function12;
        final Modifier modifier2;
        Composer composerStartRestartGroup = composer.startRestartGroup(712057293);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(popupPositionProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? Fields.RotationX : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function1) ? Fields.CameraDistance : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function12 = function1;
            modifier2 = modifier;
            function02 = function0;
            popupPositionProvider2 = popupPositionProvider;
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(712057293, i4, -1, "androidx.compose.foundation.contextmenu.ContextMenuPopup (ContextMenuUi.android.kt:103)");
            }
            ContextMenuPopup(popupPositionProvider, function0, modifier3, computeContextMenuColors(0, 0, composerStartRestartGroup, 0, 3), function1, composerStartRestartGroup, (i4 & 1022) | ((i4 << 3) & 57344), 0);
            popupPositionProvider2 = popupPositionProvider;
            function02 = function0;
            function12 = function1;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup.1
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

                public final void invoke(Composer composer2, int i6) {
                    ContextMenuUi_androidKt.ContextMenuPopup(popupPositionProvider2, function02, modifier2, function12, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final ContextMenuColors computeContextMenuColors(int i2, int i3, Composer composer, int i4, int i5) throws Resources.NotFoundException {
        int i6 = (i5 & 1) != 0 ? R.style.Widget.PopupMenu : i2;
        int i7 = (i5 & 2) != 0 ? R.style.TextAppearance.Widget.PopupMenu.Large : i3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1689505294, i4, -1, "androidx.compose.foundation.contextmenu.computeContextMenuColors (ContextMenuUi.android.kt:354)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        boolean zChanged = composer.changed((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())) | composer.changed(context);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            ContextMenuColors contextMenuColors = DefaultContextMenuColors;
            long jM323resolveColorg2O1Hgs = m323resolveColorg2O1Hgs(context, i6, R.attr.colorBackground, contextMenuColors.getBackgroundColor());
            ColorStateList colorStateListResolveColorStateList = resolveColorStateList(context, i7, R.attr.textColorPrimary);
            long jM322enabledColor4WTKRHQ = m322enabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.getTextColor());
            long jM321disabledColor4WTKRHQ = m321disabledColor4WTKRHQ(colorStateListResolveColorStateList, contextMenuColors.getDisabledTextColor());
            Object contextMenuColors2 = new ContextMenuColors(jM323resolveColorg2O1Hgs, jM322enabledColor4WTKRHQ, jM322enabledColor4WTKRHQ, jM321disabledColor4WTKRHQ, jM321disabledColor4WTKRHQ, null);
            composer.updateRememberedValue(contextMenuColors2);
            objRememberedValue = contextMenuColors2;
        }
        ContextMenuColors contextMenuColors3 = (ContextMenuColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return contextMenuColors3;
    }

    /* renamed from: disabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m321disabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM3846toArgb8_81llA = ColorKt.m3846toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{-16842910}, iM3846toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM3846toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }

    /* renamed from: enabledColor-4WTKRHQ, reason: not valid java name */
    private static final long m322enabledColor4WTKRHQ(ColorStateList colorStateList, long j2) {
        int iM3846toArgb8_81llA = ColorKt.m3846toArgb8_81llA(j2);
        Integer numValueOf = colorStateList != null ? Integer.valueOf(colorStateList.getColorForState(new int[]{R.attr.state_enabled}, iM3846toArgb8_81llA)) : null;
        return (numValueOf == null || numValueOf.intValue() == iM3846toArgb8_81llA) ? j2 : ColorKt.Color(numValueOf.intValue());
    }

    public static final ContextMenuColors getDefaultContextMenuColors() {
        return DefaultContextMenuColors;
    }

    public static /* synthetic */ void getDefaultContextMenuColors$annotations() {
    }

    /* renamed from: resolveColor-g2O1Hgs, reason: not valid java name */
    private static final long m323resolveColorg2O1Hgs(Context context, int i2, int i3, long j2) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        int iM3846toArgb8_81llA = ColorKt.m3846toArgb8_81llA(j2);
        int color = typedArrayObtainStyledAttributes.getColor(0, iM3846toArgb8_81llA);
        typedArrayObtainStyledAttributes.recycle();
        return color == iM3846toArgb8_81llA ? j2 : ColorKt.Color(color);
    }

    private static final ColorStateList resolveColorStateList(Context context, int i2, int i3) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, new int[]{i3});
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
        typedArrayObtainStyledAttributes.recycle();
        return colorStateList;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ContextMenuPopup(final androidx.compose.ui.window.PopupPositionProvider r14, final kotlin.jvm.functions.Function0<kotlin.Unit> r15, androidx.compose.ui.Modifier r16, final androidx.compose.foundation.contextmenu.ContextMenuColors r17, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.contextmenu.ContextMenuScope, kotlin.Unit> r18, androidx.compose.runtime.Composer r19, final int r20, final int r21) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.contextmenu.ContextMenuUi_androidKt.ContextMenuPopup(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.contextmenu.ContextMenuColors, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
