package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0179g extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X.i f1799f;

    /* renamed from: g, reason: collision with root package name */
    public int f1800g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0179g(X.i iVar, p0.c cVar) {
        super(cVar);
        this.f1799f = iVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1798e = obj;
        this.f1800g |= Integer.MIN_VALUE;
        Object objJ = this.f1799f.J(null, null, this);
        return objJ == EnumC0322a.f2519b ? objJ : new C0232e(objJ);
    }
}
