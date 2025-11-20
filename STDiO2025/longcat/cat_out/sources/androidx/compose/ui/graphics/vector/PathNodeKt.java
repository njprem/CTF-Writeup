package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.vector.PathNode;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a&\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001ai\u0010'\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\b2\u0006\u0010(\u001a\u00020\b28\b\u0004\u0010)\u001a2\u0012\u0013\u0012\u00110%¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(-\u0012\u0013\u0012\u00110\b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(.\u0012\u0004\u0012\u00020#0*H\u0082\b\u001a&\u0010/\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0002\u001a4\u00100\u001a\u00020 *\u00020\u00012\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020#01j\b\u0012\u0004\u0012\u00020#`22\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001c\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"ArcToKey", "", "CloseKey", "CurveToKey", "HorizontalToKey", "LineToKey", "MoveToKey", "NUM_ARC_TO_ARGS", "", "NUM_CURVE_TO_ARGS", "NUM_HORIZONTAL_TO_ARGS", "NUM_LINE_TO_ARGS", "NUM_MOVE_TO_ARGS", "NUM_QUAD_TO_ARGS", "NUM_REFLECTIVE_CURVE_TO_ARGS", "NUM_REFLECTIVE_QUAD_TO_ARGS", "NUM_VERTICAL_TO_ARGS", "QuadToKey", "ReflectiveCurveToKey", "ReflectiveQuadToKey", "RelativeArcToKey", "RelativeCloseKey", "RelativeCurveToKey", "RelativeHorizontalToKey", "RelativeLineToKey", "RelativeMoveToKey", "RelativeQuadToKey", "RelativeReflectiveCurveToKey", "RelativeReflectiveQuadToKey", "RelativeVerticalToKey", "VerticalToKey", "pathMoveNodeFromArgs", "", "nodes", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "args", "", "count", "pathNodesFromArgs", "numArgs", "nodeFor", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "subArray", "start", "pathRelativeMoveNodeFromArgs", "addPathNodes", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PathNodeKt {
    private static final char ArcToKey = 'A';
    private static final char CloseKey = 'Z';
    private static final char CurveToKey = 'C';
    private static final char HorizontalToKey = 'H';
    private static final char LineToKey = 'L';
    private static final char MoveToKey = 'M';
    private static final int NUM_ARC_TO_ARGS = 7;
    private static final int NUM_CURVE_TO_ARGS = 6;
    private static final int NUM_HORIZONTAL_TO_ARGS = 1;
    private static final int NUM_LINE_TO_ARGS = 2;
    private static final int NUM_MOVE_TO_ARGS = 2;
    private static final int NUM_QUAD_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_CURVE_TO_ARGS = 4;
    private static final int NUM_REFLECTIVE_QUAD_TO_ARGS = 2;
    private static final int NUM_VERTICAL_TO_ARGS = 1;
    private static final char QuadToKey = 'Q';
    private static final char ReflectiveCurveToKey = 'S';
    private static final char ReflectiveQuadToKey = 'T';
    private static final char RelativeArcToKey = 'a';
    private static final char RelativeCloseKey = 'z';
    private static final char RelativeCurveToKey = 'c';
    private static final char RelativeHorizontalToKey = 'h';
    private static final char RelativeLineToKey = 'l';
    private static final char RelativeMoveToKey = 'm';
    private static final char RelativeQuadToKey = 'q';
    private static final char RelativeReflectiveCurveToKey = 's';
    private static final char RelativeReflectiveQuadToKey = 't';
    private static final char RelativeVerticalToKey = 'v';
    private static final char VerticalToKey = 'V';

    public static final void addPathNodes(char c2, ArrayList<PathNode> arrayList, float[] fArr, int i2) {
        if (c2 == 'z' || c2 == 'Z') {
            arrayList.add(PathNode.Close.INSTANCE);
            return;
        }
        if (c2 == 'm') {
            pathRelativeMoveNodeFromArgs(arrayList, fArr, i2);
            return;
        }
        if (c2 == 'M') {
            pathMoveNodeFromArgs(arrayList, fArr, i2);
            return;
        }
        int i3 = 0;
        if (c2 == 'l') {
            int i4 = i2 - 2;
            while (i3 <= i4) {
                arrayList.add(new PathNode.RelativeLineTo(fArr[i3], fArr[i3 + 1]));
                i3 += 2;
            }
            return;
        }
        if (c2 == 'L') {
            int i5 = i2 - 2;
            while (i3 <= i5) {
                arrayList.add(new PathNode.LineTo(fArr[i3], fArr[i3 + 1]));
                i3 += 2;
            }
            return;
        }
        if (c2 == 'h') {
            int i6 = i2 - 1;
            while (i3 <= i6) {
                arrayList.add(new PathNode.RelativeHorizontalTo(fArr[i3]));
                i3++;
            }
            return;
        }
        if (c2 == 'H') {
            int i7 = i2 - 1;
            while (i3 <= i7) {
                arrayList.add(new PathNode.HorizontalTo(fArr[i3]));
                i3++;
            }
            return;
        }
        if (c2 == 'v') {
            int i8 = i2 - 1;
            while (i3 <= i8) {
                arrayList.add(new PathNode.RelativeVerticalTo(fArr[i3]));
                i3++;
            }
            return;
        }
        if (c2 == 'V') {
            int i9 = i2 - 1;
            while (i3 <= i9) {
                arrayList.add(new PathNode.VerticalTo(fArr[i3]));
                i3++;
            }
            return;
        }
        if (c2 == 'c') {
            int i10 = i2 - 6;
            while (i3 <= i10) {
                arrayList.add(new PathNode.RelativeCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                i3 += 6;
            }
            return;
        }
        if (c2 == 'C') {
            int i11 = i2 - 6;
            while (i3 <= i11) {
                arrayList.add(new PathNode.CurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3], fArr[i3 + 4], fArr[i3 + 5]));
                i3 += 6;
            }
            return;
        }
        if (c2 == 's') {
            int i12 = i2 - 4;
            while (i3 <= i12) {
                arrayList.add(new PathNode.RelativeReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                i3 += 4;
            }
            return;
        }
        if (c2 == 'S') {
            int i13 = i2 - 4;
            while (i3 <= i13) {
                arrayList.add(new PathNode.ReflectiveCurveTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                i3 += 4;
            }
            return;
        }
        if (c2 == 'q') {
            int i14 = i2 - 4;
            while (i3 <= i14) {
                arrayList.add(new PathNode.RelativeQuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                i3 += 4;
            }
            return;
        }
        if (c2 == 'Q') {
            int i15 = i2 - 4;
            while (i3 <= i15) {
                arrayList.add(new PathNode.QuadTo(fArr[i3], fArr[i3 + 1], fArr[i3 + 2], fArr[i3 + 3]));
                i3 += 4;
            }
            return;
        }
        if (c2 == 't') {
            int i16 = i2 - 2;
            while (i3 <= i16) {
                arrayList.add(new PathNode.RelativeReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                i3 += 2;
            }
            return;
        }
        if (c2 == 'T') {
            int i17 = i2 - 2;
            while (i3 <= i17) {
                arrayList.add(new PathNode.ReflectiveQuadTo(fArr[i3], fArr[i3 + 1]));
                i3 += 2;
            }
            return;
        }
        if (c2 == 'a') {
            int i18 = i2 - 7;
            for (int i19 = 0; i19 <= i18; i19 += 7) {
                arrayList.add(new PathNode.RelativeArcTo(fArr[i19], fArr[i19 + 1], fArr[i19 + 2], Float.compare(fArr[i19 + 3], 0.0f) != 0, Float.compare(fArr[i19 + 4], 0.0f) != 0, fArr[i19 + 5], fArr[i19 + 6]));
            }
            return;
        }
        if (c2 != 'A') {
            throw new IllegalArgumentException("Unknown command for: " + c2);
        }
        int i20 = i2 - 7;
        for (int i21 = 0; i21 <= i20; i21 += 7) {
            arrayList.add(new PathNode.ArcTo(fArr[i21], fArr[i21 + 1], fArr[i21 + 2], Float.compare(fArr[i21 + 3], 0.0f) != 0, Float.compare(fArr[i21 + 4], 0.0f) != 0, fArr[i21 + 5], fArr[i21 + 6]));
        }
    }

    private static final void pathMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.MoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.LineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }

    private static final void pathNodesFromArgs(List<PathNode> list, float[] fArr, int i2, int i3, Function2<? super float[], ? super Integer, ? extends PathNode> function2) {
        int i4 = i2 - i3;
        int i5 = 0;
        while (i5 <= i4) {
            list.add(function2.invoke(fArr, Integer.valueOf(i5)));
            i5 += i3;
        }
    }

    private static final void pathRelativeMoveNodeFromArgs(List<PathNode> list, float[] fArr, int i2) {
        int i3 = i2 - 2;
        if (i3 >= 0) {
            list.add(new PathNode.RelativeMoveTo(fArr[0], fArr[1]));
            for (int i4 = 2; i4 <= i3; i4 += 2) {
                list.add(new PathNode.RelativeLineTo(fArr[i4], fArr[i4 + 1]));
            }
        }
    }
}
