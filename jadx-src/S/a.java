package S;

import F0.C0011l;
import a.AbstractC0062a;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a {
    public static volatile a d;

    /* renamed from: e, reason: collision with root package name */
    public static final Object f616e = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final Context f619c;

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f618b = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f617a = new HashMap();

    public a(Context context) {
        this.f619c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (d == null) {
            synchronized (f616e) {
                try {
                    if (d == null) {
                        d = new a(context);
                    }
                } finally {
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) throws ClassNotFoundException {
        HashSet hashSet;
        String string = this.f619c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f618b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0011l(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objB;
        if (AbstractC0062a.G()) {
            try {
                AbstractC0062a.e(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f617a;
        if (map.containsKey(cls)) {
            objB = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objB = bVar.b(this.f619c);
                hashSet.remove(cls);
                map.put(cls, objB);
            } catch (Throwable th2) {
                throw new C0011l(th2);
            }
        }
        Trace.endSection();
        return objB;
    }
}
