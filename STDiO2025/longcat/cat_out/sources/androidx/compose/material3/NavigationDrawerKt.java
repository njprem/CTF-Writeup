package androidx.compose.material3;

import J.d;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001at\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001al\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001aQ\u0010\u001f\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010$\u001at\u0010%\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001at\u0010*\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001c\u001al\u0010*\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b,\u0010\u001e\u001a`\u0010-\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020\u00112\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u00100\u001a\u008e\u0001\u00101\u001a\u00020\t2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\u0006\u00103\u001a\u00020#2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\t0!2\b\b\u0002\u0010\f\u001a\u00020\r2\u0015\b\u0002\u00105\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\u0015\b\u0002\u00106\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010!¢\u0006\u0002\b\u00192\b\b\u0002\u00107\u001a\u00020\u000f2\b\b\u0002\u00108\u001a\u0002092\n\b\u0002\u0010:\u001a\u0004\u0018\u00010;H\u0007¢\u0006\u0002\u0010<\u001al\u0010=\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u001c\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\t0\u0017¢\u0006\u0002\b\u0019¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b>\u0010\u001e\u001a=\u0010?\u001a\u00020\t2\u0011\u0010 \u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u00192\b\b\u0002\u0010\f\u001a\u00020\r2\u0011\u0010\u0016\u001a\r\u0012\u0004\u0012\u00020\t0!¢\u0006\u0002\b\u0019H\u0007¢\u0006\u0002\u0010@\u001a>\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020#2\f\u0010C\u001a\b\u0012\u0004\u0012\u00020\t0!2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00020!2\u0006\u0010E\u001a\u00020\u0011H\u0003ø\u0001\u0000¢\u0006\u0004\bF\u0010G\u001a \u0010H\u001a\u00020\u00022\u0006\u0010I\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u00022\u0006\u0010K\u001a\u00020\u0002H\u0002\u001a+\u0010L\u001a\u00020\u000b2\u0006\u0010M\u001a\u00020N2\u0014\b\u0002\u0010O\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020#0\u0017H\u0007¢\u0006\u0002\u0010P\u001a\u0014\u0010Q\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u0014\u0010S\u001a\u00020\u0002*\u00020R2\u0006\u0010&\u001a\u00020'H\u0002\u001a\u001c\u0010T\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\u001a\u001c\u0010V\u001a\u00020\r*\u00020\r2\u0006\u0010&\u001a\u00020'2\u0006\u0010U\u001a\u00020#H\u0002\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0002X\u0082D¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006W²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002²\u0006\n\u0010Y\u001a\u00020\u0002X\u008a\u008e\u0002²\u0006\n\u0010X\u001a\u00020#X\u008a\u008e\u0002"}, d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "DrawerPositionalThreshold", "DrawerVelocityThreshold", "Landroidx/compose/ui/unit/Dp;", "F", "MinimumDrawerWidth", "DismissibleDrawerSheet", "", "drawerState", "Landroidx/compose/material3/DrawerState;", "modifier", "Landroidx/compose/ui/Modifier;", "drawerShape", "Landroidx/compose/ui/graphics/Shape;", "drawerContainerColor", "Landroidx/compose/ui/graphics/Color;", "drawerContentColor", "drawerTonalElevation", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DismissibleDrawerSheet-Snr_uVM", "(Landroidx/compose/material3/DrawerState;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleDrawerSheet-afqeVBk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DismissibleNavigationDrawer", "drawerContent", "Lkotlin/Function0;", "gesturesEnabled", "", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "DrawerSheet", "drawerPredictiveBackState", "Landroidx/compose/material3/DrawerPredictiveBackState;", "DrawerSheet-7zSek6w", "(Landroidx/compose/material3/DrawerPredictiveBackState;Landroidx/compose/foundation/layout/WindowInsets;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "ModalDrawerSheet", "ModalDrawerSheet-Snr_uVM", "ModalDrawerSheet-afqeVBk", "ModalNavigationDrawer", "scrimColor", "ModalNavigationDrawer-FHprtrg", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DrawerState;ZJLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "NavigationDrawerItem", "label", "selected", "onClick", "icon", "badge", "shape", "colors", "Landroidx/compose/material3/NavigationDrawerItemColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/NavigationDrawerItemColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "PermanentDrawerSheet", "PermanentDrawerSheet-afqeVBk", "PermanentNavigationDrawer", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Scrim", "open", "onClose", "fraction", "color", "Scrim-Bx497Mc", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "calculateFraction", "a", "b", "pos", "rememberDrawerState", "initialValue", "Landroidx/compose/material3/DrawerValue;", "confirmStateChange", "(Landroidx/compose/material3/DrawerValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DrawerState;", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "calculatePredictiveBackScaleY", "predictiveBackDrawerChild", "isRtl", "predictiveBackDrawerContainer", "material3_release", "anchorsInitialized", "minValue"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NavigationDrawerKt {
    private static final float DrawerPositionalThreshold = 0.5f;
    private static final float DrawerVelocityThreshold = Dp.m6233constructorimpl(400);
    private static final float MinimumDrawerWidth = Dp.m6233constructorimpl(240);
    private static final TweenSpec<Float> AnimationSpec = new TweenSpec<>(Fields.RotationX, 0, null, 6, null);

    /* JADX WARN: Removed duplicated region for block: B:110:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* renamed from: DismissibleDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1913DismissibleDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, float r34, androidx.compose.foundation.layout.WindowInsets r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1913DismissibleDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0120  */
    /* renamed from: DismissibleDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1914DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier r24, androidx.compose.ui.graphics.Shape r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1914DismissibleDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0140  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DismissibleNavigationDrawer(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r24, androidx.compose.ui.Modifier r25, androidx.compose.material3.DrawerState r26, boolean r27, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, androidx.compose.runtime.Composer r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 925
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.DismissibleNavigationDrawer(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DismissibleNavigationDrawer$lambda$16(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DismissibleNavigationDrawer$lambda$17(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fe  */
    /* renamed from: DrawerSheet-7zSek6w, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1915DrawerSheet7zSek6w(final androidx.compose.material3.DrawerPredictiveBackState r27, final androidx.compose.foundation.layout.WindowInsets r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, float r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1915DrawerSheet7zSek6w(androidx.compose.material3.DrawerPredictiveBackState, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0107  */
    /* renamed from: ModalDrawerSheet-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1916ModalDrawerSheetSnr_uVM(final androidx.compose.material3.DrawerState r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, float r34, androidx.compose.foundation.layout.WindowInsets r35, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1916ModalDrawerSheetSnr_uVM(androidx.compose.material3.DrawerState, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ea  */
    /* renamed from: ModalDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1917ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier r24, androidx.compose.ui.graphics.Shape r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1917ModalDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0456  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013d  */
    /* renamed from: ModalNavigationDrawer-FHprtrg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1918ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.ui.Modifier r31, androidx.compose.material3.DrawerState r32, boolean r33, long r34, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, androidx.compose.runtime.Composer r37, final int r38, final int r39) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1918ModalNavigationDrawerFHprtrg(kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, androidx.compose.material3.DrawerState, boolean, long, kotlin.jvm.functions.Function2, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ModalNavigationDrawer_FHprtrg$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ModalNavigationDrawer_FHprtrg$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void NavigationDrawerItem(final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, final boolean r33, final kotlin.jvm.functions.Function0<kotlin.Unit> r34, androidx.compose.ui.Modifier r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.material3.NavigationDrawerItemColors r39, androidx.compose.foundation.interaction.MutableInteractionSource r40, androidx.compose.runtime.Composer r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.NavigationDrawerItem(kotlin.jvm.functions.Function2, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, androidx.compose.material3.NavigationDrawerItemColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /* renamed from: PermanentDrawerSheet-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1919PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier r24, androidx.compose.ui.graphics.Shape r25, long r26, long r28, float r30, androidx.compose.foundation.layout.WindowInsets r31, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.NavigationDrawerKt.m1919PermanentDrawerSheetafqeVBk(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, float, androidx.compose.foundation.layout.WindowInsets, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void PermanentNavigationDrawer(final Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(-276843608);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = 2 & i3;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((4 & i3) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function22) ? Fields.RotationX : 128;
        }
        if ((i4 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-276843608, i4, -1, "androidx.compose.material3.PermanentNavigationDrawer (NavigationDrawer.kt:531)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            Arrangement.Horizontal start = Arrangement.INSTANCE.getStart();
            Alignment.Companion companion = Alignment.INSTANCE;
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(start, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T = d.t(companion2, composerM3285constructorimpl, measurePolicyRowMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
            if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
            }
            Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i4 & 14));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifierKt.materializeModifier(composerStartRestartGroup, companion3);
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM3285constructorimpl2 = Updater.m3285constructorimpl(composerStartRestartGroup);
            Function2 function2T2 = d.t(companion2, composerM3285constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl2, currentCompositionLocalMap2);
            if (composerM3285constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                d.v(currentCompositeKeyHash2, composerM3285constructorimpl2, currentCompositeKeyHash2, function2T2);
            }
            Updater.m3292setimpl(composerM3285constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function22.invoke(composerStartRestartGroup, Integer.valueOf((i4 >> 6) & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.PermanentNavigationDrawer.2
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
                    NavigationDrawerKt.PermanentNavigationDrawer(function2, modifier2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-Bx497Mc, reason: not valid java name */
    public static final void m1920ScrimBx497Mc(final boolean z, final Function0<Unit> function0, final Function0<Float> function02, final long j2, Composer composer, final int i2) {
        int i3;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(2106487387);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? Fields.RotationX : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? Fields.CameraDistance : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2106487387, i3, -1, "androidx.compose.material3.Scrim (NavigationDrawer.kt:1135)");
            }
            Strings.Companion companion = Strings.INSTANCE;
            final String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(androidx.compose.ui.R.string.close_drawer), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1784754787);
            if (z) {
                Modifier.Companion companion2 = Modifier.INSTANCE;
                int i4 = i3 & 112;
                boolean z2 = i4 == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new NavigationDrawerKt$Scrim$dismissDrawer$1$1(function0, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                boolean zChanged = (i4 == 32) | composerStartRestartGroup.changed(strM2607getString2EP1pXo);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2607getString2EP1pXo);
                            final Function0<Unit> function03 = function0;
                            SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$dismissDrawer$2$1.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Boolean invoke() {
                                    function03.invoke();
                                    return Boolean.TRUE;
                                }
                            }, 1, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                modifierSemantics = SemanticsModifierKt.semantics(modifierPointerInput, true, (Function1) objRememberedValue2);
            } else {
                modifierSemantics = Modifier.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierThen = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null).then(modifierSemantics);
            boolean z3 = ((i3 & 7168) == 2048) | ((i3 & 896) == 256);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        DrawScope.m4336drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, function02.invoke().floatValue(), null, null, 0, 118, null);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt$Scrim$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    NavigationDrawerKt.m1920ScrimBx497Mc(z, function0, function02, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculateFraction(float f2, float f3, float f4) {
        return RangesKt.coerceIn((f4 - f2) / (f3 - f2), 0.0f, 1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM3620getWidthimpl = Size.m3620getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM3620getWidthimpl) || fM3620getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return ((drawerPredictiveBackState.getScaleXDistance() * (drawerPredictiveBackState.getSwipeEdgeMatchesDrawer() ? 1 : -1)) / fM3620getWidthimpl) + 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, DrawerPredictiveBackState drawerPredictiveBackState) {
        float fM3617getHeightimpl = Size.m3617getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM3617getHeightimpl) || fM3617getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (drawerPredictiveBackState.getScaleYDistance() / fM3617getHeightimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Modifier predictiveBackDrawerChild(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerChild.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                float fCalculatePredictiveBackScaleX = NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState);
                graphicsLayerScope.setScaleX(fCalculatePredictiveBackScaleX == 0.0f ? 1.0f : NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState) / fCalculatePredictiveBackScaleX);
                graphicsLayerScope.mo3984setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 0.0f : 1.0f, 0.0f));
            }
        });
    }

    private static final Modifier predictiveBackDrawerContainer(Modifier modifier, final DrawerPredictiveBackState drawerPredictiveBackState, final boolean z) {
        return GraphicsLayerModifierKt.graphicsLayer(modifier, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.NavigationDrawerKt.predictiveBackDrawerContainer.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.setScaleX(NavigationDrawerKt.calculatePredictiveBackScaleX(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.setScaleY(NavigationDrawerKt.calculatePredictiveBackScaleY(graphicsLayerScope, drawerPredictiveBackState));
                graphicsLayerScope.mo3984setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(z ? 1.0f : 0.0f, 0.5f));
            }
        });
    }

    public static final DrawerState rememberDrawerState(final DrawerValue drawerValue, final Function1<? super DrawerValue, Boolean> function1, Composer composer, int i2, int i3) {
        if ((i3 & 2) != 0) {
            function1 = new Function1<DrawerValue, Boolean>() { // from class: androidx.compose.material3.NavigationDrawerKt.rememberDrawerState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(DrawerValue drawerValue2) {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2098699222, i2, -1, "androidx.compose.material3.rememberDrawerState (NavigationDrawer.kt:285)");
        }
        Object[] objArr = new Object[0];
        Saver<DrawerState, DrawerValue> Saver = DrawerState.INSTANCE.Saver(function1);
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(drawerValue)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(function1)) || (i2 & 48) == 32);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<DrawerState>() { // from class: androidx.compose.material3.NavigationDrawerKt$rememberDrawerState$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DrawerState invoke() {
                    return new DrawerState(drawerValue, function1);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        DrawerState drawerState = (DrawerState) RememberSaveableKt.m3378rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return drawerState;
    }
}
