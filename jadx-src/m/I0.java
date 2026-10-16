package m;

import a.AbstractC0062a;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import f.AbstractC0113a;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class I0 implements l.D {

    /* renamed from: A, reason: collision with root package name */
    public static final Method f2232A;

    /* renamed from: B, reason: collision with root package name */
    public static final Method f2233B;

    /* renamed from: z, reason: collision with root package name */
    public static final Method f2234z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f2235a;

    /* renamed from: b, reason: collision with root package name */
    public ListAdapter f2236b;

    /* renamed from: c, reason: collision with root package name */
    public C0297v0 f2237c;

    /* renamed from: f, reason: collision with root package name */
    public int f2239f;

    /* renamed from: g, reason: collision with root package name */
    public int f2240g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2241i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2242j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2243k;

    /* renamed from: n, reason: collision with root package name */
    public F0 f2246n;

    /* renamed from: o, reason: collision with root package name */
    public View f2247o;

    /* renamed from: p, reason: collision with root package name */
    public AdapterView.OnItemClickListener f2248p;

    /* renamed from: u, reason: collision with root package name */
    public final Handler f2253u;

    /* renamed from: w, reason: collision with root package name */
    public Rect f2255w;
    public boolean x;

    /* renamed from: y, reason: collision with root package name */
    public final C0247C f2256y;
    public final int d = -2;

    /* renamed from: e, reason: collision with root package name */
    public int f2238e = -2;
    public final int h = 1002;

    /* renamed from: l, reason: collision with root package name */
    public int f2244l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final int f2245m = Integer.MAX_VALUE;

    /* renamed from: q, reason: collision with root package name */
    public final E0 f2249q = new E0(this, 1);

    /* renamed from: r, reason: collision with root package name */
    public final H0 f2250r = new H0(this);

    /* renamed from: s, reason: collision with root package name */
    public final G0 f2251s = new G0(this);

    /* renamed from: t, reason: collision with root package name */
    public final E0 f2252t = new E0(this, 0);

    /* renamed from: v, reason: collision with root package name */
    public final Rect f2254v = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f2234z = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f2233B = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f2232A = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public I0(Context context, AttributeSet attributeSet, int i2) {
        int resourceId;
        this.f2235a = context;
        this.f2253u = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1509o, i2, 0);
        this.f2239f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f2240g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f2241i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0247C c0247c = new C0247C(context, attributeSet, i2, 0);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0113a.f1513s, i2, 0);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c0247c.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c0247c.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0062a.v(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f2256y = c0247c;
        c0247c.setInputMethodMode(1);
    }

    @Override // l.D
    public final boolean a() {
        return this.f2256y.isShowing();
    }

    public final void b(int i2) {
        this.f2239f = i2;
    }

    public final int c() {
        return this.f2239f;
    }

    @Override // l.D
    public final void dismiss() {
        C0247C c0247c = this.f2256y;
        c0247c.dismiss();
        c0247c.setContentView(null);
        this.f2237c = null;
        this.f2253u.removeCallbacks(this.f2249q);
    }

    @Override // l.D
    public final void f() {
        int i2;
        int iA;
        int paddingBottom;
        C0297v0 c0297v0;
        C0297v0 c0297v02 = this.f2237c;
        C0247C c0247c = this.f2256y;
        Context context = this.f2235a;
        if (c0297v02 == null) {
            C0297v0 c0297v0P = p(context, !this.x);
            this.f2237c = c0297v0P;
            c0297v0P.setAdapter(this.f2236b);
            this.f2237c.setOnItemClickListener(this.f2248p);
            this.f2237c.setFocusable(true);
            this.f2237c.setFocusableInTouchMode(true);
            this.f2237c.setOnItemSelectedListener(new B0(this));
            this.f2237c.setOnScrollListener(this.f2251s);
            c0247c.setContentView(this.f2237c);
        }
        Drawable background = c0247c.getBackground();
        Rect rect = this.f2254v;
        if (background != null) {
            background.getPadding(rect);
            int i3 = rect.top;
            i2 = rect.bottom + i3;
            if (!this.f2241i) {
                this.f2240g = -i3;
            }
        } else {
            rect.setEmpty();
            i2 = 0;
        }
        boolean z2 = c0247c.getInputMethodMode() == 2;
        View view = this.f2247o;
        int i4 = this.f2240g;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f2232A;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(c0247c, view, Integer.valueOf(i4), Boolean.valueOf(z2))).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            } else {
                iA = c0247c.getMaxAvailableHeight(view, i4);
            }
        } else {
            iA = C0.a(c0247c, view, i4, z2);
        }
        int i5 = this.d;
        if (i5 == -1) {
            paddingBottom = iA + i2;
        } else {
            int i6 = this.f2238e;
            int iA2 = this.f2237c.a(i6 != -2 ? i6 != -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), iA);
            paddingBottom = iA2 + (iA2 > 0 ? this.f2237c.getPaddingBottom() + this.f2237c.getPaddingTop() + i2 : 0);
        }
        boolean z3 = this.f2256y.getInputMethodMode() == 2;
        c0247c.setWindowLayoutType(this.h);
        if (c0247c.isShowing()) {
            if (this.f2247o.isAttachedToWindow()) {
                int width = this.f2238e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f2247o.getWidth();
                }
                if (i5 == -1) {
                    i5 = z3 ? paddingBottom : -1;
                    if (z3) {
                        c0247c.setWidth(this.f2238e == -1 ? -1 : 0);
                        c0247c.setHeight(0);
                    } else {
                        c0247c.setWidth(this.f2238e == -1 ? -1 : 0);
                        c0247c.setHeight(-1);
                    }
                } else if (i5 == -2) {
                    i5 = paddingBottom;
                }
                c0247c.setOutsideTouchable(true);
                c0247c.update(this.f2247o, this.f2239f, this.f2240g, width < 0 ? -1 : width, i5 < 0 ? -1 : i5);
                return;
            }
            return;
        }
        int width2 = this.f2238e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f2247o.getWidth();
        }
        if (i5 == -1) {
            i5 = -1;
        } else if (i5 == -2) {
            i5 = paddingBottom;
        }
        c0247c.setWidth(width2);
        c0247c.setHeight(i5);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f2234z;
            if (method2 != null) {
                try {
                    method2.invoke(c0247c, Boolean.TRUE);
                } catch (Exception unused2) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            D0.b(c0247c, true);
        }
        c0247c.setOutsideTouchable(true);
        c0247c.setTouchInterceptor(this.f2250r);
        if (this.f2243k) {
            c0247c.setOverlapAnchor(this.f2242j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f2233B;
            if (method3 != null) {
                try {
                    method3.invoke(c0247c, this.f2255w);
                } catch (Exception e2) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            D0.a(c0247c, this.f2255w);
        }
        c0247c.showAsDropDown(this.f2247o, this.f2239f, this.f2240g, this.f2244l);
        this.f2237c.setSelection(-1);
        if ((!this.x || this.f2237c.isInTouchMode()) && (c0297v0 = this.f2237c) != null) {
            c0297v0.setListSelectionHidden(true);
            c0297v0.requestLayout();
        }
        if (this.x) {
            return;
        }
        this.f2253u.post(this.f2252t);
    }

    public final int g() {
        if (this.f2241i) {
            return this.f2240g;
        }
        return 0;
    }

    public final Drawable h() {
        return this.f2256y.getBackground();
    }

    @Override // l.D
    public final C0297v0 j() {
        return this.f2237c;
    }

    public final void l(Drawable drawable) {
        this.f2256y.setBackgroundDrawable(drawable);
    }

    public final void m(int i2) {
        this.f2240g = i2;
        this.f2241i = true;
    }

    public void n(ListAdapter listAdapter) {
        F0 f02 = this.f2246n;
        if (f02 == null) {
            this.f2246n = new F0(this);
        } else {
            ListAdapter listAdapter2 = this.f2236b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(f02);
            }
        }
        this.f2236b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f2246n);
        }
        C0297v0 c0297v0 = this.f2237c;
        if (c0297v0 != null) {
            c0297v0.setAdapter(this.f2236b);
        }
    }

    public C0297v0 p(Context context, boolean z2) {
        return new C0297v0(context, z2);
    }

    public final void q(int i2) {
        Drawable background = this.f2256y.getBackground();
        if (background == null) {
            this.f2238e = i2;
            return;
        }
        Rect rect = this.f2254v;
        background.getPadding(rect);
        this.f2238e = rect.left + rect.right + i2;
    }
}
