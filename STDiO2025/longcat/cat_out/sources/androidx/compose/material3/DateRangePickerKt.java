package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.DisplayMode;
import androidx.compose.material3.internal.CalendarDate;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.material3.internal.Strings;
import androidx.compose.material3.internal.Strings_androidKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.semantics.CustomAccessibilityAction;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ak\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0015\b\u0002\u0010\u0011\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\n\u0018\u00010\u0012¢\u0006\u0002\b\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007¢\u0006\u0002\u0010\u0019\u001a°\u0001\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010.\u001a`\u0010/\u001a\u00020\f2\n\u00100\u001a\u000601j\u0002`22\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\b8\u00109\u001a½\u0001\u0010:\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001e\u001a\u00020\u001c2\u0006\u0010;\u001a\u0002072:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003ø\u0001\u0000¢\u0006\u0004\b<\u0010=\u001a°\u0001\u0010>\u001a\u00020\n2\u0006\u0010?\u001a\u00020@2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 2!\u0010%\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b('\u0012\u0004\u0012\u00020\n0&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010,\u001a\u00020-2\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010A\u001a.\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C2\u0006\u0010\u000b\u001a\u00020@2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020HH\u0002\u001aT\u0010J\u001a\u00020\f2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u001c2\b\b\u0002\u0010*\u001a\u00020+2\b\b\u0002\u00106\u001a\u0002072\b\b\u0002\u0010,\u001a\u00020-H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\u001ae\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u001c2\b\u0010O\u001a\u0004\u0018\u00010\u001c2\b\u0010P\u001a\u0004\u0018\u00010\u001c2:\u0010\u001f\u001a6\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0015\u0012\u0013\u0018\u00010\u001c¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\n0 H\u0002¢\u0006\u0002\u0010Q\u001a&\u0010R\u001a\u00020\n*\u00020S2\u0006\u0010T\u001a\u00020U2\u0006\u0010V\u001a\u00020WH\u0000ø\u0001\u0000¢\u0006\u0004\bX\u0010Y\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Z"}, d2 = {"CalendarMonthSubheadPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "DateRangePickerHeadlinePadding", "DateRangePickerTitlePadding", "HeaderHeightOffset", "Landroidx/compose/ui/unit/Dp;", "F", "DateRangePicker", "", "state", "Landroidx/compose/material3/DateRangePickerState;", "modifier", "Landroidx/compose/ui/Modifier;", "dateFormatter", "Landroidx/compose/material3/DatePickerFormatter;", "title", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "headline", "showModeToggle", "", "colors", "Landroidx/compose/material3/DatePickerColors;", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "DateRangePickerContent", "selectedStartDateMillis", "", "selectedEndDateMillis", "displayedMonthMillis", "onDatesSelectionChange", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "startDateMillis", "endDateMillis", "onDisplayedMonthChange", "Lkotlin/Function1;", "monthInMillis", "calendarModel", "Landroidx/compose/material3/internal/CalendarModel;", "yearRange", "Lkotlin/ranges/IntRange;", "selectableDates", "Landroidx/compose/material3/SelectableDates;", "(Ljava/lang/Long;Ljava/lang/Long;JLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "DateRangePickerState", "locale", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "Landroidx/compose/material3/DisplayMode;", "DateRangePickerState-HVP43zI", "(Ljava/util/Locale;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;)Landroidx/compose/material3/DateRangePickerState;", "SwitchableDateEntryContent", "displayMode", "SwitchableDateEntryContent-RN-2D1Q", "(Ljava/lang/Long;Ljava/lang/Long;JILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "VerticalMonthsList", "lazyListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Landroidx/compose/foundation/lazy/LazyListState;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/material3/internal/CalendarModel;Lkotlin/ranges/IntRange;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/material3/SelectableDates;Landroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;I)V", "customScrollActions", "", "Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "scrollUpLabel", "", "scrollDownLabel", "rememberDateRangePickerState", "rememberDateRangePickerState-IlFM19s", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/material3/SelectableDates;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "updateDateSelection", "dateInMillis", "currentStartDateMillis", "currentEndDateMillis", "(JLjava/lang/Long;Ljava/lang/Long;Lkotlin/jvm/functions/Function2;)V", "drawRangeBackground", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "selectedRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", "color", "Landroidx/compose/ui/graphics/Color;", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DateRangePickerKt {
    private static final PaddingValues DateRangePickerHeadlinePadding;
    private static final PaddingValues DateRangePickerTitlePadding;
    private static final PaddingValues CalendarMonthSubheadPadding = PaddingKt.m639PaddingValuesa9UjIt4$default(Dp.m6233constructorimpl(24), Dp.m6233constructorimpl(20), 0.0f, Dp.m6233constructorimpl(8), 4, null);
    private static final float HeaderHeightOffset = Dp.m6233constructorimpl(60);

    static {
        float f2 = 64;
        float f3 = 12;
        DateRangePickerTitlePadding = PaddingKt.m639PaddingValuesa9UjIt4$default(Dp.m6233constructorimpl(f2), 0.0f, Dp.m6233constructorimpl(f3), 0.0f, 10, null);
        DateRangePickerHeadlinePadding = PaddingKt.m639PaddingValuesa9UjIt4$default(Dp.m6233constructorimpl(f2), 0.0f, Dp.m6233constructorimpl(f3), Dp.m6233constructorimpl(f3), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DateRangePicker(final androidx.compose.material3.DateRangePickerState r25, androidx.compose.ui.Modifier r26, androidx.compose.material3.DatePickerFormatter r27, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r28, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r29, boolean r30, androidx.compose.material3.DatePickerColors r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePicker(androidx.compose.material3.DateRangePickerState, androidx.compose.ui.Modifier, androidx.compose.material3.DatePickerFormatter, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, boolean, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void DateRangePickerContent(final java.lang.Long r18, final java.lang.Long r19, final long r20, final kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> r22, final kotlin.jvm.functions.Function1<? super java.lang.Long, kotlin.Unit> r23, final androidx.compose.material3.internal.CalendarModel r24, final kotlin.ranges.IntRange r25, final androidx.compose.material3.DatePickerFormatter r26, final androidx.compose.material3.SelectableDates r27, final androidx.compose.material3.DatePickerColors r28, androidx.compose.runtime.Composer r29, final int r30) {
        /*
            Method dump skipped, instructions count: 503
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt.DateRangePickerContent(java.lang.Long, java.lang.Long, long, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, androidx.compose.material3.internal.CalendarModel, kotlin.ranges.IntRange, androidx.compose.material3.DatePickerFormatter, androidx.compose.material3.SelectableDates, androidx.compose.material3.DatePickerColors, androidx.compose.runtime.Composer, int):void");
    }

    /* renamed from: DateRangePickerState-HVP43zI, reason: not valid java name */
    public static final DateRangePickerState m1675DateRangePickerStateHVP43zI(Locale locale, Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates) {
        return new DateRangePickerStateImpl(l2, l3, l4, intRange, i2, selectableDates, locale, null);
    }

    /* renamed from: DateRangePickerState-HVP43zI$default, reason: not valid java name */
    public static /* synthetic */ DateRangePickerState m1676DateRangePickerStateHVP43zI$default(Locale locale, Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            l2 = null;
        }
        if ((i3 & 4) != 0) {
            l3 = null;
        }
        if ((i3 & 8) != 0) {
            l4 = l2;
        }
        if ((i3 & 16) != 0) {
            intRange = DatePickerDefaults.INSTANCE.getYearRange();
        }
        if ((i3 & 32) != 0) {
            i2 = DisplayMode.INSTANCE.m1702getPickerjFl4v0();
        }
        if ((i3 & 64) != 0) {
            selectableDates = DatePickerDefaults.INSTANCE.getAllDates();
        }
        return m1675DateRangePickerStateHVP43zI(locale, l2, l3, l4, intRange, i2, selectableDates);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: SwitchableDateEntryContent-RN-2D1Q, reason: not valid java name */
    public static final void m1677SwitchableDateEntryContentRN2D1Q(final Long l2, final Long l3, final long j2, final int i2, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i3, final int i4) {
        int i5;
        Long l4;
        long j3;
        Function2<? super Long, ? super Long, Unit> function22;
        Function1<? super Long, Unit> function12;
        CalendarModel calendarModel2;
        IntRange intRange2;
        int i6;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532789335);
        if ((i3 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(l2) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            l4 = l3;
            i5 |= composerStartRestartGroup.changed(l4) ? 32 : 16;
        } else {
            l4 = l3;
        }
        if ((i3 & 384) == 0) {
            j3 = j2;
            i5 |= composerStartRestartGroup.changed(j3) ? Fields.RotationX : 128;
        } else {
            j3 = j2;
        }
        if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changed(i2) ? Fields.CameraDistance : 1024;
        }
        if ((i3 & 24576) == 0) {
            function22 = function2;
            i5 |= composerStartRestartGroup.changedInstance(function22) ? Fields.Clip : 8192;
        } else {
            function22 = function2;
        }
        if ((196608 & i3) == 0) {
            function12 = function1;
            i5 |= composerStartRestartGroup.changedInstance(function12) ? Fields.RenderEffect : 65536;
        } else {
            function12 = function1;
        }
        if ((1572864 & i3) == 0) {
            calendarModel2 = calendarModel;
            i5 |= composerStartRestartGroup.changedInstance(calendarModel2) ? 1048576 : 524288;
        } else {
            calendarModel2 = calendarModel;
        }
        if ((12582912 & i3) == 0) {
            intRange2 = intRange;
            i5 |= composerStartRestartGroup.changedInstance(intRange2) ? 8388608 : 4194304;
        } else {
            intRange2 = intRange;
        }
        if ((i3 & 100663296) == 0) {
            i5 |= (i3 & 134217728) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 67108864 : 33554432;
        }
        if ((i3 & 805306368) == 0) {
            i5 |= composerStartRestartGroup.changed(selectableDates) ? 536870912 : 268435456;
        }
        if ((i4 & 6) == 0) {
            i6 = i4 | (composerStartRestartGroup.changed(datePickerColors) ? 4 : 2);
        } else {
            i6 = i4;
        }
        if ((i5 & 306783379) == 306783378 && (i6 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-532789335, i5, i6, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:661)");
            }
            final Long l5 = l4;
            final Function2<? super Long, ? super Long, Unit> function23 = function22;
            final IntRange intRange3 = intRange2;
            final long j4 = j3;
            final Function1<? super Long, Unit> function13 = function12;
            final CalendarModel calendarModel3 = calendarModel2;
            composer2 = composerStartRestartGroup;
            CrossfadeKt.Crossfade(DisplayMode.m1694boximpl(i2), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    invoke2(semanticsPropertyReceiver);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                    SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                }
            }, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.rememberComposableLambda(-1026642619, true, new Function3<DisplayMode, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(DisplayMode displayMode, Composer composer3, Integer num) {
                    m1682invokeQujVXRc(displayMode.getValue(), composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke-QujVXRc, reason: not valid java name */
                public final void m1682invokeQujVXRc(int i7, Composer composer3, int i8) {
                    int i9;
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer3.changed(i7) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1026642619, i9, -1, "androidx.compose.material3.SwitchableDateEntryContent.<anonymous> (DateRangePicker.kt:673)");
                    }
                    DisplayMode.Companion companion = DisplayMode.INSTANCE;
                    if (DisplayMode.m1697equalsimpl0(i7, companion.m1702getPickerjFl4v0())) {
                        composer3.startReplaceGroup(-1871305297);
                        DateRangePickerKt.DateRangePickerContent(l2, l5, j4, function23, function13, calendarModel3, intRange3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else if (DisplayMode.m1697equalsimpl0(i7, companion.m1701getInputjFl4v0())) {
                        composer3.startReplaceGroup(-1871284056);
                        DateRangeInputKt.DateRangeInputContent(l2, l5, function23, calendarModel3, intRange3, datePickerFormatter, selectableDates, datePickerColors, composer3, 0);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(2120210493);
                        composer3.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i5 >> 9) & 14) | 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$SwitchableDateEntryContent$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    DateRangePickerKt.m1677SwitchableDateEntryContentRN2D1Q(l2, l3, j2, i2, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer3, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void VerticalMonthsList(LazyListState lazyListState, final Long l2, final Long l3, final Function2<? super Long, ? super Long, Unit> function2, final Function1<? super Long, Unit> function1, final CalendarModel calendarModel, final IntRange intRange, final DatePickerFormatter datePickerFormatter, final SelectableDates selectableDates, final DatePickerColors datePickerColors, Composer composer, final int i2) {
        int i3;
        Long l4;
        Long l5;
        Function2<? super Long, ? super Long, Unit> function22;
        Object dateRangePickerKt$VerticalMonthsList$2$1;
        final LazyListState lazyListState2 = lazyListState;
        Composer composerStartRestartGroup = composer.startRestartGroup(1257365001);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(lazyListState2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            l4 = l2;
            i3 |= composerStartRestartGroup.changed(l4) ? 32 : 16;
        } else {
            l4 = l2;
        }
        if ((i2 & 384) == 0) {
            l5 = l3;
            i3 |= composerStartRestartGroup.changed(l5) ? Fields.RotationX : 128;
        } else {
            l5 = l3;
        }
        if ((i2 & 3072) == 0) {
            function22 = function2;
            i3 |= composerStartRestartGroup.changedInstance(function22) ? Fields.CameraDistance : 1024;
        } else {
            function22 = function2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? Fields.Clip : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(calendarModel) ? Fields.RenderEffect : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(intRange) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= (16777216 & i2) == 0 ? composerStartRestartGroup.changed(datePickerFormatter) : composerStartRestartGroup.changedInstance(datePickerFormatter) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(selectableDates) ? 67108864 : 33554432;
        }
        if ((805306368 & i2) == 0) {
            i3 |= composerStartRestartGroup.changed(datePickerColors) ? 536870912 : 268435456;
        }
        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1257365001, i3, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:753)");
            }
            final CalendarDate today = calendarModel.getToday();
            boolean zChanged = composerStartRestartGroup.changed(intRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = calendarModel.getMonth(intRange.getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final CalendarMonth calendarMonth = (CalendarMonth) objRememberedValue;
            final Long l6 = l4;
            final Function2<? super Long, ? super Long, Unit> function23 = function22;
            int i4 = i3;
            final Long l7 = l5;
            TextKt.ProvideTextStyle(TypographyKt.getValue(DatePickerModalTokens.INSTANCE.getDateLabelTextFont(), composerStartRestartGroup, 6), ComposableLambdaKt.rememberComposableLambda(1090773432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1090773432, i5, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:763)");
                    }
                    Object objRememberedValue2 = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                    }
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue2).getCoroutineScope();
                    Strings.Companion companion2 = Strings.INSTANCE;
                    String strM2607getString2EP1pXo = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_range_picker_scroll_to_previous_month), composer2, 0);
                    String strM2607getString2EP1pXo2 = Strings_androidKt.m2607getString2EP1pXo(Strings.m2537constructorimpl(R.string.m3c_date_range_picker_scroll_to_next_month), composer2, 0);
                    boolean zChanged2 = composer2.changed(l6) | composer2.changed(l7) | composer2.changed(function23);
                    final Long l8 = l6;
                    final Long l9 = l7;
                    final Function2<Long, Long, Unit> function24 = function23;
                    Object objRememberedValue3 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1<Long, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$onDateSelectionChange$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Long l10) {
                                invoke(l10.longValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(long j2) {
                                DateRangePickerKt.updateDateSelection(j2, l8, l9, function24);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue3);
                    }
                    final Function1 function12 = (Function1) objRememberedValue3;
                    final List listCustomScrollActions = DateRangePickerKt.customScrollActions(lazyListState2, coroutineScope, strM2607getString2EP1pXo, strM2607getString2EP1pXo2);
                    Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            invoke2(semanticsPropertyReceiver);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertiesKt.setVerticalScrollAxisRange(semanticsPropertyReceiver, new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.1
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, new Function0<Float>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.1.1.2
                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final Float invoke() {
                                    return Float.valueOf(0.0f);
                                }
                            }, false, 4, null));
                        }
                    }, 1, null);
                    LazyListState lazyListState3 = lazyListState2;
                    boolean zChangedInstance = composer2.changedInstance(intRange) | composer2.changedInstance(calendarModel) | composer2.changed(calendarMonth) | composer2.changedInstance(datePickerFormatter) | composer2.changedInstance(listCustomScrollActions) | composer2.changed(datePickerColors) | composer2.changed(l6) | composer2.changed(l7) | composer2.changed(function12) | composer2.changed(today) | composer2.changed(selectableDates);
                    final IntRange intRange2 = intRange;
                    final CalendarModel calendarModel2 = calendarModel;
                    final CalendarMonth calendarMonth2 = calendarMonth;
                    final Long l10 = l6;
                    final Long l11 = l7;
                    final CalendarDate calendarDate = today;
                    final DatePickerFormatter datePickerFormatter2 = datePickerFormatter;
                    final SelectableDates selectableDates2 = selectableDates;
                    final DatePickerColors datePickerColors2 = datePickerColors;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        Object obj = new Function1<LazyListScope, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(LazyListScope lazyListScope) {
                                invoke2(lazyListScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(LazyListScope lazyListScope) {
                                int iNumberOfMonthsInRange = DatePickerKt.numberOfMonthsInRange(intRange2);
                                final CalendarModel calendarModel3 = calendarModel2;
                                final CalendarMonth calendarMonth3 = calendarMonth2;
                                final Long l12 = l10;
                                final Long l13 = l11;
                                final Function1<Long, Unit> function13 = function12;
                                final CalendarDate calendarDate2 = calendarDate;
                                final DatePickerFormatter datePickerFormatter3 = datePickerFormatter2;
                                final SelectableDates selectableDates3 = selectableDates2;
                                final DatePickerColors datePickerColors3 = datePickerColors2;
                                final List<CustomAccessibilityAction> list = listCustomScrollActions;
                                LazyListScope.items$default(lazyListScope, iNumberOfMonthsInRange, null, null, ComposableLambdaKt.composableLambdaInstance(-1413501381, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(4);
                                    }

                                    @Override // kotlin.jvm.functions.Function4
                                    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer3, Integer num2) {
                                        invoke(lazyItemScope, num.intValue(), composer3, num2.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX WARN: Removed duplicated region for block: B:52:0x0140  */
                                    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
                                    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final void invoke(androidx.compose.foundation.lazy.LazyItemScope r19, int r20, androidx.compose.runtime.Composer r21, int r22) {
                                        /*
                                            Method dump skipped, instructions count: 350
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$1$2$1.AnonymousClass1.invoke(androidx.compose.foundation.lazy.LazyItemScope, int, androidx.compose.runtime.Composer, int):void");
                                    }
                                }), 6, null);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        objRememberedValue4 = obj;
                    }
                    LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState3, null, false, null, null, null, false, (Function1) objRememberedValue4, composer2, 0, 252);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            int i5 = i4 & 14;
            boolean zChangedInstance = (i5 == 4) | ((57344 & i4) == 16384) | composerStartRestartGroup.changedInstance(calendarModel) | composerStartRestartGroup.changedInstance(intRange);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                lazyListState2 = lazyListState;
                dateRangePickerKt$VerticalMonthsList$2$1 = new DateRangePickerKt$VerticalMonthsList$2$1(lazyListState2, function1, calendarModel, intRange, null);
                composerStartRestartGroup.updateRememberedValue(dateRangePickerKt$VerticalMonthsList$2$1);
            } else {
                dateRangePickerKt$VerticalMonthsList$2$1 = objRememberedValue2;
                lazyListState2 = lazyListState;
            }
            EffectsKt.LaunchedEffect(lazyListState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) dateRangePickerKt$VerticalMonthsList$2$1, composerStartRestartGroup, i5);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.DateRangePickerKt.VerticalMonthsList.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    DateRangePickerKt.VerticalMonthsList(lazyListState2, l2, l3, function2, function1, calendarModel, intRange, datePickerFormatter, selectableDates, datePickerColors, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<CustomAccessibilityAction> customScrollActions(final LazyListState lazyListState, final CoroutineScope coroutineScope, String str, String str2) {
        return CollectionsKt.listOf((Object[]) new CustomAccessibilityAction[]{new CustomAccessibilityAction(str, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1032}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollUpAction$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() - 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutine_suspended) {
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
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (lazyListState.getCanScrollBackward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }), new CustomAccessibilityAction(str2, new Function0<Boolean>() { // from class: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1", f = "DateRangePicker.kt", i = {}, l = {1040}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.DateRangePickerKt$customScrollActions$scrollDownAction$1$1, reason: invalid class name */
            public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ LazyListState $state;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass1(LazyListState lazyListState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$state = lazyListState;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$state, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.label;
                    if (i2 == 0) {
                        ResultKt.throwOnFailure(obj);
                        LazyListState lazyListState = this.$state;
                        int firstVisibleItemIndex = lazyListState.getFirstVisibleItemIndex() + 1;
                        this.label = 1;
                        if (LazyListState.scrollToItem$default(lazyListState, firstVisibleItemIndex, 0, this, 2, null) == coroutine_suspended) {
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
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Boolean invoke() {
                boolean z;
                if (lazyListState.getCanScrollForward()) {
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(lazyListState, null), 3, null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        })});
    }

    /* renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1679drawRangeBackgroundmxwnekA(ContentDrawScope contentDrawScope, SelectedRangeInfo selectedRangeInfo, long j2) {
        float fMo334toPx0680j_4 = contentDrawScope.mo334toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo334toPx0680j_42 = contentDrawScope.mo334toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo334toPx0680j_43 = contentDrawScope.mo334toPx0680j_4(DatePickerModalTokens.INSTANCE.m2776getDateStateLayerHeightD9Ej5fM());
        float f2 = 2;
        float f3 = (fMo334toPx0680j_42 - fMo334toPx0680j_43) / f2;
        float f4 = 7;
        float fM3620getWidthimpl = (Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - (f4 * fMo334toPx0680j_4)) / f4;
        long gridStartCoordinates = selectedRangeInfo.getGridStartCoordinates();
        int iM6361getXimpl = IntOffset.m6361getXimpl(gridStartCoordinates);
        int iM6362getYimpl = IntOffset.m6362getYimpl(gridStartCoordinates);
        long gridEndCoordinates = selectedRangeInfo.getGridEndCoordinates();
        int iM6361getXimpl2 = IntOffset.m6361getXimpl(gridEndCoordinates);
        int iM6362getYimpl2 = IntOffset.m6362getYimpl(gridEndCoordinates);
        float f5 = iM6361getXimpl;
        float f6 = fMo334toPx0680j_4 + fM3620getWidthimpl;
        float f7 = fM3620getWidthimpl / f2;
        float fM3620getWidthimpl2 = (f5 * f6) + (selectedRangeInfo.getFirstIsSelectionStart() ? fMo334toPx0680j_4 / f2 : 0.0f) + f7;
        float f8 = (iM6362getYimpl * fMo334toPx0680j_42) + f3;
        float f9 = iM6361getXimpl2 * f6;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fMo334toPx0680j_4 /= f2;
        }
        float fM3620getWidthimpl3 = f9 + fMo334toPx0680j_4 + f7;
        float f10 = (iM6362getYimpl2 * fMo334toPx0680j_42) + f3;
        boolean z = contentDrawScope.getLayoutDirection() == LayoutDirection.Rtl;
        if (z) {
            fM3620getWidthimpl2 = Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - fM3620getWidthimpl2;
            fM3620getWidthimpl3 = Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - fM3620getWidthimpl3;
        }
        float fM3620getWidthimpl4 = fM3620getWidthimpl3;
        DrawScope.m4336drawRectnJ9OG0$default(contentDrawScope, j2, OffsetKt.Offset(fM3620getWidthimpl2, f8), SizeKt.Size(iM6362getYimpl == iM6362getYimpl2 ? fM3620getWidthimpl4 - fM3620getWidthimpl2 : z ? -fM3620getWidthimpl2 : Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()) - fM3620getWidthimpl2, fMo334toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        if (iM6362getYimpl != iM6362getYimpl2) {
            for (int i2 = (iM6362getYimpl2 - iM6362getYimpl) - 1; i2 > 0; i2--) {
                DrawScope.m4336drawRectnJ9OG0$default(contentDrawScope, j2, OffsetKt.Offset(0.0f, (i2 * fMo334toPx0680j_42) + f8), SizeKt.Size(Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()), fMo334toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
            }
            long jOffset = OffsetKt.Offset(contentDrawScope.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc()), f10);
            if (z) {
                fM3620getWidthimpl4 -= Size.m3620getWidthimpl(contentDrawScope.mo4342getSizeNHjbRc());
            }
            DrawScope.m4336drawRectnJ9OG0$default(contentDrawScope, j2, jOffset, SizeKt.Size(fM3620getWidthimpl4, fMo334toPx0680j_43), 0.0f, null, null, 0, MenuKt.InTransitionDuration, null);
        }
    }

    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return CalendarMonthSubheadPadding;
    }

    /* renamed from: rememberDateRangePickerState-IlFM19s, reason: not valid java name */
    public static final DateRangePickerState m1680rememberDateRangePickerStateIlFM19s(Long l2, Long l3, Long l4, IntRange intRange, int i2, SelectableDates selectableDates, Composer composer, int i3, int i4) {
        final Long l5 = (i4 & 1) != 0 ? null : l2;
        final Long l6 = (i4 & 2) != 0 ? null : l3;
        final Long l7 = (i4 & 4) != 0 ? l5 : l4;
        final IntRange yearRange = (i4 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        final int iM1702getPickerjFl4v0 = (i4 & 16) != 0 ? DisplayMode.INSTANCE.m1702getPickerjFl4v0() : i2;
        final SelectableDates allDates = (i4 & 32) != 0 ? DatePickerDefaults.INSTANCE.getAllDates() : selectableDates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2012087461, i3, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:261)");
        }
        final Locale localeDefaultLocale = CalendarLocale_androidKt.defaultLocale(composer, 0);
        Object[] objArr = new Object[0];
        Saver<DateRangePickerStateImpl, Object> Saver = DateRangePickerStateImpl.INSTANCE.Saver(allDates, localeDefaultLocale);
        boolean zChangedInstance = ((((i3 & 112) ^ 48) > 32 && composer.changed(l6)) || (i3 & 48) == 32) | ((((i3 & 14) ^ 6) > 4 && composer.changed(l5)) || (i3 & 6) == 4) | ((((i3 & 896) ^ 384) > 256 && composer.changed(l7)) || (i3 & 384) == 256) | composer.changedInstance(yearRange) | ((((57344 & i3) ^ 24576) > 16384 && composer.changed(iM1702getPickerjFl4v0)) || (i3 & 24576) == 16384) | ((((458752 & i3) ^ 196608) > 131072 && composer.changed(allDates)) || (i3 & 196608) == 131072) | composer.changedInstance(localeDefaultLocale);
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            Object obj = new Function0<DateRangePickerStateImpl>() { // from class: androidx.compose.material3.DateRangePickerKt$rememberDateRangePickerState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final DateRangePickerStateImpl invoke() {
                    return new DateRangePickerStateImpl(l5, l6, l7, yearRange, iM1702getPickerjFl4v0, allDates, localeDefaultLocale, null);
                }
            };
            composer.updateRememberedValue(obj);
            objRememberedValue = obj;
        }
        DateRangePickerStateImpl dateRangePickerStateImpl = (DateRangePickerStateImpl) RememberSaveableKt.m3378rememberSaveable(objArr, (Saver) Saver, (String) null, (Function0) objRememberedValue, composer, 0, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dateRangePickerStateImpl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateDateSelection(long j2, Long l2, Long l3, Function2<? super Long, ? super Long, Unit> function2) {
        if ((l2 == null && l3 == null) || (l2 != null && l3 != null)) {
            function2.invoke(Long.valueOf(j2), null);
        } else if (l2 == null || j2 < l2.longValue()) {
            function2.invoke(Long.valueOf(j2), null);
        } else {
            function2.invoke(l2, Long.valueOf(j2));
        }
    }
}
