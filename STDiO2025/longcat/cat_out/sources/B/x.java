package B;

import a.AbstractC0130a;
import a.AbstractC0131b;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.material.ripple.RippleHostView;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.lifecycle.EnumC0581n;
import b.AbstractDialogC0613p;
import b.ViewTreeObserverOnDrawListenerC0608k;
import java.nio.MappedByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import s.AbstractC0795e;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f130a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f131b;

    public /* synthetic */ x(Object obj, int i2) {
        this.f130a = i2;
        this.f131b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f130a) {
            case 0:
                y yVar = (y) this.f131b;
                synchronized (yVar.f135d) {
                    try {
                        if (yVar.f139h == null) {
                            return;
                        }
                        try {
                            v.k kVarB = yVar.b();
                            int i2 = kVarB.f1031e;
                            if (i2 == 2) {
                                synchronized (yVar.f135d) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = u.b.f998a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0127d c0127d = yVar.f134c;
                                Context context = yVar.f132a;
                                c0127d.getClass();
                                v.k[] kVarArr = {kVarB};
                                AbstractC0130a abstractC0130a = AbstractC0795e.f980a;
                                AbstractC0131b.d("TypefaceCompat.createFromFontInfo");
                                try {
                                    Typeface typefaceF = AbstractC0795e.f980a.f(context, kVarArr);
                                    Trace.endSection();
                                    MappedByteBuffer mappedByteBufferS = AbstractC0131b.s(yVar.f132a, kVarB.f1027a);
                                    if (mappedByteBufferS == null || typefaceF == null) {
                                        throw new RuntimeException("Unable to open file.");
                                    }
                                    try {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        B b2 = new B(typefaceF, AbstractC0131b.x(mappedByteBufferS));
                                        Trace.endSection();
                                        synchronized (yVar.f135d) {
                                            try {
                                                AbstractC0131b abstractC0131b = yVar.f139h;
                                                if (abstractC0131b != null) {
                                                    abstractC0131b.u(b2);
                                                }
                                            } finally {
                                            }
                                        }
                                        yVar.a();
                                        return;
                                    } finally {
                                        int i4 = u.b.f998a;
                                    }
                                } finally {
                                    Trace.endSection();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            synchronized (yVar.f135d) {
                                try {
                                    AbstractC0131b abstractC0131b2 = yVar.f139h;
                                    if (abstractC0131b2 != null) {
                                        abstractC0131b2.t(th2);
                                    }
                                    yVar.a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 1:
                RippleHostView.setRippleState$lambda$2((RippleHostView) this.f131b);
                return;
            case 2:
                AndroidContentCaptureManager.contentCaptureChangeChecker$lambda$0((AndroidContentCaptureManager) this.f131b);
                return;
            case 3:
                TextInputServiceAndroid.sendInputCommand$lambda$1((TextInputServiceAndroid) this.f131b);
                return;
            case 4:
                View view = (View) this.f131b;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 5:
                androidx.lifecycle.B b3 = (androidx.lifecycle.B) this.f131b;
                int i5 = b3.f539b;
                androidx.lifecycle.w wVar = b3.f543f;
                if (i5 == 0) {
                    b3.f540c = true;
                    wVar.e(EnumC0581n.ON_PAUSE);
                }
                if (b3.f538a == 0 && b3.f540c) {
                    wVar.e(EnumC0581n.ON_STOP);
                    b3.f541d = true;
                    return;
                }
                return;
            case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                ViewTreeObserverOnDrawListenerC0608k viewTreeObserverOnDrawListenerC0608k = (ViewTreeObserverOnDrawListenerC0608k) this.f131b;
                Runnable runnable = viewTreeObserverOnDrawListenerC0608k.f644b;
                if (runnable != null) {
                    Intrinsics.checkNotNull(runnable);
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0608k.f644b = null;
                    return;
                }
                return;
            default:
                AbstractDialogC0613p.a((AbstractDialogC0613p) this.f131b);
                return;
        }
    }
}
