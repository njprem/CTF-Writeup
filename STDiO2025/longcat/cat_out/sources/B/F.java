package B;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class F implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f84a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f85b;

    public F(Spannable spannable) {
        this.f85b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f85b;
        if (!this.f84a) {
            if ((Build.VERSION.SDK_INT < 28 ? new C0127d(3) : new E(3)).c(spannable)) {
                this.f85b = new SpannableString(spannable);
            }
        }
        this.f84a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i2) {
        return this.f85b.charAt(i2);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f85b.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f85b.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f85b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f85b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f85b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i2, int i3, Class cls) {
        return this.f85b.getSpans(i2, i3, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f85b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f85b.nextSpanTransition(i2, i3, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f85b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i2, int i3, int i4) {
        a();
        this.f85b.setSpan(obj, i2, i3, i4);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i2, int i3) {
        return this.f85b.subSequence(i2, i3);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f85b.toString();
    }
}
