package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\f\u0010\u0012\u001a\u00020\u0013*\u00020\u0001H\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, d2 = {"Font", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "Font-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/Font;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "Font-YpTlLL0", "(ILandroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/ui/text/font/Font;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Font-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/Font;", "toFontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontKt {
    /* renamed from: Font-F3nL8kk, reason: not valid java name */
    public static final Font m5808FontF3nL8kk(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings) {
        return new ResourceFont(i2, fontWeight, i3, settings, i4, null);
    }

    /* renamed from: Font-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ Font m5809FontF3nL8kk$default(int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i5 & 4) != 0) {
            i3 = FontStyle.INSTANCE.m5837getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            i4 = FontLoadingStrategy.INSTANCE.m5822getBlockingPKNRLFQ();
        }
        if ((i5 & 16) != 0) {
            settings = FontVariation.INSTANCE.m5852Settings6EWAqTQ(fontWeight, i3, new FontVariation.Setting[0]);
        }
        return m5808FontF3nL8kk(i2, fontWeight, i3, i4, settings);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility until Compose 1.3.", replaceWith = @ReplaceWith(expression = "Font(resId, weight, style)", imports = {}))
    /* renamed from: Font-RetOiIg, reason: not valid java name */
    public static final /* synthetic */ Font m5810FontRetOiIg(int i2, FontWeight fontWeight, int i3) {
        return new ResourceFont(i2, fontWeight, i3, null, FontLoadingStrategy.INSTANCE.m5822getBlockingPKNRLFQ(), 8, null);
    }

    /* renamed from: Font-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ Font m5811FontRetOiIg$default(int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i4 & 4) != 0) {
            i3 = FontStyle.INSTANCE.m5837getNormal_LCdwA();
        }
        return m5810FontRetOiIg(i2, fontWeight, i3);
    }

    /* renamed from: Font-YpTlLL0, reason: not valid java name */
    public static final Font m5812FontYpTlLL0(int i2, FontWeight fontWeight, int i3, int i4) {
        return new ResourceFont(i2, fontWeight, i3, new FontVariation.Settings(new FontVariation.Setting[0]), i4, null);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static /* synthetic */ Font m5813FontYpTlLL0$default(int i2, FontWeight fontWeight, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            fontWeight = FontWeight.INSTANCE.getNormal();
        }
        if ((i5 & 4) != 0) {
            i3 = FontStyle.INSTANCE.m5837getNormal_LCdwA();
        }
        if ((i5 & 8) != 0) {
            i4 = FontLoadingStrategy.INSTANCE.m5822getBlockingPKNRLFQ();
        }
        return m5812FontYpTlLL0(i2, fontWeight, i3, i4);
    }

    public static final FontFamily toFontFamily(Font font) {
        return FontFamilyKt.FontFamily(font);
    }
}
