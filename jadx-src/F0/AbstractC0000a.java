package F0;

import a.AbstractC0062a;
import java.lang.reflect.InvocationTargetException;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;
import o0.EnumC0322a;
import p0.AbstractC0326a;

/* renamed from: F0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0000a extends T implements InterfaceC0311d, r {
    public final InterfaceC0316i d;

    public AbstractC0000a(InterfaceC0316i interfaceC0316i, boolean z2) {
        super(z2);
        y((L) interfaceC0316i.g(C0016q.f123c));
        this.d = interfaceC0316i.e(this);
    }

    @Override // F0.T
    public final void E(Object obj) {
        if (!(obj instanceof C0010k)) {
            M(obj);
        } else {
            C0010k c0010k = (C0010k) obj;
            L(c0010k.f117a, C0010k.f116b.get(c0010k) != 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void N(EnumC0017s enumC0017s, AbstractC0000a abstractC0000a, w0.p pVar) {
        int iOrdinal = enumC0017s.ordinal();
        C0235h c0235h = C0235h.f2029a;
        if (iOrdinal == 0) {
            try {
                K0.a.j(c0235h, P0.b.q(((AbstractC0326a) pVar).i(abstractC0000a, this)));
                return;
            } finally {
                h(AbstractC0062a.m(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                P0.b.q(((AbstractC0326a) pVar).i(abstractC0000a, this)).h(c0235h);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0011l();
            }
            try {
                InterfaceC0316i interfaceC0316i = this.d;
                Object objN = K0.a.n(interfaceC0316i, null);
                try {
                    x0.m.a(2, pVar);
                    Object objF = pVar.f(abstractC0000a, this);
                    if (objF != EnumC0322a.f2519b) {
                        h(objF);
                    }
                } finally {
                    K0.a.i(interfaceC0316i, objN);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // F0.r
    public final InterfaceC0316i f() {
        return this.d;
    }

    @Override // n0.InterfaceC0311d
    public final InterfaceC0316i getContext() {
        return this.d;
    }

    @Override // n0.InterfaceC0311d
    public final void h(Object obj) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Throwable thA = C0232e.a(obj);
        if (thA != null) {
            obj = new C0010k(thA, false);
        }
        Object objB = B(obj);
        if (objB == AbstractC0019u.d) {
            return;
        }
        l(objB);
    }

    @Override // F0.T
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // F0.T
    public final void x(C0011l c0011l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        AbstractC0019u.d(c0011l, this.d);
    }

    public void M(Object obj) {
    }

    public void L(Throwable th, boolean z2) {
    }
}
