package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.vector.ImageVector;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\b\u001a\u0098\u0001\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020 2\u0017\u0010!\u001a\u0013\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0002\b\u0012H\u0086\bø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a'\u0010%\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a'\u0010*\u001a\u0002H&\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(H\u0002¢\u0006\u0002\u0010)\u001a/\u0010+\u001a\u00020,\"\u0004\b\u0000\u0010&*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(2\u0006\u0010-\u001a\u0002H&H\u0002¢\u0006\u0002\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"group", "Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "name", "", "rotate", "", "pivotX", "pivotY", "scaleX", "scaleY", "translationX", "translationY", "clipPathData", "", "Landroidx/compose/ui/graphics/vector/PathNode;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "path", "fill", "Landroidx/compose/ui/graphics/Brush;", "fillAlpha", "stroke", "strokeAlpha", "strokeLineWidth", "strokeLineCap", "Landroidx/compose/ui/graphics/StrokeCap;", "strokeLineJoin", "Landroidx/compose/ui/graphics/StrokeJoin;", "strokeLineMiter", "pathFillType", "Landroidx/compose/ui/graphics/PathFillType;", "pathBuilder", "Landroidx/compose/ui/graphics/vector/PathBuilder;", "path-R_LF-3I", "(Landroidx/compose/ui/graphics/vector/ImageVector$Builder;Ljava/lang/String;Landroidx/compose/ui/graphics/Brush;FLandroidx/compose/ui/graphics/Brush;FFIIFILkotlin/jvm/functions/Function1;)Landroidx/compose/ui/graphics/vector/ImageVector$Builder;", "peek", "T", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)Ljava/lang/Object;", "pop", "push", "", "value", "(Ljava/util/ArrayList;Ljava/lang/Object;)Z", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageVectorKt {
    public static final ImageVector.Builder group(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List<? extends PathNode> list, Function1<? super ImageVector.Builder, Unit> function1) {
        builder.addGroup(str, f2, f3, f4, f5, f6, f7, f8, list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    public static /* synthetic */ ImageVector.Builder group$default(ImageVector.Builder builder, String str, float f2, float f3, float f4, float f5, float f6, float f7, float f8, List list, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "";
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            f2 = 0.0f;
        }
        builder.addGroup(str2, f2, (i2 & 4) != 0 ? 0.0f : f3, (i2 & 8) != 0 ? 0.0f : f4, (i2 & 16) != 0 ? 1.0f : f5, (i2 & 32) != 0 ? 1.0f : f6, (i2 & 64) != 0 ? 0.0f : f7, (i2 & 128) != 0 ? 0.0f : f8, (i2 & Fields.RotationX) != 0 ? VectorKt.getEmptyPath() : list);
        function1.invoke(builder);
        builder.clearGroup();
        return builder;
    }

    /* renamed from: path-R_LF-3I, reason: not valid java name */
    public static final ImageVector.Builder m4477pathR_LF3I(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, Function1<? super PathBuilder, Unit> function1) {
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : i4, (14336 & 4) != 0 ? "" : str, (14336 & 8) != 0 ? null : brush, (14336 & 16) != 0 ? 1.0f : f2, (14336 & 32) == 0 ? brush2 : null, (14336 & 64) != 0 ? 1.0f : f3, (14336 & 128) != 0 ? 0.0f : f4, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3, (14336 & 1024) != 0 ? 4.0f : f5, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
    }

    /* renamed from: path-R_LF-3I$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m4478pathR_LF3I$default(ImageVector.Builder builder, String str, Brush brush, float f2, Brush brush2, float f3, float f4, int i2, int i3, float f5, int i4, Function1 function1, int i5, Object obj) {
        String str2 = (i5 & 1) != 0 ? "" : str;
        Brush brush3 = (i5 & 2) != 0 ? null : brush;
        float f6 = (i5 & 4) != 0 ? 1.0f : f2;
        Brush brush4 = (i5 & 8) != 0 ? null : brush2;
        float f7 = (i5 & 16) != 0 ? 1.0f : f3;
        float f8 = (i5 & 32) != 0 ? 0.0f : f4;
        int defaultStrokeLineCap = (i5 & 64) != 0 ? VectorKt.getDefaultStrokeLineCap() : i2;
        int defaultStrokeLineJoin = (i5 & 128) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i3;
        float f9 = (i5 & Fields.RotationX) != 0 ? 4.0f : f5;
        int defaultFillType = (i5 & 512) != 0 ? VectorKt.getDefaultFillType() : i4;
        PathBuilder pathBuilder = new PathBuilder();
        function1.invoke(pathBuilder);
        return builder.m4476addPathoIyEayM(pathBuilder.getNodes(), (14336 & 2) != 0 ? VectorKt.getDefaultFillType() : defaultFillType, (14336 & 4) != 0 ? "" : str2, (14336 & 8) != 0 ? null : brush3, (14336 & 16) != 0 ? 1.0f : f6, (14336 & 32) == 0 ? brush4 : null, (14336 & 64) != 0 ? 1.0f : f7, (14336 & 128) != 0 ? 0.0f : f8, (14336 & Fields.RotationX) != 0 ? VectorKt.getDefaultStrokeLineCap() : defaultStrokeLineCap, (14336 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : defaultStrokeLineJoin, (14336 & 1024) != 0 ? 4.0f : f9, (14336 & Fields.CameraDistance) != 0 ? 0.0f : 0.0f, (14336 & 4096) == 0 ? 0.0f : 1.0f, (14336 & 8192) != 0 ? 0.0f : 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T peek(ArrayList<T> arrayList) {
        return arrayList.get(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T pop(ArrayList<T> arrayList) {
        return arrayList.remove(arrayList.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean push(ArrayList<T> arrayList, T t) {
        return arrayList.add(t);
    }
}
