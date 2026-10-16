package m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* renamed from: m.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0259c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2334b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f2335c;

    public /* synthetic */ RunnableC0259c(ActionBarOverlayLayout actionBarOverlayLayout, int i2) {
        this.f2334b = i2;
        this.f2335c = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2334b) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f2335c;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f963w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f2335c;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f963w = actionBarOverlayLayout2.d.animate().translationY(-actionBarOverlayLayout2.d.getHeight()).setListener(actionBarOverlayLayout2.x);
                break;
        }
    }
}
