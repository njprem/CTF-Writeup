package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Fields;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aN\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\f\u001aX\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072%\b\u0002\u0010\u0011\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00140\n2&\u0010\t\u001a\"\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0003\u0012\u0004\u0012\u00020\u00010\n¢\u0006\u0002\b\u000bH\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\u0010\u0010\u0017\u001a\u00020\b\"\u0004\b\u0000\u0010\u0002X\u008a\u0084\u0002"}, d2 = {"Crossfade", "", "T", "targetState", "modifier", "Landroidx/compose/ui/Modifier;", "animationSpec", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "", "content", "Lkotlin/Function1;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "label", "", "(Ljava/lang/Object;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/animation/core/Transition;", "contentKey", "Lkotlin/ParameterName;", "name", "", "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/Modifier;Landroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "animation_release", "alpha"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:29:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(final T r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r18, java.lang.String r19, final kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r20, androidx.compose.runtime.Composer r21, final int r22, final int r23) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Crossfade API now has a new label parameter added.")
    public static final /* synthetic */ void Crossfade(final Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, Function3 function3, Composer composer, final int i2, final int i3) {
        int i4;
        final Function3 function32;
        final Modifier modifier2;
        final FiniteAnimationSpec finiteAnimationSpec2;
        Composer composerStartRestartGroup = composer.startRestartGroup(523603005);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(obj) : composerStartRestartGroup.changedInstance(obj) ? 4 : 2) | i2;
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
            i4 |= composerStartRestartGroup.changedInstance(finiteAnimationSpec) ? Fields.RotationX : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(function3) ? Fields.CameraDistance : 1024;
        }
        if ((i4 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            function32 = function3;
            finiteAnimationSpec2 = finiteAnimationSpec;
            modifier2 = modifier;
        } else {
            if (i5 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier3 = modifier;
            if (i6 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            FiniteAnimationSpec finiteAnimationSpec3 = finiteAnimationSpec;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i4, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:71)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, composerStartRestartGroup, i4 & 14, 2), modifier3, (FiniteAnimationSpec<Float>) finiteAnimationSpec3, (Function1) null, function3, composerStartRestartGroup, (i4 & 1008) | ((i4 << 3) & 57344), 4);
            function32 = function3;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            finiteAnimationSpec2 = finiteAnimationSpec3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.animation.CrossfadeKt.Crossfade.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    CrossfadeKt.Crossfade(obj, modifier2, finiteAnimationSpec2, function32, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:111:0x01f4, code lost:
    
        r4 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fe, code lost:
    
        if (((((~r11) << r17) & r11) & (-9187201950435737472L)) == 0) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0200, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f4 A[EDGE_INSN: B:163:0x01f4->B:111:0x01f4 BREAK  A[LOOP:1: B:105:0x01ca->B:110:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x016c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void Crossfade(androidx.compose.animation.core.Transition<T> r26, androidx.compose.ui.Modifier r27, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r28, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Object> r29, kotlin.jvm.functions.Function3<? super T, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r30, androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function3, androidx.compose.runtime.Composer, int, int):void");
    }
}
