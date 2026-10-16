package K0;

import F0.W;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public abstract class s extends b implements W {
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(s.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    public final long f404c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public s(long j2, H0.m mVar, int i2) {
        super(mVar);
        this.f404c = j2;
        this.cleanedAndPointers$volatile = i2 << 16;
    }

    @Override // K0.b
    public final boolean c() {
        return d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i2, InterfaceC0316i interfaceC0316i);

    public final void h() {
        if (d.incrementAndGet(this) == H0.g.f242b) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = d;
            i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 65536 + i2));
        return true;
    }
}
