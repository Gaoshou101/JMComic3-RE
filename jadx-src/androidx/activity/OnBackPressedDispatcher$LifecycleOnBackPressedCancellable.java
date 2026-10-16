package androidx.activity;

import androidx.lifecycle.EnumC0080l;

/* loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.p, InterfaceC0067c {

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.t f820b;

    /* renamed from: c, reason: collision with root package name */
    public final Z.b f821c;
    public A d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C f822e;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(C c2, androidx.lifecycle.t tVar, Z.b bVar) {
        x0.g.e("onBackPressedCallback", bVar);
        this.f822e = c2;
        this.f820b = tVar;
        this.f821c = bVar;
        tVar.a(this);
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, EnumC0080l enumC0080l) {
        if (enumC0080l != EnumC0080l.ON_START) {
            if (enumC0080l != EnumC0080l.ON_STOP) {
                if (enumC0080l == EnumC0080l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                A a2 = this.d;
                if (a2 != null) {
                    a2.cancel();
                    return;
                }
                return;
            }
        }
        C c2 = this.f822e;
        c2.getClass();
        Z.b bVar = this.f821c;
        x0.g.e("onBackPressedCallback", bVar);
        c2.f812b.addLast(bVar);
        A a3 = new A(c2, bVar);
        bVar.f726b.add(a3);
        c2.e();
        bVar.f727c = new B(0, c2, C.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 1);
        this.d = a3;
    }

    @Override // androidx.activity.InterfaceC0067c
    public final void cancel() {
        this.f820b.f(this);
        this.f821c.f726b.remove(this);
        A a2 = this.d;
        if (a2 != null) {
            a2.cancel();
        }
        this.d = null;
    }
}
