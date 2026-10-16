package C;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: b, reason: collision with root package name */
    public static final f f7b = a(new Locale[0]);

    /* renamed from: a, reason: collision with root package name */
    public final h f8a;

    public f(h hVar) {
        this.f8a = hVar;
    }

    public static f a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new f(new j(e.a(localeArr))) : new f(new g(localeArr));
    }

    public static f b(String str) {
        if (str == null || str.isEmpty()) {
            return f7b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str2 = strArrSplit[i2];
            int i3 = d.f6a;
            localeArr[i2] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f) {
            if (this.f8a.equals(((f) obj).f8a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8a.hashCode();
    }

    public final String toString() {
        return this.f8a.toString();
    }
}
