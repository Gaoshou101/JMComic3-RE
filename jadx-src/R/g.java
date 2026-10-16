package r;

import a.AbstractC0062a;
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
    public static final boolean d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f2622e = Logger.getLogger(g.class.getName());

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC0062a f2623f;

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2624g;

    /* renamed from: a, reason: collision with root package name */
    public volatile Object f2625a;

    /* renamed from: b, reason: collision with root package name */
    public volatile C0331c f2626b;

    /* renamed from: c, reason: collision with root package name */
    public volatile C0334f f2627c;

    static {
        AbstractC0062a c0333e;
        try {
            c0333e = new C0332d(AtomicReferenceFieldUpdater.newUpdater(C0334f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C0334f.class, C0334f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0334f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(g.class, C0331c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c0333e = new C0333e();
        }
        f2623f = c0333e;
        if (th != null) {
            f2622e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f2624g = new Object();
    }

    public static void b(g gVar) {
        C0334f c0334f;
        C0331c c0331c;
        do {
            c0334f = gVar.f2627c;
        } while (!f2623f.h(gVar, c0334f, C0334f.f2619c));
        while (c0334f != null) {
            Thread thread = c0334f.f2620a;
            if (thread != null) {
                c0334f.f2620a = null;
                LockSupport.unpark(thread);
            }
            c0334f = c0334f.f2621b;
        }
        do {
            c0331c = gVar.f2626b;
        } while (!f2623f.f(gVar, c0331c));
        C0331c c0331c2 = null;
        while (c0331c != null) {
            C0331c c0331c3 = c0331c.f2614a;
            c0331c.f2614a = c0331c2;
            c0331c2 = c0331c;
            c0331c = c0331c3;
        }
        while (c0331c2 != null) {
            c0331c2 = c0331c2.f2614a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f2622e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    public static Object c(Object obj) throws ExecutionException {
        if (obj instanceof C0329a) {
            CancellationException cancellationException = ((C0329a) obj).f2612a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC0330b) {
            ((AbstractC0330b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f2624g) {
            return null;
        }
        return obj;
    }

    public static Object d(g gVar) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = gVar.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
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
    public final boolean cancel(boolean z2) {
        Object obj = this.f2625a;
        if (obj != null) {
            return false;
        }
        if (!f2623f.g(this, obj, d ? new C0329a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C0329a.f2610b : C0329a.f2611c)) {
            return false;
        }
        b(this);
        return true;
    }

    public final void e(C0334f c0334f) {
        c0334f.f2620a = null;
        while (true) {
            C0334f c0334f2 = this.f2627c;
            if (c0334f2 == C0334f.f2619c) {
                return;
            }
            C0334f c0334f3 = null;
            while (c0334f2 != null) {
                C0334f c0334f4 = c0334f2.f2621b;
                if (c0334f2.f2620a != null) {
                    c0334f3 = c0334f2;
                } else if (c0334f3 != null) {
                    c0334f3.f2621b = c0334f4;
                    if (c0334f3.f2620a == null) {
                        break;
                    }
                } else if (!f2623f.h(this, c0334f2, c0334f4)) {
                    break;
                }
                c0334f2 = c0334f4;
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
        Object obj = this.f2625a;
        if (obj != null) {
            return c(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C0334f c0334f = this.f2627c;
            C0334f c0334f2 = C0334f.f2619c;
            if (c0334f != c0334f2) {
                C0334f c0334f3 = new C0334f();
                do {
                    AbstractC0062a abstractC0062a = f2623f;
                    abstractC0062a.L(c0334f3, c0334f);
                    if (abstractC0062a.h(this, c0334f, c0334f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                e(c0334f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f2625a;
                            if (obj2 != null) {
                                return c(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        e(c0334f3);
                    } else {
                        c0334f = this.f2627c;
                    }
                } while (c0334f != c0334f2);
            }
            return c(this.f2625a);
        }
        while (nanos > 0) {
            Object obj3 = this.f2625a;
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
            boolean z2 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z2) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z2) {
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
        return this.f2625a instanceof C0329a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f2625a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f2625a instanceof C0329a) {
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
            Object obj2 = this.f2625a;
            if (obj2 != null) {
                return c(obj2);
            }
            C0334f c0334f = this.f2627c;
            C0334f c0334f2 = C0334f.f2619c;
            if (c0334f != c0334f2) {
                C0334f c0334f3 = new C0334f();
                do {
                    AbstractC0062a abstractC0062a = f2623f;
                    abstractC0062a.L(c0334f3, c0334f);
                    if (abstractC0062a.h(this, c0334f, c0334f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f2625a;
                            } else {
                                e(c0334f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    c0334f = this.f2627c;
                } while (c0334f != c0334f2);
            }
            return c(this.f2625a);
        }
        throw new InterruptedException();
    }
}
