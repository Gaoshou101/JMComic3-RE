package H;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f214a;

    /* renamed from: b, reason: collision with root package name */
    public final e f215b;

    /* renamed from: c, reason: collision with root package name */
    public final int f216c;

    public a(int i2, e eVar, int i3) {
        this.f214a = i2;
        this.f215b = eVar;
        this.f216c = i3;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f214a);
        this.f215b.f223a.performAction(this.f216c, bundle);
    }
}
