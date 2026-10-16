package g;

import a.AbstractC0062a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* renamed from: g.r, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146r extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1679c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0146r(int i2, Object obj) {
        this.f1679c = i2;
        this.d = obj;
    }

    @Override // G.P
    public final void a() {
        Object obj = this.d;
        switch (this.f1679c) {
            case 0:
                RunnableC0144p runnableC0144p = (RunnableC0144p) obj;
                runnableC0144p.f1676c.f1570v.setAlpha(1.0f);
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = runnableC0144p.f1676c;
                layoutInflaterFactory2C0118A.f1572y.d(null);
                layoutInflaterFactory2C0118A.f1572y = null;
                break;
            case 1:
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A2 = (LayoutInflaterFactory2C0118A) obj;
                layoutInflaterFactory2C0118A2.f1570v.setAlpha(1.0f);
                layoutInflaterFactory2C0118A2.f1572y.d(null);
                layoutInflaterFactory2C0118A2.f1572y = null;
                break;
            default:
                D.c cVar = (D.c) obj;
                ((LayoutInflaterFactory2C0118A) cVar.f20c).f1570v.setVisibility(8);
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A3 = (LayoutInflaterFactory2C0118A) cVar.f20c;
                PopupWindow popupWindow = layoutInflaterFactory2C0118A3.f1571w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0118A3.f1570v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0118A3.f1570v.getParent();
                    WeakHashMap weakHashMap = G.K.f146a;
                    G.B.c(view);
                }
                layoutInflaterFactory2C0118A3.f1570v.e();
                layoutInflaterFactory2C0118A3.f1572y.d(null);
                layoutInflaterFactory2C0118A3.f1572y = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0118A3.f1526A;
                WeakHashMap weakHashMap2 = G.K.f146a;
                G.B.c(viewGroup);
                break;
        }
    }

    @Override // a.AbstractC0062a, G.P
    public void c() {
        Object obj = this.d;
        switch (this.f1679c) {
            case 0:
                ((RunnableC0144p) obj).f1676c.f1570v.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = (LayoutInflaterFactory2C0118A) obj;
                layoutInflaterFactory2C0118A.f1570v.setVisibility(0);
                if (layoutInflaterFactory2C0118A.f1570v.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0118A.f1570v.getParent();
                    WeakHashMap weakHashMap = G.K.f146a;
                    G.B.c(view);
                    break;
                }
                break;
        }
    }
}
