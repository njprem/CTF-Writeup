package B;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.InterfaceC0572e;
import androidx.lifecycle.InterfaceC0587u;

/* loaded from: classes.dex */
public final class m implements InterfaceC0572e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC0583p f109a;

    public m(EmojiCompatInitializer emojiCompatInitializer, AbstractC0583p abstractC0583p) {
        this.f109a = abstractC0583p;
    }

    @Override // androidx.lifecycle.InterfaceC0572e
    public final void onResume(InterfaceC0587u interfaceC0587u) {
        (Build.VERSION.SDK_INT >= 28 ? AbstractC0126c.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new q(), 500L);
        this.f109a.b(this);
    }
}
