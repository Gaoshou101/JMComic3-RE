package N0;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f524a = new HashMap(20);

    public final boolean a(String str, boolean z2) {
        String str2 = (String) this.f524a.get(str.toLowerCase(Locale.ENGLISH));
        return str2 != null ? Boolean.parseBoolean(str2) : z2;
    }

    public final String b(String str, String str2) {
        String str3 = (String) this.f524a.get(str.toLowerCase(Locale.ENGLISH));
        return str3 != null ? str3 : str2;
    }
}
