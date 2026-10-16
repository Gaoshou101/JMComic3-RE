package l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.a7m3p9xv.t6qk2z8.app.R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i extends BaseAdapter {

    /* renamed from: a, reason: collision with root package name */
    public int f2098a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2099b;

    public i(j jVar) {
        this.f2099b = jVar;
        a();
    }

    public final void a() {
        n nVar = this.f2099b.f2102c;
        p pVar = nVar.f2130v;
        if (pVar != null) {
            nVar.i();
            ArrayList arrayList = nVar.f2118j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((p) arrayList.get(i2)) == pVar) {
                    this.f2098a = i2;
                    return;
                }
            }
        }
        this.f2098a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final p getItem(int i2) {
        j jVar = this.f2099b;
        n nVar = jVar.f2102c;
        nVar.i();
        ArrayList arrayList = nVar.f2118j;
        jVar.getClass();
        int i3 = this.f2098a;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return (p) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        j jVar = this.f2099b;
        n nVar = jVar.f2102c;
        nVar.i();
        int size = nVar.f2118j.size();
        jVar.getClass();
        return this.f2098a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f2099b.f2101b.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC0236A) view).b(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
