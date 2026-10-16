package M0;

import F0.G;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public abstract class h extends G {
    public c d;

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        c cVar = this.d;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f447i;
        cVar.b(runnable, false, false);
    }
}
