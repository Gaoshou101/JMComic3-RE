package K0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f394e = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_next$volatile");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f395f = AtomicLongFieldUpdater.newUpdater(m.class, "_state$volatile");

    /* renamed from: g, reason: collision with root package name */
    public static final u f396g = new u("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a, reason: collision with root package name */
    public final int f397a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f398b;

    /* renamed from: c, reason: collision with root package name */
    public final int f399c;
    public final /* synthetic */ AtomicReferenceArray d;

    public m(int i2, boolean z2) {
        this.f397a = i2;
        this.f398b = z2;
        int i3 = i2 - 1;
        this.f399c = i3;
        this.d = new AtomicReferenceArray(i2);
        if (i3 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i2 & i3) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.Runnable r14) {
        /*
            r13 = this;
        L0:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r6 = K0.m.f395f
            long r2 = r6.get(r13)
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r7 = 0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r1 = 1
            if (r0 == 0) goto L19
            r4 = 2305843009213693952(0x2000000000000000, double:1.4916681462400413E-154)
            long r2 = r2 & r4
            int r14 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r14 == 0) goto L18
            r1 = 2
        L18:
            return r1
        L19:
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            int r0 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r10 = (int) r4
            int r4 = r10 + 2
            int r11 = r13.f399c
            r4 = r4 & r11
            r5 = r0 & r11
            if (r4 != r5) goto L32
            return r1
        L32:
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r13.d
            boolean r4 = r13.f398b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L51
            r4 = r10 & r11
            java.lang.Object r4 = r12.get(r4)
            if (r4 == 0) goto L51
            r2 = 1024(0x400, float:1.435E-42)
            int r3 = r13.f397a
            if (r3 < r2) goto L50
            int r10 = r10 - r0
            r0 = r10 & r5
            int r2 = r3 >> 1
            if (r0 <= r2) goto L0
        L50:
            return r1
        L51:
            int r0 = r10 + 1
            r0 = r0 & r5
            r4 = -1152921503533105153(0xf00000003fffffff, double:-3.1050369248997324E231)
            long r4 = r4 & r2
            long r0 = (long) r0
            long r0 = r0 << r9
            long r4 = r4 | r0
            r0 = r6
            r1 = r13
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L0
            r0 = r10 & r11
            r12.set(r0, r14)
            r0 = r13
        L6b:
            long r1 = r6.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L94
            K0.m r0 = r0.c()
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r0.d
            int r2 = r0.f399c
            r2 = r2 & r10
            java.lang.Object r3 = r1.get(r2)
            boolean r4 = r3 instanceof K0.l
            if (r4 == 0) goto L91
            K0.l r3 = (K0.l) r3
            int r3 = r3.f393a
            if (r3 != r10) goto L91
            r1.set(r2, r14)
            goto L92
        L91:
            r0 = 0
        L92:
            if (r0 != 0) goto L6b
        L94:
            r14 = 0
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.m.a(java.lang.Runnable):int");
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        do {
            atomicLongFieldUpdater = f395f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, 2305843009213693952L | j2));
        return true;
    }

    public final m c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        while (true) {
            atomicLongFieldUpdater = f395f;
            j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                break;
            }
            long j3 = j2 | 1152921504606846976L;
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j3)) {
                j2 = j3;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f394e;
            m mVar = (m) atomicReferenceFieldUpdater.get(this);
            if (mVar != null) {
                return mVar;
            }
            m mVar2 = new m(this.f397a * 2, this.f398b);
            int i2 = (int) (1073741823 & j2);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            while (true) {
                int i4 = this.f399c;
                int i5 = i2 & i4;
                if (i5 == (i4 & i3)) {
                    break;
                }
                Object lVar = this.d.get(i5);
                if (lVar == null) {
                    lVar = new l(i2);
                }
                mVar2.d.set(mVar2.f399c & i2, lVar);
                i2++;
            }
            atomicLongFieldUpdater.set(mVar2, (-1152921504606846977L) & j2);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mVar2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f395f;
            long j2 = atomicLongFieldUpdater.get(this);
            if ((j2 & 1152921504606846976L) != 0) {
                return f396g;
            }
            int i2 = (int) (j2 & 1073741823);
            int i3 = this.f399c;
            int i4 = i2 & i3;
            if ((((int) ((1152921503533105152L & j2) >> 30)) & i3) == i4) {
                return null;
            }
            AtomicReferenceArray atomicReferenceArray = this.d;
            Object obj = atomicReferenceArray.get(i4);
            boolean z2 = this.f398b;
            if (obj == null) {
                if (z2) {
                    return null;
                }
            } else {
                if (obj instanceof l) {
                    return null;
                }
                long j3 = (i2 + 1) & 1073741823;
                if (atomicLongFieldUpdater.compareAndSet(this, j2, (j2 & (-1073741824)) | j3)) {
                    atomicReferenceArray.set(i4, null);
                    return obj;
                }
                if (z2) {
                    m mVarC = this;
                    while (true) {
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f395f;
                        long j4 = atomicLongFieldUpdater2.get(mVarC);
                        int i5 = (int) (j4 & 1073741823);
                        if ((j4 & 1152921504606846976L) != 0) {
                            mVarC = mVarC.c();
                        } else {
                            if (atomicLongFieldUpdater2.compareAndSet(mVarC, j4, (j4 & (-1073741824)) | j3)) {
                                mVarC.d.set(mVarC.f399c & i5, null);
                                mVarC = null;
                            } else {
                                continue;
                            }
                        }
                        if (mVarC == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
