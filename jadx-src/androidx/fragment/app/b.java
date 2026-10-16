package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new J.h(2);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1171a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1172b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f1173c;
    public final int[] d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1174e;

    /* renamed from: f, reason: collision with root package name */
    public final String f1175f;

    /* renamed from: g, reason: collision with root package name */
    public final int f1176g;
    public final int h;

    /* renamed from: i, reason: collision with root package name */
    public final CharSequence f1177i;

    /* renamed from: j, reason: collision with root package name */
    public final int f1178j;

    /* renamed from: k, reason: collision with root package name */
    public final CharSequence f1179k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f1180l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f1181m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f1182n;

    public b(a aVar) {
        int size = aVar.f1154a.size();
        this.f1171a = new int[size * 6];
        if (!aVar.f1159g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1172b = new ArrayList(size);
        this.f1173c = new int[size];
        this.d = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            u uVar = (u) aVar.f1154a.get(i3);
            this.f1171a[i2] = uVar.f1260a;
            this.f1172b.add(null);
            int[] iArr = this.f1171a;
            iArr[i2 + 1] = uVar.f1261b ? 1 : 0;
            iArr[i2 + 2] = uVar.f1262c;
            iArr[i2 + 3] = uVar.d;
            int i4 = i2 + 5;
            iArr[i2 + 4] = uVar.f1263e;
            i2 += 6;
            iArr[i4] = uVar.f1264f;
            this.f1173c[i3] = uVar.f1265g.ordinal();
            this.d[i3] = uVar.h.ordinal();
        }
        this.f1174e = aVar.f1158f;
        this.f1175f = aVar.h;
        this.f1176g = aVar.f1170s;
        this.h = aVar.f1160i;
        this.f1177i = aVar.f1161j;
        this.f1178j = aVar.f1162k;
        this.f1179k = aVar.f1163l;
        this.f1180l = aVar.f1164m;
        this.f1181m = aVar.f1165n;
        this.f1182n = aVar.f1166o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f1171a);
        parcel.writeStringList(this.f1172b);
        parcel.writeIntArray(this.f1173c);
        parcel.writeIntArray(this.d);
        parcel.writeInt(this.f1174e);
        parcel.writeString(this.f1175f);
        parcel.writeInt(this.f1176g);
        parcel.writeInt(this.h);
        TextUtils.writeToParcel(this.f1177i, parcel, 0);
        parcel.writeInt(this.f1178j);
        TextUtils.writeToParcel(this.f1179k, parcel, 0);
        parcel.writeStringList(this.f1180l);
        parcel.writeStringList(this.f1181m);
        parcel.writeInt(this.f1182n ? 1 : 0);
    }

    public b(Parcel parcel) {
        this.f1171a = parcel.createIntArray();
        this.f1172b = parcel.createStringArrayList();
        this.f1173c = parcel.createIntArray();
        this.d = parcel.createIntArray();
        this.f1174e = parcel.readInt();
        this.f1175f = parcel.readString();
        this.f1176g = parcel.readInt();
        this.h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1177i = (CharSequence) creator.createFromParcel(parcel);
        this.f1178j = parcel.readInt();
        this.f1179k = (CharSequence) creator.createFromParcel(parcel);
        this.f1180l = parcel.createStringArrayList();
        this.f1181m = parcel.createStringArrayList();
        this.f1182n = parcel.readInt() != 0;
    }
}
