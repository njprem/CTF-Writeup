package androidx.compose.ui.text;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPainter {
    public static final int $stable = 0;
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void paint(androidx.compose.ui.graphics.Canvas r14, androidx.compose.ui.text.TextLayoutResult r15) {
        /*
            r13 = this;
            boolean r0 = r15.getHasVisualOverflow()
            r1 = 0
            if (r0 == 0) goto L1e
            androidx.compose.ui.text.TextLayoutInput r0 = r15.getLayoutInput()
            int r0 = r0.getOverflow()
            androidx.compose.ui.text.style.TextOverflow$Companion r2 = androidx.compose.ui.text.style.TextOverflow.INSTANCE
            int r2 = r2.m6173getVisiblegIe3tQ8()
            boolean r0 = androidx.compose.ui.text.style.TextOverflow.m6164equalsimpl0(r0, r2)
            if (r0 != 0) goto L1e
            r0 = 1
            r2 = r0
            goto L1f
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L49
            long r3 = r15.getSize()
            int r0 = androidx.compose.ui.unit.IntSize.m6403getWidthimpl(r3)
            float r0 = (float) r0
            long r3 = r15.getSize()
            int r3 = androidx.compose.ui.unit.IntSize.m6402getHeightimpl(r3)
            float r3 = (float) r3
            androidx.compose.ui.geometry.Offset$Companion r4 = androidx.compose.ui.geometry.Offset.INSTANCE
            long r4 = r4.m3567getZeroF1C5BW0()
            long r6 = androidx.compose.ui.geometry.SizeKt.Size(r0, r3)
            androidx.compose.ui.geometry.Rect r0 = androidx.compose.ui.geometry.RectKt.m3591Recttz77jQw(r4, r6)
            r14.save()
            r3 = 2
            r4 = 0
            androidx.compose.ui.graphics.Canvas.m3765clipRectmtrdDE$default(r14, r0, r1, r3, r4)
        L49:
            androidx.compose.ui.text.TextLayoutInput r0 = r15.getLayoutInput()
            androidx.compose.ui.text.TextStyle r0 = r0.getStyle()
            androidx.compose.ui.text.SpanStyle r0 = r0.getSpanStyle()
            androidx.compose.ui.text.style.TextDecoration r1 = r0.getBackground()
            if (r1 != 0) goto L61
            androidx.compose.ui.text.style.TextDecoration$Companion r1 = androidx.compose.ui.text.style.TextDecoration.INSTANCE
            androidx.compose.ui.text.style.TextDecoration r1 = r1.getNone()
        L61:
            r8 = r1
            androidx.compose.ui.graphics.Shadow r1 = r0.getShadow()
            if (r1 != 0) goto L6e
            androidx.compose.ui.graphics.Shadow$Companion r1 = androidx.compose.ui.graphics.Shadow.INSTANCE
            androidx.compose.ui.graphics.Shadow r1 = r1.getNone()
        L6e:
            r7 = r1
            androidx.compose.ui.graphics.drawscope.DrawStyle r1 = r0.getDrawStyle()
            if (r1 != 0) goto L77
            androidx.compose.ui.graphics.drawscope.Fill r1 = androidx.compose.ui.graphics.drawscope.Fill.INSTANCE
        L77:
            r9 = r1
            androidx.compose.ui.graphics.Brush r5 = r0.getBrush()     // Catch: java.lang.Throwable -> La7
            if (r5 == 0) goto Laa
            androidx.compose.ui.text.style.TextForegroundStyle r1 = r0.getTextForegroundStyle()     // Catch: java.lang.Throwable -> La7
            androidx.compose.ui.text.style.TextForegroundStyle$Unspecified r3 = androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE     // Catch: java.lang.Throwable -> La7
            if (r1 == r3) goto L94
            androidx.compose.ui.text.style.TextForegroundStyle r0 = r0.getTextForegroundStyle()     // Catch: java.lang.Throwable -> L90
            float r0 = r0.getAlpha()     // Catch: java.lang.Throwable -> L90
        L8e:
            r6 = r0
            goto L97
        L90:
            r0 = move-exception
            r15 = r0
            r4 = r14
            goto Ld5
        L94:
            r0 = 1065353216(0x3f800000, float:1.0)
            goto L8e
        L97:
            androidx.compose.ui.text.MultiParagraph r3 = r15.getMultiParagraph()     // Catch: java.lang.Throwable -> La7
            r11 = 64
            r12 = 0
            r10 = 0
            r4 = r14
            androidx.compose.ui.text.MultiParagraph.m5585painthn5TExg$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
            goto Lcf
        La4:
            r0 = move-exception
        La5:
            r15 = r0
            goto Ld5
        La7:
            r0 = move-exception
            r4 = r14
            goto La5
        Laa:
            r4 = r14
            androidx.compose.ui.text.style.TextForegroundStyle r14 = r0.getTextForegroundStyle()     // Catch: java.lang.Throwable -> La4
            androidx.compose.ui.text.style.TextForegroundStyle$Unspecified r1 = androidx.compose.ui.text.style.TextForegroundStyle.Unspecified.INSTANCE     // Catch: java.lang.Throwable -> La4
            if (r14 == r1) goto Lbd
            androidx.compose.ui.text.style.TextForegroundStyle r14 = r0.getTextForegroundStyle()     // Catch: java.lang.Throwable -> La4
            long r0 = r14.mo6020getColor0d7_KjU()     // Catch: java.lang.Throwable -> La4
        Lbb:
            r5 = r0
            goto Lc4
        Lbd:
            androidx.compose.ui.graphics.Color$Companion r14 = androidx.compose.ui.graphics.Color.INSTANCE     // Catch: java.lang.Throwable -> La4
            long r0 = r14.m3818getBlack0d7_KjU()     // Catch: java.lang.Throwable -> La4
            goto Lbb
        Lc4:
            androidx.compose.ui.text.MultiParagraph r3 = r15.getMultiParagraph()     // Catch: java.lang.Throwable -> La4
            r11 = 32
            r12 = 0
            r10 = 0
            androidx.compose.ui.text.MultiParagraph.m5583paintLG529CI$default(r3, r4, r5, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> La4
        Lcf:
            if (r2 == 0) goto Ld4
            r4.restore()
        Ld4:
            return
        Ld5:
            if (r2 == 0) goto Lda
            r4.restore()
        Lda:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.TextPainter.paint(androidx.compose.ui.graphics.Canvas, androidx.compose.ui.text.TextLayoutResult):void");
    }
}
