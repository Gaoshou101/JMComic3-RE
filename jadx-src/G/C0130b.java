package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130b implements AdapterView.OnItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0134f f1622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0131c f1623b;

    public C0130b(C0131c c0131c, C0134f c0134f) {
        this.f1623b = c0131c;
        this.f1622a = c0134f;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        C0131c c0131c = this.f1623b;
        DialogInterface.OnClickListener onClickListener = c0131c.h;
        C0134f c0134f = this.f1622a;
        onClickListener.onClick(c0134f.f1634b, i2);
        if (c0131c.f1630i) {
            return;
        }
        c0134f.f1634b.dismiss();
    }
}
