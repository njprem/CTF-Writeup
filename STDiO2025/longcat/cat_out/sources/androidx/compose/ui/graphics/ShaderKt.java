package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\u001a0\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aN\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001aN\u0010\u0016\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00122\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a<\u0010\u001b\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0017\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000fø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"ImageShader", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "image", "Landroidx/compose/ui/graphics/ImageBitmap;", "tileModeX", "Landroidx/compose/ui/graphics/TileMode;", "tileModeY", "ImageShader-F49vj9s", "(Landroidx/compose/ui/graphics/ImageBitmap;II)Landroid/graphics/Shader;", "LinearGradientShader", "from", "Landroidx/compose/ui/geometry/Offset;", "to", "colors", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "tileMode", "LinearGradientShader-VjE6UOU", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "RadialGradientShader", "center", "radius", "RadialGradientShader-8uybcMk", "(JFLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "SweepGradientShader", "SweepGradientShader-9KIMszo", "(JLjava/util/List;Ljava/util/List;)Landroid/graphics/Shader;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ShaderKt {
    /* renamed from: ImageShader-F49vj9s, reason: not valid java name */
    public static final Shader m4104ImageShaderF49vj9s(ImageBitmap imageBitmap, int i2, int i3) {
        return AndroidShader_androidKt.m3692ActualImageShaderF49vj9s(imageBitmap, i2, i3);
    }

    /* renamed from: ImageShader-F49vj9s$default, reason: not valid java name */
    public static /* synthetic */ Shader m4105ImageShaderF49vj9s$default(ImageBitmap imageBitmap, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            i2 = TileMode.INSTANCE.m4164getClamp3opZhB0();
        }
        if ((i4 & 4) != 0) {
            i3 = TileMode.INSTANCE.m4164getClamp3opZhB0();
        }
        return m4104ImageShaderF49vj9s(imageBitmap, i2, i3);
    }

    /* renamed from: LinearGradientShader-VjE6UOU, reason: not valid java name */
    public static final Shader m4106LinearGradientShaderVjE6UOU(long j2, long j3, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m3693ActualLinearGradientShaderVjE6UOU(j2, j3, list, list2, i2);
    }

    /* renamed from: LinearGradientShader-VjE6UOU$default, reason: not valid java name */
    public static /* synthetic */ Shader m4107LinearGradientShaderVjE6UOU$default(long j2, long j3, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i3 & 16) != 0) {
            i2 = TileMode.INSTANCE.m4164getClamp3opZhB0();
        }
        return m4106LinearGradientShaderVjE6UOU(j2, j3, list, list3, i2);
    }

    /* renamed from: RadialGradientShader-8uybcMk, reason: not valid java name */
    public static final Shader m4108RadialGradientShader8uybcMk(long j2, float f2, List<Color> list, List<Float> list2, int i2) {
        return AndroidShader_androidKt.m3694ActualRadialGradientShader8uybcMk(j2, f2, list, list2, i2);
    }

    /* renamed from: RadialGradientShader-8uybcMk$default, reason: not valid java name */
    public static /* synthetic */ Shader m4109RadialGradientShader8uybcMk$default(long j2, float f2, List list, List list2, int i2, int i3, Object obj) {
        if ((i3 & 8) != 0) {
            list2 = null;
        }
        List list3 = list2;
        if ((i3 & 16) != 0) {
            i2 = TileMode.INSTANCE.m4164getClamp3opZhB0();
        }
        return m4108RadialGradientShader8uybcMk(j2, f2, list, list3, i2);
    }

    /* renamed from: SweepGradientShader-9KIMszo, reason: not valid java name */
    public static final Shader m4110SweepGradientShader9KIMszo(long j2, List<Color> list, List<Float> list2) {
        return AndroidShader_androidKt.m3695ActualSweepGradientShader9KIMszo(j2, list, list2);
    }

    /* renamed from: SweepGradientShader-9KIMszo$default, reason: not valid java name */
    public static /* synthetic */ Shader m4111SweepGradientShader9KIMszo$default(long j2, List list, List list2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            list2 = null;
        }
        return m4110SweepGradientShader9KIMszo(j2, list, list2);
    }
}
