package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0783a;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_face", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Face", "Landroidx/compose/material/icons/Icons$TwoTone;", "getFace", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FaceKt {
    private static ImageVector _face;

    public static final ImageVector getFace(Icons.TwoTone twoTone) {
        ImageVector imageVector = _face;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Face", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM4144getButtKaPHkGw = companion2.m4144getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM4154getBevelLxFBmk8 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = AbstractC0783a.a(17.5f, 8.0f);
        pathBuilderA.curveToRelative(0.46f, 0.0f, 0.91f, -0.05f, 1.34f, -0.12f);
        pathBuilderA.curveTo(17.44f, 5.56f, 14.9f, 4.0f, 12.0f, 4.0f);
        pathBuilderA.curveToRelative(-0.46f, 0.0f, -0.91f, 0.05f, -1.34f, 0.12f);
        pathBuilderA.curveTo(12.06f, 6.44f, 14.6f, 8.0f, 17.5f, 8.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(8.08f, 5.03f);
        pathBuilderA.curveTo(6.37f, 6.0f, 5.05f, 7.58f, 4.42f, 9.47f);
        pathBuilderA.curveToRelative(1.71f, -0.97f, 3.03f, -2.55f, 3.66f, -4.44f);
        pathBuilderA.close();
        builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw2 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk82 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = AbstractC0783a.a(12.0f, 2.0f);
        pathBuilderA2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        pathBuilderA2.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        pathBuilderA2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        pathBuilderA2.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(12.0f, 4.0f);
        pathBuilderA2.curveToRelative(2.9f, 0.0f, 5.44f, 1.56f, 6.84f, 3.88f);
        pathBuilderA2.curveToRelative(-0.43f, 0.07f, -0.88f, 0.12f, -1.34f, 0.12f);
        pathBuilderA2.curveToRelative(-2.9f, 0.0f, -5.44f, -1.56f, -6.84f, -3.88f);
        pathBuilderA2.curveToRelative(0.43f, -0.07f, 0.88f, -0.12f, 1.34f, -0.12f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(8.08f, 5.03f);
        pathBuilderA2.curveTo(7.45f, 6.92f, 6.13f, 8.5f, 4.42f, 9.47f);
        pathBuilderA2.curveTo(5.05f, 7.58f, 6.37f, 6.0f, 8.08f, 5.03f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(12.0f, 20.0f);
        pathBuilderA2.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        pathBuilderA2.curveToRelative(0.0f, -0.05f, 0.01f, -0.1f, 0.01f, -0.15f);
        pathBuilderA2.curveToRelative(2.6f, -0.98f, 4.68f, -2.99f, 5.74f, -5.55f);
        pathBuilderA2.curveToRelative(1.83f, 2.26f, 4.62f, 3.7f, 7.75f, 3.7f);
        pathBuilderA2.curveToRelative(0.75f, 0.0f, 1.47f, -0.09f, 2.17f, -0.24f);
        pathBuilderA2.curveToRelative(0.21f, 0.71f, 0.33f, 1.46f, 0.33f, 2.24f);
        pathBuilderA2.curveToRelative(0.0f, 4.41f, -3.59f, 8.0f, -8.0f, 8.0f);
        pathBuilderA2.close();
        builder.m4476addPathoIyEayM(pathBuilderA2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk82, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw3 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk83 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 13.0f);
        pathBuilder.moveToRelative(-1.25f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor3, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw3, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk83, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType4 = VectorKt.getDefaultFillType();
        SolidColor solidColor4 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw4 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk84 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(15.0f, 13.0f);
        pathBuilder2.moveToRelative(-1.25f, 0.0f);
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, 2.5f, 0.0f);
        pathBuilder2.arcToRelative(1.25f, 1.25f, 0.0f, true, true, -2.5f, 0.0f);
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilder2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType4, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor4, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw4, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk84, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _face = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
