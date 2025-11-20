package androidx.compose.ui.text;

import J.d;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.DrawTransform;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0002\u001af\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001ah\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0080\u0001\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\u0014\b\u0002\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u001aj\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020/2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020$2\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000¢\u0006\u0004\b0\u00101\u001a&\u00102\u001a\u000203*\u00020\u00062\u0006\u0010+\u001a\u00020,2\u0006\u0010\t\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, d2 = {"clip", "", "Landroidx/compose/ui/graphics/drawscope/DrawTransform;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "drawText", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "brush", "Landroidx/compose/ui/graphics/Brush;", "topLeft", "Landroidx/compose/ui/geometry/Offset;", "alpha", "", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "drawText-LVfH_YU", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/graphics/Brush;JFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "color", "Landroidx/compose/ui/graphics/Color;", "drawText-d8-rzKo", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextLayoutResult;JJFLandroidx/compose/ui/graphics/Shadow;Landroidx/compose/ui/text/style/TextDecoration;Landroidx/compose/ui/graphics/drawscope/DrawStyle;I)V", "textMeasurer", "Landroidx/compose/ui/text/TextMeasurer;", "text", "Landroidx/compose/ui/text/AnnotatedString;", "style", "Landroidx/compose/ui/text/TextStyle;", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "softWrap", "", "maxLines", "", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "size", "Landroidx/compose/ui/geometry/Size;", "drawText-JFhB2K4", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextStyle;IZILjava/util/List;JI)V", "", "drawText-TPWCCtM", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/text/TextMeasurer;Ljava/lang/String;JLandroidx/compose/ui/text/TextStyle;IZIJI)V", "textLayoutConstraints", "Landroidx/compose/ui/unit/Constraints;", "textLayoutConstraints-v_w8tDc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPainterKt {
    private static final void clip(DrawTransform drawTransform, TextLayoutResult textLayoutResult) {
        if (!textLayoutResult.getHasVisualOverflow() || TextOverflow.m6164equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m6173getVisiblegIe3tQ8())) {
            return;
        }
        DrawTransform.m4399clipRectN_I0leg$default(drawTransform, 0.0f, 0.0f, IntSize.m6403getWidthimpl(textLayoutResult.getSize()), IntSize.m6402getHeightimpl(textLayoutResult.getSize()), 0, 16, null);
    }

    /* renamed from: drawText-JFhB2K4, reason: not valid java name */
    public static final void m5700drawTextJFhB2K4(DrawScope drawScope, TextMeasurer textMeasurer, AnnotatedString annotatedString, long j2, TextStyle textStyle, int i2, boolean z, int i3, List<AnnotatedString.Range<Placeholder>> list, long j3, int i4) {
        TextLayoutResult textLayoutResultM5697measurexDpz5zY$default = TextMeasurer.m5697measurexDpz5zY$default(textMeasurer, annotatedString, textStyle, i2, z, i3, list, m5708textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, 1536, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3551getXimpl(j2), Offset.m3552getYimpl(j2));
            clip(transform, textLayoutResultM5697measurexDpz5zY$default);
            textLayoutResultM5697measurexDpz5zY$default.getMultiParagraph().m5590paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m4344getDefaultBlendMode0nO6VwU() : i4);
        } finally {
            d.y(drawContext, jMo4263getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-LVfH_YU, reason: not valid java name */
    public static final void m5702drawTextLVfH_YU(DrawScope drawScope, TextLayoutResult textLayoutResult, Brush brush, long j2, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        Shadow shadow2 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration2 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle2 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3551getXimpl(j2), Offset.m3552getYimpl(j2));
            clip(transform, textLayoutResult);
            textLayoutResult.getMultiParagraph().m5592painthn5TExg(drawScope.getDrawContext().getCanvas(), brush, !Float.isNaN(f2) ? f2 : textLayoutResult.getLayoutInput().getStyle().getAlpha(), shadow2, textDecoration2, drawStyle2, i2);
        } finally {
            d.y(drawContext, jMo4263getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-TPWCCtM, reason: not valid java name */
    public static final void m5704drawTextTPWCCtM(DrawScope drawScope, TextMeasurer textMeasurer, String str, long j2, TextStyle textStyle, int i2, boolean z, int i3, long j3, int i4) {
        TextLayoutResult textLayoutResultM5697measurexDpz5zY$default = TextMeasurer.m5697measurexDpz5zY$default(textMeasurer, new AnnotatedString(str, null, null, 6, null), textStyle, i2, z, i3, null, m5708textLayoutConstraintsv_w8tDc(drawScope, j3, j2), drawScope.getLayoutDirection(), drawScope, null, false, 1568, null);
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3551getXimpl(j2), Offset.m3552getYimpl(j2));
            clip(transform, textLayoutResultM5697measurexDpz5zY$default);
            textLayoutResultM5697measurexDpz5zY$default.getMultiParagraph().m5590paintLG529CI(drawScope.getDrawContext().getCanvas(), (32 & 2) != 0 ? Color.INSTANCE.m3828getUnspecified0d7_KjU() : 0L, (32 & 4) != 0 ? null : null, (32 & 8) != 0 ? null : null, (32 & 16) == 0 ? null : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m4344getDefaultBlendMode0nO6VwU() : i4);
        } finally {
            d.y(drawContext, jMo4263getSizeNHjbRc);
        }
    }

    /* renamed from: drawText-d8-rzKo, reason: not valid java name */
    public static final void m5706drawTextd8rzKo(DrawScope drawScope, TextLayoutResult textLayoutResult, long j2, long j3, float f2, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i2) {
        float alpha;
        int i3;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        Canvas canvas;
        MultiParagraph multiParagraph;
        Shadow shadow3 = shadow == null ? textLayoutResult.getLayoutInput().getStyle().getShadow() : shadow;
        TextDecoration textDecoration3 = textDecoration == null ? textLayoutResult.getLayoutInput().getStyle().getTextDecoration() : textDecoration;
        DrawStyle drawStyle3 = drawStyle == null ? textLayoutResult.getLayoutInput().getStyle().getDrawStyle() : drawStyle;
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            DrawTransform transform = drawContext.getTransform();
            transform.translate(Offset.m3551getXimpl(j3), Offset.m3552getYimpl(j3));
            clip(transform, textLayoutResult);
            Brush brush = textLayoutResult.getLayoutInput().getStyle().getBrush();
            if (brush == null || j2 != 16) {
                MultiParagraph multiParagraph2 = textLayoutResult.getMultiParagraph();
                Canvas canvas2 = drawScope.getDrawContext().getCanvas();
                if (j2 == 16) {
                    j2 = textLayoutResult.getLayoutInput().getStyle().m5751getColor0d7_KjU();
                }
                multiParagraph2.m5590paintLG529CI(canvas2, TextDrawStyleKt.m6142modulateDxMtmZc(j2, f2), shadow3, textDecoration3, drawStyle3, i2);
            } else {
                MultiParagraph multiParagraph3 = textLayoutResult.getMultiParagraph();
                Canvas canvas3 = drawScope.getDrawContext().getCanvas();
                if (Float.isNaN(f2)) {
                    alpha = textLayoutResult.getLayoutInput().getStyle().getAlpha();
                    i3 = i2;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                } else {
                    alpha = f2;
                    canvas = canvas3;
                    multiParagraph = multiParagraph3;
                    i3 = i2;
                    shadow2 = shadow3;
                    textDecoration2 = textDecoration3;
                    drawStyle2 = drawStyle3;
                }
                multiParagraph.m5592painthn5TExg(canvas, brush, alpha, shadow2, textDecoration2, drawStyle2, i3);
            }
            d.y(drawContext, jMo4263getSizeNHjbRc);
        } catch (Throwable th) {
            d.y(drawContext, jMo4263getSizeNHjbRc);
            throw th;
        }
    }

    /* renamed from: textLayoutConstraints-v_w8tDc, reason: not valid java name */
    private static final long m5708textLayoutConstraintsv_w8tDc(DrawScope drawScope, long j2, long j3) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4 = 0;
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m3620getWidthimpl(j2))) {
            iRound = Math.round((float) Math.ceil(Size.m3620getWidthimpl(drawScope.mo4342getSizeNHjbRc()) - Offset.m3551getXimpl(j3)));
            iRound2 = 0;
        } else {
            iRound2 = Math.round((float) Math.ceil(Size.m3620getWidthimpl(j2)));
            iRound = iRound2;
        }
        if (j2 == InlineClassHelperKt.UnspecifiedPackedFloats || Float.isNaN(Size.m3617getHeightimpl(j2))) {
            iRound3 = Math.round((float) Math.ceil(Size.m3617getHeightimpl(drawScope.mo4342getSizeNHjbRc()) - Offset.m3552getYimpl(j3)));
        } else {
            iRound4 = Math.round((float) Math.ceil(Size.m3617getHeightimpl(j2)));
            iRound3 = iRound4;
        }
        return ConstraintsKt.Constraints(iRound2, iRound, iRound4, iRound3);
    }
}
