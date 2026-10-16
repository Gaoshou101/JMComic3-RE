package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import m.C0297v0;
import m.N0;

/* loaded from: classes.dex */
public final class E extends v implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final n f2032c;
    public final k d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2033e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2034f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2035g;
    public final N0 h;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0242d f2036i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0243e f2037j;

    /* renamed from: k, reason: collision with root package name */
    public w f2038k;

    /* renamed from: l, reason: collision with root package name */
    public View f2039l;

    /* renamed from: m, reason: collision with root package name */
    public View f2040m;

    /* renamed from: n, reason: collision with root package name */
    public y f2041n;

    /* renamed from: o, reason: collision with root package name */
    public ViewTreeObserver f2042o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2043p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2044q;

    /* renamed from: r, reason: collision with root package name */
    public int f2045r;

    /* renamed from: s, reason: collision with root package name */
    public int f2046s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2047t;

    public E(int i2, Context context, View view, n nVar, boolean z2) {
        int i3 = 1;
        this.f2036i = new ViewTreeObserverOnGlobalLayoutListenerC0242d(i3, this);
        this.f2037j = new ViewOnAttachStateChangeListenerC0243e(this, i3);
        this.f2031b = context;
        this.f2032c = nVar;
        this.f2033e = z2;
        this.d = new k(nVar, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f2035g = i2;
        Resources resources = context.getResources();
        this.f2034f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2039l = view;
        this.h = new N0(context, null, i2);
        nVar.b(this, context);
    }

    @Override // l.D
    public final boolean a() {
        return !this.f2043p && this.h.f2256y.isShowing();
    }

    @Override // l.z
    public final void b(n nVar, boolean z2) {
        if (nVar != this.f2032c) {
            return;
        }
        dismiss();
        y yVar = this.f2041n;
        if (yVar != null) {
            yVar.b(nVar, z2);
        }
    }

    @Override // l.z
    public final boolean d() {
        return false;
    }

    @Override // l.D
    public final void dismiss() {
        if (a()) {
            this.h.dismiss();
        }
    }

    @Override // l.z
    public final void e() {
        this.f2044q = false;
        k kVar = this.d;
        if (kVar != null) {
            kVar.notifyDataSetChanged();
        }
    }

    @Override // l.D
    public final void f() {
        View view;
        if (a()) {
            return;
        }
        if (this.f2043p || (view = this.f2039l) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f2040m = view;
        N0 n02 = this.h;
        n02.f2256y.setOnDismissListener(this);
        n02.f2248p = this;
        n02.x = true;
        n02.f2256y.setFocusable(true);
        View view2 = this.f2040m;
        boolean z2 = this.f2042o == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f2042o = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f2036i);
        }
        view2.addOnAttachStateChangeListener(this.f2037j);
        n02.f2247o = view2;
        n02.f2244l = this.f2046s;
        boolean z3 = this.f2044q;
        Context context = this.f2031b;
        k kVar = this.d;
        if (!z3) {
            this.f2045r = v.m(kVar, context, this.f2034f);
            this.f2044q = true;
        }
        n02.q(this.f2045r);
        n02.f2256y.setInputMethodMode(2);
        Rect rect = this.f2170a;
        n02.f2255w = rect != null ? new Rect(rect) : null;
        n02.f();
        C0297v0 c0297v0 = n02.f2237c;
        c0297v0.setOnKeyListener(this);
        if (this.f2047t) {
            n nVar = this.f2032c;
            if (nVar.f2121m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c0297v0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(nVar.f2121m);
                }
                frameLayout.setEnabled(false);
                c0297v0.addHeaderView(frameLayout, null, false);
            }
        }
        n02.n(kVar);
        n02.f();
    }

    @Override // l.z
    public final boolean g(F f2) {
        if (f2.hasVisibleItems()) {
            View view = this.f2040m;
            x xVar = new x(this.f2035g, this.f2031b, view, f2, this.f2033e);
            y yVar = this.f2041n;
            xVar.h = yVar;
            v vVar = xVar.f2178i;
            if (vVar != null) {
                vVar.h(yVar);
            }
            boolean zU = v.u(f2);
            xVar.f2177g = zU;
            v vVar2 = xVar.f2178i;
            if (vVar2 != null) {
                vVar2.o(zU);
            }
            xVar.f2179j = this.f2038k;
            this.f2038k = null;
            this.f2032c.c(false);
            N0 n02 = this.h;
            int width = n02.f2239f;
            int iG = n02.g();
            if ((Gravity.getAbsoluteGravity(this.f2046s, this.f2039l.getLayoutDirection()) & 7) == 5) {
                width += this.f2039l.getWidth();
            }
            if (!xVar.b()) {
                if (xVar.f2175e != null) {
                    xVar.d(width, iG, true, true);
                }
            }
            y yVar2 = this.f2041n;
            if (yVar2 != null) {
                yVar2.d(f2);
            }
            return true;
        }
        return false;
    }

    @Override // l.z
    public final void h(y yVar) {
        this.f2041n = yVar;
    }

    @Override // l.D
    public final C0297v0 j() {
        return this.h.f2237c;
    }

    @Override // l.v
    public final void n(View view) {
        this.f2039l = view;
    }

    @Override // l.v
    public final void o(boolean z2) {
        this.d.f2107c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2043p = true;
        this.f2032c.c(true);
        ViewTreeObserver viewTreeObserver = this.f2042o;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f2042o = this.f2040m.getViewTreeObserver();
            }
            this.f2042o.removeGlobalOnLayoutListener(this.f2036i);
            this.f2042o = null;
        }
        this.f2040m.removeOnAttachStateChangeListener(this.f2037j);
        w wVar = this.f2038k;
        if (wVar != null) {
            wVar.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.v
    public final void p(int i2) {
        this.f2046s = i2;
    }

    @Override // l.v
    public final void q(int i2) {
        this.h.f2239f = i2;
    }

    @Override // l.v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2038k = (w) onDismissListener;
    }

    @Override // l.v
    public final void s(boolean z2) {
        this.f2047t = z2;
    }

    @Override // l.v
    public final void t(int i2) {
        this.h.m(i2);
    }

    @Override // l.v
    public final void l(n nVar) {
    }
}
