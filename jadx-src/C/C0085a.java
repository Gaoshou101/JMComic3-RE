package c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085a implements Parcelable {
    public static final Parcelable.Creator<C0085a> CREATOR = new J.h(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1331a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1332b;

    public C0085a(Intent intent, int i2) {
        this.f1331a = i2;
        this.f1332b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i2 = this.f1331a;
        sb.append(i2 != -1 ? i2 != 0 ? String.valueOf(i2) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f1332b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x0.g.e("dest", parcel);
        parcel.writeInt(this.f1331a);
        Intent intent = this.f1332b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i2);
        }
    }
}
