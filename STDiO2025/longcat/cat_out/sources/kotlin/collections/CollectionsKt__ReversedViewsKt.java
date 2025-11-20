package kotlin.collections;

import androidx.compose.runtime.changelist.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001a#\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0003\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\b\u001a\u001d\u0010\t\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\n\u001a\u001d\u0010\u000b\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"asReversed", "", "T", "", "asReversedMutable", "reverseElementIndex", "", "index", "reverseElementIndex$CollectionsKt__ReversedViewsKt", "reverseIteratorIndex", "reverseIteratorIndex$CollectionsKt__ReversedViewsKt", "reversePositionIndex", "reversePositionIndex$CollectionsKt__ReversedViewsKt", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
/* loaded from: classes.dex */
class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static final <T> List<T> asReversed(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedListReadOnly(list);
    }

    public static final <T> List<T> asReversedMutable(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new ReversedList(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i2) {
        if (i2 >= 0 && i2 <= CollectionsKt__CollectionsKt.getLastIndex(list)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i2;
        }
        StringBuilder sbP = a.p(i2, "Element index ", " must be in range [");
        sbP.append(new IntRange(0, CollectionsKt__CollectionsKt.getLastIndex(list)));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i2) {
        return CollectionsKt__CollectionsKt.getLastIndex(list) - i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i2) {
        if (i2 >= 0 && i2 <= list.size()) {
            return list.size() - i2;
        }
        StringBuilder sbP = a.p(i2, "Position index ", " must be in range [");
        sbP.append(new IntRange(0, list.size()));
        sbP.append("].");
        throw new IndexOutOfBoundsException(sbP.toString());
    }
}
