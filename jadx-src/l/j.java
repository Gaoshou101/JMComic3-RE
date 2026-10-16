package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import g.C0131c;
import g.DialogC0135g;

/* loaded from: classes.dex */
public final class j implements z, AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public Context f2100a;

    /* renamed from: b, reason: collision with root package name */
    public LayoutInflater f2101b;

    /* renamed from: c, reason: collision with root package name */
    public n f2102c;
    public ExpandedMenuView d;

    /* renamed from: e, reason: collision with root package name */
    public y f2103e;

    /* renamed from: f, reason: collision with root package name */
    public i f2104f;

    public j(ContextWrapper contextWrapper) {
        this.f2100a = contextWrapper;
        this.f2101b = LayoutInflater.from(contextWrapper);
    }

    @Override // l.z
    public final void b(n nVar, boolean z2) {
        y yVar = this.f2103e;
        if (yVar != null) {
            yVar.b(nVar, z2);
        }
    }

    @Override // l.z
    public final void c(Context context, n nVar) {
        if (this.f2100a != null) {
            this.f2100a = context;
            if (this.f2101b == null) {
                this.f2101b = LayoutInflater.from(context);
            }
        }
        this.f2102c = nVar;
        i iVar = this.f2104f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // l.z
    public final boolean d() {
        return false;
    }

    @Override // l.z
    public final void e() {
        i iVar = this.f2104f;
        if (iVar != null) {
            iVar.notifyDataSetChanged();
        }
    }

    @Override // l.z
    public final boolean g(F f2) {
        if (!f2.hasVisibleItems()) {
            return false;
        }
        o oVar = new o();
        oVar.f2132a = f2;
        Context context = f2.f2111a;
        D.m mVar = new D.m(context);
        C0131c c0131c = (C0131c) mVar.f44b;
        j jVar = new j(c0131c.f1624a);
        oVar.f2134c = jVar;
        jVar.f2103e = oVar;
        f2.b(jVar, context);
        j jVar2 = oVar.f2134c;
        if (jVar2.f2104f == null) {
            jVar2.f2104f = new i(jVar2);
        }
        c0131c.f1629g = jVar2.f2104f;
        c0131c.h = oVar;
        View view = f2.f2123o;
        if (view != null) {
            c0131c.f1627e = view;
        } else {
            c0131c.f1626c = f2.f2122n;
            c0131c.d = f2.f2121m;
        }
        c0131c.f1628f = oVar;
        DialogC0135g dialogC0135gB = mVar.b();
        oVar.f2133b = dialogC0135gB;
        dialogC0135gB.setOnDismissListener(oVar);
        WindowManager.LayoutParams attributes = oVar.f2133b.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        oVar.f2133b.show();
        y yVar = this.f2103e;
        if (yVar == null) {
            return true;
        }
        yVar.d(f2);
        return true;
    }

    @Override // l.z
    public final void h(y yVar) {
        throw null;
    }

    @Override // l.z
    public final boolean i(p pVar) {
        return false;
    }

    @Override // l.z
    public final boolean k(p pVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.f2102c.q(this.f2104f.getItem(i2), this, 0);
    }
}
