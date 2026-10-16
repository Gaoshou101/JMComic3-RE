package p;

import java.util.Arrays;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public final class h implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ boolean f2586a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ long[] f2587b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object[] f2588c;
    public /* synthetic */ int d;

    public h() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 80;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (80 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.f2587b = new long[i5];
        this.f2588c = new Object[i5];
    }

    public final void a(long j2, Long l2) {
        int i2 = this.d;
        if (i2 != 0 && j2 <= this.f2587b[i2 - 1]) {
            d(j2, l2);
            return;
        }
        if (this.f2586a) {
            long[] jArr = this.f2587b;
            if (i2 >= jArr.length) {
                Object[] objArr = this.f2588c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != i.f2589a) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.f2586a = false;
                this.d = i3;
            }
        }
        int i5 = this.d;
        if (i5 >= this.f2587b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f2587b, i9);
            x0.g.d("copyOf(this, newSize)", jArrCopyOf);
            this.f2587b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2588c, i9);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2588c = objArrCopyOf;
        }
        this.f2587b[i5] = j2;
        this.f2588c[i5] = l2;
        this.d = i5 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final h clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        x0.g.c("null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>", objClone);
        h hVar = (h) objClone;
        hVar.f2587b = (long[]) this.f2587b.clone();
        hVar.f2588c = (Object[]) this.f2588c.clone();
        return hVar;
    }

    public final Object c(long j2) {
        Object obj;
        int iB = AbstractC0328a.b(this.f2587b, this.d, j2);
        if (iB < 0 || (obj = this.f2588c[iB]) == i.f2589a) {
            return -1L;
        }
        return obj;
    }

    public final void d(long j2, Object obj) {
        int iB = AbstractC0328a.b(this.f2587b, this.d, j2);
        if (iB >= 0) {
            this.f2588c[iB] = obj;
            return;
        }
        int i2 = ~iB;
        int i3 = this.d;
        Object obj2 = i.f2589a;
        if (i2 < i3) {
            Object[] objArr = this.f2588c;
            if (objArr[i2] == obj2) {
                this.f2587b[i2] = j2;
                objArr[i2] = obj;
                return;
            }
        }
        if (this.f2586a) {
            long[] jArr = this.f2587b;
            if (i3 >= jArr.length) {
                Object[] objArr2 = this.f2588c;
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    Object obj3 = objArr2[i5];
                    if (obj3 != obj2) {
                        if (i5 != i4) {
                            jArr[i4] = jArr[i5];
                            objArr2[i4] = obj3;
                            objArr2[i5] = null;
                        }
                        i4++;
                    }
                }
                this.f2586a = false;
                this.d = i4;
                i2 = ~AbstractC0328a.b(this.f2587b, i4, j2);
            }
        }
        int i6 = this.d;
        if (i6 >= this.f2587b.length) {
            int i7 = (i6 + 1) * 8;
            int i8 = 4;
            while (true) {
                if (i8 >= 32) {
                    break;
                }
                int i9 = (1 << i8) - 12;
                if (i7 <= i9) {
                    i7 = i9;
                    break;
                }
                i8++;
            }
            int i10 = i7 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.f2587b, i10);
            x0.g.d("copyOf(this, newSize)", jArrCopyOf);
            this.f2587b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2588c, i10);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2588c = objArrCopyOf;
        }
        int i11 = this.d - i2;
        if (i11 != 0) {
            long[] jArr2 = this.f2587b;
            int i12 = i2 + 1;
            x0.g.e("<this>", jArr2);
            System.arraycopy(jArr2, i2, jArr2, i12, i11);
            Object[] objArr3 = this.f2588c;
            l0.g.b0(objArr3, objArr3, i12, i2, this.d);
        }
        this.f2587b[i2] = j2;
        this.f2588c[i2] = obj;
        this.d++;
    }

    public final String toString() {
        int i2;
        int i3;
        boolean z2 = this.f2586a;
        Object obj = i.f2589a;
        if (z2) {
            int i4 = this.d;
            long[] jArr = this.f2587b;
            Object[] objArr = this.f2588c;
            int i5 = 0;
            for (int i6 = 0; i6 < i4; i6++) {
                Object obj2 = objArr[i6];
                if (obj2 != obj) {
                    if (i6 != i5) {
                        jArr[i5] = jArr[i6];
                        objArr[i5] = obj2;
                        objArr[i6] = null;
                    }
                    i5++;
                }
            }
            this.f2586a = false;
            this.d = i5;
        }
        int i7 = this.d;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.d;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            if (i9 < 0 || i9 >= (i2 = this.d)) {
                throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i9).toString());
            }
            if (this.f2586a) {
                long[] jArr2 = this.f2587b;
                Object[] objArr2 = this.f2588c;
                int i10 = 0;
                for (int i11 = 0; i11 < i2; i11++) {
                    Object obj3 = objArr2[i11];
                    if (obj3 != obj) {
                        if (i11 != i10) {
                            jArr2[i10] = jArr2[i11];
                            objArr2[i10] = obj3;
                            objArr2[i11] = null;
                        }
                        i10++;
                    }
                }
                this.f2586a = false;
                this.d = i10;
            }
            sb.append(this.f2587b[i9]);
            sb.append('=');
            if (i9 < 0 || i9 >= (i3 = this.d)) {
                throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + i9).toString());
            }
            if (this.f2586a) {
                long[] jArr3 = this.f2587b;
                Object[] objArr3 = this.f2588c;
                int i12 = 0;
                for (int i13 = 0; i13 < i3; i13++) {
                    Object obj4 = objArr3[i13];
                    if (obj4 != obj) {
                        if (i13 != i12) {
                            jArr3[i12] = jArr3[i13];
                            objArr3[i12] = obj4;
                            objArr3[i13] = null;
                        }
                        i12++;
                    }
                }
                this.f2586a = false;
                this.d = i12;
            }
            Object obj5 = this.f2588c[i9];
            if (obj5 != sb) {
                sb.append(obj5);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x0.g.d("StringBuilder(capacity).…builderAction).toString()", string);
        return string;
    }
}
