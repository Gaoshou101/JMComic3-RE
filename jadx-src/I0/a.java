package I0;

/* loaded from: classes.dex */
public final class a extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public J0.h f273e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f274f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X.i f275g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(X.i iVar, p0.c cVar) {
        super(cVar);
        this.f275g = iVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f274f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.f275g.o(null, this);
    }
}
