package m;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: m.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0301x0 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2482b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractViewOnTouchListenerC0303y0 f2483c;

    public /* synthetic */ RunnableC0301x0(AbstractViewOnTouchListenerC0303y0 abstractViewOnTouchListenerC0303y0, int i2) {
        this.f2482b = i2;
        this.f2483c = abstractViewOnTouchListenerC0303y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2482b) {
            case 0:
                ViewParent parent = this.f2483c.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    break;
                }
                break;
            default:
                AbstractViewOnTouchListenerC0303y0 abstractViewOnTouchListenerC0303y0 = this.f2483c;
                abstractViewOnTouchListenerC0303y0.a();
                View view = abstractViewOnTouchListenerC0303y0.d;
                if (view.isEnabled() && !view.isLongClickable() && abstractViewOnTouchListenerC0303y0.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    abstractViewOnTouchListenerC0303y0.f2492g = true;
                    break;
                }
                break;
        }
    }
}
