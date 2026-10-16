package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0190r extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1828f;

    /* renamed from: g, reason: collision with root package name */
    public int f1829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0190r(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1828f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1827e = obj;
        this.f1829g |= Integer.MIN_VALUE;
        Object objX = this.f1828f.x(null, this);
        return objX == EnumC0322a.f2519b ? objX : new C0232e(objX);
    }
}
