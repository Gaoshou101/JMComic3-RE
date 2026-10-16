package J;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.n;
import androidx.fragment.app.r;
import androidx.fragment.app.t;
import androidx.versionedparcelable.ParcelImpl;
import c.C0085a;
import c.C0093i;
import java.util.ArrayList;
import m.Q;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f332a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f332a) {
            case 0:
                i iVar = new i(parcel);
                iVar.f333a = parcel.readInt();
                return iVar;
            case 1:
                return new ParcelImpl(parcel);
            case 2:
                return new androidx.fragment.app.b(parcel);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new androidx.fragment.app.c(parcel);
            case 4:
                n nVar = new n();
                nVar.f1202a = parcel.readString();
                nVar.f1203b = parcel.readInt();
                return nVar;
            case 5:
                r rVar = new r();
                rVar.f1240e = null;
                rVar.f1241f = new ArrayList();
                rVar.f1242g = new ArrayList();
                rVar.f1237a = parcel.createStringArrayList();
                rVar.f1238b = parcel.createStringArrayList();
                rVar.f1239c = (androidx.fragment.app.b[]) parcel.createTypedArray(androidx.fragment.app.b.CREATOR);
                rVar.d = parcel.readInt();
                rVar.f1240e = parcel.readString();
                rVar.f1241f = parcel.createStringArrayList();
                rVar.f1242g = parcel.createTypedArrayList(androidx.fragment.app.c.CREATOR);
                rVar.h = parcel.createTypedArrayList(n.CREATOR);
                return rVar;
            case 6:
                return new t(parcel);
            case 7:
                x0.g.e("parcel", parcel);
                return new C0085a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 8:
                x0.g.e("inParcel", parcel);
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                x0.g.b(parcelable);
                return new C0093i((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            default:
                Q q2 = new Q(parcel);
                q2.f2279a = parcel.readByte() != 0;
                return q2;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i2) {
        switch (this.f332a) {
            case 0:
                return new i[i2];
            case 1:
                return new ParcelImpl[i2];
            case 2:
                return new androidx.fragment.app.b[i2];
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return new androidx.fragment.app.c[i2];
            case 4:
                return new n[i2];
            case 5:
                return new r[i2];
            case 6:
                return new t[i2];
            case 7:
                return new C0085a[i2];
            case 8:
                return new C0093i[i2];
            default:
                return new Q[i2];
        }
    }
}
