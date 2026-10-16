package l;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: l.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0239a implements B.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f2050a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f2051b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f2052c;
    public char d;

    /* renamed from: e, reason: collision with root package name */
    public int f2053e;

    /* renamed from: f, reason: collision with root package name */
    public char f2054f;

    /* renamed from: g, reason: collision with root package name */
    public int f2055g;
    public Drawable h;

    /* renamed from: i, reason: collision with root package name */
    public Context f2056i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f2057j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f2058k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f2059l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuff.Mode f2060m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f2061n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2062o;

    /* renamed from: p, reason: collision with root package name */
    public int f2063p;

    @Override // B.a
    public final q a() {
        return null;
    }

    @Override // B.a
    public final B.a b(q qVar) {
        throw new UnsupportedOperationException();
    }

    public final void c() {
        Drawable drawable = this.h;
        if (drawable != null) {
            if (this.f2061n || this.f2062o) {
                this.h = drawable;
                Drawable drawableMutate = drawable.mutate();
                this.h = drawableMutate;
                if (this.f2061n) {
                    drawableMutate.setTintList(this.f2059l);
                }
                if (this.f2062o) {
                    this.h.setTintMode(this.f2060m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // B.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2055g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2054f;
    }

    @Override // B.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2057j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.h;
    }

    @Override // B.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2059l;
    }

    @Override // B.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2060m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2052c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // B.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2053e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2050a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2051b;
        return charSequence != null ? charSequence : this.f2050a;
    }

    @Override // B.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2058k;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f2063p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f2063p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f2063p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f2063p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        this.f2054f = Character.toLowerCase(c2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        this.f2063p = (z2 ? 1 : 0) | (this.f2063p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        this.f2063p = (z2 ? 2 : 0) | (this.f2063p & (-3));
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final B.a setContentDescription(CharSequence charSequence) {
        this.f2057j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        this.f2063p = (z2 ? 16 : 0) | (this.f2063p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.h = drawable;
        c();
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2059l = colorStateList;
        this.f2061n = true;
        c();
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2060m = mode;
        this.f2062o = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2052c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        this.d = c2;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.d = c2;
        this.f2054f = Character.toLowerCase(c3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2050a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2051b = charSequence;
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final B.a setTooltipText(CharSequence charSequence) {
        this.f2058k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        this.f2063p = (this.f2063p & 8) | (z2 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        this.f2054f = Character.toLowerCase(c2);
        this.f2055g = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f2057j = charSequence;
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        this.d = c2;
        this.f2053e = KeyEvent.normalizeMetaState(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        this.f2050a = this.f2056i.getResources().getString(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f2058k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.h = this.f2056i.getDrawable(i2);
        c();
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.d = c2;
        this.f2053e = KeyEvent.normalizeMetaState(i2);
        this.f2054f = Character.toLowerCase(c3);
        this.f2055g = KeyEvent.normalizeMetaState(i3);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        return this;
    }
}
