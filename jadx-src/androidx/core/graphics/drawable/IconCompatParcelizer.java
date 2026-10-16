package androidx.core.graphics.drawable;

import V.a;
import V.b;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        IconCompat iconCompat = new IconCompat();
        int i2 = iconCompat.f1062a;
        if (aVar.e(1)) {
            i2 = ((b) aVar).f696e.readInt();
        }
        iconCompat.f1062a = i2;
        byte[] bArr = iconCompat.f1064c;
        if (aVar.e(2)) {
            Parcel parcel = ((b) aVar).f696e;
            int i3 = parcel.readInt();
            if (i3 < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[i3];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1064c = bArr;
        iconCompat.d = aVar.f(iconCompat.d, 3);
        int i4 = iconCompat.f1065e;
        if (aVar.e(4)) {
            i4 = ((b) aVar).f696e.readInt();
        }
        iconCompat.f1065e = i4;
        int i5 = iconCompat.f1066f;
        if (aVar.e(5)) {
            i5 = ((b) aVar).f696e.readInt();
        }
        iconCompat.f1066f = i5;
        iconCompat.f1067g = (ColorStateList) aVar.f(iconCompat.f1067g, 6);
        String string = iconCompat.f1068i;
        if (aVar.e(7)) {
            string = ((b) aVar).f696e.readString();
        }
        iconCompat.f1068i = string;
        String string2 = iconCompat.f1069j;
        if (aVar.e(8)) {
            string2 = ((b) aVar).f696e.readString();
        }
        iconCompat.f1069j = string2;
        iconCompat.h = PorterDuff.Mode.valueOf(iconCompat.f1068i);
        switch (iconCompat.f1062a) {
            case -1:
                Parcelable parcelable = iconCompat.d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1063b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.d;
                if (parcelable2 != null) {
                    iconCompat.f1063b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1064c;
                    iconCompat.f1063b = bArr3;
                    iconCompat.f1062a = 3;
                    iconCompat.f1065e = 0;
                    iconCompat.f1066f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str = new String(iconCompat.f1064c, Charset.forName("UTF-16"));
                iconCompat.f1063b = str;
                if (iconCompat.f1062a == 2 && iconCompat.f1069j == null) {
                    iconCompat.f1069j = str.split(":", -1)[0];
                }
                return iconCompat;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                iconCompat.f1063b = iconCompat.f1064c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        aVar.getClass();
        iconCompat.f1068i = iconCompat.h.name();
        switch (iconCompat.f1062a) {
            case -1:
                iconCompat.d = (Parcelable) iconCompat.f1063b;
                break;
            case 1:
            case 5:
                iconCompat.d = (Parcelable) iconCompat.f1063b;
                break;
            case 2:
                iconCompat.f1064c = ((String) iconCompat.f1063b).getBytes(Charset.forName("UTF-16"));
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                iconCompat.f1064c = (byte[]) iconCompat.f1063b;
                break;
            case 4:
            case 6:
                iconCompat.f1064c = iconCompat.f1063b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i2 = iconCompat.f1062a;
        if (-1 != i2) {
            aVar.h(1);
            ((b) aVar).f696e.writeInt(i2);
        }
        byte[] bArr = iconCompat.f1064c;
        if (bArr != null) {
            aVar.h(2);
            int length = bArr.length;
            Parcel parcel = ((b) aVar).f696e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.d;
        if (parcelable != null) {
            aVar.h(3);
            ((b) aVar).f696e.writeParcelable(parcelable, 0);
        }
        int i3 = iconCompat.f1065e;
        if (i3 != 0) {
            aVar.h(4);
            ((b) aVar).f696e.writeInt(i3);
        }
        int i4 = iconCompat.f1066f;
        if (i4 != 0) {
            aVar.h(5);
            ((b) aVar).f696e.writeInt(i4);
        }
        ColorStateList colorStateList = iconCompat.f1067g;
        if (colorStateList != null) {
            aVar.h(6);
            ((b) aVar).f696e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1068i;
        if (str != null) {
            aVar.h(7);
            ((b) aVar).f696e.writeString(str);
        }
        String str2 = iconCompat.f1069j;
        if (str2 != null) {
            aVar.h(8);
            ((b) aVar).f696e.writeString(str2);
        }
    }
}
