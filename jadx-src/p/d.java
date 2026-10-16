package p;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: b, reason: collision with root package name */
    public int f2577b;

    /* renamed from: c, reason: collision with root package name */
    public int f2578c = -1;
    public boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f2579e;

    public d(f fVar) {
        this.f2579e = fVar;
        this.f2577b = fVar.d - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        int i2 = this.f2578c;
        f fVar = this.f2579e;
        return x0.g.a(key, fVar.e(i2)) && x0.g.a(entry.getValue(), fVar.h(this.f2578c));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.d) {
            return this.f2579e.e(this.f2578c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.d) {
            return this.f2579e.h(this.f2578c);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2578c < this.f2577b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.d) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }
        int i2 = this.f2578c;
        f fVar = this.f2579e;
        Object objE = fVar.e(i2);
        Object objH = fVar.h(this.f2578c);
        return (objE == null ? 0 : objE.hashCode()) ^ (objH != null ? objH.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2578c++;
        this.d = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.d) {
            throw new IllegalStateException();
        }
        this.f2579e.f(this.f2578c);
        this.f2578c--;
        this.f2577b--;
        this.d = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.d) {
            return this.f2579e.g(this.f2578c, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
