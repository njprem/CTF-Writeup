package androidx.compose.foundation.text;

import B.l;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "", "index", "findPrecedingBreak", "(Ljava/lang/String;I)I", "findFollowingBreak", "LB/l;", "getEmojiCompatIfLoaded", "()LB/l;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StringHelpers_androidKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int findFollowingBreak(java.lang.String r9, int r10) {
        /*
            B.l r0 = getEmojiCompatIfLoaded()
            r1 = 0
            if (r0 == 0) goto L63
            B.h r0 = r0.f104e
            B.w r2 = r0.f93b
            r2.getClass()
            r0 = -1
            if (r10 < 0) goto L17
            int r3 = r9.length()
            if (r10 < r3) goto L19
        L17:
            r3 = r9
            goto L59
        L19:
            boolean r3 = r9 instanceof android.text.Spanned
            r4 = 0
            if (r3 == 0) goto L36
            r3 = r9
            android.text.Spanned r3 = (android.text.Spanned) r3
            int r5 = r10 + 1
            java.lang.Class<B.D> r6 = B.D.class
            java.lang.Object[] r5 = r3.getSpans(r10, r5, r6)
            B.D[] r5 = (B.D[]) r5
            int r6 = r5.length
            if (r6 <= 0) goto L36
            r2 = r5[r4]
            int r2 = r3.getSpanEnd(r2)
            r3 = r9
            goto L5a
        L36:
            int r3 = r10 + (-16)
            int r4 = java.lang.Math.max(r4, r3)
            int r3 = r9.length()
            int r5 = r10 + 16
            int r5 = java.lang.Math.min(r3, r5)
            B.u r8 = new B.u
            r8.<init>(r10)
            r6 = 2147483647(0x7fffffff, float:NaN)
            r7 = 1
            r3 = r9
            java.lang.Object r9 = r2.g(r3, r4, r5, r6, r7, r8)
            B.u r9 = (B.u) r9
            int r2 = r9.f120c
            goto L5a
        L59:
            r2 = r0
        L5a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L61
            goto L64
        L61:
            r1 = r9
            goto L64
        L63:
            r3 = r9
        L64:
            if (r1 == 0) goto L6b
            int r9 = r1.intValue()
            return r9
        L6b:
            java.text.BreakIterator r9 = java.text.BreakIterator.getCharacterInstance()
            r9.setText(r3)
            int r9 = r9.following(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.findFollowingBreak(java.lang.String, int):int");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int findPrecedingBreak(java.lang.String r11, int r12) {
        /*
            B.l r0 = getEmojiCompatIfLoaded()
            r1 = 0
            if (r0 == 0) goto L69
            int r2 = r12 + (-1)
            r3 = 0
            int r2 = java.lang.Math.max(r3, r2)
            B.h r0 = r0.f104e
            B.w r4 = r0.f93b
            r4.getClass()
            r0 = -1
            if (r2 < 0) goto L1e
            int r5 = r11.length()
            if (r2 < r5) goto L20
        L1e:
            r5 = r11
            goto L5f
        L20:
            boolean r5 = r11 instanceof android.text.Spanned
            if (r5 == 0) goto L3c
            r5 = r11
            android.text.Spanned r5 = (android.text.Spanned) r5
            int r6 = r2 + 1
            java.lang.Class<B.D> r7 = B.D.class
            java.lang.Object[] r6 = r5.getSpans(r2, r6, r7)
            B.D[] r6 = (B.D[]) r6
            int r7 = r6.length
            if (r7 <= 0) goto L3c
            r2 = r6[r3]
            int r2 = r5.getSpanStart(r2)
            r5 = r11
            goto L60
        L3c:
            int r5 = r2 + (-16)
            int r6 = java.lang.Math.max(r3, r5)
            int r3 = r11.length()
            int r5 = r2 + 16
            int r7 = java.lang.Math.min(r3, r5)
            B.u r10 = new B.u
            r10.<init>(r2)
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = 1
            r5 = r11
            java.lang.Object r11 = r4.g(r5, r6, r7, r8, r9, r10)
            B.u r11 = (B.u) r11
            int r2 = r11.f119b
            goto L60
        L5f:
            r2 = r0
        L60:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            if (r2 != r0) goto L67
            goto L6a
        L67:
            r1 = r11
            goto L6a
        L69:
            r5 = r11
        L6a:
            if (r1 == 0) goto L71
            int r11 = r1.intValue()
            return r11
        L71:
            java.text.BreakIterator r11 = java.text.BreakIterator.getCharacterInstance()
            r11.setText(r5)
            int r11 = r11.preceding(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.StringHelpers_androidKt.findPrecedingBreak(java.lang.String, int):int");
    }

    private static final l getEmojiCompatIfLoaded() {
        if (!l.c()) {
            return null;
        }
        l lVarA = l.a();
        if (lVarA.b() == 1) {
            return lVarA;
        }
        return null;
    }
}
