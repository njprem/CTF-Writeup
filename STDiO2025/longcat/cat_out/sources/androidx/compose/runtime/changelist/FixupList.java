package androidx.compose.runtime.changelist;

import J.d;
import androidx.compose.runtime.Anchor;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RememberManager;
import androidx.compose.runtime.SlotWriter;
import androidx.compose.runtime.changelist.Operation;
import androidx.compose.runtime.changelist.Operations;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ&\u0010\f\u001a\u00020\u000b2\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000e2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000bJ\"\u0010\u0014\u001a\u00020\u000b2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001cJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0016J>\u0010!\u001a\u00020\u000b\"\u0004\b\u0000\u0010\"\"\u0004\b\u0001\u0010#2\u0006\u0010$\u001a\u0002H\"2\u001d\u0010%\u001a\u0019\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\"\u0012\u0004\u0012\u00020\u000b0&¢\u0006\u0002\b'¢\u0006\u0002\u0010(R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006)"}, d2 = {"Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "()V", "operations", "Landroidx/compose/runtime/changelist/Operations;", "pendingOperations", "size", "", "getSize", "()I", "clear", "", "createAndInsertNode", "factory", "Lkotlin/Function0;", "", "insertIndex", "groupAnchor", "Landroidx/compose/runtime/Anchor;", "endNodeInsert", "executeAndFlushAllPendingFixups", "applier", "Landroidx/compose/runtime/Applier;", "slots", "Landroidx/compose/runtime/SlotWriter;", "rememberManager", "Landroidx/compose/runtime/RememberManager;", "isEmpty", "", "isNotEmpty", "toDebugString", "", "linePrefix", "updateNode", "V", "T", "value", "block", "Lkotlin/Function2;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FixupList extends OperationsDebugStringFormattable {
    public static final int $stable = 8;
    private final Operations operations = new Operations();
    private final Operations pendingOperations = new Operations();

    public final void clear() {
        this.pendingOperations.clear();
        this.operations.clear();
    }

    public final void createAndInsertNode(Function0<? extends Object> factory, int insertIndex, Anchor groupAnchor) {
        int i2;
        int i3;
        Operations operations;
        int i4;
        int i5;
        Operations operations2 = this.operations;
        Operation.InsertNodeFixup insertNodeFixup = Operation.InsertNodeFixup.INSTANCE;
        operations2.pushOp(insertNodeFixup);
        Operations operationsM3368constructorimpl = Operations.WriteScope.m3368constructorimpl(operations2);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(0), factory);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl, Operation.IntParameter.m3325constructorimpl(0), insertIndex);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl, Operation.ObjectParameter.m3336constructorimpl(1), groupAnchor);
        if (operations2.pushedIntMask == operations2.createExpectedArgMask(insertNodeFixup.getInts()) && operations2.pushedObjectMask == operations2.createExpectedArgMask(insertNodeFixup.getObjects())) {
            i2 = 0;
            i3 = 1;
        } else {
            StringBuilder sb = new StringBuilder();
            i2 = 0;
            int ints = insertNodeFixup.getInts();
            i3 = 1;
            int i6 = 0;
            int i7 = 0;
            while (i7 < ints) {
                if (((1 << i7) & operations2.pushedIntMask) != 0) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    i5 = ints;
                    sb.append(insertNodeFixup.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i7)));
                    i6++;
                } else {
                    i5 = ints;
                }
                i7++;
                ints = i5;
            }
            String string = sb.toString();
            StringBuilder sbR = d.r(string, "StringBuilder().apply(builderAction).toString()");
            int objects = insertNodeFixup.getObjects();
            int i8 = 0;
            int i9 = 0;
            while (i9 < objects) {
                if (((1 << i9) & operations2.pushedObjectMask) != 0) {
                    if (i6 > 0) {
                        sbR.append(", ");
                    }
                    i4 = i9;
                    sbR.append(insertNodeFixup.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i4)));
                    i8++;
                } else {
                    i4 = i9;
                }
                i9 = i4 + 1;
            }
            String string2 = sbR.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb2 = new StringBuilder("Error while pushing ");
            sb2.append(insertNodeFixup);
            sb2.append(". Not all arguments were provided. Missing ");
            a.z(sb2, i6, " int arguments (", string, ") and ");
            a.D(sb2, i8, " object arguments (", string2, ").");
        }
        Operations operations3 = this.pendingOperations;
        Operation.PostInsertNodeFixup postInsertNodeFixup = Operation.PostInsertNodeFixup.INSTANCE;
        operations3.pushOp(postInsertNodeFixup);
        Operations operationsM3368constructorimpl2 = Operations.WriteScope.m3368constructorimpl(operations3);
        Operations.WriteScope.m3373setIntA6tL2VI(operationsM3368constructorimpl2, Operation.IntParameter.m3325constructorimpl(i2), insertIndex);
        Operations.WriteScope.m3374setObjectDKhxnng(operationsM3368constructorimpl2, Operation.ObjectParameter.m3336constructorimpl(i2), groupAnchor);
        if (((operations3.pushedIntMask == operations3.createExpectedArgMask(postInsertNodeFixup.getInts()) && operations3.pushedObjectMask == operations3.createExpectedArgMask(postInsertNodeFixup.getObjects())) ? i3 : i2) == 0) {
            StringBuilder sb3 = new StringBuilder();
            int ints2 = postInsertNodeFixup.getInts();
            int i10 = i2;
            int i11 = i10;
            while (i10 < ints2) {
                if (((i3 << i10) & operations3.pushedIntMask) != 0) {
                    if (i11 > 0) {
                        sb3.append(", ");
                    }
                    sb3.append(postInsertNodeFixup.mo3297intParamNamew8GmfQM(Operation.IntParameter.m3325constructorimpl(i10)));
                    i11++;
                }
                i10++;
            }
            String string3 = sb3.toString();
            StringBuilder sbR2 = d.r(string3, "StringBuilder().apply(builderAction).toString()");
            int objects2 = postInsertNodeFixup.getObjects();
            int i12 = i2;
            int i13 = i12;
            while (i13 < objects2) {
                if (((i3 << i13) & operations3.pushedObjectMask) != 0) {
                    if (i11 > 0) {
                        sbR2.append(", ");
                    }
                    operations = operations3;
                    sbR2.append(postInsertNodeFixup.mo3298objectParamName31yXWZQ(Operation.ObjectParameter.m3336constructorimpl(i13)));
                    i12++;
                } else {
                    operations = operations3;
                }
                i13++;
                operations3 = operations;
            }
            String string4 = sbR2.toString();
            Intrinsics.checkNotNullExpressionValue(string4, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(postInsertNodeFixup);
            sb4.append(". Not all arguments were provided. Missing ");
            a.z(sb4, i11, " int arguments (", string3, ") and ");
            a.D(sb4, i12, " object arguments (", string4, ").");
        }
    }

    public final void endNodeInsert() {
        if (!this.pendingOperations.isNotEmpty()) {
            ComposerKt.composeImmediateRuntimeError("Cannot end node insertion, there are no pending operations that can be realized.");
        }
        this.pendingOperations.popInto(this.operations);
    }

    public final void executeAndFlushAllPendingFixups(Applier<?> applier, SlotWriter slots, RememberManager rememberManager) {
        if (!this.pendingOperations.isEmpty()) {
            ComposerKt.composeImmediateRuntimeError("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
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

    @Override // androidx.compose.runtime.changelist.OperationsDebugStringFormattable
    public String toDebugString(String linePrefix) {
        StringBuilder sb = new StringBuilder();
        sb.append("FixupList instance containing " + getSize() + " operations");
        if (sb.length() > 0) {
            sb.append(":\n" + this.operations.toDebugString(linePrefix));
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public final <V, T> void updateNode(V value, Function2<? super T, ? super V, Unit> block) {
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
}
