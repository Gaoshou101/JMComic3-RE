package l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: classes.dex */
public final class F extends n implements SubMenu {

    /* renamed from: A, reason: collision with root package name */
    public final p f2048A;

    /* renamed from: z, reason: collision with root package name */
    public final n f2049z;

    public F(Context context, n nVar, p pVar) {
        super(context);
        this.f2049z = nVar;
        this.f2048A = pVar;
    }

    @Override // l.n
    public final boolean d(p pVar) {
        return this.f2049z.d(pVar);
    }

    @Override // l.n
    public final boolean e(n nVar, MenuItem menuItem) {
        return super.e(nVar, menuItem) || this.f2049z.e(nVar, menuItem);
    }

    @Override // l.n
    public final boolean f(p pVar) {
        return this.f2049z.f(pVar);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.f2048A;
    }

    @Override // l.n
    public final String j() {
        p pVar = this.f2048A;
        int i2 = pVar != null ? pVar.f2138a : 0;
        if (i2 == 0) {
            return null;
        }
        return "android:menu:actionviewstates:" + i2;
    }

    @Override // l.n
    public final n k() {
        return this.f2049z.k();
    }

    @Override // l.n
    public final boolean m() {
        return this.f2049z.m();
    }

    @Override // l.n
    public final boolean n() {
        return this.f2049z.n();
    }

    @Override // l.n
    public final boolean o() {
        return this.f2049z.o();
    }

    @Override // l.n, android.view.Menu
    public final void setGroupDividerEnabled(boolean z2) {
        this.f2049z.setGroupDividerEnabled(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f2048A.setIcon(drawable);
        return this;
    }

    @Override // l.n, android.view.Menu
    public final void setQwertyMode(boolean z2) {
        this.f2049z.setQwertyMode(z2);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i2) {
        u(0, null, i2, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i2) {
        u(i2, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i2) {
        this.f2048A.setIcon(i2);
        return this;
    }
}
