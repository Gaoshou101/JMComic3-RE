package H0;

import F0.AbstractC0019u;
import F0.C0004e;
import F0.e0;
import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    public Object f229b = g.f254p;

    /* renamed from: c, reason: collision with root package name */
    public C0004e f230c;
    public final /* synthetic */ e d;

    public c(e eVar) {
        this.d = eVar;
    }

    @Override // F0.e0
    public final void a(m mVar, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0004e c0004e = this.f230c;
        if (c0004e != null) {
            c0004e.a(mVar, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object b(I0.d dVar) throws Throwable {
        C0004e c0004e;
        C0004e c0004e2;
        b bVar;
        Boolean bool;
        int i2;
        Object obj = this.f229b;
        boolean z2 = true;
        if (obj == g.f254p || obj == g.f250l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e.f234i;
            e eVar = this.d;
            m mVar = (m) atomicReferenceFieldUpdater.get(eVar);
            while (true) {
                eVar.getClass();
                if (eVar.q(e.d.get(eVar), true)) {
                    this.f229b = g.f250l;
                    Throwable thM = eVar.m();
                    if (thM != null) {
                        int i3 = K0.t.f405a;
                        throw thM;
                    }
                    z2 = false;
                } else {
                    long andIncrement = e.f231e.getAndIncrement(eVar);
                    long j2 = g.f242b;
                    long j3 = andIncrement / j2;
                    int i4 = (int) (andIncrement % j2);
                    if (mVar.f404c != j3) {
                        m mVarL = eVar.l(j3, mVar);
                        if (mVarL == null) {
                            continue;
                        } else {
                            mVar = mVarL;
                        }
                    }
                    Object objY = eVar.y(mVar, i4, andIncrement, null);
                    K0.u uVar = g.f251m;
                    if (objY == uVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    K0.u uVar2 = g.f253o;
                    if (objY == uVar2) {
                        if (andIncrement < eVar.o()) {
                            mVar.a();
                        }
                    } else if (objY == g.f252n) {
                        e eVar2 = this.d;
                        C0004e c0004eC = AbstractC0019u.c(P0.b.q(dVar));
                        try {
                            this.f230c = c0004eC;
                            m mVar2 = mVar;
                            try {
                                Object objY2 = eVar2.y(mVar2, i4, andIncrement, this);
                                if (objY2 != uVar) {
                                    w0.l lVar = eVar2.f239c;
                                    try {
                                        if (objY2 == uVar2) {
                                            if (andIncrement < eVar2.o()) {
                                                mVar.a();
                                            }
                                            m mVar3 = (m) e.f234i.get(eVar2);
                                            while (true) {
                                                if (eVar2.q(e.d.get(eVar2), true)) {
                                                    C0004e c0004e3 = this.f230c;
                                                    x0.g.b(c0004e3);
                                                    this.f230c = null;
                                                    this.f229b = g.f250l;
                                                    Throwable thM2 = eVar.m();
                                                    if (thM2 == null) {
                                                        c0004e3.h(Boolean.FALSE);
                                                    } else {
                                                        c0004e3.h(AbstractC0062a.m(thM2));
                                                    }
                                                } else {
                                                    long andIncrement2 = e.f231e.getAndIncrement(eVar2);
                                                    long j4 = g.f242b;
                                                    long j5 = andIncrement2 / j4;
                                                    int i5 = (int) (andIncrement2 % j4);
                                                    if (mVar3.f404c != j5) {
                                                        m mVarL2 = eVar2.l(j5, mVar3);
                                                        if (mVarL2 != null) {
                                                            mVar3 = mVarL2;
                                                        }
                                                    }
                                                    Object objY3 = eVar2.y(mVar3, i5, andIncrement2, this);
                                                    if (objY3 == g.f251m) {
                                                        a(mVar3, i5);
                                                        break;
                                                    }
                                                    if (objY3 == g.f253o) {
                                                        if (andIncrement2 < eVar2.o()) {
                                                            mVar3.a();
                                                        }
                                                    } else {
                                                        if (objY3 == g.f252n) {
                                                            throw new IllegalStateException("unexpected");
                                                        }
                                                        mVar3.a();
                                                        this.f229b = objY3;
                                                        this.f230c = null;
                                                        bVar = lVar != null ? new b(lVar, objY3) : null;
                                                        bool = Boolean.TRUE;
                                                        c0004e2 = c0004eC;
                                                        i2 = c0004e2.d;
                                                    }
                                                }
                                            }
                                        } else {
                                            c0004e2 = c0004eC;
                                            mVar.a();
                                            this.f229b = objY2;
                                            this.f230c = null;
                                            bVar = lVar != null ? new b(lVar, objY2) : null;
                                            bool = Boolean.TRUE;
                                            i2 = c0004e2.d;
                                        }
                                        c0004e2.t(bool, i2, bVar);
                                        return c0004e2.o();
                                    } catch (Throwable th) {
                                        th = th;
                                        c0004e = mVar2;
                                        c0004e.s();
                                        throw th;
                                    }
                                }
                                a(mVar, i4);
                                c0004e2 = c0004eC;
                                return c0004e2.o();
                            } catch (Throwable th2) {
                                th = th2;
                                c0004e = c0004eC;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            c0004e = c0004eC;
                        }
                    } else {
                        mVar.a();
                        this.f229b = objY;
                    }
                }
            }
        }
        return Boolean.valueOf(z2);
    }
}
