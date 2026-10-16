package g0;

import a.AbstractC0062a;
import j0.z;
import k0.C0235h;
import n0.InterfaceC0311d;
import w0.p;

/* loaded from: classes.dex */
public final class i extends p0.g implements p {

    /* renamed from: f, reason: collision with root package name */
    public int f1732f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1733g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AbstractC0062a f1734i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f1735j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, AbstractC0062a abstractC0062a, z zVar, InterfaceC0311d interfaceC0311d) {
        super(2, interfaceC0311d);
        this.h = kVar;
        this.f1734i = abstractC0062a;
        this.f1735j = zVar;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        return ((i) i((I0.c) obj, (InterfaceC0311d) obj2)).k(C0235h.f2029a);
    }

    @Override // p0.AbstractC0326a
    public final InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        i iVar = new i(this.h, this.f1734i, this.f1735j, interfaceC0311d);
        iVar.f1733g = obj;
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e4  */
    @Override // p0.AbstractC0326a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g0.i.k(java.lang.Object):java.lang.Object");
    }
}
