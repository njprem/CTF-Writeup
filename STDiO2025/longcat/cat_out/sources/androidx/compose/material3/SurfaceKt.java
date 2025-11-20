package androidx.compose.material3;

import J.d;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
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

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0091\u0001\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001am\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0099\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u009f\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060#2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0011\u0010\u0018\u001a\r\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010$\u001a\"\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u0002H\u0003ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a8\u0010)\u001a\u00020\n*\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0013\u001a\u00020+H\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006."}, d2 = {"LocalAbsoluteTonalElevation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/ui/unit/Dp;", "getLocalAbsoluteTonalElevation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", "tonalElevation", "shadowElevation", "border", "Landroidx/compose/foundation/BorderStroke;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "content", "Landroidx/compose/runtime/Composable;", "Surface-o_FOJdg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-T9BRK9s", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-d85dljk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJFFLandroidx/compose/foundation/BorderStroke;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevation", "surfaceColorAtElevation-CLU3JFs", "(JFLandroidx/compose/runtime/Composer;I)J", "surface", "backgroundColor", "", "surface-XO-JAsU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SurfaceKt {
    private static final ProvidableCompositionLocal<Dp> LocalAbsoluteTonalElevation = CompositionLocalKt.compositionLocalOf$default(null, new Function0<Dp>() { // from class: androidx.compose.material3.SurfaceKt$LocalAbsoluteTonalElevation$1
        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Dp invoke() {
            return Dp.m6231boximpl(m2184invokeD9Ej5fM());
        }

        /* renamed from: invoke-D9Ej5fM, reason: not valid java name */
        public final float m2184invokeD9Ej5fM() {
            return Dp.m6233constructorimpl(0);
        }
    }, 1, null);

    /* renamed from: Surface-T9BRK9s, reason: not valid java name */
    public static final void m2176SurfaceT9BRK9s(Modifier modifier, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3) {
        if ((i3 & 1) != 0) {
            modifier = Modifier.INSTANCE;
        }
        if ((i3 & 2) != 0) {
            shape = RectangleShapeKt.getRectangleShape();
        }
        if ((i3 & 4) != 0) {
            j2 = MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface();
        }
        if ((i3 & 8) != 0) {
            j3 = ColorSchemeKt.m1562contentColorForek8zF_U(j2, composer, (i2 >> 6) & 14);
        }
        if ((i3 & 16) != 0) {
            f2 = Dp.m6233constructorimpl(0);
        }
        if ((i3 & 32) != 0) {
            f3 = Dp.m6233constructorimpl(0);
        }
        if ((i3 & 64) != 0) {
            borderStroke = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-513881741, i2, -1, "androidx.compose.material3.Surface (Surface.kt:102)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM6233constructorimpl = Dp.m6233constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6247unboximpl() + f2);
        ProvidedValue[] providedValueArr = {ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(j3)), providableCompositionLocal.provides(Dp.m6231boximpl(fM6233constructorimpl))};
        final long j4 = j2;
        final Shape shape2 = shape;
        final BorderStroke borderStroke2 = borderStroke;
        final float f4 = f3;
        final Modifier modifier2 = modifier;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-70914509, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1

            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @DebugMetadata(c = "androidx.compose.material3.SurfaceKt$Surface$1$3", f = "Surface.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: androidx.compose.material3.SurfaceKt$Surface$1$3, reason: invalid class name */
            public static final class AnonymousClass3 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                int label;

                public AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass3(continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass3) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
            }

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

            public final void invoke(Composer composer2, int i4) {
                if ((i4 & 3) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-70914509, i4, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:108)");
                }
                Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m2182surfaceXOJAsU(modifier2, shape2, SurfaceKt.m2183surfaceColorAtElevationCLU3JFs(j4, fM6233constructorimpl, composer2, 0), borderStroke2, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(f4)), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$1.2
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                    }
                }), Unit.INSTANCE, new AnonymousClass3(null));
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierPointerInput);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (d.A(composer2, 0, function22)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2177Surfaced85dljk(final boolean z, final Function0<Unit> function0, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i4 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j2;
        long jM1562contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(surface, composer, (i2 >> 15) & 14) : j3;
        float fM6233constructorimpl = (i4 & 128) != 0 ? Dp.m6233constructorimpl(0) : f2;
        final float fM6233constructorimpl2 = (i4 & Fields.RotationX) != 0 ? Dp.m6233constructorimpl(0) : f3;
        BorderStroke borderStroke2 = (i4 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i4 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(540296512, i2, i3, "androidx.compose.material3.Surface (Surface.kt:306)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM6233constructorimpl3 = Dp.m6233constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6247unboximpl() + fM6233constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(jM1562contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6231boximpl(fM6233constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(-1164547968, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$3
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
                    ComposerKt.traceEventStart(-1164547968, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:312)");
                }
                Modifier modifierM894selectableO2vRcR0$default = SelectableKt.m894selectableO2vRcR0$default(SurfaceKt.m2182surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m2183surfaceColorAtElevationCLU3JFs(surface, fM6233constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(fM6233constructorimpl2)), z, mutableInteractionSource2, RippleKt.m2040rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, function0, 16, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM894selectableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (d.A(composer2, 0, function22)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* renamed from: Surface-o_FOJdg, reason: not valid java name */
    public static final void m2179Surfaceo_FOJdg(final Function0<Unit> function0, Modifier modifier, boolean z, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final Modifier modifier2 = (i4 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z2 = (i4 & 4) != 0 ? true : z;
        final Shape rectangleShape = (i4 & 8) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i4 & 16) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j2;
        long jM1562contentColorForek8zF_U = (i4 & 32) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(surface, composer, (i2 >> 12) & 14) : j3;
        float fM6233constructorimpl = (i4 & 64) != 0 ? Dp.m6233constructorimpl(0) : f2;
        final float fM6233constructorimpl2 = (i4 & 128) != 0 ? Dp.m6233constructorimpl(0) : f3;
        BorderStroke borderStroke2 = (i4 & Fields.RotationX) != 0 ? null : borderStroke;
        MutableInteractionSource mutableInteractionSource2 = (i4 & 512) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-789752804, i2, i3, "androidx.compose.material3.Surface (Surface.kt:203)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM6233constructorimpl3 = Dp.m6233constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6247unboximpl() + fM6233constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        final MutableInteractionSource mutableInteractionSource3 = mutableInteractionSource2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(jM1562contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6231boximpl(fM6233constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(1279702876, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$2
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
                    ComposerKt.traceEventStart(1279702876, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:209)");
                }
                Modifier modifierM228clickableO2vRcR0$default = ClickableKt.m228clickableO2vRcR0$default(SurfaceKt.m2182surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m2183surfaceColorAtElevationCLU3JFs(surface, fM6233constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(fM6233constructorimpl2)), mutableInteractionSource3, RippleKt.m2040rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z2, null, null, function0, 24, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM228clickableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (d.A(composer2, 0, function22)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    public static final ProvidableCompositionLocal<Dp> getLocalAbsoluteTonalElevation() {
        return LocalAbsoluteTonalElevation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-XO-JAsU, reason: not valid java name */
    public static final Modifier m2182surfaceXOJAsU(Modifier modifier, Shape shape, long j2, BorderStroke borderStroke, float f2) {
        Shape shape2;
        Modifier modifierM3952graphicsLayerAp8cVGQ$default;
        if (f2 > 0.0f) {
            shape2 = shape;
            modifierM3952graphicsLayerAp8cVGQ$default = GraphicsLayerModifierKt.m3952graphicsLayerAp8cVGQ$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, 0L, shape2, false, null, 0L, 0L, 0, 124895, null);
        } else {
            shape2 = shape;
            modifierM3952graphicsLayerAp8cVGQ$default = Modifier.INSTANCE;
        }
        return ClipKt.clip(BackgroundKt.m196backgroundbw27NRU(modifier.then(modifierM3952graphicsLayerAp8cVGQ$default).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape2) : Modifier.INSTANCE), j2, shape2), shape2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surfaceColorAtElevation-CLU3JFs, reason: not valid java name */
    public static final long m2183surfaceColorAtElevationCLU3JFs(long j2, float f2, Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079918090, i2, -1, "androidx.compose.material3.surfaceColorAtElevation (Surface.kt:465)");
        }
        long jM1560applyTonalElevationRFCenO8 = ColorSchemeKt.m1560applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), j2, f2, composer, (i2 << 3) & 1008);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM1560applyTonalElevationRFCenO8;
    }

    /* renamed from: Surface-d85dljk, reason: not valid java name */
    public static final void m2178Surfaced85dljk(final boolean z, final Function1<? super Boolean, Unit> function1, Modifier modifier, boolean z2, Shape shape, long j2, long j3, float f2, float f3, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, final Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i2, int i3, int i4) {
        final Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z3 = (i4 & 8) != 0 ? true : z2;
        final Shape rectangleShape = (i4 & 16) != 0 ? RectangleShapeKt.getRectangleShape() : shape;
        final long surface = (i4 & 32) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, 6).getSurface() : j2;
        long jM1562contentColorForek8zF_U = (i4 & 64) != 0 ? ColorSchemeKt.m1562contentColorForek8zF_U(surface, composer, (i2 >> 15) & 14) : j3;
        float fM6233constructorimpl = (i4 & 128) != 0 ? Dp.m6233constructorimpl(0) : f2;
        final float fM6233constructorimpl2 = (i4 & Fields.RotationX) != 0 ? Dp.m6233constructorimpl(0) : f3;
        BorderStroke borderStroke2 = (i4 & 512) != 0 ? null : borderStroke;
        final MutableInteractionSource mutableInteractionSource2 = (i4 & 1024) == 0 ? mutableInteractionSource : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1877401889, i2, i3, "androidx.compose.material3.Surface (Surface.kt:410)");
        }
        ProvidableCompositionLocal<Dp> providableCompositionLocal = LocalAbsoluteTonalElevation;
        final float fM6233constructorimpl3 = Dp.m6233constructorimpl(((Dp) composer.consume(providableCompositionLocal)).m6247unboximpl() + fM6233constructorimpl);
        final BorderStroke borderStroke3 = borderStroke2;
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m3782boximpl(jM1562contentColorForek8zF_U)), providableCompositionLocal.provides(Dp.m6231boximpl(fM6233constructorimpl3))}, ComposableLambdaKt.rememberComposableLambda(712720927, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SurfaceKt$Surface$4
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
                    ComposerKt.traceEventStart(712720927, i5, -1, "androidx.compose.material3.Surface.<anonymous> (Surface.kt:416)");
                }
                Modifier modifierM899toggleableO2vRcR0$default = ToggleableKt.m899toggleableO2vRcR0$default(SurfaceKt.m2182surfaceXOJAsU(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2), rectangleShape, SurfaceKt.m2183surfaceColorAtElevationCLU3JFs(surface, fM6233constructorimpl3, composer2, 0), borderStroke3, ((Density) composer2.consume(CompositionLocalsKt.getLocalDensity())).mo334toPx0680j_4(fM6233constructorimpl2)), z, mutableInteractionSource2, RippleKt.m2040rippleOrFallbackImplementation9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z3, null, function1, 16, null);
                Function2<Composer, Integer, Unit> function22 = function2;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(composer2, modifierM899toggleableO2vRcR0$default);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer2.getApplier() == null) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM3285constructorimpl = Updater.m3285constructorimpl(composer2);
                Function2 function2T = d.t(companion, composerM3285constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, composerM3285constructorimpl, currentCompositionLocalMap);
                if (composerM3285constructorimpl.getInserting() || !Intrinsics.areEqual(composerM3285constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    d.v(currentCompositeKeyHash, composerM3285constructorimpl, currentCompositeKeyHash, function2T);
                }
                Updater.m3292setimpl(composerM3285constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (d.A(composer2, 0, function22)) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, ProvidedValue.$stable | 48);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
