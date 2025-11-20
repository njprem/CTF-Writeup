package a;

import B.C0127d;
import B.C0128e;
import B.y;
import B.z;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Log;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.AbstractC0546d;
import androidx.lifecycle.InterfaceC0587u;
import b.C0593F;
import b.InterfaceC0595H;
import c.C0624a;
import c.C0626c;
import c.d;
import c.e;
import c.h;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import r.f;
import stdio.cat.R;
import v.k;

/* renamed from: a.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0130a {
    public AbstractC0130a() {
        new ConcurrentHashMap();
    }

    public static final void a(boolean z, Function0 function0, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361453782);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361453782, i3, -1, "androidx.activity.compose.BackHandler (BackHandler.kt:81)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function0, composerStartRestartGroup, (i3 >> 3) & 14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new e(z, stateRememberUpdatedState);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            e eVar = (e) objRememberedValue;
            boolean z2 = (i3 & 14) == 4;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new C0624a(eVar, z);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            EffectsKt.SideEffect((Function0) objRememberedValue2, composerStartRestartGroup, 0);
            InterfaceC0595H interfaceC0595HA = h.a(composerStartRestartGroup);
            if (interfaceC0595HA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0593F onBackPressedDispatcher = interfaceC0595HA.getOnBackPressedDispatcher();
            InterfaceC0587u interfaceC0587u = (InterfaceC0587u) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(onBackPressedDispatcher) | composerStartRestartGroup.changedInstance(interfaceC0587u);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new C0626c(onBackPressedDispatcher, interfaceC0587u, eVar, 0);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            EffectsKt.DisposableEffect(interfaceC0587u, onBackPressedDispatcher, (Function1) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z, function0, i2, 0));
        }
    }

    public static final StackTraceElement b(Exception exc, String str) {
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        return new StackTraceElement("_COROUTINE.".concat(str), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static final Bundle c(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.component1();
            Object objComponent2 = pair.component2();
            if (objComponent2 == null) {
                bundle.putString(str, null);
            } else if (objComponent2 instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof Byte) {
                bundle.putByte(str, ((Number) objComponent2).byteValue());
            } else if (objComponent2 instanceof Character) {
                bundle.putChar(str, ((Character) objComponent2).charValue());
            } else if (objComponent2 instanceof Double) {
                bundle.putDouble(str, ((Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof Float) {
                bundle.putFloat(str, ((Number) objComponent2).floatValue());
            } else if (objComponent2 instanceof Integer) {
                bundle.putInt(str, ((Number) objComponent2).intValue());
            } else if (objComponent2 instanceof Long) {
                bundle.putLong(str, ((Number) objComponent2).longValue());
            } else if (objComponent2 instanceof Short) {
                bundle.putShort(str, ((Number) objComponent2).shortValue());
            } else if (objComponent2 instanceof Bundle) {
                bundle.putBundle(str, (Bundle) objComponent2);
            } else if (objComponent2 instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) objComponent2);
            } else if (objComponent2 instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) objComponent2);
            } else if (objComponent2 instanceof char[]) {
                bundle.putCharArray(str, (char[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) objComponent2);
            } else if (objComponent2 instanceof float[]) {
                bundle.putFloatArray(str, (float[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                bundle.putIntArray(str, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                bundle.putLongArray(str, (long[]) objComponent2);
            } else if (objComponent2 instanceof short[]) {
                bundle.putShortArray(str, (short[]) objComponent2);
            } else if (objComponent2 instanceof Object[]) {
                Class<?> componentType = objComponent2.getClass().getComponentType();
                Intrinsics.checkNotNull(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<android.os.Parcelable>");
                    bundle.putParcelableArray(str, (Parcelable[]) objComponent2);
                } else if (String.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    bundle.putStringArray(str, (String[]) objComponent2);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    Intrinsics.checkNotNull(objComponent2, "null cannot be cast to non-null type kotlin.Array<kotlin.CharSequence>");
                    bundle.putCharSequenceArray(str, (CharSequence[]) objComponent2);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + Typography.quote);
                    }
                    bundle.putSerializable(str, (Serializable) objComponent2);
                }
            } else if (objComponent2 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) objComponent2);
            } else if (objComponent2 instanceof IBinder) {
                bundle.putBinder(str, (IBinder) objComponent2);
            } else if (objComponent2 instanceof Size) {
                bundle.putSize(str, (Size) objComponent2);
            } else {
                if (!(objComponent2 instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + str + Typography.quote);
                }
                bundle.putSizeF(str, (SizeF) objComponent2);
            }
        }
        return bundle;
    }

    public static z d(Context context) {
        ProviderInfo providerInfo;
        v.e eVar;
        ApplicationInfo applicationInfo;
        C0127d c0128e = Build.VERSION.SDK_INT >= 28 ? new C0128e(0) : new C0127d(0);
        PackageManager packageManager = context.getPackageManager();
        AbstractC0131b.h(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            eVar = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrA = c0128e.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrA) {
                    arrayList.add(signature.toByteArray());
                }
                eVar = new v.e(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
        }
        if (eVar == null) {
            return null;
        }
        return new z(new y(context, eVar));
    }

    public static final K.h k(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            K.h hVar = tag instanceof K.h ? (K.h) tag : null;
            if (hVar != null) {
                return hVar;
            }
            Object objN = AbstractC0131b.n(view);
            view = objN instanceof View ? (View) objN : null;
        }
        return null;
    }

    public static Set l() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    public static final void m(View view, K.h hVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, hVar);
    }

    public static void p(Window window, boolean z) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 35) {
            AbstractC0546d.d(window, z);
        } else {
            if (i2 >= 30) {
                AbstractC0546d.c(window, z);
                return;
            }
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    public abstract Typeface e(Context context, f fVar, Resources resources);

    public abstract Typeface f(Context context, k[] kVarArr);

    public Typeface g(Context context, List list) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    public Typeface h(Context context, InputStream inputStream) {
        File fileP = AbstractC0131b.p(context);
        if (fileP == null) {
            return null;
        }
        try {
            if (AbstractC0131b.k(fileP, inputStream)) {
                return Typeface.createFromFile(fileP.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileP.delete();
        }
    }

    public Typeface i(Context context, Resources resources, int i2, String str) {
        File fileP = AbstractC0131b.p(context);
        if (fileP == null) {
            return null;
        }
        try {
            if (AbstractC0131b.j(fileP, resources, i2)) {
                return Typeface.createFromFile(fileP.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileP.delete();
        }
    }

    public k j(k[] kVarArr) {
        k kVar = null;
        int i2 = Integer.MAX_VALUE;
        for (k kVar2 : kVarArr) {
            int iAbs = (kVar2.f1030d ? 1 : 0) + (Math.abs(kVar2.f1029c - 400) * 2);
            if (kVar == null || i2 > iAbs) {
                kVar = kVar2;
                i2 = iAbs;
            }
        }
        return kVar;
    }

    public abstract void o(boolean z);

    public void n(boolean z) {
    }
}
