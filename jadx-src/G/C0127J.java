package g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import k.AbstractC0225a;
import m.C0275k;

/* renamed from: g.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0127J extends AbstractC0225a implements l.l {

    /* renamed from: c, reason: collision with root package name */
    public final Context f1591c;
    public final l.n d;

    /* renamed from: e, reason: collision with root package name */
    public D.c f1592e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f1593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0128K f1594g;

    public C0127J(C0128K c0128k, Context context, D.c cVar) {
        this.f1594g = c0128k;
        this.f1591c = context;
        this.f1592e = cVar;
        l.n nVar = new l.n(context);
        nVar.f2120l = 1;
        this.d = nVar;
        nVar.f2114e = this;
    }

    @Override // k.AbstractC0225a
    public final void a() {
        C0128K c0128k = this.f1594g;
        if (c0128k.f1615u != this) {
            return;
        }
        if (c0128k.f1598B) {
            c0128k.f1616v = this;
            c0128k.f1617w = this.f1592e;
        } else {
            this.f1592e.c(this);
        }
        this.f1592e = null;
        c0128k.K(false);
        ActionBarContextView actionBarContextView = c0128k.f1612r;
        if (actionBarContextView.f928k == null) {
            actionBarContextView.e();
        }
        c0128k.f1609o.setHideOnContentScrollEnabled(c0128k.f1603G);
        c0128k.f1615u = null;
    }

    @Override // k.AbstractC0225a
    public final View b() {
        WeakReference weakReference = this.f1593f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0225a
    public final l.n c() {
        return this.d;
    }

    @Override // k.AbstractC0225a
    public final MenuInflater d() {
        return new k.h(this.f1591c);
    }

    @Override // k.AbstractC0225a
    public final CharSequence e() {
        return this.f1594g.f1612r.getSubtitle();
    }

    @Override // k.AbstractC0225a
    public final CharSequence f() {
        return this.f1594g.f1612r.getTitle();
    }

    @Override // k.AbstractC0225a
    public final void g() {
        if (this.f1594g.f1615u != this) {
            return;
        }
        l.n nVar = this.d;
        nVar.w();
        try {
            this.f1592e.d(this, nVar);
        } finally {
            nVar.v();
        }
    }

    @Override // k.AbstractC0225a
    public final boolean h() {
        return this.f1594g.f1612r.f936s;
    }

    @Override // k.AbstractC0225a
    public final void i(View view) {
        this.f1594g.f1612r.setCustomView(view);
        this.f1593f = new WeakReference(view);
    }

    @Override // l.l
    public final boolean j(l.n nVar, MenuItem menuItem) {
        D.c cVar = this.f1592e;
        if (cVar != null) {
            return ((androidx.emoji2.text.u) cVar.f19b).g(this, menuItem);
        }
        return false;
    }

    @Override // k.AbstractC0225a
    public final void k(int i2) {
        m(this.f1594g.f1607m.getResources().getString(i2));
    }

    @Override // l.l
    public final void l(l.n nVar) {
        if (this.f1592e == null) {
            return;
        }
        g();
        C0275k c0275k = this.f1594g.f1612r.d;
        if (c0275k != null) {
            c0275k.l();
        }
    }

    @Override // k.AbstractC0225a
    public final void m(CharSequence charSequence) {
        this.f1594g.f1612r.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0225a
    public final void n(int i2) {
        o(this.f1594g.f1607m.getResources().getString(i2));
    }

    @Override // k.AbstractC0225a
    public final void o(CharSequence charSequence) {
        this.f1594g.f1612r.setTitle(charSequence);
    }

    @Override // k.AbstractC0225a
    public final void p(boolean z2) {
        this.f1966b = z2;
        this.f1594g.f1612r.setTitleOptional(z2);
    }
}
