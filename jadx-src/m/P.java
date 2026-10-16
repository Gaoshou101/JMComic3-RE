package m;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.a7m3p9xv.t6qk2z8.app.R;
import l.ViewTreeObserverOnGlobalLayoutListenerC0242d;

/* loaded from: classes.dex */
public final class P extends I0 implements S {

    /* renamed from: C, reason: collision with root package name */
    public CharSequence f2273C;

    /* renamed from: D, reason: collision with root package name */
    public M f2274D;

    /* renamed from: E, reason: collision with root package name */
    public final Rect f2275E;

    /* renamed from: F, reason: collision with root package name */
    public int f2276F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ T f2277G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(T t2, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f2277G = t2;
        this.f2275E = new Rect();
        this.f2247o = t2;
        this.x = true;
        this.f2256y.setFocusable(true);
        this.f2248p = new N(this);
    }

    @Override // m.S
    public final void d(int i2, int i3) {
        ViewTreeObserver viewTreeObserver;
        C0247C c0247c = this.f2256y;
        boolean zIsShowing = c0247c.isShowing();
        r();
        this.f2256y.setInputMethodMode(2);
        f();
        C0297v0 c0297v0 = this.f2237c;
        c0297v0.setChoiceMode(1);
        c0297v0.setTextDirection(i2);
        c0297v0.setTextAlignment(i3);
        T t2 = this.f2277G;
        int selectedItemPosition = t2.getSelectedItemPosition();
        C0297v0 c0297v02 = this.f2237c;
        if (c0247c.isShowing() && c0297v02 != null) {
            c0297v02.setListSelectionHidden(false);
            c0297v02.setSelection(selectedItemPosition);
            if (c0297v02.getChoiceMode() != 0) {
                c0297v02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (zIsShowing || (viewTreeObserver = t2.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC0242d viewTreeObserverOnGlobalLayoutListenerC0242d = new ViewTreeObserverOnGlobalLayoutListenerC0242d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0242d);
        this.f2256y.setOnDismissListener(new O(this, viewTreeObserverOnGlobalLayoutListenerC0242d));
    }

    @Override // m.S
    public final CharSequence i() {
        return this.f2273C;
    }

    @Override // m.S
    public final void k(CharSequence charSequence) {
        this.f2273C = charSequence;
    }

    @Override // m.I0, m.S
    public final void n(ListAdapter listAdapter) {
        super.n(listAdapter);
        this.f2274D = (M) listAdapter;
    }

    @Override // m.S
    public final void o(int i2) {
        this.f2276F = i2;
    }

    public final void r() {
        int i2;
        C0247C c0247c = this.f2256y;
        Drawable background = c0247c.getBackground();
        T t2 = this.f2277G;
        if (background != null) {
            background.getPadding(t2.h);
            boolean z2 = p1.f2438a;
            int layoutDirection = t2.getLayoutDirection();
            Rect rect = t2.h;
            i2 = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = t2.h;
            rect2.right = 0;
            rect2.left = 0;
            i2 = 0;
        }
        int paddingLeft = t2.getPaddingLeft();
        int paddingRight = t2.getPaddingRight();
        int width = t2.getWidth();
        int i3 = t2.f2300g;
        if (i3 == -2) {
            int iA = t2.a(this.f2274D, c0247c.getBackground());
            int i4 = t2.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = t2.h;
            int i5 = (i4 - rect3.left) - rect3.right;
            if (iA > i5) {
                iA = i5;
            }
            q(Math.max(iA, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i3);
        }
        boolean z3 = p1.f2438a;
        this.f2239f = t2.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f2238e) - this.f2276F) + i2 : paddingLeft + this.f2276F + i2;
    }
}
