package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import n.C0307a;
import o.C0318a;
import o.C0320c;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1309a;

    /* renamed from: b, reason: collision with root package name */
    public C0318a f1310b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0081m f1311c;
    public final WeakReference d;

    /* renamed from: e, reason: collision with root package name */
    public int f1312e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1313f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1314g;
    public final ArrayList h;

    public t(r rVar) {
        new AtomicReference();
        this.f1309a = true;
        this.f1310b = new C0318a();
        this.f1311c = EnumC0081m.f1302c;
        this.h = new ArrayList();
        this.d = new WeakReference(rVar);
    }

    public final void a(q qVar) {
        p reflectiveGenericLifecycleObserver;
        r rVar;
        ArrayList arrayList = this.h;
        c("addObserver");
        EnumC0081m enumC0081m = this.f1311c;
        EnumC0081m enumC0081m2 = EnumC0081m.f1301b;
        if (enumC0081m != enumC0081m2) {
            enumC0081m2 = EnumC0081m.f1302c;
        }
        s sVar = new s();
        HashMap map = u.f1315a;
        boolean z2 = qVar instanceof p;
        boolean z3 = qVar instanceof InterfaceC0072d;
        Object obj = null;
        if (z2 && z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0072d) qVar, (p) qVar);
        } else if (z3) {
            reflectiveGenericLifecycleObserver = new DefaultLifecycleObserverAdapter((InterfaceC0072d) qVar, null);
        } else if (z2) {
            reflectiveGenericLifecycleObserver = (p) qVar;
        } else {
            Class<?> cls = qVar.getClass();
            if (u.c(cls) == 2) {
                Object obj2 = u.f1316b.get(cls);
                x0.g.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                int size = list.size();
                InterfaceC0075g[] interfaceC0075gArr = new InterfaceC0075g[size];
                if (size > 0) {
                    u.a((Constructor) list.get(0), qVar);
                    throw null;
                }
                reflectiveGenericLifecycleObserver = new CompositeGeneratedAdaptersObserver(interfaceC0075gArr);
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(qVar);
            }
        }
        sVar.f1308b = reflectiveGenericLifecycleObserver;
        sVar.f1307a = enumC0081m2;
        C0318a c0318a = this.f1310b;
        C0320c c0320cA = c0318a.a(qVar);
        if (c0320cA != null) {
            obj = c0320cA.f2512c;
        } else {
            HashMap map2 = c0318a.f2508f;
            C0320c c0320c = new C0320c(qVar, sVar);
            c0318a.f2518e++;
            C0320c c0320c2 = c0318a.f2517c;
            if (c0320c2 == null) {
                c0318a.f2516b = c0320c;
                c0318a.f2517c = c0320c;
            } else {
                c0320c2.d = c0320c;
                c0320c.f2513e = c0320c2;
                c0318a.f2517c = c0320c;
            }
            map2.put(qVar, c0320c);
        }
        if (((s) obj) == null && (rVar = (r) this.d.get()) != null) {
            boolean z4 = this.f1312e != 0 || this.f1313f;
            EnumC0081m enumC0081mB = b(qVar);
            this.f1312e++;
            while (sVar.f1307a.compareTo(enumC0081mB) < 0 && this.f1310b.f2508f.containsKey(qVar)) {
                arrayList.add(sVar.f1307a);
                C0078j c0078j = EnumC0080l.Companion;
                EnumC0081m enumC0081m3 = sVar.f1307a;
                c0078j.getClass();
                EnumC0080l enumC0080lA = C0078j.a(enumC0081m3);
                if (enumC0080lA == null) {
                    throw new IllegalStateException("no event up from " + sVar.f1307a);
                }
                sVar.a(rVar, enumC0080lA);
                arrayList.remove(arrayList.size() - 1);
                enumC0081mB = b(qVar);
            }
            if (!z4) {
                g();
            }
            this.f1312e--;
        }
    }

    public final EnumC0081m b(q qVar) {
        s sVar;
        HashMap map = this.f1310b.f2508f;
        C0320c c0320c = map.containsKey(qVar) ? ((C0320c) map.get(qVar)).f2513e : null;
        EnumC0081m enumC0081m = (c0320c == null || (sVar = (s) c0320c.f2512c) == null) ? null : sVar.f1307a;
        ArrayList arrayList = this.h;
        EnumC0081m enumC0081m2 = arrayList.isEmpty() ? null : (EnumC0081m) arrayList.get(arrayList.size() - 1);
        EnumC0081m enumC0081m3 = this.f1311c;
        x0.g.e("state1", enumC0081m3);
        if (enumC0081m == null || enumC0081m.compareTo(enumC0081m3) >= 0) {
            enumC0081m = enumC0081m3;
        }
        return (enumC0081m2 == null || enumC0081m2.compareTo(enumC0081m) >= 0) ? enumC0081m : enumC0081m2;
    }

    public final void c(String str) {
        C0307a c0307a;
        if (this.f1309a) {
            if (C0307a.f2498n != null) {
                c0307a = C0307a.f2498n;
            } else {
                synchronized (C0307a.class) {
                    try {
                        if (C0307a.f2498n == null) {
                            C0307a.f2498n = new C0307a(0);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c0307a = C0307a.f2498n;
            }
            ((C0307a) c0307a.f2499m).getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(Q.d.a("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void d(EnumC0080l enumC0080l) {
        x0.g.e("event", enumC0080l);
        c("handleLifecycleEvent");
        e(enumC0080l.a());
    }

    public final void e(EnumC0081m enumC0081m) {
        EnumC0081m enumC0081m2 = this.f1311c;
        if (enumC0081m2 == enumC0081m) {
            return;
        }
        EnumC0081m enumC0081m3 = EnumC0081m.f1302c;
        EnumC0081m enumC0081m4 = EnumC0081m.f1301b;
        if (enumC0081m2 == enumC0081m3 && enumC0081m == enumC0081m4) {
            throw new IllegalStateException(("no event down from " + this.f1311c + " in component " + this.d.get()).toString());
        }
        this.f1311c = enumC0081m;
        if (this.f1313f || this.f1312e != 0) {
            this.f1314g = true;
            return;
        }
        this.f1313f = true;
        g();
        this.f1313f = false;
        if (this.f1311c == enumC0081m4) {
            this.f1310b = new C0318a();
        }
    }

    public final void f(q qVar) {
        x0.g.e("observer", qVar);
        c("removeObserver");
        C0318a c0318a = this.f1310b;
        C0320c c0320cA = c0318a.a(qVar);
        if (c0320cA != null) {
            c0318a.f2518e--;
            WeakHashMap weakHashMap = c0318a.d;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((o.e) it.next()).a(c0320cA);
                }
            }
            C0320c c0320c = c0320cA.f2513e;
            if (c0320c != null) {
                c0320c.d = c0320cA.d;
            } else {
                c0318a.f2516b = c0320cA.d;
            }
            C0320c c0320c2 = c0320cA.d;
            if (c0320c2 != null) {
                c0320c2.f2513e = c0320c;
            } else {
                c0318a.f2517c = c0320c;
            }
            c0320cA.d = null;
            c0320cA.f2513e = null;
        }
        c0318a.f2508f.remove(qVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        r7.f1314g = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.t.g():void");
    }
}
