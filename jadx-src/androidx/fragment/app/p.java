package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q f1204a;

    public p(q qVar) {
        this.f1204a = qVar;
    }

    @Override // androidx.fragment.app.o
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zN;
        q qVar = this.f1204a;
        qVar.getClass();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + qVar.f1214a);
        }
        if (qVar.d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zN = false;
        } else {
            a aVar = (a) qVar.d.get(r1.size() - 1);
            qVar.f1219g = aVar;
            Iterator it = aVar.f1154a.iterator();
            while (it.hasNext()) {
                ((u) it.next()).getClass();
            }
            zN = qVar.n(arrayList, arrayList2);
        }
        if (!qVar.f1224m.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(q.l((a) it2.next()));
            }
            Iterator it3 = qVar.f1224m.iterator();
            while (it3.hasNext()) {
                if (it3.next() != null) {
                    throw new ClassCastException();
                }
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    throw x.a(it4);
                }
            }
        }
        return zN;
    }
}
