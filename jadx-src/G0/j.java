package g0;

import j0.C0204C;
import k0.C0232e;
import o0.EnumC0322a;

/* loaded from: classes.dex */
public final class j extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f1736e;

    /* renamed from: f, reason: collision with root package name */
    public C0204C f1737f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1738g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1738g = obj;
        this.f1739i |= Integer.MIN_VALUE;
        Object objI = this.h.i(null, null, this);
        return objI == EnumC0322a.f2519b ? objI : new C0232e(objI);
    }
}
