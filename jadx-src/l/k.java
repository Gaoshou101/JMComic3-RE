package l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class k extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final n f2105a;

    /* renamed from: b, reason: collision with root package name */
    public int f2106b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2107c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final LayoutInflater f2108e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2109f;

    public k(n nVar, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.d = z2;
        this.f2108e = layoutInflater;
        this.f2105a = nVar;
        this.f2109f = i2;
        a();
    }

    public final void a() {
        n nVar = this.f2105a;
        p pVar = nVar.f2130v;
        if (pVar != null) {
            nVar.i();
            ArrayList arrayList = nVar.f2118j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((p) arrayList.get(i2)) == pVar) {
                    this.f2106b = i2;
                    return;
                }
            }
        }
        this.f2106b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i2) {
        ArrayList arrayListL;
        n nVar = this.f2105a;
        if (this.d) {
            nVar.i();
            arrayListL = nVar.f2118j;
        } else {
            arrayListL = nVar.l();
        }
        int i3 = this.f2106b;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (p) arrayListL.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        n nVar = this.f2105a;
        if (this.d) {
            nVar.i();
            arrayListL = nVar.f2118j;
        } else {
            arrayListL = nVar.l();
        }
        return this.f2106b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f2108e.inflate(this.f2109f, viewGroup, false);
        }
        int i3 = getItem(i2).f2139b;
        int i4 = i2 - 1;
        int i5 = i4 >= 0 ? getItem(i4).f2139b : i3;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f2105a.m() && i3 != i5) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC0236A interfaceC0236A = (InterfaceC0236A) view;
        if (this.f2107c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0236A.b(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
