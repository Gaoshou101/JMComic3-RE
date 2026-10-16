package G;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f185b;

    /* renamed from: a, reason: collision with root package name */
    public final c0 f186a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f185b = b0.f177q;
        } else {
            f185b = c0.f178b;
        }
    }

    public e0(WindowInsets windowInsets) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            this.f186a = new b0(this, windowInsets);
            return;
        }
        if (i2 >= 29) {
            this.f186a = new Z(this, windowInsets);
        } else if (i2 >= 28) {
            this.f186a = new Y(this, windowInsets);
        } else {
            this.f186a = new X(this, windowInsets);
        }
    }

    public static z.c e(z.c cVar, int i2, int i3, int i4, int i5) {
        int iMax = Math.max(0, cVar.f2749a - i2);
        int iMax2 = Math.max(0, cVar.f2750b - i3);
        int iMax3 = Math.max(0, cVar.f2751c - i4);
        int iMax4 = Math.max(0, cVar.d - i5);
        return (iMax == i2 && iMax2 == i3 && iMax3 == i4 && iMax4 == i5) ? cVar : z.c.a(iMax, iMax2, iMax3, iMax4);
    }

    public static e0 g(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        e0 e0Var = new e0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = K.f146a;
            e0 e0VarA = E.a(view);
            c0 c0Var = e0Var.f186a;
            c0Var.p(e0VarA);
            c0Var.d(view.getRootView());
        }
        return e0Var;
    }

    public final int a() {
        return this.f186a.j().d;
    }

    public final int b() {
        return this.f186a.j().f2749a;
    }

    public final int c() {
        return this.f186a.j().f2751c;
    }

    public final int d() {
        return this.f186a.j().f2750b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        return Objects.equals(this.f186a, ((e0) obj).f186a);
    }

    public final WindowInsets f() {
        c0 c0Var = this.f186a;
        if (c0Var instanceof W) {
            return ((W) c0Var).f165c;
        }
        return null;
    }

    public final int hashCode() {
        c0 c0Var = this.f186a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public e0() {
        this.f186a = new c0(this);
    }
}
