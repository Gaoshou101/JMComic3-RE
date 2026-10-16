package I;

import G.C0029e;
import G.InterfaceC0028d;
import G.K;
import X.i;
import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.webkit.PermissionRequest;
import com.getcapacitor.InterfaceC0110o;
import m.C0298w;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements InterfaceC0110o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f269a;

    public /* synthetic */ d(Object obj) {
        this.f269a = obj;
    }

    @Override // com.getcapacitor.InterfaceC0110o
    public void a(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        PermissionRequest permissionRequest = (PermissionRequest) this.f269a;
        if (zBooleanValue) {
            permissionRequest.grant(permissionRequest.getResources());
        } else {
            permissionRequest.deny();
        }
    }

    public boolean b(i iVar, int i2, Bundle bundle) {
        InterfaceC0028d iVar2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 25 && (i2 & 1) != 0) {
            try {
                ((h) iVar.f715b).a();
                Parcelable parcelable = (Parcelable) ((h) iVar.f715b).c();
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e2) {
                Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e2);
                return false;
            }
        }
        ClipDescription description = ((h) iVar.f715b).getDescription();
        h hVar = (h) iVar.f715b;
        ClipData clipData = new ClipData(description, new ClipData.Item(hVar.d()));
        if (i3 >= 31) {
            iVar2 = new i(clipData, 2);
        } else {
            C0029e c0029e = new C0029e();
            c0029e.f181b = clipData;
            c0029e.f182c = 2;
            iVar2 = c0029e;
        }
        iVar2.s(hVar.b());
        iVar2.q(bundle);
        return K.f((C0298w) this.f269a, iVar2.f()) == null;
    }
}
