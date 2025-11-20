package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0015\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015¢\u0006\u0002\u0010\u0016J\u000e\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003J\u001d\u0010!\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u000e\u0010.\u001a\u00020*2\u0006\u0010/\u001a\u000200J\u001e\u00101\u001a\u00020*2\u0006\u0010 \u001a\u00020\u00032\u0006\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u0003J+\u00104\u001a\u00020\t*\u00020\t2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000306H\u0082\bø\u0001\u0000¢\u0006\u0004\b7\u00108R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010 \u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0003@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u00020\tX\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010%R\u0018\u0010&\u001a\u00020\u0003*\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"Landroidx/compose/foundation/pager/MeasuredPage;", "Landroidx/compose/foundation/pager/PageInfo;", "index", "", "size", "placeables", "", "Landroidx/compose/ui/layout/Placeable;", "visualOffset", "Landroidx/compose/ui/unit/IntOffset;", "key", "", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "reverseLayout", "", "(IILjava/util/List;JLjava/lang/Object;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/ui/unit/LayoutDirection;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "crossAxisSize", "getCrossAxisSize", "()I", "getIndex", "isVertical", "getKey", "()Ljava/lang/Object;", "mainAxisLayoutSize", "<set-?>", "offset", "getOffset", "placeableOffsets", "", "getSize", "J", "mainAxisSize", "getMainAxisSize", "(Landroidx/compose/ui/layout/Placeable;)I", "applyScrollDelta", "", "delta", "getOffset-Bjo55l4", "(I)J", "place", "scope", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "position", "layoutWidth", "layoutHeight", "copy", "mainAxisMap", "Lkotlin/Function1;", "copy-4Tuh3kE", "(JLkotlin/jvm/functions/Function1;)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MeasuredPage implements PageInfo {
    public static final int $stable = 8;
    private final int crossAxisSize;
    private final Alignment.Horizontal horizontalAlignment;
    private final int index;
    private final boolean isVertical;
    private final Object key;
    private final LayoutDirection layoutDirection;
    private int mainAxisLayoutSize;
    private int offset;
    private final int[] placeableOffsets;
    private final List<Placeable> placeables;
    private final boolean reverseLayout;
    private final int size;
    private final Alignment.Vertical verticalAlignment;
    private final long visualOffset;

    public /* synthetic */ MeasuredPage(int i2, int i3, List list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, list, j2, obj, orientation, horizontal, vertical, layoutDirection, z);
    }

    /* renamed from: copy-4Tuh3kE, reason: not valid java name */
    private final long m876copy4Tuh3kE(long j2, Function1<? super Integer, Integer> function1) {
        int iM6361getXimpl = this.isVertical ? IntOffset.m6361getXimpl(j2) : function1.invoke(Integer.valueOf(IntOffset.m6361getXimpl(j2))).intValue();
        boolean z = this.isVertical;
        int iM6362getYimpl = IntOffset.m6362getYimpl(j2);
        if (z) {
            iM6362getYimpl = function1.invoke(Integer.valueOf(iM6362getYimpl)).intValue();
        }
        return IntOffsetKt.IntOffset(iM6361getXimpl, iM6362getYimpl);
    }

    private final int getMainAxisSize(Placeable placeable) {
        return this.isVertical ? placeable.getHeight() : placeable.getWidth();
    }

    /* renamed from: getOffset-Bjo55l4, reason: not valid java name */
    private final long m877getOffsetBjo55l4(int index) {
        int[] iArr = this.placeableOffsets;
        int i2 = index * 2;
        return IntOffsetKt.IntOffset(iArr[i2], iArr[i2 + 1]);
    }

    public final void applyScrollDelta(int delta) {
        this.offset = getOffset() + delta;
        int length = this.placeableOffsets.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.isVertical;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                int[] iArr = this.placeableOffsets;
                iArr[i2] = iArr[i2] + delta;
            }
        }
    }

    public final int getCrossAxisSize() {
        return this.crossAxisSize;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getIndex() {
        return this.index;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public Object getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.pager.PageInfo
    public int getOffset() {
        return this.offset;
    }

    public final int getSize() {
        return this.size;
    }

    public final void place(Placeable.PlacementScope scope) {
        Placeable.PlacementScope placementScope;
        int iM6361getXimpl;
        int iM6362getYimpl;
        if (this.mainAxisLayoutSize == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("position() should be called first");
        }
        int size = this.placeables.size();
        int i2 = 0;
        while (i2 < size) {
            Placeable placeable = this.placeables.get(i2);
            long jM877getOffsetBjo55l4 = m877getOffsetBjo55l4(i2);
            if (this.reverseLayout) {
                if (this.isVertical) {
                    iM6361getXimpl = IntOffset.m6361getXimpl(jM877getOffsetBjo55l4);
                } else {
                    iM6361getXimpl = (this.mainAxisLayoutSize - IntOffset.m6361getXimpl(jM877getOffsetBjo55l4)) - getMainAxisSize(placeable);
                }
                if (this.isVertical) {
                    iM6362getYimpl = (this.mainAxisLayoutSize - IntOffset.m6362getYimpl(jM877getOffsetBjo55l4)) - getMainAxisSize(placeable);
                } else {
                    iM6362getYimpl = IntOffset.m6362getYimpl(jM877getOffsetBjo55l4);
                }
                jM877getOffsetBjo55l4 = IntOffsetKt.IntOffset(iM6361getXimpl, iM6362getYimpl);
            }
            long jM6365plusqkQi6aY = IntOffset.m6365plusqkQi6aY(jM877getOffsetBjo55l4, this.visualOffset);
            if (this.isVertical) {
                placementScope = scope;
                Placeable.PlacementScope.m5188placeWithLayeraW9wM$default(placementScope, placeable, jM6365plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            } else {
                placementScope = scope;
                Placeable.PlacementScope.m5186placeRelativeWithLayeraW9wM$default(placementScope, placeable, jM6365plusqkQi6aY, 0.0f, (Function1) null, 6, (Object) null);
            }
            i2++;
            scope = placementScope;
        }
    }

    public final void position(int offset, int layoutWidth, int layoutHeight) {
        int width;
        this.offset = offset;
        this.mainAxisLayoutSize = this.isVertical ? layoutHeight : layoutWidth;
        List<Placeable> list = this.placeables;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Placeable placeable = list.get(i2);
            int i3 = i2 * 2;
            if (this.isVertical) {
                int[] iArr = this.placeableOffsets;
                Alignment.Horizontal horizontal = this.horizontalAlignment;
                if (horizontal == null) {
                    throw new IllegalArgumentException("null horizontalAlignment");
                }
                iArr[i3] = horizontal.align(placeable.getWidth(), layoutWidth, this.layoutDirection);
                this.placeableOffsets[i3 + 1] = offset;
                width = placeable.getHeight();
            } else {
                int[] iArr2 = this.placeableOffsets;
                iArr2[i3] = offset;
                int i4 = i3 + 1;
                Alignment.Vertical vertical = this.verticalAlignment;
                if (vertical == null) {
                    throw new IllegalArgumentException("null verticalAlignment");
                }
                iArr2[i4] = vertical.align(placeable.getHeight(), layoutHeight);
                width = placeable.getWidth();
            }
            offset = width + offset;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MeasuredPage(int i2, int i3, List<? extends Placeable> list, long j2, Object obj, Orientation orientation, Alignment.Horizontal horizontal, Alignment.Vertical vertical, LayoutDirection layoutDirection, boolean z) {
        this.index = i2;
        this.size = i3;
        this.placeables = list;
        this.visualOffset = j2;
        this.key = obj;
        this.horizontalAlignment = horizontal;
        this.verticalAlignment = vertical;
        this.layoutDirection = layoutDirection;
        this.reverseLayout = z;
        this.isVertical = orientation == Orientation.Vertical;
        int size = list.size();
        int iMax = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Placeable placeable = (Placeable) list.get(i4);
            iMax = Math.max(iMax, !this.isVertical ? placeable.getHeight() : placeable.getWidth());
        }
        this.crossAxisSize = iMax;
        this.placeableOffsets = new int[this.placeables.size() * 2];
        this.mainAxisLayoutSize = Integer.MIN_VALUE;
    }
}
