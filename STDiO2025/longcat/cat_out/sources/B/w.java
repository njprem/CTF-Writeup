package B;

import android.content.ClipDescription;
import android.net.Uri;
import android.text.TextPaint;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.Set;
import s.AbstractC0794d;

/* loaded from: classes.dex */
public final class w implements y.h {

    /* renamed from: a, reason: collision with root package name */
    public final Object f127a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f128b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f129c;

    public w(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f127a = uri;
        this.f128b = clipDescription;
        this.f129c = uri2;
    }

    @Override // y.h
    public ClipDescription a() {
        return (ClipDescription) this.f128b;
    }

    @Override // y.h
    public Object b() {
        return null;
    }

    @Override // y.h
    public Uri c() {
        return (Uri) this.f127a;
    }

    @Override // y.h
    public Uri e() {
        return (Uri) this.f129c;
    }

    public boolean f(CharSequence charSequence, int i2, int i3, C c2) {
        if ((c2.f78c & 3) == 0) {
            C0129f c0129f = (C0129f) this.f129c;
            C.a aVarB = c2.b();
            int iA = aVarB.a(8);
            if (iA != 0) {
                aVarB.f145b.getShort(iA + aVarB.f144a);
            }
            c0129f.getClass();
            ThreadLocal threadLocal = C0129f.f89b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i2 < i3) {
                sb.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = c0129f.f90a;
            String string = sb.toString();
            int i4 = AbstractC0794d.f979a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i5 = c2.f78c & 4;
            c2.f78c = zHasGlyph ? i5 | 2 : i5 | 1;
        }
        return (c2.f78c & 3) == 2;
    }

    public Object g(CharSequence charSequence, int i2, int i3, int i4, boolean z, t tVar) {
        int i5;
        char c2;
        v vVar = new v(((B) this.f128b).f73c);
        int iCodePointAt = Character.codePointAt(charSequence, i2);
        boolean zC = true;
        int i6 = 0;
        int iCharCount = i2;
        loop0: while (true) {
            i5 = iCharCount;
            while (iCharCount < i3 && i6 < i4 && zC) {
                SparseArray sparseArray = vVar.f123c.f69a;
                A a2 = sparseArray == null ? null : (A) sparseArray.get(iCodePointAt);
                if (vVar.f121a == 2) {
                    if (a2 != null) {
                        vVar.f123c = a2;
                        vVar.f126f++;
                    } else {
                        if (iCodePointAt == 65038) {
                            vVar.a();
                        } else if (iCodePointAt != 65039) {
                            A a3 = vVar.f123c;
                            if (a3.f70b != null) {
                                if (vVar.f126f != 1) {
                                    vVar.f124d = a3;
                                    vVar.a();
                                } else if (vVar.b()) {
                                    vVar.f124d = vVar.f123c;
                                    vVar.a();
                                } else {
                                    vVar.a();
                                }
                                c2 = 3;
                            } else {
                                vVar.a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (a2 == null) {
                    vVar.a();
                    c2 = 1;
                } else {
                    vVar.f121a = 2;
                    vVar.f123c = a2;
                    vVar.f126f = 1;
                    c2 = 2;
                }
                vVar.f125e = iCodePointAt;
                if (c2 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i5)) + i5;
                    if (iCharCount < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c2 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i3) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c2 == 3) {
                    if (z || !f(charSequence, i5, iCharCount, vVar.f124d.f70b)) {
                        zC = tVar.c(charSequence, i5, iCharCount, vVar.f124d.f70b);
                        i6++;
                    }
                }
            }
            break loop0;
        }
        if (vVar.f121a == 2 && vVar.f123c.f70b != null && ((vVar.f126f > 1 || vVar.b()) && i6 < i4 && zC && (z || !f(charSequence, i5, iCharCount, vVar.f123c.f70b)))) {
            tVar.c(charSequence, i5, iCharCount, vVar.f123c.f70b);
        }
        return tVar.a();
    }

    public w(B b2, C0127d c0127d, C0129f c0129f, Set set) {
        this.f127a = c0127d;
        this.f128b = b2;
        this.f129c = c0129f;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            g(str, 0, str.length(), 1, true, new p(str));
        }
    }

    @Override // y.h
    public void d() {
    }
}
