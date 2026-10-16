package m;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

/* renamed from: m.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0289r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f2447a;

    /* renamed from: b, reason: collision with root package name */
    public static final Method f2448b;

    /* renamed from: c, reason: collision with root package name */
    public static final Method f2449c;
    public static final boolean d;

    static {
        try {
            Class cls = Integer.TYPE;
            Class cls2 = Float.TYPE;
            Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
            f2447a = declaredMethod;
            declaredMethod.setAccessible(true);
            Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
            f2448b = declaredMethod2;
            declaredMethod2.setAccessible(true);
            Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
            f2449c = declaredMethod3;
            declaredMethod3.setAccessible(true);
            d = true;
        } catch (NoSuchMethodException e2) {
            e2.printStackTrace();
        }
    }
}
