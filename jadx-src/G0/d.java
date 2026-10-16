package G0;

import a.AbstractC0062a;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import k0.C0231d;
import x0.g;

/* loaded from: classes.dex */
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object objM;
        try {
            objM = new c(a(Looper.getMainLooper()));
        } catch (Throwable th) {
            objM = AbstractC0062a.m(th);
        }
        if (objM instanceof C0231d) {
            objM = null;
        }
    }

    public static final Handler a(Looper looper) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        g.c("null cannot be cast to non-null type android.os.Handler", objInvoke);
        return (Handler) objInvoke;
    }
}
