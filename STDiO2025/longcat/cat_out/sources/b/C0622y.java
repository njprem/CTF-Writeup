package b;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: b.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0622y extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f660a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0593F f661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0622y(C0593F c0593f, int i2) {
        super(1);
        this.f660a = i2;
        this.f661b = c0593f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object objPrevious;
        Object objPrevious2;
        switch (this.f660a) {
            case 0:
                C0599b backEvent = (C0599b) obj;
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                C0593F c0593f = this.f661b;
                ArrayDeque arrayDeque = c0593f.f621b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        objPrevious = listIterator.previous();
                        if (((AbstractC0621x) objPrevious).f657a) {
                        }
                    } else {
                        objPrevious = null;
                    }
                }
                AbstractC0621x abstractC0621x = (AbstractC0621x) objPrevious;
                if (c0593f.f622c != null) {
                    c0593f.b();
                }
                c0593f.f622c = abstractC0621x;
                if (abstractC0621x != null) {
                    abstractC0621x.d(backEvent);
                }
                break;
            default:
                C0599b backEvent2 = (C0599b) obj;
                Intrinsics.checkNotNullParameter(backEvent2, "backEvent");
                C0593F c0593f2 = this.f661b;
                AbstractC0621x abstractC0621x2 = c0593f2.f622c;
                if (abstractC0621x2 == null) {
                    ArrayDeque arrayDeque2 = c0593f2.f621b;
                    ListIterator<E> listIterator2 = arrayDeque2.listIterator(arrayDeque2.size());
                    while (true) {
                        if (listIterator2.hasPrevious()) {
                            objPrevious2 = listIterator2.previous();
                            if (((AbstractC0621x) objPrevious2).f657a) {
                            }
                        } else {
                            objPrevious2 = null;
                        }
                    }
                    abstractC0621x2 = (AbstractC0621x) objPrevious2;
                }
                if (abstractC0621x2 != null) {
                    abstractC0621x2.c(backEvent2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
