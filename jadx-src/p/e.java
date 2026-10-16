package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class e implements Collection {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f2580b;

    public e(f fVar) {
        this.f2580b = fVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.f2580b.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.f2580b.a(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.f2580b.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new b(this.f2580b, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        f fVar = this.f2580b;
        int iA = fVar.a(obj);
        if (iA < 0) {
            return false;
        }
        fVar.f(iA);
        return true;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        f fVar = this.f2580b;
        int i2 = fVar.d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (collection.contains(fVar.h(i3))) {
                fVar.f(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        f fVar = this.f2580b;
        int i2 = fVar.d;
        int i3 = 0;
        boolean z2 = false;
        while (i3 < i2) {
            if (!collection.contains(fVar.h(i3))) {
                fVar.f(i3);
                i3--;
                i2--;
                z2 = true;
            }
            i3++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f2580b.d;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        f fVar = this.f2580b;
        int i2 = fVar.d;
        Object[] objArr = new Object[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = fVar.h(i3);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        f fVar = this.f2580b;
        int i2 = fVar.d;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = fVar.h(i3);
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
