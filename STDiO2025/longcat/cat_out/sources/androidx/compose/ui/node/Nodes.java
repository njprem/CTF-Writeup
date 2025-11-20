package androidx.compose.ui.node;

import androidx.compose.ui.graphics.Fields;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R'\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0006\u0010\u0002\u001a\u0004\b\u0007\u0010\bR'\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\bR'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\bR'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0013\u0010\u0002\u001a\u0004\b\u0014\u0010\bR'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\bR'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\bR'\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\bR'\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b#\u0010\u0002\u001a\u0004\b$\u0010\bR'\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b'\u0010\u0002\u001a\u0004\b(\u0010\bR'\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b+\u0010\u0002\u001a\u0004\b,\u0010\bR'\u0010-\u001a\b\u0012\u0004\u0012\u00020.0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b/\u0010\u0002\u001a\u0004\b0\u0010\bR'\u00101\u001a\b\u0012\u0004\u0012\u0002020\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b3\u0010\u0002\u001a\u0004\b4\u0010\bR'\u00105\u001a\b\u0012\u0004\u0012\u0002060\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b7\u0010\u0002\u001a\u0004\b8\u0010\bR'\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b;\u0010\u0002\u001a\u0004\b<\u0010\bR'\u0010=\u001a\b\u0012\u0004\u0012\u00020>0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b?\u0010\u0002\u001a\u0004\b@\u0010\bR'\u0010A\u001a\b\u0012\u0004\u0012\u00020B0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bC\u0010\u0002\u001a\u0004\bD\u0010\bR'\u0010E\u001a\b\u0012\u0004\u0012\u00020F0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bG\u0010\u0002\u001a\u0004\bH\u0010\bR'\u0010I\u001a\b\u0012\u0004\u0012\u00020J0\u00048Æ\u0002X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\bK\u0010\u0002\u001a\u0004\bL\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006M"}, d2 = {"Landroidx/compose/ui/node/Nodes;", "", "()V", "Any", "Landroidx/compose/ui/node/NodeKind;", "Landroidx/compose/ui/Modifier$Node;", "getAny-OLwlOKw$annotations", "getAny-OLwlOKw", "()I", "ApproachMeasure", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "getApproachMeasure-OLwlOKw$annotations", "getApproachMeasure-OLwlOKw", "CompositionLocalConsumer", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "getCompositionLocalConsumer-OLwlOKw$annotations", "getCompositionLocalConsumer-OLwlOKw", "Draw", "Landroidx/compose/ui/node/DrawModifierNode;", "getDraw-OLwlOKw$annotations", "getDraw-OLwlOKw", "FocusEvent", "Landroidx/compose/ui/focus/FocusEventModifierNode;", "getFocusEvent-OLwlOKw$annotations", "getFocusEvent-OLwlOKw", "FocusProperties", "Landroidx/compose/ui/focus/FocusPropertiesModifierNode;", "getFocusProperties-OLwlOKw$annotations", "getFocusProperties-OLwlOKw", "FocusTarget", "Landroidx/compose/ui/focus/FocusTargetNode;", "getFocusTarget-OLwlOKw$annotations", "getFocusTarget-OLwlOKw", "GlobalPositionAware", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "getGlobalPositionAware-OLwlOKw$annotations", "getGlobalPositionAware-OLwlOKw", "KeyInput", "Landroidx/compose/ui/input/key/KeyInputModifierNode;", "getKeyInput-OLwlOKw$annotations", "getKeyInput-OLwlOKw", "Layout", "Landroidx/compose/ui/node/LayoutModifierNode;", "getLayout-OLwlOKw$annotations", "getLayout-OLwlOKw", "LayoutAware", "Landroidx/compose/ui/node/LayoutAwareModifierNode;", "getLayoutAware-OLwlOKw$annotations", "getLayoutAware-OLwlOKw", "Locals", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "getLocals-OLwlOKw$annotations", "getLocals-OLwlOKw", "ParentData", "Landroidx/compose/ui/node/ParentDataModifierNode;", "getParentData-OLwlOKw$annotations", "getParentData-OLwlOKw", "PointerInput", "Landroidx/compose/ui/node/PointerInputModifierNode;", "getPointerInput-OLwlOKw$annotations", "getPointerInput-OLwlOKw", "RotaryInput", "Landroidx/compose/ui/input/rotary/RotaryInputModifierNode;", "getRotaryInput-OLwlOKw$annotations", "getRotaryInput-OLwlOKw", "Semantics", "Landroidx/compose/ui/node/SemanticsModifierNode;", "getSemantics-OLwlOKw$annotations", "getSemantics-OLwlOKw", "SoftKeyboardKeyInput", "Landroidx/compose/ui/input/key/SoftKeyboardInterceptionModifierNode;", "getSoftKeyboardKeyInput-OLwlOKw$annotations", "getSoftKeyboardKeyInput-OLwlOKw", "Traversable", "Landroidx/compose/ui/node/TraversableNode;", "getTraversable-OLwlOKw$annotations", "getTraversable-OLwlOKw", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Nodes {
    public static final int $stable = 0;
    public static final Nodes INSTANCE = new Nodes();

    private Nodes() {
    }

    /* renamed from: getAny-OLwlOKw, reason: not valid java name */
    public static final int m5366getAnyOLwlOKw() {
        return NodeKind.m5355constructorimpl(1);
    }

    @JvmStatic
    /* renamed from: getAny-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5367getAnyOLwlOKw$annotations() {
    }

    /* renamed from: getApproachMeasure-OLwlOKw, reason: not valid java name */
    public static final int m5368getApproachMeasureOLwlOKw() {
        return NodeKind.m5355constructorimpl(512);
    }

    @JvmStatic
    /* renamed from: getApproachMeasure-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5369getApproachMeasureOLwlOKw$annotations() {
    }

    /* renamed from: getCompositionLocalConsumer-OLwlOKw, reason: not valid java name */
    public static final int m5370getCompositionLocalConsumerOLwlOKw() {
        return NodeKind.m5355constructorimpl(Fields.CompositingStrategy);
    }

    @JvmStatic
    /* renamed from: getCompositionLocalConsumer-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5371getCompositionLocalConsumerOLwlOKw$annotations() {
    }

    /* renamed from: getDraw-OLwlOKw, reason: not valid java name */
    public static final int m5372getDrawOLwlOKw() {
        return NodeKind.m5355constructorimpl(4);
    }

    @JvmStatic
    /* renamed from: getDraw-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5373getDrawOLwlOKw$annotations() {
    }

    /* renamed from: getFocusEvent-OLwlOKw, reason: not valid java name */
    public static final int m5374getFocusEventOLwlOKw() {
        return NodeKind.m5355constructorimpl(4096);
    }

    @JvmStatic
    /* renamed from: getFocusEvent-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5375getFocusEventOLwlOKw$annotations() {
    }

    /* renamed from: getFocusProperties-OLwlOKw, reason: not valid java name */
    public static final int m5376getFocusPropertiesOLwlOKw() {
        return NodeKind.m5355constructorimpl(Fields.CameraDistance);
    }

    @JvmStatic
    /* renamed from: getFocusProperties-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5377getFocusPropertiesOLwlOKw$annotations() {
    }

    /* renamed from: getFocusTarget-OLwlOKw, reason: not valid java name */
    public static final int m5378getFocusTargetOLwlOKw() {
        return NodeKind.m5355constructorimpl(1024);
    }

    @JvmStatic
    /* renamed from: getFocusTarget-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5379getFocusTargetOLwlOKw$annotations() {
    }

    /* renamed from: getGlobalPositionAware-OLwlOKw, reason: not valid java name */
    public static final int m5380getGlobalPositionAwareOLwlOKw() {
        return NodeKind.m5355constructorimpl(Fields.RotationX);
    }

    @JvmStatic
    /* renamed from: getGlobalPositionAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5381getGlobalPositionAwareOLwlOKw$annotations() {
    }

    /* renamed from: getKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5382getKeyInputOLwlOKw() {
        return NodeKind.m5355constructorimpl(8192);
    }

    @JvmStatic
    /* renamed from: getKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5383getKeyInputOLwlOKw$annotations() {
    }

    /* renamed from: getLayout-OLwlOKw, reason: not valid java name */
    public static final int m5384getLayoutOLwlOKw() {
        return NodeKind.m5355constructorimpl(2);
    }

    @JvmStatic
    /* renamed from: getLayout-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5385getLayoutOLwlOKw$annotations() {
    }

    /* renamed from: getLayoutAware-OLwlOKw, reason: not valid java name */
    public static final int m5386getLayoutAwareOLwlOKw() {
        return NodeKind.m5355constructorimpl(128);
    }

    @JvmStatic
    /* renamed from: getLayoutAware-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5387getLayoutAwareOLwlOKw$annotations() {
    }

    /* renamed from: getLocals-OLwlOKw, reason: not valid java name */
    public static final int m5388getLocalsOLwlOKw() {
        return NodeKind.m5355constructorimpl(32);
    }

    @JvmStatic
    /* renamed from: getLocals-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5389getLocalsOLwlOKw$annotations() {
    }

    /* renamed from: getParentData-OLwlOKw, reason: not valid java name */
    public static final int m5390getParentDataOLwlOKw() {
        return NodeKind.m5355constructorimpl(64);
    }

    @JvmStatic
    /* renamed from: getParentData-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5391getParentDataOLwlOKw$annotations() {
    }

    /* renamed from: getPointerInput-OLwlOKw, reason: not valid java name */
    public static final int m5392getPointerInputOLwlOKw() {
        return NodeKind.m5355constructorimpl(16);
    }

    @JvmStatic
    /* renamed from: getPointerInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5393getPointerInputOLwlOKw$annotations() {
    }

    /* renamed from: getRotaryInput-OLwlOKw, reason: not valid java name */
    public static final int m5394getRotaryInputOLwlOKw() {
        return NodeKind.m5355constructorimpl(Fields.Clip);
    }

    @JvmStatic
    /* renamed from: getRotaryInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5395getRotaryInputOLwlOKw$annotations() {
    }

    /* renamed from: getSemantics-OLwlOKw, reason: not valid java name */
    public static final int m5396getSemanticsOLwlOKw() {
        return NodeKind.m5355constructorimpl(8);
    }

    @JvmStatic
    /* renamed from: getSemantics-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5397getSemanticsOLwlOKw$annotations() {
    }

    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw, reason: not valid java name */
    public static final int m5398getSoftKeyboardKeyInputOLwlOKw() {
        return NodeKind.m5355constructorimpl(Fields.RenderEffect);
    }

    @JvmStatic
    /* renamed from: getSoftKeyboardKeyInput-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5399getSoftKeyboardKeyInputOLwlOKw$annotations() {
    }

    /* renamed from: getTraversable-OLwlOKw, reason: not valid java name */
    public static final int m5400getTraversableOLwlOKw() {
        return NodeKind.m5355constructorimpl(262144);
    }

    @JvmStatic
    /* renamed from: getTraversable-OLwlOKw$annotations, reason: not valid java name */
    public static /* synthetic */ void m5401getTraversableOLwlOKw$annotations() {
    }
}
