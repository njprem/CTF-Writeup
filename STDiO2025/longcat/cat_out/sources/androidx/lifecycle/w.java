package androidx.lifecycle;

import android.os.Looper;
import h.C0632a;
import i.C0634a;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes.dex */
public final class w extends AbstractC0583p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f596a;

    /* renamed from: b, reason: collision with root package name */
    public C0634a f597b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0582o f598c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f599d;

    /* renamed from: e, reason: collision with root package name */
    public int f600e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f601f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f602g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f603h;

    /* renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f604i;

    public w(InterfaceC0587u provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        new AtomicReference(null);
        this.f596a = true;
        this.f597b = new C0634a();
        EnumC0582o enumC0582o = EnumC0582o.f587b;
        this.f598c = enumC0582o;
        this.f603h = new ArrayList();
        this.f599d = new WeakReference(provider);
        this.f604i = StateFlowKt.MutableStateFlow(enumC0582o);
    }

    @Override // androidx.lifecycle.AbstractC0583p
    public final void a(InterfaceC0586t object) {
        InterfaceC0585s c0574g;
        v vVar;
        InterfaceC0587u interfaceC0587u;
        ArrayList arrayList = this.f603h;
        Intrinsics.checkNotNullParameter(object, "observer");
        d("addObserver");
        EnumC0582o enumC0582o = this.f598c;
        EnumC0582o initialState = EnumC0582o.f586a;
        if (enumC0582o != initialState) {
            initialState = EnumC0582o.f587b;
        }
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        v vVar2 = new v();
        Intrinsics.checkNotNull(object);
        HashMap map = x.f605a;
        Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof InterfaceC0585s;
        boolean z2 = object instanceof InterfaceC0572e;
        if (z && z2) {
            c0574g = new C0574g((InterfaceC0572e) object, (InterfaceC0585s) object);
        } else if (z2) {
            c0574g = new C0574g((InterfaceC0572e) object, (InterfaceC0585s) null);
        } else if (z) {
            c0574g = (InterfaceC0585s) object;
        } else {
            Class<?> cls = object.getClass();
            if (x.c(cls) == 2) {
                Object obj = x.f606b.get(cls);
                Intrinsics.checkNotNull(obj);
                List list = (List) obj;
                if (list.size() == 1) {
                    x.a((Constructor) list.get(0), object);
                    Intrinsics.checkNotNullParameter(null, "generatedAdapter");
                    c0574g = new N();
                } else {
                    int size = list.size();
                    InterfaceC0576i[] interfaceC0576iArr = new InterfaceC0576i[size];
                    for (int i2 = 0; i2 < size; i2++) {
                        x.a((Constructor) list.get(i2), object);
                        interfaceC0576iArr[i2] = null;
                    }
                    c0574g = new K.b(interfaceC0576iArr);
                }
            } else {
                c0574g = new C0574g(object);
            }
        }
        vVar2.f595b = c0574g;
        vVar2.f594a = initialState;
        C0634a c0634a = this.f597b;
        i.c cVar = (i.c) c0634a.f716e.get(object);
        if (cVar != null) {
            vVar = cVar.f721b;
        } else {
            HashMap map2 = c0634a.f716e;
            i.c cVar2 = new i.c(object, vVar2);
            c0634a.f715d++;
            i.c cVar3 = c0634a.f713b;
            if (cVar3 == null) {
                c0634a.f712a = cVar2;
                c0634a.f713b = cVar2;
            } else {
                cVar3.f722c = cVar2;
                cVar2.f723d = cVar3;
                c0634a.f713b = cVar2;
            }
            map2.put(object, cVar2);
            vVar = null;
        }
        if (vVar == null && (interfaceC0587u = (InterfaceC0587u) this.f599d.get()) != null) {
            boolean z3 = this.f600e != 0 || this.f601f;
            EnumC0582o enumC0582oC = c(object);
            this.f600e++;
            while (vVar2.f594a.compareTo(enumC0582oC) < 0 && this.f597b.f716e.containsKey(object)) {
                arrayList.add(vVar2.f594a);
                C0579l c0579l = EnumC0581n.Companion;
                EnumC0582o state = vVar2.f594a;
                c0579l.getClass();
                Intrinsics.checkNotNullParameter(state, "state");
                int iOrdinal = state.ordinal();
                EnumC0581n enumC0581n = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : EnumC0581n.ON_RESUME : EnumC0581n.ON_START : EnumC0581n.ON_CREATE;
                if (enumC0581n == null) {
                    throw new IllegalStateException("no event up from " + vVar2.f594a);
                }
                vVar2.a(interfaceC0587u, enumC0581n);
                arrayList.remove(arrayList.size() - 1);
                enumC0582oC = c(object);
            }
            if (!z3) {
                g();
            }
            this.f600e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0583p
    public final void b(InterfaceC0586t observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        d("removeObserver");
        C0634a c0634a = this.f597b;
        i.c cVar = (i.c) c0634a.f716e.get(observer);
        if (cVar != null) {
            c0634a.f715d--;
            WeakHashMap weakHashMap = c0634a.f714c;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((i.e) it.next()).a(cVar);
                }
            }
            i.c cVar2 = cVar.f723d;
            if (cVar2 != null) {
                cVar2.f722c = cVar.f722c;
            } else {
                c0634a.f712a = cVar.f722c;
            }
            i.c cVar3 = cVar.f722c;
            if (cVar3 != null) {
                cVar3.f723d = cVar2;
            } else {
                c0634a.f713b = cVar2;
            }
            cVar.f722c = null;
            cVar.f723d = null;
        }
        c0634a.f716e.remove(observer);
    }

    public final EnumC0582o c(InterfaceC0586t interfaceC0586t) {
        HashMap map = this.f597b.f716e;
        i.c cVar = map.containsKey(interfaceC0586t) ? ((i.c) map.get(interfaceC0586t)).f723d : null;
        EnumC0582o state1 = cVar != null ? cVar.f721b.f594a : null;
        ArrayList arrayList = this.f603h;
        EnumC0582o enumC0582o = arrayList.isEmpty() ? null : (EnumC0582o) arrayList.get(arrayList.size() - 1);
        EnumC0582o state12 = this.f598c;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (enumC0582o == null || enumC0582o.compareTo(state1) >= 0) ? state1 : enumC0582o;
    }

    public final void d(String str) {
        C0632a c0632a;
        if (this.f596a) {
            if (C0632a.f709b != null) {
                c0632a = C0632a.f709b;
            } else {
                synchronized (C0632a.class) {
                    try {
                        if (C0632a.f709b == null) {
                            C0632a.f709b = new C0632a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0632a = C0632a.f709b;
            }
            ((C0632a) c0632a.f710a).getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return;
            }
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    public final void e(EnumC0581n event) {
        Intrinsics.checkNotNullParameter(event, "event");
        d("handleLifecycleEvent");
        f(event.a());
    }

    public final void f(EnumC0582o next) {
        if (this.f598c == next) {
            return;
        }
        InterfaceC0587u interfaceC0587u = (InterfaceC0587u) this.f599d.get();
        EnumC0582o current = this.f598c;
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(next, "next");
        if (current == EnumC0582o.f587b && next == EnumC0582o.f586a) {
            throw new IllegalStateException(("State must be at least '" + EnumC0582o.f588c + "' to be moved to '" + next + "' in component " + interfaceC0587u).toString());
        }
        EnumC0582o enumC0582o = EnumC0582o.f586a;
        if (current == enumC0582o && current != next) {
            throw new IllegalStateException(("State is '" + enumC0582o + "' and cannot be moved to `" + next + "` in component " + interfaceC0587u).toString());
        }
        this.f598c = next;
        if (this.f601f || this.f600e != 0) {
            this.f602g = true;
            return;
        }
        this.f601f = true;
        g();
        this.f601f = false;
        if (this.f598c == enumC0582o) {
            this.f597b = new C0634a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r12.f602g = false;
        r12.f604i.setValue(r12.f598c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.g():void");
    }
}
