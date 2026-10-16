package v;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0340c {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f2680a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f2681b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f2682c;
    public static final Method d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f2683e;

    /* renamed from: f, reason: collision with root package name */
    public static final Method f2684f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f2685g = new Handler(Looper.getMainLooper());

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f2680a = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f2681b = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f2682c = declaredField2;
        Class cls2 = f2680a;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
            }
        }
        d = declaredMethod;
        Class cls3 = f2680a;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
            }
        }
        f2683e = declaredMethod2;
        Class cls4 = f2680a;
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 == 26 || i2 == 27) && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f2684f = method;
    }
}
