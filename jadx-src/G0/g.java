package g0;

import a.AbstractC0062a;
import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class g extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f1724e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0062a f1725f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1726g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1727i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1726g = obj;
        this.f1727i |= Integer.MIN_VALUE;
        Object objG = this.h.g(null, null, this);
        return objG == EnumC0322a.f2519b ? objG : new C0232e(objG);
    }
}
