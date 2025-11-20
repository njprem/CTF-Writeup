package androidx.compose.ui.text;

import androidx.compose.ui.text.AnnotatedString;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¨\u0006\u0007"}, d2 = {"getLocalPlaceholders", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "start", "", "end", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiParagraphIntrinsicsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final List<AnnotatedString.Range<Placeholder>> getLocalPlaceholders(List<AnnotatedString.Range<Placeholder>> list, int i2, int i3) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            AnnotatedString.Range<Placeholder> range = list.get(i4);
            AnnotatedString.Range<Placeholder> range2 = range;
            if (AnnotatedStringKt.intersect(i2, i3, range2.getStart(), range2.getEnd())) {
                arrayList.add(range);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            AnnotatedString.Range range3 = (AnnotatedString.Range) arrayList.get(i5);
            if (i2 > range3.getStart() || range3.getEnd() > i3) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new AnnotatedString.Range(range3.getItem(), range3.getStart() - i2, range3.getEnd() - i2));
        }
        return arrayList2;
    }
}
