package p;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public final class g implements Collection, Set, y0.a {

    /* renamed from: b, reason: collision with root package name */
    public int[] f2584b = AbstractC0328a.f2607a;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2585c = AbstractC0328a.f2608b;
    public int d;

    public final Object a(int i2) {
        int i3 = this.d;
        Object[] objArr = this.f2585c;
        Object obj = objArr[i2];
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.f2584b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    l0.g.a0(i2, i5, i3, iArr, iArr);
                    Object[] objArr2 = this.f2585c;
                    l0.g.b0(objArr2, objArr2, i2, i5, i3);
                }
                this.f2585c[i4] = null;
            } else {
                int i6 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArr2 = new int[i6];
                this.f2584b = iArr2;
                this.f2585c = new Object[i6];
                if (i2 > 0) {
                    l0.g.a0(0, 0, i2, iArr, iArr2);
                    l0.g.c0(objArr, this.f2585c, 0, i2, 6);
                }
                if (i2 < i4) {
                    int i7 = i2 + 1;
                    l0.g.a0(i2, i7, i3, iArr, this.f2584b);
                    l0.g.b0(objArr, this.f2585c, i2, i7, i3);
                }
            }
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            this.d = i4;
        }
        return obj;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        int i2;
        int iA;
        int i3 = this.d;
        if (obj == null) {
            iA = i.a(this, null, 0);
            i2 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i2 = iHashCode;
            iA = i.a(this, obj, iHashCode);
        }
        if (iA >= 0) {
            return false;
        }
        int i4 = ~iA;
        int[] iArr = this.f2584b;
        if (i3 >= iArr.length) {
            int i5 = 8;
            if (i3 >= 8) {
                i5 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f2585c;
            int[] iArr2 = new int[i5];
            this.f2584b = iArr2;
            this.f2585c = new Object[i5];
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            if (iArr2.length != 0) {
                l0.g.a0(0, 0, iArr.length, iArr, iArr2);
                l0.g.c0(objArr, this.f2585c, 0, objArr.length, 6);
            }
        }
        if (i4 < i3) {
            int[] iArr3 = this.f2584b;
            int i6 = i4 + 1;
            l0.g.a0(i6, i4, i3, iArr3, iArr3);
            Object[] objArr2 = this.f2585c;
            l0.g.b0(objArr2, objArr2, i6, i4, i3);
        }
        int i7 = this.d;
        if (i3 == i7) {
            int[] iArr4 = this.f2584b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i2;
                this.f2585c[i4] = obj;
                this.d = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        x0.g.e("elements", collection);
        int size = collection.size() + this.d;
        int i2 = this.d;
        int[] iArr = this.f2584b;
        boolean zAdd = false;
        if (iArr.length < size) {
            Object[] objArr = this.f2585c;
            int[] iArr2 = new int[size];
            this.f2584b = iArr2;
            this.f2585c = new Object[size];
            int i3 = this.d;
            if (i3 > 0) {
                l0.g.a0(0, 0, i3, iArr, iArr2);
                l0.g.c0(objArr, this.f2585c, 0, this.d, 6);
            }
        }
        if (this.d != i2) {
            throw new ConcurrentModificationException();
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        if (this.d != 0) {
            this.f2584b = AbstractC0328a.f2607a;
            this.f2585c = AbstractC0328a.f2608b;
            this.d = 0;
        }
        if (this.d != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode())) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        x0.g.e("elements", collection);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof Set) && this.d == ((Set) obj).size()) {
            try {
                int i2 = this.d;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (((Set) obj).contains(this.f2585c[i3])) {
                    }
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.f2584b;
        int i2 = this.d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = obj == null ? i.a(this, null, 0) : i.a(this, obj, obj.hashCode());
        if (iA < 0) {
            return false;
        }
        a(iA);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        x0.g.e("elements", collection);
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        x0.g.e("elements", collection);
        boolean z2 = false;
        for (int i2 = this.d - 1; -1 < i2; i2--) {
            if (!collection.contains(this.f2585c[i2])) {
                a(i2);
                z2 = true;
            }
        }
        return z2;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.d;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        Object[] objArr = this.f2585c;
        int i2 = this.d;
        x0.g.e("<this>", objArr);
        int length = objArr.length;
        if (i2 <= length) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, 0, i2);
            x0.g.d("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i2 + ") is greater than size (" + length + ").");
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 14);
        sb.append('{');
        int i2 = this.d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = this.f2585c[i3];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x0.g.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        x0.g.e("array", objArr);
        int i2 = this.d;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        } else if (objArr.length > i2) {
            objArr[i2] = null;
        }
        l0.g.b0(this.f2585c, objArr, 0, 0, this.d);
        return objArr;
    }
}
