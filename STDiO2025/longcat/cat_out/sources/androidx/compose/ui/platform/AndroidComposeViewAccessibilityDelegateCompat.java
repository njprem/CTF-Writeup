package androidx.compose.ui.platform;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.R;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.HitTestResult;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeKind;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AccessibilityIterators;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsNodeKt;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.platform.AndroidAccessibilitySpannableString_androidKt;
import androidx.compose.ui.text.platform.URLSpanCache;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.core.view.AbstractC0544b;
import androidx.core.view.AbstractC0546d;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.InterfaceC0587u;
import androidx.lifecycle.w;
import j.AbstractC0660m;
import j.AbstractC0661n;
import j.AbstractC0662o;
import j.AbstractC0663p;
import j.C0637C;
import j.C0639E;
import j.C0640F;
import j.C0654g;
import j.i0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000\u008a\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 ³\u00022\u00020\u0001:\u0010´\u0002µ\u0002³\u0002¶\u0002·\u0002¸\u0002¹\u0002º\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\"\u001a\u00020\u001fH\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010%\u001a\u00020\u001fH\u0080@¢\u0006\u0004\b#\u0010$J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0000¢\u0006\u0004\b(\u0010)J8\u0010\u000e\u001a\u00020\u00062\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u0019\u00102\u001a\u0004\u0018\u0001012\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020,H\u0002¢\u0006\u0004\b6\u00107J(\u0010<\u001a\u0012\u0012\u0004\u0012\u00020:09j\b\u0012\u0004\u0012\u00020:`;2\u0006\u00108\u001a\u00020\u0006H\u0082\b¢\u0006\u0004\b<\u0010=JK\u0010D\u001a\b\u0012\u0004\u0012\u00020:0B2\u0006\u00108\u001a\u00020\u00062\u0016\u0010@\u001a\u0012\u0012\u0004\u0012\u00020:0>j\b\u0012\u0004\u0012\u00020:`?2\u0014\b\u0002\u0010C\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0B0AH\u0002¢\u0006\u0004\bD\u0010EJC\u0010I\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020:2\u0016\u0010G\u001a\u0012\u0012\u0004\u0012\u00020:0>j\b\u0012\u0004\u0012\u00020:`?2\u0012\u0010H\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020:0B0AH\u0002¢\u0006\u0004\bI\u0010JJ+\u0010L\u001a\b\u0012\u0004\u0012\u00020:0B2\u0006\u00108\u001a\u00020\u00062\f\u0010K\u001a\b\u0012\u0004\u0012\u00020:0BH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u001fH\u0002¢\u0006\u0004\bN\u0010!J\u0017\u0010O\u001a\u00020\u00062\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0004\bO\u0010PJ'\u0010S\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\b2\u0006\u0010Q\u001a\u0002012\u0006\u0010R\u001a\u00020:H\u0002¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001f2\u0006\u00104\u001a\u00020:2\u0006\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\bU\u0010VJ\u0019\u0010X\u001a\u0004\u0018\u00010W2\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0004\bX\u0010YJ\u0019\u0010Z\u001a\u0004\u0018\u00010W2\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0004\bZ\u0010YJ\u001f\u0010[\u001a\u00020\u001f2\u0006\u00104\u001a\u00020:2\u0006\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\b[\u0010VJ\u0017\u0010\\\u001a\u00020\u00062\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0004\b\\\u0010PJ\u001f\u0010]\u001a\u00020\u001f2\u0006\u00104\u001a\u00020:2\u0006\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\b]\u0010VJ\u0019\u0010_\u001a\u0004\u0018\u00010^2\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0004\b_\u0010`J\u0015\u0010b\u001a\u0004\u0018\u00010a*\u00020^H\u0002¢\u0006\u0004\bb\u0010cJ\u001f\u0010d\u001a\u00020\u001f2\u0006\u00104\u001a\u00020:2\u0006\u0010Q\u001a\u000201H\u0002¢\u0006\u0004\bd\u0010VJ\u0017\u0010e\u001a\u00020\u00062\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\be\u0010fJ\u0017\u0010g\u001a\u00020\u00062\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\bg\u0010fJ=\u0010l\u001a\u00020\u00062\u0006\u00100\u001a\u00020\b2\u0006\u0010h\u001a\u00020\b2\n\b\u0002\u0010i\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010k\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010jH\u0002¢\u0006\u0004\bl\u0010mJ\u0017\u0010o\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020nH\u0002¢\u0006\u0004\bo\u0010pJ\u001f\u0010q\u001a\u00020n2\u0006\u00100\u001a\u00020\b2\u0006\u0010h\u001a\u00020\bH\u0003¢\u0006\u0004\bq\u0010rJ?\u0010x\u001a\u00020n2\u0006\u00100\u001a\u00020\b2\b\u0010s\u001a\u0004\u0018\u00010\b2\b\u0010t\u001a\u0004\u0018\u00010\b2\b\u0010u\u001a\u0004\u0018\u00010\b2\b\u0010w\u001a\u0004\u0018\u00010vH\u0002¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u00062\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\bz\u0010fJ)\u0010~\u001a\u00020\u00062\u0006\u00100\u001a\u00020\b2\u0006\u0010{\u001a\u00020\b2\b\u0010}\u001a\u0004\u0018\u00010|H\u0002¢\u0006\u0004\b~\u0010\u007fJ5\u0010\u0081\u0001\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\b2\u0006\u0010Q\u001a\u0002012\u0007\u0010\u0080\u0001\u001a\u00020W2\b\u0010}\u001a\u0004\u0018\u00010|H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J*\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010:2\b\u0010\u0085\u0001\u001a\u00030\u0084\u0001H\u0002¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J4\u0010\u008d\u0001\u001a\u0004\u0018\u00018\u0000\"\t\b\u0000\u0010\u008b\u0001*\u00020v2\b\u0010w\u001a\u0004\u0018\u00018\u00002\t\b\u0001\u0010\u008c\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0019\u0010\u008f\u0001\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0005\b\u008f\u0001\u0010)J\u0019\u0010\u0090\u0001\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0005\b\u0090\u0001\u0010)J$\u0010\u0093\u0001\u001a\u00020\u001f2\u0006\u0010'\u001a\u00020&2\b\u0010\u0092\u0001\u001a\u00030\u0091\u0001H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0095\u0001\u0010!J\u0011\u0010\u0096\u0001\u001a\u00020\u001fH\u0002¢\u0006\u0005\b\u0096\u0001\u0010!J!\u0010\u0098\u0001\u001a\u00020\u001f2\r\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020,0+H\u0002¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J+\u0010\u009d\u0001\u001a\u00020\u00062\u0007\u0010\u009a\u0001\u001a\u00020\b2\u000e\u0010\u009c\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010jH\u0002¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u001c\u0010 \u0001\u001a\u00020\u001f2\b\u0010\u009f\u0001\u001a\u00030\u009b\u0001H\u0002¢\u0006\u0006\b \u0001\u0010¡\u0001J.\u0010¤\u0001\u001a\u00020\u001f2\u0007\u0010¢\u0001\u001a\u00020\b2\u0006\u0010i\u001a\u00020\b2\t\u0010£\u0001\u001a\u0004\u0018\u00010WH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J%\u0010©\u0001\u001a\u00020\u001f2\u0007\u0010¦\u0001\u001a\u00020:2\b\u0010¨\u0001\u001a\u00030§\u0001H\u0002¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u001b\u0010«\u0001\u001a\u00020\b2\u0007\u0010\u009a\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b«\u0001\u0010¬\u0001J5\u0010°\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020:2\u0007\u0010\u00ad\u0001\u001a\u00020\b2\u0007\u0010®\u0001\u001a\u00020\u00062\u0007\u0010¯\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001b\u0010²\u0001\u001a\u00020\u001f2\u0007\u0010¢\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b²\u0001\u0010\u008a\u0001J5\u0010¶\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020:2\u0007\u0010³\u0001\u001a\u00020\b2\u0007\u0010´\u0001\u001a\u00020\b2\u0007\u0010µ\u0001\u001a\u00020\u0006H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001a\u0010¸\u0001\u001a\u00020\b2\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u001a\u0010º\u0001\u001a\u00020\b2\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0006\bº\u0001\u0010¹\u0001J\u0019\u0010»\u0001\u001a\u00020\u00062\u0006\u00104\u001a\u00020:H\u0002¢\u0006\u0005\b»\u0001\u0010PJ(\u0010½\u0001\u001a\u0005\u0018\u00010¼\u00012\b\u00104\u001a\u0004\u0018\u00010:2\u0007\u0010\u00ad\u0001\u001a\u00020\bH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001d\u0010¿\u0001\u001a\u0004\u0018\u00010W2\b\u00104\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0005\b¿\u0001\u0010YJ\u0019\u0010Á\u0001\u001a\u0004\u0018\u00010^*\u00030À\u0001H\u0002¢\u0006\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000f\n\u0005\b\u0003\u0010Ã\u0001\u001a\u0006\bÄ\u0001\u0010Å\u0001R0\u0010Æ\u0001\u001a\u00020\b8\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÆ\u0001\u0010Ç\u0001\u0012\u0005\bË\u0001\u0010!\u001a\u0006\bÈ\u0001\u0010É\u0001\"\u0006\bÊ\u0001\u0010\u008a\u0001R=\u0010Í\u0001\u001a\u000f\u0012\u0004\u0012\u00020n\u0012\u0004\u0012\u00020\u00060Ì\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÍ\u0001\u0010Î\u0001\u0012\u0005\bÓ\u0001\u0010!\u001a\u0006\bÏ\u0001\u0010Ð\u0001\"\u0006\bÑ\u0001\u0010Ò\u0001R\u0018\u0010Õ\u0001\u001a\u00030Ô\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0001\u0010Ö\u0001R2\u0010Ø\u0001\u001a\u00020\u00062\u0007\u0010×\u0001\u001a\u00020\u00068\u0000@@X\u0080\u000e¢\u0006\u0018\n\u0006\bØ\u0001\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010Ý\u0001R*\u0010ß\u0001\u001a\u00030Þ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bß\u0001\u0010à\u0001\u001a\u0006\bá\u0001\u0010â\u0001\"\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010æ\u0001\u001a\u00030å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010é\u0001\u001a\u00030è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001RD\u0010í\u0001\u001a-\u0012\u000f\u0012\r ì\u0001*\u0005\u0018\u00010ë\u00010ë\u0001 ì\u0001*\u0015\u0012\u000f\u0012\r ì\u0001*\u0005\u0018\u00010ë\u00010ë\u0001\u0018\u00010j0B8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010î\u0001R\u0018\u0010ð\u0001\u001a\u00030ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001e\u0010ó\u0001\u001a\u00070ò\u0001R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bó\u0001\u0010ô\u0001R\u0019\u0010õ\u0001\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010Ç\u0001R\u001b\u0010ö\u0001\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bö\u0001\u0010÷\u0001R\u0019\u0010ø\u0001\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010Ù\u0001R\u001e\u0010ú\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u00010A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R\u001e\u0010ü\u0001\u001a\t\u0012\u0005\u0012\u00030ù\u00010A8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bü\u0001\u0010û\u0001R'\u0010þ\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020v0ý\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0001\u0010ÿ\u0001R'\u0010\u0081\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020v0\u0080\u00020ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0002\u0010ÿ\u0001R\u0019\u0010\u0082\u0002\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0002\u0010Ç\u0001R\u001b\u0010\u0083\u0002\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0002\u0010\u0084\u0002R\u001e\u0010\u0086\u0002\u001a\t\u0012\u0004\u0012\u00020&0\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010\u0089\u0002\u001a\t\u0012\u0004\u0012\u00020\u001f0\u0088\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0019\u0010\u008b\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0002\u0010Ù\u0001R\u001c\u0010\u008d\u0002\u001a\u0005\u0018\u00010\u008c\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010\u008e\u0002R%\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b-\u0010\u008f\u0002\u001a\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001a\u0010\u0092\u0002\u001a\u00030\u0091\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0002\u0010\u0093\u0002R*\u0010\u0095\u0002\u001a\u00030\u0094\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0095\u0002\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002\"\u0006\b\u0099\u0002\u0010\u009a\u0002R*\u0010\u009b\u0002\u001a\u00030\u0094\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009b\u0002\u0010\u0096\u0002\u001a\u0006\b\u009c\u0002\u0010\u0098\u0002\"\u0006\b\u009d\u0002\u0010\u009a\u0002R\u001f\u0010\u009e\u0002\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009e\u0002\u0010\u009f\u0002\u001a\u0006\b \u0002\u0010¡\u0002R\u001f\u0010¢\u0002\u001a\u00020W8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¢\u0002\u0010\u009f\u0002\u001a\u0006\b£\u0002\u0010¡\u0002R\u0018\u0010¥\u0002\u001a\u00030¤\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R \u0010§\u0002\u001a\t\u0012\u0005\u0012\u00030§\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0002\u0010û\u0001R\u001a\u0010¨\u0002\u001a\u00030§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010©\u0002R\u0019\u0010ª\u0002\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bª\u0002\u0010Ù\u0001R\u0018\u0010¬\u0002\u001a\u00030«\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0002\u0010\u00ad\u0002R\u001e\u0010®\u0002\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010B8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010î\u0001R%\u0010¯\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u009b\u0001\u0012\u0004\u0012\u00020\u001f0Ì\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¯\u0002\u0010Î\u0001R\u0017\u0010±\u0002\u001a\u00020\u00068@X\u0080\u0004¢\u0006\b\u001a\u0006\b°\u0002\u0010Û\u0001R\u0017\u0010²\u0002\u001a\u00020\u00068BX\u0082\u0004¢\u0006\b\u001a\u0006\b²\u0002\u0010Û\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006»\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Landroidx/core/view/b;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "vertical", "", "direction", "Landroidx/compose/ui/geometry/Offset;", "position", "canScroll-0AR0LA0$ui_release", "(ZIJ)Z", "canScroll", "Landroid/view/MotionEvent;", "event", "dispatchHoverEvent$ui_release", "(Landroid/view/MotionEvent;)Z", "dispatchHoverEvent", "", "x", "y", "hitTestSemanticsAt$ui_release", "(FF)I", "hitTestSemanticsAt", "Landroid/view/View;", "host", "Lx/i;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Lx/i;", "", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "Lj/o;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "currentSemanticsNodes", "canScroll-moWRBKg", "(Lj/o;ZIJ)Z", "virtualViewId", "Lx/f;", "createNodeInfo", "(I)Lx/f;", "node", "Landroid/graphics/Rect;", "boundsInScreen", "(Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;)Landroid/graphics/Rect;", "layoutIsRtl", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "semanticComparator", "(Z)Ljava/util/Comparator;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "parentListToSort", "Lj/E;", "", "containerChildrenMapping", "sortByGeometryGroupings", "(ZLjava/util/ArrayList;Lj/E;)Ljava/util/List;", "currNode", "geometryList", "containerMapToChildren", "geometryDepthFirstSearch", "(Landroidx/compose/ui/semantics/SemanticsNode;Ljava/util/ArrayList;Lj/E;)V", "listToSort", "subtreeSortedByGeometryGrouping", "(ZLjava/util/List;)Ljava/util/List;", "setTraversalValues", "isScreenReaderFocusable", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "info", "semanticsNode", "populateAccessibilityNodeInfoProperties", "(ILx/f;Landroidx/compose/ui/semantics/SemanticsNode;)V", "setContentInvalid", "(Landroidx/compose/ui/semantics/SemanticsNode;Lx/f;)V", "", "getInfoStateDescriptionOrNull", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "createStateDescriptionForTextField", "setStateDescription", "getInfoIsCheckable", "setIsCheckable", "Landroidx/compose/ui/text/AnnotatedString;", "getInfoText", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/SpannableString;", "toSpannableString", "(Landroidx/compose/ui/text/AnnotatedString;)Landroid/text/SpannableString;", "setText", "isAccessibilityFocused", "(I)Z", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "contentDescription", "sendEventForVirtualView", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "sendEvent", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "createEvent", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "createTextSelectionChangedEvent", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "performActionHelper", "(IILandroid/os/Bundle;)Z", "extraDataKey", "addExtraDataToAccessibilityNodeInfoHelper", "(ILx/f;Ljava/lang/String;Landroid/os/Bundle;)V", "textNode", "Landroidx/compose/ui/geometry/Rect;", "bounds", "Landroid/graphics/RectF;", "toScreenCoords", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "updateHoveredVirtualView", "(I)V", "T", "size", "trimToSize", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "notifySubtreeAccessibilityStateChangedIfNeeded", "sendTypeViewScrolledAccessibilityEvent", "Lj/F;", "subtreeChangedSemanticsNodesIds", "sendSubtreeChangeAccessibilityEvents", "(Landroidx/compose/ui/node/LayoutNode;Lj/F;)V", "checkForSemanticsChanges", "updateSemanticsNodesCopyAndPanes", "newSemanticsNodes", "sendSemanticsPropertyChangeEvents", "(Lj/o;)V", "id", "Landroidx/compose/ui/platform/ScrollObservationScope;", "oldScrollObservationScopes", "registerScrollingId", "(ILjava/util/List;)Z", "scrollObservationScope", "scheduleScrollEventIfNeeded", "(Landroidx/compose/ui/platform/ScrollObservationScope;)V", "semanticsNodeId", "title", "sendPaneChangeEvents", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "sendAccessibilitySemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "semanticsNodeIdToAccessibilityVirtualNodeId", "(I)I", "granularity", "forward", "extendSelection", "traverseAtGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "sendPendingTextTraversedAtGranularityEvent", "start", "end", "traversalMode", "setAccessibilitySelection", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "getAccessibilitySelectionStart", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "getAccessibilitySelectionEnd", "isAccessibilitySelectionExtendable", "Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIteratorForGranularity", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Landroidx/compose/ui/platform/AccessibilityIterators$TextSegmentIterator;", "getIterableTextForAccessibility", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "getTextForTextField", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Landroidx/compose/ui/text/AnnotatedString;", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "hoveredVirtualViewId", "I", "getHoveredVirtualViewId$ui_release", "()I", "setHoveredVirtualViewId$ui_release", "getHoveredVirtualViewId$ui_release$annotations", "Lkotlin/Function1;", "onSendAccessibilityEvent", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui_release$annotations", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "Landroid/view/accessibility/AccessibilityManager;", "value", "accessibilityForceEnabledForTesting", "Z", "getAccessibilityForceEnabledForTesting$ui_release", "()Z", "setAccessibilityForceEnabledForTesting$ui_release", "(Z)V", "", "SendRecurringAccessibilityEventsIntervalMillis", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui_release", "()J", "setSendRecurringAccessibilityEventsIntervalMillis$ui_release", "(J)V", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "enabledStateListener", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "touchExplorationStateListener", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "kotlin.jvm.PlatformType", "enabledServices", "Ljava/util/List;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "nodeProvider", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "focusedVirtualViewId", "currentlyFocusedANI", "Lx/f;", "sendingFocusAffectingEvent", "Landroidx/compose/ui/semantics/ScrollAxisRange;", "pendingHorizontalScrollEvents", "Lj/E;", "pendingVerticalScrollEvents", "Lj/i0;", "actionIdToLabel", "Lj/i0;", "Lj/K;", "labelToActionId", "accessibilityCursorPosition", "previousTraversedNode", "Ljava/lang/Integer;", "Lj/g;", "subtreeChangedLayoutNodes", "Lj/g;", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "pendingTextTraversedEvent", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "Lj/o;", "getCurrentSemanticsNodes", "()Lj/o;", "paneDisplayed", "Lj/F;", "Lj/C;", "idToBeforeMap", "Lj/C;", "getIdToBeforeMap$ui_release", "()Lj/C;", "setIdToBeforeMap$ui_release", "(Lj/C;)V", "idToAfterMap", "getIdToAfterMap$ui_release", "setIdToAfterMap$ui_release", "ExtraDataTestTraversalBeforeVal", "Ljava/lang/String;", "getExtraDataTestTraversalBeforeVal$ui_release", "()Ljava/lang/String;", "ExtraDataTestTraversalAfterVal", "getExtraDataTestTraversalAfterVal$ui_release", "Landroidx/compose/ui/text/platform/URLSpanCache;", "urlSpanCache", "Landroidx/compose/ui/text/platform/URLSpanCache;", "previousSemanticsNodes", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "semanticsChangeChecker", "Ljava/lang/Runnable;", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "isEnabled$ui_release", "isEnabled", "isTouchExplorationEnabled", "Companion", "Api24Impl", "Api29Impl", "ComposeAccessibilityNodeProvider", "LtrBoundsComparator", "PendingTextTraversedEvent", "RtlBoundsComparator", "TopBottomBoundsComparator", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidComposeViewAccessibilityDelegateCompat extends AbstractC0544b {
    public static final int AccessibilityCursorPositionUndefined = -1;
    public static final int AccessibilitySliderStepsCount = 20;
    public static final String ClassName = "android.view.View";
    public static final String ExtraDataIdKey = "androidx.compose.ui.semantics.id";
    public static final String ExtraDataTestTagKey = "androidx.compose.ui.semantics.testTag";
    public static final int InvalidId = Integer.MIN_VALUE;
    public static final String LogTag = "AccessibilityDelegate";
    public static final int ParcelSafeTextLength = 100000;
    public static final String TextClassName = "android.widget.TextView";
    public static final String TextFieldClassName = "android.widget.EditText";
    public static final long TextTraversedEventTimeoutMillis = 1000;
    private final String ExtraDataTestTraversalAfterVal;
    private final String ExtraDataTestTraversalBeforeVal;
    private long SendRecurringAccessibilityEventsIntervalMillis;
    private int accessibilityCursorPosition;
    private boolean accessibilityForceEnabledForTesting;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private i0 actionIdToLabel;
    private final Channel<Unit> boundsUpdateChannel;
    private boolean checkingForSemanticsChanges;
    private AbstractC0662o currentSemanticsNodes;
    private boolean currentSemanticsNodesInvalidated;
    private x.f currentlyFocusedANI;
    private List<AccessibilityServiceInfo> enabledServices;
    private final AccessibilityManager.AccessibilityStateChangeListener enabledStateListener;
    private int focusedVirtualViewId;
    private final Handler handler;
    private C0637C idToAfterMap;
    private C0637C idToBeforeMap;
    private i0 labelToActionId;
    private ComposeAccessibilityNodeProvider nodeProvider;
    private C0640F paneDisplayed;
    private final C0639E pendingHorizontalScrollEvents;
    private PendingTextTraversedEvent pendingTextTraversedEvent;
    private final C0639E pendingVerticalScrollEvents;
    private C0639E previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private Integer previousTraversedNode;
    private final Function1<ScrollObservationScope, Unit> scheduleScrollEventIfNeededLambda;
    private final List<ScrollObservationScope> scrollObservationScopes;
    private final Runnable semanticsChangeChecker;
    private boolean sendingFocusAffectingEvent;
    private final C0654g subtreeChangedLayoutNodes;
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateListener;
    private final URLSpanCache urlSpanCache;
    private final AndroidComposeView view;
    public static final int $stable = 8;
    private static final AbstractC0660m AccessibilityActionsResourceIds = AbstractC0661n.a(R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31);
    private int hoveredVirtualViewId = Integer.MIN_VALUE;
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }
    };

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api24Impl;", "", "<init>", "()V", "Lx/f;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "addSetProgressAction", "(Lx/f;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api24Impl {
        public static final Api24Impl INSTANCE = new Api24Impl();

        private Api24Impl() {
        }

        @JvmStatic
        public static final void addSetProgressAction(x.f info, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetProgress())) == null) {
                return;
            }
            info.a(new x.c(null, android.R.id.accessibilityActionSetProgress, accessibilityAction.getLabel(), null));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$Api29Impl;", "", "<init>", "()V", "Lx/f;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "addPageActions", "(Lx/f;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Api29Impl {
        public static final Api29Impl INSTANCE = new Api29Impl();

        private Api29Impl() {
        }

        @JvmStatic
        public static final void addPageActions(x.f info, SemanticsNode semanticsNode) {
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(semanticsNode)) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsActions.getPageUp());
                if (accessibilityAction != null) {
                    info.a(new x.c(null, android.R.id.accessibilityActionPageUp, accessibilityAction.getLabel(), null));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageDown());
                if (accessibilityAction2 != null) {
                    info.a(new x.c(null, android.R.id.accessibilityActionPageDown, accessibilityAction2.getLabel(), null));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageLeft());
                if (accessibilityAction3 != null) {
                    info.a(new x.c(null, android.R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel(), null));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsActions.getPageRight());
                if (accessibilityAction4 != null) {
                    info.a(new x.c(null, android.R.id.accessibilityActionPageRight, accessibilityAction4.getLabel(), null));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$ComposeAccessibilityNodeProvider;", "Lx/i;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "virtualViewId", "Lx/f;", "createAccessibilityNodeInfo", "(I)Lx/f;", "action", "Landroid/os/Bundle;", "arguments", "", "performAction", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "", "addExtraDataToAccessibilityNodeInfo", "(ILx/f;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "findFocus", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class ComposeAccessibilityNodeProvider extends x.i {
        public ComposeAccessibilityNodeProvider() {
        }

        @Override // x.i
        public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, x.f info, String extraDataKey, Bundle arguments) {
            AndroidComposeViewAccessibilityDelegateCompat.this.addExtraDataToAccessibilityNodeInfoHelper(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // x.i
        public x.f createAccessibilityNodeInfo(int virtualViewId) {
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            Trace.beginSection("createAccessibilityNodeInfo");
            try {
                x.f fVarCreateNodeInfo = androidComposeViewAccessibilityDelegateCompat.createNodeInfo(virtualViewId);
                if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent && virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = fVarCreateNodeInfo;
                }
                return fVarCreateNodeInfo;
            } finally {
                Trace.endSection();
            }
        }

        @Override // x.i
        public x.f findFocus(int focus) {
            return createAccessibilityNodeInfo(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
        }

        @Override // x.i
        public boolean performAction(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.performActionHelper(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$LtrBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class LtrBoundsComparator implements Comparator<SemanticsNode> {
        public static final LtrBoundsComparator INSTANCE = new LtrBoundsComparator();

        private LtrBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode a2, SemanticsNode b2) {
            Rect boundsInWindow = a2.getBoundsInWindow();
            Rect boundsInWindow2 = b2.getBoundsInWindow();
            int iCompare = Float.compare(boundsInWindow.getLeft(), boundsInWindow2.getLeft());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(boundsInWindow.getRight(), boundsInWindow2.getRight());
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$PendingTextTraversedEvent;", "", "node", "Landroidx/compose/ui/semantics/SemanticsNode;", "action", "", "granularity", "fromIndex", "toIndex", "traverseTime", "", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "getAction", "()I", "getFromIndex", "getGranularity", "getNode", "()Landroidx/compose/ui/semantics/SemanticsNode;", "getToIndex", "getTraverseTime", "()J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class PendingTextTraversedEvent {
        private final int action;
        private final int fromIndex;
        private final int granularity;
        private final SemanticsNode node;
        private final int toIndex;
        private final long traverseTime;

        public PendingTextTraversedEvent(SemanticsNode semanticsNode, int i2, int i3, int i4, int i5, long j2) {
            this.node = semanticsNode;
            this.action = i2;
            this.granularity = i3;
            this.fromIndex = i4;
            this.toIndex = i5;
            this.traverseTime = j2;
        }

        public final int getAction() {
            return this.action;
        }

        public final int getFromIndex() {
            return this.fromIndex;
        }

        public final int getGranularity() {
            return this.granularity;
        }

        public final SemanticsNode getNode() {
            return this.node;
        }

        public final int getToIndex() {
            return this.toIndex;
        }

        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$RtlBoundsComparator;", "Ljava/util/Comparator;", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RtlBoundsComparator implements Comparator<SemanticsNode> {
        public static final RtlBoundsComparator INSTANCE = new RtlBoundsComparator();

        private RtlBoundsComparator() {
        }

        @Override // java.util.Comparator
        public int compare(SemanticsNode a2, SemanticsNode b2) {
            Rect boundsInWindow = a2.getBoundsInWindow();
            Rect boundsInWindow2 = b2.getBoundsInWindow();
            int iCompare = Float.compare(boundsInWindow2.getRight(), boundsInWindow.getRight());
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompare2 = Float.compare(boundsInWindow.getTop(), boundsInWindow2.getTop());
            if (iCompare2 != 0) {
                return iCompare2;
            }
            int iCompare3 = Float.compare(boundsInWindow.getBottom(), boundsInWindow2.getBottom());
            return iCompare3 != 0 ? iCompare3 : Float.compare(boundsInWindow2.getLeft(), boundsInWindow.getLeft());
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÂ\u0002\u0018\u000026\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00020\u0001j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002`\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0007J<\u0010\b\u001a\u00020\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00022\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H\u0016¨\u0006\f"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$TopBottomBoundsComparator;", "Ljava/util/Comparator;", "Lkotlin/Pair;", "Landroidx/compose/ui/geometry/Rect;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "Lkotlin/Comparator;", "()V", "compare", "", "a", "b", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class TopBottomBoundsComparator implements Comparator<Pair<? extends Rect, ? extends List<SemanticsNode>>> {
        public static final TopBottomBoundsComparator INSTANCE = new TopBottomBoundsComparator();

        private TopBottomBoundsComparator() {
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(Pair<? extends Rect, ? extends List<SemanticsNode>> pair, Pair<? extends Rect, ? extends List<SemanticsNode>> pair2) {
            return compare2((Pair<Rect, ? extends List<SemanticsNode>>) pair, (Pair<Rect, ? extends List<SemanticsNode>>) pair2);
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(Pair<Rect, ? extends List<SemanticsNode>> a2, Pair<Rect, ? extends List<SemanticsNode>> b2) {
            int iCompare = Float.compare(a2.getFirst().getTop(), b2.getFirst().getTop());
            return iCompare != 0 ? iCompare : Float.compare(a2.getFirst().getBottom(), b2.getFirst().getBottom());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) systemService;
        this.accessibilityManager = accessibilityManager;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.enabledStateListener = new AccessibilityManager.AccessibilityStateChangeListener() { // from class: androidx.compose.ui.platform.f
            @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
            public final void onAccessibilityStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.enabledStateListener$lambda$0(this.f411a, z);
            }
        };
        this.touchExplorationStateListener = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: androidx.compose.ui.platform.g
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z) {
                AndroidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener$lambda$1(this.f412a, z);
            }
        };
        this.enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this.handler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new ComposeAccessibilityNodeProvider();
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.pendingHorizontalScrollEvents = new C0639E();
        this.pendingVerticalScrollEvents = new C0639E();
        this.actionIdToLabel = new i0();
        this.labelToActionId = new i0();
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new C0654g();
        this.boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
        this.currentSemanticsNodesInvalidated = true;
        C0639E c0639e = AbstractC0663p.f856a;
        Intrinsics.checkNotNull(c0639e, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.currentSemanticsNodes = c0639e;
        this.paneDisplayed = new C0640F();
        this.idToBeforeMap = new C0637C();
        this.idToAfterMap = new C0637C();
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new URLSpanCache();
        this.previousSemanticsNodes = new C0639E();
        SemanticsNode unmergedRootSemanticsNode = androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode();
        Intrinsics.checkNotNull(c0639e, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.previousSemanticsRoot = new SemanticsNodeCopy(unmergedRootSemanticsNode, c0639e);
        androidComposeView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.addAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.addTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AndroidComposeViewAccessibilityDelegateCompat.this.handler.removeCallbacks(AndroidComposeViewAccessibilityDelegateCompat.this.semanticsChangeChecker);
                android.view.accessibility.AccessibilityManager accessibilityManager2 = AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityManager;
                AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
                accessibilityManager2.removeAccessibilityStateChangeListener(androidComposeViewAccessibilityDelegateCompat.enabledStateListener);
                accessibilityManager2.removeTouchExplorationStateChangeListener(androidComposeViewAccessibilityDelegateCompat.touchExplorationStateListener);
            }
        });
        this.semanticsChangeChecker = new d(this, 2);
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<ScrollObservationScope, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ScrollObservationScope scrollObservationScope) {
                invoke2(scrollObservationScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ScrollObservationScope scrollObservationScope) {
                this.this$0.scheduleScrollEventIfNeeded(scrollObservationScope);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addExtraDataToAccessibilityNodeInfoHelper(int virtualViewId, x.f info, String extraDataKey, Bundle arguments) {
        SemanticsNode semanticsNode;
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().c(virtualViewId);
        if (semanticsNodeWithAdjustedBounds == null || (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) == null) {
            return;
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(semanticsNode);
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int iC = this.idToBeforeMap.c(virtualViewId);
            if (iC != -1) {
                info.f1055a.getExtras().putInt(extraDataKey, iC);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int iC2 = this.idToAfterMap.c(virtualViewId);
            if (iC2 != -1) {
                info.f1055a.getExtras().putInt(extraDataKey, iC2);
                return;
            }
            return;
        }
        if (!semanticsNode.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || arguments == null || !Intrinsics.areEqual(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
            if (!unmergedConfig$ui_release.contains(semanticsProperties.getTestTag()) || arguments == null || !Intrinsics.areEqual(extraDataKey, ExtraDataTestTagKey)) {
                if (Intrinsics.areEqual(extraDataKey, ExtraDataIdKey)) {
                    info.f1055a.getExtras().putInt(extraDataKey, semanticsNode.getId());
                    return;
                }
                return;
            } else {
                String str = (String) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getTestTag());
                if (str != null) {
                    info.f1055a.getExtras().putCharSequence(extraDataKey, str);
                    return;
                }
                return;
            }
        }
        int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
        int i3 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
        if (i3 > 0 && i2 >= 0) {
            if (i2 < (iterableTextForAccessibility != null ? iterableTextForAccessibility.length() : Integer.MAX_VALUE)) {
                TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(semanticsNode.getUnmergedConfig());
                if (textLayoutResult == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    if (i5 >= textLayoutResult.getLayoutInput().getText().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(toScreenCoords(semanticsNode, textLayoutResult.getBoundingBox(i5)));
                    }
                }
                info.f1055a.getExtras().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
        }
        Log.e(LogTag, "Invalid arguments for accessibility character locations");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final android.graphics.Rect boundsInScreen(SemanticsNodeWithAdjustedBounds node) {
        android.graphics.Rect adjustedBounds = node.getAdjustedBounds();
        long jMo5073localToScreenMKHz9U = this.view.mo5073localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.left, adjustedBounds.top));
        long jMo5073localToScreenMKHz9U2 = this.view.mo5073localToScreenMKHz9U(OffsetKt.Offset(adjustedBounds.right, adjustedBounds.bottom));
        return new android.graphics.Rect((int) Math.floor(Offset.m3551getXimpl(jMo5073localToScreenMKHz9U)), (int) Math.floor(Offset.m3552getYimpl(jMo5073localToScreenMKHz9U)), (int) Math.ceil(Offset.m3551getXimpl(jMo5073localToScreenMKHz9U2)), (int) Math.ceil(Offset.m3552getYimpl(jMo5073localToScreenMKHz9U2)));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d7  */
    /* renamed from: canScroll-moWRBKg, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean m5446canScrollmoWRBKg(j.AbstractC0662o r21, boolean r22, int r23, long r24) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.m5446canScrollmoWRBKg(j.o, boolean, int, long):boolean");
    }

    private final void checkForSemanticsChanges() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (isEnabled$ui_release()) {
                sendAccessibilitySemanticsStructureChangeEvents(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                sendSemanticsPropertyChangeEvents(getCurrentSemanticsNodes());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    updateSemanticsNodesCopyAndPanes();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        this.focusedVirtualViewId = Integer.MIN_VALUE;
        this.currentlyFocusedANI = null;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
        Trace.beginSection("obtainAccessibilityEvent");
        try {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
            Trace.endSection();
            accessibilityEventObtain.setEnabled(true);
            accessibilityEventObtain.setClassName(ClassName);
            Trace.beginSection("event.packageName");
            try {
                accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
                Trace.beginSection("event.setSource");
                try {
                    accessibilityEventObtain.setSource(this.view, virtualViewId);
                    Trace.endSection();
                    if (isEnabled$ui_release() && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().c(virtualViewId)) != null) {
                        accessibilityEventObtain.setPassword(semanticsNodeWithAdjustedBounds.getSemanticsNode().getUnmergedConfig().contains(SemanticsProperties.INSTANCE.getPassword()));
                    }
                    return accessibilityEventObtain;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final x.f createNodeInfo(int virtualViewId) {
        InterfaceC0587u lifecycleOwner;
        AbstractC0583p lifecycle;
        Trace.beginSection("checkIfDestroyed");
        try {
            AndroidComposeView.ViewTreeOwners viewTreeOwners = this.view.getViewTreeOwners();
            if (((viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.getLifecycleOwner()) == null || (lifecycle = lifecycleOwner.getLifecycle()) == null) ? null : ((w) lifecycle).f598c) == EnumC0582o.f586a) {
                return null;
            }
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("createAccessibilityNodeInfoObject");
            try {
                AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
                x.f fVar = new x.f(accessibilityNodeInfoObtain);
                Trace.endSection();
                Trace.beginSection("calculateNodeWithAdjustedBounds");
                try {
                    SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().c(virtualViewId);
                    if (semanticsNodeWithAdjustedBounds == null) {
                        return null;
                    }
                    SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode();
                    Trace.beginSection("setParentForAccessibility");
                    int i2 = -1;
                    try {
                        if (virtualViewId == -1) {
                            ViewParent parentForAccessibility = this.view.getParentForAccessibility();
                            View view = parentForAccessibility instanceof View ? (View) parentForAccessibility : null;
                            fVar.f1056b = -1;
                            accessibilityNodeInfoObtain.setParent(view);
                        } else {
                            SemanticsNode parent = semanticsNode.getParent();
                            Integer numValueOf = parent != null ? Integer.valueOf(parent.getId()) : null;
                            if (numValueOf == null) {
                                InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("semanticsNode " + virtualViewId + " has null parent");
                                throw new KotlinNothingValueException();
                            }
                            int iIntValue = numValueOf.intValue();
                            if (iIntValue != this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
                                i2 = iIntValue;
                            }
                            AndroidComposeView androidComposeView = this.view;
                            fVar.f1056b = i2;
                            accessibilityNodeInfoObtain.setParent(androidComposeView, i2);
                        }
                        Trace.endSection();
                        AndroidComposeView androidComposeView2 = this.view;
                        fVar.f1057c = virtualViewId;
                        accessibilityNodeInfoObtain.setSource(androidComposeView2, virtualViewId);
                        Trace.beginSection("setBoundsInScreen");
                        try {
                            accessibilityNodeInfoObtain.setBoundsInScreen(boundsInScreen(semanticsNodeWithAdjustedBounds));
                            Trace.endSection();
                            Trace.beginSection("populateAccessibilityNodeInfoProperties");
                            try {
                                populateAccessibilityNodeInfoProperties(virtualViewId, fVar, semanticsNode);
                                return fVar;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final String createStateDescriptionForTextField(SemanticsNode node) {
        SemanticsConfiguration config = node.copyWithMergingEnabled$ui_release().getConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Collection collection = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getContentDescription());
        if (collection != null && !collection.isEmpty()) {
            return null;
        }
        Collection collection2 = (Collection) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getText());
        if (collection2 != null && !collection2.isEmpty()) {
            return null;
        }
        CharSequence charSequence = (CharSequence) SemanticsConfigurationKt.getOrNull(config, semanticsProperties.getEditableText());
        if (charSequence == null || charSequence.length() == 0) {
            return this.view.getContext().getResources().getString(R.string.state_empty);
        }
        return null;
    }

    private final AccessibilityEvent createTextSelectionChangedEvent(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventCreateEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventCreateEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventCreateEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventCreateEvent.getText().add(text);
        }
        return accessibilityEventCreateEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enabledStateListener$lambda$0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = z ? androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1) : CollectionsKt.emptyList();
    }

    private final void geometryDepthFirstSearch(SemanticsNode currNode, ArrayList<SemanticsNode> geometryList, C0639E containerMapToChildren) {
        boolean zIsRtl = AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(currNode);
        boolean zBooleanValue = ((Boolean) currNode.getUnmergedConfig().getOrElse(SemanticsProperties.INSTANCE.getIsTraversalGroup(), new Function0<Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$geometryDepthFirstSearch$isTraversalGroup$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                return Boolean.FALSE;
            }
        })).booleanValue();
        if ((zBooleanValue || isScreenReaderFocusable(currNode)) && getCurrentSemanticsNodes().b(currNode.getId())) {
            geometryList.add(currNode);
        }
        if (zBooleanValue) {
            containerMapToChildren.h(currNode.getId(), subtreeSortedByGeometryGrouping(zIsRtl, CollectionsKt.toMutableList((Collection) currNode.getChildren())));
            return;
        }
        List<SemanticsNode> children = currNode.getChildren();
        int size = children.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(children.get(i2), geometryList, containerMapToChildren);
        }
    }

    private final int getAccessibilitySelectionEnd(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m5716getEndimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    private final int getAccessibilitySelectionStart(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) || !node.getUnmergedConfig().contains(semanticsProperties.getTextSelectionRange())) ? this.accessibilityCursorPosition : TextRange.m5721getStartimpl(((TextRange) node.getUnmergedConfig().get(semanticsProperties.getTextSelectionRange())).getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AbstractC0662o getCurrentSemanticsNodes() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            Trace.beginSection("generateCurrentSemanticsNodes");
            try {
                AbstractC0662o allUncoveredSemanticsNodesToIntObjectMap = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
                Trace.endSection();
                this.currentSemanticsNodes = allUncoveredSemanticsNodesToIntObjectMap;
                if (isEnabled$ui_release()) {
                    Trace.beginSection("setTraversalValues");
                    try {
                        setTraversalValues();
                        Unit unit = Unit.INSTANCE;
                    } finally {
                    }
                }
            } finally {
            }
        }
        return this.currentSemanticsNodes;
    }

    public static /* synthetic */ void getHoveredVirtualViewId$ui_release$annotations() {
    }

    private final boolean getInfoIsCheckable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getRole());
        boolean z = toggleableState != null;
        if (((Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getSelected())) != null) {
            if (!(role != null ? Role.m5527equalsimpl0(role.getValue(), Role.INSTANCE.m5537getTabo7Vup1c()) : false)) {
                return true;
            }
        }
        return z;
    }

    private final String getInfoStateDescriptionOrNull(SemanticsNode node) throws Resources.NotFoundException {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        Object orNull = SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getStateDescription());
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getToggleableState());
        Role role = (Role) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getRole());
        if (toggleableState != null) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[toggleableState.ordinal()];
            if (i2 == 1) {
                if ((role == null ? false : Role.m5527equalsimpl0(role.getValue(), Role.INSTANCE.m5536getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.state_on);
                }
            } else if (i2 == 2) {
                if ((role == null ? false : Role.m5527equalsimpl0(role.getValue(), Role.INSTANCE.m5536getSwitcho7Vup1c())) && orNull == null) {
                    orNull = this.view.getContext().getResources().getString(R.string.state_off);
                }
            } else if (i2 == 3 && orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.indeterminate);
            }
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getSelected());
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if (!(role == null ? false : Role.m5527equalsimpl0(role.getValue(), Role.INSTANCE.m5537getTabo7Vup1c())) && orNull == null) {
                orNull = zBooleanValue ? this.view.getContext().getResources().getString(R.string.selected) : this.view.getContext().getResources().getString(R.string.not_selected);
            }
        }
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getProgressBarRangeInfo());
        if (progressBarRangeInfo != null) {
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.getIndeterminate()) {
                if (orNull == null) {
                    ClosedFloatingPointRange<Float> range = progressBarRangeInfo.getRange();
                    float current = ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) > 0.0f ? 1 : ((range.getEndInclusive().floatValue() - range.getStart().floatValue()) == 0.0f ? 0 : -1)) == 0 ? 0.0f : (progressBarRangeInfo.getCurrent() - range.getStart().floatValue()) / (range.getEndInclusive().floatValue() - range.getStart().floatValue());
                    if (current < 0.0f) {
                        current = 0.0f;
                    }
                    if (current > 1.0f) {
                        current = 1.0f;
                    }
                    if (!(current == 0.0f)) {
                        iCoerceIn = (current == 1.0f ? 1 : 0) != 0 ? 100 : RangesKt.coerceIn(Math.round(current * 100), 1, 99);
                    }
                    orNull = this.view.getContext().getResources().getString(R.string.template_percent, Integer.valueOf(iCoerceIn));
                }
            } else if (orNull == null) {
                orNull = this.view.getContext().getResources().getString(R.string.in_progress);
            }
        }
        if (node.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            orNull = createStateDescriptionForTextField(node);
        }
        return (String) orNull;
    }

    private final AnnotatedString getInfoText(SemanticsNode node) {
        AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getText());
        return textForTextField == null ? list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null : textForTextField;
    }

    private final String getIterableTextForAccessibility(SemanticsNode node) {
        AnnotatedString annotatedString;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription())) {
            return ListUtilsKt.fastJoinToString$default((List) node.getUnmergedConfig().get(semanticsProperties.getContentDescription()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().contains(semanticsProperties.getEditableText())) {
            AnnotatedString textForTextField = getTextForTextField(node.getUnmergedConfig());
            if (textForTextField != null) {
                return textForTextField.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getText());
        if (list == null || (annotatedString = (AnnotatedString) CollectionsKt.firstOrNull(list)) == null) {
            return null;
        }
        return annotatedString.getText();
    }

    private final AccessibilityIterators.TextSegmentIterator getIteratorForGranularity(SemanticsNode node, int granularity) {
        String iterableTextForAccessibility;
        TextLayoutResult textLayoutResult;
        if (node == null || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null || iterableTextForAccessibility.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            AccessibilityIterators.CharacterTextSegmentIterator companion = AccessibilityIterators.CharacterTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion.initialize(iterableTextForAccessibility);
            return companion;
        }
        if (granularity == 2) {
            AccessibilityIterators.WordTextSegmentIterator companion2 = AccessibilityIterators.WordTextSegmentIterator.INSTANCE.getInstance(this.view.getContext().getResources().getConfiguration().locale);
            companion2.initialize(iterableTextForAccessibility);
            return companion2;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                AccessibilityIterators.ParagraphTextSegmentIterator companion3 = AccessibilityIterators.ParagraphTextSegmentIterator.INSTANCE.getInstance();
                companion3.initialize(iterableTextForAccessibility);
                return companion3;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().contains(SemanticsActions.INSTANCE.getGetTextLayoutResult()) || (textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            AccessibilityIterators.LineTextSegmentIterator companion4 = AccessibilityIterators.LineTextSegmentIterator.INSTANCE.getInstance();
            companion4.initialize(iterableTextForAccessibility, textLayoutResult);
            return companion4;
        }
        AccessibilityIterators.PageTextSegmentIterator companion5 = AccessibilityIterators.PageTextSegmentIterator.INSTANCE.getInstance();
        companion5.initialize(iterableTextForAccessibility, textLayoutResult, node);
        return companion5;
    }

    public static /* synthetic */ void getOnSendAccessibilityEvent$ui_release$annotations() {
    }

    private final AnnotatedString getTextForTextField(SemanticsConfiguration semanticsConfiguration) {
        return (AnnotatedString) SemanticsConfigurationKt.getOrNull(semanticsConfiguration, SemanticsProperties.INSTANCE.getEditableText());
    }

    private final boolean isAccessibilityFocused(int virtualViewId) {
        return this.focusedVirtualViewId == virtualViewId;
    }

    private final boolean isAccessibilitySelectionExtendable(SemanticsNode node) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        return !unmergedConfig$ui_release.contains(semanticsProperties.getContentDescription()) && node.getUnmergedConfig().contains(semanticsProperties.getEditableText());
    }

    private final boolean isScreenReaderFocusable(SemanticsNode node) {
        List list = (List) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), SemanticsProperties.INSTANCE.getContentDescription());
        return node.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || (node.isUnmergedLeafNode$ui_release() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || getInfoText(node) != null || getInfoStateDescriptionOrNull(node) != null || getInfoIsCheckable(node)));
    }

    private final boolean isTouchExplorationEnabled() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifySubtreeAccessibilityStateChangedIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo7998trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:97:0x01af
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.processFallThroughCases(SwitchRegionMaker.java:105)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.process(SwitchRegionMaker.java:64)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:112)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:95)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v42 */
    /* JADX WARN: Type inference failed for: r1v43 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v55 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:96:0x01ae -> B:97:0x01af). Please report as a decompilation issue!!! */
    public final boolean performActionHelper(int r19, int r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 1880
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.performActionHelper(int, int, android.os.Bundle):boolean");
    }

    private static final boolean performActionHelper$canScroll(ScrollAxisRange scrollAxisRange, float f2) {
        if (f2 >= 0.0f || scrollAxisRange.getValue().invoke().floatValue() <= 0.0f) {
            return f2 > 0.0f && scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue();
        }
        return true;
    }

    private static final float performActionHelper$scrollDelta(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0370  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void populateAccessibilityNodeInfoProperties(int r22, x.f r23, androidx.compose.ui.semantics.SemanticsNode r24) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 2379
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.populateAccessibilityNodeInfoProperties(int, x.f, androidx.compose.ui.semantics.SemanticsNode):void");
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollBackward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() < scrollAxisRange.getMaxValue().invoke().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean populateAccessibilityNodeInfoProperties$canScrollForward(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.getValue().invoke().floatValue() >= scrollAxisRange.getMaxValue().invoke().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.getValue().invoke().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean registerScrollingId(int id, List<ScrollObservationScope> oldScrollObservationScopes) {
        boolean z;
        ScrollObservationScope scrollObservationScopeFindById = SemanticsUtils_androidKt.findById(oldScrollObservationScopes, id);
        if (scrollObservationScopeFindById != null) {
            z = false;
        } else {
            ScrollObservationScope scrollObservationScope = new ScrollObservationScope(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
            scrollObservationScopeFindById = scrollObservationScope;
        }
        this.scrollObservationScopes.add(scrollObservationScopeFindById);
        return z;
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!isTouchExplorationEnabled() || isAccessibilityFocused(virtualViewId)) {
            return false;
        }
        int i2 = this.focusedVirtualViewId;
        if (i2 != Integer.MIN_VALUE) {
            sendEventForVirtualView$default(this, i2, 65536, null, null, 12, null);
        }
        this.focusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        sendEventForVirtualView$default(this, virtualViewId, Fields.CompositingStrategy, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleScrollEventIfNeeded(final ScrollObservationScope scrollObservationScope) {
        if (scrollObservationScope.isValidOwnerScope()) {
            this.view.getSnapshotObserver().observeReads$ui_release(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.scheduleScrollEventIfNeeded.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode$ui_release;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.getValue().invoke().floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.getValue().invoke().floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iSemanticsNodeIdToAccessibilityVirtualNodeId = this.semanticsNodeIdToAccessibilityVirtualNodeId(scrollObservationScope.getSemanticsNodeId());
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().c(this.focusedVirtualViewId);
                        if (semanticsNodeWithAdjustedBounds != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                x.f fVar = androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI;
                                if (fVar != null) {
                                    fVar.f1055a.setBoundsInScreen(androidComposeViewAccessibilityDelegateCompat.boundsInScreen(semanticsNodeWithAdjustedBounds));
                                    Unit unit = Unit.INSTANCE;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.INSTANCE;
                            }
                        }
                        this.getView().invalidate();
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds2 = (SemanticsNodeWithAdjustedBounds) this.getCurrentSemanticsNodes().c(iSemanticsNodeIdToAccessibilityVirtualNodeId);
                        if (semanticsNodeWithAdjustedBounds2 != null && (semanticsNode = semanticsNodeWithAdjustedBounds2.getSemanticsNode()) != null && (layoutNode$ui_release = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingHorizontalScrollEvents.h(iSemanticsNodeIdToAccessibilityVirtualNodeId, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat2.pendingVerticalScrollEvents.h(iSemanticsNodeIdToAccessibilityVirtualNodeId, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat2.notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode$ui_release);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.setOldXValue(horizontalScrollAxisRange.getValue().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.setOldYValue(verticalScrollAxisRange.getValue().invoke());
                    }
                }
            });
        }
    }

    private final Comparator<SemanticsNode> semanticComparator(boolean layoutIsRtl) {
        return new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.INSTANCE.getZComparator$ui_release()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void semanticsChangeChecker$lambda$60(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.measureAndLayout$default(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.INSTANCE;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.checkForSemanticsChanges();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int semanticsNodeIdToAccessibilityVirtualNodeId(int id) {
        if (id == this.view.getSemanticsOwner().getUnmergedRootSemanticsNode().getId()) {
            return -1;
        }
        return id;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r17, androidx.compose.ui.platform.SemanticsNodeCopy r18) {
        /*
            r16 = this;
            r0 = r16
            int[] r1 = j.r.f861a
            j.F r1 = new j.F
            r1.<init>()
            java.util.List r2 = r17.getReplacedChildren$ui_release()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L13:
            if (r5 >= r3) goto L49
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.semantics.SemanticsNode r6 = (androidx.compose.ui.semantics.SemanticsNode) r6
            j.o r7 = r0.getCurrentSemanticsNodes()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L46
            j.F r7 = r18.getChildren()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3f
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeAccessibilityStateChangedIfNeeded(r1)
            return
        L3f:
            int r6 = r6.getId()
            r1.b(r6)
        L46:
            int r5 = r5 + 1
            goto L13
        L49:
            j.F r2 = r18.getChildren()
            int[] r3 = r2.f858b
            long[] r2 = r2.f857a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L9a
            r6 = r4
        L57:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L95
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L71:
            if (r11 >= r9) goto L93
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8f
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8f
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeAccessibilityStateChangedIfNeeded(r1)
            return
        L8f:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L71
        L93:
            if (r9 != r10) goto L9a
        L95:
            if (r6 == r5) goto L9a
            int r6 = r6 + 1
            goto L57
        L9a:
            java.util.List r1 = r17.getReplacedChildren$ui_release()
            int r2 = r1.size()
        La2:
            if (r4 >= r2) goto Lcd
            java.lang.Object r3 = r1.get(r4)
            androidx.compose.ui.semantics.SemanticsNode r3 = (androidx.compose.ui.semantics.SemanticsNode) r3
            j.o r5 = r0.getCurrentSemanticsNodes()
            int r6 = r3.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lca
            j.E r5 = r0.previousSemanticsNodes
            int r6 = r3.getId()
            java.lang.Object r5 = r5.c(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            androidx.compose.ui.platform.SemanticsNodeCopy r5 = (androidx.compose.ui.platform.SemanticsNodeCopy) r5
            r0.sendAccessibilitySemanticsStructureChangeEvents(r3, r5)
        Lca:
            int r4 = r4 + 1
            goto La2
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendAccessibilitySemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    private final boolean sendEvent(AccessibilityEvent event) {
        if (!isEnabled$ui_release()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.invoke(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean sendEventForVirtualView(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !isEnabled$ui_release()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventCreateEvent.setContentDescription(ListUtilsKt.fastJoinToString$default(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        Trace.beginSection("sendEvent");
        try {
            return sendEvent(accessibilityEventCreateEvent);
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ boolean sendEventForVirtualView$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i2, int i3, Integer num, List list, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            num = null;
        }
        if ((i4 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.sendEventForVirtualView(i2, i3, num, list);
    }

    private final void sendPaneChangeEvents(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(semanticsNodeId), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventCreateEvent.getText().add(title);
        }
        sendEvent(accessibilityEventCreateEvent);
    }

    private final void sendPendingTextTraversedAtGranularityEvent(int semanticsNodeId) {
        PendingTextTraversedEvent pendingTextTraversedEvent = this.pendingTextTraversedEvent;
        if (pendingTextTraversedEvent != null) {
            if (semanticsNodeId != pendingTextTraversedEvent.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - pendingTextTraversedEvent.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsNodeIdToAccessibilityVirtualNodeId(pendingTextTraversedEvent.getNode().getId()), Fields.RenderEffect);
                accessibilityEventCreateEvent.setFromIndex(pendingTextTraversedEvent.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(pendingTextTraversedEvent.getToIndex());
                accessibilityEventCreateEvent.setAction(pendingTextTraversedEvent.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(pendingTextTraversedEvent.getGranularity());
                accessibilityEventCreateEvent.getText().add(getIterableTextForAccessibility(pendingTextTraversedEvent.getNode()));
                sendEvent(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0552  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsPropertyChangeEvents(j.AbstractC0662o r38) {
        /*
            Method dump skipped, instructions count: 1533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sendSemanticsPropertyChangeEvents(j.o):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v12, types: [T, androidx.compose.ui.node.LayoutNode] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v3, types: [T, androidx.compose.ui.node.LayoutNode] */
    private final void sendSubtreeChangeAccessibilityEvents(LayoutNode layoutNode, C0640F subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration collapsedSemantics$ui_release;
        ?? FindClosestParentNode;
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int i2 = this.subtreeChangedLayoutNodes.f830c;
            for (int i3 = 0; i3 < i2; i3++) {
                if (SemanticsUtils_androidKt.isAncestorOf((LayoutNode) this.subtreeChangedLayoutNodes.f829b[i3], layoutNode)) {
                    return;
                }
            }
            Trace.beginSection("GetSemanticsNode");
            try {
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                ?? FindClosestParentNode2 = layoutNode.getNodes().m5316hasH91voCI$ui_release(NodeKind.m5355constructorimpl(8)) ? layoutNode : AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$id$1$semanticsNode$1
                    @Override // kotlin.jvm.functions.Function1
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().m5316hasH91voCI$ui_release(NodeKind.m5355constructorimpl(8)));
                    }
                });
                objectRef.element = FindClosestParentNode2;
                if (FindClosestParentNode2 != 0 && (collapsedSemantics$ui_release = FindClosestParentNode2.getCollapsedSemantics$ui_release()) != null) {
                    if (!collapsedSemantics$ui_release.getIsMergingSemanticsOfDescendants() && (FindClosestParentNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.findClosestParentNode((LayoutNode) objectRef.element, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$id$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final Boolean invoke(LayoutNode layoutNode2) {
                            SemanticsConfiguration collapsedSemantics$ui_release2 = layoutNode2.getCollapsedSemantics$ui_release();
                            boolean z = false;
                            if (collapsedSemantics$ui_release2 != null && collapsedSemantics$ui_release2.getIsMergingSemanticsOfDescendants()) {
                                z = true;
                            }
                            return Boolean.valueOf(z);
                        }
                    })) != 0) {
                        objectRef.element = FindClosestParentNode;
                    }
                    LayoutNode layoutNode2 = (LayoutNode) objectRef.element;
                    if (layoutNode2 == null) {
                        Trace.endSection();
                        return;
                    }
                    int semanticsId = layoutNode2.getSemanticsId();
                    Trace.endSection();
                    if (subtreeChangedSemanticsNodesIds.b(semanticsId)) {
                        sendEventForVirtualView$default(this, semanticsNodeIdToAccessibilityVirtualNodeId(semanticsId), Fields.CameraDistance, 1, null, 8, null);
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
    }

    private final void sendTypeViewScrolledAccessibilityEvent(LayoutNode layoutNode) {
        if (layoutNode.isAttached() && !this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRange = (ScrollAxisRange) this.pendingHorizontalScrollEvents.c(semanticsId);
            ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) this.pendingVerticalScrollEvents.c(semanticsId);
            if (scrollAxisRange == null && scrollAxisRange2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRange != null) {
                accessibilityEventCreateEvent.setScrollX((int) scrollAxisRange.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) scrollAxisRange.getMaxValue().invoke().floatValue());
            }
            if (scrollAxisRange2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) scrollAxisRange2.getValue().invoke().floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) scrollAxisRange2.getMaxValue().invoke().floatValue());
            }
            sendEvent(accessibilityEventCreateEvent);
        }
    }

    private final boolean setAccessibilitySelection(SemanticsNode node, int start, int end, boolean traversalMode) {
        String iterableTextForAccessibility;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsActions.getSetSelection()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.enabled(node)) {
            Function3 function3 = (Function3) ((AccessibilityAction) node.getUnmergedConfig().get(semanticsActions.getSetSelection())).getAction();
            if (function3 != null) {
                return ((Boolean) function3.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (iterableTextForAccessibility = getIterableTextForAccessibility(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > iterableTextForAccessibility.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z = iterableTextForAccessibility.length() > 0;
        sendEvent(createTextSelectionChangedEvent(semanticsNodeIdToAccessibilityVirtualNodeId(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(iterableTextForAccessibility.length()) : null, iterableTextForAccessibility));
        sendPendingTextTraversedAtGranularityEvent(node.getId());
        return true;
    }

    private final void setContentInvalid(SemanticsNode node, x.f info) {
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getError())) {
            info.f1055a.setContentInvalid(true);
            info.f1055a.setError((CharSequence) SemanticsConfigurationKt.getOrNull(node.getUnmergedConfig(), semanticsProperties.getError()));
        }
    }

    private final void setIsCheckable(SemanticsNode node, x.f info) {
        info.f1055a.setCheckable(getInfoIsCheckable(node));
    }

    private final void setStateDescription(SemanticsNode node, x.f info) throws Resources.NotFoundException {
        String infoStateDescriptionOrNull = getInfoStateDescriptionOrNull(node);
        int i2 = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = info.f1055a;
        if (i2 >= 30) {
            AbstractC0546d.e(accessibilityNodeInfo, infoStateDescriptionOrNull);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", infoStateDescriptionOrNull);
        }
    }

    private final void setText(SemanticsNode node, x.f info) {
        AnnotatedString infoText = getInfoText(node);
        info.f1055a.setText(infoText != null ? toSpannableString(infoText) : null);
    }

    private final void setTraversalValues() {
        this.idToBeforeMap.d();
        this.idToAfterMap.d();
        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) getCurrentSemanticsNodes().c(-1);
        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
        Intrinsics.checkNotNull(semanticsNode);
        List<SemanticsNode> listSubtreeSortedByGeometryGrouping = subtreeSortedByGeometryGrouping(AndroidComposeViewAccessibilityDelegateCompat_androidKt.isRtl(semanticsNode), CollectionsKt.mutableListOf(semanticsNode));
        int lastIndex = CollectionsKt.getLastIndex(listSubtreeSortedByGeometryGrouping);
        int i2 = 1;
        if (1 > lastIndex) {
            return;
        }
        while (true) {
            int id = listSubtreeSortedByGeometryGrouping.get(i2 - 1).getId();
            int id2 = listSubtreeSortedByGeometryGrouping.get(i2).getId();
            this.idToBeforeMap.g(id, id2);
            this.idToAfterMap.g(id2, id);
            if (i2 == lastIndex) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final List<SemanticsNode> sortByGeometryGroupings(boolean layoutIsRtl, ArrayList<SemanticsNode> parentListToSort, C0639E containerChildrenMapping) {
        ArrayList arrayList = new ArrayList();
        int lastIndex = CollectionsKt.getLastIndex(parentListToSort);
        int size = 0;
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                SemanticsNode semanticsNode = parentListToSort.get(i2);
                if (i2 == 0 || !sortByGeometryGroupings$placedEntryRowOverlaps(arrayList, semanticsNode)) {
                    arrayList.add(new Pair(semanticsNode.getBoundsInWindow(), CollectionsKt.mutableListOf(semanticsNode)));
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        CollectionsKt.sortWith(arrayList, TopBottomBoundsComparator.INSTANCE);
        ArrayList arrayList2 = new ArrayList();
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            Pair pair = (Pair) arrayList.get(i3);
            CollectionsKt.sortWith((List) pair.getSecond(), new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$2(new AndroidComposeViewAccessibilityDelegateCompat$semanticComparator$$inlined$thenBy$1(layoutIsRtl ? RtlBoundsComparator.INSTANCE : LtrBoundsComparator.INSTANCE, LayoutNode.INSTANCE.getZComparator$ui_release())));
            arrayList2.addAll((Collection) pair.getSecond());
        }
        final AnonymousClass2 anonymousClass2 = new Function2<SemanticsNode, SemanticsNode, Integer>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(SemanticsNode semanticsNode2, SemanticsNode semanticsNode3) {
                SemanticsConfiguration unmergedConfig$ui_release = semanticsNode2.getUnmergedConfig();
                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                return Integer.valueOf(Float.compare(((Number) unmergedConfig$ui_release.getOrElse(semanticsProperties.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue(), ((Number) semanticsNode3.getUnmergedConfig().getOrElse(semanticsProperties.getTraversalIndex(), new Function0<Float>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings.2.2
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(0.0f);
                    }
                })).floatValue()));
            }
        };
        CollectionsKt.sortWith(arrayList2, new Comparator() { // from class: androidx.compose.ui.platform.e
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return AndroidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings$lambda$15(anonymousClass2, obj, obj2);
            }
        });
        while (size <= CollectionsKt.getLastIndex(arrayList2)) {
            List list = (List) containerChildrenMapping.c(((SemanticsNode) arrayList2.get(size)).getId());
            if (list != null) {
                if (isScreenReaderFocusable((SemanticsNode) arrayList2.get(size))) {
                    size++;
                } else {
                    arrayList2.remove(size);
                }
                arrayList2.addAll(size, list);
                size += list.size();
            } else {
                size++;
            }
        }
        return arrayList2;
    }

    public static List sortByGeometryGroupings$default(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z, ArrayList arrayList, C0639E c0639e, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            C0639E c0639e2 = AbstractC0663p.f856a;
            c0639e = new C0639E();
        }
        return androidComposeViewAccessibilityDelegateCompat.sortByGeometryGroupings(z, arrayList, c0639e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int sortByGeometryGroupings$lambda$15(Function2 function2, Object obj, Object obj2) {
        return ((Number) function2.invoke(obj, obj2)).intValue();
    }

    private static final boolean sortByGeometryGroupings$placedEntryRowOverlaps(ArrayList<Pair<Rect, List<SemanticsNode>>> arrayList, SemanticsNode semanticsNode) {
        float top = semanticsNode.getBoundsInWindow().getTop();
        float bottom = semanticsNode.getBoundsInWindow().getBottom();
        boolean z = top >= bottom;
        int lastIndex = CollectionsKt.getLastIndex(arrayList);
        if (lastIndex >= 0) {
            int i2 = 0;
            while (true) {
                Rect first = arrayList.get(i2).getFirst();
                boolean z2 = first.getTop() >= first.getBottom();
                if (!z && !z2 && Math.max(top, first.getTop()) < Math.min(bottom, first.getBottom())) {
                    arrayList.set(i2, new Pair<>(first.intersect(0.0f, top, Float.POSITIVE_INFINITY, bottom), arrayList.get(i2).getSecond()));
                    arrayList.get(i2).getSecond().add(semanticsNode);
                    return true;
                }
                if (i2 == lastIndex) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    private final List<SemanticsNode> subtreeSortedByGeometryGrouping(boolean layoutIsRtl, List<SemanticsNode> listToSort) {
        C0639E c0639e = AbstractC0663p.f856a;
        C0639E c0639e2 = new C0639E();
        ArrayList<SemanticsNode> arrayList = new ArrayList<>();
        int size = listToSort.size();
        for (int i2 = 0; i2 < size; i2++) {
            geometryDepthFirstSearch(listToSort.get(i2), arrayList, c0639e2);
        }
        return sortByGeometryGroupings(layoutIsRtl, arrayList, c0639e2);
    }

    private final RectF toScreenCoords(SemanticsNode textNode, Rect bounds) {
        if (textNode == null) {
            return null;
        }
        Rect rectM3588translatek4lQ0M = bounds.m3588translatek4lQ0M(textNode.m5539getPositionInRootF1C5BW0());
        Rect boundsInRoot = textNode.getBoundsInRoot();
        Rect rectIntersect = rectM3588translatek4lQ0M.overlaps(boundsInRoot) ? rectM3588translatek4lQ0M.intersect(boundsInRoot) : null;
        if (rectIntersect == null) {
            return null;
        }
        long jMo5073localToScreenMKHz9U = this.view.mo5073localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getLeft(), rectIntersect.getTop()));
        long jMo5073localToScreenMKHz9U2 = this.view.mo5073localToScreenMKHz9U(OffsetKt.Offset(rectIntersect.getRight(), rectIntersect.getBottom()));
        return new RectF(Offset.m3551getXimpl(jMo5073localToScreenMKHz9U), Offset.m3552getYimpl(jMo5073localToScreenMKHz9U), Offset.m3551getXimpl(jMo5073localToScreenMKHz9U2), Offset.m3552getYimpl(jMo5073localToScreenMKHz9U2));
    }

    private final SpannableString toSpannableString(AnnotatedString annotatedString) {
        return (SpannableString) trimToSize(AndroidAccessibilitySpannableString_androidKt.toAccessibilitySpannableString(annotatedString, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), ParcelSafeTextLength);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void touchExplorationStateListener$lambda$1(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, boolean z) {
        androidComposeViewAccessibilityDelegateCompat.enabledServices = androidComposeViewAccessibilityDelegateCompat.accessibilityManager.getEnabledAccessibilityServiceList(-1);
    }

    private final boolean traverseAtGranularity(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int accessibilitySelectionStart;
        int i2;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String iterableTextForAccessibility = getIterableTextForAccessibility(node);
        boolean z = false;
        if (iterableTextForAccessibility != null && iterableTextForAccessibility.length() != 0) {
            AccessibilityIterators.TextSegmentIterator iteratorForGranularity = getIteratorForGranularity(node, granularity);
            if (iteratorForGranularity == null) {
                return false;
            }
            int accessibilitySelectionEnd = getAccessibilitySelectionEnd(node);
            if (accessibilitySelectionEnd == -1) {
                accessibilitySelectionEnd = forward ? 0 : iterableTextForAccessibility.length();
            }
            int[] iArrFollowing = forward ? iteratorForGranularity.following(accessibilitySelectionEnd) : iteratorForGranularity.preceding(accessibilitySelectionEnd);
            if (iArrFollowing == null) {
                return false;
            }
            int i3 = iArrFollowing[0];
            z = true;
            int i4 = iArrFollowing[1];
            if (extendSelection && isAccessibilitySelectionExtendable(node)) {
                accessibilitySelectionStart = getAccessibilitySelectionStart(node);
                if (accessibilitySelectionStart == -1) {
                    accessibilitySelectionStart = forward ? i3 : i4;
                }
                i2 = forward ? i4 : i3;
            } else {
                accessibilitySelectionStart = forward ? i4 : i3;
                i2 = accessibilitySelectionStart;
            }
            this.pendingTextTraversedEvent = new PendingTextTraversedEvent(node, forward ? Fields.RotationX : 512, granularity, i3, i4, SystemClock.uptimeMillis());
            setAccessibilitySelection(node, accessibilitySelectionStart, i2, true);
        }
        return z;
    }

    private final <T extends CharSequence> T trimToSize(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i2 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i2)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i2;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i2 = this.hoveredVirtualViewId;
        if (i2 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        sendEventForVirtualView$default(this, virtualViewId, 128, null, null, 12, null);
        sendEventForVirtualView$default(this, i2, Fields.RotationX, null, null, 12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0161, code lost:
    
        r28 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016b, code lost:
    
        if (((r6 & ((~r6) << 6)) & r23) == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x016d, code lost:
    
        r25 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsNodesCopyAndPanes() {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.updateSemanticsNodesCopyAndPanes():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f0, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r7, r1) == r2) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #0 {all -> 0x0055, blocks: (B:56:0x00f5, B:27:0x0067, B:31:0x007a, B:33:0x0082, B:57:0x00fa, B:58:0x00fd, B:20:0x0051, B:13:0x0034, B:55:0x00f3, B:34:0x008a, B:36:0x0090, B:38:0x0097, B:40:0x00a9, B:42:0x00b4, B:44:0x00ba, B:45:0x00bd, B:47:0x00bf, B:48:0x00c2, B:49:0x00c3, B:51:0x00ca, B:52:0x00d3), top: B:65:0x0022, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00f0 -> B:14:0x0037). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r12) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: canScroll-0AR0LA0$ui_release, reason: not valid java name */
    public final boolean m5447canScroll0AR0LA0$ui_release(boolean vertical, int direction, long position) {
        if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return m5446canScrollmoWRBKg(getCurrentSemanticsNodes(), vertical, direction, position);
        }
        return false;
    }

    public final boolean dispatchHoverEvent$ui_release(MotionEvent event) {
        if (!isTouchExplorationEnabled()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iHitTestSemanticsAt$ui_release = hitTestSemanticsAt$ui_release(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(iHitTestSemanticsAt$ui_release);
            if (iHitTestSemanticsAt$ui_release == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(Integer.MIN_VALUE);
        return true;
    }

    /* renamed from: getAccessibilityForceEnabledForTesting$ui_release, reason: from getter */
    public final boolean getAccessibilityForceEnabledForTesting() {
        return this.accessibilityForceEnabledForTesting;
    }

    @Override // androidx.core.view.AbstractC0544b
    public x.i getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    /* renamed from: getExtraDataTestTraversalAfterVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* renamed from: getExtraDataTestTraversalBeforeVal$ui_release, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* renamed from: getHoveredVirtualViewId$ui_release, reason: from getter */
    public final int getHoveredVirtualViewId() {
        return this.hoveredVirtualViewId;
    }

    /* renamed from: getIdToAfterMap$ui_release, reason: from getter */
    public final C0637C getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* renamed from: getIdToBeforeMap$ui_release, reason: from getter */
    public final C0637C getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    public final Function1<AccessibilityEvent, Boolean> getOnSendAccessibilityEvent$ui_release() {
        return this.onSendAccessibilityEvent;
    }

    /* renamed from: getSendRecurringAccessibilityEventsIntervalMillis$ui_release, reason: from getter */
    public final long getSendRecurringAccessibilityEventsIntervalMillis() {
        return this.SendRecurringAccessibilityEventsIntervalMillis;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int hitTestSemanticsAt$ui_release(float x2, float y2) {
        NodeChain nodes;
        Owner.measureAndLayout$default(this.view, false, 1, null);
        HitTestResult hitTestResult = new HitTestResult();
        LayoutNode.m5269hitTestSemanticsM_7yMNQ$ui_release$default(this.view.getRoot(), OffsetKt.Offset(x2, y2), hitTestResult, false, false, 12, null);
        Modifier.Node node = (Modifier.Node) CollectionsKt.lastOrNull((List) hitTestResult);
        LayoutNode layoutNodeRequireLayoutNode = node != null ? DelegatableNodeKt.requireLayoutNode(node) : null;
        if (layoutNodeRequireLayoutNode != null && (nodes = layoutNodeRequireLayoutNode.getNodes()) != null && nodes.m5316hasH91voCI$ui_release(NodeKind.m5355constructorimpl(8)) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.isVisible(SemanticsNodeKt.SemanticsNode(layoutNodeRequireLayoutNode, false)) && this.view.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(layoutNodeRequireLayoutNode) == null) {
            return semanticsNodeIdToAccessibilityVirtualNodeId(layoutNodeRequireLayoutNode.getSemanticsId());
        }
        return Integer.MIN_VALUE;
    }

    public final boolean isEnabled$ui_release() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !this.enabledServices.isEmpty();
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeAccessibilityStateChangedIfNeeded(layoutNode);
        }
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.semanticsChangeChecker);
    }

    public final void setAccessibilityForceEnabledForTesting$ui_release(boolean z) {
        this.accessibilityForceEnabledForTesting = z;
        this.currentSemanticsNodesInvalidated = true;
    }

    public final void setHoveredVirtualViewId$ui_release(int i2) {
        this.hoveredVirtualViewId = i2;
    }

    public final void setIdToAfterMap$ui_release(C0637C c0637c) {
        this.idToAfterMap = c0637c;
    }

    public final void setIdToBeforeMap$ui_release(C0637C c0637c) {
        this.idToBeforeMap = c0637c;
    }

    public final void setOnSendAccessibilityEvent$ui_release(Function1<? super AccessibilityEvent, Boolean> function1) {
        this.onSendAccessibilityEvent = function1;
    }

    public final void setSendRecurringAccessibilityEventsIntervalMillis$ui_release(long j2) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j2;
    }
}
