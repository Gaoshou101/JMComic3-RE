package g;

import android.os.PowerManager;
import java.util.Locale;

/* renamed from: g.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0147s {
    public static boolean a(PowerManager powerManager) {
        return powerManager.isPowerSaveMode();
    }

    public static String b(Locale locale) {
        return locale.toLanguageTag();
    }
}
