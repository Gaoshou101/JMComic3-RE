package F0;

import a.AbstractC0062a;
import n0.C0309b;
import n0.C0317j;
import n0.InterfaceC0314g;
import n0.InterfaceC0315h;
import n0.InterfaceC0316i;

/* loaded from: classes.dex */
public final class d0 implements InterfaceC0314g, InterfaceC0315h {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f104b = new d0();

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

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, w0.p pVar) {
        return pVar.f(obj, this);
    }

    @Override // n0.InterfaceC0314g
    public final InterfaceC0315h getKey() {
        return this;
    }
}
