package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0173a extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1782e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X.i f1783f;

    /* renamed from: g, reason: collision with root package name */
    public int f1784g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173a(X.i iVar, p0.c cVar) {
        super(cVar);
        this.f1783f = iVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1782e = obj;
        this.f1784g |= Integer.MIN_VALUE;
        Object objA = this.f1783f.A(null, null, this);
        return objA == EnumC0322a.f2519b ? objA : new C0232e(objA);
    }
}
