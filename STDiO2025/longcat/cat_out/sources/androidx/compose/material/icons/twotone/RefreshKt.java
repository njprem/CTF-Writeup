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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_refresh", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Refresh", "Landroidx/compose/material/icons/Icons$TwoTone;", "getRefresh", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RefreshKt {
    private static ImageVector _refresh;

    public static final ImageVector getRefresh(Icons.TwoTone twoTone) {
        ImageVector imageVector = _refresh;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Refresh", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = AbstractC0783a.a(17.65f, 6.35f);
        pathBuilderA.curveTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        pathBuilderA.curveToRelative(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        pathBuilderA.reflectiveCurveToRelative(3.57f, 8.0f, 7.99f, 8.0f);
        pathBuilderA.curveToRelative(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        pathBuilderA.horizontalLineToRelative(-2.08f);
        pathBuilderA.curveToRelative(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        pathBuilderA.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilderA.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilderA.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        pathBuilderA.lineTo(13.0f, 11.0f);
        pathBuilderA.horizontalLineToRelative(7.0f);
        pathBuilderA.verticalLineTo(4.0f);
        pathBuilderA.lineToRelative(-2.35f, 2.35f);
        pathBuilderA.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _refresh = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
