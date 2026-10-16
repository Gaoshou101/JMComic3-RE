package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t implements Parcelable {
    public static final Parcelable.Creator<t> CREATOR = new J.h(6);

    /* renamed from: a, reason: collision with root package name */
    public final String f1247a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1248b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f1249c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1250e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1251f;

    /* renamed from: g, reason: collision with root package name */
    public final String f1252g;
    public final boolean h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f1253i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f1254j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f1255k;

    /* renamed from: l, reason: collision with root package name */
    public final int f1256l;

    /* renamed from: m, reason: collision with root package name */
    public final String f1257m;

    /* renamed from: n, reason: collision with root package name */
    public final int f1258n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f1259o;

    public t(Parcel parcel) {
        this.f1247a = parcel.readString();
        this.f1248b = parcel.readString();
        this.f1249c = parcel.readInt() != 0;
        this.d = parcel.readInt() != 0;
        this.f1250e = parcel.readInt();
        this.f1251f = parcel.readInt();
        this.f1252g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.f1253i = parcel.readInt() != 0;
        this.f1254j = parcel.readInt() != 0;
        this.f1255k = parcel.readInt() != 0;
        this.f1256l = parcel.readInt();
        this.f1257m = parcel.readString();
        this.f1258n = parcel.readInt();
        this.f1259o = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1247a);
        sb.append(" (");
        sb.append(this.f1248b);
        sb.append(")}:");
        if (this.f1249c) {
            sb.append(" fromLayout");
        }
        if (this.d) {
            sb.append(" dynamicContainer");
        }
        int i2 = this.f1251f;
        if (i2 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i2));
        }
        String str = this.f1252g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.f1253i) {
            sb.append(" removing");
        }
        if (this.f1254j) {
            sb.append(" detached");
        }
        if (this.f1255k) {
            sb.append(" hidden");
        }
        String str2 = this.f1257m;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f1258n);
        }
        if (this.f1259o) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f1247a);
        parcel.writeString(this.f1248b);
        parcel.writeInt(this.f1249c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.f1250e);
        parcel.writeInt(this.f1251f);
        parcel.writeString(this.f1252g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.f1253i ? 1 : 0);
        parcel.writeInt(this.f1254j ? 1 : 0);
        parcel.writeInt(this.f1255k ? 1 : 0);
        parcel.writeInt(this.f1256l);
        parcel.writeString(this.f1257m);
        parcel.writeInt(this.f1258n);
        parcel.writeInt(this.f1259o ? 1 : 0);
    }
}
