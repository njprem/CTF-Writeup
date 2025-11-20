package androidx.compose.ui.text.platform.extensions;

import B.D;
import android.text.Spannable;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.PlaceholderVerticalAlign;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u001a,\u0010\r\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015H\u0002\u001a(\u0010\u0016\u001a\u00020\u000e*\u00020\u000f2\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00190\u00182\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\"\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u001e\u0010\u0007\u001a\u00020\u0001*\u00020\b8BX\u0082\u0004¢\u0006\f\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"spanUnit", "", "Landroidx/compose/ui/unit/TextUnit;", "getSpanUnit--R2X_6o$annotations", "(J)V", "getSpanUnit--R2X_6o", "(J)I", "spanVerticalAlign", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "getSpanVerticalAlign-do9X-Gg$annotations", "(I)V", "getSpanVerticalAlign-do9X-Gg", "(I)I", "setPlaceholder", "", "Landroid/text/Spannable;", "placeholder", "Landroidx/compose/ui/text/Placeholder;", "start", "end", "density", "Landroidx/compose/ui/unit/Density;", "setPlaceholders", "placeholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PlaceholderExtensions_androidKt {
    /* renamed from: getSpanUnit--R2X_6o, reason: not valid java name */
    private static final int m5989getSpanUnitR2X_6o(long j2) {
        long jM6425getTypeUIouoOA = TextUnit.m6425getTypeUIouoOA(j2);
        TextUnitType.Companion companion = TextUnitType.INSTANCE;
        if (TextUnitType.m6454equalsimpl0(jM6425getTypeUIouoOA, companion.m6459getSpUIouoOA())) {
            return 0;
        }
        return TextUnitType.m6454equalsimpl0(jM6425getTypeUIouoOA, companion.m6458getEmUIouoOA()) ? 1 : 2;
    }

    /* renamed from: getSpanUnit--R2X_6o$annotations, reason: not valid java name */
    private static /* synthetic */ void m5990getSpanUnitR2X_6o$annotations(long j2) {
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg, reason: not valid java name */
    private static final int m5991getSpanVerticalAligndo9XGg(int i2) {
        PlaceholderVerticalAlign.Companion companion = PlaceholderVerticalAlign.INSTANCE;
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5643getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5649getTopJ6kI3mc())) {
            return 1;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5644getBottomJ6kI3mc())) {
            return 2;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5645getCenterJ6kI3mc())) {
            return 3;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5648getTextTopJ6kI3mc())) {
            return 4;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5646getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (PlaceholderVerticalAlign.m5639equalsimpl0(i2, companion.m5647getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new IllegalStateException("Invalid PlaceholderVerticalAlign");
    }

    /* renamed from: getSpanVerticalAlign-do9X-Gg$annotations, reason: not valid java name */
    private static /* synthetic */ void m5992getSpanVerticalAligndo9XGg$annotations(int i2) {
    }

    private static final void setPlaceholder(Spannable spannable, Placeholder placeholder, int i2, int i3, Density density) {
        for (Object obj : spannable.getSpans(i2, i3, D.class)) {
            spannable.removeSpan((D) obj);
        }
        SpannableExtensions_androidKt.setSpan(spannable, new PlaceholderSpan(TextUnit.m6426getValueimpl(placeholder.getWidth()), m5989getSpanUnitR2X_6o(placeholder.getWidth()), TextUnit.m6426getValueimpl(placeholder.getHeight()), m5989getSpanUnitR2X_6o(placeholder.getHeight()), density.getDensity() * density.getFontScale(), m5991getSpanVerticalAligndo9XGg(placeholder.getPlaceholderVerticalAlign())), i2, i3);
    }

    public static final void setPlaceholders(Spannable spannable, List<AnnotatedString.Range<Placeholder>> list, Density density) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotatedString.Range<Placeholder> range = list.get(i2);
            setPlaceholder(spannable, range.component1(), range.getStart(), range.getEnd(), density);
        }
    }
}
