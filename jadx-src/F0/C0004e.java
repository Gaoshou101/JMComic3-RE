package F0;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import k0.C0232e;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;
import o0.EnumC0322a;

/* renamed from: F0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e extends AbstractC0024z implements InterfaceC0003d, p0.d, e0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f105g = AtomicIntegerFieldUpdater.newUpdater(C0004e.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater h = AtomicReferenceFieldUpdater.newUpdater(C0004e.class, Object.class, "_state$volatile");

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f106i = AtomicReferenceFieldUpdater.newUpdater(C0004e.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0311d f107e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC0316i f108f;

    public C0004e(int i2, InterfaceC0311d interfaceC0311d) {
        super(i2);
        this.f107e = interfaceC0311d;
        this.f108f = interfaceC0311d.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0001b.f101a;
    }

    public static void r(K0.s sVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + sVar + ", already has " + obj).toString());
    }

    public static Object u(Object obj, int i2, w0.q qVar) {
        return ((obj instanceof C0010k) || !AbstractC0019u.f(i2) || qVar == null) ? obj : new C0009j(obj, qVar, (CancellationException) null, 16);
    }

    @Override // F0.e0
    public final void a(H0.m mVar, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f105g;
            i3 = atomicIntegerFieldUpdater.get(this);
            if ((i3 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, ((i3 >> 29) << 29) + i2));
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C0001b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, mVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            if (obj instanceof K0.s) {
                r(mVar, obj);
                throw null;
            }
            if (!(obj instanceof C0010k)) {
                if (obj instanceof C0009j) {
                    ((C0009j) obj).getClass();
                    return;
                }
                return;
            }
            C0010k c0010k = (C0010k) obj;
            c0010k.getClass();
            if (!C0010k.f116b.compareAndSet(c0010k, 0, 1)) {
                r(mVar, obj);
                throw null;
            }
            if (obj instanceof C0005f) {
                if (!(obj instanceof C0010k)) {
                    c0010k = null;
                }
                k(mVar, c0010k != null ? c0010k.f117a : null);
                return;
            }
            return;
        }
    }

    @Override // F0.AbstractC0024z
    public final void b(CancellationException cancellationException) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0010k) {
                return;
            }
            if (!(obj instanceof C0009j)) {
                C0009j c0009j = new C0009j(obj, (w0.q) null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0009j)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                return;
            }
            C0009j c0009j2 = (C0009j) obj;
            if (c0009j2.d != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            Object obj2 = c0009j2.f113a;
            if ((15 & 2) != 0) {
                c0009j2.getClass();
            }
            w0.q qVar = c0009j2.f114b;
            Object obj3 = c0009j2.f115c;
            Throwable th = (15 & 16) != 0 ? c0009j2.d : cancellationException;
            c0009j2.getClass();
            C0009j c0009j3 = new C0009j(obj2, qVar, obj3, th);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0009j3)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            w0.q qVar2 = c0009j2.f114b;
            if (qVar2 != null) {
                j(qVar2, cancellationException, c0009j2.f113a);
                return;
            }
            return;
        }
    }

    @Override // F0.AbstractC0024z
    public final InterfaceC0311d c() {
        return this.f107e;
    }

    @Override // p0.d
    public final p0.d d() {
        InterfaceC0311d interfaceC0311d = this.f107e;
        if (interfaceC0311d instanceof p0.d) {
            return (p0.d) interfaceC0311d;
        }
        return null;
    }

    @Override // F0.AbstractC0024z
    public final Throwable e(Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // F0.AbstractC0024z
    public final Object f(Object obj) {
        return obj instanceof C0009j ? ((C0009j) obj).f113a : obj;
    }

    @Override // n0.InterfaceC0311d
    public final InterfaceC0316i getContext() {
        return this.f108f;
    }

    @Override // n0.InterfaceC0311d
    public final void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thA = C0232e.a(obj);
        if (thA != null) {
            obj = new C0010k(thA, false);
        }
        t(obj, this.d, null);
    }

    @Override // F0.AbstractC0024z
    public final Object i() {
        return h.get(this);
    }

    public final void j(w0.q qVar, Throwable th, Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0316i interfaceC0316i = this.f108f;
        try {
            qVar.e(th, obj, interfaceC0316i);
        } catch (Throwable th2) {
            AbstractC0019u.d(new C0011l("Exception in resume onCancellation handler for " + this, th2), interfaceC0316i);
        }
    }

    public final void k(K0.s sVar, Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0316i interfaceC0316i = this.f108f;
        int i2 = f105g.get(this) & 536870911;
        if (i2 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            sVar.g(i2, interfaceC0316i);
        } catch (Throwable th2) {
            AbstractC0019u.d(new C0011l("Exception in invokeOnCancellation handler for " + this, th2), interfaceC0316i);
        }
    }

    public final void l(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof W) {
                C0005f c0005f = new C0005f(this, th, obj instanceof K0.s);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0005f)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (((W) obj) instanceof K0.s) {
                    k((K0.s) obj, th);
                }
                if (!q()) {
                    m();
                }
                n(this.d);
                return;
            }
            return;
        }
    }

    public final void m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f106i;
        B b2 = (B) atomicReferenceFieldUpdater.get(this);
        if (b2 == null) {
            return;
        }
        b2.a();
        atomicReferenceFieldUpdater.set(this, V.f99a);
    }

    public final void n(int i2) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i3;
        do {
            atomicIntegerFieldUpdater = f105g;
            i3 = atomicIntegerFieldUpdater.get(this);
            int i4 = i3 >> 29;
            if (i4 != 0) {
                if (i4 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC0311d interfaceC0311d = this.f107e;
                boolean z2 = i2 == 4;
                if (z2 || !(interfaceC0311d instanceof K0.f) || AbstractC0019u.f(i2) != AbstractC0019u.f(this.d)) {
                    AbstractC0019u.i(this, interfaceC0311d, z2);
                    return;
                }
                K0.f fVar = (K0.f) interfaceC0311d;
                AbstractC0015p abstractC0015p = fVar.f382e;
                InterfaceC0316i context = fVar.f383f.getContext();
                if (abstractC0015p.f(context)) {
                    abstractC0015p.d(context, this);
                    return;
                }
                F fA = a0.a();
                if (fA.d >= 4294967296L) {
                    l0.f fVar2 = fA.f85f;
                    if (fVar2 == null) {
                        fVar2 = new l0.f();
                        fA.f85f = fVar2;
                    }
                    fVar2.addLast(this);
                    return;
                }
                fA.l(true);
                try {
                    AbstractC0019u.i(this, interfaceC0311d, true);
                    do {
                    } while (fA.m());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i3, 1073741824 + (536870911 & i3)));
    }

    public final Object o() throws Throwable {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        boolean zQ = q();
        do {
            atomicIntegerFieldUpdater = f105g;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zQ) {
                    s();
                }
                Object obj = h.get(this);
                if (obj instanceof C0010k) {
                    throw ((C0010k) obj).f117a;
                }
                if (AbstractC0019u.f(this.d)) {
                    L l2 = (L) this.f108f.g(C0016q.f123c);
                    if (l2 != null && !l2.b()) {
                        CancellationException cancellationExceptionT = ((T) l2).t();
                        b(cancellationExceptionT);
                        throw cancellationExceptionT;
                    }
                }
                return f(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 536870912 + (536870911 & i2)));
        if (((B) f106i.get(this)) == null) {
            p();
        }
        if (zQ) {
            s();
        }
        return EnumC0322a.f2519b;
    }

    public final B p() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        L l2 = (L) this.f108f.g(C0016q.f123c);
        if (l2 == null) {
            return null;
        }
        B bE = AbstractC0019u.e(l2, true, new C0006g(0, this));
        do {
            atomicReferenceFieldUpdater = f106i;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, bE)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return bE;
    }

    public final boolean q() {
        if (this.d == 2) {
            InterfaceC0311d interfaceC0311d = this.f107e;
            x0.g.c("null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>", interfaceC0311d);
            if (K0.f.f381i.get((K0.f) interfaceC0311d) != null) {
                return true;
            }
        }
        return false;
    }

    public final void s() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        InterfaceC0311d interfaceC0311d = this.f107e;
        Throwable th = null;
        K0.f fVar = interfaceC0311d instanceof K0.f ? (K0.f) interfaceC0311d : null;
        if (fVar != null) {
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = K0.f.f381i;
                Object obj = atomicReferenceFieldUpdater.get(fVar);
                K0.u uVar = K0.a.f372c;
                if (obj == uVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, uVar, this)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != uVar) {
                            break;
                        }
                    }
                    break loop0;
                } else {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(fVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(fVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                }
            }
            if (th == null) {
                return;
            }
            m();
            l(th);
        }
    }

    public final void t(Object obj, int i2, w0.q qVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = h;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof W) {
                Object objU = u(obj, i2, qVar);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objU)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!q()) {
                    m();
                }
                n(i2);
                return;
            }
            if (obj2 instanceof C0005f) {
                C0005f c0005f = (C0005f) obj2;
                c0005f.getClass();
                if (C0005f.f109c.compareAndSet(c0005f, 0, 1)) {
                    if (qVar != null) {
                        j(qVar, c0005f.f117a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(AbstractC0019u.j(this.f107e));
        sb.append("){");
        Object obj = h.get(this);
        sb.append(obj instanceof W ? "Active" : obj instanceof C0005f ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(AbstractC0019u.b(this));
        return sb.toString();
    }
}
