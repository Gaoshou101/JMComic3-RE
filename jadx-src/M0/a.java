package M0;

import K0.u;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class a extends Thread {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f435j = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl$volatile");

    /* renamed from: b, reason: collision with root package name */
    public final m f436b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.j f437c;
    public b d;

    /* renamed from: e, reason: collision with root package name */
    public long f438e;

    /* renamed from: f, reason: collision with root package name */
    public long f439f;

    /* renamed from: g, reason: collision with root package name */
    public int f440g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c f441i;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public a(c cVar, int i2) {
        this.f441i = cVar;
        setDaemon(true);
        setContextClassLoader(cVar.getClass().getClassLoader());
        this.f436b = new m();
        this.f437c = new x0.j();
        this.d = b.f444e;
        this.nextParkedWorker = c.f450l;
        int iNanoTime = (int) System.nanoTime();
        this.f440g = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r13 = M0.m.d.get(r3);
        r0 = M0.m.f467c.get(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r13 == r0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        if (M0.m.f468e.get(r3) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        r0 = r0 - 1;
        r1 = r3.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        if (r1 == null) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final M0.i a(boolean r13) {
        /*
            r12 = this;
            M0.b r0 = r12.d
            M0.b r1 = M0.b.f442b
            r2 = 0
            M0.m r3 = r12.f436b
            r4 = 1
            M0.c r5 = r12.f441i
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = M0.c.f448j
        L10:
            M0.c r7 = r12.f441i
            long r8 = r0.get(r7)
            r10 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r10 = r10 & r8
            r6 = 42
            long r10 = r10 >> r6
            int r6 = (int) r10
            if (r6 != 0) goto L75
            r3.getClass()
        L25:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = M0.m.f466b
            java.lang.Object r0 = r13.get(r3)
            M0.i r0 = (M0.i) r0
            if (r0 != 0) goto L30
            goto L43
        L30:
            boolean r1 = r0.f460c
            if (r1 != r4) goto L43
        L34:
            boolean r1 = r13.compareAndSet(r3, r0, r2)
            if (r1 == 0) goto L3c
            r2 = r0
            goto L63
        L3c:
            java.lang.Object r1 = r13.get(r3)
            if (r1 == r0) goto L34
            goto L25
        L43:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r13 = M0.m.d
            int r13 = r13.get(r3)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = M0.m.f467c
            int r0 = r0.get(r3)
        L4f:
            if (r13 == r0) goto L63
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = M0.m.f468e
            int r1 = r1.get(r3)
            if (r1 != 0) goto L5a
            goto L63
        L5a:
            int r0 = r0 + (-1)
            M0.i r1 = r3.c(r0, r4)
            if (r1 == 0) goto L4f
            r2 = r1
        L63:
            if (r2 != 0) goto L74
            M0.f r13 = r5.f455g
            java.lang.Object r13 = r13.d()
            r2 = r13
            M0.i r2 = (M0.i) r2
            if (r2 != 0) goto L74
            M0.i r2 = r12.i(r4)
        L74:
            return r2
        L75:
            r10 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r10 = r8 - r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = M0.c.f448j
            boolean r6 = r6.compareAndSet(r7, r8, r10)
            if (r6 == 0) goto L10
            r12.d = r1
        L86:
            if (r13 == 0) goto Lba
            int r13 = r5.f451b
            int r13 = r13 * 2
            int r13 = r12.d(r13)
            if (r13 != 0) goto L93
            goto L94
        L93:
            r4 = 0
        L94:
            if (r4 == 0) goto L9d
            M0.i r13 = r12.e()
            if (r13 == 0) goto L9d
            goto Lc6
        L9d:
            r3.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r13 = M0.m.f466b
            java.lang.Object r13 = r13.getAndSet(r3, r2)
            M0.i r13 = (M0.i) r13
            if (r13 != 0) goto Lae
            M0.i r13 = r3.b()
        Lae:
            if (r13 == 0) goto Lb1
            goto Lc6
        Lb1:
            if (r4 != 0) goto Lc1
            M0.i r13 = r12.e()
            if (r13 == 0) goto Lc1
            goto Lc6
        Lba:
            M0.i r13 = r12.e()
            if (r13 == 0) goto Lc1
            goto Lc6
        Lc1:
            r13 = 3
            M0.i r13 = r12.i(r13)
        Lc6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.a.a(boolean):M0.i");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f440g;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f440g = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final i e() {
        int iD = d(2);
        c cVar = this.f441i;
        if (iD == 0) {
            i iVar = (i) cVar.f454f.d();
            return iVar != null ? iVar : (i) cVar.f455g.d();
        }
        i iVar2 = (i) cVar.f455g.d();
        return iVar2 != null ? iVar2 : (i) cVar.f454f.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f441i.f453e);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(b bVar) {
        b bVar2 = this.d;
        boolean z2 = bVar2 == b.f442b;
        if (z2) {
            c.f448j.addAndGet(this.f441i, 4398046511104L);
        }
        if (bVar2 != bVar) {
            this.d = bVar;
        }
        return z2;
    }

    public final i i(int i2) {
        i iVarC;
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = c.f448j;
        c cVar = this.f441i;
        int i3 = (int) (atomicLongFieldUpdater.get(cVar) & 2097151);
        if (i3 < 2) {
            return null;
        }
        int iD = d(i3);
        long jMin = Long.MAX_VALUE;
        for (int i4 = 0; i4 < i3; i4++) {
            iD++;
            if (iD > i3) {
                iD = 1;
            }
            a aVar = (a) cVar.h.b(iD);
            if (aVar != null && aVar != this) {
                m mVar = aVar.f436b;
                if (i2 == 3) {
                    iVarC = mVar.b();
                } else {
                    mVar.getClass();
                    int i5 = m.d.get(mVar);
                    int i6 = m.f467c.get(mVar);
                    boolean z2 = i2 == 1;
                    while (i5 != i6 && (!z2 || m.f468e.get(mVar) != 0)) {
                        int i7 = i5 + 1;
                        iVarC = mVar.c(i5, z2);
                        if (iVarC != null) {
                            break;
                        }
                        i5 = i7;
                    }
                    iVarC = null;
                }
                x0.j jVar = this.f437c;
                if (iVarC != null) {
                    jVar.f2706b = iVarC;
                    j3 = -1;
                } else {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = m.f466b;
                        i iVar = (i) atomicReferenceFieldUpdater.get(mVar);
                        j2 = -2;
                        if (iVar == null) {
                            break;
                        }
                        if (((iVar.f460c ? 1 : 2) & i2) != 0) {
                            k.f465f.getClass();
                            long jNanoTime = System.nanoTime() - iVar.f459b;
                            long j4 = k.f462b;
                            if (jNanoTime >= j4) {
                                while (!atomicReferenceFieldUpdater.compareAndSet(mVar, iVar, null)) {
                                    if (atomicReferenceFieldUpdater.get(mVar) != iVar) {
                                        break;
                                    }
                                }
                                jVar.f2706b = iVar;
                                j2 = -1;
                                break;
                            }
                            j2 = j4 - jNanoTime;
                            break;
                        }
                        break;
                    }
                    j3 = j2;
                }
                if (j3 == -1) {
                    i iVar2 = (i) jVar.f2706b;
                    jVar.f2706b = null;
                    return iVar2;
                }
                if (j3 > 0) {
                    jMin = Math.min(jMin, j3);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f439f = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        boolean z2;
        boolean z3 = false;
        loop0: while (true) {
            boolean z4 = z3;
            while (true) {
                c cVar = this.f441i;
                cVar.getClass();
                if (c.f449k.get(cVar) == 0) {
                    b bVar = this.d;
                    b bVar2 = b.f445f;
                    if (bVar == bVar2) {
                        break loop0;
                    }
                    i iVarA = a(this.h);
                    long j2 = -2097152;
                    if (iVarA != null) {
                        this.f439f = 0L;
                        this.f438e = 0L;
                        if (this.d == b.d) {
                            this.d = b.f443c;
                        }
                        boolean z5 = iVarA.f460c;
                        c cVar2 = this.f441i;
                        if (z5) {
                            if (h(b.f443c) && !cVar2.e() && !cVar2.d(c.f448j.get(cVar2))) {
                                cVar2.e();
                            }
                            cVar2.getClass();
                            try {
                                iVarA.run();
                            } catch (Throwable th) {
                                Thread threadCurrentThread = Thread.currentThread();
                                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                            }
                            c.f448j.addAndGet(cVar2, -2097152L);
                            if (this.d != bVar2) {
                                this.d = b.f444e;
                            }
                        } else {
                            cVar2.getClass();
                            try {
                                iVarA.run();
                            } catch (Throwable th2) {
                                Thread threadCurrentThread2 = Thread.currentThread();
                                threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th2);
                            }
                        }
                    } else {
                        this.h = z3;
                        if (this.f439f == 0) {
                            Object obj = this.nextParkedWorker;
                            u uVar = c.f450l;
                            if (obj != uVar ? true : z3) {
                                f435j.set(this, -1);
                                while (this.nextParkedWorker != c.f450l) {
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = f435j;
                                    if (atomicIntegerFieldUpdater2.get(this) != -1) {
                                        break;
                                    }
                                    c cVar3 = this.f441i;
                                    cVar3.getClass();
                                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater3 = c.f449k;
                                    if (atomicIntegerFieldUpdater3.get(cVar3) != 0) {
                                        break;
                                    }
                                    b bVar3 = this.d;
                                    b bVar4 = b.f445f;
                                    if (bVar3 == bVar4) {
                                        break;
                                    }
                                    h(b.d);
                                    Thread.interrupted();
                                    if (this.f438e == 0) {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                        this.f438e = System.nanoTime() + this.f441i.d;
                                    } else {
                                        atomicIntegerFieldUpdater = atomicIntegerFieldUpdater2;
                                    }
                                    LockSupport.parkNanos(this.f441i.d);
                                    if (System.nanoTime() - this.f438e >= 0) {
                                        this.f438e = 0L;
                                        c cVar4 = this.f441i;
                                        synchronized (cVar4.h) {
                                            try {
                                                if (!(atomicIntegerFieldUpdater3.get(cVar4) != 0)) {
                                                    AtomicLongFieldUpdater atomicLongFieldUpdater = c.f448j;
                                                    if (((int) (atomicLongFieldUpdater.get(cVar4) & 2097151)) > cVar4.f451b && atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                        int i2 = this.indexInArray;
                                                        z2 = false;
                                                        f(0);
                                                        cVar4.c(this, i2, 0);
                                                        int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(cVar4) & 2097151);
                                                        if (andDecrement != i2) {
                                                            Object objB = cVar4.h.b(andDecrement);
                                                            x0.g.b(objB);
                                                            a aVar = (a) objB;
                                                            cVar4.h.c(i2, aVar);
                                                            aVar.f(i2);
                                                            cVar4.c(aVar, andDecrement, i2);
                                                        }
                                                        cVar4.h.c(andDecrement, null);
                                                        this.d = bVar4;
                                                    }
                                                }
                                                z2 = false;
                                            } catch (Throwable th3) {
                                                throw th3;
                                            }
                                        }
                                    } else {
                                        z2 = false;
                                    }
                                    z3 = z2;
                                }
                            } else {
                                c cVar5 = this.f441i;
                                cVar5.getClass();
                                if (this.nextParkedWorker == uVar) {
                                    while (true) {
                                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = c.f447i;
                                        long j3 = atomicLongFieldUpdater2.get(cVar5);
                                        int i3 = this.indexInArray;
                                        this.nextParkedWorker = cVar5.h.b((int) (j3 & 2097151));
                                        if (atomicLongFieldUpdater2.compareAndSet(cVar5, j3, ((2097152 + j3) & j2) | i3)) {
                                            break;
                                        } else {
                                            j2 = -2097152;
                                        }
                                    }
                                }
                            }
                            z3 = z3;
                        } else {
                            if (z4) {
                                h(b.d);
                                Thread.interrupted();
                                LockSupport.parkNanos(this.f439f);
                                this.f439f = 0L;
                                break;
                            }
                            z4 = true;
                        }
                    }
                } else {
                    break loop0;
                }
            }
        }
        h(b.f445f);
    }
}
