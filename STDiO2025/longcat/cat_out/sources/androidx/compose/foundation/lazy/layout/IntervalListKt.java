package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.IntervalList;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¨\u0006\u0006"}, d2 = {"binarySearch", "", "T", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/lazy/layout/IntervalList$Interval;", "itemIndex", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntervalListKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> int binarySearch(MutableVector<IntervalList.Interval<T>> mutableVector, int i2) {
        int size = mutableVector.getSize() - 1;
        int i3 = 0;
        while (i3 < size) {
            int i4 = ((size - i3) / 2) + i3;
            int startIndex = mutableVector.getContent()[i4].getStartIndex();
            if (startIndex != i2) {
                if (startIndex < i2) {
                    i3 = i4 + 1;
                    if (i2 < mutableVector.getContent()[i3].getStartIndex()) {
                    }
                } else {
                    size = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }
}
