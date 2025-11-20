package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.os.Build;
import androidx.compose.ui.geometry.CornerRadiusKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.BlendMode;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.RenderEffect;
import androidx.compose.ui.graphics.drawscope.DrawContextKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ¶\u00012\u00020\u0001:\u0002¶\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0085\u0001\u001a\u0002082\u0007\u0010\u0086\u0001\u001a\u00020\u0000H\u0002J\t\u0010\u0087\u0001\u001a\u000208H\u0002J\t\u0010\u0088\u0001\u001a\u000208H\u0002J\u000f\u0010\u0089\u0001\u001a\u000208H\u0000¢\u0006\u0003\b\u008a\u0001J$\u0010\u008b\u0001\u001a\u0002082\b\u0010\u008c\u0001\u001a\u00030\u008d\u00012\t\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0003\b\u008f\u0001J\u0019\u0010\u0090\u0001\u001a\u0002082\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0000¢\u0006\u0003\b\u0091\u0001J\u000f\u0010\u0092\u0001\u001a\u000208H\u0001¢\u0006\u0003\b\u0093\u0001J\t\u0010\u0094\u0001\u001a\u00020\u0015H\u0002J\t\u0010\u0095\u0001\u001a\u000208H\u0002J\t\u0010\u0096\u0001\u001a\u000208H\u0002JE\u0010\u0097\u0001\u001a\u0002082\u0006\u00103\u001a\u0002042\u0006\u0010C\u001a\u00020D2\u0006\u0010r\u001a\u00020q2\u0018\u0010\u0098\u0001\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806¢\u0006\u0002\b9ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\t\u0010\u009b\u0001\u001a\u000208H\u0002J\t\u0010\u009c\u0001\u001a\u000208H\u0002J\u000f\u0010\u009d\u0001\u001a\u000208H\u0000¢\u0006\u0003\b\u009e\u0001J\t\u0010\u009f\u0001\u001a\u000208H\u0002J5\u0010 \u0001\u001a\u0003H¡\u0001\"\u0005\b\u0000\u0010¡\u00012\u001b\u0010\u0098\u0001\u001a\u0016\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020f\u0012\u0005\u0012\u0003H¡\u00010¢\u0001H\u0082\b¢\u0006\u0003\u0010£\u0001J\u0010\u0010¤\u0001\u001a\u0002082\u0007\u0010¥\u0001\u001a\u00020JJ%\u0010¦\u0001\u001a\u0002082\u0006\u0010{\u001a\u00020z2\u0006\u0010r\u001a\u00020qH\u0002ø\u0001\u0000¢\u0006\u0006\b§\u0001\u0010¨\u0001J'\u0010©\u0001\u001a\u0002082\b\b\u0002\u0010{\u001a\u00020O2\b\b\u0002\u0010r\u001a\u00020fø\u0001\u0000¢\u0006\u0006\bª\u0001\u0010¨\u0001J2\u0010«\u0001\u001a\u0002082\b\b\u0002\u0010{\u001a\u00020O2\b\b\u0002\u0010r\u001a\u00020f2\t\b\u0002\u0010¬\u0001\u001a\u00020\bø\u0001\u0000¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J\u0011\u0010¯\u0001\u001a\u00030°\u0001H\u0086@¢\u0006\u0003\u0010±\u0001J\u0013\u0010²\u0001\u001a\u0002082\b\u0010³\u0001\u001a\u00030´\u0001H\u0002J\u0012\u0010µ\u0001\u001a\u00020\u00152\u0007\u0010¥\u0001\u001a\u00020JH\u0002R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR*\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u00168F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u000b\"\u0004\b\u001e\u0010\rR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\"\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!8F@FX\u0086\u000e¢\u0006\u0012\u0012\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u0010*\u001a\u0004\u0018\u00010)2\b\u0010\u0007\u001a\u0004\u0018\u00010)8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R*\u00100\u001a\u00020/2\u0006\u0010\u0007\u001a\u00020/8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010\u001bR\u000e\u00103\u001a\u000204X\u0082\u000e¢\u0006\u0002\n\u0000R\u001f\u00105\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020806¢\u0006\u0002\b9X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010?\u001a\u00020!2\u0006\u0010>\u001a\u00020!@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b?\u0010&R\u0011\u0010@\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010\u0011R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010E\u001a\u00020=8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u000e\u0010H\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010I\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010K\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bL\u0010\u0011R\u000e\u0010M\u001a\u00020NX\u0082\u000e¢\u0006\u0002\n\u0000R,\u0010P\u001a\u00020O2\u0006\u0010\u0007\u001a\u00020O@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bQ\u0010\u0011\"\u0004\bR\u0010\u0013R(\u0010U\u001a\u0004\u0018\u00010T2\b\u0010\u0007\u001a\u0004\u0018\u00010T8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR$\u0010Z\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010\u000b\"\u0004\b\\\u0010\rR$\u0010]\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010\u000b\"\u0004\b_\u0010\rR$\u0010`\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010\u000b\"\u0004\bb\u0010\rR\u0010\u0010c\u001a\u0004\u0018\u00010JX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010e\u001a\u00020fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010SR\u0016\u0010g\u001a\u00020OX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010SR$\u0010h\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010\u000b\"\u0004\bj\u0010\rR$\u0010k\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bl\u0010\u000b\"\u0004\bm\u0010\rR$\u0010n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bo\u0010\u000b\"\u0004\bp\u0010\rR,\u0010r\u001a\u00020q2\u0006\u0010\u0007\u001a\u00020q@BX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\bs\u0010\u0011\"\u0004\bt\u0010\u0013R\u0010\u0010u\u001a\u0004\u0018\u00010vX\u0082\u000e¢\u0006\u0002\n\u0000R*\u0010w\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u000e8F@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\f\u001a\u0004\bx\u0010\u0011\"\u0004\by\u0010\u0013R,\u0010{\u001a\u00020z2\u0006\u0010\u0007\u001a\u00020z@FX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010S\u001a\u0004\b|\u0010\u0011\"\u0004\b}\u0010\u0013R%\u0010~\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\r\u001a\u0004\b\u007f\u0010\u000b\"\u0005\b\u0080\u0001\u0010\rR'\u0010\u0081\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0082\u0001\u0010\u000b\"\u0005\b\u0083\u0001\u0010\rR\u000f\u0010\u0084\u0001\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006·\u0001"}, d2 = {"Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "impl", "Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "layerManager", "Landroidx/compose/ui/graphics/layer/LayerManager;", "(Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;Landroidx/compose/ui/graphics/layer/LayerManager;)V", "value", "", "alpha", "getAlpha", "()F", "setAlpha", "(F)V", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "getAmbientShadowColor-0d7_KjU", "()J", "setAmbientShadowColor-8_81llA", "(J)V", "androidOutline", "Landroid/graphics/Outline;", "Landroidx/compose/ui/graphics/BlendMode;", "blendMode", "getBlendMode-0nO6VwU", "()I", "setBlendMode-s9anfk8", "(I)V", "cameraDistance", "getCameraDistance", "setCameraDistance", "childDependenciesTracker", "Landroidx/compose/ui/graphics/layer/ChildLayerDependenciesTracker;", "", "clip", "getClip$annotations", "()V", "getClip", "()Z", "setClip", "(Z)V", "Landroidx/compose/ui/graphics/ColorFilter;", "colorFilter", "getColorFilter", "()Landroidx/compose/ui/graphics/ColorFilter;", "setColorFilter", "(Landroidx/compose/ui/graphics/ColorFilter;)V", "Landroidx/compose/ui/graphics/layer/CompositingStrategy;", "compositingStrategy", "getCompositingStrategy-ke2Ky5w", "setCompositingStrategy-Wpw9cng", "density", "Landroidx/compose/ui/unit/Density;", "drawBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "Lkotlin/ExtensionFunctionType;", "getImpl$ui_graphics_release", "()Landroidx/compose/ui/graphics/layer/GraphicsLayerImpl;", "internalOutline", "Landroidx/compose/ui/graphics/Outline;", "<set-?>", "isReleased", "layerId", "", "getLayerId", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "outline", "getOutline", "()Landroidx/compose/ui/graphics/Outline;", "outlineDirty", "outlinePath", "Landroidx/compose/ui/graphics/Path;", "ownerViewId", "getOwnerViewId", "parentLayerUsages", "", "Landroidx/compose/ui/geometry/Offset;", "pivotOffset", "getPivotOffset-F1C5BW0", "setPivotOffset-k-4lQ0M", "J", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "getRenderEffect", "()Landroidx/compose/ui/graphics/RenderEffect;", "setRenderEffect", "(Landroidx/compose/ui/graphics/RenderEffect;)V", "rotationX", "getRotationX", "setRotationX", "rotationY", "getRotationY", "setRotationY", "rotationZ", "getRotationZ", "setRotationZ", "roundRectClipPath", "roundRectCornerRadius", "roundRectOutlineSize", "Landroidx/compose/ui/geometry/Size;", "roundRectOutlineTopLeft", "scaleX", "getScaleX", "setScaleX", "scaleY", "getScaleY", "setScaleY", "shadowElevation", "getShadowElevation", "setShadowElevation", "Landroidx/compose/ui/unit/IntSize;", "size", "getSize-YbymL2g", "setSize-ozmzZPI", "softwareLayerPaint", "Landroidx/compose/ui/graphics/Paint;", "spotShadowColor", "getSpotShadowColor-0d7_KjU", "setSpotShadowColor-8_81llA", "Landroidx/compose/ui/unit/IntOffset;", "topLeft", "getTopLeft-nOcc-ac", "setTopLeft--gyyYBs", "translationX", "getTranslationX", "setTranslationX", "translationY", "getTranslationY", "setTranslationY", "usePathForClip", "addSubLayer", "graphicsLayer", "configureOutline", "discardContentIfReleasedAndHaveNoParentLayerUsages", "discardDisplayList", "discardDisplayList$ui_graphics_release", "draw", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "parentLayer", "draw$ui_graphics_release", "drawForPersistence", "drawForPersistence$ui_graphics_release", "emulateTrimMemory", "emulateTrimMemory$ui_graphics_release", "obtainAndroidOutline", "onAddedToParentLayer", "onRemovedFromParentLayer", "record", "block", "record-mL-hObY", "(Landroidx/compose/ui/unit/Density;Landroidx/compose/ui/unit/LayoutDirection;JLkotlin/jvm/functions/Function1;)V", "recordInternal", "recreateDisplayListIfNeeded", "release", "release$ui_graphics_release", "resetOutlineParams", "resolveOutlinePosition", "T", "Lkotlin/Function2;", "(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "setPathOutline", "path", "setPosition", "setPosition-VbeCjmY", "(JJ)V", "setRectOutline", "setRectOutline-tz77jQw", "setRoundRectOutline", "cornerRadius", "setRoundRectOutline-TNW_H78", "(JJF)V", "toImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transformCanvas", "androidCanvas", "Landroid/graphics/Canvas;", "updatePathOutline", "Companion", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GraphicsLayer {
    private static final LayerSnapshotImpl SnapshotImpl;
    private Outline androidOutline;
    private final ChildLayerDependenciesTracker childDependenciesTracker;
    private final GraphicsLayerImpl impl;
    private androidx.compose.ui.graphics.Outline internalOutline;
    private boolean isReleased;
    private final LayerManager layerManager;
    private Path outlinePath;
    private int parentLayerUsages;
    private long pivotOffset;
    private Path roundRectClipPath;
    private float roundRectCornerRadius;
    private long roundRectOutlineSize;
    private long roundRectOutlineTopLeft;
    private long size;
    private Paint softwareLayerPaint;
    private long topLeft;
    private boolean usePathForClip;
    private Density density = DrawContextKt.getDefaultDensity();
    private LayoutDirection layoutDirection = LayoutDirection.Ltr;
    private Function1<? super DrawScope, Unit> drawBlock = new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.graphics.layer.GraphicsLayer$drawBlock$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(DrawScope drawScope) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }
    };
    private boolean outlineDirty = true;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.graphics.layer.GraphicsLayer", f = "AndroidGraphicsLayer.android.kt", i = {}, l = {847}, m = "toImageBitmap", n = {}, s = {})
    /* renamed from: androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GraphicsLayer.this.toImageBitmap(this);
        }
    }

    static {
        SnapshotImpl = Build.VERSION.SDK_INT >= 28 ? LayerSnapshotV28.INSTANCE : SurfaceUtils.INSTANCE.isLockHardwareCanvasAvailable() ? LayerSnapshotV22.INSTANCE : LayerSnapshotV21.INSTANCE;
    }

    public GraphicsLayer(GraphicsLayerImpl graphicsLayerImpl, LayerManager layerManager) {
        this.impl = graphicsLayerImpl;
        this.layerManager = layerManager;
        Offset.Companion companion = Offset.INSTANCE;
        this.roundRectOutlineTopLeft = companion.m3567getZeroF1C5BW0();
        this.roundRectOutlineSize = Size.INSTANCE.m3628getUnspecifiedNHjbRc();
        this.childDependenciesTracker = new ChildLayerDependenciesTracker();
        graphicsLayerImpl.setClip(false);
        this.topLeft = IntOffset.INSTANCE.m6371getZeronOccac();
        this.size = IntSize.INSTANCE.m6408getZeroYbymL2g();
        this.pivotOffset = companion.m3566getUnspecifiedF1C5BW0();
    }

    private final void addSubLayer(GraphicsLayer graphicsLayer) {
        if (this.childDependenciesTracker.onDependencyAdded(graphicsLayer)) {
            graphicsLayer.onAddedToParentLayer();
        }
    }

    private final void configureOutline() {
        if (this.outlineDirty) {
            if (getClip() || getShadowElevation() > 0.0f) {
                Path path = this.outlinePath;
                if (path != null) {
                    Outline outlineUpdatePathOutline = updatePathOutline(path);
                    outlineUpdatePathOutline.setAlpha(getAlpha());
                    this.impl.setOutline(outlineUpdatePathOutline);
                } else {
                    Outline outlineObtainAndroidOutline = obtainAndroidOutline();
                    long jM6415toSizeozmzZPI = IntSizeKt.m6415toSizeozmzZPI(this.size);
                    long j2 = this.roundRectOutlineTopLeft;
                    long j3 = this.roundRectOutlineSize;
                    if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
                        jM6415toSizeozmzZPI = j3;
                    }
                    outlineObtainAndroidOutline.setRoundRect(Math.round(Offset.m3551getXimpl(j2)), Math.round(Offset.m3552getYimpl(j2)), Math.round(Size.m3620getWidthimpl(jM6415toSizeozmzZPI) + Offset.m3551getXimpl(j2)), Math.round(Size.m3617getHeightimpl(jM6415toSizeozmzZPI) + Offset.m3552getYimpl(j2)), this.roundRectCornerRadius);
                    outlineObtainAndroidOutline.setAlpha(getAlpha());
                    this.impl.setOutline(outlineObtainAndroidOutline);
                }
            } else {
                this.impl.setOutline(null);
            }
        }
        this.outlineDirty = false;
    }

    private final void discardContentIfReleasedAndHaveNoParentLayerUsages() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            LayerManager layerManager = this.layerManager;
            if (layerManager != null) {
                layerManager.release(this);
            } else {
                discardDisplayList$ui_graphics_release();
            }
        }
    }

    public static /* synthetic */ void getClip$annotations() {
    }

    private final Outline obtainAndroidOutline() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final void onAddedToParentLayer() {
        this.parentLayerUsages++;
    }

    private final void onRemovedFromParentLayer() {
        this.parentLayerUsages--;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void recordInternal() {
        /*
            r17 = this;
            r0 = r17
            r1 = 1
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r2 = r0.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r3 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r2)
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependency$p(r2, r3)
            j.S r3 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r2)
            if (r3 == 0) goto L2e
            boolean r4 = r3.c()
            if (r4 == 0) goto L2e
            j.S r4 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r2)
            if (r4 != 0) goto L28
            int r4 = j.g0.f831a
            j.S r4 = new j.S
            r4.<init>()
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setOldDependenciesSet$p(r2, r4)
        L28:
            r4.e(r3)
            r3.f()
        L2e:
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r2, r1)
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r3 = r0.impl
            androidx.compose.ui.unit.Density r4 = r0.density
            androidx.compose.ui.unit.LayoutDirection r5 = r0.layoutDirection
            kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.drawscope.DrawScope, kotlin.Unit> r6 = r0.drawBlock
            r3.record(r4, r5, r0, r6)
            r3 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setTrackingInProgress$p(r2, r3)
            androidx.compose.ui.graphics.layer.GraphicsLayer r4 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependency$p(r2)
            if (r4 == 0) goto L49
            r4.onRemovedFromParentLayer()
        L49:
            j.S r2 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getOldDependenciesSet$p(r2)
            if (r2 == 0) goto L9a
            boolean r4 = r2.c()
            if (r4 == 0) goto L9a
            java.lang.Object[] r4 = r2.f825b
            long[] r5 = r2.f824a
            int r6 = r5.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L97
            r7 = r3
        L5f:
            r8 = r5[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L93
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L79:
            if (r12 >= r10) goto L91
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8e
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r4[r13]
            androidx.compose.ui.graphics.layer.GraphicsLayer r13 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r13
            r13.onRemovedFromParentLayer()
        L8e:
            long r8 = r8 >> r11
            int r12 = r12 + r1
            goto L79
        L91:
            if (r10 != r11) goto L97
        L93:
            if (r7 == r6) goto L97
            int r7 = r7 + r1
            goto L5f
        L97:
            r2.f()
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.recordInternal():void");
    }

    private final void recreateDisplayListIfNeeded() {
        if (this.impl.getHasDisplayList()) {
            return;
        }
        try {
            recordInternal();
        } catch (Throwable unused) {
        }
    }

    private final void resetOutlineParams() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = Size.INSTANCE.m3628getUnspecifiedNHjbRc();
        this.roundRectOutlineTopLeft = Offset.INSTANCE.m3567getZeroF1C5BW0();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final <T> T resolveOutlinePosition(Function2<? super Offset, ? super Size, ? extends T> block) {
        long jM6415toSizeozmzZPI = IntSizeKt.m6415toSizeozmzZPI(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM6415toSizeozmzZPI = j3;
        }
        return block.invoke(Offset.m3540boximpl(j2), Size.m3608boximpl(jM6415toSizeozmzZPI));
    }

    /* renamed from: setPosition-VbeCjmY, reason: not valid java name */
    private final void m4425setPositionVbeCjmY(long topLeft, long size) {
        this.impl.mo4454setPositionH0pRuoY(IntOffset.m6361getXimpl(topLeft), IntOffset.m6362getYimpl(topLeft), size);
    }

    /* renamed from: setRectOutline-tz77jQw$default, reason: not valid java name */
    public static /* synthetic */ void m4426setRectOutlinetz77jQw$default(GraphicsLayer graphicsLayer, long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Offset.INSTANCE.m3567getZeroF1C5BW0();
        }
        if ((i2 & 2) != 0) {
            j3 = Size.INSTANCE.m3628getUnspecifiedNHjbRc();
        }
        graphicsLayer.m4441setRectOutlinetz77jQw(j2, j3);
    }

    /* renamed from: setRoundRectOutline-TNW_H78$default, reason: not valid java name */
    public static /* synthetic */ void m4427setRoundRectOutlineTNW_H78$default(GraphicsLayer graphicsLayer, long j2, long j3, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = Offset.INSTANCE.m3567getZeroF1C5BW0();
        }
        long j4 = j2;
        if ((i2 & 2) != 0) {
            j3 = Size.INSTANCE.m3628getUnspecifiedNHjbRc();
        }
        long j5 = j3;
        if ((i2 & 4) != 0) {
            f2 = 0.0f;
        }
        graphicsLayer.m4442setRoundRectOutlineTNW_H78(j4, j5, f2);
    }

    /* renamed from: setSize-ozmzZPI, reason: not valid java name */
    private final void m4428setSizeozmzZPI(long j2) {
        if (IntSize.m6401equalsimpl0(this.size, j2)) {
            return;
        }
        this.size = j2;
        m4425setPositionVbeCjmY(this.topLeft, j2);
        if (this.roundRectOutlineSize == InlineClassHelperKt.UnspecifiedPackedFloats) {
            this.outlineDirty = true;
            configureOutline();
        }
    }

    private final void transformCanvas(Canvas androidCanvas) {
        Canvas canvas;
        float fM6361getXimpl = IntOffset.m6361getXimpl(this.topLeft);
        float fM6362getYimpl = IntOffset.m6362getYimpl(this.topLeft);
        float fM6361getXimpl2 = IntOffset.m6361getXimpl(this.topLeft) + IntSize.m6403getWidthimpl(this.size);
        float fM6362getYimpl2 = IntOffset.m6362getYimpl(this.topLeft) + IntSize.m6402getHeightimpl(this.size);
        float alpha = getAlpha();
        ColorFilter colorFilter = getColorFilter();
        int iM4430getBlendMode0nO6VwU = m4430getBlendMode0nO6VwU();
        if (alpha < 1.0f || !BlendMode.m3703equalsimpl0(iM4430getBlendMode0nO6VwU, BlendMode.INSTANCE.m3734getSrcOver0nO6VwU()) || colorFilter != null || CompositingStrategy.m4418equalsimpl0(m4431getCompositingStrategyke2Ky5w(), CompositingStrategy.INSTANCE.m4424getOffscreenke2Ky5w())) {
            Paint Paint = this.softwareLayerPaint;
            if (Paint == null) {
                Paint = AndroidPaint_androidKt.Paint();
                this.softwareLayerPaint = Paint;
            }
            Paint.setAlpha(alpha);
            Paint.mo3670setBlendModes9anfk8(iM4430getBlendMode0nO6VwU);
            Paint.setColorFilter(colorFilter);
            canvas = androidCanvas;
            canvas.saveLayer(fM6361getXimpl, fM6362getYimpl, fM6361getXimpl2, fM6362getYimpl2, Paint.getInternalPaint());
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fM6361getXimpl, fM6362getYimpl);
        canvas.concat(this.impl.calculateMatrix());
    }

    private final Outline updatePathOutline(Path path) {
        Outline outlineObtainAndroidOutline = obtainAndroidOutline();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 28 || path.isConvex()) {
            if (i2 > 30) {
                OutlineVerificationHelper.INSTANCE.setPath(outlineObtainAndroidOutline, path);
            } else {
                if (!(path instanceof AndroidPath)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineObtainAndroidOutline.setConvexPath(((AndroidPath) path).getInternalPath());
            }
            this.usePathForClip = !outlineObtainAndroidOutline.canClip();
        } else {
            Outline outline = this.androidOutline;
            if (outline != null) {
                outline.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.setInvalidated(true);
        }
        this.outlinePath = path;
        return outlineObtainAndroidOutline;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void discardDisplayList$ui_graphics_release() {
        /*
            r15 = this;
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker r0 = r15.childDependenciesTracker
            androidx.compose.ui.graphics.layer.GraphicsLayer r1 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependency$p(r0)
            if (r1 == 0) goto Lf
            r1.onRemovedFromParentLayer()
            r1 = 0
            androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$setDependency$p(r0, r1)
        Lf:
            j.S r0 = androidx.compose.ui.graphics.layer.ChildLayerDependenciesTracker.access$getDependenciesSet$p(r0)
            if (r0 == 0) goto L5d
            java.lang.Object[] r1 = r0.f825b
            long[] r2 = r0.f824a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L5a
            r4 = 0
            r5 = r4
        L20:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L55
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L3a:
            if (r10 >= r8) goto L53
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L4f
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            androidx.compose.ui.graphics.layer.GraphicsLayer r11 = (androidx.compose.ui.graphics.layer.GraphicsLayer) r11
            r11.onRemovedFromParentLayer()
        L4f:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L3a
        L53:
            if (r8 != r9) goto L5a
        L55:
            if (r5 == r3) goto L5a
            int r5 = r5 + 1
            goto L20
        L5a:
            r0.f()
        L5d:
            androidx.compose.ui.graphics.layer.GraphicsLayerImpl r0 = r15.impl
            r0.discardDisplayList()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.discardDisplayList$ui_graphics_release():void");
    }

    public final void draw$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas, GraphicsLayer parentLayer) {
        if (this.isReleased) {
            return;
        }
        recreateDisplayListIfNeeded();
        configureOutline();
        boolean z = true;
        boolean z2 = getShadowElevation() > 0.0f;
        if (z2) {
            canvas.enableZ();
        }
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        boolean zIsHardwareAccelerated = nativeCanvas.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            nativeCanvas.save();
            transformCanvas(nativeCanvas);
        }
        if (!this.usePathForClip && (zIsHardwareAccelerated || !getClip())) {
            z = false;
        }
        if (z) {
            canvas.save();
            androidx.compose.ui.graphics.Outline outline = getOutline();
            if (outline instanceof Outline.Rectangle) {
                androidx.compose.ui.graphics.Canvas.m3765clipRectmtrdDE$default(canvas, outline.getRect(), 0, 2, null);
            } else if (outline instanceof Outline.Rounded) {
                Path Path = this.roundRectClipPath;
                if (Path != null) {
                    Path.rewind();
                } else {
                    Path = AndroidPath_androidKt.Path();
                    this.roundRectClipPath = Path;
                }
                Path.addRoundRect$default(Path, ((Outline.Rounded) outline).getRoundRect(), null, 2, null);
                androidx.compose.ui.graphics.Canvas.m3763clipPathmtrdDE$default(canvas, Path, 0, 2, null);
            } else if (outline instanceof Outline.Generic) {
                androidx.compose.ui.graphics.Canvas.m3763clipPathmtrdDE$default(canvas, ((Outline.Generic) outline).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.addSubLayer(this);
        }
        this.impl.draw(canvas);
        if (z) {
            canvas.restore();
        }
        if (z2) {
            canvas.disableZ();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        nativeCanvas.restore();
    }

    public final void drawForPersistence$ui_graphics_release(androidx.compose.ui.graphics.Canvas canvas) {
        if (AndroidCanvas_androidKt.getNativeCanvas(canvas).isHardwareAccelerated()) {
            recreateDisplayListIfNeeded();
            this.impl.draw(canvas);
        }
    }

    public final void emulateTrimMemory$ui_graphics_release() {
        this.impl.discardDisplayList();
    }

    public final float getAlpha() {
        return this.impl.getAlpha();
    }

    /* renamed from: getAmbientShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4429getAmbientShadowColor0d7_KjU() {
        return this.impl.getAmbientShadowColor();
    }

    /* renamed from: getBlendMode-0nO6VwU, reason: not valid java name */
    public final int m4430getBlendMode0nO6VwU() {
        return this.impl.getBlendMode();
    }

    public final float getCameraDistance() {
        return this.impl.getCameraDistance();
    }

    public final boolean getClip() {
        return this.impl.getClip();
    }

    public final ColorFilter getColorFilter() {
        return this.impl.getColorFilter();
    }

    /* renamed from: getCompositingStrategy-ke2Ky5w, reason: not valid java name */
    public final int m4431getCompositingStrategyke2Ky5w() {
        return this.impl.getCompositingStrategy();
    }

    /* renamed from: getImpl$ui_graphics_release, reason: from getter */
    public final GraphicsLayerImpl getImpl() {
        return this.impl;
    }

    public final long getLayerId() {
        return this.impl.getLayerId();
    }

    public final androidx.compose.ui.graphics.Outline getOutline() {
        androidx.compose.ui.graphics.Outline outline = this.internalOutline;
        Path path = this.outlinePath;
        if (outline != null) {
            return outline;
        }
        if (path != null) {
            Outline.Generic generic = new Outline.Generic(path);
            this.internalOutline = generic;
            return generic;
        }
        long jM6415toSizeozmzZPI = IntSizeKt.m6415toSizeozmzZPI(this.size);
        long j2 = this.roundRectOutlineTopLeft;
        long j3 = this.roundRectOutlineSize;
        if (j3 != InlineClassHelperKt.UnspecifiedPackedFloats) {
            jM6415toSizeozmzZPI = j3;
        }
        float fM3551getXimpl = Offset.m3551getXimpl(j2);
        float fM3552getYimpl = Offset.m3552getYimpl(j2);
        float fM3620getWidthimpl = Size.m3620getWidthimpl(jM6415toSizeozmzZPI) + fM3551getXimpl;
        float fM3617getHeightimpl = Size.m3617getHeightimpl(jM6415toSizeozmzZPI) + fM3552getYimpl;
        float f2 = this.roundRectCornerRadius;
        androidx.compose.ui.graphics.Outline rounded = f2 > 0.0f ? new Outline.Rounded(RoundRectKt.m3605RoundRectgG7oq9Y(fM3551getXimpl, fM3552getYimpl, fM3620getWidthimpl, fM3617getHeightimpl, CornerRadiusKt.CornerRadius$default(f2, 0.0f, 2, null))) : new Outline.Rectangle(new Rect(fM3551getXimpl, fM3552getYimpl, fM3620getWidthimpl, fM3617getHeightimpl));
        this.internalOutline = rounded;
        return rounded;
    }

    public final long getOwnerViewId() {
        return this.impl.getOwnerId();
    }

    /* renamed from: getPivotOffset-F1C5BW0, reason: not valid java name and from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final RenderEffect getRenderEffect() {
        return this.impl.getRenderEffect();
    }

    public final float getRotationX() {
        return this.impl.getRotationX();
    }

    public final float getRotationY() {
        return this.impl.getRotationY();
    }

    public final float getRotationZ() {
        return this.impl.getRotationZ();
    }

    public final float getScaleX() {
        return this.impl.getScaleX();
    }

    public final float getScaleY() {
        return this.impl.getScaleY();
    }

    public final float getShadowElevation() {
        return this.impl.getShadowElevation();
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: getSpotShadowColor-0d7_KjU, reason: not valid java name */
    public final long m4434getSpotShadowColor0d7_KjU() {
        return this.impl.getSpotShadowColor();
    }

    /* renamed from: getTopLeft-nOcc-ac, reason: not valid java name and from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float getTranslationX() {
        return this.impl.getTranslationX();
    }

    public final float getTranslationY() {
        return this.impl.getTranslationY();
    }

    /* renamed from: isReleased, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    /* renamed from: record-mL-hObY, reason: not valid java name */
    public final void m4436recordmLhObY(Density density, LayoutDirection layoutDirection, long size, Function1<? super DrawScope, Unit> block) {
        m4428setSizeozmzZPI(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.setInvalidated(true);
        recordInternal();
    }

    public final void release$ui_graphics_release() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        discardContentIfReleasedAndHaveNoParentLayerUsages();
    }

    public final void setAlpha(float f2) {
        if (this.impl.getAlpha() == f2) {
            return;
        }
        this.impl.setAlpha(f2);
    }

    /* renamed from: setAmbientShadowColor-8_81llA, reason: not valid java name */
    public final void m4437setAmbientShadowColor8_81llA(long j2) {
        if (Color.m3793equalsimpl0(j2, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.mo4450setAmbientShadowColor8_81llA(j2);
    }

    /* renamed from: setBlendMode-s9anfk8, reason: not valid java name */
    public final void m4438setBlendModes9anfk8(int i2) {
        if (BlendMode.m3703equalsimpl0(this.impl.getBlendMode(), i2)) {
            return;
        }
        this.impl.mo4451setBlendModes9anfk8(i2);
    }

    public final void setCameraDistance(float f2) {
        if (this.impl.getCameraDistance() == f2) {
            return;
        }
        this.impl.setCameraDistance(f2);
    }

    public final void setClip(boolean z) {
        if (this.impl.getClip() != z) {
            this.impl.setClip(z);
            this.outlineDirty = true;
            configureOutline();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        if (Intrinsics.areEqual(this.impl.getColorFilter(), colorFilter)) {
            return;
        }
        this.impl.setColorFilter(colorFilter);
    }

    /* renamed from: setCompositingStrategy-Wpw9cng, reason: not valid java name */
    public final void m4439setCompositingStrategyWpw9cng(int i2) {
        if (CompositingStrategy.m4418equalsimpl0(this.impl.getCompositingStrategy(), i2)) {
            return;
        }
        this.impl.mo4452setCompositingStrategyWpw9cng(i2);
    }

    public final void setPathOutline(Path path) {
        resetOutlineParams();
        this.outlinePath = path;
        configureOutline();
    }

    /* renamed from: setPivotOffset-k-4lQ0M, reason: not valid java name */
    public final void m4440setPivotOffsetk4lQ0M(long j2) {
        if (Offset.m3548equalsimpl0(this.pivotOffset, j2)) {
            return;
        }
        this.pivotOffset = j2;
        this.impl.mo4453setPivotOffsetk4lQ0M(j2);
    }

    /* renamed from: setRectOutline-tz77jQw, reason: not valid java name */
    public final void m4441setRectOutlinetz77jQw(long topLeft, long size) {
        m4442setRoundRectOutlineTNW_H78(topLeft, size, 0.0f);
    }

    public final void setRenderEffect(RenderEffect renderEffect) {
        if (Intrinsics.areEqual(this.impl.getRenderEffect(), renderEffect)) {
            return;
        }
        this.impl.setRenderEffect(renderEffect);
    }

    public final void setRotationX(float f2) {
        if (this.impl.getRotationX() == f2) {
            return;
        }
        this.impl.setRotationX(f2);
    }

    public final void setRotationY(float f2) {
        if (this.impl.getRotationY() == f2) {
            return;
        }
        this.impl.setRotationY(f2);
    }

    public final void setRotationZ(float f2) {
        if (this.impl.getRotationZ() == f2) {
            return;
        }
        this.impl.setRotationZ(f2);
    }

    /* renamed from: setRoundRectOutline-TNW_H78, reason: not valid java name */
    public final void m4442setRoundRectOutlineTNW_H78(long topLeft, long size, float cornerRadius) {
        if (Offset.m3548equalsimpl0(this.roundRectOutlineTopLeft, topLeft) && Size.m3616equalsimpl0(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        resetOutlineParams();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        configureOutline();
    }

    public final void setScaleX(float f2) {
        if (this.impl.getScaleX() == f2) {
            return;
        }
        this.impl.setScaleX(f2);
    }

    public final void setScaleY(float f2) {
        if (this.impl.getScaleY() == f2) {
            return;
        }
        this.impl.setScaleY(f2);
    }

    public final void setShadowElevation(float f2) {
        if (this.impl.getShadowElevation() == f2) {
            return;
        }
        this.impl.setShadowElevation(f2);
        this.impl.setClip(getClip() || f2 > 0.0f);
        this.outlineDirty = true;
        configureOutline();
    }

    /* renamed from: setSpotShadowColor-8_81llA, reason: not valid java name */
    public final void m4443setSpotShadowColor8_81llA(long j2) {
        if (Color.m3793equalsimpl0(j2, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.mo4455setSpotShadowColor8_81llA(j2);
    }

    /* renamed from: setTopLeft--gyyYBs, reason: not valid java name */
    public final void m4444setTopLeftgyyYBs(long j2) {
        if (IntOffset.m6360equalsimpl0(this.topLeft, j2)) {
            return;
        }
        this.topLeft = j2;
        m4425setPositionVbeCjmY(j2, this.size);
    }

    public final void setTranslationX(float f2) {
        if (this.impl.getTranslationX() == f2) {
            return;
        }
        this.impl.setTranslationX(f2);
    }

    public final void setTranslationY(float f2) {
        if (this.impl.getTranslationY() == f2) {
            return;
        }
        this.impl.setTranslationY(f2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object toImageBitmap(kotlin.coroutines.Continuation<? super androidx.compose.ui.graphics.ImageBitmap> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = (androidx.compose.ui.graphics.layer.GraphicsLayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1 r0 = new androidx.compose.ui.graphics.layer.GraphicsLayer$toImageBitmap$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.ResultKt.throwOnFailure(r5)
            androidx.compose.ui.graphics.layer.LayerSnapshotImpl r5 = androidx.compose.ui.graphics.layer.GraphicsLayer.SnapshotImpl
            r0.label = r3
            java.lang.Object r5 = r5.toBitmap(r4, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            androidx.compose.ui.graphics.ImageBitmap r5 = androidx.compose.ui.graphics.AndroidImageBitmap_androidKt.asImageBitmap(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.layer.GraphicsLayer.toImageBitmap(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
