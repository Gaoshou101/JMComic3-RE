package m;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.widget.TextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: k, reason: collision with root package name */
    public static k1 f2403k;

    /* renamed from: l, reason: collision with root package name */
    public static k1 f2404l;

    /* renamed from: a, reason: collision with root package name */
    public final View f2405a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2406b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2407c;
    public final j1 d;

    /* renamed from: e, reason: collision with root package name */
    public final j1 f2408e;

    /* renamed from: f, reason: collision with root package name */
    public int f2409f;

    /* renamed from: g, reason: collision with root package name */
    public int f2410g;
    public l1 h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f2411i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f2412j;

    /* JADX WARN: Type inference failed for: r0v0, types: [m.j1] */
    /* JADX WARN: Type inference failed for: r0v1, types: [m.j1] */
    public k1(View view, CharSequence charSequence) {
        final int i2 = 0;
        this.d = new Runnable(this) { // from class: m.j1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k1 f2370c;

            {
                this.f2370c = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i2) {
                    case 0:
                        this.f2370c.c(false);
                        break;
                    default:
                        this.f2370c.a();
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f2408e = new Runnable(this) { // from class: m.j1

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k1 f2370c;

            {
                this.f2370c = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Resources.NotFoundException {
                switch (i3) {
                    case 0:
                        this.f2370c.c(false);
                        break;
                    default:
                        this.f2370c.a();
                        break;
                }
            }
        };
        this.f2405a = view;
        this.f2406b = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        int i4 = G.L.f150a;
        this.f2407c = Build.VERSION.SDK_INT >= 28 ? A.a.h(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
        this.f2412j = true;
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void b(k1 k1Var) {
        k1 k1Var2 = f2403k;
        if (k1Var2 != null) {
            k1Var2.f2405a.removeCallbacks(k1Var2.d);
        }
        f2403k = k1Var;
        if (k1Var != null) {
            k1Var.f2405a.postDelayed(k1Var.d, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        k1 k1Var = f2404l;
        View view = this.f2405a;
        if (k1Var == this) {
            f2404l = null;
            l1 l1Var = this.h;
            if (l1Var != null) {
                View view2 = (View) l1Var.f2417b;
                if (view2.getParent() != null) {
                    ((WindowManager) ((Context) l1Var.f2416a).getSystemService("window")).removeView(view2);
                }
                this.h = null;
                this.f2412j = true;
                view.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f2403k == this) {
            b(null);
        }
        view.removeCallbacks(this.f2408e);
    }

    /* JADX WARN: Type inference failed for: r7v1, types: [int[], java.io.Serializable] */
    public final void c(boolean z2) throws Resources.NotFoundException {
        int height;
        int i2;
        String str;
        int i3;
        String str2;
        long longPressTimeout;
        long j2;
        long j3;
        View view = this.f2405a;
        if (view.isAttachedToWindow()) {
            b(null);
            k1 k1Var = f2404l;
            if (k1Var != null) {
                k1Var.a();
            }
            f2404l = this;
            this.f2411i = z2;
            Context context = view.getContext();
            l1 l1Var = new l1();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
            l1Var.d = layoutParams;
            l1Var.f2419e = new Rect();
            l1Var.f2420f = new int[2];
            l1Var.f2421g = new int[2];
            l1Var.f2416a = context;
            View viewInflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
            l1Var.f2417b = viewInflate;
            l1Var.f2418c = (TextView) viewInflate.findViewById(R.id.message);
            layoutParams.setTitle(l1.class.getSimpleName());
            layoutParams.packageName = context.getPackageName();
            layoutParams.type = 1002;
            layoutParams.width = -2;
            layoutParams.height = -2;
            layoutParams.format = -3;
            layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
            layoutParams.flags = 24;
            this.h = l1Var;
            int width = this.f2409f;
            int i4 = this.f2410g;
            boolean z3 = this.f2411i;
            View view2 = (View) l1Var.f2417b;
            ViewParent parent = view2.getParent();
            Context context2 = (Context) l1Var.f2416a;
            if (parent != null && view2.getParent() != null) {
                ((WindowManager) context2.getSystemService("window")).removeView(view2);
            }
            ((TextView) l1Var.f2418c).setText(this.f2406b);
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) l1Var.d;
            layoutParams2.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                width = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = context2.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i4 + dimensionPixelOffset2;
                i2 = i4 - dimensionPixelOffset2;
            } else {
                height = view.getHeight();
                i2 = 0;
            }
            layoutParams2.gravity = 49;
            int dimensionPixelOffset3 = context2.getResources().getDimensionPixelOffset(z3 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams3 = rootView.getLayoutParams();
            if (!(layoutParams3 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams3).type != 2) {
                Context context3 = view.getContext();
                while (true) {
                    if (!(context3 instanceof ContextWrapper)) {
                        break;
                    }
                    if (context3 instanceof Activity) {
                        rootView = ((Activity) context3).getWindow().getDecorView();
                        break;
                    }
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
                str2 = "window";
            } else {
                Rect rect = (Rect) l1Var.f2419e;
                rootView.getWindowVisibleDisplayFrame(rect);
                if (rect.left >= 0 || rect.top >= 0) {
                    str = "window";
                    i3 = 0;
                } else {
                    Resources resources = context2.getResources();
                    str = "window";
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    i3 = 0;
                    rect.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                int[] iArr = (int[]) l1Var.f2421g;
                rootView.getLocationOnScreen(iArr);
                int[] iArr2 = (int[]) l1Var.f2420f;
                view.getLocationOnScreen(iArr2);
                int i5 = iArr2[i3] - iArr[i3];
                iArr2[i3] = i5;
                iArr2[1] = iArr2[1] - iArr[1];
                layoutParams2.x = (i5 + width) - (rootView.getWidth() / 2);
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, i3);
                view2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredHeight = view2.getMeasuredHeight();
                int i6 = iArr2[1];
                int i7 = ((i2 + i6) - dimensionPixelOffset3) - measuredHeight;
                int i8 = i6 + height + dimensionPixelOffset3;
                if (z3) {
                    if (i7 >= 0) {
                        layoutParams2.y = i7;
                    } else {
                        layoutParams2.y = i8;
                    }
                } else if (measuredHeight + i8 <= rect.height()) {
                    layoutParams2.y = i8;
                } else {
                    layoutParams2.y = i7;
                }
                str2 = str;
            }
            ((WindowManager) context2.getSystemService(str2)).addView(view2, layoutParams2);
            view.addOnAttachStateChangeListener(this);
            if (this.f2411i) {
                j3 = 2500;
            } else {
                WeakHashMap weakHashMap = G.K.f146a;
                if ((view.getWindowSystemUiVisibility() & 1) == 1) {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 3000;
                } else {
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                    j2 = 15000;
                }
                j3 = j2 - longPressTimeout;
            }
            j1 j1Var = this.f2408e;
            view.removeCallbacks(j1Var);
            view.postDelayed(j1Var, j3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // android.view.View.OnHoverListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onHover(android.view.View r4, android.view.MotionEvent r5) {
        /*
            r3 = this;
            m.l1 r4 = r3.h
            r0 = 0
            if (r4 == 0) goto La
            boolean r4 = r3.f2411i
            if (r4 == 0) goto La
            return r0
        La:
            android.view.View r4 = r3.f2405a
            android.content.Context r1 = r4.getContext()
            java.lang.String r2 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r2)
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            boolean r2 = r1.isEnabled()
            if (r2 == 0) goto L25
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 == 0) goto L25
            return r0
        L25:
            int r1 = r5.getAction()
            r2 = 7
            if (r1 == r2) goto L38
            r4 = 10
            if (r1 == r4) goto L31
            goto L6f
        L31:
            r4 = 1
            r3.f2412j = r4
            r3.a()
            goto L6f
        L38:
            boolean r4 = r4.isEnabled()
            if (r4 == 0) goto L6f
            m.l1 r4 = r3.h
            if (r4 != 0) goto L6f
            float r4 = r5.getX()
            int r4 = (int) r4
            float r5 = r5.getY()
            int r5 = (int) r5
            boolean r1 = r3.f2412j
            if (r1 != 0) goto L66
            int r1 = r3.f2409f
            int r1 = r4 - r1
            int r1 = java.lang.Math.abs(r1)
            int r2 = r3.f2407c
            if (r1 > r2) goto L66
            int r1 = r3.f2410g
            int r1 = r5 - r1
            int r1 = java.lang.Math.abs(r1)
            if (r1 <= r2) goto L6f
        L66:
            r3.f2409f = r4
            r3.f2410g = r5
            r3.f2412j = r0
            b(r3)
        L6f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m.k1.onHover(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) throws Resources.NotFoundException {
        this.f2409f = view.getWidth() / 2;
        this.f2410g = view.getHeight() / 2;
        c(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
