package l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import k.InterfaceC0226b;

/* loaded from: classes.dex */
public final class r extends FrameLayout implements InterfaceC0226b {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f2164a;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view) {
        super(view.getContext());
        this.f2164a = (CollapsibleActionView) view;
        addView(view);
    }
}
