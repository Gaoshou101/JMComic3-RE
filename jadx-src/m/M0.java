package m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public final class M0 extends C0297v0 {

    /* renamed from: m, reason: collision with root package name */
    public final int f2264m;

    /* renamed from: n, reason: collision with root package name */
    public final int f2265n;

    /* renamed from: o, reason: collision with root package name */
    public J0 f2266o;

    /* renamed from: p, reason: collision with root package name */
    public l.p f2267p;

    public M0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f2264m = 21;
            this.f2265n = 22;
        } else {
            this.f2264m = 22;
            this.f2265n = 21;
        }
    }

    @Override // m.C0297v0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        l.k kVar;
        int headersCount;
        int iPointToPosition;
        int i2;
        if (this.f2266o != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                kVar = (l.k) headerViewListAdapter.getWrappedAdapter();
            } else {
                kVar = (l.k) adapter;
                headersCount = 0;
            }
            l.p item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = iPointToPosition - headersCount) < 0 || i2 >= kVar.getCount()) ? null : kVar.getItem(i2);
            l.p pVar = this.f2267p;
            if (pVar != item) {
                l.n nVar = kVar.f2105a;
                if (pVar != null) {
                    this.f2266o.t(nVar, pVar);
                }
                this.f2267p = item;
                if (item != null) {
                    this.f2266o.e(nVar, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i2, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i2 == this.f2264m) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i2 != this.f2265n) {
            return super.onKeyDown(i2, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (l.k) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (l.k) adapter).f2105a.c(false);
        return true;
    }

    public void setHoverListener(J0 j02) {
        this.f2266o = j02;
    }

    @Override // m.C0297v0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
