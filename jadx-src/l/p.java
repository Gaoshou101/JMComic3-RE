package l;

import a.AbstractC0062a;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class p implements B.a {

    /* renamed from: A, reason: collision with root package name */
    public q f2135A;

    /* renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f2136B;

    /* renamed from: a, reason: collision with root package name */
    public final int f2138a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2139b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2140c;
    public final int d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f2141e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f2142f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f2143g;
    public char h;

    /* renamed from: j, reason: collision with root package name */
    public char f2145j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f2147l;

    /* renamed from: n, reason: collision with root package name */
    public final n f2149n;

    /* renamed from: o, reason: collision with root package name */
    public F f2150o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f2151p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f2152q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2153r;

    /* renamed from: y, reason: collision with root package name */
    public int f2159y;

    /* renamed from: z, reason: collision with root package name */
    public View f2160z;

    /* renamed from: i, reason: collision with root package name */
    public int f2144i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f2146k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f2148m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f2154s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f2155t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2156u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f2157v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2158w = false;
    public int x = 16;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2137C = false;

    public p(n nVar, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6) {
        this.f2149n = nVar;
        this.f2138a = i3;
        this.f2139b = i2;
        this.f2140c = i4;
        this.d = i5;
        this.f2141e = charSequence;
        this.f2159y = i6;
    }

    public static void c(StringBuilder sb, int i2, int i3, String str) {
        if ((i2 & i3) == i3) {
            sb.append(str);
        }
    }

    @Override // B.a
    public final q a() {
        return this.f2135A;
    }

    @Override // B.a
    public final B.a b(q qVar) {
        this.f2160z = null;
        this.f2135A = qVar;
        this.f2149n.p(true);
        q qVar2 = this.f2135A;
        if (qVar2 != null) {
            qVar2.f2161a = new X.i(23, this);
            qVar2.f2162b.setVisibilityListener(qVar2);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f2159y & 8) == 0) {
            return false;
        }
        if (this.f2160z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2136B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f2149n.d(this);
        }
        return false;
    }

    public final Drawable d(Drawable drawable) {
        if (drawable != null && this.f2158w && (this.f2156u || this.f2157v)) {
            drawable = drawable.mutate();
            if (this.f2156u) {
                drawable.setTintList(this.f2154s);
            }
            if (this.f2157v) {
                drawable.setTintMode(this.f2155t);
            }
            this.f2158w = false;
        }
        return drawable;
    }

    public final boolean e() {
        q qVar;
        if ((this.f2159y & 8) == 0) {
            return false;
        }
        if (this.f2160z == null && (qVar = this.f2135A) != null) {
            this.f2160z = qVar.f2162b.onCreateActionView(this);
        }
        return this.f2160z != null;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!e()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f2136B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f2149n.f(this);
        }
        return false;
    }

    public final boolean f() {
        return (this.x & 32) == 32;
    }

    public final void g(boolean z2) {
        if (z2) {
            this.x |= 32;
        } else {
            this.x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f2160z;
        if (view != null) {
            return view;
        }
        q qVar = this.f2135A;
        if (qVar == null) {
            return null;
        }
        View viewOnCreateActionView = qVar.f2162b.onCreateActionView(this);
        this.f2160z = viewOnCreateActionView;
        return viewOnCreateActionView;
    }

    @Override // B.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f2146k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f2145j;
    }

    @Override // B.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f2152q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f2139b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f2147l;
        if (drawable != null) {
            return d(drawable);
        }
        int i2 = this.f2148m;
        if (i2 == 0) {
            return null;
        }
        Drawable drawableV = AbstractC0062a.v(this.f2149n.f2111a, i2);
        this.f2148m = 0;
        this.f2147l = drawableV;
        return d(drawableV);
    }

    @Override // B.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f2154s;
    }

    @Override // B.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f2155t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f2143g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f2138a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // B.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f2144i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f2140c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f2150o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f2141e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f2142f;
        return charSequence != null ? charSequence : this.f2141e;
    }

    @Override // B.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f2153r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f2150o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.f2137C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        q qVar = this.f2135A;
        return (qVar == null || !qVar.f2162b.overridesItemVisibility()) ? (this.x & 8) == 0 : (this.x & 8) == 0 && this.f2135A.f2162b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i2;
        this.f2160z = view;
        this.f2135A = null;
        if (view != null && view.getId() == -1 && (i2 = this.f2138a) > 0) {
            view.setId(i2);
        }
        n nVar = this.f2149n;
        nVar.f2119k = true;
        nVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2) {
        if (this.f2145j == c2) {
            return this;
        }
        this.f2145j = Character.toLowerCase(c2);
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 1 : 0) | (i2 & (-2));
        this.x = i3;
        if (i2 != i3) {
            this.f2149n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i2 = this.x;
        if ((i2 & 4) != 0) {
            n nVar = this.f2149n;
            nVar.getClass();
            ArrayList arrayList = nVar.f2115f;
            int size = arrayList.size();
            nVar.w();
            for (int i3 = 0; i3 < size; i3++) {
                p pVar = (p) arrayList.get(i3);
                if (pVar.f2139b == this.f2139b && (pVar.x & 4) != 0 && pVar.isCheckable()) {
                    boolean z3 = pVar == this;
                    int i4 = pVar.x;
                    int i5 = (z3 ? 2 : 0) | (i4 & (-3));
                    pVar.x = i5;
                    if (i4 != i5) {
                        pVar.f2149n.p(false);
                    }
                }
            }
            nVar.v();
        } else {
            int i6 = (i2 & (-3)) | (z2 ? 2 : 0);
            this.x = i6;
            if (i2 != i6) {
                this.f2149n.p(false);
            }
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.x |= 16;
        } else {
            this.x &= -17;
        }
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f2148m = 0;
        this.f2147l = drawable;
        this.f2158w = true;
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f2154s = colorStateList;
        this.f2156u = true;
        this.f2158w = true;
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f2155t = mode;
        this.f2157v = true;
        this.f2158w = true;
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f2143g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2) {
        if (this.h == c2) {
            return this;
        }
        this.h = c2;
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2136B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2151p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3) {
        this.h = c2;
        this.f2145j = Character.toLowerCase(c3);
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i2) {
        int i3 = i2 & 3;
        if (i3 != 0 && i3 != 1 && i3 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f2159y = i2;
        n nVar = this.f2149n;
        nVar.f2119k = true;
        nVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i2) {
        setShowAsAction(i2);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f2141e = charSequence;
        this.f2149n.p(false);
        F f2 = this.f2150o;
        if (f2 != null) {
            f2.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f2142f = charSequence;
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i2 = this.x;
        int i3 = (z2 ? 0 : 8) | (i2 & (-9));
        this.x = i3;
        if (i2 != i3) {
            n nVar = this.f2149n;
            nVar.h = true;
            nVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f2141e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // B.a, android.view.MenuItem
    public final B.a setContentDescription(CharSequence charSequence) {
        this.f2152q = charSequence;
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final B.a setTooltipText(CharSequence charSequence) {
        this.f2153r = charSequence;
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c2, int i2) {
        if (this.f2145j == c2 && this.f2146k == i2) {
            return this;
        }
        this.f2145j = Character.toLowerCase(c2);
        this.f2146k = KeyEvent.normalizeMetaState(i2);
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c2, int i2) {
        if (this.h == c2 && this.f2144i == i2) {
            return this;
        }
        this.h = c2;
        this.f2144i = KeyEvent.normalizeMetaState(i2);
        this.f2149n.p(false);
        return this;
    }

    @Override // B.a, android.view.MenuItem
    public final MenuItem setShortcut(char c2, char c3, int i2, int i3) {
        this.h = c2;
        this.f2144i = KeyEvent.normalizeMetaState(i2);
        this.f2145j = Character.toLowerCase(c3);
        this.f2146k = KeyEvent.normalizeMetaState(i3);
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i2) {
        this.f2147l = null;
        this.f2148m = i2;
        this.f2158w = true;
        this.f2149n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i2) {
        setTitle(this.f2149n.f2111a.getString(i2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i2) {
        int i3;
        Context context = this.f2149n.f2111a;
        View viewInflate = LayoutInflater.from(context).inflate(i2, (ViewGroup) new LinearLayout(context), false);
        this.f2160z = viewInflate;
        this.f2135A = null;
        if (viewInflate != null && viewInflate.getId() == -1 && (i3 = this.f2138a) > 0) {
            viewInflate.setId(i3);
        }
        n nVar = this.f2149n;
        nVar.f2119k = true;
        nVar.p(true);
        return this;
    }
}
