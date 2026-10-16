package g0;

import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class f extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public k f1721e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1722f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f1723g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, p0.c cVar) {
        super(cVar);
        this.f1723g = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1722f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objF = this.f1723g.f(null, this);
        return objF == EnumC0322a.f2519b ? objF : new C0232e(objF);
    }
}
