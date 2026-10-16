package K0;

import F0.AbstractC0019u;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f389a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f390b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f391c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public final boolean e(j jVar, int i2) {
        while (true) {
            j jVarF = f();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f390b;
            if (jVarF == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    jVarF = (j) obj;
                    if (!jVarF.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVarF);
                }
            }
            if (jVarF instanceof h) {
                return (((h) jVarF).d & i2) == 0 && jVarF.e(jVar, i2);
            }
            atomicReferenceFieldUpdater.set(jVar, jVarF);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f389a;
            atomicReferenceFieldUpdater2.set(jVar, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(jVarF, this, jVar)) {
                if (atomicReferenceFieldUpdater2.get(jVarF) != this) {
                    break;
                }
            }
            jVar.g(this);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        r6 = ((K0.p) r6).f402a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final K0.j f() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = K0.j.f390b
            java.lang.Object r1 = r0.get(r9)
            K0.j r1 = (K0.j) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = K0.j.f389a
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.i()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof K0.p
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            K0.p r6 = (K0.p) r6
            K0.j r6 = r6.f402a
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            K0.j r3 = (K0.j) r3
            goto Lb
        L4b:
            java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"
            x0.g.c(r4, r6)
            r4 = r6
            K0.j r4 = (K0.j) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: K0.j.f():K0.j");
    }

    public final void g(j jVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f390b;
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (f389a.get(this) != jVar) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(jVar, jVar2, this)) {
                if (atomicReferenceFieldUpdater.get(jVar) != jVar2) {
                    break;
                }
            }
            if (i()) {
                jVar.f();
                return;
            }
            return;
        }
    }

    public final j h() {
        j jVar;
        Object obj = f389a.get(this);
        p pVar = obj instanceof p ? (p) obj : null;
        if (pVar != null && (jVar = pVar.f402a) != null) {
            return jVar;
        }
        x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        return (j) obj;
    }

    public boolean i() {
        return f389a.get(this) instanceof p;
    }

    public String toString() {
        return new i(this) + '@' + AbstractC0019u.b(this);
    }
}
