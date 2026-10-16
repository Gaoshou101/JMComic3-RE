package M0;

import F0.AbstractC0019u;
import F0.C0011l;
import K0.q;
import K0.u;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class c implements Executor, Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f447i = AtomicLongFieldUpdater.newUpdater(c.class, "parkedWorkersStack$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f448j = AtomicLongFieldUpdater.newUpdater(c.class, "controlState$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f449k = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isTerminated$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final u f450l = new u("NOT_IN_STACK", 0);
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f451b;

    /* renamed from: c, reason: collision with root package name */
    public final int f452c;
    private volatile /* synthetic */ long controlState$volatile;
    public final long d;

    /* renamed from: e, reason: collision with root package name */
    public final String f453e;

    /* renamed from: f, reason: collision with root package name */
    public final f f454f;

    /* renamed from: g, reason: collision with root package name */
    public final f f455g;
    public final q h;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public c(int i2, int i3, long j2, String str) {
        this.f451b = i2;
        this.f452c = i3;
        this.d = j2;
        this.f453e = str;
        if (i2 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
        }
        if (i3 < i2) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        if (i3 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j2 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
        }
        this.f454f = new f();
        this.f455g = new f();
        this.h = new q((i2 + 1) * 2);
        this.controlState$volatile = i2 << 42;
        this._isTerminated$volatile = 0;
    }

    public final int a() {
        synchronized (this.h) {
            try {
                if (f449k.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f448j;
                long j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 & 2097151);
                int i3 = i2 - ((int) ((j2 & 4398044413952L) >> 21));
                if (i3 < 0) {
                    i3 = 0;
                }
                if (i3 >= this.f451b) {
                    return 0;
                }
                if (i2 >= this.f452c) {
                    return 0;
                }
                int i4 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i4 <= 0 || this.h.b(i4) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i4);
                this.h.c(i4, aVar);
                if (i4 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i5 = i3 + 1;
                aVar.start();
                return i5;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Runnable runnable, boolean z2, boolean z3) {
        i jVar;
        b bVar;
        k.f465f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof i) {
            jVar = (i) runnable;
            jVar.f459b = jNanoTime;
            jVar.f460c = z2;
        } else {
            jVar = new j(runnable, jNanoTime, z2);
        }
        boolean z4 = jVar.f460c;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f448j;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !x0.g.a(aVar.f441i, this)) {
            aVar = null;
        }
        if (aVar != null && (bVar = aVar.d) != b.f445f && (jVar.f460c || bVar != b.f443c)) {
            aVar.h = true;
            m mVar = aVar.f436b;
            if (z3) {
                jVar = mVar.a(jVar);
            } else {
                mVar.getClass();
                i iVar = (i) m.f466b.getAndSet(mVar, jVar);
                jVar = iVar == null ? null : mVar.a(iVar);
            }
        }
        if (jVar != null) {
            if (!(jVar.f460c ? this.f455g.a(jVar) : this.f454f.a(jVar))) {
                throw new RejectedExecutionException(this.f453e + " was terminated");
            }
        }
        boolean z5 = z3 && aVar != null;
        if (z4) {
            if (z5 || e() || d(jAddAndGet)) {
                return;
            }
            e();
            return;
        }
        if (z5 || e() || d(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e();
    }

    public final void c(a aVar, int i2, int i3) {
        while (true) {
            long j2 = f447i.get(this);
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                if (i3 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f450l) {
                            i4 = -1;
                            break;
                        }
                        if (objC == null) {
                            i4 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i4 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i4 = i3;
                }
            }
            if (i4 >= 0) {
                if (f447i.compareAndSet(this, j2, i4 | j3)) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = M0.c.f449k
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof M0.a
            r3 = 0
            if (r1 == 0) goto L18
            M0.a r0 = (M0.a) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            M0.c r1 = r0.f441i
            boolean r1 = x0.g.a(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            K0.q r1 = r8.h
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = M0.c.f448j     // Catch: java.lang.Throwable -> Lc4
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc4
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L79
            r1 = r2
        L37:
            K0.q r5 = r8.h
            java.lang.Object r5 = r5.b(r1)
            x0.g.b(r5)
            M0.a r5 = (M0.a) r5
            if (r5 == r0) goto L74
        L44:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L55
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L44
        L55:
            M0.m r5 = r5.f436b
            M0.f r6 = r8.f455g
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = M0.m.f466b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            M0.i r7 = (M0.i) r7
            if (r7 == 0) goto L69
            r6.a(r7)
        L69:
            M0.i r7 = r5.b()
            if (r7 != 0) goto L70
            goto L74
        L70:
            r6.a(r7)
            goto L69
        L74:
            if (r1 == r4) goto L79
            int r1 = r1 + 1
            goto L37
        L79:
            M0.f r1 = r8.f455g
            r1.b()
            M0.f r1 = r8.f454f
            r1.b()
        L83:
            if (r0 == 0) goto L8b
            M0.i r1 = r0.a(r2)
            if (r1 != 0) goto Lb3
        L8b:
            M0.f r1 = r8.f454f
            java.lang.Object r1 = r1.d()
            M0.i r1 = (M0.i) r1
            if (r1 != 0) goto Lb3
            M0.f r1 = r8.f455g
            java.lang.Object r1 = r1.d()
            M0.i r1 = (M0.i) r1
            if (r1 != 0) goto Lb3
            if (r0 == 0) goto La6
            M0.b r1 = M0.b.f445f
            r0.h(r1)
        La6:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = M0.c.f447i
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = M0.c.f448j
            r0.set(r8, r1)
        Lb2:
            return
        Lb3:
            r1.run()     // Catch: java.lang.Throwable -> Lb7
            goto L83
        Lb7:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L83
        Lc4:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: M0.c.close():void");
    }

    public final boolean d(long j2) {
        int i2 = ((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21));
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = this.f451b;
        if (i2 < i3) {
            int iA = a();
            if (iA == 1 && i3 > 1) {
                a();
            }
            if (iA > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        u uVar;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f447i;
            long j2 = atomicLongFieldUpdater.get(this);
            a aVar = (a) this.h.b((int) (2097151 & j2));
            if (aVar == null) {
                aVar = null;
            } else {
                long j3 = (2097152 + j2) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    uVar = f450l;
                    if (objC == uVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j2, j3 | iB)) {
                    aVar.g(uVar);
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f435j.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        b(runnable, false, false);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        q qVar = this.h;
        int iA = qVar.a();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 1; i7 < iA; i7++) {
            a aVar = (a) qVar.b(i7);
            if (aVar != null) {
                m mVar = aVar.f436b;
                mVar.getClass();
                int i8 = m.f466b.get(mVar) != null ? (m.f467c.get(mVar) - m.d.get(mVar)) + 1 : m.f467c.get(mVar) - m.d.get(mVar);
                int iOrdinal = aVar.d.ordinal();
                if (iOrdinal == 0) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i8);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iOrdinal == 1) {
                    i3++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i8);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iOrdinal == 2) {
                    i4++;
                } else if (iOrdinal == 3) {
                    i5++;
                    if (i8 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i8);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iOrdinal != 4) {
                        throw new C0011l();
                    }
                    i6++;
                }
            }
        }
        long j2 = f448j.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f453e);
        sb4.append('@');
        sb4.append(AbstractC0019u.b(this));
        sb4.append("[Pool Size {core = ");
        int i9 = this.f451b;
        sb4.append(i9);
        sb4.append(", max = ");
        sb4.append(this.f452c);
        sb4.append("}, Worker States {CPU = ");
        sb4.append(i2);
        sb4.append(", blocking = ");
        sb4.append(i3);
        sb4.append(", parked = ");
        sb4.append(i4);
        sb4.append(", dormant = ");
        sb4.append(i5);
        sb4.append(", terminated = ");
        sb4.append(i6);
        sb4.append("}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.f454f.c());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.f455g.c());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j2));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j2) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i9 - ((int) ((j2 & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
