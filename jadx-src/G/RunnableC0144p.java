package g;

import G.O;
import android.view.ViewGroup;

/* renamed from: g.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0144p implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1675b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LayoutInflaterFactory2C0118A f1676c;

    public /* synthetic */ RunnableC0144p(LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A, int i2) {
        this.f1675b = i2;
        this.f1676c = layoutInflaterFactory2C0118A;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        switch (this.f1675b) {
            case 0:
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A = this.f1676c;
                if ((layoutInflaterFactory2C0118A.f1551Z & 1) != 0) {
                    layoutInflaterFactory2C0118A.u(0);
                }
                if ((layoutInflaterFactory2C0118A.f1551Z & 4096) != 0) {
                    layoutInflaterFactory2C0118A.u(108);
                }
                layoutInflaterFactory2C0118A.f1550Y = false;
                layoutInflaterFactory2C0118A.f1551Z = 0;
                break;
            default:
                LayoutInflaterFactory2C0118A layoutInflaterFactory2C0118A2 = this.f1676c;
                layoutInflaterFactory2C0118A2.f1571w.showAtLocation(layoutInflaterFactory2C0118A2.f1570v, 55, 0, 0);
                O o2 = layoutInflaterFactory2C0118A2.f1572y;
                if (o2 != null) {
                    o2.b();
                }
                if (!(layoutInflaterFactory2C0118A2.f1573z && (viewGroup = layoutInflaterFactory2C0118A2.f1526A) != null && viewGroup.isLaidOut())) {
                    layoutInflaterFactory2C0118A2.f1570v.setAlpha(1.0f);
                    layoutInflaterFactory2C0118A2.f1570v.setVisibility(0);
                    break;
                } else {
                    layoutInflaterFactory2C0118A2.f1570v.setAlpha(0.0f);
                    O oA = G.K.a(layoutInflaterFactory2C0118A2.f1570v);
                    oA.a(1.0f);
                    layoutInflaterFactory2C0118A2.f1572y = oA;
                    oA.d(new C0146r(0, this));
                    break;
                }
                break;
        }
    }
}
