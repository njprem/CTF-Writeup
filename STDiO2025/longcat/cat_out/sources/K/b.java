package K;

import a.AbstractC0130a;
import android.os.Bundle;
import androidx.lifecycle.C0578k;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.I;
import androidx.lifecycle.InterfaceC0576i;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import b.AbstractActivityC0612o;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import stdio.cat.MainActivity;

/* loaded from: classes.dex */
public final class b implements InterfaceC0585s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f234a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f235b;

    public b(InterfaceC0576i[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f235b = generatedAdapters;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [K.h, androidx.lifecycle.u, java.lang.Object] */
    @Override // androidx.lifecycle.InterfaceC0585s
    public final void onStateChanged(InterfaceC0587u source, EnumC0581n event) throws IllegalAccessException, NoSuchMethodException, InstantiationException, SecurityException, IllegalArgumentException, InvocationTargetException {
        Pair[] pairArr;
        switch (this.f234a) {
            case 0:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0581n.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                source.getLifecycle().b(this);
                ?? owner = this.f235b;
                Bundle source2 = owner.getSavedStateRegistry().a("androidx.savedstate.Restarter");
                if (source2 == null) {
                    return;
                }
                Intrinsics.checkNotNullParameter(source2, "source");
                Intrinsics.checkNotNullParameter("classes_to_restore", "key");
                ArrayList<String> stringArrayList = source2.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                int size = stringArrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    String str = stringArrayList.get(i2);
                    i2++;
                    String str2 = str;
                    try {
                        Class<? extends U> clsAsSubclass = Class.forName(str2, false, b.class.getClassLoader()).asSubclass(c.class);
                        Intrinsics.checkNotNull(clsAsSubclass);
                        try {
                            Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object objNewInstance = declaredConstructor.newInstance(null);
                                Intrinsics.checkNotNull(objNewInstance);
                                ((C0578k) ((c) objNewInstance)).getClass();
                                Intrinsics.checkNotNullParameter(owner, "owner");
                                if (!(owner instanceof U)) {
                                    throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + ((Object) owner)).toString());
                                }
                                T viewModelStore = ((U) owner).getViewModelStore();
                                e savedStateRegistry = owner.getSavedStateRegistry();
                                viewModelStore.getClass();
                                LinkedHashMap linkedHashMap = viewModelStore.f573a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String key = (String) it.next();
                                    Intrinsics.checkNotNullParameter(key, "key");
                                    O o2 = (O) linkedHashMap.get(key);
                                    if (o2 != null) {
                                        I.a(o2, savedStateRegistry, owner.getLifecycle());
                                    }
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    savedStateRegistry.c();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException("Failed to instantiate " + str2, e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException("Class " + str2 + " wasn't found", e4);
                    }
                }
                return;
            case 1:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                new HashMap();
                InterfaceC0576i[] interfaceC0576iArr = (InterfaceC0576i[]) this.f235b;
                if (interfaceC0576iArr.length > 0) {
                    InterfaceC0576i interfaceC0576i = interfaceC0576iArr[0];
                    throw null;
                }
                if (interfaceC0576iArr.length <= 0) {
                    return;
                }
                InterfaceC0576i interfaceC0576i2 = interfaceC0576iArr[0];
                throw null;
            case 2:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event != EnumC0581n.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + event).toString());
                }
                source.getLifecycle().b(this);
                J j2 = (J) this.f235b;
                if (j2.f557b) {
                    return;
                }
                Bundle from = j2.f556a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Map mapEmptyMap = MapsKt.emptyMap();
                if (mapEmptyMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(mapEmptyMap.size());
                    for (Map.Entry entry : mapEmptyMap.entrySet()) {
                        arrayList.add(TuplesKt.to((String) entry.getKey(), entry.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                Bundle source3 = AbstractC0130a.c((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
                Intrinsics.checkNotNullParameter(source3, "source");
                Bundle from2 = j2.f558c;
                if (from2 != null) {
                    Intrinsics.checkNotNullParameter(from2, "from");
                    source3.putAll(from2);
                }
                if (from != null) {
                    Intrinsics.checkNotNullParameter(from, "from");
                    source3.putAll(from);
                }
                j2.f558c = source3;
                j2.f557b = true;
                return;
            default:
                Intrinsics.checkNotNullParameter(source, "source");
                Intrinsics.checkNotNullParameter(event, "event");
                MainActivity mainActivity = (MainActivity) this.f235b;
                AbstractActivityC0612o.access$ensureViewModelStore(mainActivity);
                mainActivity.getLifecycle().b(this);
                return;
        }
    }

    public b(h owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f235b = owner;
    }

    public b(J provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f235b = provider;
    }

    public b(MainActivity mainActivity) {
        this.f235b = mainActivity;
    }
}
