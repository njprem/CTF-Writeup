package androidx.compose.runtime.snapshots;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¨\u0006\u0004"}, d2 = {"binarySearch", "", "", "value", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotIdSetKt {
    public static final int binarySearch(int[] iArr, int i2) {
        int length = iArr.length - 1;
        int i3 = 0;
        while (i3 <= length) {
            int i4 = (i3 + length) >>> 1;
            int i5 = iArr[i4];
            if (i2 > i5) {
                i3 = i4 + 1;
            } else {
                if (i2 >= i5) {
                    return i4;
                }
                length = i4 - 1;
            }
        }
        return -(i3 + 1);
    }
}
