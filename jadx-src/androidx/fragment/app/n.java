package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable {
    public static final Parcelable.Creator<n> CREATOR = new J.h(4);

    /* renamed from: a, reason: collision with root package name */
    public String f1202a;

    /* renamed from: b, reason: collision with root package name */
    public int f1203b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1202a);
        parcel.writeInt(this.f1203b);
    }
}
