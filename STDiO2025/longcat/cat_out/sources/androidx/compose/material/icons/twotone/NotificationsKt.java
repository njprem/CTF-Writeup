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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_notifications", "Landroidx/compose/ui/graphics/vector/ImageVector;", "Notifications", "Landroidx/compose/material/icons/Icons$TwoTone;", "getNotifications", "(Landroidx/compose/material/icons/Icons$TwoTone;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NotificationsKt {
    private static ImageVector _notifications;

    public static final ImageVector getNotifications(Icons.TwoTone twoTone) {
        ImageVector imageVector = _notifications;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Notifications", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.INSTANCE;
        SolidColor solidColor = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.INSTANCE;
        int iM4144getButtKaPHkGw = companion2.m4144getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.INSTANCE;
        int iM4154getBevelLxFBmk8 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = AbstractC0783a.a(12.0f, 6.5f);
        pathBuilderA.curveToRelative(-2.49f, 0.0f, -4.0f, 2.02f, -4.0f, 4.5f);
        pathBuilderA.verticalLineToRelative(6.0f);
        pathBuilderA.horizontalLineToRelative(8.0f);
        pathBuilderA.verticalLineToRelative(-6.0f);
        pathBuilderA.curveToRelative(0.0f, -2.48f, -1.51f, -4.5f, -4.0f, -4.5f);
        pathBuilderA.close();
        builder.m4476addPathoIyEayM(pathBuilderA.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 0.3f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 0.3f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw2 = companion2.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk82 = companion3.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA2 = AbstractC0783a.a(12.0f, 22.0f);
        pathBuilderA2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        pathBuilderA2.horizontalLineToRelative(-4.0f);
        pathBuilderA2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(18.0f, 16.0f);
        pathBuilderA2.verticalLineToRelative(-5.0f);
        pathBuilderA2.curveToRelative(0.0f, -3.07f, -1.63f, -5.64f, -4.5f, -6.32f);
        pathBuilderA2.lineTo(13.5f, 4.0f);
        pathBuilderA2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        pathBuilderA2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        pathBuilderA2.verticalLineToRelative(0.68f);
        pathBuilderA2.curveTo(7.64f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        pathBuilderA2.verticalLineToRelative(5.0f);
        pathBuilderA2.lineToRelative(-2.0f, 2.0f);
        pathBuilderA2.verticalLineToRelative(1.0f);
        pathBuilderA2.horizontalLineToRelative(16.0f);
        pathBuilderA2.verticalLineToRelative(-1.0f);
        pathBuilderA2.lineToRelative(-2.0f, -2.0f);
        pathBuilderA2.close();
        pathBuilderA2.moveTo(16.0f, 17.0f);
        pathBuilderA2.lineTo(8.0f, 17.0f);
        pathBuilderA2.verticalLineToRelative(-6.0f);
        pathBuilderA2.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        pathBuilderA2.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        pathBuilderA2.verticalLineToRelative(6.0f);
        pathBuilderA2.close();
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(pathBuilderA2.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType2, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor2, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk82, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _notifications = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
