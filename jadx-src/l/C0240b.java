package l;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.AbstractViewOnTouchListenerC0303y0;
import m.C0267g;
import m.C0269h;
import m.C0273j;
import m.C0275k;

/* renamed from: l.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240b extends AbstractViewOnTouchListenerC0303y0 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f2064j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ View f2065k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f2065k = actionMenuItemView;
    }

    @Override // m.AbstractViewOnTouchListenerC0303y0
    public final D b() {
        C0267g c0267g;
        switch (this.f2064j) {
            case 0:
                AbstractC0241c abstractC0241c = ((ActionMenuItemView) this.f2065k).f890m;
                if (abstractC0241c == null || (c0267g = ((C0269h) abstractC0241c).f2353a.f2388t) == null) {
                    return null;
                }
                return c0267g.a();
            default:
                C0267g c0267g2 = ((C0273j) this.f2065k).d.f2387s;
                if (c0267g2 == null) {
                    return null;
                }
                return c0267g2.a();
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0303y0
    public final boolean c() {
        D dB;
        switch (this.f2064j) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f2065k;
                m mVar = actionMenuItemView.f888k;
                return mVar != null && mVar.b(actionMenuItemView.h) && (dB = b()) != null && dB.a();
            default:
                ((C0273j) this.f2065k).d.l();
                return true;
        }
    }

    @Override // m.AbstractViewOnTouchListenerC0303y0
    public boolean d() {
        switch (this.f2064j) {
            case 1:
                C0275k c0275k = ((C0273j) this.f2065k).d;
                if (c0275k.f2389u != null) {
                    return false;
                }
                c0275k.f();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0240b(C0273j c0273j, C0273j c0273j2) {
        super(c0273j2);
        this.f2065k = c0273j;
    }
}
