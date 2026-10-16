package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class z extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1850e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1851f;

    /* renamed from: g, reason: collision with root package name */
    public int f1852g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1851f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1850e = obj;
        this.f1852g |= Integer.MIN_VALUE;
        Object objN = this.f1851f.n(null, this);
        return objN == EnumC0322a.f2519b ? objN : new C0232e(objN);
    }
}
