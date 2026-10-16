package g0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: g0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0158d extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1715e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k f1716f;

    /* renamed from: g, reason: collision with root package name */
    public int f1717g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0158d(k kVar, p0.c cVar) {
        super(cVar);
        this.f1716f = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1715e = obj;
        this.f1717g |= Integer.MIN_VALUE;
        Object objD = this.f1716f.d(null, this);
        return objD == EnumC0322a.f2519b ? objD : new C0232e(objD);
    }
}
