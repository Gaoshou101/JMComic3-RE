package G;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class W extends c0 {
    public static boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public static Method f161i;

    /* renamed from: j, reason: collision with root package name */
    public static Class f162j;

    /* renamed from: k, reason: collision with root package name */
    public static Field f163k;

    /* renamed from: l, reason: collision with root package name */
    public static Field f164l;

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets f165c;
    public z.c[] d;

    /* renamed from: e, reason: collision with root package name */
    public z.c f166e;

    /* renamed from: f, reason: collision with root package name */
    public e0 f167f;

    /* renamed from: g, reason: collision with root package name */
    public z.c f168g;

    public W(e0 e0Var, WindowInsets windowInsets) {
        super(e0Var);
        this.f166e = null;
        this.f165c = windowInsets;
    }

    private z.c r(int i2, boolean z2) {
        z.c cVarA = z.c.f2748e;
        for (int i3 = 1; i3 <= 256; i3 <<= 1) {
            if ((i2 & i3) != 0) {
                z.c cVarS = s(i3, z2);
                cVarA = z.c.a(Math.max(cVarA.f2749a, cVarS.f2749a), Math.max(cVarA.f2750b, cVarS.f2750b), Math.max(cVarA.f2751c, cVarS.f2751c), Math.max(cVarA.d, cVarS.d));
            }
        }
        return cVarA;
    }

    private z.c t() {
        e0 e0Var = this.f167f;
        return e0Var != null ? e0Var.f186a.h() : z.c.f2748e;
    }

    private z.c u(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!h) {
            v();
        }
        Method method = f161i;
        if (method != null && f162j != null && f163k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f163k.get(f164l.get(objInvoke));
                if (rect != null) {
                    return z.c.a(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e2) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
            }
        }
        return null;
    }

    private static void v() throws ClassNotFoundException, SecurityException {
        try {
            f161i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f162j = cls;
            f163k = cls.getDeclaredField("mVisibleInsets");
            f164l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f163k.setAccessible(true);
            f164l.setAccessible(true);
        } catch (ReflectiveOperationException e2) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e2.getMessage(), e2);
        }
        h = true;
    }

    @Override // G.c0
    public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
        z.c cVarU = u(view);
        if (cVarU == null) {
            cVarU = z.c.f2748e;
        }
        w(cVarU);
    }

    @Override // G.c0
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f168g, ((W) obj).f168g);
        }
        return false;
    }

    @Override // G.c0
    public z.c f(int i2) {
        return r(i2, false);
    }

    @Override // G.c0
    public final z.c j() {
        if (this.f166e == null) {
            WindowInsets windowInsets = this.f165c;
            this.f166e = z.c.a(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f166e;
    }

    @Override // G.c0
    public e0 l(int i2, int i3, int i4, int i5) {
        e0 e0VarG = e0.g(this.f165c, null);
        int i6 = Build.VERSION.SDK_INT;
        V u2 = i6 >= 30 ? new U(e0VarG) : i6 >= 29 ? new T(e0VarG) : new Q(e0VarG);
        u2.d(e0.e(j(), i2, i3, i4, i5));
        u2.c(e0.e(h(), i2, i3, i4, i5));
        return u2.b();
    }

    @Override // G.c0
    public boolean n() {
        return this.f165c.isRound();
    }

    @Override // G.c0
    public void o(z.c[] cVarArr) {
        this.d = cVarArr;
    }

    @Override // G.c0
    public void p(e0 e0Var) {
        this.f167f = e0Var;
    }

    public z.c s(int i2, boolean z2) {
        z.c cVarH;
        int i3;
        if (i2 == 1) {
            return z2 ? z.c.a(0, Math.max(t().f2750b, j().f2750b), 0, 0) : z.c.a(0, j().f2750b, 0, 0);
        }
        if (i2 == 2) {
            if (z2) {
                z.c cVarT = t();
                z.c cVarH2 = h();
                return z.c.a(Math.max(cVarT.f2749a, cVarH2.f2749a), 0, Math.max(cVarT.f2751c, cVarH2.f2751c), Math.max(cVarT.d, cVarH2.d));
            }
            z.c cVarJ = j();
            e0 e0Var = this.f167f;
            cVarH = e0Var != null ? e0Var.f186a.h() : null;
            int iMin = cVarJ.d;
            if (cVarH != null) {
                iMin = Math.min(iMin, cVarH.d);
            }
            return z.c.a(cVarJ.f2749a, 0, cVarJ.f2751c, iMin);
        }
        z.c cVar = z.c.f2748e;
        if (i2 == 8) {
            z.c[] cVarArr = this.d;
            cVarH = cVarArr != null ? cVarArr[3] : null;
            if (cVarH != null) {
                return cVarH;
            }
            z.c cVarJ2 = j();
            z.c cVarT2 = t();
            int i4 = cVarJ2.d;
            if (i4 > cVarT2.d) {
                return z.c.a(0, 0, 0, i4);
            }
            z.c cVar2 = this.f168g;
            return (cVar2 == null || cVar2.equals(cVar) || (i3 = this.f168g.d) <= cVarT2.d) ? cVar : z.c.a(0, 0, 0, i3);
        }
        if (i2 == 16) {
            return i();
        }
        if (i2 == 32) {
            return g();
        }
        if (i2 == 64) {
            return k();
        }
        if (i2 != 128) {
            return cVar;
        }
        e0 e0Var2 = this.f167f;
        C0034j c0034jE = e0Var2 != null ? e0Var2.f186a.e() : e();
        if (c0034jE == null) {
            return cVar;
        }
        int i5 = Build.VERSION.SDK_INT;
        return z.c.a(i5 >= 28 ? A.a.e(c0034jE.f194a) : 0, i5 >= 28 ? A.a.g(c0034jE.f194a) : 0, i5 >= 28 ? A.a.f(c0034jE.f194a) : 0, i5 >= 28 ? A.a.d(c0034jE.f194a) : 0);
    }

    public void w(z.c cVar) {
        this.f168g = cVar;
    }
}
