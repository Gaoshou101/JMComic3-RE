package g0;

import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class e extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public k f1718e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f1719f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ k f1720g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(k kVar, p0.c cVar) {
        super(cVar);
        this.f1720g = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1719f = obj;
        this.h |= Integer.MIN_VALUE;
        Object objE = this.f1720g.e(null, this);
        return objE == EnumC0322a.f2519b ? objE : new C0232e(objE);
    }
}
