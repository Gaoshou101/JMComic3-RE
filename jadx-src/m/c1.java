package m;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import k.InterfaceC0226b;

/* loaded from: classes.dex */
public final class c1 implements l.z {

    /* renamed from: a, reason: collision with root package name */
    public l.n f2336a;

    /* renamed from: b, reason: collision with root package name */
    public l.p f2337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f2338c;

    public c1(Toolbar toolbar) {
        this.f2338c = toolbar;
    }

    @Override // l.z
    public final void c(Context context, l.n nVar) {
        l.p pVar;
        l.n nVar2 = this.f2336a;
        if (nVar2 != null && (pVar = this.f2337b) != null) {
            nVar2.d(pVar);
        }
        this.f2336a = nVar;
    }

    @Override // l.z
    public final boolean d() {
        return false;
    }

    @Override // l.z
    public final void e() {
        if (this.f2337b != null) {
            l.n nVar = this.f2336a;
            if (nVar != null) {
                int size = nVar.f2115f.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (this.f2336a.getItem(i2) == this.f2337b) {
                        return;
                    }
                }
            }
            k(this.f2337b);
        }
    }

    @Override // l.z
    public final boolean g(l.F f2) {
        return false;
    }

    @Override // l.z
    public final boolean i(l.p pVar) {
        Toolbar toolbar = this.f2338c;
        toolbar.c();
        ViewParent parent = toolbar.h.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.h);
            }
            toolbar.addView(toolbar.h);
        }
        View actionView = pVar.getActionView();
        toolbar.f1012i = actionView;
        this.f2337b = pVar;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1012i);
            }
            d1 d1VarH = Toolbar.h();
            d1VarH.f2340a = (toolbar.f1017n & 112) | 8388611;
            d1VarH.f2341b = 2;
            toolbar.f1012i.setLayoutParams(d1VarH);
            toolbar.addView(toolbar.f1012i);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((d1) childAt.getLayoutParams()).f2341b != 2 && childAt != toolbar.f1006a) {
                toolbar.removeViewAt(childCount);
                toolbar.f993E.add(childAt);
            }
        }
        toolbar.requestLayout();
        pVar.f2137C = true;
        pVar.f2149n.p(false);
        KeyEvent.Callback callback = toolbar.f1012i;
        if (callback instanceof InterfaceC0226b) {
            ((l.r) ((InterfaceC0226b) callback)).f2164a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // l.z
    public final boolean k(l.p pVar) {
        Toolbar toolbar = this.f2338c;
        KeyEvent.Callback callback = toolbar.f1012i;
        if (callback instanceof InterfaceC0226b) {
            ((l.r) ((InterfaceC0226b) callback)).f2164a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1012i);
        toolbar.removeView(toolbar.h);
        toolbar.f1012i = null;
        ArrayList arrayList = toolbar.f993E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f2337b = null;
        toolbar.requestLayout();
        pVar.f2137C = false;
        pVar.f2149n.p(false);
        toolbar.t();
        return true;
    }

    @Override // l.z
    public final void b(l.n nVar, boolean z2) {
    }
}
