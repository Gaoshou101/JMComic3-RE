package a0;

import a.AbstractC0062a;
import j0.AbstractC0207F;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class r extends p0.g implements w0.p {

    /* renamed from: f, reason: collision with root package name */
    public int f782f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f783g;
    public final /* synthetic */ w0.q h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0207F f784i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(w0.q qVar, AbstractC0207F abstractC0207F, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = qVar;
        this.f784i = abstractC0207F;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((r) i((AbstractC0207F) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        r rVar = new r(this.h, this.f784i, interfaceC0311d);
        rVar.f783g = obj;
        return rVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        EnumC0322a enumC0322a = EnumC0322a.f2519b;
        int i2 = this.f782f;
        if (i2 == 0) {
            AbstractC0062a.X(obj);
            AbstractC0207F abstractC0207F = (AbstractC0207F) this.f783g;
            this.f782f = 1;
            if (this.h.e(this.f784i, abstractC0207F, this) == enumC0322a) {
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
