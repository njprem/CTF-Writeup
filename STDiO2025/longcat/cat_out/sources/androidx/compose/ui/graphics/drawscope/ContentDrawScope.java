package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.DpRect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawContent", "", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface ContentDrawScope extends DrawScope {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: drawImage-AZ2fEMs, reason: not valid java name */
        public static void m4288drawImageAZ2fEMs(ContentDrawScope contentDrawScope, ImageBitmap imageBitmap, long j2, long j3, long j4, long j5, float f2, DrawStyle drawStyle, ColorFilter colorFilter, int i2, int i3) {
            ContentDrawScope.super.mo4244drawImageAZ2fEMs(imageBitmap, j2, j3, j4, j5, f2, drawStyle, colorFilter, i2, i3);
        }

        @Deprecated
        /* renamed from: getCenter-F1C5BW0, reason: not valid java name */
        public static long m4289getCenterF1C5BW0(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4341getCenterF1C5BW0();
        }

        @Deprecated
        /* renamed from: getSize-NH-jbRc, reason: not valid java name */
        public static long m4290getSizeNHjbRc(ContentDrawScope contentDrawScope) {
            return ContentDrawScope.super.mo4342getSizeNHjbRc();
        }

        @Deprecated
        /* renamed from: record-JVtK1S4, reason: not valid java name */
        public static void m4291recordJVtK1S4(ContentDrawScope contentDrawScope, GraphicsLayer graphicsLayer, long j2, Function1<? super DrawScope, Unit> function1) {
            ContentDrawScope.super.mo4343recordJVtK1S4(graphicsLayer, j2, function1);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m4292roundToPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo327roundToPxR2X_6o(j2);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m4293roundToPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo328roundToPx0680j_4(f2);
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m4294toDpGaN1DYA(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo329toDpGaN1DYA(j2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4295toDpu2uoSUM(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo330toDpu2uoSUM(f2);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m4297toDpSizekrfVVM(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo332toDpSizekrfVVM(j2);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m4298toPxR2X_6o(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo333toPxR2X_6o(j2);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m4299toPx0680j_4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo334toPx0680j_4(f2);
        }

        @Deprecated
        public static Rect toRect(ContentDrawScope contentDrawScope, DpRect dpRect) {
            return ContentDrawScope.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m4300toSizeXkaWNTQ(ContentDrawScope contentDrawScope, long j2) {
            return ContentDrawScope.super.mo335toSizeXkaWNTQ(j2);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m4301toSp0xMU5do(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo336toSp0xMU5do(f2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4302toSpkPz2Gy4(ContentDrawScope contentDrawScope, float f2) {
            return ContentDrawScope.super.mo337toSpkPz2Gy4(f2);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m4296toDpu2uoSUM(ContentDrawScope contentDrawScope, int i2) {
            return ContentDrawScope.super.mo331toDpu2uoSUM(i2);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m4303toSpkPz2Gy4(ContentDrawScope contentDrawScope, int i2) {
            return ContentDrawScope.super.mo338toSpkPz2Gy4(i2);
        }
    }

    void drawContent();
}
