package androidx.compose.material.icons.twotone;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_star", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Star", "Landroidx/compose/material/icons/Icons$TwoTone;", "getStar", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StarKt {
    private static ImageVector _star;

    public static final ImageVector getStar(Icons.TwoTone twoTone) {
        ImageVector imageVector = _star;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Star", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM4144getButtKaPHkGw = companion2.m4144getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM4154getBevelLxFBmk8 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderG = a.g(12.0f, 15.4f, -3.76f, 2.27f);
        pathBuilderG.lineToRelative(1.0f, -4.28f);
        pathBuilderG.lineToRelative(-3.32f, -2.88f);
        pathBuilderG.lineToRelative(4.38f, -0.38f);
        pathBuilderG.lineToRelative(1.7f, -4.03f);
        pathBuilderG.lineToRelative(1.71f, 4.04f);
        pathBuilderG.lineToRelative(4.38f, 0.38f);
        builder.m4476addPathoIyEayM(a.t(pathBuilderG, -3.32f, 2.88f, 1.0f, 4.28f), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw2 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk82 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderG2 = a.g(22.0f, 9.24f, -7.19f, -0.62f);
        pathBuilderG2.lineTo(12.0f, 2.0f);
        pathBuilderG2.lineTo(9.19f, 8.63f);
        pathBuilderG2.lineTo(2.0f, 9.24f);
        pathBuilderG2.lineToRelative(5.46f, 4.73f);
        pathBuilderG2.lineTo(5.82f, 21.0f);
        pathBuilderG2.lineTo(12.0f, 17.27f);
        pathBuilderG2.lineTo(18.18f, 21.0f);
        pathBuilderG2.lineToRelative(-1.63f, -7.03f);
        pathBuilderG2.lineTo(22.0f, 9.24f);
        pathBuilderG2.close();
        pathBuilderG2.moveTo(12.0f, 15.4f);
        pathBuilderG2.lineToRelative(-3.76f, 2.27f);
        pathBuilderG2.lineToRelative(1.0f, -4.28f);
        pathBuilderG2.lineToRelative(-3.32f, -2.88f);
        pathBuilderG2.lineToRelative(4.38f, -0.38f);
        pathBuilderG2.lineTo(12.0f, 6.1f);
        pathBuilderG2.lineToRelative(1.71f, 4.04f);
        pathBuilderG2.lineToRelative(4.38f, 0.38f);
        pathBuilderG2.lineToRelative(-3.32f, 2.88f);
        pathBuilderG2.lineToRelative(1.0f, 4.28f);
        pathBuilderG2.lineTo(12.0f, 15.4f);
        pathBuilderG2.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderG2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk82, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _star = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
