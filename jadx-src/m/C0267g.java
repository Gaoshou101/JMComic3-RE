package m;

import android.content.Context;
import android.view.View;
import com.a7m3p9xv.t6qk2z8.app.R;

/* renamed from: m.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0267g extends l.x {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f2349l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0275k f2350m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267g(C0275k c0275k, Context context, l.n nVar, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, nVar, true);
        this.f2350m = c0275k;
        this.f2176f = 8388613;
        X.i iVar = c0275k.f2391w;
        this.h = iVar;
        l.v vVar = this.f2178i;
        if (vVar != null) {
            vVar.h(iVar);
        }
    }

    @Override // l.x
    public final void c() {
        switch (this.f2349l) {
            case 0:
                C0275k c0275k = this.f2350m;
                c0275k.f2388t = null;
                c0275k.getClass();
                super.c();
                break;
            default:
                C0275k c0275k2 = this.f2350m;
                l.n nVar = c0275k2.f2373c;
                if (nVar != null) {
                    nVar.c(true);
                }
                c0275k2.f2387s = null;
                super.c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0267g(C0275k c0275k, Context context, l.F f2, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, f2, false);
        this.f2350m = c0275k;
        if (!f2.f2048A.f()) {
            View view2 = c0275k.f2377i;
            this.f2175e = view2 == null ? (View) c0275k.h : view2;
        }
        X.i iVar = c0275k.f2391w;
        this.h = iVar;
        l.v vVar = this.f2178i;
        if (vVar != null) {
            vVar.h(iVar);
        }
    }
}
