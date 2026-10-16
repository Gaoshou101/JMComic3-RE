package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.lifecycle.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0069a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1292a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1293b;

    public C0069a(HashMap map) {
        this.f1293b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0080l enumC0080l = (EnumC0080l) entry.getValue();
            List arrayList = (List) this.f1292a.get(enumC0080l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1292a.put(enumC0080l, arrayList);
            }
            arrayList.add((C0070b) entry.getKey());
        }
    }

    public static void a(List list, r rVar, EnumC0080l enumC0080l, q qVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0070b c0070b = (C0070b) list.get(size);
                c0070b.getClass();
                try {
                    int i2 = c0070b.f1294a;
                    Method method = c0070b.f1295b;
                    if (i2 == 0) {
                        method.invoke(qVar, null);
                    } else if (i2 == 1) {
                        method.invoke(qVar, rVar);
                    } else if (i2 == 2) {
                        method.invoke(qVar, rVar, enumC0080l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
