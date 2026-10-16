package g;

import android.content.res.Configuration;
import android.os.LocaleList;

/* renamed from: g.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0148t {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static C.f b(Configuration configuration) {
        return C.f.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(C.f fVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(fVar.f8a.b()));
    }

    public static void d(Configuration configuration, C.f fVar) {
        configuration.setLocales(LocaleList.forLanguageTags(fVar.f8a.b()));
    }
}
