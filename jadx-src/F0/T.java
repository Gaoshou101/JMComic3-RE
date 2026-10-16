package F0;

import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n0.C0309b;
import n0.C0317j;
import n0.InterfaceC0314g;
import n0.InterfaceC0315h;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public class T implements L, X {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f97b = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_state$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f98c = AtomicReferenceFieldUpdater.newUpdater(T.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public T(boolean z2) {
        this._state$volatile = z2 ? AbstractC0019u.f132i : AbstractC0019u.h;
    }

    public static C0008i C(K0.j jVar) {
        while (jVar.i()) {
            K0.j jVarF = jVar.f();
            if (jVarF == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K0.j.f390b;
                Object obj = atomicReferenceFieldUpdater.get(jVar);
                while (true) {
                    jVar = (K0.j) obj;
                    if (!jVar.i()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(jVar);
                }
            } else {
                jVar = jVarF;
            }
        }
        while (true) {
            jVar = jVar.h();
            if (!jVar.i()) {
                if (jVar instanceof C0008i) {
                    return (C0008i) jVar;
                }
                if (jVar instanceof U) {
                    return null;
                }
            }
        }
    }

    public static String I(Object obj) {
        if (!(obj instanceof S)) {
            return obj instanceof I ? ((I) obj).b() ? "Active" : "New" : obj instanceof C0010k ? "Cancelled" : "Completed";
        }
        S s2 = (S) obj;
        return s2.e() ? "Cancelling" : S.f94b.get(s2) != 0 ? "Completing" : "Active";
    }

    public boolean A() {
        return false;
    }

    public final Object B(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Object objJ;
        do {
            objJ = J(f97b.get(this), obj);
            if (objJ == AbstractC0019u.f128c) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0010k c0010k = obj instanceof C0010k ? (C0010k) obj : null;
                throw new IllegalStateException(str, c0010k != null ? c0010k.f117a : null);
            }
        } while (objJ == AbstractC0019u.f129e);
        return objJ;
    }

    public final void D(U u2, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        u2.e(new K0.h(4), 4);
        Object obj = K0.j.f389a.get(u2);
        x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj);
        C0011l c0011l = null;
        for (K0.j jVarH = (K0.j) obj; !jVarH.equals(u2); jVarH = jVarH.h()) {
            if ((jVarH instanceof P) && ((P) jVarH).k()) {
                try {
                    ((P) jVarH).l(th);
                } catch (Throwable th2) {
                    if (c0011l != null) {
                        P0.b.a(c0011l, th2);
                    } else {
                        c0011l = new C0011l("Exception in completion handler " + jVarH + " for " + this, th2);
                    }
                }
            }
        }
        if (c0011l != null) {
            x(c0011l);
        }
        o(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [F0.H] */
    public final void G(C c2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u2 = new U();
        if (!c2.f81a) {
            u2 = new H(u2);
        }
        do {
            atomicReferenceFieldUpdater = f97b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c2, u2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c2);
    }

    public final void H(P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        U u2 = new U();
        p2.getClass();
        K0.j.f390b.set(u2, p2);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = K0.j.f389a;
        atomicReferenceFieldUpdater2.set(u2, p2);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(p2) == p2) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(p2, p2, u2)) {
                    if (atomicReferenceFieldUpdater2.get(p2) != p2) {
                        break;
                    }
                }
                u2.g(p2);
                break loop0;
            }
            break;
        }
        K0.j jVarH = p2.h();
        do {
            atomicReferenceFieldUpdater = f97b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, p2, jVarH)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == p2);
    }

    public final Object J(Object obj, Object obj2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof I)) {
            return AbstractC0019u.f128c;
        }
        if (((obj instanceof C) || (obj instanceof P)) && !(obj instanceof C0008i) && !(obj2 instanceof C0010k)) {
            I i2 = (I) obj;
            Object j2 = obj2 instanceof I ? new J((I) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f97b;
                if (atomicReferenceFieldUpdater.compareAndSet(this, i2, j2)) {
                    E(obj2);
                    q(i2, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == i2);
            return AbstractC0019u.f129e;
        }
        I i3 = (I) obj;
        U uV = v(i3);
        if (uV == null) {
            return AbstractC0019u.f129e;
        }
        S s2 = i3 instanceof S ? (S) i3 : null;
        if (s2 == null) {
            s2 = new S(uV, null);
        }
        synchronized (s2) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = S.f94b;
                if (atomicIntegerFieldUpdater.get(s2) != 0) {
                    return AbstractC0019u.f128c;
                }
                atomicIntegerFieldUpdater.set(s2, 1);
                if (s2 != i3) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f97b;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, i3, s2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != i3) {
                            return AbstractC0019u.f129e;
                        }
                    }
                }
                boolean zE = s2.e();
                C0010k c0010k = obj2 instanceof C0010k ? (C0010k) obj2 : null;
                if (c0010k != null) {
                    s2.a(c0010k.f117a);
                }
                Throwable thC = zE ? null : s2.c();
                if (thC != null) {
                    D(uV, thC);
                }
                C0008i c0008iC = C(uV);
                if (c0008iC != null && K(s2, c0008iC, obj2)) {
                    return AbstractC0019u.d;
                }
                uV.e(new K0.h(2), 2);
                C0008i c0008iC2 = C(uV);
                return (c0008iC2 == null || !K(s2, c0008iC2, obj2)) ? s(s2, obj2) : AbstractC0019u.d;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean K(S s2, C0008i c0008i, Object obj) {
        while (AbstractC0019u.e(c0008i.f112e, false, new Q(this, s2, c0008i, obj)) == V.f99a) {
            c0008i = C(c0008i);
            if (c0008i == null) {
                return false;
            }
        }
        return true;
    }

    @Override // F0.L
    public void a(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (cancellationException == null) {
            cancellationException = new M(p(), null, this);
        }
        n(cancellationException);
    }

    @Override // F0.L
    public boolean b() {
        Object obj = f97b.get(this);
        return (obj instanceof I) && ((I) obj).b();
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        return AbstractC0062a.H(this, interfaceC0315h);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i e(InterfaceC0316i interfaceC0316i) {
        x0.g.e("context", interfaceC0316i);
        return interfaceC0316i == C0317j.f2507b ? this : (InterfaceC0316i) interfaceC0316i.j(this, C0309b.f2502e);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        return AbstractC0062a.s(this, interfaceC0315h);
    }

    @Override // n0.InterfaceC0314g
    public final InterfaceC0315h getKey() {
        return C0016q.f123c;
    }

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, w0.p pVar) {
        return pVar.f(obj, this);
    }

    public void l(Object obj) {
        k(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0067, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.Object r10) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.T.m(java.lang.Object):boolean");
    }

    public void n(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m(cancellationException);
    }

    public final boolean o(Throwable th) {
        if (A()) {
            return true;
        }
        boolean z2 = th instanceof CancellationException;
        InterfaceC0007h interfaceC0007h = (InterfaceC0007h) f98c.get(this);
        return (interfaceC0007h == null || interfaceC0007h == V.f99a) ? z2 : interfaceC0007h.c(th) || z2;
    }

    public String p() {
        return "Job was cancelled";
    }

    public final void q(I i2, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f98c;
        InterfaceC0007h interfaceC0007h = (InterfaceC0007h) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0007h != null) {
            interfaceC0007h.a();
            atomicReferenceFieldUpdater.set(this, V.f99a);
        }
        C0011l c0011l = null;
        C0010k c0010k = obj instanceof C0010k ? (C0010k) obj : null;
        Throwable th = c0010k != null ? c0010k.f117a : null;
        if (i2 instanceof P) {
            try {
                ((P) i2).l(th);
                return;
            } catch (Throwable th2) {
                x(new C0011l("Exception in completion handler " + i2 + " for " + this, th2));
                return;
            }
        }
        U uD = i2.d();
        if (uD != null) {
            uD.e(new K0.h(1), 1);
            Object obj2 = K0.j.f389a.get(uD);
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode", obj2);
            for (K0.j jVarH = (K0.j) obj2; !jVarH.equals(uD); jVarH = jVarH.h()) {
                if (jVarH instanceof P) {
                    try {
                        ((P) jVarH).l(th);
                    } catch (Throwable th3) {
                        if (c0011l != null) {
                            P0.b.a(c0011l, th3);
                        } else {
                            c0011l = new C0011l("Exception in completion handler " + jVarH + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0011l != null) {
                x(c0011l);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    public final Throwable r(Object obj) {
        CancellationException cancellationExceptionC;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        T t2 = (T) ((X) obj);
        Object obj2 = f97b.get(t2);
        if (obj2 instanceof S) {
            cancellationExceptionC = ((S) obj2).c();
        } else if (obj2 instanceof C0010k) {
            cancellationExceptionC = ((C0010k) obj2).f117a;
        } else {
            if (obj2 instanceof I) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException m2 = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        if (m2 == null) {
            m2 = new M("Parent job is ".concat(I(obj2)), cancellationExceptionC, t2);
        }
        return m2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object s(S s2, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable m2 = null;
        C0010k c0010k = obj instanceof C0010k ? (C0010k) obj : null;
        Throwable th = c0010k != null ? c0010k.f117a : null;
        synchronized (s2) {
            s2.e();
            ArrayList<Throwable> arrayListF = s2.f(th);
            if (!arrayListF.isEmpty()) {
                Iterator it = arrayListF.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(((Throwable) next) instanceof CancellationException)) {
                        m2 = next;
                        break;
                    }
                }
                m2 = m2;
                if (m2 == null) {
                    m2 = (Throwable) arrayListF.get(0);
                }
            } else if (s2.e()) {
                m2 = new M(p(), null, this);
            }
            if (m2 != null && arrayListF.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListF.size()));
                for (Throwable th2 : arrayListF) {
                    if (th2 != m2 && th2 != m2 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        P0.b.a(m2, th2);
                    }
                }
            }
        }
        if (m2 != null && m2 != th) {
            obj = new C0010k(m2, false);
        }
        if (m2 != null && (o(m2) || w(m2))) {
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally", obj);
            C0010k.f116b.compareAndSet((C0010k) obj, 0, 1);
        }
        E(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f97b;
        Object j2 = obj instanceof I ? new J((I) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, s2, j2) && atomicReferenceFieldUpdater.get(this) == s2) {
        }
        q(s2, obj);
        return obj;
    }

    public final CancellationException t() {
        CancellationException cancellationException;
        Object obj = f97b.get(this);
        if (!(obj instanceof S)) {
            if (obj instanceof I) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0010k)) {
                return new M(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0010k) obj).f117a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new M(p(), th, this) : cancellationException;
        }
        Throwable thC = ((S) obj).c();
        if (thC == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thC instanceof CancellationException ? (CancellationException) thC : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = p();
        }
        return new M(strConcat, thC, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + I(f97b.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0019u.b(this));
        return sb.toString();
    }

    public boolean u() {
        return true;
    }

    public final U v(I i2) {
        U uD = i2.d();
        if (uD != null) {
            return uD;
        }
        if (i2 instanceof C) {
            return new U();
        }
        if (i2 instanceof P) {
            H((P) i2);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + i2).toString());
    }

    public boolean w(Throwable th) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        r3 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [F0.P, F0.i, K0.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [F0.B, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r5v12, types: [F0.U, K0.j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y(F0.L r9) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: F0.T.y(F0.L):void");
    }

    public final B z(boolean z2, P p2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        V v2;
        boolean z3;
        boolean zE;
        p2.d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f97b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z4 = obj instanceof C;
            v2 = V.f99a;
            z3 = true;
            if (!z4) {
                if (!(obj instanceof I)) {
                    z3 = false;
                    break;
                }
                I i2 = (I) obj;
                U uD = i2.d();
                if (uD == null) {
                    x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.JobNode", obj);
                    H((P) obj);
                } else {
                    if (p2.k()) {
                        S s2 = i2 instanceof S ? (S) i2 : null;
                        Throwable thC = s2 != null ? s2.c() : null;
                        if (thC != null) {
                            if (z2) {
                                p2.l(thC);
                            }
                            return v2;
                        }
                        zE = uD.e(p2, 5);
                    } else {
                        zE = uD.e(p2, 1);
                    }
                    if (zE) {
                        break;
                    }
                }
            } else {
                C c2 = (C) obj;
                if (c2.f81a) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                G(c2);
            }
        }
        if (z3) {
            return p2;
        }
        if (z2) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0010k c0010k = obj2 instanceof C0010k ? (C0010k) obj2 : null;
            p2.l(c0010k != null ? c0010k.f117a : null);
        }
        return v2;
    }

    public void F() {
    }

    public void E(Object obj) {
    }

    public void k(Object obj) {
    }

    public void x(C0011l c0011l) {
        throw c0011l;
    }
}
