package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1315a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1316b = new HashMap();

    public static void a(Constructor constructor, q qVar) {
        try {
            x0.g.d("{\n            constructo…tance(`object`)\n        }", constructor.newInstance(qVar));
            throw new ClassCastException();
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static final String b(String str) {
        StringBuilder sb = new StringBuilder();
        int iM = E0.l.M(str, ".", 0, false);
        if (iM >= 0) {
            int length = str.length();
            if (length < 0) {
                throw new OutOfMemoryError();
            }
            StringBuilder sb2 = new StringBuilder(length);
            int i2 = 0;
            do {
                sb2.append((CharSequence) str, i2, iM);
                sb2.append("_");
                i2 = iM + 1;
                if (iM >= str.length()) {
                    break;
                }
                iM = E0.l.M(str, ".", i2, false);
            } while (iM > 0);
            sb2.append((CharSequence) str, i2, str.length());
            str = sb2.toString();
            x0.g.d("toString(...)", str);
        }
        sb.append(str);
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x013d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int c(java.lang.Class r13) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.u.c(java.lang.Class):int");
    }
}
