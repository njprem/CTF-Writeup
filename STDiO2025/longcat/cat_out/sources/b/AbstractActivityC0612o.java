package b;

import B.C0127d;
import a.AbstractC0130a;
import a.AbstractC0131b;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.core.view.C0549g;
import androidx.core.view.C0550h;
import androidx.core.view.C0551i;
import androidx.core.view.InterfaceC0552j;
import androidx.lifecycle.AbstractC0583p;
import androidx.lifecycle.EnumC0581n;
import androidx.lifecycle.EnumC0582o;
import androidx.lifecycle.InterfaceC0577j;
import androidx.lifecycle.InterfaceC0585s;
import androidx.lifecycle.InterfaceC0587u;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.Q;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import d.C0627a;
import d.InterfaceC0628b;
import f.AbstractC0630a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.SequencesKt;
import stdio.cat.MainActivity;
import stdio.cat.R;

/* renamed from: b.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0612o extends q.b implements U, InterfaceC0577j, K.h, InterfaceC0595H {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final C0605h Companion = new C0605h();
    private T _viewModelStore;
    private final e.h activityResultRegistry;
    private int contentLayoutId;
    private final C0627a contextAwareHelper = new C0627a();
    private final Lazy defaultViewModelProviderFactory$delegate;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;
    private final Lazy fullyDrawnReporter$delegate;
    private final C0551i menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;
    private final Lazy onBackPressedDispatcher$delegate;
    private final CopyOnWriteArrayList<w.a> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<w.a> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<w.a> onNewIntentListeners;
    private final CopyOnWriteArrayList<w.a> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<w.a> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final InterfaceExecutorC0607j reportFullyDrawnExecutor;
    private final K.g savedStateRegistryController;

    public AbstractActivityC0612o() {
        K.d dVar;
        final MainActivity mainActivity = (MainActivity) this;
        this.menuHostHelper = new C0551i(new RunnableC0601d(mainActivity, 0));
        Intrinsics.checkNotNullParameter(this, "owner");
        L.b bVar = new L.b(this, new K.f(this, 0));
        this.savedStateRegistryController = new K.g(bVar);
        this.reportFullyDrawnExecutor = new ViewTreeObserverOnDrawListenerC0608k(mainActivity);
        this.fullyDrawnReporter$delegate = LazyKt.lazy(new C0610m(mainActivity, 2));
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new C0609l();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        final int i2 = 0;
        getLifecycle().a(new InterfaceC0585s() { // from class: b.e
            @Override // androidx.lifecycle.InterfaceC0585s
            public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n event) {
                Window window;
                View viewPeekDecorView;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(interfaceC0587u, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0581n.ON_STOP && (window = mainActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0612o.b(mainActivity, interfaceC0587u, event);
                        break;
                }
            }
        });
        final int i3 = 1;
        getLifecycle().a(new InterfaceC0585s() { // from class: b.e
            @Override // androidx.lifecycle.InterfaceC0585s
            public final void onStateChanged(InterfaceC0587u interfaceC0587u, EnumC0581n event) {
                Window window;
                View viewPeekDecorView;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(interfaceC0587u, "<anonymous parameter 0>");
                        Intrinsics.checkNotNullParameter(event, "event");
                        if (event == EnumC0581n.ON_STOP && (window = mainActivity.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                            viewPeekDecorView.cancelPendingInputEvents();
                            break;
                        }
                        break;
                    default:
                        AbstractActivityC0612o.b(mainActivity, interfaceC0587u, event);
                        break;
                }
            }
        });
        getLifecycle().a(new K.b(mainActivity));
        bVar.a();
        Intrinsics.checkNotNullParameter(this, "<this>");
        EnumC0582o enumC0582o = ((androidx.lifecycle.w) getLifecycle()).f598c;
        if (enumC0582o != EnumC0582o.f587b && enumC0582o != EnumC0582o.f588c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        K.e savedStateRegistry = getSavedStateRegistry();
        savedStateRegistry.getClass();
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        L.b bVar2 = savedStateRegistry.f236a;
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        synchronized (bVar2.f246c) {
            Iterator it = bVar2.f247d.entrySet().iterator();
            do {
                dVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                K.d dVar2 = (K.d) entry.getValue();
                if (Intrinsics.areEqual(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                    dVar = dVar2;
                }
            } while (dVar == null);
        }
        if (dVar == null) {
            androidx.lifecycle.J j2 = new androidx.lifecycle.J(getSavedStateRegistry(), this);
            getSavedStateRegistry().b("androidx.lifecycle.internal.SavedStateHandlesProvider", j2);
            getLifecycle().a(new K.b(j2));
        }
        getSavedStateRegistry().b(ACTIVITY_RESULT_TAG, new G.a(mainActivity, 1));
        addOnContextAvailableListener(new C0603f(mainActivity));
        this.defaultViewModelProviderFactory$delegate = LazyKt.lazy(new C0610m(mainActivity, 0));
        this.onBackPressedDispatcher$delegate = LazyKt.lazy(new C0610m(mainActivity, 3));
    }

    public static void a(MainActivity mainActivity, AbstractActivityC0612o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Bundle bundleA = mainActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            e.h hVar = ((AbstractActivityC0612o) mainActivity).activityResultRegistry;
            hVar.getClass();
            ArrayList<Integer> integerArrayList = bundleA.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList == null || integerArrayList == null) {
                return;
            }
            ArrayList<String> stringArrayList2 = bundleA.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (stringArrayList2 != null) {
                hVar.f705d.addAll(stringArrayList2);
            }
            Bundle bundle = bundleA.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            Bundle bundle2 = hVar.f708g;
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            int size = stringArrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                String str = stringArrayList.get(i2);
                LinkedHashMap linkedHashMap = hVar.f703b;
                boolean zContainsKey = linkedHashMap.containsKey(str);
                LinkedHashMap linkedHashMap2 = hVar.f702a;
                if (zContainsKey) {
                    Integer num = (Integer) linkedHashMap.remove(str);
                    if (!bundle2.containsKey(str)) {
                        TypeIntrinsics.asMutableMap(linkedHashMap2).remove(num);
                    }
                }
                Integer num2 = integerArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(num2, "rcs[i]");
                int iIntValue = num2.intValue();
                String str2 = stringArrayList.get(i2);
                Intrinsics.checkNotNullExpressionValue(str2, "keys[i]");
                String str3 = str2;
                linkedHashMap2.put(Integer.valueOf(iIntValue), str3);
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
        }
    }

    public static final void access$ensureViewModelStore(AbstractActivityC0612o abstractActivityC0612o) {
        if (abstractActivityC0612o._viewModelStore == null) {
            C0606i c0606i = (C0606i) abstractActivityC0612o.getLastNonConfigurationInstance();
            if (c0606i != null) {
                abstractActivityC0612o._viewModelStore = c0606i.f642b;
            }
            if (abstractActivityC0612o._viewModelStore == null) {
                abstractActivityC0612o._viewModelStore = new T();
            }
        }
    }

    public static void b(MainActivity mainActivity, InterfaceC0587u interfaceC0587u, EnumC0581n event) {
        Intrinsics.checkNotNullParameter(interfaceC0587u, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == EnumC0581n.ON_DESTROY) {
            ((AbstractActivityC0612o) mainActivity).contextAwareHelper.f696b = null;
            if (!mainActivity.isChangingConfigurations()) {
                LinkedHashMap linkedHashMap = mainActivity.getViewModelStore().f573a;
                Iterator it = linkedHashMap.values().iterator();
                while (it.hasNext()) {
                    ((O) it.next()).a();
                }
                linkedHashMap.clear();
            }
            ViewTreeObserverOnDrawListenerC0608k viewTreeObserverOnDrawListenerC0608k = (ViewTreeObserverOnDrawListenerC0608k) ((AbstractActivityC0612o) mainActivity).reportFullyDrawnExecutor;
            MainActivity mainActivity2 = viewTreeObserverOnDrawListenerC0608k.f646d;
            mainActivity2.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0608k);
            mainActivity2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0608k);
        }
    }

    public static Bundle c(MainActivity mainActivity) {
        Bundle outState = new Bundle();
        e.h hVar = ((AbstractActivityC0612o) mainActivity).activityResultRegistry;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(outState, "outState");
        LinkedHashMap linkedHashMap = hVar.f703b;
        outState.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
        outState.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(hVar.f705d));
        outState.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(hVar.f708g));
        return outState;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0607j interfaceExecutorC0607j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0608k) interfaceExecutorC0607j).a(decorView);
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0552j provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        C0551i c0551i = this.menuHostHelper;
        c0551i.f510b.add(null);
        c0551i.f509a.run();
    }

    public final void addOnConfigurationChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(InterfaceC0628b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0627a c0627a = this.contextAwareHelper;
        c0627a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        AbstractActivityC0612o abstractActivityC0612o = c0627a.f696b;
        if (abstractActivityC0612o != null) {
            a(((C0603f) listener).f640a, abstractActivityC0612o);
        }
        c0627a.f695a.add(listener);
    }

    public final void addOnMultiWindowModeChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    public final void addOnPictureInPictureModeChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnTrimMemoryListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final e.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.InterfaceC0577j
    public H.b getDefaultViewModelCreationExtras() {
        H.c cVar = new H.c(H.a.f183b);
        if (getApplication() != null) {
            C0127d c0127d = P.f570d;
            Application application = getApplication();
            Intrinsics.checkNotNullExpressionValue(application, "application");
            cVar.a(c0127d, application);
        }
        cVar.a(androidx.lifecycle.I.f552a, this);
        cVar.a(androidx.lifecycle.I.f553b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            cVar.a(androidx.lifecycle.I.f554c, extras);
        }
        return cVar;
    }

    public Q getDefaultViewModelProviderFactory() {
        return (Q) this.defaultViewModelProviderFactory$delegate.getValue();
    }

    public C0620w getFullyDrawnReporter() {
        return (C0620w) this.fullyDrawnReporter$delegate.getValue();
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object getLastCustomNonConfigurationInstance() {
        C0606i c0606i = (C0606i) getLastNonConfigurationInstance();
        if (c0606i != null) {
            return c0606i.f641a;
        }
        return null;
    }

    @Override // q.b, androidx.lifecycle.InterfaceC0587u
    public AbstractC0583p getLifecycle() {
        return super.getLifecycle();
    }

    @Override // b.InterfaceC0595H
    public final C0593F getOnBackPressedDispatcher() {
        return (C0593F) this.onBackPressedDispatcher$delegate.getValue();
    }

    @Override // K.h
    public final K.e getSavedStateRegistry() {
        return this.savedStateRegistryController.f241b;
    }

    @Override // androidx.lifecycle.U
    public T getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this._viewModelStore == null) {
            C0606i c0606i = (C0606i) getLastNonConfigurationInstance();
            if (c0606i != null) {
                this._viewModelStore = c0606i.f642b;
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new T();
            }
        }
        T t = this._viewModelStore;
        Intrinsics.checkNotNull(t);
        return t;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        androidx.lifecycle.I.e(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "window.decorView");
        androidx.lifecycle.I.f(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "window.decorView");
        AbstractC0130a.m(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView4, "<this>");
        Intrinsics.checkNotNullParameter(this, "onBackPressedDispatcherOwner");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "window.decorView");
        Intrinsics.checkNotNullParameter(decorView5, "<this>");
        Intrinsics.checkNotNullParameter(this, "fullyDrawnReporterOwner");
        decorView5.setTag(R.id.report_drawn, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      with the appropriate {@link ActivityResultContract} and handling the result in the\n      {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onActivityResult(int i2, int i3, Intent intent) {
        if (this.activityResultRegistry.a(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the\n      {@link OnBackPressedDispatcher} via {@link #getOnBackPressedDispatcher()}.\n      The OnBackPressedDispatcher controls how back button events are dispatched\n      to one or more {@link OnBackPressedCallback} objects.")
    public void onBackPressed() {
        getOnBackPressedDispatcher().c();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<w.a> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(newConfig);
        }
    }

    @Override // q.b, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.savedStateRegistryController.a(bundle);
        C0627a c0627a = this.contextAwareHelper;
        c0627a.getClass();
        Intrinsics.checkNotNullParameter(this, "context");
        c0627a.f696b = this;
        Iterator it = c0627a.f695a.iterator();
        while (it.hasNext()) {
            a(((C0603f) ((InterfaceC0628b) it.next())).f640a, this);
        }
        super.onCreate(bundle);
        int i2 = androidx.lifecycle.E.f546b;
        androidx.lifecycle.C.b(this);
        int i3 = this.contentLayoutId;
        if (i3 != 0) {
            setContentView(i3);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i2, menu);
        C0551i c0551i = this.menuHostHelper;
        getMenuInflater();
        Iterator it = c0551i.f510b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(i2, item)) {
            return true;
        }
        if (i2 != 0) {
            return false;
        }
        Iterator it = this.menuHostHelper.f510b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onMultiWindowModeChanged(boolean z) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<w.a> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new C0127d(18));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<w.a> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().a(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.menuHostHelper.f510b.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Deprecated in android.app.Activity")
    public void onPictureInPictureModeChanged(boolean z) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<w.a> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().a(new C0127d(19));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (i2 != 0) {
            return true;
        }
        super.onPreparePanel(i2, view, menu);
        Iterator it = this.menuHostHelper.f510b.iterator();
        if (!it.hasNext()) {
            return true;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)} passing\n      in a {@link RequestMultiplePermissions} object for the {@link ActivityResultContract} and\n      handling the result in the {@link ActivityResultCallback#onActivityResult(Object) callback}.")
    public void onRequestPermissionsResult(int i2, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.a(i2, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(i2, permissions, grantResults);
    }

    @Deprecated(message = "Use a {@link androidx.lifecycle.ViewModel} to store non config state.")
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0606i c0606i;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        T t = this._viewModelStore;
        if (t == null && (c0606i = (C0606i) getLastNonConfigurationInstance()) != null) {
            t = c0606i.f642b;
        }
        if (t == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0606i c0606i2 = new C0606i();
        c0606i2.f641a = objOnRetainCustomNonConfigurationInstance;
        c0606i2.f642b = t;
        return c0606i2;
    }

    @Override // q.b, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof androidx.lifecycle.w) {
            AbstractC0583p lifecycle = getLifecycle();
            Intrinsics.checkNotNull(lifecycle, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            androidx.lifecycle.w wVar = (androidx.lifecycle.w) lifecycle;
            EnumC0582o enumC0582o = EnumC0582o.f586a;
            wVar.getClass();
            EnumC0582o state = EnumC0582o.f588c;
            Intrinsics.checkNotNullParameter(state, "state");
            wVar.d("setCurrentState");
            wVar.f(state);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.b(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        super.onTrimMemory(i2);
        Iterator<w.a> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().a(Integer.valueOf(i2));
        }
    }

    @Override // android.app.Activity
    public void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.f696b;
    }

    public final <I, O> e.c registerForActivityResult(AbstractC0630a contract, e.h registry, e.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String key = "activity_rq#" + this.nextLocalRequestCode.getAndIncrement();
        registry.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(this, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        AbstractC0583p lifecycle = getLifecycle();
        androidx.lifecycle.w wVar = (androidx.lifecycle.w) lifecycle;
        if (wVar.f598c.a(EnumC0582o.f589d)) {
            throw new IllegalStateException(("LifecycleOwner " + this + " is attempting to register while current state is " + wVar.f598c + ". LifecycleOwners must call register before they are STARTED.").toString());
        }
        LinkedHashMap linkedHashMap = registry.f703b;
        if (((Integer) linkedHashMap.get(key)) == null) {
            for (Number number : SequencesKt.generateSequence(e.f.f701a)) {
                int iIntValue = number.intValue();
                LinkedHashMap linkedHashMap2 = registry.f702a;
                if (!linkedHashMap2.containsKey(Integer.valueOf(iIntValue))) {
                    int iIntValue2 = number.intValue();
                    linkedHashMap2.put(Integer.valueOf(iIntValue2), key);
                    linkedHashMap.put(key, Integer.valueOf(iIntValue2));
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
        LinkedHashMap linkedHashMap3 = registry.f704c;
        e.e eVar = (e.e) linkedHashMap3.get(key);
        if (eVar == null) {
            eVar = new e.e(lifecycle);
        }
        C0549g observer = new C0549g(2, registry, key);
        Intrinsics.checkNotNullParameter(observer, "observer");
        eVar.f699a.a(observer);
        eVar.f700b.add(observer);
        linkedHashMap3.put(key, eVar);
        return new e.g();
    }

    public void removeMenuProvider(InterfaceC0552j provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.a();
    }

    public final void removeOnConfigurationChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(InterfaceC0628b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C0627a c0627a = this.contextAwareHelper;
        c0627a.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c0627a.f695a.remove(listener);
    }

    public final void removeOnMultiWindowModeChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    public final void removeOnPictureInPictureModeChangedListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnTrimMemoryListener(w.a listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (AbstractC0131b.r()) {
                AbstractC0131b.d("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0620w fullyDrawnReporter = getFullyDrawnReporter();
            synchronized (fullyDrawnReporter.f654a) {
                try {
                    fullyDrawnReporter.f655b = true;
                    ArrayList arrayList = fullyDrawnReporter.f656c;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        ((Function0) obj).invoke();
                    }
                    fullyDrawnReporter.f656c.clear();
                    Unit unit = Unit.INSTANCE;
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i2) {
        initializeViewTreeOwners();
        InterfaceExecutorC0607j interfaceExecutorC0607j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0608k) interfaceExecutorC0607j).a(decorView);
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i2) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartActivityForResult} object for the {@link ActivityResultContract}.")
    public void startActivityForResult(Intent intent, int i2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated(message = "This method has been deprecated in favor of using the Activity Result API\n      which brings increased type safety via an {@link ActivityResultContract} and the prebuilt\n      contracts for common intents available in\n      {@link androidx.activity.result.contract.ActivityResultContracts}, provides hooks for\n      testing, and allow receiving results in separate, testable classes independent from your\n      activity. Use\n      {@link #registerForActivityResult(ActivityResultContract, ActivityResultCallback)}\n      passing in a {@link StartIntentSenderForResult} object for the\n      {@link ActivityResultContract}.")
    public void startIntentSenderForResult(IntentSender intent, int i2, Intent intent2, int i3, int i4, int i5, Bundle bundle) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, i2, intent2, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        InterfaceExecutorC0607j interfaceExecutorC0607j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0608k) interfaceExecutorC0607j).a(decorView);
        super.setContentView(view);
    }

    public void addMenuProvider(InterfaceC0552j provider, InterfaceC0587u owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        C0551i c0551i = this.menuHostHelper;
        c0551i.f510b.add(null);
        c0551i.f509a.run();
        AbstractC0583p lifecycle = owner.getLifecycle();
        HashMap map = c0551i.f511c;
        C0550h c0550h = (C0550h) map.remove(provider);
        if (c0550h != null) {
            c0550h.f505a.b(c0550h.f506b);
            c0550h.f506b = null;
        }
        map.put(provider, new C0550h(lifecycle, new L.a(c0551i, 1)));
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<w.a> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                w.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.a(new C0127d(18));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<w.a> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                w.a next = it.next();
                Intrinsics.checkNotNullParameter(newConfig, "newConfig");
                next.a(new C0127d(19));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        InterfaceExecutorC0607j interfaceExecutorC0607j = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        ((ViewTreeObserverOnDrawListenerC0608k) interfaceExecutorC0607j).a(decorView);
        super.setContentView(view, layoutParams);
    }

    public void addMenuProvider(InterfaceC0552j provider, InterfaceC0587u owner, EnumC0582o state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        C0551i c0551i = this.menuHostHelper;
        c0551i.getClass();
        AbstractC0583p lifecycle = owner.getLifecycle();
        HashMap map = c0551i.f511c;
        C0550h c0550h = (C0550h) map.remove(provider);
        if (c0550h != null) {
            c0550h.f505a.b(c0550h.f506b);
            c0550h.f506b = null;
        }
        map.put(provider, new C0550h(lifecycle, new C0549g(0, c0551i, state)));
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    public final <I, O> e.c registerForActivityResult(AbstractC0630a contract, e.b callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }
}
