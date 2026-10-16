package c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: c.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0093i implements Parcelable {
    public static final Parcelable.Creator<C0093i> CREATOR = new J.h(8);

    /* renamed from: a, reason: collision with root package name */
    public final IntentSender f1344a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f1345b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1346c;
    public final int d;

    public C0093i(IntentSender intentSender, Intent intent, int i2, int i3) {
        this.f1344a = intentSender;
        this.f1345b = intent;
        this.f1346c = i2;
        this.d = i3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        x0.g.e("dest", parcel);
        parcel.writeParcelable(this.f1344a, i2);
        parcel.writeParcelable(this.f1345b, i2);
        parcel.writeInt(this.f1346c);
        parcel.writeInt(this.d);
    }
}
