package g;

import G.InterfaceC0042s;
import G.Q;
import G.T;
import G.U;
import G.V;
import G.e0;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import m.InterfaceC0280m0;
import m.o1;
import m.p1;

/* renamed from: g.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0145q implements InterfaceC0042s, InterfaceC0280m0, l.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1677a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0118A f1678b;

    public /* synthetic */ C0145q(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, int i2) {
        this.f1677a = i2;
        this.f1678b = layoutInflaterFactory2C0118A;
    }

    @Override // l.y
    public void b(l.n nVar, boolean z2) {
        C0154z c0154z;
        switch (this.f1677a) {
            case 2:
                this.f1678b.q(nVar);
                break;
            default:
                l.n nVarK = nVar.k();
                int i2 = 0;
                boolean z3 = nVarK != nVar;
                if (z3) {
                    nVar = nVarK;
                }
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1678b;
                C0154z[] c0154zArr = layoutInflaterFactory2C0118A.f1537L;
                int length = c0154zArr != null ? c0154zArr.length : 0;
                while (true) {
                    if (i2 >= length) {
                        c0154z = null;
                    } else {
                        c0154z = c0154zArr[i2];
                        if (c0154z == null || c0154z.h != nVar) {
                            i2++;
                        }
                    }
                }
                if (c0154z != null) {
                    if (!z3) {
                        layoutInflaterFactory2C0118A.r(c0154z, z2);
                        break;
                    } else {
                        layoutInflaterFactory2C0118A.p(c0154z.f1689a, c0154z, nVarK);
                        layoutInflaterFactory2C0118A.r(c0154z, true);
                        break;
                    }
                }
                break;
        }
    }

    @Override // l.y
    public boolean d(l.n nVar) {
        Window.Callback callback;
        switch (this.f1677a) {
            case 2:
                Window.Callback callback2 = this.f1678b.f1560l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, nVar);
                    break;
                }
                break;
            default:
                if (nVar == nVar.k()) {
                    LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1678b;
                    if (layoutInflaterFactory2C0118A.f1531F && (callback = layoutInflaterFactory2C0118A.f1560l.getCallback()) != null && !layoutInflaterFactory2C0118A.f1542Q) {
                        callback.onMenuOpened(108, nVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // G.InterfaceC0042s
    public e0 h(View view, e0 e0Var) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        int i2;
        int i3;
        boolean z2;
        e0 e0VarB;
        boolean z3;
        boolean z4;
        int iD = e0Var.d();
        LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1678b;
        layoutInflaterFactory2C0118A.getClass();
        int iD2 = e0Var.d();
        ActionBarContextView actionBarContextView = layoutInflaterFactory2C0118A.f1570v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i2 = 0;
            i3 = 8;
            z2 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutInflaterFactory2C0118A.f1570v.getLayoutParams();
            if (layoutInflaterFactory2C0118A.f1570v.isShown()) {
                if (layoutInflaterFactory2C0118A.f1554c0 == null) {
                    layoutInflaterFactory2C0118A.f1554c0 = new Rect();
                    layoutInflaterFactory2C0118A.d0 = new Rect();
                }
                Rect rect = layoutInflaterFactory2C0118A.f1554c0;
                Rect rect2 = layoutInflaterFactory2C0118A.d0;
                rect.set(e0Var.b(), e0Var.d(), e0Var.c(), e0Var.a());
                ViewGroup viewGroup = layoutInflaterFactory2C0118A.f1526A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = p1.f2438a;
                    o1.a(viewGroup, rect, rect2);
                } else {
                    if (!p1.f2438a) {
                        p1.f2438a = true;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            p1.f2439b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                p1.f2439b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = p1.f2439b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e2) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                        }
                    }
                }
                int i4 = rect.top;
                int i5 = rect.left;
                int i6 = rect.right;
                ViewGroup viewGroup2 = layoutInflaterFactory2C0118A.f1526A;
                WeakHashMap weakHashMap = G.K.f146a;
                e0 e0VarA = G.E.a(viewGroup2);
                int iB = e0VarA == null ? 0 : e0VarA.b();
                int iC = e0VarA == null ? 0 : e0VarA.c();
                if (marginLayoutParams.topMargin == i4 && marginLayoutParams.leftMargin == i5 && marginLayoutParams.rightMargin == i6) {
                    z4 = false;
                } else {
                    marginLayoutParams.topMargin = i4;
                    marginLayoutParams.leftMargin = i5;
                    marginLayoutParams.rightMargin = i6;
                    z4 = true;
                }
                Context context = layoutInflaterFactory2C0118A.f1559k;
                if (i4 <= 0 || layoutInflaterFactory2C0118A.f1528C != null) {
                    i3 = 8;
                    View view2 = layoutInflaterFactory2C0118A.f1528C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i7 = marginLayoutParams2.height;
                        int i8 = marginLayoutParams.topMargin;
                        if (i7 != i8 || marginLayoutParams2.leftMargin != iB || marginLayoutParams2.rightMargin != iC) {
                            marginLayoutParams2.height = i8;
                            marginLayoutParams2.leftMargin = iB;
                            marginLayoutParams2.rightMargin = iC;
                            layoutInflaterFactory2C0118A.f1528C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    layoutInflaterFactory2C0118A.f1528C = view3;
                    i3 = 8;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iB;
                    layoutParams.rightMargin = iC;
                    layoutInflaterFactory2C0118A.f1526A.addView(layoutInflaterFactory2C0118A.f1528C, -1, layoutParams);
                }
                View view4 = layoutInflaterFactory2C0118A.f1528C;
                boolean z6 = view4 != null;
                if (z6 && view4.getVisibility() != 0) {
                    View view5 = layoutInflaterFactory2C0118A.f1528C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & 8192) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!layoutInflaterFactory2C0118A.f1533H && z6) {
                    iD2 = 0;
                }
                z2 = z6;
                z3 = z4;
                i2 = 0;
            } else {
                i3 = 8;
                i2 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    z2 = false;
                    z3 = true;
                } else {
                    z3 = false;
                    z2 = false;
                }
            }
            if (z3) {
                layoutInflaterFactory2C0118A.f1570v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = layoutInflaterFactory2C0118A.f1528C;
        if (view6 != null) {
            view6.setVisibility(z2 ? i2 : i3);
        }
        if (iD != iD2) {
            int iB2 = e0Var.b();
            int iC2 = e0Var.c();
            int iA = e0Var.a();
            int i9 = Build.VERSION.SDK_INT;
            V u2 = i9 >= 30 ? new U(e0Var) : i9 >= 29 ? new T(e0Var) : new Q(e0Var);
            u2.d(z.c.a(iB2, iD2, iC2, iA));
            e0VarB = u2.b();
        } else {
            e0VarB = e0Var;
        }
        WeakHashMap weakHashMap2 = G.K.f146a;
        WindowInsets windowInsetsF = e0VarB.f();
        if (windowInsetsF == null) {
            return e0VarB;
        }
        WindowInsets windowInsetsB = G.B.b(view, windowInsetsF);
        return !windowInsetsB.equals(windowInsetsF) ? e0.g(windowInsetsB, view) : e0VarB;
    }
}
