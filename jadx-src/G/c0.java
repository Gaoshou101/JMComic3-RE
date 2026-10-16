package G;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final e0 f178b;

    /* renamed from: a, reason: collision with root package name */
    public final e0 f179a;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f178b = (i2 >= 30 ? new U() : i2 >= 29 ? new T() : new Q()).b().f186a.a().f186a.b().f186a.c();
    }

    public c0(e0 e0Var) {
        this.f179a = e0Var;
    }

    public e0 a() {
        return this.f179a;
    }

    public e0 b() {
        return this.f179a;
    }

    public e0 c() {
        return this.f179a;
    }

    public C0034j e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return n() == c0Var.n() && m() == c0Var.m() && Objects.equals(j(), c0Var.j()) && Objects.equals(h(), c0Var.h()) && Objects.equals(e(), c0Var.e());
    }

    public z.c f(int i2) {
        return z.c.f2748e;
    }

    public z.c g() {
        return j();
    }

    public z.c h() {
        return z.c.f2748e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public z.c i() {
        return j();
    }

    public z.c j() {
        return z.c.f2748e;
    }

    public z.c k() {
        return j();
    }

    public e0 l(int i2, int i3, int i4, int i5) {
        return f178b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(z.c[] cVarArr) {
    }

    public void p(e0 e0Var) {
    }

    public void q(z.c cVar) {
    }
}
