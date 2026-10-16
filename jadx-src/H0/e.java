package H0;

import F0.B;
import F0.C0004e;
import F0.C0011l;
import F0.InterfaceC0003d;
import F0.V;
import F0.W;
import F0.e0;
import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public class e implements i {
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f231e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f232f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f233g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f234i = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f235j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f236k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f237l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* renamed from: b, reason: collision with root package name */
    public final int f238b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* renamed from: c, reason: collision with root package name */
    public final w0.l f239c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    public e(int i2, w0.l lVar) {
        this.f238b = i2;
        this.f239c = lVar;
        if (i2 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i2 + ", should be >=0").toString());
        }
        m mVar = g.f241a;
        this.bufferEnd$volatile = i2 != 0 ? i2 != Integer.MAX_VALUE ? i2 : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = f232f.get(this);
        m mVar2 = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar2;
        this.receiveSegment$volatile = mVar2;
        if (s()) {
            mVar2 = g.f241a;
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>", mVar2);
        }
        this.bufferEndSegment$volatile = mVar2;
        this._closeCause$volatile = g.f257s;
    }

    public static final m b(e eVar, long j2, m mVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objD;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        long j4;
        eVar.getClass();
        m mVar2 = g.f241a;
        f fVar = f.f240j;
        loop0: while (true) {
            objD = K0.a.d(j2, mVar);
            if (!K0.a.g(objD)) {
                K0.s sVarE = K0.a.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
                    K0.s sVar = (K0.s) atomicReferenceFieldUpdater.get(eVar);
                    if (sVar.f404c >= sVarE.f404c) {
                        break loop0;
                    }
                    if (!sVarE.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(eVar, sVar, sVarE)) {
                        if (atomicReferenceFieldUpdater.get(eVar) != sVar) {
                            if (sVarE.e()) {
                                sVarE.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zG = K0.a.g(objD);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f231e;
        if (zG) {
            eVar.h();
            if (mVar.f404c * g.f242b >= atomicLongFieldUpdater2.get(eVar)) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) K0.a.e(objD);
        long j5 = mVar3.f404c;
        if (j5 <= j2) {
            return mVar3;
        }
        long j6 = g.f242b * j5;
        do {
            atomicLongFieldUpdater = d;
            j3 = atomicLongFieldUpdater.get(eVar);
            j4 = 1152921504606846975L & j3;
            if (j4 >= j6) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(eVar, j3, j4 + (((int) (j3 >> 60)) << 60)));
        if (j5 * g.f242b >= atomicLongFieldUpdater2.get(eVar)) {
            return null;
        }
        mVar3.a();
        return null;
    }

    public static final void c(e eVar, Object obj, C0004e c0004e) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        w0.l lVar = eVar.f239c;
        if (lVar != null) {
            K0.a.a(lVar, obj, c0004e.f108f);
        }
        c0004e.h(AbstractC0062a.m(eVar.n()));
    }

    public static final int d(e eVar, m mVar, int i2, Object obj, long j2, Object obj2, boolean z2) {
        eVar.getClass();
        mVar.m(i2, obj);
        if (z2) {
            return eVar.z(mVar, i2, obj, j2, obj2, z2);
        }
        Object objK = mVar.k(i2);
        if (objK == null) {
            if (eVar.e(j2)) {
                if (mVar.j(null, i2, g.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (mVar.j(null, i2, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof e0) {
            mVar.m(i2, null);
            if (eVar.w(objK, obj)) {
                mVar.n(i2, g.f247i);
                return 0;
            }
            K0.u uVar = g.f249k;
            if (mVar.f264f.getAndSet((i2 * 2) + 1, uVar) != uVar) {
                mVar.l(i2, true);
            }
            return 5;
        }
        return eVar.z(mVar, i2, obj, j2, obj2, z2);
    }

    public static void p(e eVar) {
        eVar.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = f233g;
        if ((atomicLongFieldUpdater.addAndGet(eVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(eVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean x(Object obj) {
        if (obj instanceof InterfaceC0003d) {
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>", obj);
            return g.a((InterfaceC0003d) obj, C0235h.f2029a, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    @Override // H0.s
    public final void a(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        f(cancellationException, true);
    }

    public final boolean e(long j2) {
        return j2 < f232f.get(this) || j2 < f231e.get(this) + ((long) this.f238b);
    }

    public final boolean f(Throwable th, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        boolean z3;
        long j2;
        long j3;
        long j4;
        Object obj;
        long j5;
        long j6;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (z2) {
            do {
                j6 = atomicLongFieldUpdater.get(this);
                if (((int) (j6 >> 60)) != 0) {
                    break;
                }
                m mVar = g.f241a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j6, (1 << 60) + (j6 & 1152921504606846975L)));
        }
        K0.u uVar = g.f257s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f236k;
            if (atomicReferenceFieldUpdater.compareAndSet(this, uVar, th)) {
                z3 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != uVar) {
                z3 = false;
                break;
            }
        }
        if (z2) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (3 << 60) + (j5 & 1152921504606846975L)));
        } else {
            do {
                j2 = atomicLongFieldUpdater.get(this);
                int i2 = (int) (j2 >> 60);
                if (i2 == 0) {
                    j3 = j2 & 1152921504606846975L;
                    j4 = 2;
                } else {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j2 & 1152921504606846975L;
                    j4 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j2, (j4 << 60) + j3));
        }
        h();
        if (z3) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f237l;
                obj = atomicReferenceFieldUpdater2.get(this);
                K0.u uVar2 = obj == null ? g.f255q : g.f256r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, uVar2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                x0.m.a(1, obj);
                ((w0.l) obj).g(m());
            }
        }
        return z3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
    
        r1 = (H0.m) ((K0.b) K0.b.f377b.get(r1));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final H0.m g(long r13) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.g(long):H0.m");
    }

    public final void h() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        q(d.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01c8, code lost:
    
        r2.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01cb, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ee, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        c(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f6, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fa, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fb, code lost:
    
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014c, code lost:
    
        if (r24 >= r5.get(r26)) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        r19.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        r1 = r27;
        r2 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0155, code lost:
    
        c(r26, r1, r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:151:? A[RETURN, SYNTHETIC] */
    @Override // H0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(java.lang.Object r27, n0.InterfaceC0311d r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.i(java.lang.Object, n0.d):java.lang.Object");
    }

    public final void j(long j2) {
        C0011l c0011lB;
        m mVar = (m) f234i.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f231e;
            long j3 = atomicLongFieldUpdater.get(this);
            if (j2 < Math.max(this.f238b + j3, f232f.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j3, j3 + 1)) {
                long j4 = g.f242b;
                long j5 = j3 / j4;
                int i2 = (int) (j3 % j4);
                if (mVar.f404c != j5) {
                    m mVarL = l(j5, mVar);
                    if (mVarL == null) {
                        continue;
                    } else {
                        mVar = mVarL;
                    }
                }
                Object objY = y(mVar, i2, j3, null);
                if (objY != g.f253o) {
                    mVar.a();
                    w0.l lVar = this.f239c;
                    if (lVar != null && (c0011lB = K0.a.b(lVar, objY, null)) != null) {
                        throw c0011lB;
                    }
                } else if (j3 < o()) {
                    mVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0195, code lost:
    
        p(r16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0198, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.k():void");
    }

    public final m l(long j2, m mVar) {
        Object objD;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j3;
        m mVar2 = g.f241a;
        f fVar = f.f240j;
        loop0: while (true) {
            objD = K0.a.d(j2, mVar);
            if (!K0.a.g(objD)) {
                K0.s sVarE = K0.a.e(objD);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f234i;
                    K0.s sVar = (K0.s) atomicReferenceFieldUpdater.get(this);
                    if (sVar.f404c >= sVarE.f404c) {
                        break loop0;
                    }
                    if (!sVarE.i()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, sVar, sVarE)) {
                        if (atomicReferenceFieldUpdater.get(this) != sVar) {
                            if (sVarE.e()) {
                                sVarE.d();
                            }
                        }
                    }
                    if (sVar.e()) {
                        sVar.d();
                    }
                }
            } else {
                break;
            }
        }
        if (K0.a.g(objD)) {
            h();
            if (mVar.f404c * g.f242b >= o()) {
                return null;
            }
            mVar.a();
            return null;
        }
        m mVar3 = (m) K0.a.e(objD);
        boolean zS = s();
        long j4 = mVar3.f404c;
        if (!zS && j2 <= f232f.get(this) / g.f242b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f235j;
                K0.s sVar2 = (K0.s) atomicReferenceFieldUpdater2.get(this);
                if (sVar2.f404c >= j4 || !mVar3.i()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, sVar2, mVar3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != sVar2) {
                        if (mVar3.e()) {
                            mVar3.d();
                        }
                    }
                }
                if (sVar2.e()) {
                    sVar2.d();
                }
            }
        }
        if (j4 <= j2) {
            return mVar3;
        }
        long j5 = g.f242b * j4;
        do {
            atomicLongFieldUpdater = f231e;
            j3 = atomicLongFieldUpdater.get(this);
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j3, j5));
        if (j4 * g.f242b >= o()) {
            return null;
        }
        mVar3.a();
        return null;
    }

    public final Throwable m() {
        return (Throwable) f236k.get(this);
    }

    public final Throwable n() {
        Throwable thM = m();
        return thM == null ? new o("Channel was closed") : thM;
    }

    public final long o() {
        return d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c6, code lost:
    
        r0 = (H0.m) ((K0.b) K0.b.f377b.get(r0));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q(long r19, boolean r21) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.q(long, boolean):boolean");
    }

    public boolean r() {
        return false;
    }

    public final boolean s() {
        long j2 = f232f.get(this);
        return j2 == 0 || j2 == Long.MAX_VALUE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(long r5, H0.m r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.f404c
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            K0.b r0 = r7.b()
            H0.m r0 = (H0.m) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.c()
            if (r5 == 0) goto L22
            K0.b r5 = r7.b()
            H0.m r5 = (H0.m) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = H0.e.f235j
            java.lang.Object r6 = r5.get(r4)
            K0.s r6 = (K0.s) r6
            long r0 = r6.f404c
            long r2 = r7.f404c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.i()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r5 = r6.e()
            if (r5 == 0) goto L49
            r6.d()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.e()
            if (r5 == 0) goto L22
            r7.d()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.t(long, H0.m):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        r3 = (H0.m) r3.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0193, code lost:
    
        if (r3 != null) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.e.toString():java.lang.String");
    }

    public final Object u(Object obj, InterfaceC0311d interfaceC0311d) throws Throwable {
        C0011l c0011lB;
        C0004e c0004e = new C0004e(1, P0.b.q(interfaceC0311d));
        B bP = c0004e.p();
        if (bP != null && !(C0004e.h.get(c0004e) instanceof W)) {
            bP.a();
            C0004e.f106i.set(c0004e, V.f99a);
        }
        w0.l lVar = this.f239c;
        if (lVar == null || (c0011lB = K0.a.b(lVar, obj, null)) == null) {
            c0004e.h(AbstractC0062a.m(n()));
        } else {
            P0.b.a(c0011lB, n());
            c0004e.h(AbstractC0062a.m(c0011lB));
        }
        Object objO = c0004e.o();
        return objO == EnumC0322a.f2519b ? objO : C0235h.f2029a;
    }

    public final void v(e0 e0Var, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thN;
        if (e0Var instanceof InterfaceC0003d) {
            InterfaceC0311d interfaceC0311d = (InterfaceC0311d) e0Var;
            if (z2) {
                thN = m();
                if (thN == null) {
                    thN = new n("Channel was closed");
                }
            } else {
                thN = n();
            }
            interfaceC0311d.h(AbstractC0062a.m(thN));
            return;
        }
        if (!(e0Var instanceof c)) {
            throw new IllegalStateException(("Unexpected waiter: " + e0Var).toString());
        }
        c cVar = (c) e0Var;
        C0004e c0004e = cVar.f230c;
        x0.g.b(c0004e);
        cVar.f230c = null;
        cVar.f229b = g.f250l;
        Throwable thM = cVar.d.m();
        if (thM == null) {
            c0004e.h(Boolean.FALSE);
        } else {
            c0004e.h(AbstractC0062a.m(thM));
        }
    }

    public final boolean w(Object obj, Object obj2) {
        if (!(obj instanceof c)) {
            if (obj instanceof InterfaceC0003d) {
                x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
                return g.a((InterfaceC0003d) obj, obj2, this.f239c != null ? new d(3, this, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel.BufferedChannelIterator<E of kotlinx.coroutines.channels.BufferedChannel>", obj);
        c cVar = (c) obj;
        C0004e c0004e = cVar.f230c;
        x0.g.b(c0004e);
        cVar.f230c = null;
        cVar.f229b = obj2;
        Boolean bool = Boolean.TRUE;
        w0.l lVar = cVar.d.f239c;
        return g.a(c0004e, bool, lVar != null ? new b(lVar, obj2) : null);
    }

    public final Object y(m mVar, int i2, long j2, c cVar) {
        Object objK = mVar.k(i2);
        AtomicReferenceArray atomicReferenceArray = mVar.f264f;
        AtomicLongFieldUpdater atomicLongFieldUpdater = d;
        if (objK == null) {
            if (j2 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (cVar == null) {
                    return g.f252n;
                }
                if (mVar.j(objK, i2, cVar)) {
                    k();
                    return g.f251m;
                }
            }
        } else if (objK == g.d && mVar.j(objK, i2, g.f247i)) {
            k();
            Object obj = atomicReferenceArray.get(i2 * 2);
            mVar.m(i2, null);
            return obj;
        }
        while (true) {
            Object objK2 = mVar.k(i2);
            if (objK2 == null || objK2 == g.f244e) {
                if (j2 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (mVar.j(objK2, i2, g.h)) {
                        k();
                        return g.f253o;
                    }
                } else {
                    if (cVar == null) {
                        return g.f252n;
                    }
                    if (mVar.j(objK2, i2, cVar)) {
                        k();
                        return g.f251m;
                    }
                }
            } else if (objK2 != g.d) {
                K0.u uVar = g.f248j;
                if (objK2 == uVar) {
                    return g.f253o;
                }
                if (objK2 == g.h) {
                    return g.f253o;
                }
                if (objK2 == g.f250l) {
                    k();
                    return g.f253o;
                }
                if (objK2 != g.f246g && mVar.j(objK2, i2, g.f245f)) {
                    boolean z2 = objK2 instanceof u;
                    if (z2) {
                        objK2 = ((u) objK2).f267a;
                    }
                    if (x(objK2)) {
                        mVar.n(i2, g.f247i);
                        k();
                        Object obj2 = atomicReferenceArray.get(i2 * 2);
                        mVar.m(i2, null);
                        return obj2;
                    }
                    mVar.n(i2, uVar);
                    mVar.h();
                    if (z2) {
                        k();
                    }
                    return g.f253o;
                }
            } else if (mVar.j(objK2, i2, g.f247i)) {
                k();
                Object obj3 = atomicReferenceArray.get(i2 * 2);
                mVar.m(i2, null);
                return obj3;
            }
        }
    }

    public final int z(m mVar, int i2, Object obj, long j2, Object obj2, boolean z2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            Object objK = mVar.k(i2);
            if (objK == null) {
                if (!e(j2) || z2) {
                    if (z2) {
                        if (mVar.j(null, i2, g.f248j)) {
                            mVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (mVar.j(null, i2, obj2)) {
                            return 2;
                        }
                    }
                } else if (mVar.j(null, i2, g.d)) {
                    return 1;
                }
            } else {
                if (objK != g.f244e) {
                    K0.u uVar = g.f249k;
                    if (objK == uVar) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (objK == g.h) {
                        mVar.m(i2, null);
                        return 5;
                    }
                    if (objK == g.f250l) {
                        mVar.m(i2, null);
                        h();
                        return 4;
                    }
                    mVar.m(i2, null);
                    if (objK instanceof u) {
                        objK = ((u) objK).f267a;
                    }
                    if (w(objK, obj)) {
                        mVar.n(i2, g.f247i);
                        return 0;
                    }
                    if (mVar.f264f.getAndSet((i2 * 2) + 1, uVar) == uVar) {
                        return 5;
                    }
                    mVar.l(i2, true);
                    return 5;
                }
                if (mVar.j(objK, i2, g.d)) {
                    return 1;
                }
            }
        }
    }
}
