package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.util.ArrayList;
import l.InterfaceC0236A;
import l.InterfaceC0237B;

/* renamed from: m.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0275k implements l.z {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2371a;

    /* renamed from: b, reason: collision with root package name */
    public Context f2372b;

    /* renamed from: c, reason: collision with root package name */
    public l.n f2373c;
    public final LayoutInflater d;

    /* renamed from: e, reason: collision with root package name */
    public l.y f2374e;
    public InterfaceC0237B h;

    /* renamed from: i, reason: collision with root package name */
    public C0273j f2377i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f2378j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2379k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f2380l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2381m;

    /* renamed from: n, reason: collision with root package name */
    public int f2382n;

    /* renamed from: o, reason: collision with root package name */
    public int f2383o;

    /* renamed from: p, reason: collision with root package name */
    public int f2384p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2385q;

    /* renamed from: s, reason: collision with root package name */
    public C0267g f2387s;

    /* renamed from: t, reason: collision with root package name */
    public C0267g f2388t;

    /* renamed from: u, reason: collision with root package name */
    public RunnableC0271i f2389u;

    /* renamed from: v, reason: collision with root package name */
    public C0269h f2390v;

    /* renamed from: f, reason: collision with root package name */
    public final int f2375f = R.layout.abc_action_menu_layout;

    /* renamed from: g, reason: collision with root package name */
    public final int f2376g = R.layout.abc_action_menu_item_layout;

    /* renamed from: r, reason: collision with root package name */
    public final SparseBooleanArray f2386r = new SparseBooleanArray();

    /* renamed from: w, reason: collision with root package name */
    public final X.i f2391w = new X.i(24, this);

    public C0275k(Context context) {
        this.f2371a = context;
        this.d = LayoutInflater.from(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v4, types: [l.A] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public final View a(l.p pVar, View view, ViewGroup viewGroup) {
        View actionView = pVar.getActionView();
        if (actionView == null || pVar.e()) {
            ActionMenuItemView actionMenuItemView = view instanceof InterfaceC0236A ? (InterfaceC0236A) view : (InterfaceC0236A) this.d.inflate(this.f2376g, viewGroup, false);
            actionMenuItemView.b(pVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker((ActionMenuView) this.h);
            if (this.f2390v == null) {
                this.f2390v = new C0269h(this);
            }
            actionMenuItemView2.setPopupCallback(this.f2390v);
            actionView = actionMenuItemView;
        }
        actionView.setVisibility(pVar.f2137C ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        ((ActionMenuView) viewGroup).getClass();
        if (!(layoutParams instanceof C0279m)) {
            actionView.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return actionView;
    }

    @Override // l.z
    public final void b(l.n nVar, boolean z2) {
        f();
        C0267g c0267g = this.f2388t;
        if (c0267g != null && c0267g.b()) {
            c0267g.f2178i.dismiss();
        }
        l.y yVar = this.f2374e;
        if (yVar != null) {
            yVar.b(nVar, z2);
        }
    }

    @Override // l.z
    public final void c(Context context, l.n nVar) {
        this.f2372b = context;
        LayoutInflater.from(context);
        this.f2373c = nVar;
        Resources resources = context.getResources();
        if (!this.f2381m) {
            this.f2380l = true;
        }
        int i2 = 2;
        this.f2382n = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i2 = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i2 = 4;
        } else if (i3 >= 360) {
            i2 = 3;
        }
        this.f2384p = i2;
        int measuredWidth = this.f2382n;
        if (this.f2380l) {
            if (this.f2377i == null) {
                C0273j c0273j = new C0273j(this, this.f2371a);
                this.f2377i = c0273j;
                if (this.f2379k) {
                    c0273j.setImageDrawable(this.f2378j);
                    this.f2378j = null;
                    this.f2379k = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f2377i.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f2377i.getMeasuredWidth();
        } else {
            this.f2377i = null;
        }
        this.f2383o = measuredWidth;
        float f2 = resources.getDisplayMetrics().density;
    }

    @Override // l.z
    public final boolean d() {
        int size;
        ArrayList arrayListL;
        int i2;
        boolean z2;
        l.n nVar = this.f2373c;
        if (nVar != null) {
            arrayListL = nVar.l();
            size = arrayListL.size();
        } else {
            size = 0;
            arrayListL = null;
        }
        int i3 = this.f2384p;
        int i4 = this.f2383o;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.h;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i2 = 2;
            z2 = true;
            if (i5 >= size) {
                break;
            }
            l.p pVar = (l.p) arrayListL.get(i5);
            int i8 = pVar.f2159y;
            if ((i8 & 2) == 2) {
                i6++;
            } else if ((i8 & 1) == 1) {
                i7++;
            } else {
                z3 = true;
            }
            if (this.f2385q && pVar.f2137C) {
                i3 = 0;
            }
            i5++;
        }
        if (this.f2380l && (z3 || i7 + i6 > i3)) {
            i3--;
        }
        int i9 = i3 - i6;
        SparseBooleanArray sparseBooleanArray = this.f2386r;
        sparseBooleanArray.clear();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            l.p pVar2 = (l.p) arrayListL.get(i10);
            int i12 = pVar2.f2159y;
            boolean z4 = (i12 & 2) == i2 ? z2 : false;
            int i13 = pVar2.f2139b;
            if (z4) {
                View viewA = a(pVar2, null, viewGroup);
                viewA.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewA.getMeasuredWidth();
                i4 -= measuredWidth;
                if (i11 == 0) {
                    i11 = measuredWidth;
                }
                if (i13 != 0) {
                    sparseBooleanArray.put(i13, z2);
                }
                pVar2.g(z2);
            } else if ((i12 & 1) == z2) {
                boolean z5 = sparseBooleanArray.get(i13);
                boolean z6 = ((i9 > 0 || z5) && i4 > 0) ? z2 : false;
                if (z6) {
                    View viewA2 = a(pVar2, null, viewGroup);
                    viewA2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewA2.getMeasuredWidth();
                    i4 -= measuredWidth2;
                    if (i11 == 0) {
                        i11 = measuredWidth2;
                    }
                    z6 &= i4 + i11 > 0;
                }
                if (z6 && i13 != 0) {
                    sparseBooleanArray.put(i13, true);
                } else if (z5) {
                    sparseBooleanArray.put(i13, false);
                    for (int i14 = 0; i14 < i10; i14++) {
                        l.p pVar3 = (l.p) arrayListL.get(i14);
                        if (pVar3.f2139b == i13) {
                            if (pVar3.f()) {
                                i9++;
                            }
                            pVar3.g(false);
                        }
                    }
                }
                if (z6) {
                    i9--;
                }
                pVar2.g(z6);
            } else {
                pVar2.g(false);
                i10++;
                i2 = 2;
                z2 = true;
            }
            i10++;
            i2 = 2;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.z
    public final void e() {
        int i2;
        ViewGroup viewGroup = (ViewGroup) this.h;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (viewGroup != null) {
            l.n nVar = this.f2373c;
            if (nVar != null) {
                nVar.i();
                ArrayList arrayListL = this.f2373c.l();
                int size = arrayListL.size();
                i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    l.p pVar = (l.p) arrayListL.get(i3);
                    if (pVar.f()) {
                        View childAt = viewGroup.getChildAt(i2);
                        l.p itemData = childAt instanceof InterfaceC0236A ? ((InterfaceC0236A) childAt).getItemData() : null;
                        View viewA = a(pVar, childAt, viewGroup);
                        if (pVar != itemData) {
                            viewA.setPressed(false);
                            viewA.jumpDrawablesToCurrentState();
                        }
                        if (viewA != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) viewA.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(viewA);
                            }
                            ((ViewGroup) this.h).addView(viewA, i2);
                        }
                        i2++;
                    }
                }
            } else {
                i2 = 0;
            }
            while (i2 < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i2) == this.f2377i) {
                    i2++;
                } else {
                    viewGroup.removeViewAt(i2);
                }
            }
        }
        ((View) this.h).requestLayout();
        l.n nVar2 = this.f2373c;
        if (nVar2 != null) {
            nVar2.i();
            ArrayList arrayList2 = nVar2.f2117i;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                l.q qVar = ((l.p) arrayList2.get(i4)).f2135A;
            }
        }
        l.n nVar3 = this.f2373c;
        if (nVar3 != null) {
            nVar3.i();
            arrayList = nVar3.f2118j;
        }
        if (this.f2380l && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((l.p) arrayList.get(0)).f2137C;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.f2377i == null) {
                this.f2377i = new C0273j(this, this.f2371a);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.f2377i.getParent();
            if (viewGroup3 != this.h) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.f2377i);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.h;
                C0273j c0273j = this.f2377i;
                actionMenuView.getClass();
                C0279m c0279mI = ActionMenuView.i();
                c0279mI.f2422a = true;
                actionMenuView.addView(c0273j, c0279mI);
            }
        } else {
            C0273j c0273j2 = this.f2377i;
            if (c0273j2 != null) {
                Object parent = c0273j2.getParent();
                Object obj = this.h;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f2377i);
                }
            }
        }
        ((ActionMenuView) this.h).setOverflowReserved(this.f2380l);
    }

    public final boolean f() {
        Object obj;
        RunnableC0271i runnableC0271i = this.f2389u;
        if (runnableC0271i != null && (obj = this.h) != null) {
            ((View) obj).removeCallbacks(runnableC0271i);
            this.f2389u = null;
            return true;
        }
        C0267g c0267g = this.f2387s;
        if (c0267g == null) {
            return false;
        }
        if (c0267g.b()) {
            c0267g.f2178i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.z
    public final boolean g(l.F f2) {
        boolean z2;
        if (!f2.hasVisibleItems()) {
            return false;
        }
        l.F f3 = f2;
        while (true) {
            l.n nVar = f3.f2049z;
            if (nVar == this.f2373c) {
                break;
            }
            f3 = (l.F) nVar;
        }
        ViewGroup viewGroup = (ViewGroup) this.h;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i2);
                if ((childAt instanceof InterfaceC0236A) && ((InterfaceC0236A) childAt).getItemData() == f3.f2048A) {
                    view = childAt;
                    break;
                }
                i2++;
            }
        }
        if (view == null) {
            return false;
        }
        f2.f2048A.getClass();
        int size = f2.f2115f.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z2 = false;
                break;
            }
            MenuItem item = f2.getItem(i3);
            if (item.isVisible() && item.getIcon() != null) {
                z2 = true;
                break;
            }
            i3++;
        }
        C0267g c0267g = new C0267g(this, this.f2372b, f2, view);
        this.f2388t = c0267g;
        c0267g.f2177g = z2;
        l.v vVar = c0267g.f2178i;
        if (vVar != null) {
            vVar.o(z2);
        }
        C0267g c0267g2 = this.f2388t;
        if (!c0267g2.b()) {
            if (c0267g2.f2175e == null) {
                throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
            }
            c0267g2.d(0, 0, false, false);
        }
        l.y yVar = this.f2374e;
        if (yVar != null) {
            yVar.d(f2);
        }
        return true;
    }

    @Override // l.z
    public final void h(l.y yVar) {
        throw null;
    }

    @Override // l.z
    public final boolean i(l.p pVar) {
        return false;
    }

    public final boolean j() {
        C0267g c0267g = this.f2387s;
        return c0267g != null && c0267g.b();
    }

    @Override // l.z
    public final boolean k(l.p pVar) {
        return false;
    }

    public final boolean l() {
        l.n nVar;
        if (!this.f2380l || j() || (nVar = this.f2373c) == null || this.h == null || this.f2389u != null) {
            return false;
        }
        nVar.i();
        if (nVar.f2118j.isEmpty()) {
            return false;
        }
        RunnableC0271i runnableC0271i = new RunnableC0271i(this, new C0267g(this, this.f2372b, this.f2373c, this.f2377i));
        this.f2389u = runnableC0271i;
        ((View) this.h).post(runnableC0271i);
        return true;
    }
}
