package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.StringHelpers_androidKt;
import androidx.compose.foundation.text.input.internal.IndexTransformationType;
import androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.WedgeAffinity;
import androidx.compose.ui.text.TextRange;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0001¨\u0006\t"}, d2 = {"calculateAdjacentCursorPosition", "", "transformedText", "", "cursor", "forward", "", "state", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextPreparedSelectionKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IndexTransformationType.values().length];
            try {
                iArr[IndexTransformationType.Untransformed.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IndexTransformationType.Deletion.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IndexTransformationType.Replacement.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IndexTransformationType.Insertion.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int calculateAdjacentCursorPosition(String str, int i2, boolean z, TransformedTextFieldState transformedTextFieldState) {
        int iFindFollowingBreak = z ? StringHelpers_androidKt.findFollowingBreak(str, i2) : StringHelpers_androidKt.findPrecedingBreak(str, i2);
        if (iFindFollowingBreak == -1) {
            return i2;
        }
        long jM1184mapFromTransformedjx7JFs = transformedTextFieldState.m1184mapFromTransformedjx7JFs(iFindFollowingBreak);
        long jM1187mapToTransformedGEjPoXI = transformedTextFieldState.m1187mapToTransformedGEjPoXI(jM1184mapFromTransformedjx7JFs);
        int i3 = WhenMappings.$EnumSwitchMapping$0[((TextRange.m5715getCollapsedimpl(jM1184mapFromTransformedjx7JFs) && TextRange.m5715getCollapsedimpl(jM1187mapToTransformedGEjPoXI)) ? IndexTransformationType.Untransformed : (TextRange.m5715getCollapsedimpl(jM1184mapFromTransformedjx7JFs) || TextRange.m5715getCollapsedimpl(jM1187mapToTransformedGEjPoXI)) ? (!TextRange.m5715getCollapsedimpl(jM1184mapFromTransformedjx7JFs) || TextRange.m5715getCollapsedimpl(jM1187mapToTransformedGEjPoXI)) ? IndexTransformationType.Deletion : IndexTransformationType.Insertion : IndexTransformationType.Replacement).ordinal()];
        if (i3 == 1 || i3 == 2) {
            return iFindFollowingBreak;
        }
        if (i3 == 3) {
            return z ? TextRange.m5716getEndimpl(jM1187mapToTransformedGEjPoXI) : TextRange.m5721getStartimpl(jM1187mapToTransformedGEjPoXI);
        }
        if (i3 != 4) {
            throw new NoWhenBranchMatchedException();
        }
        if (z) {
            if (iFindFollowingBreak == TextRange.m5721getStartimpl(jM1187mapToTransformedGEjPoXI)) {
                transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
                return iFindFollowingBreak;
            }
            transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.End));
            return i2;
        }
        if (iFindFollowingBreak == TextRange.m5716getEndimpl(jM1187mapToTransformedGEjPoXI)) {
            transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.End));
            return iFindFollowingBreak;
        }
        transformedTextFieldState.setSelectionWedgeAffinity(new SelectionWedgeAffinity(WedgeAffinity.Start));
        return i2;
    }
}
