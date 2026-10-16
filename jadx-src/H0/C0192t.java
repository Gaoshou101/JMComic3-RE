package h0;

import k0.C0232e;
import o0.EnumC0322a;

/* renamed from: h0.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192t extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f1832e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ L.c f1833f;

    /* renamed from: g, reason: collision with root package name */
    public int f1834g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192t(L.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f1833f = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f1832e = obj;
        this.f1834g |= Integer.MIN_VALUE;
        Object objY = this.f1833f.y(null, null, this);
        return objY == EnumC0322a.f2519b ? objY : new C0232e(objY);
    }
}
