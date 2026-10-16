package androidx.coordinatorlayout.widget;

import F.c;
import G.B;
import G.D;
import G.InterfaceC0040p;
import G.InterfaceC0041q;
import G.K;
import G.e0;
import G.r;
import X.i;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.emoji2.text.u;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import s.AbstractC0335a;
import t.InterfaceC0336a;
import t.b;
import t.d;
import t.e;
import t.f;
import t.g;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements InterfaceC0040p, InterfaceC0041q {

    /* renamed from: q, reason: collision with root package name */
    public static final String f1032q;

    /* renamed from: r, reason: collision with root package name */
    public static final Class[] f1033r;

    /* renamed from: s, reason: collision with root package name */
    public static final ThreadLocal f1034s;

    /* renamed from: t, reason: collision with root package name */
    public static final f f1035t;

    /* renamed from: u, reason: collision with root package name */
    public static final c f1036u;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1037a;

    /* renamed from: b, reason: collision with root package name */
    public final u f1038b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1039c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1040e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1041f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f1042g;
    public View h;

    /* renamed from: i, reason: collision with root package name */
    public d f1043i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1044j;

    /* renamed from: k, reason: collision with root package name */
    public e0 f1045k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f1046l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f1047m;

    /* renamed from: n, reason: collision with root package name */
    public ViewGroup.OnHierarchyChangeListener f1048n;

    /* renamed from: o, reason: collision with root package name */
    public i f1049o;

    /* renamed from: p, reason: collision with root package name */
    public final r f1050p;

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f1032q = r02 != null ? r02.getName() : null;
        f1035t = new f();
        f1033r = new Class[]{Context.class, AttributeSet.class};
        f1034s = new ThreadLocal();
        f1036u = new c();
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet, R.attr.coordinatorLayoutStyle);
        this.f1037a = new ArrayList();
        this.f1038b = new u(4);
        this.f1039c = new ArrayList();
        this.d = new int[2];
        this.f1050p = new r();
        int[] iArr = AbstractC0335a.f2629a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.coordinatorLayoutStyle, 0);
        K.g(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, R.attr.coordinatorLayoutStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            int[] intArray = resources.getIntArray(resourceId);
            this.f1042g = intArray;
            float f2 = resources.getDisplayMetrics().density;
            int length = intArray.length;
            for (int i2 = 0; i2 < length; i2++) {
                this.f1042g[i2] = (int) (r1[i2] * f2);
            }
        }
        this.f1047m = typedArrayObtainStyledAttributes.getDrawable(1);
        typedArrayObtainStyledAttributes.recycle();
        t();
        super.setOnHierarchyChangeListener(new b(this));
        WeakHashMap weakHashMap = K.f146a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static Rect g() {
        Rect rect = (Rect) f1036u.a();
        return rect == null ? new Rect() : rect;
    }

    public static void k(int i2, Rect rect, Rect rect2, t.c cVar, int i3, int i4) {
        int i5 = cVar.f2634b;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int i6 = cVar.f2635c;
        if ((i6 & 7) == 0) {
            i6 |= 8388611;
        }
        if ((i6 & 112) == 0) {
            i6 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i6, i2);
        int i7 = absoluteGravity & 7;
        int i8 = absoluteGravity & 112;
        int i9 = absoluteGravity2 & 7;
        int i10 = absoluteGravity2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i4 / 2;
        } else if (i8 != 80) {
            iHeight -= i4;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i4 + iHeight);
    }

    public static t.c m(View view) {
        t.c cVar = (t.c) view.getLayoutParams();
        if (!cVar.f2633a) {
            InterfaceC0336a interfaceC0336a = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                interfaceC0336a = (InterfaceC0336a) superclass.getAnnotation(InterfaceC0336a.class);
                if (interfaceC0336a != null) {
                    break;
                }
            }
            if (interfaceC0336a != null) {
                try {
                    if (interfaceC0336a.value().getDeclaredConstructor(null).newInstance(null) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + interfaceC0336a.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            cVar.f2633a = true;
        }
        return cVar;
    }

    public static void r(View view, int i2) {
        t.c cVar = (t.c) view.getLayoutParams();
        int i3 = cVar.h;
        if (i3 != i2) {
            WeakHashMap weakHashMap = K.f146a;
            view.offsetLeftAndRight(i2 - i3);
            cVar.h = i2;
        }
    }

    public static void s(View view, int i2) {
        t.c cVar = (t.c) view.getLayoutParams();
        int i3 = cVar.f2639i;
        if (i3 != i2) {
            WeakHashMap weakHashMap = K.f146a;
            view.offsetTopAndBottom(i2 - i3);
            cVar.f2639i = i2;
        }
    }

    @Override // G.InterfaceC0040p
    public final void a(View view, View view2, int i2, int i3) {
        r rVar = this.f1050p;
        if (i3 == 1) {
            rVar.f203b = i2;
        } else {
            rVar.f202a = i2;
        }
        this.h = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ((t.c) getChildAt(i4).getLayoutParams()).getClass();
        }
    }

    @Override // G.InterfaceC0040p
    public final void b(View view, int i2) {
        r rVar = this.f1050p;
        if (i2 == 1) {
            rVar.f203b = 0;
        } else {
            rVar.f202a = 0;
        }
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((t.c) getChildAt(i3).getLayoutParams()).getClass();
        }
        this.h = null;
    }

    @Override // G.InterfaceC0040p
    public final void c(int i2, int i3, int[] iArr, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                ((t.c) childAt.getLayoutParams()).getClass();
            }
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof t.c) && super.checkLayoutParams(layoutParams);
    }

    @Override // G.InterfaceC0041q
    public final void d(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ((t.c) childAt.getLayoutParams()).getClass();
            }
        }
        iArr[0] = iArr[0];
        iArr[1] = iArr[1];
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j2) {
        ((t.c) view.getLayoutParams()).getClass();
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1047m;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    @Override // G.InterfaceC0040p
    public final void e(View view, int i2, int i3, int i4, int i5, int i6) {
        d(view, i2, i3, i4, i5, 0, this.d);
    }

    @Override // G.InterfaceC0040p
    public final boolean f(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ((t.c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new t.c();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new t.c(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        p();
        return Collections.unmodifiableList(this.f1037a);
    }

    public final e0 getLastWindowInsets() {
        return this.f1045k;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        r rVar = this.f1050p;
        return rVar.f203b | rVar.f202a;
    }

    public Drawable getStatusBarBackground() {
        return this.f1047m;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(t.c cVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) cVar).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    public final void i(View view, Rect rect, boolean z2) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z2) {
            j(view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    public final void j(View view, Rect rect) {
        ThreadLocal threadLocal = g.f2645a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = g.f2645a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        g.a(this, view, matrix);
        ThreadLocal threadLocal3 = g.f2646b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public final int l(int i2) {
        int[] iArr = this.f1042g;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x029e A[LOOP:2: B:104:0x029a->B:106:0x029e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r26) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.n(int):void");
    }

    public final void o(MotionEvent motionEvent) {
        motionEvent.getActionMasked();
        ArrayList arrayList = this.f1039c;
        arrayList.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            arrayList.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        f fVar = f1035t;
        if (fVar != null) {
            Collections.sort(arrayList, fVar);
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((t.c) ((View) arrayList.get(i3)).getLayoutParams()).getClass();
        }
        arrayList.clear();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        q();
        if (this.f1044j) {
            if (this.f1043i == null) {
                this.f1043i = new d(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.f1043i);
        }
        if (this.f1045k == null) {
            WeakHashMap weakHashMap = K.f146a;
            if (getFitsSystemWindows()) {
                B.c(this);
            }
        }
        this.f1041f = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q();
        if (this.f1044j && this.f1043i != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f1043i);
        }
        View view = this.h;
        if (view != null) {
            b(view, 0);
        }
        this.f1041f = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f1046l || this.f1047m == null) {
            return;
        }
        e0 e0Var = this.f1045k;
        int iD = e0Var != null ? e0Var.d() : 0;
        if (iD > 0) {
            this.f1047m.setBounds(0, 0, getWidth(), iD);
            this.f1047m.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            q();
        }
        o(motionEvent);
        if (actionMasked != 1 && actionMasked != 3) {
            return false;
        }
        q();
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) throws Throwable {
        ArrayList arrayList;
        Rect rect;
        WeakHashMap weakHashMap = K.f146a;
        int layoutDirection = getLayoutDirection();
        ArrayList arrayList2 = this.f1037a;
        int size = arrayList2.size();
        int i6 = 0;
        while (i6 < size) {
            View view = (View) arrayList2.get(i6);
            if (view.getVisibility() == 8) {
                arrayList = arrayList2;
            } else {
                ((t.c) view.getLayoutParams()).getClass();
                t.c cVar = (t.c) view.getLayoutParams();
                View view2 = cVar.f2640j;
                if (view2 == null && cVar.f2636e != -1) {
                    throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
                }
                c cVar2 = f1036u;
                if (view2 != null) {
                    Rect rectG = g();
                    Rect rectG2 = g();
                    try {
                        j(view2, rectG);
                        t.c cVar3 = (t.c) view.getLayoutParams();
                        int measuredWidth = view.getMeasuredWidth();
                        int measuredHeight = view.getMeasuredHeight();
                        arrayList = arrayList2;
                        rect = rectG2;
                        try {
                            k(layoutDirection, rectG, rectG2, cVar3, measuredWidth, measuredHeight);
                            h(cVar3, rect, measuredWidth, measuredHeight);
                            view.layout(rect.left, rect.top, rect.right, rect.bottom);
                            rectG.setEmpty();
                            cVar2.d(rectG);
                            rect.setEmpty();
                            cVar2.d(rect);
                        } catch (Throwable th) {
                            th = th;
                            rectG.setEmpty();
                            cVar2.d(rectG);
                            rect.setEmpty();
                            cVar2.d(rect);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        rect = rectG2;
                    }
                } else {
                    arrayList = arrayList2;
                    int i7 = cVar.d;
                    if (i7 >= 0) {
                        t.c cVar4 = (t.c) view.getLayoutParams();
                        int i8 = cVar4.f2634b;
                        if (i8 == 0) {
                            i8 = 8388661;
                        }
                        int absoluteGravity = Gravity.getAbsoluteGravity(i8, layoutDirection);
                        int i9 = absoluteGravity & 7;
                        int i10 = absoluteGravity & 112;
                        int width = getWidth();
                        int height = getHeight();
                        int measuredWidth2 = view.getMeasuredWidth();
                        int measuredHeight2 = view.getMeasuredHeight();
                        if (layoutDirection == 1) {
                            i7 = width - i7;
                        }
                        int iL = l(i7) - measuredWidth2;
                        if (i9 == 1) {
                            iL += measuredWidth2 / 2;
                        } else if (i9 == 5) {
                            iL += measuredWidth2;
                        }
                        int i11 = i10 != 16 ? i10 != 80 ? 0 : measuredHeight2 : measuredHeight2 / 2;
                        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar4).leftMargin, Math.min(iL, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) cVar4).rightMargin));
                        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar4).topMargin, Math.min(i11, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) cVar4).bottomMargin));
                        view.layout(iMax, iMax2, measuredWidth2 + iMax, measuredHeight2 + iMax2);
                    } else {
                        t.c cVar5 = (t.c) view.getLayoutParams();
                        Rect rectG3 = g();
                        rectG3.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar5).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) cVar5).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar5).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) cVar5).bottomMargin);
                        if (this.f1045k != null) {
                            WeakHashMap weakHashMap2 = K.f146a;
                            if (getFitsSystemWindows() && !view.getFitsSystemWindows()) {
                                rectG3.left = this.f1045k.b() + rectG3.left;
                                rectG3.top = this.f1045k.d() + rectG3.top;
                                rectG3.right -= this.f1045k.c();
                                rectG3.bottom -= this.f1045k.a();
                            }
                        }
                        Rect rectG4 = g();
                        int i12 = cVar5.f2634b;
                        if ((i12 & 7) == 0) {
                            i12 |= 8388611;
                        }
                        if ((i12 & 112) == 0) {
                            i12 |= 48;
                        }
                        Gravity.apply(i12, view.getMeasuredWidth(), view.getMeasuredHeight(), rectG3, rectG4, layoutDirection);
                        view.layout(rectG4.left, rectG4.top, rectG4.right, rectG4.bottom);
                        rectG3.setEmpty();
                        cVar2.d(rectG3);
                        rectG4.setEmpty();
                        cVar2.d(rectG4);
                    }
                }
            }
            i6++;
            arrayList2 = arrayList;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0151  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ((t.c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f2, float f3) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ((t.c) childAt.getLayoutParams()).getClass();
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        c(i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        e(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        a(view, view2, i2, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        super.onRestoreInstanceState(((e) parcelable).f369a);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            childAt.getId();
            m(childAt);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            childAt.getId();
            ((t.c) childAt.getLayoutParams()).getClass();
        }
        eVar.f2644c = sparseArray;
        return eVar;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        f(view, view2, i2, 0);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        o(motionEvent);
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (actionMasked == 1 || actionMasked == 3) {
            q();
        }
        return zOnTouchEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.p():void");
    }

    public final void q() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((t.c) getChildAt(i2).getLayoutParams()).getClass();
        }
        this.f1040e = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        ((t.c) view.getLayoutParams()).getClass();
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (!z2 || this.f1040e) {
            return;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((t.c) getChildAt(i2).getLayoutParams()).getClass();
        }
        q();
        this.f1040e = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        t();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f1048n = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.f1047m;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f1047m = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f1047m.setState(getDrawableState());
                }
                Drawable drawable3 = this.f1047m;
                WeakHashMap weakHashMap = K.f146a;
                drawable3.setLayoutDirection(getLayoutDirection());
                this.f1047m.setVisible(getVisibility() == 0, false);
                this.f1047m.setCallback(this);
            }
            WeakHashMap weakHashMap2 = K.f146a;
            postInvalidateOnAnimation();
        }
    }

    public void setStatusBarBackgroundColor(int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(int i2) {
        setStatusBarBackground(i2 != 0 ? getContext().getDrawable(i2) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f1047m;
        if (drawable == null || drawable.isVisible() == z2) {
            return;
        }
        this.f1047m.setVisible(z2, false);
    }

    public final void t() {
        WeakHashMap weakHashMap = K.f146a;
        if (!getFitsSystemWindows()) {
            D.i(this, null);
            return;
        }
        if (this.f1049o == null) {
            this.f1049o = new i(28, this);
        }
        D.i(this, this.f1049o);
        setSystemUiVisibility(1280);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f1047m;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof t.c ? new t.c((t.c) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new t.c((ViewGroup.MarginLayoutParams) layoutParams) : new t.c(layoutParams);
    }
}
