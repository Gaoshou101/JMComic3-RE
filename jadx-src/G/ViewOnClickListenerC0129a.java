package g;

import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import k.AbstractC0225a;
import m.c1;

/* renamed from: g.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC0129a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1620a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1621b;

    public /* synthetic */ ViewOnClickListenerC0129a(int i2, Object obj) {
        this.f1620a = i2;
        this.f1621b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1620a) {
            case 0:
                C0134f c0134f = (C0134f) this.f1621b;
                Button button = c0134f.f1637f;
                c0134f.f1652v.obtainMessage(1, c0134f.f1634b).sendToTarget();
                break;
            case 1:
                ((AbstractC0225a) this.f1621b).a();
                break;
            default:
                c1 c1Var = ((Toolbar) this.f1621b).f1000L;
                l.p pVar = c1Var == null ? null : c1Var.f2337b;
                if (pVar != null) {
                    pVar.collapseActionView();
                    break;
                }
                break;
        }
    }
}
