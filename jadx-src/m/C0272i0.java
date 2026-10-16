package m;

import android.text.StaticLayout;
import android.widget.TextView;

/* renamed from: m.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272i0 extends C0270h0 {
    @Override // m.C0270h0, m.AbstractC0274j0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // m.AbstractC0274j0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
