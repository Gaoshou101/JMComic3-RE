package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;

@Deprecated
/* loaded from: classes.dex */
class ReflectiveGenericLifecycleObserver implements p {

    /* renamed from: b, reason: collision with root package name */
    public final q f1288b;

    /* renamed from: c, reason: collision with root package name */
    public final C0069a f1289c;

    public ReflectiveGenericLifecycleObserver(q qVar) {
        this.f1288b = qVar;
        C0071c c0071c = C0071c.f1296c;
        Class<?> cls = qVar.getClass();
        C0069a c0069a = (C0069a) c0071c.f1297a.get(cls);
        this.f1289c = c0069a == null ? c0071c.a(cls, null) : c0069a;
    }

    @Override // androidx.lifecycle.p
    public final void b(r rVar, EnumC0080l enumC0080l) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        HashMap map = this.f1289c.f1292a;
        List list = (List) map.get(enumC0080l);
        q qVar = this.f1288b;
        C0069a.a(list, rVar, enumC0080l, qVar);
        C0069a.a((List) map.get(EnumC0080l.ON_ANY), rVar, enumC0080l, qVar);
    }
}
