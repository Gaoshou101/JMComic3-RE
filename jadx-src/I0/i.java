package I0;

/* loaded from: classes.dex */
public final class i extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f292e;

    /* renamed from: f, reason: collision with root package name */
    public int f293f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D.c f294g;
    public D.c h;

    /* renamed from: i, reason: collision with root package name */
    public c f295i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(D.c cVar, p0.c cVar2) {
        super(cVar2);
        this.f294g = cVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f292e = obj;
        this.f293f |= Integer.MIN_VALUE;
        return this.f294g.o(null, this);
    }
}
