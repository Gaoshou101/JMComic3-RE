package A;

import android.content.pm.PackageInfo;
import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText;
import android.view.DisplayCutout;
import android.view.ViewConfiguration;
import android.widget.TextView;
import m.C0266f0;

/* loaded from: classes.dex */
public abstract class a {
    public static String[] a(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long b(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static int c(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static int d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int g(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static int h(ViewConfiguration viewConfiguration) {
        return viewConfiguration.getScaledHoverSlop();
    }

    public static PrecomputedText.Params i(C0266f0 c0266f0) {
        return c0266f0.getTextMetricsParams();
    }

    public static void j(TextView textView, int i2) {
        textView.setFirstBaselineToTopHeight(i2);
    }

    public static boolean k(ViewConfiguration viewConfiguration) {
        return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
    }
}
