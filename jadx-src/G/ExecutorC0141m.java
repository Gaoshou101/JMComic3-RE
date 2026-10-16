package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: g.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC0141m implements Executor {

    /* renamed from: b, reason: collision with root package name */
    public final Object f1665b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayDeque f1666c = new ArrayDeque();
    public final ExecutorC0142n d;

    /* renamed from: e, reason: collision with root package name */
    public Runnable f1667e;

    public ExecutorC0141m(ExecutorC0142n executorC0142n) {
        this.d = executorC0142n;
    }

    public final void a() {
        synchronized (this.f1665b) {
            try {
                Runnable runnable = (Runnable) this.f1666c.poll();
                this.f1667e = runnable;
                if (runnable != null) {
                    this.d.execute(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f1665b) {
            try {
                this.f1666c.add(new Q.h(this, 6, runnable));
                if (this.f1667e == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
