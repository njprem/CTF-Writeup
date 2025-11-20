package androidx.compose.material3;

import kotlin.Metadata;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aß\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\t\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\n\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\u0015\b\u0002\u0010\u000b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003¢\u0006\u0002\b\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"AlertDialog", "", "onDismissRequest", "Lkotlin/Function0;", "confirmButton", "Landroidx/compose/runtime/Composable;", "modifier", "Landroidx/compose/ui/Modifier;", "dismissButton", "icon", "title", "text", "shape", "Landroidx/compose/ui/graphics/Shape;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "iconContentColor", "titleContentColor", "textContentColor", "tonalElevation", "Landroidx/compose/ui/unit/Dp;", "properties", "Landroidx/compose/ui/window/DialogProperties;", "AlertDialog-Oix01E0", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;JJJJFLandroidx/compose/ui/window/DialogProperties;Landroidx/compose/runtime/Composer;III)V", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidAlertDialog_androidKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* renamed from: AlertDialog-Oix01E0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1394AlertDialogOix01E0(final kotlin.jvm.functions.Function0<kotlin.Unit> r31, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r32, androidx.compose.ui.Modifier r33, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r34, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r35, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r36, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r37, androidx.compose.ui.graphics.Shape r38, long r39, long r41, long r43, long r45, float r47, androidx.compose.ui.window.DialogProperties r48, androidx.compose.runtime.Composer r49, final int r50, final int r51, final int r52) {
        /*
            Method dump skipped, instructions count: 801
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AndroidAlertDialog_androidKt.m1394AlertDialogOix01E0(kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, androidx.compose.ui.graphics.Shape, long, long, long, long, float, androidx.compose.ui.window.DialogProperties, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
