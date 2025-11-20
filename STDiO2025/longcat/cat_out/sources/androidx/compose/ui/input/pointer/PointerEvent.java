package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import j.C0671y;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0015\u0010\u001f\u001a\u00020\u001aH\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\fJ\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u001e\u0010\"\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0019\u0010\t\u001a\u00020\nø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0012\u001a\u00020\u0013ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u0014\u0010\fR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00168@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R,\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u001a@@X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\r\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006#"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEvent;", "", "changes", "", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "(Ljava/util/List;)V", "internalPointerEvent", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "(Ljava/util/List;Landroidx/compose/ui/input/pointer/InternalPointerEvent;)V", "buttons", "Landroidx/compose/ui/input/pointer/PointerButtons;", "getButtons-ry648PA", "()I", "I", "getChanges", "()Ljava/util/List;", "getInternalPointerEvent$ui_release", "()Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "keyboardModifiers", "Landroidx/compose/ui/input/pointer/PointerKeyboardModifiers;", "getKeyboardModifiers-k7X9c1A", "motionEvent", "Landroid/view/MotionEvent;", "getMotionEvent$ui_release", "()Landroid/view/MotionEvent;", "<set-?>", "Landroidx/compose/ui/input/pointer/PointerEventType;", "type", "getType-7fucELk", "setType-EhbLWgg$ui_release", "(I)V", "calculatePointerEventType", "calculatePointerEventType-7fucELk", "component1", "copy", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PointerEvent {
    public static final int $stable = 8;
    private final int buttons;
    private final List<PointerInputChange> changes;
    private final InternalPointerEvent internalPointerEvent;
    private final int keyboardModifiers;
    private int type;

    public PointerEvent(List<PointerInputChange> list, InternalPointerEvent internalPointerEvent) {
        this.changes = list;
        this.internalPointerEvent = internalPointerEvent;
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        this.buttons = PointerButtons.m4924constructorimpl(motionEvent$ui_release != null ? motionEvent$ui_release.getButtonState() : 0);
        MotionEvent motionEvent$ui_release2 = getMotionEvent$ui_release();
        this.keyboardModifiers = PointerKeyboardModifiers.m5054constructorimpl(motionEvent$ui_release2 != null ? motionEvent$ui_release2.getMetaState() : 0);
        this.type = m4930calculatePointerEventType7fucELk();
    }

    /* renamed from: calculatePointerEventType-7fucELk, reason: not valid java name */
    private final int m4930calculatePointerEventType7fucELk() {
        MotionEvent motionEvent$ui_release = getMotionEvent$ui_release();
        if (motionEvent$ui_release == null) {
            List<PointerInputChange> list = this.changes;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                PointerInputChange pointerInputChange = list.get(i2);
                if (PointerEventKt.changedToUpIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.INSTANCE.m4948getRelease7fucELk();
                }
                if (PointerEventKt.changedToDownIgnoreConsumed(pointerInputChange)) {
                    return PointerEventType.INSTANCE.m4947getPress7fucELk();
                }
            }
            return PointerEventType.INSTANCE.m4946getMove7fucELk();
        }
        int actionMasked = motionEvent$ui_release.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    switch (actionMasked) {
                        case 5:
                            break;
                        case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                            break;
                        case 7:
                            break;
                        case 8:
                            return PointerEventType.INSTANCE.m4949getScroll7fucELk();
                        case 9:
                            return PointerEventType.INSTANCE.m4944getEnter7fucELk();
                        case 10:
                            return PointerEventType.INSTANCE.m4945getExit7fucELk();
                        default:
                            return PointerEventType.INSTANCE.m4950getUnknown7fucELk();
                    }
                }
                return PointerEventType.INSTANCE.m4946getMove7fucELk();
            }
            return PointerEventType.INSTANCE.m4948getRelease7fucELk();
        }
        return PointerEventType.INSTANCE.m4947getPress7fucELk();
    }

    public final List<PointerInputChange> component1() {
        return this.changes;
    }

    public final PointerEvent copy(List<PointerInputChange> changes, MotionEvent motionEvent) {
        if (motionEvent == null) {
            return new PointerEvent(changes, null);
        }
        if (Intrinsics.areEqual(motionEvent, getMotionEvent$ui_release())) {
            return new PointerEvent(changes, this.internalPointerEvent);
        }
        C0671y c0671y = new C0671y(changes.size());
        ArrayList arrayList = new ArrayList(changes.size());
        int size = changes.size();
        int i2 = 0;
        while (i2 < size) {
            PointerInputChange pointerInputChange = changes.get(i2);
            c0671y.b(pointerInputChange.getId(), pointerInputChange);
            long jM4989getIdJ3iCeTQ = pointerInputChange.getId();
            long uptimeMillis = pointerInputChange.getUptimeMillis();
            long jM4991getPositionF1C5BW0 = pointerInputChange.getPosition();
            long jM4991getPositionF1C5BW02 = pointerInputChange.getPosition();
            boolean pressed = pointerInputChange.getPressed();
            float pressure = pointerInputChange.getPressure();
            int iM4994getTypeT8wyACA = pointerInputChange.getType();
            InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
            int i3 = i2;
            arrayList.add(new PointerInputEventData(jM4989getIdJ3iCeTQ, uptimeMillis, jM4991getPositionF1C5BW0, jM4991getPositionF1C5BW02, pressed, pressure, iM4994getTypeT8wyACA, internalPointerEvent != null && internalPointerEvent.m4920activeHoverEvent0FcD4WY(pointerInputChange.getId()), null, 0L, 0L, 1792, null));
            i2 = i3 + 1;
        }
        return new PointerEvent(changes, new InternalPointerEvent(c0671y, new PointerInputEvent(motionEvent.getEventTime(), arrayList, motionEvent)));
    }

    /* renamed from: getButtons-ry648PA, reason: not valid java name and from getter */
    public final int getButtons() {
        return this.buttons;
    }

    public final List<PointerInputChange> getChanges() {
        return this.changes;
    }

    /* renamed from: getInternalPointerEvent$ui_release, reason: from getter */
    public final InternalPointerEvent getInternalPointerEvent() {
        return this.internalPointerEvent;
    }

    /* renamed from: getKeyboardModifiers-k7X9c1A, reason: not valid java name and from getter */
    public final int getKeyboardModifiers() {
        return this.keyboardModifiers;
    }

    public final MotionEvent getMotionEvent$ui_release() {
        InternalPointerEvent internalPointerEvent = this.internalPointerEvent;
        if (internalPointerEvent != null) {
            return internalPointerEvent.getMotionEvent();
        }
        return null;
    }

    /* renamed from: getType-7fucELk, reason: not valid java name and from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: setType-EhbLWgg$ui_release, reason: not valid java name */
    public final void m4934setTypeEhbLWgg$ui_release(int i2) {
        this.type = i2;
    }

    public PointerEvent(List<PointerInputChange> list) {
        this(list, null);
    }
}
