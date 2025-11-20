package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import j.AbstractC0666t;
import j.C0641G;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJU\u0010&\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010*R\u001d\u0010\u0004\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b+\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b\b\u00100R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b2\u00103R'\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020%0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006A"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "", "Landroidx/compose/ui/geometry/Offset;", "currentPosition", "previousHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerCoordinates", "", "isStartHandle", "Landroidx/compose/foundation/text/selection/Selection;", "previousSelection", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "selectableIdOrderingComparator", "<init>", "(JJLandroidx/compose/ui/layout/LayoutCoordinates;ZLandroidx/compose/foundation/text/selection/Selection;Ljava/util/Comparator;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "slot", "Landroidx/compose/foundation/text/selection/Direction;", "xPositionDirection", "yPositionDirection", "updateSlot", "(ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;)I", "Landroidx/compose/foundation/text/selection/SelectionLayout;", "build", "()Landroidx/compose/foundation/text/selection/SelectionLayout;", "selectableId", "rawStartHandleOffset", "startXHandleDirection", "startYHandleDirection", "rawEndHandleOffset", "endXHandleDirection", "endYHandleDirection", "rawPreviousHandleOffset", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/foundation/text/selection/SelectableInfo;", "appendInfo", "(JILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/foundation/text/selection/Direction;Landroidx/compose/foundation/text/selection/Direction;ILandroidx/compose/ui/text/TextLayoutResult;)Landroidx/compose/foundation/text/selection/SelectableInfo;", "J", "getCurrentPosition-F1C5BW0", "()J", "getPreviousHandlePosition-F1C5BW0", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getContainerCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Z", "()Z", "Landroidx/compose/foundation/text/selection/Selection;", "getPreviousSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "Ljava/util/Comparator;", "getSelectableIdOrderingComparator", "()Ljava/util/Comparator;", "Lj/G;", "selectableIdToInfoListIndex", "Lj/G;", "", "infoList", "Ljava/util/List;", "startSlot", "I", "endSlot", "currentSlot", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionLayoutBuilder {
    public static final int $stable = 8;
    private final LayoutCoordinates containerCoordinates;
    private final long currentPosition;
    private int currentSlot;
    private int endSlot;
    private final List<SelectableInfo> infoList;
    private final boolean isStartHandle;
    private final long previousHandlePosition;
    private final Selection previousSelection;
    private final Comparator<Long> selectableIdOrderingComparator;
    private final C0641G selectableIdToInfoListIndex;
    private int startSlot;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, Comparator comparator, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, layoutCoordinates, z, selection, comparator);
    }

    private final int updateSlot(int slot, Direction xPositionDirection, Direction yPositionDirection) {
        if (slot == -1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[SelectionLayoutKt.resolve2dDirection(xPositionDirection, yPositionDirection).ordinal()];
            if (i2 == 1) {
                return this.currentSlot - 1;
            }
            if (i2 == 2) {
                return this.currentSlot;
            }
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return slot;
    }

    public final SelectableInfo appendInfo(long selectableId, int rawStartHandleOffset, Direction startXHandleDirection, Direction startYHandleDirection, int rawEndHandleOffset, Direction endXHandleDirection, Direction endYHandleDirection, int rawPreviousHandleOffset, TextLayoutResult textLayoutResult) {
        this.currentSlot += 2;
        SelectableInfo selectableInfo = new SelectableInfo(selectableId, this.currentSlot, rawStartHandleOffset, rawEndHandleOffset, rawPreviousHandleOffset, textLayoutResult);
        this.startSlot = updateSlot(this.startSlot, startXHandleDirection, startYHandleDirection);
        this.endSlot = updateSlot(this.endSlot, endXHandleDirection, endYHandleDirection);
        this.selectableIdToInfoListIndex.d(selectableId, this.infoList.size());
        this.infoList.add(selectableInfo);
        return selectableInfo;
    }

    public final SelectionLayout build() {
        int i2 = this.currentSlot + 1;
        int size = this.infoList.size();
        if (size == 0) {
            throw new IllegalStateException("SelectionLayout must not be empty.");
        }
        if (size == 1) {
            SelectableInfo selectableInfo = (SelectableInfo) CollectionsKt.single((List) this.infoList);
            int i3 = this.startSlot;
            int i4 = i3 == -1 ? i2 : i3;
            int i5 = this.endSlot;
            return new SingleSelectionLayout(this.isStartHandle, i4, i5 == -1 ? i2 : i5, this.previousSelection, selectableInfo);
        }
        C0641G c0641g = this.selectableIdToInfoListIndex;
        List<SelectableInfo> list = this.infoList;
        int i6 = this.startSlot;
        int i7 = i6 == -1 ? i2 : i6;
        int i8 = this.endSlot;
        return new MultiSelectionLayout(c0641g, list, i7, i8 == -1 ? i2 : i8, this.isStartHandle, this.previousSelection);
    }

    public final LayoutCoordinates getContainerCoordinates() {
        return this.containerCoordinates;
    }

    /* renamed from: getCurrentPosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getCurrentPosition() {
        return this.currentPosition;
    }

    /* renamed from: getPreviousHandlePosition-F1C5BW0, reason: not valid java name and from getter */
    public final long getPreviousHandlePosition() {
        return this.previousHandlePosition;
    }

    public final Selection getPreviousSelection() {
        return this.previousSelection;
    }

    public final Comparator<Long> getSelectableIdOrderingComparator() {
        return this.selectableIdOrderingComparator;
    }

    /* renamed from: isStartHandle, reason: from getter */
    public final boolean getIsStartHandle() {
        return this.isStartHandle;
    }

    private SelectionLayoutBuilder(long j2, long j3, LayoutCoordinates layoutCoordinates, boolean z, Selection selection, Comparator<Long> comparator) {
        this.currentPosition = j2;
        this.previousHandlePosition = j3;
        this.containerCoordinates = layoutCoordinates;
        this.isStartHandle = z;
        this.previousSelection = selection;
        this.selectableIdOrderingComparator = comparator;
        int i2 = AbstractC0666t.f867a;
        this.selectableIdToInfoListIndex = new C0641G(6);
        this.infoList = new ArrayList();
        this.startSlot = -1;
        this.endSlot = -1;
        this.currentSlot = -1;
    }
}
