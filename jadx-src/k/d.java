package k;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.emoji2.text.u;
import java.lang.ref.WeakReference;
import l.n;
import m.C0275k;

/* loaded from: classes.dex */
public final class d extends AbstractC0225a implements l.l {

    /* renamed from: c, reason: collision with root package name */
    public Context f1972c;
    public ActionBarContextView d;

    /* renamed from: e, reason: collision with root package name */
    public D.c f1973e;

    /* renamed from: f, reason: collision with root package name */
    public WeakReference f1974f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1975g;
    public n h;

    @Override // k.AbstractC0225a
    public final void a() {
        if (this.f1975g) {
            return;
        }
        this.f1975g = true;
        this.f1973e.c(this);
    }

    @Override // k.AbstractC0225a
    public final View b() {
        WeakReference weakReference = this.f1974f;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // k.AbstractC0225a
    public final n c() {
        return this.h;
    }

    @Override // k.AbstractC0225a
    public final MenuInflater d() {
        return new h(this.d.getContext());
    }

    @Override // k.AbstractC0225a
    public final CharSequence e() {
        return this.d.getSubtitle();
    }

    @Override // k.AbstractC0225a
    public final CharSequence f() {
        return this.d.getTitle();
    }

    @Override // k.AbstractC0225a
    public final void g() {
        this.f1973e.d(this, this.h);
    }

    @Override // k.AbstractC0225a
    public final boolean h() {
        return this.d.f936s;
    }

    @Override // k.AbstractC0225a
    public final void i(View view) {
        this.d.setCustomView(view);
        this.f1974f = view != null ? new WeakReference(view) : null;
    }

    @Override // l.l
    public final boolean j(n nVar, MenuItem menuItem) {
        return ((u) this.f1973e.f19b).g(this, menuItem);
    }

    @Override // k.AbstractC0225a
    public final void k(int i2) {
        m(this.f1972c.getString(i2));
    }

    @Override // l.l
    public final void l(n nVar) {
        g();
        C0275k c0275k = this.d.d;
        if (c0275k != null) {
            c0275k.l();
        }
    }

    @Override // k.AbstractC0225a
    public final void m(CharSequence charSequence) {
        this.d.setSubtitle(charSequence);
    }

    @Override // k.AbstractC0225a
    public final void n(int i2) {
        o(this.f1972c.getString(i2));
    }

    @Override // k.AbstractC0225a
    public final void o(CharSequence charSequence) {
        this.d.setTitle(charSequence);
    }

    @Override // k.AbstractC0225a
    public final void p(boolean z2) {
        this.f1966b = z2;
        this.d.setTitleOptional(z2);
    }
}
