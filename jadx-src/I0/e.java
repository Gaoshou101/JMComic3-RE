package I0;

import F0.r;
import a.AbstractC0062a;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;
import w0.p;

/* loaded from: classes.dex */
public final class e extends p0.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D.c f282g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(D.c cVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.f282g = cVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((e) i((r) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        return new e(this.f282g, interfaceC0311d);
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws Throwable {
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f281f;
        C0235h c0235h = C0235h.f2029a;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            this.f281f = 1;
            Object objO = this.f282g.o(J0.g.f352b, this);
            if (objO != enumC0322a) {
                objO = c0235h;
            }
            if (objO == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
        }
        return c0235h;
    }
}
