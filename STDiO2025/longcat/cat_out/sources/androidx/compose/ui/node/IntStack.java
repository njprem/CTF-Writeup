package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\u0011\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\u0086\u0002J\u0006\u0010\u0011\u001a\u00020\fJ \u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010\u0016\u001a\u00020\u0003J\u001e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J&\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003J \u0010 \u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0003H\u0002J\u0006\u0010!\u001a\u00020\u0018J\u0018\u0010\"\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003H\u0002R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/compose/ui/node/IntStack;", "", "initialCapacity", "", "(I)V", "lastIndex", "size", "getSize", "()I", "stack", "", "compareDiagonal", "", "a", "b", "get", "index", "isNotEmpty", "partition", "start", "end", "elSize", "pop", "pushDiagonal", "", "x", "y", "pushRange", "oldStart", "oldEnd", "newStart", "newEnd", "quickSort", "sortDiagonals", "swapDiagonal", "i", "j", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class IntStack {
    private int lastIndex;
    private int[] stack;

    public IntStack(int i2) {
        this.stack = new int[i2];
    }

    private final boolean compareDiagonal(int a2, int b2) {
        int[] iArr = this.stack;
        int i2 = iArr[a2];
        int i3 = iArr[b2];
        return i2 < i3 || (i2 == i3 && iArr[a2 + 1] <= iArr[b2 + 1]);
    }

    private final int partition(int start, int end, int elSize) {
        int i2 = start - elSize;
        while (start < end) {
            if (compareDiagonal(start, end)) {
                i2 += elSize;
                swapDiagonal(i2, start);
            }
            start += elSize;
        }
        int i3 = i2 + elSize;
        swapDiagonal(i3, end);
        return i3;
    }

    private final void quickSort(int start, int end, int elSize) {
        if (start < end) {
            int iPartition = partition(start, end, elSize);
            quickSort(start, iPartition - elSize, elSize);
            quickSort(iPartition + elSize, end, elSize);
        }
    }

    private final void swapDiagonal(int i2, int j2) {
        int[] iArr = this.stack;
        MyersDiffKt.swap(iArr, i2, j2);
        MyersDiffKt.swap(iArr, i2 + 1, j2 + 1);
        MyersDiffKt.swap(iArr, i2 + 2, j2 + 2);
    }

    public final int get(int index) {
        return this.stack[index];
    }

    /* renamed from: getSize, reason: from getter */
    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final boolean isNotEmpty() {
        return this.lastIndex != 0;
    }

    public final int pop() {
        int[] iArr = this.stack;
        int i2 = this.lastIndex - 1;
        this.lastIndex = i2;
        return iArr[i2];
    }

    public final void pushDiagonal(int x2, int y2, int size) {
        int i2 = this.lastIndex;
        int i3 = i2 + 3;
        int[] iArr = this.stack;
        if (i3 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i2] = x2 + size;
        iArr2[i2 + 1] = y2 + size;
        iArr2[i2 + 2] = size;
        this.lastIndex = i3;
    }

    public final void pushRange(int oldStart, int oldEnd, int newStart, int newEnd) {
        int i2 = this.lastIndex;
        int i3 = i2 + 4;
        int[] iArr = this.stack;
        if (i3 >= iArr.length) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length * 2);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            this.stack = iArrCopyOf;
        }
        int[] iArr2 = this.stack;
        iArr2[i2] = oldStart;
        iArr2[i2 + 1] = oldEnd;
        iArr2[i2 + 2] = newStart;
        iArr2[i2 + 3] = newEnd;
        this.lastIndex = i3;
    }

    public final void sortDiagonals() {
        int i2 = this.lastIndex;
        if (!(i2 % 3 == 0)) {
            InlineClassHelperKt.throwIllegalStateException("Array size not a multiple of 3");
        }
        if (i2 > 3) {
            quickSort(0, i2 - 3, 3);
        }
    }
}
