package g0;

import j0.C0211b;
import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157c extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public k f1711e;

    /* renamed from: f, reason: collision with root package name */
    public C0211b f1712f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1713g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1714i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0157c(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1713g = obj;
        this.f1714i |= Integer.MIN_VALUE;
        Object objC = this.h.c(null, null, this);
        return objC == EnumC0322a.f2519b ? objC : new C0232e(objC);
    }
}
