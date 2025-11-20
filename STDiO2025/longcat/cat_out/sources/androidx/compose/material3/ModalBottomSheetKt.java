package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÄ\u0001\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00132\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a0\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u00132\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010%\u001a\u00020&H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a-\u0010)\u001a\u00020\u000e2\b\b\u0002\u0010*\u001a\u00020&2\u0014\b\u0002\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020&0\u001eH\u0007¢\u0006\u0002\u0010-\u001aó\u0001\u0010.\u001a\u00020\b*\u00020/2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203012\u0006\u00104\u001a\u0002052\f\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\n2!\u00107\u001a\u001d\u0012\u0013\u0012\u001102¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(:\u0012\u0004\u0012\u00020\b0\u001e2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00042\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\n¢\u0006\u0002\b\u00182\u0013\b\u0002\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u001a0\n¢\u0006\u0002\b\u00182\u001c\u0010\u001d\u001a\u0018\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\b0\u001e¢\u0006\u0002\b\u0018¢\u0006\u0002\b H\u0001ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a\u0014\u0010=\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\u001a\u0014\u0010@\u001a\u000202*\u00020>2\u0006\u0010?\u001a\u000202H\u0002\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006A²\u0006\n\u0010B\u001a\u000202X\u008a\u0084\u0002"}, d2 = {"PredictiveBackChildTransformOrigin", "Landroidx/compose/ui/graphics/TransformOrigin;", "J", "PredictiveBackMaxScaleXDistance", "Landroidx/compose/ui/unit/Dp;", "F", "PredictiveBackMaxScaleYDistance", "ModalBottomSheet", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "sheetState", "Landroidx/compose/material3/SheetState;", "sheetMaxWidth", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "scrimColor", "dragHandle", "Landroidx/compose/runtime/Composable;", "contentWindowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "properties", "Landroidx/compose/material3/ModalBottomSheetProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "ModalBottomSheet-dYc4hso", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFJLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/material3/ModalBottomSheetProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Scrim", "color", "visible", "", "Scrim-3J-VO9M", "(JLkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "rememberModalBottomSheetState", "skipPartiallyExpanded", "confirmValueChange", "Landroidx/compose/material3/SheetValue;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/SheetState;", "ModalBottomSheetContent", "Landroidx/compose/foundation/layout/BoxScope;", "predictiveBackProgress", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "animateToDismiss", "settleToDismiss", "Lkotlin/ParameterName;", "name", "velocity", "ModalBottomSheetContent-IQkwcL4", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/animation/core/Animatable;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SheetState;FLandroidx/compose/ui/graphics/Shape;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "calculatePredictiveBackScaleX", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "progress", "calculatePredictiveBackScaleY", "material3_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ModalBottomSheetKt {
    private static final float PredictiveBackMaxScaleXDistance = Dp.m6233constructorimpl(48);
    private static final float PredictiveBackMaxScaleYDistance = Dp.m6233constructorimpl(24);
    private static final long PredictiveBackChildTransformOrigin = TransformOriginKt.TransformOrigin(0.5f, 0.0f);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x03ea  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /* renamed from: ModalBottomSheet-dYc4hso, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1875ModalBottomSheetdYc4hso(final kotlin.jvm.functions.Function0<kotlin.Unit> r45, androidx.compose.ui.Modifier r46, androidx.compose.material3.SheetState r47, float r48, androidx.compose.ui.graphics.Shape r49, long r50, long r52, float r54, long r55, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r58, androidx.compose.material3.ModalBottomSheetProperties r59, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r60, androidx.compose.runtime.Composer r61, final int r62, final int r63, final int r64) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m1875ModalBottomSheetdYc4hso(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.material3.ModalBottomSheetProperties, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0131  */
    /* renamed from: ModalBottomSheetContent-IQkwcL4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1876ModalBottomSheetContentIQkwcL4(final androidx.compose.foundation.layout.BoxScope r43, final androidx.compose.animation.core.Animatable<java.lang.Float, androidx.compose.animation.core.AnimationVector1D> r44, final kotlinx.coroutines.CoroutineScope r45, final kotlin.jvm.functions.Function0<kotlin.Unit> r46, final kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit> r47, androidx.compose.ui.Modifier r48, androidx.compose.material3.SheetState r49, float r50, androidx.compose.ui.graphics.Shape r51, long r52, long r54, float r56, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r57, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, ? extends androidx.compose.foundation.layout.WindowInsets> r58, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.ColumnScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r59, androidx.compose.runtime.Composer r60, final int r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ModalBottomSheetKt.m1876ModalBottomSheetContentIQkwcL4(androidx.compose.foundation.layout.BoxScope, androidx.compose.animation.core.Animatable, kotlinx.coroutines.CoroutineScope, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.material3.SheetState, float, androidx.compose.ui.graphics.Shape, long, long, float, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Scrim-3J-VO9M, reason: not valid java name */
    public static final void m1877Scrim3JVO9M(final long j2, final Function0<Unit> function0, final boolean z, Composer composer, final int i2) {
        int i3;
        Modifier modifierSemantics;
        Composer composerStartRestartGroup = composer.startRestartGroup(951870469);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(j2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951870469, i3, -1, "androidx.compose.material3.Scrim (ModalBottomSheet.kt:407)");
            }
            if (j2 != 16) {
                int i4 = i3;
                final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 1.0f : 0.0f, new TweenSpec(0, 0, null, 7, null), 0.0f, null, null, composerStartRestartGroup, 48, 28);
                Strings.Companion companion = Strings.INSTANCE;
                final String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(androidx.compose.ui.R.string.close_sheet), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1785653838);
                if (z) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    int i5 = i4 & 112;
                    boolean z2 = i5 == 32;
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new ModalBottomSheetKt$Scrim$dismissSheet$1$1(function0, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(companion2, function0, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue);
                    boolean zChanged = composerStartRestartGroup.changed(strM2607getString2EP1pXo) | (i5 == 32);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1
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
                                SemanticsPropertiesKt.setTraversalIndex(semanticsPropertyReceiver, 1.0f);
                                SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, strM2607getString2EP1pXo);
                                final Function0<Unit> function02 = function0;
                                SemanticsPropertiesKt.onClick$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$dismissSheet$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Can't rename method to resolve collision */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Boolean invoke() {
                                        function02.invoke();
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
                boolean zChanged2 = composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i4 & 14) == 4);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$1$1
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
                            DrawScope.m4336drawRectnJ9OG0$default(drawScope, j2, 0L, 0L, RangesKt.coerceIn(ModalBottomSheetKt.Scrim_3J_VO9M$lambda$10(stateAnimateFloatAsState), 0.0f, 1.0f), null, null, 0, 118, null);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                CanvasKt.Canvas(modifierThen, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.ModalBottomSheetKt$Scrim$2
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
                    ModalBottomSheetKt.m1877Scrim3JVO9M(j2, function0, z, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Scrim_3J_VO9M$lambda$10(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleX(GraphicsLayerScope graphicsLayerScope, float f2) {
        float fM3620getWidthimpl = Size.m3620getWidthimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM3620getWidthimpl) || fM3620getWidthimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo334toPx0680j_4(PredictiveBackMaxScaleXDistance), fM3620getWidthimpl), f2) / fM3620getWidthimpl);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float calculatePredictiveBackScaleY(GraphicsLayerScope graphicsLayerScope, float f2) {
        float fM3617getHeightimpl = Size.m3617getHeightimpl(graphicsLayerScope.getSize());
        if (Float.isNaN(fM3617getHeightimpl) || fM3617getHeightimpl == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (MathHelpersKt.lerp(0.0f, Math.min(graphicsLayerScope.mo334toPx0680j_4(PredictiveBackMaxScaleYDistance), fM3617getHeightimpl), f2) / fM3617getHeightimpl);
    }

    public static final SheetState rememberModalBottomSheetState(boolean z, Function1<? super SheetValue, Boolean> function1, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i3 & 2) != 0) {
            function1 = new Function1<SheetValue, Boolean>() { // from class: androidx.compose.material3.ModalBottomSheetKt.rememberModalBottomSheetState.1
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(SheetValue sheetValue) {
                    return Boolean.TRUE;
                }
            };
        }
        Function1<? super SheetValue, Boolean> function12 = function1;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-778250030, i2, -1, "androidx.compose.material3.rememberModalBottomSheetState (ModalBottomSheet.kt:400)");
        }
        SheetState sheetStateRememberSheetState = SheetDefaultsKt.rememberSheetState(z2, function12, SheetValue.Hidden, false, composer, (i2 & 14) | 384 | (i2 & 112), 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return sheetStateRememberSheetState;
    }
}
