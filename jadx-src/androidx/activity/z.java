package androidx.activity;

import android.window.OnBackInvokedCallback;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f883a = new z();

    public final OnBackInvokedCallback a(w0.l lVar, w0.l lVar2, w0.a aVar, w0.a aVar2) {
        x0.g.e("onBackStarted", lVar);
        x0.g.e("onBackProgressed", lVar2);
        x0.g.e("onBackInvoked", aVar);
        x0.g.e("onBackCancelled", aVar2);
        return new y(lVar, lVar2, aVar, aVar2);
    }
}
