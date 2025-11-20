package androidx.compose.ui.node;

import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0015\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002\u001aZ\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0005H\u0002\u001a \u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0000\u001a8\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0012H\u0000\u001aZ\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010\u0014\u001aR\u0010!\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u001c\u0010$\u001a\u00020\u0001*\u00020\u00122\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006'"}, d2 = {"applyDiff", "", "diagonals", "Landroidx/compose/ui/node/IntStack;", "callback", "Landroidx/compose/ui/node/DiffCallback;", "backward", "", "oldStart", "", "oldEnd", "newStart", "newEnd", "cb", "forward", "Landroidx/compose/ui/node/CenteredArray;", "d", "snake", "", "backward-4l5_RBY", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[II[I)Z", "calculateDiff", "oldSize", "newSize", "executeDiff", "fillSnake", "startX", "startY", "endX", "endY", "reverse", "data", "forward-4l5_RBY", "midPoint", "midPoint-q5eDKzI", "(IIIILandroidx/compose/ui/node/DiffCallback;[I[I[I)Z", "swap", "i", "j", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MyersDiffKt {
    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < intStack.getLastIndex()) {
            int i5 = i2 + 2;
            int i6 = intStack.get(i2) - intStack.get(i5);
            int i7 = intStack.get(i2 + 1) - intStack.get(i5);
            int i8 = intStack.get(i5);
            i2 += 3;
            while (i3 < i6) {
                diffCallback.remove(i4, i3);
                i3++;
            }
            while (i4 < i7) {
                diffCallback.insert(i4);
                i4++;
            }
            while (true) {
                int i9 = i8 - 1;
                if (i8 > 0) {
                    diffCallback.same(i3, i4);
                    i3++;
                    i4++;
                    i8 = i9;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m5312backward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM5232getimpl;
        int i7;
        int i8;
        int i9 = (i3 - i2) - (i5 - i4);
        boolean z = i9 % 2 == 0;
        int i10 = -i6;
        for (int i11 = i10; i11 <= i6; i11 += 2) {
            if (i11 == i10 || (i11 != i6 && CenteredArray.m5232getimpl(iArr2, i11 + 1) < CenteredArray.m5232getimpl(iArr2, i11 - 1))) {
                iM5232getimpl = CenteredArray.m5232getimpl(iArr2, i11 + 1);
                i7 = iM5232getimpl;
            } else {
                iM5232getimpl = CenteredArray.m5232getimpl(iArr2, i11 - 1);
                i7 = iM5232getimpl - 1;
            }
            int i12 = i5 - ((i3 - i7) - i11);
            int i13 = (i6 == 0 || i7 != iM5232getimpl) ? i12 : i12 + 1;
            while (i7 > i2 && i12 > i4) {
                if (!diffCallback.areItemsTheSame(i7 - 1, i12 - 1)) {
                    break;
                }
                i7--;
                i12--;
            }
            CenteredArray.m5235setimpl(iArr2, i11, i7);
            if (z && (i8 = i9 - i11) >= i10 && i8 <= i6) {
                if (CenteredArray.m5232getimpl(iArr, i8) >= i7) {
                    fillSnake(i7, i12, iM5232getimpl, i13, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i2, int i3, DiffCallback diffCallback) {
        int i4 = ((i2 + i3) + 1) / 2;
        IntStack intStack = new IntStack(i4 * 3);
        IntStack intStack2 = new IntStack(i4 * 4);
        intStack2.pushRange(0, i2, 0, i3);
        int i5 = (i4 * 2) + 1;
        int[] iArrM5229constructorimpl = CenteredArray.m5229constructorimpl(new int[i5]);
        int[] iArrM5229constructorimpl2 = CenteredArray.m5229constructorimpl(new int[i5]);
        int[] iArrM5415constructorimpl = Snake.m5415constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int iPop = intStack2.pop();
            int iPop2 = intStack2.pop();
            int iPop3 = intStack2.pop();
            int iPop4 = intStack2.pop();
            DiffCallback diffCallback2 = diffCallback;
            if (m5314midPointq5eDKzI(iPop4, iPop3, iPop2, iPop, diffCallback2, iArrM5229constructorimpl, iArrM5229constructorimpl2, iArrM5415constructorimpl)) {
                if (Snake.m5418getDiagonalSizeimpl(iArrM5415constructorimpl) > 0) {
                    Snake.m5413addDiagonalToStackimpl(iArrM5415constructorimpl, intStack);
                }
                intStack2.pushRange(iPop4, Snake.m5423getStartXimpl(iArrM5415constructorimpl), iPop2, Snake.m5424getStartYimpl(iArrM5415constructorimpl));
                intStack2.pushRange(Snake.m5419getEndXimpl(iArrM5415constructorimpl), iPop3, Snake.m5420getEndYimpl(iArrM5415constructorimpl), iPop);
            }
            diffCallback = diffCallback2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i2, i3, 0);
        return intStack;
    }

    public static final void executeDiff(int i2, int i3, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i2, i3, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i2, int i3, int i4, int i5, boolean z, int[] iArr) {
        iArr[0] = i2;
        iArr[1] = i3;
        iArr[2] = i4;
        iArr[3] = i5;
        iArr[4] = z ? 1 : 0;
    }

    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m5313forward4l5_RBY(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i6, int[] iArr3) {
        int iM5232getimpl;
        int i7;
        int i8 = (i3 - i2) - (i5 - i4);
        boolean z = Math.abs(i8) % 2 == 1;
        int i9 = -i6;
        for (int i10 = i9; i10 <= i6; i10 += 2) {
            if (i10 == i9 || (i10 != i6 && CenteredArray.m5232getimpl(iArr, i10 + 1) > CenteredArray.m5232getimpl(iArr, i10 - 1))) {
                iM5232getimpl = CenteredArray.m5232getimpl(iArr, i10 + 1);
                i7 = iM5232getimpl;
            } else {
                iM5232getimpl = CenteredArray.m5232getimpl(iArr, i10 - 1);
                i7 = iM5232getimpl + 1;
            }
            int i11 = ((i7 - i2) + i4) - i10;
            int i12 = (i6 == 0 || i7 != iM5232getimpl) ? i11 : i11 - 1;
            while (i7 < i3 && i11 < i5) {
                if (!diffCallback.areItemsTheSame(i7, i11)) {
                    break;
                }
                i7++;
                i11++;
            }
            CenteredArray.m5235setimpl(iArr, i10, i7);
            if (z) {
                int i13 = i8 - i10;
                if (i13 >= i9 + 1 && i13 <= i6 - 1) {
                    if (CenteredArray.m5232getimpl(iArr2, i13) <= i7) {
                        fillSnake(iM5232getimpl, i12, i7, i11, false, iArr3);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m5314midPointq5eDKzI(int i2, int i3, int i4, int i5, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i6 = i3 - i2;
        int i7 = i5 - i4;
        if (i6 >= 1 && i7 >= 1) {
            int i8 = ((i6 + i7) + 1) / 2;
            int[] iArr4 = iArr;
            CenteredArray.m5235setimpl(iArr4, 1, i2);
            int[] iArr5 = iArr2;
            CenteredArray.m5235setimpl(iArr5, 1, i3);
            int i9 = 0;
            while (i9 < i8) {
                if (m5313forward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr4, iArr5, i9, iArr3) || m5312backward4l5_RBY(i2, i3, i4, i5, diffCallback, iArr, iArr2, i9, iArr3)) {
                    return true;
                }
                i9++;
                iArr4 = iArr;
                iArr5 = iArr2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i2, int i3) {
        int i4 = iArr[i2];
        iArr[i2] = iArr[i3];
        iArr[i3] = i4;
    }
}
