package m;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public final class F0 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I0 f2223a;

    public F0(I0 i02) {
        this.f2223a = i02;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        I0 i02 = this.f2223a;
        if (i02.f2256y.isShowing()) {
            i02.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f2223a.dismiss();
    }
}
