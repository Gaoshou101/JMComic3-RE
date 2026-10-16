package p;

import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public class k {

    /* renamed from: b, reason: collision with root package name */
    public int[] f2596b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f2597c;
    public int d;

    public k(int i2) {
        this.f2596b = i2 == 0 ? AbstractC0328a.f2607a : new int[i2];
        this.f2597c = i2 == 0 ? AbstractC0328a.f2608b : new Object[i2 << 1];
    }

    public final int a(Object obj) {
        int i2 = this.d * 2;
        Object[] objArr = this.f2597c;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final int b(int i2, Object obj) {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iA = AbstractC0328a.a(i3, i2, this.f2596b);
        if (iA < 0 || x0.g.a(obj, this.f2597c[iA << 1])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f2596b[i4] == i2) {
            if (x0.g.a(obj, this.f2597c[i4 << 1])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f2596b[i5] == i2; i5--) {
            if (x0.g.a(obj, this.f2597c[i5 << 1])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int c(Object obj) {
        return obj == null ? d() : b(obj.hashCode(), obj);
    }

    public final void clear() {
        if (this.d > 0) {
            this.f2596b = AbstractC0328a.f2607a;
            this.f2597c = AbstractC0328a.f2608b;
            this.d = 0;
        }
        if (this.d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return c(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return a(obj) >= 0;
    }

    public final int d() {
        int i2 = this.d;
        if (i2 == 0) {
            return -1;
        }
        int iA = AbstractC0328a.a(i2, 0, this.f2596b);
        if (iA < 0 || this.f2597c[iA << 1] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f2596b[i3] == 0) {
            if (this.f2597c[i3 << 1] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f2596b[i4] == 0; i4--) {
            if (this.f2597c[i4 << 1] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    public final Object e(int i2) {
        if (i2 >= 0 && i2 < this.d) {
            return this.f2597c[i2 << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (obj instanceof k) {
                int i2 = this.d;
                if (i2 != ((k) obj).d) {
                    return false;
                }
                k kVar = (k) obj;
                for (int i3 = 0; i3 < i2; i3++) {
                    Object objE = e(i3);
                    Object objH = h(i3);
                    Object obj2 = kVar.get(objE);
                    if (objH == null) {
                        if (obj2 != null || !kVar.containsKey(objE)) {
                            return false;
                        }
                    } else if (!objH.equals(obj2)) {
                        return false;
                    }
                }
                return true;
            }
            if (!(obj instanceof Map) || this.d != ((Map) obj).size()) {
                return false;
            }
            int i4 = this.d;
            for (int i5 = 0; i5 < i4; i5++) {
                Object objE2 = e(i5);
                Object objH2 = h(i5);
                Object obj3 = ((Map) obj).get(objE2);
                if (objH2 == null) {
                    if (obj3 != null || !((Map) obj).containsKey(objE2)) {
                        return false;
                    }
                } else if (!objH2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
        }
        return false;
    }

    public final Object f(int i2) {
        int i3;
        if (i2 < 0 || i2 >= (i3 = this.d)) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        Object[] objArr = this.f2597c;
        int i4 = i2 << 1;
        Object obj = objArr[i4 + 1];
        if (i3 <= 1) {
            clear();
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f2596b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i2 < i5) {
                    int i6 = i2 + 1;
                    l0.g.a0(i2, i6, i3, iArr, iArr);
                    Object[] objArr2 = this.f2597c;
                    l0.g.b0(objArr2, objArr2, i4, i6 << 1, i3 << 1);
                }
                Object[] objArr3 = this.f2597c;
                int i7 = i5 << 1;
                objArr3[i7] = null;
                objArr3[i7 + 1] = null;
            } else {
                int i8 = i3 > 8 ? i3 + (i3 >> 1) : 8;
                int[] iArrCopyOf = Arrays.copyOf(iArr, i8);
                x0.g.d("copyOf(this, newSize)", iArrCopyOf);
                this.f2596b = iArrCopyOf;
                Object[] objArrCopyOf = Arrays.copyOf(this.f2597c, i8 << 1);
                x0.g.d("copyOf(this, newSize)", objArrCopyOf);
                this.f2597c = objArrCopyOf;
                if (i3 != this.d) {
                    throw new ConcurrentModificationException();
                }
                if (i2 > 0) {
                    l0.g.a0(0, 0, i2, iArr, this.f2596b);
                    l0.g.b0(objArr, this.f2597c, 0, 0, i4);
                }
                if (i2 < i5) {
                    int i9 = i2 + 1;
                    l0.g.a0(i2, i9, i3, iArr, this.f2596b);
                    l0.g.b0(objArr, this.f2597c, i4, i9 << 1, i3 << 1);
                }
            }
            if (i3 != this.d) {
                throw new ConcurrentModificationException();
            }
            this.d = i5;
        }
        return obj;
    }

    public final Object g(int i2, Object obj) {
        if (i2 < 0 || i2 >= this.d) {
            throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
        }
        int i3 = (i2 << 1) + 1;
        Object[] objArr = this.f2597c;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    public Object get(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return this.f2597c[(iC << 1) + 1];
        }
        return null;
    }

    public final Object getOrDefault(Object obj, Object obj2) {
        int iC = c(obj);
        return iC >= 0 ? this.f2597c[(iC << 1) + 1] : obj2;
    }

    public final Object h(int i2) {
        if (i2 >= 0 && i2 < this.d) {
            return this.f2597c[(i2 << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i2).toString());
    }

    public final int hashCode() {
        int[] iArr = this.f2596b;
        Object[] objArr = this.f2597c;
        int i2 = this.d;
        int i3 = 1;
        int i4 = 0;
        int iHashCode = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            iHashCode += (obj != null ? obj.hashCode() : 0) ^ iArr[i4];
            i4++;
            i3 += 2;
        }
        return iHashCode;
    }

    public final boolean isEmpty() {
        return this.d <= 0;
    }

    public final Object put(Object obj, Object obj2) {
        int i2 = this.d;
        int iHashCode = obj != null ? obj.hashCode() : 0;
        int iB = obj != null ? b(iHashCode, obj) : d();
        if (iB >= 0) {
            int i3 = (iB << 1) + 1;
            Object[] objArr = this.f2597c;
            Object obj3 = objArr[i3];
            objArr[i3] = obj2;
            return obj3;
        }
        int i4 = ~iB;
        int[] iArr = this.f2596b;
        if (i2 >= iArr.length) {
            int i5 = 8;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 < 4) {
                i5 = 4;
            }
            int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
            x0.g.d("copyOf(this, newSize)", iArrCopyOf);
            this.f2596b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2597c, i5 << 1);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2597c = objArrCopyOf;
            if (i2 != this.d) {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr2 = this.f2596b;
            int i6 = i4 + 1;
            l0.g.a0(i6, i4, i2, iArr2, iArr2);
            Object[] objArr2 = this.f2597c;
            l0.g.b0(objArr2, objArr2, i6 << 1, i4 << 1, this.d << 1);
        }
        int i7 = this.d;
        if (i2 == i7) {
            int[] iArr3 = this.f2596b;
            if (i4 < iArr3.length) {
                iArr3[i4] = iHashCode;
                Object[] objArr3 = this.f2597c;
                int i8 = i4 << 1;
                objArr3[i8] = obj;
                objArr3[i8 + 1] = obj2;
                this.d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iC = c(obj);
        if (iC >= 0) {
            return f(iC);
        }
        return null;
    }

    public final Object replace(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC >= 0) {
            return g(iC, obj2);
        }
        return null;
    }

    public final int size() {
        return this.d;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i2 = this.d;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object objE = e(i3);
            if (objE != sb) {
                sb.append(objE);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objH = h(i3);
            if (objH != sb) {
                sb.append(objH);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x0.g.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }

    public final boolean remove(Object obj, Object obj2) {
        int iC = c(obj);
        if (iC < 0 || !x0.g.a(obj2, h(iC))) {
            return false;
        }
        f(iC);
        return true;
    }

    public final boolean replace(Object obj, Object obj2, Object obj3) {
        int iC = c(obj);
        if (iC < 0 || !x0.g.a(obj2, h(iC))) {
            return false;
        }
        g(iC, obj3);
        return true;
    }
}
