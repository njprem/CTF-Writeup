package androidx.compose.material3;

import J.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJt\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u001d\u0010\u0002\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J%\u0010%\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\u00020\u00032\u0006\u0010\"\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u001eH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010(R\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000fR\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\u000fR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0018\u0010\u000fR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0019\u0010\u000f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006+"}, d2 = {"Landroidx/compose/material3/SliderColors;", "", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "(JJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getActiveTickColor-0d7_KjU", "()J", "J", "getActiveTrackColor-0d7_KjU", "getDisabledActiveTickColor-0d7_KjU", "getDisabledActiveTrackColor-0d7_KjU", "getDisabledInactiveTickColor-0d7_KjU", "getDisabledInactiveTrackColor-0d7_KjU", "getDisabledThumbColor-0d7_KjU", "getInactiveTickColor-0d7_KjU", "getInactiveTrackColor-0d7_KjU", "getThumbColor-0d7_KjU", "copy", "copy--K518z4", "(JJJJJJJJJJ)Landroidx/compose/material3/SliderColors;", "equals", "", "other", "hashCode", "", "enabled", "thumbColor-vNxB06k$material3_release", "(Z)J", "tickColor", "active", "tickColor-WaAFU9c$material3_release", "(ZZ)J", "trackColor", "trackColor-WaAFU9c$material3_release", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SliderColors {
    public static final int $stable = 0;
    private final long activeTickColor;
    private final long activeTrackColor;
    private final long disabledActiveTickColor;
    private final long disabledActiveTrackColor;
    private final long disabledInactiveTickColor;
    private final long disabledInactiveTrackColor;
    private final long disabledThumbColor;
    private final long inactiveTickColor;
    private final long inactiveTrackColor;
    private final long thumbColor;

    public /* synthetic */ SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5, j6, j7, j8, j9, j10, j11);
    }

    /* renamed from: copy--K518z4$default, reason: not valid java name */
    public static /* synthetic */ SliderColors m2105copyK518z4$default(SliderColors sliderColors, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, int i2, Object obj) {
        long j12;
        long j13;
        long j14 = (i2 & 1) != 0 ? sliderColors.thumbColor : j2;
        long j15 = (i2 & 2) != 0 ? sliderColors.activeTrackColor : j3;
        long j16 = (i2 & 4) != 0 ? sliderColors.activeTickColor : j4;
        long j17 = (i2 & 8) != 0 ? sliderColors.inactiveTrackColor : j5;
        long j18 = (i2 & 16) != 0 ? sliderColors.inactiveTickColor : j6;
        long j19 = (i2 & 32) != 0 ? sliderColors.disabledThumbColor : j7;
        long j20 = (i2 & 64) != 0 ? sliderColors.disabledActiveTrackColor : j8;
        long j21 = j14;
        long j22 = (i2 & 128) != 0 ? sliderColors.disabledActiveTickColor : j9;
        long j23 = (i2 & Fields.RotationX) != 0 ? sliderColors.disabledInactiveTrackColor : j10;
        if ((i2 & 512) != 0) {
            j13 = j23;
            j12 = sliderColors.disabledInactiveTickColor;
        } else {
            j12 = j11;
            j13 = j23;
        }
        return sliderColors.m2106copyK518z4(j21, j15, j16, j17, j18, j19, j20, j22, j13, j12);
    }

    /* renamed from: copy--K518z4, reason: not valid java name */
    public final SliderColors m2106copyK518z4(long thumbColor, long activeTrackColor, long activeTickColor, long inactiveTrackColor, long inactiveTickColor, long disabledThumbColor, long disabledActiveTrackColor, long disabledActiveTickColor, long disabledInactiveTrackColor, long disabledInactiveTickColor) {
        return new SliderColors(thumbColor != 16 ? thumbColor : this.thumbColor, activeTrackColor != 16 ? activeTrackColor : this.activeTrackColor, activeTickColor != 16 ? activeTickColor : this.activeTickColor, inactiveTrackColor != 16 ? inactiveTrackColor : this.inactiveTrackColor, inactiveTickColor != 16 ? inactiveTickColor : this.inactiveTickColor, disabledThumbColor != 16 ? disabledThumbColor : this.disabledThumbColor, disabledActiveTrackColor != 16 ? disabledActiveTrackColor : this.disabledActiveTrackColor, disabledActiveTickColor != 16 ? disabledActiveTickColor : this.disabledActiveTickColor, disabledInactiveTrackColor != 16 ? disabledInactiveTrackColor : this.disabledInactiveTrackColor, disabledInactiveTickColor != 16 ? disabledInactiveTickColor : this.disabledInactiveTickColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof SliderColors)) {
            return false;
        }
        SliderColors sliderColors = (SliderColors) other;
        return Color.m3793equalsimpl0(this.thumbColor, sliderColors.thumbColor) && Color.m3793equalsimpl0(this.activeTrackColor, sliderColors.activeTrackColor) && Color.m3793equalsimpl0(this.activeTickColor, sliderColors.activeTickColor) && Color.m3793equalsimpl0(this.inactiveTrackColor, sliderColors.inactiveTrackColor) && Color.m3793equalsimpl0(this.inactiveTickColor, sliderColors.inactiveTickColor) && Color.m3793equalsimpl0(this.disabledThumbColor, sliderColors.disabledThumbColor) && Color.m3793equalsimpl0(this.disabledActiveTrackColor, sliderColors.disabledActiveTrackColor) && Color.m3793equalsimpl0(this.disabledActiveTickColor, sliderColors.disabledActiveTickColor) && Color.m3793equalsimpl0(this.disabledInactiveTrackColor, sliderColors.disabledInactiveTrackColor) && Color.m3793equalsimpl0(this.disabledInactiveTickColor, sliderColors.disabledInactiveTickColor);
    }

    /* renamed from: getActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTickColor() {
        return this.activeTickColor;
    }

    /* renamed from: getActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getActiveTrackColor() {
        return this.activeTrackColor;
    }

    /* renamed from: getDisabledActiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTickColor() {
        return this.disabledActiveTickColor;
    }

    /* renamed from: getDisabledActiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledActiveTrackColor() {
        return this.disabledActiveTrackColor;
    }

    /* renamed from: getDisabledInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTickColor() {
        return this.disabledInactiveTickColor;
    }

    /* renamed from: getDisabledInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledInactiveTrackColor() {
        return this.disabledInactiveTrackColor;
    }

    /* renamed from: getDisabledThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledThumbColor() {
        return this.disabledThumbColor;
    }

    /* renamed from: getInactiveTickColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTickColor() {
        return this.inactiveTickColor;
    }

    /* renamed from: getInactiveTrackColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getInactiveTrackColor() {
        return this.inactiveTrackColor;
    }

    /* renamed from: getThumbColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getThumbColor() {
        return this.thumbColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.disabledInactiveTickColor) + d.d(this.disabledInactiveTrackColor, d.d(this.disabledActiveTickColor, d.d(this.disabledActiveTrackColor, d.d(this.disabledThumbColor, d.d(this.inactiveTickColor, d.d(this.inactiveTrackColor, d.d(this.activeTickColor, d.d(this.activeTrackColor, Color.m3799hashCodeimpl(this.thumbColor) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* renamed from: thumbColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m2117thumbColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.thumbColor : this.disabledThumbColor;
    }

    /* renamed from: tickColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2118tickColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTickColor : this.inactiveTickColor : active ? this.disabledActiveTickColor : this.disabledInactiveTickColor;
    }

    /* renamed from: trackColor-WaAFU9c$material3_release, reason: not valid java name */
    public final long m2119trackColorWaAFU9c$material3_release(boolean enabled, boolean active) {
        return enabled ? active ? this.activeTrackColor : this.inactiveTrackColor : active ? this.disabledActiveTrackColor : this.disabledInactiveTrackColor;
    }

    private SliderColors(long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11) {
        this.thumbColor = j2;
        this.activeTrackColor = j3;
        this.activeTickColor = j4;
        this.inactiveTrackColor = j5;
        this.inactiveTickColor = j6;
        this.disabledThumbColor = j7;
        this.disabledActiveTrackColor = j8;
        this.disabledActiveTickColor = j9;
        this.disabledInactiveTrackColor = j10;
        this.disabledInactiveTickColor = j11;
    }
}
