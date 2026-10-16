package androidx.appcompat.widget;

import D.b;
import G.C0037m;
import G.InterfaceC0036l;
import G.K;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;
import g.ViewOnClickListenerC0129a;
import java.util.ArrayList;
import java.util.Iterator;
import k.h;
import l.n;
import l.p;
import m.C0245A;
import m.C0266f0;
import m.C0275k;
import m.C0302y;
import m.InterfaceC0284o0;
import m.S0;
import m.Z0;
import m.a1;
import m.b1;
import m.c1;
import m.d1;
import m.e1;
import m.f1;
import m.g1;
import m.h1;
import m.p1;

/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC0036l {

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f989A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f990B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f991C;

    /* renamed from: D, reason: collision with root package name */
    public final ArrayList f992D;

    /* renamed from: E, reason: collision with root package name */
    public final ArrayList f993E;

    /* renamed from: F, reason: collision with root package name */
    public final int[] f994F;

    /* renamed from: G, reason: collision with root package name */
    public final C0037m f995G;

    /* renamed from: H, reason: collision with root package name */
    public ArrayList f996H;

    /* renamed from: I, reason: collision with root package name */
    public final a1 f997I;

    /* renamed from: J, reason: collision with root package name */
    public h1 f998J;

    /* renamed from: K, reason: collision with root package name */
    public C0275k f999K;

    /* renamed from: L, reason: collision with root package name */
    public c1 f1000L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f1001M;

    /* renamed from: N, reason: collision with root package name */
    public OnBackInvokedCallback f1002N;

    /* renamed from: O, reason: collision with root package name */
    public OnBackInvokedDispatcher f1003O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f1004P;

    /* renamed from: Q, reason: collision with root package name */
    public final b f1005Q;

    /* renamed from: a, reason: collision with root package name */
    public ActionMenuView f1006a;

    /* renamed from: b, reason: collision with root package name */
    public C0266f0 f1007b;

    /* renamed from: c, reason: collision with root package name */
    public C0266f0 f1008c;
    public C0302y d;

    /* renamed from: e, reason: collision with root package name */
    public C0245A f1009e;

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f1010f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f1011g;
    public C0302y h;

    /* renamed from: i, reason: collision with root package name */
    public View f1012i;

    /* renamed from: j, reason: collision with root package name */
    public Context f1013j;

    /* renamed from: k, reason: collision with root package name */
    public int f1014k;

    /* renamed from: l, reason: collision with root package name */
    public int f1015l;

    /* renamed from: m, reason: collision with root package name */
    public int f1016m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1017n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1018o;

    /* renamed from: p, reason: collision with root package name */
    public int f1019p;

    /* renamed from: q, reason: collision with root package name */
    public int f1020q;

    /* renamed from: r, reason: collision with root package name */
    public int f1021r;

    /* renamed from: s, reason: collision with root package name */
    public int f1022s;

    /* renamed from: t, reason: collision with root package name */
    public S0 f1023t;

    /* renamed from: u, reason: collision with root package name */
    public int f1024u;

    /* renamed from: v, reason: collision with root package name */
    public int f1025v;

    /* renamed from: w, reason: collision with root package name */
    public final int f1026w;
    public CharSequence x;

    /* renamed from: y, reason: collision with root package name */
    public CharSequence f1027y;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f1028z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f1026w = 8388627;
        this.f992D = new ArrayList();
        this.f993E = new ArrayList();
        this.f994F = new int[2];
        this.f995G = new C0037m(new Z0(this, 1));
        this.f996H = new ArrayList();
        this.f997I = new a1(this);
        this.f1005Q = new b(7, this);
        Context context2 = getContext();
        int[] iArr = AbstractC0113a.f1517w;
        C0037m c0037mM = C0037m.m(context2, attributeSet, iArr, R.attr.toolbarStyle);
        K.g(this, context, iArr, attributeSet, (TypedArray) c0037mM.f196b, R.attr.toolbarStyle, 0);
        TypedArray typedArray = (TypedArray) c0037mM.f196b;
        this.f1015l = typedArray.getResourceId(28, 0);
        this.f1016m = typedArray.getResourceId(19, 0);
        this.f1026w = typedArray.getInteger(0, 8388627);
        this.f1017n = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f1022s = dimensionPixelOffset;
        this.f1021r = dimensionPixelOffset;
        this.f1020q = dimensionPixelOffset;
        this.f1019p = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f1019p = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f1020q = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f1021r = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f1022s = dimensionPixelOffset5;
        }
        this.f1018o = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        S0 s02 = this.f1023t;
        s02.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            s02.f2291e = dimensionPixelSize;
            s02.f2288a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            s02.f2292f = dimensionPixelSize2;
            s02.f2289b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            s02.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f1024u = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f1025v = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f1010f = c0037mM.i(4);
        this.f1011g = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f1013j = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableI = c0037mM.i(16);
        if (drawableI != null) {
            setNavigationIcon(drawableI);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableI2 = c0037mM.i(11);
        if (drawableI2 != null) {
            setLogo(drawableI2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0037mM.h(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0037mM.h(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0037mM.r();
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i2 = 0; i2 < menu.size(); i2++) {
            arrayList.add(menu.getItem(i2));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new h(getContext());
    }

    public static d1 h() {
        d1 d1Var = new d1(-2, -2);
        d1Var.f2341b = 0;
        d1Var.f2340a = 8388627;
        return d1Var;
    }

    public static d1 i(ViewGroup.LayoutParams layoutParams) {
        boolean z2 = layoutParams instanceof d1;
        if (z2) {
            d1 d1Var = (d1) layoutParams;
            d1 d1Var2 = new d1(d1Var);
            d1Var2.f2341b = 0;
            d1Var2.f2341b = d1Var.f2341b;
            return d1Var2;
        }
        if (z2) {
            d1 d1Var3 = new d1((d1) layoutParams);
            d1Var3.f2341b = 0;
            return d1Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            d1 d1Var4 = new d1(layoutParams);
            d1Var4.f2341b = 0;
            return d1Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        d1 d1Var5 = new d1(marginLayoutParams);
        d1Var5.f2341b = 0;
        ((ViewGroup.MarginLayoutParams) d1Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) d1Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) d1Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) d1Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return d1Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i2) {
        boolean z2 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        arrayList.clear();
        if (!z2) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                d1 d1Var = (d1) childAt.getLayoutParams();
                if (d1Var.f2341b == 0 && s(childAt)) {
                    int i4 = d1Var.f2340a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i4, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i5 = childCount - 1; i5 >= 0; i5--) {
            View childAt2 = getChildAt(i5);
            d1 d1Var2 = (d1) childAt2.getLayoutParams();
            if (d1Var2.f2341b == 0 && s(childAt2)) {
                int i6 = d1Var2.f2340a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i6, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        d1 d1VarH = layoutParams == null ? h() : !checkLayoutParams(layoutParams) ? i(layoutParams) : (d1) layoutParams;
        d1VarH.f2341b = 1;
        if (!z2 || this.f1012i == null) {
            addView(view, d1VarH);
        } else {
            view.setLayoutParams(d1VarH);
            this.f993E.add(view);
        }
    }

    public final void c() {
        if (this.h == null) {
            C0302y c0302y = new C0302y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.h = c0302y;
            c0302y.setImageDrawable(this.f1010f);
            this.h.setContentDescription(this.f1011g);
            d1 d1VarH = h();
            d1VarH.f2340a = (this.f1017n & 112) | 8388611;
            d1VarH.f2341b = 2;
            this.h.setLayoutParams(d1VarH);
            this.h.setOnClickListener(new ViewOnClickListenerC0129a(2, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof d1);
    }

    public final void d() {
        if (this.f1023t == null) {
            S0 s02 = new S0();
            s02.f2288a = 0;
            s02.f2289b = 0;
            s02.f2290c = Integer.MIN_VALUE;
            s02.d = Integer.MIN_VALUE;
            s02.f2291e = 0;
            s02.f2292f = 0;
            s02.f2293g = false;
            s02.h = false;
            this.f1023t = s02;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f1006a;
        if (actionMenuView.f966p == null) {
            n nVar = (n) actionMenuView.getMenu();
            if (this.f1000L == null) {
                this.f1000L = new c1(this);
            }
            this.f1006a.setExpandedActionViewsExclusive(true);
            nVar.b(this.f1000L, this.f1013j);
            t();
        }
    }

    public final void f() {
        if (this.f1006a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f1006a = actionMenuView;
            actionMenuView.setPopupTheme(this.f1014k);
            this.f1006a.setOnMenuItemClickListener(this.f997I);
            ActionMenuView actionMenuView2 = this.f1006a;
            a1 a1Var = new a1(this);
            actionMenuView2.getClass();
            actionMenuView2.f971u = a1Var;
            d1 d1VarH = h();
            d1VarH.f2340a = (this.f1017n & 112) | 8388613;
            this.f1006a.setLayoutParams(d1VarH);
            b(this.f1006a, false);
        }
    }

    public final void g() {
        if (this.d == null) {
            this.d = new C0302y(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            d1 d1VarH = h();
            d1VarH.f2340a = (this.f1017n & 112) | 8388611;
            this.d.setLayoutParams(d1VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C0302y c0302y = this.h;
        if (c0302y != null) {
            return c0302y.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C0302y c0302y = this.h;
        if (c0302y != null) {
            return c0302y.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        S0 s02 = this.f1023t;
        if (s02 != null) {
            return s02.f2293g ? s02.f2288a : s02.f2289b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.f1025v;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        S0 s02 = this.f1023t;
        if (s02 != null) {
            return s02.f2288a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        S0 s02 = this.f1023t;
        if (s02 != null) {
            return s02.f2289b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        S0 s02 = this.f1023t;
        if (s02 != null) {
            return s02.f2293g ? s02.f2289b : s02.f2288a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.f1024u;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        n nVar;
        ActionMenuView actionMenuView = this.f1006a;
        return (actionMenuView == null || (nVar = actionMenuView.f966p) == null || !nVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f1025v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1024u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C0245A c0245a = this.f1009e;
        if (c0245a != null) {
            return c0245a.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C0245A c0245a = this.f1009e;
        if (c0245a != null) {
            return c0245a.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f1006a.getMenu();
    }

    public View getNavButtonView() {
        return this.d;
    }

    public CharSequence getNavigationContentDescription() {
        C0302y c0302y = this.d;
        if (c0302y != null) {
            return c0302y.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C0302y c0302y = this.d;
        if (c0302y != null) {
            return c0302y.getDrawable();
        }
        return null;
    }

    public C0275k getOuterActionMenuPresenter() {
        return this.f999K;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f1006a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f1013j;
    }

    public int getPopupTheme() {
        return this.f1014k;
    }

    public CharSequence getSubtitle() {
        return this.f1027y;
    }

    public final TextView getSubtitleTextView() {
        return this.f1008c;
    }

    public CharSequence getTitle() {
        return this.x;
    }

    public int getTitleMarginBottom() {
        return this.f1022s;
    }

    public int getTitleMarginEnd() {
        return this.f1020q;
    }

    public int getTitleMarginStart() {
        return this.f1019p;
    }

    public int getTitleMarginTop() {
        return this.f1021r;
    }

    public final TextView getTitleTextView() {
        return this.f1007b;
    }

    public InterfaceC0284o0 getWrapper() {
        Drawable drawable;
        if (this.f998J == null) {
            h1 h1Var = new h1();
            h1Var.f2365n = 0;
            h1Var.f2354a = this;
            h1Var.h = getTitle();
            h1Var.f2360i = getSubtitle();
            h1Var.f2359g = h1Var.h != null;
            h1Var.f2358f = getNavigationIcon();
            C0037m c0037mM = C0037m.m(getContext(), null, AbstractC0113a.f1497a, R.attr.actionBarStyle);
            h1Var.f2366o = c0037mM.i(15);
            TypedArray typedArray = (TypedArray) c0037mM.f196b;
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                h1Var.f2359g = true;
                h1Var.h = text;
                if ((h1Var.f2355b & 8) != 0) {
                    Toolbar toolbar = h1Var.f2354a;
                    toolbar.setTitle(text);
                    if (h1Var.f2359g) {
                        K.i(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                h1Var.f2360i = text2;
                if ((h1Var.f2355b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableI = c0037mM.i(20);
            if (drawableI != null) {
                h1Var.f2357e = drawableI;
                h1Var.c();
            }
            Drawable drawableI2 = c0037mM.i(17);
            if (drawableI2 != null) {
                h1Var.d = drawableI2;
                h1Var.c();
            }
            if (h1Var.f2358f == null && (drawable = h1Var.f2366o) != null) {
                h1Var.f2358f = drawable;
                int i2 = h1Var.f2355b & 4;
                Toolbar toolbar2 = h1Var.f2354a;
                if (i2 != 0) {
                    toolbar2.setNavigationIcon(drawable);
                } else {
                    toolbar2.setNavigationIcon((Drawable) null);
                }
            }
            h1Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = h1Var.f2356c;
                if (view != null && (h1Var.f2355b & 16) != 0) {
                    removeView(view);
                }
                h1Var.f2356c = viewInflate;
                if (viewInflate != null && (h1Var.f2355b & 16) != 0) {
                    addView(viewInflate);
                }
                h1Var.a(h1Var.f2355b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.f1023t.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f1015l = resourceId2;
                C0266f0 c0266f0 = this.f1007b;
                if (c0266f0 != null) {
                    c0266f0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f1016m = resourceId3;
                C0266f0 c0266f02 = this.f1008c;
                if (c0266f02 != null) {
                    c0266f02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0037mM.r();
            if (R.string.abc_action_bar_up_description != h1Var.f2365n) {
                h1Var.f2365n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i3 = h1Var.f2365n;
                    h1Var.f2361j = i3 != 0 ? getContext().getString(i3) : null;
                    h1Var.b();
                }
            }
            h1Var.f2361j = getNavigationContentDescription();
            setNavigationOnClickListener(new g1(h1Var));
            this.f998J = h1Var;
        }
        return this.f998J;
    }

    public final int j(View view, int i2) {
        d1 d1Var = (d1) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = d1Var.f2340a & 112;
        if (i4 != 16 && i4 != 48 && i4 != 80) {
            i4 = this.f1026w & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) d1Var).bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i5 = ((ViewGroup.MarginLayoutParams) d1Var).topMargin;
        if (iMax < i5) {
            iMax = i5;
        } else {
            int i6 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i7 = ((ViewGroup.MarginLayoutParams) d1Var).bottomMargin;
            if (i6 < i7) {
                iMax = Math.max(0, iMax - (i7 - i6));
            }
        }
        return paddingTop + iMax;
    }

    public final void m() {
        Iterator it = this.f996H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        this.f995G.n();
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f996H = currentMenuItems2;
    }

    public final boolean n(View view) {
        return view.getParent() == this || this.f993E.contains(view);
    }

    public final int o(View view, int i2, int i3, int[] iArr) {
        d1 d1Var = (d1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) d1Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) d1Var).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f1005Q);
        t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f991C = false;
        }
        if (!this.f991C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f991C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f991C = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0298 A[LOOP:0: B:105:0x0296->B:106:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b5 A[LOOP:1: B:108:0x02b3->B:109:0x02b5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[LOOP:2: B:111:0x02d1->B:112:0x02d3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0321 A[LOOP:3: B:120:0x031f->B:121:0x0321, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0221  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z2 = p1.f2438a;
        int i4 = 0;
        if (getLayoutDirection() == 1) {
            c3 = 1;
            c2 = 0;
        } else {
            c2 = 1;
            c3 = 0;
        }
        if (s(this.d)) {
            r(this.d, i2, 0, i3, this.f1018o);
            iK = k(this.d) + this.d.getMeasuredWidth();
            iMax = Math.max(0, l(this.d) + this.d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (s(this.h)) {
            r(this.h, i2, 0, i3, this.f1018o);
            iK = k(this.h) + this.h.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.h) + this.h.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.f994F;
        iArr[c3] = iMax4;
        if (s(this.f1006a)) {
            r(this.f1006a, i2, iMax3, i3, this.f1018o);
            iK2 = k(this.f1006a) + this.f1006a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f1006a) + this.f1006a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1006a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[c2] = Math.max(0, currentContentInsetEnd - iK2);
        if (s(this.f1012i)) {
            iMax5 += q(this.f1012i, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f1012i) + this.f1012i.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1012i.getMeasuredState());
        }
        if (s(this.f1009e)) {
            iMax5 += q(this.f1009e, i2, iMax5, i3, 0, iArr);
            iMax = Math.max(iMax, l(this.f1009e) + this.f1009e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f1009e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (((d1) childAt.getLayoutParams()).f2341b == 0 && s(childAt)) {
                iMax5 += q(childAt, i2, iMax5, i3, 0, iArr);
                iMax = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i6 = this.f1021r + this.f1022s;
        int i7 = this.f1019p + this.f1020q;
        if (s(this.f1007b)) {
            q(this.f1007b, i2, iMax5 + i7, i3, i6, iArr);
            int iK3 = k(this.f1007b) + this.f1007b.getMeasuredWidth();
            iL = l(this.f1007b) + this.f1007b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f1007b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (s(this.f1008c)) {
            iMax2 = Math.max(iMax2, q(this.f1008c, i2, iMax5 + i7, i3, iL + i6, iArr));
            iL = l(this.f1008c) + this.f1008c.getMeasuredHeight() + iL;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f1008c.getMeasuredState());
        }
        int iMax6 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax6;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + iMax5 + iMax2, getSuggestedMinimumWidth()), i2, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16);
        if (!this.f1001M) {
            i4 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = getChildAt(i8);
            if (s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i4 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i4);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof f1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f1 f1Var = (f1) parcelable;
        super.onRestoreInstanceState(f1Var.f369a);
        ActionMenuView actionMenuView = this.f1006a;
        n nVar = actionMenuView != null ? actionMenuView.f966p : null;
        int i2 = f1Var.f2348c;
        if (i2 != 0 && this.f1000L != null && nVar != null && (menuItemFindItem = nVar.findItem(i2)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (f1Var.d) {
            b bVar = this.f1005Q;
            removeCallbacks(bVar);
            post(bVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        d();
        S0 s02 = this.f1023t;
        boolean z2 = i2 == 1;
        if (z2 == s02.f2293g) {
            return;
        }
        s02.f2293g = z2;
        if (!s02.h) {
            s02.f2288a = s02.f2291e;
            s02.f2289b = s02.f2292f;
            return;
        }
        if (z2) {
            int i3 = s02.d;
            if (i3 == Integer.MIN_VALUE) {
                i3 = s02.f2291e;
            }
            s02.f2288a = i3;
            int i4 = s02.f2290c;
            if (i4 == Integer.MIN_VALUE) {
                i4 = s02.f2292f;
            }
            s02.f2289b = i4;
            return;
        }
        int i5 = s02.f2290c;
        if (i5 == Integer.MIN_VALUE) {
            i5 = s02.f2291e;
        }
        s02.f2288a = i5;
        int i6 = s02.d;
        if (i6 == Integer.MIN_VALUE) {
            i6 = s02.f2292f;
        }
        s02.f2289b = i6;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0275k c0275k;
        p pVar;
        f1 f1Var = new f1(super.onSaveInstanceState());
        c1 c1Var = this.f1000L;
        if (c1Var != null && (pVar = c1Var.f2337b) != null) {
            f1Var.f2348c = pVar.f2138a;
        }
        ActionMenuView actionMenuView = this.f1006a;
        f1Var.d = (actionMenuView == null || (c0275k = actionMenuView.f970t) == null || !c0275k.j()) ? false : true;
        return f1Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f990B = false;
        }
        if (!this.f990B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f990B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f990B = false;
        }
        return true;
    }

    public final int p(View view, int i2, int i3, int[] iArr) {
        d1 d1Var = (d1) view.getLayoutParams();
        int i4 = ((ViewGroup.MarginLayoutParams) d1Var).rightMargin - iArr[1];
        int iMax = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int iJ = j(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) d1Var).leftMargin);
    }

    public final int q(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + iMax + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void r(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i5 >= 0) {
            if (mode != 0) {
                i5 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i5);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final boolean s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z2) {
        if (this.f1004P != z2) {
            this.f1004P = z2;
            t();
        }
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(AbstractC0062a.v(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.f1001M = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1025v) {
            this.f1025v = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = Integer.MIN_VALUE;
        }
        if (i2 != this.f1024u) {
            this.f1024u = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(AbstractC0062a.v(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(AbstractC0062a.v(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f1006a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f1014k != i2) {
            this.f1014k = i2;
            if (i2 == 0) {
                this.f1013j = getContext();
            } else {
                this.f1013j = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.f1022s = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.f1020q = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.f1019p = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.f1021r = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public final void t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = b1.a(this);
            c1 c1Var = this.f1000L;
            boolean z2 = (c1Var == null || c1Var.f2337b == null || onBackInvokedDispatcherA == null || !isAttachedToWindow() || !this.f1004P) ? false : true;
            if (z2 && this.f1003O == null) {
                if (this.f1002N == null) {
                    this.f1002N = b1.b(new Z0(this, 0));
                }
                b1.c(onBackInvokedDispatcherA, this.f1002N);
                this.f1003O = onBackInvokedDispatcherA;
                return;
            }
            if (z2 || (onBackInvokedDispatcher = this.f1003O) == null) {
                return;
            }
            b1.d(onBackInvokedDispatcher, this.f1002N);
            this.f1003O = null;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        d1 d1Var = new d1(context, attributeSet);
        d1Var.f2340a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1498b);
        d1Var.f2340a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        d1Var.f2341b = 0;
        return d1Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        C0302y c0302y = this.h;
        if (c0302y != null) {
            c0302y.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.h.setImageDrawable(drawable);
        } else {
            C0302y c0302y = this.h;
            if (c0302y != null) {
                c0302y.setImageDrawable(this.f1010f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f1009e == null) {
                this.f1009e = new C0245A(getContext(), null, 0);
            }
            if (!n(this.f1009e)) {
                b(this.f1009e, true);
            }
        } else {
            C0245A c0245a = this.f1009e;
            if (c0245a != null && n(c0245a)) {
                removeView(this.f1009e);
                this.f993E.remove(this.f1009e);
            }
        }
        C0245A c0245a2 = this.f1009e;
        if (c0245a2 != null) {
            c0245a2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f1009e == null) {
            this.f1009e = new C0245A(getContext(), null, 0);
        }
        C0245A c0245a = this.f1009e;
        if (c0245a != null) {
            c0245a.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        C0302y c0302y = this.d;
        if (c0302y != null) {
            c0302y.setContentDescription(charSequence);
            AbstractC0062a.V(this.d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!n(this.d)) {
                b(this.d, true);
            }
        } else {
            C0302y c0302y = this.d;
            if (c0302y != null && n(c0302y)) {
                removeView(this.d);
                this.f993E.remove(this.d);
            }
        }
        C0302y c0302y2 = this.d;
        if (c0302y2 != null) {
            c0302y2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0266f0 c0266f0 = this.f1008c;
            if (c0266f0 != null && n(c0266f0)) {
                removeView(this.f1008c);
                this.f993E.remove(this.f1008c);
            }
        } else {
            if (this.f1008c == null) {
                Context context = getContext();
                C0266f0 c0266f02 = new C0266f0(context, null);
                this.f1008c = c0266f02;
                c0266f02.setSingleLine();
                this.f1008c.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1016m;
                if (i2 != 0) {
                    this.f1008c.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f989A;
                if (colorStateList != null) {
                    this.f1008c.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1008c)) {
                b(this.f1008c, true);
            }
        }
        C0266f0 c0266f03 = this.f1008c;
        if (c0266f03 != null) {
            c0266f03.setText(charSequence);
        }
        this.f1027y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f989A = colorStateList;
        C0266f0 c0266f0 = this.f1008c;
        if (c0266f0 != null) {
            c0266f0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C0266f0 c0266f0 = this.f1007b;
            if (c0266f0 != null && n(c0266f0)) {
                removeView(this.f1007b);
                this.f993E.remove(this.f1007b);
            }
        } else {
            if (this.f1007b == null) {
                Context context = getContext();
                C0266f0 c0266f02 = new C0266f0(context, null);
                this.f1007b = c0266f02;
                c0266f02.setSingleLine();
                this.f1007b.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f1015l;
                if (i2 != 0) {
                    this.f1007b.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.f1028z;
                if (colorStateList != null) {
                    this.f1007b.setTextColor(colorStateList);
                }
            }
            if (!n(this.f1007b)) {
                b(this.f1007b, true);
            }
        }
        C0266f0 c0266f03 = this.f1007b;
        if (c0266f03 != null) {
            c0266f03.setText(charSequence);
        }
        this.x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1028z = colorStateList;
        C0266f0 c0266f0 = this.f1007b;
        if (c0266f0 != null) {
            c0266f0.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(e1 e1Var) {
    }
}
