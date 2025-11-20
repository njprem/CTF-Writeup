package androidx.compose.material3;

import J.d;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J%\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\tR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\f\u0010\tR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\r\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/RadioButtonColors;", "", "selectedColor", "Landroidx/compose/ui/graphics/Color;", "unselectedColor", "disabledSelectedColor", "disabledUnselectedColor", "(JJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getDisabledSelectedColor-0d7_KjU", "()J", "J", "getDisabledUnselectedColor-0d7_KjU", "getSelectedColor-0d7_KjU", "getUnselectedColor-0d7_KjU", "copy", "copy-jRlVdoo", "(JJJJ)Landroidx/compose/material3/RadioButtonColors;", "equals", "", "other", "hashCode", "", "radioColor", "Landroidx/compose/runtime/State;", "enabled", "selected", "radioColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class RadioButtonColors {
    public static final int $stable = 0;
    private final long disabledSelectedColor;
    private final long disabledUnselectedColor;
    private final long selectedColor;
    private final long unselectedColor;

    public /* synthetic */ RadioButtonColors(long j2, long j3, long j4, long j5, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, j3, j4, j5);
    }

    /* renamed from: copy-jRlVdoo$default, reason: not valid java name */
    public static /* synthetic */ RadioButtonColors m2021copyjRlVdoo$default(RadioButtonColors radioButtonColors, long j2, long j3, long j4, long j5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = radioButtonColors.selectedColor;
        }
        long j6 = j2;
        if ((i2 & 2) != 0) {
            j3 = radioButtonColors.unselectedColor;
        }
        long j7 = j3;
        if ((i2 & 4) != 0) {
            j4 = radioButtonColors.disabledSelectedColor;
        }
        return radioButtonColors.m2022copyjRlVdoo(j6, j7, j4, (i2 & 8) != 0 ? radioButtonColors.disabledUnselectedColor : j5);
    }

    /* renamed from: copy-jRlVdoo, reason: not valid java name */
    public final RadioButtonColors m2022copyjRlVdoo(long selectedColor, long unselectedColor, long disabledSelectedColor, long disabledUnselectedColor) {
        return new RadioButtonColors(selectedColor != 16 ? selectedColor : this.selectedColor, unselectedColor != 16 ? unselectedColor : this.unselectedColor, disabledSelectedColor != 16 ? disabledSelectedColor : this.disabledSelectedColor, disabledUnselectedColor != 16 ? disabledUnselectedColor : this.disabledUnselectedColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof RadioButtonColors)) {
            return false;
        }
        RadioButtonColors radioButtonColors = (RadioButtonColors) other;
        return Color.m3793equalsimpl0(this.selectedColor, radioButtonColors.selectedColor) && Color.m3793equalsimpl0(this.unselectedColor, radioButtonColors.unselectedColor) && Color.m3793equalsimpl0(this.disabledSelectedColor, radioButtonColors.disabledSelectedColor) && Color.m3793equalsimpl0(this.disabledUnselectedColor, radioButtonColors.disabledUnselectedColor);
    }

    /* renamed from: getDisabledSelectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedColor() {
        return this.disabledSelectedColor;
    }

    /* renamed from: getDisabledUnselectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledUnselectedColor() {
        return this.disabledUnselectedColor;
    }

    /* renamed from: getSelectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: getUnselectedColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getUnselectedColor() {
        return this.unselectedColor;
    }

    public int hashCode() {
        return Color.m3799hashCodeimpl(this.disabledUnselectedColor) + d.d(this.disabledSelectedColor, d.d(this.unselectedColor, Color.m3799hashCodeimpl(this.selectedColor) * 31, 31), 31);
    }

    public final State<Color> radioColor$material3_release(boolean z, boolean z2, Composer composer, int i2) {
        State<Color> stateRememberUpdatedState;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1840145292, i2, -1, "androidx.compose.material3.RadioButtonColors.radioColor (RadioButton.kt:228)");
        }
        long j2 = (z && z2) ? this.selectedColor : (!z || z2) ? (z || !z2) ? this.disabledUnselectedColor : this.disabledSelectedColor : this.unselectedColor;
        if (z) {
            composer.startReplaceGroup(350067971);
            stateRememberUpdatedState = SingleValueAnimationKt.m76animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(350170674);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m3782boximpl(j2), composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateRememberUpdatedState;
    }

    private RadioButtonColors(long j2, long j3, long j4, long j5) {
        this.selectedColor = j2;
        this.unselectedColor = j3;
        this.disabledSelectedColor = j4;
        this.disabledUnselectedColor = j5;
    }
}
