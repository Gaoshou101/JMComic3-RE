package androidx.core.app;

import V.a;
import V.b;
import V.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVarG = remoteActionCompat.f1051a;
        if (aVar.e(1)) {
            cVarG = aVar.g();
        }
        remoteActionCompat.f1051a = (IconCompat) cVarG;
        CharSequence charSequence = remoteActionCompat.f1052b;
        if (aVar.e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f696e);
        }
        remoteActionCompat.f1052b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1053c;
        if (aVar.e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) aVar).f696e);
        }
        remoteActionCompat.f1053c = charSequence2;
        remoteActionCompat.d = (PendingIntent) aVar.f(remoteActionCompat.d, 4);
        boolean z2 = remoteActionCompat.f1054e;
        if (aVar.e(5)) {
            z2 = ((b) aVar).f696e.readInt() != 0;
        }
        remoteActionCompat.f1054e = z2;
        boolean z3 = remoteActionCompat.f1055f;
        if (aVar.e(6)) {
            z3 = ((b) aVar).f696e.readInt() != 0;
        }
        remoteActionCompat.f1055f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        aVar.getClass();
        IconCompat iconCompat = remoteActionCompat.f1051a;
        aVar.h(1);
        aVar.i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1052b;
        aVar.h(2);
        Parcel parcel = ((b) aVar).f696e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1053c;
        aVar.h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.d;
        aVar.h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1054e;
        aVar.h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1055f;
        aVar.h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
