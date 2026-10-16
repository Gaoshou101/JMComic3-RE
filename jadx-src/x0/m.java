package x0;

import k0.InterfaceC0228a;
import w0.p;
import w0.q;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(int i2, Object obj) {
        if (obj != null) {
            if (obj instanceof InterfaceC0228a) {
                if ((obj instanceof e ? ((e) obj).b() : obj instanceof w0.a ? 0 : obj instanceof w0.l ? 1 : obj instanceof p ? 2 : obj instanceof q ? 3 : -1) == i2) {
                    return;
                }
            }
            b("kotlin.jvm.functions.Function" + i2, obj);
            throw null;
        }
    }

    public static void b(String str, Object obj) {
        ClassCastException classCastException = new ClassCastException((obj == null ? "null" : obj.getClass().getName()) + " cannot be cast to " + str);
        g.f(classCastException, m.class.getName());
        throw classCastException;
    }
}
