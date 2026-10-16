package androidx.fragment.app;

import F0.C0011l;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final p.k f1199b = new p.k(0);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1200a;

    public l(q qVar) {
        this.f1200a = qVar;
    }

    public static Class b(ClassLoader classLoader, String str) throws ClassNotFoundException {
        p.k kVar = f1199b;
        p.k kVar2 = (p.k) kVar.get(classLoader);
        if (kVar2 == null) {
            kVar2 = new p.k(0);
            kVar.put(classLoader, kVar2);
        }
        Class cls = (Class) kVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        kVar2.put(str, cls2);
        return cls2;
    }

    public static Class c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public final void a(String str) {
        try {
            if (c(this.f1200a.f1232u.f1187a.getClassLoader(), str).getConstructor(null).newInstance(null) == null) {
            } else {
                throw new ClassCastException();
            }
        } catch (IllegalAccessException e2) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new C0011l(Q.d.a("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
