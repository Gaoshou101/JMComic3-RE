package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0184l extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1813f;

    /* renamed from: g, reason: collision with root package name */
    public int f1814g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0184l(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1813f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1812e = obj;
        this.f1814g |= Integer.MIN_VALUE;
        Object objE = this.f1813f.e(null, null, this);
        return objE == EnumC0322a.f2519b ? objE : new C0232e(objE);
    }
}
