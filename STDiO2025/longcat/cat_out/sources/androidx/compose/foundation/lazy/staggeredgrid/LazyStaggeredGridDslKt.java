package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u009a\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0083\u0001\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000f2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\u0017\u0010\u0013\u001a\u0013\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00010\u0014¢\u0006\u0002\b\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a%\u0010 \u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\"\u001a%\u0010#\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0003¢\u0006\u0002\u0010$\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00104\u001aÐ\u0001\u0010%\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052%\b\n\u0010(\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u00010\u00142%\b\u0006\u0010-\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,0\u00142%\b\n\u0010.\u001a\u001f\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u00010\u001423\b\u0004\u00100\u001a-\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u000101¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u00106\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0'2:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010;\u001a¤\u0002\u00107\u001a\u00020\u0001\"\u0004\b\u0000\u0010&*\u00020\u00152\f\u0010%\u001a\b\u0012\u0004\u0012\u0002H&052:\b\n\u0010(\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020,\u0018\u0001012:\b\u0006\u0010-\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0006\u0012\u0004\u0018\u00010,012:\b\n\u0010.\u001a4\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020/\u0018\u0001012H\b\u0004\u00100\u001aB\u0012\u0004\u0012\u000202\u0012\u0013\u0012\u001108¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(9\u0012\u0013\u0012\u0011H&¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(+\u0012\u0004\u0012\u00020\u00010:¢\u0006\u0002\b3¢\u0006\u0002\b\u0016H\u0086\b¢\u0006\u0002\u0010<\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006="}, d2 = {"LazyHorizontalStaggeredGrid", "", "rows", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalItemSpacing", "Landroidx/compose/ui/unit/Dp;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;", "Lkotlin/ExtensionFunctionType;", "LazyHorizontalStaggeredGrid-cJHQLPU", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;FLandroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyVerticalStaggeredGrid", "columns", "verticalItemSpacing", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "LazyVerticalStaggeredGrid-zadm560", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/layout/PaddingValues;ZFLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberColumnSlots", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "rememberRowSlots", "(Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridCells;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/staggeredgrid/LazyGridStaggeredGridSlotsProvider;", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "span", "Landroidx/compose/foundation/lazy/staggeredgrid/StaggeredGridItemSpan;", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$10, reason: invalid class name */
    public static final class AnonymousClass10 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass10(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, T[] tArr) {
            super(4);
            this.$itemContent = function4;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2101296000, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:425)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items[i2], composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$3, reason: invalid class name */
    public static final class AnonymousClass3 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(Function1<? super T, ? extends Object> function1, List<? extends T> list) {
            super(1);
            this.$contentType = function1;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items.get(i2));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$5, reason: invalid class name */
    public static final class AnonymousClass5 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function4<LazyStaggeredGridItemScope, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4, List<? extends T> list) {
            super(4);
            this.$itemContent = function4;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-886456479, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.items.<anonymous> (LazyStaggeredGridDsl.kt:345)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, this.$items.get(i2), composer, Integer.valueOf(i4 & 14));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$items$8, reason: invalid class name */
    public static final class AnonymousClass8 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function1<T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass8(Function1<? super T, ? extends Object> function1, T[] tArr) {
            super(1);
            this.$contentType = function1;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(this.$items[i2]);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$10, reason: invalid class name and case insensitive filesystem */
    public static final class C028110 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C028110(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, T[] tArr) {
            super(4);
            this.$itemContent = function5;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-804487775, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:465)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items[i2], composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$3, reason: invalid class name and case insensitive filesystem */
    public static final class C02823 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02823(Function2<? super Integer, ? super T, ? extends Object> function2, List<? extends T> list) {
            super(1);
            this.$contentType = function2;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items.get(i2));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u000b¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;", "index", "", "invoke", "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridItemScope;ILandroidx/compose/runtime/Composer;I)V"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$5, reason: invalid class name and case insensitive filesystem */
    public static final class C02835 extends Lambda implements Function4<LazyStaggeredGridItemScope, Integer, Composer, Integer, Unit> {
        final /* synthetic */ Function5<LazyStaggeredGridItemScope, Integer, T, Composer, Integer, Unit> $itemContent;
        final /* synthetic */ List<T> $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02835(Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5, List<? extends T> list) {
            super(4);
            this.$itemContent = function5;
            this.$items = list;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, Integer num, Composer composer, Integer num2) {
            invoke(lazyStaggeredGridItemScope, num.intValue(), composer, num2.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyStaggeredGridItemScope lazyStaggeredGridItemScope, int i2, Composer composer, int i3) {
            int i4;
            if ((i3 & 6) == 0) {
                i4 = (composer.changed(lazyStaggeredGridItemScope) ? 4 : 2) | i3;
            } else {
                i4 = i3;
            }
            if ((i3 & 48) == 0) {
                i4 |= composer.changed(i2) ? 32 : 16;
            }
            if ((i4 & 147) == 146 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(284833944, i4, -1, "androidx.compose.foundation.lazy.staggeredgrid.itemsIndexed.<anonymous> (LazyStaggeredGridDsl.kt:385)");
            }
            this.$itemContent.invoke(lazyStaggeredGridItemScope, Integer.valueOf(i2), this.$items.get(i2), composer, Integer.valueOf(i4 & 126));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "index", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$itemsIndexed$8, reason: invalid class name and case insensitive filesystem */
    public static final class C02858 extends Lambda implements Function1<Integer, Object> {
        final /* synthetic */ Function2<Integer, T, Object> $contentType;
        final /* synthetic */ T[] $items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C02858(Function2<? super Integer, ? super T, ? extends Object> function2, T[] tArr) {
            super(1);
            this.$contentType = function2;
            this.$items = tArr;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return invoke(num.intValue());
        }

        public final Object invoke(int i2) {
            return this.$contentType.invoke(Integer.valueOf(i2), this.$items[i2]);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m837LazyHorizontalStaggeredGridcJHQLPU(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m837LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f6  */
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m838LazyVerticalStaggeredGridzadm560(final androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope, kotlin.Unit> r37, androidx.compose.runtime.Composer r38, final int r39, final int r40) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m838LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new AnonymousClass3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(function4, list)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.1
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, list) : null, new AnonymousClass3(function12, list), function13 != null ? new LazyStaggeredGridDslKt$items$4$1(function13, list) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new AnonymousClass5(function4, list)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> list, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new C02823(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C02835(function5, list)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List list, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        if ((i2 & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.1
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(list.size(), function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(function2, list) : null, new C02823(function22, list), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(function23, list) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new C02835(function5, list)));
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberColumnSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Horizontal horizontal, final PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1267076841, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:94)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(horizontal)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberColumnSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m839invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m839invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6186getMaxWidthimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyVerticalStaggeredGrid's width should be bound by parent.");
                    }
                    PaddingValues paddingValues2 = paddingValues;
                    LayoutDirection layoutDirection = LayoutDirection.Ltr;
                    int iM6186getMaxWidthimpl = Constraints.m6186getMaxWidthimpl(j2) - density.mo328roundToPx0680j_4(Dp.m6233constructorimpl(PaddingKt.calculateEndPadding(paddingValues, layoutDirection) + PaddingKt.calculateStartPadding(paddingValues2, layoutDirection)));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Horizontal horizontal2 = horizontal;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM6186getMaxWidthimpl, density.mo328roundToPx0680j_4(horizontal2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    horizontal2.arrange(density, iM6186getMaxWidthimpl, iArrCalculateCrossAxisCellSizes, layoutDirection, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    private static final LazyGridStaggeredGridSlotsProvider rememberRowSlots(final StaggeredGridCells staggeredGridCells, final Arrangement.Vertical vertical, final PaddingValues paddingValues, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1532383053, i2, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:184)");
        }
        boolean z = ((((i2 & 14) ^ 6) > 4 && composer.changed(staggeredGridCells)) || (i2 & 6) == 4) | ((((i2 & 112) ^ 48) > 32 && composer.changed(vertical)) || (i2 & 48) == 32) | ((((i2 & 896) ^ 384) > 256 && composer.changed(paddingValues)) || (i2 & 384) == 256);
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LazyStaggeredGridSlotCache(new Function2<Density, Constraints, LazyStaggeredGridSlots>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt$rememberRowSlots$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyStaggeredGridSlots invoke(Density density, Constraints constraints) {
                    return m840invoke0kLqBqw(density, constraints.getValue());
                }

                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyStaggeredGridSlots m840invoke0kLqBqw(Density density, long j2) {
                    if (Constraints.m6185getMaxHeightimpl(j2) == Integer.MAX_VALUE) {
                        throw new IllegalArgumentException("LazyHorizontalStaggeredGrid's height should be bound by parent.");
                    }
                    int iM6185getMaxHeightimpl = Constraints.m6185getMaxHeightimpl(j2) - density.mo328roundToPx0680j_4(Dp.m6233constructorimpl(paddingValues.getBottom() + paddingValues.getTop()));
                    StaggeredGridCells staggeredGridCells2 = staggeredGridCells;
                    Arrangement.Vertical vertical2 = vertical;
                    int[] iArrCalculateCrossAxisCellSizes = staggeredGridCells2.calculateCrossAxisCellSizes(density, iM6185getMaxHeightimpl, density.mo328roundToPx0680j_4(vertical2.getSpacing()));
                    int[] iArr = new int[iArrCalculateCrossAxisCellSizes.length];
                    vertical2.arrange(density, iM6185getMaxHeightimpl, iArrCalculateCrossAxisCellSizes, iArr);
                    return new LazyStaggeredGridSlots(iArr, iArrCalculateCrossAxisCellSizes);
                }
            });
            composer.updateRememberedValue(objRememberedValue);
        }
        LazyGridStaggeredGridSlotsProvider lazyGridStaggeredGridSlotsProvider = (LazyGridStaggeredGridSlotsProvider) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return lazyGridStaggeredGridSlotsProvider;
    }

    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function1<? super T, ? extends Object> function1, Function1<? super T, ? extends Object> function12, Function1<? super T, StaggeredGridItemSpan> function13, Function4<? super LazyStaggeredGridItemScope, ? super T, ? super Composer, ? super Integer, Unit> function4) {
        lazyStaggeredGridScope.items(tArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, tArr) : null, new AnonymousClass8(function12, tArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, tArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(function4, tArr)));
    }

    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] tArr, Function2<? super Integer, ? super T, ? extends Object> function2, Function2<? super Integer, ? super T, ? extends Object> function22, Function2<? super Integer, ? super T, StaggeredGridItemSpan> function23, Function5<? super LazyStaggeredGridItemScope, ? super Integer, ? super T, ? super Composer, ? super Integer, Unit> function5) {
        lazyStaggeredGridScope.items(tArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, tArr) : null, new C02858(function22, tArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, tArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C028110(function5, tArr)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function1 function1, Function1 function12, Function1 function13, Function4 function4, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            function12 = new Function1() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.items.6
                @Override // kotlin.jvm.functions.Function1
                public final Void invoke(Object obj2) {
                    return null;
                }
            };
        }
        if ((i2 & 8) != 0) {
            function13 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, objArr) : null, new AnonymousClass8(function12, objArr), function13 != null ? new LazyStaggeredGridDslKt$items$9$1(function13, objArr) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new AnonymousClass10(function4, objArr)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] objArr, Function2 function2, Function2 function22, Function2 function23, Function5 function5, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function2 = null;
        }
        if ((i2 & 4) != 0) {
            function22 = new Function2() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.itemsIndexed.6
                public final Void invoke(int i3, Object obj2) {
                    return null;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    return invoke(((Number) obj2).intValue(), obj3);
                }
            };
        }
        if ((i2 & 8) != 0) {
            function23 = null;
        }
        lazyStaggeredGridScope.items(objArr.length, function2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(function2, objArr) : null, new C02858(function22, objArr), function23 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(function23, objArr) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new C028110(function5, objArr)));
    }
}
