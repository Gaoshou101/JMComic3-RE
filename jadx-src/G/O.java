package G;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f154a;

    public O(View view) {
        this.f154a = new WeakReference(view);
    }

    public final void a(float f2) {
        View view = (View) this.f154a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    public final void b() {
        View view = (View) this.f154a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j2) {
        View view = (View) this.f154a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    public final void d(P p2) {
        View view = (View) this.f154a.get();
        if (view != null) {
            if (p2 != null) {
                view.animate().setListener(new N(p2, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f2) {
        View view = (View) this.f154a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
