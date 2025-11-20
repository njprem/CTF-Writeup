package androidx.compose.animation.core;

import j.AbstractC0660m;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u001a/\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lj/m;", "", "element", "fromIndex", "toIndex", "binarySearch", "(Lj/m;III)I", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class IntListExtensionKt {
    public static final int binarySearch(AbstractC0660m abstractC0660m, int i2) {
        return binarySearch$default(abstractC0660m, i2, 0, 0, 6, null);
    }

    public static int binarySearch$default(AbstractC0660m abstractC0660m, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            i4 = abstractC0660m.f849b;
        }
        return binarySearch(abstractC0660m, i2, i3, i4);
    }

    public static final int binarySearch(AbstractC0660m abstractC0660m, int i2, int i3) {
        return binarySearch$default(abstractC0660m, i2, i3, 0, 4, null);
    }

    public static final int binarySearch(AbstractC0660m abstractC0660m, int i2, int i3, int i4) {
        if (!(i3 <= i4)) {
            PreconditionsKt.throwIllegalArgumentException("fromIndex(" + i3 + ") > toIndex(" + i4 + ')');
        }
        if (i3 >= 0) {
            if (i4 > abstractC0660m.f849b) {
                throw new IndexOutOfBoundsException(androidx.compose.runtime.changelist.a.n("Index out of range: ", i4));
            }
            int i5 = i4 - 1;
            while (i3 <= i5) {
                int i6 = (i3 + i5) >>> 1;
                int iA = abstractC0660m.a(i6);
                if (iA < i2) {
                    i3 = i6 + 1;
                } else {
                    if (iA <= i2) {
                        return i6;
                    }
                    i5 = i6 - 1;
                }
            }
            return -(i3 + 1);
        }
        throw new IndexOutOfBoundsException(androidx.compose.runtime.changelist.a.n("Index out of range: ", i3));
    }
}
