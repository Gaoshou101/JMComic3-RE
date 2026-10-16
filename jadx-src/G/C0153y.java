package g;

import a.AbstractC0062a;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import k.C0227c;

/* renamed from: g.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153y extends ContentFrameLayout {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0118A f1688i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0153y(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, C0227c c0227c) {
        super(c0227c, null);
        this.f1688i = layoutInflaterFactory2C0118A;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f1688i.t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            if (x < -5 || y2 < -5 || x > getWidth() + 5 || y2 > getHeight() + 5) {
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1688i;
                layoutInflaterFactory2C0118A.r(layoutInflaterFactory2C0118A.z(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i2) {
        setBackgroundDrawable(AbstractC0062a.v(getContext(), i2));
    }
}
