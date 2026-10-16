package G;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class E {
    public static e0 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        e0 e0VarG = e0.g(rootWindowInsets, null);
        c0 c0Var = e0VarG.f186a;
        c0Var.p(e0VarG);
        c0Var.d(view.getRootView());
        return e0VarG;
    }

    public static void b(View view, int i2, int i3) {
        view.setScrollIndicators(i2, i3);
    }
}
