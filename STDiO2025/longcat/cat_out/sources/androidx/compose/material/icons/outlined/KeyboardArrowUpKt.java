package androidx.compose.material.icons.outlined;

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

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000\"\u0015\u0010\u0002\u001a\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"_keyboardArrowUp", "Landroidx/compose/ui/graphics/vector/ImageVector;", "KeyboardArrowUp", "Landroidx/compose/material/icons/Icons$Outlined;", "getKeyboardArrowUp", "(Landroidx/compose/material/icons/Icons$Outlined;)Landroidx/compose/ui/graphics/vector/ImageVector;", "material-icons-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class KeyboardArrowUpKt {
    private static ImageVector _keyboardArrowUp;

    public static final ImageVector getKeyboardArrowUp(Icons.Outlined outlined) {
        ImageVector imageVector = _keyboardArrowUp;
        if (imageVector != null) {
            Intrinsics.checkNotNull(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.KeyboardArrowUp", Dp.m6233constructorimpl(24.0f), Dp.m6233constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.INSTANCE.m3818getBlack0d7_KjU(), null);
        int iM4144getButtKaPHkGw = StrokeCap.INSTANCE.m4144getButtKaPHkGw();
        int iM4154getBevelLxFBmk8 = StrokeJoin.INSTANCE.m4154getBevelLxFBmk8();
        PathBuilder pathBuilderA = a.A(7.41f, 15.41f, 12.0f, 10.83f);
        pathBuilderA.lineToRelative(4.59f, 4.58f);
        pathBuilderA.lineTo(18.0f, 14.0f);
        pathBuilderA.lineToRelative(-6.0f, -6.0f);
        ImageVector imageVectorBuild = builder.m4476addPathoIyEayM(a.t(pathBuilderA, -6.0f, 6.0f, 1.41f, 1.41f), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : "", (14336 & 8) != 0 ? null : solidColor, (14336 & 16) != 0 ? 1.0f : 1.0f, (14336 & 32) == 0 ? null : null, (14336 & 64) != 0 ? 1.0f : 1.0f, (14336 & 128) != 0 ? 0.0f : 1.0f, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : iM4144getButtKaPHkGw, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : iM4154getBevelLxFBmk8, (14336 & 1024) != 0 ? 4.0f : 1.0f, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f).build();
        _keyboardArrowUp = imageVectorBuild;
        Intrinsics.checkNotNull(imageVectorBuild);
        return imageVectorBuild;
    }
}
