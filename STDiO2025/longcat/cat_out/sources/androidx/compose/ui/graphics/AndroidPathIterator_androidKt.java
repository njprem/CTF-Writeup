package androidx.compose.ui.graphics;

import androidx.compose.ui.graphics.PathIterator;
import androidx.compose.ui.graphics.PathSegment;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/graphics/Path;", "path", "Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;", "conicEvaluation", "", "tolerance", "Landroidx/compose/ui/graphics/PathIterator;", "PathIterator", "(Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/graphics/PathIterator$ConicEvaluation;F)Landroidx/compose/ui/graphics/PathIterator;", "LD/f;", "Landroidx/compose/ui/graphics/PathSegment$Type;", "toPathSegmentType", "(LD/f;)Landroidx/compose/ui/graphics/PathSegment$Type;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidPathIterator_androidKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[D.f.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final PathIterator PathIterator(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2) {
        return new AndroidPathIterator(path, conicEvaluation, f2);
    }

    public static /* synthetic */ PathIterator PathIterator$default(Path path, PathIterator.ConicEvaluation conicEvaluation, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            conicEvaluation = PathIterator.ConicEvaluation.AsQuadratics;
        }
        if ((i2 & 4) != 0) {
            f2 = 0.25f;
        }
        return PathIterator(path, conicEvaluation, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PathSegment.Type toPathSegmentType(D.f fVar) {
        switch (WhenMappings.$EnumSwitchMapping$0[fVar.ordinal()]) {
            case 1:
                return PathSegment.Type.Move;
            case 2:
                return PathSegment.Type.Line;
            case 3:
                return PathSegment.Type.Quadratic;
            case 4:
                return PathSegment.Type.Conic;
            case 5:
                return PathSegment.Type.Cubic;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                return PathSegment.Type.Close;
            case 7:
                return PathSegment.Type.Done;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
