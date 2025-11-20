package androidx.compose.ui.platform;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.unit.Velocity;
import androidx.core.view.AbstractC0562u;
import androidx.core.view.AbstractC0567z;
import androidx.core.view.C0553k;
import androidx.core.view.InterfaceC0554l;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\"\u0010\u000f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0017\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/NestedScrollInteropConnection;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "Landroid/view/View;", "view", "<init>", "(Landroid/view/View;)V", "", "interruptOngoingScrolls", "()V", "Landroidx/compose/ui/geometry/Offset;", "available", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "onPreScroll-OzD1aCk", "(JI)J", "onPreScroll", "consumed", "onPostScroll-DzOQY0M", "(JJI)J", "onPostScroll", "Landroidx/compose/ui/unit/Velocity;", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreFling", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostFling", "Landroid/view/View;", "Landroidx/core/view/k;", "nestedScrollChildHelper", "Landroidx/core/view/k;", "", "consumedScrollCache", "[I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class NestedScrollInteropConnection implements NestedScrollConnection {
    public static final int $stable = 8;
    private final int[] consumedScrollCache;
    private final C0553k nestedScrollChildHelper;
    private final View view;

    public NestedScrollInteropConnection(View view) {
        this.view = view;
        C0553k c0553k = new C0553k(view);
        if (c0553k.f515d) {
            int i2 = AbstractC0567z.f532a;
            AbstractC0562u.d(view);
        }
        c0553k.f515d = true;
        this.nestedScrollChildHelper = c0553k;
        this.consumedScrollCache = new int[2];
        int i3 = AbstractC0567z.f532a;
        AbstractC0562u.b(view, true);
    }

    private final void interruptOngoingScrolls() {
        if (this.nestedScrollChildHelper.a(0) != null) {
            this.nestedScrollChildHelper.c(0);
        }
        if (this.nestedScrollChildHelper.a(1) != null) {
            this.nestedScrollChildHelper.c(1);
        }
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostFling-RZ2iAVY */
    public Object mo443onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
        ViewParent viewParentA;
        C0553k c0553k = this.nestedScrollChildHelper;
        float viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6470getXimpl(j3));
        float viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6471getYimpl(j3));
        boolean zOnNestedFling = false;
        if (c0553k.f515d && (viewParentA = c0553k.a(0)) != null) {
            try {
                zOnNestedFling = viewParentA.onNestedFling(c0553k.f514c, viewVelocity, viewVelocity2, true);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentA + " does not implement interface method onNestedFling", e2);
            }
        }
        if (!zOnNestedFling) {
            j3 = Velocity.INSTANCE.m6481getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m6461boximpl(j3);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPostScroll-DzOQY0M */
    public long mo444onPostScrollDzOQY0M(long consumed, long available, int source) {
        ViewParent viewParentA;
        if (!this.nestedScrollChildHelper.b(NestedScrollInteropConnectionKt.m5500getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m5502toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m3567getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        C0553k c0553k = this.nestedScrollChildHelper;
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3551getXimpl(consumed));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3552getYimpl(consumed));
        int iComposeToViewOffset3 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3551getXimpl(available));
        int iComposeToViewOffset4 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3552getYimpl(available));
        int iM5502toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m5502toViewTypeGyEprt8(source);
        int[] iArr = this.consumedScrollCache;
        if (c0553k.f515d && (viewParentA = c0553k.a(iM5502toViewTypeGyEprt8)) != null && (iComposeToViewOffset != 0 || iComposeToViewOffset2 != 0 || iComposeToViewOffset3 != 0 || iComposeToViewOffset4 != 0)) {
            if (iArr == null) {
                if (c0553k.f516e == null) {
                    c0553k.f516e = new int[2];
                }
                iArr = c0553k.f516e;
                iArr[0] = 0;
                iArr[1] = 0;
            }
            int[] iArr2 = iArr;
            boolean z = viewParentA instanceof InterfaceC0554l;
            View view = c0553k.f514c;
            if (z) {
                ((InterfaceC0554l) viewParentA).onNestedScroll(view, iComposeToViewOffset, iComposeToViewOffset2, iComposeToViewOffset3, iComposeToViewOffset4, iM5502toViewTypeGyEprt8, iArr2);
            } else {
                iArr2[0] = iArr2[0] + iComposeToViewOffset3;
                iArr2[1] = iArr2[1] + iComposeToViewOffset4;
                if (z) {
                    ((InterfaceC0554l) viewParentA).onNestedScroll(view, iComposeToViewOffset, iComposeToViewOffset2, iComposeToViewOffset3, iComposeToViewOffset4, iM5502toViewTypeGyEprt8);
                } else if (iM5502toViewTypeGyEprt8 == 0) {
                    try {
                        viewParentA.onNestedScroll(view, iComposeToViewOffset, iComposeToViewOffset2, iComposeToViewOffset3, iComposeToViewOffset4);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + viewParentA + " does not implement interface method onNestedScroll", e2);
                    }
                }
            }
        }
        return NestedScrollInteropConnectionKt.m5501toOffsetUv8p0NA(this.consumedScrollCache, available);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreFling-QWom1Mo */
    public Object mo717onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
        ViewParent viewParentA;
        C0553k c0553k = this.nestedScrollChildHelper;
        float viewVelocity = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6470getXimpl(j2));
        float viewVelocity2 = NestedScrollInteropConnectionKt.toViewVelocity(Velocity.m6471getYimpl(j2));
        boolean zOnNestedPreFling = false;
        if (c0553k.f515d && (viewParentA = c0553k.a(0)) != null) {
            try {
                zOnNestedPreFling = viewParentA.onNestedPreFling(c0553k.f514c, viewVelocity, viewVelocity2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentA + " does not implement interface method onNestedPreFling", e2);
            }
        }
        if (!zOnNestedPreFling) {
            j2 = Velocity.INSTANCE.m6481getZero9UxMQ8M();
        }
        interruptOngoingScrolls();
        return Velocity.m6461boximpl(j2);
    }

    @Override // androidx.compose.ui.input.nestedscroll.NestedScrollConnection
    /* renamed from: onPreScroll-OzD1aCk */
    public long mo718onPreScrollOzD1aCk(long available, int source) {
        ViewParent viewParentA;
        if (!this.nestedScrollChildHelper.b(NestedScrollInteropConnectionKt.m5500getScrollAxesk4lQ0M(available), NestedScrollInteropConnectionKt.m5502toViewTypeGyEprt8(source))) {
            return Offset.INSTANCE.m3567getZeroF1C5BW0();
        }
        ArraysKt___ArraysJvmKt.fill$default(this.consumedScrollCache, 0, 0, 0, 6, (Object) null);
        C0553k c0553k = this.nestedScrollChildHelper;
        int iComposeToViewOffset = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3551getXimpl(available));
        int iComposeToViewOffset2 = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m3552getYimpl(available));
        int[] iArr = this.consumedScrollCache;
        int iM5502toViewTypeGyEprt8 = NestedScrollInteropConnectionKt.m5502toViewTypeGyEprt8(source);
        if (c0553k.f515d && (viewParentA = c0553k.a(iM5502toViewTypeGyEprt8)) != null && (iComposeToViewOffset != 0 || iComposeToViewOffset2 != 0)) {
            if (iArr == null) {
                if (c0553k.f516e == null) {
                    c0553k.f516e = new int[2];
                }
                iArr = c0553k.f516e;
            }
            int[] iArr2 = iArr;
            iArr2[0] = 0;
            iArr2[1] = 0;
            boolean z = viewParentA instanceof InterfaceC0554l;
            View view = c0553k.f514c;
            if (z) {
                ((InterfaceC0554l) viewParentA).onNestedPreScroll(view, iComposeToViewOffset, iComposeToViewOffset2, iArr2, iM5502toViewTypeGyEprt8);
            } else if (iM5502toViewTypeGyEprt8 == 0) {
                try {
                    viewParentA.onNestedPreScroll(view, iComposeToViewOffset, iComposeToViewOffset2, iArr2);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentA + " does not implement interface method onNestedPreScroll", e2);
                }
            }
            if (iArr2[0] == 0) {
                int i2 = iArr2[1];
            }
        }
        return NestedScrollInteropConnectionKt.m5501toOffsetUv8p0NA(this.consumedScrollCache, available);
    }
}
