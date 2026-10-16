package C;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import c.C0085a;

/* loaded from: classes.dex */
public abstract class c {
    public static Object a(String str, Bundle bundle) {
        return bundle.getParcelable(str, C0085a.class);
    }

    public static String b(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static boolean c(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }
}
