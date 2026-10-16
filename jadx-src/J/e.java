package J;

import G.C0026b;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public final class e extends C0026b {
    @Override // G.C0026b
    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        super.a(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
    }

    @Override // G.C0026b
    public final void b(View view, H.e eVar) {
        int scrollRange;
        View.AccessibilityDelegate accessibilityDelegate = this.f175a;
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f223a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityNodeInfo.setClassName(ScrollView.class.getName());
        if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
            return;
        }
        accessibilityNodeInfo.setScrollable(true);
        if (nestedScrollView.getScrollY() > 0) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) H.d.d.f220a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) H.d.f218e.f220a);
        }
        if (nestedScrollView.getScrollY() < scrollRange) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) H.d.f217c.f220a);
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) H.d.f219f.f220a);
        }
    }

    @Override // G.C0026b
    public final boolean c(View view, int i2, Bundle bundle) {
        if (super.c(view, i2, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i2 != 4096) {
            if (i2 == 8192 || i2 == 16908344) {
                int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (iMax == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), true);
                return true;
            }
            if (i2 != 16908346) {
                return false;
            }
        }
        int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (iMin == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.v(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), true);
        return true;
    }
}
