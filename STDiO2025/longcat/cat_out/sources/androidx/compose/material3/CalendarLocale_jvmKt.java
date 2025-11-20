package androidx.compose.material3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\n\u0010\u000b\"\u00020\f2\u00020\f¨\u0006\r"}, d2 = {"cachedFormatters", "Ljava/util/WeakHashMap;", "", "Ljava/text/NumberFormat;", "getCachedDateTimeFormatter", "minDigits", "", "maxDigits", "isGroupingUsed", "", "toLocalString", "CalendarLocale", "Ljava/util/Locale;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CalendarLocale_jvmKt {
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    private static final NumberFormat getCachedDateTimeFormatter(int i2, int i3, boolean z) {
        String str = i2 + '.' + i3 + '.' + z + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z);
            integerInstance.setMinimumIntegerDigits(i2);
            integerInstance.setMaximumIntegerDigits(i3);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }

    public static final String toLocalString(int i2, int i3, int i4, boolean z) {
        return getCachedDateTimeFormatter(i3, i4, z).format(Integer.valueOf(i2));
    }

    public static /* synthetic */ String toLocalString$default(int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i3 = 1;
        }
        if ((i5 & 2) != 0) {
            i4 = 40;
        }
        if ((i5 & 4) != 0) {
            z = false;
        }
        return toLocalString(i2, i3, i4, z);
    }
}
