package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: m.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0294u {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f2460b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static C0294u f2461c;

    /* renamed from: a, reason: collision with root package name */
    public Q0 f2462a;

    public static synchronized C0294u a() {
        try {
            if (f2461c == null) {
                c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f2461c;
    }

    public static synchronized void c() {
        if (f2461c == null) {
            C0294u c0294u = new C0294u();
            f2461c = c0294u;
            c0294u.f2462a = Q0.d();
            f2461c.f2462a.m(new C0292t());
        }
    }

    public static void d(Drawable drawable, X0 x02, int[] iArr) {
        PorterDuff.Mode mode = Q0.h;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = x02.d;
        if (z2 || x02.f2315c) {
            PorterDuffColorFilter porterDuffColorFilterH = null;
            ColorStateList colorStateList = z2 ? x02.f2313a : null;
            PorterDuff.Mode mode2 = x02.f2315c ? x02.f2314b : Q0.h;
            if (colorStateList != null && mode2 != null) {
                porterDuffColorFilterH = Q0.h(colorStateList.getColorForState(iArr, 0), mode2);
            }
            drawable.setColorFilter(porterDuffColorFilterH);
        } else {
            drawable.clearColorFilter();
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i2) {
        return this.f2462a.f(context, i2);
    }
}
