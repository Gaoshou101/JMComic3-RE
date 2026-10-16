package l;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: l.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0243e implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2068a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2069b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0243e(v vVar, int i2) {
        this.f2068a = i2;
        this.f2069b = vVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i2 = this.f2068a;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f2068a) {
            case 0:
                h hVar = (h) this.f2069b;
                ViewTreeObserver viewTreeObserver = hVar.x;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        hVar.x = view.getViewTreeObserver();
                    }
                    hVar.x.removeGlobalOnLayoutListener(hVar.f2081i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                E e2 = (E) this.f2069b;
                ViewTreeObserver viewTreeObserver2 = e2.f2042o;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        e2.f2042o = view.getViewTreeObserver();
                    }
                    e2.f2042o.removeGlobalOnLayoutListener(e2.f2036i);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
