package I0;

import n0.InterfaceC0311d;

/* loaded from: classes.dex */
public final class k extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public l f299e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f300f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f301g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, InterfaceC0311d interfaceC0311d) {
        super(interfaceC0311d);
        this.f301g = lVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f300f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f301g.c(null, this);
    }
}
