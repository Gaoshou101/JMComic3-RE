package n0;

import a.AbstractC0062a;
import w0.p;

/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0308a implements InterfaceC0314g {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0315h f2501b;

    public AbstractC0308a(InterfaceC0315h interfaceC0315h) {
        this.f2501b = interfaceC0315h;
    }

    @Override // n0.InterfaceC0316i
    public InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        return AbstractC0062a.H(this, interfaceC0315h);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i e(InterfaceC0316i interfaceC0316i) {
        x0.g.e("context", interfaceC0316i);
        return interfaceC0316i == C0317j.f2507b ? this : (InterfaceC0316i) interfaceC0316i.j(this, C0309b.f2502e);
    }

    @Override // n0.InterfaceC0316i
    public InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        return AbstractC0062a.s(this, interfaceC0315h);
    }

    @Override // n0.InterfaceC0314g
    public final InterfaceC0315h getKey() {
        return this.f2501b;
    }

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, p pVar) {
        return pVar.f(obj, this);
    }
}
