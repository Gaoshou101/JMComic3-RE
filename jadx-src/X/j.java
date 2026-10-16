package X;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j extends c {
    public final Pattern d;

    public j() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.d = Pattern.compile("\\A\\d+");
    }

    @Override // X.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // X.c
    public final boolean b() {
        int i2;
        PackageInfo packageInfoC;
        boolean zB = super.b();
        if (!zB || (i2 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i3 = W.b.f705a;
        if (i2 >= 26) {
            packageInfoC = WebView.getCurrentWebViewPackage();
        } else {
            try {
                packageInfoC = W.b.c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoC = null;
            }
        }
        if (packageInfoC == null) {
            return false;
        }
        Matcher matcher = this.d.matcher(packageInfoC.versionName);
        return matcher.find() && Integer.parseInt(packageInfoC.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
