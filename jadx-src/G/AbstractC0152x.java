package g;

import android.content.Context;
import android.content.IntentFilter;
import android.view.MenuItem;

/* renamed from: g.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0152x {

    /* renamed from: a, reason: collision with root package name */
    public Object f1686a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1687b;

    public AbstractC0152x(Context context) {
        this.f1686a = context;
    }

    public void c() {
        N0.A a2 = (N0.A) this.f1686a;
        if (a2 != null) {
            try {
                ((LayoutInflaterFactory2C0118A) this.f1687b).f1559k.unregisterReceiver(a2);
            } catch (IllegalArgumentException unused) {
            }
            this.f1686a = null;
        }
    }

    public abstract IntentFilter d();

    public abstract int e();

    public MenuItem f(MenuItem menuItem) {
        if (!(menuItem instanceof B.a)) {
            return menuItem;
        }
        B.a aVar = (B.a) menuItem;
        if (((p.k) this.f1687b) == null) {
            this.f1687b = new p.k(0);
        }
        MenuItem menuItem2 = (MenuItem) ((p.k) this.f1687b).get(aVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        l.u uVar = new l.u((Context) this.f1686a, aVar);
        ((p.k) this.f1687b).put(aVar, uVar);
        return uVar;
    }

    public abstract void g();

    public void h() {
        c();
        IntentFilter intentFilterD = d();
        if (intentFilterD.countActions() == 0) {
            return;
        }
        if (((N0.A) this.f1686a) == null) {
            this.f1686a = new N0.A(2, this);
        }
        ((LayoutInflaterFactory2C0118A) this.f1687b).f1559k.registerReceiver((N0.A) this.f1686a, intentFilterD);
    }

    public AbstractC0152x(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A) {
        this.f1687b = layoutInflaterFactory2C0118A;
    }
}
