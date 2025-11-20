package androidx.compose.foundation.text.selection;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import j.AbstractC0667u;
import j.AbstractC0668v;
import j.C0642H;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 s2\u00020\u0001:\u0001sB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0005J2\u0010 \u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b!\u0010\"JB\u0010(\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b*\u0010\u0005R\"\u0010+\u001a\u00020\u001c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\u0007018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0007048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\u000607j\u0002`88\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010ARB\u0010C\u001a\"\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR6\u0010J\u001a\u0016\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010I8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010ORN\u0010Q\u001a.\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001c\u0018\u00010P8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR*\u0010X\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010W8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R0\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010=\u001a\u0004\b_\u0010?\"\u0004\b`\u0010AR0\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\ba\u0010=\u001a\u0004\bb\u0010?\"\u0004\bc\u0010AR7\u0010m\u001a\b\u0012\u0004\u0012\u00020e0d2\f\u0010f\u001a\b\u0012\u0004\u0012\u00020e0d8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001a\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00070d8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bq\u0010j\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "Landroidx/compose/foundation/text/selection/SelectionRegistrar;", "", "initialIncrementId", "<init>", "(J)V", "()V", "Landroidx/compose/foundation/text/selection/Selectable;", "selectable", "subscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)Landroidx/compose/foundation/text/selection/Selectable;", "", "unsubscribe", "(Landroidx/compose/foundation/text/selection/Selectable;)V", "nextSelectableId", "()J", "Landroidx/compose/ui/layout/LayoutCoordinates;", "containerLayoutCoordinates", "", "sort", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Ljava/util/List;", "selectableId", "notifyPositionChange", "layoutCoordinates", "Landroidx/compose/ui/geometry/Offset;", "startPosition", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "adjustment", "", "isInTouchMode", "notifySelectionUpdateStart-ubNVwUQ", "(Landroidx/compose/ui/layout/LayoutCoordinates;JLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)V", "notifySelectionUpdateStart", "notifySelectionUpdateSelectAll", "(JZ)V", "newPosition", "previousPosition", "isStartHandle", "notifySelectionUpdate-njBpvok", "(Landroidx/compose/ui/layout/LayoutCoordinates;JJZLandroidx/compose/foundation/text/selection/SelectionAdjustment;Z)Z", "notifySelectionUpdate", "notifySelectionUpdateEnd", "notifySelectableChange", "sorted", "Z", "getSorted$foundation_release", "()Z", "setSorted$foundation_release", "(Z)V", "", "_selectables", "Ljava/util/List;", "Lj/H;", "_selectableMap", "Lj/H;", "Ljava/util/concurrent/atomic/AtomicLong;", "Landroidx/compose/foundation/AtomicLong;", "incrementId", "Ljava/util/concurrent/atomic/AtomicLong;", "Lkotlin/Function1;", "onPositionChangeCallback", "Lkotlin/jvm/functions/Function1;", "getOnPositionChangeCallback$foundation_release", "()Lkotlin/jvm/functions/Function1;", "setOnPositionChangeCallback$foundation_release", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function4;", "onSelectionUpdateStartCallback", "Lkotlin/jvm/functions/Function4;", "getOnSelectionUpdateStartCallback$foundation_release", "()Lkotlin/jvm/functions/Function4;", "setOnSelectionUpdateStartCallback$foundation_release", "(Lkotlin/jvm/functions/Function4;)V", "Lkotlin/Function2;", "onSelectionUpdateSelectAll", "Lkotlin/jvm/functions/Function2;", "getOnSelectionUpdateSelectAll$foundation_release", "()Lkotlin/jvm/functions/Function2;", "setOnSelectionUpdateSelectAll$foundation_release", "(Lkotlin/jvm/functions/Function2;)V", "Lkotlin/Function6;", "onSelectionUpdateCallback", "Lkotlin/jvm/functions/Function6;", "getOnSelectionUpdateCallback$foundation_release", "()Lkotlin/jvm/functions/Function6;", "setOnSelectionUpdateCallback$foundation_release", "(Lkotlin/jvm/functions/Function6;)V", "Lkotlin/Function0;", "onSelectionUpdateEndCallback", "Lkotlin/jvm/functions/Function0;", "getOnSelectionUpdateEndCallback$foundation_release", "()Lkotlin/jvm/functions/Function0;", "setOnSelectionUpdateEndCallback$foundation_release", "(Lkotlin/jvm/functions/Function0;)V", "onSelectableChangeCallback", "getOnSelectableChangeCallback$foundation_release", "setOnSelectableChangeCallback$foundation_release", "afterSelectableUnsubscribe", "getAfterSelectableUnsubscribe$foundation_release", "setAfterSelectableUnsubscribe$foundation_release", "Lj/u;", "Landroidx/compose/foundation/text/selection/Selection;", "<set-?>", "subselections$delegate", "Landroidx/compose/runtime/MutableState;", "getSubselections", "()Lj/u;", "setSubselections", "(Lj/u;)V", "subselections", "getSelectables$foundation_release", "()Ljava/util/List;", "selectables", "getSelectableMap$foundation_release", "selectableMap", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SelectionRegistrarImpl implements SelectionRegistrar {
    private final C0642H _selectableMap;
    private final List<Selectable> _selectables;
    private Function1<? super Long, Unit> afterSelectableUnsubscribe;
    private AtomicLong incrementId;
    private Function1<? super Long, Unit> onPositionChangeCallback;
    private Function1<? super Long, Unit> onSelectableChangeCallback;
    private Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> onSelectionUpdateCallback;
    private Function0<Unit> onSelectionUpdateEndCallback;
    private Function2<? super Boolean, ? super Long, Unit> onSelectionUpdateSelectAll;
    private Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> onSelectionUpdateStartCallback;
    private boolean sorted;

    /* renamed from: subselections$delegate, reason: from kotlin metadata */
    private final MutableState subselections;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Saver<SelectionRegistrarImpl, Long> Saver = SaverKt.Saver(new Function2<SaverScope, SelectionRegistrarImpl, Long>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$1
        @Override // kotlin.jvm.functions.Function2
        public final Long invoke(SaverScope saverScope, SelectionRegistrarImpl selectionRegistrarImpl) {
            return Long.valueOf(selectionRegistrarImpl.incrementId.get());
        }
    }, new Function1<Long, SelectionRegistrarImpl>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl$Companion$Saver$2
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ SelectionRegistrarImpl invoke(Long l2) {
            return invoke(l2.longValue());
        }

        public final SelectionRegistrarImpl invoke(long j2) {
            return new SelectionRegistrarImpl(j2, null);
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/selection/SelectionRegistrarImpl;", "", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Saver<SelectionRegistrarImpl, Long> getSaver() {
            return SelectionRegistrarImpl.Saver;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SelectionRegistrarImpl(long j2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sort$lambda$2(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    public final Function1<Long, Unit> getAfterSelectableUnsubscribe$foundation_release() {
        return this.afterSelectableUnsubscribe;
    }

    public final Function1<Long, Unit> getOnPositionChangeCallback$foundation_release() {
        return this.onPositionChangeCallback;
    }

    public final Function1<Long, Unit> getOnSelectableChangeCallback$foundation_release() {
        return this.onSelectableChangeCallback;
    }

    public final Function6<Boolean, LayoutCoordinates, Offset, Offset, Boolean, SelectionAdjustment, Boolean> getOnSelectionUpdateCallback$foundation_release() {
        return this.onSelectionUpdateCallback;
    }

    public final Function0<Unit> getOnSelectionUpdateEndCallback$foundation_release() {
        return this.onSelectionUpdateEndCallback;
    }

    public final Function2<Boolean, Long, Unit> getOnSelectionUpdateSelectAll$foundation_release() {
        return this.onSelectionUpdateSelectAll;
    }

    public final Function4<Boolean, LayoutCoordinates, Offset, SelectionAdjustment, Unit> getOnSelectionUpdateStartCallback$foundation_release() {
        return this.onSelectionUpdateStartCallback;
    }

    public final AbstractC0667u getSelectableMap$foundation_release() {
        return this._selectableMap;
    }

    public final List<Selectable> getSelectables$foundation_release() {
        return this._selectables;
    }

    /* renamed from: getSorted$foundation_release, reason: from getter */
    public final boolean getSorted() {
        return this.sorted;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public AbstractC0667u getSubselections() {
        return (AbstractC0667u) this.subselections.getValue();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public long nextSelectableId() {
        long andIncrement = this.incrementId.getAndIncrement();
        while (andIncrement == 0) {
            andIncrement = this.incrementId.getAndIncrement();
        }
        return andIncrement;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifyPositionChange(long selectableId) {
        this.sorted = false;
        Function1<? super Long, Unit> function1 = this.onPositionChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectableChange(long selectableId) {
        Function1<? super Long, Unit> function1 = this.onSelectableChangeCallback;
        if (function1 != null) {
            function1.invoke(Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdate-njBpvok */
    public boolean mo1344notifySelectionUpdatenjBpvok(LayoutCoordinates layoutCoordinates, long newPosition, long previousPosition, boolean isStartHandle, SelectionAdjustment adjustment, boolean isInTouchMode) {
        Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6 = this.onSelectionUpdateCallback;
        if (function6 != null) {
            return function6.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.m3540boximpl(newPosition), Offset.m3540boximpl(previousPosition), Boolean.valueOf(isStartHandle), adjustment).booleanValue();
        }
        return true;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateEnd() {
        Function0<Unit> function0 = this.onSelectionUpdateEndCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public void notifySelectionUpdateSelectAll(long selectableId, boolean isInTouchMode) {
        Function2<? super Boolean, ? super Long, Unit> function2 = this.onSelectionUpdateSelectAll;
        if (function2 != null) {
            function2.invoke(Boolean.valueOf(isInTouchMode), Long.valueOf(selectableId));
        }
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /* renamed from: notifySelectionUpdateStart-ubNVwUQ */
    public void mo1345notifySelectionUpdateStartubNVwUQ(LayoutCoordinates layoutCoordinates, long startPosition, SelectionAdjustment adjustment, boolean isInTouchMode) {
        Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4 = this.onSelectionUpdateStartCallback;
        if (function4 != null) {
            function4.invoke(Boolean.valueOf(isInTouchMode), layoutCoordinates, Offset.m3540boximpl(startPosition), adjustment);
        }
    }

    public final void setAfterSelectableUnsubscribe$foundation_release(Function1<? super Long, Unit> function1) {
        this.afterSelectableUnsubscribe = function1;
    }

    public final void setOnPositionChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onPositionChangeCallback = function1;
    }

    public final void setOnSelectableChangeCallback$foundation_release(Function1<? super Long, Unit> function1) {
        this.onSelectableChangeCallback = function1;
    }

    public final void setOnSelectionUpdateCallback$foundation_release(Function6<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super Offset, ? super Boolean, ? super SelectionAdjustment, Boolean> function6) {
        this.onSelectionUpdateCallback = function6;
    }

    public final void setOnSelectionUpdateEndCallback$foundation_release(Function0<Unit> function0) {
        this.onSelectionUpdateEndCallback = function0;
    }

    public final void setOnSelectionUpdateSelectAll$foundation_release(Function2<? super Boolean, ? super Long, Unit> function2) {
        this.onSelectionUpdateSelectAll = function2;
    }

    public final void setOnSelectionUpdateStartCallback$foundation_release(Function4<? super Boolean, ? super LayoutCoordinates, ? super Offset, ? super SelectionAdjustment, Unit> function4) {
        this.onSelectionUpdateStartCallback = function4;
    }

    public final void setSorted$foundation_release(boolean z) {
        this.sorted = z;
    }

    public void setSubselections(AbstractC0667u abstractC0667u) {
        this.subselections.setValue(abstractC0667u);
    }

    public final List<Selectable> sort(final LayoutCoordinates containerLayoutCoordinates) {
        if (!this.sorted) {
            List<Selectable> list = this._selectables;
            final Function2<Selectable, Selectable, Integer> function2 = new Function2<Selectable, Selectable, Integer>() { // from class: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.sort.1
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(Selectable selectable, Selectable selectable2) {
                    LayoutCoordinates layoutCoordinates = selectable.getLayoutCoordinates();
                    LayoutCoordinates layoutCoordinates2 = selectable2.getLayoutCoordinates();
                    long jMo5129localPositionOfR5De75A = layoutCoordinates != null ? containerLayoutCoordinates.mo5129localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m3567getZeroF1C5BW0()) : Offset.INSTANCE.m3567getZeroF1C5BW0();
                    long jMo5129localPositionOfR5De75A2 = layoutCoordinates2 != null ? containerLayoutCoordinates.mo5129localPositionOfR5De75A(layoutCoordinates2, Offset.INSTANCE.m3567getZeroF1C5BW0()) : Offset.INSTANCE.m3567getZeroF1C5BW0();
                    return Integer.valueOf(Offset.m3552getYimpl(jMo5129localPositionOfR5De75A) == Offset.m3552getYimpl(jMo5129localPositionOfR5De75A2) ? ComparisonsKt.compareValues(Float.valueOf(Offset.m3551getXimpl(jMo5129localPositionOfR5De75A)), Float.valueOf(Offset.m3551getXimpl(jMo5129localPositionOfR5De75A2))) : ComparisonsKt.compareValues(Float.valueOf(Offset.m3552getYimpl(jMo5129localPositionOfR5De75A)), Float.valueOf(Offset.m3552getYimpl(jMo5129localPositionOfR5De75A2))));
                }
            };
            CollectionsKt.sortWith(list, new Comparator() { // from class: androidx.compose.foundation.text.selection.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return SelectionRegistrarImpl.sort$lambda$2(function2, obj, obj2);
                }
            });
            this.sorted = true;
        }
        return getSelectables$foundation_release();
    }

    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    public Selectable subscribe(Selectable selectable) {
        if (selectable.getSelectableId() == 0) {
            throw new IllegalArgumentException(("The selectable contains an invalid id: " + selectable.getSelectableId()).toString());
        }
        if (this._selectableMap.b(selectable.getSelectableId())) {
            throw new IllegalArgumentException(("Another selectable with the id: " + selectable + ".selectableId has already subscribed.").toString());
        }
        this._selectableMap.g(selectable.getSelectableId(), selectable);
        this._selectables.add(selectable);
        this.sorted = false;
        return selectable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x008a, code lost:
    
        if (((r9 & ((~r9) << 6)) & r13) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008c, code lost:
    
        r15 = -1;
     */
    @Override // androidx.compose.foundation.text.selection.SelectionRegistrar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void unsubscribe(androidx.compose.foundation.text.selection.Selectable r22) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionRegistrarImpl.unsubscribe(androidx.compose.foundation.text.selection.Selectable):void");
    }

    private SelectionRegistrarImpl(long j2) {
        this._selectables = new ArrayList();
        C0642H c0642h = AbstractC0668v.f873a;
        this._selectableMap = new C0642H();
        this.incrementId = new AtomicLong(j2);
        C0642H c0642h2 = AbstractC0668v.f873a;
        Intrinsics.checkNotNull(c0642h2, "null cannot be cast to non-null type androidx.collection.LongObjectMap<V of androidx.collection.LongObjectMapKt.emptyLongObjectMap>");
        this.subselections = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(c0642h2, null, 2, null);
    }

    public SelectionRegistrarImpl() {
        this(1L);
    }
}
