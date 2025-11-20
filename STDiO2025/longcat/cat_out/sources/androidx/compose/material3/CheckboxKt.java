package androidx.compose.material3;

import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.util.MathHelpersKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a-\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0003¢\u0006\u0002\u0010\u001b\u001aO\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001a2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u001f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0002\u0010 \u001a6\u0010!\u001a\u00020\u000b*\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'H\u0002ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a>\u0010+\u001a\u00020\u000b*\u00020\"2\u0006\u0010,\u001a\u00020$2\u0006\u0010-\u001a\u00020'2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u000201H\u0002ø\u0001\u0000¢\u0006\u0004\b2\u00103\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\u0007\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\b\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\"\u0010\u0010\t\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"BoxInDuration", "", "BoxOutDuration", "CheckAnimationDuration", "CheckboxDefaultPadding", "Landroidx/compose/ui/unit/Dp;", "F", "CheckboxSize", "RadiusSize", "StrokeWidth", "Checkbox", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "colors", "Landroidx/compose/material3/CheckboxColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "CheckboxImpl", "value", "Landroidx/compose/ui/state/ToggleableState;", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/CheckboxColors;Landroidx/compose/runtime/Composer;I)V", "TriStateCheckbox", "state", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/state/ToggleableState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/CheckboxColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "drawBox", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "boxColor", "Landroidx/compose/ui/graphics/Color;", "borderColor", "radius", "", "strokeWidth", "drawBox-1wkBAMs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJFF)V", "drawCheck", "checkColor", "checkFraction", "crossCenterGravitation", "strokeWidthPx", "drawingCache", "Landroidx/compose/material3/CheckDrawingCache;", "drawCheck-3IgeMak", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFFFLandroidx/compose/material3/CheckDrawingCache;)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CheckboxKt {
    private static final int BoxInDuration = 50;
    private static final int BoxOutDuration = 100;
    private static final int CheckAnimationDuration = 100;
    private static final float CheckboxDefaultPadding;
    private static final float CheckboxSize = Dp.m6233constructorimpl(20);
    private static final float RadiusSize;
    private static final float StrokeWidth;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f2 = 2;
        CheckboxDefaultPadding = Dp.m6233constructorimpl(f2);
        StrokeWidth = Dp.m6233constructorimpl(f2);
        RadiusSize = Dp.m6233constructorimpl(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void Checkbox(final boolean r18, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r19, androidx.compose.ui.Modifier r20, boolean r21, androidx.compose.material3.CheckboxColors r22, androidx.compose.foundation.interaction.MutableInteractionSource r23, androidx.compose.runtime.Composer r24, final int r25, final int r26) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.Checkbox(boolean, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckboxImpl(final boolean r32, final androidx.compose.ui.state.ToggleableState r33, final androidx.compose.ui.Modifier r34, final androidx.compose.material3.CheckboxColors r35, androidx.compose.runtime.Composer r36, final int r37) {
        /*
            Method dump skipped, instructions count: 632
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.CheckboxImpl(boolean, androidx.compose.ui.state.ToggleableState, androidx.compose.ui.Modifier, androidx.compose.material3.CheckboxColors, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void TriStateCheckbox(final androidx.compose.ui.state.ToggleableState r17, final kotlin.jvm.functions.Function0<kotlin.Unit> r18, androidx.compose.ui.Modifier r19, boolean r20, androidx.compose.material3.CheckboxColors r21, androidx.compose.foundation.interaction.MutableInteractionSource r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.CheckboxKt.TriStateCheckbox(androidx.compose.ui.state.ToggleableState, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.material3.CheckboxColors, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawBox-1wkBAMs, reason: not valid java name */
    public static final void m1484drawBox1wkBAMs(DrawScope drawScope, long j2, long j3, float f2, float f3) {
        float f4 = f3 / 2.0f;
        Stroke stroke = new Stroke(f3, 0.0f, 0, 0, null, 30, null);
        float fM3620getWidthimpl = Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc());
        if (Color.m3793equalsimpl0(j2, j3)) {
            DrawScope.m4338drawRoundRectuAw5IA$default(drawScope, j2, 0L, SizeKt.Size(fM3620getWidthimpl, fM3620getWidthimpl), CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 226, null);
            return;
        }
        float f5 = fM3620getWidthimpl - (2 * f3);
        DrawScope.m4338drawRoundRectuAw5IA$default(drawScope, j2, OffsetKt.Offset(f3, f3), SizeKt.Size(f5, f5), CornerRadiusKt.CornerRadius$default(Math.max(0.0f, f2 - f3), 0.0f, 2, null), Fill.INSTANCE, 0.0f, null, 0, 224, null);
        float f6 = fM3620getWidthimpl - f3;
        DrawScope.m4338drawRoundRectuAw5IA$default(drawScope, j3, OffsetKt.Offset(f4, f4), SizeKt.Size(f6, f6), CornerRadiusKt.CornerRadius$default(f2 - f4, 0.0f, 2, null), stroke, 0.0f, null, 0, 224, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCheck-3IgeMak, reason: not valid java name */
    public static final void m1485drawCheck3IgeMak(DrawScope drawScope, long j2, float f2, float f3, float f4, CheckDrawingCache checkDrawingCache) {
        Stroke stroke = new Stroke(f4, 0.0f, StrokeCap.INSTANCE.m4146getSquareKaPHkGw(), 0, null, 26, null);
        float fM3620getWidthimpl = Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc());
        float fLerp = MathHelpersKt.lerp(0.4f, 0.5f, f3);
        float fLerp2 = MathHelpersKt.lerp(0.7f, 0.5f, f3);
        float fLerp3 = MathHelpersKt.lerp(0.5f, 0.5f, f3);
        float fLerp4 = MathHelpersKt.lerp(0.3f, 0.5f, f3);
        checkDrawingCache.getCheckPath().reset();
        checkDrawingCache.getCheckPath().moveTo(0.2f * fM3620getWidthimpl, fLerp3 * fM3620getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(fLerp * fM3620getWidthimpl, fLerp2 * fM3620getWidthimpl);
        checkDrawingCache.getCheckPath().lineTo(0.8f * fM3620getWidthimpl, fM3620getWidthimpl * fLerp4);
        checkDrawingCache.getPathMeasure().setPath(checkDrawingCache.getCheckPath(), false);
        checkDrawingCache.getPathToDraw().reset();
        checkDrawingCache.getPathMeasure().getSegment(0.0f, checkDrawingCache.getPathMeasure().getLength() * f2, checkDrawingCache.getPathToDraw(), true);
        DrawScope.m4332drawPathLG529CI$default(drawScope, checkDrawingCache.getPathToDraw(), j2, 0.0f, stroke, null, 0, 52, null);
    }
}
