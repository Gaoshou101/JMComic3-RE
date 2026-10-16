package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162D extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1749e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1750f;

    /* renamed from: g, reason: collision with root package name */
    public int f1751g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0162D(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1750f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1749e = obj;
        this.f1751g |= Integer.MIN_VALUE;
        Object objB = this.f1750f.B(null, null, this);
        return objB == EnumC0322a.f2519b ? objB : new C0232e(objB);
    }
}
