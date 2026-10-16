package androidx.core.widget;

import C.b;
import G.C0033i;
import G.C0039o;
import G.D;
import G.InterfaceC0040p;
import G.InterfaceC0041q;
import G.K;
import G.r;
import J.c;
import J.e;
import J.f;
import J.g;
import J.i;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0041q {

    /* renamed from: B, reason: collision with root package name */
    public static final float f1070B = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* renamed from: C, reason: collision with root package name */
    public static final e f1071C = new e();

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f1072D = {R.attr.fillViewport};

    /* renamed from: A, reason: collision with root package name */
    public final C0033i f1073A;

    /* renamed from: a, reason: collision with root package name */
    public final float f1074a;

    /* renamed from: b, reason: collision with root package name */
    public long f1075b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1076c;
    public final OverScroller d;

    /* renamed from: e, reason: collision with root package name */
    public final EdgeEffect f1077e;

    /* renamed from: f, reason: collision with root package name */
    public final EdgeEffect f1078f;

    /* renamed from: g, reason: collision with root package name */
    public int f1079g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1080i;

    /* renamed from: j, reason: collision with root package name */
    public View f1081j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f1082k;

    /* renamed from: l, reason: collision with root package name */
    public VelocityTracker f1083l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1084m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1085n;

    /* renamed from: o, reason: collision with root package name */
    public final int f1086o;

    /* renamed from: p, reason: collision with root package name */
    public final int f1087p;

    /* renamed from: q, reason: collision with root package name */
    public final int f1088q;

    /* renamed from: r, reason: collision with root package name */
    public int f1089r;

    /* renamed from: s, reason: collision with root package name */
    public final int[] f1090s;

    /* renamed from: t, reason: collision with root package name */
    public final int[] f1091t;

    /* renamed from: u, reason: collision with root package name */
    public int f1092u;

    /* renamed from: v, reason: collision with root package name */
    public int f1093v;

    /* renamed from: w, reason: collision with root package name */
    public i f1094w;
    public final r x;

    /* renamed from: y, reason: collision with root package name */
    public final C0039o f1095y;

    /* renamed from: z, reason: collision with root package name */
    public float f1096z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.a7m3p9xv.t6qk2z8.app.R.attr.nestedScrollViewStyle);
        this.f1076c = new Rect();
        this.h = true;
        this.f1080i = false;
        this.f1081j = null;
        this.f1082k = false;
        this.f1085n = true;
        this.f1089r = -1;
        this.f1090s = new int[2];
        this.f1091t = new int[2];
        this.f1073A = new C0033i(getContext(), new X.i(6, this));
        int i2 = Build.VERSION.SDK_INT;
        this.f1077e = i2 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1078f = i2 >= 31 ? c.a(context, attributeSet) : new EdgeEffect(context);
        this.f1074a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f1086o = viewConfiguration.getScaledTouchSlop();
        this.f1087p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1088q = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f1072D, com.a7m3p9xv.t6qk2z8.app.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.x = new r();
        this.f1095y = new C0039o(this);
        setNestedScrollingEnabled(true);
        K.h(this, f1071C);
    }

    public static boolean m(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && m((View) parent, nestedScrollView);
    }

    @Override // G.InterfaceC0040p
    public final void a(View view, View view2, int i2, int i3) {
        r rVar = this.x;
        if (i3 == 1) {
            rVar.f203b = i2;
        } else {
            rVar.f202a = i2;
        }
        w(2, i3);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // G.InterfaceC0040p
    public final void b(View view, int i2) {
        r rVar = this.x;
        if (i2 == 1) {
            rVar.f203b = 0;
        } else {
            rVar.f202a = 0;
        }
        y(i2);
    }

    @Override // G.InterfaceC0040p
    public final void c(int i2, int i3, int[] iArr, int i4) {
        i(i2, i3, i4, iArr, null);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f8  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void computeScroll() {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.computeScroll():void");
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // G.InterfaceC0041q
    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        o(i5, i6, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || j(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        ViewParent viewParentC;
        C0039o c0039o = this.f1095y;
        if (!c0039o.d || (viewParentC = c0039o.c(0)) == null) {
            return false;
        }
        try {
            return viewParentC.onNestedFling(c0039o.f200c, f2, f3, z2);
        } catch (AbstractMethodError e2) {
            Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedFling", e2);
            return false;
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f1095y.a(f2, f3);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return i(i2, i3, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f1095y.b(i2, i3, i4, i5, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.f1077e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (getClipToPadding()) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (getClipToPadding()) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f1078f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (getClipToPadding()) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (getClipToPadding()) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // G.InterfaceC0040p
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        o(i5, i6, null);
    }

    @Override // G.InterfaceC0040p
    public final boolean f(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public final boolean g(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !n(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            t(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f1076c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            t(h(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !n(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.x;
        return rVar.f203b | rVar.f202a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f1096z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f1096z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f1096z;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i3, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f1095y.c(0) != null;
    }

    public final boolean i(int i2, int i3, int i4, int[] iArr, int[] iArr2) {
        ViewParent viewParentC;
        int i5;
        int i6;
        C0039o c0039o = this.f1095y;
        if (!c0039o.d || (viewParentC = c0039o.c(i4)) == null) {
            return false;
        }
        if (i2 == 0 && i3 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        NestedScrollView nestedScrollView = c0039o.f200c;
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            if (c0039o.f201e == null) {
                c0039o.f201e = new int[2];
            }
            iArr = c0039o.f201e;
        }
        iArr[0] = 0;
        iArr[1] = 0;
        if (viewParentC instanceof InterfaceC0040p) {
            ((InterfaceC0040p) viewParentC).c(i2, i3, iArr, i4);
        } else if (i4 == 0) {
            try {
                viewParentC.onNestedPreScroll(nestedScrollView, i2, i3, iArr);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onNestedPreScroll", e2);
            }
        }
        if (iArr2 != null) {
            nestedScrollView.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f1095y.d;
    }

    public final boolean j(KeyEvent keyEvent) {
        this.f1076c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? l(33) : g(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? l(130) : g(130);
                }
                if (keyCode == 62) {
                    r(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return l(33);
                }
                if (keyCode == 93) {
                    return l(130);
                }
                if (keyCode == 122) {
                    r(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                r(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    public final void k(int i2) {
        if (getChildCount() > 0) {
            this.d.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            w(2, 1);
            this.f1093v = getScrollY();
            postInvalidateOnAnimation();
            if (b.a()) {
                f.a(this, Math.abs(this.d.getCurrVelocity()));
            }
        }
    }

    public final boolean l(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1076c;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return s(i2, rect.top, rect.bottom);
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final boolean n(View view, int i2, int i3) {
        Rect rect = this.f1076c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i2 >= getScrollY() && rect.top - i2 <= getScrollY() + i3;
    }

    public final void o(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f1095y.b(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f1080i = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r27) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 851
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0117  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int measuredHeight;
        super.onLayout(z2, i2, i3, i4, i5);
        int i6 = 0;
        this.h = false;
        View view = this.f1081j;
        if (view != null && m(view, this)) {
            View view2 = this.f1081j;
            Rect rect = this.f1076c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f1081j = null;
        if (!this.f1080i) {
            if (this.f1094w != null) {
                scrollTo(getScrollX(), this.f1094w.f333a);
                this.f1094w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i6 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i6 != scrollY) {
                scrollTo(getScrollX(), i6);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f1080i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1084m && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        k((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        return this.f1095y.a(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        i(i2, i3, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        o(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus != null && n(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i2, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.getSuperState());
        this.f1094w = iVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        i iVar = new i(super.onSaveInstanceState());
        iVar.f333a = getScrollY();
        return iVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !n(viewFindFocus, 0, i5)) {
            return;
        }
        Rect rect = this.f1076c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f1085n) {
                v(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return f(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        if (this.f1083l == null) {
            this.f1083l = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1092u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f2 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.f1092u);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.f1078f;
            EdgeEffect edgeEffect2 = this.f1077e;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f1083l;
                velocityTracker.computeCurrentVelocity(1000, this.f1088q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f1089r);
                if (Math.abs(yVelocity) >= this.f1087p) {
                    if (P0.b.m(edgeEffect2) != 0.0f) {
                        if (u(edgeEffect2, yVelocity)) {
                            edgeEffect2.onAbsorb(yVelocity);
                        } else {
                            k(-yVelocity);
                        }
                    } else if (P0.b.m(edgeEffect) != 0.0f) {
                        int i2 = -yVelocity;
                        if (u(edgeEffect, i2)) {
                            edgeEffect.onAbsorb(i2);
                        } else {
                            k(i2);
                        }
                    } else {
                        int i3 = -yVelocity;
                        float f3 = i3;
                        if (!this.f1095y.a(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            k(i3);
                        }
                    }
                } else if (this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1089r = -1;
                this.f1082k = false;
                VelocityTracker velocityTracker2 = this.f1083l;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f1083l = null;
                }
                y(0);
                this.f1077e.onRelease();
                this.f1078f.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f1089r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f1089r + " in onTouchEvent");
                } else {
                    int y2 = (int) motionEvent.getY(iFindPointerIndex);
                    int i4 = this.f1079g - y2;
                    float x = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i4 / getHeight();
                    if (P0.b.m(edgeEffect2) != 0.0f) {
                        float f4 = -P0.b.u(edgeEffect2, -height, x);
                        if (P0.b.m(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                        f2 = f4;
                    } else if (P0.b.m(edgeEffect) != 0.0f) {
                        float fU = P0.b.u(edgeEffect, height, 1.0f - x);
                        if (P0.b.m(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                        f2 = fU;
                    }
                    int iRound = Math.round(f2 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    int i5 = i4 - iRound;
                    if (!this.f1082k && Math.abs(i5) > this.f1086o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f1082k = true;
                        i5 = i5 > 0 ? i5 - this.f1086o : i5 + this.f1086o;
                    }
                    if (this.f1082k) {
                        int iT = t(i5, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f1079g = y2 - iT;
                        this.f1092u += iT;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f1082k && getChildCount() > 0 && this.d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                this.f1089r = -1;
                this.f1082k = false;
                VelocityTracker velocityTracker3 = this.f1083l;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f1083l = null;
                }
                y(0);
                this.f1077e.onRelease();
                this.f1078f.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f1079g = (int) motionEvent.getY(actionIndex);
                this.f1089r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                p(motionEvent);
                this.f1079g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f1089r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f1082k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.d.isFinished()) {
                this.d.abortAnimation();
                y(1);
            }
            int y3 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f1079g = y3;
            this.f1089r = pointerId;
            w(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f1083l;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final void p(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1089r) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f1079g = (int) motionEvent.getY(i2);
            this.f1089r = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f1083l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public final boolean q(int i2, int i3, int i4, int i5) {
        boolean z2;
        boolean z3;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i6 = i4 + i2;
        if (i3 <= 0 && i3 >= 0) {
            z2 = false;
        } else {
            i3 = 0;
            z2 = true;
        }
        if (i6 > i5) {
            z3 = true;
        } else if (i6 < 0) {
            i5 = 0;
            z3 = true;
        } else {
            i5 = i6;
            z3 = false;
        }
        if (z3 && this.f1095y.c(1) == null) {
            this.d.springBack(i3, i5, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i3, i5);
        return z2 || z3;
    }

    public final void r(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f1076c;
        if (z2) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i3 = rect.top;
        int i4 = height + i3;
        rect.bottom = i4;
        s(i2, i3, i4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.h) {
            this.f1081j = view2;
        } else {
            Rect rect = this.f1076c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z3 = iH != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iH);
            } else {
                v(0, iH, false);
            }
        }
        return z3;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        VelocityTracker velocityTracker;
        if (z2 && (velocityTracker = this.f1083l) != null) {
            velocityTracker.recycle();
            this.f1083l = null;
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.h = true;
        super.requestLayout();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(int r18, int r19, int r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            int r4 = r17.getHeight()
            int r5 = r17.getScrollY()
            int r4 = r4 + r5
            r6 = 33
            if (r1 != r6) goto L17
            r6 = 1
            goto L18
        L17:
            r6 = 0
        L18:
            r9 = 2
            java.util.ArrayList r9 = r0.getFocusables(r9)
            int r10 = r9.size()
            r11 = 0
            r12 = 0
            r13 = 0
        L24:
            if (r12 >= r10) goto L6c
            java.lang.Object r14 = r9.get(r12)
            android.view.View r14 = (android.view.View) r14
            int r15 = r14.getTop()
            int r7 = r14.getBottom()
            if (r2 >= r7) goto L69
            if (r15 >= r3) goto L69
            if (r2 >= r15) goto L3f
            if (r7 >= r3) goto L3f
            r16 = 1
            goto L41
        L3f:
            r16 = 0
        L41:
            if (r11 != 0) goto L47
            r11 = r14
            r13 = r16
            goto L69
        L47:
            if (r6 == 0) goto L4f
            int r8 = r11.getTop()
            if (r15 < r8) goto L57
        L4f:
            if (r6 != 0) goto L59
            int r8 = r11.getBottom()
            if (r7 <= r8) goto L59
        L57:
            r7 = 1
            goto L5a
        L59:
            r7 = 0
        L5a:
            if (r13 == 0) goto L61
            if (r16 == 0) goto L69
            if (r7 == 0) goto L69
            goto L68
        L61:
            if (r16 == 0) goto L66
            r11 = r14
            r13 = 1
            goto L69
        L66:
            if (r7 == 0) goto L69
        L68:
            r11 = r14
        L69:
            int r12 = r12 + 1
            goto L24
        L6c:
            if (r11 != 0) goto L6f
            r11 = r0
        L6f:
            if (r2 < r5) goto L75
            if (r3 > r4) goto L75
            r7 = 0
            goto L82
        L75:
            if (r6 == 0) goto L7b
            int r2 = r2 - r5
        L78:
            r3 = 0
            r4 = 1
            goto L7e
        L7b:
            int r2 = r3 - r4
            goto L78
        L7e:
            r0.t(r2, r3, r4, r4)
            r7 = r4
        L82:
            android.view.View r2 = r17.findFocus()
            if (r11 == r2) goto L8b
            r11.requestFocus(r1)
        L8b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.s(int, int, int):boolean");
    }

    @Override // android.view.View
    public final void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i2 < 0) {
                i2 = 0;
            } else if (width + i2 > width2) {
                i2 = width2 - width;
            }
            if (height >= height2 || i3 < 0) {
                i3 = 0;
            } else if (height + i3 > height2) {
                i3 = height2 - height;
            }
            if (i2 == getScrollX() && i3 == getScrollY()) {
                return;
            }
            super.scrollTo(i2, i3);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f1084m) {
            this.f1084m = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        C0039o c0039o = this.f1095y;
        if (c0039o.d) {
            WeakHashMap weakHashMap = K.f146a;
            D.j(c0039o.f200c);
        }
        c0039o.d = z2;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f1085n = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i2) {
        return w(i2, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        y(0);
    }

    public final int t(int i2, int i3, int i4, boolean z2) {
        int i5;
        int i6;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            w(2, i4);
        }
        boolean zI = i(0, i2, i4, this.f1091t, this.f1090s);
        int[] iArr = this.f1091t;
        int[] iArr2 = this.f1090s;
        if (zI) {
            i5 = i2 - iArr[1];
            i6 = iArr2[1];
        } else {
            i5 = i2;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z3 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z2;
        boolean z4 = q(i5, 0, scrollY, scrollRange) && this.f1095y.c(i4) == null;
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        this.f1095y.b(0, scrollY2, 0, i5 - scrollY2, this.f1090s, i4, iArr);
        int i7 = i6 + iArr2[1];
        int i8 = i5 - iArr[1];
        int i9 = scrollY + i8;
        EdgeEffect edgeEffect = this.f1078f;
        EdgeEffect edgeEffect2 = this.f1077e;
        if (i9 < 0) {
            if (z3) {
                P0.b.u(edgeEffect2, (-i8) / getHeight(), i3 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i9 > scrollRange && z3) {
            P0.b.u(edgeEffect, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (!edgeEffect2.isFinished() || !edgeEffect.isFinished()) {
            postInvalidateOnAnimation();
            z4 = false;
        }
        if (z4 && i4 == 0 && (velocityTracker = this.f1083l) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            y(i4);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i7;
    }

    public final boolean u(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        float fM = P0.b.m(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i2) * 0.35f;
        float f2 = this.f1074a * 0.015f;
        double dLog = Math.log(fAbs / f2);
        double d = f1070B;
        return ((float) (Math.exp((d / (d - 1.0d)) * dLog) * ((double) f2))) < fM;
    }

    public final void v(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f1075b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, 250);
            if (z2) {
                w(2, 1);
            } else {
                y(1);
            }
            this.f1093v = getScrollY();
            postInvalidateOnAnimation();
        } else {
            if (!this.d.isFinished()) {
                this.d.abortAnimation();
                y(1);
            }
            scrollBy(i2, i3);
        }
        this.f1075b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final boolean w(int i2, int i3) {
        boolean zOnStartNestedScroll;
        C0039o c0039o = this.f1095y;
        if (!(c0039o.c(i3) != null)) {
            if (!c0039o.d) {
                return false;
            }
            View view = c0039o.f200c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z2 = parent instanceof InterfaceC0040p;
                if (z2) {
                    zOnStartNestedScroll = ((InterfaceC0040p) parent).f(view2, view, i2, i3);
                } else if (i3 == 0) {
                    try {
                        zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i2);
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                    }
                } else {
                    zOnStartNestedScroll = false;
                }
                if (zOnStartNestedScroll) {
                    if (i3 == 0) {
                        c0039o.f198a = parent;
                    } else if (i3 == 1) {
                        c0039o.f199b = parent;
                    }
                    if (z2) {
                        ((InterfaceC0040p) parent).a(view2, view, i2, i3);
                    } else if (i3 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i2);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                } else {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean x(MotionEvent motionEvent) {
        boolean z2;
        EdgeEffect edgeEffect = this.f1077e;
        if (P0.b.m(edgeEffect) != 0.0f) {
            P0.b.u(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.f1078f;
        if (P0.b.m(edgeEffect2) == 0.0f) {
            return z2;
        }
        P0.b.u(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void y(int i2) {
        C0039o c0039o = this.f1095y;
        ViewParent viewParentC = c0039o.c(i2);
        if (viewParentC != null) {
            boolean z2 = viewParentC instanceof InterfaceC0040p;
            NestedScrollView nestedScrollView = c0039o.f200c;
            if (z2) {
                ((InterfaceC0040p) viewParentC).b(nestedScrollView, i2);
            } else if (i2 == 0) {
                try {
                    viewParentC.onStopNestedScroll(nestedScrollView);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentC + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i2 == 0) {
                c0039o.f198a = null;
            } else {
                if (i2 != 1) {
                    return;
                }
                c0039o.f199b = null;
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(g gVar) {
    }
}
