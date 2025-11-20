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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountBox", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBox", "Landroidx/compose/material/icons/Icons$TwoTone;", "getAccountBox", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.TwoTone twoTone) {
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AccountBox", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM4144getButtKaPHkGw = companion2.m4144getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM4154getBevelLxFBmk8 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = AbstractC0783a.a(5.0f, 17.86f);
        pathBuilderA.curveTo(6.8f, 16.09f, 9.27f, 15.0f, 12.0f, 15.0f);
        pathBuilderA.reflectiveCurveToRelative(5.2f, 1.09f, 7.0f, 2.86f);
        pathBuilderA.verticalLineTo(5.0f);
        pathBuilderA.horizontalLineTo(5.0f);
        pathBuilderA.verticalLineTo(17.86f);
        pathBuilderA.close();
        pathBuilderA.moveTo(12.0f, 6.0f);
        pathBuilderA.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilderA.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        pathBuilderA.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilderA.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilderA.close();
        builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw2 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk82 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.0f, 3.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        pathBuilder.verticalLineToRelative(14.0f);
        pathBuilder.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 19.0f);
        pathBuilder.horizontalLineTo(7.0f);
        pathBuilder.verticalLineToRelative(-0.24f);
        pathBuilder.curveTo(8.42f, 17.62f, 10.16f, 17.0f, 12.0f, 17.0f);
        pathBuilder.reflectiveCurveToRelative(3.58f, 0.62f, 5.0f, 1.76f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 17.86f);
        pathBuilder.curveTo(17.2f, 16.09f, 14.73f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(-5.2f, 1.09f, -7.0f, 2.86f);
        pathBuilder.verticalLineTo(5.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineTo(17.86f);
        pathBuilder.close();
        builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk82, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw3 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk83 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = AbstractC0783a.a(12.0f, 13.0f);
        pathBuilderA2.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        pathBuilderA2.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        pathBuilderA2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        pathBuilderA2.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(12.0f, 8.0f);
        pathBuilderA2.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        pathBuilderA2.reflectiveCurveTo(12.83f, 11.0f, 12.0f, 11.0f);
        pathBuilderA2.reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f);
        pathBuilderA2.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderA2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType3, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor3, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw3, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk83, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _accountBox = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
