package androidx.compose.foundation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.CoroutineScope;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00052\u0017\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b\rH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001c"}, d2 = {"AndroidEmbeddedExternalSurface", "", "modifier", "Landroidx/compose/ui/Modifier;", "isOpaque", "", "surfaceSize", "Landroidx/compose/ui/unit/IntSize;", "transform", "Landroidx/compose/ui/graphics/Matrix;", "onInit", "Lkotlin/Function1;", "Landroidx/compose/foundation/AndroidExternalSurfaceScope;", "Lkotlin/ExtensionFunctionType;", "AndroidEmbeddedExternalSurface-sv6N_fY", "(Landroidx/compose/ui/Modifier;ZJ[FLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AndroidExternalSurface", "zOrder", "Landroidx/compose/foundation/AndroidExternalSurfaceZOrder;", "isSecure", "AndroidExternalSurface-58FFMhA", "(Landroidx/compose/ui/Modifier;ZJIZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "rememberAndroidEmbeddedExternalSurfaceState", "Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidEmbeddedExternalSurfaceState;", "rememberAndroidExternalSurfaceState", "Landroidx/compose/foundation/AndroidExternalSurfaceState;", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/AndroidExternalSurfaceState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidExternalSurface_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    /* renamed from: AndroidEmbeddedExternalSurface-sv6N_fY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m194AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier r22, boolean r23, long r24, float[] r26, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.m194AndroidEmbeddedExternalSurfacesv6N_fY(androidx.compose.ui.Modifier, boolean, long, float[], kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* renamed from: AndroidExternalSurface-58FFMhA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m195AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier r21, boolean r22, long r23, int r25, boolean r26, final kotlin.jvm.functions.Function1<? super androidx.compose.foundation.AndroidExternalSurfaceScope, kotlin.Unit> r27, androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidExternalSurface_androidKt.m195AndroidExternalSurface58FFMhA(androidx.compose.ui.Modifier, boolean, long, int, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    private static final AndroidEmbeddedExternalSurfaceState rememberAndroidEmbeddedExternalSurfaceState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1057437053, i2, -1, "androidx.compose.foundation.rememberAndroidEmbeddedExternalSurfaceState (AndroidExternalSurface.android.kt:383)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new AndroidEmbeddedExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidEmbeddedExternalSurfaceState androidEmbeddedExternalSurfaceState = (AndroidEmbeddedExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidEmbeddedExternalSurfaceState;
    }

    private static final AndroidExternalSurfaceState rememberAndroidExternalSurfaceState(Composer composer, int i2) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-873615933, i2, -1, "androidx.compose.foundation.rememberAndroidExternalSurfaceState (AndroidExternalSurface.android.kt:189)");
        }
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer), composer);
        }
        CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new AndroidExternalSurfaceState(coroutineScope);
            composer.updateRememberedValue(objRememberedValue2);
        }
        AndroidExternalSurfaceState androidExternalSurfaceState = (AndroidExternalSurfaceState) objRememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return androidExternalSurfaceState;
    }
}
