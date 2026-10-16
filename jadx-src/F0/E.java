package F0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public abstract class E extends F implements InterfaceC0022x {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f82g = AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "_queue$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(E.class, Object.class, "_delayed$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f83i = AtomicIntegerFieldUpdater.newUpdater(E.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile = 0;
    private volatile /* synthetic */ Object _queue$volatile;

    @Override // F0.AbstractC0015p
    public final void d(InterfaceC0316i interfaceC0316i, Runnable runnable) {
        o(runnable);
    }

    @Override // F0.F
    public void n() {
        a0.f100a.set(null);
        f83i.set(this, 1);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            K0.u uVar = AbstractC0019u.f127b;
            if (obj != null) {
                if (!(obj instanceof K0.m)) {
                    if (obj != uVar) {
                        K0.m mVar = new K0.m(8, true);
                        mVar.a((Runnable) obj);
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != obj) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
                ((K0.m) obj).b();
                break;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, uVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    break;
                }
            }
            break loop0;
        }
        while (r() <= 0) {
        }
        System.nanoTime();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004d, code lost:
    
        F0.RunnableC0020v.f133j.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(java.lang.Runnable r6) {
        /*
            r5 = this;
            r5.p()
        L3:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = F0.E.f82g
            java.lang.Object r1 = r0.get(r5)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = F0.E.f83i
            int r2 = r2.get(r5)
            if (r2 == 0) goto L12
            goto L4d
        L12:
            if (r1 != 0) goto L23
        L14:
            r1 = 0
            boolean r1 = r0.compareAndSet(r5, r1, r6)
            if (r1 == 0) goto L1c
            goto L69
        L1c:
            java.lang.Object r1 = r0.get(r5)
            if (r1 == 0) goto L14
            goto L3
        L23:
            boolean r2 = r1 instanceof K0.m
            r3 = 1
            if (r2 == 0) goto L49
            r2 = r1
            K0.m r2 = (K0.m) r2
            int r4 = r2.a(r6)
            if (r4 == 0) goto L69
            if (r4 == r3) goto L37
            r0 = 2
            if (r4 == r0) goto L4d
            goto L3
        L37:
            K0.m r2 = r2.c()
        L3b:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L42
            goto L3
        L42:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L3b
            goto L3
        L49:
            K0.u r2 = F0.AbstractC0019u.f127b
            if (r1 != r2) goto L53
        L4d:
            F0.v r0 = F0.RunnableC0020v.f133j
            r0.o(r6)
            goto L76
        L53:
            K0.m r2 = new K0.m
            r4 = 8
            r2.<init>(r4, r3)
            r3 = r1
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            r2.a(r3)
            r2.a(r6)
        L63:
            boolean r3 = r0.compareAndSet(r5, r1, r2)
            if (r3 == 0) goto L77
        L69:
            java.lang.Thread r6 = r5.k()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r0 == r6) goto L76
            java.util.concurrent.locks.LockSupport.unpark(r6)
        L76:
            return
        L77:
            java.lang.Object r3 = r0.get(r5)
            if (r3 == r1) goto L63
            goto L3
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.E.o(java.lang.Runnable):void");
    }

    public final void p() {
    }

    public final boolean q() {
        l0.f fVar = this.f85f;
        if (!(fVar != null ? fVar.isEmpty() : true)) {
            return false;
        }
        Object obj = f82g.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof K0.m) {
            long j2 = K0.m.f395f.get((K0.m) obj);
            if (((int) (1073741823 & j2)) == ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return true;
            }
        } else if (obj == AbstractC0019u.f127b) {
            return true;
        }
        return false;
    }

    public final long r() {
        Runnable runnable;
        if (m()) {
            return 0L;
        }
        p();
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f82g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            runnable = null;
            if (obj == null) {
                break;
            }
            if (!(obj instanceof K0.m)) {
                if (obj != AbstractC0019u.f127b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    runnable = (Runnable) obj;
                    break loop0;
                }
                break;
            }
            K0.m mVar = (K0.m) obj;
            Object objD = mVar.d();
            if (objD != K0.m.f396g) {
                runnable = (Runnable) objD;
                break;
            }
            K0.m mVarC = mVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        l0.f fVar = this.f85f;
        if (((fVar == null || fVar.isEmpty()) ? Long.MAX_VALUE : 0L) == 0) {
            return 0L;
        }
        Object obj2 = f82g.get(this);
        if (obj2 == null) {
        } else if (obj2 instanceof K0.m) {
            long j2 = K0.m.f395f.get((K0.m) obj2);
            if (((int) (1073741823 & j2)) != ((int) ((j2 & 1152921503533105152L) >> 30))) {
                return 0L;
            }
        } else if (obj2 != AbstractC0019u.f127b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }
}
