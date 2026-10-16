package G;

import android.view.View;
import android.view.ViewGroup;
import com.getcapacitor.CapacitorWebView;

/* renamed from: G.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0032h implements InterfaceC0042s {
    @Override // G.InterfaceC0042s
    public e0 h(View view, e0 e0Var) {
        int i2 = CapacitorWebView.f1359c;
        z.c cVarF = e0Var.f186a.f(7);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = cVarF.f2749a;
        marginLayoutParams.bottomMargin = cVarF.d;
        marginLayoutParams.rightMargin = cVarF.f2751c;
        marginLayoutParams.topMargin = cVarF.f2750b;
        view.setLayoutParams(marginLayoutParams);
        return e0.f185b;
    }
}
