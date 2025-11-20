package androidx.emoji2.text;

import B.l;
import B.m;
import B.p;
import B.z;
import M.a;
import M.b;
import android.content.Context;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.InterfaceC0587u;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // M.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // M.b
    public final Object b(Context context) {
        Object objB;
        p pVar = new p();
        pVar.f115a = context.getApplicationContext();
        z zVar = new z(pVar);
        zVar.f142b = 1;
        if (l.f99k == null) {
            synchronized (l.f98j) {
                try {
                    if (l.f99k == null) {
                        l.f99k = new l(zVar);
                    }
                } finally {
                }
            }
        }
        a aVarC = a.c(context);
        aVarC.getClass();
        synchronized (a.f253e) {
            try {
                objB = aVarC.f254a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        AbstractC0583p lifecycle = ((InterfaceC0587u) objB).getLifecycle();
        lifecycle.a(new m(this, lifecycle));
        return Boolean.TRUE;
    }
}
