package androidx.compose.ui.text.platform;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import androidx.compose.runtime.State;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.text.platform.extensions.TextPaintExtensions_androidKt;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00107\u001a\u000208H\u0002J,\u00109\u001a\u0002082\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010:\u001a\u00020\u001b2\b\b\u0002\u0010;\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u0002082\u0006\u0010?\u001a\u00020@ø\u0001\u0000¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u0002082\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010D\u001a\u0002082\b\u0010.\u001a\u0004\u0018\u00010/J\u0010\u0010E\u001a\u0002082\b\u00105\u001a\u0004\u0018\u000106R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R,\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0000@\u0000X\u0081\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0014\n\u0000\u0012\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010&\u001a\u0012\u0012\f\u0012\n\u0018\u00010(j\u0004\u0018\u0001`)\u0018\u00010'X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u00020/8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b0\u0010\u0015\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u000e\u00105\u001a\u000206X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006F"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidTextPaint;", "Landroid/text/TextPaint;", "flags", "", "density", "", "(IF)V", "backingBlendMode", "Landroidx/compose/ui/graphics/BlendMode;", "I", "backingComposePaint", "Landroidx/compose/ui/graphics/Paint;", "value", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "brush", "Landroidx/compose/ui/graphics/Brush;", "getBrush$ui_text_release$annotations", "()V", "getBrush$ui_text_release", "()Landroidx/compose/ui/graphics/Brush;", "setBrush$ui_text_release", "(Landroidx/compose/ui/graphics/Brush;)V", "brushSize", "Landroidx/compose/ui/geometry/Size;", "getBrushSize-VsRJwc0$ui_text_release$annotations", "getBrushSize-VsRJwc0$ui_text_release", "()Landroidx/compose/ui/geometry/Size;", "setBrushSize-iaC8Vc4$ui_text_release", "(Landroidx/compose/ui/geometry/Size;)V", "composePaint", "getComposePaint", "()Landroidx/compose/ui/graphics/Paint;", "drawStyle", "Landroidx/compose/ui/graphics/drawscope/DrawStyle;", "shaderState", "Landroidx/compose/runtime/State;", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "getShaderState$ui_text_release", "()Landroidx/compose/runtime/State;", "setShaderState$ui_text_release", "(Landroidx/compose/runtime/State;)V", "shadow", "Landroidx/compose/ui/graphics/Shadow;", "getShadow$ui_text_release$annotations", "getShadow$ui_text_release", "()Landroidx/compose/ui/graphics/Shadow;", "setShadow$ui_text_release", "(Landroidx/compose/ui/graphics/Shadow;)V", "textDecoration", "Landroidx/compose/ui/text/style/TextDecoration;", "clearShader", "", "setBrush", "size", "alpha", "setBrush-12SF9DM", "(Landroidx/compose/ui/graphics/Brush;JF)V", "setColor", "color", "Landroidx/compose/ui/graphics/Color;", "setColor-8_81llA", "(J)V", "setDrawStyle", "setShadow", "setTextDecoration", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidTextPaint extends TextPaint {
    public static final int $stable = 8;
    private int backingBlendMode;
    private Paint backingComposePaint;
    private Brush brush;
    private Size brushSize;
    private DrawStyle drawStyle;
    private State<? extends Shader> shaderState;
    private Shadow shadow;
    private TextDecoration textDecoration;

    public AndroidTextPaint(int i2, float f2) {
        super(i2);
        ((TextPaint) this).density = f2;
        this.textDecoration = TextDecoration.INSTANCE.getNone();
        this.backingBlendMode = DrawScope.INSTANCE.m4344getDefaultBlendMode0nO6VwU();
        this.shadow = Shadow.INSTANCE.getNone();
    }

    private final void clearShader() {
        this.shaderState = null;
        this.brush = null;
        this.brushSize = null;
        setShader(null);
    }

    public static /* synthetic */ void getBrush$ui_text_release$annotations() {
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text_release$annotations, reason: not valid java name */
    public static /* synthetic */ void m5980getBrushSizeVsRJwc0$ui_text_release$annotations() {
    }

    private final Paint getComposePaint() {
        Paint paint = this.backingComposePaint;
        if (paint != null) {
            return paint;
        }
        Paint paintAsComposePaint = AndroidPaint_androidKt.asComposePaint(this);
        this.backingComposePaint = paintAsComposePaint;
        return paintAsComposePaint;
    }

    public static /* synthetic */ void getShadow$ui_text_release$annotations() {
    }

    /* renamed from: setBrush-12SF9DM$default, reason: not valid java name */
    public static /* synthetic */ void m5981setBrush12SF9DM$default(AndroidTextPaint androidTextPaint, Brush brush, long j2, float f2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = Float.NaN;
        }
        androidTextPaint.m5985setBrush12SF9DM(brush, j2, f2);
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name and from getter */
    public final int getBackingBlendMode() {
        return this.backingBlendMode;
    }

    /* renamed from: getBrush$ui_text_release, reason: from getter */
    public final Brush getBrush() {
        return this.brush;
    }

    /* renamed from: getBrushSize-VsRJwc0$ui_text_release, reason: not valid java name and from getter */
    public final Size getBrushSize() {
        return this.brushSize;
    }

    public final State<Shader> getShaderState$ui_text_release() {
        return this.shaderState;
    }

    /* renamed from: getShadow$ui_text_release, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m5984setBlendModes9anfk8(int i2) {
        if (BlendMode.m3703equalsimpl0(i2, this.backingBlendMode)) {
            return;
        }
        getComposePaint().mo3670setBlendModes9anfk8(i2);
        this.backingBlendMode = i2;
    }

    public final void setBrush$ui_text_release(Brush brush) {
        this.brush = brush;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* renamed from: setBrush-12SF9DM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5985setBrush12SF9DM(final androidx.compose.ui.graphics.Brush r5, final long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L6
            r4.clearShader()
            return
        L6:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.SolidColor
            if (r0 == 0) goto L18
            androidx.compose.ui.graphics.SolidColor r5 = (androidx.compose.ui.graphics.SolidColor) r5
            long r5 = r5.getValue()
            long r5 = androidx.compose.ui.text.style.TextDrawStyleKt.m6142modulateDxMtmZc(r5, r8)
            r4.m5987setColor8_81llA(r5)
            return
        L18:
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.ShaderBrush
            if (r0 == 0) goto L6a
            androidx.compose.ui.graphics.Brush r0 = r4.brush
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r5)
            r1 = 0
            if (r0 == 0) goto L35
            androidx.compose.ui.geometry.Size r0 = r4.brushSize
            if (r0 != 0) goto L2b
            r0 = r1
            goto L33
        L2b:
            long r2 = r0.getPackedValue()
            boolean r0 = androidx.compose.ui.geometry.Size.m3616equalsimpl0(r2, r6)
        L33:
            if (r0 != 0) goto L54
        L35:
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3f
            r1 = 1
        L3f:
            if (r1 == 0) goto L54
            r4.brush = r5
            androidx.compose.ui.geometry.Size r0 = androidx.compose.ui.geometry.Size.m3608boximpl(r6)
            r4.brushSize = r0
            androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1 r0 = new androidx.compose.ui.text.platform.AndroidTextPaint$setBrush$1
            r0.<init>()
            androidx.compose.runtime.State r5 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r0)
            r4.shaderState = r5
        L54:
            androidx.compose.ui.graphics.Paint r5 = r4.getComposePaint()
            androidx.compose.runtime.State<? extends android.graphics.Shader> r6 = r4.shaderState
            if (r6 == 0) goto L63
            java.lang.Object r6 = r6.getValue()
            android.graphics.Shader r6 = (android.graphics.Shader) r6
            goto L64
        L63:
            r6 = 0
        L64:
            r5.setShader(r6)
            androidx.compose.ui.text.platform.AndroidTextPaint_androidKt.setAlpha(r4, r8)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.platform.AndroidTextPaint.m5985setBrush12SF9DM(androidx.compose.ui.graphics.Brush, long, float):void");
    }

    /* renamed from: setBrushSize-iaC8Vc4$ui_text_release, reason: not valid java name */
    public final void m5986setBrushSizeiaC8Vc4$ui_text_release(Size size) {
        this.brushSize = size;
    }

    /* renamed from: setColor-8_81llA, reason: not valid java name */
    public final void m5987setColor8_81llA(long color) {
        if (color != 16) {
            setColor(ColorKt.m3846toArgb8_81llA(color));
            clearShader();
        }
    }

    public final void setDrawStyle(DrawStyle drawStyle) {
        if (drawStyle == null || Intrinsics.areEqual(this.drawStyle, drawStyle)) {
            return;
        }
        this.drawStyle = drawStyle;
        if (Intrinsics.areEqual(drawStyle, Fill.INSTANCE)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (drawStyle instanceof Stroke) {
            getComposePaint().mo3675setStylek9PVt8s(PaintingStyle.INSTANCE.m4059getStrokeTiuSbCo());
            Stroke stroke = (Stroke) drawStyle;
            getComposePaint().setStrokeWidth(stroke.getWidth());
            getComposePaint().setStrokeMiterLimit(stroke.getMiter());
            getComposePaint().mo3674setStrokeJoinWw9F2mQ(stroke.getJoin());
            getComposePaint().mo3673setStrokeCapBeK7IIE(stroke.getCap());
            getComposePaint().setPathEffect(stroke.getPathEffect());
        }
    }

    public final void setShaderState$ui_text_release(State<? extends Shader> state) {
        this.shaderState = state;
    }

    public final void setShadow(Shadow shadow) {
        if (shadow == null || Intrinsics.areEqual(this.shadow, shadow)) {
            return;
        }
        this.shadow = shadow;
        if (Intrinsics.areEqual(shadow, Shadow.INSTANCE.getNone())) {
            clearShadowLayer();
        } else {
            setShadowLayer(TextPaintExtensions_androidKt.correctBlurRadius(this.shadow.getBlurRadius()), Offset.m3551getXimpl(this.shadow.getOffset()), Offset.m3552getYimpl(this.shadow.getOffset()), ColorKt.m3846toArgb8_81llA(this.shadow.getColor()));
        }
    }

    public final void setShadow$ui_text_release(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void setTextDecoration(TextDecoration textDecoration) {
        if (textDecoration == null || Intrinsics.areEqual(this.textDecoration, textDecoration)) {
            return;
        }
        this.textDecoration = textDecoration;
        TextDecoration.Companion companion = TextDecoration.INSTANCE;
        setUnderlineText(textDecoration.contains(companion.getUnderline()));
        setStrikeThruText(this.textDecoration.contains(companion.getLineThrough()));
    }
}
