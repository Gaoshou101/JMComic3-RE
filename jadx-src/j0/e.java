package J0;

import n0.InterfaceC0314g;
import n0.InterfaceC0315h;
import n0.InterfaceC0316i;
import w0.p;

/* loaded from: classes.dex */
public final class e implements InterfaceC0316i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0316i f349b;

    /* renamed from: c, reason: collision with root package name */
    public final Throwable f350c;

    public e(Throwable th, InterfaceC0316i interfaceC0316i) {
        this.f349b = interfaceC0316i;
        this.f350c = th;
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i c(InterfaceC0315h interfaceC0315h) {
        return this.f349b.c(interfaceC0315h);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0316i e(InterfaceC0316i interfaceC0316i) {
        return this.f349b.e(interfaceC0316i);
    }

    @Override // n0.InterfaceC0316i
    public final InterfaceC0314g g(InterfaceC0315h interfaceC0315h) {
        return this.f349b.g(interfaceC0315h);
    }

    @Override // n0.InterfaceC0316i
    public final Object j(Object obj, p pVar) {
        return this.f349b.j(obj, pVar);
    }
}
