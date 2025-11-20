package androidx.compose.runtime.changelist;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.IntRange;
import kotlin.reflect.KMutableProperty1;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static PathBuilder A(float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.lineTo(f4, f5);
        return pathBuilder;
    }

    public static List B(PathBuilder pathBuilder, float f2, float f3, float f4, float f5) {
        pathBuilder.lineTo(f2, f3);
        pathBuilder.lineTo(f4, f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException C() {
        FlowKt.noImpl();
        return new KotlinNothingValueException();
    }

    public static void D(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        PreconditionsKt.throwIllegalStateException(sb.toString());
    }

    public static int a(int i2, IntRange intRange) {
        return intRange.getEndInclusive().intValue() + i2;
    }

    public static int b(LayoutNode layoutNode) {
        return layoutNode.getNodes().getHead().getAggregateChildKindSet();
    }

    public static int c(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static int d(UInt uInt, int i2) {
        return UInt.m6593constructorimpl(uInt.getData() + i2);
    }

    public static long e(long j2, long j3) {
        return ULong.m6672constructorimpl(ULong.m6672constructorimpl(j2) * j3);
    }

    public static CompositionScopedCoroutineScopeCanceller f(CoroutineScope coroutineScope, Composer composer) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(coroutineScope);
        composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
        return compositionScopedCoroutineScopeCanceller;
    }

    public static PathBuilder g(float f2, float f3, float f4, float f5) {
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(f2, f3);
        pathBuilder.lineToRelative(f4, f5);
        return pathBuilder;
    }

    public static Object h(MutableVector mutableVector, int i2) {
        return mutableVector.removeAt(mutableVector.getSize() - i2);
    }

    public static Object i(CharSequence charSequence, int i2, Function1 function1) {
        return function1.invoke(Character.valueOf(charSequence.charAt(i2)));
    }

    public static Object j(byte[] bArr, int i2, Function1 function1) {
        return function1.invoke(UByte.m6510boximpl(UByteArray.m6574getw2LRezQ(bArr, i2)));
    }

    public static Object k(int[] iArr, int i2, Function1 function1) {
        return function1.invoke(UInt.m6587boximpl(UIntArray.m6653getpVg5ArA(iArr, i2)));
    }

    public static Object l(long[] jArr, int i2, Function1 function1) {
        return function1.invoke(ULong.m6666boximpl(ULongArray.m6732getsVKNKU(jArr, i2)));
    }

    public static Object m(short[] sArr, int i2, Function1 function1) {
        return function1.invoke(UShort.m6773boximpl(UShortArray.m6837getMh2AYeg(sArr, i2)));
    }

    public static String n(String str, int i2) {
        return str + i2;
    }

    public static String o(StringBuilder sb, int i2, char c2) {
        sb.append(i2);
        sb.append(c2);
        return sb.toString();
    }

    public static StringBuilder p(int i2, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i2);
        sb.append(str2);
        return sb;
    }

    public static ArrayList q(LinkedHashMap linkedHashMap, Object obj) {
        ArrayList arrayList = new ArrayList();
        linkedHashMap.put(obj, arrayList);
        return arrayList;
    }

    public static Iterator r(Iterable iterable, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(iterable, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return iterable.iterator();
    }

    public static Iterator s(Sequence sequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(sequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return sequence.iterator();
    }

    public static List t(PathBuilder pathBuilder, float f2, float f3, float f4, float f5) {
        pathBuilder.lineToRelative(f2, f3);
        pathBuilder.lineToRelative(f4, f5);
        pathBuilder.close();
        return pathBuilder.getNodes();
    }

    public static KotlinNothingValueException u() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    public static KotlinNothingValueException v(String str) {
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck(str);
        return new KotlinNothingValueException();
    }

    public static KMutableProperty1 w(Class cls, String str, String str2, int i2) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i2));
    }

    public static void x(int i2, DrawContext drawContext, long j2, int i3) {
        InlineMarker.finallyStart(i2);
        drawContext.getCanvas().restore();
        drawContext.mo4264setSizeuvyYCjk(j2);
        InlineMarker.finallyEnd(i3);
    }

    public static void y(PathBuilder pathBuilder, float f2, float f3, float f4) {
        pathBuilder.lineTo(f2, f3);
        pathBuilder.verticalLineToRelative(f4);
        pathBuilder.close();
    }

    public static void z(StringBuilder sb, int i2, String str, String str2, String str3) {
        sb.append(i2);
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
    }
}
