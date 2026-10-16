package m;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public final class Q extends View.BaseSavedState {
    public static final Parcelable.Creator<Q> CREATOR = new J.h(9);

    /* renamed from: a, reason: collision with root package name */
    public boolean f2279a;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeByte(this.f2279a ? (byte) 1 : (byte) 0);
    }
}
