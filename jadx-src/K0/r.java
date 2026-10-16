package K0;

import F0.AbstractC0000a;
import F0.AbstractC0019u;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public class r extends AbstractC0000a implements p0.d {

    /* renamed from: e, reason: collision with root package name */
    public final p0.c f403e;

    public r(InterfaceC0316i interfaceC0316i, p0.c cVar) {
        super(interfaceC0316i, true);
        this.f403e = cVar;
    }

    @Override // F0.T
    public final boolean A() {
        return true;
    }

    @Override // p0.d
    public final p0.d d() {
        p0.c cVar = this.f403e;
        if (cVar instanceof p0.d) {
            return cVar;
        }
        return null;
    }

    @Override // F0.T
    public void k(Object obj) {
        a.j(AbstractC0019u.h(obj), P0.b.q(this.f403e));
    }

    @Override // F0.T
    public void l(Object obj) {
        this.f403e.h(AbstractC0019u.h(obj));
    }
}
