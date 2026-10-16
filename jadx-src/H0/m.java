package H0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class m extends K0.s {

    /* renamed from: e, reason: collision with root package name */
    public final e f263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicReferenceArray f264f;

    public m(long j2, m mVar, e eVar, int i2) {
        super(j2, mVar, i2);
        this.f263e = eVar;
        this.f264f = new AtomicReferenceArray(g.f242b * 2);
    }

    @Override // K0.s
    public final int f() {
        return g.f242b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x005b, code lost:
    
        m(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0060, code lost:
    
        x0.g.b(r4);
        r7 = r4.f239c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0065, code lost:
    
        if (r7 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0067, code lost:
    
        K0.a.a(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    @Override // K0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(int r7, n0.InterfaceC0316i r8) {
        /*
            r6 = this;
            int r0 = H0.g.f242b
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r6.f264f
            int r2 = r7 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r6.k(r7)
            boolean r3 = r2 instanceof F0.e0
            H0.e r4 = r6.f263e
            r5 = 0
            if (r3 != 0) goto L6b
            boolean r3 = r2 instanceof H0.u
            if (r3 == 0) goto L22
            goto L6b
        L22:
            K0.u r3 = H0.g.f248j
            if (r2 == r3) goto L5b
            K0.u r3 = H0.g.f249k
            if (r2 != r3) goto L2b
            goto L5b
        L2b:
            K0.u r3 = H0.g.f246g
            if (r2 == r3) goto L12
            K0.u r3 = H0.g.f245f
            if (r2 != r3) goto L34
            goto L12
        L34:
            K0.u r7 = H0.g.f247i
            if (r2 == r7) goto L5a
            K0.u r7 = H0.g.d
            if (r2 != r7) goto L3d
            goto L5a
        L3d:
            K0.u r7 = H0.g.f250l
            if (r2 != r7) goto L42
            return
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            return
        L5b:
            r6.m(r7, r5)
            if (r1 == 0) goto L6a
            x0.g.b(r4)
            w0.l r7 = r4.f239c
            if (r7 == 0) goto L6a
            K0.a.a(r7, r0, r8)
        L6a:
            return
        L6b:
            if (r1 == 0) goto L70
            K0.u r3 = H0.g.f248j
            goto L72
        L70:
            K0.u r3 = H0.g.f249k
        L72:
            boolean r2 = r6.j(r2, r7, r3)
            if (r2 == 0) goto L12
            r6.m(r7, r5)
            r2 = r1 ^ 1
            r6.l(r7, r2)
            if (r1 == 0) goto L8c
            x0.g.b(r4)
            w0.l r7 = r4.f239c
            if (r7 == 0) goto L8c
            K0.a.a(r7, r0, r8)
        L8c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.m.g(int, n0.i):void");
    }

    public final boolean j(Object obj, int i2, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f264f;
        int i3 = (i2 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i3, obj, obj2)) {
            if (atomicReferenceArray.get(i3) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i2) {
        return this.f264f.get((i2 * 2) + 1);
    }

    public final void l(int i2, boolean z2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater2;
        long j3;
        if (z2) {
            e eVar = this.f263e;
            x0.g.b(eVar);
            long j4 = (this.f404c * g.f242b) + i2;
            if (!eVar.s()) {
                do {
                    atomicLongFieldUpdater = e.f232f;
                } while (atomicLongFieldUpdater.get(eVar) <= j4);
                int i3 = g.f243c;
                int i4 = 0;
                while (true) {
                    AtomicLongFieldUpdater atomicLongFieldUpdater3 = e.f233g;
                    if (i4 < i3) {
                        long j5 = atomicLongFieldUpdater.get(eVar);
                        if (j5 == (atomicLongFieldUpdater3.get(eVar) & 4611686018427387903L) && j5 == atomicLongFieldUpdater.get(eVar)) {
                            break;
                        } else {
                            i4++;
                        }
                    } else {
                        do {
                            j2 = atomicLongFieldUpdater3.get(eVar);
                        } while (!atomicLongFieldUpdater3.compareAndSet(eVar, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                        while (true) {
                            long j6 = atomicLongFieldUpdater.get(eVar);
                            atomicLongFieldUpdater2 = e.f233g;
                            long j7 = atomicLongFieldUpdater2.get(eVar);
                            long j8 = j7 & 4611686018427387903L;
                            boolean z3 = (j7 & 4611686018427387904L) != 0;
                            if (j6 == j8 && j6 == atomicLongFieldUpdater.get(eVar)) {
                                break;
                            } else if (!z3) {
                                atomicLongFieldUpdater2.compareAndSet(eVar, j7, j8 + 4611686018427387904L);
                            }
                        }
                        do {
                            j3 = atomicLongFieldUpdater2.get(eVar);
                        } while (!atomicLongFieldUpdater2.compareAndSet(eVar, j3, j3 & 4611686018427387903L));
                    }
                }
            }
        }
        h();
    }

    public final void m(int i2, Object obj) {
        this.f264f.set(i2 * 2, obj);
    }

    public final void n(int i2, K0.u uVar) {
        this.f264f.set((i2 * 2) + 1, uVar);
    }
}
