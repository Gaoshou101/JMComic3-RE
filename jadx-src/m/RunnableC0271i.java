package m;

import android.view.View;

/* renamed from: m.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0271i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final C0267g f2367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0275k f2368c;

    public RunnableC0271i(C0275k c0275k, C0267g c0267g) {
        this.f2368c = c0275k;
        this.f2367b = c0267g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l.l lVar;
        C0275k c0275k = this.f2368c;
        l.n nVar = c0275k.f2373c;
        if (nVar != null && (lVar = nVar.f2114e) != null) {
            lVar.l(nVar);
        }
        View view = (View) c0275k.h;
        if (view != null && view.getWindowToken() != null) {
            C0267g c0267g = this.f2367b;
            if (c0267g.b()) {
                c0275k.f2387s = c0267g;
            } else if (c0267g.f2175e != null) {
                c0267g.d(0, 0, false, false);
                c0275k.f2387s = c0267g;
            }
        }
        c0275k.f2389u = null;
    }
}
