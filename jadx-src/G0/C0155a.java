package g0;

import a.AbstractC0062a;
import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: g0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0155a extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public Object f1703e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC0062a f1704f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f1705g;
    public final /* synthetic */ k h;

    /* renamed from: i, reason: collision with root package name */
    public int f1706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0155a(k kVar, p0.c cVar) {
        super(cVar);
        this.h = kVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1705g = obj;
        this.f1706i |= Integer.MIN_VALUE;
        Object objA = this.h.a(null, null, this);
        return objA == EnumC0322a.f2519b ? objA : new C0232e(objA);
    }
}
