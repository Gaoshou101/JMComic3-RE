package K;

import android.os.Parcel;
import android.os.Parcelable;
import m.f1;
import t.e;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f367a;

    public /* synthetic */ b(int i2) {
        this.f367a = i2;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f367a) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return c.f368b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new f1(parcel, classLoader);
            default:
                return new e(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f367a) {
            case 0:
                return new c[i2];
            case 1:
                return new f1[i2];
            default:
                return new e[i2];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f367a) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return c.f368b;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new f1(parcel, null);
            default:
                return new e(parcel, null);
        }
    }
}
