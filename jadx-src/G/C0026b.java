package G;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: G.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0026b {

    /* renamed from: c, reason: collision with root package name */
    public static final View.AccessibilityDelegate f174c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f175a;

    /* renamed from: b, reason: collision with root package name */
    public final C0025a f176b;

    public C0026b() {
        this(f174c);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.f175a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void b(View view, H.e eVar) {
        this.f175a.onInitializeAccessibilityNodeInfo(view, eVar.f223a);
    }

    public boolean c(View view, int i2, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List listEmptyList = (List) view.getTag(R.id.tag_accessibility_actions);
        if (listEmptyList == null) {
            listEmptyList = Collections.emptyList();
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < listEmptyList.size() && ((AccessibilityNodeInfo.AccessibilityAction) ((H.d) listEmptyList.get(i3)).f220a).getId() != i2; i3++) {
        }
        boolean zPerformAccessibilityAction = this.f175a.performAccessibilityAction(view, i2, bundle);
        if (zPerformAccessibilityAction || i2 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i4)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i5 = 0;
            while (true) {
                if (clickableSpanArr == null || i5 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i5])) {
                    clickableSpan.onClick(view);
                    z2 = true;
                    break;
                }
                i5++;
            }
        }
        return z2;
    }

    public C0026b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f175a = accessibilityDelegate;
        this.f176b = new C0025a(this);
    }
}
