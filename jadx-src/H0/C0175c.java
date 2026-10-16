package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0175c extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1788e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ X.i f1789f;

    /* renamed from: g, reason: collision with root package name */
    public int f1790g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0175c(X.i iVar, p0.c cVar) {
        super(cVar);
        this.f1789f = iVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1788e = obj;
        this.f1790g |= Integer.MIN_VALUE;
        Object objB = this.f1789f.B(null, this);
        return objB == EnumC0322a.f2519b ? objB : new C0232e(objB);
    }
}
