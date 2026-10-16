package J0;

import a.AbstractC0062a;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;
import w0.p;

/* loaded from: classes.dex */
public final class n extends p0.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f363f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f364g;
    public final /* synthetic */ I0.c h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(I0.c cVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = cVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((n) i(obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        n nVar = new n(this.h, interfaceC0311d);
        nVar.f364g = obj;
        return nVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f363f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            Object obj2 = this.f364g;
            this.f363f = 1;
            if (this.h.c(obj2, this) == enumC0322a) {
                return enumC0322a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0062a.X(obj);
        }
        return C0235h.f2029a;
    }
}
