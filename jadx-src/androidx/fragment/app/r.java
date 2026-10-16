package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class r implements Parcelable {
    public static final Parcelable.Creator<r> CREATOR = new J.h(5);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f1237a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f1238b;

    /* renamed from: c, reason: collision with root package name */
    public b[] f1239c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f1240e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f1241f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1242g;
    public ArrayList h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeStringList(this.f1237a);
        parcel.writeStringList(this.f1238b);
        parcel.writeTypedArray(this.f1239c, i2);
        parcel.writeInt(this.d);
        parcel.writeString(this.f1240e);
        parcel.writeStringList(this.f1241f);
        parcel.writeTypedList(this.f1242g);
        parcel.writeTypedList(this.h);
    }
}
