package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.FontVariation;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B7\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0003\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\u0003H\u0016J\b\u0010\"\u001a\u00020#H\u0016R$\u0010\n\u001a\u00020\u000b8WX\u0097\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\u0011\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u0007X\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\b\u001a\u00020\t8\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006$"}, d2 = {"Landroidx/compose/ui/text/font/ResourceFont;", "Landroidx/compose/ui/text/font/Font;", "resId", "", "weight", "Landroidx/compose/ui/text/font/FontWeight;", "style", "Landroidx/compose/ui/text/font/FontStyle;", "variationSettings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "loadingStrategy", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "(ILandroidx/compose/ui/text/font/FontWeight;ILandroidx/compose/ui/text/font/FontVariation$Settings;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getLoadingStrategy-PKNRLFQ$annotations", "()V", "getLoadingStrategy-PKNRLFQ", "()I", "I", "getResId", "getStyle-_-LCdwA", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "getWeight", "()Landroidx/compose/ui/text/font/FontWeight;", "copy", "copy-RetOiIg", "(ILandroidx/compose/ui/text/font/FontWeight;I)Landroidx/compose/ui/text/font/ResourceFont;", "copy-F3nL8kk", "(ILandroidx/compose/ui/text/font/FontWeight;IILandroidx/compose/ui/text/font/FontVariation$Settings;)Landroidx/compose/ui/text/font/ResourceFont;", "equals", "", "other", "", "hashCode", "toString", "", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ResourceFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final int resId;
    private final int style;
    private final FontVariation.Settings variationSettings;
    private final FontWeight weight;

    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, fontWeight, i3, settings, i4);
    }

    /* renamed from: copy-F3nL8kk$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m5866copyF3nL8kk$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, FontVariation.Settings settings, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i5 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i5 & 4) != 0) {
            i3 = resourceFont.getStyle();
        }
        if ((i5 & 8) != 0) {
            i4 = resourceFont.getLoadingStrategy();
        }
        if ((i5 & 16) != 0) {
            settings = resourceFont.variationSettings;
        }
        FontVariation.Settings settings2 = settings;
        int i6 = i3;
        return resourceFont.m5869copyF3nL8kk(i2, fontWeight, i6, i4, settings2);
    }

    /* renamed from: copy-RetOiIg$default, reason: not valid java name */
    public static /* synthetic */ ResourceFont m5867copyRetOiIg$default(ResourceFont resourceFont, int i2, FontWeight fontWeight, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = resourceFont.resId;
        }
        if ((i4 & 2) != 0) {
            fontWeight = resourceFont.getWeight();
        }
        if ((i4 & 4) != 0) {
            i3 = resourceFont.getStyle();
        }
        return resourceFont.m5870copyRetOiIg(i2, fontWeight, i3);
    }

    /* renamed from: getLoadingStrategy-PKNRLFQ$annotations, reason: not valid java name */
    public static /* synthetic */ void m5868getLoadingStrategyPKNRLFQ$annotations() {
    }

    /* renamed from: copy-F3nL8kk, reason: not valid java name */
    public final ResourceFont m5869copyF3nL8kk(int resId, FontWeight weight, int style, int loadingStrategy, FontVariation.Settings variationSettings) {
        return new ResourceFont(resId, weight, style, variationSettings, loadingStrategy, null);
    }

    /* renamed from: copy-RetOiIg, reason: not valid java name */
    public final ResourceFont m5870copyRetOiIg(int resId, FontWeight weight, int style) {
        return m5866copyF3nL8kk$default(this, resId, weight, style, getLoadingStrategy(), null, 16, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResourceFont)) {
            return false;
        }
        ResourceFont resourceFont = (ResourceFont) other;
        return this.resId == resourceFont.resId && Intrinsics.areEqual(getWeight(), resourceFont.getWeight()) && FontStyle.m5830equalsimpl0(getStyle(), resourceFont.getStyle()) && Intrinsics.areEqual(this.variationSettings, resourceFont.variationSettings) && FontLoadingStrategy.m5817equalsimpl0(getLoadingStrategy(), resourceFont.getLoadingStrategy());
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: from getter */
    public int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    public final int getResId() {
        return this.resId;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: from getter */
    public int getStyle() {
        return this.style;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    public FontWeight getWeight() {
        return this.weight;
    }

    public int hashCode() {
        return this.variationSettings.hashCode() + ((FontLoadingStrategy.m5818hashCodeimpl(getLoadingStrategy()) + ((FontStyle.m5831hashCodeimpl(getStyle()) + ((getWeight().hashCode() + (this.resId * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ResourceFont(resId=" + this.resId + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m5832toStringimpl(getStyle())) + ", loadingStrategy=" + ((Object) FontLoadingStrategy.m5819toStringimpl(getLoadingStrategy())) + ')';
    }

    private ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4) {
        this.resId = i2;
        this.weight = fontWeight;
        this.style = i3;
        this.variationSettings = settings;
        this.loadingStrategy = i4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ResourceFont(int i2, FontWeight fontWeight, int i3, FontVariation.Settings settings, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        FontWeight normal = (i5 & 2) != 0 ? FontWeight.INSTANCE.getNormal() : fontWeight;
        int iM5837getNormal_LCdwA = (i5 & 4) != 0 ? FontStyle.INSTANCE.m5837getNormal_LCdwA() : i3;
        this(i2, normal, iM5837getNormal_LCdwA, (i5 & 8) != 0 ? FontVariation.INSTANCE.m5852Settings6EWAqTQ(normal, iM5837getNormal_LCdwA, new FontVariation.Setting[0]) : settings, (i5 & 16) != 0 ? FontLoadingStrategy.INSTANCE.m5821getAsyncPKNRLFQ() : i4, null);
    }
}
