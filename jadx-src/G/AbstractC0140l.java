package g;

import android.app.LocaleManager;
import android.os.LocaleList;

/* renamed from: g.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0140l {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
