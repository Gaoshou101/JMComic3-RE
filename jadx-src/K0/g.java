package K0;

import F0.AbstractC0015p;
import F0.AbstractC0021w;
import F0.InterfaceC0022x;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class g extends AbstractC0015p implements InterfaceC0022x {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f385i = AtomicIntegerFieldUpdater.newUpdater(g.class, "runningWorkers$volatile");
    public final AbstractC0015p d;

    /* renamed from: e, reason: collision with root package name */
    public final int f386e;

    /* renamed from: f, reason: collision with root package name */
    public final String f387f;

    /* renamed from: g, reason: collision with root package name */
    public final k f388g;
    public final Object h;
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public g(AbstractC0015p abstractC0015p, int i2, String str) {
        if ((abstractC0015p instanceof InterfaceC0022x ? (InterfaceC0022x) abstractC0015p : null) == null) {
            int i3 = AbstractC0021w.f135a;
        }
        this.d = abstractC0015p;
        this.f386e = i2;
        this.f387f = str;
        this.f388g = new k();
        this.h = new Object();
    }

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        this.f388g.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f385i;
        if (atomicIntegerFieldUpdater.get(this) < this.f386e) {
            synchronized (this.h) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f386e) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableI = i();
                if (runnableI == null) {
                    return;
                }
                this.d.d(this, new D.a(this, runnableI, 2, false));
            }
        }
    }

    public final Runnable i() {
        while (true) {
            Runnable runnable = (Runnable) this.f388g.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.h) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f385i;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f388g.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // F0.AbstractC0015p
    public final String toString() {
        String str = this.f387f;
        if (str != null) {
            return str;
        }
        return this.d + ".limitedParallelism(" + this.f386e + ')';
    }
}
