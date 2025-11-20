package androidx.compose.ui.res;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.ImageBitmap;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.VectorPainterKt;
import androidx.compose.ui.graphics.vector.compat.XmlVectorParser_androidKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.res.ImageVectorCache;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.xmlpull.v1.XmlPullParserException;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002\u001a1\u0010\n\u001a\u00020\u000b2\n\u0010\f\u001a\u00060\rR\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"errorMessage", "", "loadImageBitmapResource", "Landroidx/compose/ui/graphics/ImageBitmap;", "path", "", "res", "Landroid/content/res/Resources;", "id", "", "loadVectorResource", "Landroidx/compose/ui/graphics/vector/ImageVector;", "theme", "Landroid/content/res/Resources$Theme;", "changingConfigurations", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "painterResource", "Landroidx/compose/ui/graphics/painter/Painter;", "(ILandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PainterResources_androidKt {
    private static final String errorMessage = "Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP";

    private static final ImageBitmap loadImageBitmapResource(CharSequence charSequence, Resources resources, int i2) {
        try {
            return ImageResources_androidKt.imageResource(ImageBitmap.INSTANCE, resources, i2);
        } catch (Exception e2) {
            throw new ResourceResolutionException("Error attempting to load resource: " + ((Object) charSequence), e2);
        }
    }

    private static final ImageVector loadVectorResource(Resources.Theme theme, Resources resources, int i2, int i3, Composer composer, int i4) throws XmlPullParserException, Resources.NotFoundException, IOException {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(21855625, i4, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:91)");
        }
        ImageVectorCache imageVectorCache = (ImageVectorCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalImageVectorCache());
        ImageVectorCache.Key key = new ImageVectorCache.Key(theme, i2);
        ImageVectorCache.ImageVectorEntry imageVectorEntryLoadVectorResourceInner = imageVectorCache.get(key);
        if (imageVectorEntryLoadVectorResourceInner == null) {
            XmlResourceParser xml = resources.getXml(i2);
            if (!Intrinsics.areEqual(XmlVectorParser_androidKt.seekToStartTag(xml).getName(), "vector")) {
                throw new IllegalArgumentException(errorMessage);
            }
            imageVectorEntryLoadVectorResourceInner = VectorResources_androidKt.loadVectorResourceInner(theme, resources, xml, i3);
            imageVectorCache.set(key, imageVectorEntryLoadVectorResourceInner);
        }
        ImageVector imageVector = imageVectorEntryLoadVectorResourceInner.getImageVector();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageVector;
    }

    public static final Painter painterResource(int i2, Composer composer, int i3) {
        Painter painterRememberVectorPainter;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(473971343, i3, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:57)");
        }
        Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = context.getResources();
        TypedValue typedValueResolveResourcePath = ((ResourceIdCache) composer.consume(AndroidCompositionLocals_androidKt.getLocalResourceIdCache())).resolveResourcePath(resources, i2);
        CharSequence charSequence = typedValueResolveResourcePath.string;
        boolean z = true;
        if (charSequence == null || !StringsKt__StringsKt.endsWith$default(charSequence, (CharSequence) ".xml", false, 2, (Object) null)) {
            composer.startReplaceGroup(-802884675);
            Object theme = context.getTheme();
            boolean zChanged = composer.changed(charSequence);
            if ((((i3 & 14) ^ 6) <= 4 || !composer.changed(i2)) && (i3 & 6) != 4) {
                z = false;
            }
            boolean zChanged2 = composer.changed(theme) | zChanged | z;
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = loadImageBitmapResource(charSequence, resources, i2);
                composer.updateRememberedValue(objRememberedValue);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((ImageBitmap) objRememberedValue, 0L, 0L, 6, null);
            composer.endReplaceGroup();
            painterRememberVectorPainter = bitmapPainter;
        } else {
            composer.startReplaceGroup(-803040357);
            painterRememberVectorPainter = VectorPainterKt.rememberVectorPainter(loadVectorResource(context.getTheme(), resources, i2, typedValueResolveResourcePath.changingConfigurations, composer, (i3 << 6) & 896), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return painterRememberVectorPainter;
    }
}
