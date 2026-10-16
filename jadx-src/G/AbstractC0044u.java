package G;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;

/* renamed from: G.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0044u {
    public static AccessibilityNodeInfo.AccessibilityAction a() {
        return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
    }

    public static float b(VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static void c(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
        accessibilityNodeInfo.getBoundsInWindow(rect);
    }

    public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getContainerTitle();
    }

    public static int e(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMaximumFlingVelocity(i2, i3, i4);
    }

    public static int f(ViewConfiguration viewConfiguration, int i2, int i3, int i4) {
        return viewConfiguration.getScaledMinimumFlingVelocity(i2, i3, i4);
    }

    public static boolean g(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isAccessibilityDataSensitive();
    }

    public static void h(TextView textView, int i2, float f2) {
        textView.setLineHeight(i2, f2);
    }
}
