package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a\"\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0014\u0010\u000f\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"TextFieldSelectionHandle", "", "isStartHandle", "", "direction", "Landroidx/compose/ui/text/style/ResolvedTextDirection;", "manager", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "(ZLandroidx/compose/ui/text/style/ResolvedTextDirection;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/runtime/Composer;I)V", "calculateSelectionMagnifierCenterAndroid", "Landroidx/compose/ui/geometry/Offset;", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;", "calculateSelectionMagnifierCenterAndroid-O0kMr_c", "(Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;J)J", "isSelectionHandleInVisibleBound", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManagerKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void TextFieldSelectionHandle(final boolean z, ResolvedTextDirection resolvedTextDirection, final TextFieldSelectionManager textFieldSelectionManager, Composer composer, final int i2) {
        int i3;
        final boolean z2;
        final ResolvedTextDirection resolvedTextDirection2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1344558920);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(resolvedTextDirection) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(textFieldSelectionManager) ? Fields.RotationX : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            z2 = z;
            resolvedTextDirection2 = resolvedTextDirection;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1344558920, i3, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i4 = i3 & 14;
            boolean zChanged = (i4 == 4) | composerStartRestartGroup.changed(textFieldSelectionManager);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = textFieldSelectionManager.handleDragObserver$foundation_release(z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            TextDragObserver textDragObserver = (TextDragObserver) objRememberedValue;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(textFieldSelectionManager) | (i4 == 4);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new OffsetProvider() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt$TextFieldSelectionHandle$1$1
                    @Override // androidx.compose.foundation.text.selection.OffsetProvider
                    /* renamed from: provide-F1C5BW0 */
                    public final long mo931provideF1C5BW0() {
                        return textFieldSelectionManager.m1357getHandlePositiontuRUvjQ$foundation_release(z);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            OffsetProvider offsetProvider = (OffsetProvider) objRememberedValue2;
            boolean zM5720getReversedimpl = TextRange.m5720getReversedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
            Modifier.Companion companion = Modifier.INSTANCE;
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(textDragObserver);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new TextFieldSelectionManagerKt$TextFieldSelectionHandle$2$1(textDragObserver, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            z2 = z;
            resolvedTextDirection2 = resolvedTextDirection;
            AndroidSelectionHandles_androidKt.m1279SelectionHandlepzduO1o(offsetProvider, z2, resolvedTextDirection2, zM5720getReversedimpl, 0L, SuspendingPointerInputFilterKt.pointerInput(companion, textDragObserver, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3), composerStartRestartGroup, (i3 << 3) & 1008, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManagerKt.TextFieldSelectionHandle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    TextFieldSelectionManagerKt.TextFieldSelectionHandle(z2, resolvedTextDirection2, textFieldSelectionManager, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-O0kMr_c, reason: not valid java name */
    public static final long m1360calculateSelectionMagnifierCenterAndroidO0kMr_c(TextFieldSelectionManager textFieldSelectionManager, long j2) {
        int iM5721getStartimpl;
        TextLayoutResultProxy layoutResult;
        TextDelegate textDelegate;
        AnnotatedString text;
        Offset offsetM1355getCurrentDragPosition_m7T9E = textFieldSelectionManager.m1355getCurrentDragPosition_m7T9E();
        if (offsetM1355getCurrentDragPosition_m7T9E == null) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        long packedValue = offsetM1355getCurrentDragPosition_m7T9E.getPackedValue();
        AnnotatedString transformedText$foundation_release = textFieldSelectionManager.getTransformedText$foundation_release();
        if (transformedText$foundation_release == null || transformedText$foundation_release.length() == 0) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        Handle draggingHandle = textFieldSelectionManager.getDraggingHandle();
        int i2 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i2 == -1) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        if (i2 == 1 || i2 == 2) {
            iM5721getStartimpl = TextRange.m5721getStartimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            iM5721getStartimpl = TextRange.m5716getEndimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
        }
        LegacyTextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutResult = state.getLayoutResult()) == null) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        LegacyTextFieldState state2 = textFieldSelectionManager.getState();
        if (state2 == null || (textDelegate = state2.getTextDelegate()) == null || (text = textDelegate.getText()) == null) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        int iCoerceIn = RangesKt.coerceIn(textFieldSelectionManager.getOffsetMapping().originalToTransformed(iM5721getStartimpl), 0, text.length());
        float fM3551getXimpl = Offset.m3551getXimpl(layoutResult.m1053translateDecorationToInnerCoordinatesMKHz9U$foundation_release(packedValue));
        TextLayoutResult value = layoutResult.getValue();
        int lineForOffset = value.getLineForOffset(iCoerceIn);
        float lineLeft = value.getLineLeft(lineForOffset);
        float lineRight = value.getLineRight(lineForOffset);
        float fCoerceIn = RangesKt.coerceIn(fM3551getXimpl, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m6401equalsimpl0(j2, IntSize.INSTANCE.m6408getZeroYbymL2g()) && Math.abs(fM3551getXimpl - fCoerceIn) > IntSize.m6403getWidthimpl(j2) / 2) {
            return Offset.INSTANCE.m3566getUnspecifiedF1C5BW0();
        }
        float lineTop = value.getLineTop(lineForOffset);
        return OffsetKt.Offset(fCoerceIn, ((value.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop);
    }

    public static final boolean isSelectionHandleInVisibleBound(TextFieldSelectionManager textFieldSelectionManager, boolean z) {
        LayoutCoordinates layoutCoordinates;
        Rect rectVisibleBounds;
        LegacyTextFieldState state = textFieldSelectionManager.getState();
        if (state == null || (layoutCoordinates = state.getLayoutCoordinates()) == null || (rectVisibleBounds = SelectionManagerKt.visibleBounds(layoutCoordinates)) == null) {
            return false;
        }
        return SelectionManagerKt.m1335containsInclusiveUv8p0NA(rectVisibleBounds, textFieldSelectionManager.m1357getHandlePositiontuRUvjQ$foundation_release(z));
    }
}
