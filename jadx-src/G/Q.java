package G;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class Q extends V {

    /* renamed from: c, reason: collision with root package name */
    public static Field f155c = null;
    public static boolean d = false;

    /* renamed from: e, reason: collision with root package name */
    public static Constructor f156e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f157f = false;

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f158a;

    /* renamed from: b, reason: collision with root package name */
    public z.c f159b;

    public Q() {
        this.f158a = e();
    }

    private static WindowInsets e() {
        if (!d) {
            try {
                f155c = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            d = true;
        }
        Field field = f155c;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f157f) {
            try {
                f156e = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f157f = true;
        }
        Constructor constructor = f156e;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // G.V
    public e0 b() {
        a();
        e0 e0VarG = e0.g(this.f158a, null);
        c0 c0Var = e0VarG.f186a;
        c0Var.o(null);
        c0Var.q(this.f159b);
        return e0VarG;
    }

    @Override // G.V
    public void c(z.c cVar) {
        this.f159b = cVar;
    }

    @Override // G.V
    public void d(z.c cVar) {
        WindowInsets windowInsets = this.f158a;
        if (windowInsets != null) {
            this.f158a = windowInsets.replaceSystemWindowInsets(cVar.f2749a, cVar.f2750b, cVar.f2751c, cVar.d);
        }
    }

    public Q(e0 e0Var) {
        super(e0Var);
        this.f158a = e0Var.f();
    }
}
