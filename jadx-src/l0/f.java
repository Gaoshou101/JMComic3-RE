package l0;

import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class f extends AbstractList implements List, y0.a {

    /* renamed from: e, reason: collision with root package name */
    public static final Object[] f2187e = new Object[0];

    /* renamed from: b, reason: collision with root package name */
    public int f2188b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2189c = f2187e;
    public int d;

    public final void a(int i2, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2189c.length;
        while (i2 < length && it.hasNext()) {
            this.f2189c[i2] = it.next();
            i2++;
        }
        int i3 = this.f2188b;
        for (int i4 = 0; i4 < i3 && it.hasNext(); i4++) {
            this.f2189c[i4] = it.next();
        }
        this.d = collection.size() + this.d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int length;
        int i3 = this.d;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == i3) {
            addLast(obj);
            return;
        }
        if (i2 == 0) {
            addFirst(obj);
            return;
        }
        g();
        b(this.d + 1);
        int iF = f(this.f2188b + i2);
        int i4 = this.d;
        if (i2 < ((i4 + 1) >> 1)) {
            if (iF == 0) {
                Object[] objArr = this.f2189c;
                x0.g.e("<this>", objArr);
                iF = objArr.length;
            }
            int i5 = iF - 1;
            int i6 = this.f2188b;
            if (i6 == 0) {
                Object[] objArr2 = this.f2189c;
                x0.g.e("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f2188b;
            if (i5 >= i7) {
                Object[] objArr3 = this.f2189c;
                objArr3[length] = objArr3[i7];
                g.b0(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f2189c;
                g.b0(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f2189c;
                objArr5[objArr5.length - 1] = objArr5[0];
                g.b0(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f2189c[i5] = obj;
            this.f2188b = length;
        } else {
            int iF2 = f(this.f2188b + i4);
            if (iF < iF2) {
                Object[] objArr6 = this.f2189c;
                g.b0(objArr6, objArr6, iF + 1, iF, iF2);
            } else {
                Object[] objArr7 = this.f2189c;
                g.b0(objArr7, objArr7, 1, 0, iF2);
                Object[] objArr8 = this.f2189c;
                objArr8[0] = objArr8[objArr8.length - 1];
                g.b0(objArr8, objArr8, iF + 1, iF, objArr8.length - 1);
            }
            this.f2189c[iF] = obj;
        }
        this.d++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i2, Collection collection) {
        x0.g.e("elements", collection);
        int i3 = this.d;
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (collection.isEmpty()) {
            return false;
        }
        if (i2 == this.d) {
            return addAll(collection);
        }
        g();
        b(collection.size() + this.d);
        int iF = f(this.f2188b + this.d);
        int iF2 = f(this.f2188b + i2);
        int size = collection.size();
        if (i2 < ((this.d + 1) >> 1)) {
            int i4 = this.f2188b;
            int length = i4 - size;
            if (iF2 < i4) {
                Object[] objArr = this.f2189c;
                g.b0(objArr, objArr, length, i4, objArr.length);
                if (size >= iF2) {
                    Object[] objArr2 = this.f2189c;
                    g.b0(objArr2, objArr2, objArr2.length - size, 0, iF2);
                } else {
                    Object[] objArr3 = this.f2189c;
                    g.b0(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f2189c;
                    g.b0(objArr4, objArr4, 0, size, iF2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f2189c;
                g.b0(objArr5, objArr5, length, i4, iF2);
            } else {
                Object[] objArr6 = this.f2189c;
                length += objArr6.length;
                int i5 = iF2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    g.b0(objArr6, objArr6, length, i4, iF2);
                } else {
                    g.b0(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f2189c;
                    g.b0(objArr7, objArr7, 0, this.f2188b + length2, iF2);
                }
            }
            this.f2188b = length;
            a(d(iF2 - size), collection);
        } else {
            int i6 = iF2 + size;
            if (iF2 < iF) {
                int i7 = size + iF;
                Object[] objArr8 = this.f2189c;
                if (i7 <= objArr8.length) {
                    g.b0(objArr8, objArr8, i6, iF2, iF);
                } else if (i6 >= objArr8.length) {
                    g.b0(objArr8, objArr8, i6 - objArr8.length, iF2, iF);
                } else {
                    int length3 = iF - (i7 - objArr8.length);
                    g.b0(objArr8, objArr8, 0, length3, iF);
                    Object[] objArr9 = this.f2189c;
                    g.b0(objArr9, objArr9, i6, iF2, length3);
                }
            } else {
                Object[] objArr10 = this.f2189c;
                g.b0(objArr10, objArr10, size, 0, iF);
                Object[] objArr11 = this.f2189c;
                if (i6 >= objArr11.length) {
                    g.b0(objArr11, objArr11, i6 - objArr11.length, iF2, objArr11.length);
                } else {
                    g.b0(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2189c;
                    g.b0(objArr12, objArr12, i6, iF2, objArr12.length - size);
                }
            }
            a(iF2, collection);
        }
        return true;
    }

    public final void addFirst(Object obj) {
        g();
        b(this.d + 1);
        int length = this.f2188b;
        if (length == 0) {
            Object[] objArr = this.f2189c;
            x0.g.e("<this>", objArr);
            length = objArr.length;
        }
        int i2 = length - 1;
        this.f2188b = i2;
        this.f2189c[i2] = obj;
        this.d++;
    }

    public final void addLast(Object obj) {
        g();
        b(this.d + 1);
        this.f2189c[f(this.f2188b + this.d)] = obj;
        this.d++;
    }

    public final void b(int i2) {
        if (i2 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2189c;
        if (i2 <= objArr.length) {
            return;
        }
        if (objArr == f2187e) {
            if (i2 < 10) {
                i2 = 10;
            }
            this.f2189c = new Object[i2];
            return;
        }
        int length = objArr.length;
        int i3 = length + (length >> 1);
        if (i3 - i2 < 0) {
            i3 = i2;
        }
        if (i3 - 2147483639 > 0) {
            i3 = i2 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i3];
        g.b0(objArr, objArr2, 0, this.f2188b, objArr.length);
        Object[] objArr3 = this.f2189c;
        int length2 = objArr3.length;
        int i4 = this.f2188b;
        g.b0(objArr3, objArr2, length2 - i4, 0, i4);
        this.f2188b = 0;
        this.f2189c = objArr2;
    }

    public final int c(int i2) {
        x0.g.e("<this>", this.f2189c);
        if (i2 == r0.length - 1) {
            return 0;
        }
        return i2 + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        if (!isEmpty()) {
            g();
            e(this.f2188b, f(this.f2188b + this.d));
        }
        this.f2188b = 0;
        this.d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i2) {
        return i2 < 0 ? i2 + this.f2189c.length : i2;
    }

    public final void e(int i2, int i3) {
        if (i2 < i3) {
            Object[] objArr = this.f2189c;
            x0.g.e("<this>", objArr);
            Arrays.fill(objArr, i2, i3, (Object) null);
        } else {
            Object[] objArr2 = this.f2189c;
            Arrays.fill(objArr2, i2, objArr2.length, (Object) null);
            Object[] objArr3 = this.f2189c;
            x0.g.e("<this>", objArr3);
            Arrays.fill(objArr3, 0, i3, (Object) null);
        }
    }

    public final int f(int i2) {
        Object[] objArr = this.f2189c;
        return i2 >= objArr.length ? i2 - objArr.length : i2;
    }

    public final void g() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        int i3 = this.d;
        if (i2 >= 0 && i2 < i3) {
            return this.f2189c[f(this.f2188b + i2)];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i2;
        int iF = f(this.f2188b + this.d);
        int length = this.f2188b;
        if (length < iF) {
            while (length < iF) {
                if (x0.g.a(obj, this.f2189c[length])) {
                    i2 = this.f2188b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iF) {
            return -1;
        }
        int length2 = this.f2189c.length;
        while (true) {
            if (length >= length2) {
                for (int i3 = 0; i3 < iF; i3++) {
                    if (x0.g.a(obj, this.f2189c[i3])) {
                        length = i3 + this.f2189c.length;
                        i2 = this.f2188b;
                    }
                }
                return -1;
            }
            if (x0.g.a(obj, this.f2189c[length])) {
                i2 = this.f2188b;
                break;
            }
            length++;
        }
        return length - i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.d == 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i2;
        int iF = f(this.f2188b + this.d);
        int i3 = this.f2188b;
        if (i3 < iF) {
            length = iF - 1;
            if (i3 <= length) {
                while (!x0.g.a(obj, this.f2189c[length])) {
                    if (length != i3) {
                        length--;
                    }
                }
                i2 = this.f2188b;
                return length - i2;
            }
            return -1;
        }
        if (i3 > iF) {
            int i4 = iF - 1;
            while (true) {
                if (-1 >= i4) {
                    Object[] objArr = this.f2189c;
                    x0.g.e("<this>", objArr);
                    length = objArr.length - 1;
                    int i5 = this.f2188b;
                    if (i5 <= length) {
                        while (!x0.g.a(obj, this.f2189c[length])) {
                            if (length != i5) {
                                length--;
                            }
                        }
                        i2 = this.f2188b;
                    }
                } else {
                    if (x0.g.a(obj, this.f2189c[i4])) {
                        length = i4 + this.f2189c.length;
                        i2 = this.f2188b;
                        break;
                    }
                    i4--;
                }
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        int i3 = this.d;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        if (i2 == size() - 1) {
            return removeLast();
        }
        if (i2 == 0) {
            return removeFirst();
        }
        g();
        int iF = f(this.f2188b + i2);
        Object[] objArr = this.f2189c;
        Object obj = objArr[iF];
        if (i2 < (this.d >> 1)) {
            int i4 = this.f2188b;
            if (iF >= i4) {
                g.b0(objArr, objArr, i4 + 1, i4, iF);
            } else {
                g.b0(objArr, objArr, 1, 0, iF);
                Object[] objArr2 = this.f2189c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i5 = this.f2188b;
                g.b0(objArr2, objArr2, i5 + 1, i5, objArr2.length - 1);
            }
            Object[] objArr3 = this.f2189c;
            int i6 = this.f2188b;
            objArr3[i6] = null;
            this.f2188b = c(i6);
        } else {
            int iF2 = f((size() - 1) + this.f2188b);
            if (iF <= iF2) {
                Object[] objArr4 = this.f2189c;
                g.b0(objArr4, objArr4, iF, iF + 1, iF2 + 1);
            } else {
                Object[] objArr5 = this.f2189c;
                g.b0(objArr5, objArr5, iF, iF + 1, objArr5.length);
                Object[] objArr6 = this.f2189c;
                objArr6[objArr6.length - 1] = objArr6[0];
                g.b0(objArr6, objArr6, 0, 1, iF2 + 1);
            }
            this.f2189c[iF2] = null;
        }
        this.d--;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iF;
        x0.g.e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2189c.length != 0) {
            int iF2 = f(this.f2188b + this.d);
            int i2 = this.f2188b;
            if (i2 < iF2) {
                iF = i2;
                while (i2 < iF2) {
                    Object obj = this.f2189c[i2];
                    if (collection.contains(obj)) {
                        z2 = true;
                    } else {
                        this.f2189c[iF] = obj;
                        iF++;
                    }
                    i2++;
                }
                Object[] objArr = this.f2189c;
                x0.g.e("<this>", objArr);
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.f2189c.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f2189c;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        z3 = true;
                    } else {
                        this.f2189c[i3] = obj2;
                        i3++;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr3 = this.f2189c;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        z3 = true;
                    } else {
                        this.f2189c[iF] = obj3;
                        iF = c(iF);
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.d = d(iF - this.f2188b);
            }
        }
        return z2;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        Object[] objArr = this.f2189c;
        int i2 = this.f2188b;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f2188b = c(i2);
        this.d--;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        g();
        int iF = f((size() - 1) + this.f2188b);
        Object[] objArr = this.f2189c;
        Object obj = objArr[iF];
        objArr[iF] = null;
        this.d--;
        return obj;
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        P0.b.d(i2, i3, this.d);
        int i4 = i3 - i2;
        if (i4 == 0) {
            return;
        }
        if (i4 == this.d) {
            clear();
            return;
        }
        if (i4 == 1) {
            remove(i2);
            return;
        }
        g();
        if (i2 < this.d - i3) {
            int iF = f((i2 - 1) + this.f2188b);
            int iF2 = f((i3 - 1) + this.f2188b);
            while (i2 > 0) {
                int i5 = iF + 1;
                int iMin = Math.min(i2, Math.min(i5, iF2 + 1));
                Object[] objArr = this.f2189c;
                int i6 = iF2 - iMin;
                int i7 = iF - iMin;
                g.b0(objArr, objArr, i6 + 1, i7 + 1, i5);
                iF = d(i7);
                iF2 = d(i6);
                i2 -= iMin;
            }
            int iF3 = f(this.f2188b + i4);
            e(this.f2188b, iF3);
            this.f2188b = iF3;
        } else {
            int iF4 = f(this.f2188b + i3);
            int iF5 = f(this.f2188b + i2);
            int i8 = this.d;
            while (true) {
                i8 -= i3;
                if (i8 <= 0) {
                    break;
                }
                Object[] objArr2 = this.f2189c;
                i3 = Math.min(i8, Math.min(objArr2.length - iF4, objArr2.length - iF5));
                Object[] objArr3 = this.f2189c;
                int i9 = iF4 + i3;
                g.b0(objArr3, objArr3, iF5, iF4, i9);
                iF4 = f(i9);
                iF5 = f(iF5 + i3);
            }
            int iF6 = f(this.f2188b + this.d);
            e(d(iF6 - i4), iF6);
        }
        this.d -= i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iF;
        x0.g.e("elements", collection);
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (!isEmpty() && this.f2189c.length != 0) {
            int iF2 = f(this.f2188b + this.d);
            int i2 = this.f2188b;
            if (i2 < iF2) {
                iF = i2;
                while (i2 < iF2) {
                    Object obj = this.f2189c[i2];
                    if (collection.contains(obj)) {
                        this.f2189c[iF] = obj;
                        iF++;
                    } else {
                        z2 = true;
                    }
                    i2++;
                }
                Object[] objArr = this.f2189c;
                x0.g.e("<this>", objArr);
                Arrays.fill(objArr, iF, iF2, (Object) null);
            } else {
                int length = this.f2189c.length;
                boolean z3 = false;
                int i3 = i2;
                while (i2 < length) {
                    Object[] objArr2 = this.f2189c;
                    Object obj2 = objArr2[i2];
                    objArr2[i2] = null;
                    if (collection.contains(obj2)) {
                        this.f2189c[i3] = obj2;
                        i3++;
                    } else {
                        z3 = true;
                    }
                    i2++;
                }
                iF = f(i3);
                for (int i4 = 0; i4 < iF2; i4++) {
                    Object[] objArr3 = this.f2189c;
                    Object obj3 = objArr3[i4];
                    objArr3[i4] = null;
                    if (collection.contains(obj3)) {
                        this.f2189c[iF] = obj3;
                        iF = c(iF);
                    } else {
                        z3 = true;
                    }
                }
                z2 = z3;
            }
            if (z2) {
                g();
                this.d = d(iF - this.f2188b);
            }
        }
        return z2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        int i3 = this.d;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
        }
        int iF = f(this.f2188b + i2);
        Object[] objArr = this.f2189c;
        Object obj2 = objArr[iF];
        objArr[iF] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[this.d]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) throws NegativeArraySizeException {
        x0.g.e("array", objArr);
        int length = objArr.length;
        int i2 = this.d;
        if (length < i2) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i2);
            x0.g.c("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iF = f(this.f2188b + this.d);
        int i3 = this.f2188b;
        if (i3 < iF) {
            g.c0(this.f2189c, objArr, i3, iF, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f2189c;
            g.b0(objArr2, objArr, 0, this.f2188b, objArr2.length);
            Object[] objArr3 = this.f2189c;
            g.b0(objArr3, objArr, objArr3.length - this.f2188b, 0, iF);
        }
        int i4 = this.d;
        if (i4 < objArr.length) {
            objArr[i4] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        x0.g.e("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        g();
        b(collection.size() + this.d);
        a(f(this.f2188b + this.d), collection);
        return true;
    }
}
