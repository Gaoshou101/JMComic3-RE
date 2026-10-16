package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.a7m3p9xv.t6qk2z8.app.R;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2172a;

    /* renamed from: b, reason: collision with root package name */
    public final n f2173b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2174c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public View f2175e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2177g;
    public y h;

    /* renamed from: i, reason: collision with root package name */
    public v f2178i;

    /* renamed from: j, reason: collision with root package name */
    public w f2179j;

    /* renamed from: f, reason: collision with root package name */
    public int f2176f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final w f2180k = new w(this);

    public x(int i2, Context context, View view, n nVar, boolean z2) {
        this.f2172a = context;
        this.f2173b = nVar;
        this.f2175e = view;
        this.f2174c = z2;
        this.d = i2;
    }

    public final v a() {
        v e2;
        if (this.f2178i == null) {
            Context context = this.f2172a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                e2 = new h(context, this.f2175e, this.d, this.f2174c);
            } else {
                View view = this.f2175e;
                Context context2 = this.f2172a;
                boolean z2 = this.f2174c;
                e2 = new E(this.d, context2, view, this.f2173b, z2);
            }
            e2.l(this.f2173b);
            e2.r(this.f2180k);
            e2.n(this.f2175e);
            e2.h(this.h);
            e2.o(this.f2177g);
            e2.p(this.f2176f);
            this.f2178i = e2;
        }
        return this.f2178i;
    }

    public final boolean b() {
        v vVar = this.f2178i;
        return vVar != null && vVar.a();
    }

    public void c() {
        this.f2178i = null;
        w wVar = this.f2179j;
        if (wVar != null) {
            wVar.onDismiss();
        }
    }

    public final void d(int i2, int i3, boolean z2, boolean z3) {
        v vVarA = a();
        vVarA.s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f2176f, this.f2175e.getLayoutDirection()) & 7) == 5) {
                i2 -= this.f2175e.getWidth();
            }
            vVarA.q(i2);
            vVarA.t(i3);
            int i4 = (int) ((this.f2172a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            vVarA.f2170a = new Rect(i2 - i4, i3 - i4, i2 + i4, i3 + i4);
        }
        vVarA.f();
    }
}
