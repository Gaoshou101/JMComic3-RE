package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f879a = new x();

    public final OnBackInvokedCallback a(w0.a aVar) {
        x0.g.e("onBackInvoked", aVar);
        return new w(0, aVar);
    }

    public final void b(Object obj, int i2, Object obj2) {
        x0.g.e("dispatcher", obj);
        x0.g.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i2, (OnBackInvokedCallback) obj2);
    }

    public final void c(Object obj, Object obj2) {
        x0.g.e("dispatcher", obj);
        x0.g.e("callback", obj2);
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
