package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.lifecycle.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0071c {

    /* renamed from: c, reason: collision with root package name */
    public static final C0071c f1296c = new C0071c();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1297a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1298b = new HashMap();

    public static void b(HashMap map, C0070b c0070b, EnumC0080l enumC0080l, Class cls) {
        EnumC0080l enumC0080l2 = (EnumC0080l) map.get(c0070b);
        if (enumC0080l2 == null || enumC0080l == enumC0080l2) {
            if (enumC0080l2 == null) {
                map.put(c0070b, enumC0080l);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0070b.f1295b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC0080l2 + ", new value " + enumC0080l);
    }

    public final C0069a a(Class cls, Method[] methodArr) throws SecurityException {
        int i2;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f1297a;
        if (superclass != null) {
            C0069a c0069aA = (C0069a) map2.get(superclass);
            if (c0069aA == null) {
                c0069aA = a(superclass, null);
            }
            map.putAll(c0069aA.f1293b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0069a c0069aA2 = (C0069a) map2.get(cls2);
            if (c0069aA2 == null) {
                c0069aA2 = a(cls2, null);
            }
            for (Map.Entry entry : c0069aA2.f1293b.entrySet()) {
                b(map, (C0070b) entry.getKey(), (EnumC0080l) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z2 = false;
        for (Method method : methodArr) {
            v vVar = (v) method.getAnnotation(v.class);
            if (vVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i2 = 0;
                } else {
                    if (!r.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i2 = 1;
                }
                EnumC0080l enumC0080lValue = vVar.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC0080l.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC0080lValue != EnumC0080l.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i2 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                b(map, new C0070b(i2, method), enumC0080lValue, cls);
                z2 = true;
            }
        }
        C0069a c0069a = new C0069a(map);
        map2.put(cls, c0069a);
        this.f1298b.put(cls, Boolean.valueOf(z2));
        return c0069a;
    }
}
