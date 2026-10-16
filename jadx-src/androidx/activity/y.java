package androidx.activity;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* loaded from: classes.dex */
public final class y implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0.l f880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0.l f881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0.a f882c;
    public final /* synthetic */ w0.a d;

    public y(w0.l lVar, w0.l lVar2, w0.a aVar, w0.a aVar2) {
        this.f880a = lVar;
        this.f881b = lVar2;
        this.f882c = aVar;
        this.d = aVar2;
    }

    public final void onBackCancelled() {
        this.d.a();
    }

    public final void onBackInvoked() {
        this.f882c.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        this.f881b.g(new C0066b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        x0.g.e("backEvent", backEvent);
        this.f880a.g(new C0066b(backEvent));
    }
}
