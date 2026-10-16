package h0;

import a.AbstractC0062a;
import j0.C0210a;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0187o extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0210a f1821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0187o(String str, C0210a c0210a, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1820f = str;
        this.f1821g = c0210a;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0187o) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        return new C0187o(this.f1820f, this.f1821g, interfaceC0311d);
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        AbstractC0062a.X(obj);
        return new C0232e(AbstractC0062a.l(this.f1820f, this.f1821g, true));
    }
}
