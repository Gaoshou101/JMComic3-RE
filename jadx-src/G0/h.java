package g0;

import j0.C0202A;
import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class h extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public k f1728e;

    /* renamed from: f, reason: collision with root package name */
    public C0202A f1729f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1730g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1730g = obj;
        this.f1731i |= Integer.MIN_VALUE;
        Object objH = this.h.h(null, null, this);
        return objH == EnumC0322a.f2519b ? objH : new C0232e(objH);
    }
}
