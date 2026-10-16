package androidx.activity;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.AbstractActivityC0137i;
import k0.C0235h;

/* loaded from: classes.dex */
public final class n extends x0.h implements w0.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f850c;
    public final /* synthetic */ AbstractActivityC0137i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(AbstractActivityC0137i abstractActivityC0137i, int i2) {
        super(0);
        this.f850c = i2;
        this.d = abstractActivityC0137i;
    }

    @Override // w0.a
    public final Object a() {
        switch (this.f850c) {
            case 0:
                this.d.reportFullyDrawn();
                return C0235h.f2029a;
            case 1:
                AbstractActivityC0137i abstractActivityC0137i = this.d;
                return new p(abstractActivityC0137i.f855f, new n(abstractActivityC0137i, 0));
            default:
                AbstractActivityC0137i abstractActivityC0137i2 = this.d;
                C c2 = new C(new d(abstractActivityC0137i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (x0.g.a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0137i2.f2687a.a(new h(c2, abstractActivityC0137i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new Q.h(abstractActivityC0137i2, 4, c2));
                    }
                }
                return c2;
        }
    }
}
