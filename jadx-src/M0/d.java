package M0;

import F0.AbstractC0015p;
import F0.G;
import K0.v;
import java.util.concurrent.Executor;
import n0.C0317j;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class d extends G implements Executor {
    public static final d d = new d();

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC0015p f456e;

    static {
        l lVar = l.d;
        int i2 = v.f408a;
        if (64 >= i2) {
            i2 = 64;
        }
        f456e = lVar.h(null, K0.a.l("kotlinx.coroutines.io.parallelism", i2, 0, 0, 12));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        f456e.d(interfaceC0316i, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(C0317j.f2507b, runnable);
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        return "Dispatchers.IO";
    }
}
