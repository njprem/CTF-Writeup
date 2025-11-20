package androidx.compose.ui.text.input;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0006"}, d2 = {"updateRangeAfterDelete", "Landroidx/compose/ui/text/TextRange;", "target", "deleted", "updateRangeAfterDelete-pWDy79M", "(JJ)J", "ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EditingBufferKt {
    /* renamed from: updateRangeAfterDelete-pWDy79M, reason: not valid java name */
    public static final long m5881updateRangeAfterDeletepWDy79M(long j2, long j3) {
        int iM5717getLengthimpl;
        int iM5719getMinimpl = TextRange.m5719getMinimpl(j2);
        int iM5718getMaximpl = TextRange.m5718getMaximpl(j2);
        if (TextRange.m5723intersects5zctL8(j3, j2)) {
            if (TextRange.m5711contains5zctL8(j3, j2)) {
                iM5719getMinimpl = TextRange.m5719getMinimpl(j3);
                iM5718getMaximpl = iM5719getMinimpl;
            } else {
                if (TextRange.m5711contains5zctL8(j2, j3)) {
                    iM5717getLengthimpl = TextRange.m5717getLengthimpl(j3);
                } else if (TextRange.m5712containsimpl(j3, iM5719getMinimpl)) {
                    iM5719getMinimpl = TextRange.m5719getMinimpl(j3);
                    iM5717getLengthimpl = TextRange.m5717getLengthimpl(j3);
                } else {
                    iM5718getMaximpl = TextRange.m5719getMinimpl(j3);
                }
                iM5718getMaximpl -= iM5717getLengthimpl;
            }
        } else if (iM5718getMaximpl > TextRange.m5719getMinimpl(j3)) {
            iM5719getMinimpl -= TextRange.m5717getLengthimpl(j3);
            iM5717getLengthimpl = TextRange.m5717getLengthimpl(j3);
            iM5718getMaximpl -= iM5717getLengthimpl;
        }
        return TextRangeKt.TextRange(iM5719getMinimpl, iM5718getMaximpl);
    }
}
