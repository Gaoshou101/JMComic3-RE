package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.lifecycle.EnumC0080l;
import g.AbstractActivityC0137i;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements androidx.lifecycle.p {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f829b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f830c;

    public /* synthetic */ e(int i2, Object obj) {
        this.f829b = i2;
        this.f830c = obj;
    }

    @Override // androidx.lifecycle.p
    public final void b(androidx.lifecycle.r rVar, EnumC0080l enumC0080l) {
        Window window;
        View viewPeekDecorView;
        switch (this.f829b) {
            case 0:
                AbstractActivityC0137i abstractActivityC0137i = (AbstractActivityC0137i) this.f830c;
                if (enumC0080l == EnumC0080l.ON_STOP && (window = abstractActivityC0137i.getWindow()) != null && (viewPeekDecorView = window.peekDecorView()) != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                    break;
                }
                break;
            case 1:
                AbstractActivityC0137i abstractActivityC0137i2 = (AbstractActivityC0137i) this.f830c;
                if (enumC0080l == EnumC0080l.ON_DESTROY) {
                    abstractActivityC0137i2.f852b.f1327b = null;
                    if (!abstractActivityC0137i2.isChangingConfigurations()) {
                        abstractActivityC0137i2.c().a();
                    }
                    l lVar = abstractActivityC0137i2.f855f;
                    AbstractActivityC0137i abstractActivityC0137i3 = lVar.f843e;
                    abstractActivityC0137i3.getWindow().getDecorView().removeCallbacks(lVar);
                    abstractActivityC0137i3.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(lVar);
                    break;
                }
                break;
            default:
                R.d dVar = (R.d) this.f830c;
                x0.g.e("this$0", dVar);
                if (enumC0080l != EnumC0080l.ON_START) {
                    if (enumC0080l == EnumC0080l.ON_STOP) {
                        dVar.f610c = false;
                        break;
                    }
                } else {
                    dVar.f610c = true;
                    break;
                }
                break;
        }
    }
}
