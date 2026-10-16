package com.getcapacitor;

import c0.InterfaceC0095b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name */
    public final C0101f f1368a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f1369b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1370c = new HashMap();
    public final String d;

    /* renamed from: e, reason: collision with root package name */
    public D f1371e;

    public G(Class cls, C0101f c0101f) throws s, SecurityException {
        this.f1368a = c0101f;
        this.f1369b = cls;
        InterfaceC0095b interfaceC0095b = (InterfaceC0095b) cls.getAnnotation(InterfaceC0095b.class);
        if (interfaceC0095b == null) {
            A a2 = (A) cls.getAnnotation(A.class);
            if (a2 == null) {
                throw new s("No @CapacitorPlugin annotation found for plugin ".concat(cls.getName()));
            }
            if (a2.name().equals("")) {
                this.d = cls.getSimpleName();
            } else {
                this.d = a2.name();
            }
        } else if (interfaceC0095b.name().equals("")) {
            this.d = cls.getSimpleName();
        } else {
            this.d = interfaceC0095b.name();
        }
        for (Method method : cls.getMethods()) {
            I i2 = (I) method.getAnnotation(I.class);
            if (i2 != null) {
                this.f1370c.put(method.getName(), new J(method, i2));
            }
        }
    }

    public final void a(E e2, String str) throws IllegalAccessException, t, H, IllegalArgumentException, InvocationTargetException {
        if (this.f1371e == null) {
            b();
        }
        J j2 = (J) this.f1370c.get(str);
        if (j2 != null) {
            j2.f1372a.invoke(this.f1371e, e2);
            return;
        }
        throw new t("No method " + str + " found for plugin " + this.f1369b.getName());
    }

    public final void b() throws H {
        if (this.f1371e != null) {
            return;
        }
        try {
            D d = (D) this.f1369b.getDeclaredConstructor(null).newInstance(null);
            this.f1371e = d;
            d.setPluginHandle(this);
            this.f1371e.setBridge(this.f1368a);
            this.f1371e.load();
            this.f1371e.initializeActivityLaunchers();
        } catch (Exception unused) {
            throw new H("Unable to load plugin instance. Ensure plugin is publicly accessible");
        }
    }
}
