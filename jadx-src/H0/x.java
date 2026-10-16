package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class x extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1845e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1846f;

    /* renamed from: g, reason: collision with root package name */
    public int f1847g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1846f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1845e = obj;
        this.f1847g |= Integer.MIN_VALUE;
        Object objI = this.f1846f.i(null, null, this);
        return objI == EnumC0322a.f2519b ? objI : new C0232e(objI);
    }
}
