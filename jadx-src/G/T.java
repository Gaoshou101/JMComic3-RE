package G;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class T extends V {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f160a;

    public T() {
        this.f160a = S.d();
    }

    @Override // G.V
    public e0 b() {
        a();
        e0 e0VarG = e0.g(this.f160a.build(), null);
        e0VarG.f186a.o(null);
        return e0VarG;
    }

    @Override // G.V
    public void c(z.c cVar) {
        this.f160a.setStableInsets(cVar.c());
    }

    @Override // G.V
    public void d(z.c cVar) {
        this.f160a.setSystemWindowInsets(cVar.c());
    }

    public T(e0 e0Var) {
        WindowInsets.Builder builderD;
        super(e0Var);
        WindowInsets windowInsetsF = e0Var.f();
        if (windowInsetsF != null) {
            builderD = S.e(windowInsetsF);
        } else {
            builderD = S.d();
        }
        this.f160a = builderD;
    }
}
