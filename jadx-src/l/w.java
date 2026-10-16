package l;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class w implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x f2171a;

    public w(x xVar) {
        this.f2171a = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f2171a.c();
    }
}
