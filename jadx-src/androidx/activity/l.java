package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import g.AbstractActivityC0137i;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: b, reason: collision with root package name */
    public final long f841b = SystemClock.uptimeMillis() + 10000;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f842c;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0137i f843e;

    public l(AbstractActivityC0137i abstractActivityC0137i) {
        this.f843e = abstractActivityC0137i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        x0.g.e("runnable", runnable);
        this.f842c = runnable;
        View decorView = this.f843e.getWindow().getDecorView();
        x0.g.d("window.decorView", decorView);
        if (!this.d) {
            decorView.postOnAnimation(new k(0, this));
        } else if (x0.g.a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z2;
        Runnable runnable = this.f842c;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f841b) {
                this.d = false;
                this.f843e.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f842c = null;
        p pVar = (p) this.f843e.f856g.a();
        synchronized (pVar.f867a) {
            z2 = pVar.f868b;
        }
        if (z2) {
            this.d = false;
            this.f843e.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f843e.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
