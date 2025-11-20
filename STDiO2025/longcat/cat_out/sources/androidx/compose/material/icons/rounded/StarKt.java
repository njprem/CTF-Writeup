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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$Rounded;", "getStar", "(Landroidx/compose/material/icons/Icons$Rounded;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(Icons.Rounded rounded) {
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Star", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderG = a.g(12.0f, 17.27f, 4.15f, 2.51f);
        pathBuilderG.curveToRelative(0.76f, 0.46f, 1.69f, -0.22f, 1.49f, -1.08f);
        pathBuilderG.lineToRelative(-1.1f, -4.72f);
        pathBuilderG.lineToRelative(3.67f, -3.18f);
        pathBuilderG.curveToRelative(0.67f, -0.58f, 0.31f, -1.68f, -0.57f, -1.75f);
        pathBuilderG.lineToRelative(-4.83f, -0.41f);
        pathBuilderG.lineToRelative(-1.89f, -4.46f);
        pathBuilderG.curveToRelative(-0.34f, -0.81f, -1.5f, -0.81f, -1.84f, 0.0f);
        pathBuilderG.lineTo(9.19f, 8.63f);
        pathBuilderG.lineTo(4.36f, 9.04f);
        pathBuilderG.curveToRelative(-0.88f, 0.07f, -1.24f, 1.17f, -0.57f, 1.75f);
        pathBuilderG.lineToRelative(3.67f, 3.18f);
        pathBuilderG.lineToRelative(-1.1f, 4.72f);
        pathBuilderG.curveToRelative(-0.2f, 0.86f, 0.73f, 1.54f, 1.49f, 1.08f);
        pathBuilderG.lineTo(12.0f, 17.27f);
        pathBuilderG.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderG.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _star = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
