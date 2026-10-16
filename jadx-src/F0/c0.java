package F0;

import k0.C0230c;
import n0.C0312e;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class c0 extends K0.r {

    /* renamed from: f, reason: collision with root package name */
    public final ThreadLocal f103f;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public c0(InterfaceC0316i interfaceC0316i, p0.c cVar) {
        d0 d0Var = d0.f104b;
        super(interfaceC0316i.g(d0Var) == null ? interfaceC0316i.e(d0Var) : interfaceC0316i, cVar);
        this.f103f = new ThreadLocal();
        if (cVar.getContext().g(C0312e.f2506b) instanceof AbstractC0015p) {
            return;
        }
        Object objN = K0.a.n(interfaceC0316i, null);
        K0.a.i(interfaceC0316i, objN);
        P(interfaceC0316i, objN);
    }

    public final boolean O() {
        boolean z2 = this.threadLocalIsSet && this.f103f.get() == null;
        this.f103f.remove();
        return !z2;
    }

    public final void P(InterfaceC0316i interfaceC0316i, Object obj) {
        this.threadLocalIsSet = true;
        this.f103f.set(new C0230c(interfaceC0316i, obj));
    }

    @Override // K0.r, F0.T
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            C0230c c0230c = (C0230c) this.f103f.get();
            if (c0230c != null) {
                K0.a.i((InterfaceC0316i) c0230c.f2022b, c0230c.f2023c);
            }
            this.f103f.remove();
        }
        Object objH = AbstractC0019u.h(obj);
        p0.c cVar = this.f403e;
        InterfaceC0316i context = cVar.getContext();
        Object objN = K0.a.n(context, null);
        c0 c0VarK = objN != K0.a.d ? AbstractC0019u.k(cVar, context, objN) : null;
        try {
            this.f403e.h(objH);
        } finally {
            if (c0VarK == null || c0VarK.O()) {
                K0.a.i(context, objN);
            }
        }
    }
}
