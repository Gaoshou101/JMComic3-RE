package G;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class Z extends Y {

    /* renamed from: n, reason: collision with root package name */
    public z.c f170n;

    /* renamed from: o, reason: collision with root package name */
    public z.c f171o;

    /* renamed from: p, reason: collision with root package name */
    public z.c f172p;

    public Z(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.f170n = null;
        this.f171o = null;
        this.f172p = null;
    }

    @Override // G.c0
    public z.c g() {
        if (this.f171o == null) {
            this.f171o = z.c.b(this.f165c.getMandatorySystemGestureInsets());
        }
        return this.f171o;
    }

    @Override // G.c0
    public z.c i() {
        if (this.f170n == null) {
            this.f170n = z.c.b(this.f165c.getSystemGestureInsets());
        }
        return this.f170n;
    }

    @Override // G.c0
    public z.c k() {
        if (this.f172p == null) {
            this.f172p = z.c.b(this.f165c.getTappableElementInsets());
        }
        return this.f172p;
    }

    @Override // G.W, G.c0
    public e0 l(int i2, int i3, int i4, int i5) {
        return e0.g(this.f165c.inset(i2, i3, i4, i5), null);
    }

    @Override // G.X, G.c0
    public void q(z.c cVar) {
    }
}
