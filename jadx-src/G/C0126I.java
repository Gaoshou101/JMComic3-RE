package g;

import a.AbstractC0062a;
import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;

/* renamed from: g.I, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126I extends AbstractC0062a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1590c;
    public final /* synthetic */ C0128K d;

    public /* synthetic */ C0126I(C0128K c0128k, int i2) {
        this.f1590c = i2;
        this.d = c0128k;
    }

    @Override // G.P
    public final void a() {
        View view;
        C0128K c0128k = this.d;
        switch (this.f1590c) {
            case 0:
                if (c0128k.f1597A && (view = c0128k.f1613s) != null) {
                    view.setTranslationY(0.0f);
                    c0128k.f1610p.setTranslationY(0.0f);
                }
                c0128k.f1610p.setVisibility(8);
                c0128k.f1610p.setTransitioning(false);
                c0128k.f1601E = null;
                D.c cVar = c0128k.f1617w;
                if (cVar != null) {
                    cVar.c(c0128k.f1616v);
                    c0128k.f1616v = null;
                    c0128k.f1617w = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c0128k.f1609o;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = G.K.f146a;
                    G.B.c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c0128k.f1601E = null;
                c0128k.f1610p.requestLayout();
                break;
        }
    }
}
