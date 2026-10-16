package x0;

import a.AbstractC0062a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k0.C0230c;
import w0.n;
import w0.o;
import w0.p;
import w0.q;
import w0.r;
import w0.s;
import w0.t;
import w0.u;
import w0.v;
import w0.w;

/* loaded from: classes.dex */
public final class d implements C0.b, c {

    /* renamed from: b, reason: collision with root package name */
    public static final Map f2699b;

    /* renamed from: c, reason: collision with root package name */
    public static final LinkedHashMap f2700c;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2701a;

    static {
        int i2 = 0;
        List listK = l0.i.K(w0.a.class, w0.l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, w0.b.class, w0.c.class, w0.d.class, w0.e.class, w0.f.class, w0.g.class, w0.h.class, w0.i.class, w0.j.class, w0.k.class, w0.m.class, n.class, o.class);
        ArrayList arrayList = new ArrayList(l0.j.L(listK));
        for (Object obj : listK) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                throw new ArithmeticException("Index overflow has happened.");
            }
            arrayList.add(new C0230c((Class) obj, Integer.valueOf(i2)));
            i2 = i3;
        }
        f2699b = l0.s.b0(arrayList);
        HashMap map = new HashMap();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        HashMap map2 = new HashMap();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        HashMap map3 = new HashMap();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        g.d("<get-values>(...)", collectionValues);
        for (String str : collectionValues) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            g.b(str);
            sb.append(E0.l.V(str, str));
            sb.append("CompanionObject");
            map3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : f2699b.entrySet()) {
            Class cls = (Class) entry.getKey();
            int iIntValue = ((Number) entry.getValue()).intValue();
            map3.put(cls.getName(), "kotlin.Function" + iIntValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(l0.s.a0(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            Object key = entry2.getKey();
            String str2 = (String) entry2.getValue();
            linkedHashMap.put(key, E0.l.V(str2, str2));
        }
        f2700c = linkedHashMap;
    }

    public d(Class cls) {
        g.e("jClass", cls);
        this.f2701a = cls;
    }

    @Override // x0.c
    public final Class a() {
        return this.f2701a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof d) && AbstractC0062a.x(this).equals(AbstractC0062a.x((C0.b) obj));
    }

    public final int hashCode() {
        return AbstractC0062a.x(this).hashCode();
    }

    public final String toString() {
        return this.f2701a.toString() + " (Kotlin reflection is not available)";
    }
}
