package androidx.lifecycle;

import android.os.Handler;

/* loaded from: classes.dex */
public final class y implements r {

    /* renamed from: i, reason: collision with root package name */
    public static final y f1317i = new y();

    /* renamed from: a, reason: collision with root package name */
    public int f1318a;

    /* renamed from: b, reason: collision with root package name */
    public int f1319b;

    /* renamed from: e, reason: collision with root package name */
    public Handler f1321e;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1320c = true;
    public boolean d = true;

    /* renamed from: f, reason: collision with root package name */
    public final t f1322f = new t(this);

    /* renamed from: g, reason: collision with root package name */
    public final androidx.activity.k f1323g = new androidx.activity.k(4, this);
    public final X.i h = new X.i(17, this);

    public final void b() {
        int i2 = this.f1319b + 1;
        this.f1319b = i2;
        if (i2 == 1) {
            if (this.f1320c) {
                this.f1322f.d(EnumC0080l.ON_RESUME);
                this.f1320c = false;
            } else {
                Handler handler = this.f1321e;
                x0.g.b(handler);
                handler.removeCallbacks(this.f1323g);
            }
        }
    }

    @Override // androidx.lifecycle.r
    public final t d() {
        return this.f1322f;
    }
}
