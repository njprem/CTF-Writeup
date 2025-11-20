package androidx.compose.material3;

import J.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ%\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J%\u0010$\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b%\u0010#J%\u0010&\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010'\u001a\u00020 H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010#J\u0088\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020 2\b\u0010-\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010.\u001a\u00020/H\u0016R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0016\u0010\u0011R\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0018\u0010\u0011R\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0019\u0010\u0011R\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001a\u0010\u0011R\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001b\u0010\u0011R\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u001d\u0010\u0011\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00060"}, d2 = {"Landroidx/compose/material3/SegmentedButtonColors;", "", "activeContainerColor", "Landroidx/compose/ui/graphics/Color;", "activeContentColor", "activeBorderColor", "inactiveContainerColor", "inactiveContentColor", "inactiveBorderColor", "disabledActiveContainerColor", "disabledActiveContentColor", "disabledActiveBorderColor", "disabledInactiveContainerColor", "disabledInactiveContentColor", "disabledInactiveBorderColor", "(JJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveBorderColor-0d7_KjU", "()J", "J", "getActiveContainerColor-0d7_KjU", "getActiveContentColor-0d7_KjU", "getDisabledActiveBorderColor-0d7_KjU", "getDisabledActiveContainerColor-0d7_KjU", "getDisabledActiveContentColor-0d7_KjU", "getDisabledInactiveBorderColor-0d7_KjU", "getDisabledInactiveContainerColor-0d7_KjU", "getDisabledInactiveContentColor-0d7_KjU", "getInactiveBorderColor-0d7_KjU", "getInactiveContainerColor-0d7_KjU", "getInactiveContentColor-0d7_KjU", "borderColor", "enabled", "", "active", "borderColor-WaAFU9c$material3_release", "(ZZ)J", "containerColor", "containerColor-WaAFU9c$material3_release", "contentColor", "checked", "contentColor-WaAFU9c$material3_release", "copy", "copy-2qZNXz8", "(JJJJJJJJJJJJ)Landroidx/compose/material3/SegmentedButtonColors;", "equals", "other", "hashCode", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SegmentedButtonColors {
    public static final int $stable = 0;
    private final long activeBorderColor;
    private final long activeContainerColor;
    private final long activeContentColor;
    private final long disabledActiveBorderColor;
    private final long disabledActiveContainerColor;
    private final long disabledActiveContentColor;
    private final long disabledInactiveBorderColor;
    private final long disabledInactiveContainerColor;
    private final long disabledInactiveContentColor;
    private final long inactiveBorderColor;
    private final long inactiveContainerColor;
    private final long inactiveContentColor;

    public /* synthetic */ SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    /* renamed from: copy-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ SegmentedButtonColors m2066copy2qZNXz8$default(SegmentedButtonColors segmentedButtonColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, int i2, Object obj) {
        long j14;
        long j15;
        long j16 = (i2 & 1) != 0 ? segmentedButtonColors.activeContainerColor : j2;
        long j17 = (i2 & 2) != 0 ? segmentedButtonColors.activeContentColor : j3;
        long j18 = (i2 & 4) != 0 ? segmentedButtonColors.activeBorderColor : j4;
        long j19 = (i2 & 8) != 0 ? segmentedButtonColors.inactiveContainerColor : j5;
        long j20 = (i2 & 16) != 0 ? segmentedButtonColors.inactiveContentColor : j6;
        long j21 = (i2 & 32) != 0 ? segmentedButtonColors.inactiveBorderColor : j7;
        long j22 = (i2 & 64) != 0 ? segmentedButtonColors.disabledActiveContainerColor : j8;
        long j23 = j16;
        long j24 = (i2 & 128) != 0 ? segmentedButtonColors.disabledActiveContentColor : j9;
        long j25 = (i2 & Fields.RotationX) != 0 ? segmentedButtonColors.disabledActiveBorderColor : j10;
        long j26 = (i2 & 512) != 0 ? segmentedButtonColors.disabledInactiveContainerColor : j11;
        long j27 = (i2 & 1024) != 0 ? segmentedButtonColors.disabledInactiveContentColor : j12;
        if ((i2 & Fields.CameraDistance) != 0) {
            j15 = j27;
            j14 = segmentedButtonColors.disabledInactiveBorderColor;
        } else {
            j14 = j13;
            j15 = j27;
        }
        return segmentedButtonColors.m2070copy2qZNXz8(j23, j17, j18, j19, j20, j21, j22, j24, j25, j26, j15, j14);
    }

    /* renamed from: borderColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2067borderColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeBorderColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveBorderColor : this.disabledActiveBorderColor : this.inactiveBorderColor;
    }

    /* renamed from: containerColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2068containerColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return (enabled && active) ? this.activeContainerColor : (!enabled || active) ? (enabled || !active) ? this.disabledInactiveContainerColor : this.disabledActiveContainerColor : this.inactiveContainerColor;
    }

    /* renamed from: contentColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2069contentColorWaAFU9c$material3_release(boolean enabled, boolean checked) {
        return (enabled && checked) ? this.activeContentColor : (!enabled || checked) ? (enabled || !checked) ? this.disabledInactiveContentColor : this.disabledActiveContentColor : this.inactiveContentColor;
    }

    /* renamed from: copy-2qZNXz8, reason: not valid java name */
    public final SegmentedButtonColors m2070copy2qZNXz8(long activeContainerColor, long activeContentColor, long activeBorderColor, long inactiveContainerColor, long inactiveContentColor, long inactiveBorderColor, long disabledActiveContainerColor, long disabledActiveContentColor, long disabledActiveBorderColor, long disabledInactiveContainerColor, long disabledInactiveContentColor, long disabledInactiveBorderColor) {
        return new SegmentedButtonColors(activeContainerColor != 16 ? activeContainerColor : this.activeContainerColor, activeContentColor != 16 ? activeContentColor : this.activeContentColor, activeBorderColor != 16 ? activeBorderColor : this.activeBorderColor, inactiveContainerColor != 16 ? inactiveContainerColor : this.inactiveContainerColor, inactiveContentColor != 16 ? inactiveContentColor : this.inactiveContentColor, inactiveBorderColor != 16 ? inactiveBorderColor : this.inactiveBorderColor, disabledActiveContainerColor != 16 ? disabledActiveContainerColor : this.disabledActiveContainerColor, disabledActiveContentColor != 16 ? disabledActiveContentColor : this.disabledActiveContentColor, disabledActiveBorderColor != 16 ? disabledActiveBorderColor : this.disabledActiveBorderColor, disabledInactiveContainerColor != 16 ? disabledInactiveContainerColor : this.disabledInactiveContainerColor, disabledInactiveContentColor != 16 ? disabledInactiveContentColor : this.disabledInactiveContentColor, disabledInactiveBorderColor != 16 ? disabledInactiveBorderColor : this.disabledInactiveBorderColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || SegmentedButtonColors.class != other.getClass()) {
            return false;
        }
        SegmentedButtonColors segmentedButtonColors = (SegmentedButtonColors) other;
        return Color.m3793equalsimpl0(this.activeBorderColor, segmentedButtonColors.activeBorderColor) && Color.m3793equalsimpl0(this.activeContentColor, segmentedButtonColors.activeContentColor) && Color.m3793equalsimpl0(this.activeContainerColor, segmentedButtonColors.activeContainerColor) && Color.m3793equalsimpl0(this.inactiveBorderColor, segmentedButtonColors.inactiveBorderColor) && Color.m3793equalsimpl0(this.inactiveContentColor, segmentedButtonColors.inactiveContentColor) && Color.m3793equalsimpl0(this.inactiveContainerColor, segmentedButtonColors.inactiveContainerColor) && Color.m3793equalsimpl0(this.disabledActiveBorderColor, segmentedButtonColors.disabledActiveBorderColor) && Color.m3793equalsimpl0(this.disabledActiveContentColor, segmentedButtonColors.disabledActiveContentColor) && Color.m3793equalsimpl0(this.disabledActiveContainerColor, segmentedButtonColors.disabledActiveContainerColor) && Color.m3793equalsimpl0(this.disabledInactiveBorderColor, segmentedButtonColors.disabledInactiveBorderColor) && Color.m3793equalsimpl0(this.disabledInactiveContentColor, segmentedButtonColors.disabledInactiveContentColor) && Color.m3793equalsimpl0(this.disabledInactiveContainerColor, segmentedButtonColors.disabledInactiveContainerColor);
    }

    /* renamed from: getActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveBorderColor() {
        return this.activeBorderColor;
    }

    /* renamed from: getActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContainerColor() {
        return this.activeContainerColor;
    }

    /* renamed from: getActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveContentColor() {
        return this.activeContentColor;
    }

    /* renamed from: getDisabledActiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveBorderColor() {
        return this.disabledActiveBorderColor;
    }

    /* renamed from: getDisabledActiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContainerColor() {
        return this.disabledActiveContainerColor;
    }

    /* renamed from: getDisabledActiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveContentColor() {
        return this.disabledActiveContentColor;
    }

    /* renamed from: getDisabledInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveBorderColor() {
        return this.disabledInactiveBorderColor;
    }

    /* renamed from: getDisabledInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContainerColor() {
        return this.disabledInactiveContainerColor;
    }

    /* renamed from: getDisabledInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveContentColor() {
        return this.disabledInactiveContentColor;
    }

    /* renamed from: getInactiveBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveBorderColor() {
        return this.inactiveBorderColor;
    }

    /* renamed from: getInactiveContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContainerColor() {
        return this.inactiveContainerColor;
    }

    /* renamed from: getInactiveContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveContentColor() {
        return this.inactiveContentColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.disabledInactiveContainerColor) + d.d(this.disabledInactiveContentColor, d.d(this.disabledInactiveBorderColor, d.d(this.disabledActiveContainerColor, d.d(this.disabledActiveContentColor, d.d(this.disabledActiveBorderColor, d.d(this.inactiveContainerColor, d.d(this.inactiveContentColor, d.d(this.inactiveBorderColor, d.d(this.activeContainerColor, d.d(this.activeContentColor, Color.m3799hashCodeimpl(this.activeBorderColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    private SegmentedButtonColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13) {
        this.activeContainerColor = j2;
        this.activeContentColor = j3;
        this.activeBorderColor = j4;
        this.inactiveContainerColor = j5;
        this.inactiveContentColor = j6;
        this.inactiveBorderColor = j7;
        this.disabledActiveContainerColor = j8;
        this.disabledActiveContentColor = j9;
        this.disabledActiveBorderColor = j10;
        this.disabledInactiveContainerColor = j11;
        this.disabledInactiveContentColor = j12;
        this.disabledInactiveBorderColor = j13;
    }
}
