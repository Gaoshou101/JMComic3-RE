package F0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class P extends K0.j implements B, I {
    public T d;

    @Override // F0.B
    public final void a() {
        T tJ = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = T.f97b;
            Object obj = atomicReferenceFieldUpdater.get(tJ);
            if (obj instanceof P) {
                if (obj != this) {
                    return;
                }
                C c2 = AbstractC0019u.f132i;
                while (!atomicReferenceFieldUpdater.compareAndSet(tJ, obj, c2)) {
                    if (atomicReferenceFieldUpdater.get(tJ) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof I) || ((I) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = K0.j.f389a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof K0.p) {
                    K0.j jVar = ((K0.p) obj2).f402a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
                K0.j jVar2 = (K0.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = K0.j.f391c;
                K0.p pVar = (K0.p) atomicReferenceFieldUpdater3.get(jVar2);
                if (pVar == null) {
                    pVar = new K0.p(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.f();
                return;
            }
        }
    }

    @Override // F0.I
    public final boolean b() {
        return true;
    }

    @Override // F0.I
    public final U d() {
        return null;
    }

    public L getParent() {
        return j();
    }

    public final T j() {
        T t2 = this.d;
        if (t2 != null) {
            return t2;
        }
        C0011l c0011l = new C0011l("lateinit property job has not been initialized");
        x0.g.f(c0011l, x0.g.class.getName());
        throw c0011l;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // K0.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0019u.b(this) + "[job@" + AbstractC0019u.b(j()) + ']';
    }
}
