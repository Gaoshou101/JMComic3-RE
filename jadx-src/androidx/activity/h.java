package androidx.activity;

import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.EnumC0080l;
import g.AbstractActivityC0137i;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements androidx.lifecycle.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0137i f836c;

    public /* synthetic */ h(C c2, AbstractActivityC0137i abstractActivityC0137i) {
        this.f835b = c2;
        this.f836c = abstractActivityC0137i;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, EnumC0080l enumC0080l) {
        C c2 = this.f835b;
        AbstractActivityC0137i abstractActivityC0137i = this.f836c;
        if (enumC0080l == EnumC0080l.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = i.f837a.a(abstractActivityC0137i);
            x0.g.e("invoker", onBackInvokedDispatcherA);
            c2.f814e = onBackInvokedDispatcherA;
            c2.d(c2.f816g);
        }
    }
}
