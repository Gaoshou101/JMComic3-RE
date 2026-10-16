package m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import l.C0239a;

/* loaded from: classes.dex */
public final class g1 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final C0239a f2351a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h1 f2352b;

    public g1(h1 h1Var) {
        this.f2352b = h1Var;
        Context context = h1Var.f2354a.getContext();
        CharSequence charSequence = h1Var.h;
        C0239a c0239a = new C0239a();
        c0239a.f2053e = 4096;
        c0239a.f2055g = 4096;
        c0239a.f2059l = null;
        c0239a.f2060m = null;
        c0239a.f2061n = false;
        c0239a.f2062o = false;
        c0239a.f2063p = 16;
        c0239a.f2056i = context;
        c0239a.f2050a = charSequence;
        this.f2351a = c0239a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        h1 h1Var = this.f2352b;
        Window.Callback callback = h1Var.f2362k;
        if (callback == null || !h1Var.f2363l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f2351a);
    }
}
