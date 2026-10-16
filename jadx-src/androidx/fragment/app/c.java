package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new J.h(3);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1183a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1184b;

    public c(Parcel parcel) {
        this.f1183a = parcel.createStringArrayList();
        this.f1184b = parcel.createTypedArrayList(b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f1183a);
        parcel.writeTypedList(this.f1184b);
    }
}
