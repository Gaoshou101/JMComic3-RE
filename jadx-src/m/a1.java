package m;

import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public final class a1 implements InterfaceC0281n, l.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2321a;

    public /* synthetic */ a1(Toolbar toolbar) {
        this.f2321a = toolbar;
    }

    @Override // l.l
    public boolean j(l.n nVar, MenuItem menuItem) {
        this.f2321a.getClass();
        return false;
    }

    @Override // l.l
    public void l(l.n nVar) {
        Toolbar toolbar = this.f2321a;
        C0275k c0275k = toolbar.f1006a.f970t;
        if (c0275k == null || !c0275k.j()) {
            toolbar.f995G.p();
        }
    }
}
