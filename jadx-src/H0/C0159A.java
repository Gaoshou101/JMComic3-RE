package h0;

import a.AbstractC0062a;
import j0.C0211b;
import k0.C0232e;
import k0.C0235h;
import n0.InterfaceC0311d;

/* renamed from: h0.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0159A extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f1743f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0159A(String str, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f1743f = str;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((C0159A) i((F0.r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        return new C0159A(this.f1743f, interfaceC0311d);
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        AbstractC0062a.X(obj);
        return new C0232e(AbstractC0062a.n(this.f1743f, new C0211b(false)));
    }
}
