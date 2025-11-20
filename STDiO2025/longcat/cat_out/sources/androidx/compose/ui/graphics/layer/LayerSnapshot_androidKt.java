package androidx.compose.ui.graphics.layer;

import android.graphics.Bitmap;
import android.media.Image;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toBitmap", "Landroid/graphics/Bitmap;", "Landroid/media/Image;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LayerSnapshot_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap toBitmap(Image image) {
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNull(planes);
        Image.Plane plane = planes[0];
        int height = image.getHeight() * image.getWidth();
        int[] iArr = new int[height];
        plane.getBuffer().asIntBuffer().get(iArr);
        for (int i2 = 0; i2 < height; i2++) {
            int i3 = iArr[i2];
            iArr[i2] = ColorKt.m3846toArgb8_81llA(ColorKt.Color(i3 & 255, (i3 >> 8) & 255, (i3 >> 16) & 255, (i3 >> 24) & 255));
        }
        return Bitmap.createBitmap(iArr, image.getWidth(), image.getHeight(), Bitmap.Config.ARGB_8888);
    }
}
