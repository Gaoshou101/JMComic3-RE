package F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: F0.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0023y extends K0.r {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f136f = AtomicIntegerFieldUpdater.newUpdater(C0023y.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // K0.r, F0.T
    public final void k(Object obj) {
        l(obj);
    }

    @Override // K0.r, F0.T
    public final void l(Object obj) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f136f;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                K0.a.j(AbstractC0019u.h(obj), P0.b.q(this.f403e));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
