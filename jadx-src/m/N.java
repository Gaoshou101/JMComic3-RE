package m;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class N implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P f2268a;

    public N(P p2) {
        this.f2268a = p2;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        P p2 = this.f2268a;
        p2.f2277G.setSelection(i2);
        T t2 = p2.f2277G;
        if (t2.getOnItemClickListener() != null) {
            t2.performItemClick(view, i2, p2.f2274D.getItemId(i2));
        }
        p2.dismiss();
    }
}
