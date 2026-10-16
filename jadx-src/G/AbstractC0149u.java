package g;

import android.app.Activity;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: g.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0149u {
    public static OnBackInvokedDispatcher a(Activity activity) {
        return activity.getOnBackInvokedDispatcher();
    }

    public static OnBackInvokedCallback b(Object obj, LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A) {
        Objects.requireNonNull(layoutInflaterFactory2C0118A);
        androidx.activity.w wVar = new androidx.activity.w(1, layoutInflaterFactory2C0118A);
        H.c.g(obj).registerOnBackInvokedCallback(1000000, wVar);
        return wVar;
    }

    public static void c(Object obj, Object obj2) {
        H.c.g(obj).unregisterOnBackInvokedCallback(H.c.d(obj2));
    }
}
