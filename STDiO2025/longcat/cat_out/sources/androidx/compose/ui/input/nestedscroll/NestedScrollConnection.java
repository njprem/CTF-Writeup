package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.Velocity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0014À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "", "onPostFling", "Landroidx/compose/ui/unit/Velocity;", "consumed", "available", "onPostFling-RZ2iAVY", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPostScroll", "Landroidx/compose/ui/geometry/Offset;", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "onPostScroll-DzOQY0M", "(JJI)J", "onPreFling", "onPreFling-QWom1Mo", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPreScroll", "onPreScroll-OzD1aCk", "(JI)J", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface NestedScrollConnection {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
        public static Object m4863onPostFlingRZ2iAVY(NestedScrollConnection nestedScrollConnection, long j2, long j3, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo443onPostFlingRZ2iAVY(j2, j3, continuation);
        }

        @Deprecated
        /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
        public static long m4864onPostScrollDzOQY0M(NestedScrollConnection nestedScrollConnection, long j2, long j3, int i2) {
            return NestedScrollConnection.super.mo444onPostScrollDzOQY0M(j2, j3, i2);
        }

        @Deprecated
        /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
        public static Object m4865onPreFlingQWom1Mo(NestedScrollConnection nestedScrollConnection, long j2, Continuation<? super Velocity> continuation) {
            return NestedScrollConnection.super.mo717onPreFlingQWom1Mo(j2, continuation);
        }

        @Deprecated
        /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
        public static long m4866onPreScrollOzD1aCk(NestedScrollConnection nestedScrollConnection, long j2, int i2) {
            return NestedScrollConnection.super.mo718onPreScrollOzD1aCk(j2, i2);
        }
    }

    /* renamed from: onPostFling-RZ2iAVY$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m4861onPostFlingRZ2iAVY$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, long j3, Continuation<? super Velocity> continuation) {
        return Velocity.m6461boximpl(Velocity.INSTANCE.m6481getZero9UxMQ8M());
    }

    /* renamed from: onPreFling-QWom1Mo$suspendImpl, reason: not valid java name */
    static /* synthetic */ Object m4862onPreFlingQWom1Mo$suspendImpl(NestedScrollConnection nestedScrollConnection, long j2, Continuation<? super Velocity> continuation) {
        return Velocity.m6461boximpl(Velocity.INSTANCE.m6481getZero9UxMQ8M());
    }

    /* renamed from: onPostFling-RZ2iAVY */
    default Object mo443onPostFlingRZ2iAVY(long j2, long j3, Continuation<? super Velocity> continuation) {
        return m4861onPostFlingRZ2iAVY$suspendImpl(this, j2, j3, continuation);
    }

    /* renamed from: onPostScroll-DzOQY0M */
    default long mo444onPostScrollDzOQY0M(long consumed, long available, int source) {
        return Offset.INSTANCE.m3567getZeroF1C5BW0();
    }

    /* renamed from: onPreFling-QWom1Mo */
    default Object mo717onPreFlingQWom1Mo(long j2, Continuation<? super Velocity> continuation) {
        return m4862onPreFlingQWom1Mo$suspendImpl(this, j2, continuation);
    }

    /* renamed from: onPreScroll-OzD1aCk */
    default long mo718onPreScrollOzD1aCk(long available, int source) {
        return Offset.INSTANCE.m3567getZeroF1C5BW0();
    }
}
