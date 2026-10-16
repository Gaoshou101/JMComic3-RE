package p0;

import G.C0037m;
import a.AbstractC0062a;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import n0.InterfaceC0311d;
import o0.EnumC0322a;

/* renamed from: p0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0326a implements InterfaceC0311d, d, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC0311d f2601b;

    public AbstractC0326a(InterfaceC0311d interfaceC0311d) {
        this.f2601b = interfaceC0311d;
    }

    public d d() {
        InterfaceC0311d interfaceC0311d = this.f2601b;
        if (interfaceC0311d instanceof d) {
            return (d) interfaceC0311d;
        }
        return null;
    }

    @Override // n0.InterfaceC0311d
    public final void h(Object obj) {
        InterfaceC0311d interfaceC0311d = this;
        while (true) {
            AbstractC0326a abstractC0326a = (AbstractC0326a) interfaceC0311d;
            InterfaceC0311d interfaceC0311d2 = abstractC0326a.f2601b;
            x0.g.b(interfaceC0311d2);
            try {
                obj = abstractC0326a.k(obj);
                if (obj == EnumC0322a.f2519b) {
                    return;
                }
            } catch (Throwable th) {
                obj = AbstractC0062a.m(th);
            }
            abstractC0326a.l();
            if (!(interfaceC0311d2 instanceof AbstractC0326a)) {
                interfaceC0311d2.h(obj);
                return;
            }
            interfaceC0311d = interfaceC0311d2;
        }
    }

    public InterfaceC0311d i(Object obj, InterfaceC0311d interfaceC0311d) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public StackTraceElement j() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        int iIntValue;
        String strC;
        e eVar = (e) getClass().getAnnotation(e.class);
        String str = null;
        if (eVar == null) {
            return null;
        }
        int iV = eVar.v();
        if (iV > 1) {
            throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + iV + ". Please update the Kotlin standard library.").toString());
        }
        try {
            Field declaredField = getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(this);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            iIntValue = (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            iIntValue = -1;
        }
        int i2 = iIntValue >= 0 ? eVar.l()[iIntValue] : -1;
        C0037m c0037m = f.f2605b;
        C0037m c0037m2 = f.f2604a;
        if (c0037m == null) {
            try {
                C0037m c0037m3 = new C0037m(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
                f.f2605b = c0037m3;
                c0037m = c0037m3;
            } catch (Exception unused2) {
                f.f2605b = c0037m2;
                c0037m = c0037m2;
            }
        }
        if (c0037m != c0037m2) {
            Method method = (Method) c0037m.f195a;
            Object objInvoke = method != null ? method.invoke(getClass(), null) : null;
            if (objInvoke != null) {
                Method method2 = (Method) c0037m.f196b;
                Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
                if (objInvoke2 != null) {
                    Method method3 = (Method) c0037m.f197c;
                    Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                    if (objInvoke3 instanceof String) {
                        str = (String) objInvoke3;
                    }
                }
            }
        }
        if (str == null) {
            strC = eVar.c();
        } else {
            strC = str + '/' + eVar.c();
        }
        return new StackTraceElement(strC, eVar.m(), eVar.f(), i2);
    }

    public abstract Object k(Object obj);

    public String toString() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Object objJ = j();
        if (objJ == null) {
            objJ = getClass().getName();
        }
        sb.append(objJ);
        return sb.toString();
    }

    public void l() {
    }
}
