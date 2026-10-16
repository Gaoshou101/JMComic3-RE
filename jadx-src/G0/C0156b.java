package g0;

import j0.C0210a;
import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: g0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0156b extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f1707e;

    /* renamed from: f, reason: collision with root package name */
    public C0210a f1708f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1709g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1710i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156b(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1709g = obj;
        this.f1710i |= Integer.MIN_VALUE;
        Object objB = this.h.b(null, null, this);
        return objB == EnumC0322a.f2519b ? objB : new C0232e(objB);
    }
}
