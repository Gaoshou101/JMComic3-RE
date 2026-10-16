package m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f1 extends K.c {
    public static final Parcelable.Creator<f1> CREATOR = new K.b(1);

    /* renamed from: c, reason: collision with root package name */
    public int f2348c;
    public boolean d;

    public f1(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f2348c = parcel.readInt();
        this.d = parcel.readInt() != 0;
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f2348c);
        parcel.writeInt(this.d ? 1 : 0);
    }
}
