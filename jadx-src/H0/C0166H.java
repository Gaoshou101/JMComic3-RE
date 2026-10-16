package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0166H extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1759e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1760f;

    /* renamed from: g, reason: collision with root package name */
    public int f1761g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0166H(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1760f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1759e = obj;
        this.f1761g |= Integer.MIN_VALUE;
        Object objC = this.f1760f.C(null, null, this);
        return objC == EnumC0322a.f2519b ? objC : new C0232e(objC);
    }
}
