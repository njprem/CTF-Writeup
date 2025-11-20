package androidx.compose.material.icons.rounded;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_thumbUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "ThumbUp", "Landroidx/compose/material/icons/Icons$Rounded;", "getThumbUp", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ThumbUpKt {
    private static ImageVector _thumbUp;

    public static final ImageVector getThumbUp(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbUp", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.A(13.12f, 2.06f, 7.58f, 7.6f);
        pathBuilderA.curveToRelative(-0.37f, 0.37f, -0.58f, 0.88f, -0.58f, 1.41f);
        pathBuilderA.verticalLineTo(19.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.horizontalLineToRelative(9.0f);
        pathBuilderA.curveToRelative(0.8f, 0.0f, 1.52f, -0.48f, 1.84f, -1.21f);
        pathBuilderA.lineToRelative(3.26f, -7.61f);
        pathBuilderA.curveTo(23.94f, 10.2f, 22.49f, 8.0f, 20.34f, 8.0f);
        pathBuilderA.horizontalLineToRelative(-5.65f);
        pathBuilderA.lineToRelative(0.95f, -4.58f);
        pathBuilderA.curveToRelative(0.1f, -0.5f, -0.05f, -1.01f, -0.41f, -1.37f);
        pathBuilderA.curveToRelative(-0.59f, -0.58f, -1.53f, -0.58f, -2.11f, 0.01f);
        pathBuilderA.close();
        pathBuilderA.moveTo(3.0f, 21.0f);
        pathBuilderA.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA.verticalLineToRelative(-8.0f);
        pathBuilderA.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        pathBuilderA.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        pathBuilderA.verticalLineToRelative(8.0f);
        pathBuilderA.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _thumbUp = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
