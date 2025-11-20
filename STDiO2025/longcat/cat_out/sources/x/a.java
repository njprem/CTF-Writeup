package x;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f1039a;

    /* renamed from: b, reason: collision with root package name */
    public final f f1040b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1041c;

    public a(int i2, f fVar, int i3) {
        this.f1039a = i2;
        this.f1040b = fVar;
        this.f1041c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f1039a);
        this.f1040b.f1055a.performAction(this.f1041c, bundle);
    }
}
