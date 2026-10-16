package p;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class f extends k implements Map {

    /* renamed from: e, reason: collision with root package name */
    public C0325a f2581e;

    /* renamed from: f, reason: collision with root package name */
    public c f2582f;

    /* renamed from: g, reason: collision with root package name */
    public e f2583g;

    @Override // java.util.Map
    public final Set entrySet() {
        C0325a c0325a = this.f2581e;
        if (c0325a != null) {
            return c0325a;
        }
        C0325a c0325a2 = new C0325a(this);
        this.f2581e = c0325a2;
        return c0325a2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i2 = this.d;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i2 != this.d;
    }

    @Override // java.util.Map
    public final Set keySet() {
        c cVar = this.f2582f;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f2582f = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.d;
        int i2 = this.d;
        int[] iArr = this.f2596b;
        if (iArr.length < size) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, size);
            x0.g.d("copyOf(this, newSize)", iArrCopyOf);
            this.f2596b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2597c, size * 2);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2597c = objArrCopyOf;
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        e eVar = this.f2583g;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.f2583g = eVar2;
        return eVar2;
    }
}
