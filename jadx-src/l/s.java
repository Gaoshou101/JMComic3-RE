package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class s implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnActionExpandListener f2165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2166b;

    public s(u uVar, MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f2166b = uVar;
        this.f2165a = onActionExpandListener;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        return this.f2165a.onMenuItemActionCollapse(this.f2166b.f(menuItem));
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        return this.f2165a.onMenuItemActionExpand(this.f2166b.f(menuItem));
    }
}
