package androidx.lifecycle;

import androidx.compose.ui.text.android.style.PlaceholderSpan;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.lifecycle.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574g implements InterfaceC0585s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f582a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f583b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f584c;

    public C0574g(InterfaceC0572e defaultLifecycleObserver, InterfaceC0585s interfaceC0585s) {
        Intrinsics.checkNotNullParameter(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f583b = defaultLifecycleObserver;
        this.f584c = interfaceC0585s;
    }

    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u source, EnumC0581n event) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        switch (this.f582a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                int i2 = AbstractC0573f.f581a[event.ordinal()];
                InterfaceC0572e interfaceC0572e = (InterfaceC0572e) this.f583b;
                switch (i2) {
                    case 1:
                        interfaceC0572e.onCreate(source);
                        break;
                    case 2:
                        interfaceC0572e.onStart(source);
                        break;
                    case 3:
                        interfaceC0572e.onResume(source);
                        break;
                    case 4:
                        interfaceC0572e.onPause(source);
                        break;
                    case 5:
                        interfaceC0572e.onStop(source);
                        break;
                    case PlaceholderSpan.ALIGN_TEXT_CENTER /* 6 */:
                        interfaceC0572e.onDestroy(source);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                InterfaceC0585s interfaceC0585s = (InterfaceC0585s) this.f584c;
                if (interfaceC0585s != null) {
                    interfaceC0585s.onStateChanged(source, event);
                    return;
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == EnumC0581n.ON_START) {
                    ((AbstractC0583p) this.f583b).b(this);
                    ((K.e) this.f584c).c();
                    return;
                }
                return;
            default:
                HashMap map = ((C0569b) this.f584c).f574a;
                List list = (List) map.get(event);
                InterfaceC0586t interfaceC0586t = (InterfaceC0586t) this.f583b;
                C0569b.a(list, source, event, interfaceC0586t);
                C0569b.a((List) map.get(EnumC0581n.ON_ANY), source, event, interfaceC0586t);
                return;
        }
    }

    public C0574g(InterfaceC0586t interfaceC0586t) {
        this.f583b = interfaceC0586t;
        C0571d c0571d = C0571d.f578c;
        Class<?> cls = interfaceC0586t.getClass();
        C0569b c0569b = (C0569b) c0571d.f579a.get(cls);
        this.f584c = c0569b == null ? c0571d.a(cls, null) : c0569b;
    }

    public C0574g(K.e eVar, AbstractC0583p abstractC0583p) {
        this.f583b = abstractC0583p;
        this.f584c = eVar;
    }
}
