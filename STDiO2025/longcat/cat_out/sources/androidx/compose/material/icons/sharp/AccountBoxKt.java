package androidx.compose.material.icons.sharp;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_accountBox", "Landroidx/compose/ui/graphics/vector/ImageVector;", "AccountBox", "Landroidx/compose/material/icons/Icons$Sharp;", "getAccountBox", "(Landroidx/compose/material/icons/Icons$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.Sharp sharp) {
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AccountBox", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(21.0f, 3.0f);
        pathBuilder.horizontalLineTo(3.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.verticalLineTo(3.0f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 6.0f);
        pathBuilder.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 19.0f);
        pathBuilder.horizontalLineTo(5.0f);
        pathBuilder.verticalLineToRelative(-0.23f);
        pathBuilder.curveToRelative(0.0f, -0.62f, 0.28f, -1.2f, 0.76f, -1.58f);
        pathBuilder.curveTo(7.47f, 15.82f, 9.64f, 15.0f, 12.0f, 15.0f);
        pathBuilder.reflectiveCurveToRelative(4.53f, 0.82f, 6.24f, 2.19f);
        pathBuilder.curveToRelative(0.48f, 0.38f, 0.76f, 0.97f, 0.76f, 1.58f);
        pathBuilder.verticalLineTo(19.0f);
        pathBuilder.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _accountBox = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
