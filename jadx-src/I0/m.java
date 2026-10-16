package I0;

import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class m extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f304e;

    /* renamed from: f, reason: collision with root package name */
    public int f305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f306g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public c f307i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, InterfaceC0311d interfaceC0311d) {
        super(interfaceC0311d);
        this.f306g = lVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f304e = obj;
        this.f305f |= Integer.MIN_VALUE;
        return this.f306g.c(null, this);
    }
}
