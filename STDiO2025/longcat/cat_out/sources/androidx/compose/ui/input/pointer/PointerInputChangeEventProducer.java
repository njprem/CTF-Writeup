package androidx.compose.ui.input.pointer;

import j.AbstractC0672z;
import j.C0671y;
import java.util.List;
import k.AbstractC0673a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\u0003R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "pointerInputEvent", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "produce", "(Landroidx/compose/ui/input/pointer/PointerInputEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/InternalPointerEvent;", "", "clear", "Lj/y;", "Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "previousPointerInputData", "Lj/y;", "PointerInputData", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class PointerInputChangeEventProducer {
    private final C0671y previousPointerInputData = new C0671y(10);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u00020\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\b\u001a\u00020\tø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputChangeEventProducer$PointerInputData;", "", "uptime", "", "positionOnScreen", "Landroidx/compose/ui/geometry/Offset;", "down", "", "type", "Landroidx/compose/ui/input/pointer/PointerType;", "(JJZILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDown", "()Z", "getPositionOnScreen-F1C5BW0", "()J", "J", "getType-T8wyACA", "()I", "I", "getUptime", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PointerInputData {
        private final boolean down;
        private final long positionOnScreen;
        private final int type;
        private final long uptime;

        public /* synthetic */ PointerInputData(long j2, long j3, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j2, j3, z, i2);
        }

        public final boolean getDown() {
            return this.down;
        }

        /* renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name and from getter */
        public final long getPositionOnScreen() {
            return this.positionOnScreen;
        }

        /* renamed from: getType-T8wyACA, reason: not valid java name and from getter */
        public final int getType() {
            return this.type;
        }

        public final long getUptime() {
            return this.uptime;
        }

        private PointerInputData(long j2, long j3, boolean z, int i2) {
            this.uptime = j2;
            this.positionOnScreen = j3;
            this.down = z;
            this.type = i2;
        }
    }

    public final void clear() {
        C0671y c0671y = this.previousPointerInputData;
        int i2 = c0671y.f882d;
        Object[] objArr = c0671y.f881c;
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = null;
        }
        c0671y.f882d = 0;
        c0671y.f879a = false;
    }

    public final InternalPointerEvent produce(PointerInputEvent pointerInputEvent, PositionCalculator positionCalculator) {
        Object obj;
        boolean down;
        long uptime;
        long jMo5074screenToLocalMKHz9U;
        C0671y c0671y = new C0671y(pointerInputEvent.getPointers().size());
        List<PointerInputEventData> pointers = pointerInputEvent.getPointers();
        int size = pointers.size();
        for (int i2 = 0; i2 < size; i2++) {
            PointerInputEventData pointerInputEventData = pointers.get(i2);
            C0671y c0671y2 = this.previousPointerInputData;
            int iB = AbstractC0673a.b(c0671y2.f880b, c0671y2.f882d, pointerInputEventData.m5006getIdJ3iCeTQ());
            Object obj2 = AbstractC0672z.f883a;
            if (iB < 0 || (obj = c0671y2.f881c[iB]) == obj2) {
                obj = null;
            }
            PointerInputData pointerInputData = (PointerInputData) obj;
            if (pointerInputData == null) {
                down = false;
                uptime = pointerInputEventData.getUptime();
                jMo5074screenToLocalMKHz9U = pointerInputEventData.m5008getPositionF1C5BW0();
            } else {
                long uptime2 = pointerInputData.getUptime();
                down = pointerInputData.getDown();
                uptime = uptime2;
                jMo5074screenToLocalMKHz9U = positionCalculator.mo5074screenToLocalMKHz9U(pointerInputData.getPositionOnScreen());
            }
            c0671y.b(pointerInputEventData.m5006getIdJ3iCeTQ(), new PointerInputChange(pointerInputEventData.m5006getIdJ3iCeTQ(), pointerInputEventData.getUptime(), pointerInputEventData.m5008getPositionF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.getPressure(), uptime, jMo5074screenToLocalMKHz9U, down, false, pointerInputEventData.m5011getTypeT8wyACA(), pointerInputEventData.getHistorical(), pointerInputEventData.m5010getScrollDeltaF1C5BW0(), pointerInputEventData.m5007getOriginalEventPositionF1C5BW0(), null));
            if (pointerInputEventData.getDown()) {
                this.previousPointerInputData.b(pointerInputEventData.m5006getIdJ3iCeTQ(), new PointerInputData(pointerInputEventData.getUptime(), pointerInputEventData.m5009getPositionOnScreenF1C5BW0(), pointerInputEventData.getDown(), pointerInputEventData.m5011getTypeT8wyACA(), null));
            } else {
                C0671y c0671y3 = this.previousPointerInputData;
                int iB2 = AbstractC0673a.b(c0671y3.f880b, c0671y3.f882d, pointerInputEventData.m5006getIdJ3iCeTQ());
                if (iB2 >= 0) {
                    Object[] objArr = c0671y3.f881c;
                    if (objArr[iB2] != obj2) {
                        objArr[iB2] = obj2;
                        c0671y3.f879a = true;
                    }
                }
            }
        }
        return new InternalPointerEvent(c0671y, pointerInputEvent);
    }
}
