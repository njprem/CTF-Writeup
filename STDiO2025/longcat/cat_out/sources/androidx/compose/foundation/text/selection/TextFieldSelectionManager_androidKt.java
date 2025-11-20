package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.Magnifier_androidKt;
import androidx.compose.foundation.PlatformMagnifierFactory;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.contextmenu.ContextMenuState;
import androidx.compose.foundation.contextmenu.ContextMenuState_androidKt;
import androidx.compose.foundation.text.ContextMenu_androidKt;
import androidx.compose.foundation.text.TextContextMenuItems;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.platform.ClipboardManager;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpSize;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a%\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002"}, d2 = {"isShiftPressed", "", "Landroidx/compose/ui/input/pointer/PointerEvent;", "(Landroidx/compose/ui/input/pointer/PointerEvent;)Z", "contextMenuBuilder", "Lkotlin/Function1;", "Landroidx/compose/foundation/contextmenu/ContextMenuScope;", "", "Lkotlin/ExtensionFunctionType;", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "contextMenuState", "Landroidx/compose/foundation/contextmenu/ContextMenuState;", "textFieldMagnifier", "Landroidx/compose/ui/Modifier;", "manager", "foundation_release", "magnifierSize", "Landroidx/compose/ui/unit/IntSize;"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldSelectionManager_androidKt {

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1, reason: invalid class name and case insensitive filesystem */
    public static final class C03461 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        final /* synthetic */ TextFieldSelectionManager $manager;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03461(TextFieldSelectionManager textFieldSelectionManager) {
            super(3);
            this.$manager = textFieldSelectionManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long invoke$lambda$1(MutableState<IntSize> mutableState) {
            return mutableState.getValue().getPackedValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$2(MutableState<IntSize> mutableState, long j2) {
            mutableState.setValue(IntSize.m6395boximpl(j2));
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        public final Modifier invoke(Modifier modifier, Composer composer, int i2) {
            composer.startReplaceGroup(1980580247);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1980580247, i2, -1, "androidx.compose.foundation.text.selection.textFieldMagnifier.<anonymous> (TextFieldSelectionManager.android.kt:48)");
            }
            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(IntSize.m6395boximpl(IntSize.INSTANCE.m6408getZeroYbymL2g()), null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final MutableState mutableState = (MutableState) objRememberedValue;
            boolean zChangedInstance = composer.changedInstance(this.$manager);
            final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0<Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Offset invoke() {
                        return Offset.m3540boximpl(m1361invokeF1C5BW0());
                    }

                    /* renamed from: invoke-F1C5BW0, reason: not valid java name */
                    public final long m1361invokeF1C5BW0() {
                        return TextFieldSelectionManagerKt.m1360calculateSelectionMagnifierCenterAndroidO0kMr_c(textFieldSelectionManager, TextFieldSelectionManager_androidKt.C03461.invoke$lambda$1(mutableState));
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            boolean zChanged = composer.changed(density);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<Function0<? extends Offset>, Modifier>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Modifier invoke(Function0<? extends Offset> function02) {
                        return invoke2((Function0<Offset>) function02);
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Modifier invoke2(final Function0<Offset> function02) {
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Function1<Density, Offset> function1 = new Function1<Density, Offset>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Offset invoke(Density density2) {
                                return Offset.m3540boximpl(m1362invoketuRUvjQ(density2));
                            }

                            /* renamed from: invoke-tuRUvjQ, reason: not valid java name */
                            public final long m1362invoketuRUvjQ(Density density2) {
                                return function02.invoke().getPackedValue();
                            }
                        };
                        final Density density2 = density;
                        final MutableState<IntSize> mutableState2 = mutableState;
                        return Magnifier_androidKt.m267magnifierjPUL71Q$default(companion2, function1, null, new Function1<DpSize, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$textFieldMagnifier$1$2$1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DpSize dpSize) {
                                m1363invokeEaSLcWc(dpSize.getPackedValue());
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-EaSLcWc, reason: not valid java name */
                            public final void m1363invokeEaSLcWc(long j2) {
                                MutableState<IntSize> mutableState3 = mutableState2;
                                Density density3 = density2;
                                TextFieldSelectionManager_androidKt.C03461.invoke$lambda$2(mutableState3, IntSizeKt.IntSize(density3.mo328roundToPx0680j_4(DpSize.m6331getWidthD9Ej5fM(j2)), density3.mo328roundToPx0680j_4(DpSize.m6329getHeightD9Ej5fM(j2))));
                            }
                        }, 0.0f, true, 0L, 0.0f, 0.0f, false, PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform(), 490, null);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierAnimatedSelectionMagnifier = SelectionMagnifierKt.animatedSelectionMagnifier(modifier, function0, (Function1) objRememberedValue3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifierAnimatedSelectionMagnifier;
        }
    }

    public static final Function1<ContextMenuScope, Unit> contextMenuBuilder(final TextFieldSelectionManager textFieldSelectionManager, final ContextMenuState contextMenuState) {
        return new Function1<ContextMenuScope, Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt.contextMenuBuilder.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContextMenuScope contextMenuScope) {
                invoke2(contextMenuScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContextMenuScope contextMenuScope) {
                ClipboardManager clipboardManager;
                boolean z = textFieldSelectionManager.getVisualTransformation() instanceof PasswordVisualTransformation;
                boolean zM5715getCollapsedimpl = TextRange.m5715getCollapsedimpl(textFieldSelectionManager.getValue$foundation_release().getSelection());
                final ContextMenuState contextMenuState2 = contextMenuState;
                TextContextMenuItems textContextMenuItems = TextContextMenuItems.Cut;
                boolean z2 = (zM5715getCollapsedimpl || !textFieldSelectionManager.getEditable() || z) ? false : true;
                final TextFieldSelectionManager textFieldSelectionManager2 = textFieldSelectionManager;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.AnonymousClass1(textContextMenuItems), null, z2, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$1
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
                        textFieldSelectionManager2.cut$foundation_release();
                        ContextMenuState_androidKt.close(contextMenuState2);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState3 = contextMenuState;
                TextContextMenuItems textContextMenuItems2 = TextContextMenuItems.Copy;
                boolean z3 = (zM5715getCollapsedimpl || z) ? false : true;
                final TextFieldSelectionManager textFieldSelectionManager3 = textFieldSelectionManager;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.AnonymousClass1(textContextMenuItems2), null, z3, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$2
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
                        textFieldSelectionManager3.copy$foundation_release(false);
                        ContextMenuState_androidKt.close(contextMenuState3);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState4 = contextMenuState;
                TextContextMenuItems textContextMenuItems3 = TextContextMenuItems.Paste;
                boolean z4 = textFieldSelectionManager.getEditable() && (clipboardManager = textFieldSelectionManager.getClipboardManager()) != null && clipboardManager.hasText();
                final TextFieldSelectionManager textFieldSelectionManager4 = textFieldSelectionManager;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.AnonymousClass1(textContextMenuItems3), null, z4, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$3
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
                        textFieldSelectionManager4.paste$foundation_release();
                        ContextMenuState_androidKt.close(contextMenuState4);
                    }
                }, 10, null);
                final ContextMenuState contextMenuState5 = contextMenuState;
                TextContextMenuItems textContextMenuItems4 = TextContextMenuItems.SelectAll;
                boolean z5 = TextRange.m5717getLengthimpl(textFieldSelectionManager.getValue$foundation_release().getSelection()) != textFieldSelectionManager.getValue$foundation_release().getText().length();
                final TextFieldSelectionManager textFieldSelectionManager5 = textFieldSelectionManager;
                ContextMenuScope.item$default(contextMenuScope, new ContextMenu_androidKt.AnonymousClass1(textContextMenuItems4), null, z5, null, new Function0<Unit>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager_androidKt$contextMenuBuilder$1$invoke$$inlined$TextItem$4
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
                        textFieldSelectionManager5.selectAll$foundation_release();
                        ContextMenuState_androidKt.close(contextMenuState5);
                    }
                }, 10, null);
            }
        };
    }

    public static final boolean isShiftPressed(PointerEvent pointerEvent) {
        return false;
    }

    public static final Modifier textFieldMagnifier(Modifier modifier, TextFieldSelectionManager textFieldSelectionManager) {
        return !Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null) ? modifier : ComposedModifierKt.composed$default(modifier, null, new C03461(textFieldSelectionManager), 1, null);
    }
}
