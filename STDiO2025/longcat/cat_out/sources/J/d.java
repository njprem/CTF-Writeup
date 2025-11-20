package J;

import androidx.compose.foundation.text.input.internal.selection.TextFieldPreparedSelection;
import androidx.compose.foundation.text.selection.BaseTextPreparedSelection;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ValueElementSequence;
import androidx.compose.ui.unit.Dp;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static boolean A(Composer composer, int i2, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i2));
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static int B(int i2, int i3, float f2) {
        return (Dp.m6239hashCodeimpl(f2) + i2) * i3;
    }

    public static int C(Placeable placeable, int i2, int i3) {
        return (i2 - placeable.getWidth()) / i3;
    }

    public static float a(float f2, float f3, float f4, float f5) {
        return ((f2 * f3) + f4) * f5;
    }

    public static int b(int i2, int i3, float f2) {
        return (Float.hashCode(f2) + i2) * i3;
    }

    public static int c(int i2, int i3, int i4) {
        return (Integer.hashCode(i2) + i3) * i4;
    }

    public static int d(long j2, int i2, int i3) {
        return (Color.m3799hashCodeimpl(j2) + i2) * i3;
    }

    public static int e(TextFieldPreparedSelection textFieldPreparedSelection, TextFieldPreparedSelection textFieldPreparedSelection2) {
        textFieldPreparedSelection.textPreparedSelectionState.resetCachedX();
        return textFieldPreparedSelection2.text.length();
    }

    public static int f(BaseTextPreparedSelection baseTextPreparedSelection) {
        baseTextPreparedSelection.getState().resetCachedX();
        return baseTextPreparedSelection.getText$foundation_release().length();
    }

    public static int g(Measurable measurable, long j2, ArrayList arrayList, int i2, int i3) {
        arrayList.add(measurable.mo5120measureBRTryo0(j2));
        return i2 + i3;
    }

    public static int h(Placeable placeable, int i2, int i3) {
        return (i2 - placeable.getHeight()) / i3;
    }

    public static int i(boolean z, int i2, int i3) {
        return (Boolean.hashCode(z) + i2) * i3;
    }

    public static ValueElementSequence j(float f2, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Dp.m6231boximpl(f2));
        return inspectorInfo.getProperties();
    }

    public static ValueElementSequence k(boolean z, ValueElementSequence valueElementSequence, String str, InspectorInfo inspectorInfo) {
        valueElementSequence.set(str, Boolean.valueOf(z));
        return inspectorInfo.getProperties();
    }

    public static String l(int i2, String str, String str2) {
        return str + i2 + str2;
    }

    public static String m(String str, int i2, char c2) {
        return str + i2 + c2;
    }

    public static String n(String str, int i2, int i3, String str2) {
        return str + i2 + str2 + i3;
    }

    public static String o(StringBuilder sb, float f2, char c2) {
        sb.append(f2);
        sb.append(c2);
        return sb.toString();
    }

    public static String p(StringBuilder sb, String str, char c2) {
        sb.append(str);
        sb.append(c2);
        return sb.toString();
    }

    public static StringBuilder q(String str, int i2, int i3, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i3);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder r(String str, String str2) {
        Intrinsics.checkNotNullExpressionValue(str, str2);
        return new StringBuilder();
    }

    public static ArrayList s(Map map, Object obj) {
        ArrayList arrayList = new ArrayList();
        map.put(obj, arrayList);
        return arrayList;
    }

    public static Function2 t(ComposeUiNode.Companion companion, Composer composer, MeasurePolicy measurePolicy, Composer composer2, CompositionLocalMap compositionLocalMap) {
        Updater.m3292setimpl(composer, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m3292setimpl(composer2, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        return companion.getSetCompositeKeyHash();
    }

    public static void u(float f2, StringBuilder sb, String str) {
        sb.append((Object) Dp.m6244toStringimpl(f2));
        sb.append(str);
    }

    public static void v(int i2, Composer composer, int i3, Function2 function2) {
        composer.updateRememberedValue(Integer.valueOf(i2));
        composer.apply(Integer.valueOf(i3), function2);
    }

    public static void w(long j2, StringBuilder sb, String str) {
        sb.append((Object) Color.m3800toStringimpl(j2));
        sb.append(str);
    }

    public static void x(Composer composer, int i2, Function2 function2) {
        function2.invoke(composer, Integer.valueOf(i2));
        composer.endNode();
    }

    public static void y(DrawContext drawContext, long j2) {
        drawContext.getCanvas().restore();
        drawContext.mo4264setSizeuvyYCjk(j2);
    }

    public static boolean z(Composer composer) {
        composer.endReplaceGroup();
        composer.endNode();
        return ComposerKt.isTraceInProgress();
    }
}
