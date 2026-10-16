package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: m.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0274j0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) C0276k0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
