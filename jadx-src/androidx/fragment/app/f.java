package androidx.fragment.app;

import G.InterfaceC0036l;
import android.os.Handler;
import androidx.lifecycle.L;
import androidx.lifecycle.M;
import c.InterfaceC0092h;
import g.AbstractActivityC0137i;
import w.InterfaceC0342b;

/* loaded from: classes.dex */
public final class f implements InterfaceC0342b, w.c, v.j, v.k, M, androidx.lifecycle.r, InterfaceC0092h, R.f, InterfaceC0036l {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractActivityC0137i f1187a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f1188b;

    /* renamed from: c, reason: collision with root package name */
    public final q f1189c;
    public final /* synthetic */ AbstractActivityC0137i d;

    public f(AbstractActivityC0137i abstractActivityC0137i) {
        this.d = abstractActivityC0137i;
        Handler handler = new Handler();
        this.f1187a = abstractActivityC0137i;
        this.f1188b = handler;
        this.f1189c = new q();
    }

    @Override // R.f
    public final R.d a() {
        return (R.d) this.d.d.f615c;
    }

    @Override // androidx.lifecycle.M
    public final L c() {
        return this.d.c();
    }

    @Override // androidx.lifecycle.r
    public final androidx.lifecycle.t d() {
        return this.d.f1661u;
    }
}
