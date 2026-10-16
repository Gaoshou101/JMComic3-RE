package F0;

import n0.InterfaceC0314g;
import n0.InterfaceC0316i;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: F0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0012m implements w0.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f118b;

    public /* synthetic */ C0012m(int i2) {
        this.f118b = i2;
    }

    @Override // w0.p
    public final Object f(Object obj, Object obj2) {
        switch (this.f118b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
            case 1:
                return ((InterfaceC0316i) obj).e((InterfaceC0314g) obj2);
            case 2:
                return ((InterfaceC0316i) obj).e((InterfaceC0314g) obj2);
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 4:
                InterfaceC0314g interfaceC0314g = (InterfaceC0314g) obj2;
                if (!(interfaceC0314g instanceof Z)) {
                    return obj;
                }
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                int iIntValue = num != null ? num.intValue() : 1;
                return iIntValue == 0 ? interfaceC0314g : Integer.valueOf(iIntValue + 1);
            case 5:
                Z z2 = (Z) obj;
                InterfaceC0314g interfaceC0314g2 = (InterfaceC0314g) obj2;
                if (z2 != null) {
                    return z2;
                }
                if (interfaceC0314g2 instanceof Z) {
                    return (Z) interfaceC0314g2;
                }
                return null;
            default:
                return (K0.x) obj;
        }
    }
}
