package androidx.compose.foundation.text.input.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0012\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u000fj\u0002`\u0010J\u0018\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0002J\b\u0010\u0014\u001a\u00020\u0005H\u0002J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0086\u0002J\u0006\u0010\u0018\u001a\u00020\u0005J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J2\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005J\b\u0010 \u001a\u00020!H\u0016R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/compose/foundation/text/input/internal/GapBuffer;", "", "initBuffer", "", "initGapStart", "", "initGapEnd", "([CII)V", "buffer", "capacity", "gapEnd", "gapStart", "append", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "delete", "start", "end", "gapLength", "get", "", "index", "length", "makeSureAvailableSpace", "requestSize", "replace", "text", "", "textStart", "textEnd", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class GapBuffer {
    private char[] buffer;
    private int capacity;
    private int gapEnd;
    private int gapStart;

    public GapBuffer(char[] cArr, int i2, int i3) {
        this.capacity = cArr.length;
        this.buffer = cArr;
        this.gapStart = i2;
        this.gapEnd = i3;
    }

    private final void delete(int start, int end) {
        int i2 = this.gapStart;
        if (start < i2 && end <= i2) {
            int i3 = i2 - end;
            char[] cArr = this.buffer;
            ArraysKt___ArraysJvmKt.copyInto(cArr, cArr, this.gapEnd - i3, end, i2);
            this.gapStart = start;
            this.gapEnd -= i3;
            return;
        }
        if (start < i2 && end >= i2) {
            this.gapEnd = end + gapLength();
            this.gapStart = start;
            return;
        }
        int iGapLength = start + gapLength();
        int iGapLength2 = end + gapLength();
        int i4 = this.gapEnd;
        char[] cArr2 = this.buffer;
        ArraysKt___ArraysJvmKt.copyInto(cArr2, cArr2, this.gapStart, i4, iGapLength);
        this.gapStart += iGapLength - i4;
        this.gapEnd = iGapLength2;
    }

    private final int gapLength() {
        return this.gapEnd - this.gapStart;
    }

    private final void makeSureAvailableSpace(int requestSize) {
        if (requestSize <= gapLength()) {
            return;
        }
        int iGapLength = requestSize - gapLength();
        int i2 = this.capacity;
        do {
            i2 *= 2;
        } while (i2 - this.capacity < iGapLength);
        char[] cArr = new char[i2];
        ArraysKt___ArraysJvmKt.copyInto(this.buffer, cArr, 0, 0, this.gapStart);
        int i3 = this.capacity;
        int i4 = this.gapEnd;
        int i5 = i3 - i4;
        int i6 = i2 - i5;
        ArraysKt___ArraysJvmKt.copyInto(this.buffer, cArr, i6, i4, i5 + i4);
        this.buffer = cArr;
        this.capacity = i2;
        this.gapEnd = i6;
    }

    public static /* synthetic */ void replace$default(GapBuffer gapBuffer, int i2, int i3, CharSequence charSequence, int i4, int i5, int i6, Object obj) {
        if ((i6 & 8) != 0) {
            i4 = 0;
        }
        int i7 = i4;
        if ((i6 & 16) != 0) {
            i5 = charSequence.length();
        }
        gapBuffer.replace(i2, i3, charSequence, i7, i5);
    }

    public final void append(StringBuilder builder) {
        builder.append(this.buffer, 0, this.gapStart);
        char[] cArr = this.buffer;
        int i2 = this.gapEnd;
        builder.append(cArr, i2, this.capacity - i2);
    }

    public final char get(int index) {
        int i2 = this.gapStart;
        return index < i2 ? this.buffer[index] : this.buffer[(index - i2) + this.gapEnd];
    }

    public final int length() {
        return this.capacity - gapLength();
    }

    public final void replace(int start, int end, CharSequence text, int textStart, int textEnd) {
        int i2 = textEnd - textStart;
        makeSureAvailableSpace(i2 - (end - start));
        delete(start, end);
        ToCharArray_androidKt.toCharArray(text, this.buffer, this.gapStart, textStart, textEnd);
        this.gapStart += i2;
    }

    public String toString() {
        return "";
    }
}
