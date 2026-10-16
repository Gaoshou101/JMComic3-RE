package m;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import l.ViewTreeObserverOnGlobalLayoutListenerC0242d;

/* loaded from: classes.dex */
public final class O implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0242d f2271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P f2272b;

    public O(P p2, ViewTreeObserverOnGlobalLayoutListenerC0242d viewTreeObserverOnGlobalLayoutListenerC0242d) {
        this.f2272b = p2;
        this.f2271a = viewTreeObserverOnGlobalLayoutListenerC0242d;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2272b.f2277G.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2271a);
        }
    }
}
