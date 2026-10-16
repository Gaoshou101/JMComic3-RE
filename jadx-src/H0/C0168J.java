package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0168J extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1768f;

    /* renamed from: g, reason: collision with root package name */
    public int f1769g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0168J(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1768f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1767e = obj;
        this.f1769g |= Integer.MIN_VALUE;
        Object objD = this.f1768f.D(null, null, this);
        return objD == EnumC0322a.f2519b ? objD : new C0232e(objD);
    }
}
