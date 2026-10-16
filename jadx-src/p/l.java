package p;

import java.util.Arrays;
import q.AbstractC0328a;

/* loaded from: classes.dex */
public final class l implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f2598a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f2599b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f2600c;

    public l() {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f2598a = new int[i5];
        this.f2599b = new Object[i5];
    }

    public final void a(int i2, Object obj) {
        int i3 = this.f2600c;
        if (i3 != 0 && i2 <= this.f2598a[i3 - 1]) {
            c(i2, obj);
            return;
        }
        if (i3 >= this.f2598a.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f2598a, i7);
            x0.g.d("copyOf(this, newSize)", iArrCopyOf);
            this.f2598a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2599b, i7);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2599b = objArrCopyOf;
        }
        this.f2598a[i3] = i2;
        this.f2599b[i3] = obj;
        this.f2600c = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        x0.g.c("null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>", objClone);
        l lVar = (l) objClone;
        lVar.f2598a = (int[]) this.f2598a.clone();
        lVar.f2599b = (Object[]) this.f2599b.clone();
        return lVar;
    }

    public final void c(int i2, Object obj) {
        int iA = AbstractC0328a.a(this.f2600c, i2, this.f2598a);
        if (iA >= 0) {
            this.f2599b[iA] = obj;
            return;
        }
        int i3 = ~iA;
        int i4 = this.f2600c;
        if (i3 < i4) {
            Object[] objArr = this.f2599b;
            if (objArr[i3] == i.f2590b) {
                this.f2598a[i3] = i2;
                objArr[i3] = obj;
                return;
            }
        }
        if (i4 >= this.f2598a.length) {
            int i5 = (i4 + 1) * 4;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f2598a, i8);
            x0.g.d("copyOf(this, newSize)", iArrCopyOf);
            this.f2598a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f2599b, i8);
            x0.g.d("copyOf(this, newSize)", objArrCopyOf);
            this.f2599b = objArrCopyOf;
        }
        int i9 = this.f2600c;
        if (i9 - i3 != 0) {
            int[] iArr = this.f2598a;
            int i10 = i3 + 1;
            l0.g.a0(i10, i3, i9, iArr, iArr);
            Object[] objArr2 = this.f2599b;
            l0.g.b0(objArr2, objArr2, i10, i3, this.f2600c);
        }
        this.f2598a[i3] = i2;
        this.f2599b[i3] = obj;
        this.f2600c++;
    }

    public final String toString() {
        int i2 = this.f2600c;
        if (i2 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i2 * 28);
        sb.append('{');
        int i3 = this.f2600c;
        for (int i4 = 0; i4 < i3; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            sb.append(this.f2598a[i4]);
            sb.append('=');
            Object obj = this.f2599b[i4];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        x0.g.d("buffer.toString()", string);
        return string;
    }
}
