package o;

import a.AbstractC0131b;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class g implements Future {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f925d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f926e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0131b f927f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f928g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f929a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0787c f930b;

    /* renamed from: c, reason: collision with root package name */
    public volatile f f931c;

    static {
        AbstractC0131b eVar;
        try {
            eVar = new C0788d(AtomicReferenceFieldUpdater.newUpdater(f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(f.class, f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0787c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            eVar = new e();
        }
        f927f = eVar;
        if (th != null) {
            f926e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f928g = new Object();
    }

    public static void b(g gVar) {
        f fVar;
        C0787c c0787c;
        do {
            fVar = gVar.f931c;
        } while (!f927f.g(gVar, fVar, f.f922c));
        while (fVar != null) {
            Thread thread = fVar.f923a;
            if (thread != null) {
                fVar.f923a = null;
                LockSupport.unpark(thread);
            }
            fVar = fVar.f924b;
        }
        do {
            c0787c = gVar.f930b;
        } while (!f927f.e(gVar, c0787c));
        C0787c c0787c2 = null;
        while (c0787c != null) {
            C0787c c0787c3 = c0787c.f916a;
            c0787c.f916a = c0787c2;
            c0787c2 = c0787c;
            c0787c = c0787c3;
        }
        while (c0787c2 != null) {
            c0787c2 = c0787c2.f916a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f926e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C0785a) {
            CancellationException cancellationException = ((C0785a) obj).f914a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0786b) {
            ((AbstractC0786b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f928g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objD = d(this);
            sb.append("SUCCESS, result=[");
            sb.append(objD == this ? "this future" : String.valueOf(objD));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.f929a;
        if (obj != null) {
            return false;
        }
        if (!f927f.f(this, obj, f925d ? new C0785a(z, new CancellationException("Future.cancel() was called.")) : z ? C0785a.f912b : C0785a.f913c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(f fVar) {
        fVar.f923a = null;
        while (true) {
            f fVar2 = this.f931c;
            if (fVar2 == f.f922c) {
                return;
            }
            f fVar3 = null;
            while (fVar2 != null) {
                f fVar4 = fVar2.f924b;
                if (fVar2.f923a != null) {
                    fVar3 = fVar2;
                } else if (fVar3 != null) {
                    fVar3.f924b = fVar4;
                    if (fVar3.f923a == null) {
                        break;
                    }
                } else if (!f927f.g(this, fVar2, fVar4)) {
                    break;
                }
                fVar2 = fVar4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f929a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            f fVar = this.f931c;
            f fVar2 = f.f922c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0131b abstractC0131b = f927f;
                    abstractC0131b.v(fVar3, fVar);
                    if (abstractC0131b.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f929a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(fVar3);
                    } else {
                        fVar = this.f931c;
                    }
                } while (fVar != fVar2);
            }
            return c(this.f929a);
        }
        while (nanos > 0) {
            Object obj3 = this.f929a;
            if (obj3 != null) {
                return c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j3 = -nanos;
            long jConvert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f929a instanceof C0785a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f929a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f929a instanceof C0785a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f929a;
            if (obj2 != null) {
                return c(obj2);
            }
            f fVar = this.f931c;
            f fVar2 = f.f922c;
            if (fVar != fVar2) {
                f fVar3 = new f();
                do {
                    AbstractC0131b abstractC0131b = f927f;
                    abstractC0131b.v(fVar3, fVar);
                    if (abstractC0131b.g(this, fVar, fVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f929a;
                            } else {
                                e(fVar3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    fVar = this.f931c;
                } while (fVar != fVar2);
            }
            return c(this.f929a);
        }
        throw new InterruptedException();
    }
}
