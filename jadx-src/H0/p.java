package H0;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class p extends e {

    /* renamed from: m, reason: collision with root package name */
    public final a f265m;

    public p(int i2, a aVar, w0.l lVar) {
        String str;
        super(i2, lVar);
        this.f265m = aVar;
        if (aVar != a.f224b) {
            if (i2 >= 1) {
                return;
            }
            throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i2 + " was specified").toString());
        }
        StringBuilder sb = new StringBuilder("This implementation does not support suspension for senders, use ");
        x0.k.f2707a.getClass();
        new x0.d(e.class);
        String simpleName = null;
        if (!e.class.isAnonymousClass()) {
            if (e.class.isLocalClass()) {
                String simpleName2 = e.class.getSimpleName();
                Method enclosingMethod = e.class.getEnclosingMethod();
                if (enclosingMethod == null) {
                    Constructor<?> enclosingConstructor = e.class.getEnclosingConstructor();
                    if (enclosingConstructor == null) {
                        int iP = E0.l.P(simpleName2, '$', 0, 6);
                        if (iP != -1) {
                            simpleName2 = simpleName2.substring(iP + 1, simpleName2.length());
                            x0.g.d("substring(...)", simpleName2);
                        }
                        simpleName = simpleName2;
                    } else {
                        simpleName = E0.l.U(simpleName2, enclosingConstructor.getName() + '$');
                    }
                } else {
                    simpleName = E0.l.U(simpleName2, enclosingMethod.getName() + '$');
                }
            } else {
                boolean zIsArray = e.class.isArray();
                LinkedHashMap linkedHashMap = x0.d.f2700c;
                if (zIsArray) {
                    Class<?> componentType = e.class.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) linkedHashMap.get(componentType.getName())) != null) {
                        simpleName = str.concat("Array");
                    }
                    if (simpleName == null) {
                        simpleName = "Array";
                    }
                } else {
                    simpleName = (String) linkedHashMap.get(e.class.getName());
                    if (simpleName == null) {
                        simpleName = e.class.getSimpleName();
                    }
                }
            }
        }
        sb.append(simpleName);
        sb.append(" instead");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x01d2, code lost:
    
        r0 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ed, code lost:
    
        r18 = r24;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object] */
    @Override // H0.e, H0.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Object r29, n0.InterfaceC0311d r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H0.p.i(java.lang.Object, n0.d):java.lang.Object");
    }

    @Override // H0.e
    public final boolean r() {
        return this.f265m == a.f225c;
    }
}
