package D;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f28a;

    /* renamed from: b, reason: collision with root package name */
    public final String f29b;

    /* renamed from: c, reason: collision with root package name */
    public final String f30c;
    public final List d;

    /* renamed from: e, reason: collision with root package name */
    public final String f31e;

    public h(String str, String str2, String str3, List list) {
        str.getClass();
        this.f28a = str;
        str2.getClass();
        this.f29b = str2;
        this.f30c = str3;
        list.getClass();
        this.d = list;
        this.f31e = str + "-" + str2 + "-" + str3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f28a + ", mProviderPackage: " + this.f29b + ", mQuery: " + this.f30c + ", mCertificates:");
        int i2 = 0;
        while (true) {
            List list = this.d;
            if (i2 >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i2);
            for (int i3 = 0; i3 < list2.size(); i3++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i3), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i2++;
        }
    }
}
