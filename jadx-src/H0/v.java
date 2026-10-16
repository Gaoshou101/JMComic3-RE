package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class v extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1840e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1841f;

    /* renamed from: g, reason: collision with root package name */
    public int f1842g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1841f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1840e = obj;
        this.f1842g |= Integer.MIN_VALUE;
        Object objF = this.f1841f.f(null, null, this);
        return objF == EnumC0322a.f2519b ? objF : new C0232e(objF);
    }
}
