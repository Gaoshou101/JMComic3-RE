package m;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class H0 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f2226a;

    public H0(I0 i02) {
        this.f2226a = i02;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0247C c0247c;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y2 = (int) motionEvent.getY();
        I0 i02 = this.f2226a;
        if (action == 0 && (c0247c = i02.f2256y) != null && c0247c.isShowing() && x >= 0 && x < i02.f2256y.getWidth() && y2 >= 0 && y2 < i02.f2256y.getHeight()) {
            i02.f2253u.postDelayed(i02.f2249q, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        i02.f2253u.removeCallbacks(i02.f2249q);
        return false;
    }
}
