package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0186n extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1817e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1818f;

    /* renamed from: g, reason: collision with root package name */
    public int f1819g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0186n(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1818f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1817e = obj;
        this.f1819g |= Integer.MIN_VALUE;
        Object objH = this.f1818f.h(null, null, this);
        return objH == EnumC0322a.f2519b ? objH : new C0232e(objH);
    }
}
