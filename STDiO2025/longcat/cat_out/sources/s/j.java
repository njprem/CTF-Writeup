package s;

import a.AbstractC0130a;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import v.k;

/* loaded from: classes.dex */
public final class j extends AbstractC0130a {
    public static Font q(FontFamily fontFamily) {
        FontStyle fontStyle = new FontStyle(400, 0);
        Font font = fontFamily.getFont(0);
        int iS = s(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int iS2 = s(fontStyle, font2.getStyle());
            if (iS2 < iS) {
                font = font2;
                iS = iS2;
            }
        }
        return font;
    }

    public static FontFamily r(k[] kVarArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (k kVar : kVarArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(kVar.f1027a, "r", null);
            } catch (IOException e2) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(kVar.f1029c).setSlant(kVar.f1030d ? 1 : 0).setTtcIndex(kVar.f1028b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    public static int s(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // a.AbstractC0130a
    public final Typeface e(Context context, r.f fVar, Resources resources) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (r.g gVar : fVar.f950a) {
                try {
                    Font fontBuild = new Font.Builder(resources, gVar.f956f).setWeight(gVar.f952b).setSlant(gVar.f953c ? 1 : 0).setTtcIndex(gVar.f955e).setFontVariationSettings(gVar.f954d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(q(fontFamilyBuild).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.AbstractC0130a
    public final Typeface f(Context context, k[] kVarArr) {
        try {
            FontFamily fontFamilyR = r(kVarArr, context.getContentResolver());
            if (fontFamilyR == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyR).setStyle(q(fontFamilyR).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.AbstractC0130a
    public final Typeface g(Context context, List list) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyR = r((k[]) list.get(0), contentResolver);
            if (fontFamilyR == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyR);
            for (int i2 = 1; i2 < list.size(); i2++) {
                FontFamily fontFamilyR2 = r((k[]) list.get(i2), contentResolver);
                if (fontFamilyR2 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyR2);
                }
            }
            return customFallbackBuilder.setStyle(q(fontFamilyR).getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.AbstractC0130a
    public final Typeface h(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // a.AbstractC0130a
    public final Typeface i(Context context, Resources resources, int i2, String str) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e2) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e2);
            return null;
        }
    }

    @Override // a.AbstractC0130a
    public final k j(k[] kVarArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
