package androidx.versionedparcelable;

import J.h;
import V.b;
import V.c;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final c f1325a;

    public ParcelImpl(Parcel parcel) {
        this.f1325a = new b(parcel).g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        new b(parcel).i(this.f1325a);
    }
}
