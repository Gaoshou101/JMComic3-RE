package K;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: a, reason: collision with root package name */
    public final Parcelable f369a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f368b = new a();
    public static final Parcelable.Creator<c> CREATOR = new b(0);

    public c() {
        this.f369a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f369a, i2);
    }

    public c(Parcelable parcelable) {
        if (parcelable != null) {
            this.f369a = parcelable == f368b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f369a = parcelable == null ? f368b : parcelable;
    }
}
