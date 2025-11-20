package androidx.compose.material3.carousel;

import J.d;
import j.AbstractC0655h;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 42\u00020\u0001:\u00014BM\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000eJ)\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b&\u0010%R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010#\u001a\u0004\b(\u0010%R\u0014\u0010)\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010#R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010-R\u0017\u0010/\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0011\u00103\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b2\u0010%¨\u00065"}, d2 = {"Landroidx/compose/material3/carousel/Strategy;", "", "Landroidx/compose/material3/carousel/KeylineList;", "defaultKeylines", "", "startKeylineSteps", "endKeylineSteps", "", "availableSpace", "itemSpacing", "beforeContentPadding", "afterContentPadding", "<init>", "(Landroidx/compose/material3/carousel/KeylineList;Ljava/util/List;Ljava/util/List;FFFF)V", "(Landroidx/compose/material3/carousel/KeylineList;FFFF)V", "scrollOffset", "maxScrollOffset", "", "roundToNearestStep", "getKeylineListForScrollOffset$material3_release", "(FFZ)Landroidx/compose/material3/carousel/KeylineList;", "getKeylineListForScrollOffset", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroidx/compose/material3/carousel/KeylineList;", "getDefaultKeylines", "()Landroidx/compose/material3/carousel/KeylineList;", "Ljava/util/List;", "getStartKeylineSteps", "()Ljava/util/List;", "getEndKeylineSteps", "F", "getAvailableSpace", "()F", "getItemSpacing", "getBeforeContentPadding", "getAfterContentPadding", "startShiftDistance", "endShiftDistance", "Lj/h;", "startShiftPoints", "Lj/h;", "endShiftPoints", "isValid", "Z", "()Z", "getItemMainAxisSize", "itemMainAxisSize", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Strategy {
    private final float afterContentPadding;
    private final float availableSpace;
    private final float beforeContentPadding;
    private final KeylineList defaultKeylines;
    private final List<KeylineList> endKeylineSteps;
    private final float endShiftDistance;
    private final AbstractC0655h endShiftPoints;
    private final boolean isValid;
    private final float itemSpacing;
    private final List<KeylineList> startKeylineSteps;
    private final float startShiftDistance;
    private final AbstractC0655h startShiftPoints;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Strategy Empty = new Strategy(KeylineListKt.emptyKeylineList(), CollectionsKt.emptyList(), CollectionsKt.emptyList(), 0.0f, 0.0f, 0.0f, 0.0f);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/material3/carousel/Strategy$Companion;", "", "()V", "Empty", "Landroidx/compose/material3/carousel/Strategy;", "getEmpty", "()Landroidx/compose/material3/carousel/Strategy;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Strategy getEmpty() {
            return Strategy.Empty;
        }

        private Companion() {
        }
    }

    private Strategy(KeylineList keylineList, List<KeylineList> list, List<KeylineList> list2, float f2, float f3, float f4, float f5) {
        this.defaultKeylines = keylineList;
        this.startKeylineSteps = list;
        this.endKeylineSteps = list2;
        this.availableSpace = f2;
        this.itemSpacing = f3;
        this.beforeContentPadding = f4;
        this.afterContentPadding = f5;
        float startShiftDistance = StrategyKt.getStartShiftDistance(list, f4);
        this.startShiftDistance = startShiftDistance;
        float endShiftDistance = StrategyKt.getEndShiftDistance(list2, f5);
        this.endShiftDistance = endShiftDistance;
        this.startShiftPoints = StrategyKt.getStepInterpolationPoints(startShiftDistance, list, true);
        this.endShiftPoints = StrategyKt.getStepInterpolationPoints(endShiftDistance, list2, false);
        this.isValid = (keylineList.isEmpty() || f2 == 0.0f || getItemMainAxisSize() == 0.0f) ? false : true;
    }

    public static /* synthetic */ KeylineList getKeylineListForScrollOffset$material3_release$default(Strategy strategy, float f2, float f3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return strategy.getKeylineListForScrollOffset$material3_release(f2, f3, z);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Strategy)) {
            return false;
        }
        boolean z = this.isValid;
        if (!z && !((Strategy) other).isValid) {
            return true;
        }
        Strategy strategy = (Strategy) other;
        return z == strategy.isValid && this.availableSpace == strategy.availableSpace && this.itemSpacing == strategy.itemSpacing && this.beforeContentPadding == strategy.beforeContentPadding && this.afterContentPadding == strategy.afterContentPadding && getItemMainAxisSize() == strategy.getItemMainAxisSize() && this.startShiftDistance == strategy.startShiftDistance && this.endShiftDistance == strategy.endShiftDistance && Intrinsics.areEqual(this.startShiftPoints, strategy.startShiftPoints) && Intrinsics.areEqual(this.endShiftPoints, strategy.endShiftPoints) && Intrinsics.areEqual(this.defaultKeylines, strategy.defaultKeylines);
    }

    public final float getAfterContentPadding() {
        return this.afterContentPadding;
    }

    public final float getAvailableSpace() {
        return this.availableSpace;
    }

    public final float getBeforeContentPadding() {
        return this.beforeContentPadding;
    }

    public final KeylineList getDefaultKeylines() {
        return this.defaultKeylines;
    }

    public final List<KeylineList> getEndKeylineSteps() {
        return this.endKeylineSteps;
    }

    public final float getItemMainAxisSize() {
        return this.defaultKeylines.getFirstFocal().getSize();
    }

    public final float getItemSpacing() {
        return this.itemSpacing;
    }

    public final KeylineList getKeylineListForScrollOffset$material3_release(float scrollOffset, float maxScrollOffset, boolean roundToNearestStep) {
        float fMax = Math.max(0.0f, scrollOffset);
        float f2 = this.startShiftDistance;
        float fMax2 = Math.max(0.0f, maxScrollOffset - this.endShiftDistance);
        if (f2 <= fMax && fMax <= fMax2) {
            return this.defaultKeylines;
        }
        float fLerp = StrategyKt.lerp(1.0f, 0.0f, 0.0f, f2, fMax);
        AbstractC0655h abstractC0655h = this.startShiftPoints;
        List<KeylineList> list = this.startKeylineSteps;
        if (fMax > fMax2) {
            fLerp = StrategyKt.lerp(0.0f, 1.0f, fMax2, maxScrollOffset, fMax);
            abstractC0655h = this.endShiftPoints;
            list = this.endKeylineSteps;
        }
        ShiftPointRange shiftPointRange = StrategyKt.getShiftPointRange(list.size(), abstractC0655h, fLerp);
        if (roundToNearestStep) {
            return list.get(MathKt.roundToInt(shiftPointRange.getSteppedInterpolation()) == 0 ? shiftPointRange.getFromStepIndex() : shiftPointRange.getToStepIndex());
        }
        return KeylineListKt.lerp(list.get(shiftPointRange.getFromStepIndex()), list.get(shiftPointRange.getToStepIndex()), shiftPointRange.getSteppedInterpolation());
    }

    public final List<KeylineList> getStartKeylineSteps() {
        return this.startKeylineSteps;
    }

    public int hashCode() {
        boolean z = this.isValid;
        if (!z) {
            return Boolean.hashCode(z);
        }
        return this.defaultKeylines.hashCode() + ((this.endShiftPoints.hashCode() + ((this.startShiftPoints.hashCode() + d.b(d.b((Float.hashCode(getItemMainAxisSize()) + d.b(d.b(d.b(d.b(Boolean.hashCode(z) * 31, 31, this.availableSpace), 31, this.itemSpacing), 31, this.beforeContentPadding), 31, this.afterContentPadding)) * 31, 31, this.startShiftDistance), 31, this.endShiftDistance)) * 31)) * 31);
    }

    /* renamed from: isValid, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public Strategy(KeylineList keylineList, float f2, float f3, float f4, float f5) {
        this(keylineList, StrategyKt.getStartKeylineSteps(keylineList, f2, f3, f4), StrategyKt.getEndKeylineSteps(keylineList, f2, f3, f5), f2, f3, f4, f5);
    }
}
