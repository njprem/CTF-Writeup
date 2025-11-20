package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008c\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001av\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00062\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001e\u0010\u0017\u001a\u00020\f*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, d2 = {"ClickableText", "", "text", "Landroidx/compose/ui/text/AnnotatedString;", "onHover", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "style", "Landroidx/compose/ui/text/TextStyle;", "softWrap", "", "overflow", "Landroidx/compose/ui/text/style/TextOverflow;", "maxLines", "onTextLayout", "Landroidx/compose/ui/text/TextLayoutResult;", "onClick", "ClickableText-03UYbkw", "(Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "ClickableText-4YKlhWE", "(Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/TextStyle;ZIILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "containsWithinBounds", "Landroidx/compose/ui/text/MultiParagraph;", "positionOffset", "Landroidx/compose/ui/geometry/Offset;", "containsWithinBounds-Uv8p0NA", "(Landroidx/compose/ui/text/MultiParagraph;J)Z", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0117  */
    @kotlin.Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    /* renamed from: ClickableText-03UYbkw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m941ClickableText03UYbkw(final androidx.compose.ui.text.AnnotatedString r25, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, boolean r29, int r30, int r31, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r32, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r33, androidx.compose.runtime.Composer r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m941ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011f  */
    @kotlin.Deprecated(message = "Use Text or BasicText and pass an AnnotatedString that contains a LinkAnnotation")
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m942ClickableText4YKlhWE(final androidx.compose.ui.text.AnnotatedString r24, androidx.compose.ui.Modifier r25, androidx.compose.ui.text.TextStyle r26, boolean r27, int r28, int r29, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.TextLayoutResult, kotlin.Unit> r30, final kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> r31, androidx.compose.runtime.Composer r32, final int r33, final int r34) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m942ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j2) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value != null && (multiParagraph = value.getMultiParagraph()) != null) {
            if (!m943containsWithinBoundsUv8p0NA(multiParagraph, j2)) {
                multiParagraph = null;
            }
            if (multiParagraph != null) {
                return Integer.valueOf(multiParagraph.m5587getOffsetForPositionk4lQ0M(j2));
            }
        }
        return null;
    }

    /* renamed from: containsWithinBounds-Uv8p0NA, reason: not valid java name */
    private static final boolean m943containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j2) {
        float fM3551getXimpl = Offset.m3551getXimpl(j2);
        float fM3552getYimpl = Offset.m3552getYimpl(j2);
        return fM3551getXimpl > 0.0f && fM3552getYimpl >= 0.0f && fM3551getXimpl <= multiParagraph.getWidth() && fM3552getYimpl <= multiParagraph.getHeight();
    }
}
