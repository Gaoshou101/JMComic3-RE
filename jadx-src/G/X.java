package G;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class X extends W {

    /* renamed from: m, reason: collision with root package name */
    public z.c f169m;

    public X(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var, windowInsets);
        this.f169m = null;
    }

    @Override // G.c0
    public e0 b() {
        return e0.g(this.f165c.consumeStableInsets(), null);
    }

    @Override // G.c0
    public e0 c() {
        return e0.g(this.f165c.consumeSystemWindowInsets(), null);
    }

    @Override // G.c0
    public final z.c h() {
        if (this.f169m == null) {
            WindowInsets windowInsets = this.f165c;
            this.f169m = z.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f169m;
    }

    @Override // G.c0
    public boolean m() {
        return this.f165c.isConsumed();
    }

    @Override // G.c0
    public void q(z.c cVar) {
        this.f169m = cVar;
    }
}
