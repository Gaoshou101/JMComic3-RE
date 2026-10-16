package V;

import android.os.Parcel;
import android.util.SparseIntArray;
import p.f;

/* loaded from: classes.dex */
public final class b extends a {
    public final SparseIntArray d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f696e;

    /* renamed from: f, reason: collision with root package name */
    public final int f697f;

    /* renamed from: g, reason: collision with root package name */
    public final int f698g;
    public final String h;

    /* renamed from: i, reason: collision with root package name */
    public int f699i;

    /* renamed from: j, reason: collision with root package name */
    public int f700j;

    /* renamed from: k, reason: collision with root package name */
    public int f701k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new f(0), new f(0), new f(0));
    }

    @Override // V.a
    public final b a() {
        Parcel parcel = this.f696e;
        int iDataPosition = parcel.dataPosition();
        int i2 = this.f700j;
        if (i2 == this.f697f) {
            i2 = this.f698g;
        }
        return new b(parcel, iDataPosition, i2, this.h + "  ", this.f693a, this.f694b, this.f695c);
    }

    @Override // V.a
    public final boolean e(int i2) {
        while (this.f700j < this.f698g) {
            int i3 = this.f701k;
            if (i3 == i2) {
                return true;
            }
            if (String.valueOf(i3).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            int i4 = this.f700j;
            Parcel parcel = this.f696e;
            parcel.setDataPosition(i4);
            int i5 = parcel.readInt();
            this.f701k = parcel.readInt();
            this.f700j += i5;
        }
        return this.f701k == i2;
    }

    @Override // V.a
    public final void h(int i2) {
        int i3 = this.f699i;
        SparseIntArray sparseIntArray = this.d;
        Parcel parcel = this.f696e;
        if (i3 >= 0) {
            int i4 = sparseIntArray.get(i3);
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(iDataPosition - i4);
            parcel.setDataPosition(iDataPosition);
        }
        this.f699i = i2;
        sparseIntArray.put(i2, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i2);
    }

    public b(Parcel parcel, int i2, int i3, String str, f fVar, f fVar2, f fVar3) {
        super(fVar, fVar2, fVar3);
        this.d = new SparseIntArray();
        this.f699i = -1;
        this.f701k = -1;
        this.f696e = parcel;
        this.f697f = i2;
        this.f698g = i3;
        this.f700j = i2;
        this.h = str;
    }
}
