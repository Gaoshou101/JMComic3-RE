package F0;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* renamed from: F0.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0020v extends E implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* renamed from: j, reason: collision with root package name */
    public static final RunnableC0020v f133j;

    /* renamed from: k, reason: collision with root package name */
    public static final long f134k;

    static {
        Long l2;
        RunnableC0020v runnableC0020v = new RunnableC0020v();
        f133j = runnableC0020v;
        runnableC0020v.l(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f134k = timeUnit.toNanos(l2.longValue());
    }

    @Override // F0.F
    public final Thread k() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setContextClassLoader(f133j.getClass().getClassLoader());
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    @Override // F0.E, F0.F
    public final void n() {
        debugStatus = 4;
        super.n();
    }

    @Override // F0.E
    public final void o(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.o(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zQ;
        a0.f100a.set(this);
        try {
            synchronized (this) {
                int i2 = debugStatus;
                if (i2 == 2 || i2 == 3) {
                    if (zQ) {
                        return;
                    } else {
                        return;
                    }
                }
                debugStatus = 1;
                notifyAll();
                long j2 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jR = r();
                    if (jR == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j2 == Long.MAX_VALUE) {
                            j2 = f134k + jNanoTime;
                        }
                        long j3 = j2 - jNanoTime;
                        if (j3 <= 0) {
                            _thread = null;
                            s();
                            if (q()) {
                                return;
                            }
                            k();
                            return;
                        }
                        if (jR > j3) {
                            jR = j3;
                        }
                    } else {
                        j2 = Long.MAX_VALUE;
                    }
                    if (jR > 0) {
                        int i3 = debugStatus;
                        if (i3 == 2 || i3 == 3) {
                            _thread = null;
                            s();
                            if (q()) {
                                return;
                            }
                            k();
                            return;
                        }
                        LockSupport.parkNanos(this, jR);
                    }
                }
            }
        } finally {
            _thread = null;
            s();
            if (!q()) {
                k();
            }
        }
    }

    public final synchronized void s() {
        int i2 = debugStatus;
        if (i2 == 2 || i2 == 3) {
            debugStatus = 3;
            E.f82g.set(this, null);
            E.h.set(this, null);
            notifyAll();
        }
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        return "DefaultExecutor";
    }
}
