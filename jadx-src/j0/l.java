package J0;

import H0.t;
import k0.C0235h;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class l implements I0.c {

    /* renamed from: b, reason: collision with root package name */
    public final t f360b;

    public l(t tVar) {
        this.f360b = tVar;
    }

    @Override // I0.c
    public final Object c(Object obj, InterfaceC0311d interfaceC0311d) {
        Object objI = this.f360b.i(obj, interfaceC0311d);
        return objI == EnumC0322a.f2519b ? objI : C0235h.f2029a;
    }
}
