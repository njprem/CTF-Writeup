package androidx.compose.runtime.changelist;

import J.d;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.ControlledComposition;
import androidx.compose.runtime.MovableContentState;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SlotTable;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import androidx.compose.runtime.internal.IntRef;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\"\u0010\u000b\u001a\u00020\n2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0006J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u001e\u0010\u001c\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u001e2\u0006\u0010\u001f\u001a\u00020 J(\u0010!\u001a\u00020\n2\b\u0010\"\u001a\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'J\u0006\u0010)\u001a\u00020\nJ\u0016\u0010*\u001a\u00020\n2\u0006\u0010+\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019J\u001b\u0010,\u001a\u00020\n2\u000e\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0-¢\u0006\u0002\u0010.J\"\u0010/\u001a\u00020\n2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\n012\u0006\u00103\u001a\u000202J\u0006\u00104\u001a\u00020\nJ\u0006\u00105\u001a\u00020\nJ\u000e\u00106\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u00107\u001a\u00020\nJ\u001a\u00108\u001a\u00020\n2\u0006\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 J\u0016\u0010:\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020;J\u001e\u0010:\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020;2\u0006\u0010<\u001a\u00020=J\u000e\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020\u0006J\u001e\u0010@\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00062\u0006\u0010A\u001a\u00020\u0006J\u001e\u0010B\u001a\u00020\n2\u0006\u00103\u001a\u00020C2\u0006\u0010$\u001a\u00020%2\u0006\u0010D\u001a\u00020'J\u000e\u0010E\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020FJ\u0006\u0010G\u001a\u00020\nJ\u0016\u0010H\u001a\u00020\n2\u0006\u0010I\u001a\u00020\u00062\u0006\u0010J\u001a\u00020\u0006J\u0006\u0010K\u001a\u00020\nJ\u0014\u0010L\u001a\u00020\n2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\n0NJ\u0006\u0010O\u001a\u00020\nJ\u000e\u0010P\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006J \u0010Q\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010R\u001a\u00020\u0006J\u0010\u0010S\u001a\u00020\n2\b\u0010T\u001a\u0004\u0018\u00010\u001bJ>\u0010U\u001a\u00020\n\"\u0004\b\u0000\u0010V\"\u0004\b\u0001\u0010W2\u0006\u0010\u001a\u001a\u0002HW2\u001d\u0010X\u001a\u0019\u0012\u0004\u0012\u0002HV\u0012\u0004\u0012\u0002HW\u0012\u0004\u0012\u00020\n0Y¢\u0006\u0002\bZ¢\u0006\u0002\u0010[J\u0018\u0010\\\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\u0006\u0010R\u001a\u00020\u0006J\u000e\u0010]\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006J\u0010\u0010^\u001a\u00020\n2\b\u0010_\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020aH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006c"}, d2 = {"Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "size", "", "getSize", "()I", "clear", "", "executeAndFlushAllPendingChanges", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "pushAdvanceSlotsBy", "distance", "pushAppendValue", "anchor", "Landroidx/compose/runtime/Anchor;", "value", "", "pushCopyNodesToNewAnchorLocation", "nodes", "", "effectiveNodeIndex", "Landroidx/compose/runtime/internal/IntRef;", "pushCopySlotTableToAnchorLocation", "resolvedState", "Landroidx/compose/runtime/MovableContentState;", "parentContext", "Landroidx/compose/runtime/CompositionContext;", "from", "Landroidx/compose/runtime/MovableContentStateReference;", "to", "pushDeactivateCurrentGroup", "pushDetermineMovableContentNodeIndex", "effectiveNodeIndexOut", "pushDowns", "", "([Ljava/lang/Object;)V", "pushEndCompositionScope", "action", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composition;", "composition", "pushEndCurrentGroup", "pushEndMovableContentPlacement", "pushEnsureGroupStarted", "pushEnsureRootStarted", "pushExecuteOperationsIn", "changeList", "pushInsertSlots", "Landroidx/compose/runtime/SlotTable;", "fixups", "Landroidx/compose/runtime/changelist/FixupList;", "pushMoveCurrentGroup", "offset", "pushMoveNode", "count", "pushReleaseMovableGroupAtCurrent", "Landroidx/compose/runtime/ControlledComposition;", "reference", "pushRemember", "Landroidx/compose/runtime/RememberObserver;", "pushRemoveCurrentGroup", "pushRemoveNode", "removeFrom", "moveCount", "pushResetSlots", "pushSideEffect", "effect", "Lkotlin/Function0;", "pushSkipToEndOfCurrentGroup", "pushTrimValues", "pushUpdateAnchoredValue", "groupSlotIndex", "pushUpdateAuxData", "data", "pushUpdateNode", "T", "V", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "pushUpdateValue", "pushUps", "pushUseNode", "node", "toDebugString", "", "linePrefix", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ChangeList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();

    public static /* synthetic */ void pushExecuteOperationsIn$default(ChangeList changeList, ChangeList changeList2, IntRef intRef, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            intRef = null;
        }
        changeList.pushExecuteOperationsIn(changeList2, intRef);
    }

    public final void clear() {
        this.operations.clear();
    }

    public final void executeAndFlushAllPendingChanges(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        this.operations.executeAndFlushAllPendingOperations(applier, slots, rememberManager);
    }

    public final int getSize() {
        return this.operations.getOpCodesSize();
    }

    public final boolean isEmpty() {
        return this.operations.isEmpty();
    }

    public final boolean isNotEmpty() {
        return this.operations.isNotEmpty();
    }

    public final void pushAdvanceSlotsBy(int distance) {
        Operations operations = this.operations;
        Operation.AdvanceSlotsBy advanceSlotsBy = Operation.AdvanceSlotsBy.INSTANCE;
        operations.pushOp(advanceSlotsBy);
        Operations.WriteScope.m3373setIntA6tL2VI(Operations.WriteScope.m3368constructorimpl(operations), Operation.IntParameter.m3325constructorimpl(0), distance);
        if (operations.pushedIntMask == operations.createExpectedArgMask(advanceSlotsBy.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(advanceSlotsBy.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = advanceSlotsBy.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(advanceSlotsBy.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = advanceSlotsBy.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(advanceSlotsBy.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(advanceSlotsBy);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushAppendValue(Anchor anchor, Object value) {
        Operations operations = this.operations;
        Operation.AppendValue appendValue = Operation.AppendValue.INSTANCE;
        operations.pushOp(appendValue);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), anchor);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), value);
        if (operations.pushedIntMask == operations.createExpectedArgMask(appendValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(appendValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = appendValue.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(appendValue.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = appendValue.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(appendValue.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(appendValue);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushCopyNodesToNewAnchorLocation(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        if (nodes.isEmpty()) {
            return;
        }
        Operations operations = this.operations;
        Operation.CopyNodesToNewAnchorLocation copyNodesToNewAnchorLocation = Operation.CopyNodesToNewAnchorLocation.INSTANCE;
        operations.pushOp(copyNodesToNewAnchorLocation);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), nodes);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), effectiveNodeIndex);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copyNodesToNewAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copyNodesToNewAnchorLocation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(copyNodesToNewAnchorLocation.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = copyNodesToNewAnchorLocation.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(copyNodesToNewAnchorLocation.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(copyNodesToNewAnchorLocation);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushCopySlotTableToAnchorLocation(MovableContentState resolvedState, CompositionContext parentContext, MovableContentStateReference from, MovableContentStateReference to) {
        Operations operations = this.operations;
        Operation.CopySlotTableToAnchorLocation copySlotTableToAnchorLocation = Operation.CopySlotTableToAnchorLocation.INSTANCE;
        operations.pushOp(copySlotTableToAnchorLocation);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), resolvedState);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), parentContext);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(3), to);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(2), from);
        if (operations.pushedIntMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(copySlotTableToAnchorLocation.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = copySlotTableToAnchorLocation.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(copySlotTableToAnchorLocation.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = copySlotTableToAnchorLocation.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(copySlotTableToAnchorLocation.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(copySlotTableToAnchorLocation);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushDeactivateCurrentGroup() {
        this.operations.push(Operation.DeactivateCurrentGroup.INSTANCE);
    }

    public final void pushDetermineMovableContentNodeIndex(IntRef effectiveNodeIndexOut, Anchor anchor) {
        Operations operations = this.operations;
        Operation.DetermineMovableContentNodeIndex determineMovableContentNodeIndex = Operation.DetermineMovableContentNodeIndex.INSTANCE;
        operations.pushOp(determineMovableContentNodeIndex);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), effectiveNodeIndexOut);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(determineMovableContentNodeIndex.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = determineMovableContentNodeIndex.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(determineMovableContentNodeIndex.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = determineMovableContentNodeIndex.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(determineMovableContentNodeIndex.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(determineMovableContentNodeIndex);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushDowns(Object[] nodes) {
        if (nodes.length == 0) {
            return;
        }
        Operations operations = this.operations;
        Operation.Downs downs = Operation.Downs.INSTANCE;
        operations.pushOp(downs);
        Operations.WriteScope.m3374setObjectDKhxnng(Operations.WriteScope.m3368constructorimpl(operations), Operation.ObjectParameter.m3336constructorimpl(0), nodes);
        if (operations.pushedIntMask == operations.createExpectedArgMask(downs.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(downs.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = downs.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(downs.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = downs.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(downs.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(downs);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushEndCompositionScope(Function1<? super Composition, Unit> action, Composition composition) {
        Operations operations = this.operations;
        Operation.EndCompositionScope endCompositionScope = Operation.EndCompositionScope.INSTANCE;
        operations.pushOp(endCompositionScope);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), action);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), composition);
        if (operations.pushedIntMask == operations.createExpectedArgMask(endCompositionScope.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(endCompositionScope.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = endCompositionScope.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(endCompositionScope.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = endCompositionScope.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(endCompositionScope.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(endCompositionScope);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushEndCurrentGroup() {
        this.operations.push(Operation.EndCurrentGroup.INSTANCE);
    }

    public final void pushEndMovableContentPlacement() {
        this.operations.push(Operation.EndMovableContentPlacement.INSTANCE);
    }

    public final void pushEnsureGroupStarted(Anchor anchor) {
        Operations operations = this.operations;
        Operation.EnsureGroupStarted ensureGroupStarted = Operation.EnsureGroupStarted.INSTANCE;
        operations.pushOp(ensureGroupStarted);
        Operations.WriteScope.m3374setObjectDKhxnng(Operations.WriteScope.m3368constructorimpl(operations), Operation.ObjectParameter.m3336constructorimpl(0), anchor);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ensureGroupStarted.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ensureGroupStarted.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ensureGroupStarted.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(ensureGroupStarted.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = ensureGroupStarted.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(ensureGroupStarted.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(ensureGroupStarted);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushEnsureRootStarted() {
        this.operations.push(Operation.EnsureRootGroupStarted.INSTANCE);
    }

    public final void pushExecuteOperationsIn(ChangeList changeList, IntRef effectiveNodeIndex) {
        if (changeList.isNotEmpty()) {
            Operations operations = this.operations;
            Operation.ApplyChangeList applyChangeList = Operation.ApplyChangeList.INSTANCE;
            operations.pushOp(applyChangeList);
            Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
            Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), changeList);
            Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), effectiveNodeIndex);
            if (operations.pushedIntMask == operations.createExpectedArgMask(applyChangeList.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(applyChangeList.getObjects())) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int ints = applyChangeList.getInts();
            int i2 = 0;
            for (int i3 = 0; i3 < ints; i3++) {
                if (((1 << i3) & operations.pushedIntMask) != 0) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(applyChangeList.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                    i2++;
                }
            }
            String string = sb.toString();
            StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
            int objects = applyChangeList.getObjects();
            int i4 = 0;
            for (int i5 = 0; i5 < objects; i5++) {
                if (((1 << i5) & operations.pushedObjectMask) != 0) {
                    if (i2 > 0) {
                        sbR.append(", ");
                    }
                    sbR.append(applyChangeList.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                    i4++;
                }
            }
            String string2 = sbR.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(applyChangeList);
            sb2.append(". Not all arguments were provided. Missing ");
            a.z(sb2, i2, " int arguments (", string, ") and ");
            a.D(sb2, i4, " object arguments (", string2, ").");
        }
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from) {
        Operations operations = this.operations;
        Operation.InsertSlots insertSlots = Operation.InsertSlots.INSTANCE;
        operations.pushOp(insertSlots);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), anchor);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), from);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlots.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlots.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlots.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlots.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = insertSlots.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(insertSlots.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(insertSlots);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushMoveCurrentGroup(int offset) {
        Operations operations = this.operations;
        Operation.MoveCurrentGroup moveCurrentGroup = Operation.MoveCurrentGroup.INSTANCE;
        operations.pushOp(moveCurrentGroup);
        Operations.WriteScope.m3373setIntA6tL2VI(Operations.WriteScope.m3368constructorimpl(operations), Operation.IntParameter.m3325constructorimpl(0), offset);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveCurrentGroup.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveCurrentGroup.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveCurrentGroup.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(moveCurrentGroup.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = moveCurrentGroup.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(moveCurrentGroup.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(moveCurrentGroup);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushMoveNode(int to, int from, int count) {
        Operations operations = this.operations;
        Operation.MoveNode moveNode = Operation.MoveNode.INSTANCE;
        operations.pushOp(moveNode);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(1), to);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(0), from);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(2), count);
        if (operations.pushedIntMask == operations.createExpectedArgMask(moveNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(moveNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = moveNode.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(moveNode.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = moveNode.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(moveNode.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(moveNode);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushReleaseMovableGroupAtCurrent(ControlledComposition composition, CompositionContext parentContext, MovableContentStateReference reference) {
        Operations operations = this.operations;
        Operation.ReleaseMovableGroupAtCurrent releaseMovableGroupAtCurrent = Operation.ReleaseMovableGroupAtCurrent.INSTANCE;
        operations.pushOp(releaseMovableGroupAtCurrent);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), composition);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), parentContext);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(2), reference);
        if (operations.pushedIntMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(releaseMovableGroupAtCurrent.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = releaseMovableGroupAtCurrent.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(releaseMovableGroupAtCurrent.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = releaseMovableGroupAtCurrent.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(releaseMovableGroupAtCurrent.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(releaseMovableGroupAtCurrent);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushRemember(RememberObserver value) {
        Operations operations = this.operations;
        Operation.Remember remember = Operation.Remember.INSTANCE;
        operations.pushOp(remember);
        Operations.WriteScope.m3374setObjectDKhxnng(Operations.WriteScope.m3368constructorimpl(operations), Operation.ObjectParameter.m3336constructorimpl(0), value);
        if (operations.pushedIntMask == operations.createExpectedArgMask(remember.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(remember.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = remember.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(remember.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = remember.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(remember.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(remember);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushRemoveCurrentGroup() {
        this.operations.push(Operation.RemoveCurrentGroup.INSTANCE);
    }

    public final void pushRemoveNode(int removeFrom, int moveCount) {
        Operations operations = this.operations;
        Operation.RemoveNode removeNode = Operation.RemoveNode.INSTANCE;
        operations.pushOp(removeNode);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(0), removeFrom);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(1), moveCount);
        if (operations.pushedIntMask == operations.createExpectedArgMask(removeNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(removeNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = removeNode.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(removeNode.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = removeNode.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(removeNode.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(removeNode);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushResetSlots() {
        this.operations.push(Operation.ResetSlots.INSTANCE);
    }

    public final void pushSideEffect(Function0<Unit> effect) {
        Operations operations = this.operations;
        Operation.SideEffect sideEffect = Operation.SideEffect.INSTANCE;
        operations.pushOp(sideEffect);
        Operations.WriteScope.m3374setObjectDKhxnng(Operations.WriteScope.m3368constructorimpl(operations), Operation.ObjectParameter.m3336constructorimpl(0), effect);
        if (operations.pushedIntMask == operations.createExpectedArgMask(sideEffect.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(sideEffect.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = sideEffect.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(sideEffect.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = sideEffect.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(sideEffect.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(sideEffect);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushSkipToEndOfCurrentGroup() {
        this.operations.push(Operation.SkipToEndOfCurrentGroup.INSTANCE);
    }

    public final void pushTrimValues(int count) {
        Operations operations = this.operations;
        Operation.TrimParentValues trimParentValues = Operation.TrimParentValues.INSTANCE;
        operations.pushOp(trimParentValues);
        Operations.WriteScope.m3373setIntA6tL2VI(Operations.WriteScope.m3368constructorimpl(operations), Operation.IntParameter.m3325constructorimpl(0), count);
        if (operations.pushedIntMask == operations.createExpectedArgMask(trimParentValues.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(trimParentValues.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = trimParentValues.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(trimParentValues.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = trimParentValues.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(trimParentValues.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(trimParentValues);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushUpdateAnchoredValue(Object value, Anchor anchor, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateAnchoredValue updateAnchoredValue = Operation.UpdateAnchoredValue.INSTANCE;
        operations.pushOp(updateAnchoredValue);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), value);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), anchor);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(0), groupSlotIndex);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAnchoredValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAnchoredValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAnchoredValue.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateAnchoredValue.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateAnchoredValue.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(updateAnchoredValue.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(updateAnchoredValue);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushUpdateAuxData(Object data) {
        Operations operations = this.operations;
        Operation.UpdateAuxData updateAuxData = Operation.UpdateAuxData.INSTANCE;
        operations.pushOp(updateAuxData);
        Operations.WriteScope.m3374setObjectDKhxnng(Operations.WriteScope.m3368constructorimpl(operations), Operation.ObjectParameter.m3336constructorimpl(0), data);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateAuxData.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateAuxData.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateAuxData.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateAuxData.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateAuxData.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(updateAuxData.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(updateAuxData);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final <T, V> void pushUpdateNode(V value, Function2<? super T, ? super V, Unit> block) {
        Operations operations = this.operations;
        Operation.UpdateNode updateNode = Operation.UpdateNode.INSTANCE;
        operations.pushOp(updateNode);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), value);
        int iM3336constructorimpl = Operation.ObjectParameter.m3336constructorimpl(1);
        Intrinsics.checkNotNull(block, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, iM3336constructorimpl, (Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(block, 2));
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateNode.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateNode.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateNode.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateNode.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateNode.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(updateNode.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(updateNode);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushUpdateValue(Object value, int groupSlotIndex) {
        Operations operations = this.operations;
        Operation.UpdateValue updateValue = Operation.UpdateValue.INSTANCE;
        operations.pushOp(updateValue);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), value);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(0), groupSlotIndex);
        if (operations.pushedIntMask == operations.createExpectedArgMask(updateValue.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(updateValue.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = updateValue.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(updateValue.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = updateValue.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(updateValue.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(updateValue);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushUps(int count) {
        Operations operations = this.operations;
        Operation.Ups ups = Operation.Ups.INSTANCE;
        operations.pushOp(ups);
        Operations.WriteScope.m3373setIntA6tL2VI(Operations.WriteScope.m3368constructorimpl(operations), Operation.IntParameter.m3325constructorimpl(0), count);
        if (operations.pushedIntMask == operations.createExpectedArgMask(ups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(ups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = ups.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(ups.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = ups.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(ups.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(ups);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }

    public final void pushUseNode(Object node) {
        if (node instanceof ComposeNodeLifecycleCallback) {
            this.operations.push(Operation.UseCurrentNode.INSTANCE);
        }
    }

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("ChangeList instance containing ");
        sb.append(getSize());
        sb.append(" operations");
        if (sb.length() > 0) {
            sb.append(":\n");
            sb.append(this.operations.toDebugString(linePrefix));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final void pushInsertSlots(Anchor anchor, SlotTable from, FixupList fixups) {
        Operations operations = this.operations;
        Operation.InsertSlotsWithFixups insertSlotsWithFixups = Operation.InsertSlotsWithFixups.INSTANCE;
        operations.pushOp(insertSlotsWithFixups);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), anchor);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), from);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(2), fixups);
        if (operations.pushedIntMask == operations.createExpectedArgMask(insertSlotsWithFixups.getInts()) && operations.pushedObjectMask == operations.createExpectedArgMask(insertSlotsWithFixups.getObjects())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int ints = insertSlotsWithFixups.getInts();
        int i2 = 0;
        for (int i3 = 0; i3 < ints; i3++) {
            if (((1 << i3) & operations.pushedIntMask) != 0) {
                if (i2 > 0) {
                    sb.append(", ");
                }
                sb.append(insertSlotsWithFixups.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i3)));
                i2++;
            }
        }
        String string = sb.toString();
        StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
        int objects = insertSlotsWithFixups.getObjects();
        int i4 = 0;
        for (int i5 = 0; i5 < objects; i5++) {
            if (((1 << i5) & operations.pushedObjectMask) != 0) {
                if (i2 > 0) {
                    sbR.append(", ");
                }
                sbR.append(insertSlotsWithFixups.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i5)));
                i4++;
            }
        }
        String string2 = sbR.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb2 = new StringBuilder("Error while pushing ");
        sb2.append(insertSlotsWithFixups);
        sb2.append(". Not all arguments were provided. Missing ");
        a.z(sb2, i2, " int arguments (", string, ") and ");
        a.D(sb2, i4, " object arguments (", string2, ").");
    }
}
