package t;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import s.AbstractC0335a;

/* loaded from: classes.dex */
public final class c extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2633a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2635c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2636e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2637f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2638g;
    public int h;

    /* renamed from: i, reason: collision with root package name */
    public int f2639i;

    /* renamed from: j, reason: collision with root package name */
    public View f2640j;

    /* renamed from: k, reason: collision with root package name */
    public View f2641k;

    /* renamed from: l, reason: collision with root package name */
    public final Rect f2642l;

    public c() {
        super(-2, -2);
        this.f2633a = false;
        this.f2634b = 0;
        this.f2635c = 0;
        this.d = -1;
        this.f2636e = -1;
        this.f2637f = 0;
        this.f2638g = 0;
        this.f2642l = new Rect();
    }

    public c(Context context, AttributeSet attributeSet) throws NoSuchMethodException, SecurityException {
        super(context, attributeSet);
        this.f2633a = false;
        this.f2634b = 0;
        this.f2635c = 0;
        this.d = -1;
        this.f2636e = -1;
        this.f2637f = 0;
        this.f2638g = 0;
        this.f2642l = new Rect();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0335a.f2630b);
        this.f2634b = typedArrayObtainStyledAttributes.getInteger(0, 0);
        this.f2636e = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        this.f2635c = typedArrayObtainStyledAttributes.getInteger(2, 0);
        this.d = typedArrayObtainStyledAttributes.getInteger(6, -1);
        this.f2637f = typedArrayObtainStyledAttributes.getInt(5, 0);
        this.f2638g = typedArrayObtainStyledAttributes.getInt(4, 0);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(3);
        this.f2633a = zHasValue;
        if (zHasValue) {
            String string = typedArrayObtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1032q;
            if (!TextUtils.isEmpty(string)) {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1032q;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1034s;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1033r);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    if (constructor.newInstance(context, attributeSet) != null) {
                        throw new ClassCastException();
                    }
                } catch (Exception e2) {
                    throw new RuntimeException("Could not inflate Behavior subclass " + string, e2);
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public c(c cVar) {
        super((ViewGroup.MarginLayoutParams) cVar);
        this.f2633a = false;
        this.f2634b = 0;
        this.f2635c = 0;
        this.d = -1;
        this.f2636e = -1;
        this.f2637f = 0;
        this.f2638g = 0;
        this.f2642l = new Rect();
    }

    public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f2633a = false;
        this.f2634b = 0;
        this.f2635c = 0;
        this.d = -1;
        this.f2636e = -1;
        this.f2637f = 0;
        this.f2638g = 0;
        this.f2642l = new Rect();
    }

    public c(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2633a = false;
        this.f2634b = 0;
        this.f2635c = 0;
        this.d = -1;
        this.f2636e = -1;
        this.f2637f = 0;
        this.f2638g = 0;
        this.f2642l = new Rect();
    }
}
