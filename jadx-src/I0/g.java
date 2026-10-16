package I0;

/* loaded from: classes.dex */
public final class g extends p0.c {

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f286e;

    /* renamed from: f, reason: collision with root package name */
    public int f287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h f288g;
    public Object h;

    /* renamed from: i, reason: collision with root package name */
    public c f289i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, p0.c cVar) {
        super(cVar);
        this.f288g = hVar;
    }

    @Override // p0.AbstractC0326a
    public final Object k(Object obj) {
        this.f286e = obj;
        this.f287f |= Integer.MIN_VALUE;
        return this.f288g.o(null, this);
    }
}
