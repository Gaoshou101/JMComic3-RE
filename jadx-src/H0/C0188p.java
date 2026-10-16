package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0188p extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1822e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1823f;

    /* renamed from: g, reason: collision with root package name */
    public int f1824g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0188p(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1823f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1822e = obj;
        this.f1824g |= Integer.MIN_VALUE;
        Object objM = this.f1823f.m(null, null, this);
        return objM == EnumC0322a.f2519b ? objM : new C0232e(objM);
    }
}
