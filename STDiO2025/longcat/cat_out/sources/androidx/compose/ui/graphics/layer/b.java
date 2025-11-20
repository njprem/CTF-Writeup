package androidx.compose.ui.graphics.layer;

import android.media.ImageReader;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ImageReader.OnImageAvailableListener {
    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(ImageReader imageReader) {
        LayerManager.persistLayers$lambda$3$lambda$2(imageReader);
    }
}
