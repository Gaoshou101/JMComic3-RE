package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.I;
import androidx.lifecycle.L;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class s extends I {

    /* renamed from: g, reason: collision with root package name */
    public static final L.c f1243g = new L.c(13);

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f1244c = new HashMap();
    public final HashMap d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final HashMap f1245e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1246f = false;

    public s(boolean z2) {
    }

    @Override // androidx.lifecycle.I
    public final void b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1246f = true;
    }

    public final void c(String str, boolean z2) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        HashMap map = this.d;
        s sVar = (s) map.get(str);
        if (sVar != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(sVar.d.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    sVar.c((String) it.next(), true);
                }
            }
            sVar.b();
            map.remove(str);
        }
        HashMap map2 = this.f1245e;
        L l2 = (L) map2.get(str);
        if (l2 != null) {
            l2.a();
            map2.remove(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        s sVar = (s) obj;
        return this.f1244c.equals(sVar.f1244c) && this.d.equals(sVar.d) && this.f1245e.equals(sVar.f1245e);
    }

    public final int hashCode() {
        return this.f1245e.hashCode() + ((this.d.hashCode() + (this.f1244c.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1244c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1245e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
