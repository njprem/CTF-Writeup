package androidx.compose.material3.pulltorefresh;

import J.d;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationConstants;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.GraphicsLayerModifierKt;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0002\u001a(\u0010\u0017\u001a\u00020\u00182\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0003ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u007f\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020 2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u00192\b\b\u0002\u0010\"\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020%2\b\b\u0002\u0010&\u001a\u00020'2\u001e\b\u0002\u0010(\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,2\u001c\u0010-\u001a\u0018\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00180)¢\u0006\u0002\b+¢\u0006\u0002\b,H\u0007¢\u0006\u0002\u0010.\u001a\b\u0010/\u001a\u00020%H\u0007\u001a\r\u00100\u001a\u00020%H\u0007¢\u0006\u0002\u00101\u001aF\u00102\u001a\u00020\u0018*\u0002032\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a>\u0010=\u001a\u00020\u0018*\u0002032\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u00022\u0006\u00109\u001a\u00020\u00152\u0006\u0010>\u001a\u0002072\u0006\u0010:\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b?\u0010@\u001aH\u0010A\u001a\u00020#*\u00020#2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\b\b\u0002\u0010B\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00180\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\bD\u0010E\u001aN\u0010F\u001a\u00020#*\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010C\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020H2\b\b\u0002\u0010I\u001a\u00020\u001b2\b\b\u0002\u0010J\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bK\u0010L\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0002X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u000e\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010\"\u0016\u0010\u0011\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010\"\u0010\u0010\u0013\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006M²\u0006\n\u0010N\u001a\u00020\u0002X\u008a\u0084\u0002"}, d2 = {"AlphaTween", "Landroidx/compose/animation/core/TweenSpec;", "", "ArcRadius", "Landroidx/compose/ui/unit/Dp;", "F", "ArrowHeight", "ArrowWidth", "CrossfadeDurationMs", "", "DragMultiplier", "MaxAlpha", "MaxProgressArc", "MinAlpha", "SpinnerContainerSize", "getSpinnerContainerSize", "()F", "SpinnerSize", "getSpinnerSize", "StrokeWidth", "ArrowValues", "Landroidx/compose/material3/pulltorefresh/ArrowValues;", "progress", "CircularArrowProgressIndicator", "", "Lkotlin/Function0;", "color", "Landroidx/compose/ui/graphics/Color;", "CircularArrowProgressIndicator-RPmYEkk", "(Lkotlin/jvm/functions/Function0;JLandroidx/compose/runtime/Composer;I)V", "PullToRefreshBox", "isRefreshing", "", "onRefresh", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "contentAlignment", "Landroidx/compose/ui/Alignment;", "indicator", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/BoxScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PullToRefreshState", "rememberPullToRefreshState", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/pulltorefresh/PullToRefreshState;", "drawArrow", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "arrow", "Landroidx/compose/ui/graphics/Path;", "bounds", "Landroidx/compose/ui/geometry/Rect;", "alpha", "values", "strokeWidth", "drawArrow-uDrxG_w", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/compose/ui/graphics/Path;Landroidx/compose/ui/geometry/Rect;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;F)V", "drawCircularIndicator", "arcBounds", "drawCircularIndicator-KzyDr3Q", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;JFLandroidx/compose/material3/pulltorefresh/ArrowValues;Landroidx/compose/ui/geometry/Rect;F)V", "pullToRefresh", "enabled", "threshold", "pullToRefresh-Z4HSEVQ", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "pullToRefreshIndicator", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "elevation", "pullToRefreshIndicator-wUdLESc", "(Landroidx/compose/ui/Modifier;Landroidx/compose/material3/pulltorefresh/PullToRefreshState;ZFLandroidx/compose/ui/graphics/Shape;JF)Landroidx/compose/ui/Modifier;", "material3_release", "targetAlpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class PullToRefreshKt {
    private static final int CrossfadeDurationMs = 100;
    private static final float DragMultiplier = 0.5f;
    private static final float MaxAlpha = 1.0f;
    private static final float MaxProgressArc = 0.8f;
    private static final float MinAlpha = 0.3f;
    private static final float StrokeWidth = Dp.m6233constructorimpl((float) 2.5d);
    private static final float ArcRadius = Dp.m6233constructorimpl((float) 5.5d);
    private static final float SpinnerSize = Dp.m6233constructorimpl(16);
    private static final float SpinnerContainerSize = Dp.m6233constructorimpl(40);
    private static final float ArrowWidth = Dp.m6233constructorimpl(10);
    private static final float ArrowHeight = Dp.m6233constructorimpl(5);
    private static final TweenSpec<Float> AlphaTween = AnimationSpecKt.tween$default(AnimationConstants.DefaultDurationMillis, 0, EasingKt.getLinearEasing(), 2, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrowValues ArrowValues(float f2) {
        float fMax = (Math.max(Math.min(1.0f, f2) - 0.4f, 0.0f) * 5) / 3;
        float fCoerceIn = RangesKt.coerceIn(Math.abs(f2) - 1.0f, 0.0f, 2.0f);
        float fPow = (((0.4f * fMax) - 0.25f) + (fCoerceIn - (((float) Math.pow(fCoerceIn, 2)) / 4))) * 0.5f;
        float f3 = 360;
        return new ArrowValues(fPow, fPow * f3, ((0.8f * fMax) + fPow) * f3, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CircularArrowProgressIndicator-RPmYEkk, reason: not valid java name */
    public static final void m2623CircularArrowProgressIndicatorRPmYEkk(final Function0<Float> function0, final long j2, Composer composer, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-569718810);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-569718810, i3, -1, "androidx.compose.material3.pulltorefresh.CircularArrowProgressIndicator (PullToRefresh.kt:561)");
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            Object obj = objRememberedValue;
            if (objRememberedValue == companion.getEmpty()) {
                Path Path = AndroidPath_androidKt.Path();
                Path.mo3685setFillTypeoQ8Xj4U(PathFillType.INSTANCE.m4073getEvenOddRgk1Os());
                composerStartRestartGroup.updateRememberedValue(Path);
                obj = Path;
            }
            final Path path = (Path) obj;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotStateKt.derivedStateOf(new Function0<Float>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$targetAlpha$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Float invoke() {
                        return Float.valueOf(function0.invoke().floatValue() < 1.0f ? 0.3f : 1.0f);
                    }
                });
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(CircularArrowProgressIndicator_RPmYEkk$lambda$4((State) objRememberedValue2), AlphaTween, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            Modifier.Companion companion2 = Modifier.INSTANCE;
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        invoke2(semanticsPropertyReceiver);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                        SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver, new ProgressBarRangeInfo(function0.invoke().floatValue(), RangesKt.rangeTo(0.0f, 1.0f), 0));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Modifier modifierM687size3ABfNKs = SizeKt.m687size3ABfNKs(SemanticsModifierKt.semantics(companion2, true, (Function1) objRememberedValue3), SpinnerSize);
            boolean zChanged = (i4 == 4) | composerStartRestartGroup.changed(stateAnimateFloatAsState) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(path);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue4 == companion.getEmpty()) {
                Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                        invoke2(drawScope);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(DrawScope drawScope) {
                        ArrowValues ArrowValues = PullToRefreshKt.ArrowValues(function0.invoke().floatValue());
                        float fFloatValue = stateAnimateFloatAsState.getValue().floatValue();
                        float rotation = ArrowValues.getRotation();
                        long j3 = j2;
                        Path path2 = path;
                        long jMo4341getCenterF1C5BW0 = drawScope.mo4341getCenterF1C5BW0();
                        DrawContext drawContext = drawScope.getDrawContext();
                        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
                        drawContext.getCanvas().save();
                        try {
                            drawContext.getTransform().mo4269rotateUv8p0NA(rotation, jMo4341getCenterF1C5BW0);
                            Rect rectM3590Rect3MmeM6k = RectKt.m3590Rect3MmeM6k(androidx.compose.ui.geometry.SizeKt.m3630getCenteruvyYCjk(drawScope.mo4342getSizeNHjbRc()), (drawScope.mo334toPx0680j_4(PullToRefreshKt.StrokeWidth) / 2.0f) + drawScope.mo334toPx0680j_4(PullToRefreshKt.ArcRadius));
                            PullToRefreshKt.m2628drawCircularIndicatorKzyDr3Q(drawScope, j3, fFloatValue, ArrowValues, rectM3590Rect3MmeM6k, PullToRefreshKt.StrokeWidth);
                            PullToRefreshKt.m2627drawArrowuDrxG_w(drawScope, path2, rectM3590Rect3MmeM6k, j3, fFloatValue, ArrowValues, PullToRefreshKt.StrokeWidth);
                        } finally {
                            d.y(drawContext, jMo4263getSizeNHjbRc);
                        }
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue4 = function1;
            }
            CanvasKt.Canvas(modifierM687size3ABfNKs, (Function1) objRememberedValue4, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$CircularArrowProgressIndicator$3
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
                    PullToRefreshKt.m2623CircularArrowProgressIndicatorRPmYEkk(function0, j2, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final float CircularArrowProgressIndicator_RPmYEkk$lambda$4(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PullToRefreshBox(final boolean r16, final kotlin.jvm.functions.Function0<kotlin.Unit> r17, androidx.compose.ui.Modifier r18, androidx.compose.material3.pulltorefresh.PullToRefreshState r19, androidx.compose.ui.Alignment r20, kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r21, final kotlin.jvm.functions.Function3<? super androidx.compose.foundation.layout.BoxScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r22, androidx.compose.runtime.Composer r23, final int r24, final int r25) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.PullToRefreshKt.PullToRefreshBox(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.material3.pulltorefresh.PullToRefreshState, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function3, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final PullToRefreshState PullToRefreshState() {
        return new PullToRefreshStateImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawArrow-uDrxG_w, reason: not valid java name */
    public static final void m2627drawArrowuDrxG_w(DrawScope drawScope, Path path, Rect rect, long j2, float f2, ArrowValues arrowValues, float f3) {
        path.reset();
        path.moveTo(0.0f, 0.0f);
        float f4 = ArrowWidth;
        path.lineTo((drawScope.mo334toPx0680j_4(f4) * arrowValues.getScale()) / 2, drawScope.mo334toPx0680j_4(ArrowHeight) * arrowValues.getScale());
        path.lineTo(drawScope.mo334toPx0680j_4(f4) * arrowValues.getScale(), 0.0f);
        path.mo3687translatek4lQ0M(OffsetKt.Offset((Offset.m3551getXimpl(rect.m3581getCenterF1C5BW0()) + (Math.min(rect.getWidth(), rect.getHeight()) / 2.0f)) - ((drawScope.mo334toPx0680j_4(f4) * arrowValues.getScale()) / 2.0f), Offset.m3552getYimpl(rect.m3581getCenterF1C5BW0()) - drawScope.mo334toPx0680j_4(f3)));
        float endAngle = arrowValues.getEndAngle() - drawScope.mo334toPx0680j_4(f3);
        long jMo4341getCenterF1C5BW0 = drawScope.mo4341getCenterF1C5BW0();
        DrawContext drawContext = drawScope.getDrawContext();
        long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
        drawContext.getCanvas().save();
        try {
            drawContext.getTransform().mo4269rotateUv8p0NA(endAngle, jMo4341getCenterF1C5BW0);
            DrawScope.m4332drawPathLG529CI$default(drawScope, path, j2, f2, new Stroke(drawScope.mo334toPx0680j_4(f3), 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
        } finally {
            d.y(drawContext, jMo4263getSizeNHjbRc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawCircularIndicator-KzyDr3Q, reason: not valid java name */
    public static final void m2628drawCircularIndicatorKzyDr3Q(DrawScope drawScope, long j2, float f2, ArrowValues arrowValues, Rect rect, float f3) {
        DrawScope.m4321drawArcyD3GUKo$default(drawScope, j2, arrowValues.getStartAngle(), arrowValues.getEndAngle() - arrowValues.getStartAngle(), false, rect.m3586getTopLeftF1C5BW0(), rect.m3584getSizeNHjbRc(), f2, new Stroke(drawScope.mo334toPx0680j_4(f3), 0.0f, StrokeCap.INSTANCE.m4144getButtKaPHkGw(), 0, null, 26, null), null, 0, 768, null);
    }

    public static final float getSpinnerContainerSize() {
        return SpinnerContainerSize;
    }

    public static final float getSpinnerSize() {
        return SpinnerSize;
    }

    /* renamed from: pullToRefresh-Z4HSEVQ, reason: not valid java name */
    public static final Modifier m2629pullToRefreshZ4HSEVQ(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f2, Function0<Unit> function0) {
        return modifier.then(new PullToRefreshElement(z, function0, z2, pullToRefreshState, f2, null));
    }

    /* renamed from: pullToRefresh-Z4HSEVQ$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2630pullToRefreshZ4HSEVQ$default(Modifier modifier, boolean z, PullToRefreshState pullToRefreshState, boolean z2, float f2, Function0 function0, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i2 & 8) != 0) {
            f2 = PullToRefreshDefaults.INSTANCE.m2618getPositionalThresholdD9Ej5fM();
        }
        return m2629pullToRefreshZ4HSEVQ(modifier, z, pullToRefreshState, z3, f2, function0);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc, reason: not valid java name */
    public static final Modifier m2631pullToRefreshIndicatorwUdLESc(Modifier modifier, final PullToRefreshState pullToRefreshState, final boolean z, final float f2, final Shape shape, long j2, final float f3) {
        return BackgroundKt.m196backgroundbw27NRU(GraphicsLayerModifierKt.graphicsLayer(DrawModifierKt.drawWithContent(SizeKt.m687size3ABfNKs(modifier, SpinnerContainerSize), new Function1<ContentDrawScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ContentDrawScope contentDrawScope) {
                invoke2(contentDrawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(ContentDrawScope contentDrawScope) {
                int iM3781getIntersectrtfAjoo = ClipOp.INSTANCE.m3781getIntersectrtfAjoo();
                DrawContext drawContext = contentDrawScope.getDrawContext();
                long jMo4263getSizeNHjbRc = drawContext.mo4263getSizeNHjbRc();
                drawContext.getCanvas().save();
                try {
                    drawContext.getTransform().mo4266clipRectN_I0leg(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, iM3781getIntersectrtfAjoo);
                    contentDrawScope.drawContent();
                } finally {
                    d.y(drawContext, jMo4263getSizeNHjbRc);
                }
            }
        }), new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt$pullToRefreshIndicator$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                invoke2(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(GraphicsLayerScope graphicsLayerScope) {
                boolean z2 = pullToRefreshState.getDistanceFraction() > 0.0f || z;
                graphicsLayerScope.setTranslationY((pullToRefreshState.getDistanceFraction() * graphicsLayerScope.mo328roundToPx0680j_4(f2)) - Size.m3617getHeightimpl(graphicsLayerScope.getSize()));
                graphicsLayerScope.setShadowElevation(z2 ? graphicsLayerScope.mo334toPx0680j_4(f3) : 0.0f);
                graphicsLayerScope.setShape(shape);
                graphicsLayerScope.setClip(true);
            }
        }), j2, shape);
    }

    /* renamed from: pullToRefreshIndicator-wUdLESc$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2632pullToRefreshIndicatorwUdLESc$default(Modifier modifier, PullToRefreshState pullToRefreshState, boolean z, float f2, Shape shape, long j2, float f3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            f2 = PullToRefreshDefaults.INSTANCE.m2618getPositionalThresholdD9Ej5fM();
        }
        float f4 = f2;
        if ((i2 & 8) != 0) {
            shape = PullToRefreshDefaults.INSTANCE.getShape();
        }
        Shape shape2 = shape;
        if ((i2 & 16) != 0) {
            j2 = Color.INSTANCE.m3828getUnspecified0d7_KjU();
        }
        return m2631pullToRefreshIndicatorwUdLESc(modifier, pullToRefreshState, z, f4, shape2, j2, (i2 & 32) != 0 ? PullToRefreshDefaults.INSTANCE.m2617getElevationD9Ej5fM() : f3);
    }

    public static final PullToRefreshState rememberPullToRefreshState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(318623070, i2, -1, "androidx.compose.material3.pulltorefresh.rememberPullToRefreshState (PullToRefresh.kt:512)");
        }
        PullToRefreshStateImpl pullToRefreshStateImpl = (PullToRefreshStateImpl) RememberSaveableKt.m3378rememberSaveable(new Object[0], (Saver) PullToRefreshStateImpl.INSTANCE.getSaver(), (String) null, (Function0) new Function0<PullToRefreshStateImpl>() { // from class: androidx.compose.material3.pulltorefresh.PullToRefreshKt.rememberPullToRefreshState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final PullToRefreshStateImpl invoke() {
                return new PullToRefreshStateImpl();
            }
        }, composer, 3072, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return pullToRefreshStateImpl;
    }
}
