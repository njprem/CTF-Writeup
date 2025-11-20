package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeMeasureScope;
import androidx.compose.ui.unit.Constraints;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001aJ\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u001d\u0010\u000b\u001a\u0019\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\b\u0010H\u0007¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"MaxItemsToRetainForReuse", "", "LazyLayout", "", "itemProvider", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;", "modifier", "Landroidx/compose/ui/Modifier;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;", "measurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/foundation/lazy/layout/LazyLayoutItemProvider;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/layout/LazyLayoutPrefetchState;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class LazyLayoutKt {
    private static final int MaxItemsToRetainForReuse = 7;

    @Deprecated(message = "Use an overload accepting a lambda prodicing an item provider instead", replaceWith = @ReplaceWith(expression = "LazyLayout({ itemProvider }, modifier, prefetchState, measurePolicy)", imports = {}))
    public static final void LazyLayout(final LazyLayoutItemProvider lazyLayoutItemProvider, Modifier modifier, LazyLayoutPrefetchState lazyLayoutPrefetchState, Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, Composer composer, final int i2, final int i3) {
        int i4;
        final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function22;
        final Modifier modifier2;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2;
        Composer composerStartRestartGroup = composer.startRestartGroup(852831187);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? Fields.RotationX : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? Fields.CameraDistance : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
            modifier2 = modifier;
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i6 != 0) {
                lazyLayoutPrefetchState = null;
            }
            LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(852831187, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:53)");
            }
            boolean z = (i4 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$1$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final LazyLayoutItemProvider invoke() {
                        return lazyLayoutItemProvider;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            LazyLayout((Function0<? extends LazyLayoutItemProvider>) objRememberedValue, modifier3, lazyLayoutPrefetchState3, function2, composerStartRestartGroup, i4 & 8176, 0);
            function22 = function2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            lazyLayoutPrefetchState2 = lazyLayoutPrefetchState3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.2
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

                public final void invoke(Composer composer2, int i7) {
                    LazyLayoutKt.LazyLayout(lazyLayoutItemProvider, modifier2, lazyLayoutPrefetchState2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    public static final void LazyLayout(final Function0<? extends LazyLayoutItemProvider> function0, final Modifier modifier, final LazyLayoutPrefetchState lazyLayoutPrefetchState, final Function2<? super LazyLayoutMeasureScope, ? super Constraints, ? extends MeasureResult> function2, Composer composer, final int i2, final int i3) {
        int i4;
        Composer composerStartRestartGroup = composer.startRestartGroup(2002163445);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyLayoutPrefetchState) ? Fields.RotationX : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function2) ? Fields.CameraDistance : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i6 != 0) {
                lazyLayoutPrefetchState = null;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2002163445, i4, -1, "androidx.compose.foundation.lazy.layout.LazyLayout (LazyLayout.kt:78)");
            }
            final State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, i4 & 14);
            LazySaveableStateHolderKt.LazySaveableStateHolderProvider(ComposableLambdaKt.rememberComposableLambda(-1488997347, true, new Function3<SaveableStateHolder, Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(SaveableStateHolder saveableStateHolder, Composer composer2, Integer num) {
                    invoke(saveableStateHolder, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(SaveableStateHolder saveableStateHolder, Composer composer2, int i7) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1488997347, i7, -1, "androidx.compose.foundation.lazy.layout.LazyLayout.<anonymous> (LazyLayout.kt:82)");
                    }
                    final State<Function0<LazyLayoutItemProvider>> state = stateRememberUpdatedState;
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new LazyLayoutItemContentFactory(saveableStateHolder, new Function0<LazyLayoutItemProvider>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$itemContentFactory$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // kotlin.jvm.functions.Function0
                            public final LazyLayoutItemProvider invoke() {
                                return state.getValue().invoke();
                            }
                        });
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    final LazyLayoutItemContentFactory lazyLayoutItemContentFactory = (LazyLayoutItemContentFactory) objRememberedValue;
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new SubcomposeLayoutState(new LazyLayoutItemReusePolicy(lazyLayoutItemContentFactory));
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    final SubcomposeLayoutState subcomposeLayoutState = (SubcomposeLayoutState) objRememberedValue2;
                    if (lazyLayoutPrefetchState != null) {
                        composer2.startReplaceGroup(205264983);
                        final PrefetchScheduler prefetchScheduler = lazyLayoutPrefetchState.getPrefetchScheduler();
                        if (prefetchScheduler == null) {
                            composer2.startReplaceGroup(6622915);
                            prefetchScheduler = PrefetchScheduler_androidKt.rememberDefaultPrefetchScheduler(composer2, 0);
                        } else {
                            composer2.startReplaceGroup(6621830);
                        }
                        composer2.endReplaceGroup();
                        Object obj = lazyLayoutPrefetchState;
                        Object[] objArr = {obj, lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler};
                        boolean zChanged = composer2.changed(obj) | composer2.changedInstance(lazyLayoutItemContentFactory) | composer2.changedInstance(subcomposeLayoutState) | composer2.changedInstance(prefetchScheduler);
                        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                                    lazyLayoutPrefetchState2.setPrefetchHandleProvider$foundation_release(new PrefetchHandleProvider(lazyLayoutItemContentFactory, subcomposeLayoutState, prefetchScheduler));
                                    final LazyLayoutPrefetchState lazyLayoutPrefetchState3 = lazyLayoutPrefetchState2;
                                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$1$1$invoke$$inlined$onDispose$1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lazyLayoutPrefetchState3.setPrefetchHandleProvider$foundation_release(null);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        EffectsKt.DisposableEffect(objArr, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(205858881);
                        composer2.endReplaceGroup();
                    }
                    Modifier modifierTraversablePrefetchState = LazyLayoutPrefetchStateKt.traversablePrefetchState(modifier, lazyLayoutPrefetchState);
                    boolean zChanged2 = composer2.changed(lazyLayoutItemContentFactory) | composer2.changed(function2);
                    final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function22 = function2;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt$LazyLayout$3$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m812invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m812invoke0kLqBqw(SubcomposeMeasureScope subcomposeMeasureScope, long j2) {
                                return function22.invoke(new LazyLayoutMeasureScopeImpl(lazyLayoutItemContentFactory, subcomposeMeasureScope), Constraints.m6174boximpl(j2));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    SubcomposeLayoutKt.SubcomposeLayout(subcomposeLayoutState, modifierTraversablePrefetchState, (Function2) objRememberedValue4, composer2, SubcomposeLayoutState.$stable, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        final Modifier modifier2 = modifier;
        final LazyLayoutPrefetchState lazyLayoutPrefetchState2 = lazyLayoutPrefetchState;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.4
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

                public final void invoke(Composer composer2, int i7) {
                    LazyLayoutKt.LazyLayout(function0, modifier2, lazyLayoutPrefetchState2, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }
}
