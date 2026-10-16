package androidx.appcompat.widget;

import G.B;
import G.D;
import G.InterfaceC0040p;
import G.InterfaceC0041q;
import G.K;
import G.N;
import G.Q;
import G.T;
import G.U;
import G.V;
import G.c0;
import G.e0;
import G.r;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import com.a7m3p9xv.t6qk2z8.app.R;
import g.C0128K;
import java.util.WeakHashMap;
import k.j;
import l.n;
import l.y;
import m.C0263e;
import m.C0265f;
import m.C0275k;
import m.InterfaceC0261d;
import m.InterfaceC0282n0;
import m.InterfaceC0284o0;
import m.RunnableC0259c;
import m.c1;
import m.h1;
import z.c;

/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0282n0, InterfaceC0040p, InterfaceC0041q {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f938C = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};

    /* renamed from: D, reason: collision with root package name */
    public static final e0 f939D;

    /* renamed from: E, reason: collision with root package name */
    public static final Rect f940E;

    /* renamed from: A, reason: collision with root package name */
    public final r f941A;

    /* renamed from: B, reason: collision with root package name */
    public final C0265f f942B;

    /* renamed from: a, reason: collision with root package name */
    public int f943a;

    /* renamed from: b, reason: collision with root package name */
    public int f944b;

    /* renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f945c;
    public ActionBarContainer d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0284o0 f946e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f947f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f948g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f949i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f950j;

    /* renamed from: k, reason: collision with root package name */
    public int f951k;

    /* renamed from: l, reason: collision with root package name */
    public int f952l;

    /* renamed from: m, reason: collision with root package name */
    public final Rect f953m;

    /* renamed from: n, reason: collision with root package name */
    public final Rect f954n;

    /* renamed from: o, reason: collision with root package name */
    public final Rect f955o;

    /* renamed from: p, reason: collision with root package name */
    public final Rect f956p;

    /* renamed from: q, reason: collision with root package name */
    public e0 f957q;

    /* renamed from: r, reason: collision with root package name */
    public e0 f958r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f959s;

    /* renamed from: t, reason: collision with root package name */
    public e0 f960t;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0261d f961u;

    /* renamed from: v, reason: collision with root package name */
    public OverScroller f962v;

    /* renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f963w;
    public final N x;

    /* renamed from: y, reason: collision with root package name */
    public final RunnableC0259c f964y;

    /* renamed from: z, reason: collision with root package name */
    public final RunnableC0259c f965z;

    static {
        int i2 = Build.VERSION.SDK_INT;
        V u2 = i2 >= 30 ? new U() : i2 >= 29 ? new T() : new Q();
        u2.d(c.a(0, 1, 0, 1));
        f939D = u2.b();
        f940E = new Rect();
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f944b = 0;
        this.f953m = new Rect();
        this.f954n = new Rect();
        this.f955o = new Rect();
        this.f956p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        e0 e0Var = e0.f185b;
        this.f957q = e0Var;
        this.f958r = e0Var;
        this.f959s = e0Var;
        this.f960t = e0Var;
        this.x = new N(this);
        this.f964y = new RunnableC0259c(this, 0);
        this.f965z = new RunnableC0259c(this, 1);
        i(context);
        this.f941A = new r();
        C0265f c0265f = new C0265f(context);
        c0265f.setWillNotDraw(true);
        this.f942B = c0265f;
        addView(c0265f);
    }

    public static boolean g(View view, Rect rect, boolean z2) {
        boolean z3;
        C0263e c0263e = (C0263e) view.getLayoutParams();
        int i2 = ((ViewGroup.MarginLayoutParams) c0263e).leftMargin;
        int i3 = rect.left;
        if (i2 != i3) {
            ((ViewGroup.MarginLayoutParams) c0263e).leftMargin = i3;
            z3 = true;
        } else {
            z3 = false;
        }
        int i4 = ((ViewGroup.MarginLayoutParams) c0263e).topMargin;
        int i5 = rect.top;
        if (i4 != i5) {
            ((ViewGroup.MarginLayoutParams) c0263e).topMargin = i5;
            z3 = true;
        }
        int i6 = ((ViewGroup.MarginLayoutParams) c0263e).rightMargin;
        int i7 = rect.right;
        if (i6 != i7) {
            ((ViewGroup.MarginLayoutParams) c0263e).rightMargin = i7;
            z3 = true;
        }
        if (z2) {
            int i8 = ((ViewGroup.MarginLayoutParams) c0263e).bottomMargin;
            int i9 = rect.bottom;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) c0263e).bottomMargin = i9;
                return true;
            }
        }
        return z3;
    }

    @Override // G.InterfaceC0040p
    public final void a(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // G.InterfaceC0040p
    public final void b(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0263e;
    }

    @Override // G.InterfaceC0041q
    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        e(view, i2, i3, i4, i5, i6);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f947f != null) {
            if (this.d.getVisibility() == 0) {
                translationY = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                translationY = 0;
            }
            this.f947f.setBounds(0, translationY, getWidth(), this.f947f.getIntrinsicHeight() + translationY);
            this.f947f.draw(canvas);
        }
    }

    @Override // G.InterfaceC0040p
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // G.InterfaceC0040p
    public final boolean f(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C0263e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0263e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f941A;
        return rVar.f203b | rVar.f202a;
    }

    public CharSequence getTitle() {
        k();
        return ((h1) this.f946e).f2354a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.f964y);
        removeCallbacks(this.f965z);
        ViewPropertyAnimator viewPropertyAnimator = this.f963w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f938C);
        this.f943a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f947f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f962v = new OverScroller(context);
    }

    public final void j(int i2) {
        k();
        if (i2 == 2) {
            ((h1) this.f946e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i2 == 5) {
            ((h1) this.f946e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        InterfaceC0284o0 wrapper;
        if (this.f945c == null) {
            this.f945c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof InterfaceC0284o0) {
                wrapper = (InterfaceC0284o0) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.f946e = wrapper;
        }
    }

    public final void l(n nVar, y yVar) {
        k();
        h1 h1Var = (h1) this.f946e;
        C0275k c0275k = h1Var.f2364m;
        Toolbar toolbar = h1Var.f2354a;
        if (c0275k == null) {
            h1Var.f2364m = new C0275k(toolbar.getContext());
        }
        C0275k c0275k2 = h1Var.f2364m;
        c0275k2.f2374e = yVar;
        if (nVar == null && toolbar.f1006a == null) {
            return;
        }
        toolbar.f();
        n nVar2 = toolbar.f1006a.f966p;
        if (nVar2 == nVar) {
            return;
        }
        if (nVar2 != null) {
            nVar2.r(toolbar.f999K);
            nVar2.r(toolbar.f1000L);
        }
        if (toolbar.f1000L == null) {
            toolbar.f1000L = new c1(toolbar);
        }
        c0275k2.f2385q = true;
        if (nVar != null) {
            nVar.b(c0275k2, toolbar.f1013j);
            nVar.b(toolbar.f1000L, toolbar.f1013j);
        } else {
            c0275k2.c(toolbar.f1013j, null);
            toolbar.f1000L.c(toolbar.f1013j, null);
            c0275k2.e();
            toolbar.f1000L.e();
        }
        toolbar.f1006a.setPopupTheme(toolbar.f1014k);
        toolbar.f1006a.setPresenter(c0275k2);
        toolbar.f999K = c0275k2;
        toolbar.t();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        e0 e0VarG = e0.g(windowInsets, this);
        boolean zG = g(this.d, new Rect(e0VarG.b(), e0VarG.d(), e0VarG.c(), e0VarG.a()), false);
        WeakHashMap weakHashMap = K.f146a;
        Rect rect = this.f953m;
        D.b(this, e0VarG, rect);
        int i2 = rect.left;
        int i3 = rect.top;
        int i4 = rect.right;
        int i5 = rect.bottom;
        c0 c0Var = e0VarG.f186a;
        e0 e0VarL = c0Var.l(i2, i3, i4, i5);
        this.f957q = e0VarL;
        boolean z2 = true;
        if (!this.f958r.equals(e0VarL)) {
            this.f958r = this.f957q;
            zG = true;
        }
        Rect rect2 = this.f954n;
        if (rect2.equals(rect)) {
            z2 = zG;
        } else {
            rect2.set(rect);
        }
        if (z2) {
            requestLayout();
        }
        return c0Var.a().f186a.c().f186a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = K.f146a;
        B.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0263e c0263e = (C0263e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0263e).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0263e).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00aa  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r13, int r14) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f949i || !z2) {
            return false;
        }
        this.f962v.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.f962v.getFinalY() > this.d.getHeight()) {
            h();
            this.f965z.run();
        } else {
            h();
            this.f964y.run();
        }
        this.f950j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f951k + i3;
        this.f951k = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        C0128K c0128k;
        j jVar;
        this.f941A.f202a = i2;
        this.f951k = getActionBarHideOffset();
        h();
        InterfaceC0261d interfaceC0261d = this.f961u;
        if (interfaceC0261d == null || (jVar = (c0128k = (C0128K) interfaceC0261d).f1601E) == null) {
            return;
        }
        jVar.a();
        c0128k.f1601E = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.d.getVisibility() != 0) {
            return false;
        }
        return this.f949i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f949i || this.f950j) {
            return;
        }
        if (this.f951k <= this.d.getHeight()) {
            h();
            postDelayed(this.f964y, 600L);
        } else {
            h();
            postDelayed(this.f965z, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        k();
        int i3 = this.f952l ^ i2;
        this.f952l = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0261d interfaceC0261d = this.f961u;
        if (interfaceC0261d != null) {
            C0128K c0128k = (C0128K) interfaceC0261d;
            c0128k.f1597A = !z3;
            if (z2 || !z3) {
                if (c0128k.f1598B) {
                    c0128k.f1598B = false;
                    c0128k.P(true);
                }
            } else if (!c0128k.f1598B) {
                c0128k.f1598B = true;
                c0128k.P(true);
            }
        }
        if ((i3 & 256) == 0 || this.f961u == null) {
            return;
        }
        WeakHashMap weakHashMap = K.f146a;
        B.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f944b = i2;
        InterfaceC0261d interfaceC0261d = this.f961u;
        if (interfaceC0261d != null) {
            ((C0128K) interfaceC0261d).f1619z = i2;
        }
    }

    public void setActionBarHideOffset(int i2) {
        h();
        this.d.setTranslationY(-Math.max(0, Math.min(i2, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0261d interfaceC0261d) {
        this.f961u = interfaceC0261d;
        if (getWindowToken() != null) {
            ((C0128K) this.f961u).f1619z = this.f944b;
            int i2 = this.f952l;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                WeakHashMap weakHashMap = K.f146a;
                B.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.h = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f949i) {
            this.f949i = z2;
            if (z2) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i2) {
        k();
        h1 h1Var = (h1) this.f946e;
        h1Var.d = i2 != 0 ? AbstractC0062a.v(h1Var.f2354a.getContext(), i2) : null;
        h1Var.c();
    }

    public void setLogo(int i2) {
        k();
        h1 h1Var = (h1) this.f946e;
        h1Var.f2357e = i2 != 0 ? AbstractC0062a.v(h1Var.f2354a.getContext(), i2) : null;
        h1Var.c();
    }

    public void setOverlayMode(boolean z2) {
        this.f948g = z2;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // m.InterfaceC0282n0
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((h1) this.f946e).f2362k = callback;
    }

    @Override // m.InterfaceC0282n0
    public void setWindowTitle(CharSequence charSequence) {
        k();
        h1 h1Var = (h1) this.f946e;
        if (h1Var.f2359g) {
            return;
        }
        h1Var.h = charSequence;
        if ((h1Var.f2355b & 8) != 0) {
            Toolbar toolbar = h1Var.f2354a;
            toolbar.setTitle(charSequence);
            if (h1Var.f2359g) {
                K.i(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0263e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        h1 h1Var = (h1) this.f946e;
        h1Var.d = drawable;
        h1Var.c();
    }

    @Override // G.InterfaceC0040p
    public final void c(int i2, int i3, int[] iArr, int i4) {
    }
}
