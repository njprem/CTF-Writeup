package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0004H\u0002J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u0004J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0004J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0004H\u0002J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0002J\b\u0010\u001d\u001a\u00020\u0011H\u0007J\u0018\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "", "()V", "firstFreeHandle", "", "handles", "", "index", "<set-?>", "size", "getSize", "()I", "values", "add", "value", "allocateHandle", "ensure", "", "atLeast", "freeHandle", "handle", "lowestOrDefault", "default", "remove", "shiftDown", "shiftUp", "swap", "a", "b", "validate", "validateHandle", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnapshotDoubleIndexHeap {
    public static final int $stable = 8;
    private int firstFreeHandle;
    private int[] handles;
    private int size;
    private int[] values = new int[16];
    private int[] index = new int[16];

    public SnapshotDoubleIndexHeap() {
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        this.handles = iArr;
    }

    private final int allocateHandle() {
        int length = this.handles.length;
        if (this.firstFreeHandle >= length) {
            int i2 = length * 2;
            int[] iArr = new int[i2];
            int i3 = 0;
            while (i3 < i2) {
                int i4 = i3 + 1;
                iArr[i3] = i4;
                i3 = i4;
            }
            ArraysKt___ArraysJvmKt.copyInto$default(this.handles, iArr, 0, 0, 0, 14, (Object) null);
            this.handles = iArr;
        }
        int i5 = this.firstFreeHandle;
        this.firstFreeHandle = this.handles[i5];
        return i5;
    }

    private final void ensure(int atLeast) {
        int[] iArr = this.values;
        int length = iArr.length;
        if (atLeast <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        ArraysKt___ArraysJvmKt.copyInto$default(iArr, iArr2, 0, 0, 0, 14, (Object) null);
        ArraysKt___ArraysJvmKt.copyInto$default(this.index, iArr3, 0, 0, 0, 14, (Object) null);
        this.values = iArr2;
        this.index = iArr3;
    }

    private final void freeHandle(int handle) {
        this.handles[handle] = this.firstFreeHandle;
        this.firstFreeHandle = handle;
    }

    public static /* synthetic */ int lowestOrDefault$default(SnapshotDoubleIndexHeap snapshotDoubleIndexHeap, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 0;
        }
        return snapshotDoubleIndexHeap.lowestOrDefault(i2);
    }

    private final void shiftDown(int index) {
        int i2;
        int[] iArr = this.values;
        int i3 = this.size >> 1;
        while (index < i3) {
            int i4 = (index + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.size || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] >= iArr[index]) {
                    return;
                }
                swap(i5, index);
                index = i5;
            } else {
                if (i2 >= iArr[index]) {
                    return;
                }
                swap(i4, index);
                index = i4;
            }
        }
    }

    private final void shiftUp(int index) {
        int[] iArr = this.values;
        int i2 = iArr[index];
        while (index > 0) {
            int i3 = ((index + 1) >> 1) - 1;
            if (iArr[i3] <= i2) {
                return;
            }
            swap(i3, index);
            index = i3;
        }
    }

    private final void swap(int a2, int b2) {
        int[] iArr = this.values;
        int[] iArr2 = this.index;
        int[] iArr3 = this.handles;
        int i2 = iArr[a2];
        iArr[a2] = iArr[b2];
        iArr[b2] = i2;
        int i3 = iArr2[a2];
        iArr2[a2] = iArr2[b2];
        iArr2[b2] = i3;
        iArr3[iArr2[a2]] = a2;
        iArr3[iArr2[b2]] = b2;
    }

    public final int add(int value) {
        ensure(this.size + 1);
        int i2 = this.size;
        this.size = i2 + 1;
        int iAllocateHandle = allocateHandle();
        this.values[i2] = value;
        this.index[i2] = iAllocateHandle;
        this.handles[iAllocateHandle] = i2;
        shiftUp(i2);
        return iAllocateHandle;
    }

    public final int getSize() {
        return this.size;
    }

    public final int lowestOrDefault(int i2) {
        return this.size > 0 ? this.values[0] : i2;
    }

    public final void remove(int handle) {
        int i2 = this.handles[handle];
        swap(i2, this.size - 1);
        this.size--;
        shiftUp(i2);
        shiftDown(i2);
        freeHandle(handle);
    }

    public final void validate() {
        int i2 = this.size;
        int i3 = 1;
        while (i3 < i2) {
            int i4 = i3 + 1;
            int[] iArr = this.values;
            if (iArr[(i4 >> 1) - 1] > iArr[i3]) {
                throw new IllegalStateException(("Index " + i3 + " is out of place").toString());
            }
            i3 = i4;
        }
    }

    public final void validateHandle(int handle, int value) {
        int i2 = this.handles[handle];
        if (this.index[i2] != handle) {
            throw new IllegalStateException(("Index for handle " + handle + " is corrupted").toString());
        }
        if (this.values[i2] == value) {
            return;
        }
        StringBuilder sbP = androidx.compose.runtime.changelist.a.p(handle, "Value for handle ", " was ");
        sbP.append(this.values[i2]);
        sbP.append(" but was supposed to be ");
        sbP.append(value);
        throw new IllegalStateException(sbP.toString().toString());
    }
}
