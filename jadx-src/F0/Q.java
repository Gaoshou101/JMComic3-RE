package F0;

/* loaded from: classes.dex */
public final class Q extends P {

    /* renamed from: e, reason: collision with root package name */
    public final T f91e;

    /* renamed from: f, reason: collision with root package name */
    public final S f92f;

    /* renamed from: g, reason: collision with root package name */
    public final C0008i f93g;
    public final Object h;

    public Q(T t2, S s2, C0008i c0008i, Object obj) {
        this.f91e = t2;
        this.f92f = s2;
        this.f93g = c0008i;
        this.h = obj;
    }

    @Override // F0.P
    public final boolean k() {
        return false;
    }

    @Override // F0.P
    public final void l(Throwable th) {
        C0008i c0008i = this.f93g;
        T t2 = this.f91e;
        t2.getClass();
        C0008i c0008iC = T.C(c0008i);
        S s2 = this.f92f;
        Object obj = this.h;
        if (c0008iC == null || !t2.K(s2, c0008iC, obj)) {
            s2.f96a.e(new K0.h(2), 2);
            C0008i c0008iC2 = T.C(c0008i);
            if (c0008iC2 == null || !t2.K(s2, c0008iC2, obj)) {
                t2.k(t2.s(s2, obj));
            }
        }
    }
}
