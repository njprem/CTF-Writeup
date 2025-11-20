package androidx.compose.material.icons.automirrored.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.changelist.a;
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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_exitToApp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ExitToApp", "Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;", "getExitToApp", "(Landroidx/compose/material/icons/Icons$AutoMirrored$Sharp;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ExitToAppKt {
    private static ImageVector _exitToApp;

    public static final ImageVector getExitToApp(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _exitToApp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.ExitToApp", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.A(10.09f, 15.59f, 11.5f, 17.0f);
        pathBuilderA.lineToRelative(5.0f, -5.0f);
        pathBuilderA.lineToRelative(-5.0f, -5.0f);
        pathBuilderA.lineToRelative(-1.41f, 1.41f);
        pathBuilderA.lineTo(12.67f, 11.0f);
        pathBuilderA.horizontalLineTo(3.0f);
        pathBuilderA.verticalLineToRelative(2.0f);
        pathBuilderA.horizontalLineToRelative(9.67f);
        pathBuilderA.lineToRelative(-2.58f, 2.59f);
        pathBuilderA.close();
        pathBuilderA.moveTo(21.0f, 3.0f);
        pathBuilderA.horizontalLineTo(3.0f);
        pathBuilderA.verticalLineToRelative(6.0f);
        pathBuilderA.horizontalLineToRelative(2.0f);
        pathBuilderA.verticalLineTo(5.0f);
        pathBuilderA.horizontalLineToRelative(14.0f);
        pathBuilderA.verticalLineToRelative(14.0f);
        pathBuilderA.horizontalLineTo(5.0f);
        pathBuilderA.verticalLineToRelative(-4.0f);
        pathBuilderA.horizontalLineTo(3.0f);
        pathBuilderA.verticalLineToRelative(6.0f);
        pathBuilderA.horizontalLineToRelative(18.0f);
        pathBuilderA.verticalLineTo(3.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _exitToApp = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
