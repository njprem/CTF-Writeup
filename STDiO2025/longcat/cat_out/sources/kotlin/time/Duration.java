package kotlin.time;

import androidx.compose.runtime.changelist.a;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.JvmInline;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087@\u0018\u0000 ¦\u00012\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002¦\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0003H\u0002ø\u0001\u0000¢\u0006\u0004\bG\u0010HJ\u0018\u0010I\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\bK\u0010LJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u001b\u0010M\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bO\u0010QJ\u0018\u0010M\u001a\u00020\u000f2\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010SJ\u001a\u0010T\u001a\u00020U2\b\u0010J\u001a\u0004\u0018\u00010VHÖ\u0003¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bZ\u0010\rJ\r\u0010[\u001a\u00020U¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020UH\u0002¢\u0006\u0004\b_\u0010]J\u000f\u0010`\u001a\u00020UH\u0002¢\u0006\u0004\ba\u0010]J\r\u0010b\u001a\u00020U¢\u0006\u0004\bc\u0010]J\r\u0010d\u001a\u00020U¢\u0006\u0004\be\u0010]J\r\u0010f\u001a\u00020U¢\u0006\u0004\bg\u0010]J\u0018\u0010h\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bi\u0010jJ\u0018\u0010k\u001a\u00020\u00002\u0006\u0010J\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\bl\u0010jJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\u000fH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010PJ\u001b\u0010m\u001a\u00020\u00002\u0006\u0010N\u001a\u00020\tH\u0086\u0002ø\u0001\u0000¢\u0006\u0004\bn\u0010QJ\u009d\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2u\u0010q\u001aq\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(u\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0rH\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010{J\u0088\u0001\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2`\u0010q\u001a\\\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(v\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0|H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010}Js\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p2K\u0010q\u001aG\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(w\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0~H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\bz\u0010\u007fJ`\u0010o\u001a\u0002Hp\"\u0004\b\u0000\u0010p27\u0010q\u001a3\u0012\u0013\u0012\u00110\u0003¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(x\u0012\u0013\u0012\u00110\t¢\u0006\f\bs\u0012\b\bt\u0012\u0004\b\b(y\u0012\u0004\u0012\u0002Hp0\u0080\u0001H\u0086\bø\u0001\u0001\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0005\bz\u0010\u0081\u0001J\u0019\u0010\u0082\u0001\u001a\u00020\u000f2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0019\u0010\u0086\u0001\u001a\u00020\t2\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0011\u0010\u0089\u0001\u001a\u00030\u008a\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008d\u0001\u001a\u00020\u00032\u0007\u0010\u0083\u0001\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0011\u0010\u0090\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0091\u0001\u0010\u0005J\u0011\u0010\u0092\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0005\b\u0093\u0001\u0010\u0005J\u0013\u0010\u0094\u0001\u001a\u00030\u008a\u0001H\u0016¢\u0006\u0006\b\u0095\u0001\u0010\u008c\u0001J%\u0010\u0094\u0001\u001a\u00030\u008a\u00012\u0007\u0010\u0083\u0001\u001a\u00020=2\t\b\u0002\u0010\u0096\u0001\u001a\u00020\t¢\u0006\u0006\b\u0095\u0001\u0010\u0097\u0001J\u001e\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0083\u0001\u001a\u00020=H\u0000ø\u0001\u0000¢\u0006\u0006\b\u0099\u0001\u0010\u008f\u0001J\u0015\u0010\u009a\u0001\u001a\u00020\u0000H\u0086\u0002ø\u0001\u0000¢\u0006\u0005\b\u009b\u0001\u0010\u0005JK\u0010\u009c\u0001\u001a\u00030\u009d\u0001*\b0\u009e\u0001j\u0003`\u009f\u00012\u0007\u0010 \u0001\u001a\u00020\t2\u0007\u0010¡\u0001\u001a\u00020\t2\u0007\u0010¢\u0001\u001a\u00020\t2\b\u0010\u0083\u0001\u001a\u00030\u008a\u00012\u0007\u0010£\u0001\u001a\u00020UH\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001R\u0014\u0010\u0006\u001a\u00020\u00008Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\b\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001c\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u000b\u001a\u0004\b\u001e\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\u0012R\u001a\u0010\"\u001a\u00020\u000f8FX\u0087\u0004¢\u0006\f\u0012\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\u0012R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010\u0005R\u0011\u0010'\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b(\u0010\u0005R\u0011\u0010)\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b*\u0010\u0005R\u0011\u0010+\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b,\u0010\u0005R\u0011\u0010-\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b.\u0010\u0005R\u0011\u0010/\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b0\u0010\u0005R\u0011\u00101\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b2\u0010\u0005R\u001a\u00103\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b4\u0010\u000b\u001a\u0004\b5\u0010\rR\u001a\u00106\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\t8@X\u0081\u0004¢\u0006\f\u0012\u0004\b:\u0010\u000b\u001a\u0004\b;\u0010\rR\u0014\u0010<\u001a\u00020=8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0015\u0010@\u001a\u00020\t8Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\rR\u0014\u0010B\u001a\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010\u0005\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0002\b!\n\u0005\b\u009920\u0001¨\u0006§\u0001"}, d2 = {"Lkotlin/time/Duration;", "", "rawValue", "", "constructor-impl", "(J)J", "absoluteValue", "getAbsoluteValue-UwyO8pc", "hoursComponent", "", "getHoursComponent$annotations", "()V", "getHoursComponent-impl", "(J)I", "inDays", "", "getInDays$annotations", "getInDays-impl", "(J)D", "inHours", "getInHours$annotations", "getInHours-impl", "inMicroseconds", "getInMicroseconds$annotations", "getInMicroseconds-impl", "inMilliseconds", "getInMilliseconds$annotations", "getInMilliseconds-impl", "inMinutes", "getInMinutes$annotations", "getInMinutes-impl", "inNanoseconds", "getInNanoseconds$annotations", "getInNanoseconds-impl", "inSeconds", "getInSeconds$annotations", "getInSeconds-impl", "inWholeDays", "getInWholeDays-impl", "inWholeHours", "getInWholeHours-impl", "inWholeMicroseconds", "getInWholeMicroseconds-impl", "inWholeMilliseconds", "getInWholeMilliseconds-impl", "inWholeMinutes", "getInWholeMinutes-impl", "inWholeNanoseconds", "getInWholeNanoseconds-impl", "inWholeSeconds", "getInWholeSeconds-impl", "minutesComponent", "getMinutesComponent$annotations", "getMinutesComponent-impl", "nanosecondsComponent", "getNanosecondsComponent$annotations", "getNanosecondsComponent-impl", "secondsComponent", "getSecondsComponent$annotations", "getSecondsComponent-impl", "storageUnit", "Lkotlin/time/DurationUnit;", "getStorageUnit-impl", "(J)Lkotlin/time/DurationUnit;", "unitDiscriminator", "getUnitDiscriminator-impl", "value", "getValue-impl", "addValuesMixedRanges", "thisMillis", "otherNanos", "addValuesMixedRanges-UwyO8pc", "(JJJ)J", "compareTo", "other", "compareTo-LRDsOJo", "(JJ)I", "div", "scale", "div-UwyO8pc", "(JD)J", "(JI)J", "div-LRDsOJo", "(JJ)D", "equals", "", "", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "isFinite", "isFinite-impl", "(J)Z", "isInMillis", "isInMillis-impl", "isInNanos", "isInNanos-impl", "isInfinite", "isInfinite-impl", "isNegative", "isNegative-impl", "isPositive", "isPositive-impl", "minus", "minus-LRDsOJo", "(JJ)J", "plus", "plus-LRDsOJo", "times", "times-UwyO8pc", "toComponents", "T", "action", "Lkotlin/Function5;", "Lkotlin/ParameterName;", "name", "days", "hours", "minutes", "seconds", "nanoseconds", "toComponents-impl", "(JLkotlin/jvm/functions/Function5;)Ljava/lang/Object;", "Lkotlin/Function4;", "(JLkotlin/jvm/functions/Function4;)Ljava/lang/Object;", "Lkotlin/Function3;", "(JLkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "Lkotlin/Function2;", "(JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "toDouble", "unit", "toDouble-impl", "(JLkotlin/time/DurationUnit;)D", "toInt", "toInt-impl", "(JLkotlin/time/DurationUnit;)I", "toIsoString", "", "toIsoString-impl", "(J)Ljava/lang/String;", "toLong", "toLong-impl", "(JLkotlin/time/DurationUnit;)J", "toLongMilliseconds", "toLongMilliseconds-impl", "toLongNanoseconds", "toLongNanoseconds-impl", "toString", "toString-impl", "decimals", "(JLkotlin/time/DurationUnit;I)Ljava/lang/String;", "truncateTo", "truncateTo-UwyO8pc$kotlin_stdlib", "unaryMinus", "unaryMinus-UwyO8pc", "appendFractional", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "whole", "fractional", "fractionalSize", "isoZeroes", "appendFractional-impl", "(JLjava/lang/StringBuilder;IIILjava/lang/String;Z)V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
@JvmInline
/* loaded from: classes2.dex */
public final class Duration implements Comparable<Duration> {
    private final long rawValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final long ZERO = m7822constructorimpl(0);
    private static final long INFINITE = DurationKt.durationOfMillis(DurationKt.MAX_MILLIS);
    private static final long NEG_INFINITE = DurationKt.durationOfMillis(-4611686018427387903L);

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010*\u001a\u00020\r2\u0006\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020-H\u0007J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0011J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0014J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b0\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0011J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0014J\u001a\u0010\u001b\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u0017J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0011J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0014J\u001a\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b2\u0010\u0017J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0011J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0014J\u001a\u0010!\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u0017J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0011J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0014J\u001a\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u0010\u0017J\u0018\u00105\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u0018\u00109\u001a\u00020\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0004\b:\u00108J\u0018\u0010;\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b<J\u0018\u0010=\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u000206ø\u0001\u0000¢\u0006\u0002\b>J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\rH\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0011J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0014J\u001a\u0010'\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b?\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0016\u0010\n\u001a\u00020\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\"\u0010\f\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\f\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014R\"\u0010\f\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0010\u0010\u0017R\"\u0010\u0018\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0014R\"\u0010\u0018\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0017R\"\u0010\u001b\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u000f\u001a\u0004\b\u001d\u0010\u0011R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0013\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\u001b\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0017R\"\u0010\u001e\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0013\u001a\u0004\b \u0010\u0014R\"\u0010\u001e\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0017R\"\u0010!\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0011R\"\u0010!\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010\u0014R\"\u0010!\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010\u0017R\"\u0010$\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u000f\u001a\u0004\b&\u0010\u0011R\"\u0010$\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0013\u001a\u0004\b&\u0010\u0014R\"\u0010$\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b&\u0010\u0017R\"\u0010'\u001a\u00020\u0004*\u00020\r8Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u000f\u001a\u0004\b)\u0010\u0011R\"\u0010'\u001a\u00020\u0004*\u00020\u00128Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0013\u001a\u0004\b)\u0010\u0014R\"\u0010'\u001a\u00020\u0004*\u00020\u00158Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b(\u0010\u0016\u001a\u0004\b)\u0010\u0017\u0082\u0002\u0004\n\u0002\b!¨\u0006@"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "()V", "INFINITE", "Lkotlin/time/Duration;", "getINFINITE-UwyO8pc", "()J", "J", "NEG_INFINITE", "getNEG_INFINITE-UwyO8pc$kotlin_stdlib", "ZERO", "getZERO-UwyO8pc", "days", "", "getDays-UwyO8pc$annotations", "(D)V", "getDays-UwyO8pc", "(D)J", "", "(I)V", "(I)J", "", "(J)V", "(J)J", "hours", "getHours-UwyO8pc$annotations", "getHours-UwyO8pc", "microseconds", "getMicroseconds-UwyO8pc$annotations", "getMicroseconds-UwyO8pc", "milliseconds", "getMilliseconds-UwyO8pc$annotations", "getMilliseconds-UwyO8pc", "minutes", "getMinutes-UwyO8pc$annotations", "getMinutes-UwyO8pc", "nanoseconds", "getNanoseconds-UwyO8pc$annotations", "getNanoseconds-UwyO8pc", "seconds", "getSeconds-UwyO8pc$annotations", "getSeconds-UwyO8pc", "convert", "value", "sourceUnit", "Lkotlin/time/DurationUnit;", "targetUnit", "days-UwyO8pc", "hours-UwyO8pc", "microseconds-UwyO8pc", "milliseconds-UwyO8pc", "minutes-UwyO8pc", "nanoseconds-UwyO8pc", "parse", "", "parse-UwyO8pc", "(Ljava/lang/String;)J", "parseIsoString", "parseIsoString-UwyO8pc", "parseIsoStringOrNull", "parseIsoStringOrNull-FghU774", "parseOrNull", "parseOrNull-FghU774", "seconds-UwyO8pc", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m7879getDaysUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7881getDaysUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m7885getHoursUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7887getHoursUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m7891getMicrosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7893getMicrosecondsUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m7897getMillisecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7899getMillisecondsUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m7903getMinutesUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7905getMinutesUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m7909getNanosecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7911getNanosecondsUwyO8pc$annotations(double d2) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m7915getSecondsUwyO8pc(int i2) {
            return DurationKt.toDuration(i2, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7917getSecondsUwyO8pc$annotations(double d2) {
        }

        public final double convert(double value, DurationUnit sourceUnit, DurationUnit targetUnit) {
            Intrinsics.checkNotNullParameter(sourceUnit, "sourceUnit");
            Intrinsics.checkNotNullParameter(targetUnit, "targetUnit");
            return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(value, sourceUnit, targetUnit);
        }

        @Deprecated(message = "Use 'Int.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7921daysUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        /* renamed from: getINFINITE-UwyO8pc, reason: not valid java name */
        public final long m7923getINFINITEUwyO8pc() {
            return Duration.INFINITE;
        }

        /* renamed from: getNEG_INFINITE-UwyO8pc$kotlin_stdlib, reason: not valid java name */
        public final long m7924getNEG_INFINITEUwyO8pc$kotlin_stdlib() {
            return Duration.NEG_INFINITE;
        }

        /* renamed from: getZERO-UwyO8pc, reason: not valid java name */
        public final long m7925getZEROUwyO8pc() {
            return Duration.ZERO;
        }

        @Deprecated(message = "Use 'Int.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7927hoursUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use 'Int.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7930microsecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Int.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7933millisecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Int.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7936minutesUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Int.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7939nanosecondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        /* renamed from: parse-UwyO8pc, reason: not valid java name */
        public final long m7941parseUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, false);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid duration string format: '" + value + "'.", e2);
            }
        }

        /* renamed from: parseIsoString-UwyO8pc, reason: not valid java name */
        public final long m7942parseIsoStringUwyO8pc(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return DurationKt.parseDuration(value, true);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException("Invalid ISO duration string format: '" + value + "'.", e2);
            }
        }

        /* renamed from: parseIsoStringOrNull-FghU774, reason: not valid java name */
        public final Duration m7943parseIsoStringOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m7820boximpl(DurationKt.parseDuration(value, true));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        /* renamed from: parseOrNull-FghU774, reason: not valid java name */
        public final Duration m7944parseOrNullFghU774(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                return Duration.m7820boximpl(DurationKt.parseDuration(value, false));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Deprecated(message = "Use 'Int.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7946secondsUwyO8pc(int value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        private Companion() {
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m7880getDaysUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7882getDaysUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m7886getHoursUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7888getHoursUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m7892getMicrosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7894getMicrosecondsUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m7898getMillisecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7900getMillisecondsUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m7904getMinutesUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7906getMinutesUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m7910getNanosecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7912getNanosecondsUwyO8pc$annotations(int i2) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m7916getSecondsUwyO8pc(long j2) {
            return DurationKt.toDuration(j2, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7918getSecondsUwyO8pc$annotations(int i2) {
        }

        @Deprecated(message = "Use 'Long.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7922daysUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use 'Long.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7928hoursUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use 'Long.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7931microsecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Long.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7934millisecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Long.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7937minutesUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Long.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7940nanosecondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use 'Long.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7947secondsUwyO8pc(long value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }

        /* renamed from: getDays-UwyO8pc, reason: not valid java name */
        private final long m7878getDaysUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.DAYS);
        }

        /* renamed from: getDays-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7883getDaysUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getHours-UwyO8pc, reason: not valid java name */
        private final long m7884getHoursUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.HOURS);
        }

        /* renamed from: getHours-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7889getHoursUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMicroseconds-UwyO8pc, reason: not valid java name */
        private final long m7890getMicrosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MICROSECONDS);
        }

        /* renamed from: getMicroseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7895getMicrosecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMilliseconds-UwyO8pc, reason: not valid java name */
        private final long m7896getMillisecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MILLISECONDS);
        }

        /* renamed from: getMilliseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7901getMillisecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getMinutes-UwyO8pc, reason: not valid java name */
        private final long m7902getMinutesUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.MINUTES);
        }

        /* renamed from: getMinutes-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7907getMinutesUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getNanoseconds-UwyO8pc, reason: not valid java name */
        private final long m7908getNanosecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.NANOSECONDS);
        }

        /* renamed from: getNanoseconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7913getNanosecondsUwyO8pc$annotations(long j2) {
        }

        /* renamed from: getSeconds-UwyO8pc, reason: not valid java name */
        private final long m7914getSecondsUwyO8pc(double d2) {
            return DurationKt.toDuration(d2, DurationUnit.SECONDS);
        }

        /* renamed from: getSeconds-UwyO8pc$annotations, reason: not valid java name */
        public static /* synthetic */ void m7919getSecondsUwyO8pc$annotations(long j2) {
        }

        @Deprecated(message = "Use 'Double.days' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.days", imports = {"kotlin.time.Duration.Companion.days"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: days-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7920daysUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.DAYS);
        }

        @Deprecated(message = "Use 'Double.hours' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.hours", imports = {"kotlin.time.Duration.Companion.hours"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: hours-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7926hoursUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.HOURS);
        }

        @Deprecated(message = "Use 'Double.microseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.microseconds", imports = {"kotlin.time.Duration.Companion.microseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: microseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7929microsecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MICROSECONDS);
        }

        @Deprecated(message = "Use 'Double.milliseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.milliseconds", imports = {"kotlin.time.Duration.Companion.milliseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: milliseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7932millisecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MILLISECONDS);
        }

        @Deprecated(message = "Use 'Double.minutes' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.minutes", imports = {"kotlin.time.Duration.Companion.minutes"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: minutes-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7935minutesUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.MINUTES);
        }

        @Deprecated(message = "Use 'Double.nanoseconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.nanoseconds", imports = {"kotlin.time.Duration.Companion.nanoseconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: nanoseconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7938nanosecondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.NANOSECONDS);
        }

        @Deprecated(message = "Use 'Double.seconds' extension property from Duration.Companion instead.", replaceWith = @ReplaceWith(expression = "value.seconds", imports = {"kotlin.time.Duration.Companion.seconds"}))
        @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.6")
        /* renamed from: seconds-UwyO8pc, reason: not valid java name */
        public final /* synthetic */ long m7945secondsUwyO8pc(double value) {
            return DurationKt.toDuration(value, DurationUnit.SECONDS);
        }
    }

    private /* synthetic */ Duration(long j2) {
        this.rawValue = j2;
    }

    /* renamed from: addValuesMixedRanges-UwyO8pc, reason: not valid java name */
    private static final long m7818addValuesMixedRangesUwyO8pc(long j2, long j3, long j4) {
        long jNanosToMillis = DurationKt.nanosToMillis(j4);
        long j5 = j3 + jNanosToMillis;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return DurationKt.durationOfMillis(RangesKt.coerceIn(j5, -4611686018427387903L, DurationKt.MAX_MILLIS));
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(j5) + (j4 - DurationKt.millisToNanos(jNanosToMillis)));
    }

    /* renamed from: appendFractional-impl, reason: not valid java name */
    private static final void m7819appendFractionalimpl(long j2, StringBuilder sb, int i2, int i3, int i4, String str, boolean z) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strPadStart = StringsKt__StringsKt.padStart(String.valueOf(i3), i4, '0');
            int i5 = -1;
            int length = strPadStart.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strPadStart.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z || i7 >= 3) {
                sb.append((CharSequence) strPadStart, 0, ((i5 + 3) / 3) * 3);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            } else {
                sb.append((CharSequence) strPadStart, 0, i7);
                Intrinsics.checkNotNullExpressionValue(sb, "append(...)");
            }
        }
        sb.append(str);
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Duration m7820boximpl(long j2) {
        return new Duration(j2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7822constructorimpl(long j2) {
        if (!DurationJvmKt.getDurationAssertionsEnabled()) {
            return j2;
        }
        if (m7853isInNanosimpl(j2)) {
            long jM7849getValueimpl = m7849getValueimpl(j2);
            if (-4611686018426999999L <= jM7849getValueimpl && jM7849getValueimpl < 4611686018427000000L) {
                return j2;
            }
            throw new AssertionError(m7849getValueimpl(j2) + " ns is out of nanoseconds range");
        }
        long jM7849getValueimpl2 = m7849getValueimpl(j2);
        if (-4611686018427387903L > jM7849getValueimpl2 || jM7849getValueimpl2 >= 4611686018427387904L) {
            throw new AssertionError(m7849getValueimpl(j2) + " ms is out of milliseconds range");
        }
        long jM7849getValueimpl3 = m7849getValueimpl(j2);
        if (-4611686018426L > jM7849getValueimpl3 || jM7849getValueimpl3 >= 4611686018427L) {
            return j2;
        }
        throw new AssertionError(m7849getValueimpl(j2) + " ms is denormalized");
    }

    /* renamed from: div-LRDsOJo, reason: not valid java name */
    public static final double m7823divLRDsOJo(long j2, long j3) {
        DurationUnit durationUnit = (DurationUnit) ComparisonsKt.maxOf(m7847getStorageUnitimpl(j2), m7847getStorageUnitimpl(j3));
        return m7865toDoubleimpl(j2, durationUnit) / m7865toDoubleimpl(j3, durationUnit);
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m7825divUwyO8pc(long j2, int i2) {
        if (i2 == 0) {
            if (m7856isPositiveimpl(j2)) {
                return INFINITE;
            }
            if (m7855isNegativeimpl(j2)) {
                return NEG_INFINITE;
            }
            throw new IllegalArgumentException("Dividing zero duration by zero yields an undefined result.");
        }
        if (m7853isInNanosimpl(j2)) {
            return DurationKt.durationOfNanos(m7849getValueimpl(j2) / i2);
        }
        if (m7854isInfiniteimpl(j2)) {
            return m7860timesUwyO8pc(j2, MathKt.getSign(i2));
        }
        long j3 = i2;
        long jM7849getValueimpl = m7849getValueimpl(j2) / j3;
        if (-4611686018426L > jM7849getValueimpl || jM7849getValueimpl >= 4611686018427L) {
            return DurationKt.durationOfMillis(jM7849getValueimpl);
        }
        return DurationKt.durationOfNanos(DurationKt.millisToNanos(jM7849getValueimpl) + (DurationKt.millisToNanos(m7849getValueimpl(j2) - (jM7849getValueimpl * j3)) / j3));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7826equalsimpl(long j2, Object obj) {
        return (obj instanceof Duration) && j2 == ((Duration) obj).getRawValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7827equalsimpl0(long j2, long j3) {
        return j2 == j3;
    }

    /* renamed from: getAbsoluteValue-UwyO8pc, reason: not valid java name */
    public static final long m7828getAbsoluteValueUwyO8pc(long j2) {
        return m7855isNegativeimpl(j2) ? m7875unaryMinusUwyO8pc(j2) : j2;
    }

    public static /* synthetic */ void getHoursComponent$annotations() {
    }

    /* renamed from: getHoursComponent-impl, reason: not valid java name */
    public static final int m7829getHoursComponentimpl(long j2) {
        if (m7854isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m7838getInWholeHoursimpl(j2) % 24);
    }

    @Deprecated(message = "Use inWholeDays property instead or convert toDouble(DAYS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.DAYS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInDays$annotations() {
    }

    @Deprecated(message = "Use inWholeHours property instead or convert toDouble(HOURS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.HOURS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInHours$annotations() {
    }

    @Deprecated(message = "Use inWholeMicroseconds property instead or convert toDouble(MICROSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MICROSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMicroseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMilliseconds property instead or convert toDouble(MILLISECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MILLISECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMilliseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeMinutes property instead or convert toDouble(MINUTES) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.MINUTES)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInMinutes$annotations() {
    }

    @Deprecated(message = "Use inWholeNanoseconds property instead or convert toDouble(NANOSECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.NANOSECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInNanoseconds$annotations() {
    }

    @Deprecated(message = "Use inWholeSeconds property instead or convert toDouble(SECONDS) if a double value is required.", replaceWith = @ReplaceWith(expression = "toDouble(DurationUnit.SECONDS)", imports = {}))
    @DeprecatedSinceKotlin(errorSince = "1.8", hiddenSince = "1.9", warningSince = "1.5")
    public static /* synthetic */ void getInSeconds$annotations() {
    }

    /* renamed from: getInWholeDays-impl, reason: not valid java name */
    public static final long m7837getInWholeDaysimpl(long j2) {
        return m7868toLongimpl(j2, DurationUnit.DAYS);
    }

    /* renamed from: getInWholeHours-impl, reason: not valid java name */
    public static final long m7838getInWholeHoursimpl(long j2) {
        return m7868toLongimpl(j2, DurationUnit.HOURS);
    }

    /* renamed from: getInWholeMicroseconds-impl, reason: not valid java name */
    public static final long m7839getInWholeMicrosecondsimpl(long j2) {
        return m7868toLongimpl(j2, DurationUnit.MICROSECONDS);
    }

    /* renamed from: getInWholeMilliseconds-impl, reason: not valid java name */
    public static final long m7840getInWholeMillisecondsimpl(long j2) {
        return (m7852isInMillisimpl(j2) && m7851isFiniteimpl(j2)) ? m7849getValueimpl(j2) : m7868toLongimpl(j2, DurationUnit.MILLISECONDS);
    }

    /* renamed from: getInWholeMinutes-impl, reason: not valid java name */
    public static final long m7841getInWholeMinutesimpl(long j2) {
        return m7868toLongimpl(j2, DurationUnit.MINUTES);
    }

    /* renamed from: getInWholeNanoseconds-impl, reason: not valid java name */
    public static final long m7842getInWholeNanosecondsimpl(long j2) {
        long jM7849getValueimpl = m7849getValueimpl(j2);
        if (m7853isInNanosimpl(j2)) {
            return jM7849getValueimpl;
        }
        if (jM7849getValueimpl > 9223372036854L) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (jM7849getValueimpl < -9223372036854L) {
            return Long.MIN_VALUE;
        }
        return DurationKt.millisToNanos(jM7849getValueimpl);
    }

    /* renamed from: getInWholeSeconds-impl, reason: not valid java name */
    public static final long m7843getInWholeSecondsimpl(long j2) {
        return m7868toLongimpl(j2, DurationUnit.SECONDS);
    }

    public static /* synthetic */ void getMinutesComponent$annotations() {
    }

    /* renamed from: getMinutesComponent-impl, reason: not valid java name */
    public static final int m7844getMinutesComponentimpl(long j2) {
        if (m7854isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m7841getInWholeMinutesimpl(j2) % 60);
    }

    public static /* synthetic */ void getNanosecondsComponent$annotations() {
    }

    /* renamed from: getNanosecondsComponent-impl, reason: not valid java name */
    public static final int m7845getNanosecondsComponentimpl(long j2) {
        if (m7854isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m7852isInMillisimpl(j2) ? DurationKt.millisToNanos(m7849getValueimpl(j2) % 1000) : m7849getValueimpl(j2) % 1000000000);
    }

    public static /* synthetic */ void getSecondsComponent$annotations() {
    }

    /* renamed from: getSecondsComponent-impl, reason: not valid java name */
    public static final int m7846getSecondsComponentimpl(long j2) {
        if (m7854isInfiniteimpl(j2)) {
            return 0;
        }
        return (int) (m7843getInWholeSecondsimpl(j2) % 60);
    }

    /* renamed from: getStorageUnit-impl, reason: not valid java name */
    private static final DurationUnit m7847getStorageUnitimpl(long j2) {
        return m7853isInNanosimpl(j2) ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS;
    }

    /* renamed from: getUnitDiscriminator-impl, reason: not valid java name */
    private static final int m7848getUnitDiscriminatorimpl(long j2) {
        return ((int) j2) & 1;
    }

    /* renamed from: getValue-impl, reason: not valid java name */
    private static final long m7849getValueimpl(long j2) {
        return j2 >> 1;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7850hashCodeimpl(long j2) {
        return Long.hashCode(j2);
    }

    /* renamed from: isFinite-impl, reason: not valid java name */
    public static final boolean m7851isFiniteimpl(long j2) {
        return !m7854isInfiniteimpl(j2);
    }

    /* renamed from: isInMillis-impl, reason: not valid java name */
    private static final boolean m7852isInMillisimpl(long j2) {
        return (((int) j2) & 1) == 1;
    }

    /* renamed from: isInNanos-impl, reason: not valid java name */
    private static final boolean m7853isInNanosimpl(long j2) {
        return (((int) j2) & 1) == 0;
    }

    /* renamed from: isInfinite-impl, reason: not valid java name */
    public static final boolean m7854isInfiniteimpl(long j2) {
        return j2 == INFINITE || j2 == NEG_INFINITE;
    }

    /* renamed from: isNegative-impl, reason: not valid java name */
    public static final boolean m7855isNegativeimpl(long j2) {
        return j2 < 0;
    }

    /* renamed from: isPositive-impl, reason: not valid java name */
    public static final boolean m7856isPositiveimpl(long j2) {
        return j2 > 0;
    }

    /* renamed from: minus-LRDsOJo, reason: not valid java name */
    public static final long m7857minusLRDsOJo(long j2, long j3) {
        return m7858plusLRDsOJo(j2, m7875unaryMinusUwyO8pc(j3));
    }

    /* renamed from: plus-LRDsOJo, reason: not valid java name */
    public static final long m7858plusLRDsOJo(long j2, long j3) {
        if (m7854isInfiniteimpl(j2)) {
            if (m7851isFiniteimpl(j3) || (j3 ^ j2) >= 0) {
                return j2;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (m7854isInfiniteimpl(j3)) {
            return j3;
        }
        if ((((int) j2) & 1) != (((int) j3) & 1)) {
            return m7852isInMillisimpl(j2) ? m7818addValuesMixedRangesUwyO8pc(j2, m7849getValueimpl(j2), m7849getValueimpl(j3)) : m7818addValuesMixedRangesUwyO8pc(j2, m7849getValueimpl(j3), m7849getValueimpl(j2));
        }
        long jM7849getValueimpl = m7849getValueimpl(j2) + m7849getValueimpl(j3);
        return m7853isInNanosimpl(j2) ? DurationKt.durationOfNanosNormalized(jM7849getValueimpl) : DurationKt.durationOfMillisNormalized(jM7849getValueimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m7860timesUwyO8pc(long j2, int i2) {
        if (m7854isInfiniteimpl(j2)) {
            if (i2 != 0) {
                return i2 > 0 ? j2 : m7875unaryMinusUwyO8pc(j2);
            }
            throw new IllegalArgumentException("Multiplying infinite duration by zero yields an undefined result.");
        }
        if (i2 == 0) {
            return ZERO;
        }
        long jM7849getValueimpl = m7849getValueimpl(j2);
        long j3 = i2;
        long j4 = jM7849getValueimpl * j3;
        if (!m7853isInNanosimpl(j2)) {
            if (j4 / j3 == jM7849getValueimpl) {
                return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(j4, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
            }
            return MathKt.getSign(i2) * MathKt.getSign(jM7849getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        if (-2147483647L <= jM7849getValueimpl && jM7849getValueimpl < 2147483648L) {
            return DurationKt.durationOfNanos(j4);
        }
        if (j4 / j3 == jM7849getValueimpl) {
            return DurationKt.durationOfNanosNormalized(j4);
        }
        long jNanosToMillis = DurationKt.nanosToMillis(jM7849getValueimpl);
        long j5 = jNanosToMillis * j3;
        long jNanosToMillis2 = DurationKt.nanosToMillis((jM7849getValueimpl - DurationKt.millisToNanos(jNanosToMillis)) * j3) + j5;
        if (j5 / j3 != jNanosToMillis || (jNanosToMillis2 ^ j5) < 0) {
            return MathKt.getSign(i2) * MathKt.getSign(jM7849getValueimpl) > 0 ? INFINITE : NEG_INFINITE;
        }
        return DurationKt.durationOfMillis(RangesKt___RangesKt.coerceIn(jNanosToMillis2, new LongRange(-4611686018427387903L, DurationKt.MAX_MILLIS)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7864toComponentsimpl(long j2, Function5<? super Long, ? super Integer, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7837getInWholeDaysimpl(j2)), Integer.valueOf(m7829getHoursComponentimpl(j2)), Integer.valueOf(m7844getMinutesComponentimpl(j2)), Integer.valueOf(m7846getSecondsComponentimpl(j2)), Integer.valueOf(m7845getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toDouble-impl, reason: not valid java name */
    public static final double m7865toDoubleimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == INFINITE) {
            return Double.POSITIVE_INFINITY;
        }
        if (j2 == NEG_INFINITE) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7849getValueimpl(j2), m7847getStorageUnitimpl(j2), unit);
    }

    /* renamed from: toInt-impl, reason: not valid java name */
    public static final int m7866toIntimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        return (int) RangesKt.coerceIn(m7868toLongimpl(j2, unit), -2147483648L, 2147483647L);
    }

    /* renamed from: toIsoString-impl, reason: not valid java name */
    public static final String m7867toIsoStringimpl(long j2) {
        StringBuilder sb = new StringBuilder();
        if (m7855isNegativeimpl(j2)) {
            sb.append('-');
        }
        sb.append("PT");
        long jM7828getAbsoluteValueUwyO8pc = m7828getAbsoluteValueUwyO8pc(j2);
        long jM7838getInWholeHoursimpl = m7838getInWholeHoursimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7844getMinutesComponentimpl = m7844getMinutesComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7846getSecondsComponentimpl = m7846getSecondsComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7845getNanosecondsComponentimpl = m7845getNanosecondsComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        long j3 = m7854isInfiniteimpl(j2) ? 9999999999999L : jM7838getInWholeHoursimpl;
        boolean z = false;
        boolean z2 = j3 != 0;
        boolean z3 = (iM7846getSecondsComponentimpl == 0 && iM7845getNanosecondsComponentimpl == 0) ? false : true;
        if (iM7844getMinutesComponentimpl != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(j3);
            sb.append('H');
        }
        if (z) {
            sb.append(iM7844getMinutesComponentimpl);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            m7819appendFractionalimpl(j2, sb, iM7846getSecondsComponentimpl, iM7845getNanosecondsComponentimpl, 9, "S", true);
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: toLong-impl, reason: not valid java name */
    public static final long m7868toLongimpl(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j2 == INFINITE) {
            return LongCompanionObject.MAX_VALUE;
        }
        if (j2 == NEG_INFINITE) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(m7849getValueimpl(j2), m7847getStorageUnitimpl(j2), unit);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7871toStringimpl(long j2) {
        if (j2 == 0) {
            return "0s";
        }
        if (j2 == INFINITE) {
            return "Infinity";
        }
        if (j2 == NEG_INFINITE) {
            return "-Infinity";
        }
        boolean zM7855isNegativeimpl = m7855isNegativeimpl(j2);
        StringBuilder sb = new StringBuilder();
        if (zM7855isNegativeimpl) {
            sb.append('-');
        }
        long jM7828getAbsoluteValueUwyO8pc = m7828getAbsoluteValueUwyO8pc(j2);
        long jM7837getInWholeDaysimpl = m7837getInWholeDaysimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7829getHoursComponentimpl = m7829getHoursComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7844getMinutesComponentimpl = m7844getMinutesComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7846getSecondsComponentimpl = m7846getSecondsComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int iM7845getNanosecondsComponentimpl = m7845getNanosecondsComponentimpl(jM7828getAbsoluteValueUwyO8pc);
        int i2 = 0;
        boolean z = jM7837getInWholeDaysimpl != 0;
        boolean z2 = iM7829getHoursComponentimpl != 0;
        boolean z3 = iM7844getMinutesComponentimpl != 0;
        boolean z4 = (iM7846getSecondsComponentimpl == 0 && iM7845getNanosecondsComponentimpl == 0) ? false : true;
        if (z) {
            sb.append(jM7837getInWholeDaysimpl);
            sb.append('d');
            i2 = 1;
        }
        if (z2 || (z && (z3 || z4))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM7829getHoursComponentimpl);
            sb.append('h');
            i2 = i3;
        }
        if (z3 || (z4 && (z2 || z))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iM7844getMinutesComponentimpl);
            sb.append('m');
            i2 = i4;
        }
        if (z4) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iM7846getSecondsComponentimpl != 0 || z || z2 || z3) {
                m7819appendFractionalimpl(j2, sb, iM7846getSecondsComponentimpl, iM7845getNanosecondsComponentimpl, 9, "s", false);
            } else if (iM7845getNanosecondsComponentimpl >= 1000000) {
                m7819appendFractionalimpl(j2, sb, iM7845getNanosecondsComponentimpl / DurationKt.NANOS_IN_MILLIS, iM7845getNanosecondsComponentimpl % DurationKt.NANOS_IN_MILLIS, 6, "ms", false);
            } else if (iM7845getNanosecondsComponentimpl >= 1000) {
                m7819appendFractionalimpl(j2, sb, iM7845getNanosecondsComponentimpl / 1000, iM7845getNanosecondsComponentimpl % 1000, 3, "us", false);
            } else {
                sb.append(iM7845getNanosecondsComponentimpl);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (zM7855isNegativeimpl && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    /* renamed from: toString-impl$default, reason: not valid java name */
    public static /* synthetic */ String m7873toStringimpl$default(long j2, DurationUnit durationUnit, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return m7872toStringimpl(j2, durationUnit, i2);
    }

    /* renamed from: truncateTo-UwyO8pc$kotlin_stdlib, reason: not valid java name */
    public static final long m7874truncateToUwyO8pc$kotlin_stdlib(long j2, DurationUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        DurationUnit durationUnitM7847getStorageUnitimpl = m7847getStorageUnitimpl(j2);
        if (unit.compareTo(durationUnitM7847getStorageUnitimpl) <= 0 || m7854isInfiniteimpl(j2)) {
            return j2;
        }
        return DurationKt.toDuration(m7849getValueimpl(j2) - (m7849getValueimpl(j2) % DurationUnitKt__DurationUnitJvmKt.convertDurationUnit(1L, unit, durationUnitM7847getStorageUnitimpl)), durationUnitM7847getStorageUnitimpl);
    }

    /* renamed from: unaryMinus-UwyO8pc, reason: not valid java name */
    public static final long m7875unaryMinusUwyO8pc(long j2) {
        return DurationKt.durationOf(-m7849getValueimpl(j2), ((int) j2) & 1);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Duration duration) {
        return m7876compareToLRDsOJo(duration.getRawValue());
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public int m7876compareToLRDsOJo(long j2) {
        return m7821compareToLRDsOJo(this.rawValue, j2);
    }

    public boolean equals(Object obj) {
        return m7826equalsimpl(this.rawValue, obj);
    }

    public int hashCode() {
        return m7850hashCodeimpl(this.rawValue);
    }

    public String toString() {
        return m7871toStringimpl(this.rawValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getRawValue() {
        return this.rawValue;
    }

    /* renamed from: compareTo-LRDsOJo, reason: not valid java name */
    public static int m7821compareToLRDsOJo(long j2, long j3) {
        long j4 = j2 ^ j3;
        if (j4 < 0 || (((int) j4) & 1) == 0) {
            return Intrinsics.compare(j2, j3);
        }
        int i2 = (((int) j2) & 1) - (((int) j3) & 1);
        return m7855isNegativeimpl(j2) ? -i2 : i2;
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7863toComponentsimpl(long j2, Function4<? super Long, ? super Integer, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7838getInWholeHoursimpl(j2)), Integer.valueOf(m7844getMinutesComponentimpl(j2)), Integer.valueOf(m7846getSecondsComponentimpl(j2)), Integer.valueOf(m7845getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7862toComponentsimpl(long j2, Function3<? super Long, ? super Integer, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7841getInWholeMinutesimpl(j2)), Integer.valueOf(m7846getSecondsComponentimpl(j2)), Integer.valueOf(m7845getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: toComponents-impl, reason: not valid java name */
    public static final <T> T m7861toComponentsimpl(long j2, Function2<? super Long, ? super Integer, ? extends T> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action.invoke(Long.valueOf(m7843getInWholeSecondsimpl(j2)), Integer.valueOf(m7845getNanosecondsComponentimpl(j2)));
    }

    /* renamed from: div-UwyO8pc, reason: not valid java name */
    public static final long m7824divUwyO8pc(long j2, double d2) {
        int iRoundToInt = MathKt.roundToInt(d2);
        if (iRoundToInt == d2 && iRoundToInt != 0) {
            return m7825divUwyO8pc(j2, iRoundToInt);
        }
        DurationUnit durationUnitM7847getStorageUnitimpl = m7847getStorageUnitimpl(j2);
        return DurationKt.toDuration(m7865toDoubleimpl(j2, durationUnitM7847getStorageUnitimpl) / d2, durationUnitM7847getStorageUnitimpl);
    }

    /* renamed from: times-UwyO8pc, reason: not valid java name */
    public static final long m7859timesUwyO8pc(long j2, double d2) {
        int iRoundToInt = MathKt.roundToInt(d2);
        if (iRoundToInt == d2) {
            return m7860timesUwyO8pc(j2, iRoundToInt);
        }
        DurationUnit durationUnitM7847getStorageUnitimpl = m7847getStorageUnitimpl(j2);
        return DurationKt.toDuration(m7865toDoubleimpl(j2, durationUnitM7847getStorageUnitimpl) * d2, durationUnitM7847getStorageUnitimpl);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static final String m7872toStringimpl(long j2, DurationUnit unit, int i2) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (i2 >= 0) {
            double dM7865toDoubleimpl = m7865toDoubleimpl(j2, unit);
            if (Double.isInfinite(dM7865toDoubleimpl)) {
                return String.valueOf(dM7865toDoubleimpl);
            }
            return DurationJvmKt.formatToExactDecimals(dM7865toDoubleimpl, RangesKt.coerceAtMost(i2, 12)) + DurationUnitKt__DurationUnitKt.shortName(unit);
        }
        throw new IllegalArgumentException(a.n("decimals must be not negative, but was ", i2).toString());
    }
}
