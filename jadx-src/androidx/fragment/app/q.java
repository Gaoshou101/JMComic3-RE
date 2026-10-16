package androidx.fragment.app;

import android.os.Looper;
import android.util.Log;
import androidx.activity.C;
import c.C0091g;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: A, reason: collision with root package name */
    public ArrayDeque f1205A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f1206B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f1207C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f1208D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayList f1209E;

    /* renamed from: F, reason: collision with root package name */
    public ArrayList f1210F;

    /* renamed from: G, reason: collision with root package name */
    public ArrayList f1211G;

    /* renamed from: H, reason: collision with root package name */
    public s f1212H;

    /* renamed from: I, reason: collision with root package name */
    public final D.b f1213I;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1215b;

    /* renamed from: f, reason: collision with root package name */
    public C f1218f;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1224m;

    /* renamed from: n, reason: collision with root package name */
    public final CopyOnWriteArrayList f1225n;

    /* renamed from: o, reason: collision with root package name */
    public final i f1226o;

    /* renamed from: p, reason: collision with root package name */
    public final i f1227p;

    /* renamed from: q, reason: collision with root package name */
    public final i f1228q;

    /* renamed from: r, reason: collision with root package name */
    public final i f1229r;

    /* renamed from: s, reason: collision with root package name */
    public final k f1230s;

    /* renamed from: t, reason: collision with root package name */
    public int f1231t;

    /* renamed from: u, reason: collision with root package name */
    public f f1232u;

    /* renamed from: v, reason: collision with root package name */
    public f f1233v;

    /* renamed from: w, reason: collision with root package name */
    public final l f1234w;
    public C0091g x;

    /* renamed from: y, reason: collision with root package name */
    public C0091g f1235y;

    /* renamed from: z, reason: collision with root package name */
    public C0091g f1236z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1214a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final androidx.emoji2.text.u f1216c = new androidx.emoji2.text.u(1);
    public ArrayList d = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final h f1217e = new h(this);

    /* renamed from: g, reason: collision with root package name */
    public a f1219g = null;
    public boolean h = false;

    /* renamed from: i, reason: collision with root package name */
    public final Z.b f1220i = new Z.b(this);

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f1221j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f1222k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
    public final Map f1223l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.i] */
    /* JADX WARN: Type inference failed for: r0v19, types: [androidx.fragment.app.i] */
    public q() {
        Collections.synchronizedMap(new HashMap());
        this.f1224m = new ArrayList();
        new CopyOnWriteArrayList();
        this.f1225n = new CopyOnWriteArrayList();
        final int i2 = 0;
        this.f1226o = new F.a(this) { // from class: androidx.fragment.app.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f1195b;

            {
                this.f1195b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i2) {
                    case 0:
                        Iterator it = this.f1195b.f1216c.f().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f1195b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f1216c.f().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f1195b;
                        qVar2.getClass();
                        boolean z2 = ((v.g) obj).f2688a;
                        Iterator it3 = qVar2.f1216c.f().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f1195b;
                        qVar3.getClass();
                        boolean z3 = ((v.l) obj).f2690a;
                        Iterator it4 = qVar3.f1216c.f().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        final int i3 = 1;
        this.f1227p = new F.a(this) { // from class: androidx.fragment.app.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f1195b;

            {
                this.f1195b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i3) {
                    case 0:
                        Iterator it = this.f1195b.f1216c.f().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f1195b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f1216c.f().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f1195b;
                        qVar2.getClass();
                        boolean z2 = ((v.g) obj).f2688a;
                        Iterator it3 = qVar2.f1216c.f().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f1195b;
                        qVar3.getClass();
                        boolean z3 = ((v.l) obj).f2690a;
                        Iterator it4 = qVar3.f1216c.f().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        final int i4 = 2;
        this.f1228q = new F.a(this) { // from class: androidx.fragment.app.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f1195b;

            {
                this.f1195b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i4) {
                    case 0:
                        Iterator it = this.f1195b.f1216c.f().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f1195b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f1216c.f().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f1195b;
                        qVar2.getClass();
                        boolean z2 = ((v.g) obj).f2688a;
                        Iterator it3 = qVar2.f1216c.f().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f1195b;
                        qVar3.getClass();
                        boolean z3 = ((v.l) obj).f2690a;
                        Iterator it4 = qVar3.f1216c.f().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        final int i5 = 3;
        this.f1229r = new F.a(this) { // from class: androidx.fragment.app.i

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f1195b;

            {
                this.f1195b = this;
            }

            @Override // F.a
            public final void a(Object obj) {
                switch (i5) {
                    case 0:
                        Iterator it = this.f1195b.f1216c.f().iterator();
                        while (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    case 1:
                        q qVar = this.f1195b;
                        qVar.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            Iterator it2 = qVar.f1216c.f().iterator();
                            while (it2.hasNext()) {
                                if (it2.next() != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return;
                        }
                        return;
                    case 2:
                        q qVar2 = this.f1195b;
                        qVar2.getClass();
                        boolean z2 = ((v.g) obj).f2688a;
                        Iterator it3 = qVar2.f1216c.f().iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                    default:
                        q qVar3 = this.f1195b;
                        qVar3.getClass();
                        boolean z3 = ((v.l) obj).f2690a;
                        Iterator it4 = qVar3.f1216c.f().iterator();
                        while (it4.hasNext()) {
                            if (it4.next() != null) {
                                throw new ClassCastException();
                            }
                        }
                        return;
                }
            }
        };
        this.f1230s = new k(this);
        this.f1231t = -1;
        this.f1234w = new l(this);
        this.f1205A = new ArrayDeque();
        this.f1213I = new D.b(3, this);
    }

    public static HashSet c(ArrayList arrayList, int i2, int i3) {
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator it = ((a) arrayList.get(i2)).f1154a.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
            i2++;
        }
        return hashSet;
    }

    public static HashSet l(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < aVar.f1154a.size(); i2++) {
            ((u) aVar.f1154a.get(i2)).getClass();
        }
        return hashSet;
    }

    public final void a() {
        this.f1215b = false;
        this.f1210F.clear();
        this.f1209E.clear();
    }

    public final HashSet b() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f1216c.d().iterator();
        if (!it.hasNext()) {
            return hashSet;
        }
        x.b(it.next());
        throw null;
    }

    public final void d(int i2) {
        try {
            this.f1215b = true;
            Iterator it = ((HashMap) this.f1216c.f1141b).values().iterator();
            while (it.hasNext()) {
                if (it.next() != null) {
                    throw new ClassCastException();
                }
            }
            m(i2, false);
            Iterator it2 = b().iterator();
            if (it2.hasNext()) {
                ((y) it2.next()).a();
                throw null;
            }
            this.f1215b = false;
            h(true);
        } catch (Throwable th) {
            this.f1215b = false;
            throw th;
        }
    }

    public final void e() {
        Iterator it = b().iterator();
        if (it.hasNext()) {
            ((y) it.next()).a();
            throw null;
        }
    }

    public final void f(o oVar) {
        if (this.f1232u == null) {
            if (!this.f1208D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (this.f1206B || this.f1207C) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        synchronized (this.f1214a) {
            try {
                if (this.f1232u == null) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.f1214a.add(oVar);
                p();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void g(boolean z2) {
        if (this.f1215b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1232u == null) {
            if (!this.f1208D) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1232u.f1188b.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && (this.f1206B || this.f1207C)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1209E == null) {
            this.f1209E = new ArrayList();
            this.f1210F = new ArrayList();
        }
    }

    public final boolean h(boolean z2) {
        boolean zA;
        a aVar;
        g(z2);
        if (!this.h && (aVar = this.f1219g) != null) {
            aVar.f1169r = false;
            if (Log.isLoggable("FragmentManager", 3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.f1219g + " as part of execPendingActions for actions " + this.f1214a);
            }
            this.f1219g.c(false);
            this.f1214a.add(0, this.f1219g);
            Iterator it = this.f1219g.f1154a.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
            this.f1219g = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList = this.f1209E;
            ArrayList arrayList2 = this.f1210F;
            synchronized (this.f1214a) {
                if (this.f1214a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f1214a.size();
                        zA = false;
                        for (int i2 = 0; i2 < size; i2++) {
                            zA |= ((o) this.f1214a.get(i2)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!zA) {
                q();
                ((HashMap) this.f1216c.f1141b).values().removeAll(Collections.singleton(null));
                return z3;
            }
            z3 = true;
            this.f1215b = true;
            try {
                o(this.f1209E, this.f1210F);
            } finally {
                a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(java.util.ArrayList r17, java.util.ArrayList r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.i(java.util.ArrayList, java.util.ArrayList, int, int):void");
    }

    public final void j() {
        androidx.emoji2.text.u uVar = this.f1216c;
        ArrayList arrayList = (ArrayList) uVar.f1140a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) != null) {
                throw new ClassCastException();
            }
        }
        Iterator it = ((HashMap) uVar.f1141b).values().iterator();
        while (it.hasNext()) {
            x.b(it.next());
        }
    }

    public final void k() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            ((y) it.next()).getClass();
        }
    }

    public final void m(int i2, boolean z2) {
        if (this.f1232u == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f1231t) {
            this.f1231t = i2;
            androidx.emoji2.text.u uVar = this.f1216c;
            Iterator it = ((ArrayList) uVar.f1140a).iterator();
            if (it.hasNext()) {
                throw x.a(it);
            }
            Iterator it2 = ((HashMap) uVar.f1141b).values().iterator();
            while (it2.hasNext()) {
                if (it2.next() != null) {
                    throw new ClassCastException();
                }
            }
            Iterator it3 = uVar.d().iterator();
            if (it3.hasNext()) {
                throw x.a(it3);
            }
        }
    }

    public final boolean n(ArrayList arrayList, ArrayList arrayList2) {
        int size = this.d.isEmpty() ? -1 : this.d.size() - 1;
        if (size < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= size; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void o(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!((a) arrayList.get(i2)).f1166o) {
                if (i3 != i2) {
                    i(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (((Boolean) arrayList2.get(i2)).booleanValue()) {
                    while (i3 < size && ((Boolean) arrayList2.get(i3)).booleanValue() && !((a) arrayList.get(i3)).f1166o) {
                        i3++;
                    }
                }
                i(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            i(arrayList, arrayList2, i3, size);
        }
    }

    public final void p() {
        synchronized (this.f1214a) {
            try {
                if (this.f1214a.size() == 1) {
                    this.f1232u.f1188b.removeCallbacks(this.f1213I);
                    this.f1232u.f1188b.post(this.f1213I);
                    q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [w0.a, x0.f] */
    /* JADX WARN: Type inference failed for: r2v6, types: [w0.a, x0.f] */
    public final void q() {
        synchronized (this.f1214a) {
            try {
                if (!this.f1214a.isEmpty()) {
                    Z.b bVar = this.f1220i;
                    bVar.f725a = true;
                    ?? r2 = bVar.f727c;
                    if (r2 != 0) {
                        r2.a();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z2 = this.d.size() + (this.f1219g != null ? 1 : 0) > 0;
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z2);
                }
                Z.b bVar2 = this.f1220i;
                bVar2.f725a = z2;
                ?? r02 = bVar2.f727c;
                if (r02 != 0) {
                    r02.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        f fVar = this.f1232u;
        if (fVar != null) {
            sb.append(fVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1232u)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }
}
