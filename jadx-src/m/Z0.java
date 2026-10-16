package m;

import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final /* synthetic */ class Z0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2317c;

    public /* synthetic */ Z0(Toolbar toolbar, int i2) {
        this.f2316b = i2;
        this.f2317c = toolbar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2316b) {
            case 0:
                c1 c1Var = this.f2317c.f1000L;
                l.p pVar = c1Var == null ? null : c1Var.f2337b;
                if (pVar != null) {
                    pVar.collapseActionView();
                    break;
                }
                break;
            default:
                this.f2317c.m();
                break;
        }
    }
}
