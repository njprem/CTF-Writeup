package androidx.compose.material3;

import J.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\u001d\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u009c\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020$2\b\u0010+\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010,\u001a\u00020-H\u0016J\u001d\u0010.\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u0010&J\u001d\u00100\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b1\u0010&J\u001d\u00102\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b3\u0010&J\u001d\u00104\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b5\u0010&R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0016\u0010\u0013R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0013R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0013R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001a\u0010\u0013R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0013R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001c\u0010\u0013R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001d\u0010\u0013R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001e\u0010\u0013R\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001f\u0010\u0013R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b \u0010\u0013R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b!\u0010\u0013\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00066"}, d2 = {"Landroidx/compose/material3/TimePickerColors;", "", "clockDialColor", "Landroidx/compose/ui/graphics/Color;", "selectorColor", "containerColor", "periodSelectorBorderColor", "clockDialSelectedContentColor", "clockDialUnselectedContentColor", "periodSelectorSelectedContainerColor", "periodSelectorUnselectedContainerColor", "periodSelectorSelectedContentColor", "periodSelectorUnselectedContentColor", "timeSelectorSelectedContainerColor", "timeSelectorUnselectedContainerColor", "timeSelectorSelectedContentColor", "timeSelectorUnselectedContentColor", "(JJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getClockDialColor-0d7_KjU", "()J", "J", "getClockDialSelectedContentColor-0d7_KjU", "getClockDialUnselectedContentColor-0d7_KjU", "getContainerColor-0d7_KjU", "getPeriodSelectorBorderColor-0d7_KjU", "getPeriodSelectorSelectedContainerColor-0d7_KjU", "getPeriodSelectorSelectedContentColor-0d7_KjU", "getPeriodSelectorUnselectedContainerColor-0d7_KjU", "getPeriodSelectorUnselectedContentColor-0d7_KjU", "getSelectorColor-0d7_KjU", "getTimeSelectorSelectedContainerColor-0d7_KjU", "getTimeSelectorSelectedContentColor-0d7_KjU", "getTimeSelectorUnselectedContainerColor-0d7_KjU", "getTimeSelectorUnselectedContentColor-0d7_KjU", "clockDialContentColor", "selected", "", "clockDialContentColor-vNxB06k$material3_release", "(Z)J", "copy", "copy-dVHXu7A", "(JJJJJJJJJJJJJJ)Landroidx/compose/material3/TimePickerColors;", "equals", "other", "hashCode", "", "periodSelectorContainerColor", "periodSelectorContainerColor-vNxB06k$material3_release", "periodSelectorContentColor", "periodSelectorContentColor-vNxB06k$material3_release", "timeSelectorContainerColor", "timeSelectorContainerColor-vNxB06k$material3_release", "timeSelectorContentColor", "timeSelectorContentColor-vNxB06k$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TimePickerColors {
    public static final int $stable = 0;
    private final long clockDialColor;
    private final long clockDialSelectedContentColor;
    private final long clockDialUnselectedContentColor;
    private final long containerColor;
    private final long periodSelectorBorderColor;
    private final long periodSelectorSelectedContainerColor;
    private final long periodSelectorSelectedContentColor;
    private final long periodSelectorUnselectedContainerColor;
    private final long periodSelectorUnselectedContentColor;
    private final long selectorColor;
    private final long timeSelectorSelectedContainerColor;
    private final long timeSelectorSelectedContentColor;
    private final long timeSelectorUnselectedContainerColor;
    private final long timeSelectorUnselectedContentColor;

    public /* synthetic */ TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15);
    }

    /* renamed from: copy-dVHXu7A$default, reason: not valid java name */
    public static /* synthetic */ TimePickerColors m2329copydVHXu7A$default(TimePickerColors timePickerColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, int i2, Object obj) {
        long j16;
        long j17;
        long j18 = (i2 & 1) != 0 ? timePickerColors.containerColor : j2;
        long j19 = (i2 & 2) != 0 ? timePickerColors.selectorColor : j3;
        long j20 = (i2 & 4) != 0 ? timePickerColors.containerColor : j4;
        long j21 = (i2 & 8) != 0 ? timePickerColors.periodSelectorBorderColor : j5;
        long j22 = (i2 & 16) != 0 ? timePickerColors.clockDialSelectedContentColor : j6;
        long j23 = (i2 & 32) != 0 ? timePickerColors.clockDialUnselectedContentColor : j7;
        long j24 = (i2 & 64) != 0 ? timePickerColors.periodSelectorSelectedContainerColor : j8;
        long j25 = j18;
        long j26 = (i2 & 128) != 0 ? timePickerColors.periodSelectorUnselectedContainerColor : j9;
        long j27 = (i2 & Fields.RotationX) != 0 ? timePickerColors.periodSelectorSelectedContentColor : j10;
        long j28 = (i2 & 512) != 0 ? timePickerColors.periodSelectorUnselectedContentColor : j11;
        long j29 = (i2 & 1024) != 0 ? timePickerColors.timeSelectorSelectedContainerColor : j12;
        long j30 = (i2 & Fields.CameraDistance) != 0 ? timePickerColors.timeSelectorUnselectedContainerColor : j13;
        long j31 = (i2 & 4096) != 0 ? timePickerColors.timeSelectorSelectedContentColor : j14;
        if ((i2 & 8192) != 0) {
            j17 = j31;
            j16 = timePickerColors.timeSelectorUnselectedContentColor;
        } else {
            j16 = j15;
            j17 = j31;
        }
        return timePickerColors.m2331copydVHXu7A(j25, j19, j20, j21, j22, j23, j24, j26, j27, j28, j29, j30, j17, j16);
    }

    /* renamed from: clockDialContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2330clockDialContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.clockDialSelectedContentColor : this.clockDialUnselectedContentColor;
    }

    /* renamed from: copy-dVHXu7A, reason: not valid java name */
    public final TimePickerColors m2331copydVHXu7A(long clockDialColor, long selectorColor, long containerColor, long periodSelectorBorderColor, long clockDialSelectedContentColor, long clockDialUnselectedContentColor, long periodSelectorSelectedContainerColor, long periodSelectorUnselectedContainerColor, long periodSelectorSelectedContentColor, long periodSelectorUnselectedContentColor, long timeSelectorSelectedContainerColor, long timeSelectorUnselectedContainerColor, long timeSelectorSelectedContentColor, long timeSelectorUnselectedContentColor) {
        return new TimePickerColors(clockDialColor != 16 ? clockDialColor : this.clockDialColor, selectorColor != 16 ? selectorColor : this.selectorColor, containerColor != 16 ? containerColor : this.containerColor, periodSelectorBorderColor != 16 ? periodSelectorBorderColor : this.periodSelectorBorderColor, clockDialSelectedContentColor != 16 ? clockDialSelectedContentColor : this.clockDialSelectedContentColor, clockDialUnselectedContentColor != 16 ? clockDialUnselectedContentColor : this.clockDialUnselectedContentColor, periodSelectorSelectedContainerColor != 16 ? periodSelectorSelectedContainerColor : this.periodSelectorSelectedContainerColor, periodSelectorUnselectedContainerColor != 16 ? periodSelectorUnselectedContainerColor : this.periodSelectorUnselectedContainerColor, periodSelectorSelectedContentColor != 16 ? periodSelectorSelectedContentColor : this.periodSelectorSelectedContentColor, periodSelectorUnselectedContentColor != 16 ? periodSelectorUnselectedContentColor : this.periodSelectorUnselectedContentColor, timeSelectorSelectedContainerColor != 16 ? timeSelectorSelectedContainerColor : this.timeSelectorSelectedContainerColor, timeSelectorUnselectedContainerColor != 16 ? timeSelectorUnselectedContainerColor : this.timeSelectorUnselectedContainerColor, timeSelectorSelectedContentColor != 16 ? timeSelectorSelectedContentColor : this.timeSelectorSelectedContentColor, timeSelectorUnselectedContentColor != 16 ? timeSelectorUnselectedContentColor : this.timeSelectorUnselectedContentColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || TimePickerColors.class != other.getClass()) {
            return false;
        }
        TimePickerColors timePickerColors = (TimePickerColors) other;
        return Color.m3793equalsimpl0(this.clockDialColor, timePickerColors.clockDialColor) && Color.m3793equalsimpl0(this.selectorColor, timePickerColors.selectorColor) && Color.m3793equalsimpl0(this.containerColor, timePickerColors.containerColor) && Color.m3793equalsimpl0(this.periodSelectorBorderColor, timePickerColors.periodSelectorBorderColor) && Color.m3793equalsimpl0(this.periodSelectorSelectedContainerColor, timePickerColors.periodSelectorSelectedContainerColor) && Color.m3793equalsimpl0(this.periodSelectorUnselectedContainerColor, timePickerColors.periodSelectorUnselectedContainerColor) && Color.m3793equalsimpl0(this.periodSelectorSelectedContentColor, timePickerColors.periodSelectorSelectedContentColor) && Color.m3793equalsimpl0(this.periodSelectorUnselectedContentColor, timePickerColors.periodSelectorUnselectedContentColor) && Color.m3793equalsimpl0(this.timeSelectorSelectedContainerColor, timePickerColors.timeSelectorSelectedContainerColor) && Color.m3793equalsimpl0(this.timeSelectorUnselectedContainerColor, timePickerColors.timeSelectorUnselectedContainerColor) && Color.m3793equalsimpl0(this.timeSelectorSelectedContentColor, timePickerColors.timeSelectorSelectedContentColor) && Color.m3793equalsimpl0(this.timeSelectorUnselectedContentColor, timePickerColors.timeSelectorUnselectedContentColor);
    }

    /* renamed from: getClockDialColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialColor() {
        return this.clockDialColor;
    }

    /* renamed from: getClockDialSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialSelectedContentColor() {
        return this.clockDialSelectedContentColor;
    }

    /* renamed from: getClockDialUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getClockDialUnselectedContentColor() {
        return this.clockDialUnselectedContentColor;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getPeriodSelectorBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorBorderColor() {
        return this.periodSelectorBorderColor;
    }

    /* renamed from: getPeriodSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContainerColor() {
        return this.periodSelectorSelectedContainerColor;
    }

    /* renamed from: getPeriodSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorSelectedContentColor() {
        return this.periodSelectorSelectedContentColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContainerColor() {
        return this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: getPeriodSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getPeriodSelectorUnselectedContentColor() {
        return this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: getSelectorColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectorColor() {
        return this.selectorColor;
    }

    /* renamed from: getTimeSelectorSelectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContainerColor() {
        return this.timeSelectorSelectedContainerColor;
    }

    /* renamed from: getTimeSelectorSelectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorSelectedContentColor() {
        return this.timeSelectorSelectedContentColor;
    }

    /* renamed from: getTimeSelectorUnselectedContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContainerColor() {
        return this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: getTimeSelectorUnselectedContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTimeSelectorUnselectedContentColor() {
        return this.timeSelectorUnselectedContentColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.timeSelectorUnselectedContentColor) + d.d(this.timeSelectorSelectedContentColor, d.d(this.timeSelectorUnselectedContainerColor, d.d(this.timeSelectorSelectedContainerColor, d.d(this.periodSelectorUnselectedContentColor, d.d(this.periodSelectorSelectedContentColor, d.d(this.periodSelectorUnselectedContainerColor, d.d(this.periodSelectorSelectedContainerColor, d.d(this.periodSelectorBorderColor, d.d(this.containerColor, d.d(this.selectorColor, Color.m3799hashCodeimpl(this.clockDialColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: periodSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2346periodSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContainerColor : this.periodSelectorUnselectedContainerColor;
    }

    /* renamed from: periodSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2347periodSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.periodSelectorSelectedContentColor : this.periodSelectorUnselectedContentColor;
    }

    /* renamed from: timeSelectorContainerColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2348timeSelectorContainerColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContainerColor : this.timeSelectorUnselectedContainerColor;
    }

    /* renamed from: timeSelectorContentColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2349timeSelectorContentColorvNxB06k$material3_release(boolean selected) {
        return selected ? this.timeSelectorSelectedContentColor : this.timeSelectorUnselectedContentColor;
    }

    private TimePickerColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15) {
        this.clockDialColor = j2;
        this.selectorColor = j3;
        this.containerColor = j4;
        this.periodSelectorBorderColor = j5;
        this.clockDialSelectedContentColor = j6;
        this.clockDialUnselectedContentColor = j7;
        this.periodSelectorSelectedContainerColor = j8;
        this.periodSelectorUnselectedContainerColor = j9;
        this.periodSelectorSelectedContentColor = j10;
        this.periodSelectorUnselectedContentColor = j11;
        this.timeSelectorSelectedContainerColor = j12;
        this.timeSelectorUnselectedContainerColor = j13;
        this.timeSelectorSelectedContentColor = j14;
        this.timeSelectorUnselectedContentColor = j15;
    }
}
