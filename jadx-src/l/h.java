package l;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import m.C0297v0;
import m.K0;
import m.N0;

/* loaded from: classes.dex */
public final class h extends v implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final Context f2076b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2077c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2078e;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f2079f;

    /* renamed from: i, reason: collision with root package name */
    public final ViewTreeObserverOnGlobalLayoutListenerC0242d f2081i;

    /* renamed from: j, reason: collision with root package name */
    public final ViewOnAttachStateChangeListenerC0243e f2082j;

    /* renamed from: n, reason: collision with root package name */
    public View f2086n;

    /* renamed from: o, reason: collision with root package name */
    public View f2087o;

    /* renamed from: p, reason: collision with root package name */
    public int f2088p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f2089q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f2090r;

    /* renamed from: s, reason: collision with root package name */
    public int f2091s;

    /* renamed from: t, reason: collision with root package name */
    public int f2092t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2094v;

    /* renamed from: w, reason: collision with root package name */
    public y f2095w;
    public ViewTreeObserver x;

    /* renamed from: y, reason: collision with root package name */
    public w f2096y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f2097z;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f2080g = new ArrayList();
    public final ArrayList h = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final X.i f2083k = new X.i(22, this);

    /* renamed from: l, reason: collision with root package name */
    public int f2084l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f2085m = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2093u = false;

    public h(Context context, View view, int i2, boolean z2) {
        int i3 = 0;
        this.f2081i = new ViewTreeObserverOnGlobalLayoutListenerC0242d(i3, this);
        this.f2082j = new ViewOnAttachStateChangeListenerC0243e(this, i3);
        this.f2076b = context;
        this.f2086n = view;
        this.d = i2;
        this.f2078e = z2;
        this.f2088p = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f2077c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f2079f = new Handler();
    }

    @Override // l.D
    public final boolean a() {
        ArrayList arrayList = this.h;
        return arrayList.size() > 0 && ((g) arrayList.get(0)).f2073a.f2256y.isShowing();
    }

    @Override // l.z
    public final void b(n nVar, boolean z2) {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (nVar == ((g) arrayList.get(i2)).f2074b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return;
        }
        int i3 = i2 + 1;
        if (i3 < arrayList.size()) {
            ((g) arrayList.get(i3)).f2074b.c(false);
        }
        g gVar = (g) arrayList.remove(i2);
        gVar.f2074b.r(this);
        boolean z3 = this.f2097z;
        N0 n02 = gVar.f2073a;
        if (z3) {
            K0.b(n02.f2256y, null);
            n02.f2256y.setAnimationStyle(0);
        }
        n02.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f2088p = ((g) arrayList.get(size2 - 1)).f2075c;
        } else {
            this.f2088p = this.f2086n.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((g) arrayList.get(0)).f2074b.c(false);
                return;
            }
            return;
        }
        dismiss();
        y yVar = this.f2095w;
        if (yVar != null) {
            yVar.b(nVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.x;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.x.removeGlobalOnLayoutListener(this.f2081i);
            }
            this.x = null;
        }
        this.f2087o.removeOnAttachStateChangeListener(this.f2082j);
        this.f2096y.onDismiss();
    }

    @Override // l.z
    public final boolean d() {
        return false;
    }

    @Override // l.D
    public final void dismiss() {
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        if (size > 0) {
            g[] gVarArr = (g[]) arrayList.toArray(new g[size]);
            for (int i2 = size - 1; i2 >= 0; i2--) {
                g gVar = gVarArr[i2];
                if (gVar.f2073a.f2256y.isShowing()) {
                    gVar.f2073a.dismiss();
                }
            }
        }
    }

    @Override // l.z
    public final void e() {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((g) it.next()).f2073a.f2237c.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((k) adapter).notifyDataSetChanged();
        }
    }

    @Override // l.D
    public final void f() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (a()) {
            return;
        }
        ArrayList arrayList = this.f2080g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            v((n) it.next());
        }
        arrayList.clear();
        View view = this.f2086n;
        this.f2087o = view;
        if (view != null) {
            boolean z2 = this.x == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.x = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f2081i);
            }
            this.f2087o.addOnAttachStateChangeListener(this.f2082j);
        }
    }

    @Override // l.z
    public final boolean g(F f2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (f2 == gVar.f2074b) {
                gVar.f2073a.f2237c.requestFocus();
                return true;
            }
        }
        if (!f2.hasVisibleItems()) {
            return false;
        }
        l(f2);
        y yVar = this.f2095w;
        if (yVar != null) {
            yVar.d(f2);
        }
        return true;
    }

    @Override // l.z
    public final void h(y yVar) {
        this.f2095w = yVar;
    }

    @Override // l.D
    public final C0297v0 j() {
        ArrayList arrayList = this.h;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((g) arrayList.get(arrayList.size() - 1)).f2073a.f2237c;
    }

    @Override // l.v
    public final void l(n nVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        nVar.b(this, this.f2076b);
        if (a()) {
            v(nVar);
        } else {
            this.f2080g.add(nVar);
        }
    }

    @Override // l.v
    public final void n(View view) {
        if (this.f2086n != view) {
            this.f2086n = view;
            this.f2085m = Gravity.getAbsoluteGravity(this.f2084l, view.getLayoutDirection());
        }
    }

    @Override // l.v
    public final void o(boolean z2) {
        this.f2093u = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        g gVar;
        ArrayList arrayList = this.h;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                gVar = null;
                break;
            }
            gVar = (g) arrayList.get(i2);
            if (!gVar.f2073a.f2256y.isShowing()) {
                break;
            } else {
                i2++;
            }
        }
        if (gVar != null) {
            gVar.f2074b.c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i2 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // l.v
    public final void p(int i2) {
        if (this.f2084l != i2) {
            this.f2084l = i2;
            this.f2085m = Gravity.getAbsoluteGravity(i2, this.f2086n.getLayoutDirection());
        }
    }

    @Override // l.v
    public final void q(int i2) {
        this.f2089q = true;
        this.f2091s = i2;
    }

    @Override // l.v
    public final void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f2096y = (w) onDismissListener;
    }

    @Override // l.v
    public final void s(boolean z2) {
        this.f2094v = z2;
    }

    @Override // l.v
    public final void t(int i2) {
        this.f2090r = true;
        this.f2092t = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(l.n r19) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.h.v(l.n):void");
    }
}
