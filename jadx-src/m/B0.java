package m;

import android.view.View;
import android.widget.AdapterView;

/* loaded from: classes.dex */
public final class B0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f2213a;

    public B0(I0 i02) {
        this.f2213a = i02;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i2, long j2) {
        C0297v0 c0297v0;
        if (i2 == -1 || (c0297v0 = this.f2213a.f2237c) == null) {
            return;
        }
        c0297v0.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
    }
}
