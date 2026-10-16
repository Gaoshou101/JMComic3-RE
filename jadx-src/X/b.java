package X;

import android.os.Build;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public class b extends c {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i2, String str, String str2) {
        super(str, str2);
        this.d = i2;
    }

    @Override // X.c
    public final boolean a() {
        switch (this.d) {
            case 0:
                return true;
            case 1:
                return Build.VERSION.SDK_INT >= 24;
            case 2:
                return false;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Build.VERSION.SDK_INT >= 26;
            case 4:
                return Build.VERSION.SDK_INT >= 27;
            case 5:
                return Build.VERSION.SDK_INT >= 28;
            default:
                return Build.VERSION.SDK_INT >= 29;
        }
    }
}
