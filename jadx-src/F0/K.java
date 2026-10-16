package F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class K extends P {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f88f = AtomicIntegerFieldUpdater.newUpdater(K.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;

    /* renamed from: e, reason: collision with root package name */
    public final O f89e;

    public K(O o2) {
        this.f89e = o2;
    }

    @Override // F0.P
    public final boolean k() {
        return true;
    }

    @Override // F0.P
    public final void l(Throwable th) {
        if (f88f.compareAndSet(this, 0, 1)) {
            this.f89e.g(th);
        }
    }
}
