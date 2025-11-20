package K;

import a.AbstractC0131b;
import android.os.Bundle;
import androidx.lifecycle.C0578k;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final L.b f236a;

    /* renamed from: b, reason: collision with root package name */
    public a f237b;

    public e(L.b impl) {
        Intrinsics.checkNotNullParameter(impl, "impl");
        this.f236a = impl;
    }

    public final Bundle a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        L.b bVar = this.f236a;
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bVar.f250g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle source = bVar.f249f;
        if (source == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundleO = source.containsKey(key) ? AbstractC0131b.o(key, source) : null;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        source.remove(key);
        Intrinsics.checkNotNullParameter(source, "source");
        if (source.isEmpty()) {
            bVar.f249f = null;
        }
        return bundleO;
    }

    public final void b(String key, d provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        L.b bVar = this.f236a;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        synchronized (bVar.f246c) {
            if (bVar.f247d.containsKey(key)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            bVar.f247d.put(key, provider);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void c() throws NoSuchMethodException, SecurityException {
        Intrinsics.checkNotNullParameter(C0578k.class, "clazz");
        if (!this.f236a.f251h) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        a aVar = this.f237b;
        if (aVar == null) {
            aVar = new a(this);
        }
        this.f237b = aVar;
        try {
            C0578k.class.getDeclaredConstructor(null);
            a aVar2 = this.f237b;
            if (aVar2 != null) {
                String className = C0578k.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "getName(...)");
                Intrinsics.checkNotNullParameter(className, "className");
                aVar2.f233a.add(className);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + C0578k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }
}
