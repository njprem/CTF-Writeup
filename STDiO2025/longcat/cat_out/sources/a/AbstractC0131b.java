package a;

import B.B;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.AbstractC0545c;
import androidx.core.view.AbstractC0567z;
import androidx.core.view.C0566y;
import androidx.lifecycle.InterfaceC0587u;
import b.AbstractDialogC0613p;
import b.C0593F;
import b.C0594G;
import b.C0597J;
import b.InterfaceC0595H;
import c.C0626c;
import c.d;
import c.h;
import c.l;
import c.m;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import kotlin.UShort;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.scheduling.WorkQueueKt;
import o.C0787c;
import o.f;
import o.g;
import stdio.cat.R;

/* renamed from: a.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0131b {

    /* renamed from: a, reason: collision with root package name */
    public static long f292a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static Method f293b = null;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f294c = false;

    /* renamed from: d, reason: collision with root package name */
    public static Method f295d;

    public static final void a(boolean z, Function2 function2, Composer composer, int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-642000585);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-642000585, i3, -1, "androidx.activity.compose.PredictiveBackHandler (PredictiveBackHandler.kt:76)");
            }
            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function2, composerStartRestartGroup, (i3 >> 3) & 14);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = androidx.compose.runtime.changelist.a.f(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            Object obj = objRememberedValue2;
            if (objRememberedValue2 == companion.getEmpty()) {
                Function2 function22 = (Function2) stateRememberUpdatedState.getValue();
                l lVar = new l(z);
                lVar.f689d = coroutineScope;
                lVar.f690e = function22;
                composerStartRestartGroup.updateRememberedValue(lVar);
                obj = lVar;
            }
            l lVar2 = (l) obj;
            boolean zChanged = composerStartRestartGroup.changed((Function2) stateRememberUpdatedState.getValue()) | composerStartRestartGroup.changed(coroutineScope);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                lVar2.f690e = (Function2) stateRememberUpdatedState.getValue();
                lVar2.f689d = coroutineScope;
                composerStartRestartGroup.updateRememberedValue(Unit.INSTANCE);
            }
            Boolean boolValueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean zChangedInstance = (i4 == 4) | composerStartRestartGroup.changedInstance(lVar2);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new m(lVar2, z, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i4);
            InterfaceC0595H interfaceC0595HA = h.a(composerStartRestartGroup);
            if (interfaceC0595HA == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            C0593F onBackPressedDispatcher = interfaceC0595HA.getOnBackPressedDispatcher();
            InterfaceC0587u interfaceC0587u = (InterfaceC0587u) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(onBackPressedDispatcher) | composerStartRestartGroup.changedInstance(interfaceC0587u) | composerStartRestartGroup.changedInstance(lVar2);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new C0626c(onBackPressedDispatcher, interfaceC0587u, lVar2, 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            EffectsKt.DisposableEffect(interfaceC0587u, onBackPressedDispatcher, (Function1) objRememberedValue5, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(z, function2, i2, 1));
        }
    }

    public static void b(C0593F c0593f, AbstractDialogC0613p abstractDialogC0613p, Function1 onBackPressed) {
        Intrinsics.checkNotNullParameter(c0593f, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        c0593f.a(abstractDialogC0613p, new C0594G(onBackPressed));
    }

    public static void d(String str) {
        if (str.length() > 127) {
            str = str.substring(0, WorkQueueKt.MASK);
        }
        Trace.beginSection(str);
    }

    public static void h(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void i(Closeable closeable) throws IOException {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean j(File file, Resources resources, int i2) throws Throwable {
        InputStream inputStreamOpenRawResource;
        try {
            inputStreamOpenRawResource = resources.openRawResource(i2);
            try {
                boolean zK = k(file, inputStreamOpenRawResource);
                i(inputStreamOpenRawResource);
                return zK;
            } catch (Throwable th) {
                th = th;
                i(inputStreamOpenRawResource);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamOpenRawResource = null;
        }
    }

    public static boolean k(File file, InputStream inputStream) throws Throwable {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    i(fileOutputStream);
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            i(fileOutputStream2);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskWrites);
            throw th;
        }
    }

    public static Handler l(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return AbstractC0545c.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e4) {
            e = e4;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static boolean m(View view, KeyEvent keyEvent) {
        ArrayList arrayList;
        int size;
        int iIndexOfKey;
        int i2 = AbstractC0567z.f532a;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = C0566y.f528d;
        C0566y c0566y = (C0566y) view.getTag(R.id.tag_unhandled_key_event_manager);
        WeakReference weakReference = null;
        if (c0566y == null) {
            c0566y = new C0566y();
            c0566y.f529a = null;
            c0566y.f530b = null;
            c0566y.f531c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c0566y);
        }
        WeakReference weakReference2 = c0566y.f531c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        c0566y.f531c = new WeakReference(keyEvent);
        if (c0566y.f530b == null) {
            c0566y.f530b = new SparseArray();
        }
        SparseArray sparseArray = c0566y.f530b;
        if (keyEvent.getAction() == 1 && (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(iIndexOfKey);
            sparseArray.removeAt(iIndexOfKey);
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        arrayList.get(size).getClass();
        throw new ClassCastException();
    }

    public static final ViewParent n(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final Bundle o(String key, Bundle bundle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Bundle bundle2 = bundle.getBundle(key);
        if (bundle2 != null) {
            return bundle2;
        }
        Intrinsics.checkNotNullParameter(key, "key");
        throw new IllegalArgumentException("No valid saved state was found for the key '" + key + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static File p(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int q(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 32) {
            return 5;
        }
        if (i2 == 64) {
            return 6;
        }
        if (i2 == 128) {
            return 7;
        }
        if (i2 == 256) {
            return 8;
        }
        if (i2 == 512) {
            return 9;
        }
        throw new IllegalArgumentException(androidx.compose.runtime.changelist.a.n("type needs to be >= FIRST and <= LAST, type=", i2));
    }

    public static boolean r() {
        if (Build.VERSION.SDK_INT >= 29) {
            return N.a.a();
        }
        try {
            if (f293b == null) {
                f292a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f293b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f293b.invoke(null, Long.valueOf(f292a))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    public static MappedByteBuffer s(Context context, Uri uri) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    public static C.b x(MappedByteBuffer mappedByteBuffer) throws IOException {
        long j2;
        ByteBuffer byteBufferDuplicate = mappedByteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.BIG_ENDIAN);
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
        int i2 = byteBufferDuplicate.getShort() & UShort.MAX_VALUE;
        if (i2 > 100) {
            throw new IOException("Cannot read metadata.");
        }
        byteBufferDuplicate.position(byteBufferDuplicate.position() + 6);
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                j2 = -1;
                break;
            }
            int i4 = byteBufferDuplicate.getInt();
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            j2 = byteBufferDuplicate.getInt() & 4294967295L;
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 4);
            if (1835365473 == i4) {
                break;
            }
            i3++;
        }
        if (j2 != -1) {
            byteBufferDuplicate.position(byteBufferDuplicate.position() + ((int) (j2 - byteBufferDuplicate.position())));
            byteBufferDuplicate.position(byteBufferDuplicate.position() + 12);
            long j3 = byteBufferDuplicate.getInt() & 4294967295L;
            for (int i5 = 0; i5 < j3; i5++) {
                int i6 = byteBufferDuplicate.getInt();
                long j4 = byteBufferDuplicate.getInt() & 4294967295L;
                byteBufferDuplicate.getInt();
                if (1164798569 == i6 || 1701669481 == i6) {
                    byteBufferDuplicate.position((int) (j4 + j2));
                    C.b bVar = new C.b();
                    byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int iPosition = byteBufferDuplicate.position() + byteBufferDuplicate.getInt(byteBufferDuplicate.position());
                    bVar.f145b = byteBufferDuplicate;
                    bVar.f144a = iPosition;
                    int i7 = iPosition - byteBufferDuplicate.getInt(iPosition);
                    bVar.f146c = i7;
                    bVar.f147d = bVar.f145b.getShort(i7);
                    return bVar;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public void c(Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
    }

    public abstract boolean e(g gVar, C0787c c0787c);

    public abstract boolean f(g gVar, Object obj, Object obj2);

    public abstract boolean g(g gVar, f fVar, f fVar2);

    public abstract void t(Throwable th);

    public abstract void u(B b2);

    public abstract void v(f fVar, f fVar2);

    public abstract void w(f fVar, Thread thread);

    public abstract void y(C0597J c0597j, C0597J c0597j2, Window window, View view, boolean z, boolean z2);
}
