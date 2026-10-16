package androidx.appcompat.widget;

import G.K;
import G.O;
import a.AbstractC0062a;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import f.AbstractC0113a;
import g.ViewOnClickListenerC0129a;
import k.AbstractC0225a;
import l.InterfaceC0237B;
import l.n;
import m.C0255a;
import m.C0267g;
import m.C0275k;
import m.p1;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: a, reason: collision with root package name */
    public final C0255a f920a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f921b;

    /* renamed from: c, reason: collision with root package name */
    public ActionMenuView f922c;
    public C0275k d;

    /* renamed from: e, reason: collision with root package name */
    public int f923e;

    /* renamed from: f, reason: collision with root package name */
    public O f924f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f925g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f926i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f927j;

    /* renamed from: k, reason: collision with root package name */
    public View f928k;

    /* renamed from: l, reason: collision with root package name */
    public View f929l;

    /* renamed from: m, reason: collision with root package name */
    public View f930m;

    /* renamed from: n, reason: collision with root package name */
    public LinearLayout f931n;

    /* renamed from: o, reason: collision with root package name */
    public TextView f932o;

    /* renamed from: p, reason: collision with root package name */
    public TextView f933p;

    /* renamed from: q, reason: collision with root package name */
    public final int f934q;

    /* renamed from: r, reason: collision with root package name */
    public final int f935r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f936s;

    /* renamed from: t, reason: collision with root package name */
    public final int f937t;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f920a = new C0255a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f921b = context;
        } else {
            this.f921b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.d, R.attr.actionModeStyle, 0);
        setBackground((!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : AbstractC0062a.v(context, resourceId));
        this.f934q = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f935r = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.f923e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.f937t = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE), i3);
        return Math.max(0, i2 - view.getMeasuredWidth());
    }

    public static int g(View view, int i2, int i3, int i4, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z2) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    public final void c(AbstractC0225a abstractC0225a) {
        View view = this.f928k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f937t, (ViewGroup) this, false);
            this.f928k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f928k);
        }
        View viewFindViewById = this.f928k.findViewById(R.id.action_mode_close_button);
        this.f929l = viewFindViewById;
        viewFindViewById.setOnClickListener(new ViewOnClickListenerC0129a(1, abstractC0225a));
        n nVarC = abstractC0225a.c();
        C0275k c0275k = this.d;
        if (c0275k != null) {
            c0275k.f();
            C0267g c0267g = c0275k.f2388t;
            if (c0267g != null && c0267g.b()) {
                c0267g.f2178i.dismiss();
            }
        }
        C0275k c0275k2 = new C0275k(getContext());
        this.d = c0275k2;
        c0275k2.f2380l = true;
        c0275k2.f2381m = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        nVarC.b(this.d, this.f921b);
        C0275k c0275k3 = this.d;
        InterfaceC0237B interfaceC0237B = c0275k3.h;
        if (interfaceC0237B == null) {
            InterfaceC0237B interfaceC0237B2 = (InterfaceC0237B) c0275k3.d.inflate(c0275k3.f2375f, (ViewGroup) this, false);
            c0275k3.h = interfaceC0237B2;
            interfaceC0237B2.a(c0275k3.f2373c);
            c0275k3.e();
        }
        InterfaceC0237B interfaceC0237B3 = c0275k3.h;
        if (interfaceC0237B != interfaceC0237B3) {
            ((ActionMenuView) interfaceC0237B3).setPresenter(c0275k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC0237B3;
        this.f922c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f922c, layoutParams);
    }

    public final void d() {
        if (this.f931n == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f931n = linearLayout;
            this.f932o = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f933p = (TextView) this.f931n.findViewById(R.id.action_bar_subtitle);
            int i2 = this.f934q;
            if (i2 != 0) {
                this.f932o.setTextAppearance(getContext(), i2);
            }
            int i3 = this.f935r;
            if (i3 != 0) {
                this.f933p.setTextAppearance(getContext(), i3);
            }
        }
        this.f932o.setText(this.f926i);
        this.f933p.setText(this.f927j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f926i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f927j);
        this.f933p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f931n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f931n.getParent() == null) {
            addView(this.f931n);
        }
    }

    public final void e() {
        removeAllViews();
        this.f930m = null;
        this.f922c = null;
        this.d = null;
        View view = this.f929l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f924f != null ? this.f920a.f2319b : getVisibility();
    }

    public int getContentHeight() {
        return this.f923e;
    }

    public CharSequence getSubtitle() {
        return this.f927j;
    }

    public CharSequence getTitle() {
        return this.f926i;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            O o2 = this.f924f;
            if (o2 != null) {
                o2.b();
            }
            super.setVisibility(i2);
        }
    }

    public final O i(int i2, long j2) {
        O o2 = this.f924f;
        if (o2 != null) {
            o2.b();
        }
        C0255a c0255a = this.f920a;
        if (i2 != 0) {
            O oA = K.a(this);
            oA.a(0.0f);
            oA.c(j2);
            c0255a.f2320c.f924f = oA;
            c0255a.f2319b = i2;
            oA.d(c0255a);
            return oA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        O oA2 = K.a(this);
        oA2.a(1.0f);
        oA2.c(j2);
        c0255a.f2320c.f924f = oA2;
        c0255a.f2319b = i2;
        oA2.d(c0255a);
        return oA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0113a.f1497a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        C0275k c0275k = this.d;
        if (c0275k != null) {
            Configuration configuration2 = c0275k.f2372b.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            c0275k.f2384p = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            n nVar = c0275k.f2373c;
            if (nVar != null) {
                nVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0275k c0275k = this.d;
        if (c0275k != null) {
            c0275k.f();
            C0267g c0267g = this.d.f2388t;
            if (c0267g == null || !c0267g.b()) {
                return;
            }
            c0267g.f2178i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
        }
        if (!this.h) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        boolean z3 = p1.f2438a;
        boolean z4 = getLayoutDirection() == 1;
        int paddingRight = z4 ? (i4 - i2) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
        View view = this.f928k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f928k.getLayoutParams();
            int i6 = z4 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i7 = z4 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i8 = z4 ? paddingRight - i6 : paddingRight + i6;
            int iG = g(this.f928k, i8, paddingTop, paddingTop2, z4) + i8;
            paddingRight = z4 ? iG - i7 : iG + i7;
        }
        LinearLayout linearLayout = this.f931n;
        if (linearLayout != null && this.f930m == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f931n, paddingRight, paddingTop, paddingTop2, z4);
        }
        View view2 = this.f930m;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, z4);
        }
        int paddingLeft = z4 ? getPaddingLeft() : (i4 - i2) - getPaddingRight();
        ActionMenuView actionMenuView = this.f922c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        if (View.MeasureSpec.getMode(i2) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i3) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = this.f923e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i3);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f928k;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f928k.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f922c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f922c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f931n;
        if (linearLayout != null && this.f930m == null) {
            if (this.f936s) {
                this.f931n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f931n.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f931n.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f930m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i4 = layoutParams.width;
            int i5 = i4 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i4 >= 0) {
                paddingLeft = Math.min(i4, paddingLeft);
            }
            int i6 = layoutParams.height;
            int i7 = i6 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i6 >= 0) {
                iMin = Math.min(i6, iMin);
            }
            this.f930m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i5), View.MeasureSpec.makeMeasureSpec(iMin, i7));
        }
        if (this.f923e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            int measuredHeight = getChildAt(i9).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i8) {
                i8 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i8);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f925g = false;
        }
        if (!this.f925g) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f925g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f925g = false;
        }
        return true;
    }

    public void setContentHeight(int i2) {
        this.f923e = i2;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f930m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f930m = view;
        if (view != null && (linearLayout = this.f931n) != null) {
            removeView(linearLayout);
            this.f931n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f927j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f926i = charSequence;
        d();
        K.i(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f936s) {
            requestLayout();
        }
        this.f936s = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
