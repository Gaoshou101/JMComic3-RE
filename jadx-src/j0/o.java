package J0;

import k0.C0235h;
import n0.InterfaceC0311d;
import n0.InterfaceC0316i;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class o implements I0.c {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0316i f365b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f366c;
    public final n d;

    public o(I0.c cVar, InterfaceC0316i interfaceC0316i) {
        this.f365b = interfaceC0316i;
        this.f366c = K0.a.m(interfaceC0316i);
        this.d = new n(cVar, null);
    }

    @Override // I0.c
    public final Object c(Object obj, InterfaceC0311d interfaceC0311d) {
        Object objI = P0.b.I(this.f365b, obj, this.f366c, this.d, interfaceC0311d);
        return objI == EnumC0322a.f2519b ? objI : C0235h.f2029a;
    }
}
