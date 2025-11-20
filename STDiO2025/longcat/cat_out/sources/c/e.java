package c;

import androidx.compose.runtime.State;
import b.AbstractC0621x;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class e extends AbstractC0621x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ State f676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z, State state) {
        super(z);
        this.f676d = state;
    }

    @Override // b.AbstractC0621x
    public final void b() {
        ((Function0) this.f676d.getValue()).invoke();
    }
}
