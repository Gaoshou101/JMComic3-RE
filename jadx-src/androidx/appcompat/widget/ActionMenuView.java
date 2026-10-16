package androidx.appcompat.widget;

import L.c;
import X.i;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import l.InterfaceC0237B;
import l.m;
import l.n;
import l.p;
import m.A0;
import m.C0267g;
import m.C0273j;
import m.C0275k;
import m.C0279m;
import m.C0305z0;
import m.InterfaceC0277l;
import m.InterfaceC0281n;
import m.a1;
import m.p1;

/* loaded from: classes.dex */
public class ActionMenuView extends A0 implements m, InterfaceC0237B {

    /* renamed from: p, reason: collision with root package name */
    public n f966p;

    /* renamed from: q, reason: collision with root package name */
    public Context f967q;

    /* renamed from: r, reason: collision with root package name */
    public int f968r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f969s;

    /* renamed from: t, reason: collision with root package name */
    public C0275k f970t;

    /* renamed from: u, reason: collision with root package name */
    public a1 f971u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f972v;

    /* renamed from: w, reason: collision with root package name */
    public int f973w;
    public final int x;

    /* renamed from: y, reason: collision with root package name */
    public final int f974y;

    /* renamed from: z, reason: collision with root package name */
    public InterfaceC0281n f975z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.x = (int) (56.0f * f2);
        this.f974y = (int) (f2 * 4.0f);
        this.f967q = context;
        this.f968r = 0;
    }

    public static C0279m i() {
        C0279m c0279m = new C0279m(-2, -2);
        c0279m.f2422a = false;
        ((LinearLayout.LayoutParams) c0279m).gravity = 16;
        return c0279m;
    }

    public static C0279m j(ViewGroup.LayoutParams layoutParams) {
        C0279m c0279m;
        if (layoutParams == null) {
            return i();
        }
        if (layoutParams instanceof C0279m) {
            C0279m c0279m2 = (C0279m) layoutParams;
            c0279m = new C0279m(c0279m2);
            c0279m.f2422a = c0279m2.f2422a;
        } else {
            c0279m = new C0279m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c0279m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c0279m).gravity = 16;
        }
        return c0279m;
    }

    @Override // l.InterfaceC0237B
    public final void a(n nVar) {
        this.f966p = nVar;
    }

    @Override // l.m
    public final boolean b(p pVar) {
        return this.f966p.q(pVar, null, 0);
    }

    @Override // m.A0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0279m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // m.A0
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ C0305z0 generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.A0
    /* renamed from: f */
    public final C0305z0 generateLayoutParams(AttributeSet attributeSet) {
        return new C0279m(getContext(), attributeSet);
    }

    @Override // m.A0
    /* renamed from: g */
    public final /* bridge */ /* synthetic */ C0305z0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    @Override // m.A0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return i();
    }

    @Override // m.A0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return j(layoutParams);
    }

    public Menu getMenu() {
        if (this.f966p == null) {
            Context context = getContext();
            n nVar = new n(context);
            this.f966p = nVar;
            nVar.f2114e = new i(25, this);
            C0275k c0275k = new C0275k(context);
            this.f970t = c0275k;
            c0275k.f2380l = true;
            c0275k.f2381m = true;
            c0275k.f2374e = new c(19);
            this.f966p.b(c0275k, this.f967q);
            C0275k c0275k2 = this.f970t;
            c0275k2.h = this;
            this.f966p = c0275k2.f2373c;
        }
        return this.f966p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C0275k c0275k = this.f970t;
        C0273j c0273j = c0275k.f2377i;
        if (c0273j != null) {
            return c0273j.getDrawable();
        }
        if (c0275k.f2379k) {
            return c0275k.f2378j;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f968r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public final boolean k(int i2) {
        boolean zA = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof InterfaceC0277l)) {
            zA = ((InterfaceC0277l) childAt).a();
        }
        return (i2 <= 0 || !(childAt2 instanceof InterfaceC0277l)) ? zA : zA | ((InterfaceC0277l) childAt2).c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C0275k c0275k = this.f970t;
        if (c0275k != null) {
            c0275k.e();
            if (this.f970t.j()) {
                this.f970t.f();
                this.f970t.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0275k c0275k = this.f970t;
        if (c0275k != null) {
            c0275k.f();
            C0267g c0267g = c0275k.f2388t;
            if (c0267g == null || !c0267g.b()) {
                return;
            }
            c0267g.f2178i.dismiss();
        }
    }

    @Override // m.A0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int width;
        int paddingLeft;
        if (!this.f972v) {
            super.onLayout(z2, i2, i3, i4, i5);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i5 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i4 - i2;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = p1.f2438a;
        boolean z4 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C0279m c0279m = (C0279m) childAt.getLayoutParams();
                if (c0279m.f2422a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (k(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z4) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) c0279m).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c0279m).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c0279m).leftMargin) + ((LinearLayout.LayoutParams) c0279m).rightMargin;
                    k(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int iMax = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z4) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C0279m c0279m2 = (C0279m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c0279m2.f2422a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c0279m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c0279m2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C0279m c0279m3 = (C0279m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c0279m3.f2422a) {
                int i19 = paddingLeft2 + ((LinearLayout.LayoutParams) c0279m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) c0279m3).rightMargin + iMax + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // m.A0, android.view.View
    public final void onMeasure(int i2, int i3) {
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        int i6;
        int i7;
        int i8;
        ?? r4;
        int i9;
        int i10;
        int i11;
        n nVar;
        boolean z4 = this.f972v;
        boolean z5 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f972v = z5;
        if (z4 != z5) {
            this.f973w = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f972v && (nVar = this.f966p) != null && size != this.f973w) {
            this.f973w = size;
            nVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.f972v || childCount <= 0) {
            for (int i12 = 0; i12 < childCount; i12++) {
                C0279m c0279m = (C0279m) getChildAt(i12).getLayoutParams();
                ((LinearLayout.LayoutParams) c0279m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c0279m).leftMargin = 0;
            }
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i2);
        int size3 = View.MeasureSpec.getSize(i3);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingBottom, -2);
        int i13 = size2 - paddingRight;
        int i14 = this.x;
        int i15 = i13 / i14;
        int i16 = i13 % i14;
        if (i15 == 0) {
            setMeasuredDimension(i13, 0);
            return;
        }
        int i17 = (i16 / i15) + i14;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        boolean z6 = false;
        int i20 = 0;
        long j2 = 0;
        while (true) {
            i4 = this.f974y;
            if (i19 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i19);
            int i21 = size3;
            int i22 = i13;
            if (childAt.getVisibility() == 8) {
                i9 = mode;
                i10 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i23 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i4, 0, i4, 0);
                }
                C0279m c0279m2 = (C0279m) childAt.getLayoutParams();
                c0279m2.f2426f = false;
                c0279m2.f2424c = 0;
                c0279m2.f2423b = 0;
                c0279m2.d = false;
                ((LinearLayout.LayoutParams) c0279m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c0279m2).rightMargin = 0;
                c0279m2.f2425e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i24 = c0279m2.f2422a ? 1 : i15;
                C0279m c0279m3 = (C0279m) childAt.getLayoutParams();
                i9 = mode;
                i10 = paddingBottom;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i24 <= 0 || (z8 && i24 < 2)) {
                    i11 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i24 * i17, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i11 = measuredWidth / i17;
                    if (measuredWidth % i17 != 0) {
                        i11++;
                    }
                    if (z8 && i11 < 2) {
                        i11 = 2;
                    }
                }
                c0279m3.d = !c0279m3.f2422a && z8;
                c0279m3.f2423b = i11;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i11 * i17, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i11);
                if (c0279m2.d) {
                    i20++;
                }
                if (c0279m2.f2422a) {
                    z6 = true;
                }
                i15 -= i11;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i11 == 1) {
                    j2 |= 1 << i19;
                }
                i18 = i23;
            }
            i19++;
            size3 = i21;
            i13 = i22;
            paddingBottom = i10;
            mode = i9;
        }
        int i25 = mode;
        int i26 = i13;
        int i27 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i20 > 0 && i15 > 0) {
            int i28 = Integer.MAX_VALUE;
            int i29 = 0;
            int i30 = 0;
            long j3 = 0;
            while (i30 < childCount2) {
                C0279m c0279m4 = (C0279m) getChildAt(i30).getLayoutParams();
                boolean z11 = z10;
                if (c0279m4.d) {
                    int i31 = c0279m4.f2423b;
                    if (i31 < i28) {
                        j3 = 1 << i30;
                        i28 = i31;
                        i29 = 1;
                    } else if (i31 == i28) {
                        j3 |= 1 << i30;
                        i29++;
                    }
                }
                i30++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i29 > i15) {
                break;
            }
            int i32 = i28 + 1;
            int i33 = 0;
            while (i33 < childCount2) {
                View childAt2 = getChildAt(i33);
                C0279m c0279m5 = (C0279m) childAt2.getLayoutParams();
                int i34 = iMax;
                int i35 = childMeasureSpec;
                int i36 = childCount2;
                long j4 = 1 << i33;
                if ((j3 & j4) != 0) {
                    if (z9 && c0279m5.f2425e) {
                        r4 = 1;
                        r4 = 1;
                        if (i15 == 1) {
                            childAt2.setPadding(i4 + i17, 0, i4, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c0279m5.f2423b += r4;
                    c0279m5.f2426f = r4;
                    i15--;
                } else if (c0279m5.f2423b == i32) {
                    j2 |= j4;
                }
                i33++;
                childMeasureSpec = i35;
                iMax = i34;
                childCount2 = i36;
            }
            z10 = true;
        }
        z2 = z10;
        int i37 = iMax;
        int i38 = childMeasureSpec;
        int i39 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i15 <= 0 || j2 == 0 || (i15 >= i18 - 1 && !z12 && iMax2 <= 1)) {
            i5 = i39;
            z3 = z2;
        } else {
            float fBitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C0279m) getChildAt(0).getLayoutParams()).f2425e) {
                    fBitCount -= 0.5f;
                }
                int i40 = i39 - 1;
                if ((j2 & (1 << i40)) != 0 && !((C0279m) getChildAt(i40).getLayoutParams()).f2425e) {
                    fBitCount -= 0.5f;
                }
            }
            int i41 = fBitCount > 0.0f ? (int) ((i15 * i17) / fBitCount) : 0;
            boolean z13 = z2;
            i5 = i39;
            for (int i42 = 0; i42 < i5; i42++) {
                if ((j2 & (1 << i42)) != 0) {
                    View childAt3 = getChildAt(i42);
                    C0279m c0279m6 = (C0279m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c0279m6.f2424c = i41;
                        c0279m6.f2426f = true;
                        if (i42 == 0 && !c0279m6.f2425e) {
                            ((LinearLayout.LayoutParams) c0279m6).leftMargin = (-i41) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c0279m6.f2422a) {
                            c0279m6.f2424c = i41;
                            c0279m6.f2426f = true;
                            ((LinearLayout.LayoutParams) c0279m6).rightMargin = (-i41) / 2;
                            z13 = true;
                        } else {
                            if (i42 != 0) {
                                ((LinearLayout.LayoutParams) c0279m6).leftMargin = i41 / 2;
                            }
                            if (i42 != i5 - 1) {
                                ((LinearLayout.LayoutParams) c0279m6).rightMargin = i41 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i43 = 0;
            while (i43 < i5) {
                View childAt4 = getChildAt(i43);
                C0279m c0279m7 = (C0279m) childAt4.getLayoutParams();
                if (c0279m7.f2426f) {
                    i8 = i38;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c0279m7.f2423b * i17) + c0279m7.f2424c, 1073741824), i8);
                } else {
                    i8 = i38;
                }
                i43++;
                i38 = i8;
            }
        }
        if (i25 != 1073741824) {
            i7 = i26;
            i6 = i37;
        } else {
            i6 = i27;
            i7 = i26;
        }
        setMeasuredDimension(i7, i6);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f970t.f2385q = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC0281n interfaceC0281n) {
        this.f975z = interfaceC0281n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C0275k c0275k = this.f970t;
        C0273j c0273j = c0275k.f2377i;
        if (c0273j != null) {
            c0273j.setImageDrawable(drawable);
        } else {
            c0275k.f2379k = true;
            c0275k.f2378j = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f969s = z2;
    }

    public void setPopupTheme(int i2) {
        if (this.f968r != i2) {
            this.f968r = i2;
            if (i2 == 0) {
                this.f967q = getContext();
            } else {
                this.f967q = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setPresenter(C0275k c0275k) {
        this.f970t = c0275k;
        c0275k.h = this;
        this.f966p = c0275k.f2373c;
    }

    @Override // m.A0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C0279m(getContext(), attributeSet);
    }
}
