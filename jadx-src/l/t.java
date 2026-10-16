package l;

import android.view.MenuItem;

/* loaded from: classes.dex */
public final class t implements MenuItem.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final MenuItem.OnMenuItemClickListener f2167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f2168b;

    public t(u uVar, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f2168b = uVar;
        this.f2167a = onMenuItemClickListener;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        return this.f2167a.onMenuItemClick(this.f2168b.f(menuItem));
    }
}
