package m;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class G0 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f2224a;

    public G0(I0 i02) {
        this.f2224a = i02;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i2) {
        if (i2 == 1) {
            I0 i02 = this.f2224a;
            if (i02.f2256y.getInputMethodMode() == 2 || i02.f2256y.getContentView() == null) {
                return;
            }
            Handler handler = i02.f2253u;
            E0 e02 = i02.f2249q;
            handler.removeCallbacks(e02);
            e02.run();
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i2, int i3, int i4) {
    }
}
