package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177e extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X.i f1794f;

    /* renamed from: g, reason: collision with root package name */
    public int f1795g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0177e(X.i iVar, p0.c cVar) {
        super(cVar);
        this.f1794f = iVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1793e = obj;
        this.f1795g |= Integer.MIN_VALUE;
        Object objE = this.f1794f.E(null, this);
        return objE == EnumC0322a.f2519b ? objE : new C0232e(objE);
    }
}
