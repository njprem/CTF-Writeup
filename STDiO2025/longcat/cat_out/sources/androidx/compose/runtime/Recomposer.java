package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentSet;
import androidx.compose.runtime.snapshots.MutableSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.tooling.CompositionData;
import j.S;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000¶\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\b\u0007\u0018\u0000 á\u00012\u00020\u0001:\ná\u0001â\u0001ã\u0001ä\u0001å\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0002H\u0087@¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u0012\u0010\u000bJ*\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00132\u0011\u0010\u0017\u001a\r\u0012\u0004\u0012\u00020\t0\u0015¢\u0006\u0002\b\u0016H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\tH\u0086@¢\u0006\u0004\b\u001b\u0010\u000bJ\r\u0010\u001c\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u0010J\r\u0010\u001d\u001a\u00020\t¢\u0006\u0004\b\u001d\u0010\u0010J\u001d\u0010#\u001a\u00020\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0010¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b'\u0010%J\u0017\u0010*\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b)\u0010%J\u0017\u0010/\u001a\u00020\t2\u0006\u0010,\u001a\u00020+H\u0010¢\u0006\u0004\b-\u0010.J\u0017\u00104\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\t2\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b5\u00103J\u001f\u0010;\u001a\u00020\t2\u0006\u00101\u001a\u0002002\u0006\u00108\u001a\u000207H\u0010¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b<\u0010%J\u0019\u0010@\u001a\u0004\u0018\u0001072\u0006\u00101\u001a\u000200H\u0010¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010AH\u0002¢\u0006\u0004\bB\u0010CJ\u000f\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bE\u0010FJ$\u0010E\u001a\u00020\t2\u0012\u0010H\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\t0GH\u0082\b¢\u0006\u0004\bE\u0010IJ\u0017\u0010L\u001a\u00020\t2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ1\u0010S\u001a\u00020\t2\n\u0010P\u001a\u00060Nj\u0002`O2\n\b\u0002\u0010Q\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010R\u001a\u00020DH\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010\u0010J\u0017\u0010V\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bV\u0010%J\u0017\u0010W\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bW\u0010%J\u0011\u0010Y\u001a\u0004\u0018\u00010XH\u0002¢\u0006\u0004\bY\u0010ZJ\u000f\u0010[\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\u0010J\u0017\u0010\\\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\\\u0010%J \u0010a\u001a\u00020\t2\u0006\u0010^\u001a\u00020]2\u0006\u0010`\u001a\u00020_H\u0082@¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\tH\u0082@¢\u0006\u0004\bc\u0010\u000bJN\u0010l\u001a\u00020\t2<\u0010k\u001a8\b\u0001\u0012\u0004\u0012\u00020e\u0012\u0013\u0012\u00110]¢\u0006\f\bf\u0012\b\bg\u0012\u0004\b\b(^\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0h\u0012\u0006\u0012\u0004\u0018\u00010i0d¢\u0006\u0002\bjH\u0082@¢\u0006\u0004\bl\u0010mJ\u0017\u0010n\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bn\u0010%J)\u0010q\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010oH\u0002¢\u0006\u0004\bq\u0010rJ3\u0010u\u001a\b\u0012\u0004\u0012\u00020\u00130s2\f\u0010t\u001a\b\u0012\u0004\u0012\u0002000s2\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010oH\u0002¢\u0006\u0004\bu\u0010vJ\u000f\u0010w\u001a\u00020\tH\u0002¢\u0006\u0004\bw\u0010\u0010J#\u0010x\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\t0G2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\bx\u0010yJ3\u0010z\u001a\u000e\u0012\u0004\u0012\u00020i\u0012\u0004\u0012\u00020\t0G2\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010oH\u0002¢\u0006\u0004\bz\u0010{J<\u0010}\u001a\u00028\u0000\"\u0004\b\u0000\u0010|2\u0006\u0010\u0014\u001a\u00020\u00132\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020i\u0018\u00010o2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0082\b¢\u0006\u0004\b}\u0010~J\u001b\u0010\u0081\u0001\u001a\u00020\t2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001R,\u0010\u0085\u0001\u001a\u00030\u0083\u00012\b\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008a\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0017\u0010\u008c\u0001\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010\u008d\u0001R\u001b\u0010\u008e\u0001\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001c\u0010\u0091\u0001\u001a\u0005\u0018\u00010\u0090\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R!\u0010\u0096\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u0095\u0001R\u001f\u0010\u0097\u0001\u001a\b\u0012\u0004\u0012\u00020i0o8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001e\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0099\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001e\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020\u00130\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0095\u0001R\u001e\u0010\u009d\u0001\u001a\t\u0012\u0004\u0012\u0002000\u0093\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0095\u0001R4\u0010 \u0001\u001a\u001f\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010i0\u009f\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u0002000\u0093\u00010\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R$\u0010¢\u0001\u001a\u000f\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002070\u009e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¢\u0001\u0010¡\u0001R\"\u0010£\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0095\u0001R!\u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001R!\u0010¦\u0001\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u001a\u0010©\u0001\u001a\u00030¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u0019\u0010«\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010X8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0019\u0010¯\u0001\u001a\u00020D8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010¬\u0001R\u001f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010³\u0001R\u0018\u0010µ\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u001c\u0010»\u0001\u001a\u00070º\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b»\u0001\u0010¼\u0001R\u0016\u0010\f\u001a\u00020\u00028PX\u0090\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¹\u0001R&\u0010Â\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010¾\u00018FX\u0087\u0004¢\u0006\u000f\u0012\u0005\bÁ\u0001\u0010\u0010\u001a\u0006\b¿\u0001\u0010À\u0001R\u001c\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030±\u00010Ã\u00018F¢\u0006\b\u001a\u0006\bÄ\u0001\u0010Å\u0001R\u0013\u0010È\u0001\u001a\u00020D8F¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010FR\u0018\u0010Ë\u0001\u001a\u00030¨\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010Ê\u0001R\u0016\u0010Í\u0001\u001a\u00020D8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010FR\u0016\u0010Ï\u0001\u001a\u00020D8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÎ\u0001\u0010FR\u0016\u0010Ñ\u0001\u001a\u00020D8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010FR\u001d\u0010Ô\u0001\u001a\b\u0012\u0004\u0012\u00020\u00130s8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u0016\u0010Ö\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÕ\u0001\u0010FR\u0016\u0010Ø\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0001\u0010FR\u0016\u0010Ú\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÙ\u0001\u0010FR\u0016\u0010Ü\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÛ\u0001\u0010FR\u0016\u0010Þ\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010FR\u0016\u0010à\u0001\u001a\u00020D8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010F¨\u0006æ\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/CompositionContext;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/runtime/RecomposerInfo;", "asRecomposerInfo", "()Landroidx/compose/runtime/RecomposerInfo;", "", "runRecomposeAndApplyChanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recomposeCoroutineContext", "runRecomposeConcurrentlyAndApplyChanges", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", "()V", "close", "join", "Landroidx/compose/runtime/ControlledComposition;", "composition", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "content", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "composeInitial", "awaitIdle", "pauseCompositionFrameClock", "resumeCompositionFrameClock", "", "Landroidx/compose/runtime/tooling/CompositionData;", "table", "recordInspectionTable$runtime_release", "(Ljava/util/Set;)V", "recordInspectionTable", "registerComposition$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;)V", "registerComposition", "unregisterComposition$runtime_release", "unregisterComposition", "invalidate$runtime_release", "invalidate", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", "invalidateScope$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;)V", "invalidateScope", "Landroidx/compose/runtime/MovableContentStateReference;", "reference", "insertMovableContent$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)V", "insertMovableContent", "deletedMovableContent$runtime_release", "deletedMovableContent", "Landroidx/compose/runtime/MovableContentState;", "data", "movableContentStateReleased$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/MovableContentState;)V", "movableContentStateReleased", "reportRemovedComposition$runtime_release", "reportRemovedComposition", "movableContentStateResolve$runtime_release", "(Landroidx/compose/runtime/MovableContentStateReference;)Landroidx/compose/runtime/MovableContentState;", "movableContentStateResolve", "Lkotlinx/coroutines/CancellableContinuation;", "deriveStateLocked", "()Lkotlinx/coroutines/CancellableContinuation;", "", "recordComposerModifications", "()Z", "Lkotlin/Function1;", "onEachInvalidComposition", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/Job;", "callingJob", "registerRunnerJob", "(Lkotlinx/coroutines/Job;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "failedInitialComposition", "recoverable", "processCompositionError", "(Ljava/lang/Exception;Landroidx/compose/runtime/ControlledComposition;Z)V", "clearKnownCompositionsLocked", "removeKnownCompositionLocked", "addKnownCompositionLocked", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "resetErrorState", "()Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "recordFailedCompositionLocked", "Landroidx/compose/runtime/MonotonicFrameClock;", "parentFrameClock", "Landroidx/compose/runtime/ProduceFrameSignal;", "frameSignal", "runFrameLoop", "(Landroidx/compose/runtime/MonotonicFrameClock;Landroidx/compose/runtime/ProduceFrameSignal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "awaitWorkAvailable", "Lkotlin/Function3;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/ParameterName;", "name", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "recompositionRunner", "(Lkotlin/jvm/functions/Function3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "performInitialMovableContentInserts", "Lj/S;", "modifiedValues", "performRecompose", "(Landroidx/compose/runtime/ControlledComposition;Lj/S;)Landroidx/compose/runtime/ControlledComposition;", "", "references", "performInsertValues", "(Ljava/util/List;Lj/S;)Ljava/util/List;", "discardUnusedValues", "readObserverOf", "(Landroidx/compose/runtime/ControlledComposition;)Lkotlin/jvm/functions/Function1;", "writeObserverOf", "(Landroidx/compose/runtime/ControlledComposition;Lj/S;)Lkotlin/jvm/functions/Function1;", "T", "composing", "(Landroidx/compose/runtime/ControlledComposition;Lj/S;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "snapshot", "applyAndCheck", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "", "<set-?>", "changeCount", "J", "getChangeCount", "()J", "Landroidx/compose/runtime/BroadcastFrameClock;", "broadcastFrameClock", "Landroidx/compose/runtime/BroadcastFrameClock;", "stateLock", "Ljava/lang/Object;", "runnerJob", "Lkotlinx/coroutines/Job;", "", "closeCause", "Ljava/lang/Throwable;", "", "_knownCompositions", "Ljava/util/List;", "_knownCompositionsCache", "snapshotInvalidations", "Lj/S;", "Landroidx/compose/runtime/collection/MutableVector;", "compositionInvalidations", "Landroidx/compose/runtime/collection/MutableVector;", "compositionsAwaitingApply", "compositionValuesAwaitingInsert", "", "Landroidx/compose/runtime/MovableContent;", "compositionValuesRemoved", "Ljava/util/Map;", "compositionValueStatesAvailable", "failedCompositions", "compositionsRemoved", "Ljava/util/Set;", "workContinuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "concurrentCompositionsOutstanding", "I", "isClosed", "Z", "errorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "frameClockPaused", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/Recomposer$State;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/CompletableJob;", "effectJob", "Lkotlinx/coroutines/CompletableJob;", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "recomposerInfo", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "getRecomposeCoroutineContext$runtime_release", "Lkotlinx/coroutines/flow/Flow;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "getState$annotations", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getCurrentState", "()Lkotlinx/coroutines/flow/StateFlow;", "currentState", "getHasPendingWork", "hasPendingWork", "getCompoundHashKey$runtime_release", "()I", "compoundHashKey", "getCollectingCallByInformation$runtime_release", "collectingCallByInformation", "getCollectingParameterInformation$runtime_release", "collectingParameterInformation", "getCollectingSourceInformation$runtime_release", "collectingSourceInformation", "getKnownCompositions", "()Ljava/util/List;", "knownCompositions", "getHasBroadcastFrameClockAwaitersLocked", "hasBroadcastFrameClockAwaitersLocked", "getHasBroadcastFrameClockAwaiters", "hasBroadcastFrameClockAwaiters", "getShouldKeepRecomposing", "shouldKeepRecomposing", "getHasSchedulingWork", "hasSchedulingWork", "getHasFrameWorkLocked", "hasFrameWorkLocked", "getHasConcurrentFrameWorkLocked", "hasConcurrentFrameWorkLocked", "Companion", "HotReloadable", "RecomposerErrorState", "RecomposerInfoImpl", "State", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Recomposer extends CompositionContext {
    private final List<ControlledComposition> _knownCompositions;
    private List<? extends ControlledComposition> _knownCompositionsCache;
    private final MutableStateFlow<State> _state;
    private final BroadcastFrameClock broadcastFrameClock;
    private long changeCount;
    private Throwable closeCause;
    private final MutableVector<ControlledComposition> compositionInvalidations;
    private final Map<MovableContentStateReference, MovableContentState> compositionValueStatesAvailable;
    private final List<MovableContentStateReference> compositionValuesAwaitingInsert;
    private final Map<MovableContent<Object>, List<MovableContentStateReference>> compositionValuesRemoved;
    private final List<ControlledComposition> compositionsAwaitingApply;
    private Set<ControlledComposition> compositionsRemoved;
    private int concurrentCompositionsOutstanding;
    private final CoroutineContext effectCoroutineContext;
    private final CompletableJob effectJob;
    private RecomposerErrorState errorState;
    private List<ControlledComposition> failedCompositions;
    private boolean frameClockPaused;
    private boolean isClosed;
    private final RecomposerInfoImpl recomposerInfo;
    private Job runnerJob;
    private S snapshotInvalidations;
    private final Object stateLock;
    private CancellableContinuation<? super Unit> workContinuation;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final MutableStateFlow<PersistentSet<RecomposerInfoImpl>> _runningRecomposers = StateFlowKt.MutableStateFlow(ExtensionsKt.persistentSetOf());
    private static final AtomicReference<Boolean> _hotReloadEnabled = new AtomicReference<>(Boolean.FALSE);

    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0002\b\u0017J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0002\b\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u0001H\u0000¢\u0006\u0002\b\"J\u0014\u0010#\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u000bR\u00020\fH\u0002J\r\u0010$\u001a\u00020\u0001H\u0000¢\u0006\u0002\b%J\u0015\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0002\b(R.\u0010\u0003\u001a\"\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004j\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005`\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u000bR\u00020\f0\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006)"}, d2 = {"Landroidx/compose/runtime/Recomposer$Companion;", "", "()V", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "", "kotlin.jvm.PlatformType", "Landroidx/compose/runtime/AtomicReference;", "_runningRecomposers", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentSet;", "Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/Recomposer;", "runningRecomposers", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/compose/runtime/RecomposerInfo;", "getRunningRecomposers", "()Lkotlinx/coroutines/flow/StateFlow;", "addRunning", "", "info", "clearErrors", "clearErrors$runtime_release", "getCurrentErrors", "", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentErrors$runtime_release", "invalidateGroupsWithKey", "key", "", "invalidateGroupsWithKey$runtime_release", "loadStateAndComposeForHotReload", "token", "loadStateAndComposeForHotReload$runtime_release", "removeRunning", "saveStateAndDisposeForHotReload", "saveStateAndDisposeForHotReload$runtime_release", "setHotReloadEnabled", "value", "setHotReloadEnabled$runtime_release", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void addRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetAdd;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetAdd = persistentSet.add((PersistentSet) info);
                if (persistentSet == persistentSetAdd) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void removeRunning(RecomposerInfoImpl info) {
            PersistentSet persistentSet;
            PersistentSet persistentSetRemove;
            do {
                persistentSet = (PersistentSet) Recomposer._runningRecomposers.getValue();
                persistentSetRemove = persistentSet.remove((PersistentSet) info);
                if (persistentSet == persistentSetRemove) {
                    return;
                }
            } while (!Recomposer._runningRecomposers.compareAndSet(persistentSet, persistentSetRemove));
        }

        public final void clearErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorState recomposerErrorStateResetErrorState = ((RecomposerInfoImpl) it.next()).resetErrorState();
                if (recomposerErrorStateResetErrorState != null) {
                    arrayList.add(recomposerErrorStateResetErrorState);
                }
            }
        }

        public final List<RecomposerErrorInfo> getCurrentErrors$runtime_release() {
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                RecomposerErrorInfo currentError = ((RecomposerInfoImpl) it.next()).getCurrentError();
                if (currentError != null) {
                    arrayList.add(currentError);
                }
            }
            return arrayList;
        }

        public final StateFlow<Set<RecomposerInfo>> getRunningRecomposers() {
            return Recomposer._runningRecomposers;
        }

        public final void invalidateGroupsWithKey$runtime_release(int key) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            for (RecomposerInfoImpl recomposerInfoImpl : (Iterable) Recomposer._runningRecomposers.getValue()) {
                RecomposerErrorInfo currentError = recomposerInfoImpl.getCurrentError();
                if (currentError == null || currentError.getRecoverable()) {
                    recomposerInfoImpl.resetErrorState();
                    recomposerInfoImpl.invalidateGroupsWithKey(key);
                    recomposerInfoImpl.retryFailedCompositions();
                }
            }
        }

        public final void loadStateAndComposeForHotReload$runtime_release(Object token) {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterator it = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it.hasNext()) {
                ((RecomposerInfoImpl) it.next()).resetErrorState();
            }
            Intrinsics.checkNotNull(token, "null cannot be cast to non-null type kotlin.collections.List<androidx.compose.runtime.Recomposer.HotReloadable>");
            List list = (List) token;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((HotReloadable) list.get(i2)).resetContent();
            }
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((HotReloadable) list.get(i3)).recompose();
            }
            Iterator it2 = ((Iterable) Recomposer._runningRecomposers.getValue()).iterator();
            while (it2.hasNext()) {
                ((RecomposerInfoImpl) it2.next()).retryFailedCompositions();
            }
        }

        public final Object saveStateAndDisposeForHotReload$runtime_release() {
            Recomposer._hotReloadEnabled.set(Boolean.TRUE);
            Iterable iterable = (Iterable) Recomposer._runningRecomposers.getValue();
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((RecomposerInfoImpl) it.next()).saveStateAndDisposeForHotReload());
            }
            return arrayList;
        }

        public final void setHotReloadEnabled$runtime_release(boolean value) {
            Recomposer._hotReloadEnabled.set(Boolean.valueOf(value));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007R\u001b\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/Recomposer$HotReloadable;", "", "composition", "Landroidx/compose/runtime/CompositionImpl;", "(Landroidx/compose/runtime/CompositionImpl;)V", "composable", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/jvm/functions/Function2;", "clearContent", "recompose", "resetContent", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class HotReloadable {
        private Function2<? super Composer, ? super Integer, Unit> composable;
        private final CompositionImpl composition;

        public HotReloadable(CompositionImpl compositionImpl) {
            this.composition = compositionImpl;
            this.composable = compositionImpl.getComposable();
        }

        public final void clearContent() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(ComposableSingletons$RecomposerKt.INSTANCE.m3251getLambda1$runtime_release());
            }
        }

        public final void recompose() {
            if (this.composition.getIsRoot()) {
                this.composition.setContent(this.composable);
            }
        }

        public final void resetContent() {
            this.composition.setComposable(this.composable);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0002\u0010\u0007R\u0018\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "Landroidx/compose/runtime/RecomposerErrorInfo;", "recoverable", "", "cause", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(ZLjava/lang/Exception;)V", "getCause", "()Ljava/lang/Exception;", "getRecoverable", "()Z", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RecomposerErrorState implements RecomposerErrorInfo {
        private final Exception cause;
        private final boolean recoverable;

        public RecomposerErrorState(boolean z, Exception exc) {
            this.recoverable = z;
            this.cause = exc;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public Exception getCause() {
            return this.cause;
        }

        @Override // androidx.compose.runtime.RecomposerErrorInfo
        public boolean getRecoverable() {
            return this.recoverable;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0006\u0010\u001a\u001a\u00020\u0015J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cR\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Landroidx/compose/runtime/Recomposer$RecomposerInfoImpl;", "Landroidx/compose/runtime/RecomposerInfo;", "(Landroidx/compose/runtime/Recomposer;)V", "changeCount", "", "getChangeCount", "()J", "currentError", "Landroidx/compose/runtime/RecomposerErrorInfo;", "getCurrentError", "()Landroidx/compose/runtime/RecomposerErrorInfo;", "hasPendingWork", "", "getHasPendingWork", "()Z", "state", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/compose/runtime/Recomposer$State;", "getState", "()Lkotlinx/coroutines/flow/Flow;", "invalidateGroupsWithKey", "", "key", "", "resetErrorState", "Landroidx/compose/runtime/Recomposer$RecomposerErrorState;", "retryFailedCompositions", "saveStateAndDisposeForHotReload", "", "Landroidx/compose/runtime/Recomposer$HotReloadable;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class RecomposerInfoImpl implements RecomposerInfo {
        public RecomposerInfoImpl() {
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public long getChangeCount() {
            return Recomposer.this.getChangeCount();
        }

        public final RecomposerErrorInfo getCurrentError() {
            RecomposerErrorState recomposerErrorState;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                recomposerErrorState = recomposer.errorState;
            }
            return recomposerErrorState;
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public boolean getHasPendingWork() {
            return Recomposer.this.getHasPendingWork();
        }

        @Override // androidx.compose.runtime.RecomposerInfo
        public Flow<State> getState() {
            return Recomposer.this.getCurrentState();
        }

        public final void invalidateGroupsWithKey(int key) {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((CompositionImpl) arrayList.get(i3)).invalidateGroupsWithKey(key);
            }
        }

        public final RecomposerErrorState resetErrorState() {
            return Recomposer.this.resetErrorState();
        }

        public final void retryFailedCompositions() {
            Recomposer.this.retryFailedCompositions();
        }

        public final List<HotReloadable> saveStateAndDisposeForHotReload() {
            List knownCompositions;
            Object obj = Recomposer.this.stateLock;
            Recomposer recomposer = Recomposer.this;
            synchronized (obj) {
                knownCompositions = recomposer.getKnownCompositions();
            }
            ArrayList arrayList = new ArrayList(knownCompositions.size());
            int size = knownCompositions.size();
            for (int i2 = 0; i2 < size; i2++) {
                ControlledComposition controlledComposition = (ControlledComposition) knownCompositions.get(i2);
                CompositionImpl compositionImpl = controlledComposition instanceof CompositionImpl ? (CompositionImpl) controlledComposition : null;
                if (compositionImpl != null) {
                    arrayList.add(compositionImpl);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                HotReloadable hotReloadable = new HotReloadable((CompositionImpl) arrayList.get(i3));
                hotReloadable.clearContent();
                arrayList2.add(hotReloadable);
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$awaitIdle$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$awaitIdle$2, reason: invalid class name */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass2) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0).compareTo(State.Idle) > 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.runtime.Recomposer$join$2, reason: invalid class name and case insensitive filesystem */
    public static final class C04972 extends SuspendLambda implements Function2<State, Continuation<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C04972(Continuation<? super C04972> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04972 c04972 = new C04972(continuation);
            c04972.L$0 = obj;
            return c04972;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(State state, Continuation<? super Boolean> continuation) {
            return ((C04972) create(state, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(((State) this.L$0) == State.ShutDown);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2", f = "Recomposer.kt", i = {0, 0}, l = {1054}, m = "invokeSuspend", n = {"callingJob", "unregisterApplyObserver"}, s = {"L$0", "L$1"})
    /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2, reason: invalid class name and case insensitive filesystem */
    public static final class C04982 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ MonotonicFrameClock $parentFrameClock;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @DebugMetadata(c = "androidx.compose.runtime.Recomposer$recompositionRunner$2$3", f = "Recomposer.kt", i = {}, l = {1055}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: androidx.compose.runtime.Recomposer$recompositionRunner$2$3, reason: invalid class name */
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> $block;
            final /* synthetic */ MonotonicFrameClock $parentFrameClock;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass3(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$block = function3;
                this.$parentFrameClock = monotonicFrameClock;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$block, this.$parentFrameClock, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> function3 = this.$block;
                    MonotonicFrameClock monotonicFrameClock = this.$parentFrameClock;
                    this.label = 1;
                    if (function3.invoke(coroutineScope, monotonicFrameClock, this) == coroutine_suspended) {
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
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C04982(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, MonotonicFrameClock monotonicFrameClock, Continuation<? super C04982> continuation) {
            super(2, continuation);
            this.$block = function3;
            this.$parentFrameClock = monotonicFrameClock;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C04982 c04982 = Recomposer.this.new C04982(this.$block, this.$parentFrameClock, continuation);
            c04982.L$0 = obj;
            return c04982;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 230
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C04982.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C04982) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {921, 928}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: androidx.compose.runtime.Recomposer$runFrameLoop$1, reason: invalid class name and case insensitive filesystem */
    public static final class C04991 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C04991(Continuation<? super C04991> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return Recomposer.this.runFrameLoop(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {574, 585}, m = "invokeSuspend", n = {"parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed", "parentFrameClock", "toRecompose", "toInsert", "toApply", "toLateApply", "toComplete", "modifiedValues", "modifiedValuesSet", "alreadyComposed"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    public static final class C05012 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        int label;

        public C05012(Continuation<? super C05012> continuation) {
            super(3, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final void invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer r22, java.util.List<androidx.compose.runtime.ControlledComposition> r23, java.util.List<androidx.compose.runtime.MovableContentStateReference> r24, java.util.List<androidx.compose.runtime.ControlledComposition> r25, j.S r26, j.S r27, j.S r28, j.S r29) {
            /*
                Method dump skipped, instructions count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C05012.invokeSuspend$clearRecompositionState(androidx.compose.runtime.Recomposer, java.util.List, java.util.List, java.util.List, j.S, j.S, j.S, j.S):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer) {
            list.clear();
            synchronized (recomposer.stateLock) {
                try {
                    List list2 = recomposer.compositionValuesAwaitingInsert;
                    int size = list2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        list.add((MovableContentStateReference) list2.get(i2));
                    }
                    recomposer.compositionValuesAwaitingInsert.clear();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x011b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0104 -> B:24:0x010c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0112 -> B:12:0x00af). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r17) {
            /*
                Method dump skipped, instructions count: 286
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C05012.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C05012 c05012 = Recomposer.this.new C05012(continuation);
            c05012.L$0 = monotonicFrameClock;
            return c05012.invokeSuspend(Unit.INSTANCE);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {890, 910, 911}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
    /* renamed from: androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2, reason: invalid class name and case insensitive filesystem */
    public static final class C05022 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
        final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ Recomposer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C05022(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super C05022> continuation) {
            super(3, continuation);
            this.$recomposeCoroutineContext = coroutineContext;
            this.this$0 = recomposer;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x00b8, code lost:
        
            if (r10.awaitWorkAvailable(r20) == r2) goto L89;
         */
        /* JADX WARN: Code restructure failed: missing block: B:88:0x01b5, code lost:
        
            if (kotlinx.coroutines.JobKt.cancelAndJoin(r0, r20) != r2) goto L90;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0195  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b8 -> B:25:0x00bc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instructions count: 443
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C05022.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
            C05022 c05022 = new C05022(this.$recomposeCoroutineContext, this.this$0, continuation);
            c05022.L$0 = coroutineScope;
            c05022.L$1 = monotonicFrameClock;
            return c05022.invokeSuspend(Unit.INSTANCE);
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$broadcastFrameClock$1
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
                CancellableContinuation cancellableContinuationDeriveStateLocked;
                Object obj = this.this$0.stateLock;
                Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    cancellableContinuationDeriveStateLocked = recomposer.deriveStateLocked();
                    if (((Recomposer.State) recomposer._state.getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
                        throw ExceptionsKt.CancellationException("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
                    }
                }
                if (cancellableContinuationDeriveStateLocked != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuationDeriveStateLocked.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.broadcastFrameClock = broadcastFrameClock;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new S();
        this.compositionInvalidations = new MutableVector<>(new ControlledComposition[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.compositionValuesAwaitingInsert = new ArrayList();
        this.compositionValuesRemoved = new LinkedHashMap();
        this.compositionValueStatesAvailable = new LinkedHashMap();
        this._state = StateFlowKt.MutableStateFlow(State.Inactive);
        CompletableJob completableJobJob = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        completableJobJob.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(final Throwable th) {
                CancellableContinuation cancellableContinuation;
                CancellableContinuation cancellableContinuation2;
                CancellationException CancellationException = ExceptionsKt.CancellationException("Recomposer effect job completed", th);
                Object obj = this.this$0.stateLock;
                final Recomposer recomposer = this.this$0;
                synchronized (obj) {
                    try {
                        Job job = recomposer.runnerJob;
                        cancellableContinuation = null;
                        if (job != null) {
                            recomposer._state.setValue(Recomposer.State.ShuttingDown);
                            if (recomposer.isClosed) {
                                if (recomposer.workContinuation != null) {
                                    cancellableContinuation2 = recomposer.workContinuation;
                                }
                                recomposer.workContinuation = null;
                                job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                        invoke2(th2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(Throwable th2) {
                                        Object obj2 = recomposer.stateLock;
                                        Recomposer recomposer2 = recomposer;
                                        Throwable th3 = th;
                                        synchronized (obj2) {
                                            if (th3 == null) {
                                                th3 = null;
                                            } else if (th2 != null) {
                                                try {
                                                    if (th2 instanceof CancellationException) {
                                                        th2 = null;
                                                    }
                                                    if (th2 != null) {
                                                        kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                    }
                                                } catch (Throwable th4) {
                                                    throw th4;
                                                }
                                            }
                                            recomposer2.closeCause = th3;
                                            recomposer2._state.setValue(Recomposer.State.ShutDown);
                                            Unit unit = Unit.INSTANCE;
                                        }
                                    }
                                });
                                cancellableContinuation = cancellableContinuation2;
                            } else {
                                job.cancel(CancellationException);
                            }
                            cancellableContinuation2 = null;
                            recomposer.workContinuation = null;
                            job.invokeOnCompletion(new Function1<Throwable, Unit>() { // from class: androidx.compose.runtime.Recomposer$effectJob$1$1$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                                    invoke2(th2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(Throwable th2) {
                                    Object obj2 = recomposer.stateLock;
                                    Recomposer recomposer2 = recomposer;
                                    Throwable th3 = th;
                                    synchronized (obj2) {
                                        if (th3 == null) {
                                            th3 = null;
                                        } else if (th2 != null) {
                                            try {
                                                if (th2 instanceof CancellationException) {
                                                    th2 = null;
                                                }
                                                if (th2 != null) {
                                                    kotlin.ExceptionsKt.addSuppressed(th3, th2);
                                                }
                                            } catch (Throwable th4) {
                                                throw th4;
                                            }
                                        }
                                        recomposer2.closeCause = th3;
                                        recomposer2._state.setValue(Recomposer.State.ShutDown);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                }
                            });
                            cancellableContinuation = cancellableContinuation2;
                        } else {
                            recomposer.closeCause = CancellationException;
                            recomposer._state.setValue(Recomposer.State.ShutDown);
                            Unit unit = Unit.INSTANCE;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (cancellableContinuation != null) {
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
                }
            }
        });
        this.effectJob = completableJobJob;
        this.effectCoroutineContext = coroutineContext.plus(broadcastFrameClock).plus(completableJobJob);
        this.recomposerInfo = new RecomposerInfoImpl();
    }

    private final void addKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void applyAndCheck(MutableSnapshot snapshot) {
        try {
            if (snapshot.apply() instanceof SnapshotApplyResult.Failure) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            snapshot.dispose();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitWorkAvailable(Continuation<? super Unit> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl;
        if (getHasSchedulingWork()) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl2 = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl2.initCancellability();
        synchronized (this.stateLock) {
            if (getHasSchedulingWork()) {
                cancellableContinuationImpl = cancellableContinuationImpl2;
            } else {
                this.workContinuation = cancellableContinuationImpl2;
                cancellableContinuationImpl = null;
            }
        }
        if (cancellableContinuationImpl != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationImpl.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
        }
        Object result = cancellableContinuationImpl2.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    private final void clearKnownCompositionsLocked() {
        this._knownCompositions.clear();
        this._knownCompositionsCache = CollectionsKt.emptyList();
    }

    private final <T> T composing(ControlledComposition composition, S modifiedValues, Function0<? extends T> block) {
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            try {
                return block.invoke();
            } finally {
                InlineMarker.finallyStart(1);
                mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                InlineMarker.finallyEnd(1);
            }
        } finally {
            InlineMarker.finallyStart(1);
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
            InlineMarker.finallyEnd(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CancellableContinuation<Unit> deriveStateLocked() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            clearKnownCompositionsLocked();
            this.snapshotInvalidations = new S();
            this.compositionInvalidations.clear();
            this.compositionsAwaitingApply.clear();
            this.compositionValuesAwaitingInsert.clear();
            this.failedCompositions = null;
            CancellableContinuation<? super Unit> cancellableContinuation = this.workContinuation;
            if (cancellableContinuation != null) {
                CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new S();
            this.compositionInvalidations.clear();
            state = getHasBroadcastFrameClockAwaitersLocked() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.isNotEmpty() || this.snapshotInvalidations.c() || !this.compositionsAwaitingApply.isEmpty() || !this.compositionValuesAwaitingInsert.isEmpty() || this.concurrentCompositionsOutstanding > 0 || getHasBroadcastFrameClockAwaitersLocked()) ? State.PendingWork : State.Idle;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        CancellableContinuation cancellableContinuation2 = this.workContinuation;
        this.workContinuation = null;
        return cancellableContinuation2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void discardUnusedValues() {
        int i2;
        List listEmptyList;
        synchronized (this.stateLock) {
            try {
                if (this.compositionValuesRemoved.isEmpty()) {
                    listEmptyList = CollectionsKt.emptyList();
                } else {
                    List listFlatten = CollectionsKt.flatten(this.compositionValuesRemoved.values());
                    this.compositionValuesRemoved.clear();
                    listEmptyList = new ArrayList(listFlatten.size());
                    int size = listFlatten.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        MovableContentStateReference movableContentStateReference = (MovableContentStateReference) listFlatten.get(i3);
                        listEmptyList.add(TuplesKt.to(movableContentStateReference, this.compositionValueStatesAvailable.get(movableContentStateReference)));
                    }
                    this.compositionValueStatesAvailable.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int size2 = listEmptyList.size();
        for (i2 = 0; i2 < size2; i2++) {
            Pair pair = (Pair) listEmptyList.get(i2);
            MovableContentStateReference movableContentStateReference2 = (MovableContentStateReference) pair.component1();
            MovableContentState movableContentState = (MovableContentState) pair.component2();
            if (movableContentState != null) {
                movableContentStateReference2.getComposition().disposeUnusedMovableContent(movableContentState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasBroadcastFrameClockAwaiters() {
        boolean hasBroadcastFrameClockAwaitersLocked;
        synchronized (this.stateLock) {
            hasBroadcastFrameClockAwaitersLocked = getHasBroadcastFrameClockAwaitersLocked();
        }
        return hasBroadcastFrameClockAwaitersLocked;
    }

    private final boolean getHasBroadcastFrameClockAwaitersLocked() {
        return !this.frameClockPaused && this.broadcastFrameClock.getHasAwaiters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getHasConcurrentFrameWorkLocked() {
        return !this.compositionsAwaitingApply.isEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    private final boolean getHasFrameWorkLocked() {
        return this.compositionInvalidations.isNotEmpty() || getHasBroadcastFrameClockAwaitersLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasSchedulingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            j.S r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L1e
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1a
            goto L1e
        L1a:
            r1 = 0
            goto L1f
        L1c:
            r1 = move-exception
            goto L21
        L1e:
            r1 = 1
        L1f:
            monitor-exit(r0)
            return r1
        L21:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasSchedulingWork():boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final List<ControlledComposition> getKnownCompositions() {
        List list = this._knownCompositionsCache;
        List list2 = list;
        if (list == null) {
            List<ControlledComposition> list3 = this._knownCompositions;
            List listEmptyList = list3.isEmpty() ? CollectionsKt.emptyList() : new ArrayList(list3);
            this._knownCompositionsCache = listEmptyList;
            list2 = listEmptyList;
        }
        return list2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getShouldKeepRecomposing() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator<Job> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    @Deprecated(message = "Replaced by currentState as a StateFlow", replaceWith = @ReplaceWith(expression = "currentState", imports = {}))
    public static /* synthetic */ void getState$annotations() {
    }

    private final void performInitialMovableContentInserts(ControlledComposition composition) {
        synchronized (this.stateLock) {
            List<MovableContentStateReference> list = this.compositionValuesAwaitingInsert;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (Intrinsics.areEqual(list.get(i2).getComposition(), composition)) {
                    Unit unit = Unit.INSTANCE;
                    ArrayList arrayList = new ArrayList();
                    performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        performInsertValues(arrayList, null);
                        performInitialMovableContentInserts$fillToInsert(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void performInitialMovableContentInserts$fillToInsert(List<MovableContentStateReference> list, Recomposer recomposer, ControlledComposition controlledComposition) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<MovableContentStateReference> it = recomposer.compositionValuesAwaitingInsert.iterator();
                while (it.hasNext()) {
                    MovableContentStateReference next = it.next();
                    if (Intrinsics.areEqual(next.getComposition(), controlledComposition)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r1 = r7.size();
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
    
        if (r6 >= r1) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c5, code lost:
    
        if (((kotlin.Pair) r7.get(r6)).getSecond() == null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ca, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d8, code lost:
    
        if (r8 >= r6) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00da, code lost:
    
        r9 = (kotlin.Pair) r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e4, code lost:
    
        if (r9.getSecond() != null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
    
        r9 = (androidx.compose.runtime.MovableContentStateReference) r9.getFirst();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f0, code lost:
    
        if (r9 == null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f2, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f5, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f8, code lost:
    
        r6 = r13.stateLock;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00fa, code lost:
    
        monitor-enter(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00fb, code lost:
    
        kotlin.collections.CollectionsKt__MutableCollectionsKt.addAll(r13.compositionValuesAwaitingInsert, r1);
        r1 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0102, code lost:
    
        monitor-exit(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0103, code lost:
    
        r1 = new java.util.ArrayList(r7.size());
        r6 = r7.size();
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0111, code lost:
    
        if (r8 >= r6) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0113, code lost:
    
        r9 = r7.get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011e, code lost:
    
        if (((kotlin.Pair) r9).getSecond() == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0120, code lost:
    
        r1.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0123, code lost:
    
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0126, code lost:
    
        r7 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<androidx.compose.runtime.ControlledComposition> performInsertValues(java.util.List<androidx.compose.runtime.MovableContentStateReference> r14, j.S r15) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.performInsertValues(java.util.List, j.S):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ControlledComposition performRecompose(final ControlledComposition composition, final S modifiedValues) {
        Set<ControlledComposition> set;
        if (composition.isComposing() || composition.getDisposed() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        MutableSnapshot mutableSnapshotTakeMutableSnapshot = Snapshot.INSTANCE.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, modifiedValues));
        try {
            Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.c()) {
                        composition.prepareCompose(new Function0<Unit>() { // from class: androidx.compose.runtime.Recomposer$performRecompose$1$1
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
                                S s2 = modifiedValues;
                                ControlledComposition controlledComposition = composition;
                                Object[] objArr = s2.f825b;
                                long[] jArr = s2.f824a;
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
                                                controlledComposition.recordWriteOf(objArr[(i2 << 3) + i4]);
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
                        });
                    }
                } catch (Throwable th) {
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    throw th;
                }
            }
            boolean zRecompose = composition.recompose();
            mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
            if (zRecompose) {
                return composition;
            }
            return null;
        } finally {
            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
        }
    }

    private final void processCompositionError(Exception e2, ControlledComposition failedInitialComposition, boolean recoverable) throws Exception {
        if (!_hotReloadEnabled.get().booleanValue() || (e2 instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                RecomposerErrorState recomposerErrorState = this.errorState;
                if (recomposerErrorState != null) {
                    throw recomposerErrorState.getCause();
                }
                this.errorState = new RecomposerErrorState(false, e2);
                Unit unit = Unit.INSTANCE;
            }
            throw e2;
        }
        synchronized (this.stateLock) {
            try {
                ActualAndroid_androidKt.logError("Error was captured in composition while live edit was enabled.", e2);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.clear();
                this.snapshotInvalidations = new S();
                this.compositionValuesAwaitingInsert.clear();
                this.compositionValuesRemoved.clear();
                this.compositionValueStatesAvailable.clear();
                this.errorState = new RecomposerErrorState(recoverable, e2);
                if (failedInitialComposition != null) {
                    recordFailedCompositionLocked(failedInitialComposition);
                }
                deriveStateLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void processCompositionError$default(Recomposer recomposer, Exception exc, ControlledComposition controlledComposition, boolean z, int i2, Object obj) throws Exception {
        if ((i2 & 2) != 0) {
            controlledComposition = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        recomposer.processCompositionError(exc, controlledComposition, z);
    }

    private final Function1<Object, Unit> readObserverOf(final ControlledComposition composition) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.readObserverOf.1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                composition.recordReadOf(obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object recompositionRunner(Function3<? super CoroutineScope, ? super MonotonicFrameClock, ? super Continuation<? super Unit>, ? extends Object> function3, Continuation<? super Unit> continuation) throws Throwable {
        Object objWithContext = BuildersKt.withContext(this.broadcastFrameClock, new C04982(function3, MonotonicFrameClockKt.getMonotonicFrameClock(continuation.getContext()), null), continuation);
        return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean recordComposerModifications() {
        List<ControlledComposition> knownCompositions;
        boolean hasFrameWorkLocked;
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.b()) {
                return getHasFrameWorkLocked();
            }
            Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(this.snapshotInvalidations);
            this.snapshotInvalidations = new S();
            synchronized (this.stateLock) {
                knownCompositions = getKnownCompositions();
            }
            try {
                int size = knownCompositions.size();
                for (int i2 = 0; i2 < size; i2++) {
                    knownCompositions.get(i2).recordModificationsOf(setWrapIntoSet);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    this.snapshotInvalidations = new S();
                    Unit unit = Unit.INSTANCE;
                }
                synchronized (this.stateLock) {
                    if (deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    hasFrameWorkLocked = getHasFrameWorkLocked();
                }
                return hasFrameWorkLocked;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    S s2 = this.snapshotInvalidations;
                    Set<? extends Object> elements = setWrapIntoSet;
                    s2.getClass();
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Intrinsics.checkNotNullParameter(elements, "elements");
                    Iterator it = elements.iterator();
                    while (it.hasNext()) {
                        s2.k(it.next());
                    }
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void recordFailedCompositionLocked(ControlledComposition composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        removeKnownCompositionLocked(composition);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerRunnerJob(Job callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            deriveStateLocked();
        }
    }

    private final void removeKnownCompositionLocked(ControlledComposition composition) {
        this._knownCompositions.remove(composition);
        this._knownCompositionsCache = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecomposerErrorState resetErrorState() {
        RecomposerErrorState recomposerErrorState;
        synchronized (this.stateLock) {
            recomposerErrorState = this.errorState;
            if (recomposerErrorState != null) {
                this.errorState = null;
                deriveStateLocked();
            }
        }
        return recomposerErrorState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void retryFailedCompositions() {
        List<ControlledComposition> list;
        int i2;
        synchronized (this.stateLock) {
            list = this.failedCompositions;
            this.failedCompositions = null;
        }
        if (list == null) {
            return;
        }
        while (true) {
            i2 = 0;
            try {
                if (list.isEmpty()) {
                    break;
                }
                ControlledComposition controlledComposition = (ControlledComposition) CollectionsKt.removeLast(list);
                if (controlledComposition instanceof CompositionImpl) {
                    controlledComposition.invalidateAll();
                    controlledComposition.setContent(((CompositionImpl) controlledComposition).getComposable());
                    if (this.errorState != null) {
                        break;
                    }
                }
            } catch (Throwable th) {
                if (!list.isEmpty()) {
                    synchronized (this.stateLock) {
                        try {
                            int size = list.size();
                            while (i2 < size) {
                                recordFailedCompositionLocked(list.get(i2));
                                i2++;
                            }
                            Unit unit = Unit.INSTANCE;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                throw th;
            }
        }
        if (list.isEmpty()) {
            return;
        }
        synchronized (this.stateLock) {
            try {
                int size2 = list.size();
                while (i2 < size2) {
                    recordFailedCompositionLocked(list.get(i2));
                    i2++;
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        if (r5.withFrameNanos(r10, r0) != r1) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00a2 -> B:13:0x003f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runFrameLoop(androidx.compose.runtime.MonotonicFrameClock r8, androidx.compose.runtime.ProduceFrameSignal r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer.C04991
            if (r0 == 0) goto L13
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer.C04991) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L65
            if (r2 == r4) goto L4d
            if (r2 != r3) goto L45
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.ResultKt.throwOnFailure(r10)
        L3f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L73
        L45:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L4d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.ProduceFrameSignal r2 = (androidx.compose.runtime.ProduceFrameSignal) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.MonotonicFrameClock r5 = (androidx.compose.runtime.MonotonicFrameClock) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L8d
        L65:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L73:
            java.lang.Object r6 = r5.stateLock
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.awaitFrameRequest(r6, r0)
            if (r6 != r1) goto L88
            goto La4
        L88:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L8d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>()
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.withFrameNanos(r10, r0)
            if (r10 != r1) goto L3f
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.runFrameLoop(androidx.compose.runtime.MonotonicFrameClock, androidx.compose.runtime.ProduceFrameSignal, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final Function1<Object, Unit> writeObserverOf(final ControlledComposition composition, final S modifiedValues) {
        return new Function1<Object, Unit>() { // from class: androidx.compose.runtime.Recomposer.writeObserverOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                composition.recordWriteOf(obj);
                S s2 = modifiedValues;
                if (s2 != null) {
                    s2.d(obj);
                }
            }
        };
    }

    public final RecomposerInfo asRecomposerInfo() {
        return this.recomposerInfo;
    }

    public final Object awaitIdle(Continuation<? super Unit> continuation) {
        Object objCollect = FlowKt.collect(FlowKt.takeWhile(getCurrentState(), new AnonymousClass2(null)), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
    }

    public final void cancel() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
        Job.DefaultImpls.cancel$default((Job) this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    public final void close() {
        if (this.effectJob.complete()) {
            synchronized (this.stateLock) {
                this.isClosed = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void composeInitial$runtime_release(ControlledComposition composition, Function2<? super Composer, ? super Integer, Unit> content) throws Exception {
        Throwable th;
        boolean zIsComposing = composition.isComposing();
        try {
            Snapshot.Companion companion = Snapshot.INSTANCE;
            MutableSnapshot mutableSnapshotTakeMutableSnapshot = companion.takeMutableSnapshot(readObserverOf(composition), writeObserverOf(composition, null));
            try {
                Snapshot snapshotMakeCurrent = mutableSnapshotTakeMutableSnapshot.makeCurrent();
                try {
                    composition.composeContent(content);
                    Unit unit = Unit.INSTANCE;
                    mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                    applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                    if (!zIsComposing) {
                        companion.notifyObjectsInitialized();
                    }
                    synchronized (this.stateLock) {
                        try {
                            if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                                try {
                                    if (!getKnownCompositions().contains(composition)) {
                                        addKnownCompositionLocked(composition);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                performInitialMovableContentInserts(composition);
                                try {
                                    composition.applyChanges();
                                    composition.applyLateChanges();
                                    if (zIsComposing) {
                                        return;
                                    }
                                    companion.notifyObjectsInitialized();
                                } catch (Exception e2) {
                                    processCompositionError$default(this, e2, null, false, 6, null);
                                }
                            } catch (Exception e3) {
                                processCompositionError(e3, composition, true);
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (Throwable th4) {
                    try {
                        mutableSnapshotTakeMutableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        throw th4;
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            applyAndCheck(mutableSnapshotTakeMutableSnapshot);
                            throw th6;
                        } catch (Exception e4) {
                            e = e4;
                            processCompositionError(e, composition, true);
                        }
                    }
                }
            } catch (Throwable th7) {
                th = th7;
            }
        } catch (Exception e5) {
            e = e5;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void deletedMovableContent$runtime_release(MovableContentStateReference reference) {
        synchronized (this.stateLock) {
            RecomposerKt.addMultiValue(this.compositionValuesRemoved, reference.getContent$runtime_release(), reference);
        }
    }

    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingCallByInformation$runtime_release() {
        return _hotReloadEnabled.get().booleanValue();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingParameterInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public boolean getCollectingSourceInformation$runtime_release() {
        return false;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public int getCompoundHashKey$runtime_release() {
        return 1000;
    }

    public final StateFlow<State> getCurrentState() {
        return this._state;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getHasPendingWork() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.stateLock
            monitor-enter(r0)
            j.S r1 = r2.snapshotInvalidations     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.c()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            androidx.compose.runtime.collection.MutableVector<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionInvalidations     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.isNotEmpty()     // Catch: java.lang.Throwable -> L28
            if (r1 != 0) goto L2a
            int r1 = r2.concurrentCompositionsOutstanding     // Catch: java.lang.Throwable -> L28
            if (r1 > 0) goto L2a
            java.util.List<androidx.compose.runtime.ControlledComposition> r1 = r2.compositionsAwaitingApply     // Catch: java.lang.Throwable -> L28
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L2a
            boolean r1 = r2.getHasBroadcastFrameClockAwaitersLocked()     // Catch: java.lang.Throwable -> L28
            if (r1 == 0) goto L26
            goto L2a
        L26:
            r1 = 0
            goto L2b
        L28:
            r1 = move-exception
            goto L2d
        L2a:
            r1 = 1
        L2b:
            monitor-exit(r0)
            return r1
        L2d:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.getHasPendingWork():boolean");
    }

    @Override // androidx.compose.runtime.CompositionContext
    public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
        return EmptyCoroutineContext.INSTANCE;
    }

    public final Flow<State> getState() {
        return getCurrentState();
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void insertMovableContent$runtime_release(MovableContentStateReference reference) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.compositionValuesAwaitingInsert.add(reference);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidate$runtime_release(ControlledComposition composition) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.contains(composition)) {
                cancellableContinuationDeriveStateLocked = null;
            } else {
                this.compositionInvalidations.add(composition);
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void invalidateScope$runtime_release(RecomposeScopeImpl scope) {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            this.snapshotInvalidations.d(scope);
            cancellableContinuationDeriveStateLocked = deriveStateLocked();
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
        }
    }

    public final Object join(Continuation<? super Unit> continuation) {
        Object objFirst = FlowKt.first(getCurrentState(), new C04972(null), continuation);
        return objFirst == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objFirst : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void movableContentStateReleased$runtime_release(MovableContentStateReference reference, MovableContentState data) {
        synchronized (this.stateLock) {
            this.compositionValueStatesAvailable.put(reference, data);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference reference) {
        MovableContentState movableContentStateRemove;
        synchronized (this.stateLock) {
            movableContentStateRemove = this.compositionValueStatesAvailable.remove(reference);
        }
        return movableContentStateRemove;
    }

    public final void pauseCompositionFrameClock() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void recordInspectionTable$runtime_release(Set<CompositionData> table) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void registerComposition$runtime_release(ControlledComposition composition) {
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void reportRemovedComposition$runtime_release(ControlledComposition composition) {
        synchronized (this.stateLock) {
            try {
                Set linkedHashSet = this.compositionsRemoved;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.compositionsRemoved = linkedHashSet;
                }
                linkedHashSet.add(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void resumeCompositionFrameClock() {
        CancellableContinuation<Unit> cancellableContinuationDeriveStateLocked;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                cancellableContinuationDeriveStateLocked = deriveStateLocked();
            } else {
                cancellableContinuationDeriveStateLocked = null;
            }
        }
        if (cancellableContinuationDeriveStateLocked != null) {
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuationDeriveStateLocked.resumeWith(Result.m6498constructorimpl(Unit.INSTANCE));
        }
    }

    public final Object runRecomposeAndApplyChanges(Continuation<? super Unit> continuation) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C05012(null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    public final Object runRecomposeConcurrentlyAndApplyChanges(CoroutineContext coroutineContext, Continuation<? super Unit> continuation) throws Throwable {
        Object objRecompositionRunner = recompositionRunner(new C05022(coroutineContext, this, null), continuation);
        return objRecompositionRunner == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRecompositionRunner : Unit.INSTANCE;
    }

    @Override // androidx.compose.runtime.CompositionContext
    public void unregisterComposition$runtime_release(ControlledComposition composition) {
        synchronized (this.stateLock) {
            removeKnownCompositionLocked(composition);
            this.compositionInvalidations.remove(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.INSTANCE;
        }
    }

    private final void recordComposerModifications(Function1<? super ControlledComposition, Unit> onEachInvalidComposition) {
        S s2;
        synchronized (this.stateLock) {
            try {
                s2 = this.snapshotInvalidations;
                if (s2.c()) {
                    this.snapshotInvalidations = new S();
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        Set<? extends Object> setWrapIntoSet = ScatterSetWrapperKt.wrapIntoSet(s2);
        int i2 = 0;
        if (!setWrapIntoSet.isEmpty()) {
            List knownCompositions = getKnownCompositions();
            int size = knownCompositions.size();
            for (int i3 = 0; i3 < size; i3++) {
                ((ControlledComposition) knownCompositions.get(i3)).recordModificationsOf(setWrapIntoSet);
            }
        }
        MutableVector mutableVector = this.compositionInvalidations;
        int size2 = mutableVector.getSize();
        if (size2 > 0) {
            Object[] content = mutableVector.getContent();
            do {
                onEachInvalidComposition.invoke(content[i2]);
                i2++;
            } while (i2 < size2);
        }
        this.compositionInvalidations.clear();
        synchronized (this.stateLock) {
            try {
                if (deriveStateLocked() == null) {
                    Unit unit = Unit.INSTANCE;
                    InlineMarker.finallyStart(1);
                } else {
                    throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                }
            } catch (Throwable th2) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th2;
            }
        }
        InlineMarker.finallyEnd(1);
    }
}
