package androidx.compose.ui.viewinterop;

import K.h;
import a.AbstractC0130a;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.C0555m;
import androidx.core.view.InterfaceC0554l;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0587u;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 ½\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002½\u0001B9\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0014¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010\u001bJ7\u0010)\u001a\u00020\u00192\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\tH\u0014¢\u0006\u0004\b)\u0010*J\u0011\u0010,\u001a\u0004\u0018\u00010+H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00192\u0006\u0010.\u001a\u00020#H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0019H\u0014¢\u0006\u0004\b1\u0010\u001bJ\u000f\u00102\u001a\u00020\u0019H\u0014¢\u0006\u0004\b2\u0010\u001bJ%\u00108\u001a\u0004\u0018\u0001072\b\u00104\u001a\u0004\u0018\u0001032\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010<\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\rH\u0016¢\u0006\u0004\b<\u0010=J\r\u0010>\u001a\u00020\u0019¢\u0006\u0004\b>\u0010\u001bJ\u0017\u0010@\u001a\u00020\u00192\u0006\u0010?\u001a\u00020\tH\u0014¢\u0006\u0004\b@\u0010AJ\u0019\u0010D\u001a\u00020#2\b\u0010C\u001a\u0004\u0018\u00010BH\u0016¢\u0006\u0004\bD\u0010EJ\u000f\u0010F\u001a\u00020#H\u0016¢\u0006\u0004\bF\u0010GJ/\u0010J\u001a\u00020#2\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\tH\u0016¢\u0006\u0004\bL\u0010MJ/\u0010N\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\r2\u0006\u0010;\u001a\u00020\r2\u0006\u0010H\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bN\u0010OJ\u001f\u0010P\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\r2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bP\u0010QJG\u0010W\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\r2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010I\u001a\u00020\t2\u0006\u0010V\u001a\u000203H\u0016¢\u0006\u0004\bW\u0010XJ?\u0010W\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\r2\u0006\u0010R\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\bW\u0010YJ7\u0010\\\u001a\u00020\u00192\u0006\u0010;\u001a\u00020\r2\u0006\u0010Z\u001a\u00020\t2\u0006\u0010[\u001a\u00020\t2\u0006\u0010V\u001a\u0002032\u0006\u0010I\u001a\u00020\tH\u0016¢\u0006\u0004\b\\\u0010]J/\u0010a\u001a\u00020#2\u0006\u0010;\u001a\u00020\r2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^2\u0006\u0010V\u001a\u00020#H\u0016¢\u0006\u0004\ba\u0010bJ'\u0010c\u001a\u00020#2\u0006\u0010;\u001a\u00020\r2\u0006\u0010_\u001a\u00020^2\u0006\u0010`\u001a\u00020^H\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020#H\u0016¢\u0006\u0004\be\u0010GJ'\u0010i\u001a\u00020\t2\u0006\u0010f\u001a\u00020\t2\u0006\u0010g\u001a\u00020\t2\u0006\u0010h\u001a\u00020\tH\u0002¢\u0006\u0004\bi\u0010jR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010kR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010lR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010m\u001a\u0004\bn\u0010\u0015R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010oR6\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00190p2\f\u0010q\u001a\b\u0012\u0004\u0012\u00020\u00190p8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010yR6\u0010{\u001a\b\u0012\u0004\u0012\u00020\u00190p2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00190p8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010s\u001a\u0004\b|\u0010u\"\u0004\b}\u0010wR7\u0010~\u001a\b\u0012\u0004\u0012\u00020\u00190p2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u00190p8\u0006@DX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010s\u001a\u0004\b\u007f\u0010u\"\u0005\b\u0080\u0001\u0010wR3\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0007\u0010q\u001a\u00030\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R9\u0010\u0089\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R3\u0010\u0090\u0001\u001a\u00030\u008f\u00012\u0007\u0010q\u001a\u00030\u008f\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R9\u0010\u0096\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u008f\u0001\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u008a\u0001\u001a\u0006\b\u0097\u0001\u0010\u008c\u0001\"\u0006\b\u0098\u0001\u0010\u008e\u0001R7\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0099\u00012\t\u0010q\u001a\u0005\u0018\u00010\u0099\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R7\u0010¡\u0001\u001a\u0005\u0018\u00010 \u00012\t\u0010q\u001a\u0005\u0018\u00010 \u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R\u001c\u0010§\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190p8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b§\u0001\u0010sR\u001c\u0010¨\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190p8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b¨\u0001\u0010sR8\u0010©\u0001\u001a\u0011\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0088\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b©\u0001\u0010\u008a\u0001\u001a\u0006\bª\u0001\u0010\u008c\u0001\"\u0006\b«\u0001\u0010\u008e\u0001R\u0015\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b4\u0010¬\u0001R\u0018\u0010\u00ad\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u00ad\u0001\u0010kR\u0018\u0010®\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b®\u0001\u0010kR\u0018\u0010°\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R\u0018\u0010²\u0001\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b²\u0001\u0010yR\u001d\u0010´\u0001\u001a\u00030³\u00018\u0006¢\u0006\u0010\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u0016\u0010¸\u0001\u001a\u00020#8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010GR\u0018\u0010¼\u0001\u001a\u00030¹\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001¨\u0006¾\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Landroidx/core/view/l;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/OwnerScope;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/CompositionContext;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "onReuse", "()V", "onDeactivate", "onRelease", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "remeasure", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "invalidateOrDefer", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "min", "max", "preferred", "obtainMeasureSpec", "(III)I", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroid/view/View;", "getView", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "value", "update", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "hasUpdateBlock", "Z", "<set-?>", "reset", "getReset", "setReset", "release", "getRelease", "setRelease", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "setModifier", "(Landroidx/compose/ui/Modifier;)V", "Lkotlin/Function1;", "onModifierChanged", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/unit/Density;", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "onDensityChanged", "getOnDensityChanged$ui_release", "setOnDensityChanged$ui_release", "Landroidx/lifecycle/u;", "lifecycleOwner", "Landroidx/lifecycle/u;", "getLifecycleOwner", "()Landroidx/lifecycle/u;", "setLifecycleOwner", "(Landroidx/lifecycle/u;)V", "LK/h;", "savedStateRegistryOwner", "LK/h;", "getSavedStateRegistryOwner", "()LK/h;", "setSavedStateRegistryOwner", "(LK/h;)V", "runUpdate", "runInvalidate", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui_release", "setOnRequestDisallowInterceptTouchEvent$ui_release", "[I", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Landroidx/core/view/m;", "nestedScrollingParentHelper", "Landroidx/core/view/m;", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "Companion", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements InterfaceC0554l, ComposeNodeLifecycleCallback, OwnerScope {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private InterfaceC0587u lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final C0555m nestedScrollingParentHelper;
    private Function1<? super Density, Unit> onDensityChanged;
    private Function1<? super Modifier, Unit> onModifierChanged;
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private Function0<Unit> release;
    private Function0<Unit> reset;
    private final Function0<Unit> runInvalidate;
    private final Function0<Unit> runUpdate;
    private h savedStateRegistryOwner;
    private Function0<Unit> update;
    private final View view;
    public static final int $stable = 8;
    private static final Function1<AndroidViewHolder, Unit> OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {565, 570}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j2, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r4.m4867dispatchPostFlingRZ2iAVY(r5, r7, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
        
            if (r1.m4867dispatchPostFlingRZ2iAVY(r2, r4, r10) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.ResultKt.throwOnFailure(r11)
                goto L58
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.ResultKt.throwOnFailure(r11)
                r6 = r10
                goto L58
            L1f:
                kotlin.ResultKt.throwOnFailure(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L3f
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                androidx.compose.ui.unit.Velocity$Companion r11 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r5 = r11.m6481getZero9UxMQ8M()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.m4867dispatchPostFlingRZ2iAVY(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L58
                goto L57
            L3f:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.access$getDispatcher$p(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                androidx.compose.ui.unit.Velocity$Companion r4 = androidx.compose.ui.unit.Velocity.INSTANCE
                long r4 = r4.m6481getZero9UxMQ8M()
                r6.label = r11
                java.lang.Object r11 = r1.m4867dispatchPostFlingRZ2iAVY(r2, r4, r6)
                if (r11 != r0) goto L58
            L57:
                return r0
            L58:
                kotlin.Unit r11 = kotlin.Unit.INSTANCE
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", i = {}, l = {583}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    public static final class C05401 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05401(long j2, Continuation<? super C05401> continuation) {
            super(2, continuation);
            this.$toBeConsumed = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AndroidViewHolder.this.new C05401(this.$toBeConsumed, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j2 = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.m4869dispatchPreFlingQWom1Mo(j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C05401) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i2, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i2;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        };
        Modifier.Companion companion = Modifier.INSTANCE;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        androidViewHolder.getSnapshotObserver().observeReads$ui_release(this.this$0, AndroidViewHolder.OnCommitAffectingUpdate, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutNode().invalidateLayer$ui_release();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new C0555m();
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        final Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.NoOpScrollConnection, nestedScrollDispatcher), true, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }
        }), this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                Canvas canvas = drawScope.getDrawContext().getCanvas();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    Owner owner2 = layoutNode2.getOwner();
                    AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                    if (androidComposeView != null) {
                        androidComposeView.drawAndroidView(androidViewHolder2, AndroidCanvas_androidKt.getNativeCanvas(canvas));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }
        }), new Function1<LayoutCoordinates, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
                invoke2(layoutCoordinates);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(LayoutCoordinates layoutCoordinates) {
                AndroidViewHolder_androidKt.layoutAccordingTo(this.$this_run, layoutNode);
                this.$this_run.owner.onInteropViewLayoutChange(this.$this_run);
            }
        });
        layoutNode.setCompositeKeyHash(i2);
        layoutNode.setModifier(this.modifier.then(modifierOnGloballyPositioned));
        this.onModifierChanged = new Function1<Modifier, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Modifier modifier) {
                invoke2(modifier);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Modifier modifier) {
                layoutNode.setModifier(modifier.then(modifierOnGloballyPositioned));
            }
        };
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new Function1<Density, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Density density) {
                invoke2(density);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Density density) {
                layoutNode.setDensity(density);
            }
        };
        layoutNode.setOnAttach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.addAndroidView(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }
        });
        layoutNode.setOnDetach$ui_release(new Function1<Owner, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Owner owner2) {
                invoke2(owner2);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Owner owner2) {
                AndroidComposeView androidComposeView = owner2 instanceof AndroidComposeView ? (AndroidComposeView) owner2 : null;
                if (androidComposeView != null) {
                    androidComposeView.removeAndroidView(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }
        });
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int width) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(androidViewHolder.obtainMeasureSpec(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.$this_run.getMeasuredHeight();
            }

            private final int intrinsicWidth(int height) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.obtainMeasureSpec(0, height, layoutParams.height));
                return this.$this_run.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo2measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j2) {
                if (this.$this_run.getChildCount() == 0) {
                    return MeasureScope.layout$default(measureScope, Constraints.m6188getMinWidthimpl(j2), Constraints.m6187getMinHeightimpl(j2), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(Placeable.PlacementScope placementScope) {
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                            invoke2(placementScope);
                            return Unit.INSTANCE;
                        }
                    }, 4, null);
                }
                if (Constraints.m6188getMinWidthimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumWidth(Constraints.m6188getMinWidthimpl(j2));
                }
                if (Constraints.m6187getMinHeightimpl(j2) != 0) {
                    this.$this_run.getChildAt(0).setMinimumHeight(Constraints.m6187getMinHeightimpl(j2));
                }
                AndroidViewHolder androidViewHolder = this.$this_run;
                int iM6188getMinWidthimpl = Constraints.m6188getMinWidthimpl(j2);
                int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2);
                ViewGroup.LayoutParams layoutParams = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams);
                int iObtainMeasureSpec = androidViewHolder.obtainMeasureSpec(iM6188getMinWidthimpl, iM6186getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.$this_run;
                int iM6187getMinHeightimpl = Constraints.m6187getMinHeightimpl(j2);
                int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j2);
                ViewGroup.LayoutParams layoutParams2 = this.$this_run.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2);
                androidViewHolder.measure(iObtainMeasureSpec, androidViewHolder2.obtainMeasureSpec(iM6187getMinHeightimpl, iM6185getMaxHeightimpl, layoutParams2.height));
                int measuredWidth = this.$this_run.getMeasuredWidth();
                int measuredHeight = this.$this_run.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.$this_run;
                final LayoutNode layoutNode2 = layoutNode;
                return MeasureScope.layout$default(measureScope, measuredWidth, measuredHeight, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                        invoke2(placementScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(Placeable.PlacementScope placementScope) {
                        AndroidViewHolder_androidKt.layoutAccordingTo(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicHeight(i3);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i3) {
                return intrinsicWidth(i3);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            InlineClassHelperKt.throwIllegalStateException("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int min, int max, int preferred) {
        return (preferred >= 0 || min == max) ? View.MeasureSpec.makeMeasureSpec(RangesKt.coerceIn(preferred, min, max), 1073741824) : (preferred != -2 || max == Integer.MAX_VALUE) ? (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824) : View.MeasureSpec.makeMeasureSpec(max, Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i2 = iArr[0];
        region.op(i2, iArr[1], getWidth() + i2, getHeight() + this.location[1], Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    /* renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final InterfaceC0587u getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        C0555m c0555m = this.nestedScrollingParentHelper;
        return c0555m.f518b | c0555m.f517a;
    }

    public final Function1<Density, Unit> getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1<Modifier, Unit> getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final h getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (!this.isDrawing) {
            this.layoutNode.invalidateLayer$ui_release();
        } else {
            this.view.postOnAnimation(new a(1, this.runInvalidate));
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int l2, int t, int r2, int b2) {
        this.view.layout(0, 0, r2 - l2, b2 - t);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new AnonymousClass1(consumed, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(this.dispatcher.getCoroutineScope(), null, null, new C05401(VelocityKt.Velocity(AndroidViewHolder_androidKt.toComposeVelocity(velocityX), AndroidViewHolder_androidKt.toComposeVelocity(velocityY)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.InterfaceC0554l
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            long jM4870dispatchPreScrollOzD1aCk = this.dispatcher.m4870dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dx), AndroidViewHolder_androidKt.toComposeOffset(dy)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3551getXimpl(jM4870dispatchPreScrollOzD1aCk));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3552getYimpl(jM4870dispatchPreScrollOzD1aCk));
        }
    }

    @Override // androidx.core.view.InterfaceC0554l
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            long jM4868dispatchPostScrollDzOQY0M = this.dispatcher.m4868dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
            consumed[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3551getXimpl(jM4868dispatchPostScrollDzOQY0M));
            consumed[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3552getYimpl(jM4868dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.InterfaceC0554l
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        C0555m c0555m = this.nestedScrollingParentHelper;
        if (type == 1) {
            c0555m.f518b = axes;
        } else {
            c0555m.f517a = axes;
        }
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.InterfaceC0554l
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.InterfaceC0554l
    public void onStopNestedScroll(View target, int type) {
        C0555m c0555m = this.nestedScrollingParentHelper;
        if (type == 1) {
            c0555m.f518b = 0;
        } else {
            c0555m.f517a = 0;
        }
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    public final void remeasure() {
        int i2;
        int i3 = this.lastWidthMeasureSpec;
        if (i3 == Integer.MIN_VALUE || (i2 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i3, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1<? super Density, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(InterfaceC0587u interfaceC0587u) {
        if (interfaceC0587u != this.lifecycleOwner) {
            this.lifecycleOwner = interfaceC0587u;
            I.e(this, interfaceC0587u);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1<? super Modifier, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1<? super Density, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1<? super Modifier, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    public final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    public final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(h hVar) {
        if (hVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = hVar;
            AbstractC0130a.m(this, hVar);
        }
    }

    public final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.InterfaceC0554l
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m4868dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxConsumed), AndroidViewHolder_androidKt.toComposeOffset(dyConsumed)), OffsetKt.Offset(AndroidViewHolder_androidKt.toComposeOffset(dxUnconsumed), AndroidViewHolder_androidKt.toComposeOffset(dyUnconsumed)), AndroidViewHolder_androidKt.toNestedScrollSource(type));
        }
    }
}
