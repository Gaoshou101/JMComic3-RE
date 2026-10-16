package N0;

import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final String f474a;

    /* renamed from: b, reason: collision with root package name */
    public final L f475b;

    public F(String str) {
        str.getClass();
        this.f474a = str;
        this.f475b = null;
    }

    public static int c(L l2) {
        switch (l2.f490b) {
            case 1:
                return l2.d.length() + 1;
            case 2:
            default:
                return l2.a().length();
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                return l2.a().length() + 1;
            case 4:
            case 5:
                return 1;
            case 6:
                return l2.a().length() + 1;
            case 7:
                return l2.a().length() + 1;
            case 8:
                int length = 1;
                for (int i2 = 0; i2 < l2.f493f.size(); i2++) {
                    int iC = c((L) l2.f493f.get(i2));
                    length += String.valueOf(iC).length() + 1 + iC;
                }
                return length;
        }
    }

    public static void e(StringBuilder sb, L l2) {
        switch (l2.f490b) {
            case 1:
                sb.append('s');
                sb.append(l2.d);
                break;
            case 2:
            default:
                sb.append(l2.a());
                break;
            case WebSettingsBoundaryInterface.AttributionBehavior.APP_SOURCE_AND_APP_TRIGGER /* 3 */:
                sb.append('n');
                sb.append(l2.a());
                break;
            case 4:
                sb.append(l2.a().charAt(0));
                break;
            case 5:
                sb.append('N');
                break;
            case 6:
                sb.append('A');
                sb.append(l2.a());
                break;
            case 7:
                sb.append('S');
                sb.append(l2.a());
                break;
            case 8:
                sb.append('M');
                for (int i2 = 0; i2 < l2.f493f.size(); i2++) {
                    L l3 = (L) l2.f493f.get(i2);
                    sb.append(String.valueOf(c(l3)));
                    sb.append(' ');
                    e(sb, l3);
                }
                break;
        }
    }

    public final void a(StringBuilder sb) {
        L l2 = this.f475b;
        int i2 = l2.f490b;
        if (i2 == 5) {
            sb.append("null");
            return;
        }
        if (i2 == 6) {
            sb.append("cordova.require('cordova/base64').toArrayBuffer('");
            sb.append(l2.a());
            sb.append("')");
            return;
        }
        if (i2 == 7) {
            sb.append("atob('");
            sb.append(l2.a());
            sb.append("')");
        } else {
            if (i2 != 8) {
                sb.append(l2.a());
                return;
            }
            int size = l2.f493f.size();
            for (int i3 = 0; i3 < size; i3++) {
                new F((L) l2.f493f.get(i3), this.f474a).a(sb);
                if (i3 < size - 1) {
                    sb.append(",");
                }
            }
        }
    }

    public final int b() {
        String str = this.f474a;
        L l2 = this.f475b;
        if (l2 == null) {
            return str.length() + 1;
        }
        return c(l2) + str.length() + String.valueOf(l2.f489a).length() + 3 + 1;
    }

    public final void d(StringBuilder sb) {
        String str = this.f474a;
        L l2 = this.f475b;
        if (l2 == null) {
            sb.append(str);
            return;
        }
        int i2 = l2.f489a;
        boolean z2 = true;
        if (i2 != 1 && i2 != 0) {
            z2 = false;
        }
        sb.append("cordova.callbackFromNative('");
        sb.append(str);
        sb.append("',");
        sb.append(z2);
        sb.append(",");
        sb.append(i2);
        sb.append(",[");
        a(sb);
        sb.append("],");
        sb.append(l2.f491c);
        sb.append(");");
    }

    public F(L l2, String str) {
        if (str != null && l2 != null) {
            this.f474a = str;
            this.f475b = l2;
            return;
        }
        throw null;
    }
}
