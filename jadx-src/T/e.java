package t;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* loaded from: classes.dex */
public final class e extends K.c {
    public static final Parcelable.Creator<e> CREATOR = new K.b(2);

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f2644c;

    public e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i2 = parcel.readInt();
        int[] iArr = new int[i2];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.f2644c = new SparseArray(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            this.f2644c.append(iArr[i3], parcelableArray[i3]);
        }
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.f2644c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr[i3] = this.f2644c.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.f2644c.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}
