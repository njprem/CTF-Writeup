package androidx.compose.ui.graphics.vector.compat;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.compose.runtime.changelist.a;
import androidx.compose.ui.graphics.vector.PathParser;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import r.b;
import r.c;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ3\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J/\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020!¢\u0006\u0004\b\"\u0010#J%\u0010%\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001e¢\u0006\u0004\b%\u0010&J%\u0010'\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010,\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u001e¢\u0006\u0004\b,\u0010&J?\u0010.\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u00042\b\b\u0001\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J7\u00101\u001a\u0004\u0018\u0001002\u0006\u0010\u0017\u001a\u00020\u00142\f\u0010\u000f\u001a\b\u0018\u00010\u000eR\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b5\u00106J$\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b;\u00106J\u001a\u0010=\u001a\u00020!2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u00104R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u00106\"\u0004\bC\u0010\u000bR\u0014\u0010E\u001a\u00020D8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "", "Lorg/xmlpull/v1/XmlPullParser;", "xmlParser", "", "config", "<init>", "(Lorg/xmlpull/v1/XmlPullParser;I)V", "resConfig", "", "updateConfig", "(I)V", "Landroid/content/res/Resources;", "res", "Landroid/content/res/Resources$Theme;", "theme", "Landroid/util/AttributeSet;", "set", "", "attrs", "Landroid/content/res/TypedArray;", "obtainAttributes", "(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;", "typedArray", "", "attrName", "resId", "defaultValue", "getNamedInt", "(Landroid/content/res/TypedArray;Ljava/lang/String;II)I", "", "getNamedFloat", "(Landroid/content/res/TypedArray;Ljava/lang/String;IF)F", "", "getNamedBoolean", "(Landroid/content/res/TypedArray;Ljava/lang/String;IZ)Z", "index", "getFloat", "(Landroid/content/res/TypedArray;IF)F", "getInt", "(Landroid/content/res/TypedArray;II)I", "getString", "(Landroid/content/res/TypedArray;I)Ljava/lang/String;", "defValue", "getDimension", "Lr/d;", "getNamedComplexColor", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;II)Lr/d;", "Landroid/content/res/ColorStateList;", "getNamedColorStateList", "(Landroid/content/res/TypedArray;Landroid/content/res/Resources$Theme;Ljava/lang/String;I)Landroid/content/res/ColorStateList;", "component1", "()Lorg/xmlpull/v1/XmlPullParser;", "component2", "()I", "copy", "(Lorg/xmlpull/v1/XmlPullParser;I)Landroidx/compose/ui/graphics/vector/compat/AndroidVectorParser;", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lorg/xmlpull/v1/XmlPullParser;", "getXmlParser", "I", "getConfig", "setConfig", "Landroidx/compose/ui/graphics/vector/PathParser;", "pathParser", "Landroidx/compose/ui/graphics/vector/PathParser;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AndroidVectorParser {
    public static final int $stable = 8;
    private int config;
    public final PathParser pathParser;
    private final XmlPullParser xmlParser;

    public AndroidVectorParser(XmlPullParser xmlPullParser, int i2) {
        this.xmlParser = xmlPullParser;
        this.config = i2;
        this.pathParser = new PathParser();
    }

    public static /* synthetic */ AndroidVectorParser copy$default(AndroidVectorParser androidVectorParser, XmlPullParser xmlPullParser, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            xmlPullParser = androidVectorParser.xmlParser;
        }
        if ((i3 & 2) != 0) {
            i2 = androidVectorParser.config;
        }
        return androidVectorParser.copy(xmlPullParser, i2);
    }

    private final void updateConfig(int resConfig) {
        this.config = resConfig | this.config;
    }

    /* renamed from: component1, reason: from getter */
    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    /* renamed from: component2, reason: from getter */
    public final int getConfig() {
        return this.config;
    }

    public final AndroidVectorParser copy(XmlPullParser xmlParser, int config) {
        return new AndroidVectorParser(xmlParser, config);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AndroidVectorParser)) {
            return false;
        }
        AndroidVectorParser androidVectorParser = (AndroidVectorParser) other;
        return Intrinsics.areEqual(this.xmlParser, androidVectorParser.xmlParser) && this.config == androidVectorParser.config;
    }

    public final int getConfig() {
        return this.config;
    }

    public final float getDimension(TypedArray typedArray, int index, float defValue) {
        float dimension = typedArray.getDimension(index, defValue);
        updateConfig(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float getFloat(TypedArray typedArray, int index, float defaultValue) {
        float f2 = typedArray.getFloat(index, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return f2;
    }

    public final int getInt(TypedArray typedArray, int index, int defaultValue) {
        int i2 = typedArray.getInt(index, defaultValue);
        updateConfig(typedArray.getChangingConfigurations());
        return i2;
    }

    public final boolean getNamedBoolean(TypedArray typedArray, String attrName, int resId, boolean defaultValue) {
        if (b.a(this.xmlParser, attrName)) {
            defaultValue = typedArray.getBoolean(resId, defaultValue);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return defaultValue;
    }

    public final ColorStateList getNamedColorStateList(TypedArray typedArray, Resources.Theme theme, String attrName, int resId) {
        ColorStateList colorStateListA = null;
        if (b.a(this.xmlParser, attrName)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(resId, typedValue);
            int i2 = typedValue.type;
            if (i2 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index " + resId + ": " + typedValue);
            }
            if (i2 < 28 || i2 > 31) {
                Resources resources = typedArray.getResources();
                int resourceId = typedArray.getResourceId(resId, 0);
                ThreadLocal threadLocal = c.f947a;
                try {
                    colorStateListA = c.a(resources, resources.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            } else {
                colorStateListA = ColorStateList.valueOf(typedValue.data);
            }
        }
        updateConfig(typedArray.getChangingConfigurations());
        return colorStateListA;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r.d getNamedComplexColor(android.content.res.TypedArray r4, android.content.res.Resources.Theme r5, java.lang.String r6, int r7, int r8) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            r3 = this;
            org.xmlpull.v1.XmlPullParser r0 = r3.xmlParser
            boolean r6 = r.b.a(r0, r6)
            r0 = 0
            if (r6 == 0) goto L3e
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            r4.getValue(r7, r6)
            int r1 = r6.type
            r2 = 28
            if (r1 < r2) goto L23
            r2 = 31
            if (r1 > r2) goto L23
            int r5 = r6.data
            r.d r6 = new r.d
            r6.<init>(r0, r5)
            goto L43
        L23:
            android.content.res.Resources r6 = r4.getResources()
            r1 = 0
            int r7 = r4.getResourceId(r7, r1)
            r.d r5 = r.d.a(r6, r7, r5)     // Catch: java.lang.Exception -> L32
            r6 = r5
            goto L3b
        L32:
            r5 = move-exception
            java.lang.String r6 = "ComplexColorCompat"
            java.lang.String r7 = "Failed to inflate ComplexColor."
            android.util.Log.e(r6, r7, r5)
            r6 = r0
        L3b:
            if (r6 == 0) goto L3e
            goto L43
        L3e:
            r.d r6 = new r.d
            r6.<init>(r0, r8)
        L43:
            int r4 = r4.getChangingConfigurations()
            r3.updateConfig(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.compat.AndroidVectorParser.getNamedComplexColor(android.content.res.TypedArray, android.content.res.Resources$Theme, java.lang.String, int, int):r.d");
    }

    public final float getNamedFloat(TypedArray typedArray, String attrName, int resId, float defaultValue) {
        if (b.a(this.xmlParser, attrName)) {
            defaultValue = typedArray.getFloat(resId, defaultValue);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return defaultValue;
    }

    public final int getNamedInt(TypedArray typedArray, String attrName, int resId, int defaultValue) {
        if (b.a(this.xmlParser, attrName)) {
            defaultValue = typedArray.getInt(resId, defaultValue);
        }
        updateConfig(typedArray.getChangingConfigurations());
        return defaultValue;
    }

    public final String getString(TypedArray typedArray, int index) {
        String string = typedArray.getString(index);
        updateConfig(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser getXmlParser() {
        return this.xmlParser;
    }

    public int hashCode() {
        return Integer.hashCode(this.config) + (this.xmlParser.hashCode() * 31);
    }

    public final TypedArray obtainAttributes(Resources res, Resources.Theme theme, AttributeSet set, int[] attrs) {
        TypedArray typedArrayObtainAttributes = theme == null ? res.obtainAttributes(set, attrs) : theme.obtainStyledAttributes(set, attrs, 0, 0);
        updateConfig(typedArrayObtainAttributes.getChangingConfigurations());
        return typedArrayObtainAttributes;
    }

    public final void setConfig(int i2) {
        this.config = i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AndroidVectorParser(xmlParser=");
        sb.append(this.xmlParser);
        sb.append(", config=");
        return a.o(sb, this.config, ')');
    }

    public /* synthetic */ AndroidVectorParser(XmlPullParser xmlPullParser, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(xmlPullParser, (i3 & 2) != 0 ? 0 : i2);
    }
}
