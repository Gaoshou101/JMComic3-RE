package G;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class A {

    /* renamed from: a, reason: collision with root package name */
    public int f137a;

    /* renamed from: b, reason: collision with root package name */
    public int f138b;

    /* renamed from: c, reason: collision with root package name */
    public int f139c;
    public Object d;

    public A() {
        if (L.c.f412b == null) {
            L.c.f412b = new L.c(0);
        }
    }

    public int a(int i2) {
        if (i2 < this.f139c) {
            return ((ByteBuffer) this.d).getShort(this.f138b + i2);
        }
        return 0;
    }

    public abstract Object b(View view);

    public abstract void c(View view, Object obj);

    public void d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f138b) {
            c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f138b) {
            tag = b(view);
        } else {
            tag = view.getTag(this.f137a);
            if (!((Class) this.d).isInstance(tag)) {
                tag = null;
            }
        }
        if (e(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = K.c(view);
            C0026b c0026b = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof C0025a ? ((C0025a) accessibilityDelegateC).f173a : new C0026b(accessibilityDelegateC);
            if (c0026b == null) {
                c0026b = new C0026b();
            }
            K.h(view, c0026b);
            view.setTag(this.f137a, obj);
            K.e(view, this.f139c);
        }
    }

    public abstract boolean e(Object obj, Object obj2);
}
