package C;

import android.os.Build;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class b {
    static {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            a.a(30);
        }
        if (i2 >= 30) {
            a.a(31);
        }
        if (i2 >= 30) {
            a.a(33);
        }
        if (i2 >= 30) {
            a.a(1000000);
        }
    }

    public static final boolean a() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 35) {
            if (i2 >= 34) {
                String str = Build.VERSION.CODENAME;
                x0.g.d("CODENAME", str);
                if (!"REL".equals(str)) {
                    Locale locale = Locale.ROOT;
                    String upperCase = str.toUpperCase(locale);
                    x0.g.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase);
                    String upperCase2 = "VanillaIceCream".toUpperCase(locale);
                    x0.g.d("this as java.lang.String).toUpperCase(Locale.ROOT)", upperCase2);
                    if (upperCase.compareTo(upperCase2) >= 0) {
                    }
                }
            }
            return false;
        }
        return true;
    }
}
