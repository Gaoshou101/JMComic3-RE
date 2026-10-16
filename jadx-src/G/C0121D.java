package g;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;

/* renamed from: g.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121D {

    /* renamed from: b, reason: collision with root package name */
    public static final Class[] f1578b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f1579c = {R.attr.onClick};
    public static final int[] d = {R.attr.accessibilityHeading};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f1580e = {R.attr.accessibilityPaneTitle};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f1581f = {R.attr.screenReaderFocusable};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f1582g = {"android.widget.", "android.view.", "android.webkit."};
    public static final p.k h = new p.k(0);

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f1583a = new Object[2];

    public final View a(Context context, String str, String str2) throws NoSuchMethodException, SecurityException {
        String strConcat;
        p.k kVar = h;
        Constructor constructor = (Constructor) kVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f1578b);
            kVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f1583a);
    }
}
