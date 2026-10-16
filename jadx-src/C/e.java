package C;

import android.icu.text.DecimalFormatSymbols;
import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class e {
    public static LocaleList a(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static DecimalFormatSymbols b(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }
}
