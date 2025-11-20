package androidx.compose.ui.contentcapture;

import B.x;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.SemanticsNodeCopy;
import androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds;
import androidx.compose.ui.platform.SemanticsUtils_androidKt;
import androidx.compose.ui.platform.coreshims.AutofillIdCompat;
import androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat;
import androidx.compose.ui.platform.coreshims.ViewCompatShims;
import androidx.compose.ui.platform.coreshims.ViewStructureCompat;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.lifecycle.InterfaceC0572e;
import androidx.lifecycle.InterfaceC0587u;
import j.AbstractC0662o;
import j.AbstractC0663p;
import j.C0639E;
import j.C0640F;
import j.C0654g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;

@Metadata(d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0098\u0001\u0099\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\rH\u0080@¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010\"\u001a\u00020\rH\u0000¢\u0006\u0004\b!\u0010\u001aJ\u000f\u0010$\u001a\u00020\rH\u0000¢\u0006\u0004\b#\u0010\u001aJ\u000f\u0010&\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010\u001aJ/\u00100\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u000e\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010,0+H\u0001¢\u0006\u0004\b.\u0010/J'\u00107\u001a\u00020\r2\u0006\u00101\u001a\u00020\u00002\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010302H\u0001¢\u0006\u0004\b5\u00106J\u001f\u0010<\u001a\u00020\r2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\r2\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:H\u0002¢\u0006\u0004\b>\u0010=J\u001d\u0010B\u001a\u00020\r2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0?H\u0002¢\u0006\u0004\bB\u0010CJ\u001f\u0010H\u001a\u00020\r2\u0006\u0010E\u001a\u00020D2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u000f\u0010J\u001a\u00020\rH\u0002¢\u0006\u0004\bJ\u0010\u001aJ\u0017\u0010K\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\bK\u0010\u001fJ\u0015\u0010M\u001a\u0004\u0018\u00010L*\u000208H\u0002¢\u0006\u0004\bM\u0010NJ!\u0010Q\u001a\u00020\r2\u0006\u0010O\u001a\u00020D2\b\u0010P\u001a\u0004\u0018\u00010LH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020\r2\u0006\u0010O\u001a\u00020DH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\rH\u0002¢\u0006\u0004\bU\u0010\u001aJ\u0017\u0010W\u001a\u00020\r2\u0006\u0010V\u001a\u000208H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\r2\u0006\u0010V\u001a\u000208H\u0002¢\u0006\u0004\bY\u0010XJ\u0017\u0010Z\u001a\u00020\r2\u0006\u0010V\u001a\u000208H\u0002¢\u0006\u0004\bZ\u0010XJ\u000f\u0010[\u001a\u00020\rH\u0002¢\u0006\u0004\b[\u0010\u001aJ\u000f\u0010\\\u001a\u00020\rH\u0002¢\u0006\u0004\b\\\u0010\u001aJ\u000f\u0010]\u001a\u00020\rH\u0002¢\u0006\u0004\b]\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010^\u001a\u0004\b_\u0010`R*\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010f\u001a\u0004\u0018\u00010\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bf\u0010g\u0012\u0004\bl\u0010\u001a\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020L0m8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0016\u0010t\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0016\u0010w\u001a\u00020v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010z\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u001c0|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001d\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R.\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020@0?8@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0005\b\u008b\u0001\u0010CR\u0018\u0010\u008c\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010uR\u001e\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020:0m8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010oR\u0019\u0010\u008e\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0018\u0010\u0090\u0001\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010{R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0097\u0001\u001a\u00020y8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u0096\u0001\u0010\u001a\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u009a\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Landroidx/compose/ui/contentcapture/ContentCaptureManager;", "Landroidx/lifecycle/e;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Landroidx/lifecycle/u;", "owner", "onStart", "(Landroidx/lifecycle/u;)V", "onStop", "boundsUpdatesEventLoop$ui_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "boundsUpdatesEventLoop", "onSemanticsChange$ui_release", "()V", "onSemanticsChange", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "onLayoutChange$ui_release", "(Landroidx/compose/ui/node/LayoutNode;)V", "onLayoutChange", "onShowTranslation$ui_release", "onShowTranslation", "onHideTranslation$ui_release", "onHideTranslation", "onClearTranslation$ui_release", "onClearTranslation", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "onCreateVirtualViewTranslationRequests$ui_release", "([J[ILjava/util/function/Consumer;)V", "onCreateVirtualViewTranslationRequests", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "onVirtualViewTranslationResponses$ui_release", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "onVirtualViewTranslationResponses", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "oldNode", "sendSemanticsStructureChangeEvents", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/platform/SemanticsNodeCopy;)V", "sendContentCaptureStructureChangeEvents", "Lj/o;", "Landroidx/compose/ui/platform/SemanticsNodeWithAdjustedBounds;", "newSemanticsNodes", "checkForContentCapturePropertyChanges", "(Lj/o;)V", "", "id", "", "newText", "sendContentCaptureTextUpdateEvent", "(ILjava/lang/String;)V", "updateSemanticsCopy", "notifySubtreeStateChangeIfNeeded", "Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "toViewStructure", "(Landroidx/compose/ui/semantics/SemanticsNode;)Landroidx/compose/ui/platform/coreshims/ViewStructureCompat;", "virtualId", "viewStructure", "bufferContentCaptureViewAppeared", "(ILandroidx/compose/ui/platform/coreshims/ViewStructureCompat;)V", "bufferContentCaptureViewDisappeared", "(I)V", "notifyContentCaptureChanges", "node", "updateBuffersOnAppeared", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "updateBuffersOnDisappeared", "updateTranslationOnAppeared", "showTranslatedText", "hideTranslatedText", "clearTranslatedText", "Landroidx/compose/ui/platform/AndroidComposeView;", "getView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "contentCaptureSession", "Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "getContentCaptureSession$ui_release", "()Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", "setContentCaptureSession$ui_release", "(Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;)V", "getContentCaptureSession$ui_release$annotations", "Lj/E;", "bufferedAppearedNodes", "Lj/E;", "Lj/F;", "bufferedDisappearedNodes", "Lj/F;", "", "SendRecurringContentCaptureEventsIntervalMillis", "J", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "currentSemanticsNodesInvalidated", "Z", "Lj/g;", "subtreeChangedLayoutNodes", "Lj/g;", "Lkotlinx/coroutines/channels/Channel;", "boundsUpdateChannel", "Lkotlinx/coroutines/channels/Channel;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler$ui_release", "()Landroid/os/Handler;", "currentSemanticsNodes", "Lj/o;", "getCurrentSemanticsNodes$ui_release", "()Lj/o;", "setCurrentSemanticsNodes$ui_release", "currentSemanticsNodesSnapshotTimestampMillis", "previousSemanticsNodes", "previousSemanticsRoot", "Landroidx/compose/ui/platform/SemanticsNodeCopy;", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "Ljava/lang/Runnable;", "isEnabled$ui_release", "()Z", "isEnabled$ui_release$annotations", "isEnabled", "TranslateStatus", "ViewTranslationHelperMethods", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidContentCaptureManager implements ContentCaptureManager, InterfaceC0572e, View.OnAttachStateChangeListener {
    public static final int $stable = 8;
    private boolean checkingForSemanticsChanges;
    private final Runnable contentCaptureChangeChecker;
    private ContentCaptureSessionCompat contentCaptureSession;
    private AbstractC0662o currentSemanticsNodes;
    private long currentSemanticsNodesSnapshotTimestampMillis;
    private Function0<? extends ContentCaptureSessionCompat> onContentCaptureSession;
    private C0639E previousSemanticsNodes;
    private SemanticsNodeCopy previousSemanticsRoot;
    private final AndroidComposeView view;
    private final C0639E bufferedAppearedNodes = new C0639E();
    private final C0640F bufferedDisappearedNodes = new C0640F();
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;
    private boolean currentSemanticsNodesInvalidated = true;
    private final C0654g subtreeChangedLayoutNodes = new C0654g();
    private final Channel<Unit> boundsUpdateChannel = ChannelKt.Channel$default(1, null, null, 6, null);
    private final Handler handler = new Handler(Looper.getMainLooper());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "(Ljava/lang/String;I)V", "SHOW_ORIGINAL", "SHOW_TRANSLATED", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0002J0\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007J \u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\u0007¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$ViewTranslationHelperMethods;", "", "()V", "doTranslation", "", "contentCaptureManager", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "response", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "onCreateVirtualViewTranslationRequests", "virtualIds", "", "supportedFormats", "", "requestsCollector", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "onVirtualViewTranslationResponses", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ViewTranslationHelperMethods {
        public static final ViewTranslationHelperMethods INSTANCE = new ViewTranslationHelperMethods();

        private ViewTranslationHelperMethods() {
        }

        private final void doTranslation(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds;
            SemanticsNode semanticsNode;
            AccessibilityAction accessibilityAction;
            Function1 function1;
            w.b bVar = new w.b(response);
            while (bVar.hasNext()) {
                long jNextLong = bVar.nextLong();
                ViewTranslationResponse viewTranslationResponseO = a.o(response.get(jNextLong));
                if (viewTranslationResponseO != null && (value = viewTranslationResponseO.getValue("android:text")) != null && (text = value.getText()) != null && (semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) contentCaptureManager.getCurrentSemanticsNodes$ui_release().c((int) jNextLong)) != null && (semanticsNode = semanticsNodeWithAdjustedBounds.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), SemanticsActions.INSTANCE.getSetTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void onVirtualViewTranslationResponses$lambda$1(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            INSTANCE.doTranslation(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onCreateVirtualViewTranslationRequests(androidx.compose.ui.contentcapture.AndroidContentCaptureManager r21, long[] r22, int[] r23, java.util.function.Consumer<android.view.translation.ViewTranslationRequest> r24) {
            /*
                r20 = this;
                r0 = r22
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L75
                r3 = r0[r2]
                j.o r5 = r21.getCurrentSemanticsNodes$ui_release()
                int r3 = (int) r3
                java.lang.Object r3 = r5.c(r3)
                androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r3 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r3
                if (r3 == 0) goto L70
                androidx.compose.ui.semantics.SemanticsNode r3 = r3.getSemanticsNode()
                if (r3 == 0) goto L70
                androidx.compose.ui.contentcapture.a.q()
                androidx.compose.ui.platform.AndroidComposeView r4 = r21.getView()
                android.view.autofill.AutofillId r4 = androidx.compose.material3.internal.b.h(r4)
                int r5 = r3.getId()
                long r5 = (long) r5
                android.view.translation.ViewTranslationRequest$Builder r4 = androidx.compose.ui.contentcapture.a.m(r4, r5)
                androidx.compose.ui.semantics.SemanticsConfiguration r3 = r3.getUnmergedConfig()
                androidx.compose.ui.semantics.SemanticsProperties r5 = androidx.compose.ui.semantics.SemanticsProperties.INSTANCE
                androidx.compose.ui.semantics.SemanticsPropertyKey r5 = r5.getText()
                java.lang.Object r3 = androidx.compose.ui.semantics.SemanticsConfigurationKt.getOrNull(r3, r5)
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                if (r5 == 0) goto L70
                r10 = 0
                r11 = 0
                java.lang.String r6 = "\n"
                r7 = 0
                r8 = 0
                r9 = 0
                r12 = 62
                r13 = 0
                java.lang.String r15 = androidx.compose.ui.util.ListUtilsKt.fastJoinToString$default(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                if (r15 == 0) goto L70
                androidx.compose.ui.text.AnnotatedString r14 = new androidx.compose.ui.text.AnnotatedString
                r18 = 6
                r19 = 0
                r16 = 0
                r17 = 0
                r14.<init>(r15, r16, r17, r18, r19)
                android.view.translation.TranslationRequestValue r3 = androidx.compose.ui.contentcapture.a.j(r14)
                androidx.compose.ui.contentcapture.a.z(r4, r3)
                android.view.translation.ViewTranslationRequest r3 = androidx.compose.ui.contentcapture.a.n(r4)
                r4 = r24
                r4.accept(r3)
                goto L72
            L70:
                r4 = r24
            L72:
                int r2 = r2 + 1
                goto L4
            L75:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.ViewTranslationHelperMethods.onCreateVirtualViewTranslationRequests(androidx.compose.ui.contentcapture.AndroidContentCaptureManager, long[], int[], java.util.function.Consumer):void");
        }

        public final void onVirtualViewTranslationResponses(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.areEqual(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                doTranslation(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.ViewTranslationHelperMethods.onVirtualViewTranslationResponses$lambda$1(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends ContentCaptureSessionCompat> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        C0639E c0639e = AbstractC0663p.f856a;
        Intrinsics.checkNotNull(c0639e, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.currentSemanticsNodes = c0639e;
        this.previousSemanticsNodes = new C0639E();
        SemanticsNode unmergedRootSemanticsNode = androidComposeView.getSemanticsOwner().getUnmergedRootSemanticsNode();
        Intrinsics.checkNotNull(c0639e, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.previousSemanticsRoot = new SemanticsNodeCopy(unmergedRootSemanticsNode, c0639e);
        this.contentCaptureChangeChecker = new x(this, 2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0072, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0074, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bufferContentCaptureViewAppeared(int r14, androidx.compose.ui.platform.coreshims.ViewStructureCompat r15) {
        /*
            r13 = this;
            if (r15 != 0) goto L4
            goto L7a
        L4:
            j.F r0 = r13.bufferedDisappearedNodes
            boolean r0 = r0.a(r14)
            if (r0 == 0) goto L80
            j.F r0 = r13.bufferedDisappearedNodes
            r0.getClass()
            int r15 = java.lang.Integer.hashCode(r14)
            r1 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r15 = r15 * r1
            int r1 = r15 << 16
            r15 = r15 ^ r1
            r1 = r15 & 127(0x7f, float:1.78E-43)
            int r2 = r0.f859c
            int r15 = r15 >>> 7
            r15 = r15 & r2
            r3 = 0
        L24:
            long[] r4 = r0.f857a
            int r5 = r15 >> 3
            r6 = r15 & 7
            int r6 = r6 << 3
            r7 = r4[r5]
            long r7 = r7 >>> r6
            int r5 = r5 + 1
            r9 = r4[r5]
            int r4 = 64 - r6
            long r4 = r9 << r4
            long r9 = (long) r6
            long r9 = -r9
            r6 = 63
            long r9 = r9 >> r6
            long r4 = r4 & r9
            long r4 = r4 | r7
            long r6 = (long) r1
            r8 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r6 = r6 * r8
            long r6 = r6 ^ r4
            long r8 = r6 - r8
            long r6 = ~r6
            long r6 = r6 & r8
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
        L50:
            r10 = 0
            int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r12 == 0) goto L6b
            int r10 = java.lang.Long.numberOfTrailingZeros(r6)
            int r10 = r10 >> 3
            int r10 = r10 + r15
            r10 = r10 & r2
            int[] r11 = r0.f858b
            r11 = r11[r10]
            if (r11 != r14) goto L65
            goto L75
        L65:
            r10 = 1
            long r10 = r6 - r10
            long r6 = r6 & r10
            goto L50
        L6b:
            long r6 = ~r4
            r12 = 6
            long r6 = r6 << r12
            long r4 = r4 & r6
            long r4 = r4 & r8
            int r4 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r4 == 0) goto L7b
            r10 = -1
        L75:
            if (r10 < 0) goto L7a
            r0.g(r10)
        L7a:
            return
        L7b:
            int r3 = r3 + 8
            int r15 = r15 + r3
            r15 = r15 & r2
            goto L24
        L80:
            j.E r0 = r13.bufferedAppearedNodes
            r0.h(r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.bufferContentCaptureViewAppeared(int, androidx.compose.ui.platform.coreshims.ViewStructureCompat):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006e, code lost:
    
        if (((r5 & ((~r5) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0070, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bufferContentCaptureViewDisappeared(int r15) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.bufferContentCaptureViewDisappeared(int):void");
    }

    private final void checkForContentCapturePropertyChanges(AbstractC0662o newSemanticsNodes) {
        int[] iArr = newSemanticsNodes.f852b;
        long[] jArr = newSemanticsNodes.f851a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8;
                int i4 = 8 - ((~(i2 - length)) >>> 31);
                int i5 = 0;
                while (i5 < i4) {
                    if ((255 & j2) < 128) {
                        int i6 = iArr[(i2 << 3) + i5];
                        SemanticsNodeCopy semanticsNodeCopy = (SemanticsNodeCopy) this.previousSemanticsNodes.c(i6);
                        SemanticsNodeWithAdjustedBounds semanticsNodeWithAdjustedBounds = (SemanticsNodeWithAdjustedBounds) newSemanticsNodes.c(i6);
                        SemanticsNode semanticsNode = semanticsNodeWithAdjustedBounds != null ? semanticsNodeWithAdjustedBounds.getSemanticsNode() : null;
                        if (semanticsNode == null) {
                            throw androidx.compose.runtime.changelist.a.v("no value for specified key");
                        }
                        if (semanticsNodeCopy == null) {
                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it = semanticsNode.getUnmergedConfig().iterator();
                            while (it.hasNext()) {
                                SemanticsPropertyKey<?> key = it.next().getKey();
                                SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
                                if (Intrinsics.areEqual(key, semanticsProperties.getText())) {
                                    List list = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties.getText());
                                    sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(list != null ? (AnnotatedString) CollectionsKt.firstOrNull(list) : null));
                                }
                            }
                        } else {
                            Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> it2 = semanticsNode.getUnmergedConfig().iterator();
                            while (it2.hasNext()) {
                                SemanticsPropertyKey<?> key2 = it2.next().getKey();
                                SemanticsProperties semanticsProperties2 = SemanticsProperties.INSTANCE;
                                if (Intrinsics.areEqual(key2, semanticsProperties2.getText())) {
                                    List list2 = (List) SemanticsConfigurationKt.getOrNull(semanticsNodeCopy.getUnmergedConfig(), semanticsProperties2.getText());
                                    AnnotatedString annotatedString = list2 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list2) : null;
                                    int i7 = i3;
                                    List list3 = (List) SemanticsConfigurationKt.getOrNull(semanticsNode.getUnmergedConfig(), semanticsProperties2.getText());
                                    AnnotatedString annotatedString2 = list3 != null ? (AnnotatedString) CollectionsKt.firstOrNull(list3) : null;
                                    if (!Intrinsics.areEqual(annotatedString, annotatedString2)) {
                                        sendContentCaptureTextUpdateEvent(semanticsNode.getId(), String.valueOf(annotatedString2));
                                    }
                                    i3 = i7;
                                }
                            }
                        }
                    }
                    int i8 = i3;
                    j2 >>= i8;
                    i5++;
                    i3 = i8;
                }
                if (i4 != i3) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final void clearTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function0 function0;
        AbstractC0662o currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f853c;
        long[] jArr = currentSemanticsNodes$ui_release.f851a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getClearTextSubstitution())) != null && (function0 = (Function0) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void contentCaptureChangeChecker$lambda$0(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.isEnabled$ui_release()) {
            Owner.measureAndLayout$default(androidContentCaptureManager.view, false, 1, null);
            androidContentCaptureManager.sendSemanticsStructureChangeEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.sendContentCaptureStructureChangeEvents(androidContentCaptureManager.view.getSemanticsOwner().getUnmergedRootSemanticsNode(), androidContentCaptureManager.previousSemanticsRoot);
            androidContentCaptureManager.checkForContentCapturePropertyChanges(androidContentCaptureManager.getCurrentSemanticsNodes$ui_release());
            androidContentCaptureManager.updateSemanticsCopy();
            androidContentCaptureManager.checkingForSemanticsChanges = false;
        }
    }

    public static /* synthetic */ void getContentCaptureSession$ui_release$annotations() {
    }

    private final void hideTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        AbstractC0662o currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f853c;
        long[] jArr = currentSemanticsNodes$ui_release.f851a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    public static /* synthetic */ void isEnabled$ui_release$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void notifyContentCaptureChanges() {
        /*
            Method dump skipped, instructions count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.notifyContentCaptureChanges():void");
    }

    private final void notifySubtreeStateChangeIfNeeded(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.mo7998trySendJP2dKIU(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendContentCaptureStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r14, androidx.compose.ui.platform.SemanticsNodeCopy r15) {
        /*
            r13 = this;
            java.util.List r0 = r14.getReplacedChildren$ui_release()
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r0.get(r3)
            androidx.compose.ui.semantics.SemanticsNode r4 = (androidx.compose.ui.semantics.SemanticsNode) r4
            j.o r5 = r13.getCurrentSemanticsNodes$ui_release()
            int r6 = r4.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto L31
            j.F r5 = r15.getChildren()
            int r6 = r4.getId()
            boolean r5 = r5.a(r6)
            if (r5 != 0) goto L31
            r13.updateBuffersOnAppeared(r4)
        L31:
            int r3 = r3 + 1
            goto La
        L34:
            j.E r15 = r13.previousSemanticsNodes
            int[] r0 = r15.f852b
            long[] r15 = r15.f851a
            int r1 = r15.length
            int r1 = r1 + (-2)
            if (r1 < 0) goto L82
            r3 = r2
        L40:
            r4 = r15[r3]
            long r6 = ~r4
            r8 = 7
            long r6 = r6 << r8
            long r6 = r6 & r4
            r8 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r8
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 == 0) goto L7d
            int r6 = r3 - r1
            int r6 = ~r6
            int r6 = r6 >>> 31
            r7 = 8
            int r6 = 8 - r6
            r8 = r2
        L5a:
            if (r8 >= r6) goto L7b
            r9 = 255(0xff, double:1.26E-321)
            long r9 = r9 & r4
            r11 = 128(0x80, double:6.3E-322)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L77
            int r9 = r3 << 3
            int r9 = r9 + r8
            r9 = r0[r9]
            j.o r10 = r13.getCurrentSemanticsNodes$ui_release()
            boolean r10 = r10.a(r9)
            if (r10 != 0) goto L77
            r13.bufferContentCaptureViewDisappeared(r9)
        L77:
            long r4 = r4 >> r7
            int r8 = r8 + 1
            goto L5a
        L7b:
            if (r6 != r7) goto L82
        L7d:
            if (r3 == r1) goto L82
            int r3 = r3 + 1
            goto L40
        L82:
            java.util.List r14 = r14.getReplacedChildren$ui_release()
            int r15 = r14.size()
        L8a:
            if (r2 >= r15) goto Lc8
            java.lang.Object r0 = r14.get(r2)
            androidx.compose.ui.semantics.SemanticsNode r0 = (androidx.compose.ui.semantics.SemanticsNode) r0
            j.o r1 = r13.getCurrentSemanticsNodes$ui_release()
            int r3 = r0.getId()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc5
            j.E r1 = r13.previousSemanticsNodes
            int r3 = r0.getId()
            boolean r1 = r1.a(r3)
            if (r1 == 0) goto Lc5
            j.E r1 = r13.previousSemanticsNodes
            int r3 = r0.getId()
            java.lang.Object r1 = r1.c(r3)
            if (r1 == 0) goto Lbe
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = (androidx.compose.ui.platform.SemanticsNodeCopy) r1
            r13.sendContentCaptureStructureChangeEvents(r0, r1)
            goto Lc5
        Lbe:
            java.lang.String r14 = "node not present in pruned tree before this change"
            kotlin.KotlinNothingValueException r14 = androidx.compose.runtime.changelist.a.v(r14)
            throw r14
        Lc5:
            int r2 = r2 + 1
            goto L8a
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendContentCaptureStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    private final void sendContentCaptureTextUpdateEvent(int id, String newText) {
        ContentCaptureSessionCompat contentCaptureSessionCompat;
        if (Build.VERSION.SDK_INT >= 29 && (contentCaptureSessionCompat = this.contentCaptureSession) != null) {
            AutofillId autofillIdNewAutofillId = contentCaptureSessionCompat.newAutofillId(id);
            if (autofillIdNewAutofillId == null) {
                throw androidx.compose.runtime.changelist.a.v("Invalid content capture ID");
            }
            contentCaptureSessionCompat.notifyViewTextChanged(autofillIdNewAutofillId, newText);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void sendSemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode r17, androidx.compose.ui.platform.SemanticsNodeCopy r18) {
        /*
            r16 = this;
            r0 = r16
            j.F r1 = new j.F
            r1.<init>()
            java.util.List r2 = r17.getReplacedChildren$ui_release()
            int r3 = r2.size()
            r4 = 0
            r5 = r4
        L11:
            if (r5 >= r3) goto L47
            java.lang.Object r6 = r2.get(r5)
            androidx.compose.ui.semantics.SemanticsNode r6 = (androidx.compose.ui.semantics.SemanticsNode) r6
            j.o r7 = r0.getCurrentSemanticsNodes$ui_release()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 == 0) goto L44
            j.F r7 = r18.getChildren()
            int r8 = r6.getId()
            boolean r7 = r7.a(r8)
            if (r7 != 0) goto L3d
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeStateChangeIfNeeded(r1)
            return
        L3d:
            int r6 = r6.getId()
            r1.b(r6)
        L44:
            int r5 = r5 + 1
            goto L11
        L47:
            j.F r2 = r18.getChildren()
            int[] r3 = r2.f858b
            long[] r2 = r2.f857a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L98
            r6 = r4
        L55:
            r7 = r2[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L93
            int r9 = r6 - r5
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = r4
        L6f:
            if (r11 >= r9) goto L91
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L8d
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]
            boolean r12 = r1.a(r12)
            if (r12 != 0) goto L8d
            androidx.compose.ui.node.LayoutNode r1 = r17.getLayoutNode()
            r0.notifySubtreeStateChangeIfNeeded(r1)
            return
        L8d:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L6f
        L91:
            if (r9 != r10) goto L98
        L93:
            if (r6 == r5) goto L98
            int r6 = r6 + 1
            goto L55
        L98:
            java.util.List r1 = r17.getReplacedChildren$ui_release()
            int r2 = r1.size()
        La0:
            if (r4 >= r2) goto Ld2
            java.lang.Object r3 = r1.get(r4)
            androidx.compose.ui.semantics.SemanticsNode r3 = (androidx.compose.ui.semantics.SemanticsNode) r3
            j.o r5 = r0.getCurrentSemanticsNodes$ui_release()
            int r6 = r3.getId()
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lcf
            j.E r5 = r0.previousSemanticsNodes
            int r6 = r3.getId()
            java.lang.Object r5 = r5.c(r6)
            if (r5 == 0) goto Lc8
            androidx.compose.ui.platform.SemanticsNodeCopy r5 = (androidx.compose.ui.platform.SemanticsNodeCopy) r5
            r0.sendSemanticsStructureChangeEvents(r3, r5)
            goto Lcf
        Lc8:
            java.lang.String r1 = "node not present in pruned tree before this change"
            kotlin.KotlinNothingValueException r1 = androidx.compose.runtime.changelist.a.v(r1)
            throw r1
        Lcf:
            int r4 = r4 + 1
            goto La0
        Ld2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.sendSemanticsStructureChangeEvents(androidx.compose.ui.semantics.SemanticsNode, androidx.compose.ui.platform.SemanticsNodeCopy):void");
    }

    private final void showTranslatedText() {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        AbstractC0662o currentSemanticsNodes$ui_release = getCurrentSemanticsNodes$ui_release();
        Object[] objArr = currentSemanticsNodes$ui_release.f853c;
        long[] jArr = currentSemanticsNodes$ui_release.f851a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        SemanticsConfiguration unmergedConfig$ui_release = ((SemanticsNodeWithAdjustedBounds) objArr[(i2 << 3) + i4]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.areEqual(SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) != null && (function1 = (Function1) accessibilityAction.getAction()) != null) {
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    private final ViewStructureCompat toViewStructure(SemanticsNode semanticsNode) {
        AutofillIdCompat autofillId;
        AutofillId autofillId2;
        String strM5506toLegacyClassNameV4PA4sw;
        ContentCaptureSessionCompat contentCaptureSessionCompat = this.contentCaptureSession;
        if (contentCaptureSessionCompat == null || Build.VERSION.SDK_INT < 29 || (autofillId = ViewCompatShims.getAutofillId(this.view)) == null) {
            return null;
        }
        if (semanticsNode.getParent() != null) {
            autofillId2 = contentCaptureSessionCompat.newAutofillId(r4.getId());
            if (autofillId2 == null) {
                return null;
            }
        } else {
            autofillId2 = autofillId.toAutofillId();
        }
        ViewStructureCompat viewStructureCompatNewVirtualViewStructure = contentCaptureSessionCompat.newVirtualViewStructure(autofillId2, semanticsNode.getId());
        if (viewStructureCompatNewVirtualViewStructure == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig$ui_release = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.INSTANCE;
        if (unmergedConfig$ui_release.contains(semanticsProperties.getPassword())) {
            return null;
        }
        Bundle extras = viewStructureCompatNewVirtualViewStructure.getExtras();
        if (extras != null) {
            extras.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
        }
        String str = (String) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getTestTag());
        if (str != null) {
            viewStructureCompatNewVirtualViewStructure.setId(semanticsNode.getId(), null, null, str);
        }
        List list = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getText());
        if (list != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextClassName);
            viewStructureCompatNewVirtualViewStructure.setText(ListUtilsKt.fastJoinToString$default(list, "\n", null, null, 0, null, null, 62, null));
        }
        AnnotatedString annotatedString = (AnnotatedString) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getEditableText());
        if (annotatedString != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(AndroidComposeViewAccessibilityDelegateCompat.TextFieldClassName);
            viewStructureCompatNewVirtualViewStructure.setText(annotatedString);
        }
        List list2 = (List) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getContentDescription());
        if (list2 != null) {
            viewStructureCompatNewVirtualViewStructure.setContentDescription(ListUtilsKt.fastJoinToString$default(list2, "\n", null, null, 0, null, null, 62, null));
        }
        Role role = (Role) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, semanticsProperties.getRole());
        if (role != null && (strM5506toLegacyClassNameV4PA4sw = SemanticsUtils_androidKt.m5506toLegacyClassNameV4PA4sw(role.getValue())) != null) {
            viewStructureCompatNewVirtualViewStructure.setClassName(strM5506toLegacyClassNameV4PA4sw);
        }
        TextLayoutResult textLayoutResult = SemanticsUtils_androidKt.getTextLayoutResult(unmergedConfig$ui_release);
        if (textLayoutResult != null) {
            TextLayoutInput layoutInput = textLayoutResult.getLayoutInput();
            viewStructureCompatNewVirtualViewStructure.setTextStyle(layoutInput.getDensity().getFontScale() * layoutInput.getDensity().getDensity() * TextUnit.m6426getValueimpl(layoutInput.getStyle().m5752getFontSizeXSAIIZE()), 0, 0, 0);
        }
        Rect boundsInParent$ui_release = semanticsNode.getBoundsInParent$ui_release();
        viewStructureCompatNewVirtualViewStructure.setDimens((int) boundsInParent$ui_release.getLeft(), (int) boundsInParent$ui_release.getTop(), 0, 0, (int) boundsInParent$ui_release.getWidth(), (int) boundsInParent$ui_release.getHeight());
        return viewStructureCompatNewVirtualViewStructure;
    }

    private final void updateBuffersOnAppeared(SemanticsNode node) {
        if (isEnabled$ui_release()) {
            updateTranslationOnAppeared(node);
            bufferContentCaptureViewAppeared(node.getId(), toViewStructure(node));
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                updateBuffersOnAppeared(replacedChildren$ui_release.get(i2));
            }
        }
    }

    private final void updateBuffersOnDisappeared(SemanticsNode node) {
        if (isEnabled$ui_release()) {
            bufferContentCaptureViewDisappeared(node.getId());
            List<SemanticsNode> replacedChildren$ui_release = node.getReplacedChildren$ui_release();
            int size = replacedChildren$ui_release.size();
            for (int i2 = 0; i2 < size; i2++) {
                updateBuffersOnDisappeared(replacedChildren$ui_release.get(i2));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void updateSemanticsCopy() {
        /*
            r16 = this;
            r0 = r16
            j.E r1 = r0.previousSemanticsNodes
            r1.d()
            j.o r1 = r0.getCurrentSemanticsNodes$ui_release()
            int[] r2 = r1.f852b
            java.lang.Object[] r3 = r1.f853c
            long[] r1 = r1.f851a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L62
            r6 = 0
        L17:
            r7 = r1[r6]
            long r9 = ~r7
            r11 = 7
            long r9 = r9 << r11
            long r9 = r9 & r7
            r11 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r9 = r9 & r11
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto L5d
            int r9 = r6 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            r10 = 8
            int r9 = 8 - r9
            r11 = 0
        L31:
            if (r11 >= r9) goto L5b
            r12 = 255(0xff, double:1.26E-321)
            long r12 = r12 & r7
            r14 = 128(0x80, double:6.3E-322)
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 >= 0) goto L57
            int r12 = r6 << 3
            int r12 = r12 + r11
            r13 = r2[r12]
            r12 = r3[r12]
            androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds r12 = (androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds) r12
            j.E r14 = r0.previousSemanticsNodes
            androidx.compose.ui.platform.SemanticsNodeCopy r15 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.semantics.SemanticsNode r12 = r12.getSemanticsNode()
            j.o r5 = r0.getCurrentSemanticsNodes$ui_release()
            r15.<init>(r12, r5)
            r14.h(r13, r15)
        L57:
            long r7 = r7 >> r10
            int r11 = r11 + 1
            goto L31
        L5b:
            if (r9 != r10) goto L62
        L5d:
            if (r6 == r4) goto L62
            int r6 = r6 + 1
            goto L17
        L62:
            androidx.compose.ui.platform.SemanticsNodeCopy r1 = new androidx.compose.ui.platform.SemanticsNodeCopy
            androidx.compose.ui.platform.AndroidComposeView r2 = r0.view
            androidx.compose.ui.semantics.SemanticsOwner r2 = r2.getSemanticsOwner()
            androidx.compose.ui.semantics.SemanticsNode r2 = r2.getUnmergedRootSemanticsNode()
            j.o r3 = r0.getCurrentSemanticsNodes$ui_release()
            r1.<init>(r2, r3)
            r0.previousSemanticsRoot = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.updateSemanticsCopy():void");
    }

    private final void updateTranslationOnAppeared(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1;
        Function1 function12;
        SemanticsConfiguration unmergedConfig$ui_release = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsProperties.INSTANCE.getIsShowingTextSubstitution());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution());
            if (accessibilityAction2 == null || (function12 = (Function1) accessibilityAction2.getAction()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !Intrinsics.areEqual(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.getOrNull(unmergedConfig$ui_release, SemanticsActions.INSTANCE.getShowTextSubstitution())) == null || (function1 = (Function1) accessibilityAction.getAction()) == null) {
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(r6, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x0035, TryCatch #1 {all -> 0x0035, blocks: (B:13:0x0030, B:25:0x0056, B:29:0x0066, B:31:0x006e, B:33:0x0077, B:34:0x007a, B:36:0x007e, B:37:0x0087, B:20:0x0048), top: B:48:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0098 -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L35
        L33:
            r10 = r2
            goto L56
        L35:
            r10 = move-exception
            goto La5
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L40:
            java.lang.Object r2 = r0.L$1
            kotlinx.coroutines.channels.ChannelIterator r2 = (kotlinx.coroutines.channels.ChannelIterator) r2
            java.lang.Object r5 = r0.L$0
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager r5 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager) r5
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L35
            goto L66
        L4c:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlinx.coroutines.channels.Channel<kotlin.Unit> r10 = r9.boundsUpdateChannel     // Catch: java.lang.Throwable -> La3
            kotlinx.coroutines.channels.ChannelIterator r10 = r10.iterator()     // Catch: java.lang.Throwable -> La3
            r5 = r9
        L56:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r10     // Catch: java.lang.Throwable -> L35
            r0.label = r4     // Catch: java.lang.Throwable -> L35
            java.lang.Object r2 = r10.hasNext(r0)     // Catch: java.lang.Throwable -> L35
            if (r2 != r1) goto L63
            goto L9a
        L63:
            r8 = r2
            r2 = r10
            r10 = r8
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L9b
            r2.next()     // Catch: java.lang.Throwable -> L35
            boolean r10 = r5.isEnabled$ui_release()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L7a
            r5.notifyContentCaptureChanges()     // Catch: java.lang.Throwable -> L35
        L7a:
            boolean r10 = r5.checkingForSemanticsChanges     // Catch: java.lang.Throwable -> L35
            if (r10 != 0) goto L87
            r5.checkingForSemanticsChanges = r4     // Catch: java.lang.Throwable -> L35
            android.os.Handler r10 = r5.handler     // Catch: java.lang.Throwable -> L35
            java.lang.Runnable r6 = r5.contentCaptureChangeChecker     // Catch: java.lang.Throwable -> L35
            r10.post(r6)     // Catch: java.lang.Throwable -> L35
        L87:
            j.g r10 = r5.subtreeChangedLayoutNodes     // Catch: java.lang.Throwable -> L35
            r10.clear()     // Catch: java.lang.Throwable -> L35
            long r6 = r5.SendRecurringContentCaptureEventsIntervalMillis     // Catch: java.lang.Throwable -> L35
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L35
            r0.L$1 = r2     // Catch: java.lang.Throwable -> L35
            r0.label = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.delay(r6, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r1) goto L33
        L9a:
            return r1
        L9b:
            j.g r10 = r5.subtreeChangedLayoutNodes
            r10.clear()
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        La3:
            r10 = move-exception
            r5 = r9
        La5:
            j.g r0 = r5.subtreeChangedLayoutNodes
            r0.clear()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.boundsUpdatesEventLoop$ui_release(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: getContentCaptureSession$ui_release, reason: from getter */
    public final ContentCaptureSessionCompat getContentCaptureSession() {
        return this.contentCaptureSession;
    }

    public final AbstractC0662o getCurrentSemanticsNodes$ui_release() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = SemanticsUtils_androidKt.getAllUncoveredSemanticsNodesToIntObjectMap(this.view.getSemanticsOwner());
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    /* renamed from: getHandler$ui_release, reason: from getter */
    public final Handler getHandler() {
        return this.handler;
    }

    public final Function0<ContentCaptureSessionCompat> getOnContentCaptureSession() {
        return this.onContentCaptureSession;
    }

    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean isEnabled$ui_release() {
        return ContentCaptureManager.INSTANCE.isEnabled() && this.contentCaptureSession != null;
    }

    public final void onClearTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        clearTranslatedText();
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public /* bridge */ /* synthetic */ void onCreate(InterfaceC0587u interfaceC0587u) {
        super.onCreate(interfaceC0587u);
    }

    public final void onCreateVirtualViewTranslationRequests$ui_release(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        ViewTranslationHelperMethods.INSTANCE.onCreateVirtualViewTranslationRequests(this, virtualIds, supportedFormats, requestsCollector);
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public /* bridge */ /* synthetic */ void onDestroy(InterfaceC0587u interfaceC0587u) {
        super.onDestroy(interfaceC0587u);
    }

    public final void onHideTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        hideTranslatedText();
    }

    public final void onLayoutChange$ui_release(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (isEnabled$ui_release()) {
            notifySubtreeStateChangeIfNeeded(layoutNode);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public /* bridge */ /* synthetic */ void onPause(InterfaceC0587u interfaceC0587u) {
        super.onPause(interfaceC0587u);
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public void onResume(InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
    }

    public final void onSemanticsChange$ui_release() {
        this.currentSemanticsNodesInvalidated = true;
        if (!isEnabled$ui_release() || this.checkingForSemanticsChanges) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        this.handler.post(this.contentCaptureChangeChecker);
    }

    public final void onShowTranslation$ui_release() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        showTranslatedText();
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public void onStart(InterfaceC0587u owner) {
        this.contentCaptureSession = this.onContentCaptureSession.invoke();
        updateBuffersOnAppeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public void onStop(InterfaceC0587u owner) {
        updateBuffersOnDisappeared(this.view.getSemanticsOwner().getUnmergedRootSemanticsNode());
        notifyContentCaptureChanges();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v2) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v2) {
        this.handler.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void onVirtualViewTranslationResponses$ui_release(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        ViewTranslationHelperMethods.INSTANCE.onVirtualViewTranslationResponses(contentCaptureManager, response);
    }

    public final void setContentCaptureSession$ui_release(ContentCaptureSessionCompat contentCaptureSessionCompat) {
        this.contentCaptureSession = contentCaptureSessionCompat;
    }

    public final void setCurrentSemanticsNodes$ui_release(AbstractC0662o abstractC0662o) {
        this.currentSemanticsNodes = abstractC0662o;
    }

    public final void setOnContentCaptureSession(Function0<? extends ContentCaptureSessionCompat> function0) {
        this.onContentCaptureSession = function0;
    }
}
