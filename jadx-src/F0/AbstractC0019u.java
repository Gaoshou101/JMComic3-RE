package F0;

import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0232e;
import k0.C0235h;
import n0.C0312e;
import n0.C0317j;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;
import o0.EnumC0322a;
import p0.AbstractC0326a;

/* renamed from: F0.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0019u {

    /* renamed from: a, reason: collision with root package name */
    public static final K0.u f126a = new K0.u("RESUME_TOKEN", 0);

    /* renamed from: b, reason: collision with root package name */
    public static final K0.u f127b = new K0.u("CLOSED_EMPTY", 0);

    /* renamed from: c, reason: collision with root package name */
    public static final K0.u f128c = new K0.u("COMPLETING_ALREADY", 0);
    public static final K0.u d = new K0.u("COMPLETING_WAITING_CHILDREN", 0);

    /* renamed from: e, reason: collision with root package name */
    public static final K0.u f129e = new K0.u("COMPLETING_RETRY", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final K0.u f130f = new K0.u("TOO_LATE_TO_CANCEL", 0);

    /* renamed from: g, reason: collision with root package name */
    public static final K0.u f131g = new K0.u("SEALED", 0);
    public static final C h = new C(false);

    /* renamed from: i, reason: collision with root package name */
    public static final C f132i = new C(true);

    public static final InterfaceC0316i a(InterfaceC0316i interfaceC0316i, InterfaceC0316i interfaceC0316i2, boolean z2) {
        Boolean bool = Boolean.FALSE;
        boolean zBooleanValue = ((Boolean) interfaceC0316i.j(bool, new C0012m(0))).booleanValue();
        boolean zBooleanValue2 = ((Boolean) interfaceC0316i2.j(bool, new C0012m(0))).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return interfaceC0316i.e(interfaceC0316i2);
        }
        C0317j c0317j = C0317j.f2507b;
        InterfaceC0316i interfaceC0316i3 = (InterfaceC0316i) interfaceC0316i.j(c0317j, new C0012m(1));
        Object objJ = interfaceC0316i2;
        if (zBooleanValue2) {
            objJ = interfaceC0316i2.j(c0317j, new C0012m(2));
        }
        return interfaceC0316i3.e((InterfaceC0316i) objJ);
    }

    public static final String b(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final C0004e c(InterfaceC0311d interfaceC0311d) {
        C0004e c0004e;
        C0004e c0004e2;
        if (!(interfaceC0311d instanceof K0.f)) {
            return new C0004e(1, interfaceC0311d);
        }
        K0.f fVar = (K0.f) interfaceC0311d;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K0.f.f381i;
            Object obj = atomicReferenceFieldUpdater.get(fVar);
            K0.u uVar = K0.a.f372c;
            c0004e = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(fVar, uVar);
                c0004e2 = null;
                break;
            }
            if (obj instanceof C0004e) {
                while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, uVar)) {
                    if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                        break;
                    }
                }
                c0004e2 = (C0004e) obj;
                break loop0;
            }
            if (obj != uVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (c0004e2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0004e.h;
            Object obj2 = atomicReferenceFieldUpdater2.get(c0004e2);
            if (!(obj2 instanceof C0009j) || ((C0009j) obj2).f115c == null) {
                C0004e.f105g.set(c0004e2, 536870911);
                atomicReferenceFieldUpdater2.set(c0004e2, C0001b.f101a);
                c0004e = c0004e2;
            } else {
                c0004e2.m();
            }
            if (c0004e != null) {
                return c0004e;
            }
        }
        return new C0004e(2, interfaceC0311d);
    }

    public static final void d(Throwable th, InterfaceC0316i interfaceC0316i) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            G0.b bVar = (G0.b) interfaceC0316i.g(C0016q.f122b);
            if (bVar != null) {
                bVar.d(th, interfaceC0316i);
            } else {
                K0.a.f(th, interfaceC0316i);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                P0.b.a(runtimeException, th);
                th = runtimeException;
            }
            K0.a.f(th, interfaceC0316i);
        }
    }

    public static final B e(L l2, boolean z2, P p2) {
        if (l2 instanceof T) {
            return ((T) l2).z(z2, p2);
        }
        boolean zK = p2.k();
        O o2 = new O(1, p2, P.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        return ((T) l2).z(z2, zK ? new K(o2) : new C0006g(1, o2));
    }

    public static final boolean f(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static Y g(r rVar, w0.p pVar) {
        C0317j c0317j = C0317j.f2507b;
        EnumC0017s enumC0017s = EnumC0017s.f124b;
        InterfaceC0316i interfaceC0316iA = a(rVar.f(), c0317j, true);
        M0.e eVar = A.f80a;
        if (interfaceC0316iA != eVar && interfaceC0316iA.g(C0312e.f2506b) == null) {
            interfaceC0316iA = interfaceC0316iA.e(eVar);
        }
        Y y2 = new Y(interfaceC0316iA, true);
        y2.N(enumC0017s, y2, pVar);
        return y2;
    }

    public static final Object h(Object obj) {
        return obj instanceof C0010k ? AbstractC0062a.m(((C0010k) obj).f117a) : obj;
    }

    public static final void i(C0004e c0004e, InterfaceC0311d interfaceC0311d, boolean z2) {
        Object obj = C0004e.h.get(c0004e);
        Throwable thE = c0004e.e(obj);
        Object objM = thE != null ? AbstractC0062a.m(thE) : c0004e.f(obj);
        if (!z2) {
            interfaceC0311d.h(objM);
            return;
        }
        x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>", interfaceC0311d);
        K0.f fVar = (K0.f) interfaceC0311d;
        p0.c cVar = fVar.f383f;
        InterfaceC0316i context = cVar.getContext();
        Object objN = K0.a.n(context, fVar.h);
        c0 c0VarK = objN != K0.a.d ? k(cVar, context, objN) : null;
        try {
            cVar.h(objM);
        } finally {
            if (c0VarK == null || c0VarK.O()) {
                K0.a.i(context, objN);
            }
        }
    }

    public static final String j(InterfaceC0311d interfaceC0311d) {
        Object objM;
        if (interfaceC0311d instanceof K0.f) {
            return ((K0.f) interfaceC0311d).toString();
        }
        try {
            objM = interfaceC0311d + '@' + b(interfaceC0311d);
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (C0232e.a(objM) != null) {
            objM = interfaceC0311d.getClass().getName() + '@' + b(interfaceC0311d);
        }
        return (String) objM;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [p0.c] */
    /* JADX WARN: Type inference failed for: r2v1, types: [p0.d] */
    /* JADX WARN: Type inference failed for: r2v2, types: [p0.d] */
    public static final c0 k(p0.c cVar, InterfaceC0316i interfaceC0316i, Object obj) {
        c0 c0Var = null;
        if (!(cVar instanceof p0.d)) {
            return null;
        }
        if (interfaceC0316i.g(d0.f104b) != null) {
            while (true) {
                if ((cVar instanceof C0023y) || (cVar = cVar.d()) == 0) {
                    break;
                }
                if (cVar instanceof c0) {
                    c0Var = (c0) cVar;
                    break;
                }
            }
            if (c0Var != null) {
                c0Var.P(interfaceC0316i, obj);
            }
        }
        return c0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l(M0.d dVar, w0.p pVar, p0.c cVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        I i2;
        InterfaceC0316i context = cVar.getContext();
        dVar.getClass();
        InterfaceC0316i interfaceC0316iE = context.e(dVar);
        L l2 = (L) interfaceC0316iE.g(C0016q.f123c);
        if (l2 != null && !l2.b()) {
            throw ((T) l2).t();
        }
        if (interfaceC0316iE == context) {
            K0.r rVar = new K0.r(interfaceC0316iE, cVar);
            return AbstractC0062a.W(rVar, rVar, pVar);
        }
        C0312e c0312e = C0312e.f2506b;
        if (x0.g.a(interfaceC0316iE.g(c0312e), context.g(c0312e))) {
            c0 c0Var = new c0(interfaceC0316iE, cVar);
            InterfaceC0316i interfaceC0316i = c0Var.d;
            Object objN = K0.a.n(interfaceC0316i, null);
            try {
                return AbstractC0062a.W(c0Var, c0Var, pVar);
            } finally {
                K0.a.i(interfaceC0316i, objN);
            }
        }
        C0023y c0023y = new C0023y(interfaceC0316iE, cVar);
        try {
            K0.a.j(C0235h.f2029a, P0.b.q(((AbstractC0326a) pVar).i(c0023y, c0023y)));
            do {
                atomicIntegerFieldUpdater = C0023y.f136f;
                int i3 = atomicIntegerFieldUpdater.get(c0023y);
                if (i3 != 0) {
                    if (i3 != 2) {
                        throw new IllegalStateException("Already suspended");
                    }
                    Object obj = T.f97b.get(c0023y);
                    J j2 = obj instanceof J ? (J) obj : null;
                    if (j2 != null && (i2 = j2.f87a) != null) {
                        obj = i2;
                    }
                    if (obj instanceof C0010k) {
                        throw ((C0010k) obj).f117a;
                    }
                    return obj;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(c0023y, 0, 1));
            return EnumC0322a.f2519b;
        } catch (Throwable th) {
            c0023y.h(AbstractC0062a.m(th));
            throw th;
        }
    }
}
