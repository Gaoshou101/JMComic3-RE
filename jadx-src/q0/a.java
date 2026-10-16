package q0;

import java.io.Serializable;
import l0.d;
import x0.g;

/* loaded from: classes.dex */
public final class a extends d implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public final Enum[] f2609b;

    public a(Enum[] enumArr) {
        this.f2609b = enumArr;
    }

    @Override // l0.d
    public final int a() {
        return this.f2609b.length;
    }

    @Override // l0.d, java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r5 = (Enum) obj;
        g.e("element", r5);
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f2609b;
        g.e("<this>", enumArr);
        return ((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        Enum[] enumArr = this.f2609b;
        int length = enumArr.length;
        if (i2 >= 0 && i2 < length) {
            return enumArr[i2];
        }
        throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + length);
    }

    @Override // l0.d, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r5 = (Enum) obj;
        g.e("element", r5);
        int iOrdinal = r5.ordinal();
        Enum[] enumArr = this.f2609b;
        g.e("<this>", enumArr);
        if (((iOrdinal < 0 || iOrdinal >= enumArr.length) ? null : enumArr[iOrdinal]) == r5) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // l0.d, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r2 = (Enum) obj;
        g.e("element", r2);
        return indexOf(r2);
    }
}
