package androidx.activity;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.EnumC0080l;
import k0.C0233f;

/* loaded from: classes.dex */
public final class ImmLeaksCleaner implements androidx.lifecycle.p {

    /* renamed from: c, reason: collision with root package name */
    public static final C0233f f818c = new C0233f(r.f870c);

    /* renamed from: b, reason: collision with root package name */
    public final o f819b;

    public ImmLeaksCleaner(o oVar) {
        this.f819b = oVar;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, EnumC0080l enumC0080l) {
        if (enumC0080l != EnumC0080l.ON_DESTROY) {
            return;
        }
        Object systemService = this.f819b.getSystemService("input_method");
        x0.g.c("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager", systemService);
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        q qVar = (q) f818c.a();
        Object objB = qVar.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = qVar.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = qVar.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
