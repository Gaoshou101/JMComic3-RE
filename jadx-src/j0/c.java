package J0;

import a.AbstractC0062a;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;
import w0.p;

/* loaded from: classes.dex */
public final class c extends p0.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f344f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f345g;
    public final /* synthetic */ d h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = dVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((c) i((I0.c) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        c cVar = new c(this.h, interfaceC0311d);
        cVar.f345g = obj;
        return cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) throws Throwable {
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f344f;
        C0235h c0235h = C0235h.f2029a;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            I0.c cVar = (I0.c) this.f345g;
            this.f344f = 1;
            Object objO = this.h.d.o(cVar, this);
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
