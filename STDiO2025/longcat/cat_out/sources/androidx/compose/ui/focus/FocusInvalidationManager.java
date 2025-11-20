package androidx.compose.ui.focus;

import j.S;
import j.g0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0018\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\t*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0010¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0012¢\u0006\u0004\b\f\u0010\u0013J\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0014¢\u0006\u0004\b\f\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00140\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/compose/ui/focus/FocusInvalidationManager;", "", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "onRequestApplyChangesListener", "invalidateOwnerFocusState", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "T", "Lj/S;", "node", "scheduleInvalidation", "(Lj/S;Ljava/lang/Object;)V", "invalidateNodes", "()V", "Landroidx/compose/ui/focus/FocusTargetNode;", "(Landroidx/compose/ui/focus/FocusTargetNode;)V", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "(Landroidx/compose/ui/focus/FocusEventModifierNode;)V", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "(Landroidx/compose/ui/focus/FocusPropertiesModifierNode;)V", "", "hasPendingInvalidation", "()Z", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "focusTargetNodes", "Lj/S;", "focusEventNodes", "focusPropertiesNodes", "focusTargetsWithInvalidatedFocusEvents", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FocusInvalidationManager {
    public static final int $stable = 8;
    private final S focusEventNodes;
    private final S focusPropertiesNodes;
    private final S focusTargetNodes;
    private final S focusTargetsWithInvalidatedFocusEvents;
    private final Function0<Unit> invalidateOwnerFocusState;
    private final Function1<Function0<Unit>, Unit> onRequestApplyChangesListener;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.focus.FocusInvalidationManager$scheduleInvalidation$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function0<Unit> {
        public AnonymousClass1(Object obj) {
            super(0, obj, FocusInvalidationManager.class, "invalidateNodes", "invalidateNodes()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((FocusInvalidationManager) this.receiver).invalidateNodes();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FocusInvalidationManager(Function1<? super Function0<Unit>, Unit> function1, Function0<Unit> function0) {
        this.onRequestApplyChangesListener = function1;
        this.invalidateOwnerFocusState = function0;
        int i2 = g0.f831a;
        this.focusTargetNodes = new S();
        this.focusEventNodes = new S();
        this.focusPropertiesNodes = new S();
        this.focusTargetsWithInvalidatedFocusEvents = new S();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invalidateNodes() {
        /*
            Method dump skipped, instructions count: 1161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.focus.FocusInvalidationManager.invalidateNodes():void");
    }

    public final boolean hasPendingInvalidation() {
        return this.focusTargetNodes.c() || this.focusPropertiesNodes.c() || this.focusEventNodes.c();
    }

    public final void scheduleInvalidation(FocusTargetNode node) {
        scheduleInvalidation(this.focusTargetNodes, node);
    }

    public final void scheduleInvalidation(FocusEventModifierNode node) {
        scheduleInvalidation(this.focusEventNodes, node);
    }

    public final void scheduleInvalidation(FocusPropertiesModifierNode node) {
        scheduleInvalidation(this.focusPropertiesNodes, node);
    }

    private final <T> void scheduleInvalidation(S s2, T t) {
        if (s2.d(t) && this.focusTargetNodes.f827d + this.focusEventNodes.f827d + this.focusPropertiesNodes.f827d == 1) {
            this.onRequestApplyChangesListener.invoke(new AnonymousClass1(this));
        }
    }
}
