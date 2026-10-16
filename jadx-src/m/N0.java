package m;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class N0 extends I0 implements J0 {

    /* renamed from: D, reason: collision with root package name */
    public static final Method f2269D;

    /* renamed from: C, reason: collision with root package name */
    public X.i f2270C;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2269D = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // m.J0
    public final void e(l.n nVar, l.p pVar) {
        X.i iVar = this.f2270C;
        if (iVar != null) {
            iVar.e(nVar, pVar);
        }
    }

    @Override // m.I0
    public final C0297v0 p(Context context, boolean z2) {
        M0 m02 = new M0(context, z2);
        m02.setHoverListener(this);
        return m02;
    }

    @Override // m.J0
    public final void t(l.n nVar, l.p pVar) {
        X.i iVar = this.f2270C;
        if (iVar != null) {
            iVar.t(nVar, pVar);
        }
    }
}
