package N0;

import android.content.Context;
import android.view.KeyEvent;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class y extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final v f537a;

    public y(Context context, v vVar) {
        super(context);
        this.f537a = vVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean zDispatchKeyEvent = this.f537a.getView().dispatchKeyEvent(keyEvent);
        return !zDispatchKeyEvent ? super.dispatchKeyEvent(keyEvent) : zDispatchKeyEvent;
    }
}
