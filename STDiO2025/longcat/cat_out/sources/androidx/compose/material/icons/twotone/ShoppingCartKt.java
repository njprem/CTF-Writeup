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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_shoppingCart", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ShoppingCart", "Landroidx/compose/material/icons/Icons$TwoTone;", "getShoppingCart", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShoppingCartKt {
    private static ImageVector _shoppingCart;

    public static final ImageVector getShoppingCart(Icons.TwoTone twoTone) {
        ImageVector imageVector = _shoppingCart;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.ShoppingCart", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM4144getButtKaPHkGw = companion2.m4144getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM4154getBevelLxFBmk8 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(15.55f, 11.0f);
        pathBuilder.lineToRelative(2.76f, -5.0f);
        pathBuilder.horizontalLineTo(6.16f);
        pathBuilder.lineToRelative(2.37f, 5.0f);
        pathBuilder.close();
        builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw2 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk82 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = AbstractC0783a.a(15.55f, 13.0f);
        pathBuilderA.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        pathBuilderA.lineToRelative(3.58f, -6.49f);
        pathBuilderA.curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f);
        pathBuilderA.lineTo(5.21f, 4.0f);
        pathBuilderA.lineToRelative(-0.94f, -2.0f);
        pathBuilderA.lineTo(1.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.lineToRelative(3.6f, 7.59f);
        pathBuilderA.lineToRelative(-1.35f, 2.44f);
        pathBuilderA.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        pathBuilderA.horizontalLineToRelative(12.0f);
        pathBuilderA.verticalLineToRelative(-2.0f);
        pathBuilderA.lineTo(7.0f, 15.0f);
        pathBuilderA.lineToRelative(1.1f, -2.0f);
        pathBuilderA.horizontalLineToRelative(7.45f);
        pathBuilderA.close();
        pathBuilderA.moveTo(6.16f, 6.0f);
        pathBuilderA.horizontalLineToRelative(12.15f);
        pathBuilderA.lineToRelative(-2.76f, 5.0f);
        pathBuilderA.lineTo(8.53f, 11.0f);
        pathBuilderA.lineTo(6.16f, 6.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(7.0f, 18.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.close();
        pathBuilderA.moveTo(17.0f, 18.0f);
        pathBuilderA.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        pathBuilderA.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(AbstractC0783a.b(pathBuilderA, -0.9f, -2.0f, -2.0f, -2.0f), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk82, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _shoppingCart = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
